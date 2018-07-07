package com.glapps.mobile.japasseiencceja.helper;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.Spanned;
import android.util.Log;

import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.objects.Questao;
import com.glapps.mobile.japasseiencceja.provas.Prova2007;
import com.glapps.mobile.japasseiencceja.provas.Prova2008;
import com.glapps.mobile.japasseiencceja.provas.Prova2009;
import com.glapps.mobile.japasseiencceja.provas.Prova2010;
import com.glapps.mobile.japasseiencceja.provas.Prova2011;
import com.glapps.mobile.japasseiencceja.provas.Prova2012;
import com.glapps.mobile.japasseiencceja.provas.Prova2013;
import com.glapps.mobile.japasseiencceja.provas.Prova2014;
import com.glapps.mobile.japasseiencceja.provas.Prova2015;
import com.glapps.mobile.japasseiencceja.provas.Prova2016;
import com.glapps.mobile.japasseiencceja.provas.Prova2017;
import com.glapps.mobile.japasseiencceja.provas.Prova2018;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by GlaucoVillasBoas on 28/04/2017.
 */

public class QuestaoManager {
    private static final String CHAVE_ENFERMAGEM = "Enfermagem";
    private static final String CHAVE_GEOGRAFIA = "Geografia";
    private static final String CHAVE_HISTORIA = "História";
    private static final String CHAVE_PORTUGUES = "Português";
    private static final String CHAVE_TEORIA_MUSICAL = "Teoria Musical";
    private static final String CHAVE_COMBATENTE = "Combatente/Logística/Técnico/Aviação";
    private static final String CHAVE_SAUDE = "Saúde";
    private static final String CHAVE_MuSICA = "Música";

    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS  = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";

    private static final String PRIMEIRO_DIA = "1º Dia";
    private static final String SEGUNDO_DIA = "2º Dia";
    ArrayList<Questao> listDeQuestoes = new ArrayList<Questao>();
    Context contexto;
    Simulado simulado;
    Prova2018 prova2018;
    Prova2017 prova2017;
    Prova2016 prova2016;
    Prova2015 prova2015;
    Prova2014 prova2014;
    Prova2013 prova2013;
    Prova2012 prova2012;
    Prova2011 prova2011;
    Prova2010 prova2010;
    Prova2009 prova2009;
    Prova2008 prova2008;
    Prova2007 prova2007;
    Spanned enunciado;
    Spanned alternativaA;
    int especie;
    Spanned alternativaB;
    Spanned alternativaC;
    Spanned alternativaD;
    Spanned alternativaE;

    String gabarito;
    int countEnfermagem = 0;
    int countGeografia = 0;
    int countHistoria = 0;
    int countMatematica = 0;
    int countPortugues = 0;
    int countTeoriaMusical = 0;
    int ID = -1;
    String anoGerado;
    Spanned resolucao;
    Spanned prerequisito;
    ArrayList<String> anosGerados = new ArrayList<>();
    ArrayList<String> materiasGeradas = new ArrayList<>();
    ArrayList<Integer> indicesGerados = new ArrayList<>();
    String materia;
    int indice;
    public QuestaoManager(Context context, Simulado b_simulado) {
        contexto = context;
        simulado = b_simulado;
        prova2017 = new Prova2017(context, simulado);
        prova2018 = new Prova2018(context, simulado);
        prova2016 = new Prova2016(context, simulado);
        prova2015 = new Prova2015(context, simulado);
        prova2014 = new Prova2014(context, simulado);
        prova2013 = new Prova2013(context, simulado);
        prova2012 = new Prova2012(context, simulado);
        prova2011 = new Prova2011(context, simulado);
        prova2010 = new Prova2010(context, simulado);
        prova2009 = new Prova2009(context, simulado);
        prova2008 = new Prova2008(context, simulado);
        prova2007 = new Prova2007(context, simulado);
    }

