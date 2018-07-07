package com.glapps.mobile.japasseiencceja.custom_view;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.objects.Questao;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GlaucoVillasBoas on 26/04/2017.
 */


public class CustomList extends RelativeLayout {


    LinearLayout[] alternativas;
    int j = 0;
    String[] array_respostas;
    Boolean[] check = {
            false,
            false,
            false,
            false,
            false,
    };
    int posicoa;
    String[] opcoes = {
            "A",
            "B",
            "C",
            "D",
            "E",
    };
    String escolha = "NULO";
    Boolean clicable = true;
    private final static String KEY_CORRECT_CHOOSE = "ALTERNATIVA_CORRETA";
    private final static String KEY_CAN_PAINT = "CAN_PAINT";
    private final static String KEY_SEE_RESULTS = "SEE_RESULTS";
    @BindView(R.id.imagem_a)
    ImageView imagemA;
    @BindView(R.id.texto_a)
    TextView textoA;
    @BindView(R.id.alternativa_a)
    LinearLayout alternativaA;
    @BindView(R.id.imagem_b)
    ImageView imagemB;
    @BindView(R.id.texto_b)
    TextView textoB;
    @BindView(R.id.alternativa_b)
    LinearLayout alternativaB;
    @BindView(R.id.imagem_c)
    ImageView imagemC;
    @BindView(R.id.texto_c)
    TextView textoC;
    @BindView(R.id.alternativa_c)
    LinearLayout alternativaC;
    @BindView(R.id.imagem_d)
    ImageView imagemD;
    @BindView(R.id.texto_d)
    TextView textoD;
    @BindView(R.id.alternativa_d)
    LinearLayout alternativaD;
    @BindView(R.id.imagem_e)
    ImageView imagemE;
    @BindView(R.id.texto_e)
    TextView textoE;
    @BindView(R.id.alternativa_e)
    LinearLayout alternativaE;
    ArrayList<Questao> listaDeQuestoes;
    private SharedPreferences preferences;
    SharedPreferences.Editor editor;
    SharedPreferences.OnSharedPreferenceChangeListener listener;
    Context contexto;
    Simulado simulado;
    int position;
    Questao questaoAtual;
    public CustomList(final Context context, Simulado b_simulado, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.custom_list, this);
        ButterKnife.bind(this);
        simulado = b_simulado;
        contexto = context;
        setInitialVariables();
        alternativaE.setVisibility(GONE);

