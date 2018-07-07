package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2013 {





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

    String[] gablc = {
            B,C,D,C,B,D,B,D,C,A,
            D,A,C,A,A,D,D,B,A,B,
            C,B,C,D,A,C,A,D,D,A,
    };

    String[] gabmt = {
            D,B,A,B,C,D,B,C,B,D,
            B,C,A,D,C,B,C,B,D,A,
            D,B,D,B,A,D,A,A,C,B,
    };

    String[] gabcn = {
            A,A,C,B,D,D,A,C,B,A,
            D,A,B,A,A,B,C,B,C,A,
            C,A,A,B,A,C,D,B,B,D,
    };

    String[] gabch = {
            D,C,B,B,C,D,B,D,C,B,
            B,D,A,B,D,A,D,C,D,D,
            C,B,B,A,A,D,C,D,A,D,
    };





    // SIMULADO 3 - ENSINO MÉDIO

    public Prova2013(Context contexto, Simulado simulado) {
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

                    texto = " @b Refrigerantes: É isso aí b@ @1"+
                            "De bebidas vendidas em farmácias e indicadas para tratar dor de barriga, os "+
                            "refrigerantes viraram símbolo de rebeldia e hoje estão entre os nomes mais "+
                            "conhecidos do mundo @2"+
                            "@b por Celso Miranda e Ricardo Giassetti b@ @2"+
                            "“Amada minha, ficarei deveras lisonjeado se aceitares me acompanhar à pharmacia para "+
                            "um xarope carbonatado.” Um convite para tomar xarope na farmácia pode não soar como uma "+
                            "cantada lá muito romântica hoje em dia, mas, no fim do século 19, era tudo que uma jovenzinha "+
                            "americana queria ouvir. Afinal, quem não queria experimentar a grande onda, os refrigerantes? "+
                            "Os primeiros deles nasceram numa época em que se confundiam as propriedades medicinais "+
                            "das fontes de águas minerais com as recentes invenções de Joseph Priestley (1767) e John "+
                            "Mathews (1832). Priestley criou um meio de produzir água gaseificada artificialmente, a soda. "+
                            "Mathews desenvolveu o que ficaria conhecido como soda fountain, um aparato que produzia "+
                            "água com gás de forma simples, diretamente no balcão da farmácia. Acreditava-se que a água "+
                            "gaseificada tinha propriedades terapêuticas e por isso ela era recomendada para diversos tipos "+
                            "de tratamento, de simples cólicas à poliomielite.@2"+
                            "Por volta da metade do século 19, já era comum encontrar fontes de soda instaladas nas "+
                            "farmácias por todos os Estados Unidos. “Não se sabe exatamente quem foi o primeiro a colocar "+
                            "substâncias adoçantes e corantes na água gasosa, mas certamente isso aconteceu numa "+
                            "farmácia, onde as misturas eram feitas e vendidas como tônicos”, diz Jorge Fantinel, engenheiro "+
                            "químico e consultor das empresas do setor, autor de Os Refrigerantes no Brasil. As primeiras "+
                            "experiências foram feitas com xarope de limão, a soda limonada. Imediatamente depois vieram "+
                            "as misturas com morango, noz-de-cola – um fruto africano parente do cacau, rico em cafeína, "+
                            "conhecido no Brasil como orobô – e ginger-ale, feito de gengibre. Nessa época, eles ainda não "+
                            "tinham o nome de refrigerantes e eram chamados de xaropes gasosos. Mas, vendidos a 1 centavo "+
                            "de dólar, já eram um sucesso.@2"+
                            "O crescimento do consumo fez muitas farmácias se transformarem em pontos de encontro.@1"+
                            "Outras deixaram de lado a venda de remédios para aumentar o espaço de atendimento dos "+
                            "ávidos bebedores de xaropes gasosos. Fenômeno semelhante ocorreu com os proprietários, que "+
                            "começaram a competir pelos fregueses criando xaropes cada vez mais elaborados, fechando suas "+
                            "lojas para se dedicar à produção e venda no atacado. As três maiores marcas norte-americanas "+
                            "atuais foram criadas num espaço de pouco mais de dez anos, por três desses ex-farmacêuticos.(...) "+
                            "@2<small>Disponível em: http://historia.abril.com.br/ciencia/refrigerantes-isso-ai-434732.shtml. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"Nesse texto, qual é a expressão usada com sentido figurado? ";
                    qA = "“xarope carbonatado”. ";
                    qB = "“grande onda”. ";
                    qC = "“soda fountain”. ";
                    qD = "“propriedades terapêuticas”. ";
                    break;

                case 2:

                    texto = " @b Refrigerantes: É isso aí b@ @1"+
                            "De bebidas vendidas em farmácias e indicadas para tratar dor de barriga, os "+
                            "refrigerantes viraram símbolo de rebeldia e hoje estão entre os nomes mais "+
                            "conhecidos do mundo @2"+
                            "@b por Celso Miranda e Ricardo Giassetti b@ @2"+
                            "“Amada minha, ficarei deveras lisonjeado se aceitares me acompanhar à pharmacia para "+
                            "um xarope carbonatado.” Um convite para tomar xarope na farmácia pode não soar como uma "+
                            "cantada lá muito romântica hoje em dia, mas, no fim do século 19, era tudo que uma jovenzinha "+
                            "americana queria ouvir. Afinal, quem não queria experimentar a grande onda, os refrigerantes? "+
                            "Os primeiros deles nasceram numa época em que se confundiam as propriedades medicinais "+
                            "das fontes de águas minerais com as recentes invenções de Joseph Priestley (1767) e John "+
                            "Mathews (1832). Priestley criou um meio de produzir água gaseificada artificialmente, a soda. "+
                            "Mathews desenvolveu o que ficaria conhecido como soda fountain, um aparato que produzia "+
                            "água com gás de forma simples, diretamente no balcão da farmácia. Acreditava-se que a água "+
                            "gaseificada tinha propriedades terapêuticas e por isso ela era recomendada para diversos tipos "+
                            "de tratamento, de simples cólicas à poliomielite.@2"+
                            "Por volta da metade do século 19, já era comum encontrar fontes de soda instaladas nas "+
                            "farmácias por todos os Estados Unidos. “Não se sabe exatamente quem foi o primeiro a colocar "+
                            "substâncias adoçantes e corantes na água gasosa, mas certamente isso aconteceu numa "+
                            "farmácia, onde as misturas eram feitas e vendidas como tônicos”, diz Jorge Fantinel, engenheiro "+
                            "químico e consultor das empresas do setor, autor de Os Refrigerantes no Brasil. As primeiras "+
                            "experiências foram feitas com xarope de limão, a soda limonada. Imediatamente depois vieram "+
                            "as misturas com morango, noz-de-cola – um fruto africano parente do cacau, rico em cafeína, "+
                            "conhecido no Brasil como orobô – e ginger-ale, feito de gengibre. Nessa época, eles ainda não "+
                            "tinham o nome de refrigerantes e eram chamados de xaropes gasosos. Mas, vendidos a 1 centavo "+
                            "de dólar, já eram um sucesso.@2"+
                            "O crescimento do consumo fez muitas farmácias se transformarem em pontos de encontro.@1"+
                            "Outras deixaram de lado a venda de remédios para aumentar o espaço de atendimento dos "+
                            "ávidos bebedores de xaropes gasosos. Fenômeno semelhante ocorreu com os proprietários, que "+
                            "começaram a competir pelos fregueses criando xaropes cada vez mais elaborados, fechando suas "+
                            "lojas para se dedicar à produção e venda no atacado. As três maiores marcas norte-americanas "+
                            "atuais foram criadas num espaço de pouco mais de dez anos, por três desses ex-farmacêuticos.(...) "+
                            "@2<small>Disponível em: http://historia.abril.com.br/ciencia/refrigerantes-isso-ai-434732.shtml. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"De acordo com esse texto, os refrigerantes atuais mais conhecidos foram criados ";
                    qA = "de forma essencialmente acidental. ";
                    qB = "de maneira metódica e científica. ";
                    qC = "por imposição da concorrência. ";
                    qD = "por necessidades financeiras. ";
                    break;
                case 3:

                    texto = " @b Refrigerantes: É isso aí b@ @1"+
                            "De bebidas vendidas em farmácias e indicadas para tratar dor de barriga, os "+
                            "refrigerantes viraram símbolo de rebeldia e hoje estão entre os nomes mais "+
                            "conhecidos do mundo @2"+
                            "@b por Celso Miranda e Ricardo Giassetti b@ @2"+
                            "“Amada minha, ficarei deveras lisonjeado se aceitares me acompanhar à pharmacia para "+
                            "um xarope carbonatado.” Um convite para tomar xarope na farmácia pode não soar como uma "+
                            "cantada lá muito romântica hoje em dia, mas, no fim do século 19, era tudo que uma jovenzinha "+
                            "americana queria ouvir. Afinal, quem não queria experimentar a grande onda, os refrigerantes? "+
                            "Os primeiros deles nasceram numa época em que se confundiam as propriedades medicinais "+
                            "das fontes de águas minerais com as recentes invenções de Joseph Priestley (1767) e John "+
                            "Mathews (1832). Priestley criou um meio de produzir água gaseificada artificialmente, a soda. "+
                            "Mathews desenvolveu o que ficaria conhecido como soda fountain, um aparato que produzia "+
                            "água com gás de forma simples, diretamente no balcão da farmácia. Acreditava-se que a água "+
                            "gaseificada tinha propriedades terapêuticas e por isso ela era recomendada para diversos tipos "+
                            "de tratamento, de simples cólicas à poliomielite.@2"+
                            "Por volta da metade do século 19, já era comum encontrar fontes de soda instaladas nas "+
                            "farmácias por todos os Estados Unidos. “Não se sabe exatamente quem foi o primeiro a colocar "+
                            "substâncias adoçantes e corantes na água gasosa, mas certamente isso aconteceu numa "+
                            "farmácia, onde as misturas eram feitas e vendidas como tônicos”, diz Jorge Fantinel, engenheiro "+
                            "químico e consultor das empresas do setor, autor de Os Refrigerantes no Brasil. As primeiras "+
                            "experiências foram feitas com xarope de limão, a soda limonada. Imediatamente depois vieram "+
                            "as misturas com morango, noz-de-cola – um fruto africano parente do cacau, rico em cafeína, "+
                            "conhecido no Brasil como orobô – e ginger-ale, feito de gengibre. Nessa época, eles ainda não "+
                            "tinham o nome de refrigerantes e eram chamados de xaropes gasosos. Mas, vendidos a 1 centavo "+
                            "de dólar, já eram um sucesso.@2"+
                            "O crescimento do consumo fez muitas farmácias se transformarem em pontos de encontro.@1"+
                            "Outras deixaram de lado a venda de remédios para aumentar o espaço de atendimento dos "+
                            "ávidos bebedores de xaropes gasosos. Fenômeno semelhante ocorreu com os proprietários, que "+
                            "começaram a competir pelos fregueses criando xaropes cada vez mais elaborados, fechando suas "+
                            "lojas para se dedicar à produção e venda no atacado. As três maiores marcas norte-americanas "+
                            "atuais foram criadas num espaço de pouco mais de dez anos, por três desses ex-farmacêuticos.(...) "+
                            "@2<small>Disponível em: http://historia.abril.com.br/ciencia/refrigerantes-isso-ai-434732.shtml. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"O fragmento “Amada minha, ficarei deveras lisonjeado se aceitares me acompanhar à pharmacia para um "+
                            "xarope carbonatado.” representa ";
                    qA = "a forma de tratamento informal entre os namorados no fim do século 19. ";
                    qB = "a necessidade de rodeios, para se fazer um convite a uma moça, no passado. ";
                    qC = "o preconceito linguístico revelado através da fala de um rapaz a uma moça. ";
                    qD = "o reflexo de uma forma de linguagem que cai em desuso nos dias atuais. ";
                    break;
                case 4:

                    sourceString = texto = " @b Refrigerantes: É isso aí b@ @1"+
                            "De bebidas vendidas em farmácias e indicadas para tratar dor de barriga, os "+
                            "refrigerantes viraram símbolo de rebeldia e hoje estão entre os nomes mais "+
                            "conhecidos do mundo @2"+
                            "@b por Celso Miranda e Ricardo Giassetti b@ @2"+
                            "“Amada minha, ficarei deveras lisonjeado se aceitares me acompanhar à pharmacia para "+
                            "um xarope carbonatado.” Um convite para tomar xarope na farmácia pode não soar como uma "+
                            "cantada lá muito romântica hoje em dia, mas, no fim do século 19, era tudo que uma jovenzinha "+
                            "americana queria ouvir. Afinal, quem não queria experimentar a grande onda, os refrigerantes? "+
                            "Os primeiros deles nasceram numa época em que se confundiam as propriedades medicinais "+
                            "das fontes de águas minerais com as recentes invenções de Joseph Priestley (1767) e John "+
                            "Mathews (1832). Priestley criou um meio de produzir água gaseificada artificialmente, a soda. "+
                            "Mathews desenvolveu o que ficaria conhecido como soda fountain, um aparato que produzia "+
                            "água com gás de forma simples, diretamente no balcão da farmácia. Acreditava-se que a água "+
                            "gaseificada tinha propriedades terapêuticas e por isso ela era recomendada para diversos tipos "+
                            "de tratamento, de simples cólicas à poliomielite.@2"+
                            "Por volta da metade do século 19, já era comum encontrar fontes de soda instaladas nas "+
                            "farmácias por todos os Estados Unidos. “Não se sabe exatamente quem foi o primeiro a colocar "+
                            "substâncias adoçantes e corantes na água gasosa, mas certamente isso aconteceu numa "+
                            "farmácia, onde as misturas eram feitas e vendidas como tônicos”, diz Jorge Fantinel, engenheiro "+
                            "químico e consultor das empresas do setor, autor de Os Refrigerantes no Brasil. As primeiras "+
                            "experiências foram feitas com xarope de limão, a soda limonada. Imediatamente depois vieram "+
                            "as misturas com morango, noz-de-cola – um fruto africano parente do cacau, rico em cafeína, "+
                            "conhecido no Brasil como orobô – e ginger-ale, feito de gengibre. Nessa época, eles ainda não "+
                            "tinham o nome de refrigerantes e eram chamados de xaropes gasosos. Mas, vendidos a 1 centavo "+
                            "de dólar, já eram um sucesso.@2"+
                            "O crescimento do consumo fez muitas farmácias se transformarem em pontos de encontro.@1"+
                            "Outras deixaram de lado a venda de remédios para aumentar o espaço de atendimento dos "+
                            "ávidos bebedores de xaropes gasosos. Fenômeno semelhante ocorreu com os proprietários, que "+
                            "começaram a competir pelos fregueses criando xaropes cada vez mais elaborados, fechando suas "+
                            "lojas para se dedicar à produção e venda no atacado. As três maiores marcas norte-americanas "+
                            "atuais foram criadas num espaço de pouco mais de dez anos, por três desses ex-farmacêuticos.(...) "+
                            "@2<small>Disponível em: http://historia.abril.com.br/ciencia/refrigerantes-isso-ai-434732.shtml. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"Nesse texto, a expressão “Os Refrigerantes no Brasil” está em itálico por ser o nome de ";
                    qA = "uma empresa. ";
                    qB = "uma experiência. ";
                    qC = "um livro. ";
                    qD = "um refrigerante. ";
                    break;


                case 5:

                    texto = "@b Estimulado, cérebro produz e preserva novas células nervosas "+
                            "Diariamente nascem neurônios em cérebros adultos. Eles auxiliam no "+
                            "aprendizado de tarefas complexas e quanto mais solicitados, mais se "+
                            "desenvolvem b@ @2"+
                            "@b Por Tracey J. Shors b@ @2"+
                            "Quando vemos TV, lemos revistas ou navegamos na internet, costumamos encontrar "+
                            "anúncios que encorajam o exercício mental. Diversos programas de exercício cerebral "+
                            "estimulam a agilidade mental das pessoas dando-lhes treinamento diário – executar tarefas "+
                            "que vão desde memorizar listas e solucionar quebra-cabeças até calcular o número de árvores "+
                            "de um parque. Isso pode parecer um recurso publicitário, mas, na realidade, tem embasamento "+
                            "real na neurobiologia. Pesquisas recentes, embora feitas principalmente com ratos, indicam "+
                            "que o aprendizado potencializa a sobrevivência de novos neurônios no cérebro adulto. E "+
                            "quanto mais desafiador for o problema, maior o número de neurônios envolvidos no processo.@1"+
                            "Acredita-se que esses neurônios estão disponíveis para ajudar em situações em que a mente é "+
                            "sobrecarregada. Parece que o treinamento mental fortalece o cérebro da mesma maneira que "+
                            "o exercício físico modela os músculos. (...) "+
                            "@2 <small> Revista Scientific American – Edição Especial – Nº 40 - p.63. </small> @2";

                    sourceString = texto+"O objetivo comunicativo desse texto é ";
                    qA = "criticar o hábito de ver TV em excesso. ";
                    qB = "divulgar o resultado de pesquisas recentes. ";
                    qC = "estimular a prática de exercícios físicos. ";
                    qD = "orientar a respeito de exercícios mentais. ";
                    break;
                case 6:

                    texto = "@b Estimulado, cérebro produz e preserva novas células nervosas "+
                            "Diariamente nascem neurônios em cérebros adultos. Eles auxiliam no "+
                            "aprendizado de tarefas complexas e quanto mais solicitados, mais se "+
                            "desenvolvem b@ @2"+
                            "@b Por Tracey J. Shors b@ @2"+
                            "Quando vemos TV, lemos revistas ou navegamos na internet, costumamos encontrar "+
                            "anúncios que encorajam o exercício mental. Diversos programas de exercício cerebral "+
                            "estimulam a agilidade mental das pessoas dando-lhes treinamento diário – executar tarefas "+
                            "que vão desde memorizar listas e solucionar quebra-cabeças até calcular o número de árvores "+
                            "de um parque. Isso pode parecer um recurso publicitário, mas, na realidade, tem embasamento "+
                            "real na neurobiologia. Pesquisas recentes, embora feitas principalmente com ratos, indicam "+
                            "que o aprendizado potencializa a sobrevivência de novos neurônios no cérebro adulto. E "+
                            "quanto mais desafiador for o problema, maior o número de neurônios envolvidos no processo.@1"+
                            "Acredita-se que esses neurônios estão disponíveis para ajudar em situações em que a mente é "+
                            "sobrecarregada. Parece que o treinamento mental fortalece o cérebro da mesma maneira que "+
                            "o exercício físico modela os músculos. (...) "+
                            "@2 <small> Revista Scientific American – Edição Especial – Nº 40 - p.63. </small> @2";

                    sourceString = texto+"Que trecho desse texto expressa uma suposição? ";
                    qA = "“... quanto mais solicitados, mais se desenvolvem.”. ";
                    qB = "“... costumamos encontrar anúncios que encorajam o exercício mental.”. ";
                    qC = "“... tem embasamento real na neurobiologia.”. ";
                    qD = "“Parece que o treinamento mental fortalece o cérebro...”. ";
                    break;
                case 7:

                    texto = "@b Estimulado, cérebro produz e preserva novas células nervosas "+
                            "Diariamente nascem neurônios em cérebros adultos. Eles auxiliam no "+
                            "aprendizado de tarefas complexas e quanto mais solicitados, mais se "+
                            "desenvolvem b@ @2"+
                            "@b Por Tracey J. Shors b@ @2"+
                            "Quando vemos TV, lemos revistas ou navegamos na internet, costumamos encontrar "+
                            "anúncios que encorajam o exercício mental. Diversos programas de exercício cerebral "+
                            "estimulam a agilidade mental das pessoas dando-lhes treinamento diário – executar tarefas "+
                            "que vão desde memorizar listas e solucionar quebra-cabeças até calcular o número de árvores "+
                            "de um parque. Isso pode parecer um recurso publicitário, mas, na realidade, tem embasamento "+
                            "real na neurobiologia. Pesquisas recentes, embora feitas principalmente com ratos, indicam "+
                            "que o aprendizado potencializa a sobrevivência de novos neurônios no cérebro adulto. E "+
                            "quanto mais desafiador for o problema, maior o número de neurônios envolvidos no processo.@1"+
                            "Acredita-se que esses neurônios estão disponíveis para ajudar em situações em que a mente é "+
                            "sobrecarregada. Parece que o treinamento mental fortalece o cérebro da mesma maneira que "+
                            "o exercício físico modela os músculos. (...) "+
                            "@2 <small> Revista Scientific American – Edição Especial – Nº 40 - p.63. </small> @2";

                    sourceString = texto+"No trecho “...dando-lhes treinamento diário...”, a palavra destacada refere-se a ";
                    qA = "anúncios. ";
                    qB = "pessoas. ";
                    qC = "programas. ";
                    qD = "tarefas. ";
                    break;
                case 8:

                    texto = "@b Estimulado, cérebro produz e preserva novas células nervosas "+
                            "Diariamente nascem neurônios em cérebros adultos. Eles auxiliam no "+
                            "aprendizado de tarefas complexas e quanto mais solicitados, mais se "+
                            "desenvolvem b@ @2"+
                            "@b Por Tracey J. Shors b@ @2"+
                            "Quando vemos TV, lemos revistas ou navegamos na internet, costumamos encontrar "+
                            "anúncios que encorajam o exercício mental. Diversos programas de exercício cerebral "+
                            "estimulam a agilidade mental das pessoas dando-lhes treinamento diário – executar tarefas "+
                            "que vão desde memorizar listas e solucionar quebra-cabeças até calcular o número de árvores "+
                            "de um parque. Isso pode parecer um recurso publicitário, mas, na realidade, tem embasamento "+
                            "real na neurobiologia. Pesquisas recentes, embora feitas principalmente com ratos, indicam "+
                            "que o aprendizado potencializa a sobrevivência de novos neurônios no cérebro adulto. E "+
                            "quanto mais desafiador for o problema, maior o número de neurônios envolvidos no processo.@1"+
                            "Acredita-se que esses neurônios estão disponíveis para ajudar em situações em que a mente é "+
                            "sobrecarregada. Parece que o treinamento mental fortalece o cérebro da mesma maneira que "+
                            "o exercício físico modela os músculos. (...) "+
                            "@2 <small> Revista Scientific American – Edição Especial – Nº 40 - p.63. </small> @2";

                    sourceString = texto+"No trecho “E quanto mais desafiador for o problema, maior o número de neurônios envolvidos no "+
                            "processo.”, as palavras destacadas expressam relação de ";
                    qA = "comparação. ";
                    qB = "consequência. ";
                    qC = "finalidade. ";
                    qD = "proporção. ";
                    break;


                case 9:
                    texto = "@cimg lc540091 cimg@"+
                            "@1<small>Disponível em: http://www.defactocomunicacao.files.wordpress.com. Acesso em: 08 set. 2010.</small> @2 ";
                    sourceString = texto+"Nesse texto, o questionamento da mulher deve-se à ";
                    qA = "inutilidade da leitura de tantos jornais. ";
                    qB = "preocupação com os gastos excessivos. ";
                    qC = "quantidade de jornais desconsiderados. ";
                    qD = "veracidade das informações dos jornais. ";
                    break;
                case 10:

                    texto = "@cimg lc540091 cimg@"+
                            "@1<small>Disponível em: http://www.defactocomunicacao.files.wordpress.com. Acesso em: 08 set. 2010.</small> @2 ";
                    sourceString = texto+"De acordo com esse texto, qual é a palavra que pode sintetizar a justificativa dada pelo homem? ";
                    qA = "Aparência. ";
                    qB = "Conhecimento. ";
                    qC = "Informação. ";
                    qD = "Leitura. ";
                    break;



                case 11:
                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"Esse texto é um exemplo de ";
                    qA = "conto. ";
                    qB = "editorial. ";
                    qC = "notícia. ";
                    qD = "reportagem. ";
                    break;
                case 12:

                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"De acordo com esse texto, o Maglev ";
                    qA = "apresenta características adequadas para a topografia brasileira. ";
                    qB = "está no passado da história do transporte de passageiros por ferrovias. ";
                    qC = "faz parte das locomotivas da época de ouro da ferrovia no Brasil. ";
                    qD = "substitui a maria-fumaça como principal meio de transporte de passageiros. ";
                    break;

                case 13:

                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"No trecho “De toda a nossa malha, menos de 2 mil quilômetros são eletrificados e somente 223 metros "+
                            "são magnetizados.”, as palavras destacadas têm sentido ";
                    qA = "crítico. ";
                    qB = "depreciativo. ";
                    qC = "restritivo. ";
                    qD = "sarcástico. ";
                    break;
                case 14:

                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"Nesse texto, a presença do autor é perceptível em: ";
                    qA = "“De toda a nossa malha...”. ";
                    qB = "“Considerado o mais avançado do mundo...”. ";
                    qC = "“No futuro, a intenção é usá-lo...”. ";
                    qD = "“Veio então a época de ouro das ferrovias no Brasil...”. ";
                    break;
                case 15:

                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"No trecho “Como não existe atrito...”, a palavra destacada introduz ideia de ";
                    qA = "causa. ";
                    qB = "comparação. ";
                    qC = "conformidade. ";
                    qD = "oposição. ";
                    break;
                case 16:

                    texto = "@b A evolução sobre trilhos b@ @1 "+
                            "Em 200 anos, os trens passaram das marias-fumaças aos flutuantes e "+
                            "megarrápidos Maglevs @2"+
                            "O Brasil conta com quase 30 mil quilômetros de ferrovias, mas ficou no passado em relação "+
                            "a esse tipo de transporte. De toda a nossa malha, menos de 2 mil quilômetros são eletrificados "+
                            "e somente 223 metros são magnetizados. Esse tipo de trilho serve para mover trens como o "+
                            "Maglev, ideia que surgiu na Alemanha em 1979, mas hoje só funciona comercialmente no Japão "+
                            "e na China. Considerado o mais avançado do mundo, usa uma força magnética que faz o trem "+
                            "levitar e lhe dá um impulso capaz de atingir altas velocidades. Como não existe atrito, o Maglev "+
                            "consegue competir até com aviões em termos de velocidade: chega a 581 quilômetros por hora.@1"+
                            "“Ele tem pouco impacto ambiental e é ideal para países topograficamente acidentados como "+
                            "o Brasil”, diz o engenheiro Eduardo Gonçalves David, autor do livro O Futuro das Estradas de "+
                            "Ferro no Brasil.@1"+
                            "Atualmente, uma equipe da Universidade Federal do Rio de Janeiro (UFRJ) está "+
                            "desenvolvendo a versão brasileira, o Maglev Cobra, e construindo uma pista para testar a "+
                            "supermáquina. No futuro, a intenção é usá-lo para ligar os aeroportos de Galeão e Santos "+
                            "Dumont, no Rio de Janeiro.@1"+
                            "A primeira versão desse tipo de transporte, no entanto, foram as locomotivas movidas a "+
                            "carvão, desenvolvidas no começo do século 19, que vieram substituir os vagões de tração "+
                            "animal. Por mais de cem anos, a maria-fumaça foi o principal meio de locomoção do mundo.@1"+
                            "Trazida ao Brasil em 1854, tinha um trajeto entre a Baía de Guanabara e Petrópolis (RJ). Em "+
                            "1889, já havia 9500 quilômetros de ferrovias no País.@1"+
                            "Por volta de 1890 foram criados os motores a diesel que, seis décadas depois, superaram os "+
                            "movidos a carvão. Veio então a época de ouro das ferrovias no Brasil, quando tivemos quase "+
                            "35 mil quilômetros de trilhos cortando boa parte do País. A partir da década de 60, passou-se "+
                            "a priorizar a malha rodoviária, uma decisão que até hoje gera discussões e divide a opinião de "+
                            "especialistas.@1"+
                            "@1 <small> (Guilherme Rosa) "+
                            "Revista Galileu - Setembro de 2010 – Nº 230 – p.17. </small> @2";

                    sourceString = texto+"Nesse texto, há ideia de indefinição temporal no trecho: ";
                    qA = "“... ideia que surgiu na Alemanha em 1979...”. ";
                    qB = "“Trazida ao Brasil em 1854...”. ";
                    qC = "“Em 1889, já havia 9500 quilômetros...”. ";
                    qD = "“Por volta de 1890...”. ";
                    break;


                case 17:
                    texto = "@b A lenda do preguiçoso b@ @1"+
                            "De: Giba Pedroza @2"+
                            "Diz que era uma vez um homem que era o mais preguiçoso que já se viu debaixo do céu e "+
                            "acima da terra. Ao nascer nem chorou, e se pudesse falar teria dito: @1"+
                            "“Choro não. Depois eu choro”.@1"+
                            "Também a culpa não era do pobre. Foi o pai que fez pouco caso quando a parteira ralhou "+
                            "com ele: “Não cruze as pernas, moço. Não presta! Atrasa o menino pra nascer e ele pode "+
                            "crescer na preguiça, manhoso”.@1"+
                            "E a sina se cumpriu. Cresceu o menino na maior preguiça e fastio. Nada de roça, nada de "+
                            "lida, tanto que um dia o moço se viu sozinho no pequeno sítio da família onde já não se plantava "+
                            "nada. O mato foi crescendo em volta da casa e ele já não tinha o que comer. Vai então que ele "+
                            "chama o vizinho, que era também seu compadre, e pede pra ser enterrado ainda vivo. O outro, "+
                            "no começo, não queria atender ao estranho pedido, mas quando se lembrou de que negar favor "+
                            "e desejo de compadre dá sete anos de azar...@1"+
                            "E lá se foi o cortejo. Ia carregado por alguns poucos, nos braços de Josefina, sua rede "+
                            "de estimação. Quando passou diante da casa do fazendeiro mais rico da cidade, este tirou o "+
                            "chapéu, em sinal de respeito, e perguntou:@1"+
                            "“Quem é que vai aí? Que Deus o tenha!” @1"+
                            "“Deus não tem ainda, não, moço. Tá vivo.” @1"+
                            "E quando o fazendeiro soube que era porque não tinha mais o que comer, ofereceu dez "+
                            "sacas de arroz. O preguiçoso levantou a aba do chapéu e ainda da rede cochichou no ouvido "+
                            "do homem:@1"+
                            "“Moço, esse seu arroz tá escolhidinho, limpinho e fritinho?” @1"+
                            "“Tá não.” @1"+
                            "“Então toque o enterro, pessoal.” @1"+
                            "E é por isso que se diz que é preciso prestar atenção nas crendices e superstições da ciência "+
                            "popular.@1"+
                            "@1<small>Disponível em: http://singrandohorizontes.wordpress.com/2010/08/18/folclore-popular-lenda-do-preguicoso/. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"Uma lenda é um gênero textual que ";
                    qA = "conta uma história real revestida de personagens aparentemente irreais. ";
                    qB = "narra fatos fantásticos distantes da realidade para transmitir um ensinamento. ";
                    qC = "relata crendices populares inventadas em um passado bastante longínquo. ";
                    qD = "une fatos reais a fatos irreais de forma fantasiosa e é transmitida pela tradição oral. ";
                    break;
                case 18:

                    texto = "@b A lenda do preguiçoso b@ @1"+
                            "De: Giba Pedroza @2"+
                            "Diz que era uma vez um homem que era o mais preguiçoso que já se viu debaixo do céu e "+
                            "acima da terra. Ao nascer nem chorou, e se pudesse falar teria dito: @1"+
                            "“Choro não. Depois eu choro”.@1"+
                            "Também a culpa não era do pobre. Foi o pai que fez pouco caso quando a parteira ralhou "+
                            "com ele: “Não cruze as pernas, moço. Não presta! Atrasa o menino pra nascer e ele pode "+
                            "crescer na preguiça, manhoso”.@1"+
                            "E a sina se cumpriu. Cresceu o menino na maior preguiça e fastio. Nada de roça, nada de "+
                            "lida, tanto que um dia o moço se viu sozinho no pequeno sítio da família onde já não se plantava "+
                            "nada. O mato foi crescendo em volta da casa e ele já não tinha o que comer. Vai então que ele "+
                            "chama o vizinho, que era também seu compadre, e pede pra ser enterrado ainda vivo. O outro, "+
                            "no começo, não queria atender ao estranho pedido, mas quando se lembrou de que negar favor "+
                            "e desejo de compadre dá sete anos de azar...@1"+
                            "E lá se foi o cortejo. Ia carregado por alguns poucos, nos braços de Josefina, sua rede "+
                            "de estimação. Quando passou diante da casa do fazendeiro mais rico da cidade, este tirou o "+
                            "chapéu, em sinal de respeito, e perguntou:@1"+
                            "“Quem é que vai aí? Que Deus o tenha!” @1"+
                            "“Deus não tem ainda, não, moço. Tá vivo.” @1"+
                            "E quando o fazendeiro soube que era porque não tinha mais o que comer, ofereceu dez "+
                            "sacas de arroz. O preguiçoso levantou a aba do chapéu e ainda da rede cochichou no ouvido "+
                            "do homem:@1"+
                            "“Moço, esse seu arroz tá escolhidinho, limpinho e fritinho?” @1"+
                            "“Tá não.” @1"+
                            "“Então toque o enterro, pessoal.” @1"+
                            "E é por isso que se diz que é preciso prestar atenção nas crendices e superstições da ciência "+
                            "popular.@1"+
                            "@1<small>Disponível em: http://singrandohorizontes.wordpress.com/2010/08/18/folclore-popular-lenda-do-preguicoso/. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"Ao introduzir esse texto com “Diz que era uma vez...”, o narrador ";
                    qA = "antecipa a ideia de um texto de conteúdo de base irreal. ";
                    qB = "isenta-se da responsabilidade sobre o que será narrado. ";
                    qC = "manifesta-se subjetivamente em relação aos fatos. ";
                    qD = "reproduz uma introdução tradicional dos contos de fada. ";
                    break;
                case 19:

                    texto = "@b A lenda do preguiçoso b@ @1"+
                            "De: Giba Pedroza @2"+
                            "Diz que era uma vez um homem que era o mais preguiçoso que já se viu debaixo do céu e "+
                            "acima da terra. Ao nascer nem chorou, e se pudesse falar teria dito: @1"+
                            "“Choro não. Depois eu choro”.@1"+
                            "Também a culpa não era do pobre. Foi o pai que fez pouco caso quando a parteira ralhou "+
                            "com ele: “Não cruze as pernas, moço. Não presta! Atrasa o menino pra nascer e ele pode "+
                            "crescer na preguiça, manhoso”.@1"+
                            "E a sina se cumpriu. Cresceu o menino na maior preguiça e fastio. Nada de roça, nada de "+
                            "lida, tanto que um dia o moço se viu sozinho no pequeno sítio da família onde já não se plantava "+
                            "nada. O mato foi crescendo em volta da casa e ele já não tinha o que comer. Vai então que ele "+
                            "chama o vizinho, que era também seu compadre, e pede pra ser enterrado ainda vivo. O outro, "+
                            "no começo, não queria atender ao estranho pedido, mas quando se lembrou de que negar favor "+
                            "e desejo de compadre dá sete anos de azar...@1"+
                            "E lá se foi o cortejo. Ia carregado por alguns poucos, nos braços de Josefina, sua rede "+
                            "de estimação. Quando passou diante da casa do fazendeiro mais rico da cidade, este tirou o "+
                            "chapéu, em sinal de respeito, e perguntou:@1"+
                            "“Quem é que vai aí? Que Deus o tenha!” @1"+
                            "“Deus não tem ainda, não, moço. Tá vivo.” @1"+
                            "E quando o fazendeiro soube que era porque não tinha mais o que comer, ofereceu dez "+
                            "sacas de arroz. O preguiçoso levantou a aba do chapéu e ainda da rede cochichou no ouvido "+
                            "do homem:@1"+
                            "“Moço, esse seu arroz tá escolhidinho, limpinho e fritinho?” @1"+
                            "“Tá não.” @1"+
                            "“Então toque o enterro, pessoal.” @1"+
                            "E é por isso que se diz que é preciso prestar atenção nas crendices e superstições da ciência "+
                            "popular.@1"+
                            "@1<small>Disponível em: http://singrandohorizontes.wordpress.com/2010/08/18/folclore-popular-lenda-do-preguicoso/. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"No trecho “Também a culpa não era do pobre.”, a palavra destacada tem o sentido de ";
                    qA = "desventurado. ";
                    qB = "de poucas posses. ";
                    qC = "de má genética. ";
                    qD = "solitário. ";
                    break;
                case 20:

                    texto = "@b A lenda do preguiçoso b@ @1"+
                            "De: Giba Pedroza @2"+
                            "Diz que era uma vez um homem que era o mais preguiçoso que já se viu debaixo do céu e "+
                            "acima da terra. Ao nascer nem chorou, e se pudesse falar teria dito: @1"+
                            "“Choro não. Depois eu choro”.@1"+
                            "Também a culpa não era do pobre. Foi o pai que fez pouco caso quando a parteira ralhou "+
                            "com ele: “Não cruze as pernas, moço. Não presta! Atrasa o menino pra nascer e ele pode "+
                            "crescer na preguiça, manhoso”.@1"+
                            "E a sina se cumpriu. Cresceu o menino na maior preguiça e fastio. Nada de roça, nada de "+
                            "lida, tanto que um dia o moço se viu sozinho no pequeno sítio da família onde já não se plantava "+
                            "nada. O mato foi crescendo em volta da casa e ele já não tinha o que comer. Vai então que ele "+
                            "chama o vizinho, que era também seu compadre, e pede pra ser enterrado ainda vivo. O outro, "+
                            "no começo, não queria atender ao estranho pedido, mas quando se lembrou de que negar favor "+
                            "e desejo de compadre dá sete anos de azar...@1"+
                            "E lá se foi o cortejo. Ia carregado por alguns poucos, nos braços de Josefina, sua rede "+
                            "de estimação. Quando passou diante da casa do fazendeiro mais rico da cidade, este tirou o "+
                            "chapéu, em sinal de respeito, e perguntou:@1"+
                            "“Quem é que vai aí? Que Deus o tenha!” @1"+
                            "“Deus não tem ainda, não, moço. Tá vivo.” @1"+
                            "E quando o fazendeiro soube que era porque não tinha mais o que comer, ofereceu dez "+
                            "sacas de arroz. O preguiçoso levantou a aba do chapéu e ainda da rede cochichou no ouvido "+
                            "do homem:@1"+
                            "“Moço, esse seu arroz tá escolhidinho, limpinho e fritinho?” @1"+
                            "“Tá não.” @1"+
                            "“Então toque o enterro, pessoal.” @1"+
                            "E é por isso que se diz que é preciso prestar atenção nas crendices e superstições da ciência "+
                            "popular.@1"+
                            "@1<small>Disponível em: http://singrandohorizontes.wordpress.com/2010/08/18/folclore-popular-lenda-do-preguicoso/. Acesso em: 08 set. 2010.</small> @2 ";

                    sourceString = texto+"Nesse texto, há marcas de personificação em: ";
                    qA = "“O mato foi crescendo em volta da casa...”. ";
                    qB = "“...nos braços de Josefina, sua rede de estimação.”. ";
                    qC = "“...este tirou o chapéu, em sinal de respeito...”. ";
                    qD = "“Então toque o enterro, pessoal.”. ";
                    break;


                case 21:
                    texto = "@b Soneto de fidelidade b@ @1"+
                            "De : Vinícius de Moraes @2 "+
                            "De tudo, ao meu amor serei atento @1"+
                            "Antes, e com tal zelo, e sempre, e tanto @1"+
                            "Que mesmo em face do maior encanto @1"+
                            "Dele se encante mais meu pensamento.@2"+
                            "Quero vivê-lo em cada vão momento @1"+
                            "E em seu louvor hei de espalhar meu canto @1"+
                            "E rir meu riso e derramar meu pranto @1"+
                            "Ao seu pesar ou seu contentamento.@2"+
                            "E assim, quanto mais tarde me procure @1"+
                            "Quem sabe a morte, angústia de quem vive @1"+
                            "Quem sabe a solidão, fim de quem ama.@2"+
                            "Eu possa me dizer do amor (que tive):@1"+
                            "Que não seja imortal, posto que é chama @1"+
                            "Mas que seja infinito enquanto dure.@1"+
                            "@1<small> Antologia Poética. Editora do Autor: Rio de Janeiro, 1960, pág. 96.</small>@2";

                    sourceString = texto+"Esse texto apresenta uma estrutura poética fixa composta por dois quartetos (estrofes com quatro versos) "+
                            "e dois tercetos (estrofes com três versos).@1"+
                            "@1Essa forma poética foi introduzida na literatura de Língua Portuguesa no período conhecido como ";
                    qA = "Arcadismo. ";
                    qB = "Barroco. ";
                    qC = "Classicismo. ";
                    qD = "Parnasianismo. ";
                    break;
                case 22:

                    texto = "@b Soneto de fidelidade b@ @1"+
                            "De : Vinícius de Moraes @2 "+
                            "De tudo, ao meu amor serei atento @1"+
                            "Antes, e com tal zelo, e sempre, e tanto @1"+
                            "Que mesmo em face do maior encanto @1"+
                            "Dele se encante mais meu pensamento.@2"+
                            "Quero vivê-lo em cada vão momento @1"+
                            "E em seu louvor hei de espalhar meu canto @1"+
                            "E rir meu riso e derramar meu pranto @1"+
                            "Ao seu pesar ou seu contentamento.@2"+
                            "E assim, quanto mais tarde me procure @1"+
                            "Quem sabe a morte, angústia de quem vive @1"+
                            "Quem sabe a solidão, fim de quem ama.@2"+
                            "Eu possa me dizer do amor (que tive):@1"+
                            "Que não seja imortal, posto que é chama @1"+
                            "Mas que seja infinito enquanto dure.@1"+
                            "@1<small> Antologia Poética. Editora do Autor: Rio de Janeiro, 1960, pág. 96.</small>@2";

                    sourceString = texto+"De acordo com o eu lírico desse texto, fidelidade é a ";
                    qA = "representação da fugacidade do amor. ";
                    qB = "entrega total numa relação provisória. ";
                    qC = "confirmação da imortalidade do amor. ";
                    qD = "angústia dos amantes que nela se baseiam. ";
                    break;
                case 23:

                    texto = "@b Soneto de fidelidade b@ @1"+
                            "De : Vinícius de Moraes @2 "+
                            "De tudo, ao meu amor serei atento @1"+
                            "Antes, e com tal zelo, e sempre, e tanto @1"+
                            "Que mesmo em face do maior encanto @1"+
                            "Dele se encante mais meu pensamento.@2"+
                            "Quero vivê-lo em cada vão momento @1"+
                            "E em seu louvor hei de espalhar meu canto @1"+
                            "E rir meu riso e derramar meu pranto @1"+
                            "Ao seu pesar ou seu contentamento.@2"+
                            "E assim, quanto mais tarde me procure @1"+
                            "Quem sabe a morte, angústia de quem vive @1"+
                            "Quem sabe a solidão, fim de quem ama.@2"+
                            "Eu possa me dizer do amor (que tive):@1"+
                            "Que não seja imortal, posto que é chama @1"+
                            "Mas que seja infinito enquanto dure.@1"+
                            "@1<small> Antologia Poética. Editora do Autor: Rio de Janeiro, 1960, pág. 96.</small>@2";

                    sourceString = texto+"Analisando a primeira estrofe desse poema, constata-se que o eu lírico revela ";
                    qA = "um contrassenso entre a vida e a morte. ";
                    qB = "um pedido contra a imortalidade do amor. ";
                    qC = "uma declaração explícita ao amor. ";
                    qD = "uma grande louvação ao amor. ";
                    break;
                case 24:

                    texto = "@b Soneto de fidelidade b@ @1"+
                            "De : Vinícius de Moraes @2 "+
                            "De tudo, ao meu amor serei atento @1"+
                            "Antes, e com tal zelo, e sempre, e tanto @1"+
                            "Que mesmo em face do maior encanto @1"+
                            "Dele se encante mais meu pensamento.@2"+
                            "Quero vivê-lo em cada vão momento @1"+
                            "E em seu louvor hei de espalhar meu canto @1"+
                            "E rir meu riso e derramar meu pranto @1"+
                            "Ao seu pesar ou seu contentamento.@2"+
                            "E assim, quanto mais tarde me procure @1"+
                            "Quem sabe a morte, angústia de quem vive @1"+
                            "Quem sabe a solidão, fim de quem ama.@2"+
                            "Eu possa me dizer do amor (que tive):@1"+
                            "Que não seja imortal, posto que é chama @1"+
                            "Mas que seja infinito enquanto dure.@1"+
                            "@1<small> Antologia Poética. Editora do Autor: Rio de Janeiro, 1960, pág. 96.</small>@2";

                    sourceString = texto+"Paradoxo é uma figura de linguagem que relaciona palavras opostas num mesmo enunciado com a "+
                            "finalidade de conciliar ideias contraditórias, que se excluem.@1"+
                            "@1Nesse texto, em qual verso o autor utiliza o recurso do paradoxo? ";
                    qA = "“De tudo, ao meu amor serei atento”. ";
                    qB = "“Quero vivê-lo em cada vão momento”. ";
                    qC = "“E em seu louvor hei de espalhar meu canto”. ";
                    qD = "“Mas que seja infinito enquanto dure.”. ";
                    break;

                case 25:
                    texto = "@b Capítulo II b@ @2"+
                            "Além, muito além daquela serra, que ainda azula no horizonte, nasceu Iracema.@1"+
                            "Iracema, a virgem dos lábios de mel, que tinha os cabelos mais negros que a asa da graúna "+
                            "e mais longos que seu talhe de palmeira.@1"+
                            "O favo da jati não era doce como seu sorriso; nem a baunilha recendia no bosque como seu "+
                            "hálito perfumado.@1"+
                            "Mais rápida que a ema selvagem, a morena virgem corria o sertão e as matas do Ipu, onde "+
                            "campeava sua guerreira tribo, da grande nação tabajara. O pé grácil e nu, mal roçando, alisava "+
                            "apenas a verde pelúcia que vestia a terra com as primeiras águas.@1"+
                            "@1<small>ALENCAR, José de Alencar. Iracema. São Paulo: Ciranda Cultural, s/d. p. 5 – 6. Fragmento.</small> @2 ";

                    sourceString = texto+"Nesse texto, a descrição da personagem Iracema foi construída a partir de ";
                    qA = "comparações. ";
                    qB = "oposições. ";
                    qC = "questionamentos. ";
                    qD = "redundâncias. ";
                    break;
                case 26:

                    texto = "@b Capítulo II b@ @2"+
                            "Além, muito além daquela serra, que ainda azula no horizonte, nasceu Iracema.@1"+
                            "Iracema, a virgem dos lábios de mel, que tinha os cabelos mais negros que a asa da graúna "+
                            "e mais longos que seu talhe de palmeira.@1"+
                            "O favo da jati não era doce como seu sorriso; nem a baunilha recendia no bosque como seu "+
                            "hálito perfumado.@1"+
                            "Mais rápida que a ema selvagem, a morena virgem corria o sertão e as matas do Ipu, onde "+
                            "campeava sua guerreira tribo, da grande nação tabajara. O pé grácil e nu, mal roçando, alisava "+
                            "apenas a verde pelúcia que vestia a terra com as primeiras águas.@1"+
                            "@1<small>ALENCAR, José de Alencar. Iracema. São Paulo: Ciranda Cultural, s/d. p. 5 – 6. Fragmento.</small> @2 ";

                    sourceString = texto+"Qual é a característica do Romantismo mais evidente nesse texto? ";
                    qA = "O pessimismo. ";
                    qB = "O confessionalismo. ";
                    qC = "A idealização da mulher. ";
                    qD = "A presença do sonho. ";
                    break;
                case 27:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A poesia concreta surgiu com o Concretismo, fase literária voltada para a valorização "+
                            "e incorporação dos aspectos geométricos à arte (música, poesia, artes plásticas).@1"+
                            "(...) O poema do Concretismo tem como característica primordial o uso das disponibilidades "+
                            "gráficas que as palavras possuem sem preocupações com a estética tradicional de começo, "+
                            "meio e fim e, por esse motivo, é chamado de poema-objeto.@1"+
                            "@1<small>Disponível em: http://pt.wikipedia.org/wiki/Poesia_concreta. Acesso em: 03 out. 2010. Fragmento.</small> @2 "+
                            "Considerando as informações presentes nesse texto, qual dos poemas, abaixo, é classificado como "+
                            "concreto? ";

                    qA = "um @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0movi @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0mento @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0compondo @1"+
                            "\u00A0\u00A0\u00A0\u00A0além @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0da @1" +
                            "\u00A0\u00A0nuvem @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0um @1"+
                            "\u00A0\u00A0\u00A0\u00A0campo @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0de @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0combate @1" +
                            "@1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0mira @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0gem @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0ira @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0de @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0um @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0\u00A0horizonte @1"+
                            "puro @1"+
                            "\u00A0\u00A0\u00A0num @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0mo @1"+
                            "\u00A0\u00A0\u00A0\u00A0\u00A0mento @1"+
                            "\u00A0vivo @2"+
                            "(Décio Pignatari) ";

                    qB = "Noite. Um silvo no @barb@, @1"+
                            "Nin@bguémb@ na estação. E o @btremb@ @1"+
                            "passa sem parar.@2"+
                            "@bAru jinsei no koshiikatab@ @2 "+
                            "Yoru. Kiteki no oto.@1"+
                            "Mujin no eki.@1"+
                            "Kisha tsûka.@2"+
                            "(Guilherme de Almeida) ";
                    qC = "(...) @1"+
                            "Primeira página @1"+
                            "Preço pago @1"+
                            "Pescoço peitos pulmões perfurados @1"+
                            "Parece pouco @1"+
                            "Pedro Paulo @1"+
                            "Profissão pedreiro @1"+
                            "Passatempo predileto, pandeiro @1"+
                            "Pandeiro parceiro @1"+
                            "(...) @2"+
                            "(Gog) ";
                    qD = "As armas e os barões assinalados, @1"+
                            "Que da ocidental praia Lusitana, @1"+
                            "Por mares nunca de antes navegados, @1"+
                            "Passaram ainda além da Taprobana, @1"+
                            "Em perigos e guerras esforçados, @1"+
                            "Mais do que prometia a força humana, @1"+
                            "E entre gente remota edificaram @1"+
                            "Novo Reino, que tanto sublimaram; @1"+
                            "(...) @2"+
                            "(Luís Vaz de Camões) ";
                    break;


                case 28:
                    texto = "@b A hora da estrela b@ @2"+
                            "Pretendo, como já insinuei, escrever de modo cada vez mais simples. Aliás o material de que "+
                            "disponho é parco e singelo demais, as informações sobre os personagens são poucas e não "+
                            "muito elucidativas, informações essas que penosamente me vêm de mim para mim mesmo, é "+
                            "trabalho de carpintaria.@1"+
                            "Sim, mas não esquecer que para escrever não-importa-o-quê, o meu material básico é a "+
                            "palavra. Assim é que esta história será feita de palavras que se agrupam em frases e destas se "+
                            "evoca um sentido secreto que ultrapassa palavras e frases. É claro que, como todo escritor, tenho "+
                            "a tentação de usar termos suculentos: conheço adjetivos esplendorosos, carnudos substantivos "+
                            "e verbos tão esguios que atravessam agudos o ar em vias de ação, já que palavra é ação, "+
                            "concordais? Mas não vou enfeitar a palavra, pois se eu tocar no pão da moça esse pão se tornará "+
                            "em ouro – e à jovem (ela tem dezenove anos) e a jovem não poderia mordê-lo, morrendo de "+
                            "fome. Tenho então que falar simples para captar a sua delicada e vaga existência. Limito-me a "+
                            "humildemente – mas sem fazer estardalhaço de minha humildade que já não seria humildade "+
                            "– limito-me a contar as fracas aventuras de uma moça numa cidade toda feita contra ela. Ela, "+
                            "que deveria ter ficado no sertão de Alagoas com vestido de chita e sem nenhuma datilografia, "+
                            "já que escrevia tão mal, só tinha até o terceiro ano primário. Por ser ignorante era obrigada na "+
                            "datilografia a copiar lentamente letra por letra – a tia é que lhe dera um curso ralo de como bater "+
                            "à máquina. E a moça ganhara uma dignidade: era enfim datilógrafa. Embora, ao que parece, "+
                            "não aprovasse na linguagem duas consoantes juntas e copiava a letra linda e redonda do amado "+
                            "chefe a palavra “designar” de modo como em língua falada diria: “desiguinar”.@1"+
                            "@1<small>LISPECTOR, Clarice. A hora da estrela. 8. ed. Rio de Janeiro: Nova Fronteira, 1997. p. 20 – 21. Fragmento.</small> @2 ";
                    sourceString = texto+ "Nesse texto, o narrador propõe ";
                    qA = "ajustar-se à condição existencial da protagonista. ";
                    qB = "compadecer-se com o sofrimento da protagonista. ";
                    qC = "entalhar o texto assim como o carpinteiro faz com a madeira. ";
                    qD = "simplificar o seu vocabulário escolhendo melhor as palavras. ";
                    break;
                case 29:

                    texto = "@b A hora da estrela b@ @2"+
                            "Pretendo, como já insinuei, escrever de modo cada vez mais simples. Aliás o material de que "+
                            "disponho é parco e singelo demais, as informações sobre os personagens são poucas e não "+
                            "muito elucidativas, informações essas que penosamente me vêm de mim para mim mesmo, é "+
                            "trabalho de carpintaria.@1"+
                            "Sim, mas não esquecer que para escrever não-importa-o-quê, o meu material básico é a "+
                            "palavra. Assim é que esta história será feita de palavras que se agrupam em frases e destas se "+
                            "evoca um sentido secreto que ultrapassa palavras e frases. É claro que, como todo escritor, tenho "+
                            "a tentação de usar termos suculentos: conheço adjetivos esplendorosos, carnudos substantivos "+
                            "e verbos tão esguios que atravessam agudos o ar em vias de ação, já que palavra é ação, "+
                            "concordais? Mas não vou enfeitar a palavra, pois se eu tocar no pão da moça esse pão se tornará "+
                            "em ouro – e à jovem (ela tem dezenove anos) e a jovem não poderia mordê-lo, morrendo de "+
                            "fome. Tenho então que falar simples para captar a sua delicada e vaga existência. Limito-me a "+
                            "humildemente – mas sem fazer estardalhaço de minha humildade que já não seria humildade "+
                            "– limito-me a contar as fracas aventuras de uma moça numa cidade toda feita contra ela. Ela, "+
                            "que deveria ter ficado no sertão de Alagoas com vestido de chita e sem nenhuma datilografia, "+
                            "já que escrevia tão mal, só tinha até o terceiro ano primário. Por ser ignorante era obrigada na "+
                            "datilografia a copiar lentamente letra por letra – a tia é que lhe dera um curso ralo de como bater "+
                            "à máquina. E a moça ganhara uma dignidade: era enfim datilógrafa. Embora, ao que parece, "+
                            "não aprovasse na linguagem duas consoantes juntas e copiava a letra linda e redonda do amado "+
                            "chefe a palavra “designar” de modo como em língua falada diria: “desiguinar”.@1"+
                            "@1<small>LISPECTOR, Clarice. A hora da estrela. 8. ed. Rio de Janeiro: Nova Fronteira, 1997. p. 20 – 21. Fragmento.</small> @2 ";
                    sourceString = texto+ "Esse texto estrutura-se a partir da ";
                    qA = "contextualização temporal do enredo. ";
                    qB = "descrição da protagonista da história. ";
                    qC = "organização da sequência de fatos. ";
                    qD = "reflexão acerca do fazer literário. ";
                    break;

                case 30:

                    sourceString = "Há um artista que é considerado o maior de todos os representantes da escultura barroca brasileira, seja "+
                            "pela quantidade, pela qualidade de suas obras, ou por ter sido o criador de uma estética própria. Em sua "+
                            "obra há a integração entre as diversas artes: arquitetura, escultura, talha e pintura. Trabalhou durante toda "+
                            "sua vida, mesmo depois de acometido por uma doença, fazendo igrejas, pórticos, púlpitos e imagens.@1"+
                            "@1Seu nome é Antônio Francisco Lisboa e é conhecido mundialmente como ";
                    qA = "Aleijadinho. ";
                    qB = "Grande Otelo. ";
                    qC = "Mestre Athayde. ";
                    qD = "Tunga. ";
                    break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice) {
                case 1:

                    sourceString = "Na figura abaixo, ao ser girado, o ponteiro para somente nos números inteiros.@2 "+
                            "@cimg mt540011 cimg@ @1"+
                            "Qual é a probabilidade desse ponteiro parar em um número par maior ou igual a 4? ";
                    qA = "1/2 ";
                    qB = "3/4 ";
                    qC = "2/3 ";
                    qD = "5/12 ";
                    break;
                case 2:

                    sourceString = "O time de futebol “Unidos Venceremos” disputou 10 jogos em um campeonato. O quadro, abaixo, mostra@2 "+
                            "o número de gols marcados por esse time em cada partida.@1"+
                            "@cimg mt540021 cimg@"+
                            "@1Qual é a média de gols desse time no campeonato? ";
                    qA = "1,5. ";
                    qB = "2,2. ";
                    qC = "2,7. ";
                    qD = "5,5. ";
                    break;
                case 3:

                    sourceString = "O gráfico da função quadrática, y = -x2 + 2x + 3, está representado na figura ";
                    qA = "@cimg mt54003a cimg@";
                    qB = "@cimg mt54003b cimg@";
                    qC = "@cimg mt54003c cimg@";
                    qD = "@cimg mt54003d cimg@";
                    break;

                case 4:

                    sourceString = "João posicionou um binóculo na posição P, a 1,5 m do solo, para observar o ninho de um pássaro na "+
                            "copa de uma árvore. Veja essa representação na figura abaixo.@2 "+
                            "@cimg mt540041 cimg@"+
                            "@1Em relação ao solo, esse ninho encontra-se a uma altura h de medida igual a ";
                    qA = "3,0 m. ";
                    qB = "4,5 m. ";
                    qC = "6,0 m. ";
                    qD = "7,5 m. ";
                    break;
                case 5:

                    sourceString = "O gráfico, abaixo, representa uma função f: IR @longarrow IR, definida por f(x) = ax + b.@2 "+
                            "@cimg mt540051 cimg@"+
                            "@1Qual é a representação algébrica da função f? ";
                    qA = "f(x) = -3x + 2.";
                    qB = "f(x) = 2x -3.";
                    qC = "@cimg mt54005c cimg@";
                    qD = "@cimg mt54005d cimg@";
                    break;
                case 6:

                    sourceString = "Uma professora perguntou aos seus alunos: “Em média, quantas horas por dia você utiliza a internet?”.@1"+
                            "As respostas dos alunos estão representadas no gráfico abaixo.@2 "+
                            "@cimg mt540061 cimg@ @1"+
                            "Quantos alunos responderam a essa pergunta? ";
                    qA = "14 alunos. ";
                    qB = "15 alunos. ";
                    qC = "36 alunos. ";
                    qD = "40 alunos. ";
                    break;
                case 7:

                    sourceString = "Em um jogo de futebol de salão foram vendidos 800 ingressos, com uma arrecadação total de R$ 26.000,00.@1"+
                            "O preço do ingresso antecipado era de R$ 28,00 e, no dia do jogo, R$ 40,00.@1"+
                            "@1Quantos ingressos foram vendidos antecipadamente? ";
                    qA = "300. ";
                    qB = "500. ";
                    qC = "650. ";
                    qD = "800. ";
                    break;
                case 8:

                    sourceString = "A figura, abaixo, representa a planta de uma praça triangular. Ela é contornada por uma calçada e há um@2 "+
                            "atalho, representado na figura pelo caminho RQ, perpendicular a um dos lados.@1"+
                            "@cimg mt540081 cimg@ @1"+
                            "Para ir do ponto M ao ponto P, Júlia percorreu o trecho MQRP, andando sempre sobre a calçada.@1"+
                            "@1Qual foi a distância percorrida por Júlia? ";
                    qA = "35 m. ";
                    qB = "48 m. ";
                    qC = "52 m. ";
                    qD = "72 m. ";
                    break;
                case 9:

                    sourceString = "A equipe de handebol da escola “Saber” dispõe de 15 jogadores, sendo dois goleiros, três pivôs, quatro "+
                            "alas e seis armadores. O time titular será composto de sete jogadores, sendo um goleiro, um pivô, dois "+
                            "alas e três armadores.@1"+
                            "@1De quantas maneiras diferentes o técnico pode escalar esse time? ";
                    qA = "144. ";
                    qB = "720. ";
                    qC = "6 435. ";
                    qD = "8 640. ";
                    break;
                case 10:
                    sourceString = "A equação da reta que passa pelo ponto P(1, – 3) e tem inclinação igual 3/2 é: ";
                    qA = "@cimg mt54010a cimg@";
                    qB = "@cimg mt54010b cimg@";
                    qC = "@cimg mt54010c cimg@";
                    qD = "@cimg mt54010d cimg@";
                    break;
                case 11:

                    sourceString = "O leite produzido em uma fazenda é transportado em galões que são recipientes cilíndricos, como o da figura "+
                            "abaixo.@2 Para não entornar durante o transporte, cada galão terá a sua capacidade máxima atingida, quando o "+
                            "nível do leite estiver a uma altura de 60 cm em relação ao fundo, conforme indicado na figura abaixo.@2 "+
                            "@cimg mt540111 cimg@ @1"+

                            "Mauro comprou um galão como esse contendo leite até sua capacidade máxima. Ele vai vender todo o "+
                            "conteúdo do galão em garrafas que contém 1 litro cada uma.@1"+
                            "@1Quantas dessas garrafas, no máximo, Mauro pode vender? ";
                    qA = "24. ";
                    qB = "75. ";
                    qC = "240. ";
                    qD = "750. ";
                    break;
                case 12:

                    sourceString = "O quadro, abaixo, mostra as opções de salgados e sucos vendidos na cantina de uma escola.@2 "+
                            "@cimg mt540121 cimg@ @1"+
                            "Tatiane vai escolher um salgado e um suco.@1"+
                            "@1De quantas maneiras diferentes ela pode fazer essa escolha? ";
                    qA = "5. ";
                    qB = "8. ";
                    qC = "15. ";
                    qD = "25. ";
                    break;
                case 13:


                    sourceString = "Qual dos gráficos, abaixo, representa uma função quadrática, f(x) = ax2 + bx + c, com Δ = 0? ";
                    qA = "@cimg mt54013a cimg@";
                    qB = "@cimg mt54013b cimg@";
                    qC = "@cimg mt54013c cimg@";
                    qD = "@cimg mt54013d cimg@";
                    break;

                case 14:

                    sourceString = "A fração geratriz da dízima periódica 0,212121..... é ";
                    qA = "21/100. ";
                    qB = "4/33. ";
                    qC = "7/3. ";
                    qD = "7/33. ";
                    break;
                case 15:

                    sourceString = "Uma empresa oferece quatro vagas para analista de sistema. Dez candidatos se apresentaram para "+
                            "disputar essas vagas oferecidas.@1"+
                            "@1De quantas maneiras o gerente da empresa pode escolher os quatro candidatos de que necessita? ";
                    qA = "14. ";
                    qB = "40. ";
                    qC = "210. ";
                    qD = "5 040. ";
                    break;
                case 16:

                    sourceString = "Ana fez uma pesquisa sobre as guloseimas preferidas pelas crianças de seu bairro. O gráfico, abaixo,@2 "+
                            "representa as informações obtidas por ela.@1"+
                            "@cimg mt540161 cimg@ @1"+
                            "Qual é a guloseima de que essas crianças mais gostam? ";
                    qA = "Bala. ";
                    qB = "Chocolate. ";
                    qC = "Pizza. ";
                    qD = "Sorvete. ";
                    break;
                case 17:

                    sourceString = "Na figura abaixo, os segmentos AC e BD são paralelos entre si, OA = 9 cm, OB = 18 cm e OD = 24 cm.@2 "+
                            "@cimg mt540171 cimg@ @1"+
                            "@1Qual é a medida do segmento CD? ";
                    qA = "7 cm. ";
                    qB = "9 cm. ";
                    qC = "12 cm. ";
                    qD = "18 cm. ";
                    break;
                case 18:

                    sourceString = "Ricardo vende cachorro quente e anotou no quadro, abaixo, tudo o que ganhou e gastou nos 4 primeiros@2 "+
                            "meses de 2010. Todo o dinheiro que sobra, ele deposita numa caderneta de poupança.@1"+
                            "@cimg mt540181 cimg@ @1"+
                            "@1Qual foi o total que Ricardo depositou na caderneta de poupança nesses meses? ";
                    qA = "R$ 2.085,00. ";
                    qB = "R$ 3.185,00. ";
                    qC = "R$ 3.715,00. ";
                    qD = "R$ 8.815,00. ";
                    break;
                case 19:

                    sourceString = "Os pontos M, N, P e Q estão representados no plano cartesiano abaixo.@2 "+
                            "@cimg mt540191 cimg@"+
                            "@1Qual desses pontos tem coordenadas (2, - 3)? ";
                    qA = "M. ";
                    qB = "N. ";
                    qC = "P. ";
                    qD = "Q. ";
                    break;
                case 20:

                    sourceString = "O quadro, abaixo, mostra o percentual dos votos válidos obtido por quatro candidatos à presidência da "+
                            "República.@1"+
                            "@cimg mt540201 cimg@"+
                            "@1Qual dos gráficos, abaixo, melhor representa esses dados? ";
                    qA = "@cimg mt54020a cimg@";
                    qB = "@cimg mt54020b cimg@";
                    qC = "@cimg mt54020c cimg@";
                    qD = "@cimg mt54020d cimg@";
                    break;
                case 21:

                    sourceString = "Na figura, abaixo, tem-se as dimensões de um piscina retangular.@2 "+
                            "@cimg mt540211 cimg@ @1"+
                            "Quantos litros de água são necessários para encher completamente essa piscina? ";
                    qA = "10 litros. ";
                    qB = "100 litros. ";
                    qC = "1 000 litros. ";
                    qD = "10 000 litros. ";
                    break;
                case 22:

                    sourceString = "Observe a sequência de figuras abaixo.@2 "+
                            "@cimg mt540221 cimg@ @1"+
                            "Essa série de figuras pode ser indicada pela sequência numérica (4, 7, 10, 13, 16, ...), em que cada "+
                            "número indica a quantidade de quadrinhos usados para formar cada figura.@1"+
                            "@1Mantendo esse mesmo padrão para essa sequência, quantos quadradinhos terá a Figura 37? ";
                    qA = "111. ";
                    qB = "112. ";
                    qC = "113. ";
                    qD = "115. ";
                    break;
                case 23:

                    sourceString = "No plano cartesiano, o quadrado PQRS tem três de seus vértices nos pontos P(– 1 , 3), Q(3 , 3) e R(3, – 1).@1"+
                            "@1Quais as coordenadas do vértice S desse quadrado? ";
                    qA = "(– 1 , 1). ";
                    qB = "(– 3 , 1). ";
                    qC = "(– 3 , – 1). ";
                    qD = "(– 1 , – 1). ";
                    break;
                case 24:

                    sourceString = "Um atleta de salto com vara, ao sair do solo, descreve no ar uma curva que tem o formato de um arco "+
                            "de parábola. Desenhada no plano cartesiano, essa curva é descrita pela função f : IR @longarrow IR definida por: "+
                            "f(x) = -x2 + 4x. @2"+
                            "@cimg mt540241 cimg@ @1"+
                            "Qual a altura máxima que o atleta atingiu nesse salto? ";
                    qA = "2 m. ";
                    qB = "4 m. ";
                    qC = "6 m. ";
                    qD = "8 m. ";
                    break;
                case 25:

                    sourceString = "Qual é a equação da circunferência de centro C(1,0) e raio r = 3? ";
                    qA = "x2 + y2 - 2x - 8 = 0. ";
                    qB = "x2 + y2 + 2x - 8 = 0. ";
                    qC = "x2 + y2 - 2x - 5 = 0. ";
                    qD = "x2 + y2 + 2x - 5 = 0. ";
                    break;
                case 26:

                    sourceString = "Jonas fez uma aplicação de R$ 3.000,00 a uma taxa de juros compostos de 4% ao mês, durante 4 meses.@1"+
                            "@1Qual será o montante de Jonas ao final desse período? ";
                    qA = "R$ 3.048,00. ";
                    qB = "R$ 3.048,28. ";
                    qC = "R$ 3.480,00. ";
                    qD = "R$ 3.509,58. ";
                    break;
                case 27:

                    sourceString = "Pedro está estudando os poliedros e construiu um tetraedro regular de papelão, como o que está "+
                            "desenhado abaixo.@2 "+
                            "@cimg mt540271 cimg@ "+
                            "@1Qual das figuras, abaixo, Pedro desenhou para montar esse tetraedro? ";
                    qA = "@cimg mt54027a cimg@";
                    qB = "@cimg mt54027b cimg@";
                    qC = "@cimg mt54027c cimg@";
                    qD = "@cimg mt54027d cimg@";

                    break;
                case 28:

                    sourceString = "Dentre os pares de números racionais abaixo, aquele em que os dois elementos representam o mesmo "+
                            "número é ";
                    qA = "0,31414... e 311/990. ";
                    qB = "0,1717... e 17/90. ";
                    qC = "0,025 e 25/100. ";
                    qD = "2,125 e 2125/10000. ";
                    break;
                case 29:

                    sourceString = "O quadro, abaixo, mostra o boletim anual de um aluno do 3°ano do ensino médio.@2 "+
                            "@cimg mt540291 cimg@ @1"+
                            "Para ser aprovado em cada disciplina, a média das notas dos quatro bimestres deve ser maior ou igual "+
                            "a 7,0. Caso contrário, o aluno fica em recuperação. Os resultados de Matemática e História já estão "+
                            "anotados no quadro.@1"+
                            "@1Esse aluno foi aprovado em quantas disciplinas? ";
                    qA = "2. ";
                    qB = "5. ";
                    qC = "6. ";
                    qD = "8 ";
                    break;

                case 30:

                    sourceString = "Observe a quantidade de figuras em cada coluna no quadro abaixo.@2 "+
                            "@cimg mt540301 cimg@ "+
                            "@1Mantendo esse mesmo padrão, quantas figuras terão na coluna 10? ";
                    qA = "33. ";
                    qB = "30. ";
                    qC = "27. ";
                    qD = "21. ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {

                case 1:

                    sourceString = "O esquema, abaixo, refere-se às duas fases do processo de fotossíntese.@2 "+
                            "@cimg cn540011 cimg@ @1"+
                            "Que substâncias estão representadas pelas setas 1 e 4, respectivamente? ";
                    qA = "Água e gás carbônico. ";
                    qB = "Amido e luz solar. ";
                    qC = "Clorofila e enzima. ";
                    qD = "Oxigênio e glicose. ";
                    break;
                case 2:

                    sourceString = "O esquema, abaixo, mostra uma teia alimentar composta por três cadeias alimentares.@2 "+
                            "@cimg cn540021 cimg@"+
                            "@1A relação ecológica mantida entre os indivíduos representados pelas letras B e C é denominada ";
                    qA = "competição. ";
                    qB = "parasitismo. ";
                    qC = "predação. ";
                    qD = "simbiose. ";
                    break;
                case 3:

                    sourceString = "O Sr. Ronaldo, agricultor famoso em uma cidade de Minas Gerais, antes de plantar milho, planta feijão no "+
                            "terreno.Um dos motivos da utilização dessa leguminosa antes da plantação do milho é a possibilidade de "+
                            "essas plantas se associarem a determinadas bactérias que formam nódulos em suas raízes.@1"+
                            "@1Essas bactérias estão relacionadas ao processo de ";
                    qA = "amonificação. ";
                    qB = "desnitrificação. ";
                    qC = "fixação de N2 ";
                    qD = "fixação do CO2 ";
                    break;
                case 4:

                    sourceString = "Uma população de bactérias foi colocada em um meio de cultura de um determinado antibiótico. A maioria "+
                            "das bactérias morreu, porém algumas sobreviveram e deram origem a linhagens resistentes a esse "+
                            "antibiótico.@1"+
                            "Para esse fato são propostas as explicações:@2"+
                            "I. Os antibióticos induziram a resistência em algumas bactérias.@1"+
                            "II. Os antibióticos selecionaram as bactérias resistentes.@2 "+
                            "As explicações apresentadas em I e II estão de acordo, respectivamente, com as ideias propostas pelas "+
                            "teorias de ";
                    qA = "Darwin e Wallace. ";
                    qB = "Lamarck e Darwin. ";
                    qC = "Lineu e Lamarck. ";
                    qD = "Wallace e Lineu. ";
                    break;
                case 5:

                    sourceString = "A ilustração, abaixo, mostra a reprodução da estrela-do-mar.@2 "+
                            "@cimg cn540051 cimg@ @1"+
                            "<small>Disponível em: http://www.prof2000.pt/users/esf_cn/Estrelamar.htm. Acesso em: 22 ago. 2010.</small> @2 "+
                            "Esse tipo de reprodução recebe o nome de ";
                    qA = "brotamento. ";
                    qB = "conjugação. ";
                    qC = "partenogênese. ";
                    qD = "regeneração. ";
                    break;
                case 6:

                    sourceString = "A ilustração, abaixo, mostra fases do desenvolvimento embrionário de diferentes vertebrados.@2 "+
                            "@cimg cn540061 cimg@ @1"+
                            "<small>Disponível em: www.educacaopublica.rj.gov.br. Acesso em: 22 ago. 2010.</small> @2 "+
                            "O estudo da embriologia comparada desses animais evidencia a ";
                    qA = "adaptação fisiológica às mesmas condições ambientais. ";
                    qB = "ocorrência de um processo de evolução convergente. ";
                    qC = "presença de cauda como característica comum no estágio final. ";
                    qD = "semelhança em seus estágios de desenvolvimento inicial. ";
                    break;
                case 7:

                    sourceString = "O caramujo gigante da espécie Achatina fulica, quando é alimentado com cenoura em grande quantidade, "+
                            "passa a ter cor alaranjada. Quando alimentado com beterraba, adquire uma cor rosada e, quando "+
                            "alimentado com folhas verdes, adquire um tom esverdeado.@1"+
                            "@1Essas mudanças mostram que o ";
                    qA = "fenótipo depende do ambiente. ";
                    qB = "fenótipo independe do genótipo. ";
                    qC = "genótipo depende do ambiente. ";
                    qD = "genótipo independe dos genes. ";
                    break;
                case 8:

                    sourceString = "O heredograma, abaixo, mostra os fenótipos dos grupos sanguíneos ABO e Rh em indivíduos de uma@2 "+
                            "família.@1"+
                            "@cimg cn540081 cimg@"+
                            "@1O genótipo do indivíduo indicado pelo número 6 deve ser ";
                    qA = "I@spBsp@I@spBsp@rr.";
                    qB = "I@spAsp@I@spAsp@rr.";
                    qC = "I@spAsp@iRrr.";
                    qD = "I@spAsp@I@spBsp@rr.";
                    break;
                case 9:

                    sourceString = "No citoplasma das células eucarióticas animais e vegetais, encontram-se organelas citoplasmáticas "+
                            "indispensáveis ao funcionamento do organismo vivo.@1"+
                            "Associe as duas colunas, relacionando as organelas às suas respectivas funções.@1"+
                            "@cimg cn540091 cimg@"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "3, 4, 1, 2, 5. ";
                    qB = "2, 3, 1, 5, 4. ";
                    qC = "2, 1, 3, 4, 5. ";
                    qD = "1, 3, 2, 4, 5. ";
                    break;
                case 10:

                    sourceString = "As minhocas são animais que vivem em solo úmido. Elas vivem enterradas, escavam galerias e canais "+
                            "buscando abrigo e restos orgânicos para se alimentarem.@1"+
                            "@1As trocas gasosas entre esses animais e o ambiente em que vivem são realizadas ";
                    qA = "pela pele ricamente vascularizada. ";
                    qB = "pelas brânquias localizadas na cabeça. ";
                    qC = "pelo pulmão simples e sem alvéolos. ";
                    qD = "pelos espiráculos das traqueias. ";
                    break;
                case 11:

                    sourceString = "A charge, abaixo, refere-se a um fenômeno causado pela interferência do ser humano nos ciclos "+
                            "biogeoquímicos.@1"+
                            "@cimg cn540111 cimg@"+
                            "@1<small>Disponível em: http://www.3.bp.blogspot.com/_VPsl4EAI754/Szp-vpqQL9I/AA.../. Acesso em: 25 ago. 2010.</small> @2 "+
                            "Em relação a esse fenômeno, são feitas as afirmativas:@2"+

                            "I. É causado pelo CO2 proveniente da queima de combustíveis fósseis e por outros gases, como o "+
                            "metano e o CFC liberados na atmosfera.@1"+

                            "II. O superaquecimento das regiões tropicais e subtropicais devido a esse fenômeno contribui para "+
                            "intensificar o processo de desertificação.@1"+

                            "III. Uma forma de minimização é o sequestro do CO2 "+
                            " por organismos autótrofos que o utilizam para a "+
                            "produção da glicose na fase química da fotossíntese.@1"+
                            "@1Estão corretas as afirmativas: ";
                    qA = "I e II, apenas. ";
                    qB = "I e III, apenas. ";
                    qC = "II e III, apenas. ";
                    qD = "I, II e III. ";
                    break;
                case 12:

                    sourceString = "Pela teoria de Oparin, os primeiros seres surgidos na Terra teriam sido heterótrofos e anaeróbios. Esses "+
                            "seres vivos iniciais realizavam a fermentação e, devido a esse processo, determinaram uma grande "+
                            "alteração na atmosfera da Terra primitiva.@1"+
                            "@1Que gás foi introduzido na atmosfera primitiva pelos primeiros seres vivos? ";
                    qA = "Carbônico. ";
                    qB = "Metano. ";
                    qC = "Nitrogênio. ";
                    qD = "Oxigênio. ";
                    break;
                case 13:

                    sourceString = "A malária, ou impaludismo, é uma doença muito disseminada nos países tropicais, inclusive no Brasil.@1"+
                            "Febre alta, sudorese e calafrios, palidez, cansaço e falta de apetite são alguns sintomas que podem se "+
                            "manifestar em intervalos regulares de tempo.@1"+
                            "Em relação às medidas profiláticas para essa doença, são feitas as seguintes afirmativas:@2"+

                            "I. As verduras ingeridas cruas devem ser bem lavadas e mergulhadas em água com vinagre.@1"+
                            "II. O tratamento das pessoas doentes é uma medida importante para impedir a contaminação do vetor.@1 "+
                            "III. A utilização de inseticidas nas moradias promove a destruição dos vetores dessa doença.@1 "+
                            "IV. As construções de instalações sanitárias adequadas são medidas eficientes na erradicação da malária.@1 "+

                            "@1Estão corretas as afirmativas: ";
                    qA = "I e II, apenas. ";
                    qB = "II e III, apenas. ";
                    qC = "I, III e IV, apenas. ";
                    qD = "I, II, III e IV. ";
                    break;
                case 14:

                    sourceString = "A ilustração, abaixo, mostra órgãos do sistema digestório.@2 "+
                            "@cimg cn540141 cimg@"+
                            "@1<small>Disponível em: http://www 4.bp.blogspot.com/.../sistema_digestorio.jpg. Acesso em: 30 ago. 2010.</small> @2 "+
                            "No órgão indicado pela seta há a ação ";
                    qA = "da enzima pepsina que transforma proteínas em peptídeos num meio com pH ácido. ";
                    qB = "da enzima lipase que é produzida pelo fígado e armazenada na vesícula biliar. ";
                    qC = "de substâncias produzidas pelas glândulas anexas do sistema digestório. ";
                    qD = "de hormônios produzidos pela glândula hipófise e que atuam na digestão. ";
                    break;
                case 15:

                    sourceString = "O esquema, abaixo, representa a espermatogênese humana.@2 "+
                            "@cimg cn540151 cimg@"+
                            "@1<small>Disponível em: http://www bi.gave.min-edu.pt/files/3231/I_1.png. Acesso em: 01 set. 2010. Adaptado.</small> @2 "+
                            "Nesse processo, as ";
                    qA = "células com capacidade de fecundação possuem acrossomo e flagelo. ";
                    qB = "células indicadas por II resultam de mitoses sofridas pelas espermatogônias. ";
                    qC = "espermátides indicadas por III são resultantes da primeira divisão da meiose. ";
                    qD = "espermatogônias possuem a metade do número de cromossomos da espécie. ";
                    break;
                case 16:

                    sourceString = "Leia o texto abaixo, que fala sobre uma técnica da produção de plantas.@2 "+
                            "A cultura de tecidos in vitro consiste, basicamente, em cultivar segmentos de plantas, em tubos "+
                            "de ensaio contendo meio de cultura adequado. A partir desses segmentos que podem ser "+
                            "gemas, fragmentos de folhas ou raízes, ápices caulinares entre outros, podem ser obtidas "+
                            "centenas a milhares de plantas. Essas plantas são, posteriormente, retiradas dos tubos de "+
                            "ensaio, aclimatadas, e levadas ao campo, onde se desenvolvem normalmente.@1"+
                            "@1<small>Disponível em: http://www.dq.ufrpe.br/culttec.htm. Acesso em: 02 set. 2010.</small> @2 "+
                            "Em relação à produção de plantas pela técnica descrita, são feitas as seguintes afirmativas:@2"+

                            "I. As plantas obtidas de uma mesma cultura de tecidos são geneticamente iguais entre si e com a "+
                            "planta matriz.@1"+

                            "II. Nessa técnica, as células são manipuladas geneticamente para obter indivíduos adultos com "+
                            "características alteradas.@1"+

                            "III. Ao se obter uma variedade de planta com as características ideais, é importante preservar as "+
                            "variedades originais.@1"+

                            "@1Estão corretas as afirmativas: ";
                    qA = "I e II, apenas. ";
                    qB = "I e III, apenas. ";
                    qC = "II e III, apenas. ";
                    qD = "I, II e III. ";
                    break;
                case 17:

                    sourceString = "O parasitismo é uma relação direta e estreita entre o hospedeiro e o parasita que leva ao desenvolvimento "+
                            "de doenças parasitárias responsáveis por uma grande mortalidade em todo o mundo.@1"+
                            "Associe as duas colunas, relacionando algumas doenças parasitárias com as respectivas formas de "+
                            "adquiri-las.@1"+
                            "@cimg cn540171 cimg@"+
                          "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "2, 3, 1, 4. ";
                    qB = "1, 4, 3, 2. ";
                    qC = "2, 4, 3, 1. ";
                    qD = "1, 3, 2, 4. ";
                    break;
                case 18:

                    sourceString = "O manual de instruções de um automóvel informa que o torque máximo a ser aplicado num de seus "+
                            "parafusos deve ser igual a 60 N.m, para que ele não seja danificado durante algum ajuste.@1"+
                            "A chave de boca utilizada no ajuste é mostrada na figura abaixo, em que os pontos X e Y estão a 20 cm "+
                            "e 30 cm, respectivamente, do parafuso.@1"+
                            "@cimg cn540181 cimg@"+
                            "Se for aplicada perpendicularmente à chave uma força igual a ";
                    qA = "200 N no ponto X, o parafuso será danificado. ";
                    qB = "350 N no ponto Y, o parafuso será danificado. ";
                    qC = "300 N no ponto Y, o parafuso não será danificado. ";
                    qD = "400 N no ponto X, o parafuso não será danificado. ";
                    break;
                case 19:

                    sourceString = "Utilizando-se uma lente esférica delgada convergente, com distância focal igual a 25 cm, e um objeto real "+
                            "posicionado a 20 cm de seu centro óptico, a imagem conjugada será ";
                    qA = "real, direita e de altura menor que a do próprio objeto. ";
                    qB = "real, invertida e de altura menor que a do próprio objeto. ";
                    qC = "virtual, direita e de altura maior que a do próprio objeto. ";
                    qD = "virtual, invertida e de altura maior que a do próprio objeto. ";
                    break;
                case 20:

                    sourceString = "Um móvel parte do repouso e alcança a velocidade final de 108 km/h em um intervalo de tempo igual a "+
                            "15 segundos.@1"+
                            "@1Qual é a aceleração média desse móvel, em unidades do Sistema Internacional? ";
                    qA = "2,0 m/s2 ";
                    qB = "7,2 (km/h)/s. ";
                    qC = "10,8 km/h@sp2sp@ ";
                    qD = "30 m/s2 ";
                    break;
                case 21:

                    sourceString = "Uma onda transversal propaga-se numa corda longa e bem esticada, que pode ser considerada ideal.@1"+
                            "Com a passagem da onda, cada ponto da corda executa duas oscilações completas a cada segundo.@1"+
                            "Sabe-se que a distância que separa uma crista de um vale sucessivos mede 20 cm.@1"+
                            "@1O comprimento de onda (λ), a velocidade de propagação (v) e a frequência (f) dessa onda valem ";
                    qA = "λ = 20 cm; v = 40 cm/s; f = 2,0 Hz. ";
                    qB = "λ = 20 cm; v = 10 cm/s; f = 0,5 Hz. ";
                    qC = "λ = 40 cm; v = 80 cm/s; f = 2,0 Hz. ";
                    qD = "λ = 40 cm; v = 20 cm/s; f = 0,5 Hz. ";
                    break;
                case 22:

                    sourceString = "Os dados apresentados, no quadro abaixo, representam as posições ocupadas por um móvel que executa@2 "+
                            "um movimento retilíneo entre os instantes 1,0 s e 9,0 s.@1"+
                            "@cimg cn540221 cimg@"+
                            "@1Nesse intervalo de tempo, constata-se que ";
                    qA = "a velocidade do móvel é constante e vale 2,0 m/s. ";
                    qB = "a velocidade do móvel é constante e vale 0,5 m/s. ";
                    qC = "o movimento é variado, já que o móvel altera os valores das posições ocupadas. ";
                    qD = "o movimento é acelerado, já que o móvel ocupa posições numericamente maiores. ";
                    break;
                case 23:

                    sourceString = "Numa superfície horizontal, onde qualquer tipo de atrito pode ser desprezado, um corpo de massa m = 40 kg, "+
                            "que estava inicialmente em repouso, recebe a ação de uma força horizontal de módulo constante F = 80 N.@1"+
                            "O trabalho realizado por essa força durante um deslocamento de 25 metros vale, em unidades do Sistema "+
                            "Internacional, ";
                    qA = "2000 J. ";
                    qB = "3200 J. ";
                    qC = "2000 N. ";
                    qD = "3200 N. ";
                    break;
                case 24:

                    sourceString = "Um bloco de massa m = 2,0 kg está preso numa das extremidades de uma mola ideal, cuja constante "+
                            "elástica vale k = 200 N/m. A posição “O”, mostrada na figura abaixo, representa a posição do bloco, "+
                            "quando a mola não está deformada.@1"+
                            "@cimg cn540241 cimg@"+
                            "Se a mola sofrer uma deformação de 10 cm em relação à posição “O”, quais serão, em unidades do "+
                            "Sistema Internacional, a energia potencial elástica (E@_p_@"+
                            ") e o módulo da força elástica (F@_e_@"+
                            ")? ";
                    qA = "E@_p_@ = 1,0 N e F@_e_@ = 20 J. ";
                    qB = "E@_p_@ = 1,0 J e F@_e_@  = 20 N. ";
                    qC = "E@_p_@ = 20 J e F@_e_@ = 1,0 N. ";
                    qD = "E@_p_@ = 20 N e F@_e_@ = 1,0 J.";
                    break;

                case 25:

                    sourceString = "Nas residências que dispõem de TV com controle remoto, é bastante comum deixá-la na condição de "+
                            "espera, onde um pequeno “led” permanece aceso durante as 24 horas do dia. Sabe-se que, nessas "+
                            "condições, a potência de um desses dispositivos fica em torno de 5,0 W.@1"+
                            "O preço do kWh cobrado por uma concessionária de energia é R$0,60. Em uma residência existem duas "+
                            "TV’s iguais a essa. @2 "+
                            "Qual o preço a ser pago, devido ao consumo apenas desse “led”, durante um mês de 30 dias? ";
                    qA = "R$ 4,32. ";
                    qB = "R$ 2,16. ";
                    qC = "R$ 0,18. ";
                    qD = "R$ 0,14. ";
                    break;
                case 26:

                    sourceString = "Uma criança brinca de girar num plano vertical uma pedra que se encontra amarrada a um pedaço de "+
                            "barbante muito resistente. Despreze os efeitos da resistência do ar.@1"+
                            "Durante o giro da pedra, atuam apenas as forças Peso (P) e de tração (T) aplicadas através do barbante.@1"+
                            "@1Quando a pedra passar pela parte mais baixa de sua trajetória, a resultante centrípeta será ";
                    qA = "apenas T. ";
                    qB = "apenas P. ";
                    qC = "T – P. ";
                    qD = "P – T. ";
                    break;
                case 27:

                    sourceString = "No circuito elétrico da figura abaixo, a bateria ideal fornece uma tensão V de valor desconhecido, e as " +
                            "resistências valem R@_1_@ = R@_2_@ = 6 Ω e R@_3_@ = 3 Ω. @2"+

                            "@cimg cn540271 cimg@ @1"+
                            "Sabendo-se que a corrente i@_3_@ "+
                            " vale 2,0 A, constata-se que ";

                    qA = "a potência elétrica dissipada pela resistência R@_1_@ "+
                            " é maior que a dissipada por R3 "+
                            ". ";
                    qB = "a corrente i representada no circuito possui intensidade maior que i@_3_@ ";
                    qC = "a resistência equivalente desse cicuito vale 15 Ω. ";
                    qD = "a tensão da bateria é V = 12 V. ";
                    break;
                case 28:

                    sourceString = "Dois corpos X e Y maciços e de volumes iguais, mas feitos com substâncias diferentes, ficam equilibrados "+
                            "distintamente, quando são colocados num recipiente contendo água.@1"+
                            "Note, pela figura abaixo, que X fica equilibrado com apenas metade de seu volume submerso, enquanto "+
                            "Y fica completamente submerso.@1"+
                            "@cimg cn540281 cimg@ "+
                            "@1Para essa situação, é correto afirmar que ";
                    qA = "a densidade de X é maior que a de Y. ";
                    qB = "o peso de Y é maior que o peso de X. ";
                    qC = "a pressão atuante em X é maior que a atuante em Y. ";
                    qD = "o empuxo que a água aplica em X é maior que em Y. ";
                    break;
                case 29:

                    sourceString = "João é um jogador de basquete que tem 2 metros de altura. Numa certa hora do dia, é projetada no chão "+
                            "plano e horizontal uma sombra dele com 40 centímetros de extensão. No mesmo instante, ele observa "+
                            "que a sombra de um prédio próximo tem comprimento de 12 metros.@1"+
                            "@1Com base no princípio da propagação retilínea da luz, João descobre que a altura do prédio é ";
                    qA = "96 m. ";
                    qB = "60 m. ";
                    qC = "30 m. ";
                    qD = "24 m. ";
                    break;
                case 30:

                    sourceString = "Durante uma partida de futebol, um jogador aplica uma força de 1200 N numa bola de massa igual a 400 g "+
                            "que se encontrava inicialmente em repouso.@1"+
                            "Considerando-se que, durante o chute, o contato entre o pé do jogador e a bola tenha uma duração de "+
                            "0,01 s, a velocidade atingida por ela, ao fim desse intervalo de tempo, vale ";
                    qA = "12 km/h. ";
                    qB = "12 m/s. ";
                    qC = "30 km/h. ";
                    qD = "30 m/s. ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {

                case 1:

                    sourceString = "Observe o mapa abaixo.@2 "+
                            "@cimg ch540011 cimg@"+
                            "@1<small>Disponível em: http://www.portalventrelivre.com/?tag=negros. Acesso em: 04 mai. 2010.</small> @2 "+
                            "Esse mapa retrata ";
                    qA = "a migração europeia para a América. ";
                    qB = "a vinda dos primeiros ingleses para a América. ";
                    qC = "o início da colonização europeia na América. ";
                    qD = "o tráfico de escravos africanos para a América. ";
                    break;
                case 2:

                    sourceString = "Observe o organograma abaixo.@2 "+
                            "@cimg ch540021 cimg@"+
                            "@2<small>Disponível em: http://ateliedehistoria.blogspot.com/2009_01_01_archive.html. Acesso em: 07 set. 2010.</small> @2 "+
                            "Esse organograma representa os princípios da ";
                    qA = "administração de D. João VI. ";
                    qB = "assembleia constituinte de 1823. ";
                    qC = "Constituição de 1824. ";
                    qD = "Constituição de 1891. ";
                    break;
                case 3:

                    sourceString = "Leia o poema, abaixo, sobre a conquista dos mares no início da era moderna.@2 "+
                            "Ó mar salgado, quanto do teu sal @1"+
                            "São lágrimas de Portugal!  @1"+
                            "Por te cruzarmos, quantas mães choraram,  @1"+
                            "Quantos filhos em vão rezaram!  @1"+
                            "Quantas noivas ficaram sem casar  @1"+
                            "Para que fosses nosso, ó mar!  @1"+
                            "Valeu a pena?  @1"+
                            "Tudo vale a pena  @1"+
                            "Se a alma não é pequena.@1"+
                            "Quem, quer passar além do Bojador  @1"+
                            "Tem que passar além da dor.@1"+
                            "Deus ao mar o perigo e o abismo deu.@1"+
                            "Mas nele é que espelhou o céu.@1"+
                            "@1<small>PESSOA, Fernando. Mar português. Rio de Janeiro: José Aguilar, 1960.</small> @2 "+
                            "De acordo com esse poema, a expansão marítima está relacionada à ";
                    qA = "aliança com as cidades italianas. ";
                    qB = "busca de uma rota comercial para as Índias. ";
                    qC = "conquista de Portugal pelos mouros. ";
                    qD = "descentralização do governo de Portugal. ";
                    break;
                case 4:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Dentre as revoltas coloniais, a Inconfidência Mineira foi a mais célebre, por marcar o início do "+
                            "processo de emancipação política do Brasil.@1"+
                            "@1<small>KOSHIBA Luiz e PEREIRA, Denise M. Frayze. História do Brasil. São Paulo: Editora Atual, 1987, p. 113.</small> @2 "+
                            "A Inconfidência Mineira pretendia ";
                    qA = "abolir a escravidão no Brasil. ";
                    qB = "implantar um governo republicano. ";
                    qC = "manter o pacto colonial. ";
                    qD = "transferir a capital para o Rio de Janeiro. ";
                    break;
                case 5:

                    sourceString = "Leia o texto, abaixo, relacionado ao Período Joanino no Brasil.@2 "+
                            "Em alguns jantares de cerimônia, podia-se notar que parte dos objetos de mesa eram de "+
                            "procedência inglesa, como a louça e a cristaleira, sendo comuns, no entanto, as cabaças e os "+
                            "cocos, em lugar de terrinas e xícaras. Colheres e garfos eram de prata, mas cada convidado "+
                            "comparecia com a sua própria faca, em geral comprida, pontiaguda e com cabo de prata lavrada.@1"+
                            "@1<small>FRIERO, Eduardo. Feijão, angu e couve. Belo Horizonte, Imprensa da UFMG, 1966.</small> @2 "+
                            "De acordo com esse texto, constata-se que a vinda da Corte Portuguesa para o Brasil ";
                    qA = "diminuiu a importação de produtos originados da Europa. ";
                    qB = "promoveu um crescimento industrial na colônia portuguesa. ";
                    qC = "proporcionou a divulgação de novos hábitos entre os colonos. ";
                    qD = "reafirmou antigos costumes africanos na América Portuguesa. ";
                    break;
                case 6:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Nas cidades, as camadas populares também resistiram ao autoritarismo e ao descaso das "+
                            "autoridades. Em 1902, o então presidente Rodrigues Alves confiou a Pereira Passos, prefeito "+
                            "do Rio (capital federal), seu plano de modernizar e higienizar a cidade. O prefeito começou "+
                            "pela construção da Avenida Central (hoje, Rio Branco) e, para isso, autorizou a demolição de "+
                            "casarões e casebres do centro, habitados pela população humilde da cidade. Aos gritos de "+
                            "“Bota abaixo!”, os funcionários da prefeitura derrubaram quarteirões inteiros.@1"+
                            "@1<small>BOULOS JÚNIOR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 4, p. 72.</small> @2 "+
                            "Esse movimento social da República Velha está relacionado à ";
                    qA = "Guerra de Canudos. ";
                    qB = "Guerra do Contestado. ";
                    qC = "Revolta da Chibata. ";
                    qD = "Revolta da Vacina. ";
                    break;
                case 7:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Por volta de 1515, a imensa concentração de árvores, denominadas de pau-brasil, presente "+
                            "no território brasileiro era conhecida pelos europeus. Esses extraíam da planta um pigmento "+
                            "de coloração vermelha, seu uso era voltado para o processo de tingimento de tecidos, que "+
                            "possuía um grande valor comercial, já a madeira era propícia à fabricação de móveis, também "+
                            "era utilizada na carpintaria.@1"+
                            "@1<small>Disponível em: http://www.historiadomundo.com.br/idade-moderna/a-exploracao-do-pau-brasil.htm. Acesso em: 07 set. 2010.</small> @2 "+
                            "Na exploração do pau-brasil foi utilizada a mão de obra ";
                    qA = "africana. ";
                    qB = "indígena. ";
                    qC = "italiana. ";
                    qD = "portuguesa. ";
                    break;
                case 8:

                    sourceString = "Leia o texto, abaixo, relacionado à atividade mineradora na América Portuguesa.@2 "+
                            "Antes de serem criadas as Casas de Fundição, o ouro produzido na região mineradora circulava "+
                            "livremente em pó ou pepitas. Isso dificultava na cobrança do quinto – imposto de 20% sobre "+
                            "o ouro descoberto – favorecendo o comércio ilegal e o contrabando. Para garantir o controle "+
                            "sobre a produção do ouro, o governo português criou as Casas de Fundição e proibiu que o "+
                            "ouro em pó continuasse circulando.@1"+

                            "@1<small>Disponível em: http://www.historiabrasileira.com/brasil-colonia/casas-de-fundicao/. Acesso em: 07 set. 2010.</small> @2 "+
                            "A criação das Casas de Fundição se relaciona com a ";
                    qA = "Guerra dos Emboabas. ";
                    qB = "Guerra dos Mascates. ";
                    qC = "Revolta de Beckman. ";
                    qD = "Revolta de Vila Rica. ";
                    break;
                case 9:

                    sourceString = "A charge, abaixo, representa um movimento operário do início do século XIX.@2 "+
                            "@cimg ch540091 cimg@ @1"+
                            "<small>Disponível em: http://forcadotrabalho.blogspot.com/2009/06/ludismo.html. Acesso em: 13 set. 2010.</small> @2 "+
                            "Esse movimento denominou-se ";
                    qA = "Anarquismo. ";
                    qB = "Cartismo. ";
                    qC = "Ludismo. ";
                    qD = "Socialismo. ";
                    break;
                case 10:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A globalização pode ser definida como um processo histórico de crescente interligação "+
                            "econômica, social e cultural entre os diferentes povos e países. A partir dos anos de 1970, a "+
                            "globalização começou a se acelerar graças à descoberta de novas tecnologias da informação e "+
                            "à automação do processo produtivo.@1"+
                            "@1<small>BOULOS JÚNIOR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 4, p. 276.</small> @2 "+
                            "A globalização tem como característica a ";
                    qA = "criação de direitos trabalhistas. ";
                    qB = "integração do comércio mundial. ";
                    qC = "intervenção do Estado na economia. ";
                    qD = "nacionalização da produção. ";
                    break;
                case 11:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Com a aceleração industrial, a concorrência entre as grandes empresas aumentou muito. Para "+
                            "vencer a concorrência, o grande capitalista fazia guerras de preços: mantinha seus preços bem "+
                            "baixos por certo tempo, até que seus concorrentes não aguentassem e falissem ou vendessem "+
                            "a empresa por um valor baixo. Assim, aos poucos, empresas mais fortes foram “engolindo” as "+
                            "mais fracas e, com isso, formaram-se empresas gigantes ou associações de empresas (trustes, "+
                            "cartéis e holdings).@1"+
                            "@1<small>BOULOS JÚNIOR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 4, p. 12.</small> @2 "+
                            "Esse texto relaciona-se ";
                    qA = "à I Revolução Industrial. ";
                    qB = "à II Revolução Industrial. ";
                    qC = "ao Capitalismo comercial. ";
                    qD = "ao Colonialismo. ";
                    break;
                case 12:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Em 20 de março de 2003, a poderosa máquina de guerra anglo-americana invadiu o país pelo "+
                            "sul e pelo norte. E logo descobriram que, em vez de armas químicas, os iraquianos possuíam "+
                            "armas medíocres e arcaicas. A guerra, então, transformou-se em massacre. Em poucos dias, "+
                            "os anglo-americanos conquistaram Bagdá, a capital do país; o ditador iraquiano e sua família "+
                            "haviam fugido levando consigo uma fortuna em dólares. Populares aproveitaram para saquear "+
                            "edifícios públicos, depósitos de alimentos, lojas, bancos, museus e os vários palácios do ditador.@1"+
                            "@1<small>BOULOS JÚNIOR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 4, p. 194.</small> @2 "+
                            "A invasão do Iraque pelos Estados Unidos representou ";
                    qA = "a intenção de disponibilizar água no Oriente Médio. ";
                    qB = "a pressão para modernizar os costumes orientais. ";
                    qC = "o combate à venda de armamentos modernos. ";
                    qD = "o interesse pela segunda reserva mundial de petróleo. ";
                    break;
                case 13:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Durante a Grande Depressão, os Estados Unidos reduziram tanto exportações como importações "+
                            "em cerca de 70%, e mais: os norte-americanos praticamente interromperam a compra de "+
                            "produtos, como açúcar, cobre, estanho e café, além de suspenderem os empréstimos externos.@1"+
                            "Com isso, o Brasil, que na época era grande exportador de café (mais de 60% das nossas "+
                            "exportações) e tinha nos Estados Unidos seu maior comprador, foi duramente atingido pela "+
                            "crise. Nossos estoques de café aumentaram, e os preços caíram violentamente, o que arruinou "+
                            "muitos cafeicultores, acarretando desemprego e carestia.@1"+

                            "<small>BOULOS JÚNIOR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 4, p. 99.</small> @2 "+
                            "Esse texto refere-se ";
                    qA = "à Crise de 1929. ";
                    qB = "à propaganda fascista. ";
                    qC = "ao american way of life. ";
                    qD = "ao New Deal. ";
                    break;
                case 14:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@cimg ch540141 cimg@"+
                            "@1<small>Disponível em: http://wwwhistoriausp.wordpress.com/imagens/ . Acesso em: 17 fev. 2010.</small> @2 "+
                            "Essa imagem faz uma crítica ao ";
                    qA = "absolutismo do Segundo Reinado. ";
                    qB = "autoritarismo da Ditadura Militar. ";
                    qC = "intervencionismo da Primeira República. ";
                    qD = "populismo da República Democrática. ";
                    break;
                case 15:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A chave da organização dos grandes espetáculos era converter a própria multidão em peça "+
                            "essencial dessa mesma organização. Nas paradas e desfiles pelas ruas ou nas manifestações "+
                            "de massa, estáticas, em praças públicas, a multidão se emocionava de maneira contagiante, "+
                            "participando ativamente da produção de uma energia que carregava consigo após os "+
                            "espetáculos, redistribuindo-a no dia a dia, para escapar da monotonia de sua existência e "+
                            "prolongar a dramatização da vida cotidiana.@1"+
                            "@1<small>LENHARO, Alcir. Nazismo: o triunfo da vontade. São Paulo: Ática, 1998. p. 39.</small> @2 "+
                            "Esse texto refere-se aos regimes ";
                    qA = "absolutistas. ";
                    qB = "liberais. ";
                    qC = "socialistas. ";
                    qD = "totalitários. ";
                    break;
                case 16:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Fora muito emocionante aquela chegada. De repente, toda a minha vida desfilou através dos "+
                            "rostos envelhecidos: companheiros de trabalho, os de luta armada, os de cadeia e os de exílio, "+
                            "os primeiros filhos dos amigos e os últimos, nascidos há pouco tempo, olhando assustados "+
                            "para aquele homem sendo carregado pela multidão. O que está havendo aqui?, deveriam estar "+
                            "perguntando aos seus pais, através dos olhos escancarados. (...) Os gritos dos amigos me "+
                            "chamavam a atenção para os seus rostos e cada um deles representava uma época na minha "+
                            "memória. (...) De repente, uma voz me chamava à infância, outra me chamava ao tempo de "+
                            "cadeia e, logo em seguida, uma outra me reconduzia à infância. (...) Era um filme montado sem "+
                            "nenhuma preocupação cronológica. As coisas aconteciam como acontecem na memória: aos "+
                            "saltos. (...) Meu passado estava quase todo no aeroporto. Mas e o futuro? "+
                            " GABEIRA, Fernando. Entradas e bandeiras. Rio de Janeiro: Codecri, 1981. p. 31-32.@1"+
                            "@1O depoimento relaciona-se com ";
                    qA = "a anistia concedida no final do governo militar. ";
                    qB = "a disputa presidencial na campanha das “Diretas Já”. ";
                    qC = "o movimento de impeachment contra o governo Collor. ";
                    qD = "o populismo típico da República Democrática. ";
                    break;
                case 17:

                    sourceString = "Leia o texto, abaixo, sobre a Revolução Cubana.@2 "+
                            "Em 1959, uma revolução na ilha de Cuba levou ao poder um governo chefiado por Fidel Castro.@1"+
                            "Ele e sua equipe determinaram a realização imediata de uma reforma agrária, com a tomada "+
                            "das propriedades dos grandes fazendeiros e sua transformação em cooperativas agrícolas.@1"+
                            "Apoiados pelos Estados Unidos, os opositores da revolução tentaram derrubar o governo "+
                            "castrista, mas fracassaram.@1"+
                            "@1<small>DREGUER, Ricardo e TOLEDO, Eliete. Novo História: conceitos e procedimentos. São Paulo: Atual, v. 4, p. 127.</small> @2 "+
                            "Com a Revolução, os governantes cubanos se declararam ";
                    qA = "anarquistas. ";
                    qB = "capitalistas. ";
                    qC = "liberais. ";
                    qD = "socialistas. ";
                    break;

                case 18:

                    sourceString = "Leia o texto abaixo, que apresenta algumas características do século XXI.@2 "+
                            "Vivemos no século XXI, era da informação, das buscas do ser humano pelo saber infinito; era "+
                            "das avalanches de novas tecnologias, da informática (redes de computadores) e principalmente "+
                            "da Internet, que estão explodindo e adentrando em todos os campos de atuação do homem, "+
                            "facilitando as suas atividades em todas as suas áreas de ação e/ou atuação, principalmente, "+
                            "no ambiente educativo, em que a Internet e as redes de computadores estão contribuindo "+
                            "qualitativamente no desenvolvimento do educando.@1"+
                            "@1<small>Disponível em: http://www.webartigos.com/articles/8244/1/A-Importancia-Da-Organizacao-Da-Informacao-No-Seculo-XXIReflexoes/pagina1.html. Acesso em: 03 set. 2010. Fragmento.</small> @2 "+
                            "As mudanças promovidas pela globalização deram origem a uma nova sociedade a que se convencionou "+
                            "chamar de sociedade ";
                    qA = "da competência. ";
                    qB = "da produção. ";
                    qC = "do conhecimento. ";
                    qD = "do individualismo. ";
                    break;
                case 19:

                    sourceString = "Leia o texto abaixo, que apresenta o Projeto Jaíba.@2 "+
                            "Jaíba é a designação dada a uma porção de terras de cerca de 300 mil hectares, localizada "+
                            "entre a margem direita do Rio São Francisco e a esquerda do Rio Verde Grande, abrangendo "+
                            "terras do município de Matias Cardoso e do município de Jaíba, localizado ao Norte de Minas.@1"+
                            "Na primeira fase do projeto, foram constituídos cerca de 200 km de canais, para levar a água "+
                            "do São Francisco até os lotes.@1"+
                            "Na segunda fase, atual estágio do projeto, 20 mil hectares serão contemplados com irrigação.@1"+
                            "@1<small>Disponível em: http://www.ief.mg.gov.br/programas-e-projetos/projeto-jaiba. Acesso em: 21 fev. 2010.</small> @2 "+
                            "Um dos objetivos desse projeto é ";
                    qA = "assegurar a produção de energia solar. ";
                    qB = "ampliar a produção de ferro e ouro. ";
                    qC = "distribuir casas para a população local. ";
                    qD = "implantar uma agricultura moderna. ";
                    break;
                case 20:

                    sourceString = "Observe a imagem abaixo, que apresenta o trabalho humanitário de brasileiros que fazem parte da@2 "+
                            "organização Médicos Sem Fronteiras (MSF).@1"+
                            "@cimg ch540201 cimg@"+
                            "@1<small>Disponível em: http://www.msf.org.br/Arquivos/Doc/Publicacoes/93.pdf. Acesso em: 05 set. 2010.</small> @2 "+
                            "Médicos Sem Fronteiras é uma organização médico-humanitária internacional, independente e "+
                            "comprometida em levar ajuda às pessoas que dela mais precisam.@1"+
                            "@1Essa organização faz parte de ";
                    qA = "um projeto governamental. ";
                    qB = "um programa tecnológico. ";
                    qC = "uma empresa multinacional. ";
                    qD = "uma rede de solidariedade. ";
                    break;
                case 21:

                    sourceString = "Observe a imagem abaixo, que apresenta diversos tipos de falhas geológicas.@2 "+
                            "@cimg ch540211 cimg@"+
                            "@2<small>Disponível em: http://2.bp.blogspot.com/_5myjqlrruiI/ShyszIPDlpI/AAAAAAAAAVo/kyEtZO2js00/s400/falha.jpg. Acesso em: 30 ago. 2010.</small> @2 "+
                            "As falhas são um fenômeno que ocorre na ";
                    qA = "atmosfera. ";
                    qB = "hidrosfera. ";
                    qC = "litosfera. ";
                    qD = "termosfera. ";
                    break;
                case 22:

                    sourceString = "Leia o texto abaixo, que apresenta uma atitude de preservação do meio ambiente urbano.@2 "+
                            "Você já sabe que baterias, celulares, carregadores, computadores, televisores e pilhas velhas "+
                            "não devem ser jogados no lixo comum – esse material tem metais que podem contaminar o solo "+
                            "e a água. Mas o que fazer com todo esse lixo eletrônico, apelidado de e-lixo? Em São Paulo, "+
                            "existe um site para o usuário encontrar lugares que coletam aparelhos obsoletos ou fora de uso "+
                            "e que dão um destino mais ecológico a eles.@1"+
                            "@1<small>Disponível em: http://planetasustentavel.abril.com.br/noticia/lixo/e-lixo-maps-descarte-lixo-eletronico-reciclagem-591500.shtml. Acesso em: 06 set. 2010. Adaptado.</small> @2 "+
                            "Essa atitude propõe ";
                    qA = "substituir aparelhos obsoletos por modernos. ";
                    qB = "evitar danos ambientais causados pelo consumo. ";
                    qC = "diminuir o consumo de produtos eletrônicos. ";
                    qD = "difundir aparelhos eletrônicos mais eficientes. ";
                    break;
                case 23:

                    sourceString = "Leia o texto abaixo, que relata a produção agrícola de alguns agricultores familiares.@2 "+
                            "Na Serra da Capivara, no município de Elizeu Martins (PI), a agricultora familiar F.S.S. está "+
                            "concluindo a colheita de 1,6 mil quilos de mamona e mil quilos de feijão produzidos em dois "+
                            "hectares. Em São Raimundo Nonato (PI), o agricultor D.N. já colheu 1,6 mil quilos de mamona "+
                            "e 1,2 mil quilos de feijão.@1"+
                            "@1<small>Disponível em: http://sistemas.mda.gov.br/portal/index/show/index/cod/134/codInterno/21473. Acesso em: 01 set. 2010. Adaptado.</small> @2 "+
                            "A produção de mamona amplia a renda desses agricultores devido à sua utilização na produção de ";
                    qA = "alimento. ";
                    qB = "biodiesel. ";
                    qC = "fertilizante. ";
                    qD = "tempero. ";
                    break;
                case 24:

                    sourceString = "Observe a imagem abaixo, que apresenta o esquema da especulação imobiliária.@2 "+
                            "@cimg ch540241 cimg@"+
                            "@1<small>Disponível em: http://urbanidades.arq.br/2008/09/o-que-e-especulacao-imobiliaria/. Acesso em: 04 set. 2010.</small> @2 "+
                            "A elevação do preço do terreno deve-se ";
                    qA = "às melhorias nas condições de acessibilidade. ";
                    qB = "ao aumento do escoamento da água pluvial. ";
                    qC = "às melhorias no sistema de telecomunicações. ";
                    qD = "ao aumento do valor dos impostos municipais. ";
                    break;
                case 25:

                    sourceString = "Observe a imagem abaixo, que retrata a reivindicação de um grupo de pessoas.@2 "+
                            "@cimg ch540251 cimg@"+
                            "@1<small>Disponível em: http://www.quimicosunificados.com.br/dbimagens/0d60d7b4fb9fbc4cb6926aca761b122d.jpg. Acesso em: 05 set. 2010.</small> @2 "+
                            "Esse movimento social reivindica o ";
                    qA = "emprego. ";
                    qB = "imposto. ";
                    qC = "salário. ";
                    qD = "sindicato. ";
                    break;
                case 26:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Na Pesquisa Nacional de Saneamento Básico divulgada no dia 20 de agosto de 2010 pelo IBGE "+
                            "(Instituto Brasileiro de Geografia e Estatística), em 2008 o percentual de domicílios brasileiros "+
                            "sem rede de esgoto era maior na região Norte, onde 96,2% das unidades não eram atendidas.@1"+
                            "Nas regiões Nordeste e Sul, a proporção também era inferior à média brasileira, com 77,6% e "+
                            "68,8% de domicílios, respectivamente, sem acesso. Apenas na região Sudeste, a minoria das "+
                            "unidades não possuía rede de esgoto (31,2%).@1"+
                            "@1<small>Disponível em: http://noticias.uol.com.br/cotidiano/2010/08/20/maioria-dos-brasileiros-ainda-nao-tem-acesso-a-rede-de-esgoto-diz-ibge.jhtm. Acesso em: 20 ago. 2010. Fragmento.</small> @2 "+
                            "A situação do saneamento básico no Brasil indica ";
                    qA = "dificuldades de atender à população de um país muito grande. ";
                    qB = "falta de água para a população da região Norte e Nordeste. ";
                    qC = "falta de recursos da população para pagar por água tratada. ";
                    qD = "melhores condições de vida para a população do Sudeste. ";
                    break;
                case 27:

                    sourceString = "O texto, abaixo, apresenta as características de um bioma brasileiro.@2 "+
                            "Um dos biomas brasileiros se localiza na região do Mato Grosso e Mato Grosso do Sul, estendendo- "+
                            "-se em território boliviano, argentino e paraguaio e ocupando cerca de 240.000 km2 "+
                            ". Considerada "+
                            "a maior região alagável do planeta, apresenta áreas inundadas ricas em gramíneas, arbustos e "+
                            "árvores em épocas chuvosas (entre outubro e abril); e pequenas lagoas em toda a sua extensão "+
                            "em épocas mais secas, sendo esse um momento propício para a ocorrência de queimadas.@1"+
                            "@1<small>Disponível em: http://www.mundoeducacao.com.br/biologia.htm. Acesso em: 10 set. 2010. Fragmento.</small> @2 "+
                            "Qual é esse bioma? ";
                    qA = "Caatinga. ";
                    qB = "Cerrado. ";
                    qC = "Pantanal. ";
                    qD = "Pradaria. ";
                    break;
                case 28:

                    sourceString = "Leia o texto abaixo, que destaca uma fonte alternativa de energia.@2 "+
                            "A grande vantagem do álcool (ou etanol) em relação a seu principal concorrente, a gasolina, "+
                            "está na forma como o combustível é obtido. No caso do álcool, trata-se de uma fonte renovável, "+
                            "isto é, que pode ser produzida indefinidamente desde que haja condições mínimas, como a "+
                            "disposição de sol, chuvas e terra para a plantação.@1"+
                            "@1<small>Disponível em: http://noticias.uol.com.br/economia/ultnot/2007/03/08/ult4294u282.jhtm. Acesso em: 07 set. 2010. Fragmento.</small> @2 "+
                            "Apesar das vantagens apresentadas pelo uso do álcool como combustível, há um dejeto gerado na sua "+
                            "produção que provoca a contaminação da água e do solo.@1"+
                            "@1Esse dejeto é o ";
                    qA = "bagaço. ";
                    qB = "chorume. ";
                    qC = "esgoto. ";
                    qD = "vinhoto. ";
                    break;
                case 29:

                    sourceString = "Leia o texto abaixo, que apresenta as mudanças produzidas pelo aumento da informatização no sistema@2 "+
                            "bancário.@1"+
                            "Uma agência bancária, no passado, realizava suas tarefas totalmente manualmente, "+
                            "compensação de cheques, pagamentos, depósitos, saques, cadastro de clientes e de contas.@1"+
                            "Com o passar do tempo, alguns processos foram sendo lentamente informatizados, buscando "+
                            "maneiras melhores de se lidar com os dados bem como uma solução para a comunicação "+
                            "entre as várias agências espalhadas pelo Mundo. Tal processo fez com que tarefas que "+
                            "eram realizadas por pessoas fossem substituídas pelas máquinas, causando a diminuição de "+
                            "funcionários. Abriam-se novas agências, porém a quantidade de pessoas necessárias para "+
                            "mantê-las em operação diminuía, mantinha-se ou aumentava muito pouco.@1"+
                            "@1<small>Disponível em: http://www.webartigos.com/articles/12413/1/Tecnologia-e-Seus-Efeitos-Negativos/pagina1.html#ixzz0zGToJhIw. Acesso em: 12 set. 2010. Fragmento.</small> @2 "+
                            "Essas mudanças provocaram ";
                    qA = "o aumento do desemprego. ";
                    qB = "o fechamento de agências. ";
                    qC = "a lentidão do atendimento. ";
                    qD = "a queda de depósitos bancários. ";
                    break;
                case 30:

                    sourceString = "Leia a charge, abaixo, relacionada a um problema da estrutura fundiária brasileira.@2 "+
                            "@cimg ch540301 cimg@"+
                            "@1<small>Disponível em: http://1.bp.blogspot.com/_RrrmBnoIDmg/SuTliu1Qo-I/AAAAAAAAAA0/GF-HYU5Ewx8/s320/charge_mst%5B1%5D.jpg.. Acesso em: 12 fev. 2010.</small> @2 "+
                            "Nessa charge, os personagens que dizem querer terra representam os ";
                    qA = "agricultores dos países mais desenvolvidos. ";
                    qB = "funcionários do setor da prestação de serviços. ";
                    qC = "líderes sindicais dos trabalhadores terceirizados. ";
                    qD = "participantes dos movimentos sociais rurais. ";
                    break;

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