    public void gerarQuestoes(String ano, String disciplina, String tipo, int quantidadeDeQuestoes){



        if(!disciplina.equals("Prova Completa") ) {
            for (int t = 0; t < quantidadeDeQuestoes; t++) {

              //  Log.i("QUESTAO", "Questão Atual: "+t+"/"+(quantidadeDeQuestoes-1));
                if (t == quantidadeDeQuestoes-1){
                    LocalBroadcastManager.getInstance(simulado).sendBroadcast(new Intent("cabo"));
                }

                int indice = t + 1;
                listDeQuestoes.add(new Questao(contexto, simulado, indice, indice, disciplina, ano, tipo));
                //Log.i("Questao", " -------------------------------------------------------");
                //Log.i("Questao", " ID: " + listDeQuestoes.get(t).getId());
                //Log.i("Questao", " Índice: " + listDeQuestoes.get(t).getIndice());
                //Log.i("Questao", " Matéria: " + listDeQuestoes.get(t).getMateria());
                //Log.i("Questao", " Ano: " + listDeQuestoes.get(t).getAno());
                //Log.i("Questao", " A: " + listDeQuestoes.get(t).getAlternativaA());
                //Log.i("Questao", " B: " + listDeQuestoes.get(t).getAlternativaB());
                //Log.i("Questao", " C: " + listDeQuestoes.get(t).getAlternativaC());
                //Log.i("Questao", " D: " + listDeQuestoes.get(t).getAlternativaD());
                //Log.i("Questao", " E: " + listDeQuestoes.get(t).getAlternativaE());
                //Log.i("Questao", " Gabarito: " + listDeQuestoes.get(t).getGabarito());
                //Log.i("Questao", " Resolucao: " + listDeQuestoes.get(t).getResolucao());
                //Log.i("Questao", " -------------------------------------------------------");
            }
        }



        if(disciplina.equals(PRIMEIRO_DIA)) {

            materia = disciplina;


            for (int t = 0; t < getCountQuestao(ano, PRIMEIRO_DIA, tipo); t++) {
                ID++;
                int indice = t + 1;
                //Log.i("gerarQuestoes", "------------------------------------------------------------------------------------");
                //Log.i("gerarQuestoes", "INDICE: " + indice);
                //Log.i("gerarQuestoes", "MATERIA RECEBIDA: " + materia);


                if (indice <= 45) {
                    materia = CIENCIAS_HUMANAS;
                } else if (indice <= 90) {
                    materia = CIENCIAS_DA_NATUREZA;
                }
                listDeQuestoes.add(new Questao(contexto, simulado, ID, indice, materia, ano, tipo));
            }
        }else

        if(disciplina.equals(SEGUNDO_DIA)) {

            materia = disciplina;


            for (int t = 0; t < getCountQuestao(ano, PRIMEIRO_DIA, tipo); t++) {
                ID++;
                int indice = t + 1;
                //Log.i("gerarQuestoes", "------------------------------------------------------------------------------------");
                //Log.i("gerarQuestoes", "INDICE: " + indice);
                //Log.i("gerarQuestoes", "MATERIA RECEBIDA: " + materia);


                if (indice <= 45) {
                    materia = LINGUAGENS_CÓDIGOS;
                }else if (indice <= 90){
                    materia = CHAVE_MATEMATICA;
                }

                listDeQuestoes.add(new Questao(contexto, simulado, ID, indice, materia, ano, tipo));
            }
        }




        ((MyApplication) simulado.getApplication()).setListaDeQuestoes(listDeQuestoes);
    }

