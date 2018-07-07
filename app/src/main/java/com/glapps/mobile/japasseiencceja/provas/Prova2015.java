package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2015 {





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
    String texto;

    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS  = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    String[] materias = {
            LINGUAGENS_CÓDIGOS,
            CHAVE_MATEMATICA,
            CIENCIAS_HUMANAS,
            CIENCIAS_DA_NATUREZA,
    };
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String D = "D";
    private static final String E = "E";

    String[] gabcn = {
            A,B,B,D,B,A,B,C,B,A,
            B,C,A,B,B,A,B,C,A,D,
            B,D,C,D,C,A,C,A,B,C,
    };

    String[] gabch = {
            D,B,C,B,A,C,B,D,A,D,
            C,B,A,B,D,C,B,C,D,A,
            C,B,B,D,C,B,A,B,C,B,
    };

    String[] gablc = {
            C,D,B,C,A,A,C,C,A,A,
            D,C,D,C,B,C,A,A,D,B,
            D,B,A,B,B,A,A,C,C,D,
    };

    String[] gabmt = {
            C,D,C,D,A,D,B,D,A,C,
            D,A,B,D,C,B,A,D,A,D,
            A,B,D,C,A,C,A,B,D,B,
    };

    // SIMULADO 2 - ENSINO MÉDIO

    public Prova2015(Context contexto, Simulado simulado) {
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

        if (materia.equals(LINGUAGENS_CÓDIGOS)) {

            switch (indice) {

                    case 1:

                        texto = "@b A vez das bicicletas b@ @1 "+
                                "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                                "para viver mais e melhor! @2"+
                                "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                                "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                                "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                                "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                                "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                                "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                                "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                                "@b Vá de bike! b@ @2 "+
                                "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                                "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                                "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                                "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                                "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                                "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                                "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                                "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                                "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                                "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                                "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                                "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                                "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                                "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                                "[...] "+
                                "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                                sourceString = texto+"Qual é o trecho que apresenta uma relação de causa e consequência? ";
                    qA = "“Já na França, há impressionantes 700 km de pistas.”. ";
                    qB = "“Os municípios brasileiros caminham para esse ‘sonho ecológico’,...”. ";
                    qC = "“... pois pedalar resulta na queima de calorias,...”. ";
                    qD = "“... a capital paulista, por exemplo, possui cerca de 40 km de ciclovias.”. ";
                    resolucao = ""; break;
                case 2:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"No trecho “... endossa o engenheiro civil Fernando Westphal, de São Paulo.”, a palavra destacada tem "+
                            "o sentido de ";
                    qA = "analisa. ";
                    qB = "critica. ";
                    qC = "informa. ";
                    qD = "reforça. ";
                    resolucao = ""; break;
                case 3:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"Nesse texto, o “‘sonho ecológico’” mencionado refere-se ";
                    qA = "à extensão das pistas para ciclistas existentes em países da Europa. ";
                    qB = "à substituição de veículos automotores por bicicletas como meio de transporte. ";
                    qC = "ao incentivo ao ato de pedalar como forma de melhorar a saúde dos cidadãos. ";
                    qD = "ao índice de investimentos e à segurança para os ciclistas no Brasil. ";
                    resolucao = ""; break;
                case 4:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"O principal objetivo comunicativo desse texto é ";
                    qA = "alertar. ";
                    qB = "convencer. ";
                    qC = "informar. ";
                    qD = "orientar. ";
                    resolucao = ""; break;
                case 5:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"Qual é o fragmento desse texto em que a palavra destacada foi utilizada em sentido figurado? ";
                    qA = "“... além de driblar o trânsito,...”. ";
                    qB = "“Bicicletas como meio de transporte!”. ";
                    qC = "“... fica espantado com a quantidade de bikes...”. ";
                    qD = "... mas já é um avanço bastante significativo.”. ";
                    resolucao = ""; break;
                case 6:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"No trecho “Sem contar que reduz os congestionamentos...”, a expressão destacada introduz ideia de ";
                    qA = "acréscimo. ";
                    qB = "comparação. ";
                    qC = "condição. ";
                    qD = "contrariedade. ";
                    resolucao = ""; break;
                case 7:

                    texto = "@b A vez das bicicletas b@ @1 "+
                            "Elas são baratas, saudáveis e, além de driblar o trânsito, não poluem o meio ambiente. Pedale "+
                            "para viver mais e melhor! @2"+
                            "Você sabe o que Amsterdã tem em comum com Buenos Aires e Paris? Bicicletas como meio "+
                            "de transporte! Existem 550 mil magrelas em circulação na capital holandesa e 90% das ruas já "+
                            "têm áreas específicas para elas. A estimativa na cidade argentina é de criar pelo menos 100 km "+
                            "de ciclovias até dezembro deste ano. Já na França, há impressionantes 700 km de pistas. Quem "+
                            "anda por lá fica espantado com a quantidade de bikes circulando; as pessoas as utilizam para ir "+
                            "ao trabalho, escola ou, simplesmente, passear. Os municípios brasileiros caminham para esse "+
                            "“sonho ecológico”, mas ainda é preciso mais investimentos e segurança para os ciclistas.@2"+
                            "@b Vá de bike! b@ @2 "+
                            "O transporte em duas rodas é vantajoso para todos, pois pedalar resulta na queima de calorias, "+
                            "tonifica os músculos e melhora o desempenho do sistema cardiovascular de quem pratica. Sem "+
                            "contar que reduz os congestionamentos e não emite poluentes na atmosfera.@1"+
                            "Para se ter ideia, em São Paulo, cerca de 4 mil pessoas morrem todos os anos por problemas "+
                            "do coração e respiratórios. Vale dizer que a fumaça dos escapamentos responde por praticamente "+
                            "70% desses óbitos. E tem mais: segundo o médico Paulo Saldiva, coordenador do Laboratório "+
                            "de Poluição da Universidade de São Paulo (USP), uma criança exposta a toda essa sujeira tem "+
                            "quatro vezes mais chances de desenvolver doenças pulmonares. “Perde-se, em média, US$ 1,5 "+
                            "bilhão por internações, redução de expectativa de vida e mortes causadas pela poluição”. A boa "+
                            "notícia é que os governantes brasileiros decidiram apostar nessa alternativa ecológica; a capital "+
                            "paulista, por exemplo, possui cerca de 40 km de ciclovias. É pouco perto dos 140 km de faixas "+
                            "exclusivas do Rio de Janeiro e dos 100 km de Curitiba, mas já é um avanço bastante significativo.@1"+
                            "“Uma das principais formas de reduzir os congestionamentos sem dúvidas é investir em meios "+
                            "alternativos, como as ciclovias”, endossa o engenheiro civil Fernando Westphal, de São Paulo.@1"+
                            "[...] "+
                            "@2<small>GALLO, Rodrigo. Disponível em:http://revistavidanatural.uol.com.br/saude-alimentos/53/a-vez-das-bicicletas-elas-sao-baratas-saudaveis-e-22838-1.asp. Acesso em: 17 set. 211. Fragmento.</small> @2 ";


                    sourceString = texto+"No trecho “... e não emite poluentes na atmosfera.”, a expressão destacada poderia ser substituída, sem "+
                            "alteração de sentido, por ";
                    qA = "contudo. ";
                    qB = "logo. ";
                    qC = "nem. ";
                    qD = "ou. ";
                    resolucao = ""; break;

                case 8:
                    texto = "@cimg lc520081 cimg@ @2";
                    sourceString = texto+"O humor desse texto está centrado ";
                    qA = "na expressão de surpresa da esposa. ";
                    qB = "na fala do marido no primeiro quadrinho. ";
                    qC = "no duplo sentido da palavra “sonho”. ";
                    qD = "no local onde a casa foi construída. ";
                    resolucao = ""; break;

                case 9:
                    texto = "@b A história dos doces b@ @1 "+
                            "Confira um inventário sobre os doces do mundo contado pela jornalista Lucrecia Zappi.@2"+
                            "Por que escreveu um livro com a temática doces, como o Mil-folhas? @1"+
                            "A ideia surgiu de uma matéria que fiz para a Folhinha (suplemento infantil do jornal Folha de "+
                            "S. Paulo). Estávamos no mês de julho, portanto férias de inverno para a garotada. Tinha que ser "+
                            "algo que tivesse um sabor doce. O livro foi uma retomada do assunto, porém captando com mais "+
                            "profundidade os signos das diversas civilizações e culturas por meio do açúcar. [...] @2"+
                            "Pode me contar alguma curiosidade que ocorreu durante sua pesquisa ou até algo diferente e "+
                            "novo sobre doces? @1"+
                            "Quando comecei o livro, estava voltada para os doces tradicionais brasileiros e os das doceiras "+
                            "italianas de São Paulo: meu interesse tinha um contexto autobiográfico (risos). No desdobramento "+
                            "da pesquisa, no entanto, os doces não apenas passaram a remeter a outros doces, como "+
                            "também a outras épocas, como o bolo mil-folhas em si, que teve como musa de inspiração o "+
                            "Baclavá, dos Otomanos, que por sua vez foi baseado no Phyllo, dos gregos. Comecei a buscar "+
                            "estas referências, com as terminologias e ingredientes que testemunhavam matizes das diversas "+
                            "mesas pelo mundo. [...]@2 "+
                            "Qual a importância do doce na cultura dos brasileiros? O que ele mudou em nossa vida? @1"+
                            "O doce na cultura brasileira não é uma nota isolada na história, o ídolo distante das mesas "+
                            "brasileiras, dos tempos da casa grande e das casas de engenho. Ao contrário. Tornou-se o gosto "+
                            "pungente do nosso paladar. Gosto de acreditar que o docinho é uma extensão da nossa acolhida "+
                            "calorosa, de rodear o fogão, de encostar na cozinha, até porque não existe conversa enxuta com, "+
                            "por exemplo, um prato de brigadeiro para matar na colherinha!@2 "+
                            "E para o restante do mundo? @1"+
                            "O mundo também ficou mais doce, o que contribuiu para a obesidade e mais doenças, Brasil "+
                            "incluído. Quando se consome doce hoje em dia, especialmente entre os adultos, escapa-se da "+
                            "esfera do imaginário e do prazer para se falar em remorso e frustração. Comer doce tornou-se um "+
                            "dilema. Oscila entre um caminho para a inspiração e uma droga perigosa difícil de dosar.@2"+
                            "O que você aprendeu com o livro Mil-folhas? @1"+
                            "Que um doce, por mais simples que pareça, é sempre uma história inacabada. Mesmo que "+
                            "eu não consiga explicar sua origem e seu destino, desde que passei pelo Mil-folhas, não resisto.@1"+
                            "Farejo aproximações, até porque o doce é um caso universalizante.@1"+
                            "@1<small>MENEZES, Ligia. Disponível em: http://mdemulher.abril.com.br/culinaria/be-a-ba-da-cozinha/historia-doces-637927. shtml?origem=vidasimples. Acesso em: 10 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"Esse texto é um exemplo de ";
                    qA = "entrevista. ";
                    qB = "notícia. ";
                    qC = "reportagem. ";
                    qD = "resenha. ";
                    resolucao = ""; break;
                case 10:

                    texto = "@b A história dos doces b@ @1 "+
                            "Confira um inventário sobre os doces do mundo contado pela jornalista Lucrecia Zappi.@2"+
                            "Por que escreveu um livro com a temática doces, como o Mil-folhas? @1"+
                            "A ideia surgiu de uma matéria que fiz para a Folhinha (suplemento infantil do jornal Folha de "+
                            "S. Paulo). Estávamos no mês de julho, portanto férias de inverno para a garotada. Tinha que ser "+
                            "algo que tivesse um sabor doce. O livro foi uma retomada do assunto, porém captando com mais "+
                            "profundidade os signos das diversas civilizações e culturas por meio do açúcar. [...] @2"+
                            "Pode me contar alguma curiosidade que ocorreu durante sua pesquisa ou até algo diferente e "+
                            "novo sobre doces? @1"+
                            "Quando comecei o livro, estava voltada para os doces tradicionais brasileiros e os das doceiras "+
                            "italianas de São Paulo: meu interesse tinha um contexto autobiográfico (risos). No desdobramento "+
                            "da pesquisa, no entanto, os doces não apenas passaram a remeter a outros doces, como "+
                            "também a outras épocas, como o bolo mil-folhas em si, que teve como musa de inspiração o "+
                            "Baclavá, dos Otomanos, que por sua vez foi baseado no Phyllo, dos gregos. Comecei a buscar "+
                            "estas referências, com as terminologias e ingredientes que testemunhavam matizes das diversas "+
                            "mesas pelo mundo. [...]@2 "+
                            "Qual a importância do doce na cultura dos brasileiros? O que ele mudou em nossa vida? @1"+
                            "O doce na cultura brasileira não é uma nota isolada na história, o ídolo distante das mesas "+
                            "brasileiras, dos tempos da casa grande e das casas de engenho. Ao contrário. Tornou-se o gosto "+
                            "pungente do nosso paladar. Gosto de acreditar que o docinho é uma extensão da nossa acolhida "+
                            "calorosa, de rodear o fogão, de encostar na cozinha, até porque não existe conversa enxuta com, "+
                            "por exemplo, um prato de brigadeiro para matar na colherinha!@2 "+
                            "E para o restante do mundo? @1"+
                            "O mundo também ficou mais doce, o que contribuiu para a obesidade e mais doenças, Brasil "+
                            "incluído. Quando se consome doce hoje em dia, especialmente entre os adultos, escapa-se da "+
                            "esfera do imaginário e do prazer para se falar em remorso e frustração. Comer doce tornou-se um "+
                            "dilema. Oscila entre um caminho para a inspiração e uma droga perigosa difícil de dosar.@2"+
                            "O que você aprendeu com o livro Mil-folhas? @1"+
                            "Que um doce, por mais simples que pareça, é sempre uma história inacabada. Mesmo que "+
                            "eu não consiga explicar sua origem e seu destino, desde que passei pelo Mil-folhas, não resisto.@1"+
                            "Farejo aproximações, até porque o doce é um caso universalizante.@1"+
                            "@1<small>MENEZES, Ligia. Disponível em: http://mdemulher.abril.com.br/culinaria/be-a-ba-da-cozinha/historia-doces-637927. shtml?origem=vidasimples. Acesso em: 10 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"De acordo com esse texto, o consumo de doces ";
                    qA = "aumentou os índices de obesidade e doenças no Brasil e no mundo. ";
                    qB = "criou uma nova cultura em relação à apreciação de receitas. ";
                    qC = "está ligado essencialmente às crianças e jovens. ";
                    qD = "favorece o bom relacionamento entre as pessoas. ";
                    resolucao = ""; break;
                case 11:

                    texto = "@b A história dos doces b@ @1 "+
                            "Confira um inventário sobre os doces do mundo contado pela jornalista Lucrecia Zappi.@2"+
                            "Por que escreveu um livro com a temática doces, como o Mil-folhas? @1"+
                            "A ideia surgiu de uma matéria que fiz para a Folhinha (suplemento infantil do jornal Folha de "+
                            "S. Paulo). Estávamos no mês de julho, portanto férias de inverno para a garotada. Tinha que ser "+
                            "algo que tivesse um sabor doce. O livro foi uma retomada do assunto, porém captando com mais "+
                            "profundidade os signos das diversas civilizações e culturas por meio do açúcar. [...] @2"+
                            "Pode me contar alguma curiosidade que ocorreu durante sua pesquisa ou até algo diferente e "+
                            "novo sobre doces? @1"+
                            "Quando comecei o livro, estava voltada para os doces tradicionais brasileiros e os das doceiras "+
                            "italianas de São Paulo: meu interesse tinha um contexto autobiográfico (risos). No desdobramento "+
                            "da pesquisa, no entanto, os doces não apenas passaram a remeter a outros doces, como "+
                            "também a outras épocas, como o bolo mil-folhas em si, que teve como musa de inspiração o "+
                            "Baclavá, dos Otomanos, que por sua vez foi baseado no Phyllo, dos gregos. Comecei a buscar "+
                            "estas referências, com as terminologias e ingredientes que testemunhavam matizes das diversas "+
                            "mesas pelo mundo. [...]@2 "+
                            "Qual a importância do doce na cultura dos brasileiros? O que ele mudou em nossa vida? @1"+
                            "O doce na cultura brasileira não é uma nota isolada na história, o ídolo distante das mesas "+
                            "brasileiras, dos tempos da casa grande e das casas de engenho. Ao contrário. Tornou-se o gosto "+
                            "pungente do nosso paladar. Gosto de acreditar que o docinho é uma extensão da nossa acolhida "+
                            "calorosa, de rodear o fogão, de encostar na cozinha, até porque não existe conversa enxuta com, "+
                            "por exemplo, um prato de brigadeiro para matar na colherinha!@2 "+
                            "E para o restante do mundo? @1"+
                            "O mundo também ficou mais doce, o que contribuiu para a obesidade e mais doenças, Brasil "+
                            "incluído. Quando se consome doce hoje em dia, especialmente entre os adultos, escapa-se da "+
                            "esfera do imaginário e do prazer para se falar em remorso e frustração. Comer doce tornou-se um "+
                            "dilema. Oscila entre um caminho para a inspiração e uma droga perigosa difícil de dosar.@2"+
                            "O que você aprendeu com o livro Mil-folhas? @1"+
                            "Que um doce, por mais simples que pareça, é sempre uma história inacabada. Mesmo que "+
                            "eu não consiga explicar sua origem e seu destino, desde que passei pelo Mil-folhas, não resisto.@1"+
                            "Farejo aproximações, até porque o doce é um caso universalizante.@1"+
                            "@1<small>MENEZES, Ligia. Disponível em: http://mdemulher.abril.com.br/culinaria/be-a-ba-da-cozinha/historia-doces-637927. shtml?origem=vidasimples. Acesso em: 10 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"Considerando as resposta da jornalista Lucrecia Zappi, infere-se que ela ";
                    qA = "cozinha muito bem. ";
                    qB = "escreve para crianças. ";
                    qC = "sente frustração. ";
                    qD = "tem origem italiana. ";
                    resolucao = ""; break;
                case 12:

                    texto = "@b A história dos doces b@ @1 "+
                            "Confira um inventário sobre os doces do mundo contado pela jornalista Lucrecia Zappi.@2"+
                            "Por que escreveu um livro com a temática doces, como o Mil-folhas? @1"+
                            "A ideia surgiu de uma matéria que fiz para a Folhinha (suplemento infantil do jornal Folha de "+
                            "S. Paulo). Estávamos no mês de julho, portanto férias de inverno para a garotada. Tinha que ser "+
                            "algo que tivesse um sabor doce. O livro foi uma retomada do assunto, porém captando com mais "+
                            "profundidade os signos das diversas civilizações e culturas por meio do açúcar. [...] @2"+
                            "Pode me contar alguma curiosidade que ocorreu durante sua pesquisa ou até algo diferente e "+
                            "novo sobre doces? @1"+
                            "Quando comecei o livro, estava voltada para os doces tradicionais brasileiros e os das doceiras "+
                            "italianas de São Paulo: meu interesse tinha um contexto autobiográfico (risos). No desdobramento "+
                            "da pesquisa, no entanto, os doces não apenas passaram a remeter a outros doces, como "+
                            "também a outras épocas, como o bolo mil-folhas em si, que teve como musa de inspiração o "+
                            "Baclavá, dos Otomanos, que por sua vez foi baseado no Phyllo, dos gregos. Comecei a buscar "+
                            "estas referências, com as terminologias e ingredientes que testemunhavam matizes das diversas "+
                            "mesas pelo mundo. [...]@2 "+
                            "Qual a importância do doce na cultura dos brasileiros? O que ele mudou em nossa vida? @1"+
                            "O doce na cultura brasileira não é uma nota isolada na história, o ídolo distante das mesas "+
                            "brasileiras, dos tempos da casa grande e das casas de engenho. Ao contrário. Tornou-se o gosto "+
                            "pungente do nosso paladar. Gosto de acreditar que o docinho é uma extensão da nossa acolhida "+
                            "calorosa, de rodear o fogão, de encostar na cozinha, até porque não existe conversa enxuta com, "+
                            "por exemplo, um prato de brigadeiro para matar na colherinha!@2 "+
                            "E para o restante do mundo? @1"+
                            "O mundo também ficou mais doce, o que contribuiu para a obesidade e mais doenças, Brasil "+
                            "incluído. Quando se consome doce hoje em dia, especialmente entre os adultos, escapa-se da "+
                            "esfera do imaginário e do prazer para se falar em remorso e frustração. Comer doce tornou-se um "+
                            "dilema. Oscila entre um caminho para a inspiração e uma droga perigosa difícil de dosar.@2"+
                            "O que você aprendeu com o livro Mil-folhas? @1"+
                            "Que um doce, por mais simples que pareça, é sempre uma história inacabada. Mesmo que "+
                            "eu não consiga explicar sua origem e seu destino, desde que passei pelo Mil-folhas, não resisto.@1"+
                            "Farejo aproximações, até porque o doce é um caso universalizante.@1"+
                            "@1<small>MENEZES, Ligia. Disponível em: http://mdemulher.abril.com.br/culinaria/be-a-ba-da-cozinha/historia-doces-637927. shtml?origem=vidasimples. Acesso em: 10 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"No trecho “... (suplemento infantil do jornal Folha de S. Paulo).”, os parênteses foram empregados para "+
                            "delimitar uma ";
                    qA = "citação. ";
                    qB = "definição. ";
                    qC = "explicação. ";
                    qD = "intensificação. ";
                    resolucao = ""; break;
                case 13:

                    texto = "@b A história dos doces b@ @1 "+
                            "Confira um inventário sobre os doces do mundo contado pela jornalista Lucrecia Zappi.@2"+
                            "Por que escreveu um livro com a temática doces, como o Mil-folhas? @1"+
                            "A ideia surgiu de uma matéria que fiz para a Folhinha (suplemento infantil do jornal Folha de "+
                            "S. Paulo). Estávamos no mês de julho, portanto férias de inverno para a garotada. Tinha que ser "+
                            "algo que tivesse um sabor doce. O livro foi uma retomada do assunto, porém captando com mais "+
                            "profundidade os signos das diversas civilizações e culturas por meio do açúcar. [...] @2"+
                            "Pode me contar alguma curiosidade que ocorreu durante sua pesquisa ou até algo diferente e "+
                            "novo sobre doces? @1"+
                            "Quando comecei o livro, estava voltada para os doces tradicionais brasileiros e os das doceiras "+
                            "italianas de São Paulo: meu interesse tinha um contexto autobiográfico (risos). No desdobramento "+
                            "da pesquisa, no entanto, os doces não apenas passaram a remeter a outros doces, como "+
                            "também a outras épocas, como o bolo mil-folhas em si, que teve como musa de inspiração o "+
                            "Baclavá, dos Otomanos, que por sua vez foi baseado no Phyllo, dos gregos. Comecei a buscar "+
                            "estas referências, com as terminologias e ingredientes que testemunhavam matizes das diversas "+
                            "mesas pelo mundo. [...]@2 "+
                            "Qual a importância do doce na cultura dos brasileiros? O que ele mudou em nossa vida? @1"+
                            "O doce na cultura brasileira não é uma nota isolada na história, o ídolo distante das mesas "+
                            "brasileiras, dos tempos da casa grande e das casas de engenho. Ao contrário. Tornou-se o gosto "+
                            "pungente do nosso paladar. Gosto de acreditar que o docinho é uma extensão da nossa acolhida "+
                            "calorosa, de rodear o fogão, de encostar na cozinha, até porque não existe conversa enxuta com, "+
                            "por exemplo, um prato de brigadeiro para matar na colherinha!@2 "+
                            "E para o restante do mundo? @1"+
                            "O mundo também ficou mais doce, o que contribuiu para a obesidade e mais doenças, Brasil "+
                            "incluído. Quando se consome doce hoje em dia, especialmente entre os adultos, escapa-se da "+
                            "esfera do imaginário e do prazer para se falar em remorso e frustração. Comer doce tornou-se um "+
                            "dilema. Oscila entre um caminho para a inspiração e uma droga perigosa difícil de dosar.@2"+
                            "O que você aprendeu com o livro Mil-folhas? @1"+
                            "Que um doce, por mais simples que pareça, é sempre uma história inacabada. Mesmo que "+
                            "eu não consiga explicar sua origem e seu destino, desde que passei pelo Mil-folhas, não resisto.@1"+
                            "Farejo aproximações, até porque o doce é um caso universalizante.@1"+
                            "@1<small>MENEZES, Ligia. Disponível em: http://mdemulher.abril.com.br/culinaria/be-a-ba-da-cozinha/historia-doces-637927. shtml?origem=vidasimples. Acesso em: 10 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"No trecho “...desde que passei pelo Mil-folhas,...”, a expressão destacada transmite ideia de ";
                    qA = "condição. ";
                    qB = "explicação. ";
                    qC = "oposição. ";
                    qD = "tempo. ";
                    resolucao = ""; break;


                case 14:
                    texto = "@b Cinco caminhos para o bem-estar b@ @1"+
                            "@b Dicas da New Economics Foundation para conquistar uma vida melhor b@ @2"+
                            "@b 1 - Conecte-se b@ @1"+
                            "Estabeleça relações com as "+
                            "pessoas a sua volta. Os "+
                            "relacionamentos são a base da "+
                            "vida diária e investir tempo neles enriquecerá "+
                            "seu dia e garantirá apoio quando precisar. As "+
                            "pesquisas mostram que quem tem menos de "+
                            "três pessoas em sua rede de contatos "+
                            "próxima – entre família e amigos – tem mais "+
                            "chance de desenvolver uma doença mental.@2"+


                            "@b 2 - Seja ativo b@ @1 "+
                            "Caminhe ou corra, ande de "+
                            "bicicleta, pratique um esporte, 2 dance. Os exercícios fazem as "+
                            "pessoas se sentir bem – o importante é cada "+
                            "pessoa achar a atividade que lhe dá prazer e "+
                            "que é adequada a seus limites. Estudos de "+
                            "longo prazo sugerem que a prática de uma "+
                            "atividade física previne o declínio das "+
                            "capacidades mentais e protege contra a "+
                            "ansiedade e a depressão.@2"+

                            "@b 3 - Preste atenção b@ @1"+
                            "Seja curioso, saboreie os "+
                            "momentos da vida e tome "+
                            "consciência de como se sente. "+
                            "Refletir sobre suas experiências ajuda a "+
                            "descobrir o que realmente importa e a "+
                            "garantir que você viva o presente. Uma "+
                            "pesquisa mostrou que pessoas treinadas a "+
                            "prestar atenção em seus sentimentos "+
                            "durante oito a 12 semanas apresentaram "+
                            "melhora no bem-estar por anos.@1"+

                            "@b 4 - Continue aprendendo b@ @1 "+
                            "Tente algo novo, matricule-se "+
                            "em algum curso, faça uma nova 4 tarefa no trabalho. Tente consertar "+
                            "algo em casa. Aprenda a tocar algum "+
                            "instrumento ou a cozinhar. Escolha um "+
                            "desafio que você nunca vai gostar de "+
                            "perseguir. Os estudos sugerem que o "+
                            "bem-estar está ligado a ter metas – desde "+
                            "que elas sejam estabelecidas pelos próprios "+
                            "indivíduos e tenham a ver com seus valores "+
                            "pessoais.@2"+

                            "@b 5 - Doe-se b@ @1 "+
                            "Agradeça a alguém, ajude um "+
                            "amigo ou um estranho. Sorria, 5 faça trabalho voluntário, junte-se "+
                            "à associação do bairro. Olhe para fora, "+
                            "além de olhar para dentro de si. Fazer parte "+
                            "de uma comunidade traz benefícios – entre "+
                            "eles, relações sociais mais significativas. As "+
                            "pesquisas mostram que as pessoas que têm "+
                            "um interesse maior pelo outro tendem a se "+
                            "considerar mais felizes.@1"+
                            "@1<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI236742-15228,00-O+MITO+DA+FELICIDADE.html. Acesso em: "+
                            "4 set. 211.</small> @2";

                    sourceString = texto+"Esse texto é, predominantemente, ";
                    qA = "descritivo. ";
                    qB = "expositivo. ";
                    qC = "injuntivo. ";
                    qD = "narrativo. ";
                    resolucao = ""; break;
                case 15:

                    texto = "@b Cinco caminhos para o bem-estar b@ @1"+
                            "@b Dicas da New Economics Foundation para conquistar uma vida melhor b@ @2"+
                            "@b 1 - Conecte-se b@ @1"+
                            "Estabeleça relações com as "+
                            "pessoas a sua volta. Os "+
                            "relacionamentos são a base da "+
                            "vida diária e investir tempo neles enriquecerá "+
                            "seu dia e garantirá apoio quando precisar. As "+
                            "pesquisas mostram que quem tem menos de "+
                            "três pessoas em sua rede de contatos "+
                            "próxima – entre família e amigos – tem mais "+
                            "chance de desenvolver uma doença mental.@2"+


                            "@b 2 - Seja ativo b@ @1 "+
                            "Caminhe ou corra, ande de "+
                            "bicicleta, pratique um esporte, 2 dance. Os exercícios fazem as "+
                            "pessoas se sentir bem – o importante é cada "+
                            "pessoa achar a atividade que lhe dá prazer e "+
                            "que é adequada a seus limites. Estudos de "+
                            "longo prazo sugerem que a prática de uma "+
                            "atividade física previne o declínio das "+
                            "capacidades mentais e protege contra a "+
                            "ansiedade e a depressão.@2"+

                            "@b 3 - Preste atenção b@ @1"+
                            "Seja curioso, saboreie os "+
                            "momentos da vida e tome "+
                            "consciência de como se sente. "+
                            "Refletir sobre suas experiências ajuda a "+
                            "descobrir o que realmente importa e a "+
                            "garantir que você viva o presente. Uma "+
                            "pesquisa mostrou que pessoas treinadas a "+
                            "prestar atenção em seus sentimentos "+
                            "durante oito a 12 semanas apresentaram "+
                            "melhora no bem-estar por anos.@1"+

                            "@b 4 - Continue aprendendo b@ @1 "+
                            "Tente algo novo, matricule-se "+
                            "em algum curso, faça uma nova 4 tarefa no trabalho. Tente consertar "+
                            "algo em casa. Aprenda a tocar algum "+
                            "instrumento ou a cozinhar. Escolha um "+
                            "desafio que você nunca vai gostar de "+
                            "perseguir. Os estudos sugerem que o "+
                            "bem-estar está ligado a ter metas – desde "+
                            "que elas sejam estabelecidas pelos próprios "+
                            "indivíduos e tenham a ver com seus valores "+
                            "pessoais.@2"+

                            "@b 5 - Doe-se b@ @1 "+
                            "Agradeça a alguém, ajude um "+
                            "amigo ou um estranho. Sorria, 5 faça trabalho voluntário, junte-se "+
                            "à associação do bairro. Olhe para fora, "+
                            "além de olhar para dentro de si. Fazer parte "+
                            "de uma comunidade traz benefícios – entre "+
                            "eles, relações sociais mais significativas. As "+
                            "pesquisas mostram que as pessoas que têm "+
                            "um interesse maior pelo outro tendem a se "+
                            "considerar mais felizes.@1"+
                            "@1<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI236742-15228,00-O+MITO+DA+FELICIDADE.html. Acesso em: "+
                            "4 set. 211.</small> @2";

                    sourceString = texto+"Todas as dicas apresentadas estão fundamentadas em ";
                    qA = "citações de especialistas. ";
                    qB = "dados de pesquisas. ";
                    qC = "informações históricas. ";
                    qD = "relatos pessoais. ";
                    resolucao = ""; break;
                case 16:

                    texto = "@b Cinco caminhos para o bem-estar b@ @1"+
                            "@b Dicas da New Economics Foundation para conquistar uma vida melhor b@ @2"+
                            "@b 1 - Conecte-se b@ @1"+
                            "Estabeleça relações com as "+
                            "pessoas a sua volta. Os "+
                            "relacionamentos são a base da "+
                            "vida diária e investir tempo neles enriquecerá "+
                            "seu dia e garantirá apoio quando precisar. As "+
                            "pesquisas mostram que quem tem menos de "+
                            "três pessoas em sua rede de contatos "+
                            "próxima – entre família e amigos – tem mais "+
                            "chance de desenvolver uma doença mental.@2"+


                            "@b 2 - Seja ativo b@ @1 "+
                            "Caminhe ou corra, ande de "+
                            "bicicleta, pratique um esporte, 2 dance. Os exercícios fazem as "+
                            "pessoas se sentir bem – o importante é cada "+
                            "pessoa achar a atividade que lhe dá prazer e "+
                            "que é adequada a seus limites. Estudos de "+
                            "longo prazo sugerem que a prática de uma "+
                            "atividade física previne o declínio das "+
                            "capacidades mentais e protege contra a "+
                            "ansiedade e a depressão.@2"+

                            "@b 3 - Preste atenção b@ @1"+
                            "Seja curioso, saboreie os "+
                            "momentos da vida e tome "+
                            "consciência de como se sente. "+
                            "Refletir sobre suas experiências ajuda a "+
                            "descobrir o que realmente importa e a "+
                            "garantir que você viva o presente. Uma "+
                            "pesquisa mostrou que pessoas treinadas a "+
                            "prestar atenção em seus sentimentos "+
                            "durante oito a 12 semanas apresentaram "+
                            "melhora no bem-estar por anos.@1"+

                            "@b 4 - Continue aprendendo b@ @1 "+
                            "Tente algo novo, matricule-se "+
                            "em algum curso, faça uma nova 4 tarefa no trabalho. Tente consertar "+
                            "algo em casa. Aprenda a tocar algum "+
                            "instrumento ou a cozinhar. Escolha um "+
                            "desafio que você nunca vai gostar de "+
                            "perseguir. Os estudos sugerem que o "+
                            "bem-estar está ligado a ter metas – desde "+
                            "que elas sejam estabelecidas pelos próprios "+
                            "indivíduos e tenham a ver com seus valores "+
                            "pessoais.@2"+

                            "@b 5 - Doe-se b@ @1 "+
                            "Agradeça a alguém, ajude um "+
                            "amigo ou um estranho. Sorria, 5 faça trabalho voluntário, junte-se "+
                            "à associação do bairro. Olhe para fora, "+
                            "além de olhar para dentro de si. Fazer parte "+
                            "de uma comunidade traz benefícios – entre "+
                            "eles, relações sociais mais significativas. As "+
                            "pesquisas mostram que as pessoas que têm "+
                            "um interesse maior pelo outro tendem a se "+
                            "considerar mais felizes.@1"+
                            "@1<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI236742-15228,00-O+MITO+DA+FELICIDADE.html. Acesso em: "+
                            "4 set. 211.</small> @2";

                    sourceString = texto+"No item 5, afirma-se que a preocupação com o outro ";
                    qA = "conectará você ao trabalho voluntário. ";
                    qB = "fará você agradecer a alguém. ";
                    qC = "poderá gerar maior felicidade. ";
                    qD = "trará benefícios individuais. ";
                    resolucao = ""; break;
                case 17:

                    texto = "@b Cinco caminhos para o bem-estar b@ @1"+
                            "@b Dicas da New Economics Foundation para conquistar uma vida melhor b@ @2"+
                            "@b 1 - Conecte-se b@ @1"+
                            "Estabeleça relações com as "+
                            "pessoas a sua volta. Os "+
                            "relacionamentos são a base da "+
                            "vida diária e investir tempo neles enriquecerá "+
                            "seu dia e garantirá apoio quando precisar. As "+
                            "pesquisas mostram que quem tem menos de "+
                            "três pessoas em sua rede de contatos "+
                            "próxima – entre família e amigos – tem mais "+
                            "chance de desenvolver uma doença mental.@2"+


                            "@b 2 - Seja ativo b@ @1 "+
                            "Caminhe ou corra, ande de "+
                            "bicicleta, pratique um esporte, 2 dance. Os exercícios fazem as "+
                            "pessoas se sentir bem – o importante é cada "+
                            "pessoa achar a atividade que lhe dá prazer e "+
                            "que é adequada a seus limites. Estudos de "+
                            "longo prazo sugerem que a prática de uma "+
                            "atividade física previne o declínio das "+
                            "capacidades mentais e protege contra a "+
                            "ansiedade e a depressão.@2"+

                            "@b 3 - Preste atenção b@ @1"+
                            "Seja curioso, saboreie os "+
                            "momentos da vida e tome "+
                            "consciência de como se sente. "+
                            "Refletir sobre suas experiências ajuda a "+
                            "descobrir o que realmente importa e a "+
                            "garantir que você viva o presente. Uma "+
                            "pesquisa mostrou que pessoas treinadas a "+
                            "prestar atenção em seus sentimentos "+
                            "durante oito a 12 semanas apresentaram "+
                            "melhora no bem-estar por anos.@1"+

                            "@b 4 - Continue aprendendo b@ @1 "+
                            "Tente algo novo, matricule-se "+
                            "em algum curso, faça uma nova 4 tarefa no trabalho. Tente consertar "+
                            "algo em casa. Aprenda a tocar algum "+
                            "instrumento ou a cozinhar. Escolha um "+
                            "desafio que você nunca vai gostar de "+
                            "perseguir. Os estudos sugerem que o "+
                            "bem-estar está ligado a ter metas – desde "+
                            "que elas sejam estabelecidas pelos próprios "+
                            "indivíduos e tenham a ver com seus valores "+
                            "pessoais.@2"+

                            "@b 5 - Doe-se b@ @1 "+
                            "Agradeça a alguém, ajude um "+
                            "amigo ou um estranho. Sorria, 5 faça trabalho voluntário, junte-se "+
                            "à associação do bairro. Olhe para fora, "+
                            "além de olhar para dentro de si. Fazer parte "+
                            "de uma comunidade traz benefícios – entre "+
                            "eles, relações sociais mais significativas. As "+
                            "pesquisas mostram que as pessoas que têm "+
                            "um interesse maior pelo outro tendem a se "+
                            "considerar mais felizes.@1"+
                            "@1<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI236742-15228,00-O+MITO+DA+FELICIDADE.html. Acesso em: "+
                            "4 set. 211.</small> @2";

                    sourceString = texto+"Esse texto é dirigido a pessoas ";
                    qA = "em busca de uma melhor qualidade de vida. ";
                    qB = "em situação de solidão e abandono. ";
                    qC = "propensas a desenvolver doenças mentais. ";
                    qD = "sedentárias e com risco de doenças. ";
                    resolucao = ""; break;

                case 18:
                    texto = "@cimg lc520181 cimg@ @2";
                    sourceString = texto+"Ao usar a expressão “Credo, pai!”, o menino demonstra ";
                    qA = "aversão. ";
                    qB = "crítica. ";
                    qC = "medo. ";
                    qD = "ponderação. ";
                    resolucao = ""; break;
                case 19:

                    texto = "@cimg lc520181 cimg@ @2";
                    sourceString = texto+"O uso das aspas em “Desde 1890” explica-se por ";
                    qA = "abordar a durabilidade do produto em questão. ";
                    qB = "expressar a qualidade do produto a ser consumido. ";
                    qC = "justificar a escolha do leite que ambos iriam tomar. ";
                    qD = "reproduzir literalmente o que estava escrito na caixa. ";
                    resolucao = ""; break;
                case 20:

                    texto = "@cimg lc520181 cimg@ @2";
                    sourceString = texto+"O objetivo comunicativo desse texto é ";
                    qA = "alertar o leitor. ";
                    qB = "entreter o leitor. ";
                    qC = "orientar o leitor. ";
                    qD = "persuadir o leitor. ";
                    resolucao = ""; break;


                case 21:
                    texto = "@b Crônica de amor b@ @2 "+
                            "Você ama aquela petulante. Você escreveu dúzias de cartas que ela não respondeu, você deu "+
                            "flores que ela deixou a seco, você levou para conhecer a sua mãe e ela foi de blusa transparente."+
                            "Você gosta de rock e ela de chorinho, você gosta de praia e ela tem alergia a sol, você abomina "+
                            "o Natal e ela detesta o Ano Novo, nem no ódio vocês combinam. Então? @1"+
                            "Então que ela tem um jeito de sorrir que o deixa imobilizado, [...] você adora brigar com ela e "+
                            "ela adora implicar com você. Isso tem nome.@1"+
                            "[...] Ele diz que vai ligar e não liga, ele veste o primeiro trapo que encontra no armário [...]. Ele não "+
                            "tem a menor vocação para príncipe encantado, e ainda assim você não consegue despachá-lo. [...] @1"+
                            "Ah, o amor, essa raposa. Quem dera o amor não fosse um sentimento, mas uma equação "+
                            "matemática: eu linda + você inteligente = dois apaixonados. Não funciona assim. [...] O amor não "+
                            "é chegado a fazer contas, não obedece a razão. O verdadeiro amor acontece por empatia, por "+
                            "magnetismo, por conjunção estelar. [...] Ninguém ama outra pessoa porque ela é educada, veste-se "+
                            "bem [...].@1"+
                            "Ama-se pelo cheiro, pelo mistério, pela paz que o outro lhe dá, ou pelo tormento que provoca."+
                            "Ama-se pelo tom de voz, pela maneira que os olhos piscam, pela fragilidade que se revela quando "+
                            "menos se espera. Amar não requer conhecimento prévio [...] Ama-se justamente pelo que o amor "+
                            "tem de indefinível. [...] "+
                            "@2<small>FREIRE, Roberto. Disponível em: http:www.angelfire.com/la/psique/amor.html Acesso em: 8 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"Entende-se desse texto que o amor é um sentimento ";
                    qA = "completo, pois se define no erótico. ";
                    qB = "divino e idealizado, provocando a dor. ";
                    qC = "estranho, mas divino para ser entendido e vivido. ";
                    qD = "simples, sendo perfeito e necessário aos humanos. ";
                    resolucao = ""; break;
                case 22:

                    texto = "@b Crônica de amor b@ @2 "+
                            "Você ama aquela petulante. Você escreveu dúzias de cartas que ela não respondeu, você deu "+
                            "flores que ela deixou a seco, você levou para conhecer a sua mãe e ela foi de blusa transparente."+
                            "Você gosta de rock e ela de chorinho, você gosta de praia e ela tem alergia a sol, você abomina "+
                            "o Natal e ela detesta o Ano Novo, nem no ódio vocês combinam. Então? @1"+
                            "Então que ela tem um jeito de sorrir que o deixa imobilizado, [...] você adora brigar com ela e "+
                            "ela adora implicar com você. Isso tem nome.@1"+
                            "[...] Ele diz que vai ligar e não liga, ele veste o primeiro trapo que encontra no armário [...]. Ele não "+
                            "tem a menor vocação para príncipe encantado, e ainda assim você não consegue despachá-lo. [...] @1"+
                            "Ah, o amor, essa raposa. Quem dera o amor não fosse um sentimento, mas uma equação "+
                            "matemática: eu linda + você inteligente = dois apaixonados. Não funciona assim. [...] O amor não "+
                            "é chegado a fazer contas, não obedece a razão. O verdadeiro amor acontece por empatia, por "+
                            "magnetismo, por conjunção estelar. [...] Ninguém ama outra pessoa porque ela é educada, veste-se "+
                            "bem [...].@1"+
                            "Ama-se pelo cheiro, pelo mistério, pela paz que o outro lhe dá, ou pelo tormento que provoca."+
                            "Ama-se pelo tom de voz, pela maneira que os olhos piscam, pela fragilidade que se revela quando "+
                            "menos se espera. Amar não requer conhecimento prévio [...] Ama-se justamente pelo que o amor "+
                            "tem de indefinível. [...] "+
                            "@2<small>FREIRE, Roberto. Disponível em: http:www.angelfire.com/la/psique/amor.html Acesso em: 8 set. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"Considerando a abordagem dada ao tema e a linguagem utilizada, conclui-se que esse texto é um exemplo "+
                            "de produção literária ";
                    qA = "barroca. ";
                    qB = "contemporânea. ";
                    qC = "realista. ";
                    qD = "romântica. ";
                    resolucao = ""; break;


                case 23:
                    texto = " @b Soneto b@ @2 "+
                            "Pálida, à luz da lâmpada sombria.@1"+
                            "Sobre o leito de flores reclinada, @1"+
                            "Como a lua por noite embalsamada, @1"+
                            "Entre as nuvens do amor ela dormia! @1"+
                            "Era a virgem do mar! Na escuma fria @1"+
                            "Pela maré das águas embalada! @1"+
                            "Era um anjo entre nuvens d’ alvorada @1"+
                            "Que em sonhos se banhava e se esquecia! @1"+
                            "Era mais bela! O seio palpitando...@1"+
                            "Negros olhos as pálpebras abrindo...@1"+
                            "Formas nuas no leito resvalando...@1"+
                            "Não te rias de mim meu anjo lindo? @1"+
                            "Por ti – as noites eu velei chorando.@1"+
                            "Por ti – nos sonhos morrerei sorrindo! "+
                            "@2<small>AZEVEDO, Álvares. Lira dos vinte anos. São Paulo: Martins Fontes, 1996.</small> @2 ";
                    sourceString = texto+"A respeito desse texto, são feitas as seguintes afirmativas:@2"+

                            "I. O soneto insere-se na fase ingênua, uma vez que se observa uma descrição singela e doce da "+
                            "mulher, chamada de anjo e de virgem.@1"+
                            "II. O soneto revela a face de Caliban, que se define pelo orgíaco e satânico.@1 "+
                            "III. A utilização do soneto eleva o poema a uma concepção árcade de literatura.@1 "+
                            "IV. A última estrofe traz um traço marcante da obra de Álvares de Azevedo que é a alusão à morte. @2 "+
                            "Estão corretas apenas as afirmativas ";
                    qA = "I e IV. ";
                    qB = "II e III. ";
                    qC = "I, II e III. ";
                    qD = "II, III e IV. ";
                    resolucao = ""; break;
                case 24:


                    sourceString = "Leia as passagens abaixo, extraídas de três romances brasileiros.@2 "+

                            "I. Na verdade, Capitu ia crescendo às carreiras, as formas arredondavam-se e avigoravam-se "+
                            "com grande intensidade; moralmente, a mesma coisa. Era mulher por dentro e por fora, mulher "+
                            "à direita e à esquerda, mulher por todos os lados, e desde os pés até à cabeça.@1"+
                            "@1<small>ASSIS, Machado. Dom Casmurro. Rio de Janeiro: Jackson, 1957. p. 71.</small> @2 "+

                            "II. Escrevia tanto tanto que os dedos adormeciam. Letras miudinhas, para enconomizar papel. Nas "+
                            "vésperas dos exames dormia duas, três horas por noite. Não tinha proteção, compreende? [...] "+
                            "Estudar sempre, sempre, com medo das reprovações.@1"+
                            "@1<small>RAMOS, Graciliano. São Bernardo. Rio de Janeiro: Record, 1979. p. 163.</small> @2 "+

                            "III. Filha da vontade de crescer que toda criança traz no peito, ou seja, lá onde for que as vontades "+
                            "se aninham. Fermentada pela vontade de transgredir, que incha cada vez que alguém diz que "+
                            "isso não é para meninas, ela também sabia bem.@1"+
                            "@1<small>MACHADO, Ana Maria. A audácia dessa mulher. Rio de Janeiro: Objetiva, 211. p. 58.</small> @2 "+

                            "Com base na relação entre mulher e sociedade, esses textos têm em comum ";
                    qA = "discursos enunciados por personagens femininas evidenciando a opressão social. ";
                    qB = "exemplos de personagens femininas que representam forma de resistência. ";
                    qC = "falas de personagens femininas que caracterizam comportamento transgressor. ";
                    qD = "manifestações da repressão masculina diante da emergência social e política. ";
                    resolucao = ""; break;


                case 25:
                    texto = "@b Vila Rica b@ @2 "+
                            "O ouro fulvo do ocaso as velhas casas cobre; @1"+
                            "Sangram, em laivos de ouro, as minas, que a ambição @1"+
                            "Na torturada entranha abriu da terra nobre:@1"+
                            "E cada cicatriz brilha como um brasão.@2"+
                            "O ângelus plange ao longe em doloroso dobre.@1"+
                            "O último ouro do sol morre na cerração.@1"+
                            "E, austero, amortalhado a urbe gloriosa e pobre, @1"+
                            "O crepúsculo cai como uma extrema unção.@2"+
                            "Agora, para além do cerro, o céu aparece @1"+
                            "Feito de um ouro ancião que o tempo enegreceu...@1"+
                            "A neblina, roçando o chão, cicia, em prece, @2"+
                            "Como uma procissão espectral que se move...@1"+
                            "Dobra o sino... Soluça um verso de Dirceu...@1"+
                            "Sobre a triste Ouro Preto o ouro dos astros chove.@1"+
                            "@1<small>BILAC, Olavo. Obra reunida. Org. e introd. Alexei Bueno. Rio de Janeiro: Nova Aguilar, 1996. p. 269.</small> @2 ";

                    sourceString = texto+"Analisando esse texto, conclui-se que ele se associa à estética parnasiana devido ";
                    qA = "à descrição precisa do ambiente. ";
                    qB = "à técnica de escrita, da formalidade linguística. ";
                    qC = "ao lirismo presente na última estrofe. ";
                    qD = "ao tema abordado, voltado às noções históricas. ";
                    resolucao = ""; break;
                case 26:

                    texto = "@b Vila Rica b@ @2 "+
                            "O ouro fulvo do ocaso as velhas casas cobre; @1"+
                            "Sangram, em laivos de ouro, as minas, que a ambição @1"+
                            "Na torturada entranha abriu da terra nobre:@1"+
                            "E cada cicatriz brilha como um brasão.@2"+
                            "O ângelus plange ao longe em doloroso dobre.@1"+
                            "O último ouro do sol morre na cerração.@1"+
                            "E, austero, amortalhado a urbe gloriosa e pobre, @1"+
                            "O crepúsculo cai como uma extrema unção.@2"+
                            "Agora, para além do cerro, o céu aparece @1"+
                            "Feito de um ouro ancião que o tempo enegreceu...@1"+
                            "A neblina, roçando o chão, cicia, em prece, @2"+
                            "Como uma procissão espectral que se move...@1"+
                            "Dobra o sino... Soluça um verso de Dirceu...@1"+
                            "Sobre a triste Ouro Preto o ouro dos astros chove.@1"+
                            "@1<small>BILAC, Olavo. Obra reunida. Org. e introd. Alexei Bueno. Rio de Janeiro: Nova Aguilar, 1996. p. 269.</small> @2 ";

                    sourceString = texto+"Nos versos “Sangram, em laivos de ouro, as minas, que a ambição/ Na torturada entranha abriu da terra "+
                            "nobre:”, o recurso de estilo utilizado é a ";
                    qA = "humanização de palavras como “minas” e “ambição”. ";
                    qB = "oposição de ideias, marcadas por contrastes de sentido. ";
                    qC = "proposta exagerada dos acontecimentos descritos. ";
                    qD = "simbologia das expressões, como em “terra nobre”. ";
                    resolucao = ""; break;


                case 27:
                    texto = "@b O índio Afonso b@ @1 "+
                            "O Afonso é um personagem real. Pelo menos em 1861 ainda ele existia nas matas do "+
                            "Paranaíba, na Província de Goiás.@2"+
                            "Era ou é ainda réu indiciado em um crime de morte, mas tem por menagem umas cinquenta "+
                            "ou sessenta léguas de florestas virgens em uma e outra margem do Parnaíba, que serve de linha "+
                            "divisória entre as províncias de Minas e Goiás, desde o rio S. Marcos até a confluência com o "+
                            "Paraná, por onde a polícia de Goiás o deixar vaguear livremente porque, depois de o perseguir "+
                            "em vão por muito tempo, perdeu a esperanças de poder-lhe jamais lançar as garras."+
                            "Afonso pertence a esta raça de índios mestiços que vivem vida nômade ou semibárbara pelas "+
                            "margens dos grandes rios do sertão, subsistindo quase exclusivamente de caça e pesca."+
                            "É um caboclo de estatura colossal e de organização atlética. De ordinário ainda só, mas "+
                            "sempre armado, desde os pés até à cabeça, com excelentes armas, de que sabe usar com "+
                            "incrível destreza. Além de sua boa espingarda de dois canos, que nunca lhe sai do punho, traz ao "+
                            "cinto duas pistolas de dois tiros, uma formidável garrucha, a indispensável faca e uma pequena "+
                            "foice. Desta maneira ele só com sua valentia vale por vinte; é como um fortim ambulante. [...] "+
                            "@2<small>GUIMARÃES, Bernardo. Disponível em: http://sites.google.com/site/sitedobg/Home/romances-contos/o-indio-afonso-1873- Acesso em: 7 out. 211. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";
                    sourceString = texto+"Nesse texto, a descrição da personagem Afonso ressalta o processo da ";
                    qA = "aculturação indígena. ";
                    qB = "ênfase nacionalista. ";
                    qC = "miscigenação brasileira. ";
                    qD = "mitificação do índio. ";
                    resolucao = ""; break;
                case 28:

                    texto = "@b O índio Afonso b@ @1 "+
                            "O Afonso é um personagem real. Pelo menos em 1861 ainda ele existia nas matas do "+
                            "Paranaíba, na Província de Goiás.@2"+
                            "Era ou é ainda réu indiciado em um crime de morte, mas tem por menagem umas cinquenta "+
                            "ou sessenta léguas de florestas virgens em uma e outra margem do Parnaíba, que serve de linha "+
                            "divisória entre as províncias de Minas e Goiás, desde o rio S. Marcos até a confluência com o "+
                            "Paraná, por onde a polícia de Goiás o deixar vaguear livremente porque, depois de o perseguir "+
                            "em vão por muito tempo, perdeu a esperanças de poder-lhe jamais lançar as garras."+
                            "Afonso pertence a esta raça de índios mestiços que vivem vida nômade ou semibárbara pelas "+
                            "margens dos grandes rios do sertão, subsistindo quase exclusivamente de caça e pesca."+
                            "É um caboclo de estatura colossal e de organização atlética. De ordinário ainda só, mas "+
                            "sempre armado, desde os pés até à cabeça, com excelentes armas, de que sabe usar com "+
                            "incrível destreza. Além de sua boa espingarda de dois canos, que nunca lhe sai do punho, traz ao "+
                            "cinto duas pistolas de dois tiros, uma formidável garrucha, a indispensável faca e uma pequena "+
                            "foice. Desta maneira ele só com sua valentia vale por vinte; é como um fortim ambulante. [...] "+
                            "@2<small>GUIMARÃES, Bernardo. Disponível em: http://sites.google.com/site/sitedobg/Home/romances-contos/o-indio-afonso-1873- Acesso em: 7 out. 211. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";
                    sourceString = texto+"O ponto de vista escolhido para contar essa história revela um narrador ";
                    qA = "intruso, pois interage com o leitor. ";
                    qB = "observador, pois está distante dos fatos. ";
                    qC = "onisciente, pois revela saber tudo sobre a história. ";
                    qD = "personagem, pois é o protagonista da história. ";
                    resolucao = ""; break;

                case 29:
                    texto = "@b Antífona b@ @2 "+
                            "Ó formas alvas, brancas, Formas claras @1"+
                            "De luares, de neves, de neblinas!...@1"+
                            "Ó Formas vagas, fluídas, cristalinas...@1"+
                            "Incensos dos turíbulos das aras...@1"+
                            "Formas do Amor, constelarmente puras, @1"+
                            "De Virgens e de Santas vaporosas...@1"+
                            "Brilhos errantes, mádidas frescuras @1"+
                            "E dotências de lírios e de rosas...@1"+
                            "Indefiníveis músicas supremas, @1"+
                            "Harmonias da Cor e do Perfume...@1"+
                            "Horas do Ocaso, trêmulas, extremas, @1"+
                            "Requiem do Sol que a Dor da Luz resume... [...] "+
                            "@2<small>CRUZ E SOUZA. Disponível em: http://www.horizonte.unam.mx/brasil/cruz1.html. Acesso em: 7 out. 211. Fragmento.</small> @2 ";
                    sourceString = texto+"Esse fragmento de texto se insere na estética simbolista em função da ";
                    qA = "apresentação melancólica do assunto discutido. ";
                    qB = "presença das rimas e dos versos curtos do poema. ";
                    qC = "proposta poética de exploração dos sentidos. ";
                    qD = "temática apresentada, buscando a definição lírico-amorosa. ";
                    resolucao = ""; break;

                case 30:

                    sourceString = "Nos estudos da cor, encontra-se algumas classificações e nomenclaturas das cores, segundo suas "+
                            "características e formas de manifestação.@1"+
                            "@1A partir dessas informações, quais são as cores consideradas “cores geratrizes ou primárias”? ";
                    qA = "As cores originais de um objeto visto sob luz natural, como a maçã vermelha, o leite branco, a laranja amarela. ";
                    qB = "As cores representativas de seus sentimentos ou do próprio movimento, determinadas pela imaginação. ";
                    qC = "As cores que variam segundo o ângulo em que se coloca o observador em relação ao objeto colorido. ";
                    qD = "As cores indecomponíveis que, misturadas em proporções variáveis, produzem todas as cores do espectro. ";
                    resolucao = ""; break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice) {
                case 1:

                    sourceString = "A tabela abaixo apresenta os dados sobre a produção e a venda de automóveis de três montadoras em "+
                            "certo mês do ano.@1"+
                            "@cimg mt520011 cimg@"+
                            "@1O gráfico que melhor representa a quantidade da produção vendida por essas três montadoras é ";
                    qA = "@img mt52001a img@";
                    qB ="@img mt52001b img@";
                    qC = "@img mt52001c img@";
                    qD = "@img mt52001d img@";
                    resolucao = "Muitos alunos erram esta questão por não prestarem atenção no enunciado, interpretar o texto nesses casos é essencial, ainda mais " +
                            "quando se trata de análise de dados. @2" +
                            "" +
                            "A questão nos apresenta uma tabela com alguns valores e quer saber qual gráfico melhor representa a " +
                            "quantidade de produção vendida pelos três montadores (A, B, C). @2" +
                            "" +
                            "Tendo isso em vista, para solucionarmos esta questão, precisamos saber quantos automóveis cada montadora vendeu. O enunciado " +
                            "nos passa a porcentagem (% da produção vendida), mas a questão quer saber a quantidade, então vamos calcular. @2" +
                            "" +
                            "@b Montadora A: b@ @1" +
                            "Produziu @b 1000 b@ e vendeu @b 60% (60/100) b@. @2" +
                            "" +
                            "1000 . 60/100 = AUTOMÓVEIS VENDIDAS @1" +
                            "Podemos cortar os zeros do @b 100 b@ com os zeros do @b 1000 b@ @1" +
                            "10 . 60 = AUTOMÓVEIS VENDIDAS @1" +
                            "600 = AUTOMÓVEIS VENDIDAS @2" +
                            "" +
                            "@b Montadora B: b@ @1" +
                            "Produziu @b 1500 b@ e vendeu @b 80% (80/100) b@. @2" +
                            "" +
                            "1500 . 80/100 = AUTOMÓVEIS VENDIDAS @1" +
                            "Podemos cortar os zeros do @b 100 b@ com os zeros do @b 1500 b@ @1" +
                            "15 . 80 = AUTOMÓVEIS VENDIDAS @1" +
                            "1200 = AUTOMÓVEIS VENDIDAS @2" +                            "" +
                            "" +
                            "@b Montadora C: b@ @1" +
                            "Produziu @b 2000 b@ e vendeu @b 50% (50/100) b@. @2" +
                            "" +
                            "2000 . 50/100 = AUTOMÓVEIS VENDIDAS @1" +
                            "Podemos cortar os zeros do @b 100 b@ com os zeros do @b 2000 b@ @1" +
                            "20 . 50 = AUTOMÓVEIS VENDIDAS @1" +
                            "1000 = AUTOMÓVEIS VENDIDAS @2" +                            "" +
                            "" +
                            "Reunindo os dados, temos: @2" +
                            "" +
                            "- @b Montadora A b@ produziu @b 600 b@ automóveis. @1" +
                            "- @b Montadora B b@ produziu @b 1200 b@ automóveis. @1" +
                            "- @b Montadora C b@ produziu @b 1000 b@ automóveis. @2" +
                            "" +
                            "O gráfico que melhor representa essa relação, portanto é o gráfico da letra C." +
                            ""; break;

                case 2:

                    sourceString = "Em um certo instante do dia, o Sol projetou a sombra de um mastro de São João sobre o pátio de uma "+
                            "fazenda. No mesmo instante, um poste de luz situado na mesma horizontal desse mastro, teve também "+
                            "sua sombra projetada como mostra o desenho abaixo.@2 "+
                            "@cimg mt520021 cimg@ @1"+

                            "A medida da altura h desse mastro é, aproximadamente, ";
                    qA = "1,98 m. ";
                    qB = "2,44 m. ";
                    qC = "5,40 m. ";
                    qD = "6,54 m. ";
                    resolucao = "Analisando a imagem, podemos concluir que os dois triângulos formados são semelhantes. @1" +
                            "Tendo isso em mente, basta anotar os dados que possuímos e colocar na fórmula de triângulos semelhantes. @2" +
                            "" +
                            "- A base do @b triângulo 1 b@ é @b 4 b@ e a base do @b triângulo 2 b@ é @b 2,2 b@. @2" +
                            "" +
                            "- A altura do @b triângulo 1 b@ é @b h b@ e a altura do @b triângulo 2 b@ é @b 3,6 b@. @2" +
                            "" +
                            "Já que eles são triângulos semelhantes, podemos tirar a seguinte conclusão: @2" +
                            "" +
                            "@cimg rmt520021 cimg@ @2" +
                            "" +
                            "Com essa relação, podemos multiplicar cruzado e isolar o h. @2" +
                            "" +
                            "@cimg rmt520022 cimg@ @2" +
                            "" +
                            "Podemos transformar esses números decimais em fraçoes, isso facilitará nosso cálculo: @2" +
                            "" +
                            "@cimg rmt520023 cimg@ @2" +
                            "" +
                            "Agora basta utilizarmos a propriedade de divisão entre frações, repete a primeira fração e multiplica pelo inverso da segunda. @2" +
                            "" +
                            "@cimg rmt520024 cimg@ @2" +
                            "" +
                            "Podemos simplificar por 2, mas conforme as alternativas, não poderemos manter " +
                            "na forma de fração, teremos que dividir e encontrar o valor decimal. @2" +
                            "" +
                            "@cimg rmt520025 cimg@ @2" +
                            "" +
                            "" +
                            ""; break;
                case 3:

                    sourceString = "Júlio lanchou em sua escola durante cinco dias de uma semana. Na segunda-feira, ele gastou R$ 3,80; na "+
                            "terça-feira, R$ 4,10; na quarta-feira, R$ 2,50; na quinta-feira, R$ 3,80 e na sexta-feira, R$ 3,30.@1"+
                            "@1O gasto médio de Júlio com lanche nesses cinco dias foi ";
                    qA = "R$ 3,30. ";
                    qB = "R$ 3,42. ";
                    qC = "R$ 3,50. ";
                    qD = "R$ 3,80. ";
                    resolucao = "Essa questão é considerada fácil, mas " +
                            "voce precisa entender o conceito de média aritimética. @1" +
                            "Para sabemos a média, basta somarmos todos os valores e dividirmos pela quantidade de valores: @2" +
                            "" +
                            "@cimg rmt520031 cimg@ @2" +
                            "" +
                            "Podemos transformar o @b 17,50 b@ e @b 5 b@ em frações para facilitar o cálculo. @2" +
                            "" +
                            "@cimg rmt520032 cimg@ @2" +
                            "" +
                            "Agora basta utilizarmos a propriedade de divisão entre frações, repete a primeira fração e multiplica pelo inverso da segunda. @2" +
                            "" +
                            "@cimg rmt520033 cimg@ @2" +
                            "" +
                            "É possível simplificar o @b 175 b@ e @b 5 b@. @2" +
                            "" +
                            "@cimg rmt520034 cimg@ @2" +
                            "" +
                            "" +
                            "" +
                            "" +
                            ""; break;
                case 4:

                    sourceString = "Seis fichas foram colocadas em uma urna, cada uma contendo uma letra da palavra BRASIL. @1"+
                            "Se as fichas forem retiradas aleatoriamente, uma a uma, a probabilidade das letras saírem na mesma "+
                            "ordem em que aparecem na palavra é ";
                    qA = "1/6.";
                    qB = "1/21.";
                    qC = "1/360";
                    qD = "1/720";
                    resolucao = "Bem, para isso teremos que utilizar a fórmula de probabilidade: @2" +
                            "" +
                            "@cimg rmt520041 cimg@ @2" +
                            "" +
                            "Onde: @1" +
                            "@b P b@ é a probabilidade do evento acontecer. @1" +
                            "@b F b@ são os casos favoráveis. @1" +
                            "@b T b@ são os casos totais. @1" +
                            "" +
                            "O enunciado quer saber qual a chance de tirarmos as fichas na sequência @b BRASIL b@, " +
                            "para isso precisaremos calcular a probabilidade de pegar cada letra e multiplicá-las. @2" +
                            "" +
                            "@b Probabilidade de retirar a letra B. b@ @1" +
                            "1 caso favorável (Letra B) e 6 casos totais (B R A S I L) @1" +
                            "P = 1/6 @2" +
                            "" +
                            "@b Probabilidade de retirar a letra R. b@ @1" +
                            "1 caso favorável (Letra R) e 5 casos totais (R A S I L) @1" +
                            "P = 1/5 @2" +                            "" +
                            "" +
                            "@b Probabilidade de retirar a letra A. b@ @1" +
                            "1 caso favorável (Letra A) e 4 casos totais (A S I L) @1" +
                            "P = 1/4 @2" +                              "" +
                            "" +
                            "@b Probabilidade de retirar a letra S. b@ @1" +
                            "1 caso favorável (Letra S) e 3 casos totais (S I L) @1" +
                            "P = 1/3 @2" +                              "" +
                            "" +
                            "@b Probabilidade de retirar a letra I. b@ @1" +
                            "1 caso favorável (Letra I) e 2 casos totais (I L) @1" +
                            "P = 1/2 @2" +                             "" +
                            "" +
                            "@b Probabilidade de retirar a letra L. b@ @1" +
                            "1 caso favorável (Letra L) e 1 caso total (L) @1" +
                            "P = 1/1 @2" +                             "" +
                            "" +
                            "@cimg rmt520042 cimg@" +
                            "" +
                            "" +
                            "" +
                            ""; break;
                case 5:

                    sourceString = "A figura abaixo representa um prisma retangular.@1 "+
                            "@cimg mt520051 cimg@ @1"+
                            "O número de faces, vértices e arestas, respectivamente, desse prisma é ";
                    qA = "6, 8 e 12. ";
                    qB = "6, 12 e 8. ";
                    qC = "8, 6 e 12. ";
                    qD = "12, 6 e 8. ";
                    resolucao = "O prisma retangular possui 6 faces, 8 vértices e 12 arestas."; break;
                case 6:

                    sourceString = "Em uma competição de perguntas e respostas, o critério adotado para pontuação era dado da seguinte forma:@2"+
                            "a cada acerto, o competidor marca o ponto anterior mais 5 pontos, sendo que no primeiro acerto, marca-se "+
                            "1 ponto. O total de pontos de cada competidor é dado pela soma dos pontos marcados em cada acerto.@1"+
                            "@1Fernando acertou 15 perguntas nessa competição, então ele marcou ";
                    qA = "15 pontos. ";
                    qB = "71 pontos. ";
                    qC = "120 pontos. ";
                    qD = "540 pontos. ";
                    resolucao = "Estamos falando de uma P.A, com 15 termos (15 acertos), com razão 5 (cada acerto vale 5 pontos somado ao ponto anterior), portanto: @2" +
                            "" +
                            "P.A = [1 , 6 , 11 , 16 , 21 ... a@_15_@] @2" +
                            "" +
                            "Fórmula para descobrir o termo @b n b@ de uma P.A: @2" +
                            "" +
                            "a@_n_@ = a@_1_@ + r . (n - 1) @2" +
                            "" +
                            "Onde: @1" +
                            "@b a@_n_@ b@ é o valor do termo que queremos descobrir. @1" +
                            "@b a@_1_@ b@ é o primeiro termo. @1" +
                            "@b n b@ é o termo que queremos saber o valor. @1" +
                            "@b r b@ é a razão. @2" +
                            "" +
                            "O enunciado quer saber a soma total de pontos marcados com 15 acertos, para isso precisaremos saber quanto valor a@_15_@. " +
                            "Substituindo na fórmula, fica: @2" +
                            "" +
                            "a@_15_@ = 1 + 5 . (15 - 1) @1" +
                            "a@_15_@ = 1 + 5 . 14 @1" +
                            "a@_15_@ = 1 + 70 @1" +
                            "a@_15_@ = 71 @2" +
                            "" +
                            "Agora que já sabemos o valor de @b a@_15_@, podemos usar a fórmula da soma total da P.A: @2" +
                            "" +
                            "@cimg rmt520061 cimg@" +
                            "" +
                            "Onde: @1" +
                            "@b S@_n_@ b@ é a soma de todos os termos. @1" +
                            "@b a@_1_@ b@ é o valor do primeiro termo. @1" +
                            "@b a@_n_@ b@ é o valor do último termo. @1" +
                            "@b n b@ é o último termo. @2" +
                            "" +
                            "@cimg rmt520062 cimg@" +
                            "" +
                            ""; break;
                case 7:

                    sourceString = "A área total de um clube mede 8 000 m2 "+
                            ". Dessa área, 25% é ocupada por quadras esportivas, sendo que "+
                            "as quadras de peteca correspondem a 40% da área ocupada pelas quadras esportivas.@1"+
                            "@1A área do clube destinada às quadras de peteca, em metros quadrados, é ";
                    qA = "200. ";
                    qB = "800. ";
                    qC = "1 200. ";
                    qD = "3 200. ";
                    resolucao = "A diversas formas de resolver essa questão, vamos fazer por partes: @2" +
                            "" +
                            "Primeira precisamos saber quanto e a área total das quadras esportivas. " +
                            "Sabemos que elas equivalem a 25% (25/100) da área do clube (8000). @2" +
                            "" +
                            "8000 . (25/100) = Quadras Esportivas @1" +
                            "80 . 25 = Quadras Esportivas @1" +
                            "2000 = Quadras Esportivas @2" +
                            "" +
                            "" +
                            "Bem, agora que já sabemos qual a área das quadras esportivas, precisamos saber " +
                            "a área do clube destinada às quadras de peteca. @1" +
                            "Elas equivalem a 40% (40/100) das quadras esportivas (2000). @2" +
                            "" +
                            "2000 . (40/100) = Quadras de Peteca @1" +
                            "20 . 40 = Quadras de Peteca @1" +
                            "800 = Quadras de Peteca @" +

                            ""; break;
                case 8:

                    sourceString = "Veja o prisma abaixo.@2 "+
                            "@cimg mt520081 cimg@ @1"+
                            "Qual é a planificação desse prisma? ";
                    qA = "@cimg mt52008a cimg@";
                    qB = "@cimg mt52008b cimg@";
                    qC = "@cimg mt52008c cimg@";
                    qD = "@cimg mt52008d cimg@";
                    resolucao = "O prisma possui 8 faces, sendo duas da base e 6 das laterais. @1" +
                            "A única planificação que possui todas essas 8 faces é a planificação " +
                            "da letra D."; break;
                case 9:

                    sourceString = "O quadro abaixo apresenta o resultado da primeira fase de um campeonato de futebol entre 5 times de um bairro.@2 "+
                            "@cimg mt520091 cimg@"+
                            "@1Sabendo que cada time participou de 4 partidas nessa fase, então o valor de a + b + c é igual a ";
                    qA = "4. ";
                    qB = "5. ";
                    qC = "16. ";
                    qD = "20. ";
                    resolucao = "" +
                            "Cada time participou de quatro partidas, e eles podem ter vencido ou empatado ou perdido cada partida, então podemos tirar uma relação disso tudo: @2" +
                            "" +
                            "V + E + D = 4 @2" +
                            "" +
                            "Ou seja, se somarmos o número total de vitórias, empates e derrotas, o resultado deve ser 4, já que eles jogaram 4 vezes. @2" +
                            "" +
                            "@b TIME I b@ @1" +
                            "a + 2 + 1 = 4 @1" +
                            "a = 4 - 2 - 1 @1" +
                            "a =  1 @2" +
                            "" +
                            "@b TIME II b@ @1" +
                            "1 + 1 + c = 4 @1" +
                            "c = 4 - 1 - 1 @1" +
                            "c =  2 @2" +
                            "" +
                            "" +
                            "@b TIME IV b@ @1" +
                            "b + 1 + 2 = 4 @1" +
                            "b = 4 - 1 - 2 @1" +
                            "b =  1 @2" +
                            "" +
                            "a =  1 @1" +
                            "b =  1 @1" +
                            "c =  2 @2" +
                            "" +
                            "a + b + c = x @1" +
                            "1 + 1 + 2 = 4" +
                            "" +
                            ""; break;
                case 10:

                    sourceString = "O gráfico abaixo mostra o número de irmãos dos alunos do terceiro ano do Ensino Médio. @1"+
                            "@cimg mt520101 cimg@ @1"+
                            "Quantos alunos têm menos de três irmãos? ";
                    qA = "4. ";
                    qB = "6. ";
                    qC = "19. ";
                    qD = "25. ";
                    resolucao =
                            "Basta analisarmos o gráfico, sabemos que 7 alunos têm dois irmãos e que 12 alunos têm 1 irmão, portanto: @2" +
                                    "" +
                                    "7 + 12 = 19" +
                            ""; break;
                case 11:

                    sourceString = "Nos períodos críticos de seca em algumas regiões do Brasil, ainda é necessário lançar mão de caminhões-pipa "+
                            "para distribuir água à população. Para realizar esse trabalho, a prefeitura de um município dispõe de um "+
                            "caminhão cujo tanque é cilíndrico, com 1 metro de raio e 4 metros de comprimento, que sai para distribuir "+
                            "água completamente cheio.@1"+
                            "Se cada família recebe 20 litros de água em cada entrega, qual é o número de famílias beneficiadas a "+
                            "cada viagem desse caminhão? @2" +
                            "@b Considere: b@ @1" +
                            "@pi = 3,14 @1" +
                            "1 m3 = 1 000 L";
                    qA = "157. ";
                    qB = "200. ";
                    qC = "600. ";
                    qD = "628. ";
                    resolucao = "O enunciado diz que a água fica contida num tanque cilíndrico, que é isso: @1" +
                            "@cimg rmt520111 cimg@ @2" +
                            "" +
                            "Porém ele fica num caminhão, portanto ficará nesta posição: @1" +
                            "@cimg rmt520112 cimg@ @2" +
                            "" +
                            "Para sabermos o volume desse tanque, basta aplicarmos os valores na fórmula do volume do cilindro. @2" +
                            "V@_c_@ = @pi . r@sp2sp@ . h @2" +
                            "" +
                            "Onde: @1" +
                            "@b V@_c_@ b@ é o volume do cilindro. @1" +
                            "@b r b@ é o raio da base. @1" +
                            "@b h b@ é a altura, mas nesse caso usaremos o comprimento, já que o cilindro está \"deitado\". @2" +
                            "" +
                            "" +
                            "V@_c_@ = @pi . 1@sp2sp@ . 4 @1" +
                            "V@_c_@ = @pi . 1 . 4 @1" +
                            "V@_c_@ = @pi . 4 @1" +
                            "O enunciado nos informa que o valor de @pi é 3,14, portanto precisaremos usar nessa forma. @1" +
                            "" +
                            "V@_c_@ = 3,14 . 4 @1" +
                            "V@_c_@ = 12,56 m3 @2" +
                            "" +
                            "Bem, agora já sabemos o volume do cilindro, mas o enunciado quer saber quantas famílias vão se beneficiar da água. @1" +
                            "A questão nos diz que: @1" +
                            " @b 1m3 = 1000L b@ @1" +
                            "Portanto: @1" +
                            " @b 12,56 m3 = 1000 . 12,56 = 12560L b@ @2" +
                            "" +
                            "Ótimo, sabemos que há 12560 litros de água no cilindro, cada família vai receber 20 litros, portanto basta dividir esses números para acharmos " +
                            "o resultado: @2" +
                            "" +
                            "12560/20 = Número de Famílias Beneficiadas @1 " +
                            "1256/2 = Número de Famílias Beneficiadas @1 " +
                            "628 = Número de Famílias Beneficiadas @1 " +

                            ""; break;


                case 12:

                    sourceString = "No desenho abaixo, o nome de duas amigas foram associados a pontos do plano cartesiano.@2 "+
                            "@cimg mt520121 cimg@ @1"+
                            "Quais são as coordenadas dos pontos associados aos nomes Cíntia e Celma, nessa ordem? ";
                    qA = "(– 4, – 2) e (3, 4). ";
                    qB = "(– 4, 3) e (– 2, 4). ";
                    qC = "(– 2, – 4) e (4, 3). ";
                    qD = "(– 2, – 4) e (3, 4). ";
                    resolucao = "As cordenadas de um ponto cartesiano são dadas por: @2" +
                            "" +
                            " @b P(x,y) b@ @2" +
                            "" +
                            "Onde: @1" +
                            "@b P b@ é o ponto. @1" +
                            "@b x b@ é a localização no eixo das abscissas. @1" +
                            "@b y b@ é a localização no eixo das ordenadas. @2" +
                            "" +
                            "@b Cíntia b@ tem o x = -4 e y = -2, portanto Cíntia(-4, -2) @2 " +
                            "@b Celma b@ tem o x = 3 e y = 4, portanto Cíntia(3, 4) @2 " +
                            "" +
                            "" +
                            "" +
                            "" +
                            ""; break;
                case 13:

                    sourceString = "As placas dos veículos automotores de um país são codificadas da seguinte forma:@2"+
                            "• todas as placas possuem oito caracteres, sendo quatro letras escolhidas entre as 26 do alfabeto "+
                            "e quatro números escolhidos entre os algarismos de 0 a 9.@1"+
                            "• os quatro caracteres centrais são formados somente por números ou somente por letras.@1"+
                            "@1De acordo com esses dados, quantas placas distintas podem ser codificadas nesse país? ";
                    qA = "260@sp4sp@ ";

                    qB = "2 x 260@sp4sp@ ";

                    qC = "260@sp8sp@ ";

                    qD = "2 x 260@sp8sp@ ";
                    resolucao = "Esta questão trata sobre análise combinatória, o enunciado diz que a placa de um carro possui 8 caracteres, 4 números e 4 letras. @2" +
                            "" +
                            "" +
                            "No conjunto das letras temos L = {A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z} = 26 Possibilidades. @2" +
                            "" +
                            "No Conjunto dos números temos N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} = 10 Possibilidades. @2" +
                            "" +
                            "E existem dois casos, onde um tem as letras no centro e o outro tem os números no centro, deveremos calcular " +
                            "as combinações dos dois, e depois somá-las: @2" +
                            "" +
                            "" +
                            "Letras no meio: @1" +
                            "@cimg rmt520121 cimg@ @2" +
                            "" +
                            "10 . 10 . 26 . 26 . 26 . 26 . 10 . 10 @1" +
                            "10@sp2sp@ . 26@sp4sp@ . 10@sp2sp@ @1" +
                            "Se as bases forem iguais, basta somar os expoentes. @1" +
                            "10@sp2sp@ . 10@sp2sp@ . 26@sp4sp@ @1" +
                            "10@sp2+2sp@ . 26@sp4sp@ @1" +
                            "10@sp4sp@ . 26@sp4sp@ @1" +
                            "Se os expoentes forem iguais, basta multiplicar as bases. @1" +
                            "260@sp4sp@ @2" +
                            "" +
                            "Números no meio: @1" +
                            "@cimg rmt520122 cimg@ @2" +
                            "" +
                            "26 . 26 . 10 . 10 . 10 . 10 . 26 . 26 @1" +
                            "26@sp2sp@ . 10@sp4sp@ . 26@sp2sp@ @1" +
                            "Se as bases forem iguais, basta somar os expoentes. @1" +
                            "26@sp2sp@ . 26@sp2sp@ . 10@sp4sp@ @1" +
                            "26@sp2+2sp@ . 10@sp4sp@ @1" +
                            "26@sp4sp@ . 10@sp4sp@ @1" +
                            "Se os expoentes forem iguais, basta multiplicar as bases. @1" +
                            "260@sp4sp@ @2" +                            "" +
                            "" +
                            "" +
                            "Sendo assim: @2" +
                            "" +
                            "Possibilidades = 260@sp4sp@ + 260@sp4sp@ = 2 x 260@sp4sp@" +
                            ""; break;

                case 14:

                    sourceString = "Uma pessoa investiu R$ 10 000,00, a juros compostos, à taxa de 1% ao mês.@1"+
                            "@1Em três meses, quanto essa pessoa recebeu de juros sobre esse valor investido? ";
                    qA = "R$ 100,00. ";
                    qB = "R$ 101,01. ";
                    qC = "R$ 300,00. ";
                    qD = "R$ 303,01. ";
                    resolucao = "Fórmulas de juros: @2" +
                            "" +
                            "M = C(1+i)@sptsp@ @1" +
                            "J = M - C @2" +
                            "" +
                            "Onde: @1" +
                            "@b M b@ é o montante total. @1" +
                            "@b C b@ é o capital inicial (10000) @1" +
                            "@b i b@ é a taxa de juros (1% - 0,01)  @1" +
                            "@b t b@ é o tempo (3) @1" +
                            "@b J b@ é o valor arrecadado com o juros @2" +
                            "" +
                            "" +
                            "M = C(1+i)@sptsp@ @1" +
                            "M = 10000(1+0,01)@sp3sp@ @1" +
                            "M = 10000(1,01)@sp3sp@ @1" +
                            "M = 10000(1,030301)@1" +
                            "M = 10303,01 @2" +
                            "" +
                            "J = M - C @1" +
                            "J = 10303,01 - 10000" +
                            "J = 303,01" +
                            "" +
                            ""; break;
                case 15:

                    sourceString = "Para calcular o valor final V de uma aplicação de um capital de R$ 1 000,00 a uma taxa mensal de " +
                            "10% ao mês, por 2 meses, utiliza-se a fórmula matemática V = C(1+ i)@sptsp@" +
                            ", onde C é o capital aplicado, i é a " +
                            "taxa mensal e t o tempo em meses, que resultará em um valor final de R$ 1 210,00. @2" +
                            "Nessas mesmas condições, esse mesmo capital de R$ 1 000,00, aplicado pelo mesmo tempo, a uma taxa " +
                            "mensal de 20% resultaria em um valor final de";
                    qA = "R$ 1 040,40.";
                    qB = "R$ 1 230,00.";
                    qC = "R$ 1 440,00.";
                    qD = "R$ 2 400,00.";
                    resolucao = "O enunciado já nos deu a fórmula  V = C(1+ i)@sptsp@ e disse que a taxa de juros é 20% (0,10), o tempo é 2 meses e o capital inicial é " +
                            "1000. @2" +
                            "" +
                            "V = C(1+ i)@sptsp@ @2" +
                            "" +
                            "V = 1000(1 + 0,20)@sp2sp@ @1" +
                            "V = 1000(1,20)@sp2sp@ @1" +
                            "V = 1000 . 1,44 @1" +
                            "V = 1440 " +
                            "" +
                            ""; break;
                case 16:

                    sourceString = "Os triângulos I e II abaixo são semelhantes.@2 "+
                            "@cimg mt520161 cimg@ @1"+
                            "@1Qual é, aproximadamente, a medida da área do triângulo II? ";
                    qA = "17,50 cm2 ";

                    qB = "30,63 cm2 ";

                    qC = "33,91 cm2 ";

                    qD = "61,25 cm2 ";
                    resolucao = ""; break;

                case 17:

                    sourceString = "Jonas representou a função f: IR @longarrow IR dada por y = x2 "+
                            " + x – 6 no plano cartesiano.@1"+
                            "@1Qual é a representação gráfica dessa função? ";
                    qA = "@cimg mt52017a cimg@";
                    qB = "@cimg mt52017b cimg@";
                    qC = "@cimg mt52017c cimg@";
                    qD = "@cimg mt52017d cimg@";
                    resolucao = "Vamos analisar as principais caracteristicas da função: @2" +
                            "" +
                            "- O @b a b@ (Número que acompanha o x2) é 1, portanto é positivo e o gráfico será crescente (concavidade voltada para baixo). @2" +
                            "" +
                            "- O termo independente é o -6, se x for 0, o y será -6. ( F(0) = 0@_2_@ + 0 - 6 = -6 ) @2" +
                            "" +
                            "- Com as propriedades de soma e produto podemos determinar as raízes, basta acharmos dois números que " +
                            "somados sejam 1 e multiplicados sejam -6. @2" +
                            "" +
                            "3 e -2 se encaixam nessas características. @2" +
                            "" +
                            "3 + (-2) = 1 @1" +
                            "3 . (-2) = -6 @2" +
                            "" +
                            "Portanto as raízes (onde a parábola intercepta no eixo x) são -2 e 3. @2" +
                            "" +
                            "O único gráfico com todas essas características é o gráfico da letra  " +
                            "" +
                            "" +
                            "" +
                            ""; break;

                case 18:

                    sourceString = "Observe o ciclo trigonométrico abaixo onde estão representados alguns pontos no intervalo de [0, 2r].@2 "+
                            "@cimg mt520181 cimg@ @1"+
                            "@1Os valores do seno de 120º (ponto L) e do cosseno de 300º (ponto U) são respectivamente iguais a ";
                    qA = "@cimg mt52018a cimg@";

                    qB = "@cimg mt52018b cimg@";
                    qC = "@cimg mt52018c cimg@";
                    qD = "@cimg mt52018d cimg@";
                    resolucao = ""; break;

                case 19:

                    sourceString = "Para fazer uma prova de concurso público na área da saúde, os candidatos foram organizados em três "+
                            "salas. Os candidatos a uma determinada área de atuação eram igualmente divididos em duas dessas salas.@1"+
                            "Na primeira sala, havia 150 candidatos para as vagas de clínico geral e pediatria, na segunda sala, havia "+
                            "146 candidatos às vagas de pediatria e técnico em enfermagem e, na última sala, havia 106 candidatos às "+
                            "vagas de clínico geral e técnico em enfermagem.@1"+
                            "@1Quantos candidatos às vagas de clínico geral havia em casa sala desse concurso? ";
                    qA = "55. ";
                    qB = "67. ";
                    qC = "128. ";
                    qD = "134. ";
                    resolucao = ""; break;
                case 20:

                    sourceString = "Uma fábrica produz vários modelos de malas. Um dos modelos mais vendidos tem o espaço interno no "+
                            "formato de um prisma retangular, cujas dimensões estão representadas na figura abaixo.@2 "+
                            "@cimg mt520201 cimg@ @2"+
                            "Qual é a capacidade máxima, em cm3 "+
                            "@1, dessa mala? ";
                    qA = "4 316. ";
                    qB = "8 632. ";
                    qC = "14 880. ";
                    qD = "44 640. ";
                    resolucao = ""; break;
                case 21:

                    sourceString = "Observe o triângulo retângulo desenhado abaixo.@2 "+
                            "@cimg mt520211 cimg@ @1"+
                            "Qual é o valor da tangente de i desse triângulo? ";
                    qA = "5/3.";
                    qB = "3/5";
                    qC = "@cimg mt52021c cimg@";
                    qD = "@cimg mt52021d cimg@";
                    resolucao = ""; break;
                case 22:

                    sourceString = "Numa loja, uma televisão custa à vista R$ 650,00. Quando comprada em 15 prestações mensais, iguais, "+
                            "é aplicada uma taxa de juros simples. Dessa forma, o valor da televisão sofre um acréscimo de R$ 195,00 "+
                            "de juros, conforme mostra a figura abaixo.@2 "+
                            "@cimg mt520221 cimg@ @1"+
                            "Qual é a taxa mensal de juros simples aplicada na compra dessa televisão quando parcelada em "+
                            "15 vezes? ";
                    qA = "1,5%. ";
                    qB = "2,0%. ";
                    qC = "13%. ";
                    qD = "30%. ";
                    resolucao = ""; break;
                case 23:

                    sourceString = "Observe a circunferência de centro (0, 0) representada no plano cartesiano abaixo.@2 "+
                            "@cimg mt520231 cimg@ @1"+
                            "A equação dessa circunferência é ";
                    qA = "x2 "+
                            " + y2 "+
                            " = 0. ";
                    qB = "x2 "+
                            " + y2 "+
                            " = 5. ";
                    qC = "x2 "+
                            " + y2 "+
                            " = 20. ";
                    qD = "x2 + y2 = 25";
                    resolucao = ""; break;

                case 24:

                    sourceString = "Um jogador sacou uma peteca que descreveu uma trajetória parabólica, como mostra o gráfico abaixo.@2 "+
                            "@cimg mt520241 cimg@"+
                            "@1Nesse saque, qual foi a altura máxima, em metros, atingida por essa peteca? ";
                    qA = "1. ";
                    qB = "2. ";
                    qC = "3. ";
                    qD = "4. ";
                    resolucao = ""; break;
                case 25:

                    sourceString = "O gráfico abaixo mostra o resultado de uma pesquisa sobre carreira profissional.@2 "+
                            "@cimg mt520251 cimg@ @1"+
                            "Se essa pesquisa foi feita com 8 000 pessoas, quantas pessoas responderam que escolheriam outra "+
                            "carreira? ";
                    qA = "1 600. ";
                    qB = "400. ";
                    qC = "72. ";
                    qD = "20. ";
                    resolucao = ""; break;
                case 26:

                    sourceString = "No plano cartesiano abaixo, estão destacados os pontos F, G e H.@2 "+
                            "@cimg mt520261 cimg@ @1"+
                            "As coordenadas dos pontos F, G e H são, respectivamente, ";
                    qA = "(3, 4); (2, – 3) e (– 2, 1). ";
                    qB = "(4, 3); (– 3, – 2) e (– 1, – 2). ";
                    qC = "(4, 3); (– 3, 2) e (1, – 2 ). ";
                    qD = "(4, 3); (3, 2) e (1, 2). ";
                    resolucao = ""; break;
                case 27:

                    sourceString = "No quadro abaixo, está representada a altura de 10 modelos candidatos a uma vaga como garoto@2 "+
                            "propaganda em uma campanha.@1"+
                            "@cimg mt520271 cimg@"+
                            "@1Qual é a moda e a mediana, em metros, das alturas desses modelos, respectivamente? ";
                    qA = "1,64 e 1,66. ";
                    qB = "1,64 e 1,77. ";
                    qC = "1,86 e 1,77. ";
                    qD = "1,86 e 1,66. ";
                    resolucao = ""; break;
                case 28:

                    sourceString = "Ao sair para uma viagem, Paulo encheu o tanque de combustível de seu carro e, durante essa viagem, o "+
                            "volume de combustível variou segundo o gráfico abaixo.@2 "+
                            "@cimg mt520281 cimg@ @1"+
                            "A expressão que fornece o volume de combustível do carro de Paulo, em função da distância percorrida é ";
                    qA = "@cimg mt52028a cimg@";
                    qB = "@cimg mt52028b cimg@";
                    qC = "y = 32x + 14. ";
                    qD = "y = 32x + 46. ";
                    resolucao = ""; break;
                case 29:

                    sourceString = "Qual é a fração geratriz da dízima periódica 3,333...? ";
                    qA = "3/33";
                    qB = "1/3";
                    qC = "33/10. ";
                    qD = "10/3";
                    resolucao = ""; break;
                case 30:

                    sourceString = "Em um torneio de futebol, a quantidade de partidas (p) varia de acordo com a quantidade de equipes (n) "+
                            "que participam do torneio, conforme mostra o quadro abaixo.@2 "+
                            "@cimg mt520301 cimg@ @1"+
                            "Em um torneio com 240 partidas, a quantidade n de equipes participantes é igual a ";
                    qA = "15. ";
                    qB = "16. ";
                    qC = "30. ";
                    qD = "56. ";
                    resolucao = ""; break;
            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {
                case 1:

                    sourceString = "A imagem abaixo representa uma teia alimentar marinha.@2 "+
                            "@cimg cn520011 cimg@ "+

                            "@2<small>Disponível em: http://www.portalsaofrancisco.com.br/alfa/cadeia-alimentar/imagens/cadeia-alimentar-041-g.jpg. Acesso em: 1 set. 2011. Adaptado.</small> @2 "+
                            "Os organismos dessa teia que recebem maior quantidade de energia proveniente da fotossíntese ";
                    qA = "competem com a baleia azul pelo seu alimento. ";
                    qB = "são predadores de lulas e de pequenos peixes. ";
                    qC = "ocupam o primeiro nível trófico, sendo carnívoros. ";
                    qD = "servem de alimento para os pinguins. ";
                    resolucao = ""; break;
                case 2:

                    sourceString = "A imagem abaixo representa o ciclo do nitrogênio na natureza.@2 "+
                            "@cimg cn520021 cimg@"+

                            "@1O nitrogênio da proteína animal retorna ao ambiente, a partir do processo de ";
                    qA = "absorção por bactérias fixadoras. ";
                    qB = "decomposição por bactérias e fungos. ";
                    qC = "desnitrificação por bactérias presentes no solo. ";
                    qD = "nitrificação pelas bactérias Nitrossomas e Nitrobacter. ";
                    resolucao = ""; break;
                case 3:

                    sourceString = "A imagem abaixo representa uma molécula presente em todos os seres vivos.@2 "+
                            "@cimg cn520031 cimg@ @1"+

                            "<small>Disponível em: http://www.dicasdiarias.com/wp-content/uploads/2011/04/dieta-do-dna-como-funciona.jpg. Acesso em: 18 set. 2011.</small> @2 "+
                            "Essa molécula possui a ";
                    qA = "base nitrogenada uracila. ";
                    qB = "capacidade de autoduplicação. ";
                    qC = "guanina pareada com a timina. ";
                    qD = "ribose como seu açúcar. ";
                    resolucao = ""; break;
                case 4:

                    sourceString = "A imagem abaixo mostra a partenogênese em abelhas.@2 "+
                            "@cimg cn520041 cimg@ @1"+
                            "Nesse tipo de reprodução, ";
                    qA = "a operária que resulta do desenvolvimento do ovo é haploide. ";
                    qB = "a rainha apresenta menor variabilidade genética do que o zangão. ";
                    qC = "os gametas se unem para gerar abelhas fêmeas e machos. ";
                    qD = "os zangões possuem a mesma ploidia dos gametas de sua mãe. ";
                    resolucao = ""; break;
                case 5:

                    sourceString = "A imagem abaixo mostra diferentes seres vivos existentes na natureza.@2 "+
                            "@cimg cn520051 cimg@ @1"+

                            "Qual é a característica comum a todos os animais? ";
                    qA = "Capacidade de locomoção. ";
                    qB = "Constituição pluricelular. ";
                    qC = "Nutrição autotrófica. ";
                    qD = "Respiração pulmonar. ";
                    resolucao = ""; break;
                case 6:

                    sourceString = "Um casal, ambos heterozigotos para o albinismo e de visão normal, possui uma criança com a pele "+
                            "pigmentada, porém míope. Qual é a probabilidade desse casal ter uma criança albina e míope? ";
                    qA = "1/16 ";
                    qB = "3/16 ";
                    qC = "6/16 ";
                    qD = "9/16 ";
                    resolucao = ""; break;
                case 7:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Reservatórios urbanos, como a Lagoa da Pampulha, são sistemas especialmente sujeitos a "+
                            "impactos antrópicos. Efluentes industriais e domésticos levam a um aumento no processo de "+
                            "eutrofização destes ecossistemas, com deterioração da qualidade da água e necessidade de "+
                            "medidas cada vez mais drásticas para a sua recuperação e conservação.@1"+
                            "@1<small>Disponível em: www.ecologia.icb.ufmg.br/~rpcoelho/art_pdf/res_75a.pdf. Acesso em: 1 set. 2010. Adaptado.</small> @2 "+
                            "Na Lagoa da Pampulha, devido ao processo citado, pode ocorrer ";
                    qA = "aumento da concentração de oxigênio na água. ";
                    qB = "aumento das taxas de decomposição bacteriana. ";
                    qC = "diminuição da taxa de mortalidade dos peixes. ";
                    qD = "diminuição da concentração de matéria orgânica. ";
                    resolucao = ""; break;
                case 8:

                    sourceString = "O gráfico abaixo representa as variações nas taxas de hormônios durante o ciclo menstrual.@2 "+
                            "@cimg cn520081 cimg@ @1"+
                            "AMABIS, J.M. & MARTHO, G. R. Biologia dos organismos. São Paulo: Moderna, 1999. p. 544.@1"+

                            "Sobre esse gráfico, são feitas as seguintes afirmativas:@2"+

                            "I. O x representa o estrógeno que promove o desenvolvimento do folículo ovariano.@1"+

                            "II. O y representa a progesterona cuja concentração no sangue aumenta depois da ovulação. @1"+

                            "III. Se ocorrer uma gravidez, a taxa de progesterona se manterá elevada. @1"+

                            "IV. A menstruação ocorre quando a concentração dos hormônios cai. @1 "+

                            "V. Durante o período fértil, a concentração de estrógeno diminuirá.@1"+

                            "@1Estão corretas apenas as afirmativas: ";
                    qA = "I, II, III. ";
                    qB = "I, II, IV. ";
                    qC = "II, III, IV. ";
                    qD = "III, IV, V. ";
                    resolucao = ""; break;
                case 9:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Atualmente, compreende-se que um indivíduo ou espécie adaptada ao meio é aquele "+
                            "cuja mutação genética aleatória, ou não, foi-lhe favorável o suficiente para que o ambiente o "+
                            "selecionasse natural ou artificialmente, permitindo sua sobrevivência.@1"+
                            "@1<small>Disponível em: http://polegaropositor.com.br/adaptacao-evolucao-post-scriptum/. Acesso em: 16 set. 2011.</small> @2 "+

                            "Em relação às adaptações morfológicas de diferentes seres vivos, são feitas as seguintes afirmativas:@2"+


                            "I. Os morcegos, por serem animais diurnos, orientam-se pelos batimentos das asas nos obstáculos "+
                            "encontrados.@1"+

                            "II. As pererecas apresentam discos adesivos em seus dedos, o que lhes conferem a capacidade "+
                            "de escalar a vegetação.@1"+

                            "III. Nos cactos, as folhas são reduzidas a espinhos para diminuição da superfície de evaporação. @1"+

                            "IV. Nos ossos pneumáticos das aves, existem sacos aéreos que são extensão do pulmão e servem "+
                            "para aumentar o peso, dificultando o voo.@1"+

                            "@1Estão corretas apenas as afirmativas: ";
                    qA = "I e II. ";
                    qB = "II e III. ";
                    qC = "III e IV. ";
                    qD = "I e III. ";
                    resolucao = ""; break;
                case 10:

                    sourceString = "A imagem abaixo representa o ciclo de vida de um protozoário que causa uma determinada doença.@2 "+
                            "@cimg cn520101 cimg@ @1"+
                            "@2<small>Disponível em: http://3.bp.blogspot.com/-tfN39q2JMPg/TZ513nhkYqI/AAAAAAAAAMM/Tl7ImLVwhSM/s1600/.jpg. Acesso em: 19 set. 2011. "+
                            "Adaptado.</small> @2"+
                            "Uma medida preventiva contra essa doença é a ";
                    qA = "eliminação do lixo amontoado nos ambientes. ";
                    qB = "eliminação do vetor somente na fase adulta. ";
                    qC = "limpeza diária do pelo dos cães com a doença. ";
                    qD = "vacinação em massa da população. ";
                    resolucao = ""; break;
                case 11:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A regulação da função renal relaciona-se basicamente com a regulação da quantidade de "+
                            "líquidos do corpo. Havendo necessidade de reter água no interior do corpo, a urina fica mais "+
                            "concentrada, em função da maior reabsorção de água; havendo excesso de água no corpo, a "+
                            "urina fica menos concentrada, em função da menor reabsorção de água.@1"+
                            "@1<small>Disponível em: http://www.afh.bio.br/excret/excret1.asp. Acesso em: 18 set. 2011.</small> @2 "+
                            "O principal agente regulador do equilíbrio hídrico no corpo humano é o hormônio ";
                    qA = "adrenalina, produzido nas adrenais. ";
                    qB = "antidiurético, produzido no hipotálamo. ";
                    qC = "somatotrófico, produzido na hipófise. ";
                    qD = "tiroxina, produzido na tireoide. ";
                    resolucao = ""; break;
                case 12:

                    sourceString = "O esquema abaixo representa o ciclo reprodutivo de um grupo de plantas.@2 "+
                            "@cimg cn520121 cimg@"+
                            "@1Nesse ciclo, a meiose ocorre para formar ";
                    qA = "o indivíduo diploide. ";
                    qB = "o indivíduo haploide. ";
                    qC = "os esporos. ";
                    qD = "os gametas. ";
                    resolucao = ""; break;
                case 13:

                    sourceString = "A silicose é uma doença causada pela inalação prolongada de pó de sílica ou de seus derivados, afetando, "+
                            "principalmente, os trabalhadores que se expõem a esse produto como mineiros, pedreiros e operários de "+
                            "fábricas de vidros e fundições.@1"+
                            "@1Essa doença provoca ";
                    qA = "alterações no tecido pulmonar. ";
                    qB = "cegueira no período noturno. ";
                    qC = "paralisia dos membros inferiores. ";
                    qD = "sangramento das gengivas. ";
                    resolucao = ""; break;
                case 14:

                    sourceString = "A taxa fotossintética é influenciada por diferentes fatores. O gráfico abaixo mostra a influência de um@2 "+
                            "desses fatores na taxa de fotossíntese de plantas do cerrado.@1"+
                            "@cimg cn520141 cimg@ @1"+
                            "O fator representado pelo gráfico é ";
                    qA = "a variação da luminosidade. ";
                    qB = "a variação da temperatura. ";
                    qC = "o percentual de gás carbônico. ";
                    qD = "o percentual de gás oxigênio. ";
                    resolucao = ""; break;
                case 15:

                    sourceString = "Associe as duas colunas, relacionando as células do tecido conjuntivo propriamente dito com suas "+
                            "respectivas funções.@1"+
                            "@cimg cn520151 cimg@ "+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "1, 2, 3, 4. ";
                    qB = "2, 3, 4, 1. ";
                    qC = "3, 4, 1, 2. ";
                    qD = "4, 1, 2, 3. ";
                    resolucao = ""; break;
                case 16:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Um dos grandes mistérios da ciência é a origem dos seres vivos. Acredita-se que a vida na Terra "+
                            "surgiu há cerca de 3,5 bilhões de anos. Na Terra primitiva, deveria haver as moléculas orgânicas "+
                            "simples capazes de formar um ser vivo. Segundo o russo Alexander Ivanovich Oparin (1894 – 1980) "+
                            "e o inglês John Haldane (1892 – 1964), nos oceanos primitivos existia uma sopa orgânica, rica em "+
                            "aminoácidos e proteínas, de onde surgiram as primeiras e simples criaturas vivas.@1"+
                            "@1<small>Disponível em: http://www.planetabio.com/origem.html. Acesso em: 20 set. 2011.</small> @2 "+
                            "Essas primeiras e simples criaturas vivas ";
                    qA = "faziam fermentação e liberavam CO2 "+
                            " para a atmosfera. ";
                    qB = "produziam seu próprio alimento pela fotossíntese. ";
                    qC = "promoviam o aumento gradual do O2 "+
                            " atmosférico. ";
                    qD = "usavam o oxigênio da atmosfera primitiva para respirar. ";
                    resolucao = ""; break;
                case 17:

                    sourceString = "No esquema abaixo, X representa um processo de obtenção de energia pelos seres vivos.@2 "+
                            "@cimg cn520171 cimg@ @1"+
                            "Durante esse processo, ocorre ";
                    qA = "liberação, para o ambiente, do oxigênio que é usado como reagente na reação. ";
                    qB = "produção de energia em forma de ATP para ser usada pelo organismo. ";
                    qC = "quebra da glicose em presença de oxigênio na fase denominada glicólise. ";
                    qD = "uso do gás carbônico para a produção de carboidratos na fase escura. ";
                    resolucao = ""; break;

                case 18:

                    sourceString = "O uso de gráficos é muito comum para representar movimentos. Qual gráfico abaixo pode ser usado para  "+
                            "representar um movimento com aceleração nula? ";
                    qA = "@cimg cn52018a cimg@";
                    qB = "@cimg cn52018b cimg@";
                    qC = "@cimg cn52018c cimg@";
                    qD = "@cimg cn52018d cimg@";
                    resolucao = ""; break;
                case 19:

                    sourceString = "Uma panela vermelha com tampa branca foi colocada em um ambiente totalmente desprovido de luz.@1"+
                            "Nesse ambiente, ao acender uma lâmpada que emite exclusivamente luz monocromática amarela, a "+
                            "panela e a tampa serão vistas com as cores, respectivamente, ";
                    qA = "preta e amarela. ";
                    qB = "preta e preta. ";
                    qC = "vermelha e amarela. ";
                    qD = "vermelha e branca. ";
                    resolucao = ""; break;
                case 20:

                    sourceString = "Com a intenção de reformar sua fábrica de embalagens plásticas, Paulo pensou em utilizar uma forma "+
                            "de energia renovável. Solicitou de uma empresa especializada no assunto um estudo de viabilidades.@1"+
                            "Baseando-se nas condições de instalação, localização e estrutura da fábrica, a empresa sugeriu algumas "+
                            "formas de energia para abastecê-la.@1"+
                            "@1Qual forma de energia sugerida a Paulo é uma fonte não renovável? ";
                    qA = "Energia fotovoltaica. ";
                    qB = "Energia geotérmica. ";
                    qC = "Energia da biomassa. ";
                    qD = "Energia do gás natural. ";
                    resolucao = ""; break;
                case 21:

                    sourceString = "Quando um corpo de massa m se encontra em movimento, ele possui energia cinética. Essa forma de "+
                            "energia pode ser expressa em várias unidades.@1"+
                            "@1Qual unidade representa a energia no SI? ";
                    qA = "J/s ";
                    qB = "N.m ";
                    qC = "kg.m ";
                    qD = "kW.h ";
                    resolucao = ""; break;
                case 22:

                    sourceString = "Um campo magnético uniforme B está representado pelas linhas de indução magnéticas na figura abaixo.@2 "+
                            "Colocando-se um ímã imerso neste campo, ele entrará em equilíbrio com o campo.@1"+
                            "@cimg cn520221 cimg@ @1"+
                            "Adotando N para o polo norte do ímã e S para o polo sul, qual a posição de equilíbrio encontrada por ele "+
                            "quando imerso nesse campo magnético? ";
                    qA = "@cimg cn52022a cimg@";
                    qB = "@cimg cn52022b cimg@";
                    qC = "@cimg cn52022c cimg@";

                    qD = "@cimg cn52022d cimg@";
                    resolucao = ""; break;

                case 23:

                    sourceString = "A imagem abaixo representa uma onda se propagando da esquerda para a direita com velocidade de 120 m/s.@2 "+
                            "@cimg cn520231 cimg@ @1"+
                            "Qual é a frequência dessa onda? ";
                    qA = "12 Hz. ";
                    qB = "24 Hz. ";
                    qC = "30 Hz. ";
                    qD = "60 Hz. ";
                    resolucao = ""; break;
                case 24:

                    sourceString = "Rubens encheu uma bola de soprar com ar de seus pulmões e, em seguida, a colocou no congelador.@1"+
                            "Após esperar algum tempo para que o sistema entrasse em equilíbrio, ele abriu a porta do congelador.@1"+
                            "@1Considerando o ar um gás ideal, assim que abriu o congelador, Rubens observou que o volume da bola ";
                    qA = "aumentou, pois o ar realizou trabalho sobre o meio. ";
                    qB = "aumentou, pois o meio realizou trabalho sobre o ar. ";
                    qC = "reduziu, pois o ar realizou trabalho sobre o meio. ";
                    qD = "reduziu, pois o meio realizou trabalho sobre o ar. ";
                    resolucao = ""; break;
                case 25:

                    sourceString = "A miopia é uma deficiência visual muito comum e pode ser provocada por um excesso de curvatura da "+
                            "córnea ou também por um alongamento do olho humano na direção do eixo óptico. Devido a isso, o olho "+
                            "míope tem dificuldades de enxergar com nitidez pontos mais distantes.@1"+
                            "@1Para enxergar melhor, uma pessoa míope deve usar lentes ";
                    qA = "convergentes que produzem, de objetos mais distantes, uma imagem virtual mais próxima. ";
                    qB = "convergentes que produzem, de objetos mais próximos, uma imagem virtual mais distante. ";
                    qC = "divergentes que produzem, de objetos mais distantes, uma imagem virtual mais próxima. ";
                    qD = "divergentes que produzem, de objetos mais próximos, uma imagem virtual mais distante. ";
                    resolucao = ""; break;
                case 26:

                    sourceString = "Sobre um corpo, inicialmente em repouso, é aplicada uma força resultante horizontal que o faz entrar em "+
                            "movimento.@1"+
                            "@1É correto afirmar que o trabalho realizado ";
                    qA = "pela força fez o corpo adquirir energia. ";
                    qB = "pelo corpo o fez adquirir energia. ";
                    qC = "sobre a força fez o corpo perder energia. ";
                    qD = "sobre o corpo o fez perder energia. ";
                    resolucao = ""; break;
                case 27:

                    sourceString = "Duas cargas puntiformes, " +
                            "Q@_1_@ = 4,0 x 10@sp–6sp@ C " +
                            "e " +
                            "Q@_2_@ = 6,0 x 10@sp–6sp@ C, " +
                            "no vácuo, onde " +
                            "K@_0_@ = 9,0 x 10@sp9sp@ "+
                            " (SI), estão "+
                            "separadas pela distância de 2 m.@1"+
                            "@1Qual a força elétrica que uma faz sobre a outra? ";
                    qA = "Força de atração de 5,4x10@sp–2sp@ N. ";
                    qB = "Força de atração de 10,8x10@sp–2sp@ N. ";
                    qC = "Força de repulsão de 5,4x10@sp–2sp@ N. ";
                    qD = "Força de repulsão de 10,8x10@sp–2sp@ N. ";
                    resolucao = ""; break;
                case 28:

                    sourceString = "João quer montar um circuito elétrico contendo 4 lâmpadas idênticas. Ele pegou uma pilha, alguns fios "+
                            "condutores e confeccionou um circuito fechado, em que as lâmpadas acenderam.@1"+
                            "@1Em qual circuito as lâmpadas ficarão acesas com o brilho fraco e igual? ";

                    qA = "@cimg cn52028a cimg@";

                    qB = "@cimg cn52028b cimg@";
                    qC = "@cimg cn52028c cimg@";
                    qD = "@cimg cn52028d cimg@";
                    resolucao = ""; break;

                case 29:

                    sourceString = "Uma substância pura, ao receber calor de uma fonte, pode sofrer variação de temperatura ou mudança "+
                            "de estado físico. A variação da temperatura depende do calor específico da substância, e a mudança de "+
                            "estado, do seu calor latente de mudança de fase.@1"+
                            "@1O calor específico de um corpo é a quantidade de ";
                    qA = "calor recebido por cada grama da substância na alteração de sua temperatura. ";
                    qB = "calor necessário por unidade de massa para alterar uma unidade de sua temperatura. ";
                    qC = "energia necessária para alterar a temperatura de toda a substância para cada grau Celsius. ";
                    qD = "energia necessária para aumentar a temperatura de toda a substância para cada grau Celsius. ";
                    resolucao = ""; break;
                case 30:

                    sourceString = "Um fotoelétron do zinco é emitido com energia cinética máxima de 4,2 eV. Sabendo-se que a função "+
                            "trabalho do zinco é 4,3 eV e que a constante de Planck é h = 4,14 x 10@sp–15sp@ eV.s, qual é a frequência "+
                            "aproximada do fóton incidente que provocou a emissão desse fotoelétron? ";
                    qA = "1,04 x 10@sp15sp@ Hz. ";
                    qB = "1,01 x 10sp15sp@ Hz. ";
                    qC = "2,05 x 10sp15sp@ Hz. ";
                    qD = "4,36 x 10sp15sp@ Hz. ";
                    resolucao = ""; break;
            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {

                case 1:

                    sourceString = "A imagem abaixo mostra a Hospedaria dos Imigrantes construída em São Paulo, em 1885, para receber "+
                            "os imigrantes que chegavam para trabalhar nas lavouras ou indústrias paulistas.@1"+
                            "@cimg ch520011 cimg@"+
                            "@1<small>Disponível em: http://www.aprenda450anos.com.br/450anos/vila_metropole/2-2_hospedaria_imigrantes.asp. Acesso em: 3 set. 2011.</small> @2 "+
                            "A maioria desses imigrantes veio da ";
                    qA = "Alemanha. ";
                    qB = "Espanha. ";
                    qC = "Holanda. ";
                    qD = "Itália. ";
                    
                    resolucao = "Neste ano, o Brasil já estava passando por um processo de abolição da escravidão, " +
                            "pois o tráfico de escravos em navios negreiros já estava proibído, portanto os senhores " +
                            "de terras necessitavam de mão de obra. @1" +
                            "Neste mesmo ano, a Itália estava passando por uma grande crise de desemprego, onde " +
                            "muitos italianos estavam emigrando para outros países, principalmente para as Américas. @1" +
                            "Os senhores de terras viram uma oportunidade de pagar pouco pela mão de obra italiana, " +
                            "e criou a Hospedaria dos Imigrantes, para que esses italianos desempregados chegassem ao Brasil " +
                            "e pudessem trabalhar nas lavouras ou indústrias paulistas."; break;
                case 2:

                    sourceString = "A charge abaixo retrata o golpe de 15 de novembro de 1889.@2 "+
                            "@cimg ch520021 cimg@ @1"+
                            "<small>Disponível em: http://ateliedehistoria.blogspot.com/2009/10/desafio-atividades-o-exercicio-consiste.html. Acesso em: 3 set. 2011.</small> @2 "+
                            "Esse acontecimento histórico relaciona-se à ";
                    qA = "abolição da escravidão. ";
                    qB = "proclamação da República. ";
                    qC = "revolta da Armada. ";
                    qD = "revolta Federalista. ";
                    resolucao = "Dia 15 de novembro é feriado da proclamação da república, justamente porque em 15 de " +
                            "novembro de 1889 ela foi proclamada. " +
                            ""; break;
                case 3:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Ao dominar os moradores de uma região pela força do dinheiro e das armas, o coronel "+
                            "estabelecia um “curral eleitoral” subordinado às suas decisões no tempo das eleições. Nessa "+
                            "época, o coronel indicava qual o candidato cada um de seus “apadrinhados” deveria votar. Essa "+
                            "prática, mais conhecida como “voto de cabresto”, era também acompanhada por outra série de "+
                            "fraudes eleitorais. Quando julgava necessário, um coronel poderia alterar o resultado de uma "+
                            "eleição fraudando a contagem dos votos ou incluindo o voto de pessoas que não existiam ou "+
                            "já estariam mortas. Através desse conjunto de ações, uma mesma família poderia manter-se "+
                            "durante anos seguidos no controle político de uma região. Em troca de favores políticos, esses "+
                            "coronéis garantiam a eleição de representantes que controlavam o cenário político nacional.@1"+
                            "@1<small>Disponível em: http://mundoeducacao.uol.com.br/historiadobrasil/coronelismo.htm. Acesso em: 11 out. 2011.</small> @2 "+
                            "Esse texto refere-se a um período histórico denominado ";
                    qA = "Ditadura Militar. ";
                    qB = "Estado Novo. ";
                    qC = "República Oligárquica. ";
                    qD = "Segundo Império. ";
                    resolucao = "Oligarquia é um regime político em que o poder é exercido por um pequeno grupo de pessoas, pertencentes ao mesmo partido, classe ou família. @1" +
                            "" +
                            "Quando o texto diz que haviam voto de cabresto, manipulação dos dados da eleição para que uma messma família " +
                            "pudesse se manter durante anos seguintes no controle político de uma região, ele se refere à República Oligárqica." +
                            "" +
                            ""; break;
                case 4:

                    sourceString = "A imagem abaixo retrata o anúncio do Estado Novo pelo presidente Getúlio Vargas.@2 "+
                            "@cimg ch520041 cimg@ @1"+
                            "@1<small>Disponível em: http://www.jblog.com.br/hojenahistoria.php?itemid=5790. Acesso em: 9 set. 2011.</small> @2 "+
                            "O Estado Novo (1937-1945) foi um período em que o Brasil foi governado de forma ";
                    qA = "democrática. ";
                    qB = "ditatorial. ";
                    qC = "liberal. ";
                    qD = "socialista. ";

                    resolucao = "Governo ditatorial se forma pela vontade de um ditador e seus simpatizantes; " +
                            "o povo em nada participa e em nada pode opinar. A função do povo no governo ditatorial é apenas trabalhar " +
                            "para pagar impostos exorbitantes e simular que tudo está perfeito. O lema desse " +
                            "tipo de governo é obrigar os cidadãos a amarem a ditadura ou pelo contrário serem expatriados. ";
                    break;
                case 5:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Os ingleses cultivavam o ópio na Índia e o vendiam em grandes quantidades na China. Com o "+
                            "abuso do consumo do ópio, o governo chinês proibiu tal comércio, que, até então, era a principal fonte "+
                            "de lucro para a Inglaterra na região. Logo, o tráfico ilegal da droga tomou proporções alarmantes, "+
                            "forçando o imperador chinês a combatê-lo energicamente. O estopim da guerra foi o assassinato de "+
                            "um súdito chinês por marinheiros ingleses embriagados. O comissário imperial ordenou a expulsão "+
                            "de todos os ingleses de Cantão, cidade onde era mais forte o contrabando do ópio. Era o fim das "+
                            "esperanças da expansão comercial. Imediatamente a Inglaterra respondeu com o bombardeamento "+
                            "de Cantão, em 1939. Os modestos juncos chineses, barcos movidos à vela, não podiam oferecer "+
                            "grande resistência à frota inglesa. As forças britânicas tomaram pontos importantes da costa "+
                            "chinesa, incluindo Hong Kong e Xangai, ameaçando Pequim. Vendo-se praticamente derrotados, "+
                            "os chineses assinam, em 1942, o Tratado de Nanquim, dando fim à guerra.@1"+
                            "@1<small>Disponível em: http://www.portalsaofrancisco.com.br/alfa/guerra-do-opio/guerra-do-opio.php. Acesso em: 11 out. 2011.</small> @2 "+
                            "Pelo Tratado de Nanquim, a China ";
                    qA = "cedeu a ilha de Hong Kong para a Inglaterra até julho de 1997. ";
                    qB = "garantiu o direito de livre comércio em todos os seus portos. ";
                    qC = "recebeu indenização pelo bombardeamento de Cantão. ";
                    qD = "recuperou os portos que estavam em poder dos ingleses. ";

                    resolucao = "O Tratado de Nanquim continha 12 artigos, dentro os quais se destacavam 2: @2" +
                            "" +
                            "Artigo 2º - Determinava a abertura de cinco cidades chinesas - Cantão, Fuzhou, Xiamen, Ningbo e Xangai - para a moradia de súditos britânicos, além da abertura de tratados nessas mesmas cartas. @2" +
                            "@bArtigo 3º - A possessão de Hong Kong por tempo indeterminado pela rainha Vitória e seus sucessores.b@"; break;
                case 6:

                    sourceString = "Leia o texto abaixo sobre a independência da Índia.@2 "+
                            "A partir do século XVII, a Índia começou a ser colonizada pelos ingleses. Na época, a Índia "+
                            "correspondia à área dos atuais Paquistão, Bangladesh e da própria Índia. A partir daí, aconteceram "+
                            "muitos movimentos de resistência à dominação colonial, todos reprimidos. Após a Primeira Guerra "+
                            "Mundial, as lutas pela libertação contaram com a ajuda do pacifista hindu Mahatma Gandhi. Líder "+
                            "do movimento de independência, Gandhi introduziu uma inovação radical nos meios de ação "+
                            "política: a resistência pacífica à dominação colonial.@1"+
                            "@1<small>Disponível em: http://viagempelahistoriadahumanidade.blogspot.com/2011/08/resistencia-pacifica-gandhi.html. Acesso em: 11 out. 2011.</small> @2 "+
                            "No processo de descolonização da Índia, Gandhi propunha o ";
                    qA = "acirramento das divergências religiosas. ";
                    qB = "ataque aos grupos rivais ingleses, favoráveis à política inglesa. ";
                    qC = "boicote aos produtos ingleses e ao pagamento de impostos. ";
                    qD = "combate ao hinduísmo e a imposição do budismo. ";
                    resolucao = "Gandhi abalou as estruturas da dominação britânica através de campanhas " +
                            "sucessivas contra o pagamento de impostos e contra o consumo de produtos " +
                            "manufaturados ingleses, entre outros."; break;
                case 7:

                    sourceString = "Leia o texto abaixo sobre o livro Mein Kampf de Hitler.@2 "+
                            "O livro na verdade está dividido em dois volumes, sendo o primeiro originalmente publicado "+
                            "em 1925 e o segundo em 1926. Com um discurso e narrativa próprios, o texto estava marcado "+
                            "pelo radicalismo e pela violência, buscando, ao mesmo tempo, responder perguntas que afligiam "+
                            "à sociedade alemã, entre elas uma crucial: a razão da perda da guerra, a qual atribuiu aos "+
                            "judeus e aos comunistas, que seriam inimigos do povo alemão e de seu progresso. Pregava "+
                            "ainda a volta do império e uma retomada no sentimento de orgulho alemão, além de um ódio "+
                            "pelo liberalismo e sua consequente modernidade democrática. Curioso notar que seu livro não "+
                            "dá uma descrição pormenorizada do que seria o nacional-socialismo, ao mesmo tempo que seu "+
                            "movimento ia estabelecendo laços com empresários e financistas.@1"+
                            "@1<small>Disponível em: http://www.infoescola.com/livros/minha-luta/. Acesso em: 11 out. 2011.</small> @2 "+
                            "Em seu livro, Hitler defende ";
                    qA = "a extinção dos partidos políticos e das ideias socialistas. ";
                    qB = "a raça pura ariana e o combate ao liberalismo e ao socialismo. ";
                    qC = "o liberalismo político e a necessidade de conquistas territoriais. ";
                    qD = "o socialismo e a necessidade dos alemães se unirem em um império. ";
                    resolucao = "Hitler queria exterminar todas as \"raças humanas\" que não fossem a ariana (raça ariana é " +
                            "um conceito surgido no século 19 e que hoje está desacreditado. A raça ariana seria supostamente a linhagem ‘mais pura’ dos seres humanos, constituída apenas por indivíduos altos, fortes, claros e inteligentes, representando assim, de acordo com critérios arbitrários, uma raça superior às demais. @1" +
                            "Além do mais, ele era totalmente contra ao liberalismo (doutrina baseada na defesa da liberdade individual, nos campos econômico, político, religioso e intelectual do poder estatal) e ao socialismo (distribuir a renda entre os cidadãos até que não houvesse diferença entre classes sociais e todos os serviços fossem coletivo). " +
                            "" +
                            ""; break;
                case 8:

                    sourceString = "Leia o texto abaixo, que trata de um conflito ocorrido no período da Guerra Fria.@2 "+
                            "Durante o governo de Batista, começou a se organizar um grande movimento guerrilheiro "+
                            "nacionalista, liderado por Fidel Castro. A proposta política de Fidel era derrubar o ditador Batista e "+
                            "acabar com a corrupção. [...] As ideias dos revolucionários, conquistaram, sobretudo, o apoio dos "+
                            "camponeses e operários, que sofriam com salários baixos, desemprego, falta de terra, doenças e "+
                            "analfabetismo. [...] Os revolucionários aumentavam em número e recebiam o apoio da população "+
                            "rural e urbana. Os guerrilheiros desceram a serra e se espalharam pelo país, abrindo uma frente de "+
                            "guerra contra o exército de Batista. Nas cidades, grupos de apoio atacavam a polícia e as instalações "+
                            "do exército. Em 1 de janeiro de 1959, comandados por Fidel Castro, Camilo Cienfuengos e Raul "+
                            "Castro, os guerrilheiros tomaram Havana e outras cidades importantes.@1"+
                            "@1<small>Disponível em: http://www.historiamais.com/revolucaocubana.htm. Acesso em: 11 out. 2011.</small> @2 "+
                            "Esse texto refere-se à ";
                    qA = "Guerra da Coreia. ";
                    qB = "Guerra do Vietnã. ";
                    qC = "Revolução Chinesa. ";
                    qD = "Revolução Cubana. ";
                    resolucao = "A Revolução Cubana foi um movimento popular, que derrubou o governo do presidente Fulgêncio Batista, em janeiro de 1959. Com o processo revolucionário foi implantado em Cuba o sistema socialista, com o governo sendo liderado por Fidel Castro. @1" +
                            "Com as mensagens revolucionárias, os guerrilheiros conseguiram o apoio de muitas pessoas. Isto ocorreu, pois havia muitos camponeses e operários desiludidos com o governo de Fulgêncio Batista e com as péssimas condições sociais (salários baixos, desemprego, falta de terras, analfabetismo, doenças). Muitos cubanos das cidades e do campo começaram a entrar na guerrilha, aumentando o número de combatentes e conquistando vitórias em várias cidades. O exército cubano estava registrando muitas baixas e o governo de Batista sentia o fortalecimento da guerrilha."; break;
                case 9:

                    sourceString = "Leia o texto abaixo sobre o materialismo dialético e o materialismo histórico.@2 "+
                            "Em 1848, os pensadores Karl Marx e Friedrich Engels [...], por meio do chamado materialismo "+
                            "histórico, compreenderam que as sociedades humanas viabilizam suas relações a partir da "+
                            "forma pela qual os bens de produção são distribuídos entre os seus integrantes. Dessa forma, "+
                            "as condições socioeconômicas (infraestrutura) acabavam determinando como a cultura, o regime "+
                            "político, a moral e os costumes (superestrutura) se configurariam. [...] o pensamento marxista alega "+
                            "que o materialismo dialético seria uma das molas propulsoras fundamentais que alimentam as "+
                            "transformações históricas [...] e chega à conclusão de que a história das sociedades humanas se "+
                            "dá por meio da luta de classes.@1"+
                            "@1<small>Disponível em: http://www.brasilescola.com/sociologia/conceitos-marxismo.htm. Acesso em: 11 out. 2011. Adaptado.</small> @2 "+
                            "O materialismo dialético, citado nesse texto, é a base do socialismo ";
                    qA = "científico. ";
                    qB = "cristão. ";
                    qC = "real. ";
                    qD = "utópico. ";
                    resolucao = "O socialismo científico, também chamado de socialismo marxista, é uma teoria política, social e econômica. Ele foi criado em 1840 por Karl Marx e Friedrich Engels. @1" +
                            "Como o próprio nome indica, esse modelo esteve baseado na análise científica e crítica do sistema capitalista. @1" +
                            "O objetivo dessa doutrina era a transformação da sociedade a partir de uma análise profunda de suas relações econômicas, políticas e sociais.\n" +
                            "Marx faz uma análise do sistema capitalista e aborda diversos temas como: @2" +
                            "- a luta de classes @1" +
                            "- a mais valia @1" +
                            "- a divisão social do trabalho @1" +
                            "- a produção do capital"; break;
                case 10:

                    sourceString = "Leia o texto abaixo, que fala sobre a Ditadura Militar no Brasil.@2 "+
                            "Os soldados armados de fuzis prendiam milhares de pessoas: dirigentes populares, intelectuais, "+
                            "políticos democratas. A UNE foi proibida e seu prédio, incendiado. A CGT, fechada. Sindicatos "+
                            "invadidos à bala. Nas escolas e universidades, professores e alunos progressistas expulsos. Os "+
                            "jornais foram ocupados por censores e muitos jornalistas postos na cadeia.@1"+
                            "@1<small>Disponível em: http://www.culturabrasil.pro.br/ditadura.htm. Acesso em: 11 out. 2011.</small> @2 "+
                            "A Ditadura Militar está relacionada ";
                    qA = "à ampla participação política da sociedade civil e militar. ";
                    qB = "à garantia das liberdades individuais e coletivas. ";
                    qC = "ao fortalecimento do Poder Legislativo e Executivo. ";
                    qD = "ao poder político autoritário e centralista. ";
                    resolucao = "As principais características do militarismo é a hirarquização (quem tem patente menor, obedece quem tem patente maior) e disciplina, onde os militares " +
                            "passam por rigorosas punições se não forem disciplinados, ou seja, militares com patente maior são autoritários, pois precisam que os militares de patente menor obedeçam, " +
                            "e essas características foram passadas para a Ditadura Militar, pois as forças armadas se tornaram o \"Estado\", e tratavam os civís como se fossem militares, como as forças " +
                            "armadas estavam atuando no lugar do Estado, todo o poder estava centralizado. @1" +
                            "Isso faz com que a Ditadura Militar no Brasil se relacione com o poder político autoritário e centralista. "; break;
                case 11:

                    sourceString = "Observe a charge abaixo.@2 "+
                            "@cimg ch520111 cimg@ @1"+
                            "Disponível em: http://ateliedehistoria.blogspot.com/2009/10/desafio-atividades-o-exercicio-consiste.html. Acesso em: 9 set. 2011.@1"+
                            "@1A Constituição de 1824 é considerada autoritária, porque ";
                    qA = "adotou a divisão de três poderes. ";
                    qB = "censurou os jornais. ";
                    qC = "foi outorgada pelo Imperador. ";
                    qD = "implantou a monarquia parlamentarista. ";
                    resolucao = "A elaboração da constituição do Brasil de 1824 foi bastante conturbada. @1" +
                            "Visando oferecer uma aparência liberal, a Constituição de 1824 empreendeu a divisão de poderes políticos entre Legislativo, Executivo e Judiciário. Entretanto, a mesma lei que oficializava essas esferas de poder autônomo, também instituiu a criação do chamado Poder Moderador. Exercido unicamente pela figura do imperador, esse poder tinha a capacidade de desfazer e anular as decisões tomadas pelos outros poderes. Desse modo, nosso governo combinava ambíguos traços de liberalismo e absolutismo. @1" +
                            "Ou seja, Dom Pedro I queria ter o poder absoluto dos poderes: executivo, legislativo e judiciário. Criando ainda um 4° poder \"poder moderador\" ambos sendo exercidos por Dom Pedro I. @1" +
                            "Sendo assim, mesmo que houvesse a divisão de poderes, o imperador possuia o poder total, ou seja, ele era autoritário pois foi outogarda (aprovada) pelo Imperador (aquele que impera, reina, governa)."; break;
                case 12:

                    sourceString = "O gráfico abaixo apresenta dados sobre o tráfico de escravos no Brasil.@2 "+
                            "@cimg ch520121 cimg@"+
                            "@1<small>Disponível em: http://ateliedehistoria.blogspot.com/2009/10/desafio-atividades-o-exercicio-consiste.html. Acesso em: 3 set. 2011.</small> @2 "+
                            "Nesse gráfico, os dados revelam que houve redução na entrada de negros no país a partir da ";
                    qA = "Lei Áurea. ";
                    qB = "Lei Eusébio de Queirós. ";
                    qC = "Lei do Ventre Livre. ";
                    qD = "Lei dos Sexagenários. ";
                    resolucao = "A Lei Eusébio de Queiróz determinava fim do tráfico do escravos (por influência da Grã-Bretanha). A Lei Eusébio de Queiróz foi uma modificação que ocorreu em 1850 na legislação escravista brasileira. A lei proibia o tráfico de escravos para o Brasil."; break;
                case 13:

                    sourceString = "O comentário abaixo refere-se à configuração partidária no Segundo Reinado no Brasil.@2 "+
                            "“Não há nada mais parecido com um Saquarema do que um Luzia no poder.” "+
                            "@2<small>Disponível em: http://www.scielo.br/scielo. php?pid=S0104-06182008000300005&script=sci_arttext. Acesso em: 3 fev. 2010.</small> @2 "+
                            "Com base nesse comentário, conclui-se que, durante o Segundo Reinado, os partidos políticos ";
                    qA = "apresentavam semelhanças em seus interesses. ";
                    qB = "buscavam alianças com os republicanos. ";
                    qC = "defendiam os interesses da população pobre. ";
                    qD = "representavam um sistema político absolutista. ";
                    resolucao = "Saquarema e Luzia eram os apelidos dados aos membros dos partidos Conservador e Liberal, respectivamente. @1" +
                            "\n" +
                            "Os Conservadores eram conhecidos por saquaremas pelo fato de vários de seus membros residirem no município fluminense de Saquarema, que passou a ser também local de reuniões do partido. @1" +
                            "\n" +
                            "O apelido de luzias dos liberais estava relacionado aos fatos ocorridos na vila mineira de Santa Luzia, durante a Revolta Liberal de 1842. @1 " +
                            "\n" +
                            "A fala de Holanda Cavalcanti mostra que os dois partidos eram essencialmente iguais, pois concordavam com a manutenção da monarquia e da escravidão do Brasil."; break;
                case 14:

                    sourceString = "A queda do Muro de Berlim, em 1989, abriu caminho para a reunificação da Alemanha e representou o "+
                            "fim de um mundo dividido entre a bipolaridade do capitalismo e socialismo.@1"+
                            "@1Simbolicamente, a queda do Muro de Berlim marcou o fim da ";
                    qA = "Guerra de Secessão. ";
                    qB = "Guerra Fria. ";
                    qC = "Primeira Guerra Mundial. ";
                    qD = "Segunda Guerra Mundial. ";
                    resolucao = "A Guerra Fria foi o confronto indireto entre Estados Unidos e União Soviética. Depois que a União Soviética perdeu para os Estados Unidos, ela resolveu criar um novo sistema de governo o Socialista. Apartir desse fato houve a bipolarização do mundo. E como uma parte da Alemanha era Socialista e a outra era Capitalista, eles resolveram construir um muro, para dividir o mundo e a Alemanha em dois blocos sociais. @1" +
                            "A queda do muro de  " +
                            "Berlim em 1989 foi o princípio do que seria o fim da divisão do mundo em blocos capitalista e socialis" +
                            "ta."; break;
                case 15:

                    sourceString = "Leia o texto abaixo, que trata de uma atividade econômica na América Portuguesa.@2 "+
                            "Seiscentas peças barganhei @1"+
                            "– Que pechincha! – no Senegal @1"+
                            "A carne é rija, os músculos de aço, @1"+
                            "Boa liga do melhor metal.@1"+
                            "Em troca dei só aguardente, @1"+
                            "Contas, latão – um peso morto! @1"+
                            "Eu ganho oitocentos por cento @1"+
                            "Se a metade chegar ao porto "+
                            "@2<small>HEINE, Henrich, apud BOSI, Alfredo. Dialética da Colonização. São Paulo: Companhia das Letras, 1992.</small> @2 "+
                            "Esse poema retrata ";
                    qA = "as dificuldades em se importar servos da Europa. ";
                    qB = "as formas de comércio de especiarias entre Brasil e África. ";
                    qC = "os custos salariais dos operários vindos da Ásia. ";
                    qD = "os lucros com o tráfico negreiro dos comerciantes brasileiros. ";
                    resolucao = " O texto faz referência ao processo de obtenção de escravos na costa africana. Na primeira estrofe, observamos a descrição da negociação feita para a obtenção de escravos, tendo especial destaque o vigor dos negros obtidos no litoral africano. Já na segunda parte, observamos que o traficante que fala no poema, quantifica a alta lucratividade que terá se metade dos escravos capturados chegarem vivos até à colônia.\n" +
                            ""; break;
                case 16:

                    sourceString = "Veja a imagem abaixo.@2 "+
                            "@cimg ch520161 cimg@"+
                            "@1<small>Disponível em: www.consciencia.org. Acesso em: 2 jan. 2010.</small> @2 "+
                            "De acordo com essa imagem, nos séculos XIV e XV, o imaginário europeu sobre o Oceano Atlântico era "+
                            "baseado em ";
                    qA = "descrições de navegantes que destacavam a ausência de ilhas. ";
                    qB = "mapas precisos sobre a distância entre a Europa e a América. ";
                    qC = "mitos que o caracterizavam como um espaço cheio de perigos. ";
                    qD = "narrativas de viajantes fascinados por suas viagens marítimas. ";
                    resolucao = "Até o século XIV, o conhecimento que se tinha na Europa a respeito de outros lugares do mundo era bastante restrito.Além dos relatos do veneziano Marco Polo, as informações disponíveis sobre o Oriente eram encontradas, quase sempre, em obras escritas por pessoas que jamais haviam estado na Ásia. @1" +
                            "\n" +
                            "Os europeus do século XV costumavam misturar conhecimentos geográficos com lendas, realidade com imaginação.Acreditavam, por exemplo, na existência de um país imaginário, Offir, de onde teriam se originado todos os tesouros do Rei Salomão.Os navegantes Cristóvão Colombo e Sebastião Caboto tentaram encontrar Offir na América e vários navegantes portugueses o procuraram na África. @1" +
                            "\n" +
                            "Outro reino imaginário, governado por um rei cristão bondoso e rico chamado Preste João, reunia as cavaleiras amazonas, as relíquias de Santo Tomé, a fonte da juventude e enormes rios de ouro, prata e pedras preciosas...Localizado inicialmente na Ásia e, a partir do século XIV, na África."; break;
                case 17:

                    sourceString = "Leia o texto abaixo, que fala sobre a Constituição de 1891.@2 "+
                            "[...] ao mesmo tempo os deputados elaboravam a nova constituição, que foi promulgada em "+
                            "fevereiro de 1891, consagrando em seus pontos fundamentais: o Federalismo, que garantia "+
                            "autonomia aos estados para elaborar sua própria Constituição, eleger seu governador, realizar "+
                            "empréstimos no exterior, decretar impostos e possuir suas próprias forças militares; [...] "+
                            "@2<small>Disponível em:http://www.historianet.com.br/conteudo/default.aspx?codigo=357. Acesso em: 17 fev. 2010.</small> @2 "+
                            "O Federalismo, consagrado na Constituição de 1891, ";
                    qA = "confirmou a opção pela monarquia. ";
                    qB = "garantiu o poder às oligarquias rurais. ";
                    qC = "permitiu a centralização do poder. ";
                    qD = "significou a adoção do parlamentarismo. ";
                    resolucao = "A consolidação do modelo republicano federalista e a ascendência das oligarquias agrárias ao poder fez surgir um dos mais característicos fenômenos sociais e políticos do período: o coronelismo. @1" +
                            "O direito de voto estava assegurado pela Constituição, mas o fato da grande maioria dos eleitores habitarem o interior (a população sertaneja e camponesa) e serem muito pouco politizados levou os proprietários agrários a controlar o voto e o processo eleitoral em função de seus interesses. O \"coronel\" (geralmente um proprietário de terra) foi a figura chave no processo de controle do voto da população rural. Temido e respeitado, a influência e o poder político do coronel aumentavam a medida em que ele conseguisse assegurar o voto dos eleitores para os seus candidatos. Por meio do emprego da violência e também da barganha (troca de favores), os coroneis forçavam os eleitores a votarrem nos candidatos que convinha aos seus interesses."; break;

                case 18:

                    sourceString = "Leia o texto abaixo, que destaca um shopping popular de Belo Horizonte.@2 "+
                            "Um dos maiores shoppings populares de Belo Horizonte atrai mais de 30 mil pessoas nos "+
                            "dias de maior movimento. Esse shopping teve início com a ideia de movimentar vendedores "+
                            "ambulantes que trabalhavam nas ruas da região para o interior de um estabelecimento único.@1"+
                            "Encontra-se qualquer tipo de produto, como roupas até eletro-eletrônicos a um preço muito baixo "+
                            "se comparado aos shoppings formais.@1"+
                            "@1<small>Disponível em: http://www.pontosbr.com/detalhes.php?cod=700. Acesso em: 18 jul. 2011. Adaptado.</small> @2 "+
                            "Shoppings populares, como o citado nesse texto, surgem nas metrópoles devido à expansão da ";
                    qA = "atividade turística. ";
                    qB = "carga tributária. ";
                    qC = "economia informal. ";
                    qD = "indústria artesanal. ";
                    resolucao = "A Economia informal envolve as atividades que estão à margem da formalidade, sem firma registrada, sem emitir notas fiscais, sem empregados registrados e sem contribuir com impostos ao governo. @1" +
                            "Portanto quando uma metrópole possui Economia informal elevada, os Shoppings Populares surgem, até mesmo para conseguir coletar mais impostos dos comerciantes e repassar ao governo."; break;
                case 19:

                    sourceString = "O quadro abaixo apresenta a taxa de desemprego no Brasil.@1 "+
                            "@cimg ch520191 cimg@"+
                            "@1<small>Disponível em: http://pt.wikipedia.org/wiki/Taxa_de_desemprego_no_Brasil. Acesso em: 15 jul. 2011.</small> @2 "+
                            "A variação da taxa de desemprego mostrada nesse quadro é explicada pelo ";
                    qA = "aumento da população economicamente ativa. ";
                    qB = "aumento do emprego na agricultura moderna. ";
                    qC = "estagnação do setor terciário da economia. ";
                    qD = "ritmo do desenvolvimento econômico brasileiro. ";
                    resolucao = "Na década de 2000 tem início o enfraquecimento do neoliberalismo, \n" +
                            "com a retomada dos investimentos públicos nos setores estratégicos \n" +
                            "de infraestrutura. A economia mundial passa por um dos maiores períodos de prosperidade e \n" +
                            "estabilidade da história, incluindo o Brasil."; break;
                case 20:

                    sourceString = "A atual integração econômica mundial decorre da existência de uma rede de regiões urbanas "+
                            "interconectadas, que são responsáveis pelo controle e expansão da produção e do consumo mundiais.@1"+
                            "Essa integração só foi possível graças às cidades que sediam as grandes corporações financeiras e "+
                            "multinacionais, que são as chamadas cidades ";
                    qA = "globais. ";
                    qB = "locais. ";
                    qC = "nacionais. ";
                    qD = "polos. ";
                    resolucao = "As cidades globais, também conhecidas como metrópoles mundiais, são grandes aglomerações urbanas que funcionam como centros de influência internacional. Estão no topo da hierarquia urbana. São dotadas de técnica e conhecimento em serviços de elevada influência nas decisões vinculadas à economia globalizada e ao progresso tecnológico. @1" +
                            "\n" +
                            "Nessas cidades, há grande concentração e movimentação financeira, sedes de grandes empresas ou escritórios filiais de transnacionais, importantes centros de pesquisas, presença de escritórios das principais empresas mundiais em consultoria, contabilidade, publicidade, bancos e advocacia, além das principais universidades."; break;
                case 21:

                    sourceString = "Leia a tirinha abaixo que apresenta um dos maiores problemas ambientais vivenciados pela humanidade.@2 "+
                            "@cimg ch520211 cimg@ @1"+
                            "<small>Disponível em: http://3.bp.blogspot.com/_evzEcTsLb5I/SesMSZek7LI/AAAAAAAAAqs/sfh750YHD78/s1600/goodintentions. Acesso em: 9 set. 2010.</small> @2 "+
                            "O aquecimento global é causado pela ";
                    qA = "contaminação dos solos. ";
                    qB = "destruição da troposfera. ";
                    qC = "emissão de gases estufa. ";
                    qD = "utilização de agrotóxicos. ";
                    resolucao = "Aquecimento global é o processo de aumento da temperatura média dos oceanos e da atmosfera da Terra causado por massivas emissões de gases que intensificam o efeito estufa, originados de uma série de atividades humanas, especialmente a queima de combustíveis fósseis e mudanças no uso da terra, como o desmatamento."; break;
                case 22:

                    sourceString = "A partir da década de 1960, a expansão e a ocupação do centro-oeste brasileiro provocaram muitas "+
                            "alterações no ambiente do cerrado, ameaçando a sua biodiversidade.@1"+
                            "@1Um impacto ambiental provocado no cerrado pela prática do garimpo é a ";
                    qA = "ampliação da estação seca. ";
                    qB = "contaminação dos ribeirões. ";
                    qC = "destruição da mata nativa. ";
                    qD = "emissão de gás carbônico. ";
                    resolucao = "O garimpo na maioria das vezes utiliza o mercúrio para facilitar a exploração mineral.\n" +
                            " Apesar da vantagem de catalisar o processo de identificação do ouro, por exemplo, essa \n" +
                            "substância química é responsável por gerar graves danos ao meio ambiente e aos seres \n" +
                            "humanos que a ela ficam expostos. @1\n" +
                            "\n" +
                            "O mercúrio é utilizado no processo de garimpagem em sua forma líquida para atrair o ouro\n" +
                            " diluído em um determinado solo, formando uma liga entre as substâncias. Quando esse\n" +
                            " concentrado é queimado, o mercúrio evapora deixando apenas o ouro em seu estado bruto. \n" +
                            "Esse mercúrio é ingerido pelos peixes, que contaminam os humanos que os consome, além disso \n" +
                            "o mercúrio contamina os solos, alem de evaporar e poder causar doenças por inalação."; break;
                case 23:

                    sourceString = "O mapa abaixo mostra a distribuição das usinas que produzem etanol no Brasil.@2 "+
                            "@cimg ch520231 cimg@ "+
                            "@1<small>Disponível em: http://www.epe.gov.br/Petroleo/Paginas/Estudos_28.aspx?CategoriaID. Acesso em: 19 jul. 2011.</small> @2 "+
                            "De acordo com esse mapa, as usinas em operação concentram-se próximas ";
                    qA = "às áreas onde há escassez de gasolina. ";
                    qB = "às regiões produtoras de cana-de-açúcar. ";
                    qC = "aos estados que possuem termoelétricas. ";
                    qD = "aos locais de baixa concentração populacional. ";
                    resolucao = "O etanol é feito a partir da cana-de-açucar, e suas usinas geralmente se localizam " +
                            "próximas à regiões que produzem a cana, para que não haja muitos gastos com transporte e nem demora na entrega dos produtos."; break;
                case 24:

                    sourceString = "O mapa abaixo destaca alguns países que se inserem na geopolítica do petróleo.@2 "+
                            "@cimg ch520241 cimg@ @1"+
                            "<small>Disponível em: http://biodiesel.com.ar/tag/. Acesso em: 15 jul. 2011.</small> @2 "+
                            "Esses países formam a ";
                    qA = "Agência Internacional de Produção de Petróleo. ";
                    qB = "Associação de Países Produtores de Petróleo. ";
                    qC = "Comunidade Mundial de Exportadores de Petróleo. ";
                    qD = "Organização de Países Exportadores de Petróleo. ";
                    resolucao = "Organização dos Países Exportadores de Petróleo (OPEP ou, pelo seu nome em inglês, OPEC) é uma organização internacional que visa coordenar de maneira centralizada a política petrolífera dos países membros, de modo a restringir a oferta de petróleo no mercado internacional, impulsionando os preços."; break;
                case 25:

                    sourceString = "Leia o texto abaixo, que destaca o novo modelo agrícola.@2 "+
                            "Atualmente, o novo modelo agrícola, que surge em meio às preocupações ambientais, traz "+
                            "a busca por uma agricultura sustentável. A Agenda 21, resultado da ECO 92, sinalizou um "+
                            "novo paradigma: o do desenvolvimento sustentável que, para ser atingido, enfrenta a demanda "+
                            "crescente por produtos agrícolas, a busca da competitividade no mercado internacional e processos "+
                            "produtivos que favoreçam, de modo simultâneo, aos indicadores ecológicos, econômicos e "+
                            "sociais, em longo prazo.@1"+
                            "@1<small>Disponível em: http://www.sober.org.br/palestra/9/86.pdf. Acesso em: 8 set. 2010. Fragmento.</small> @2 "+
                            "Esse novo modelo agrícola abastece o mercado com produtos ";
                    qA = "artificiais. ";
                    qB = "duráveis. ";
                    qC = "orgânicos. ";
                    qD = "químicos. ";
                    resolucao = "Produto orgânico é um alimento sadio, limpo, cultivado sem agrotóxicos e sem fertilizantes químicos. Eles provêm de sistemas agrícolas baseados em processos naturais, que não agridem a natureza e mantêm a vida do solo intacta."; break;
                case 26:

                    sourceString = "Leia a charge abaixo.@2 "+
                            "@cimg ch520261 cimg@"+
                            "@1<small>Disponível em: http://www.biodieselbr.com/charges/simon/acabou-diesel-111207.htm. Acesso em: 18 jul. 2011.</small> @2 "+
                            "A substituição do diesel pelo biodiesel interfere no espaço rural, porque o biodiesel ";
                    qA = "contamina os solos das áreas rurais. ";
                    qB = "é produzido a partir de óleos vegetais. ";
                    qC = "é uma mistura de soja e gás natural. ";
                    qD = "provoca o aumento do desemprego. ";
                    resolucao = "Diesel ou gasóleo é um óleo derivado da destilação do petróleo bruto usado como combustível. @1" +
                            "Biodiesel é uma alternativa aos combustíveis derivado do petróleo. Pode ser usado em carros e qualquer outro veículo com motor diesel. Fabricado a partir de fontes renováveis (óleo de soja, gordura animal, óleo de algodão), é um combustível que emite menos poluentes que o diesel."; break;
                case 27:

                    sourceString = "Leia o texto abaixo, que relaciona consumo e sustentabilidade.@2 "+
                            "Acreditamos que uma nova consciência planetária deve começar nas escolhas concretas "+
                            "que fazemos em nossas ações diárias. Por isso, foram propostos 12 princípios norteadores do "+
                            "consumo consciente que, aplicados em nosso cotidiano, são capazes de trazer sustentabilidade "+
                            "à humanidade.@1"+
                            "O 1º princípio afirma que devemos planejar as compras, porque assim compramos menos e melhor.@1"+
                            "@1<small>Disponível em: http://www.akatu.org.br/Content/Akatu/Arquivos/file/NOV-AKATU-VALEq_4_Fold.pdf. Acesso em: 18 jul. 2011. Adaptado.</small> @2 "+
                            "Consumir menos contribui para a sustentabilidade, porque ";
                    qA = "diminui a pressão sobre os recursos naturais. ";
                    qB = "elimina a procura por empréstimos bancários. ";
                    qC = "gera empregos no setor terciário da economia. ";
                    qD = "promove o crescimento das lojas virtuais. ";
                    resolucao = "Quanto mais a população mundial consome, mais é produzido. Entretanto para produzir, em 99% dos casos o meio ambiente é agredido, há " +
                            "liberação de CO2, há a contaminação dos recursos hídricos, há o consumo de petróleo (inclusive no transporte dos produtos) e há " +
                            "um gasto alto de diversos recursos naturais encontrados na Terra. @1" +
                            "Sendo assim, se a população consumir menos, isso diminuirá a pressão sobre os recursos naturais."; break;
                case 28:

                    sourceString = "Leia o texto abaixo, que trata da escassez de água.@2 "+
                            "A água tornou-se uma questão de segurança e de defesa do Estado-Nação, devendo constar no "+
                            "planejamento estratégico de todos os países.@1"+
                            "Algumas regiões do planeta encontram-se, já hoje, em situação de escassez de água. Enquanto "+
                            "alguns simplesmente optaram, num primeiro momento, pela sua extrema mercantilização, como na "+
                            "União Europeia, outros procuram saídas políticas e científicas.@1"+
                            "@1<small>Disponível em: http://www.tempopresente.org/index2.php?option=com_content&do_pdf=1&id=77. Acesso em: 13 jul. 2011. Adaptado.</small> @2 "+
                            "Uma ação para proteção dos mananciais é a ";
                    qA = "ampliação da calha dos rios. ";
                    qB = "coleta e o tratamento de esgotos. ";
                    qC = "construção de usinas hidrelétricas. ";
                    qD = "proibição da navegação fluvial. ";
                    resolucao = "Se um país coletar a tratar os esgotos, será possível reaproveitar a mesma água que as pessoas usam, com isso " +
                            "os recursos hídricos irão durar muito mais, uma vez que eles estão sendo reutilizados ao invés de descartados. Isso protegerá os " +
                            "mananciais, pois se coletarem muita água constantemente desses locais, eles podem secar."; break;
                case 29:

                    sourceString = "Leia o texto abaixo, que destaca a indústria extrativa em Minas Gerais.@2 "+
                            "Os grandes empreendimentos minerais no estado de Minas Gerais existem por muitas "+
                            "décadas e alguns são centenários. A atividade de mineração faz parte da história e do processo "+
                            "de desenvolvimento da região. Atualmente essa atividade está inserida numa economia bastante "+
                            "diversificada e compete com outras atividades econômicas industriais.@1"+
                            "@1<small>Disponível em: http://www.ibram.org.br/sites/700/784/00001033.pdf. Acesso em: 17 jul. 2011.</small> @2 "+
                            "Um dos municípios mineiros que se destaca na atividade de mineração é ";
                    qA = "Abaeté. ";
                    qB = "Aiuruoca. ";
                    qC = "Itabirito. ";
                    qD = "Varginha. ";
                    resolucao = "O nome Itabirito, originário do Tupi, que significa \"pedra que risca vermelho\", nome este que denomina um minério de ferro abundante na região."; break;
                case 30:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "No caso dos serviços, a primeira academia de ginástica do Brasil a ficar aberta durante toda a "+
                            "noite foi uma localizada na Rua da Consolação, no bairro do Jardim Paulista, na cidade de São "+
                            "Paulo. Esse estabelecimento de fitness iniciou seu funcionamento em 1991, época em que as "+
                            "academias de ginástica começaram a fazer sucesso entre os brasileiros. Essa academia passou "+
                            "a oferecer sua sala de musculação para aqueles que queriam treinar durante a noite. Hoje, "+
                            "com mais de 20 anos de funcionamento 24 horas, esta academia de ginástica tornou-se uma "+
                            "grande referência para o bairro e, além de sua sala de musculação, as piscinas também estão à "+
                            "disposição para os alunos treinarem a qualquer hora do dia e da noite.@1"+
                            "@1<small>Disponível em: http://www.geografia.fflch.usp.br/publicacoes/Geousp/Geousp20/Artigo_Carlos.pdf. Acesso em: 9 maio 212. *Adaptado para fins didáticos.</small> @2 "+
                            "Esse tipo de estabelecimento comercial é encontrado somente em cidades como São Paulo, porque é "+
                            "uma cidade que vive o processo de ";
                    qA = "informalidade. ";
                    qB = "metropolização. ";
                    qC = "suburbanização. ";
                    qD = "sustentabilidade. ";
                    resolucao = "Metropolização é o processo de crescimento urbano de uma cidade e sua constituição como centralidade de uma região metropolitana, isto é, de uma área composta por vários municípios que congregam a mesma dinâmica espaço-territorial. @1" +
                            "Em cidades/estados metropolizados, há um gigantesco fluxo de pessoas, onde a maioria está trabalhando e esses trabalhos " +
                            "ocorrem em diferentes horários dos dias. Fazendo com que uns fiquem livre pela manhã, outros fiquem livre de noite e já outros apenas de madrugada, em lugares como esse " +
                            "é possível sustentar negócios que fiquem abertos 24h por dia, já que haverá um grande fluxo de pessoas a qualquer hora do dia."; break;

            }
        }

        Traduzir traduzir = new Traduzir(true, false);
        this.sourceString = traduzir.enunciado(sourceString);
        this.qA = traduzir.enunciado(qA);
        this.qB = traduzir.enunciado(qB);
        this.qC = traduzir.enunciado(qC);
        this.qD = traduzir.enunciado(qD);
        this.qE = traduzir.enunciado(qE);
        this.resolucao = traduzir.enunciado(resolucao);
        sEnunciado = Html.fromHtml(sourceString, simulado , null);
        sqA = Html.fromHtml(qA, simulado , null);
        sqB = Html.fromHtml(qB, simulado , null);
        sqC = Html.fromHtml(qC, simulado , null);
        sqD = Html.fromHtml(qD, simulado , null);
        sqE = Html.fromHtml(qE, simulado , null);
        sResolucao = Html.fromHtml(resolucao, simulado , null);
    }

    public Spanned getEnunciado() {
        return sEnunciado;
    };

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
        countQuestao = 0;

        if (materia.equals(LINGUAGENS_CÓDIGOS)){
            countQuestao = 30;
        }else if(materia.equals(CHAVE_MATEMATICA)){
            countQuestao = 30;
        }else if(materia.equals(CIENCIAS_DA_NATUREZA)){
            countQuestao = 30;
        }else if(materia.equals(CIENCIAS_HUMANAS)){
            countQuestao = 30;

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

        if (materia.equals(LINGUAGENS_CÓDIGOS)) alternativa = gablc[indice-1];
        if (materia.equals(CHAVE_MATEMATICA)) alternativa = gabmt[indice-1];
        if (materia.equals(CIENCIAS_HUMANAS)) alternativa = gabch[indice-1];
        if (materia.equals(CIENCIAS_DA_NATUREZA)) alternativa = gabcn[indice-1];

        return alternativa;

    }
}