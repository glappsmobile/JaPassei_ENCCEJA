package com.glapps.mobile.japasseiencceja.leitor;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;
import com.glapps.mobile.japasseiencceja.objects.ProvaObjeto;

/**
 * Created by GlaucoVillasBoas on 10/07/2017.
 */

public class LeitorSegundo {
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";

    Boolean boo_imagemBottom;
    Boolean boo_imagemMiddle;
    Boolean boo_radioImage;
    boolean boo_resolucao;
    Context context;
    Boolean isMath;
    String qA;
    String qB;
    String qC;
    String qD;
    String qE;
    String resolucao;
    String sourceString = "";
    String sourceString2;
    int countQuestao;
    Spanned sEnunciado;
    Spanned sqA;
    Spanned sqB;
    Spanned sqC;
    Spanned sqD;
    Spanned sqE;
    Spanned sResolucao;
    Simulado simulado;
    private static final String PRIMEIRO_DIA = "1º Dia";
    private static final String SEGUNDO_DIA = "2º Dia";
    int especie = 2;

    ProvaObjeto prova;

    public  LeitorSegundo() {

    }
    String atual_materia = "";
    public ProvaObjeto modo2(int indice, String materia, String ano, Simulado simulado){
        prova = new ProvaObjeto();
        int novoIndice = indice;

        atual_materia = materia;

        if (atual_materia.equals(PRIMEIRO_DIA)){
            if (novoIndice <= 45){
                atual_materia = CIENCIAS_HUMANAS;
            }else if (novoIndice <= 90) {
                atual_materia = CIENCIAS_DA_NATUREZA;
            }
            }else if (atual_materia.equals(SEGUNDO_DIA)){
                if (indice <= 45) {
                    atual_materia = LINGUAGENS_CÓDIGOS;
                }else if (indice <= 90){
                    atual_materia = CHAVE_MATEMATICA;
                }

        }

        switch (atual_materia) {
            case CIENCIAS_DA_NATUREZA:
                novoIndice += 45;
                break;

            case INGLES:
                novoIndice += 90;
                break;

            case ESPANHOL:
                novoIndice += 95;
                break;

            case LINGUAGENS_CÓDIGOS:
                novoIndice += 100;
                break;
            case CHAVE_MATEMATICA:
                novoIndice += 140;
                break;
        }


        String texto = "";
        String texto2 = "";
        String texto3 = "";
        String textoa = "";
        String textob = "";
        String textoc = "";
        String textod = "";
        String textoe = "";

        texto = "q" + ano + "_" + novoIndice + "_t1";
        texto2 = "q" + ano + "_" + novoIndice + "_t2";
        texto3 = "q" + ano + "_" + novoIndice + "_t3";

        textoa = "q" + ano + "_" + novoIndice + "_1";
        textob = "q" + ano + "_" + novoIndice + "_2";
        textoc = "q" + ano + "_" + novoIndice + "_3";
        textod = "q" + ano + "_" + novoIndice + "_4";
        textoe = "q" + ano + "_" + novoIndice + "_5";

        String txtimagem = "q" + ano + "_" + novoIndice;
        String txtimagem2 = "q" + ano + "_" + novoIndice+"_2";

        String txtimagema = "q" + ano + "_" + novoIndice+"_i1";
        String txtimagemb = "q" + ano + "_" + novoIndice+"_i2";
        String txtimagemc = "q" + ano + "_" + novoIndice+"_i3";
        String txtimagemd = "q" + ano + "_" + novoIndice+"_i4";
        String txtimageme = "q" + ano + "_" + novoIndice+"_i5";

        int imagem = simulado.getResources().getIdentifier(txtimagem, "drawable", simulado.getPackageName());
        int imagem2 = simulado.getResources().getIdentifier(txtimagem2, "drawable", simulado.getPackageName());

        int imagema = simulado.getResources().getIdentifier(txtimagema, "drawable", simulado.getPackageName());
        int imagemb = simulado.getResources().getIdentifier(txtimagemb, "drawable", simulado.getPackageName());
        int imagemc = simulado.getResources().getIdentifier(txtimagemc, "drawable", simulado.getPackageName());
        int imagemd = simulado.getResources().getIdentifier(txtimagemd, "drawable", simulado.getPackageName());
        int imageme = simulado.getResources().getIdentifier(txtimageme, "drawable", simulado.getPackageName());


        //Log.i("MECHANAL", "-----------------------------------------------------------------------------");
        //Log.i("MECHANAL", "Indice: "+indice);
        //Log.i("MECHANAL", "Novo Indice: "+novoIndice);
        //Log.i("MECHANAL", "Matéria: "+materia);
        //Log.i("MECHANAL", "Indice: "+indice);
        //Log.i("MECHANAL", "Questao: "+texto);
        //Log.i("MECHANAL", "-----------------------------------------------------------------------------");

        int enunid = simulado.getResources().getIdentifier(texto, "string", simulado.getPackageName());
        int enunid2 = simulado.getResources().getIdentifier(texto2, "string", simulado.getPackageName());
        int enunid3 = simulado.getResources().getIdentifier(texto3, "string", simulado.getPackageName());

        int enunida = simulado.getResources().getIdentifier(textoa, "string", simulado.getPackageName());
        int enunidb = simulado.getResources().getIdentifier(textob, "string", simulado.getPackageName());
        int enunidc = simulado.getResources().getIdentifier(textoc, "string", simulado.getPackageName());
        int enunidd = simulado.getResources().getIdentifier(textod, "string", simulado.getPackageName());
        int enunide = simulado.getResources().getIdentifier(textoe, "string", simulado.getPackageName());
        String enuna = "";
        String enunb = "";
        String enunc = "";
        String enund = "";
        String enune = "";

        try {
            Traduzir traduzir = new Traduzir(true, false);
            String enun = simulado.getResources().getString(enunid);

            //   enun = traduzir.TraduzirLight(enun);

            if (enunida != 0) {
                enuna = simulado.getResources().getString(enunida);
                enunb = simulado.getResources().getString(enunidb);
                enunc = simulado.getResources().getString(enunidc);
                enund = simulado.getResources().getString(enunidd);
                enune = simulado.getResources().getString(enunide);
            }
            //Log.i("ALGORITMO", "-----------------------------------------------");
            //Log.i("ALGORITMO", indice+" ENUNID 1: "+enunid);
            //Log.i("ALGORITMO", indice+" ENUNID 2: "+enunid2);
            //Log.i("ALGORITMO", indice+" ENUNID 3: "+enunid3);

            if (enunid3 != 0){
                //Log.i("ALGORITMO", indice+" ENUNID 3 != 0");
                //Log.i("ALGORITMO", indice+" IMAGEM 1: "+txtimagem);
                //Log.i("ALGORITMO", indice+" IMAGEM 2: "+txtimagem2);
                //Log.i("ALGORITMO", "-----------------------------------------------");
                String enun2 = simulado.getResources().getString(enunid2);
                String enun3 = simulado.getResources().getString(enunid3);
                //      enun2 = traduzir.TraduzirLight(enun2);
                //     enun3 = traduzir.TraduzirLight(enun3);

                if (imagem == 0 && imagem2 == 0) {
                    enun = enun + " @2 " + enun2 + " @2 "+enun3;
                }else{
                    enun = enun + " @2" + "@cimg "+txtimagem+" cimg@ @1"+enun2+" @2 "+"@cimg "+txtimagem2+" cimg@ @1 "+enun3;

                }
            } else if (enunid2 != 0) {
                String enun2 = simulado.getResources().getString(enunid2);
                //    enun2 = traduzir.TraduzirLight(enun2);
                if (imagem == 0) {
                    enun = enun + " @2" + enun2;
                }else{
                    enun = enun + " @2" + "@cimg "+txtimagem+" cimg@ @1"+enun2;
                }
                //Log.i("ALGORITMO", enun2);
            }else{
                if (imagem != 0){
                    enun = "@cimg "+txtimagem+" cimg@ @1"+enun;
                }
            }

            if (imagema != 0){
                //Log.i("Prova2015", indice+" "+txtimagema+" ID: "+imagema);
                //Log.i("Prova2015", indice+" "+txtimagemb+" ID: "+imagemb);
                //Log.i("Prova2015", indice+" "+txtimagemc+" ID: "+imagemc);
                //Log.i("Prova2015", indice+" "+txtimagemd+" ID: "+imagemd);
                //Log.i("Prova2015", indice+" "+txtimageme+" ID: "+imageme);
                enuna = "@cimg "+txtimagema+" cimg@";
                enunb = "@cimg "+txtimagemb+" cimg@";
                enunc = "@cimg "+txtimagemc+" cimg@";
                enund = "@cimg "+txtimagemd+" cimg@";
                enune = "@cimg "+txtimageme+" cimg@";
            }
            //Log.i("Prova2015", indice+" ENUMA "+enuna);
            //Log.i("Prova2015", indice+" ENUMB "+enunb);
            //Log.i("Prova2015", indice+" ENUMC "+enunc);
            //Log.i("Prova2015", indice+" ENUMD "+enund);
            //Log.i("Prova2015", indice+" ENUME "+enune);

            //Log.i("ALGORITMO", "  ");
            //Log.i("ALGORITMO", "[A]" + enuna);
            //Log.i("ALGORITMO", "[B]" + enunb);
            //Log.i("ALGORITMO", "[C]" + enunc);
            //Log.i("ALGORITMO", "[D]" + enund);
            //Log.i("ALGORITMO", "[E]" + enune);


            this.sourceString = enun.replaceAll("\\n", "@1");;
            this.qA = enuna;
            this.qB = enunb;
            this.qC = enunc;
            this.qD = enund;
            this.qE = enune;
            this.resolucao = "";

            //   Traduzir traduzir = new Traduzir(true, false);
            this.sourceString = traduzir.enunciado(sourceString);
            this.sourceString = traduzir.TraduzirLight(sourceString);
            this.qA = traduzir.enunciado(qA);
            this.qB = traduzir.enunciado(qB);
            this.qC = traduzir.enunciado(qC);
            this.qD = traduzir.enunciado(qD);
            this.qE = traduzir.enunciado(qE);
            this.resolucao = traduzir.enunciado(resolucao);

            prova.setsEnunciado(Html.fromHtml(sourceString, simulado , null));
            prova.setSqA(Html.fromHtml(qA, simulado , null));
            prova.setSqB(Html.fromHtml(qB, simulado , null));
            prova.setSqC(Html.fromHtml(qC, simulado , null));
            prova.setSqD(Html.fromHtml(qD, simulado , null));
            prova.setSqE(Html.fromHtml(qE, simulado , null));
            prova.setEspecie(2);


        }catch (Exception e){

            //Log.i("ALGORITMO", "ERRO EM:"+novoIndice+"\n"+e.getMessage());
        }

        return prova;
    }
}