    public void gerarConteudoQuestoes(int received_indice, String received_materia, String ano, String tipo){
        materia = received_materia;
        indice = received_indice;



        switch (ano) {

            case "2018":
                prova2018.gerar(indice, materia);
                this.enunciado = prova2018.getEnunciado();
                this.alternativaA = prova2018.getqA();
                this.alternativaB = prova2018.getqB();
                this.alternativaC = prova2018.getqC();
                this.alternativaD = prova2018.getqD();
                this.alternativaE = prova2018.getqE();
                this.resolucao = prova2018.getsResolucao();
                this.gabarito = prova2018.gabarito(materia, indice);
                break;

            case "2017":
                prova2017.gerar(indice, materia);
                this.enunciado = prova2017.getEnunciado();
                this.alternativaA = prova2017.getqA();
                this.alternativaB = prova2017.getqB();
                this.alternativaC = prova2017.getqC();
                this.alternativaD = prova2017.getqD();
                this.alternativaE = prova2017.getqE();
                this.resolucao = prova2017.getsResolucao();
                this.gabarito = prova2017.gabarito(materia, indice);
                break;

            case "2016":
                prova2016.gerar(indice, materia);
                this.enunciado = prova2016.getEnunciado();

                this.alternativaA = prova2016.getqA();
                this.alternativaB = prova2016.getqB();
                this.alternativaC = prova2016.getqC();
                this.alternativaD = prova2016.getqD();
                this.alternativaE = prova2016.getqE();
                this.resolucao = prova2016.getsResolucao();
                this.prerequisito = prova2016.getsPrerequisito();
                this.gabarito = prova2016.gabarito(materia, indice);
                break;

            case "2015":
                prova2015.gerar(indice, materia);
                this.enunciado = prova2015.getEnunciado();

                this.alternativaA = prova2015.getqA();
                this.alternativaB = prova2015.getqB();
                this.alternativaC = prova2015.getqC();
                this.alternativaD = prova2015.getqD();
                this.alternativaE = prova2015.getqE();
                this.resolucao = prova2015.getsResolucao();
                this.gabarito = prova2015.gabarito(materia, indice);
                break;

            case "2014":
                prova2014.gerar(indice, materia);
                this.enunciado = prova2014.getEnunciado();

                this.alternativaA = prova2014.getqA();
                this.alternativaB = prova2014.getqB();
                this.alternativaC = prova2014.getqC();
                this.alternativaD = prova2014.getqD();
                this.alternativaE = prova2014.getqE();
                this.resolucao = prova2014.getsResolucao();
                this.gabarito = prova2014.gabarito(materia, indice);
                break;

            case "2013":
                prova2013.gerar(indice, materia);
                this.enunciado = prova2013.getEnunciado();

                this.alternativaA = prova2013.getqA();
                this.alternativaB = prova2013.getqB();
                this.alternativaC = prova2013.getqC();
                this.alternativaD = prova2013.getqD();
                this.alternativaE = prova2013.getqE();
                this.resolucao = prova2013.getsResolucao();
                this.gabarito = prova2013.gabarito(materia, indice);
                break;

            case "2012":
                prova2012.gerar(indice, materia);
                this.enunciado = prova2012.getEnunciado();
                this.alternativaA = prova2012.getqA();
                this.alternativaB = prova2012.getqB();
                this.alternativaC = prova2012.getqC();
                this.alternativaD = prova2012.getqD();
                this.alternativaE = prova2012.getqE();
                this.resolucao = prova2012.getsResolucao();
                this.gabarito = prova2012.gabarito(materia, indice);
                break;

            case "2011":
                prova2011.gerar(indice, materia);
                this.enunciado = prova2011.getEnunciado();
                this.alternativaA = prova2011.getqA();
                this.alternativaB = prova2011.getqB();
                this.alternativaC = prova2011.getqC();
                this.alternativaD = prova2011.getqD();
                this.alternativaE = prova2011.getqE();
                this.resolucao = prova2011.getsResolucao();
                this.gabarito = prova2011.gabarito(materia, indice);
                break;

            case "2010":
                prova2010.gerar(indice, materia);
                this.enunciado = prova2010.getEnunciado();
                this.alternativaA = prova2010.getqA();
                this.alternativaB = prova2010.getqB();
                this.alternativaC = prova2010.getqC();
                this.alternativaD = prova2010.getqD();
                this.alternativaE = prova2010.getqE();
                this.resolucao = prova2010.getsResolucao();
                this.gabarito = prova2010.gabarito(materia, indice);
                break;

            case "2009":
                prova2009.gerar(indice, materia);
                this.enunciado = prova2009.getEnunciado();
                this.alternativaA = prova2009.getqA();
                this.alternativaB = prova2009.getqB();
                this.alternativaC = prova2009.getqC();
                this.alternativaD = prova2009.getqD();
                this.alternativaE = prova2009.getqE();
                this.resolucao = prova2009.getsResolucao();
                this.gabarito = prova2009.gabarito(materia, indice);
                break;

            case "2008":
                prova2008.gerar(indice, materia);
                this.enunciado = prova2008.getEnunciado();
                this.alternativaA = prova2008.getqA();
                this.alternativaB = prova2008.getqB();
                this.alternativaC = prova2008.getqC();
                this.alternativaD = prova2008.getqD();
                this.alternativaE = prova2008.getqE();
                this.resolucao = prova2008.getsResolucao();
                this.gabarito = prova2008.gabarito(materia, indice);
                break;

            case "2007":
                prova2007.gerar(indice, materia);
                this.enunciado = prova2007.getEnunciado();
                this.alternativaA = prova2007.getqA();
                this.alternativaB = prova2007.getqB();
                this.alternativaC = prova2007.getqC();
                this.alternativaD = prova2007.getqD();
                this.alternativaE = prova2007.getqE();
                this.resolucao = prova2007.getsResolucao();
                this.gabarito = prova2007.gabarito(materia, indice);
                break;
        }
    }

    public Spanned getResolucao() {
        return resolucao;
    }
    public Spanned getPrerequisito() {
        return prerequisito;
    }

    public int getCountQuestao(String ano, String materia, String tipo){
        int count = 0;

        switch (ano){
            case "2018":
                count = prova2018.getCountQuestao(materia, tipo);
                break;
            case "2017":
                count = prova2017.getCountQuestao(materia, tipo);
                break;
            case "2016":
                count = prova2016.getCountQuestao(materia, tipo);
                break;
            case "2015":
                count = prova2015.getCountQuestao(materia, tipo);
                break;
            case "2014":
                count = prova2014.getCountQuestao(materia, tipo);
                break;
            case "2013":
                count = prova2013.getCountQuestao(materia, tipo);
                break;
            case "2012":
                count = prova2012.getCountQuestao(materia, tipo);
                break;
            case "2011":
                count = prova2011.getCountQuestao(materia, tipo);
                break;
            case "2010":
                count = prova2010.getCountQuestao(materia, tipo);
                break;
            case "2009":
                count = prova2009.getCountQuestao(materia, tipo);
                break;
            case "2008":
                count = prova2008.getCountQuestao(materia, tipo);
                break;
            case "2007":
                count = prova2007.getCountQuestao(materia, tipo);
                break;
            case "Aleatório":
                if (!materia.equals("Prova Completa")) {
                    count = 10;
                }else {
                    if (tipo.equals(CHAVE_COMBATENTE)) {
                        count = 40;
                    } else {
                        count = 50;
                    }
                    break;
                }}
        return count;
    }

    public Spanned getEnunciado() {
        return enunciado;
    }


    public int getEspecie() {
        //Log.i("Especie", "getEspecieQuestaoManager: "+especie);
        return especie;
    }

    public Spanned getAlternativaA() {return alternativaA;}

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

    public String getAnoGerado() {
        return anoGerado;
    }
}
