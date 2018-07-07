package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2012 {





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
            D,C,D,C,A,D,B,C,B,A,
            D,C,D,B,C,C,A,A,D,D,
            A,D,A,D,A,A,C,B,C,B,
    };

    String[] gabmt = {

            C,B,A,D,C,A,D,C,A,B,
            D,A,B,D,B,A,B,D,A,C,
            B,A,C,D,A,C,A,B,D,C,

    };

    String[] gabcn = {
            A,B,A,C,C,B,B,C,A,C,
            B,A,C,D,C,A,A,D,C,B,
            C,B,A,D,D,A,C,A,D,D,
    };

    String[] gabch = {
            B,C,D,D,B,A,A,C,D,A,
            A,C,C,D,B,B,A,D,B,D,
            C,B,D,C,D,D,B,C,B,A,
    };

    //Simulado 4 - ENSINO MÉDIO (Prova 5)
    public Prova2012(Context contexto, Simulado simulado) {
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
                    texto = "@b MÍDIA E EDUCAÇÃO b@ @1"+
                            "Autora: Maria da Graça Setton @1"+
                            "Editora: Contexto @1"+
                            "Páginas: 128 @2"+
                            "Com a proposta de refletir sobre o papel pedagógico – e, muitas vezes, ideológico – dos meios "+
                            "de comunicação, a socióloga Maria da Graça Setton aborda a mídia como um espaço educativo, "+
                            "responsável pela produção de informações e valores que ajudam os indivíduos a organizar sua "+
                            "vida e suas ideias. Para a autora, as mídias podem ser entendidas como todo o aparato simbólico "+
                            "e material relacionado à produção de mercadorias de caráter cultural.@1"+
                            "O livro é composto por seis capítulos, sendo que o primeiro, “Mídias: uma nova matriz de "+
                            "cultura”, define o eixo central de análise de toda a discussão, enquanto os seguintes apresentam "+
                            "definições, autores, conceitos e perspectivas que se tornaram referência nas investigações sobre "+
                            "os impactos das mídias.@1"+
                            "Entre as escolas e os pensadores abordados estão a escola de Frankfurt, especialmente no "+
                            "que concerne à caracterização da cultura moderna das sociedades ocidentais, e Edgar Morin, "+
                            "apresentado da ótica da perspectiva da integração da cultura. O livro ainda trata dos estudos de "+
                            "recepção e da relação entre educação e cibercultura.@1"+
                            "@1 <small> Língua Portuguesa – Conhecimento prático, nº 26, p. 64. </small> @2 ";

                    sourceString = texto+"Considerando-se as características estruturais, temáticas e o meio de circulação, conclui-se que esse "+
                            "texto é um exemplo de ";
                    qA = "conto. ";
                    qB = "editorial. ";
                    qC = "propaganda. ";
                    qD = "resenha. ";
                    break;
                case 2:

                    texto = "@b MÍDIA E EDUCAÇÃO b@ @1"+
                            "Autora: Maria da Graça Setton @1"+
                            "Editora: Contexto @1"+
                            "Páginas: 128 @2"+
                            "Com a proposta de refletir sobre o papel pedagógico – e, muitas vezes, ideológico – dos meios "+
                            "de comunicação, a socióloga Maria da Graça Setton aborda a mídia como um espaço educativo, "+
                            "responsável pela produção de informações e valores que ajudam os indivíduos a organizar sua "+
                            "vida e suas ideias. Para a autora, as mídias podem ser entendidas como todo o aparato simbólico "+
                            "e material relacionado à produção de mercadorias de caráter cultural.@1"+
                            "O livro é composto por seis capítulos, sendo que o primeiro, “Mídias: uma nova matriz de "+
                            "cultura”, define o eixo central de análise de toda a discussão, enquanto os seguintes apresentam "+
                            "definições, autores, conceitos e perspectivas que se tornaram referência nas investigações sobre "+
                            "os impactos das mídias.@1"+
                            "Entre as escolas e os pensadores abordados estão a escola de Frankfurt, especialmente no "+
                            "que concerne à caracterização da cultura moderna das sociedades ocidentais, e Edgar Morin, "+
                            "apresentado da ótica da perspectiva da integração da cultura. O livro ainda trata dos estudos de "+
                            "recepção e da relação entre educação e cibercultura.@1"+
                            "@1 <small> Língua Portuguesa – Conhecimento prático, nº 26, p. 64. </small> @2 ";

                    sourceString = texto+"O título desse texto, relacionado ao seu conteúdo, refere-se ";
                    qA = "à importância da mídia no meio social. ";
                    qB = "à produção cultural da atualidade. ";
                    qC = "ao papel educativo da mídia atual. ";
                    qD = "ao papel da educação na mídia atual. ";
                    break;
                case 3:

                    texto = "@b MÍDIA E EDUCAÇÃO b@ @1"+
                            "Autora: Maria da Graça Setton @1"+
                            "Editora: Contexto @1"+
                            "Páginas: 128 @2"+
                            "Com a proposta de refletir sobre o papel pedagógico – e, muitas vezes, ideológico – dos meios "+
                            "de comunicação, a socióloga Maria da Graça Setton aborda a mídia como um espaço educativo, "+
                            "responsável pela produção de informações e valores que ajudam os indivíduos a organizar sua "+
                            "vida e suas ideias. Para a autora, as mídias podem ser entendidas como todo o aparato simbólico "+
                            "e material relacionado à produção de mercadorias de caráter cultural.@1"+
                            "O livro é composto por seis capítulos, sendo que o primeiro, “Mídias: uma nova matriz de "+
                            "cultura”, define o eixo central de análise de toda a discussão, enquanto os seguintes apresentam "+
                            "definições, autores, conceitos e perspectivas que se tornaram referência nas investigações sobre "+
                            "os impactos das mídias.@1"+
                            "Entre as escolas e os pensadores abordados estão a escola de Frankfurt, especialmente no "+
                            "que concerne à caracterização da cultura moderna das sociedades ocidentais, e Edgar Morin, "+
                            "apresentado da ótica da perspectiva da integração da cultura. O livro ainda trata dos estudos de "+
                            "recepção e da relação entre educação e cibercultura.@1"+
                            "@1 <small> Língua Portuguesa – Conhecimento prático, nº 26, p. 64. </small> @2 ";

                    sourceString = texto+"Nesse texto, a expressão “Para a autora” introduz uma ";
                    qA = "crítica. ";
                    qB = "definição. ";
                    qC = "inferência. ";
                    qD = "opinião. ";
                    break;
                case 4:

                    texto = "@b MÍDIA E EDUCAÇÃO b@ @1"+
                            "Autora: Maria da Graça Setton @1"+
                            "Editora: Contexto @1"+
                            "Páginas: 128 @2"+
                            "Com a proposta de refletir sobre o papel pedagógico – e, muitas vezes, ideológico – dos meios "+
                            "de comunicação, a socióloga Maria da Graça Setton aborda a mídia como um espaço educativo, "+
                            "responsável pela produção de informações e valores que ajudam os indivíduos a organizar sua "+
                            "vida e suas ideias. Para a autora, as mídias podem ser entendidas como todo o aparato simbólico "+
                            "e material relacionado à produção de mercadorias de caráter cultural.@1"+
                            "O livro é composto por seis capítulos, sendo que o primeiro, “Mídias: uma nova matriz de "+
                            "cultura”, define o eixo central de análise de toda a discussão, enquanto os seguintes apresentam "+
                            "definições, autores, conceitos e perspectivas que se tornaram referência nas investigações sobre "+
                            "os impactos das mídias.@1"+
                            "Entre as escolas e os pensadores abordados estão a escola de Frankfurt, especialmente no "+
                            "que concerne à caracterização da cultura moderna das sociedades ocidentais, e Edgar Morin, "+
                            "apresentado da ótica da perspectiva da integração da cultura. O livro ainda trata dos estudos de "+
                            "recepção e da relação entre educação e cibercultura.@1"+
                            "@1 <small> Língua Portuguesa – Conhecimento prático, nº 26, p. 64. </small> @2 ";

                    sourceString = texto+"De acordo com esse texto, Maria da Graça Setton vê a mídia de modo ";
                    qA = "ambíguo. ";
                    qB = "descrente. ";
                    qC = "positivo. ";
                    qD = "questionador. ";
                    break;
                case 5:

                    texto = "@b MÍDIA E EDUCAÇÃO b@ @1"+
                            "Autora: Maria da Graça Setton @1"+
                            "Editora: Contexto @1"+
                            "Páginas: 128 @2"+
                            "Com a proposta de refletir sobre o papel pedagógico – e, muitas vezes, ideológico – dos meios "+
                            "de comunicação, a socióloga Maria da Graça Setton aborda a mídia como um espaço educativo, "+
                            "responsável pela produção de informações e valores que ajudam os indivíduos a organizar sua "+
                            "vida e suas ideias. Para a autora, as mídias podem ser entendidas como todo o aparato simbólico "+
                            "e material relacionado à produção de mercadorias de caráter cultural.@1"+
                            "O livro é composto por seis capítulos, sendo que o primeiro, “Mídias: uma nova matriz de "+
                            "cultura”, define o eixo central de análise de toda a discussão, enquanto os seguintes apresentam "+
                            "definições, autores, conceitos e perspectivas que se tornaram referência nas investigações sobre "+
                            "os impactos das mídias.@1"+
                            "Entre as escolas e os pensadores abordados estão a escola de Frankfurt, especialmente no "+
                            "que concerne à caracterização da cultura moderna das sociedades ocidentais, e Edgar Morin, "+
                            "apresentado da ótica da perspectiva da integração da cultura. O livro ainda trata dos estudos de "+
                            "recepção e da relação entre educação e cibercultura.@1"+
                            "@1 <small> Língua Portuguesa – Conhecimento prático, nº 26, p. 64. </small> @2 ";

                    sourceString = texto+"No trecho “O livro ainda trata...”, a palavra destacada expressa uma ideia de ";
                    qA = "acréscimo. ";
                    qB = "explicação. ";
                    qC = "oposição. ";
                    qD = "tempo. ";
                    break;


                case 6:
                    texto = "@b PREVISÃO DO TEMPO b@ @2 "+
                            "Os índios de uma reserva distante perguntam ao novo chefe se o próximo inverno seria suave "+
                            "ou rigoroso. Como o jovem chefe não havia aprendido as técnicas dos ancestrais, pediu que "+
                            "recolhessem lenha e, enquanto isso, foi telefonar para o Serviço de Meteorologia.@1"+
                            "– O inverno vai ser muito rigoroso? – pergunta.@1"+
                            "– Parece que sim – é a resposta. E o chefe manda o povo juntar mais lenha. Dali a uma "+
                            "semana, telefona outra vez.@1"+
                            "– Tem certeza de que o inverno vai ser muito rigoroso? @1"+
                            "– Certeza absoluta.@1"+
                            "O chefe diz ao povo que junte toda a lenha que encontrar. Na semana seguinte, telefona outra vez.@1"+
                            "– Tem certeza?@1 "+
                            "– Vai ser o inverno mais rigoroso que já se viu.@1"+
                            "– Por que tem tanta certeza?@1 "+
                            "– Porque os índios estão recolhendo lenha feito loucos! "+
                            "@2<small>Disponível em: http://www.piadas.com.br/piadas/humor/previsao-do-tempo Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Nesse texto, a primeira pergunta feita pelo jovem chefe revela ";
                    qA = "crítica. ";
                    qB = "irritação. ";
                    qC = "insistência. ";
                    qD = "preocupação. ";
                    break;
                case 7:

                    texto = "@b PREVISÃO DO TEMPO b@ @2 "+
                            "Os índios de uma reserva distante perguntam ao novo chefe se o próximo inverno seria suave "+
                            "ou rigoroso. Como o jovem chefe não havia aprendido as técnicas dos ancestrais, pediu que "+
                            "recolhessem lenha e, enquanto isso, foi telefonar para o Serviço de Meteorologia.@1"+
                            "– O inverno vai ser muito rigoroso? – pergunta.@1"+
                            "– Parece que sim – é a resposta. E o chefe manda o povo juntar mais lenha. Dali a uma "+
                            "semana, telefona outra vez.@1"+
                            "– Tem certeza de que o inverno vai ser muito rigoroso? @1"+
                            "– Certeza absoluta.@1"+
                            "O chefe diz ao povo que junte toda a lenha que encontrar. Na semana seguinte, telefona outra vez.@1"+
                            "– Tem certeza?@1 "+
                            "– Vai ser o inverno mais rigoroso que já se viu.@1"+
                            "– Por que tem tanta certeza?@1 "+
                            "– Porque os índios estão recolhendo lenha feito loucos! "+
                            "@2<small>Disponível em: http://www.piadas.com.br/piadas/humor/previsao-do-tempo Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Nesse texto, o uso da expressão “feito loucos” indica ";
                    qA = "aproximação de significado. ";
                    qB = "exagero de expressão. ";
                    qC = "mistura de sentidos. ";
                    qD = "utilização de neologismos. ";
                    break;

                          case 8:
                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"No trecho “...a indústria de alimentos usa isso...”, o pronome em destaque refere-se ao fato de ";
                    qA = "as crianças terem maus hábitos de alimentação devido às embalagens. ";
                    qB = "as crianças lembrarem mais facilmente de personagens comerciais. ";
                    qC = "o sabor dos alimentos ser de pouca influência real na escolha infantil. ";
                    qD = "o estudo da Universidade mencionada ter descoberto algo lucrativo. ";
                    break;
                case 9:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"No trecho “...os pesquisadores convidaram 80 crianças entre quatro e seis anos para fazer um teste de "+
                            "sabor cego.”, a forma verbal em destaque expressa ";
                    qA = "adiamento. ";
                    qB = "ação acabada no passado. ";
                    qC = "fato certo no futuro. ";
                    qD = "possibilidade. ";
                    break;
                case 10:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Qual é a frase que sintetiza o conteúdo desse texto? ";
                    qA = "A aparência dos alimentos é superior ao seu sabor para as crianças. ";
                    qB = "A alimentação infantil é ruim devido à má fé das indústrias de alimentos. ";
                    qC = "Os personagens comerciais são capazes de vender qualquer produto. ";
                    qD = "Os alimentos com rótulos de informação saudável são mais consumidos. ";
                    break;
                case 11:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"A oração “Para comprovar a tese” introduz a ";
                    qA = "causa do fato presente na oração seguinte. ";
                    qB = "condição do fato expresso na oração seguinte. ";
                    qC = "consequência do fato presente na oração seguinte. ";
                    qD = "finalidade do fato apresentado na oração seguinte. ";
                    break;
                case 12:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Qual é o trecho que apresenta uma oposição de ideias? ";
                    qA = "“Quem faz a melhor embalagem é quem vende mais”. ";
                    qB = "“...fazem as crianças terem hábitos errados de alimentação.”. ";
                    qC = "“... produtos menos saudáveis e nutritivos os desenhos mais populares...”. ";
                    qD = "“... a criança é ensinada que comer produtos com mais açúcar faz mal.”. ";
                    break;
                case 13:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Qual é o trecho em que o autor faz uso de linguagem figurada? ";
                    qA = "“...representações de seus personagens preferidos,...”. ";
                    qB = "“‘São uma identidade visual’”. ";
                    qC = "“‘...influenciando subconscientemente o julgamento das crianças’”. ";
                    qD = "“...fazer um teste de sabor cego.”. ";
                    break;
                case 14:

                    texto = "@b Preferência alimentar das crianças é altamente influenciada pelos desenhos nas "+
                            "embalagens dos produtos b@ @1 "+
                            "Estudo desenvolvido na Universidade da Pensilvânia mostrou que o sabor dos alimentos nem sempre "+
                            "é fator decisório na hora de escolher a marca. Quem faz a melhor embalagem é quem vende mais @1"+
                            "Redação Época @2"+
                            "Um estudo feito pela Universidade da Pensilvânia, nos Estados Unidos, descobriu que as "+
                            "crianças são altamente influenciáveis pelos desenhos contidos nas embalagens de produtos "+
                            "alimentícios e tendem sempre a preferir aqueles que contenham representações de seus "+
                            "personagens preferidos, não importando qual seja o sabor do alimento. Embalagens com "+
                            "desenhos famosos, como Shrek ou os pinguins do filme Happy Feet, fazem as crianças terem "+
                            "hábitos errados de alimentação.@1"+
                            "“Personagens comerciais fazem com que seja mais fácil para as crianças lembrarem e identificarem "+
                            "os produtos. São uma identidade visual”, afirma Sarah Vaala, uma das autoras da pesquisa. O "+
                            "problema, diz ela, é que a indústria de alimentos usa isso de forma errada, colocando nas embalagens "+
                            "dos produtos menos saudáveis e nutritivos os desenhos mais populares entre as crianças.@1"+
                            "“As crianças transferem sua preferência pelo personagem para o produto e querem comprá-lo "+
                            "mais (que outro que até tenha um gosto melhor)”, disse Vaala. “O que queríamos saber era se "+
                            "essa preferência se refletia também no sabor do produto; se colocando esses personagens as "+
                            "empresas estavam, na verdade, influenciando subconscientemente o julgamento das crianças”.@1"+
                            "Para comprovar a tese, os pesquisadores convidaram 80 crianças entre quatro e seis anos "+
                            "para fazer um teste de sabor cego. Colocaram, em quatro embalagens, o mesmo cereal – um "+
                            "tipo saudável e que não costuma ser vendido em supermercados –, sendo que em duas dessas "+
                            "embalagens lia-se “flocos saudáveis” e, nas outras duas, “flocos doces”. Também em uma "+
                            "embalagem de cada suposto tipo de flocos foram desenhados personagens do filme Happy Feet.@1"+
                            "O resultado mostrou que as crianças tendiam a preferir o conteúdo das embalagens com os "+
                            "desenhos e, dentre essas duas, aquela que continha o aviso “flocos saudáveis”. Segundo os "+
                            "pesquisadores, esse fato talvez seja explicado pelo fato de que, desde muito pequena, a criança "+
                            "é ensinada que comer produtos com mais açúcar faz mal. [...] "+
                            "@2<small>Disponível em: http://revistaepoca.globo.com/Revista/Epoca/0,,EMI216938-15257,00-PREFERENCIA+ALIMENTAR+DAS+CRIANCAS+E+ALTAMENTE+INFLUENCIADA+PELOS+DESENHOS+.htm Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"O principal objetivo comunicativo desse texto é ";
                    qA = "criticar o uso de embalagens com personagens famosos. ";
                    qB = "divulgar a descoberta de uma pesquisa e comprová-la. ";
                    qC = "estabelecer a preferência alimentar das crianças. ";
                    qD = "investigar as causas da má alimentação infantil. ";
                    break;


                case 15:
                    texto = "@b Tudo vai melhorar! b@ @2"+
                            "Numa feira de agropecuária, um fazendeiro do Mato Grosso do Sul encontrou-se com um "+
                            "fazendeiro do estado do Tocantins.@1"+
                            "O Fazendeiro do Mato Grosso do Sul perguntou:@1"+
                            "– Cumpadre! Se o senhor não se importa deu perguntar, qual é o tamanho da sua fazenda? @1"+
                            "O Fazendeiro do Tocantins respondeu:@1"+
                            "– Óia, cumpadre! Acho que deve di dar uns quatrocentos hectare, é piquinina! E a sua? @1"+
                            "Como o fazendeiro do Mato Grosso do Sul era do tipo meio arrogante e cheio de mania de "+
                            "grandeza, ele foi logo esnobando o outro fazendeiro dizendo:@1"+
                            "– Cumpadre! O senhor sabe que eu nunca me interessei de contá, eu só sei que eu saio de "+
                            "manhã bem cedinho e quando é meio dia eu ainda nem cheguei na metade da propriedade.@1"+
                            "– Eu sei cumpadre!...Eu sei! No começo eu também andava de carroça...Squenta não!... "+
                            "Guenta firme cumpadre! Tenho certeza que tudo vai melhorar! @2"+
                            "Edilson Rodrigues Silva @1"+
                            "<small>Disponível em: http://recantodacronica.blogspot.com/2011/01/tudo-vai-melhorar-cronicas-pequenas-e.html Acesso em: 10 mar. 2011.</small> @2 ";
                    sourceString = texto+"Nesse texto, a fala dos personagens se caracteriza como exemplo de linguagem ";
                    qA = "literária. ";
                    qB = "padrão. ";
                    qC = "popular. ";
                    qD = "técnica. ";
                    break;
                case 16:

                    texto = "@b Tudo vai melhorar! b@ @2"+
                            "Numa feira de agropecuária, um fazendeiro do Mato Grosso do Sul encontrou-se com um "+
                            "fazendeiro do estado do Tocantins.@1"+
                            "O Fazendeiro do Mato Grosso do Sul perguntou:@1"+
                            "– Cumpadre! Se o senhor não se importa deu perguntar, qual é o tamanho da sua fazenda? @1"+
                            "O Fazendeiro do Tocantins respondeu:@1"+
                            "– Óia, cumpadre! Acho que deve di dar uns quatrocentos hectare, é piquinina! E a sua? @1"+
                            "Como o fazendeiro do Mato Grosso do Sul era do tipo meio arrogante e cheio de mania de "+
                            "grandeza, ele foi logo esnobando o outro fazendeiro dizendo:@1"+
                            "– Cumpadre! O senhor sabe que eu nunca me interessei de contá, eu só sei que eu saio de "+
                            "manhã bem cedinho e quando é meio dia eu ainda nem cheguei na metade da propriedade.@1"+
                            "– Eu sei cumpadre!...Eu sei! No começo eu também andava de carroça...Squenta não!... "+
                            "Guenta firme cumpadre! Tenho certeza que tudo vai melhorar! @2"+
                            "Edilson Rodrigues Silva @1"+
                            "<small>Disponível em: http://recantodacronica.blogspot.com/2011/01/tudo-vai-melhorar-cronicas-pequenas-e.html Acesso em: 10 mar. 2011.</small> @2 ";
                    sourceString = texto+"Ao final desse texto, compreende-se que o título tem um caráter ";
                    qA = "agressivo. ";
                    qB = "depreciativo. ";
                    qC = "irônico. ";
                    qD = "rancoroso. ";
                    break;
                case 17:

                    texto = "@b Tudo vai melhorar! b@ @2"+
                            "Numa feira de agropecuária, um fazendeiro do Mato Grosso do Sul encontrou-se com um "+
                            "fazendeiro do estado do Tocantins.@1"+
                            "O Fazendeiro do Mato Grosso do Sul perguntou:@1"+
                            "– Cumpadre! Se o senhor não se importa deu perguntar, qual é o tamanho da sua fazenda? @1"+
                            "O Fazendeiro do Tocantins respondeu:@1"+
                            "– Óia, cumpadre! Acho que deve di dar uns quatrocentos hectare, é piquinina! E a sua? @1"+
                            "Como o fazendeiro do Mato Grosso do Sul era do tipo meio arrogante e cheio de mania de "+
                            "grandeza, ele foi logo esnobando o outro fazendeiro dizendo:@1"+
                            "– Cumpadre! O senhor sabe que eu nunca me interessei de contá, eu só sei que eu saio de "+
                            "manhã bem cedinho e quando é meio dia eu ainda nem cheguei na metade da propriedade.@1"+
                            "– Eu sei cumpadre!...Eu sei! No começo eu também andava de carroça...Squenta não!... "+
                            "Guenta firme cumpadre! Tenho certeza que tudo vai melhorar! @2"+
                            "Edilson Rodrigues Silva @1"+
                            "<small>Disponível em: http://recantodacronica.blogspot.com/2011/01/tudo-vai-melhorar-cronicas-pequenas-e.html Acesso em: 10 mar. 2011.</small> @2 ";
                    sourceString = texto+"No fragmento “... deve di dar uns quatrocentos hectare,...”, constata-se ";
                    qA = "uma concordância em desacordo com a norma padrão. ";
                    qB = "uma locução verbal em tempo inadequado ao contexto. ";
                    qC = "um problema em relação ao uso do regionalismo. ";
                    qD = "um desvio referente ao exagero no uso do numeral. ";
                    break;


                case 18:

                    texto = "@b O Eco b@ @1"+
                            "(Autor Desconhecido) @2"+
                            "Pai e filho caminhavam por uma montanha. De repente o menino cai e grita: “Aaaaaaiii!!!” @1"+
                            "Para a sua surpresa, escuta a voz repetir-se, em algum lugar da montanha: “Aaaaaaiii!!!”.@1"+
                            "Curioso, pergunta “quem és?” e recebe como resposta “quem és?” Contrariado, grita, “covarde!” "+
                            "e a resposta é “covarde!”.@1"+
                            "Então, olha para o pai e pergunta, aflito: “O que é isso?” @1"+
                            "O pai sorri e fala “Filho, presta atenção”. E grita em direção à montanha: “Eu admiro-te!!!” e a "+
                            "voz responde: “Eu admiro-te!!!” .De novo o homem grita: “És um campeão!” e a voz responde “És "+
                            "um campeão!”.@1"+
                            "O menino fica espantado. Não entende. O pai explica:@1"+
                            "– As pessoas chamam a isto eco, mas na verdade isso é a vida. Ela nos dá de volta tudo o que "+
                            "dizemos. Nossa vida é o reflexo de nossas ações.@1"+
                            "@1<small>Disponível em: http://www.via6.com/topico/38684/textos-curtos-de-autores-que-gostamos Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Qual é o conflito desse texto? ";
                    qA = "O questionamento do filho ao pai. ";
                    qB = "O grito do pai em direção à montanha. ";
                    qC = "A visão sobre a vida exposta pelo pai. ";
                    qD = "A caminhada de pai e filho pela montanha. ";


                    break;
                case 19:

                    texto = "@b O Eco b@ @1"+
                            "(Autor Desconhecido) @2"+
                            "Pai e filho caminhavam por uma montanha. De repente o menino cai e grita: “Aaaaaaiii!!!” @1"+
                            "Para a sua surpresa, escuta a voz repetir-se, em algum lugar da montanha: “Aaaaaaiii!!!”.@1"+
                            "Curioso, pergunta “quem és?” e recebe como resposta “quem és?” Contrariado, grita, “covarde!” "+
                            "e a resposta é “covarde!”.@1"+
                            "Então, olha para o pai e pergunta, aflito: “O que é isso?” @1"+
                            "O pai sorri e fala “Filho, presta atenção”. E grita em direção à montanha: “Eu admiro-te!!!” e a "+
                            "voz responde: “Eu admiro-te!!!” .De novo o homem grita: “És um campeão!” e a voz responde “És "+
                            "um campeão!”.@1"+
                            "O menino fica espantado. Não entende. O pai explica:@1"+
                            "– As pessoas chamam a isto eco, mas na verdade isso é a vida. Ela nos dá de volta tudo o que "+
                            "dizemos. Nossa vida é o reflexo de nossas ações.@1"+
                            "@1<small>Disponível em: http://www.via6.com/topico/38684/textos-curtos-de-autores-que-gostamos Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"Nesse texto, as falas do pai têm a função de ";
                    qA = "abordar as relações familiares. ";
                    qB = "entreter os leitores. ";
                    qC = "incentivar os questionamentos. ";
                    qD = "transmitir um ensinamento. ";
                    break;
                case 20:

                    texto = "@b O Eco b@ @1"+
                            "(Autor Desconhecido) @2"+
                            "Pai e filho caminhavam por uma montanha. De repente o menino cai e grita: “Aaaaaaiii!!!” @1"+
                            "Para a sua surpresa, escuta a voz repetir-se, em algum lugar da montanha: “Aaaaaaiii!!!”.@1"+
                            "Curioso, pergunta “quem és?” e recebe como resposta “quem és?” Contrariado, grita, “covarde!” "+
                            "e a resposta é “covarde!”.@1"+
                            "Então, olha para o pai e pergunta, aflito: “O que é isso?” @1"+
                            "O pai sorri e fala “Filho, presta atenção”. E grita em direção à montanha: “Eu admiro-te!!!” e a "+
                            "voz responde: “Eu admiro-te!!!” .De novo o homem grita: “És um campeão!” e a voz responde “És "+
                            "um campeão!”.@1"+
                            "O menino fica espantado. Não entende. O pai explica:@1"+
                            "– As pessoas chamam a isto eco, mas na verdade isso é a vida. Ela nos dá de volta tudo o que "+
                            "dizemos. Nossa vida é o reflexo de nossas ações.@1"+
                            "@1<small>Disponível em: http://www.via6.com/topico/38684/textos-curtos-de-autores-que-gostamos Acesso em: 10 mar. 2011.</small> @2 ";

                    sourceString = texto+"No fragmento “Então, olha para o pai e pergunta, aflito:...”, a palavra destacada expressa ideia de ";
                    qA = "conclusão. ";
                    qB = "finalidade. ";
                    qC = "proporção. ";
                    qD = "tempo. ";
                    break;


                case 21:
                    texto = "@b Teresa b@ @2"+
                            "A primeira vez que vi Teresa @1"+
                            "Achei que ela tinha pernas estúpidas @1"+
                            "Achei também que a cara parecia uma perna @1"+
                            "Quando vi Teresa de novo @1"+
                            "Achei que os olhos eram muito mais velhos que o resto do corpo @1"+
                            "Da terceira vez não vi mais nada @1"+
                            "Os céus se misturaram com a terra @1"+
                            "E o espírito de Deus voltou a se mover sobre a face das águas.@1"+
                            "@1<small>Disponível em: http://www.revista.agulha.nom.br/manuelbandeira01.html Acesso em: 26 mar. 2011.</small> @2 ";

                    sourceString = texto+"Nesse poema, a ausência de rimas e a simplicidade vocabular caracterizam o período de criação literária "+
                            "do poeta Manuel Bandeira. Esse período é o ";
                    qA = "Modernismo. ";
                    qB = "Pré-modernismo. ";
                    qC = "Realismo. ";
                    qD = "Romantismo. ";
                    break;
                case 22:

                    texto = "@b Teresa b@ @2"+
                            "A primeira vez que vi Teresa @1"+
                            "Achei que ela tinha pernas estúpidas @1"+
                            "Achei também que a cara parecia uma perna @1"+
                            "Quando vi Teresa de novo @1"+
                            "Achei que os olhos eram muito mais velhos que o resto do corpo @1"+
                            "Da terceira vez não vi mais nada @1"+
                            "Os céus se misturaram com a terra @1"+
                            "E o espírito de Deus voltou a se mover sobre a face das águas.@1"+
                            "@1<small>Disponível em: http://www.revista.agulha.nom.br/manuelbandeira01.html Acesso em: 26 mar. 2011.</small> @2 ";

                    sourceString = texto+"Nesse poema, a forma como a mulher é apresentada demonstra que o poeta ";
                    qA = "opta por falar das diferenças. ";
                    qB = "opta por idealizar o feminino. ";
                    qC = "preocupa-se em falar do divino. ";
                    qD = "propõe-se a falar do que é real. ";
                    break;
                case 23:

                    sourceString = "Leia o texto abaixo.@1 "+
                            "@cimg lc550231 cimg@"+
                            "@1<small>Disponível em: http:// blog.institutouniversal.com.br Acesso em: 28 mar. 2011.</small> @2 "+
                            "Esse texto é um poema concreto, porque apresenta ";
                    qA = "construção visual, unindo palavra e imagem. ";
                    qB = "construção vocabular com ausência de rimas. ";
                    qC = "uma estrutura organizacional bastante curta. ";
                    qD = "uma linguagem clara e bastante objetiva. ";
                    break;


                case 24:
                    texto = "@b O cortiço b@ @2 "+
                            "Eram cinco horas da manhã e o cortiço acordava, abrindo, não os olhos, mas a sua infinidade "+
                            "de portas e janelas alinhadas.@1"+
                            "Um acordar alegre e farto de quem dormiu de uma assentada sete horas de chumbo. Como "+
                            "que se sentiam ainda na indolência de neblina as derradeiras notas da última guitarra da noite "+
                            "antecedente, dissolvendo-se à luz loura e tenra da aurora, que nem um suspiro de saudade "+
                            "perdido em terra alheia.@1"+
                            "[...] @1"+
                            "Daí a pouco, em volta das bicas era um zunzum crescente; uma aglomeração tumultuosa de "+
                            "machos e fêmeas. Uns, após outros, lavavam a cara, incomodamente, debaixo do fio de água "+
                            "que escorria da altura de uns cinco palmos. O chão inundava-se. As mulheres precisavam já "+
                            "prender as saias entre as coxas para não as molhar; via-se-lhes a tostada nudez dos braços e do "+
                            "pescoço, que elas despiam, suspendendo o cabelo todo para o alto do casco; os homens, esses "+
                            "não se preocupavam em não molhar o pelo, ao contrário metiam a cabeça bem debaixo da água "+
                            "e esfregavam com força as ventas e as barbas, fossando e fungando contra as palmas da mão.@1"+
                            "@1<small>AZEVEDO, Aluísio. O cortiço. 15 ed. São Paulo: Ática, 1984. p. 24-25.</small> @2 ";

                    sourceString = texto+"Nesse texto, a forma como o ser humano é apresentado evidencia a ideologia naturalista, segundo a qual, ";
                    qA = "o escritor apresenta um cenário que faz parte, intimamente, das emoções e dos sentimentos dos "+
                            "personagens. ";
                    qB = "o escritor apresenta uma descrição minuciosa dos personagens e de suas atitudes, com o intuito de "+
                            "idealizá-los. ";
                    qC = "o autor explica os efeitos científicos causados em uma determinada sociedade por meio de "+
                            "exemplificações concretas. ";
                    qD = "o autor apresenta seus personagens do ponto de vista instintivo, caracterizando-os com atitudes próprias de animais.";
                    break;

                case 25:

                    texto = "@b O cortiço b@ @2 "+
                            "Eram cinco horas da manhã e o cortiço acordava, abrindo, não os olhos, mas a sua infinidade "+
                            "de portas e janelas alinhadas.@1"+
                            "Um acordar alegre e farto de quem dormiu de uma assentada sete horas de chumbo. Como "+
                            "que se sentiam ainda na indolência de neblina as derradeiras notas da última guitarra da noite "+
                            "antecedente, dissolvendo-se à luz loura e tenra da aurora, que nem um suspiro de saudade "+
                            "perdido em terra alheia.@1"+
                            "[...] @1"+
                            "Daí a pouco, em volta das bicas era um zunzum crescente; uma aglomeração tumultuosa de "+
                            "machos e fêmeas. Uns, após outros, lavavam a cara, incomodamente, debaixo do fio de água "+
                            "que escorria da altura de uns cinco palmos. O chão inundava-se. As mulheres precisavam já "+
                            "prender as saias entre as coxas para não as molhar; via-se-lhes a tostada nudez dos braços e do "+
                            "pescoço, que elas despiam, suspendendo o cabelo todo para o alto do casco; os homens, esses "+
                            "não se preocupavam em não molhar o pelo, ao contrário metiam a cabeça bem debaixo da água "+
                            "e esfregavam com força as ventas e as barbas, fossando e fungando contra as palmas da mão.@1"+
                            "@1<small>AZEVEDO, Aluísio. O cortiço. 15 ed. São Paulo: Ática, 1984. p. 24-25.</small> @2 ";

                    sourceString = texto+"O Naturalismo revela-se importante para a Literatura Brasileira pelo fato de ";
                    qA = "apresentar uma literatura engajada, isto é, voltada à denúncia de problemas sociais. ";
                    qB = "apresentar uma literatura preocupada com o meio natural, descrevendo cenários bucólicos. ";
                    qC = "descrever os traços físicos dos seres humanos, voltando-se ao cientificismo da época. ";
                    qD = "descrever o ser humano, apresentando suas tipicidades como sujeito de seu próprio destino. ";
                    break;
                case 26:

                    texto = "@b O cortiço b@ @2 "+
                            "Eram cinco horas da manhã e o cortiço acordava, abrindo, não os olhos, mas a sua infinidade "+
                            "de portas e janelas alinhadas.@1"+
                            "Um acordar alegre e farto de quem dormiu de uma assentada sete horas de chumbo. Como "+
                            "que se sentiam ainda na indolência de neblina as derradeiras notas da última guitarra da noite "+
                            "antecedente, dissolvendo-se à luz loura e tenra da aurora, que nem um suspiro de saudade "+
                            "perdido em terra alheia.@1"+
                            "[...] @1"+
                            "Daí a pouco, em volta das bicas era um zunzum crescente; uma aglomeração tumultuosa de "+
                            "machos e fêmeas. Uns, após outros, lavavam a cara, incomodamente, debaixo do fio de água "+
                            "que escorria da altura de uns cinco palmos. O chão inundava-se. As mulheres precisavam já "+
                            "prender as saias entre as coxas para não as molhar; via-se-lhes a tostada nudez dos braços e do "+
                            "pescoço, que elas despiam, suspendendo o cabelo todo para o alto do casco; os homens, esses "+
                            "não se preocupavam em não molhar o pelo, ao contrário metiam a cabeça bem debaixo da água "+
                            "e esfregavam com força as ventas e as barbas, fossando e fungando contra as palmas da mão.@1"+
                            "@1<small>AZEVEDO, Aluísio. O cortiço. 15 ed. São Paulo: Ática, 1984. p. 24-25.</small> @2 ";

                    sourceString = texto+"A prosopopeia, ou personificação, é uma figura de linguagem que consiste em dar características humanas "+
                            "a outros seres. Em qual dos fragmentos desse texto o autor faz uso desse recurso? ";
                    qA = "“Eram cinco horas da manhã e o cortiço acordava,...”. ";
                    qB = "“Uns, após outros, lavavam a cara, incomodamente,...”. ";
                    qC = "“As mulheres precisavam já prender as saias entre as coxas...”. ";
                    qD = "“...metiam a cabeça bem debaixo da água e esfregavam com força...”. ";
                    break;
                case 27:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "“No Simbolismo [...], as palavras conseguem transcender os seus significados, ao mesmo "+
                            "tempo em que apelam para a totalidade de nossa percepção, ou seja para todos os sentidos. Daí "+
                            "a linguagem simbólica e o uso constante de sinestesias e de aliterações.” "+
                            "@2<small>Disponível em: http://vamospoetar.wordpress.com/simbolismo/ Acesso em: 14 abr. 2011.</small> @2 "+
                            "Considerando as informações presentes nesse texto, qual dos poemas a seguir é classificado como Simbolista? ";
                    qA = "“Tu que dormes, espírito sereno, @1"+
                            "Posto à sombra dos cedros seculares, @1"+
                            "Como um levita à sombra dos altares, @1"+
                            "Longe da luta e do fragor terreno.@1"+
                            "Acorda! É tempo! O sol, já alto e pleno, @1"+
                            "Afugentou as larvas tumulares...@1"+
                            "Para surgir do seio desses mares, @1"+
                            "Um mundo novo espera só um aceno...” @2"+
                            "(A um poeta) ";
                    qB = "“Oh! que saudades que tenho @1"+
                            "Da aurora da minha vida, @1"+
                            "Da minha infância querida @1"+
                            "Que os anos não trazem mais! @1"+
                            "Que amor, que sonhos, que flores, @1"+
                            "Naquelas tardes fagueiras @1"+
                            "À sombra das bananeiras, @1"+
                            "Debaixo dos laranjais!” @2"+
                            "(Meus oito anos) ";

                    qC = "“Braços nervosos, brancas opulências, @1"+
                            "Brumais brancuras, fúlgidas brancuras, @1"+
                            "Alvuras castas, virginais alvuras, @1"+
                            "Lactescências das raras lactescências.@1"+
                            "As fascinantes, mórbidas dormências @1"+
                            "Dos teus abraços de letais flexuras, @1"+
                            "Produzem sensações de agres torturas, @1"+
                            "Dos desejos as mornas florescências.” @2"+
                            "(Braços) ";
                    qD = "“Vou-me embora pra Pasárgada @1"+
                            "Lá sou amigo do rei @1"+
                    "Lá tenho a mulher que eu quero @1"+
                            "Na cama que escolherei @1"+
                            "Vou-me embora pra Pasárgada @1"+
                            "Vou-me embora pra Pasárgada @1"+
                            "Aqui eu não sou feliz @1"+
                            "Lá a existência é uma aventura.” @2"+
                            "(Vou-me embora pra Pasárgada) ";
                    break;


                case 28:
                    texto = "@b MACUNAÍMA b@ @1"+
                            "(Capítulo I) @2"+
                            "Uma feita a Sol cobrira os três manos duma escaminha de suor e Macunaíma se lembrou de "+
                            "tomar banho.@1"+
                            "[...] Então Macunaíma enxergou numa lapa bem no meio do rio uma cova cheia d’água. E a "+
                            "cova era que-nem a marca dum pé-gigante.@1"+
                            "Abicaram. O herói depois de muitos gritos por causa do frio da água entrou na cova e se lavou "+
                            "inteirinho. Mas a água era encantada porque aquele buraco na lapa era marca do pezão do "+
                            "Sumé, do tempo em que andava pregando o evangelho de Jesus pra indiada brasileira. Quando "+
                            "o herói saiu do banho estava branco louro e de olhos azuizinhos, água lavara o pretume dele. E "+
                            "ninguém não seria capaz mais de indicar nele um filho da tribo retinta dos Tapanhumas.@1"+
                            "Nem bem Jiguê percebeu o milagre, se atirou na marca do pezão do Sumé. Porém, a água já "+
                            "estava muito suja da negrura do herói e por mais que Jiguê esfregasse feito maluco atirando água "+
                            "pra todos os lados só conseguiu ficar da cor do bronze novo. Macunaíma teve dó e consolou:@1"+
                            "— Olhe, mano Jiguê, branco você ficou não, porém pretume foi-se e antes fanhoso que sem nariz.@1"+
                            "Maanape então é que foi se lavar, mas Jiguê esborrifava toda a água encantada pra fora da "+
                            "cova. Tinha só um bocado lá no fundo e Maanape conseguiu molhar só a palma dos pés e das "+
                            "mãos. Por isso ficou negro bem filho da tribo dos Tapanhumas.@1"+
                            "@1<small>Disponível em: http://www.anjoempoetasbrasileiros.hpg.com.br/marioandrade.htm Acesso em: 28 mar. 2011.</small> @2 ";

                    sourceString = texto+"O narrador é a entidade ficcional responsável por contar uma história. Nesse fragmento, constata-se que "+
                            "a história é contada sob o ponto de vista de um narrador que ";
                    qA = "testemunha os fatos vividos na história. ";
                    qB = "sabe tudo sobre as personagens. ";
                    qC = "estabelece um diálogo com o leitor. ";
                    qD = "é a personagem principal da história. ";
                    break;
                case 29:

                    texto = "@b MACUNAÍMA b@ @1"+
                            "(Capítulo I) @2"+
                            "Uma feita a Sol cobrira os três manos duma escaminha de suor e Macunaíma se lembrou de "+
                            "tomar banho.@1"+
                            "[...] Então Macunaíma enxergou numa lapa bem no meio do rio uma cova cheia d’água. E a "+
                            "cova era que-nem a marca dum pé-gigante.@1"+
                            "Abicaram. O herói depois de muitos gritos por causa do frio da água entrou na cova e se lavou "+
                            "inteirinho. Mas a água era encantada porque aquele buraco na lapa era marca do pezão do "+
                            "Sumé, do tempo em que andava pregando o evangelho de Jesus pra indiada brasileira. Quando "+
                            "o herói saiu do banho estava branco louro e de olhos azuizinhos, água lavara o pretume dele. E "+
                            "ninguém não seria capaz mais de indicar nele um filho da tribo retinta dos Tapanhumas.@1"+
                            "Nem bem Jiguê percebeu o milagre, se atirou na marca do pezão do Sumé. Porém, a água já "+
                            "estava muito suja da negrura do herói e por mais que Jiguê esfregasse feito maluco atirando água "+
                            "pra todos os lados só conseguiu ficar da cor do bronze novo. Macunaíma teve dó e consolou:@1"+
                            "— Olhe, mano Jiguê, branco você ficou não, porém pretume foi-se e antes fanhoso que sem nariz.@1"+
                            "Maanape então é que foi se lavar, mas Jiguê esborrifava toda a água encantada pra fora da "+
                            "cova. Tinha só um bocado lá no fundo e Maanape conseguiu molhar só a palma dos pés e das "+
                            "mãos. Por isso ficou negro bem filho da tribo dos Tapanhumas.@1"+
                            "@1<small>Disponível em: http://www.anjoempoetasbrasileiros.hpg.com.br/marioandrade.htm Acesso em: 28 mar. 2011.</small> @2 ";

                    sourceString = texto+"Qual característica do Modernismo é colocada em evidência nesse texto? ";
                    qA = "Crítica social. ";
                    qB = "Ênfase no cotidiano. ";
                    qC = "Nacionalismo. ";
                    qD = "Regionalismo. ";
                    break;
                case 30:

                    sourceString = "O termo arte moderna engloba as vanguardas europeias do início do século XX, como, por exemplo, "+
                            "Cubismo, Construtivismo, Surrealismo, Suprematismo, Neoplasticismo e Futurismo.@1"+
                            "Associe as duas colunas, relacionando os movimentos de vanguarda às suas respectivas características.@2"+

                            "1. Cubismo.@1"+
                            "2. Surrealismo.@1"+
                            "3. Futurismo.@1"+
                            "4. Construtivismo.@2"+

                            "( ) Volumes e planos geométricos entrecortados reconstroem formas que "+
                            "se apresentam, simultaneamente, em vários ângulos nas telas.@1"+
                            "( ) A exaltação da máquina e da “beleza da velocidade”, associada ao "+
                            "elogio da técnica e da ciência, torna-se emblemática da nova atitude "+
                            "estética e política.@1"+
                            "( ) A pintura e a escultura são pensadas como construções, guardando "+
                            "proximidade com a arquitetura em termos de materiais, procedimentos e "+
                            "objetivos.@1"+
                            "( ) Trata-se de “resolver a contradição vigente na época entre sonho e "+
                            "realidade pela criação de uma realidade absoluta, uma suprarrealidade”.@1"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "4, 1, 2, 3. ";
                    qB = "1, 3, 4, 2. ";
                    qC = "1, 4, 2, 3. ";
                    qD = "3, 2, 1, 4. ";
                    break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice) {

                case 1:

                    sourceString = "A caixa, da figura abaixo, tem a forma de um paralelepípedo retângulo.@2 "+
                            "@cimg mt550011 cimg@ @1"+
                            "Qual é a capacidade máxima dessa caixa? ";
                    qA = "6 litros. ";
                    qB = "7 litros. ";
                    qC = "12 litros. ";
                    qD = "70 litros. ";
                    break;
                case 2:

                    sourceString = "Uma churrascaria tem preços diferenciados de rodízio para homens, mulheres e crianças. Veja a tabela "+
                            "de preços abaixo.@1 "+
                            "@cimg mt550021 cimg@ @1"+
                            "Um grupo de 8 pessoas, com 2 homens, 3 mulheres e 3 crianças, almoçou nessa churrascaria.@1"+
                            "@1Qual foi o valor total do rodízio pago por esse grupo? ";
                    qA = "R$ 60,00. ";
                    qB = "R$ 155,00. ";
                    qC = "R$ 160,00. ";
                    qD = "R$ 200,00. ";
                    break;
                case 3:

                    sourceString = "Para representar números muito grandes, ou muito pequenos, usa-se a notação científica. Um número "+
                            "escrito em notação científica é do tipo n x 10p "+
                            ", em que 1 ≤ n  10 e p é um número inteiro. Leia as "+
                            "afirmativas abaixo.@2 "+

                            "I – A distância entre a Terra e o Sol é de aproximadamente 149 600 000 000 metros.@1"+
                            "II – O diâmetro de uma célula é de aproximadamente 0,0045 centímetros.@2 "+

                            "As medidas citadas nas afirmativas I e II escritas em notação científica são, respectivamente, ";

                    qA = "1,496 x 10@sp11sp@ e 4,5 x 10@sp–3sp@.";
                    qB = "1,496 x 10@sp8sp@  e 4,5 x 10@sp–2sp@.";
                    qC = "1,496 x 10sp11sp@  e 4,5 x 10@sp3sp@.";
                    qD = "1496 x 10@sp8sp@   e 45 x 10@sp–4sp@.";
                    break;

                case 4:

                    sourceString = "Num jogo de números, lança-se um cubo com diferentes descrições de números. Em cada jogada, "+
                            "o participante lança o cubo e identifica o número descrito na face voltada para cima. Se identificar "+
                            "corretamente, ganha um ponto e passa a vez para o próximo jogador.@1"+
                            "João lançou o cubo, que parou conforme mostra a figura abaixo.@1 "+
                            "@cimg mt550041 cimg@ @1"+
                            "Qual é o número que João deve identificar para ganhar essa jogada? ";
                    qA = "1/3";
                    qB = "2,5. ";
                    qC = "4.";
                    qD = "raizd3";
                    break;
                case 5:

                    sourceString = "Pedro e seus amigos do bairro formaram um time de futebol para disputar um campeonato da cidade.@1"+
                            "A bandeira do time será confeccionada com 3 faixas horizontais de cores diferentes, conforme mostra a "+
                            "figura abaixo.@1 "+
                            "@cimg mt550051 cimg@ @1"+
                            "Sabendo-se que há faixas nas cores branca, amarela, azul, verde, rosa, vermelha e preta, quantas "+
                            "bandeiras diferentes eles podem confeccionar? ";
                    qA = "18. ";
                    qB = "70. ";
                    qC = "210. ";
                    qD = "343. ";
                    break;
                case 6:

                    sourceString = "Lucas fez as provas de Matemática, Português, Física, Química e Biologia num mesmo dia. Ele recebeu "+
                            "um envelope com essas 5 provas e, sem olhar, tirou uma prova do envelope.@1"+
                            "@1Qual é a probabilidade de Lucas ter tirado a prova de Matemática? ";
                    qA = "20%. ";
                    qB = "25%. ";
                    qC = "50%. ";
                    qD = "80%. ";
                    break;
                case 7:

                    sourceString = "O anúncio, abaixo, foi impresso com uma falha e não apareceu o valor da prestação.@1 "+
                            "@cimg mt550071 cimg@ @1"+
                            "Mateus comprou esse tênis em três vezes. Qual foi o valor de cada prestação? ";
                    qA = "R$ 32,40. ";
                    qB = "R$ 40,00. ";
                    qC = "R$ 43,00. ";
                    qD = "R$ 43,30. ";
                    break;
                case 8:

                    sourceString = "O governo vai conceder à iniciativa privada a administração e construção de terminais em 5 aeroportos "+
                            "de conexão internacional, pensando nos preparativos para Copa de 2014. O gráfico, abaixo, mostra o "+
                            "investimento programado pela Infraero até 2014.@1"+
                            "@cimg mt550081 cimg@"+
                            "@1De acordo com esses dados, o investimento em Brasília é ";
                    qA = "igual ao dobro do investimento em Confins. ";
                    qB = "igual à metade do investimento em Guarulhos. ";
                    qC = "menor do que a soma dos investimentos no Galeão e em Confins. ";
                    qD = "maior do que a soma dos investimentos no Galeão e em Viracopos. ";
                    break;
                case 9:

                    sourceString = "A conta de energia elétrica é composta de duas partes: uma fixa, que corresponde à iluminação pública, "+
                            "e outra variável, que depende da quantidade de kWh consumida no mês. A taxa de iluminação pública é "+
                            "de R$ 13,50, e cada kWh custa R$ 0,35.@1"+
                            "@1Qual é o gráfico que melhor representa a situação descrita nesse texto? ";
                    qA = "@cimg mt55009a cimg@";
                    qB = "@cimg mt55009b cimg@";
                    qC = "@cimg mt55009c cimg@";
                    qD = "@cimg mt55009d cimg@";
                    break;

                case 10:

                    sourceString = "Leia a manchete abaixo.@2 "+
                            "“Produção de lixo por morador cresce 9% em São Paulo de 2009 para 2010.” "+
                            "Folha de São Paulo – 26/04/2011.@1"+
                            "Segundo a pesquisa da Abrelpe, Associação Brasileira de Empresas de Limpeza Pública e Resíduos "+
                            "Especiais, em 2009, cada habitante do Estado de São Paulo gerou aproximadamente 1,200 kg de lixo "+
                            "por dia.@1"+
                            "@1De acordo com essas informações, qual foi a produção diária de lixo por habitante em 2010? ";
                    qA = "1,290 kg. ";
                    qB = "1,308 kg. ";
                    qC = "2,100 kg. ";
                    qD = "2,280 kg. ";
                    break;
                case 11:

                    sourceString = "A figura, representada abaixo, é de um prisma com x faces, y vértices e z arestas.@2 "+
                            "@cimg mt550111 cimg@ @1"+
                            "Qual é o valor de x + y + z ? ";
                    qA = "18. ";
                    qB = "24. ";
                    qC = "32. ";
                    qD = "38. ";
                    break;
                case 12:

                    sourceString = "Uma sorveteria oferece para seus clientes 10 sabores diferentes de sorvete. Tatiane vai escolher uma "+
                            "taça com três sabores diferentes.@1"+
                            "@1De quantas maneiras essa escolha pode ser feita? ";
                    qA = "120. ";
                    qB = "240. ";
                    qC = "360. ";
                    qD = "720. ";
                    break;
                case 13:

                    sourceString = "Um treinador vai escolher o cobrador oficial de pênaltis do seu time de acordo com o desempenho dos "+
                            "jogadores. Essa escolha será feita entre André, Bruno, Caio e Diego, que são os melhores jogadores da "+
                            "equipe. O quadro, abaixo, foi obtido após um treinamento.@1"+
                            "@cimg mt550131 cimg@"+
                            "@1Qual desses jogadores teve o melhor desempenho? ";
                    qA = "André. ";
                    qB = "Bruno. ";
                    qC = "Caio. ";
                    qD = "Diego. ";
                    break;
                case 14:

                    sourceString = "Observe a circunferência no plano cartesiano abaixo.@1"+
                            "@cimg mt550141 cimg@ @1"+
                            "@1Qual é a equação dessa circunferência? ";
                    qA = "x² + y² = 1. ";
                    qB = "x² + y² = 3. ";
                    qC = "x² + y² = 6. ";
                    qD = "x² + y² = 9. ";
                    break;
                case 15:

                    sourceString = "O gráfico, abaixo, mostra a distribuição dos 60 alunos de uma turma de terceira série do Ensino Médio de@2 "+
                            "acordo com a preferência por três áreas de conhecimento.@1"+
                            "@cimg mt550151 cimg@"+
                            "@1Quantos alunos preferem as ciências humanas? ";
                    qA = "12. ";
                    qB = "18. ";
                    qC = "20. ";
                    qD = "30. ";
                    break;
                case 16:

                    sourceString = "O gráfico, abaixo, representa uma função y = f(x) de variáveis reais.@1 "+
                            "@cimg mt550161 cimg@ @1"+
                            "Qual é a lei de formação dessa função? ";
                    qA = "@cimg mt55016a cimg@";
                    qB = "@cimg mt55016b cimg@";
                    qC = "y = – 2x + 1. ";
                    qD = "y = 2x – 1. ";
                    break;
                case 17:

                    sourceString = "Para definir o tipo de filme que será colocado em cartaz nas próximas semanas – drama ou comédia –, "+
                            "uma empresa fez uma pesquisa entre os frequentadores de um cinema. Todos os entrevistados gostam "+
                            "de pelo menos um dos dois tipos de filme. Entre eles, 120 pessoas gostam de comédia, 160 gostam de "+
                            "drama, e 85 gostam dos dois tipos de filme.@1"+
                            "@1Quantas pessoas foram entrevistadas nessa pesquisa? ";
                    qA = "110. ";
                    qB = "195. ";
                    qC = "280. ";
                    qD = "365. ";
                    break;
                case 18:

                    sourceString = "O cilindro reto, figura abaixo, foi mergulhado numa lata de tinta, ficando totalmente submerso.@2 "+
                           "@cimg mt550181 cimg@ @1"+
                            "Ao ser retirado da lata de tinta, que medida da superfície desse cilindro ficou pintada? ";
                    qA = "42 π cm2 ";
                    qB = "45 π cm2 ";
                    qC = "48 π cm2 ";
                    qD = "54 π cm2 ";
                    break;
                case 19:

                    sourceString = "Qual dos gráficos, a seguir, melhor representa a função de variáveis reais y = logx? ";
                    qA = "@cimg mt55019a cimg@";
                    qB = "@cimg mt55019b cimg@";
                    qC = "@cimg mt55019c cimg@";
                    qD = "@cimg mt55019d cimg@";

                    break;

                case 20:

                    sourceString = "Na cidade “Rio Limpo” há duas empresas de táxi: “Viagem Segura” e “Chegue Rápido”. O preço cobrado "+
                            "por cada uma das empresas é composto de uma parte fixa, chamada bandeirada, e uma parte variável que "+
                            "depende da distância percorrida. O quadro abaixo mostra o valor da bandeirada e o preço do quilômetro "+
                            "rodado cobrados por cada uma das empresas.@1"+
                            "@cimg mt550201 cimg@"+
                            "@1Em qual distância percorrida, em quilômetros, as duas empresas cobrarão o mesmo valor? ";
                    qA = "3. ";
                    qB = "5. ";
                    qC = "6. ";
                    qD = "7. ";
                    break;
                case 21:

                    sourceString = "Os triângulos (I) e (II), abaixo, são semelhantes.@1 "+
                            "@cimg mt550211 cimg@ @1"+
                            "Considere as medidas indicadas na figura, a área do triângulo (I) igual a x, e a área do triângulo (II) igual "+
                            "a y.@1"+
                            "@1Que relação existe entre x e y? ";

                    qA = "y = 3x.";
                    qB = "y = 9x.";
                    qC = "y = x/3.";
                    qD = "y = x/9 ";
                    break;
                case 22:

                    sourceString = "Carla estava resolvendo uns exercícios de geometria e deparou com uma medida de ângulo igual a "+
                            "@pi/4 radianos. Como ela ainda não conhecia esse tipo de unidade de medida de ângulos, sua professora "+
                            "converteu para graus.@1"+
                            "@1Quanto mede esse ângulo em graus? ";
                    qA = "45º. ";
                    qB = "90º. ";
                    qC = "180º. ";
                    qD = "360º. ";
                    break;
                case 23:

                    sourceString = "O Ministério da Saúde começou, em abril de 2011, uma nova campanha para imunizar a população contra "+
                            "a gripe Influenza H1N1. No “Dia D”, que marcou o início da campanha, a Secretaria Municipal de Juiz de "+
                            "Fora – MG vacinou 18 000 pessoas, o que corresponde a 20% da meta a ser atingida.@1"+
                            "@1Quantas pessoas ainda precisam ser vacinadas para se atingir a meta da Secretaria? ";
                    qA = "14 400. ";
                    qB = "18 000. ";
                    qC = "72 000. ";
                    qD = "90 000. ";
                    break;
                case 24:

                    sourceString = "A figura, abaixo, mostra uma reta de equação 3x – 4y = 0 secante à circunferência de equação x² + y² = 25.@2 "+
                            "@cimg mt550241 cimg@ @1"+
                            "Quais são as coordenadas do ponto P? ";
                    qA = "(3, 4). ";
                    qB = "(– 3, – 4). ";
                    qC = "(4, 3). ";
                    qD = "(– 4, – 3). ";
                    break;
                case 25:

                    sourceString = "(M120103B1) Uma concessionária possui em seu estoque 60 carros de um mesmo modelo, mas de cores "+
                            "diferentes. São 15 carros azuis, 20 verdes, e os outros são pretos. Beatriz vai comprar um desses carros "+
                            "e gostaria que ele fosse azul ou verde.@1"+
                            "@1Se o carro for escolhido aleatoriamente, qual é a probabilidade de que o desejo de Beatriz seja realizado? ";
                    qA = "7/12.";
                    qB = "5/12.";
                    qC = "1/3.";
                    qD = "1/4.";
                    break;
                case 26:

                    sourceString = "Observe as retas r, s, u e v destacadas no paralelepípedo retângulo abaixo.@2 "+
                            "@cimg mt550261 cimg@ @1"+
                            "Qual é o par de retas paralelas? ";
                    qA = "u e r. ";
                    qB = "r e s. ";
                    qC = "u e v. ";
                    qD = "s e v. ";
                    break;
                case 27:

                    sourceString = "O quadro, abaixo, mostra o número de alunos em três cursos da Faculdade de Engenharia.@2 "+
                            "@cimg mt550271 cimg@ @1"+
                            "Um desses alunos foi sorteado para fazer estágio numa empresa. Sabendo-se que a pessoa sorteada faz "+
                            "Engenharia de Produção, qual é a probabilidade de ser uma mulher? ";
                    qA = "5/8";
                    qB = "5/11";
                    qC = "25/112";
                    qD = "55/112";
                    break;

                case 28:

                    sourceString = "Na figura, abaixo, os segmentos PQ e TS são paralelos.@2 "+
                            "@cimg mt550281 cimg@ @1"+
                            "Qual é a soma das medidas dos lados QR e RS? ";
                    qA = "4,5 cm. ";
                    qB = "9,5 cm. ";
                    qC = "10 cm. ";
                    qD = "20 cm. ";
                    break;
                case 29:

                    sourceString = "O quadro, abaixo, mostra o boleto do condomínio de Celina.@2 "+
                            "@cimg mt550291 cimg@ @1"+
                            "Celina pagou esse boleto no dia 10/05/2011. Qual foi o valor cobrado pelo condomínio? ";
                    qA = "R$ 2,95. ";
                    qB = "R$ 5,90. ";
                    qC = "R$ 297,95. ";
                    qD = "R$ 300,90. ";
                    break;
                case 30:

                    sourceString = "A figura, abaixo, representa a planificação de um sólido geométrico.@2 "+
                            "@cimg mt550301 cimg@ @1"+
                            "O número total de faces desse sólido é ";
                    qA = "2. ";
                    qB = "6. ";
                    qC = "7. ";
                    qD = "8. ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {

                case 1:

                    sourceString = "A teia alimentar abaixo pertence a um determinado ecossistema aquático.@1 "+
                            "@cimg cn550011 cimg@ @1"+
                            "Vestibular Fuvest 2006. Acesso em: 20 jan. 2011.@1"+
                            "Nessa teia são observadas relações de alimentação e transferência de energia entre os diferentes "+
                            "organismos. Nessa transferência, a ";
                    qA = "ave 1 incorpora menor quantidade da energia, pois ela é dissipada nas atividades dos componentes "+
                            "da teia dos quais se alimenta na forma de calor. ";
                    qB = "energia adquirida pelas três espécies de aves retorna aos produtores pela decomposição desses animais. ";
                    qC = "quantidade de energia incorporada pelo peixe 5 é maior que a incorporada pela larva de mosquito. ";
                    qD = "quantidade de energia adquirida pela larva de mosquito é igual à quantidade de energia incorporada pelo fitoplâncton.";
                    break;

                case 2:

                    sourceString = "Até meados do século XIX, os cientistas acreditavam que os seres vivos eram gerados espontaneamente.@1"+
                            "Essa hipótese de geração espontânea, que ficou conhecida como abiogênese, foi contestada por diversos "+
                            "pesquisadores que apresentaram argumentos favoráveis à hipótese da biogênese.@1"+
                            "A biogênese foi considerada pelos pesquisadores como a hipótese que explica a origem da vida, porque, "+
                            "segundo ela, os seres vivos ";
                    qA = "foram criados por um ser supremo e povoaram a Terra e os oceanos. ";
                    qB = "são originados por reprodução de outros seres vivos preexistentes. ";
                    qC = "são resultantes de reações químicas ocorridas na atmosfera primitiva da Terra. ";
                    qD = "tiveram origem em outro ponto do universo e foram trazidos para a Terra. ";
                    break;
                case 3:


                    sourceString = "Mendel cruzou duas variedades da planta Mirabilis jalapa, uma com flores vermelhas e outra com flores "+
                            "brancas, e obteve em F@_1_@ "+
                            " apenas flores rosas. Mendel fez a autofecundação das flores rosas pertencentes "+
                            "à geração F@_1_@ "+
                            " e obteve em F@_2_@ ";
                    qA = "25% brancas; 25% vermelhas; 50% rosas. ";
                    qB = "25% brancas; 50% vermelhas; 25% rosas. ";
                    qC = "50% vermelhas; 50% rosas. ";
                    qD = "75% vermelhas; 25% rosas. ";
                    break;
                case 4:

                    sourceString = "A ilustração, abaixo, mostra células que exercem diferentes funções no corpo de uma esponja.@1 "+
                            "@cimg cn550041 cimg@ @1"+
                            "<small>Disponível em: http://www.portalsaofrancisco.com.br Acesso em: 25 jan. 2011. Adaptado.</small> @2 "+
                            "Qual dessas células é responsável pelo revestimento externo do corpo do animal? ";
                    qA = "Amebócito. ";
                    qB = "Coanócito. ";
                    qC = "Pinacócito. ";
                    qD = "Porócito. ";
                    break;
                case 5:

                    sourceString = "A ilustração, abaixo, mostra um esquema simplificado do sistema genital masculino.@2 "+
                            "@cimg cn550051 cimg@ @1"+
                            "<small>Disponível em: http://www.dombosco.com.br/ Acesso em: 25 jan. 2011.</small> @2 "+
                            "O órgão cuja função é armazenar os espermatozoides está indicado pelo número ";
                    qA = "1. ";
                    qB = "2. ";
                    qC = "3. ";
                    qD = "4. ";
                    break;
                case 6:

                    sourceString = "Um organismo é uma reunião de sistemas intimamente integrados que interagem de forma "+
                            "harmônica e eficiente. Cada sistema contribui para o bom desempenho dos demais e todos são "+
                            "de igual importância para a manutenção das diferentes funções.@1"+
                            "@1<small>LOPES, Sônia. BIO. vol. Único. 1999.</small> @2 "+
                            "Associe as duas colunas, relacionando os órgãos com os respectivos sistemas a que pertencem.@1"+

                            "@cimg cn550061 cimg@ @1"+

                            "A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "1, 4, 3, 2, 5. ";
                    qB = "2, 1, 3, 4, 5. ";
                    qC = "5, 1, 4, 2, 3. ";
                    qD = "2, 5, 1, 4, 3. ";
                    break;
                case 7:

                    sourceString = "Nos seres vivos pode ocorrer reprodução sexuada ou assexuada. Em relação à reprodução sexuada nos "+
                            "animais, são feitas as seguintes afirmativas:@2"+

                            "I. Há formação de um zigoto diploide que por mitoses origina um indivíduo diploide.@1"+
                            "II. Há produção de gametas pela gametogênese, um processo que envolve a meiose.@1 "+
                            "III. Acontece a fecundação, processo que ocorre em organismos monoicos e dioicos.@1 "+
                            "IV. São produzidos indivíduos geneticamente idênticos pelo processo de regeneração.@2 "+

                            "Estão corretas as afirmativas: ";
                    qA = "I e IV, apenas. ";
                    qB = "I, II e III, apenas. ";
                    qC = "II, III e IV, apenas. ";
                    qD = "I, II, III e IV. ";
                    break;
                case 8:

                    sourceString = "As plantas são seres vivos pluricelulares que apresentam estruturas responsáveis por realizar funções "+
                            "específicas para a sua sobrevivência. Associe as duas colunas, relacionando as estruturas vegetais com "+
                            "as suas respectivas funções.@1"+
                            "@cimg cn550081 cimg@ @1"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "4, 5, 3, 1, 2. ";
                    qB = "2, 1, 4, 5, 3. ";
                    qC = "4, 1, 3, 5, 2. ";
                    qD = "2, 5, 4, 1, 3. ";
                    break;
                case 9:

                    sourceString = "O Brasil é considerado um dos grandes poluidores do mundo por causa do desmatamento. Há "+
                            "duas formas de atacar o problema: podemos reduzir as emissões de gases de efeito estufa ou "+
                            "remover o carbono já estocado na atmosfera.@1"+
                            "@1<small>Disponível em: http://talentoambiental.blogspot.com/ Acesso em: 03 fev. 2011. Adaptado.</small> @2 "+
                            "A remoção do carbono estocado na atmosfera envolve a produção de _____________por um processo "+
                            "metabólico denominado _____________.@1"+
                            "@1As palavras que completam corretamente essas lacunas são, respectivamente, ";
                    qA = "carboidrato, fotossíntese. ";
                    qB = "enzima, respiração anaeróbia. ";
                    qC = "lipídio, respiração aeróbia. ";
                    qD = "proteína, fermentação. ";
                    break;
                case 10:

                    sourceString = "Para estudar a variedade de organismos, em todos os ambientes, tornou-se necessário classificá-los e "+
                            "agrupá-los de acordo com suas características semelhantes.@1"+
                            "Um determinado grupo de seres vivos possui cerca de 80.000 espécies de organismos que apresentam "+
                            "algumas características como:@2"+
                            "• Realizam a decomposição da matéria orgânica nos ecossistemas.@1"+
                            "• São seres uni ou pluricelulares que possuem células com envoltório nuclear.@1"+
                            "• Alguns são parasitas que causam doenças em plantas e animais.@1"+
                            "• Uma espécie desse grupo fornece matéria-prima para a extração da penicilina.@1"+
                            "@1Que grupo de seres vivos apresenta essas características? ";
                    qA = "Animais. ";
                    qB = "Bactérias. ";
                    qC = "Fungos. ";
                    qD = "Plantas. ";
                    break;
                case 11:

                    sourceString = "O gráfico, abaixo, mostra a evolução da malária no Brasil, independente da idade, segundo o senso de 2007.@2 "+
                            "@cimg cn550111 cimg@ @1"+
                            "<small>Disponível em: http://www.static.hsw.com.br/gif/malaria-brasil. Acesso em: 08 fev. 2011.</small> @2 "+
                            "Uma das causas dos resultados apresentados em 2002 pode ter sido ";
                    qA = "a diminuição do número de caramujos transmissores. ";
                    qB = "a conscientização da população sobre a profilaxia. ";
                    qC = "o aumento da proliferação do inseto vetor. ";
                    qD = "o uso de antibióticos pelos indivíduos doentes. ";
                    break;
                case 12:

                    sourceString = "Uma mulher grávida produz todos os anticorpos aos quais tenha sido sensibilizada e os passa "+
                            "para a criança pela placenta e, posteriormente, pela amamentação. Os anticorpos também "+
                            "podem ser aplicados nas pessoas por soroterapia, que consiste na aplicação de soros, que são "+
                            "constituídos por plasma e anticorpos produzidos por outro indivíduo.@1"+
                            "@1<small>Disponível em: http://vestibular.uol.com.br/ Acesso em: 06 fev. 2011. Adaptado.</small> @2 "+
                            "A aplicação do soro deve ser usada para ";
                    qA = "evitar a morte de uma pessoa picada por escorpião. ";
                    qB = "imunizar um recém-nascido contra poliomielite. ";
                    qC = "prevenir a população contra a epidemia de dengue. ";
                    qD = "proteger uma criança contra a tuberculose. ";
                    break;
                case 13:

                    sourceString = "Durante os estágios de segmentação, o ovo origina blastômeros que formam a mórula, como "+
                            "esquematizado abaixo.@2 "+
                            "@cimg cn550131 cimg@ @1"+
                            "Vestibular Ufrj. 1999. Adaptado.@1"+
                            "@1De acordo com esse esquema, a mórula é resultante de sucessivas ";
                    qA = "fecundações. ";
                    qB = "meioses. ";
                    qC = "mitoses. ";
                    qD = "nidações. ";
                    break;
                case 14:

                    sourceString = "O quadro abaixo retrata a esperança de vida ao nascer, no Brasil, segundo o IBGE.@2 "+
                            "@cimg cn550141 cimg@ @1"+
                            "<small>Disponível em: http://www.ibge.gov.br/ Acesso em: 10 fev. 2011.</small> @2 "+
                            "Os dados desse quadro evidenciam que ocorreu ";
                    qA = "aumento da mortalidade infantil na primeira década da pesquisa. ";
                    qB = "despreocupação com exames pré-natais entre 2000 e 2009. ";
                    qC = "diminuição dos investimentos na saúde infantil entre 2006 e 2008. ";
                    qD = "redução da mortalidade infantil no período pesquisado. ";
                    break;
                case 15:

                    sourceString = "O fitoplâncton é constituído, principalmente, por algas unicelulares, sem movimentos próprios, que flutuam "+
                            "na água.@1"+
                            "Em relação a essas algas planctônicas, são feitas as seguintes afirmativas:@2"+

                            "I. São organismos procariontes pertencentes ao mesmo grupo das bactérias.@1"+
                            "II. Ocupam o primeiro nível trófico da cadeia alimentar dos ecossistemas aquáticos.@1 "+
                            "III. São as principais responsáveis pela presença de oxigênio na atmosfera. @2 "+

                            "Estão corretas as afirmativas: ";
                    qA = "I e II, apenas. ";
                    qB = "I e III, apenas. ";
                    qC = "II e III, apenas. ";
                    qD = "I, II e III. ";
                    break;
                case 16:

                    sourceString = "A Secretaria Estadual de Saúde de Minas Gerais confirmou a primeira morte por dengue no "+
                            "Estado em 2011. Há outros nove casos confirmados de pacientes com complicações da doença "+
                            "e outros dois da forma mais grave de dengue, a hemorrágica. Uma outra morte que pode ter sido "+
                            "provocada pela doença está sendo investigada.@1"+
                            "@1<small>Disponível em: http://www.band.com.br/jornalismo/saude/ Acesso em: 12 fev. 2011.</small> @2 "+
                            "Uma medida profilática para essa doença é a ";
                    qA = "eliminação dos mosquitos transmissores do vírus da dengue. ";
                    qB = "eliminação dos ratos que transmitem o vírus pela urina. ";
                    qC = "incineração do lixo para evitar-se a proliferação de moscas. ";
                    qD = "vacinação da população contra a bactéria que a causa. ";
                    break;
                case 17:

                    sourceString = "As mudanças climáticas vieram para ficar, as enxurradas são constantes em todas as regiões do "+
                            "Brasil e os últimos fatos ocorridos em Santa Catarina, Teresópolis, Nova Friburgo e outras regiões "+
                            "são a confirmação de que o Brasil não está preparado para desafios da natureza.@1"+
                            "@1<small>Disponível em: http://www.adjorisc.com.br/geral/desastres-ambientais- Acesso em: 12 fev. 2011.</small> @2 "+
                            "Para a redução dos problemas ambientais decorrentes das mudanças climáticas, são feitas as seguintes "+
                            "afirmativas:@2"+

                            "I. Os investimentos em moradias, para que as pessoas possam viver longe das áreas de risco, são "+
                            "uma necessidade urgente.@1"+
                            "II. O conjunto de medidas que contribuem para a melhoria das condições ambientais necessita da "+
                            "participação individual e coletiva.@1"+
                            "III. O asfaltamento das ruas e avenidas deve ser uma ação prioritária no combate às enchentes.@1 "+
                            "IV. As cidades do interior dos Estados precisam de mais investimentos, pois são as únicas atingidas "+
                            "pelas enchentes.@1"+

                            "@1Estão corretas as afirmativas: ";

                    qA = "I e II, apenas. ";
                    qB = "II e III, apenas. ";
                    qC = "I, III e IV, apenas. ";
                    qD = "I, II, III e IV. ";
                    break;

                case 18:

                    sourceString = "Um amperímetro registrou uma corrente elétrica i = 8,0 A percorrendo um fio metálico de uma instalação "+
                            "elétrica industrial.@1"+
                            "Sabendo-se que a carga elétrica elementar vale e = 1,6.10@sp–19sp@ C , constata-se que o número n de elétrons "+
                            "que atravessaram uma dada seção desse fio, num intervalo de tempo ∆t = 5,0s, foi de ";
                    qA = "5,0.10@sp19sp@. ";
                    qB = "2,5.10@sp19sp@. ";
                    qC = "5,0.10@sp20sp@. ";
                    qD = "2,5.10@sp20sp@. ";
                    break;
                case 19:

                    sourceString = "Num grande reservatório de água foi colocada uma esfera metálica maciça e homogênea de massa igual "+
                            "a 100 gramas e volume 2,5.10@sp–5sp@ m3 "+
                            ".@1"+
                            "Considerando-se a densidade da água d = 1,0.10³ kg/m³, o que ocorreu com essa esfera? ";
                    qA = "Afundou, pois o peso que atua nela vale 0,75 N. ";
                    qB = "Flutuou, pois sua densidade é menor que a da água. ";
                    qC = "Afundou, pois sua densidade é maior que a da água. ";
                    qD = "Flutuou, pois o empuxo que atua nela vale 0,25 N. ";
                    break;
                case 20:

                    sourceString = "Baseadas na 3ª Lei de Newton, são feitas as seguintes afirmativas:@2"+

                            "I. Se um vaso de flores permanece em equilíbrio numa mesa horizontal, é correto afirmar que as "+
                            "forças peso e normal que nele atuam formam um par ação-e-reação.@1"+

                            "II. Forças de ação-e-reação não se anulam, pois, apesar de serem de mesma direção, mesma "+
                            "intensidade e sentidos contrários, atuam em corpos distintos.@1"+

                            "III. Quando um jogador de futebol chuta a bola, a força aplicada nela é de maior intensidade que a "+
                            "reação aplicada pela bola no pé do jogador.@1"+

                            "IV. A força de atração da Terra sobre o Sol é igual, em intensidade e direção, à força de atração do "+
                            "Sol sobre a Terra.@1"+

                            "@1Estão corretas apenas as afirmativas ";
                    qA = "I e III. ";
                    qB = "II e IV. ";
                    qC = "II e III. ";
                    qD = "I e IV. ";
                    break;
                case 21:

                    sourceString = "No circuito elétrico, abaixo, considere desprezível a resistência interna do gerador de 24 V.@2 "+
                            "@cimg cn550211 cimg@ @1"+
                            "A partir das Leis de Ohm aplicadas nesse circuito, as correntes elétricas @b i@_1_@, i@_2_@, i@_3_@ b@ valem, respectivamente, ";
                    qA = "1 A, 2 A e 3 A. ";
                    qB = "2 A, 3 A e 5 A. ";
                    qC = "5 A, 2 A e 3 A. ";
                    qD = "5 A, 5 A e 5 A. ";
                    break;
                case 22:

                    sourceString = "No instante retratado na figura, abaixo, um bloco de massa 1,0 kg passa pelo ponto X de um escorregador@2 "+
                            "com velocidade v@_X_@ = 10 m/s.@1"+
                            "@cimg cn550221 cimg@ @1"+
                            "Considere desprezível qualquer tipo de atrito e use g = 10 m/s2 "+
                            ".@1"+
                            "Sabe-se que, quando o bloco atinge o ponto Y, sua velocidade v@_Y_@ = 16 m/s, e sua energia cinética vale, "+
                            "em joules, ";
                    qA = "256. ";
                    qB = "128. ";
                    qC = "78. ";
                    qD = "50. ";
                    break;
                case 23:

                    sourceString = "A partir de pesquisas espaciais, descobriu-se que, na superfície de Plutão, as temperaturas medidas na "+
                            "escala absoluta Kelvin variam entre 38 K e 63 K.@1"+
                            "Se essas medidas fossem realizadas utilizando-se um termômetro graduado na escala Celsius, qual seria "+
                            "a variação de temperatura por ele registrada? ";
                    qA = "25 ºC. ";
                    qB = "45 ºC. ";
                    qC = "– 235 ºC. ";
                    qD = "– 210 ºC. ";
                    break;
                case 24:

                    sourceString = "Um aquecedor fornece energia à taxa constante de 200 cal/s durante 5 minutos para 1000 g de água, "+
                            "inicialmente a 20 ºC.@1"+
                            "Considere o calor específico da água 1,0 cal/g.o "+
                            "C e que o calor fornecido pelo aquecedor vá integralmente "+
                            "para a água.@1"+
                            "@1Qual a temperatura final dessa massa de água? ";
                    qA = "21 ºC. ";
                    qB = "40 ºC. ";
                    qC = "60 ºC. ";
                    qD = "80 ºC. ";
                    break;
                case 25:

                    sourceString = "Num sistema mecânico é utilizada uma mola ideal para a qual é válida a aplicação da Lei de Hooke.@1"+
                            "Sabe-se que ela possui constante elástica igual a 100 N/m.@1"+
                            "@1Ao ser deformada em 20 cm, qual será a energia potencial elástica armazenada por essa mola? ";
                    qA = "2,0.10@sp4sp@ "+
                            " J. ";
                    qB = "4,0.10@sp4sp@ "+
                            " J. ";
                    qC = "4,0.10@sp1sp@ "+
                            " J. ";
                    qD = "2,0.10@sp0sp@ J";
                    break;
                case 26:

                    sourceString = "Duas cargas elétricas @bQ@_1_@b@ "+
                            " e @bQ@_2_@b@ "+
                            ", quando estão separadas uma da outra de uma distância @bdb@, repelem-se com "+
                            "uma força de intensidade 100 N. Numa nova condição, as mesmas cargas elétricas passam a repelir-se "+
                            "com uma força de intensidade 25 N, quando separadas de uma nova distância @bxb@.@1"+
                            "Sobre essa situação, são feitas as seguintes afirmativas:@2"+

                            "I. Como @bQ@_1_@b@ "+
                            " e @bQ@_2_@b@ "+
                            " se repelem, elas são cargas elétricas de mesmo sinal.@1"+

                            "II. Na nova condição, a distância x entre elas aumentou para @b 2d b@.@1 "+

                            "III. Como @bQ@_1_@b@ "+
                            " e @bQ@_2_@b@ "+
                            " não se atraem, elas são de massas iguais.@1"+

                            "IV. Na nova condição, uma das cargas mudou de sinal. @2 "+

                            "Estão corretas apenas as afirmativas ";
                    qA = "I e II. ";
                    qB = "II e III. ";
                    qC = "II e IV. ";
                    qD = "I e IV. ";
                    break;
                case 27:

                    sourceString = "O gráfico, abaixo, representa o comportamento da velocidade de um móvel, durante os primeiros 35 segundos "+
                            "de seu movimento.@1"+
                            "@cimg cn550271 cimg@"+
                            "@1Sabendo-se que no instante t = 0 s a posição do móvel é 15 m, a sua posição em t = 35 s será ";
                    qA = "275 m. ";
                    qB = "260 m. ";
                    qC = "165 m. ";
                    qD = "150 m. ";
                    break;
                case 28:

                    sourceString = "Sobre o Princípio da Inércia, são feitas as seguintes afirmativas:@2"+

                            "I. Um corpo em repouso tem a tendência de permanecer em repouso, assim como um corpo em "+
                            "movimento tende a continuar em Movimento Retilíneo Uniforme.@1"+
                            "II. Em uma caixa apoiada numa superfície horizontal atuam apenas as forças Peso e a força Normal "+
                            "de apoio, que formam um par ação e reação.@1"+
                            "III. Quanto menor a massa de um corpo, maior a força exigida para retirá-lo do repouso ou para se "+
                            "alterar o seu estado de movimento.@1"+
                            "IV. A partir do Princípio da Inércia, justifica-se a obrigatoriedade do uso do cinto de segurança nos automóveis. @2 "+

                            "Estão corretas apenas as afirmativas ";
                    qA = "I e IV. ";
                    qB = "II e III. ";
                    qC = "I, II e IV. ";
                    qD = "II, III e IV. ";
                    break;
                case 29:

                    sourceString = "Uma esfera @bXb@ eletrizada com carga igual a 12 μC está suspensa por um fio isolante. Uma segunda esfera "+
                            "@bYb@, que está inicialmente neutra, é colocada em contato com @bXb@. Em seguida, elas são separadas.@1"+
                            "Depois disso, a esfera@bYb@toca uma terceira esfera @bZb@, que está eletrizada com carga igual a –10 μC, sendo "+
                            "em seguida separadas uma da outra.@1"+
                            "@1Sabendo-se que as três esferas são condutoras e de mesmas dimensões, suas cargas finais serão ";

                    qA = "Q@_X_@ = 12 μC; Q@_Y_@ = zero; Q@_Z_@ = – 10 μC. ";
                    qB = "Q@_X_@ = zero; Q@_Y_@ = – 10 μC; Q@_Z_@ = 12 μC. ";
                    qC = "Q@_X_@ = 6,0 μC; Q@_Y_@ = 8,0 μC; Q@_Z_@ = 8,0 μC. ";
                    qD = "Q@_X_@ = 6,0 μC; Q@_Y_@ = – 2,0 μC; Q@_Z_@ = – 2,0 μC. ";
                    break;
                case 30:

                    sourceString = "À temperatura inicial de 20 ºC, uma chapa com um orifício central circular e um pino de seção reta também "+
                            "circular não se encaixam, pois o diâmetro do pino é maior que o do orifício.@1"+
                            "@1Como ambos são feitos do mesmo tipo de metal, o que pode ser feito para tornar possível o encaixe? ";
                    qA = "Aquecer apenas o pino. ";
                    qB = "Resfriar apenas a chapa. ";
                    qC = "Aquecer igualmente tanto a chapa quanto o pino. ";
                    qD = "Resfriar mais intensamente o pino que a chapa. ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {

                case 1:

                    sourceString = "O texto, abaixo, foi escrito por Pero Vaz de Caminha ao rei de Portugal, em 1500.@2 "+
                            "À tarde vimos terra. Antes, uma grande montanha, muito alta e redonda. Vimos outras terras "+
                            "mais baixas, ao sul dessa montanha, e vimos mais terra, com muitas árvores.@1"+
                            "Carta de Pero Vaz de Caminha. 1500.@1"+
                            "@1Esse trecho da carta ";
                    qA = "apresenta sugestões para o aproveitamento da terra. ";
                    qB = "descreve os aspectos físicos da terra descoberta. ";
                    qC = "relata a impressão sobre os costumes dos índios. ";
                    qD = "sugere que a nova terra descoberta era uma ilha. ";
                    break;
                case 2:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Os primeiros habitantes do Brasil foram vítimas do processo colonizador. O europeu, com visão "+
                            "de mundo calcada em preconceitos, menosprezou o indígena e sua cultura. Se acreditarmos nos "+
                            "depoimentos deixados pelos viajantes e missionários, a partir de meados do século XVI, houve "+
                            "um decréscimo da população indígena, que se agravou nos séculos seguintes.@1"+
                            "@1<small>Disponível em: http://recantodasletras.uol.com.br/redacoes/478917. Acesso em: 06 fev. 2011.</small> @2 "+
                            "Os fatores que contribuíram para o decréscimo da população indígena foram ";
                    qA = "a exploração do trabalho indígena e o espírito sanguinário do índio. ";
                    qB = "a prática do canibalismo e as missões jesuíticas do vale amazônico. ";
                    qC = "as epidemias introduzidas pelos europeus e a escravidão dos índios. ";
                    qD = "as guerras entre as tribos indígenas e entre os índios e os brancos. ";
                    break;
                case 3:

                    sourceString = "Leia os versos da música abaixo.@2 "+
                            "Sobre a cabeça os aviões @1"+
                            "Sob os meus pés os caminhões @1"+
                            "Aponta contra os chapadões @1"+
                            "Meu nariz @1"+
                            "Eu organizo o movimento @1"+
                            "Eu oriento o carnaval @1"+
                            "Eu inauguro o monumento @1"+
                            "No planalto central @1"+
                            "Do país @1"+
                            "Viva a bossa-sa-sa @1"+
                            "Viva a palhoça-ça-ça-ça-ça [...] "+
                            "@2<small>VELOSO, Caetano. Sem lenço, sem documento. Universal Music, 1999. CD.</small> @2 "+
                            "Essa música, composta em 1968, retrata o movimento tropicalista, que ";
                    qA = "apresentava várias canções de protesto em grandes festivais da televisão brasileira. ";
                    qB = "fundia o blues do negro norte-americano com o country dos brancos pobres do meio rural. ";
                    qC = "introduzia uma batida de violão que mesclava ritmos do samba com o jazz norte-americano. ";
                    qD = "propunha incorporar e reelaborar os elementos modernos e tradicionais da cultura brasileira. ";
                    break;
                case 4:

                    sourceString = "Leia o texto, abaixo, sobre a crise de 1929.@2 "+
                            "A crise que começou a existir com o advento do sistema capitalista não é devida a fatos "+
                            "anormais, parece parte e parcela de nosso sistema econômico. É caracterizada não pela "+
                            "escassez, mas pela superabundância. Nela os preços, ao invés de subirem, caem.@1"+
                            "@1<small>HUBERMAN, Leo. História da Riqueza do Homem. Rio de Janeiro: LTC, 1986, p. 272.</small> @2 "+
                            "Com a crise de 1929, o Estado passou a intervir na economia ";
                    qA = "adotando um sistema de planificação da economia nacional. ";
                    qB = "distribuindo a riqueza nacional entre os cidadãos pobres. ";
                    qC = "nacionalizando a produção com o monopólio da exportação. ";
                    qD = "regulando os mecanismos de produção e distribuição. ";
                    break;
                case 5:

                    sourceString = "Leia os versos, abaixo, de autoria de Vinícius de Moraes.@2 "+
                            "Pensem nas crianças @1"+
                            "Mudas telepáticas @1"+
                            "Pensem nas meninas @1"+
                            "Cegas inexatas @1"+
                            "Pensem nas mulheres@1 "+
                            "Rotas alteradas @1"+
                            "Pensem nas feridas @1"+
                            "Como rosas cálidas @1"+
                            "Mas oh não se esqueçam @1"+
                            "Da rosa da rosa @1"+
                            "Da rosa de Hiroshima @1"+
                            "A rosa hereditária@1 "+
                            "A rosa radioativa @1"+
                            "Estúpida e inválida @1"+
                            "A rosa com cirrose @1"+
                            "A anti-rosa atômica @1"+
                            "Sem cor sem perfume @1"+
                            "Sem rosa sem nada @2"+
                            "<small> MORAES, Vinícius de. Poesia completa e prosa. Rio de Janeiro, Aguiar, 1974, p. 265.</small>@2"+
                            "Nesse poema, o autor ";
                    qA = "condena a ação de países poderosos, convocando a humanidade a um protesto coletivo. ";
                    qB = "critica as armas nucleares, denunciando os efeitos devastadores da bomba atômica. ";
                    qC = "denuncia a ação criminosa dos guerrilheiros, desaprovando suas ações de extermínio. ";
                    qD = "protesta contra os crimes de guerra, denunciando a impunidade dos governantes. ";
                    break;
                case 6:

                    sourceString = "O texto, abaixo, apresenta uma manifestação cultural de origem africana, que se tornou uma forma de@2 "+
                            "resistência contra a escravidão.@1"+
                            "O berimbau, que servia para dar ritmo ao jogo, também servia para anunciar a chegada de um "+
                            "feitor, ou seja, a hora de transformar a luta em dança. O jogo (...) é acompanhado por instrumentos "+
                            "musicais, comandados pela figura máxima do berimbau, o qual dá o tom e comanda o ritmo para "+
                            "a execução das cantigas: cantos corridos ou ladainhas.@1"+
                            "@1<small>Disponível em: http://www.desportosdeginasio.com/areas/artigo.asp?area=2&IDconteudo=50&IDsubarea=7 Acesso em: 11 fev. 2011. Adaptado.</small> @2 "+
                            "Essa manifestação cultural é ";
                    qA = "a capoeira. ";
                    qB = "a roda de samba. ";
                    qC = "o congado. ";
                    qD = "o bumba-meu-boi. ";
                    break;
                case 7:

                    sourceString = "Leia o texto abaixo sobre a origem dos movimentos operários na Inglaterra, no século XVIII.@2 "+
                            "Com o passar dos anos, os trabalhadores passaram a instituir organizações em prol dos "+
                            "seus próprios interesses. Estas organizações tinham caráter cooperativista e ao mesmo tempo "+
                            "político. Com sua força política representada, os trabalhadores conquistaram melhores condições "+
                            "de trabalho, a redução da jornada de trabalho e o direito à greve. Dessas mobilizações surgiram "+
                            "os primeiros sindicatos que, ainda hoje, têm grande importância para a classe trabalhadora.@1"+
                            "@1<small>Disponível em: http://www.mundoeducacao.com.br/historiageral/formacao-classe-operaria.htm Acesso em: 11 fev. 2011. Adaptado.</small> @2 "+
                            "Os primeiros sindicatos de trabalhadores tiveram origem ";
                    qA = "na associação de trabalhadores, que se organizaram nas “Trades Unions” proporcionando-lhes "+
                            "assistência mútua. ";
                    qB = "na ideologia socialista, que defendia a igualdade de oportunidades e redistribuição igualitária de renda "+
                            "e dos meios de produção. ";
                    qC = "no cartismo, que publicou a Carta do Povo, exigindo diversos direitos sociais e políticos para a classe "+
                            "operária. ";
                    qD = "no movimento ludita, que foi a primeira manifestação de resistência operária e pregava a destruição das máquinas.";
                    break;
                case 8:

                    sourceString = "Leia o texto abaixo sobre a Guerra do Contestado.@2 "+
                            "Revoltados com os governos estaduais, que promoviam a concentração da terra, nas mãos "+
                            "de poucos e com o governo federal, que concedeu uma extensa área, já habitada, à empresa "+
                            "norte-americana responsável pela construção da estrada de ferro São Paulo - Rio Grande do Sul "+
                            "no território, os caboclos enfrentaram as forças militares dos dois Estados e do Exército Nacional, "+
                            "encarregados da repressão.@1"+
                            "@1<small>Disponível em: http://pt.shvoong.com/humanities/history/682802-guerra-contestado/.. Acesso em: 19 fev. 2011.</small> @2 "+
                            "A Guerra do Contestado ocorrida nos primeiros anos do século XX foi ";
                    qA = "uma disputa armada entre os latifundiários da região Sul. ";
                    qB = "uma revolta dos colonos imigrantes pela posse da terra. ";
                    qC = "um movimento popular relacionado à questão agrária. ";
                    qD = "um movimento messiânico ocorrido no nordeste do Brasil. ";
                    break;
                case 9:

                    sourceString = "Leia o texto abaixo sobre o Nazismo.@2 "+
                            "Nós queremos, um dia, não mais ver classes nem castas; portanto comecem já a erradicar "+
                            "isso em vocês mesmos. Nós queremos, um dia, ver no Reich uma só peça, e vocês devem já "+
                            "se educar nesse sentido. Nós queremos que esse povo seja, um dia, obediente, e vocês devem "+
                            "treinar essa obediência. Nós queremos que esse povo seja, um dia, pacífico, mas valoroso, e "+
                            "vocês devem ser pacíficos.@1"+
                            "Adolf Hitler, no Congresso Nazista de Nuremberg, 1933. In: O triunfo da vontade, filme de Leni Riefenstahl, 1935.@1"+
                            "@1De acordo com esse texto, o projeto nazista tinha como característica a ";
                    qA = "ampliação dos princípios liberais. ";
                    qB = "defesa da ideologia comunista. ";
                    qC = "recusa da utilização da violência. ";
                    qD = "submissão do indivíduo ao Estado. ";
                    break;
                case 10:

                    sourceString = "Observe a imagem abaixo.@2 " +
                            "@cimg ch550101 cimg@"+
                            "@1<small>DEBRET, Jean-Baptiste. Disponível em: http://paginadacultura.com.br/br/category/curso/ Acesso em: 20 fev. 2011.</small> @2 "+
                            "A escravidão negra, no Brasil, caracterizou-se por ";
                    qA = "assumir as tarefas necessárias ao conforto da vida da população branca. ";
                    qB = "consolidar as relações de afetividade estabelecidas entre senhores e escravos. ";
                    qC = "preservar a cultura dos diferentes grupos étnicos trazidos da África para o país. ";
                    qD = "tratar as crianças escravas com familiaridade, integradas ao espaço doméstico. ";
                    break;
                case 11:

                    sourceString = "Leia o texto, abaixo, sobre um importante movimento, no século XVIII.@2 "+
                            "Cada soldado é cidadão, sobretudo os homens pardos e pretos, que vivem escorraçados e "+
                            "abandonados. Todos serão iguais, não haverá diferença; só haverá liberdade, igualdade e fraternidade.@1"+
                            "Manifesto afixado nas paredes das igrejas de Salvador, em agosto de 1798.@1"+
                            "@1Esse texto refere-se à ";
                    qA = "Conjuração Baiana. ";
                    qB = "Conjuração Mineira. ";
                    qC = "Revolta de Vila Rica. ";
                    qD = "Revolta dos Malês. ";
                    break;
                case 12:

                    sourceString = "Leia o texto, abaixo, sobre a vida dos escravos na América Portuguesa.@2 "+
                            "Ao chegar à América, o escravo africano se deparava com um mundo que em tudo lhe era "+
                            "estranho e hostil. Com as relações familiares desfeitas antes do embarque para terras desconhecidas "+
                            "— marido, mulher, pais e filhos eram separados e vendidos, seguindo destinos diferentes —, nada "+
                            "restava da sua comunidade de origem. Abatido pelas perdas, o escravo enfrentava ainda condições "+
                            "desumanas de trabalho nos canaviais ou alimentando as fornalhas nos engenhos. Às mulheres "+
                            "cabia fazer todo o serviço doméstico, atender às necessidades das esposas e filhos do senhor [...].@1"+
                            "Escravos e escravas viviam sob a ameaça constante de castigos físicos.@1"+
                            "@1<small>Disponível em: http://www.dialetico.com/historia/historia_29.pdf. Acesso em: 09 mar. 2011.</small> @2 "+
                            "Uma das formas de reação à escravidão foi a fuga e a formação de quilombos onde os escravos ";
                    qA = "mantinham a ordem colonial estabelecida pelos colonizadores. ";
                    qB = "organizavam grupos de escravos para enfrentar os senhores. ";
                    qC = "reconstruíam formas comunitárias semelhantes às da África. ";
                    qD = "viviam em contato com os arredores que os cercavam. ";
                    break;
                case 13:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Grande parte dos lucros e do capital em circulação no mundo passa pelo sistema financeiro. A "+
                            "globalização permitiu às grandes corporações produzirem seus produtos em diversas partes do "+
                            "mundo, buscando a redução de custos. Estas empresas, dentro de uma economia de mercado, "+
                            "vendem estes produtos para vários países, mantendo um comércio ativo de grandes proporções.@1"+
                            "Os sistemas informatizados possibilitam a circulação e transferência de valores em tempo quase "+
                            "real. Apesar das indústrias e do comércio continuarem a lucrar muito dentro deste sistema, "+
                            "podemos dizer que os sistemas bancário e financeiro são aqueles que mais lucram e acumulam "+
                            "capitais dentro deste contexto econômico atual.@1"+
                            "@1<small>Disponível em: http://www.suapesquisa.com/capitalismo/.. Acesso em: 15 mar. 2011.</small> @2 "+
                            "Esse texto refere-se ao Capitalismo ";
                    qA = "comercial. ";
                    qB = "industrial. ";
                    qC = "monopolista. ";
                    qD = "neoliberal. ";
                    break;
                case 14:

                    sourceString = "Leia o texto, abaixo, sobre a colonização espanhola na América.@2 "+
                            "(...) desde o começo até hoje a hora presente os espanhóis nunca tiveram o mínimo cuidado "+
                            "em procurar fazer com que a essas gentes fosse pregada a fé de Jesus Cristo, como se os "+
                            "índios fossem cães ou outros animais: e o que é pior ainda é que o proibiram expressamente "+
                            "aos religiosos, causando-lhes inumeráveis aflições e perseguições, a fim de que não pregassem, "+
                            "porque acreditavam que isso os impediria de adquirir o ouro e riquezas que a avareza lhes prometia.@1"+
                            "Frei Bartolomeu de Las Casas. Brevíssima relação da destruição das Índias, 1552. Fragmento.@1"+
                            "@1No processo de colonização espanhola na América, os missionários ";
                    qA = "influenciaram a submissão dos índios pela força. ";
                    qB = "pretendiam ficar com as riquezas da terra. ";
                    qC = "propunham a destruição da cultura indígena. ";
                    qD = "queriam a conversão religiosa dos índios. ";
                    break;
                case 15:

                    sourceString = "Leia o texto, abaixo, sobre o socialismo científico proposto por Karl Marx.@2 "+
                            "A história de toda a sociedade até hoje é a história da luta de classes. Homem livre e escravo, "+
                            "patrício e plebeu, barão e servo, burguês da corporação e oficial, em suma, opressores e "+
                            "oprimidos, estiveram em constante antagonismo entre si, travaram uma luta ininterrupta, umas "+
                            "vezes oculta, aberta outras, uma luta que acabou sempre com uma transformação revolucionária "+
                            "de toda a sociedade ou com o declínio comum das classes em luta.@1"+
                            "@1<small>Disponível em: http://historiaeciencia.weblog.com.pt/arquivo/006936.html. Acesso em: 09 mar. 2011. Fragmento.</small> @2 "+
                            "Para Marx, a superação do capitalismo só seria possível com a ";
                    qA = "eliminação das injustiças sociais pelos ensinamentos cristãos. ";
                    qB = "extinção da propriedade privada através da revolução do proletariado. ";
                    qC = "intervenção do Estado para melhorar a vida dos trabalhadores. ";
                    qD = "organização de um sistema de cooperativas de trabalhadores. ";
                    break;
                case 16:

                    sourceString = "Observe a caricatura, abaixo, do fim do século XIX.@2 "+
                            "@cimg ch550161 cimg@"+
                            "@1Essa caricatura relaciona-se com ";
                    qA = "a abdicação de D. Pedro I. ";
                    qB = "a proclamação da república. ";
                    qC = "o golpe da maioridade. ";
                    qD = "o período regencial. ";
                    break;
                case 17:

                    sourceString = "Observe a charge abaixo.@2 "+
                            "@cimg ch550171 cimg@"+
                            "@1<small>Disponível em: http://1.bp.blogspot.com/_SjBUFj3jDSY/SotfKYgm68I/AAAAAAAARtU/qcz_iSqGMm0/s1600-h/BENDATI_charge_Diretas.jpg. Acesso em: 15 mar. 2011.</small> @2 "+
                            "Essa charge refere-se ";
                    qA = "à campanha pelo retorno de eleição direta para Presidente. ";
                    qB = "à substituição do Presidente da República por uma Junta Militar. ";
                    qC = "às guerrilhas urbanas que lutavam pelo fim do autoritarismo e da tortura. ";
                    qD = "às lutas sindicais pelo controle dos movimentos operários. ";
                    break;
                case 18:

                    sourceString = "Leia os textos abaixo.@2 "+
                            "@b Texto 1 b@ @2"+
                            "Curral del Rei é o nome do arraial onde, em 1897, implantou-se a cidade de Belo Horizonte.@1"+
                            "Este povoado tinha hábitos pacatos e provincianos. Sua atividade econômica se sustentava da "+
                            "modesta atividade comercial e da produção agrícola dos sítios. As práticas socioculturais giravam "+
                            "em torno da atividade religiosa e suas festas, e dos bate-papos nas vendas, porta das casas e "+
                            "pelas vielas.@1"+
                            "@1<small>Disponível em: http://www.cbce.org.br/cd/resumos/228.pdf Acesso em: 5 fev. 2011. Adaptado.</small> @2 "+
                            "@b Texto 2 b@ @2"+
                            "Hoje, Belo Horizonte conta com uma infraestrutura de 36 teatros, 54 salas de cinema e mais "+
                            "de 30 galerias de arte. Além disso, 18 museus recontam a vida da capital mineira e do Estado de "+
                            "Minas Gerais, expondo objetos que muito importam à historiografia nacional.@1"+
                            "@1<small>Disponível em: http://www.idasbrasil.com.br/idasbrasil/cidades/belohorizonte/port/cultura.asp Acesso em: 5 fev. 2011.</small> @2 "+
                            "Esses textos relacionam-se ";
                    qA = "à implantação de novas atividades econômicas em Minas Gerais. ";
                    qB = "à migração da população rural para os grandes centros urbanos. ";
                    qC = "às dificuldades de criação de uma nova capital para o Estado mineiro. ";
                    qD = "às mudanças na vida da cidade provocadas pelo crescimento urbano. ";
                    break;
                case 19:

                    sourceString = "Leia o texto, abaixo, sobre os sem-teto.@2 "+
                            "São Paulo tem quase 11.000 moradores de rua, de acordo com o último censo da Fundação "+
                            "Instituto de Pesquisas Econômicas (Fipe). Eles são, em sua maioria, homens (84%), com idades "+
                            "que variam entre 26 e 55 anos (65%). Espalhados pelos canteiros e viadutos da cidade, formam "+
                            "uma massa silenciosa e invisível – um elemento da paisagem urbana do qual a sociedade se "+
                            "acostumou a desviar o olhar.@1"+
                            "@1<small>Disponível em: http://veja.abril.com.br/301105/p_074.html Acesso em: 4 fev. 2011.</small> @2 "+
                            "A existência dos sem-teto deve-se à ";
                    qA = "centralização. ";
                    qB = "metropolização. ";
                    qC = "periferização. ";
                    qD = "suburbanização. ";
                    break;
                case 20:

                    sourceString = "Leia o texto, abaixo, sobre Bolsa de Valores.@2 "+
                            "Bolsa de Valores é o local onde são negociados títulos emitidos por empresas de capital "+
                            "público, misto ou privado. As Bolsas de Valores centralizam as operações do mercado de capitais "+
                            "e negociam ações de compra ou venda.@1"+
                            "As principais Bolsas de Valores do mundo são: Nasdaq, Bolsa de Nova Iorque, Bolsa de "+
                            "Chicago, Bolsa de Frankfurt, Bolsa de Tóquio, Bolsa de Londres e Bolsa de Xangai. Já no Brasil, "+
                            "a principal Bolsa de Valores é a Bovespa (Bolsa de Valores de São Paulo).@1"+
                            "@1<small>Disponível em: http://www.conexaobr.com/bolsa_de_valores.php Acesso em: 6 fev. 2011.</small> @2 "+
                            "As principais Bolsas de Valores do mundo estão localizadas em ";
                    qA = "aglomerações urbanas. ";
                    qB = "capitais regionais. ";
                    qC = "centros sub-regionais. ";
                    qD = "metrópoles globais. ";
                    break;
                case 21:

                    sourceString = "Observe as duas imagens abaixo, que apresentam uma das transformações do espaço rural.@2 "+

                            "@cimg ch550211 cimg@"+
                            "@1<small>Disponível em: http://geoconceicao.blogspot.com/2009/10/ industrializacao-brasileira-6-serie.html Acesso em: 20 fev. 2011.</small> @2 "+
                            "@cimg ch550212 cimg@"+
                            "@1<small>Disponível em: http://www.cccmg.com.br/ Acesso em: 21 fev. 2011.</small> @2 "+
                            "Essa transformação provocou ";
                    qA = "a destruição do ambiente. ";
                    qB = "a queda da produtividade. ";
                    qC = "o desemprego estrutural. ";
                    qD = "o aumento da inflação. ";
                    break;
                case 22:

                    sourceString = "Leia a charge abaixo.@2 "+
                            "@cimg ch550221 cimg@"+
                            "@1<small>Disponível em: http://geoconceicao.blogspot.com/2009/10/industrializacao-brasileira-6-serie.html Acesso em: 20 mar. 2011.</small> @2 "+
                            "Nela está representado um aspecto da intensificação do processo de urbanização. Esse aspecto é: ";
                    qA = "A falta de infraestrutura. ";
                    qB = "A verticalização da cidade. ";
                    qC = "O aquecimento global. ";
                    qD = "O conflito socioeconômico. ";
                    break;
                case 23:

                    sourceString = "A imagem, abaixo, apresenta a comercialização de produtos agrícolas.@2 "+
                            "@cimg ch550231 cimg@"+
                            "@1<small>Disponível em: http://deliciosoanonovo.files.wordpress.com/2009/10/cartilha_ziraldo1.pdf Acesso em: 20 mar. 2011.</small> @2 "+
                            "Esse produtos são obtidos a partir ";
                    qA = "da ocupação de extensas áreas de monocultura de subsistência. ";
                    qB = "da utilização de mecanização intensiva nos latifúndios brasileiros. ";
                    qC = "de métodos que utilizam agrotóxicos no plantio e na colheita. ";
                    qD = "de sistemas agrícolas baseados em processos sustentáveis. ";
                    break;
                case 24:

                    sourceString = "As atuais necessidades energéticas da economia mundial são satisfeitas, majoritariamente, pelo uso "+
                            "de energias não renováveis. Mais precisamente, 90% da energia consumida a nível mundial provêm do "+
                            "consumo de combustíveis fósseis.@1"+
                            "@1Os três principais combustíveis fósseis são o petróleo, o carvão e o ";
                    qA = "álcool. ";
                    qB = "calor da Terra. ";
                    qC = "gás natural. ";
                    qD = "plutônio. ";
                    break;
                case 25:

                    sourceString = "Compare a imagem e o mapa abaixo, que representam os biomas brasileiros.@2 "+
                            "Biomas brasileiros @1"+
                            "@cimg ch550251 cimg@"+
                            "@1<small>Disponível em: http://ced3ambiental.blogspot.com/2010/03/biomasbrasileiros_29.html Acesso em: 22 fev. 2011.</small> @2 "+
                            "Biomas brasileiros @1"+
                            "@cimg ch550252 cimg@ @1"+
                            "1, 2, 3, 4, 5 e 6 - biomas "+
                            "@1<small>Disponível em: http://www.brasil.gov.br/sobre/meioambiente/biomas/biomas Acesso em: 27 fev. 2011.</small> @2 "+
                            "Na imagem não está representado o bioma de número ";
                    qA = "2. ";
                    qB = "4. ";
                    qC = "5. ";
                    qD = "6. ";
                    break;
                case 26:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Atualmente, um dos problemas ambientais mais graves, resultante de um sistema energético "+
                            "que privilegia o uso de fontes de energia não renováveis, é a intensificação do efeito estufa.@1"+
                            "As instalações que utilizam combustíveis fósseis não produzem apenas energia, mas também "+
                            "grandes quantidades de vapor de água e de dióxido de carbono (CO2"+
                            "), gás que é um dos principais "+
                            "responsáveis pela intensificação do efeito estufa do planeta.@1"+
                            "@1<small>Disponível em: http://www.ageneal.pt/content01.asp?BTreeID=00/01&treeID=00/01&newsID=7 Acesso em: 27 mar. 2011. Adaptado.</small> @2 "+
                            "Uma instalação que contribui para a emissão de dióxido de carbono é a usina ";
                    qA = "eólica. ";
                    qB = "hidrelétrica. ";
                    qC = "solar. ";
                    qD = "termelétrica. ";
                    break;
                case 27:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O enorme volume de resíduos sólidos e líquidos gerados diariamente nos centros urbanos tem "+
                            "trazido uma série de problemas ambientais, sociais, econômicos e administrativos, todos ligados "+
                            "à crescente dificuldade de implementar uma disposição adequada desses resíduos. Exemplo "+
                            "disso é o descarte de óleos usados em fritura nas pias e vasos sanitários, ou diretamente na "+
                            "rede de esgotos. Esse procedimento, além de provocar graves problemas ambientais, pode "+
                            "provocar o mau funcionamento das Estações de Tratamento de Águas Residuais e representa "+
                            "um desperdício de uma fonte de energia.@1"+
                            "@1<small>Disponível em: http://www.simpep.feb.unesp.br/anais/anais_13/artigos/434.pdf Acesso em: 25 mar. 2011. Adaptado.</small> @2 "+
                            "O descarte do óleo nos rios provoca a impermeabilização dos leitos e terrenos adjacentes que contribuem "+
                            "para a ocorrência de ";
                    qA = "deslizamentos. ";
                    qB = "enchentes. ";
                    qC = "igarapés. ";
                    qD = "voçorocas. ";
                    break;
                case 28:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Um terremoto de 8,9 na escala Richter atingiu todo o Japão na manhã do dia 11/03/2011, "+
                            "sendo um dos maiores da história do país. O tremor principal aconteceu às 2h46 de Brasília, "+
                            "com epicentro a 130 quilômetros de Sendai, na ilha de Honshu, e com profundidade de 24,4 "+
                            "quilômetros. O tremor ocasionou tsunamis com ondas de até 10 metros que devastou parte da "+
                            "costa norte do Japão.@1"+
                            "@1<small>Disponível em: http://blogs.estadao.com.br/olhar-sobre-o-mundo/terremoto-no-japao/ Acesso em: 15 mar. 2011. Adaptado.</small> @2 "+
                            "Esse terremoto foi provocado ";
                    qA = "pela colisão de geleiras polares. ";
                    qB = "pela explosão de bombas atômicas. ";
                    qC = "pelo choque de placas tectônicas. ";
                    qD = "pelo deslocamento do eixo terrestre. ";
                    break;
                case 29:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@cimg ch550291 cimg@"+
                            "@1<small>Disponível em: http://www.contavel.com/ Acesso em: 28 mar. 2011.</small> @2 "+
                            "Nela está representada uma associação autônoma de pessoas que se unem, voluntariamente, para "+
                            "satisfazer a aspirações e necessidades econômicas, sociais e culturais comuns, por meio de uma empresa "+
                            "de propriedade coletiva e democraticamente gerida.@1"+
                            "@1Essa empresa é uma ";
                    qA = "agroindústria. ";
                    qB = "cooperativa. ";
                    qC = "multinacional. ";
                    qD = "tecelagem. ";
                    break;
                case 30:

                    sourceString = "Observe o quadro, abaixo, da pintora Tarsila do Amaral. Nele está representado um grupo de pessoas que "+
                            "deixa a zona rural em busca de melhores condições de vida na cidade.@1"+
                            "@cimg ch550301 cimg@"+
                            "@1<small>Disponível em: http://www.educarede.org.br/educa/index.cfm?pg=oassuntoe.interna&id_tema=17&id_subtema=1 Acesso em: 30 mar. 2011.</small> @2 "+
                            "A busca de melhores condições de vida na cidade tem como uma de suas causas ";
                    qA = "a concentração fundiária no campo. ";
                    qB = "o intenso processo de urbanização. ";
                    qC = "a produção de etanol para a exportação. ";
                    qD = "o aumento de preço dos produtos agrícolas.  ";
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