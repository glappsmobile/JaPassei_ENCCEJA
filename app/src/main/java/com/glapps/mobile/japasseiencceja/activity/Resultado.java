package com.glapps.mobile.japasseiencceja.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.custom_view.ScrollListView;
import com.glapps.mobile.japasseiencceja.helper.Preferencias;
import com.glapps.mobile.japasseiencceja.objects.Questao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Resultado extends AppCompatActivity {

    @BindView(R.id.chart)
    LineChart chart;
    @BindView(R.id.tv_media_geral)
    TextView tvMediaGeral;
    @BindView(R.id.tv_static_media_geral)
    TextView tvStaticMediaGeral;
    @BindView(R.id.tv_static_estatisticas)
    TextView tvStaticEstatisticas;
    @BindView(R.id.scrollList)
    ScrollListView scrollList;
    XAxis xAxis;
    YAxis leftAxis;
    YAxis rightAxis;
    double certas = 0;
    double erradas = 0;
    double emBranco = 0;
    Preferencias preferencias;
    double mediaGeral;
    Handler h;
    String tipo;
    double progressMediaGeral = 0;
    int delay;
    int l = 0;
    double totalQuestao;
    @BindView(R.id.btConferir)
    Button btConferir;
    @BindView(R.id.btMenuInicial)
    Button btMenuInicial;
    @BindView(R.id.btCompartilhar)
    Button btCompartilhar;
    @BindView(R.id.container_buttons)
    LinearLayout containerButtons;
    String formatacao = "%.1f";
    ArrayList<Questao> listaDeQuestoes;
    double[] numerosInteiros = {
            0,
            1,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
    };

    //------------------------------- KEYS ----------------------------------//
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS  = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String CHAVE_COMPLETA = "Prova Completa";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    //-----------------------------------------------------------------------//

    double contador = 0;
    double correct = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        ButterKnife.bind(this);
        setInitialVariables();
        gerarResultado();
        if (!((MyApplication) getApplication()).isFinished()) {
            preferencias.addMediaGeral(mediaGeral, formatacao);
            ((MyApplication) getApplication()).setFinished(true);
        }
        chartConfig();
        configEstatistic();

        btConferir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btMenuInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resultado.this, MainActivity.class));
                finish();
            }
        });

        btCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Estou me preparando para o ENCCEJA com o aplicativo \" JaPassei Encceja \" e pontuei " +
                        String.valueOf(mediaGeral)+" Pontos no simulado! \n \n" +
                        "https://play.google.com/store/apps/details?id=com.glapps.mobile.japasseiencceja&hl=pt_BR");
                startActivity(Intent.createChooser(intent, "Compartilhar usando qual aplicativo?"));
            }
        });
    }

    public void configEstatistic() {
        String materia = ((MyApplication) getApplication()).getMateria();
        String ano = ((MyApplication) getApplication()).getAno();
        tipo = ((MyApplication) getApplication()).getTipo();

        if (!materia.equals("Prova Completa")){
            scrollList.addRow("Matéria:", materia );
        }else{
            scrollList.addRow("Prova Completa", "");
            scrollList.addRow("Nível:", tipo);
        }

        if (materia.equals(LINGUAGENS_CÓDIGOS)){
            scrollList.addRow("Nível:", tipo);
        }

       // scrollList.addRow("Ano:", ano);



        scrollList.addRow("Total de questões:", String.valueOf(String.format("%.0f", totalQuestao)));

        scrollList.addRow("Acertos:", String.valueOf(String.format("%.0f", certas)));
        scrollList.addRow("Erros:", String.valueOf(String.format("%.0f", erradas)));
        scrollList.addRow("Em branco:", String.valueOf(String.format("%.0f", emBranco)));
        scrollList.addRow("Média:", String.format("%.1f", mediaGeral));

        if (materia.equals("Prova Completa")){
            contarQuestoes(LINGUAGENS_CÓDIGOS);
            scrollList.addRow("Média em Português:", String.valueOf(calcularMediaGeral(correct, contador)));
            contarQuestoes(CHAVE_MATEMATICA);
            scrollList.addRow("Média em Matemática:", String.valueOf(calcularMediaGeral(correct, contador)));
            contarQuestoes(CIENCIAS_DA_NATUREZA);
            scrollList.addRow("Média em História:", String.valueOf(calcularMediaGeral(correct, contador)));
            contarQuestoes(CIENCIAS_HUMANAS);
            scrollList.addRow("Média em Geografia:", String.valueOf(calcularMediaGeral(correct, contador)));
        }
    }

    private double calcularMediaGeral(double certas, double total){
        mediaGeral = (certas / total) * 10;
        mediaGeral = roundTwoDecimals(mediaGeral);
        for (int k =0; k < numerosInteiros.length; k++){
            if (mediaGeral == numerosInteiros[k]){
                formatacao = "%.0f";
            }
        }

        return mediaGeral;

    }

    public void gerarResultado() {
        delay = 25; //milliseconds
        mediaGeral = calcularMediaGeral(certas, totalQuestao);
        h = new Handler();
        if (mediaGeral > 1) {
            h.postDelayed(new Runnable() {
                public void run() {
                    if (l < 60) {
                        l++;
                        progressMediaGeral += mediaGeral / 60;
                        tvMediaGeral.setText(String.format(formatacao, progressMediaGeral));

                    }
                    h.postDelayed(this, delay);
                }
            }, 0);
        }else{
            tvMediaGeral.setText(String.format(formatacao, mediaGeral));

        }

    }


    private void contarQuestoes(String materia){
        listaDeQuestoes = ((MyApplication) getApplication()).getListaDeQuestoes();
        contador = 0;
        correct = 0;

        for ( int u = 0; u < listaDeQuestoes.size(); u++){

            if (listaDeQuestoes.get(u).getMateria().equals(materia)){
                contador++;
            }

            if (listaDeQuestoes.get(u).getMateria().equals(materia) && listaDeQuestoes.get(u).getStatus().equals("CORRETA")){
                correct++;
            }
        }
        //Log.i("contarQuestoes", "Matéria: "+ materia+" Quantidade: "+contador+" Corretas: "+correct);
    }

    double roundTwoDecimals(double d) {
        Double mDouble;
        BigDecimal bigDecimal = BigDecimal.valueOf(d);
        BigDecimal roundedBill = bigDecimal.setScale(1, RoundingMode.HALF_UP);
        mDouble = Double.valueOf(String.valueOf(roundedBill));
        return mDouble;
    }

    public void setInitialVariables() {
        chart = (LineChart) findViewById(R.id.chart);
        xAxis = chart.getXAxis();
        leftAxis = chart.getAxisLeft();
        rightAxis = chart.getAxisRight();
        preferencias = new Preferencias(getApplicationContext());
        Bundle bundle = getIntent().getExtras();
        certas = bundle.getInt("certas");
        erradas = bundle.getInt("erradas");
        emBranco = bundle.getInt("emBranco");
        totalQuestao = certas + erradas + emBranco;
        mediaGeral = calcularMediaGeral(certas, totalQuestao);

    }

    public void chartConfig() {
        leftAxis.setEnabled(false);
        rightAxis.setEnabled(false);
        chart.getDescription().setEnabled(false);
        chart.setDoubleTapToZoomEnabled(false);
        chart.setGridBackgroundColor(android.R.color.transparent);
        chart.setNoDataText("Sem dados suficiente para fazer um gráfico.");
        Legend legend = chart.getLegend();
        legend.setEnabled(false);
        chart.animateX(1000, Easing.EasingOption.EaseInBack);
        chart.setMaxHighlightDistance(1);
        chart.setDragEnabled(true);
        xAxis.setTextColor(getResources().getColor(R.color.branco));

        ArrayList<String> string_medias = new ArrayList<>();
        string_medias = preferencias.getMediaGeral();
        ArrayList<Float> float_medias = new ArrayList<>();
        if (string_medias.size() != 0){
        if (string_medias != null) {
            for (int j = 0; j < string_medias.size(); j++) {
                //Log.i("TESTANDO PRF", "STRING MEDIA" + string_medias.get(j));
                String mediaAtual = string_medias.get(j);
                mediaAtual = mediaAtual.replaceAll(",", ".");
//                mediaAtual = mediaAtual.substring(0, mediaAtual.length() - 2);
                float_medias.add(Float.parseFloat(mediaAtual));
               // float_medias.add(0,9f);
            }
        }
            //Log.i("TESTANDO PRF", "TAMANHO DA LISTA: " + float_medias.size());
            Float[] dataObjects = float_medias.toArray(new Float[float_medias.size()]);
            for (int i = 0; i < float_medias.size(); i++) {
                //   Toast.makeText(this, list.get(i), Toast.LENGTH_SHORT).show();
                //Log.i("TESTANDO PRF", "" + i);
                //Log.i("TESTANDO PRF", "ITEM: " + float_medias.get(i));
            }
            //   float[] dataObjects = float_medias.toArray(new float[].class);
       /* float[] dataObjects = {
                6.6f,
                7.6f,
                4.6f,
                1.6f,
                5.6f,
                8.6f,
                5.6f,
                5.6f,
        };*/
            List<Entry> entries = new ArrayList<Entry>();
            for (int j = 0; j < dataObjects.length; j++) {
                entries.add(new Entry(j, dataObjects[j]));
            }
            LineDataSet dataSet = new LineDataSet(entries, ""); // add entries to dataset
            dataSet.setColor(getResources().getColor(R.color.colorPrimary));
            dataSet.setLineWidth(8);
            dataSet.setDrawCircleHole(false);
            dataSet.setCircleSize(7);
            dataSet.setValueTextSize(14);
            dataSet.setCircleColor(getResources().getColor(R.color.branco));
            dataSet.setValueTextColor(getResources().getColor(R.color.branco));
            LineData lineData = new LineData(dataSet);
            chart.setData(lineData);
            chart.setVisibleXRangeMaximum(6f);
            chart.moveViewToX(dataSet.getEntryCount());
            chart.setVisibleXRangeMaximum(6f);
            chart.invalidate();
        }
    }

    @Override
    public void onBackPressed() {
        ((MyApplication) getApplication()).setSee_results(true);
        super.onBackPressed();
    }
}
