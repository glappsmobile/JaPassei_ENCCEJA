package com.glapps.mobile.japasseiencceja.objects;

import android.content.Context;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.QuestaoManager;

/**
 * Created by GlaucoVillasBoas on 28/04/2017.
 */

public class Questao {
    private boolean Selecionada;
    private int especie;
    private boolean Respondida;
    private int Selecao;
    private int RespostaCorreta;
    private int RespostaErrada;
    private int id;
    private int indice;
    private String materia;
    private String ano;
    private Spanned enunciado;
    private Spanned alternativaA;
    private Spanned alternativaB;
    private Spanned alternativaC;
    private Spanned alternativaD;
    private Spanned alternativaE;
    private Spanned resolucao;
    private Spanned prerequisito;
    private String gabarito;
    private String status = "EM BRANCO";
    //------------------------------- KEYS ----------------------------------//
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String PRIMEIRO_DIA = "1º Dia";
    private static final String SEGUNDO_DIA = "2º Dia";
    private static final String CHAVE_COMPLETA = "Prova Completa";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    private Context contexto;
    String tipo;
    private QuestaoManager manager;
    Simulado simulado;

    public Questao(Context context, Simulado simulado, int id, int indice, String materia, String ano, String tipo) {
        this.tipo = tipo;
        this.simulado = simulado;
        manager = new QuestaoManager(context, simulado);

        this.contexto = context;
        this.id = id;
        this.indice = indice;
        this.materia = materia;
        this.ano = ano;

        manager.gerarConteudoQuestoes(indice, materia, ano, tipo);
        if (this.ano.equals("Aleatório")) this.ano = manager.getAnoGerado();
        this.enunciado = manager.getEnunciado();
        this.especie = manager.getEspecie();
        this.alternativaA = manager.getAlternativaA();
        this.alternativaB = manager.getAlternativaB();
        this.alternativaC = manager.getAlternativaC();
        this.alternativaD = manager.getAlternativaD();
        this.alternativaE = manager.getAlternativaE();
        this.gabarito = manager.getGabarito();
        this.resolucao = manager.getResolucao();
        this.prerequisito = manager.getPrerequisito();


        logQuestao();
    }

    private void logQuestao() {
        //Log.i("Questao", " -------------------------------------------------------");
        //Log.i("Questao", " ID: "+getId());
        //Log.i("Questao", " Índice: "+getIndice());
        //Log.i("Questao", " Matéria: "+getMateria());
        //Log.i("Questao", " Ano: "+getAno());
        //Log.i("Questao", " A: "+getAlternativaA());
        //Log.i("Questao", " B: "+getAlternativaB());
        //Log.i("Questao", " C: "+getAlternativaC());
        //Log.i("Questao", " D: "+getAlternativaD());
        //Log.i("Questao", " E: "+getAlternativaE());
        //Log.i("Questao", " Gabarito: "+getGabarito());
        //Log.i("Questao", " -------------------------------------------------------");
    }


    public int getEspecie() {return especie;}

    public void setEspecie(int especie) {this.especie = especie;};

    public Spanned getResolucao() {
        return resolucao;
    }

    public void setResolucao(Spanned resolucao) {
        this.resolucao = resolucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSelecionada() {
        return Selecionada;
    }

    public void setSelecionada(boolean selecionada) {
        Selecionada = selecionada;
    }

    public boolean isRespondida() {
        return Respondida;
    }

    public void setRespondida(boolean respondida) {
        Respondida = respondida;
    }

    public int getSelecao() {
        return Selecao;
    }

    public void setSelecao(int selecao) {
        Selecao = selecao;
    }

    public int getRespostaCorreta() {
        return RespostaCorreta;
    }

    public void setRespostaCorreta(int respostaCorreta) {
        RespostaCorreta = respostaCorreta;
    }

    public int getRespostaErrada() {
        return RespostaErrada;
    }

    public void setRespostaErrada(int respostaErrada) {
        RespostaErrada = respostaErrada;
    }


    public Spanned getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(Spanned prerequisito) {
        this.prerequisito = prerequisito;
    }

    public int getId() {
        return id;
    }

    public int getIndice() {
        return indice;
    }

    public String getMateria() {
        String atual_materia = materia;

        if (atual_materia.equals(PRIMEIRO_DIA)){
            if (indice <= 45){
                atual_materia = CIENCIAS_HUMANAS;
            }else if (indice <= 90){
                atual_materia = CIENCIAS_DA_NATUREZA;
            }
        }else if (atual_materia.equals(SEGUNDO_DIA)){
            if (indice <= 5 && tipo.equals(INGLES)) {
                atual_materia = INGLES;
            }else  if (indice <= 5 && tipo.equals(ESPANHOL)){
                atual_materia = ESPANHOL;
            } else if (indice <= 45 && indice > 5) {
                atual_materia = LINGUAGENS_CÓDIGOS;
            } else if (indice <= 90) {
                atual_materia = CHAVE_MATEMATICA;
            }


        }
        return atual_materia;
    }

    public String getAno() {
        return ano;
    }

    public Spanned getEnunciado() {
        return enunciado;
    }

    public Spanned getAlternativaA() {
        return alternativaA;
    }

    public Spanned getAlternativaB() {
        return alternativaB;
    }

    public Spanned getAlternativaC() {
        return alternativaC;
    }

    public Spanned getAlternativaD() {
        return alternativaD;
    }

    public Spanned getAlternativaE() {
        return alternativaE;
    }

    public String getGabarito() {
        return gabarito;
    }
}