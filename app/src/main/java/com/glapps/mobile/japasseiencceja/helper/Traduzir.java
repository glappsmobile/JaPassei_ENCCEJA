package com.glapps.mobile.japasseiencceja.helper;

public class Traduzir {
    String f29b;
    String bold;
    Boolean boo_resolucao;
    String ebold;
    String esu;
    String esunder;
    String eunder;
    Boolean isMath;
    String[] letras;
    String[] letrasMaiusculas;
    String[] numeros;
    String f30p;
    String space;
    String su;
    String sunder;
    String under;
    int f31y;


    public Traduzir(Boolean math, Boolean resolucao) {

        this.numeros = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        this.f31y = 0;
        this.letras = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "u", "t", "w", "y", "v", "\u03bb", "x", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "@", "\u00e9", ","};
        this.letrasMaiusculas = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z"};

        this.f30p = "<br><br>";
        this.f29b = "<br>";
        this.bold = "<b>";
        this.under = "<u>";
        this.ebold = "</b>";
        this.eunder = "</u>";
        this.space = "&nbsp;&nbsp;";
        this.su = "<sup>";
        this.esu = "</sup>";
        this.isMath = Boolean.valueOf(false);
        this.boo_resolucao = Boolean.valueOf(false);
        this.sunder = this.ebold + this.under;
        this.esunder = this.eunder + this.bold;
        this.isMath = math;
        this.boo_resolucao = resolucao;
    }

    public String enunciado(String string) {
        int j;

        string = string.replaceAll("@1@1", "@2");


        string = string
                .replaceAll("@x1", "x@_1_@")
                .replaceAll("@x2", "x@_2_@")
                .replaceAll("@X2", "X@_2_@")
                .replaceAll("@y1", "y@_1_@")
                .replaceAll("@y2", "y@_2_@")
                .replaceAll("km2", "km@sp2sp@")
                .replaceAll("cm2", "cm@sp2sp@")
                .replaceAll("cm3", "cm@sp3sp@")
                .replaceAll("m2", "m@sp2sp@")
                .replaceAll("d2", "d@sp2sp@")
                .replaceAll("m3", "m@sp3sp@")
                .replaceAll("m/s2", "m/s@sp2sp@")
                .replaceAll("(OH)2", "(OH)@_2_@")
                .replaceAll("H2O", "H@_2_@O")
                .replaceAll("M2+", "M@sp2+sp@")
                .replaceAll("Cd2+", "Cd@sp2+sp@")
                .replaceAll("Ni2+", "Ni@sp2+sp@")
                .replaceAll("O2+", "O@sp2+sp@")
                .replaceAll("O2", "O@_2_@")
                .replaceAll("o2", "O@_2_@")
                .replaceAll("O3", "O@_3_@")
                .replaceAll("O4", "O@_4_@")
                .replaceAll("Ca2\\+", "Ca@sp2+sp@")
                .replaceAll("Cu2\\+", "Cu@sp2+sp@")
                .replaceAll("Cu\\+", "Cu@sp+sp@")
                .replaceAll("Fe2\\+", "Fe@sp2+sp@")
                .replaceAll("Fe3\\+", "Fe@sp3+sp@")
                .replaceAll("Cu2", "Cu@sp2sp@")
                .replaceAll("Ca2", "Ca@sp2sp@")
                .replaceAll("Na2", "Ca@_2_@")
                .replaceAll("x2", "x@sp2sp@")
                .replaceAll("x2", "x@sp2sp@")
                .replaceAll("x2", "x@sp2sp@")
                .replaceAll("x2", "x@sp2sp@")
                .replaceAll("X2", "X@sp2sp@")
                .replaceAll("_i2", "CATCHORRO")
                .replaceAll("i2", "i@sp2sp@")
                .replaceAll("CATCHORRO", "_i2")
                .replaceAll("x3", "x@sp3sp@")
                .replaceAll("y2", "y@sp2sp@")
                .replaceAll("a2", "a@sp2sp@")
                .replaceAll("a3", "a@sp3sp@")
                .replaceAll("y3", "y@sp3sp@")
                .replaceAll("b2", "b@sp2sp@")
                .replaceAll("b3", "b@sp3sp@");
        string = string.replaceAll("@_", "<small><sub>");
        string = string.replaceAll("_@", "</small></sub>");
        string = string.replaceAll("@sp-sp@", "<sup>--</sup>");
        string = string.replaceAll("@sp", "<small><sup>");
        string = string.replaceAll("sp@", "</small></sup>");
        string = string.replaceAll("sp@", "</small></sup>");
        string = string.replaceAll("raizd1", "<img src='raiz1'>");
        string = string.replaceAll("raizd2", "<img src='raiz2'>");
        string = string.replaceAll("raizd3", "<img src='raiz3'>");
        string = string.replaceAll("raizd5", "<img src='raiz5'>");
        string = string.replaceAll("raizd6", "<img src='raiz6'>");
        string = string.replaceAll("raizd7", "<img src='raiz7'>");
        string = string.replaceAll("raizd8", "<img src='raiz8'>");
        string = string.replaceAll("raizd9", "<img src='raiz9'>");
        string = string.replaceAll("raizd_10", "<img src='raiz10'>");
        string = string.replaceAll("raizd_18", "<img src='raiz18'>");
        string = string.replaceAll("raizd_40", "<img src='raizd40'>");
        string = string.replaceAll(" v10 ", " <img src='raiz10'> " );
        string = string.replaceAll(" v1 ", " <img src='raiz1'> " );
        string = string.replaceAll(" v2 ", " <img src='raiz2'> " );
        string = string.replaceAll(" v3 ", " <img src='raiz3'> " );
        string = string.replaceAll(" v5 ", " <img src='raiz5'> " );
        string = string.replaceAll(" v6 ", " <img src='raiz6'> " );
        string = string.replaceAll(" v7 ", " <img src='raiz7'> " );
        string = string.replaceAll(" v8 ", " <img src='raiz8'> " );
        string = string.replaceAll(" v9 ", " <img src='raiz9'> " );

        string = string.replaceAll(" v1\\.", " <img src='raiz1'>\\." );
        string = string.replaceAll(" v2\\.", " <img src='raiz2'>\\." );
        string = string.replaceAll(" v3\\.", " <img src='raiz3'>\\." );
        string = string.replaceAll(" v5\\.", " <img src='raiz5'>\\." );
        string = string.replaceAll(" v6\\.", " <img src='raiz6'>\\." );
        string = string.replaceAll(" v7\\.", " <img src='raiz7'>\\." );
        string = string.replaceAll(" v8\\.", " <img src='raiz8'>\\." );
        string = string.replaceAll(" v9\\.", " <img src='raiz9'>\\." );

        string = string.replaceAll("@longarrowbaixo", "<img src='longarrowbaixo'>");
        string = string.replaceAll("->", "<img src='longarrowbaixo'>");
        string = string.replaceAll("@longarrow", "<img src='longarrow'>");
        string = string.replaceAll("@vectorf", "<img src='vectorf'>");
        string = string.replaceAll("@img ", "<img src='");
        string = string.replaceAll(" img@", "'>");
        string = string.replaceAll("@pi", "π");

        string = string.replaceAll("@cimg ", "<img src='");
        string = string.replaceAll(" cimg@", "'> </center>");
        string = string.replaceAll("cp@", "</small>@2");
        string = string.replaceAll("@cp", "@2<small>");
        string = string.replaceAll("@ttl", "<b><center>");
        string = string.replaceAll("ttl@", "</center></b>@2");
        string = string.replaceAll("---", "—");
        string = string.replaceAll("--", "–");
        string = string.replaceAll("--", "–");
        string = string.replaceAll("TEXTO II", "@b TEXTO II b@");
        string = string.replaceAll("Texto II", "@b TEXTO II b@");
        string = string.replaceAll("TEXTO I", "@b TEXTO I b@");
        string = string.replaceAll("Texto I", "@b TEXTO I b@");

        string = string.replaceAll("%%%%", "%");
        string = string.replaceAll("%%%", "%");
        string = string.replaceAll("%%", "%");

        return string.replaceAll("@1", "<br/>").replaceAll("@2", "<br/><br/>").replaceAll("@3", this.space + this.space).replaceAll("@tr", "<u><b>").replaceAll("tr@", "</u></b>").replaceAll("@rt", "<u><b>").replaceAll("rt@", "</u></b>").replaceAll("@i", "<i>").replaceAll("i@", "</i>").replaceAll("@b", "<b>").replaceAll("b@", "</b>").replaceAll("@s", "<sup>").replaceAll("s@", "</sup>").replaceAll("b2", "@q b^2 q@").replaceAll("@qs", "\\\\( \\\\small \\\\mathbf {").replaceAll("@qb", "\\\\( \\\\large \\\\mathbf {").replaceAll("@q", "\\\\( \\\\mathbf {").replaceAll("q@", "}\\\\)").replaceAll("@d", "<sub>").replaceAll("d@", "</sub>").replaceAll("@u", "<u>").replaceAll("u@", "</u>").replaceAll("@eq", "=").replaceAll("@e", "\\\\: e \\\\:").replaceAll("sinalDeIgual", "=");
}
    public String TraduzirLight(String enun){
        String azas = enun;

        //  String first = string.substring(string.length()-2, string.length()-1);
        // String last = string.substring(0, 1);
        //  int indexInte = string.indexOf('?');

        try {
            if ((enun.lastIndexOf("<br/>")-1) >= 0) {
                String lastLine = enun.substring(enun.lastIndexOf("<br/>")-1);
                String primeiraLetra = lastLine.substring(0, 1);
                if (primeiraLetra.equals(">")){

                }else{
                    //Log.i("Traduzir", "ESCOLHIDO: " + lastLine);
                    String resto = enun.substring(0, enun.lastIndexOf("<br/>"));
                    lastLine = enun.substring(enun.lastIndexOf("<br/>"));
                    azas = resto+"<br/>"+lastLine;
                }
                //x = x.substring(0, 4) + "." + x.substring(4, x.length());
                //Log.i("Traduzir", "primeiraPalavra: " + primeiraLetra);

            }
        }catch (Exception e){
            //Log.i("Traduzir", "ERRO: " + e.getMessage());
        }
  /*      String arr[] = string.split(" ", 2);
        String firstWord = arr[0];

        if (first.equals("O") && indexInte >= 0 ) string = string.replaceAll("O ", "@1O ");
        if (first.equals("A") && indexInte >= 0 ) string = string.replaceAll("A ", "@1A ");
        if (firstWord.equals("A") && lastWord.equals("é")) string = string.replaceAll("A ", "@1A ");
        if (first.equals("O") && last.equals("é")) string = string.replaceAll("O ", "@1O ");*/

        //   //Log.i("Traduzir", "First: "+firstWord);


        return azas;
    }

}
