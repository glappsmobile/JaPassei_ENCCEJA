package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.leitor.LeitorSegundo;
import com.glapps.mobile.japasseiencceja.objects.ProvaObjeto;


public class Prova2010 {

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
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String D = "D";
    private static final String E = "E";
    String[] gabch = {
            A/*1*/,B/*2*/,A/*3*/,B/*4*/,D/*5*/,A/*6*/,C/*7*/,B/*8*/,A/*9*/,E/*10*/,B/*11*/,C/*12*/,C/*13*/,C/*14*/,B/*15*/,E/*16*/,A/*17*/,B/*18*/,C/*19*/,C/*20*/,A/*21*/,D/*22*/,B/*23*/,B/*24*/,C/*25*/,C/*26*/,D/*27*/,E/*28*/,C/*29*/,E/*30*/,E/*31*/,D/*32*/,B/*33*/,E/*34*/,D/*35*/,B/*36*/,A/*37*/,E/*38*/,A/*39*/,E/*40*/,D/*41*/,E/*42*/,C/*43*/,D/*44*/,D/*45*/,
    };

    String[] gabcn = {
            B/*46*/,A/*47*/,C/*48*/,E/*49*/,A/*50*/,D/*51*/,C/*52*/,A/*53*/,E/*54*/,C/*55*/,A/*56*/,B/*57*/,D/*58*/,D/*59*/,A/*60*/,C/*61*/,B/*62*/,A/*63*/,B/*64*/,E/*65*/,B/*66*/,D/*67*/,E/*68*/,D/*69*/,A/*70*/,E/*71*/,E/*72*/,C/*73*/,D/*74*/,B/*75*/,C/*76*/,D/*77*/,B/*78*/,D/*79*/,E/*80*/,E/*81*/,A/*82*/,B/*83*/,D/*84*/,A/*85*/,C/*86*/,E/*87*/,D/*88*/,D/*89*/,C/*90*/,
    };

    String[] gabin = {
        E,A,D,C,D
    };

    String[] gaben = {
        E,D,D,D,A
    };

    String[] gablc = {
            C/*91*/,E/*92*/,E/*93*/,C/*94*/,C/*95*/,A/*96*/,E/*97*/,D/*98*/,E/*99*/,D/*100*/,D/*101*/,B/*102*/,B/*103*/,A/*104*/,C/*105*/,C/*106*/,C/*107*/,E/*108*/,B/*109*/,B/*110*/,E/*111*/,B/*112*/,D/*113*/,A/*114*/,A/*115*/,C/*116*/,D/*117*/,B/*118*/,C/*119*/,D/*120*/,E/*121*/,D/*122*/,A/*123*/,D/*124*/,D/*125*/,A/*126*/,B/*127*/,A/*128*/,D/*129*/,A/*130*/,
    };

    private static final String PRIMEIRO_DIA = "1º Dia";
    private static final String SEGUNDO_DIA = "2º Dia";
    String[] gabmt = {
            C/*131*/,E/*132*/,E/*133*/,B/*134*/,B/*135*/,D/*136*/,A/*137*/,C/*138*/,C/*139*/,A/*140*/,B/*141*/,D/*142*/,E/*143*/,B/*144*/,B/*145*/,A/*146*/,B/*147*/,D/*148*/,C/*149*/,C/*150*/,A/*151*/,D/*152*/,A/*153*/,E/*154*/,C/*155*/,E/*156*/,D/*157*/,E/*158*/,B/*159*/,D/*160*/,C/*161*/,B/*162*/,B/*163*/,D/*164*/,B/*165*/,B/*166*/,C/*167*/,B/*168*/,D/*169*/,E/*170*/,B/*171*/,E/*172*/,D/*173*/,D/*174*/,E/*175*/,
    };

    public Prova2010(Context contexto, Simulado simulado) {
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

        prova = leitor.modo2(indice, materia, "2010", simulado);

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
        }else if(materia.equals(PRIMEIRO_DIA)){
            countQuestao =
                    getCountQuestao(CIENCIAS_DA_NATUREZA, tipo)+
                            getCountQuestao(CIENCIAS_HUMANAS, tipo);

        }else if (materia.equals(SEGUNDO_DIA)){
            countQuestao =
                    getCountQuestao(LINGUAGENS_CÓDIGOS, tipo)+
                            getCountQuestao(CHAVE_MATEMATICA, tipo);
        }

        return countQuestao;
    }

    public String gabarito(String received_materia, int indice) {


        String materia = received_materia;
        if (materia.equals(PRIMEIRO_DIA)) {
            if (indice <= 45) {
                materia = CIENCIAS_HUMANAS;
            } else if (indice <= 90) {
                materia = CIENCIAS_DA_NATUREZA;
            }
            } else if (materia.equals(SEGUNDO_DIA)) {
                if (indice <= 45) {
                    materia = LINGUAGENS_CÓDIGOS;
                } else if (indice <= 90) {
                    materia = CHAVE_MATEMATICA;
                }
            }

        String alternativa = "NULO";
        //Log.i("GABARITO", "MATERIA = "+materia);
        //Log.i("GABARITO", "INDICE = "+indice);




        int indice_atual = indice-1;

        if (indice_atual > 44){
            indice_atual -= 44;
        }

        if (materia.equals(LINGUAGENS_CÓDIGOS)){
            if (indice_atual > 39) {
                indice_atual = 39;

            }
        }

        if (indice_atual > 44){
            indice_atual -= 44;
        }
        switch (materia) {

            case LINGUAGENS_CÓDIGOS:
                alternativa = gablc[indice_atual];
                break;
            case CHAVE_MATEMATICA:
                alternativa = gabmt[indice_atual];
                break;
            case CIENCIAS_DA_NATUREZA:
                alternativa = gabcn[indice_atual];
                break;
            case CIENCIAS_HUMANAS:
                alternativa = gabch[indice_atual];
                break;
            case INGLES:
                alternativa = gabin[indice_atual];
                break;
            case ESPANHOL:
                alternativa = gaben[indice_atual];
                break;
        }

        //Log.i("GABARITO", "ANO = 2015");
        //Log.i("GABARITO", "ALTERNATIVA = "+alternativa);
        return alternativa;
    }


}