        for (j = 0; j < alternativas.length; j++) {
            alternativas[j].setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    selecionarAlternativaClicada(v);
                }
            });
        }

      /*  listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences prefs, String key) {
                //Log.i("CustomList - Detectou", key + ": " + preferences.getString(key, "NULO"));
                if (key.equals(KEY_CORRECT_CHOOSE)) {

                } else if (key.equals(KEY_CAN_PAINT)) {
                    if (preferences.getString(key, "null").equals("true")) {
                        pintarAlternativas();

                        if (!preferences.getBoolean(KEY_SEE_RESULTS, false)) {
                            editor.putString(KEY_CAN_PAINT, "false");
                        }
                    }
                }
            }
        };*/
      //  preferences.registerOnSharedPreferenceChangeListener(listener);
    }

    private void pintarAlternativas() {
        ArrayList<Questao> listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        String alternativaCorreta = listaDeQuestoes.get(((MyApplication) simulado.getApplication()).getPosicao()).getGabarito();
        correctChoose(alternativaCorreta);
    }

    private void setInitialVariables() {
        preferences = PreferenceManager.getDefaultSharedPreferences(contexto);
        editor = preferences.edit();
        alternativas = new LinearLayout[]{
                alternativaA,
                alternativaB,
                alternativaC,
                alternativaD,
                alternativaE,
        };

        position = 0;
    }

    private void selecionarAlternativaClicada(View v) {
        if (clicable) {
            int position = 99;
            if (v == alternativaA) {
                position = 0;
                escolha = "A";
            } else if (v == alternativaB) {
                position = 1;
                escolha = "B";
            } else if (v == alternativaC) {
                position = 2;
                escolha = "C";
            } else if (v == alternativaD) {
                position = 3;
                escolha = "D";
            } else if (v == alternativaE) {
                position = 4;
                escolha = "E";
            }

            if (!check[position]) {
                v.setBackgroundResource(R.color.azul);
                updateResposta(escolha);
                //Log.i("CustomList", "Questão: " + position + " MyApplication: saveSelecao: selecionarAlternativa");

                saveSelecao(true, position);

                for (int i = 0; i < alternativas.length; i++) {
                    if (i != position) {
                        alternativas[i].setBackgroundResource(R.color.branco);
                        check[i] = false;
                    }
                }
                check[position] = true;
            } else if (check[position]) {
                v.setBackgroundResource(R.color.branco);
                check[position] = false;
            }

            if (!check[0] && !check[1] && !check[2] && !check[3] && !check[4]) {
                updateResposta("NULO");
            }

            if (((MyApplication) simulado.getApplication()).getVer_resposta()) {
                pintarAlternativas();
            }
        }

    }

    private void updateResposta(String resposta) {
        array_respostas = ((MyApplication) simulado.getApplication()).getRespostas();
        int position = ((MyApplication) simulado.getApplication()).getPosicao();
        array_respostas[position] = resposta;
        ((MyApplication) simulado.getApplication()).setRespostas(array_respostas);
    }

    private void saveSelecao(boolean isSelecionada, int selecao){
        getPosicao();
        getListaDeQuestoes();
        listaDeQuestoes.get(position).setSelecionada(isSelecionada);
        listaDeQuestoes.get(position).setSelecao(selecao);
        ((MyApplication) simulado.getApplication()).setListaDeQuestoes(listaDeQuestoes);
        //Log.i("CustomList", "Questão: "+position+" MyApplication: saveSelecao");
        //Log.i("CustomList", "------------------------------------------------------------------------------");
        //Log.i("CustomList", "Questão: "+position+" Salvando seleção...");
        //Log.i("CustomList", "Questão: "+position+" isSelecionada: "+listaDeQuestoes.get(position).isSelecionada());
        //Log.i("CustomList", "Questão: "+position+" selecao: "+listaDeQuestoes.get(position).getSelecao());
        //Log.i("CustomList", "------------------------------------------------------------------------------");
    }

    private void saveResposta(boolean isRespondida, int respostaCorreta, int respostaErrada){
        if (!((MyApplication) simulado.getApplication()).getSee_results()) {
            getPosicao();
            getListaDeQuestoes();
            listaDeQuestoes.get(position).setRespondida(isRespondida);
            listaDeQuestoes.get(position).setRespostaCorreta(respostaCorreta);
            listaDeQuestoes.get(position).setRespostaErrada(respostaErrada);
            ((MyApplication) simulado.getApplication()).setListaDeQuestoes(listaDeQuestoes);
            //Log.i("CustomList", "Questão: " + position + " MyApplication: saveResposta");

            //Log.i("CustomList", "------------------------------------------------------------------------------");
            //Log.i("CustomList", "Questão: " + position + " Salvando resposta...");
            //Log.i("CustomList", "Questão: " + position + " isRespondida: " + listaDeQuestoes.get(position).isRespondida());
            //Log.i("CustomList", "Questão: " + position + " respostaCorreta: " + listaDeQuestoes.get(position).getRespostaCorreta());
            //Log.i("CustomList", "Questão: " + position + " respostaErrada: " + listaDeQuestoes.get(position).getRespostaErrada());
            //Log.i("CustomList", "------------------------------------------------------------------------------");
        }
    }

    private boolean isSelecionada(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        return listaDeQuestoes.get(position).isSelecionada();
    }

    private int getSelecao(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        return listaDeQuestoes.get(position).getSelecao();
    }

    private boolean isRespondida(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        return listaDeQuestoes.get(position).isRespondida();
    }

    private int getRespostaCorreta(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        return listaDeQuestoes.get(position).getRespostaCorreta();
    }

    private int getRespostaErrada(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
        return listaDeQuestoes.get(position).getRespostaErrada();
    }

    private void getListaDeQuestoes(){
        getPosicao();
        listaDeQuestoes = ((MyApplication) simulado.getApplication()).getListaDeQuestoes();
    }

    private void getPosicao(){
        position = ((MyApplication) simulado.getApplication()).getPosicao();
    }

    public void correctChoose(String choose) {

        if (clicable) {
            clicable = false;
            int posicao = 99;
            int respostaErrada = 99;
            switch (choose) {
                case "A":
                    alternativaA.setBackgroundResource(R.color.respostaCorreta);
                    posicao = 0;

                    break;
                case "B":
                    alternativaB.setBackgroundResource(R.color.respostaCorreta);
                    posicao = 1;
                    break;
                case "C":
                    alternativaC.setBackgroundResource(R.color.respostaCorreta);
                    posicao = 2;
                    break;
                case "D":
                    alternativaD.setBackgroundResource(R.color.respostaCorreta);
                    posicao = 3;
                    break;
                case "E":
                    alternativaE.setBackgroundResource(R.color.respostaCorreta);
                    posicao = 4;
                    break;
            }


            for (int t = 0; t < check.length; t++) {
                if (t != posicao) {
                    if (check[t]) {
                        alternativas[t].setBackgroundResource(R.color.respostaErrada);
                        respostaErrada = t;
                    } else if (!check[t]) {
                        alternativas[t].setBackgroundResource(R.color.branco);
                    }
                }
            }
            //Log.i("CustomList", "saveResposta correctChoose");
            saveResposta(true, posicao, respostaErrada);
        }
    }

    public void setImage(int[] resId) {
        imagemA.setImageResource(resId[0]);
        imagemB.setImageResource(resId[1]);
        imagemC.setImageResource(resId[2]);
        imagemD.setImageResource(resId[3]);
        imagemE.setImageResource(resId[4]);
    }

    public void setText(Spanned[] texto) {
        textoA.setText(texto[0]);
        textoB.setText(texto[1]);
        textoC.setText(texto[2]);
        textoD.setText(texto[3]);
        textoE.setText(texto[4]);
        getPosicao();
        clicable = true;
        //Log.i("CustomList", "------------------------------------------------------------------------------");

        //Log.i("CustomList", "Questão: "+position+" isSelecionada: "+isSelecionada());
        //Log.i("CustomList", "Questão: "+position+" isSelecionada: "+((MyApplication) simulado.getApplication()).getListaDeQuestoes().get(position).isSelecionada());

        if (isSelecionada()){
            desselecionar();

            //Log.i("CustomList", "Questão: "+position+" Colorindo: "+getSelecao()+" azul");
            alternativas[getSelecao()].setBackgroundResource(R.color.azul);
            check[getSelecao()] = true;
        }

        //Log.i("CustomList", "Questão: "+position+" isRespondida: "+isRespondida());

        if(isRespondida()){
            desselecionar();
            clicable = false;
            //Log.i("CustomList", "Questão: "+position+" Colorindo: "+getRespostaCorreta()+" verde");
            alternativas[getRespostaCorreta()].setBackgroundResource(R.color.respostaCorreta);
            if (getRespostaErrada() != 99){
                //Log.i("CustomList", "Questão: "+position+" Colorindo: "+getRespostaErrada()+" vermelho");
                alternativas[getRespostaErrada()].setBackgroundResource(R.color.vermelho);
            }
        }

        if (!isRespondida() && !isSelecionada()){
            //Log.i("CustomList", "Questão: "+position+" Colorindo: todas as alternativas de branco");
         desselecionar();
        }
        //Log.i("CustomList", "------------------------------------------------------------------------------");

    }

    private void desselecionar(){
        for (int j =0; j < check.length; j++){
            check[j] = false;
        }
        alternativas[0].setBackgroundResource(R.color.branco);
        alternativas[1].setBackgroundResource(R.color.branco);
        alternativas[2].setBackgroundResource(R.color.branco);
        alternativas[3].setBackgroundResource(R.color.branco);
        alternativas[4].setBackgroundResource(R.color.branco);
    }




}

