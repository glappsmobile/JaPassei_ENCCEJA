package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.leitor.LeitorSegundo;
import com.glapps.mobile.japasseiencceja.objects.ProvaObjeto;


public class Prova2009 {

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
    String sourceString;
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
    ProvaObjeto prova;
    int especie = 2;

    public Prova2009(Context contexto, Simulado simulado) {
        this.simulado = simulado;
        this.sourceString = BuildConfig.FLAVOR;
        this.sourceString2 = BuildConfig.FLAVOR;
        this.isMath = Boolean.valueOf(false);
        this.boo_radioImage = Boolean.valueOf(false);
        this.boo_imagemMiddle = Boolean.valueOf(false);
        this.boo_imagemBottom = Boolean.valueOf(false);
        this.qA = BuildConfig.FLAVOR;
        this.qB = BuildConfig.FLAVOR;
        this.qC = BuildConfig.FLAVOR;
        this.qD = BuildConfig.FLAVOR;
        this.qE = BuildConfig.FLAVOR;
        this.resolucao = "Opa! Parece que tivemos um problema, essa resolu\u00e7\u00e3o est\u00e1 passando por uma revis\u00e3o. Mais tarde ela estar\u00e1 de volta.";
        this.boo_resolucao = false;
        this.context = contexto;
    }

    public void gerar(int indice, String materia) {

        String tipo = ((MyApplication) simulado.getApplication()).getTipo();
        LeitorSegundo leitor = new LeitorSegundo();

        prova = leitor.modo2(indice, materia, "2009", simulado);

        especie = prova.getEspecie();
        sEnunciado = prova.getsEnunciado();
        sqA = prova.getSqA();
        sqB = prova.getSqB();
        sqC = prova.getSqC();
        sqD = prova.getSqD();
        sqE = prova.getSqE();

    }



    public Spanned getEnunciado() {
        return sEnunciado;
    };

    public int getEspecie() {return especie;};

    public Spanned getqA() {
        return sqA;
    };

    public Spanned getqB() {
        return sqB;
    };

    public Spanned getqC() {
        return sqC;
    };

    public Spanned getqD() {
        return sqD;
    };

    public Spanned getqE() {
        return sqE;
    };

    public Spanned getsResolucao() {
        return sResolucao;
    }

    public int getCountQuestao(String materia, String tipo ) {
        countQuestao = 1;

        if (materia.equals(LINGUAGENS_CÓDIGOS)){
            countQuestao = 45;
        }else if(materia.equals(CHAVE_MATEMATICA)){
            countQuestao = 45;
        }else if(materia.equals(CIENCIAS_DA_NATUREZA)){
            countQuestao = 45;
        }else if(materia.equals(CIENCIAS_HUMANAS)){
            countQuestao = 45;

        }else if(materia.equals("Prova Completa")){
            countQuestao = getCountQuestao(LINGUAGENS_CÓDIGOS, tipo)+
                    getCountQuestao(CHAVE_MATEMATICA, tipo)+
                    getCountQuestao(CIENCIAS_DA_NATUREZA, tipo)+
                    getCountQuestao(CIENCIAS_HUMANAS, tipo);

        }

        return countQuestao;
    }

