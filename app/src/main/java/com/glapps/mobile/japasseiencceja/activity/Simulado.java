package com.glapps.mobile.japasseiencceja.activity;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.custom_view.CustomList;
import com.glapps.mobile.japasseiencceja.fragment.AdFragment;
import com.glapps.mobile.japasseiencceja.fragment.ImageZoom;
import com.glapps.mobile.japasseiencceja.fragment.Loading;
import com.glapps.mobile.japasseiencceja.fragment.Resolucao;
import com.glapps.mobile.japasseiencceja.helper.Background;
import com.glapps.mobile.japasseiencceja.helper.Preferencias;
import com.glapps.mobile.japasseiencceja.helper.QuestaoManager;
import com.glapps.mobile.japasseiencceja.objects.Imgz;
import com.glapps.mobile.japasseiencceja.objects.Questao;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Simulado extends AppCompatActivity implements Html.ImageGetter {

    //----------- BindView ----------\\
    @BindView(R.id.bt_proxima)
    Button btProxima;
    @BindView(R.id.bt_anterior)
    Button btAnterior;
    @BindView(R.id.menu_bar)
    RelativeLayout menuBar;
    @BindView(R.id.MRL_simulado)
    RelativeLayout MRLSimulado;
    @BindView(R.id.tv_questao)
    TextView tvQuestao;
    @BindView(R.id.tv_materia)
    TextView tvMateria;
    @BindView(R.id.tv_ano)
    TextView tvAno;
    //-------------------------------\\
    boolean liberado = false;
    BroadcastReceiver act2InitReceiver;

    AdFragment adfragment;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    private final static String KEY_AD = "AD_WINDOW";
    Resolucao fragment;
    String arg0;
    int last = -1;
    ImageZoom fragment_zoom;
    int delay;
    Handler h;
    String materia;
    String ano;
    int countQuestao;
    String questaoAtual;
    String str_countQuestao;
    List<String> respostas;
    String[] array_respostas;
    @BindView(R.id.enunciado)
    TextView enunciado;
    @BindView(R.id.container_alternativas)
    RelativeLayout containerAlternativas;
    @BindView(R.id.container_questao)
    RelativeLayout containerQuestao;
    @BindView(R.id.status_bar)
    RelativeLayout statusBar;
    @BindView(R.id.btResolucao)
    Button btResolucao;
    @BindView(R.id.bt_menu)
    Button btMenu;
    @BindView(R.id.scrollViewQuestao)
    ScrollView scrollViewQuestao;
    @BindView(R.id.container_scrollview)
    RelativeLayout containerScrollview;
    @BindView(R.id.bt_zoom)
    Button btZoom;
    private SharedPreferences preferences;
    SharedPreferences.Editor editor;
    SharedPreferences.OnSharedPreferenceChangeListener listener;
    Context contexto;
    private final static String KEY_CORRECT_CHOOSE = "ALTERNATIVA_CORRETA";
    private final static String KEY_CAN_PAINT = "CAN_PAINT";
    private final static String KEY_MAIN_WINDOW = "MAIN_WINDOW";
    private final static String KEY_RESOLUCAO_WINDOW = "RESOLUCAO_WINDOW";
    private final static String KEY_IMAGE_ZOOM_WINDOW = "IMAGE_ZOOM_WINDOW";
    int certas = 0;
    int erradas = 0;
    int emBranco = 0;
    //------------------------------- KEYS ----------------------------------//
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String CHAVE_COMPLETA = "Prova Completa";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    //-----------------------------------------------------------------------//
    Preferencias preferencias;
    String[] mStringArray;
    String[] items;
    int indice;
    QuestaoManager manager;
    CustomList lvQuestoes;
    ArrayList<Questao> listaDeQuestoes;
    int position = 0;
    Spanned[] questoes;
    String tipo;
    String currentWindow = KEY_MAIN_WINDOW;
    int larguraDaTela = 0;
    int alturaDaTela = 0;
    String str_img = "";
    String str_img2 = "";
    int primalEspecie;
    Background background;
    Simulado simulado;
    Loading loading;
    private static int[] prgmImages = {R.drawable.letter_a, R.drawable.letter_b, R.drawable.letter_c, R.drawable.letter_d, R.drawable.letter_e,};
    ArrayList<Imgz> imgzs = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulado);
        ButterKnife.bind(this);
        int delay = 10000;
        esperarSinal();
        loading = new Loading();
        loadAd();
        simulado = this;
        contexto = getApplicationContext();
        getSupportFragmentManager()
                .beginTransaction()
                .add(MRLSimulado.getId(), loading, null)
                .disallowAddToBackStack()
                .commit();
        initialConfig();
   //     final Handler handler = new Handler();
    //    handler.postDelayed(new Runnable() {
           // @Override
         //   public void run() {
                background = new Background();
                ((MyApplication) getApplication()).setImgzs(imgzs);

                inicializarArrayRespostas();

                if (ano.equals("2017") || ano.equals("2018")) btResolucao.setVisibility(View.GONE);




                btMenu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (!((MyApplication) getApplication()).getSee_results()) {
                            items = new String[]{"Conferir resposta", "Finalizar simulado", "Ir para a questão...", "Cancelar"};
                        } else {
                            items = new String[]{"Ir para o menu inicial", "Ver estatísticas", "Ir para a questão...", "Cancelar"};
                        }

                        AlertDialog.Builder build = new AlertDialog.Builder(Simulado.this);

                        build.setTitle("ESCOLHA UMA OPÇÃO");

                        build.setItems(items, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                if (!((MyApplication) getApplication()).getSee_results()) {
                                    switch (which) {
                                        case 0:
                                            pintarAlternativas();
                                            break;
                                        case 1:
                                            finalizarSimulado();
                                            break;
                                        case 2:
                                            showIrParaQuestaoMenu();
                                        case 3:
                                            break;
                                    }
                                } else {
                                    switch (which) {
                                        case 0:
                                            Intent i = new Intent(Simulado.this, MainActivity.class);
                                            startActivity(i);
                                            finish();
                                            break;
                                        case 1:
                                            pintarAlternativas();
                                            getEstatistic();
                                            Intent intent = new Intent(Simulado.this, Resultado.class);
                                            intent.putExtra("certas", certas);
                                            intent.putExtra("erradas", erradas);
                                            intent.putExtra("emBranco", emBranco);
                                            startActivity(intent);
                                            break;
                                        case 2:
                                            showIrParaQuestaoMenu();
                                        case 3:
                                            break;
                                    }
                                }
                            }
                        }).create().show();

                    }
                });

                btProxima.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        MoveNext();
                        logResposta();
                        scrollViewQuestao.fullScroll(View.FOCUS_UP);
                    }
                });

                btAnterior.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MovePrevious();
                        logResposta();
                        scrollViewQuestao.fullScroll(View.FOCUS_UP);
                    }
                });

                btResolucao.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    currentWindow = KEY_RESOLUCAO_WINDOW;
                    fragment = new Resolucao();
                    getSupportFragmentManager()
                            .beginTransaction()
                            .add(MRLSimulado.getId(), fragment, null)
                            .disallowAddToBackStack()
                            .commit();

                        showAd();
                    }
                });

                btZoom.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        listaDeQuestoes = ((MyApplication) getApplication()).getListaDeQuestoes();
                        String identificadorMateria = "";
                        String identificadorProva = "";
                        String identificadorIndice = "";
                        String indiceZerado = "000";
                        String materiaAtual = listaDeQuestoes.get(position).getMateria();
                        String anoAtual = listaDeQuestoes.get(position).getAno();

                        if (materiaAtual.equals(LINGUAGENS_CÓDIGOS)) identificadorMateria = "lc";
                        if (materiaAtual.equals(CHAVE_MATEMATICA)) identificadorMateria = "mt";
                        if (materiaAtual.equals(CIENCIAS_DA_NATUREZA)) identificadorMateria = "cn";
                        if (materiaAtual.equals(CIENCIAS_HUMANAS)) identificadorMateria = "ch";

                        /*
                        if (ano.equals("2016")) identificadorProva = "1";
                        if (ano.equals("2015")) identificadorProva = "2";
                        if (ano.equals("2014")) identificadorProva = "3";
                        if (ano.equals("2013")) identificadorProva = "4";
                        if (ano.equals("2012")) identificadorProva = "5";
                        if (ano.equals("2011")) identificadorProva = "6";*/

                        identificadorProva = String.valueOf((2017-Integer.valueOf(ano)));
                        if(ano.equals("2017")) identificadorProva = "7";
                        if(ano.equals("2018")) identificadorProva = "8";

                        Log.i("ZOOMANDO", "Ano: "+ano +" identificadorProva: "+identificadorProva);

                        identificadorIndice = String.valueOf((position+1));
                        if(ano.equals("2017") || ano.equals("2018") ){
                            if (materiaAtual.equals(CIENCIAS_HUMANAS))identificadorIndice = String.valueOf((position+31));
                            if (materiaAtual.equals(CHAVE_MATEMATICA))identificadorIndice = String.valueOf((position+31));
                        }


                        Log.i("ZOOMANDO", "1º identificadorIndice: "+identificadorIndice);

                             if (identificadorIndice.length() == 1){ identificadorIndice = "00"+identificadorIndice;}
                        else if (identificadorIndice.length() == 2){  identificadorIndice = "0"+identificadorIndice;}


                        Log.i("ZOOMANDO", "Ano: "+ano +" identificadorProva: "+identificadorProva);



                        int imagem1 = getResources().getIdentifier(identificadorMateria+"5"+identificadorProva+identificadorIndice+"1", "drawable", getPackageName());
                        int imagem2 = getResources().getIdentifier(identificadorMateria+"5"+identificadorProva+identificadorIndice+"2", "drawable", getPackageName());

                        Log.i("ZOOMANDO", "identificadorMateria: "+identificadorMateria);
                        Log.i("ZOOMANDO", "identificadorProva: "+identificadorProva);
                        Log.i("ZOOMANDO", "2º identificadorIndice: "+identificadorIndice);
                        Log.i("ZOOMANDO", "PSEUDO IMAGEM: "+identificadorMateria+"5"+identificadorProva+identificadorIndice+"1");
                        Log.i("ZOOMANDO", "ID IMAGEM: "+imagem1);


                        currentWindow = KEY_IMAGE_ZOOM_WINDOW;
                        fragment_zoom = new ImageZoom();
                        int especie = listaDeQuestoes.get(position).getEspecie();
                        Bundle bundle = new Bundle();

                        String str_img = "NONE";
                        String str_img2 = "NONE";
                            if (imagem1 != 0) str_img = identificadorMateria+"5"+identificadorProva+identificadorIndice+"1";
                            if (imagem2 != 0) str_img2 = identificadorMateria+"5"+identificadorProva+identificadorIndice+"2";
                            bundle.putString("str_img", str_img);
                            bundle.putString("str_img2", str_img2);


                        fragment_zoom.setArguments(bundle);


                        getSupportFragmentManager()
                                .beginTransaction()
                                .add(MRLSimulado.getId(), fragment_zoom, null)
                                .disallowAddToBackStack()
                                .commit();

                    }
                });


                //base de treinamento
                // calcular(4, "2015", CIENCIAS_DA_NATUREZA, INGLES);
                //-------------------

           // }
     //   }, delay);



    }

    private void esperarSinal(){
         act2InitReceiver= new BroadcastReceiver()
        {

            @Override
            public void onReceive(Context context, Intent intent)
            {
                liberado = true;
            }
        };
        LocalBroadcastManager.getInstance(this).registerReceiver(act2InitReceiver, new IntentFilter("cabo"));
    }


    private boolean isOnline() {
        ConnectivityManager cm =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null &&
                cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    private void loadAd(){

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(getApplicationContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-4535849924611938/5982706963");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });
    }

    private void showAd(){

        currentWindow = KEY_RESOLUCAO_WINDOW;
        Random random = new Random();
        int sorteio = random.nextInt(100)+1;


        //------------------------------------------------------------------
        if (mInterstitialAd.isLoaded()) {
            if (sorteio <= 20){
                showCustomAd();
            }else {
                mInterstitialAd.show();
            }
        } else{
            showCustomAd();
        }

    }

    private void showCustomAd(){
        currentWindow = KEY_AD;
        Log.i("currentWindow", "Localização: showCustomAd() | ChangeCurrentWindow = KEYAD");
        adfragment = new AdFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(MRLSimulado.getId(), adfragment, null)
                .disallowAddToBackStack()
                .commit();
    }

    private void questaoChangeListener() {
        tvQuestao.setText("Questão: " + String.valueOf(position + 1) + "/" + str_countQuestao);
        tvMateria.setText("| Matéria: " + getMateria());
        //tvAno.setText("| Ano: " + getAno());
        boolean see_results = ((MyApplication) getApplication()).getSee_results();
        scrollViewQuestao.fullScroll(View.FOCUS_UP);
        if (see_results) {
            pintarAlternativas();
        }

        if (position + 1 == countQuestao) {
            btProxima.setText("FINALIZAR");
            btProxima.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finalizarSimulado();
                }
            });
        } else {
            btProxima.setText("PROXIMA");
            btProxima.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MoveNext();

                }
            });
        }
        scrollViewQuestao.fullScroll(View.FOCUS_UP);
    }

    private void finalizarSimulado() {
        ((MyApplication) getApplication()).setSee_results(true);
        pintarAlternativas();
        getEstatistic();
        Intent intent = new Intent(Simulado.this, Resultado.class);
        intent.putExtra("certas", certas);
        intent.putExtra("erradas", erradas);
        intent.putExtra("emBranco", emBranco);
        startActivity(intent);
    }

    private void showIrParaQuestaoMenu() {
        ArrayList<String> lista = new ArrayList<String>();
        for (int f = 0; f < countQuestao; f++) {
            lista.add(String.valueOf(f + 1));
        }
        mStringArray = lista.toArray(new String[lista.size()]);


        AlertDialog.Builder build = new AlertDialog.Builder(Simulado.this);
        build.setTitle("ESCOLHA UMA OPÇÃO");
        build.setItems(mStringArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                position = which;
                ((MyApplication) getApplication()).setPosicao(position);
                atualizarQuestao();

            }
        }).create().show();

    }

    private void atualizarQuestao() {
        System.gc();
        System.gc();


        background.setWallpaper(MRLSimulado);
        btZoom.setVisibility(View.GONE);
        listaDeQuestoes = ((MyApplication) getApplication()).getListaDeQuestoes();
     //   if (listaDeQuestoes.get(position).getAno().equals("2012") || listaDeQuestoes.get(position).getAno().equals("2011") || listaDeQuestoes.get(position).getAno().equals("2010")) btResolucao.setVisibility(View.GONE);

        enunciado.setText(listaDeQuestoes.get(position).getEnunciado());
        int especie = listaDeQuestoes.get(position).getEspecie();
        //Log.i("Especie", "atualizarQuestao: "+especie);
        questoes = new Spanned[]{
                listaDeQuestoes.get(position).getAlternativaA(),
                listaDeQuestoes.get(position).getAlternativaB(),
                listaDeQuestoes.get(position).getAlternativaC(),
                listaDeQuestoes.get(position).getAlternativaD(),
                listaDeQuestoes.get(position).getAlternativaE(),
        };
        lvQuestoes.setText(questoes);

       /* switch (especie){

            // TODO ---------------------------------------- MODO 1 ------------------------------------------------

            case 1:
                Log.i("IMGZ", "--------------------------------------------------------------");
                Log.i("IMGZ", "TAMANHO DA LISTA: "+imgzs.size());
                int imgzIndice = 0;
                boolean zoom = false;
                String materiaImgz = "NONE";
                for (int k = 0; k < imgzs.size(); k++){
                    imgzIndice = imgzs.get(k).getIndice();
                    //coletarIndice(imgzs.get(k).getNomeDaImagem1(), 1);
                   materiaImgz = coletarMateria(imgzs.get(k).getNomeDaImagem1(), 1);
                    Log.i("IMGZ", "CHECANDO: "+k+" INDICE DA QUESTÃO: "+(position+1)+" INDICE DO ITEM "+k+": "+imgzIndice);
                    if (!listaDeQuestoes.get(position).getMateria().equals(LINGUAGENS_CÓDIGOS)) {
                        if (materiaImgz.equals(listaDeQuestoes.get(position).getMateria())) {

                            if (position + 1 == imgzIndice) {
                                zoom = true;
                                Log.i("IMGZ", "INDICE " + imgzIndice + ": COMBINOU.");
                                break;
                            }
                        }
                    }else if (listaDeQuestoes.get(position).getMateria().equals(LINGUAGENS_CÓDIGOS)){
                        if (position + 1 == imgzIndice+5) {
                            if (materiaImgz.equals(listaDeQuestoes.get(position).getMateria())) {
                                zoom = true;
                                Log.i("IMGZ", "INDICE " + imgzIndice + ": COMBINOU.");

                                break;
                            }
                        }
                    }
                }



                if (zoom) {

                    try {
                        Log.i("IMGZ", (position+1)+" IMAGEM: "+ imgzs.get(position+1).getNomeDaImagem1());
                    }catch (Exception e){
                        btZoom.setVisibility(View.GONE);
                    }



                   for (int j =0; j < imgzs.size(); j++){
                        str_img = imgzs.get(j).getNomeDaImagem1();
                        int strindice = Integer.valueOf(str_img.substring(str_img.length()-3, str_img.length()-1));
                        Log.i("IMGZ", "STR INDICE: "+strindice);
                        if (strindice == (position+1)){
                            break;
                       }

                    }

                    btZoom.setVisibility(View.VISIBLE);
                       break;

                } else {
                    btZoom.setVisibility(View.GONE);
                    //   }
                }

                Log.i("IMGZ", "--------------------------------------------------------------");
            break;

            // TODO ---------------------------------------- MODO 2 ------------------------------------------------
            case 2:

                String penultimaLetra = arg0.substring(arg0.length() - 3, arg0.length() - 2);
                String quartaUltimaLetra = arg0.substring(arg0.length() - 5, arg0.length() - 4);
                String antePenultimaLetra = arg0.substring(arg0.length() - 4, arg0.length() - 3);
                String ano=listaDeQuestoes.get(position).getAno();
                String indice2 = String.valueOf(converterIndice(listaDeQuestoes.get(position).getIndice(), 2));
             Log.i("ImageZoom", "Simulado: indiceOriginal = "+listaDeQuestoes.get(position).getIndice()+" (Atualizar Questão)");
           Log.i("ImageZoom", "Simulado: indice2 = "+indice2+" (Atualizar Questão)");
                String txtsegundaimagem = "q"+ano+"_"+indice2+"_2";

                Log.i("ImageZoom", "Simulado: texto = "+txtsegundaimagem+" (Atualizar Questão)");
                str_img2 = "NONE";
                if (penultimaLetra.equals("_") && arg0.length() > 7) str_img2 = arg0;

                if (getResources().getIdentifier(txtsegundaimagem, "drawable", getPackageName()) != 0){ str_img2 = txtsegundaimagem;}
                else {
                    str_img2 = "NONE";
                }

              Log.i("ImageZoom", "Simulado: str_img2 = "+str_img2+" (Atualizar Questão)");
              Log.i("ImageZoom", "Simulado: penultimaLetra = "+penultimaLetra+" (Atualizar Questão)");
             Log.i("ImageZoom", "Simulado: arg0.length = "+arg0.length()+" (Atualizar Questão)");

                int indiceDaQuestaoConvertido = converterIndice(listaDeQuestoes.get(position).getIndice(), 2);
                Log.i("ImageZoom", "q"+ano+"_"+indiceDaQuestaoConvertido);
            for (int k = 0; k < imgzs.size(); k++) {

            if (getResources().getIdentifier("q"+ano+"_"+indiceDaQuestaoConvertido, "drawable", getPackageName()) != 0) {
                Log.i("ImageZoom", "APROVADO");

                String arg0 = imgzs.get(k).getNomeDaImagem1();

                int digito = 0;

                if (penultimaLetra.equals("_")) digito = 1;
                if (antePenultimaLetra.equals("_")) digito = 2;
                if (quartaUltimaLetra.equals("_")) digito = 3;

                String txtindice = arg0.substring(arg0.length() - digito, arg0.length());

                Log.i("ImageZoom", k + " quartaUltimaLetra " + quartaUltimaLetra);
                Log.i("ImageZoom", k + " antePenultimaLetra " + antePenultimaLetra);
                Log.i("ImageZoom", k + " penultimaLetra " + penultimaLetra);


                Log.i("ImageZoom", k + " digito " + digito);
                Log.i("ImageZoom", k + " 1 txtindice: " + txtindice);
                int indexUnderline = txtindice.indexOf('_');
                if (indexUnderline >= 0) txtindice = "999";

                if (!txtindice.equals("")) {
                    int indice = Integer.valueOf(txtindice);
                }

                Log.i("ImageZoom", k + " ARG0: " + arg0);
                Log.i("ImageZoom", k + " indexUnderline: " + indexUnderline);
                Log.i("ImageZoom", k + " 2 txtindice: " + txtindice);
                Log.i("ImageZoom", k + " indice: " + indice);
                Log.i("ImageZoom", k + " indiceDaQuestaoConvertido: " + indiceDaQuestaoConvertido);

               // indiceDaQuestaoConvertido == indice &&
                if (!imgzs.get(k).getNomeDaImagem1().equals("NONE")) {
                    btZoom.setVisibility(View.VISIBLE);
                    break;
                } else {
                    btZoom.setVisibility(View.GONE);
                }
            }
            }
        }*/

        String identificadorMateria = "";
        String identificadorProva = "";
        String identificadorIndice = "";
        String indiceZerado = "000";
        String materiaAtual = listaDeQuestoes.get(position).getMateria();
        String anoAtual = listaDeQuestoes.get(position).getAno();

        if (materiaAtual.equals(LINGUAGENS_CÓDIGOS)) identificadorMateria = "lc";
        if (materiaAtual.equals(CHAVE_MATEMATICA)) identificadorMateria = "mt";
        if (materiaAtual.equals(CIENCIAS_DA_NATUREZA)) identificadorMateria = "cn";
        if (materiaAtual.equals(CIENCIAS_HUMANAS)) identificadorMateria = "ch";
        identificadorProva = String.valueOf((2017-Integer.valueOf(ano)));
        if(ano.equals("2017")) identificadorProva = "7";
        if(ano.equals("2018")) identificadorProva = "8";

        Log.i("ZOOMANDO", "Ano: "+ano +" identificadorProva: "+identificadorProva);

        identificadorIndice = String.valueOf((position+1));
        if(ano.equals("2017") || ano.equals("2018") ){
            if (materiaAtual.equals(CIENCIAS_HUMANAS))identificadorIndice = String.valueOf((position+31));
            if (materiaAtual.equals(CHAVE_MATEMATICA))identificadorIndice = String.valueOf((position+31));
        }

        Log.i("ZOOMANDO", "1º identificadorIndice: "+identificadorIndice);


        if (identificadorIndice.length() == 1){ identificadorIndice = "00"+identificadorIndice;}
        else if (identificadorIndice.length() == 2)  identificadorIndice = "0"+identificadorIndice;


        int imagem1 = getResources().getIdentifier(identificadorMateria+"5"+identificadorProva+identificadorIndice+"1", "drawable", getPackageName());

        Log.i("ZOOMANDO", "identificadorMateria: "+identificadorMateria);
        Log.i("ZOOMANDO", "identificadorProva: "+identificadorProva);
        Log.i("ZOOMANDO", "2º identificadorIndice: "+identificadorIndice);
        Log.i("ZOOMANDO", "PSEUDO IMAGEM: "+identificadorMateria+"5"+identificadorProva+identificadorIndice+"1");
        Log.i("ZOOMANDO", "ID IMAGEM: "+imagem1);

        if (imagem1 != 0) btZoom.setVisibility(View.VISIBLE);





        lvQuestoes.setImage(prgmImages);
        questaoChangeListener();
    }

    private void pintarAlternativas() {
        lvQuestoes.correctChoose(getGabarito());
    }

    private void getEstatistic() {
        listaDeQuestoes = ((MyApplication) getApplication()).getListaDeQuestoes();

        String[] respostas = getArrayRespostas();
        String gabarito;
        certas = 0;
        erradas = 0;
        emBranco = 0;

        for (int i = 0; i < respostas.length; i++) {
            //    if (!materia.equals(LINGUAGENS_CÓDIGOS)) {
            gabarito = listaDeQuestoes.get(i).getGabarito();

            //Log.i("CORRECAO", i + 1 + " Gabarito: " + gabarito + " Resposta: " + respostas[i]);

            if (gabarito.equals(respostas[i])) {
                //Log.i("CORRECAO", i + 1 + ": CORRETA");
                certas++;
                listaDeQuestoes.get(i).setStatus("CORRETA");
            } else if (!respostas[i].equals(gabarito) && !respostas[i].equals("NULO")) {
                //Log.i("CORRECAO", i + 1 + ": ERRADA");
                erradas++;
                listaDeQuestoes.get(i).setStatus("ERRADA");
            } else if (respostas[i].equals("NULO")) {
                //Log.i("CORRECAO", i + 1 + ": EM BRANCO");
                emBranco++;
                listaDeQuestoes.get(i).setStatus("EM BRANCO");
            }
          /*  }else{

            }*/
        }

    }

    private String[] getArrayRespostas() {
        return ((MyApplication) getApplication()).getRespostas();

    }

    private void initialConfig() {
        setInitialVariables();
        preferencias = new Preferencias(getApplicationContext());
        lvQuestoes = new CustomList(contexto, simulado, null);
        containerAlternativas.addView(lvQuestoes);
        Runnable runnable = new Runnable() {
            public void run() {


                QuestaoManager questaoManager = new QuestaoManager(contexto, simulado);
                questaoManager.gerarQuestoes(ano, materia, tipo, countQuestao);

                }
        };
        Thread mythread = new Thread(runnable);
        mythread.start();

        h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {

                if (liberado) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    atualizarQuestao();
                        setInitialTexts();
                        getSupportFragmentManager().beginTransaction().remove(loading).commit();

                }else{

                    h.postDelayed(this, 1000);
                }
            }
        }, 1000);
    }

    private void setInitialVariables() {
        manager = new QuestaoManager(getApplicationContext(), this);
        Bundle bundle = getIntent().getExtras();
        materia = bundle.getString("materia");
        tipo = bundle.getString("tipo");
        ano = bundle.getString("ano");
        countQuestao = manager.getCountQuestao(ano, materia, tipo);
        h = new Handler();
        str_countQuestao = String.valueOf(countQuestao);
        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        editor = preferences.edit();
        preferences.registerOnSharedPreferenceChangeListener(listener);
    }

    private void setInitialTexts() {
        tvAno.setVisibility(View.GONE);
        tvMateria.setText("| Matéria: " + getMateria());
       // tvAno.setText("| Ano: " + getAno());
        tvQuestao.setText("Questão: " + String.valueOf(position + 1) + "/" + str_countQuestao);
    }

    private String getMateria() {
        return ((MyApplication) getApplication()).getListaDeQuestoes().get(position).getMateria();
    }

    private String getAno() {
        return ((MyApplication) getApplication()).getListaDeQuestoes().get(position).getAno();
    }

    private void logResposta() {
        array_respostas = ((MyApplication) getApplication()).getRespostas();
        for (int j = 0; j < array_respostas.length; j++) {
            //Log.i("ARRAY", String.valueOf(j + ": " + array_respostas[j]));
        }
    }

    private String getGabarito() {
        String gabarito;
        listaDeQuestoes = ((MyApplication) getApplication()).getListaDeQuestoes();
        gabarito = listaDeQuestoes.get(position).getGabarito();
        return gabarito;
    }

    public void MoveNext() {
        YoYo.with(Techniques.SlideInRight)
                .duration(250)
                .playOn(containerScrollview);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                YoYo.with(Techniques.FadeIn)
                        .duration(delay)
                        .playOn(containerScrollview);
            }
        }, 250);


        if (position < countQuestao - 1) {
            position++;
            ((MyApplication) getApplication()).setPosicao(position);
            atualizarQuestao();
        }

    }

    public void MovePrevious() {
        if (position > 0) {
            position--;
            ((MyApplication) getApplication()).setPosicao(position);
            atualizarQuestao();
        }

        YoYo.with(Techniques.SlideInLeft)
                .duration(250)
                .playOn(containerScrollview);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                YoYo.with(Techniques.FadeIn)
                        .duration(delay)
                        .playOn(containerScrollview);
            }
        }, 250);
    }

    private void inicializarArrayRespostas() {
        respostas = new ArrayList<String>(10);
        for (int j = 0; j < countQuestao; j++) {
            respostas.add("NULO");
        }
        String[] array_respostas = new String[respostas.size()];
        respostas.toArray(array_respostas);
        //Log.i("ARRAY", String.valueOf(respostas.size()));
        for (int j = 0; j < array_respostas.length; j++) {
            //Log.i("ARRAY", String.valueOf(j + ": " + array_respostas[j]));
        }
        ((MyApplication) this.getApplication()).setRespostas(array_respostas);

    }

    @Override
    public void onBackPressed() {
        //   boolean back = false;
        if (currentWindow.equals(KEY_MAIN_WINDOW)) {
            AlertDialog.Builder dialog = new AlertDialog.Builder(Simulado.this)
                    .setTitle("VOLTAR AO MENU INICIAL")
                    .setMessage("Você deseja voltar ao menu inicial?")
                    .setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i = new Intent(Simulado.this, MainActivity.class);
                            finish();
                            startActivity(i);


                        }
                    })
                    .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // do nothing
                        }
                    });
            dialog.show();
        } else if (currentWindow.equals(KEY_RESOLUCAO_WINDOW)){
            currentWindow = KEY_MAIN_WINDOW;
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }else if(currentWindow.equals(KEY_IMAGE_ZOOM_WINDOW)){
            currentWindow = KEY_MAIN_WINDOW;
            getSupportFragmentManager().beginTransaction().remove(fragment_zoom).commit();
        }else if(currentWindow.equals(KEY_AD)){
        try {
            currentWindow = KEY_RESOLUCAO_WINDOW;
            getSupportFragmentManager().beginTransaction().remove(adfragment).commit();
        }catch (Exception e){

        }

    }
        //
    }

    @Override
    public Drawable getDrawable(String arg0) {
        // TODO Auto-generated method stub


            // int id = android.R.drawable.stat_notify_error;
            Log.i("ARRUMAR", arg0);
            int id = getResources().getIdentifier(arg0, "drawable", getPackageName());
            ;
            LevelListDrawable d = new LevelListDrawable();
            Drawable empty = getResources().getDrawable(id);
            d.addLevel(0, 0, empty);
            Display display = getWindowManager().getDefaultDisplay();
            Point size = new Point();
            this.arg0 = arg0;
            display.getSize(size);
            larguraDaTela = size.x;
            alturaDaTela = size.y;
            double larguraDaImagem = empty.getIntrinsicWidth();
            double alturaDaImagem = empty.getIntrinsicHeight();
            int fitX = (int) larguraDaTela - (larguraDaTela / 18);
            double escala = fitX/ larguraDaImagem;
            int alturaDaImagemRedimensionada = (int) (alturaDaImagem * (escala));
            String ultimaLetra = arg0.substring(arg0.length() - 1);
            String primeiraLetra = arg0.substring(0, 1);
        try {

            if (!getTipoDaImagem().equals("alternativa")) {

                if (empty.getIntrinsicWidth() > 290) {
                    d.setBounds(0, 0, fitX, alturaDaImagemRedimensionada);

                /*} else {
                    int indexUnderline = arg0.indexOf('_');
                    if (ultimaLetra.equals("1") && empty.getIntrinsicWidth() > 50 || ultimaLetra.equals("2") && empty.getIntrinsicWidth() > 50 || ultimaLetra.equals("3") && empty.getIntrinsicWidth() > 50 || empty.getIntrinsicWidth() > 50 && indexUnderline >= 0) {

                        int metadeDaTela = (int) (fitX / 2);
                        int metadeDaImagem = (int) (larguraDaImagem / 2);
                        int meioDaTela = metadeDaTela - metadeDaImagem + (metadeDaImagem / 4);
                        int redimen = (int) larguraDaImagem;
                        d.setBounds(meioDaTela, 0, redimen * 2, empty.getIntrinsicHeight());

                        //Log.i("REDIMENSIONAMENTO", arg0 + " - metadeDaTela: " + metadeDaTela);
                        //Log.i("REDIMENSIONAMENTO", arg0 + " - larguraDaImagem: " + larguraDaImagem);
                        //Log.i("REDIMENSIONAMENTO", arg0 + " - meioDaTela: " + meioDaTela);
                        //Log.i("REDIMENSIONAMENTO", arg0 + " - metadeDaImagem: " + metadeDaImagem);
                        //Log.i("REDIMENSIONAMENTO", arg0 + " - redimen: " + redimen);

                        if (arg0.equals("q2014_144"))
                            d.setBounds(0, 0, empty.getIntrinsicWidth(), empty.getIntrinsicHeight());
*/
                    } else {
                        d.setBounds(0, 0, empty.getIntrinsicWidth(), empty.getIntrinsicHeight());

                //    }
                }
            } else {
                int limite = (larguraDaTela - (larguraDaTela / 6));
                if (empty.getIntrinsicWidth() > limite) {
                    Log.i("TIPO DA IMAGEM", arg0+": MAIOR QUE O LIMITE");
                    d.setBounds(0, 0, limite, empty.getIntrinsicHeight());
                } else {
                    Log.i("TIPO DA IMAGEM", arg0+": MENOR QUE O LIMITE");

                    d.setBounds(0, 0, empty.getIntrinsicWidth(), empty.getIntrinsicHeight());
                }
            }
        }catch (Exception e){
            //Log.i("BARCODE", "PROBLEMINHA EM "+arg0+": "+e.getMessage());
        }
            return d;

    }

    private String getTipoDaImagem(){
        String tipo = "NÃO IDENTIFICADO";



                String ultimaLetra = arg0.substring(arg0.length() - 1);
                if (ultimaLetra.equals("a") ||
                        ultimaLetra.equals("b") ||
                        ultimaLetra.equals("c") ||
                        ultimaLetra.equals("d") ||
                        ultimaLetra.equals("e")) {
                    tipo = "alternativa";
                } else if (ultimaLetra.equals("1")) {
                    tipo = "imagem1";
                } else if (ultimaLetra.equals("2")) {
                    tipo = "imagem2";
                }

        Log.i("TIPO DA IMAGEM", arg0+": "+tipo);

        return  tipo;
    }

    @Override
    protected void onDestroy() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(act2InitReceiver);

        super.onDestroy();
    }
}