    public String gabarito(String materia, int indice){
        String alternativa = "NULO";

        if (materia.equals(INGLES)){
            switch (indice) {
                case 1: alternativa = "C"; break;
                case 2: alternativa = "E"; break;
                case 3: alternativa = "D"; break;
                case 4: alternativa = "E"; break;
                case 5: alternativa = "A"; break;
            }
        }

        if (materia.equals(ESPANHOL)){
            switch (indice){
                case 1: alternativa = "C"; break;
                case 2: alternativa = "C"; break;
                case 3: alternativa = "B"; break;
                case 4: alternativa = "E"; break;
                case 5: alternativa = "B"; break;
            }
        }

        if(materia.equals(LINGUAGENS_CÓDIGOS)){
            switch (indice){
                case 1: alternativa = "D"; break;
                case 2: alternativa = "B"; break;
                case 3: alternativa = "A"; break;
                case 4: alternativa = "B"; break;
                case 5: alternativa = "E"; break;
                case 6: alternativa = "C"; break;
                case 7: alternativa = "A"; break;
                case 8: alternativa = "B"; break;
                case 9: alternativa = "D"; break;
                case 10: alternativa = "A"; break;
                case 11: alternativa = "D"; break;
                case 12: alternativa = "E"; break;
                case 13: alternativa = "A"; break;
                case 14: alternativa = "D"; break;
                case 15: alternativa = "C"; break;
                case 16: alternativa = "E"; break;
                case 17: alternativa = "D"; break;
                case 18: alternativa = "C"; break;
                case 19: alternativa = "B"; break;
                case 20: alternativa = "E"; break;
                case 21: alternativa = "B"; break;
                case 22: alternativa = "B"; break;
                case 23: alternativa = "C"; break;
                case 24: alternativa = "E"; break;
                case 25: alternativa = "B"; break;
                case 26: alternativa = "A"; break;
                case 27: alternativa = "A"; break;
                case 28: alternativa = "E"; break;
                case 29: alternativa = "B"; break;
                case 30: alternativa = "A"; break;
                case 31: alternativa = "A"; break;
                case 32: alternativa = "E"; break;
                case 33: alternativa = "C"; break;
                case 34: alternativa = "B"; break;
                case 35: alternativa = "B"; break;
                case 36: alternativa = "C"; break;
                case 37: alternativa = "B"; break;
                case 38: alternativa = "D"; break;
                case 39: alternativa = "A"; break;
                case 40: alternativa = "B"; break;

            }
        }

        if(materia.equals(CHAVE_MATEMATICA)){
            switch (indice){
                case 1: alternativa = "D"; break;
                case 2: alternativa = "A"; break;
                case 3: alternativa = "D"; break;
                case 4: alternativa = "C"; break;
                case 5: alternativa = "C"; break;
                case 6: alternativa = "E"; break;
                case 7: alternativa = "C"; break;
                case 8: alternativa = "B"; break;
                case 9: alternativa = "D"; break;
                case 10: alternativa = "E"; break;
                case 11: alternativa = "C"; break;
                case 12: alternativa = "A"; break;
                case 13: alternativa = "D"; break;
                case 14: alternativa = "C"; break;
                case 15: alternativa = "B"; break;
                case 16: alternativa = "A"; break;
                case 17: alternativa = "C"; break;
                case 18: alternativa = "D"; break;
                case 19: alternativa = "B"; break;
                case 20: alternativa = "C"; break;
                case 21: alternativa = "E"; break;
                case 22: alternativa = "E"; break;
                case 23: alternativa = "A"; break;
                case 24: alternativa = "B"; break;
                case 25: alternativa = "D"; break;
                case 26: alternativa = "D"; break;
                case 27: alternativa = "A"; break;
                case 28: alternativa = "A"; break;
                case 29: alternativa = "B"; break;
                case 30: alternativa = "D"; break;
                case 31: alternativa = "B"; break;
                case 32: alternativa = "C"; break;
                case 33: alternativa = "E"; break;
                case 34: alternativa = "A"; break;
                case 35: alternativa = "D"; break;
                case 36: alternativa = "D"; break;
                case 37: alternativa = "B"; break;
                case 38: alternativa = "E"; break;
                case 39: alternativa = "C"; break;
                case 40: alternativa = "E"; break;
                case 41: alternativa = "B"; break;
                case 42: alternativa = "A"; break;
                case 43: alternativa = "E"; break;
                case 44: alternativa = "B"; break;
                case 45: alternativa = "C"; break;
            }
        }

        if(materia.equals(CIENCIAS_DA_NATUREZA)){
            switch (indice){

                case 1: alternativa = "B"; break;
                case 2: alternativa = "C"; break;
                case 3: alternativa = "A"; break;
                case 4: alternativa = "D"; break;
                case 5: alternativa = "B"; break;
                case 6: alternativa = "C"; break;
                case 7: alternativa = "E"; break;
                case 8: alternativa = "D"; break;
                case 9: alternativa = "C"; break;
                case 10: alternativa = "C"; break;
                case 11: alternativa = "B"; break;
                case 12: alternativa = "A"; break;
                case 13: alternativa = "D"; break;
                case 14: alternativa = "B"; break;
                case 15: alternativa = "D"; break;
                case 16: alternativa = "C"; break;
                case 17: alternativa = "A"; break;
                case 18: alternativa = "D"; break;
                case 19: alternativa = "B"; break;
                case 20: alternativa = "E"; break;
                case 21: alternativa = "B"; break;
                case 22: alternativa = "D"; break;
                case 23: alternativa = "B"; break;
                case 24: alternativa = "E"; break;
                case 25: alternativa = "A"; break;
                case 26: alternativa = "D"; break;
                case 27: alternativa = "C"; break;
                case 28: alternativa = "C"; break;
                case 29: alternativa = "A"; break;
                case 30: alternativa = "E"; break;
                case 31: alternativa = "A"; break;
                case 32: alternativa = "C"; break;
                case 33: alternativa = "D"; break;
                case 34: alternativa = "B"; break;
                case 35: alternativa = "E"; break;
                case 36: alternativa = "D"; break;
                case 37: alternativa = "B"; break;
                case 38: alternativa = "C"; break;
                case 39: alternativa = "A"; break;
                case 40: alternativa = "C"; break;
                case 41: alternativa = "A"; break;
                case 42: alternativa = "E"; break;
                case 43: alternativa = "B"; break;
                case 44: alternativa = "E"; break;
                case 45: alternativa = "E"; break;
            }
        }



        if(materia.equals(CIENCIAS_HUMANAS)){
            switch (indice){

                case 1: alternativa = "B"; break;
                case 2: alternativa = "C"; break;
                case 3: alternativa = "B"; break;
                case 4: alternativa = "C"; break;
                case 5: alternativa = "C"; break;
                case 6: alternativa = "A"; break;
                case 7: alternativa = "D"; break;
                case 8: alternativa = "C"; break;
                case 9: alternativa = "C"; break;
                case 10: alternativa = "B"; break;
                case 11: alternativa = "E"; break;
                case 12: alternativa = "D"; break;
                case 13: alternativa = "D"; break;
                case 14: alternativa = "B"; break;
                case 15: alternativa = "E"; break;
                case 16: alternativa = "E"; break;
                case 17: alternativa = "A"; break;
                case 18: alternativa = "D"; break;
                case 19: alternativa = "B"; break;
                case 20: alternativa = "D"; break;
                case 21: alternativa = "C"; break;
                case 22: alternativa = "E"; break;
                case 23: alternativa = "C"; break;
                case 24: alternativa = "C"; break;
                case 25: alternativa = "B"; break;
                case 26: alternativa = "B"; break;
                case 27: alternativa = "E"; break;
                case 28: alternativa = "C"; break;
                case 29: alternativa = "A"; break;
                case 30: alternativa = "E"; break;
                case 31: alternativa = "E"; break;
                case 32: alternativa = "D"; break;
                case 33: alternativa = "D"; break;
                case 34: alternativa = "A"; break;
                case 35: alternativa = "D"; break;
                case 36: alternativa = "C"; break;
                case 37: alternativa = "D"; break;
                case 38: alternativa = "D"; break;
                case 39: alternativa = "A"; break;
                case 40: alternativa = "C"; break;
                case 41: alternativa = "A"; break;
                case 42: alternativa = "A"; break;
                case 43: alternativa = "D"; break;
                case 44: alternativa = "B"; break;
                case 45: alternativa = "A"; break;

            }
        }

        return alternativa;
    }

}