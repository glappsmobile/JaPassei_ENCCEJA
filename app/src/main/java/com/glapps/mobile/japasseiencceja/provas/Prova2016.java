package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2016 {

    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS  = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    private static final String A = "A";
    private static final String B = "B";
    private static final String C = "C";
    private static final String D = "D";
    private static final String E = "E";


    String[] gabcn = {
            B,D,B,D,C,D,C,B,A,D,
            A,B,A,B,C,D,C,B,C,B,
            A,B,D,B,A,B,B,A,D,B,
    };

    String[] gabch = {
            A,B,A,B,C,B,A,C,C,C,
            A,C,B,B,A,D,D,C,A,B,
            A,D,A,D,A,D,A,B,D,A,
    };

    String[] gablc = {
            A,D,C,D,D,A,D,C,D,A,
            B,A,B,C,D,D,A,D,D,A,
            D,A,D,C,C,A,A,B,D,B,
    };

    String[] gabmt = {
            B,A,A,D,C,C,D,A,D,C,
            D,C,B,C,A,C,B,A,B,C,
            B,A,B,A,A,A,B,B,C,D,
    };




    String[] materias = {
            LINGUAGENS_CÓDIGOS,
            CHAVE_MATEMATICA,
            CIENCIAS_HUMANAS,
            CIENCIAS_DA_NATUREZA,
    };


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
    String prerequisito;
    String sourceString;
    String sourceString2;
    int countQuestao;
    int especie = 1;
    Spanned sEnunciado;
    Spanned sqA;
    Spanned sqB;
    Spanned sqC;
    Spanned sqD;
    Spanned sqE;
    Spanned sPrerequisito;
    Spanned sResolucao;
    Simulado simulado;
    String texto;
        // SIMULADO 1 - ENSINO MÉDIO
    public Prova2016(Context contexto, Simulado simulado) {
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
        switch (indice){
            case 1:

                texto = "@b Dormir pouco torna o ser humano mais otimista b@ @2" +
                        "Um estudo americano publicado na revista Neuroscience concluiu que as pessoas com falta\n" +
                        "de sono têm tendência a ser exageradamente otimistas antes de tomar decisões e costumam se\n" +
                        "arriscar mais do que outras. [...] @1" +
                        "O estudo examinou 29 adultos voluntários, de ambos os sexos, com boa saúde e com uma\n" +
                        "idade média de 22 anos, a quem foi pedido que tomassem uma série de decisões de caráter\n" +
                        "econômico após uma boa noite de sono. Posteriormente, o mesmo grupo voltou a ser questionado\n" +
                        "depois de uma noite sem dormir. Na pesquisa, foi utilizada a técnica de Imagem por Ressonância\n" +
                        "Magnética (IRM).@1" +
                        "Nas pessoas privadas de sono, os @iscannersi@ mostraram uma atividade mais intensa nas partes\n" +
                        "do cérebro responsáveis pelas expectativas positivas, enquanto apresentaram uma atividade\n" +
                        "pequena nas partes que tratam das expectativas negativas.@1" +
                        "De acordo com o estudo, realizado por pesquisadores da Universidade de Duke, na Carolina\n" +
                        "do Norte, e em Cingapura, os indivíduos privados de sono que participaram da pesquisa tenderam\n" +
                        "a fazer escolhas com mais ênfase nos lucros monetários e menos nas opções que permitem\n" +
                        "reduzir as perdas. [...]@1" +
                        "A pesquisa concluiu que a falta de sono faz com que as pessoas não sejam tão precisas em\n" +
                        "suas avaliações sobre a situação a que são submetidas, tomando decisões bastante arriscadas. @2";

                sourceString = texto+"Qual é o objetivo comunicativo desse texto? ";
                qA = "Divulgar uma pesquisa. ";
                qB = "Fazer uma crítica. ";
                qC = "Promover uma reflexão. ";
                qD = "Transmitir uma orientação. ";

                resolucao = "O texto fala sobre um estudo (uma pesquisa) americano que busca entender o que acontece com pessoas privadas de sono.@1" +
                        "O único objetivo do texto é explicar sobre essa pesquisa, onde foi feita, como foi feita e seus resultados, portanto o objetivo do texto é divulgar uma pesquisa.";
                prerequisito = ""; break;


            case 2:

                texto = "@b Dormir pouco torna o ser humano mais otimista b@ @2" +
                        "Um estudo americano publicado na revista Neuroscience concluiu que as pessoas com falta\n" +
                        "de sono têm tendência a ser exageradamente otimistas antes de tomar decisões e costumam se\n" +
                        "arriscar mais do que outras. [...] @1" +
                        "O estudo examinou 29 adultos voluntários, de ambos os sexos, com boa saúde e com uma\n" +
                        "idade média de 22 anos, a quem foi pedido que tomassem uma série de decisões de caráter\n" +
                        "econômico após uma boa noite de sono. Posteriormente, o mesmo grupo voltou a ser questionado\n" +
                        "depois de uma noite sem dormir. Na pesquisa, foi utilizada a técnica de Imagem por Ressonância\n" +
                        "Magnética (IRM).@1" +
                        "Nas pessoas privadas de sono, os @iscannersi@ mostraram uma atividade mais intensa nas partes\n" +
                        "do cérebro responsáveis pelas expectativas positivas, enquanto apresentaram uma atividade\n" +
                        "pequena nas partes que tratam das expectativas negativas.@1" +
                        "De acordo com o estudo, realizado por pesquisadores da Universidade de Duke, na Carolina\n" +
                        "do Norte, e em Cingapura, os indivíduos privados de sono que participaram da pesquisa tenderam\n" +
                        "a fazer escolhas com mais ênfase nos lucros monetários e menos nas opções que permitem\n" +
                        "reduzir as perdas. [...]@1" +
                        "A pesquisa concluiu que a falta de sono faz com que as pessoas não sejam tão precisas em\n" +
                        "suas avaliações sobre a situação a que são submetidas, tomando decisões bastante arriscadas. @2";

                sourceString = texto+"De acordo com esse texto, as pessoas que dormem pouco ";
                qA = "apresentam uma atividade cerebral intensa diante de situações com projeções negativas. ";
                qB = "encaram os problemas pelo seu lado positivo, esperando por um desfecho favorável. ";
                qC = "possuem uma atividade cerebral mais intensa do que as pessoas que dormem bem. ";
                qD = "tomam decisões mais arriscadas, avaliando as situações de forma superficial. ";

                resolucao = "Essa questão possui algumas pegadinhas para confundir o candidato, então é bom observar minuciosamente as alternativas. @2" +

                        "@b Letra A: b@ @1 " +
                        "No terceiro parágrafo, o texto diz que há uma atividade mais intensa nas partes do cérebro responsáveis pelas expectativas @b positivas b@, " +
                        "portanto a alternativa A está incorreta, pois diz que as atividades são intensas diante de situações com projeções @b negativas b@.@2" +

                        "@b Letra B: b@ @1" +
                        "O texto diz que as partes do cérebro responsáveis pelas expectativas positivas possuem atividades mais intensas, mas não diz que as pessoas olharam " +
                        "pelo lado positivo dos problemas, só disse que as pessoas não tiveram avaliações precisas e focaram nos ganhos monetários ao invés de pensar em diminuir as perdas.@2" +

                        "@b Letra C: b@ @1" +
                        "No terceiro parágrafo, o texto diz que as partes do cérebro responsáveis pelas expectativas positivas são mais intensas que as negativas, mas não " +
                        "diz que as atividades cerebrais de quem não dorme são mais intensas do que das pessoas que dormem bem, consequentemente a alternativa C está incorreta.@2" +

                        "@b Letra D: b@ @1" +
                        "Por último, o texto diz que a falta de sono faz com que as pessoas @b não sejam tão precisas (superficiais) b@ em suas avaliações, @b tomando decisões bastante arriscadas. b@ " +
                        "Essa descrição se encaixa perfeitamente na alternativa D, em vista disso ela está correta.";
                prerequisito = ""; break;
            case 3:

                texto = "@b Dormir pouco torna o ser humano mais otimista b@ @2" +
                        "Um estudo americano publicado na revista Neuroscience concluiu que as pessoas com falta\n" +
                        "de sono têm tendência a ser exageradamente otimistas antes de tomar decisões e costumam se\n" +
                        "arriscar mais do que outras. [...] @1" +
                        "O estudo examinou 29 adultos voluntários, de ambos os sexos, com boa saúde e com uma\n" +
                        "idade média de 22 anos, a quem foi pedido que tomassem uma série de decisões de caráter\n" +
                        "econômico após uma boa noite de sono. Posteriormente, o mesmo grupo voltou a ser questionado\n" +
                        "depois de uma noite sem dormir. Na pesquisa, foi utilizada a técnica de Imagem por Ressonância\n" +
                        "Magnética (IRM).@1" +
                        "Nas pessoas privadas de sono, os @iscannersi@ mostraram uma atividade mais intensa nas partes\n" +
                        "do cérebro responsáveis pelas expectativas positivas, enquanto apresentaram uma atividade\n" +
                        "pequena nas partes que tratam das expectativas negativas.@1" +
                        "De acordo com o estudo, realizado por pesquisadores da Universidade de Duke, na Carolina\n" +
                        "do Norte, e em Cingapura, os indivíduos privados de sono que participaram da pesquisa tenderam\n" +
                        "a fazer escolhas com mais ênfase nos lucros monetários e menos nas opções que permitem\n" +
                        "reduzir as perdas. [...]@1" +
                        "A pesquisa concluiu que a falta de sono faz com que as pessoas não sejam tão precisas em\n" +
                        "suas avaliações sobre a situação a que são submetidas, tomando decisões bastante arriscadas. @2";

                sourceString = texto+"No fragmento “... têm tendência a ser @bexageradamenteb@ otimistas...”, o uso do advérbio em destaque sugere ";
                qA = "crítica. ";
                qB = "dúvida. ";
                qC = "excesso. ";
                qD = "ironia. ";
                resolucao = "Uma pessoa @b exageradamente otimista b@ é uma pessoa @b otimista demais, otimista em excesso b@.";
                prerequisito = ""; break;
            case 4:

                texto = "@b Dormir pouco torna o ser humano mais otimista b@ @2" +
                        "Um estudo americano publicado na revista Neuroscience concluiu que as pessoas com falta\n" +
                        "de sono têm tendência a ser exageradamente otimistas antes de tomar decisões e costumam se\n" +
                        "arriscar mais do que outras. [...] @1" +
                        "O estudo examinou 29 adultos voluntários, de ambos os sexos, com boa saúde e com uma\n" +
                        "idade média de 22 anos, a quem foi pedido que tomassem uma série de decisões de caráter\n" +
                        "econômico após uma boa noite de sono. Posteriormente, o mesmo grupo voltou a ser questionado\n" +
                        "depois de uma noite sem dormir. Na pesquisa, foi utilizada a técnica de Imagem por Ressonância\n" +
                        "Magnética (IRM).@1" +
                        "Nas pessoas privadas de sono, os @iscannersi@ mostraram uma atividade mais intensa nas partes\n" +
                        "do cérebro responsáveis pelas expectativas positivas, enquanto apresentaram uma atividade\n" +
                        "pequena nas partes que tratam das expectativas negativas.@1" +
                        "De acordo com o estudo, realizado por pesquisadores da Universidade de Duke, na Carolina\n" +
                        "do Norte, e em Cingapura, os indivíduos privados de sono que participaram da pesquisa tenderam\n" +
                        "a fazer escolhas com mais ênfase nos lucros monetários e menos nas opções que permitem\n" +
                        "reduzir as perdas. [...]@1" +
                        "A pesquisa concluiu que a falta de sono faz com que as pessoas não sejam tão precisas em\n" +
                        "suas avaliações sobre a situação a que são submetidas, tomando decisões bastante arriscadas. @2";

                sourceString = texto+"O advérbio em destaque no trecho “@bPosteriormenteb@, o mesmo grupo voltou a ser questionado...” exprime "+
                        "uma circunstância de ";
                qA = "afirmação. ";
                qB = "intensidade. ";
                qC = "modo. ";
                qD = "tempo. ";
                resolucao = "@b Posteriormente b@ significa @b depois b@, indica que algo aconteceu ou acontecerá num @b tempo b@ posterior a uma referência, portanto esse " +
                        "advérbio exprime uma circunstância de tempo.";
                prerequisito = ""; break;
            case 5:

                texto = "@b Dormir pouco torna o ser humano mais otimista b@ @2" +
                        "Um estudo americano publicado na revista Neuroscience concluiu que as pessoas com falta\n" +
                        "de sono têm tendência a ser exageradamente otimistas antes de tomar decisões e costumam se\n" +
                        "arriscar mais do que outras. [...] @1" +
                        "O estudo examinou 29 adultos voluntários, de ambos os sexos, com boa saúde e com uma\n" +
                        "idade média de 22 anos, a quem foi pedido que tomassem uma série de decisões de caráter\n" +
                        "econômico após uma boa noite de sono. Posteriormente, o mesmo grupo voltou a ser questionado\n" +
                        "depois de uma noite sem dormir. Na pesquisa, foi utilizada a técnica de Imagem por Ressonância\n" +
                        "Magnética (IRM).@1" +
                        "Nas pessoas privadas de sono, os @iscannersi@ mostraram uma atividade mais intensa nas partes\n" +
                        "do cérebro responsáveis pelas expectativas positivas, enquanto apresentaram uma atividade\n" +
                        "pequena nas partes que tratam das expectativas negativas.@1" +
                        "De acordo com o estudo, realizado por pesquisadores da Universidade de Duke, na Carolina\n" +
                        "do Norte, e em Cingapura, os indivíduos privados de sono que participaram da pesquisa tenderam\n" +
                        "a fazer escolhas com mais ênfase nos lucros monetários e menos nas opções que permitem\n" +
                        "reduzir as perdas. [...]@1" +
                        "A pesquisa concluiu que a falta de sono faz com que as pessoas não sejam tão precisas em\n" +
                        "suas avaliações sobre a situação a que são submetidas, tomando decisões bastante arriscadas. @2";

                sourceString = texto+"Nesse texto, a palavra “scanners” está escrita de forma diferente por ser ";
                qA = "um neologismo. ";
                qB = "um termo regional. ";
                qC = "uma expressão de gíria. ";
                qD = "uma palavra estrangeira. ";
                resolucao = "Palavras extrangeiras e nomes científicos possuem uma diferênciação na escrita, quando são escritas a mão, devem ser escritas entre aspas (\")," +
                        "quando digitadas, podem ser escritas entre aspas ou em itálico (@i letras tombadas para a direita i@), por este motivo \"scanners\" está escrito de forma diferente, por ser uma palavra estrangeira."; prerequisito = ""; break;

            case 6:
                texto = "@b Cores nas lagoas b@ @2"+
                        "O listrado multicor que se desenha na areia quando o nível da água baixa nas lagoas do "+
                        "Pantanal da Nhecolândia, conhecidas como salinas, em Mato Grosso do Sul, por muito tempo foi "+
                        "um mistério para observadores. A explicação está na cianobactéria Anabaenopsis elenkinii, um "+
                        "dos poucos organismos que sobrevivem nas condições inóspitas dessas águas muito alcalinas, "+
                        "de pH entre 9 e 11. De acordo com o Núcleo de Pesquisa em Ficologia do Instituto de Botânica, "+
                        "na época seca essas bactérias se reproduzem em profusão e pintam as lagoas com substâncias "+
                        "de sua própria decomposição.@1"+
                        "@1<small>Disponível em: http://revistapesquisa.fapesp.br/212/1/18/cores-nas-lagoas/. Acesso em: 28 fev. 212. (P126SU12.1_SUP)</small> @2 ";
                sourceString = texto+"O pronome possessivo em destaque no trecho “... de @b sua b@ própria decomposição.” refere-se à palavra ";
                qA = "bactérias. ";
                qB = "decomposição. ";
                qC = "lagoas. ";
                qD = "substâncias. ";
                resolucao = "\"De acordo com o Núcleo de Pesquisa em Ficologia do Instituto de Botânica, "+
                        "na época seca essas @b bactérias b@ se reproduzem em profusão e pintam as lagoas com substâncias "+
                        "de @b sua b@ própria decomposição.\" @2" +
                        "" +
                        "Nesse tipo de questão, é aconselhável voltar ao texto e reler o parágrafo no qual o trecho está inserido. @2" +
                        "O pronome \"sua\" está se referindo a um substântivo anteriormente citado, portanto isso pode causar dúvidas, já que diversos substântivos foram citados. @2" +
                        "Mas perceba, \"sua decomposição\": @2" +
                        "" +
                        "- A lagoa não se decompoem, consequentemente o pronome não se refere a ela.@1" +
                        "- As substâncias são quem pintam as lagoas, e as substâncias vieram através da decomposição, em vista disso o pronome não se refere a elas. @1" +
                        "- As bactérias, sim, se decompoem e liberam as substâncias que pintam a lagoa, além do mais, \"bactérias\" é o substântivo principal do parágrafo, por isto \"bactérias\" é a quem o pronome \"sua\" se refere." +
                        "";
                prerequisito = ""; break;
            case 7:

                texto = "@b Cores nas lagoas b@ @2"+
                        "O listrado multicor que se desenha na areia quando o nível da água baixa nas lagoas do "+
                        "Pantanal da Nhecolândia, conhecidas como salinas, em Mato Grosso do Sul, por muito tempo foi "+
                        "um mistério para observadores. A explicação está na cianobactéria Anabaenopsis elenkinii, um "+
                        "dos poucos organismos que sobrevivem nas condições inóspitas dessas águas muito alcalinas, "+
                        "de pH entre 9 e 11. De acordo com o Núcleo de Pesquisa em Ficologia do Instituto de Botânica, "+
                        "na época seca essas bactérias se reproduzem em profusão e pintam as lagoas com substâncias "+
                        "de sua própria decomposição.@1"+
                        "@1<small>Disponível em: http://revistapesquisa.fapesp.br/212/1/18/cores-nas-lagoas/. Acesso em: 28 fev. 212. (P126SU12.1_SUP)</small> @2 ";
                sourceString = texto+"Segundo esse texto, as cianobactérias pintam as lagoas devido ";
                qA = "à diminuição do nível da água dos rios. ";
                qB = "à incidência de períodos de seca. ";
                qC = "às condições árduas de sua sobrevivência. ";
                qD = "às substâncias de sua decomposição. ";
                resolucao = "No último parágrafo o texto deixa bem claro que as bactérias @bpintam as lagoas com substâncias de sua própria deomposiçãob@, " +
                        "portato se não houvessem essas substâncias de sua decomposição, essas bactérias não poderiam pintar as lagoas.";
                prerequisito = ""; break;

            case 8:
                texto = "@img lc510081 img@ @1";
                sourceString = texto+"No primeiro quadrinho desse texto, a fala do menino indica ";
            qA = "alegria. ";
            qB = "desânimo. ";
            qC = "medo. ";
            qD = "surpresa. ";
            resolucao = "Morrer remete um sentimento ruim nas pessoas, já o uso de palavras com todas as letras maíusculas representam uma elevação da voz, desespero, " +
                    "portanto esses elementos indicam que o menino estava com medo de morrer." +
                    "";
                prerequisito = ""; break;

            case 9:
            texto = "@img lc510091 img@ @2";
            sourceString = texto+"O humor desse texto está no fato de o menino ";
            qA = "ser consolado pela mãe. ";
            qB = "medir a febre com um termômetro na boca. ";
            qC = "estar com sarampo. ";
            qD = "acreditar que a injeção irá matá-lo. ";
            resolucao = "No segundo quadrinho, a mãe do menino diz que o sarampo não irá matá-lo, já o terceiro quadrinho deixa em destaque um homem segurando uma seringa enorme e o " +
                    "menino olha ele e diz que não é o sarampo que irá matá-lo, isso sugere que ele acha que a injeção enorme que irá fazer isso.";
                prerequisito = ""; break;


            case 10:
                texto = "@b Por que quando olhamos para o céu vemos umas paradas bizarras, que parecem vermes "+
                        "transparentes, voando em todas as direções? b@ @2"+
                        "Esses vermes existem e estão realmente boiando dentro do seu olho. Mas pode ficar tranquilo.@1"+
                        "Eles não são vermes e, sim, corpos fibrosos presentes na substância gelatinosa entre a retina "+
                        "e o cristalino. Conforme a mudança da pressão dentro do olho, os corpos se aglutinam e ficam "+
                        "mais evidentes. Transformam-se então em “moscas volantes”, fiozinhos que flutuam e lançam "+
                        "sombras na retina. Tem gente que vê bolinhas, teias de aranha, pelos – ou vermes psicodélicos.@1"+
                        "Você tenta focar em um deles, mas saem correndo antes que você consiga identificá-los. Dá para "+
                        "vê-los melhor quando olhamos para superfícies planas, iluminadas e de uma única cor.@1"+
                        "As moscas volantes são mais comuns em pessoas míopes, diabéticas e que já fizeram "+
                        "cirurgias oculares e não representam perigo para a saúde. A não ser que aumentem de uma hora "+
                        "para outra ou venham com flashes de luz e perda da visão periférica – sinais do deslocamento da "+
                        "retina, que pode levar à cegueira. Em casos extremos, você pode se submeter a uma vitrectomia, "+
                        "cirurgia em que o gel vítreo é substituído por uma substância líquida e salina.@1"+
                        "@1 <small> Superinteressante, Edição especial, jan. 212, p. 6. (P128SU12.1_SUP) </small> @2";
                sourceString = texto+"O uso dos pronomes em destaque nos trechos “... dentro do @bseub@ olho.” e “@bVocêb@ tenta focar...” pretende ";
                qA = "aproximar o autor e o leitor. ";
                qB = "direcionar o leitor. ";
                qC = "neutralizar a forma de tratamento. ";
                qD = "transmitir credibilidade. ";

                resolucao = "O uso da segunda pessoa do singular em textos, geralmente servem para aproximar o autor e o leitor, pois quem lê o texto, tem a impressão que o autor " +
                        "está falando com ele. @1" +
                        "@b Por exemplo:b@ @1" +
                        "\"Quando você lê um texto que usa a segunda pessoa do singular, tem a impressão que o autor estará falando com você...\"@2" +
                        "Além do mais, o assunto que o texto aborda, acontece com todas as pessoas, então o leitor se identifica com isso e o autor usa a segunda pessoa do singular " +
                        "para aproximá-lo ainda mais.";
                prerequisito = ""; break;
            case 11:

                texto = "@b Por que quando olhamos para o céu vemos umas paradas bizarras, que parecem vermes "+
                        "transparentes, voando em todas as direções? b@ @2"+
                        "Esses vermes existem e estão realmente boiando dentro do seu olho. Mas pode ficar tranquilo.@1"+
                        "Eles não são vermes e, sim, corpos fibrosos presentes na substância gelatinosa entre a retina "+
                        "e o cristalino. Conforme a mudança da pressão dentro do olho, os corpos se aglutinam e ficam "+
                        "mais evidentes. Transformam-se então em “moscas volantes”, fiozinhos que flutuam e lançam "+
                        "sombras na retina. Tem gente que vê bolinhas, teias de aranha, pelos – ou vermes psicodélicos.@1"+
                        "Você tenta focar em um deles, mas saem correndo antes que você consiga identificá-los. Dá para "+
                        "vê-los melhor quando olhamos para superfícies planas, iluminadas e de uma única cor.@1"+
                        "As moscas volantes são mais comuns em pessoas míopes, diabéticas e que já fizeram "+
                        "cirurgias oculares e não representam perigo para a saúde. A não ser que aumentem de uma hora "+
                        "para outra ou venham com flashes de luz e perda da visão periférica – sinais do deslocamento da "+
                        "retina, que pode levar à cegueira. Em casos extremos, você pode se submeter a uma vitrectomia, "+
                        "cirurgia em que o gel vítreo é substituído por uma substância líquida e salina.@1"+
                        "@1 <small> Superinteressante, Edição especial, jan. 212, p. 6. (P128SU12.1_SUP) </small> @2";
                sourceString = texto+"Nesse texto, a expressão em destaque no trecho “... vemos umas @bparadas bizarrasb@,...” quer dizer o "+
                        "mesmo que ";
                qA = "algo assustador. ";
                qB = "coisas estranhas. ";
                qC = "eventos misteriosos. ";
                qD = "objetos feios. ";

                resolucao = "\"Paradas bizarras\" é uma expressão coloquial, se você trocar \"paradas\" por \"coisas\" a expressão terá o mesmo sentido, \"coisas bizarras\". @1" +
                        "\"Bizarro\" é algo diferente, estranho, pode ser feio ou bonito, misterioso ou não, assustador ou não, então podemos substituir as palavras e formar \"coisas estranhas\" e ainda assim prezervar o sentido da expressão.";
                prerequisito = ""; break;
            case 12:

                texto = "@b Por que quando olhamos para o céu vemos umas paradas bizarras, que parecem vermes "+
                        "transparentes, voando em todas as direções? b@ @2"+
                        "Esses vermes existem e estão realmente boiando dentro do seu olho. Mas pode ficar tranquilo.@1"+
                        "Eles não são vermes e, sim, corpos fibrosos presentes na substância gelatinosa entre a retina "+
                        "e o cristalino. Conforme a mudança da pressão dentro do olho, os corpos se aglutinam e ficam "+
                        "mais evidentes. Transformam-se então em “moscas volantes”, fiozinhos que flutuam e lançam "+
                        "sombras na retina. Tem gente que vê bolinhas, teias de aranha, pelos – ou vermes psicodélicos.@1"+
                        "Você tenta focar em um deles, mas saem correndo antes que você consiga identificá-los. Dá para "+
                        "vê-los melhor quando olhamos para superfícies planas, iluminadas e de uma única cor.@1"+
                        "As moscas volantes são mais comuns em pessoas míopes, diabéticas e que já fizeram "+
                        "cirurgias oculares e não representam perigo para a saúde. A não ser que aumentem de uma hora "+
                        "para outra ou venham com flashes de luz e perda da visão periférica – sinais do deslocamento da "+
                        "retina, que pode levar à cegueira. Em casos extremos, você pode se submeter a uma vitrectomia, "+
                        "cirurgia em que o gel vítreo é substituído por uma substância líquida e salina.@1"+
                        "@1 <small> Superinteressante, Edição especial, jan. 212, p. 6. (P128SU12.1_SUP) </small> @2";
                sourceString = texto+"No trecho “Transformam-se então em @b‘moscas volantes’b@,...”, as aspas foram usadas para ";
                qA = "apontar o sentido figurado da expressão. ";
                qB = "destacar uma citação do autor. ";
                qC = "enfatizar uma fala reproduzida no texto. ";
                qD = "intensificar a ideia de movimento. ";
                resolucao = "Sentido figurado é um segundo sentido para uma palavra/expressão, que não é o sentido principal que essa palavra/expressão tem. @2" +
                        "@b Por exemplo: b@ @1" +
                        "\"Acertou na mosca\"@2" +
                        "Acertar na mosca, não significa que uma mosca foi atingida, mas significa que a pessoa acertou algo que é difícil de acertar, \"algo difícil de acertar\" " +
                        "é um sentido figurado de \"mosca\". Mas quando vamos utilizar esses sentidos figurados em textos que não possui a linguagem coloquial como principal linguagem, " +
                        "devemos utilizar os aspas para mostrar ao leitor que a palavra/expressão está no sentido figurado, isso impede que as pessoas se confundam ao ler os textos.";
                prerequisito = ""; break;
            case 13:

                texto = "@b Por que quando olhamos para o céu vemos umas paradas bizarras, que parecem vermes "+
                        "transparentes, voando em todas as direções? b@ @2"+
                        "Esses vermes existem e estão realmente boiando dentro do seu olho. Mas pode ficar tranquilo.@1"+
                        "Eles não são vermes e, sim, corpos fibrosos presentes na substância gelatinosa entre a retina "+
                        "e o cristalino. Conforme a mudança da pressão dentro do olho, os corpos se aglutinam e ficam "+
                        "mais evidentes. Transformam-se então em “moscas volantes”, fiozinhos que flutuam e lançam "+
                        "sombras na retina. Tem gente que vê bolinhas, teias de aranha, pelos – ou vermes psicodélicos.@1"+
                        "Você tenta focar em um deles, mas saem correndo antes que você consiga identificá-los. Dá para "+
                        "vê-los melhor quando olhamos para superfícies planas, iluminadas e de uma única cor.@1"+
                        "As moscas volantes são mais comuns em pessoas míopes, diabéticas e que já fizeram "+
                        "cirurgias oculares e não representam perigo para a saúde. A não ser que aumentem de uma hora "+
                        "para outra ou venham com flashes de luz e perda da visão periférica – sinais do deslocamento da "+
                        "retina, que pode levar à cegueira. Em casos extremos, você pode se submeter a uma vitrectomia, "+
                        "cirurgia em que o gel vítreo é substituído por uma substância líquida e salina.@1"+
                        "@1 <small> Superinteressante, Edição especial, jan. 212, p. 6. (P128SU12.1_SUP) </small> @2";
                sourceString = texto+"No trecho “Tem @bgenteb@ que vê bolinhas, teias de aranha,...”, a palavra em destaque é um exemplo de linguagem ";
                qA = "científica. ";
                qB = "informal. ";
                qC = "padrão. ";
                qD = "regional. ";
                resolucao = "O termo \"gente\" (quando utilizado para substituir a terceira pessoa do plural) é um termo informal que significa \"nós\". @1" +
                        "Todavia tome cuidado. O verbo que acompanha \"gente\" fica no singular, enquanto o verbo que acompanha \"nós\" fica no plural. @2" +
                        "" +
                        "@b Exemplo: b@ @1" +
                        "\"A gente já @b foi b@ lá.\" @1" +
                        "\"Nós já @b fomos b@ lá.\""; prerequisito = ""; break;
            case 14:

                texto = "@b Por que quando olhamos para o céu vemos umas paradas bizarras, que parecem vermes "+
                        "transparentes, voando em todas as direções? b@ @2"+
                        "Esses vermes existem e estão realmente boiando dentro do seu olho. Mas pode ficar tranquilo.@1"+
                        "Eles não são vermes e, sim, corpos fibrosos presentes na substância gelatinosa entre a retina "+
                        "e o cristalino. Conforme a mudança da pressão dentro do olho, os corpos se aglutinam e ficam "+
                        "mais evidentes. Transformam-se então em “moscas volantes”, fiozinhos que flutuam e lançam "+
                        "sombras na retina. Tem gente que vê bolinhas, teias de aranha, pelos – ou vermes psicodélicos.@1"+
                        "Você tenta focar em um deles, mas saem correndo antes que você consiga identificá-los. Dá para "+
                        "vê-los melhor quando olhamos para superfícies planas, iluminadas e de uma única cor.@1"+
                        "As moscas volantes são mais comuns em pessoas míopes, diabéticas e que já fizeram "+
                        "cirurgias oculares e não representam perigo para a saúde. A não ser que aumentem de uma hora "+
                        "para outra ou venham com flashes de luz e perda da visão periférica – sinais do deslocamento da "+
                        "retina, que pode levar à cegueira. Em casos extremos, você pode se submeter a uma vitrectomia, "+
                        "cirurgia em que o gel vítreo é substituído por uma substância líquida e salina.@1"+
                        "@1 <small> Superinteressante, Edição especial, jan. 212, p. 6. (P128SU12.1_SUP) </small> @2";
                sourceString = texto+"No fragmento “@bA não ser queb@ aumentem de uma hora para outra...”, a expressão em destaque exprime "+
                        "uma ideia de ";
                qA = "acréscimo. ";
                qB = "comparação. ";
                qC = "exceção. ";
                qD = "explicação. ";
                resolucao = "\"A não ser que\" exprime uma ideia de exceção, veja só:@2" +
                        "" +
                        "\"As moscas volantes não representam perigo para a saúde, @b a não ser que b@ aumentem de uma hora para outra.\" @2" +
                        "\"As moscas volantes não representam perigo para a saúde, @b exceto que b@ aumentem de uma hora para outra.\" @2" +
                        "" +
                        "A frase continua com o mesmo sentido, já que \"a não ser que\" e \"exceto que\" indicam excessão."; prerequisito = ""; break;

            case 15:
                texto = "@b Xingu b@ @2"+
                        "Ao sair da sala de cinema, a primeira coisa que me veio à mente foi: “Realmente é uma história "+
                        "que precisava ser contada”. Mais um pouco foi acrescentado na minha autovisão como brasileiro "+
                        "e no meu entendimento de como a história se desdobrou, de fato, fora dos livros escolares.@1"+
                        "Como todo filme deve ser, fui levado para uma breve viagem que nos apresenta os irmãos "+
                        "Villas-Bôas: Cláudio, Orlando e Leonardo. O desejo de ação e aventura ao entrarem para a "+
                        "expedição de exploração do interior do país acabou por levá-los a uma dura vida, emaranhada "+
                        "por intrigas políticas e abnegação em favor dos índios, mas que acabou por culminar em uma "+
                        "vitória irrevogável: a criação do Parque Nacional do Xingu.@1"+
                        "Cao Hamburguer (O ano em que meus pais saíram de férias) percebeu esse peso dramático, "+
                        "importante para a história, ao afastar as suas lentes de um possível filme-documentário. Sua "+
                        "câmera procura as expressões, os sentimentos. Xingu é um filme sobre pessoas, sobre histórias "+
                        "que se entrelaçam e ajudam juntas a contar a história do nosso país. [...] "+
                        "A produção como um todo agrada. E muito. As locações, fotografia, trilha... Tudo parece "+
                        "cooperar para que a bela história seja contada. [...] Muitas armadilhas foram evitadas, e uma "+
                        "história que se estende por anos foi contada com uma concisão ímpar.@1"+
                        "Enfim, é um filme que vale a pena ser conferido. [...] "+
                        "@2<small>FERREIRA, Rodrigo. Disponível em: http://www.kritz.com.br/filme/xingu/. Acesso em: 7 maio 212. Fragmento. (P1213SU12.1)</small> @2 ";
                sourceString = texto+"Esse texto pode ser classificado como ";
                qA = "crônica. ";
                qB = "reportagem. ";
                qC = "relato. ";
                qD = "resenha. ";
                resolucao = "Resenha é quando você dá sua opinião sobre algo, dando detalhes sobre o assunto, resenha também é um texto que serve para apresentar outro, que seja desconhecido do leitor.@2" +
                        " Nesse caso, o autor está dando a opnião dele sobre o filme Xingu, descrevendo o que foi relevante para ele e esse é o foco principal, portanto esse texto é uma resenha."; prerequisito = ""; break;
            case 16:

                texto = "@b Xingu b@ @2"+
                        "Ao sair da sala de cinema, a primeira coisa que me veio à mente foi: “Realmente é uma história "+
                        "que precisava ser contada”. Mais um pouco foi acrescentado na minha autovisão como brasileiro "+
                        "e no meu entendimento de como a história se desdobrou, de fato, fora dos livros escolares.@1"+
                        "Como todo filme deve ser, fui levado para uma breve viagem que nos apresenta os irmãos "+
                        "Villas-Bôas: Cláudio, Orlando e Leonardo. O desejo de ação e aventura ao entrarem para a "+
                        "expedição de exploração do interior do país acabou por levá-los a uma dura vida, emaranhada "+
                        "por intrigas políticas e abnegação em favor dos índios, mas que acabou por culminar em uma "+
                        "vitória irrevogável: a criação do Parque Nacional do Xingu.@1"+
                        "Cao Hamburguer (O ano em que meus pais saíram de férias) percebeu esse peso dramático, "+
                        "importante para a história, ao afastar as suas lentes de um possível filme-documentário. Sua "+
                        "câmera procura as expressões, os sentimentos. Xingu é um filme sobre pessoas, sobre histórias "+
                        "que se entrelaçam e ajudam juntas a contar a história do nosso país. [...] "+
                        "A produção como um todo agrada. E muito. As locações, fotografia, trilha... Tudo parece "+
                        "cooperar para que a bela história seja contada. [...] Muitas armadilhas foram evitadas, e uma "+
                        "história que se estende por anos foi contada com uma concisão ímpar.@1"+
                        "Enfim, é um filme que vale a pena ser conferido. [...] "+
                        "@2<small>FERREIRA, Rodrigo. Disponível em: http://www.kritz.com.br/filme/xingu/. Acesso em: 7 maio 212. Fragmento. (P1213SU12.1)</small> @2 ";
                sourceString = texto+"O trecho desse texto que apresenta uma opinião sobre o filme Xingu é: ";
                qA = "“... fui levado para uma breve viagem que nos apresenta os irmãos Villas-Bôas:...”. ";
                qB = "“O desejo de ação e aventura ao entrarem para a expedição de exploração...”. ";
                qC = "“... ao afastar as suas lentes de um possível filme-documentário.”. ";
                qD = "“... uma história que se estende por anos foi contada com uma concisão ímpar.”. ";

                resolucao = "Ao dizer “... uma história que se estende por anos foi contada com uma concisão ímpar.”, o autor quer expressar que " +
                        "o filme conseguiu resumir, com consisão, uma história que durou anos, então ele está dando sua opinião sobre o filme nessa frase.";
                prerequisito = ""; break;
            case 17:
                texto = "@b Xingu b@ @2"+
                        "Ao sair da sala de cinema, a primeira coisa que me veio à mente foi: “Realmente é uma história "+
                        "que precisava ser contada”. Mais um pouco foi acrescentado na minha autovisão como brasileiro "+
                        "e no meu entendimento de como a história se desdobrou, de fato, fora dos livros escolares.@1"+
                        "Como todo filme deve ser, fui levado para uma breve viagem que nos apresenta os irmãos "+
                        "Villas-Bôas: Cláudio, Orlando e Leonardo. O desejo de ação e aventura ao entrarem para a "+
                        "expedição de exploração do interior do país acabou por levá-los a uma dura vida, emaranhada "+
                        "por intrigas políticas e abnegação em favor dos índios, mas que acabou por culminar em uma "+
                        "vitória irrevogável: a criação do Parque Nacional do Xingu.@1"+
                        "Cao Hamburguer (O ano em que meus pais saíram de férias) percebeu esse peso dramático, "+
                        "importante para a história, ao afastar as suas lentes de um possível filme-documentário. Sua "+
                        "câmera procura as expressões, os sentimentos. Xingu é um filme sobre pessoas, sobre histórias "+
                        "que se entrelaçam e ajudam juntas a contar a história do nosso país. [...] "+
                        "A produção como um todo agrada. E muito. As locações, fotografia, trilha... Tudo parece "+
                        "cooperar para que a bela história seja contada. [...] Muitas armadilhas foram evitadas, e uma "+
                        "história que se estende por anos foi contada com uma concisão ímpar.@1"+
                        "Enfim, é um filme que vale a pena ser conferido. [...] "+
                        "@2<small>FERREIRA, Rodrigo. Disponível em: http://www.kritz.com.br/filme/xingu/. Acesso em: 7 maio 212. Fragmento. (P1213SU12.1)</small> @2 ";
                sourceString = texto+"No penúltimo parágrafo desse texto, a tipologia textual predominante é a ";
            qA = "argumentativa. ";
            qB = "descritiva. ";
            qC = "injuntiva. ";
            qD = "narrativa. ";

            resolucao = "@b Tipologias: b@ @2" +
                    "" +
                    "@b Argumentativa: b@ Predomínio do uso de argumentos, visando o convencimento, à adesão do leitor.@2" +
                    "@b Descritiva: b@  Envolve a descrição de algo, seja de um objeto, pessoa, animal, lugar, acontecimento, e sua intenção é, sobretudo, transmitir para o leitor as impressões e as qualidades de algo. @1" +
                    "Em outras palavras, o texto descritivo capta as impressões, de forma a representar a elaboração de um retrato, como uma fotografia revelada por meio das palavras.@2" +
                    "@b Injuntiva: b@ Indica o procedimento para realizar algo, por exemplo, uma receita de bolo, bula de remédio, manual de instruções, editais e propagandas. @2" +
                    "@b Narrativa: b@ Relatar fatos e acontecimentos, reais ou fictícios, vividos por indivíduos, envolvendo ação e movimento. @2" +
                    "" +
                    "Neste caso, por ser uma resenha, a tipologia textual é a descritiva.";
                prerequisito = ""; break;
            case 18:
                texto = "@b Xingu b@ @2"+
                        "Ao sair da sala de cinema, a primeira coisa que me veio à mente foi: “Realmente é uma história "+
                        "que precisava ser contada”. Mais um pouco foi acrescentado na minha autovisão como brasileiro "+
                        "e no meu entendimento de como a história se desdobrou, de fato, fora dos livros escolares.@1"+
                        "Como todo filme deve ser, fui levado para uma breve viagem que nos apresenta os irmãos "+
                        "Villas-Bôas: Cláudio, Orlando e Leonardo. O desejo de ação e aventura ao entrarem para a "+
                        "expedição de exploração do interior do país acabou por levá-los a uma dura vida, emaranhada "+
                        "por intrigas políticas e abnegação em favor dos índios, mas que acabou por culminar em uma "+
                        "vitória irrevogável: a criação do Parque Nacional do Xingu.@1"+
                        "Cao Hamburguer (O ano em que meus pais saíram de férias) percebeu esse peso dramático, "+
                        "importante para a história, ao afastar as suas lentes de um possível filme-documentário. Sua "+
                        "câmera procura as expressões, os sentimentos. Xingu é um filme sobre pessoas, sobre histórias "+
                        "que se entrelaçam e ajudam juntas a contar a história do nosso país. [...] "+
                        "A produção como um todo agrada. E muito. As locações, fotografia, trilha... Tudo parece "+
                        "cooperar para que a bela história seja contada. [...] Muitas armadilhas foram evitadas, e uma "+
                        "história que se estende por anos foi contada com uma concisão ímpar.@1"+
                        "Enfim, é um filme que vale a pena ser conferido. [...] "+
                        "@2<small>FERREIRA, Rodrigo. Disponível em: http://www.kritz.com.br/filme/xingu/. Acesso em: 7 maio 212. Fragmento. (P1213SU12.1)</small> @2 ";
                sourceString = texto+"No trecho “Cao Hamburguer (O ano em que meus pais saíram de férias)...”, os parênteses foram utilizados "+
                    "para inserir uma ";
            qA = "citação. ";
            qB = "descrição. ";
            qC = "fala. ";
            qD = "informação. ";
            resolucao = "Os parênteses foram utilizados para inserir uma informação. Cao Hamburguer dirigiu o filme \"O ano em que meus pais saíram de férias\" " +
                    ", então o autor do texto inseriu esta informação entre parênteses para que, se o leitor não conhecesse o diretor, o identificasse pelo nome do filme que ele dirigiu."; prerequisito = ""; break;

            case 19:
                texto = "@img lc510191 img@ @1";
                sourceString = texto+"No último quadrinho, o gato está ";
            qA = "consolando o homem. ";
            qB = "elogiando o homem. ";
            qC = "invejando o homem. ";
            qD = "ironizando o homem. ";
            resolucao = "Quando o gato pensa \"É o fim do mundo como o conhecemos\" ele está sendo irônico, sendo assim, ele está ironizando o homem.";
                prerequisito = ""; break;
            case 20:
                texto = "@img lc510201 img@ @1";
                sourceString = texto+"No último quadrinho, a grafia da palavra “ENCOOOONTRO” indica ";
            qA = "euforia. ";
            qB = "medo. ";
            qC = "raiva. ";
            qD = "surpresa. ";
            resolucao = "O homem ficou feliz exageradamente quando a pessoa com que ele falava no telefone confirmou o que ele perguntou, e euforia significa entusiasmo, alegria exagerada e geralmente repentina." +
                    "Palavras em caixa alta (letra maiúsculas) como \"ENCOOOONTRO\" indica uma exaltação, neste caso indica ele ficou muito feliz repentinamente, ou seja, ele ficou eufórico.";
                prerequisito = ""; break;


            case 21:
                texto = "@b Texto 1 b@ @2"+
                        "Deus e eu no sertão @1"+
                        "Nunca vi ninguém @1"+
                        "Viver tão feliz @1"+
                        "Como eu no sertão @2"+
                        "Perto de uma mata @1"+
                        "E de um ribeirão @1"+
                        "Deus e eu no sertão @2"+
                        "Casa simplesinha @1"+
                        "Rede pra dormir @1"+
                        "De noite um show no céu @1"+
                        "Deito pra assistir [...]@2 "+
                        "Trabalho cantando @1"+
                        "A terra é a inspiração @1"+
                        "Deus e eu no sertão [... ] @2"+
                        "De volta pra casa @1"+
                        "Queima a lenha no fogão @1"+
                        "E junto ao som da mata @1"+
                        "Vou eu e um violão [...] "+
                        "@2<small>CHAVES, Victor. Intérpretes: Victor & Leo. Disponível em: http://letras.terra.com.br/victor-leo/79738/. Acesso em: 28"+
                        "mar. 212. Fragmento.</small> @2 " +

                        "@b Texto 2 b@ @2"+

                        "Quem deixa o trato pastoril, amado, @1"+
                        "Pela ingrata, civil correspondência @1"+
                        "Ou desconhece o rosto da violência, @1"+
                        "Ou do retiro a paz não tem provado.@2"+

                        "Que bem é ver nos campos, trasladado @1"+
                        "No gênio do Pastor, o da inocência! @1"+
                        "E que mal é no trato, e na aparência @1"+
                        "Ver sempre o cortesão dissimulado.@2"+

                        "Ali respira Amor sinceridade; @1"+
                        "Aqui sempre a traição seu rosto encobre; @1"+
                        "Um só trata a mentira, outro a verdade.@2"+

                        "Ali não há fortuna que soçobre; @1"+
                        "Aqui quanto se observa é variedade:@1"+
                        "Oh! ventura do rico! Oh! bem do pobre! "+
                        "@2<small>COSTA, Cláudio Manoel da. Disponível em: http://www. literaturaemfoco.com/?p=971. Acesso em: 28 mar. 212.</small> @2 ";

                sourceString = texto+"Esses dois textos foram produzidos em períodos distintos, mas assemelham-se quanto à ";
                qA = "apresentação de uma visão de mundo centrada no indivíduo. ";
                qB = "interpretação da realidade através da intuição e da ênfase no imaginário e na fantasia. ";
                qC = "linguagem dramática expressa no exagero de figuras de linguagem. ";
                qD = "volta à natureza em busca de uma vida simples e bucólica contra a vida urbana. ";

                resolucao = "No primeiro texto é evidente que o eu-lírico está muito feliz por viver no sertão. @1" +
                        "Já no segundo texto, é preciso ter um pouco mais de atenção e ler devagar, absorvendo o que o eu-lírico quer expressar, mas " +
                        "dando uma visão geral, é perceptível que o tema do soneto é a contradição entre a calmaria do campo e a corrupção da vida urbana. @2" +
                        "" +
                        "Analisando o segundo texto: @2" +
                        "" +
                        "@bPrimeira estrófe:b@ @1" +
                        "Essa parte do texto diz que quem deixa a vida no campo para viver em uma área urbana, ou não conhece a violência ou nunca sentiu a paz.@1" +
                        "É visível que o eu-lírico prefere a vida no campo. @2" +
                        "" +
                        "@bTerceira estrófe:b@ @1" +
                        "Ali @b(campo)b@ respira Amor sinceridade;" +
                        "Aqui @b(zona urbana)b@ sempre a traição seu rosto encobre;" +
                        "Um @b(zona urbana)b@ só trata a mentira, outro @b(campo)b@ a verdade. @2" +
                        "" +
                        "Nessas duas estofres fica visível que a imagem do campo é idealizada, um local puro, inocente, onde as pertubações que acometem o viver não conseguem adentrar.@1" +
                        "Se o amor pode repirar apenas no campo, logo pode-se dizer que ele é sufocado na cidade, devido a mentira e a hipocrisia. @2" +
                        "" +
                        "Em vista disso, a letra D expressa exatamente o que os textos expressam \"volta à natureza em busca de uma vida simples e bucólica contra a vida urbana.\"" +
                        ""; prerequisito = ""; break;
            case 22:

                texto = "@b Texto 1 b@ @2"+
                        "Deus e eu no sertão @1"+
                        "Nunca vi ninguém @1"+
                        "Viver tão feliz @1"+
                        "Como eu no sertão @2"+
                        "Perto de uma mata @1"+
                        "E de um ribeirão @1"+
                        "Deus e eu no sertão @2"+
                        "Casa simplesinha @1"+
                        "Rede pra dormir @1"+
                        "De noite um show no céu @1"+
                        "Deito pra assistir [...]@2 "+
                        "Trabalho cantando @1"+
                        "A terra é a inspiração @1"+
                        "Deus e eu no sertão [... ] @2"+
                        "De volta pra casa @1"+
                        "Queima a lenha no fogão @1"+
                        "E junto ao som da mata @1"+
                        "Vou eu e um violão [...] "+
                        "@2<small>CHAVES, Victor. Intérpretes: Victor & Leo. Disponível em: http://letras.terra.com.br/victor-leo/79738/. Acesso em: 28"+
                        "mar. 212. Fragmento.</small> @2 " +
                        "@b Texto 2 b@ @2"+
                        "Quem deixa o trato pastoril, amado, @1"+
                        "Pela ingrata, civil correspondência @1"+
                        "Ou desconhece o rosto da violência, @1"+
                        "Ou do retiro a paz não tem provado.@2"+
                        "Que bem é ver nos campos, trasladado @1"+
                        "No gênio do Pastor, o da inocência! @1"+
                        "E que mal é no trato, e na aparência @1"+
                        "Ver sempre o cortesão dissimulado.@2"+
                        "Ali respira Amor sinceridade; @1"+
                        "Aqui sempre a traição seu rosto encobre; @1"+
                        "Um só trata a mentira, outro a verdade.@2"+
                        "Ali não há fortuna que soçobre; @1"+
                        "Aqui quanto se observa é variedade:@1"+
                        "Oh! ventura do rico! Oh! bem do pobre! "+
                        "@2<small>COSTA, Cláudio Manoel da. Disponível em: http://www. literaturaemfoco.com/?p=971. Acesso em: 28 mar. 212.</small> @2 ";

                sourceString = texto+"Ao analisar o Texto 1, constata-se que sua temática remete às obras do ";
                qA = "Arcadismo. ";
                qB = "Barroco. ";
                qC = "Romantismo. ";
                qD = "Simbolismo. ";
                resolucao = "@b Arcadismo: b@ também conhecido como Neoclassicismo, caracterizava-se pela valorização da vida bucólica e dos elementos da natureza (vida no campo). @2" +
                        "" +
                        "@b Barroco: b@ caracterizado pelos contrastes, oposições e dilemas. O homem barroco buscava a salvação ao mesmo tempo que queria usufruir dos prazeres mundanos " +
                        ", daí surgiram os conflitos. Suas características eram o uso da linguagem dramática expressa no exagero de figuras de linguagem, de hipérboles, metafóricos e etc... @2" +
                        "" +
                        "@b Romantismo: b@ é caracterizado pelo sentimentalismo. Ou seja: os escritores românticos escreviam de modo mais emotivo e sentimental, explorando as emoções e drama humano. @2" +
                        "" +
                        "@b Simbolismo: b@ caracterizado por temas místicos, espirituais, ocultos.@1" +
                        "Abusa-se da sinestesia, sensação produzida pela interpenetração de orgãos sensoriais: \"cheiro doce\" ou \"grito vermelho\", das aliterações e das assonâncias. @2" +
                        "" +
                        "De acordo com a breve descrição de cada temática, a que se encaixa melhor com os textos é o Arcadismo." +
                        ""; prerequisito = ""; break;
            case 23:

                texto = "@b Texto 1 b@ @2"+
                        "Deus e eu no sertão @1"+
                        "Nunca vi ninguém @1"+
                        "Viver tão feliz @1"+
                        "Como eu no sertão @2"+
                        "Perto de uma mata @1"+
                        "E de um ribeirão @1"+
                        "Deus e eu no sertão @2"+
                        "Casa simplesinha @1"+
                        "Rede pra dormir @1"+
                        "De noite um show no céu @1"+
                        "Deito pra assistir [...]@2 "+
                        "Trabalho cantando @1"+
                        "A terra é a inspiração @1"+
                        "Deus e eu no sertão [... ] @2"+
                        "De volta pra casa @1"+
                        "Queima a lenha no fogão @1"+
                        "E junto ao som da mata @1"+
                        "Vou eu e um violão [...] "+
                        "@2<small>CHAVES, Victor. Intérpretes: Victor & Leo. Disponível em: http://letras.terra.com.br/victor-leo/79738/. Acesso em: 28"+
                        "mar. 212. Fragmento.</small> @2 " +
                        "@b Texto 2 b@ @2"+
                        "Quem deixa o trato pastoril, amado, @1"+
                        "Pela ingrata, civil correspondência @1"+
                        "Ou desconhece o rosto da violência, @1"+
                        "Ou do retiro a paz não tem provado.@2"+
                        "Que bem é ver nos campos, trasladado @1"+
                        "No gênio do Pastor, o da inocência! @1"+
                        "E que mal é no trato, e na aparência @1"+
                        "Ver sempre o cortesão dissimulado.@2"+
                        "Ali respira Amor sinceridade; @1"+
                        "Aqui sempre a traição seu rosto encobre; @1"+
                        "Um só trata a mentira, outro a verdade.@2"+
                        "Ali não há fortuna que soçobre; @1"+
                        "Aqui quanto se observa é variedade:@1"+
                        "Oh! ventura do rico! Oh! bem do pobre! "+
                        "@2<small>COSTA, Cláudio Manoel da. Disponível em: http://www. literaturaemfoco.com/?p=971. Acesso em: 28 mar. 212.</small> @2 ";

                sourceString = texto+"O Texto 2 apresenta uma estrutura poética fixa que permite classificá-lo como ";
                qA = "acróstico. ";
                qB = "cordel. ";
                qC = "haicai. ";
                qD = "soneto. ";
                resolucao = "@b Classificações: b@ @2" +
                        "" +
                        "@b Acróstico: b@ consite em formar uma palavra vertical com as letras iniciais ou finais de cada verso gerando um nome próprio ou uma sequência significativa.@1" +
                        "Ex.: @1" +
                        "@b Fb@elicidade maior que se @1" +
                        "@b Ib@nstalou em minha vida... @1" +
                        "@b Lb@uz que ilumina e me mostra o @1" +
                        "@b Hb@orizonte a seguir... Abrigo @1" +
                        "@b Ob@nde repouso meus @1" +
                        "@b Sb@onhos, sem nunca pensar em desistir. @2" +
                        "" +
                        "@b Cordel: b@ " +
                        "é um tipo de poema popular, oral e impresso em folhetos, geralmente expostos para venda pendurados em cordas ou cordéis, o que deu origem ao nome.@2" +
                        "" +
                        "@b Haicai: b@ são poemas muito pequenos, são de origem japonesa, contém 17 sílabas ao total; contém alguma referência à natureza; " +
                        "refere-se a um evento particular; apresenta este evento como se estivesse acontecendo agora. @2" +
                        "" +
                        "@b Soneto: b@ poema composto por 4 estrofes, sendo que as duas primeiras se constituem de quatro versos, cada uma (quartetos) e " +
                        "as duas últimas estrofes são de 3 versos, cada uma (tercetos). @2" +
                        "" +
                        "Portanto o Texto 2 pode ser classificado como um soneto."; prerequisito = ""; break;
            case 24:

                sourceString = "Um dos maiores protagonistas da literatura brasileira, Jorge Amado é um escritor atemporal, ou seja, "+
                        "foi e é lido por diversas pessoas de idades variadas. Sua obra está publicada em mais de cinquenta "+
                        "países e foi adaptada para o rádio, cinema, televisão e teatro, transformando seus personagens em parte "+
                        "indissociável da vida brasileira.@1"+
                        "A respeito das características mais marcantes da obra de Jorge Amado, são feitas as seguintes afirmativas:@2"+
                        "I.Aborda a triste realidade dos retirantes nordestinos que fogem das sequelas da seca nordestina.@1"+
                        "II. Destaca todos os excluídos da sociedade, narrando-lhes a vida, os pensamentos, os desejos, "+
                        "mostrando que esses também são humanos.@1"+
                        "III. Coloca a necessidade de justiça social, acrescentando-lhe um tanto de ideologia política, sempre "+
                        "em defesa do povo.@1"+
                        "IV. Os cenários de suas obras são, normalmente, a zona urbana ou áreas de plantação de cacau "+
                        "ou café da Bahia.@1"+
                        "@1Estão corretas as afirmativas: ";
                qA = "I e IV, apenas. ";
                qB = "I, II e III, apenas. ";
                qC = "II, III e IV, apenas. ";
                qD = "I, II, III e IV. ";
                resolucao = "Jorge Amado é um baiano que escreveu obras de cunho regionalista , enaltecendo o povo, a terra e a cultura local. Ele costumava transformar suas " +
                        "preocupações e críticas sociais em textos, umas de suas obras mais famosas são: \"Dona Flor e seus dois maridos\", \"Gabriela, Cravo e Canela\", \"Tieta do Agreste\" e " +
                        "\"Capitães de Areia\".@1" +
                        "Todas as alternativas estão corretas sobre o escritor, exceto a primeira, pois ele não abordava sobre a triste realidade dos retirantes nordestinos que fogem das sequelas da seca nordestina."; prerequisito = ""; break;
            case 25:

                sourceString = "Leia o texto abaixo.@2 "+
                        "[...] fase da literatura brasileira do século XVI, tem este nome pelo fato das manifestações literárias "+
                        "se iniciarem no ano de 1500, época da colonização portuguesa no Brasil. A literatura brasileira, na "+
                        "verdade, ainda não tinha sua identidade, a qual foi sendo formada sob a influência da literatura "+
                        "portuguesa e europeia em geral. Logo, não havia produção literária ligada diretamente ao povo "+
                        "brasileiro, mas sim obras no Brasil que davam significação aos europeus. No entanto, com o "+
                        "passar dos anos, as literaturas informativa e dos jesuítas, foi dando lugar a denotações da visão "+
                        "dos artistas brasileiros. [...] "+
                        "@2<small>Disponível em: http://www.brasilescola.com/literatura/. Acesso em: 16 mar. 212. Fragmento.</small> @2 "+
                        "Qual é o período da Literatura Brasileira descrito nesse texto? ";
                qA = "Arcadismo. ";
                qB = "Barroco. ";
                qC = "Quinhentismo. ";
                qD = "Romantismo. ";
                resolucao = "@b Períodos da Literatura Brasileira: b@ @2" +
                        "@b Arcadismo: b@ também conhecido como Neoclassicismo, caracterizava-se pela valorização da vida bucólica e dos elementos da natureza (vida no campo). @2" +
                        "" +
                        "@b Barroco: b@ caracterizado pelos contrastes, oposições e dilemas. O homem barroco buscava a salvação ao mesmo tempo que queria usufruir dos prazeres mundanos " +
                        ", daí surgiram os conflitos. Suas características eram o uso da linguagem dramática expressa no exagero de figuras de linguagem, de hipérboles, metafóricos e etc... @2" +
                        "" +
                        "@b Quinhentismo: b@ é a denominação genérica de todas as manifestações literárias ocorridas no Brasil durante o século XVI (período de 1500). @2" +
                        "" +
                        "@b Romantismo: b@ é caracterizado pelo sentimentalismo. Ou seja: os escritores românticos escreviam de modo mais emotivo e sentimental, explorando as emoções e drama humano. @2" +
                        "" +
                        "De acordo com as definições, Quinhentismo é o período da literatura brasileira descrito nesse texto."; prerequisito = ""; break;


            case 26:
                texto = "@b O seminarista b@ @2"+
                        "[...] Margarida, pois, não saía quase de casa do capitão Francisco Antunes onde, conduzida por "+
                        "sua mãe entrava pela manhã, e não saía senão à tardinha. Muitas vezes mesmo acontecia-lhe dormir "+
                        "lá, quando fazia mau tempo, ou quando os afazeres de Umbelina não lhe permitiam ir buscá-la.@1"+
                        "À medida que a menina ia crescendo, a senhora Antunes como boa madrinha que era, ia-lhe "+
                        "ensinando o que a sua tenra idade comportava, e desde os cinco anos lhe pôs nas mãos a agulha "+
                        "e o dedal.@1"+
                        "Margarida, por sua graça e gentileza, extrema docilidade e precoce vivacidade, era mui querida "+
                        "de todos, e inseparável de Eugênio.@1"+
                        "Assim foi-se criando e fortalecendo desde o berço entre aquelas duas almas infantis uma viva "+
                        "e profunda afeição, que dia a dia mais afundava as raízes naqueles dois tenros corações, como "+
                        "em uma terra fresca e cheia de seiva. Eram como duas flores silvestres em botão, nascidas da "+
                        "mesma haste, nutrindo-se da mesma seiva, acariciadas pela mesma aragem, que ao abrirem-se "+
                        "cheias de viço e louçania encontravam-se sorrindo-se e namorando-se em face uma da outra, "+
                        "e balanceando-se às auras da solidão procuravam beijar-se trocando entre si eflúvios de amor.@1"+
                        "De dia em dia crescia essa mútua amizade entre as duas crianças, como um cipó, que nascendo "+
                        "entre dois tenros arbustos vizinhos se enleia em torno deles e confunde seus galhos tornando-os "+
                        "como um só.@1"+
                        "Não eram ainda Romeu e Julieta; mas eram inseparáveis como Paulo e Virgínia vagueando "+
                        "pelas sombras dos pitorescos bosques da Ilha de França.@1"+
                        "Entretanto Eugênio tocava já aos seus nove anos, e um dia foi preciso mandá-lo morar na Vila "+
                        "em casa de um parente, a fim de frequentar a escola de primeiras letras.@1"+
                        "Ah! Foi esse um dia de prantos e desolação naquela pequena família. Parecia que ela havia "+
                        "sido fulminada por alguma grande desgraça. Umbelina e a dona da casa ralhavam e afagavam, "+
                        "sorriam e choravam ao mesmo tempo; os meninos resmungavam queixas e soluçavam pelos "+
                        "cantos da casa. O pai gritava, enternecia-se e exasperava-se alternativamente à vista de tanta "+
                        "choradeira. E tudo isso por causa de um menino que ia para a escola dali a légua e meia!...@1"+
                        "No momento de partir foi a muito custo que conseguiram arrancar os dois meninos dos braços "+
                        "um do outro.@1"+
                        "Foi necessário que Umbelina agarrasse à força sua filha, que se atirava pelo chão, estorcendo-se "+
                        "e rasgando as roupas em desespero, e queria a todo o transe ir correndo pela estrada afora atrás de "+
                        "seu companheiro, que lá se ia em lágrimas e soluços. [...] "+
                        "@2<small>GUIMARÃES, Bernardo. Disponível em: http://www.biblio.com.br//. Acesso em: 30 maio 212. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";

                sourceString = texto+"Esse texto insere-se na perspectiva do Romantismo, principalmente, por apresentar o ";
                qA = "sentimentalismo exagerado. ";
                qB = "pessimismo. ";
                qC = "individualismo. ";
                qD = "feminino idealizado. ";
                resolucao = "@b Romantismo: b@ é caracterizado pelo sentimentalismo. Ou seja: os escritores românticos escreviam de modo mais emotivo e sentimental, explorando as emoções e drama humano. @2" +
                        "O enunciado já deixou bem claro que o texto está inserido na perspectiva do Romantismo, que se caracteriza pelo sentimentalismo exagerado, portanto, a letra A está correta."
                ; prerequisito = ""; break;
            case 27:

                texto = "@b O seminarista b@ @2"+
                        "[...] Margarida, pois, não saía quase de casa do capitão Francisco Antunes onde, conduzida por "+
                        "sua mãe entrava pela manhã, e não saía senão à tardinha. Muitas vezes mesmo acontecia-lhe dormir "+
                        "lá, quando fazia mau tempo, ou quando os afazeres de Umbelina não lhe permitiam ir buscá-la.@1"+
                        "À medida que a menina ia crescendo, a senhora Antunes como boa madrinha que era, ia-lhe "+
                        "ensinando o que a sua tenra idade comportava, e desde os cinco anos lhe pôs nas mãos a agulha "+
                        "e o dedal.@1"+
                        "Margarida, por sua graça e gentileza, extrema docilidade e precoce vivacidade, era mui querida "+
                        "de todos, e inseparável de Eugênio.@1"+
                        "Assim foi-se criando e fortalecendo desde o berço entre aquelas duas almas infantis uma viva "+
                        "e profunda afeição, que dia a dia mais afundava as raízes naqueles dois tenros corações, como "+
                        "em uma terra fresca e cheia de seiva. Eram como duas flores silvestres em botão, nascidas da "+
                        "mesma haste, nutrindo-se da mesma seiva, acariciadas pela mesma aragem, que ao abrirem-se "+
                        "cheias de viço e louçania encontravam-se sorrindo-se e namorando-se em face uma da outra, "+
                        "e balanceando-se às auras da solidão procuravam beijar-se trocando entre si eflúvios de amor.@1"+
                        "De dia em dia crescia essa mútua amizade entre as duas crianças, como um cipó, que nascendo "+
                        "entre dois tenros arbustos vizinhos se enleia em torno deles e confunde seus galhos tornando-os "+
                        "como um só.@1"+
                        "Não eram ainda Romeu e Julieta; mas eram inseparáveis como Paulo e Virgínia vagueando "+
                        "pelas sombras dos pitorescos bosques da Ilha de França.@1"+
                        "Entretanto Eugênio tocava já aos seus nove anos, e um dia foi preciso mandá-lo morar na Vila "+
                        "em casa de um parente, a fim de frequentar a escola de primeiras letras.@1"+
                        "Ah! Foi esse um dia de prantos e desolação naquela pequena família. Parecia que ela havia "+
                        "sido fulminada por alguma grande desgraça. Umbelina e a dona da casa ralhavam e afagavam, "+
                        "sorriam e choravam ao mesmo tempo; os meninos resmungavam queixas e soluçavam pelos "+
                        "cantos da casa. O pai gritava, enternecia-se e exasperava-se alternativamente à vista de tanta "+
                        "choradeira. E tudo isso por causa de um menino que ia para a escola dali a légua e meia!...@1"+
                        "No momento de partir foi a muito custo que conseguiram arrancar os dois meninos dos braços "+
                        "um do outro.@1"+
                        "Foi necessário que Umbelina agarrasse à força sua filha, que se atirava pelo chão, estorcendo-se "+
                        "e rasgando as roupas em desespero, e queria a todo o transe ir correndo pela estrada afora atrás de "+
                        "seu companheiro, que lá se ia em lágrimas e soluços. [...] "+
                        "@2<small>GUIMARÃES, Bernardo. Disponível em: http://www.biblio.com.br//. Acesso em: 30 maio 212. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";

                sourceString = texto+"O conflito romântico que provoca tristeza na personagem Margarida é observado ";
                qA = "pela separação do casal. ";
                qB = "pela situação social da menina. ";
                qC = "pelo amor puro do casal. ";
                qD = "pelo dever social do garoto. ";
                resolucao = "Toda a tristeza é gerada a partir do momento em que Eugênio teve que se mudar para outro local e ficaria longe de Margarida. Por isso, o conflito que provoca a tristeza " +
                        "na personagem é a separação do casal."; prerequisito = ""; break;
            case 28:

                texto = "@b O seminarista b@ @2"+
                        "[...] Margarida, pois, não saía quase de casa do capitão Francisco Antunes onde, conduzida por "+
                        "sua mãe entrava pela manhã, e não saía senão à tardinha. Muitas vezes mesmo acontecia-lhe dormir "+
                        "lá, quando fazia mau tempo, ou quando os afazeres de Umbelina não lhe permitiam ir buscá-la.@1"+
                        "À medida que a menina ia crescendo, a senhora Antunes como boa madrinha que era, ia-lhe "+
                        "ensinando o que a sua tenra idade comportava, e desde os cinco anos lhe pôs nas mãos a agulha "+
                        "e o dedal.@1"+
                        "Margarida, por sua graça e gentileza, extrema docilidade e precoce vivacidade, era mui querida "+
                        "de todos, e inseparável de Eugênio.@1"+
                        "Assim foi-se criando e fortalecendo desde o berço entre aquelas duas almas infantis uma viva "+
                        "e profunda afeição, que dia a dia mais afundava as raízes naqueles dois tenros corações, como "+
                        "em uma terra fresca e cheia de seiva. Eram como duas flores silvestres em botão, nascidas da "+
                        "mesma haste, nutrindo-se da mesma seiva, acariciadas pela mesma aragem, que ao abrirem-se "+
                        "cheias de viço e louçania encontravam-se sorrindo-se e namorando-se em face uma da outra, "+
                        "e balanceando-se às auras da solidão procuravam beijar-se trocando entre si eflúvios de amor.@1"+
                        "De dia em dia crescia essa mútua amizade entre as duas crianças, como um cipó, que nascendo "+
                        "entre dois tenros arbustos vizinhos se enleia em torno deles e confunde seus galhos tornando-os "+
                        "como um só.@1"+
                        "Não eram ainda Romeu e Julieta; mas eram inseparáveis como Paulo e Virgínia vagueando "+
                        "pelas sombras dos pitorescos bosques da Ilha de França.@1"+
                        "Entretanto Eugênio tocava já aos seus nove anos, e um dia foi preciso mandá-lo morar na Vila "+
                        "em casa de um parente, a fim de frequentar a escola de primeiras letras.@1"+
                        "Ah! Foi esse um dia de prantos e desolação naquela pequena família. Parecia que ela havia "+
                        "sido fulminada por alguma grande desgraça. Umbelina e a dona da casa ralhavam e afagavam, "+
                        "sorriam e choravam ao mesmo tempo; os meninos resmungavam queixas e soluçavam pelos "+
                        "cantos da casa. O pai gritava, enternecia-se e exasperava-se alternativamente à vista de tanta "+
                        "choradeira. E tudo isso por causa de um menino que ia para a escola dali a légua e meia!...@1"+
                        "No momento de partir foi a muito custo que conseguiram arrancar os dois meninos dos braços "+
                        "um do outro.@1"+
                        "Foi necessário que Umbelina agarrasse à força sua filha, que se atirava pelo chão, estorcendo-se "+
                        "e rasgando as roupas em desespero, e queria a todo o transe ir correndo pela estrada afora atrás de "+
                        "seu companheiro, que lá se ia em lágrimas e soluços. [...] "+
                        "@2<small>GUIMARÃES, Bernardo. Disponível em: http://www.biblio.com.br//. Acesso em: 30 maio 212. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";

                sourceString = texto+"Nesse texto, o trecho “Ah! Foi esse um dia de prantos e desolação naquela pequena família. Parecia que "+
                        "ela havia sido fulminada por alguma grande desgraça.” indica ";
                qA = "comparação de sentimentos. ";
                qB = "exagero de ideias. ";
                qC = "gradação de acontecimentos. ";
                qD = "oposição de sentidos. ";
                resolucao = "O romantismo é caractezirado pelo exagero de sentimentalismo. No trecho, diz que a família parecia ter sido fulminada (aniquiliada, destruída) porque o Eugênio iria se mudar para uma legua e meia de distância " +
                        "(aproximadamente 7 km). Portanto é nítido que há um exagero de ideias neste trecho."; prerequisito = ""; break;
            case 29:

                texto = "@b O seminarista b@ @2"+
                        "[...] Margarida, pois, não saía quase de casa do capitão Francisco Antunes onde, conduzida por "+
                        "sua mãe entrava pela manhã, e não saía senão à tardinha. Muitas vezes mesmo acontecia-lhe dormir "+
                        "lá, quando fazia mau tempo, ou quando os afazeres de Umbelina não lhe permitiam ir buscá-la.@1"+
                        "À medida que a menina ia crescendo, a senhora Antunes como boa madrinha que era, ia-lhe "+
                        "ensinando o que a sua tenra idade comportava, e desde os cinco anos lhe pôs nas mãos a agulha "+
                        "e o dedal.@1"+
                        "Margarida, por sua graça e gentileza, extrema docilidade e precoce vivacidade, era mui querida "+
                        "de todos, e inseparável de Eugênio.@1"+
                        "Assim foi-se criando e fortalecendo desde o berço entre aquelas duas almas infantis uma viva "+
                        "e profunda afeição, que dia a dia mais afundava as raízes naqueles dois tenros corações, como "+
                        "em uma terra fresca e cheia de seiva. Eram como duas flores silvestres em botão, nascidas da "+
                        "mesma haste, nutrindo-se da mesma seiva, acariciadas pela mesma aragem, que ao abrirem-se "+
                        "cheias de viço e louçania encontravam-se sorrindo-se e namorando-se em face uma da outra, "+
                        "e balanceando-se às auras da solidão procuravam beijar-se trocando entre si eflúvios de amor.@1"+
                        "De dia em dia crescia essa mútua amizade entre as duas crianças, como um cipó, que nascendo "+
                        "entre dois tenros arbustos vizinhos se enleia em torno deles e confunde seus galhos tornando-os "+
                        "como um só.@1"+
                        "Não eram ainda Romeu e Julieta; mas eram inseparáveis como Paulo e Virgínia vagueando "+
                        "pelas sombras dos pitorescos bosques da Ilha de França.@1"+
                        "Entretanto Eugênio tocava já aos seus nove anos, e um dia foi preciso mandá-lo morar na Vila "+
                        "em casa de um parente, a fim de frequentar a escola de primeiras letras.@1"+
                        "Ah! Foi esse um dia de prantos e desolação naquela pequena família. Parecia que ela havia "+
                        "sido fulminada por alguma grande desgraça. Umbelina e a dona da casa ralhavam e afagavam, "+
                        "sorriam e choravam ao mesmo tempo; os meninos resmungavam queixas e soluçavam pelos "+
                        "cantos da casa. O pai gritava, enternecia-se e exasperava-se alternativamente à vista de tanta "+
                        "choradeira. E tudo isso por causa de um menino que ia para a escola dali a légua e meia!...@1"+
                        "No momento de partir foi a muito custo que conseguiram arrancar os dois meninos dos braços "+
                        "um do outro.@1"+
                        "Foi necessário que Umbelina agarrasse à força sua filha, que se atirava pelo chão, estorcendo-se "+
                        "e rasgando as roupas em desespero, e queria a todo o transe ir correndo pela estrada afora atrás de "+
                        "seu companheiro, que lá se ia em lágrimas e soluços. [...] "+
                        "@2<small>GUIMARÃES, Bernardo. Disponível em: http://www.biblio.com.br//. Acesso em: 30 maio 212. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 ";

                sourceString = texto+"O estilo linguístico desse texto evidencia um autor que ";
                qA = "anuncia as modificações para a arte literária. ";
                qB = "emprega harmonia e sonoridade das palavras. ";
                qC = "traz um sentido regional e popular para a literatura. ";
                qD = "usa a subjetividade ao caracterizar as personagens. ";
                resolucao = "Sabemos que este é um texto do Romantismo, que é caracterizado pelo sentimentalismo.@1" +
                        "Subjetividade é a forma com que alguém vê o mundo, a grosso modo é possivel dizer que a subjetividade é a mesma coisa que o sentimentalismo. " +
                        "O Romantismo tenta fazer o leitor se identificar com as personagens e sentir o mesmo sentimento que elas sentem, portanto um texto do Romantismo " +
                        "usa a subjetividade ao caracterizar as personagens (personagens é um substântivo no feminino, independente se a personagem é do sexo masculino ou feminino)."; prerequisito = ""; break;

            case 30:
                texto = "@img lc510301 img@";
                sourceString = "Observe a imagem abaixo, que reproduz a obra Operários, de Tarsila do Amaral.@1" +
                        texto+
                        "@1<small>Disponível em: http://www.ceep.org.br/espaco-de-formacao/materiais-de-apoio-ao-docente/93-operarios-tarsila-do-amaral. Acesso em: 17 jan. 212.</small> @2 "+
                        "Produzida no início dos anos 1930, em plena Era Vargas, essa tela ilustra um momento político e social "+
                        "brasileiro, marcado, principalmente, pela ";
                qA = "censura. ";
                qB = "industrialização. ";
                qC = "invasão digital. ";
                qD = "revolução popular. ";
                resolucao = "A Era Vargas é marcada pela industrialização e nessa época classe operária começou a surgir. O quadro mostra a diversidade cultural de um povo oprimido pelas elites, representada pela fábrica ao fundo. Embora as pessoas estejam em primeiro plano e todas tenham traços diferentes, não é fácil diferenciá-las. Elas parecem todas iguais, representando, portanto, um sistema que massifica o cidadão."; prerequisito = ""; break;
            }
        }

        if (materia.equals(CHAVE_MATEMATICA)) {
            switch (indice) {
                case 1:

                    sourceString = "Uma molécula de açúcar comum possui 5,7 x 10@sp–22sp@ g de massa.@1"+
                            "Quantos gramas de açúcar há em uma vasilha que possui 40 x 10@sp21sp@ moléculas de açúcar? ";
                    qA = "20,8 ";
                    qB = "22,8 ";
                    qC = "28 ";
                    qD = "228 ";
                    resolucao = "Essa questão parece difícil por ter muitos números, muitas potências, potências negativas, mas se você estudou sobre potências " +
                            "e lembra de suas propriedades, a questão se tornará mais fácil do que você poderia imaginas, veja só: @2" +
                            "" +
                            "Lendo o enunciado, sabemos quanto vale uma molécula de açucar em gramas, mas a questão está querendo saber qual é a massa de 40 x 10@sp21sp@ moléculas.@1" +
                            "Ora, se sabemos quanto vale uma molécula, basta fazermos a famosa regra de três: @1" +
                            "" +
                            "@cimg rmt510011 cimg@ @1" +
                            "Agora é preciso multiplicar cruzado.@1" +
                            "@cimg rmt510012 cimg@ @1" +
                            "Beleza, chegamos a esse resultado: @2" +

                            "1x = 4·10@sp21sp@·5,7·10@sp-22sp@ @2" +

                            "Que confusão! como isso é uma multiplicação, podemos trocar a ordem dos fatores, já que a ordem dos fatores não altera o resultado.@2" +

                            "1x = 4·5,7·10@sp21sp@·10@sp-22sp@ @2" +

                            "Está melhorando! 1x é igual x, então podemos tirar o 1 e lembra da propriedade de potência que diz " +
                            "\" Numa multiplicação entre potências, se as bases forem iguais, basta somar os expoentes\"? Então, podemos" +
                            " usar essa propriedade, já que 10@sp-22sp@ e 10@sp21sp@ possuem a mesma base.@2" +
                            "" +
                            "x = 4·5,7·10@sp21 + (-22)sp@ @1" +
                            "x = 4·5,7·10@sp-1sp@ @1" +
                            "x = 4·5,7·1 @1" +
                            "x = 4·5,7 @1" +
                            "x = 22,8 @2" +
                            "" +
                            "Então 4·10@sp21sp@ moléculas de açucar comum possuem 22,8 gramas. @1" +
                            "Se uma questão parece muito confusa, tente manipular os números e utilizar as propriedades. " +
                            "Nesse caso as propriedades de potenciação tornaram o cálculo mais simples." +
                            "" +
                            "";
                            prerequisito = ""; break;
                case 2:

                    sourceString = "A circunferência representada no plano cartesiano abaixo possui centro no ponto P.@2 " +
                            "@cimg mt510021 cimg@ @2"+
                            "Qual é a equação dessa circunferência? ";
                    qA = "(x – 2)² + (y – 3)² = 18 ";
                    qB = "(x – 2)² + (y – 3)² = 36 ";
                    qC = "(x + 2)² + (y + 3)² = 18 ";
                    qD = "(x + 2)² + (y + 3)² = 36 ";
                    resolucao = "A equação geral de circuferências é definida por: @2" +
                            "" +
                            "@b (x – a)@sp2sp@ + (y – b)@sp2sp@ = R@sp2sp@ b@ @2" +
                            "" +
                            "@bab@ é a posição do centro da circuferência em relação o eixo das  abcissas @b(x)b@. @1" +
                            "@bbb@ é a posição do centro da circuferência em relação o eixo das ordenadas @b(y)b@. @1" +
                            "@bRb@ é o raio da circuferência. @2" +
                            "" +
                            "Sabendo disso, vamos analisar o gráfico: @1" +
                            "@cimg mt510021 cimg@ @1" +
                            "" +
                            "- A posição do centro da circuferência em relação o eixo das abcissas é 2. @1" +
                            "- A posição do centro da circuferência em relação o eixo das ordenadas é 3. @2" +
                            "" +
                            "Agora já conhecemos @bab@ e @bbb@, nossa equação fica assim: @2" +
                            "" +
                            "@b (x – 2)@sp2sp@ + (y – 3)@sp2sp@ = R@sp2sp@ b@ @2" +
                            "" +
                            "Só ai já conseguimos descartar as alternativas C e D, mas o enunciado também quer saber quanto vale @bR@sp2sp@b@. @2" +
                            "" +
                            "O raio de uma circuferência é a medida que vai do centro (P) até uma de suas extremidades. @1" +
                            "@cimg rmt510021 cimg@ @1" +
                            "" +
                            "Todas essas medidas terão o mesmo valor, então basta escolhermos uma e medirmos o valor de R, iremos escolher a que seja mais fácil.@1" +
                            "@cimg rmt510022 cimg@ @1" +
                            "" +
                            "Nesse gráfico não dá pra saber quem é o R de cabeça, então teremos que formar um triângulo e medir o lado R.@1" +
                            "@cimg rmt510023 cimg@ @1" +
                            "@cimg rmt510024 cimg@ @1" +
                            "" +
                            "Agora basta fazer o teorema de pitágoras (cateto oposto)@sp2sp@ + (cateto adjacente)@sp2sp@ = hipotenusa@sp2sp@, neste caso a hipotenusa = R," +
                            " CA = 3 e CO = 3, então temos: @2" +
                            "" +
                            "@b 3@sp2sp@ + 3@sp2sp@ = R@sp2sp@ b@ @1" +
                            "@b 9 + 9 = R@sp2sp@ b@ @1" +
                            "@b 18 = R@sp2sp@ b@ @2" +
                            "" +
                            "Agora teremos que passar a potência para o outro lado da equação, se transformando numa raiz: @2" +
                            "" +
                            "@b raizd_18 = R b@ @1" +
                            "@b R = raizd_18 b@ @2" +
                            "" +
                            "Agora sabemos o valor de R, vamos substituir na equação: @2" +
                            "" +
                            "@b (x – 2)@sp2sp@ + (y – 3)@sp2sp@ = raizd_18@sp2sp@ b@ @2" +
                            "" +
                            "Sabemos que quando elevamos uma raiz quadrada a segunda potência, a raiz e potência se anulam, deixando apenas o número, então: @2" +
                            "" +
                            "@b (x – 2)@sp2sp@ + (y – 3)@sp2sp@ = 18 b@ @2" +
                            "" +
                            "E essa é a resposta." +
                            "";
                    prerequisito = ""; break;
                case 3:

                    sourceString = "A professora pediu que seus alunos escrevessem um número com 3 algarismos, com as propriedades "+
                            "listadas abaixo.@2 "+
                            "• Todos os algarismos desse número pertencem ao conjunto IN*.@1"+
                            "• O algarismo das unidades é par.@1"+
                            "• O algarismo das dezenas é ímpar.@1"+
                            "• O algarismo das centenas é múltiplo de 4.@1"+
                            "@1Quantos números existem com essas propriedades? ";
                    qA = "40 ";
                    qB = "50 ";
                    qC = "60 ";
                    qD = "75 ";
                    resolucao = "Essa questão quer testar seus conhecimentos em análise combinatória. @1" +
                            "Em análise combinatória, precisamos organizar os números. Então vamos fazer isso. @2" +
                            "" +
                            "A primeira informação é que os números possuem 3 algarismos, então teremos três vagas. @1" +
                            "@cimg rmt510031 cimg@ @1" +
                            "A primeira propriedade nos diz que os algarismos pertencem ao conjunto dos naturais, excluindo o 0. " +
                            "Conjunto IN*={1,2,3,4,5,6,7,8,9}, então só poderemos utilizar estes números para as nossas combinações.@2" +
                            "" +
                            "A segunda propriedade nos diz que o algarismo das unidades é par. Então só pode ser " +
                            "@b  2, 4, 6, 8 b@, temos 4 possibilidades para os algarismos das unidades. @1" +
                            "@cimg rmt510032 cimg@ @2" +
                            "" +
                            "A terceira nos diz que o algarismo das dezenas é ímpar, então só pode ser " +
                            "@b 1,3,5,7,9 b@, temos 5 possibilidades.@1" +
                            "@cimg rmt510033 cimg@ @2" +
                            "Já a quarta propriedade nos diz que  algarismo das centenas é múltiplo de 4, com esta característica só temos 4 e 8, portanto 2 possibilidades. @1 " +
                            "@cimg rmt510034 cimg@ @2" +
                            "" +
                            "Agora basta multiplicarmos as possibilidades que encontraremos o número total de possibilidades: @1" +
                            "@b 2 · 5 · 4 = 40 b@" +
                            "";
                    prerequisito = ""; break;
                case 4:

                    sourceString = "A tabela abaixo mostra o resultado de uma pesquisa realizada com 1 200 jovens de uma escola, para "+
                            "saber o que eles fazem para evitar a acne. Cada um desses jovens utiliza apenas um método.@1"+
                            "@cimg mt510041 cimg@ @1"+

                            "Quantos desses jovens lavam o rosto várias vezes ao dia? ";
                    qA = "32 ";
                    qB = "60 ";
                    qC = "276 ";
                    qD = "384 ";
                    resolucao = "Essa questão fala sobre porcentagem. Existem diferentes métodos de resolver, o mais fácil neste caso será este: @2" +
                            "" +
                            "Sabemos que 32% dos jovens lavam o rosto várias vezes ao dia e sabemos que a pesquisa foi realizada com 1 200 jovens, " +
                            "então o enunciado quer que digamos quanto é 32% de 1200. @1" +
                            "Para isso, podemos calcular o valor de 1% de 1200 e multiplicar o resultado por 32, já que 1% vezes 32 é igual a 32%.@2" +
                            "" +
                            "1% é o mesmo que @img fr001s100 img@, portanto basta multiplicar 1200 por @img fr001s100 img@ e saberemos quanto é 1% de 1200.@2" +
                            "" +
                            "1200 · @img fr001s100 img@ = x @1" +
                            "@img fr1200s100 img@ = x @2" +
                            "" +
                            "Cortando os zeros fica: @2" +
                            "" +
                            "@img fr012s100 img@ = x@1" +
                            "x = 12 @2" +
                            "" +
                            "Bem, agora sabemos que 1% de 1200 é 12, agora basta multiplicar isso por 32:@2" +
                            "" +
                            "12 · 32 =  384 @2" +
                            "" +
                            "384 equivale a 32% de 1200, sendo assim, 384 pessoas lavam o rosto várias vezes ao dia." +
                            "" +
                            ""; prerequisito = ""; break;
                case 5:

                    sourceString = "No mês de abril, Mário queria comprar uma televisão que custava R$ 800,00 e um fogão, no valor de "+
                            "R$ 600,00, mas não tinha a quantia suficiente para fazer a compra à vista, como ele pretendia. No mês "+
                            "seguinte, ele conseguiu o dinheiro e, ao efetuar a compra, o preço da televisão havia diminuído em 20%, "+
                            "e o do fogão havia aumentado em 10%.@1"+
                            "@1Quanto Mário pagou pela compra desses dois eletrodomésticos? ";
                    qA = "R$ 1 240,00 ";
                    qB = "R$ 1 260,00 ";
                    qC = "R$ 1 300,00 ";
                    qD = "R$ 1 360,00 ";
                    resolucao = "Uma questão de porcentagem, vamos resolvê-la dessa forma: @2" +
                            "" +
                            "O preço da televisão diminuiu em 20%, então descobriremos quanto é 20% e subtrairemos ao preço da televisão.@1" +
                            "O preço do fogão aumentou em 10%, logo descobriremos quanto é 10% e somaremos ao preço do fogão. @1" +
                            "" +
                            "Para isso, vamos descobrir quanto é 1% do preço do produto e depois multiplicar pela porcentagem desejada. @2" +
                            "" +
                            "@b Televisão: b@ @2" +
                            "" +
                            "Custava 800,00, para saber quanto é 1% de um número, basta passar seus dois últimos para depois da vírgula, então:" +
                            "1% de 800,00 = 8,0000 = 8@2" +
                            "Sendo assim 8 é 1% de 800, agora multiplicaremos este 1% por 20, que resultará em 20%: @2" +
                            "" +
                            "8 · 20 = 160 @2" +
                            "" +
                            "Logo 160 equivale a 20% de 800. @1" +
                            "Agora basta diminuir o valor da televião por estes 20% para saber o novo preço.@2" +
                            "" +
                            "@b Novo Preço da Televisão b@ = 800 - 160 = 640. @2" +
                            "" +
                            "@b Fogão: b@ @2" +
                            "Custava 600,00, para saber quanto é 1% de um número, basta passar seus dois últimos para depois da vírgula, sendo assim:" +
                            "1% de 600,00 = 6,0000 = 6@2" +
                            "Assim sendo 6 é 1% de 600, agora multiplicaremos este 1% por 10, que resultará em 10%: @2" +
                            "" +
                            "6 · 10 = 60 @2" +
                            "" +
                            "Portanto 60 equivale a 10% de 600. @1" +
                            "Agora basta somar o valor do fogão por estes 10% para saber o novo preço.@2" +
                            "" +
                            "@b Novo Preço do Fogão b@ = 600 + 60 = 660. @2" +
                            "" +
                            "Agora que já sabemos os novos preços, basta somar para saber qual foi o total pago por Mário. @2" +
                            "" +
                            "640 + 660 = 1300"; prerequisito = ""; break;
                case 6:

                    sourceString = "Considere a função f(n) no quadro abaixo.@2 "+
                            "@b f(n) = – n² + 94n – 2 184 b@ @2"+
                            "Seja n o número inteiro positivo para o qual essa função tem o maior valor possível.@1"+
                            "@1Qual é a soma dos algarismos de n? ";
                    qA = "6 ";
                    qB = "7 ";
                    qC = "11 ";
                    qD = "13 ";
                    resolucao = "Essa questão é classificada como difícil, pois te exije alguns conhecimentos específicos e ainda tem uma pegadinha no final. @2" +
                            "" +
                            "O enunciado diz que @bnb@ é o número inteiro positivo para o qual essa função tem o maior valor possível, portanto teremos que identificá-lo. " +
                            "" +
                            "O nosso @bab@ é negativo, portanto a concavidade dessa função é voltada para baixo. @2" +
                            "" +
                            "Opa! Então já sabemos que esse gráfico (equação) realmente tem um máximo, já que a concavidade é voltada para baixo. Agora temos que saber " +
                            "onde fica o vértice deste gráfico, se acharmos o vértice, acharemos o ponto de máximo. @2" +
                            "" +
                            "@b Fórmula do vértice: b@ @1" +
                            "@cimg rmt510061 cimg@ @1" +
                            "" +
                            "Agora basta descobrir quem é o Δ. @2" +
                            "" +
                            "Δ = b@sp2sp@ - 4.a.c @1" +
                            "Δ = 94@sp2sp@ - 4.(-1).(-2184) @1" +
                            "(O @b-1b@ corta o sinal negativo do @b-2184b@) @1"+
                            "Δ = 8836 - 4.2184 @1" +
                            "Δ = 8836 - 8736 @1" +
                            "Δ = 100 @2" +
                            "" +
                            "Já temos tudo que precisamos para descobrir o vértice, então vamos jogar na fórmula: @1" +
                            "@cimg rmt510062 cimg@ @2" +
                            "" +
                            "Então o ponto máximo desse gráfico fica localizado em 47 no eixo das abscissas (n) e 25 no eixo das ordenadas (y), mas o enunciado quer saber " +
                            "apenas o número máximo @bnb@ que é 47. @2" +
                            "" +
                            "A pegadinha é que não tem 47 nas alternativas, pois o enunciado pediu a soma dos algarismos de @bnb@.@1" +
                            "Os algarismos são 4 e 7, portanto 4+7 = 11." +
                            ""; prerequisito = ""; break;
                case 7:

                    sourceString = "Os dois gráficos abaixo mostram, respectivamente, a faixa de isenção (em salários mínimos) do pagamento "+
                            "do imposto de renda em cada um dos anos assinalados e os valores dos salários mínimos em cada um "+
                            "desses anos. Por exemplo, em 1996, um trabalhador que ganhava até 8,4 salários mínimos era isento "+
                            "do pagamento de imposto de renda.@2"+
                            "@cimg mt510071 cimg@ @1"+
                            "@cimg mt510072 cimg@ @1"+
                            "De acordo com esses dados, no ano de 2009, qual era o maior salário possível para que um trabalhador "+
                            "fosse isento do imposto de renda? ";
                    qA = "R$ 1 170,40 ";
                    qB = "R$ 1 278,75 ";
                    qC = "R$ 1 311,00 ";
                    qD = "R$ 1 432,20 ";
                    resolucao = "Em 2009, quem recebesse mais de 3,08 salários mínimos, teria que pagar imposto de renda, então basta multiplicarmos esse número pelo salário mínimo " +
                            "em 2009 para sabermos qual é o valor máximo. @2" +
                            "" +
                            "3,08 x 465 = 1432,20"; prerequisito = ""; break;
                case 8:

                    sourceString = "Qual dos gráficos abaixo representa a função y = – 0,5x + 4?";
                    qA = "@img mt51008a img@";
                    qB = "@img mt51008b img@";
                    qC = "@img mt51008c img@";
                    qD = "@img mt51008d img@";
                    resolucao = "Vamos usar o que a equação nos informa e ver as principais características que o gráfico devera ter: @2" +
                            "" +
                            "- O @bab@ é negativo, portanto o gráfico deverá ser decrescente, podemos descartar os gráficos C e D. @1" +
                            "- O gráfico intercepta o eixo y em 4, pois se x for 0, y será 4, então podemos descartar o gráfico B, pois ele intercepta o eixo y em -4.@2" +
                            "" +
                            "Só nos resta o gráfico A, sendo assim, ele está correto."; prerequisito = ""; break;
                case 9:

                    sourceString = "O lucro L, em reais, de uma empresa pela venda de x computadores por mês é dado por L = 10(– x² + 60x – 500).@1"+
                            "@1Para que essa empresa tenha lucro, o número x de computadores vendidos deve ser tal que ";
                    qA = "x > 30 ";
                    qB = "x > 50 ";
                    qC = "0 < x < 10 ";
                    qD = "10 < x < 50 ";
                    resolucao = "Essa questão quer saber qual intervalo do gráfico tem L>0, neste caso precisaremos esboçar o gráfico para ter maior compreensão. Será necessário: @2 " +
                            "" +
                            "- Concavidade da parábola. @1" +
                            "- Raízes da parábola. @2" +
                            "Aquele 10 na equação está ali pra te confundir, você pode omití-lo, pois o gráfico ainda será porporcional e não queremos saber qual foi o lucro, mas " +
                            "sim o intervalo onde há lucro. Se precisassemos do lucro, bastaria multiplicar o resultado final por 10.@2" +
                            "" +
                            "O @bab@ é negativo, portanto a concavidade é voltada para baixo, agora vamos descobrir se há raízes. " +
                            "@2" +
                            "Δ = b@sp2sp@ - 4.a.c @1" +
                            "Δ = 60@sp2sp@ - 4.(-1).(-500) @1" +
                            "(O @b-1b@ corta o sinal negativo do @b-500b@) @1"+
                            "Δ = 3600 - 4.500 @1" +
                            "Δ = 3600 - 2000 @1" +
                            "Δ = 1600 @2" +
                            "O delta é positivo e maior do que 0, portanto esse gráfico terá duas raízes reais. Agora vamos aplicar a Fórmula de Bhaskara.@2" +
                            "" +
                            "@cimg bhaskara cimg@ @1"+
                            "@cimg rmt510091 cimg@ @1"+
                            "@cimg rmt510092 cimg@ @1" +
                            "@cimg rmt510093 cimg@ @2" +
                            "" +
                            "Já sabemos as raízes, agora vamos esboçar o gráfico para entender melhor: @2" +
                            "@cimg rmt510094 cimg@ @2" +
                            "" +
                            "Analisando o gráfico, dá pra ver que o lucro (L) é maior do que 0 quando x é maior do que 10 e menor do que 50 (10 < x < 50).";
                    prerequisito = ""; break;
                case 10:

                    sourceString = "Observe a pirâmide representada abaixo.@2 " +
                            "@cimg mt510101 cimg@"+
                            "@1Se F é o número de faces e A é o número de arestas dessa pirâmide, F + A é igual a ";
                    qA = "10 ";
                    qB = "12 ";
                    qC = "16 ";
                    qD = "22 ";
                    resolucao = "Esta figura geométrica é uma pirâmide pentagonal, possui 6 vértices, 10 arestas e 6 faces. @1" +
                            "Se somarmos o número de faces (6) ao de arestas (10) teremos 16.";
                    prerequisito = ""; break;
                case 11:

                    sourceString = "Na aula de laboratório, um professor colocou vários pesos em uma mola e, com a ajuda dos alunos, "+
                            "mediu os respectivos alongamentos dessa mola. O gráfico abaixo mostra a relação entre o alongamento "+
                            "L, em centímetros, e a massa x do objeto, em gramas.@1"+
                            "@cimg mt510111 cimg@"+

                            "Qual é a expressão que permite calcular o alongamento L, em centímetros, em função da massa x, em "+
                            "gramas, dessa mola? ";
                    qA = "L = 4,0x ";
                    qB = "L = 2,5x ";
                    qC = "L = 0,4x ";
                    qD = "L = 0,25x ";
                    resolucao = "Essa questão quer que analisemos o gráfico para montar a equação que o representa. Então vamos começar: @2" +
                            "" +
                            "Essa é uma função L(x), onde L é alongamento e x é a massa do objeto. No gráfico, percebemos que quando a massa é 10, o alongamento é 2,5, ou seja, " +
                            "quando x é 10, L é 2,5. @2" +
                            "" +
                            "L(10) = 2,5. @2" +
                            "" +
                            "Analisando as alternativas, nós já sabemos que a equação se comporta assim: @2" +
                            "" +
                            "L = n.x @2" +
                            "" +
                            "Onde n é o número que precisamos encontrar, vamos substituir @bxb@ por @b10b@ e @bLb@ por @b  2,5 b@ para descobrir quem é @bnb@. @2" +
                            "" +
                            "2,5 = n.10 @1" +
                            "2,5/10 = n @1" +
                            "n = 0,25 @2" +
                            "" +
                            "Encontramos o valor de @bnb@, agora basta substituir: @2" +
                            "" +
                            "L = 0,25x"; prerequisito = ""; break;
                case 12:

                    sourceString = "Os dados do quadro abaixo mostram algumas infrações de trânsito e o valor da multa de cada uma delas.@2 "+
                            "@cimg mt510121 cimg@"+

                            "@1<small>Disponível em: www.detrannet.mg.gov.br. Acesso em: 22 fev. 212.</small> @2 "+
                            "Um motorista desatento recebeu, ao final do mês, uma notificação com as seguintes multas:@2"+
                            "- Duas infrações por dirigir veículo utilizando-se de telefone celular.@1"+
                            "- Uma infração por transitar em velocidade superior à máxima permitida em mais de 50%.@1"+
                            "@1Qual é o valor total relativo às multas recebidas por esse motorista? ";
                    qA = "R$ 659,75 ";
                    qB = "R$ 702,31 ";
                    qC = "R$ 744,88 ";
                    qD = "R$ 787,44 ";
                    resolucao = "Vamos lá, o motorista recebeu duas infrações por utilizar o celular e uma por transitar em alta velocidade, então fica assim: @2" +
                            "" +
                            "2x utilizar o celular + alta velocidade = multa total. @2" +
                            "" +
                            "- Dirigir veículo utilizando-se de telefone celular = 85,13 @1" +
                            "- Transitar em velocidade superior à máxima permitida em mais de 50% = 574,62. @2" +
                            "" +
                            "Agora basta substituir os valores: @2" +
                            "" +
                            "2x 85,13 + 574,62 = multa total @1" +
                            "170,26 + 574,62 = multa total @1" +
                            "744,88 = multa total."; prerequisito = ""; break;
                case 13:

                    sourceString = "Observe a representação de uma função do primeiro grau no plano cartesiano abaixo.@2 "+
                            "@cimg mt510131 cimg@ @2"+

                            "Qual é a representação algébrica dessa função? ";
                    qA = "y = 4x + 2 ";
                    qB = "y = 2x + 4 ";
                    qC = "y = – 2x + 4 ";
                    qD = "y = – 4x + 2 ";
                    resolucao = "Vamos destacar as características mais visíveis do gráfico e ir eliminando as equações erradas até restar apenas uma: @2" +
                            "" +
                            "- O gráfico é crescente (quanto maior o x, maior o y), um gráfico só será crescente se o @b a b@ (número que acompanha o x) for positivo, então já podemos descartar as alternativas " +
                            "C e D. @2" +
                            "" +
                            "- Quando x = 0, y = 4, perceba que quando x é 0, a reta está em cima do y = 4, então vamos tentar isso nas alternativas que sobraram e ver se funciona: @2" +
                            "" +
                            "@b Alternativa A: b@ @1" +
                            "y = 4x + 2 @1" +
                            "@b Se x for 0, fica: b@ @1" +
                            "y = 4.0 + 2 @1" +
                            "y = 2 @2" +
                            "" +
                            "Na alternativa A, quando o x = 0 o y = 2, e isso não bate com as características, do gráfico, então podemos descartar ela.@1" +
                            "Só sobrou a letra B, então será ela, mas vamos tirar a prova real: @2" +
                            "" +
                            "@b Alternativa B: b@ @1" +
                            "y = 2x + 4 @1" +
                            "@b Se x for 0, fica: b@ @1" +
                            "y = 2.0 + 4 @1" +
                            "y = 4 @2" +
                            "" +
                            "Realmente, está exatamente como previmos, quando x é 0, o y é 4, então a alternativa B é a correta." +
                            "" +
                            ""; prerequisito = ""; break;
                case 14:

                    sourceString = "No dia em que foi lançado um novo modelo de telefone celular, uma loja vendeu 1 024 aparelhos desse "+
                            "tipo. Em cada um dos nove dias seguintes, o número de aparelhos desse modelo que essa loja vendeu "+
                            "foi sempre igual à metade do que foi vendido no dia anterior.@1"+
                            "@1No total, quantos aparelhos desse modelo essa loja vendeu nesses dez dias? ";
                    qA = "2 040 ";
                    qB = "2 044 ";
                    qC = "2 046 ";
                    qD = "2 048 ";
                    resolucao = "Isso se trata de uma soma de todos os termos de uma PG finita, cuja fórmula é: @1" +
                            "@cimg somapgfinita cimg@ @2" +
                            "" +
                            "Onde: @1" +
                            "@b Sn b@ é a soma de todos os termos. @1" +
                            "@b a1 b@ é o valor do primeiro termo. @1" +
                            "@b q b@ é o quociente. @1" +
                            "@b n b@ é o termo final. @2" +
                            "" +
                            "Mas essa questão é \"chatinha\", uma das mais difíceis da prova, então se você " +
                            "teve dificuldade em resolver ela, não se preocupe, é normal que os alunos " +
                            "tenham dificuldade em resolvê-la, ainda mais quando estão muito tempo sem estudar. @2" +
                            "Vamos substituir os valores na fórmula que acharemos a resposta. @2" +
                            "" +
                            "@b n b@ é 10. @1" +
                            "@b a1 b@ é 1024. @1" +
                            "@b q b@ é 0,5 (multiplique 0,5 por um número para encontrar sua metade). @2" +
                            "" +
                            "" +
                            "@img rmt510141 img@ @2" +
                            "" +
                            "Ixi! que tanto de número é esse?@1" +
                            "Nessa hora temos que começar a manipular a equação para ela " +
                            "ficar mais simples, vamos tentar: @2" +
                            "" +
                            "0,5@sp10sp@ é um número difícil de calcular, então podemos substituir " +
                            "ele pela seu modo em fração 0,5 = 1/2 para ficar um pouco mais fácil, depois " +
                            "de transformar em fração, basta fazer a potência do numerador (número em cima) e do denominador (número em baixo). @2" +
                            "" +
                            "@img rmt510142 img@ @2" +
                            "" +
                            "Agora temos mais um problema, como diminuir uma fração por um número inteiro?@1" +
                            "Para isso existem diversas formas, vamos manipular o @b 1 b@ para que ele tenha a mesma " +
                            "base que o @b 1/1024b@, assim poderemos fazer uma subtração comum entre frações com o mesmo denominador. @2" +
                            "" +
                            "@img rmt510144 img@ @1" +
                            "@img rmt510145 img@ @1" +
                            "@img rmt510146 img@ @2" +
                            "" +
                            "Está melhorando! Agora temos uma multiplicação entre um número inteiro e uma fração, " +
                            "mas perceba que o denominador da fração é igual ao número inteiro, então podemos cortá-los. @2" +
                            "" +
                            "@img rmt510147 img@ @1" +
                            "@img rmt510148 img@ @2" +
                            "" +
                            "O numerador e o denominador possuem sinal negativo, então podemos cortá-lo também. @2" +
                            "" +
                            "@img rmt510149 img@ @2" +
                            "" +
                            "Próximo problema, como dividir um número inteiro por um número decimal?@1" +
                            "Vamos transformar o número decimal em uma fração, assim ficará mais fácil de compreender: @1" +
                            "" +
                            "" +
                            "@img rmt5101410 img@ @2" +
                            "" +
                            "Agora precisamos transformar o numerador em fração também, para facilitar o nosso cálculo. @2" +
                            "" +
                            "@img rmt5101411 img@ @2" +
                            "" +
                            "Divisão entre duas frações! Para isso, basta repetir a primeira fração " +
                            "e multiplicar pelo inverso da segunda: @2" +
                            "" +
                            "@img rmt5101412 img@ @2" +
                            "" +
                            "Finalmente! Encontramos a resposta.@1" +
                            "Como disse antes, não se preocupe se você teve dificuldades, " +
                            "essa é uma questão difícil e requer que você saiba diversas propriedades, " +
                            "a prática leva à perfeição, então só praticando você poderá fixar esse conteúdo em sua mente." +

                            " "; prerequisito = ""; break;
                case 15:

                    sourceString = "O administrador de um Museu lançou uma campanha publicitária para aumentar o número de visitantes.@1"+
                            "Após o início dessa campanha, ele percebeu que o número de visitantes foi aumentando mensalmente "+
                            "segundo uma progressão aritmética. Veja a seguir as anotações, relativas aos três primeiros meses de "+
                            "campanha, feitas por esse administrador.@2"+
                            "1º mês: 5 600 visitantes.@1"+
                            "2º mês: 6 200 visitantes.@1"+
                            "3º mês: 6 800 visitantes.@2"+
                            "Suponha que esse aumento continuará durante um ano de campanha.@1"+
                            "Sendo n o número do mês da campanha e v o número de visitantes, qual é a expressão que permite "+
                            "calcular o número de visitantes em cada mês? ";
                    qA = "v = 600n + 5 000 ";
                    qB = "v = 600n + 5 600 ";
                    qC = "v = 1 200n + 4 400 ";
                    qD = "v = 5 000n + 600 ";
                    resolucao = "Essa é uma questão de progressão aritimética, e ela quer que digamos qual a fórmula do " +
                            "termo geral dessa PA. Lembra que a fórmula do termo geral é: @2" +
                            "" +
                            "a@_n_@ = a@_1_@ + ( n - 1) · r @2" +
                            "" +
                            "@b a@_n_@ b@ é o termo geral. @1" +
                            "@b a@_1_@ b@ é o primeiro termo. @1" +
                            "@b n b@ é o posição do termo geral. @1" +
                            "@b a@_1_@ b@ é a razão da PA. @2" +
                            "" +
                            "Precisamos descobrir qual é a razão da PA, para descobrir isso, basta " +
                            "diminuirmos um termo pelo seu anterior. @2" +
                            "" +
                            "Vamos diminuir o segundo termo pelo primeiro: @2" +
                            "" +
                            "a@_2_@ - a@_1_@ = r@1" +
                            "6200 - 5600 = 600 @2" +
                            "" +
                            "Encontramos 600, vamos tirar a prova real: @2" +
                            "" +
                            "a@_3_@ - a@_2_@ = r @1" +
                            "6800 - 6200 = 600 @2" +
                            "" +
                            "Realmente a razão é 600. Sabemos que o primeiro termo (a@_1_@) é 5600, " +
                            "então vamos substituir na fórmula: @2" +
                            "" +
                            "a@_n_@ = a@_1_@ + ( n - 1) · r @1" +
                            "a@_n_@ = 5600 + (n - 1)· 600 @2" +
                            "" +
                            "Esta é nossa fórmula, mas a questão quer que simplifiquemos a equação: @2" +
                            "" +
                            "Então vamos multiplicar (n - 1) por 600 e ver como fica: @2" +
                            "" +
                            "a@_n_@ = 5600 + 600n - 600 @2" +
                            "" +
                            "Agora podemos fazer 5600 - 600: @2" +
                            "" +
                            "a@_n_@ = 5600 - 600 + 600n@1" +
                            "a@_n_@ = 5000 + 600n@2" +
                            "" +
                            "Tá aí nossa fórmula!" +
                            ""; prerequisito = ""; break;
                case 16:

                    sourceString = "Uma viga está apoiada em uma parede, conforme representado no desenho abaixo.@2 "+
                            "@cimg mt510161 cimg@"+

                            "@1Qual é o comprimento aproximado dessa viga? ";
                    qA = "5,25 m ";
                    qB = "6,00 m ";
                    qC = "7,00 m ";
                    qD = "7,56 m ";
                    resolucao = "@cimg mt510161 cimg@ @1"+

                            "Bem, temos um triângulo retângulo, o valor de um de seus lados e um ângulo, " +
                            "Então a única forma de descobrir o valor dos outros lados será usando o cosseno, seno ou tangente. @2" +
                            "" +
                            "Precisamos saber o valor da viga, e essa viga é o maior lado do triângulo, portanto ela é nossa hipotenusa.@1" +
                            "Nós temos o ângulo que fica entre a viga e o chão, logo o chão é o cateto adjacente.@1" +
                            "O cateto que está oposto ao ângulo é a parede, sendo assim a parede é o cateto oposto.@2" +
                            "" +
                            "Analisando esses dados, possuímos o valor do ângulo e do cateto oposto, em vista disso podemos utilizar o seno para descobrir o valor da hipotenusa, já que: @2" +
                            "" +
                            "@cimg rmt510161 cimg@ @2"+

                            "" +
                            "Divisão entre dois números decimais, vamos transformar em frações para facilitar o cálculo:@1" +
                            "" +
                            "@cimg rmt510162 cimg@ @2" +
                            "" +
                            "Agora aplicaremos aquela propriedade da dvisião entre frações: @1" +
                            "\"Em divisão entre frações, repita a primeira e multiplique pelo inverso da segunda.\"@1" +
                            "" +
                            "@cimg rmt510163 cimg@ @2" +
                            "" +
                            "O denominador da primeira fração é igual ao numerador da segunda, portanto podemos cortá-los. @1" +
                            "" +
                            "@cimg rmt510164 cimg@ @1" +
                            "@cimg rmt510165 cimg@ @1" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 17:

                    sourceString = "Na turma de Sara, fez-se uma pesquisa sobre o número de alunos que já viajaram de avião. Os resultados "+
                            "foram registrados no gráfico abaixo.@2 " +
                            "@cimg mt510171 cimg@ @2"+

                            "De acordo com os dados desse gráfico, constata-se que ";
                    qA = "30% dos alunos nunca viajaram de avião. ";
                    qB = "30% dos alunos viajaram de avião duas vezes. ";
                    qC = "40% dos alunos viajaram de avião apenas uma vez. ";
                    qD = "80% dos alunos já viajaram de avião. ";
                    resolucao = "" +
                            "Primeiramente precisamos saber quantos alunos temos na turma.@2" +
                            "" +
                            "Rapazes que nunca viajaram = 5;@1" +
                            "Moças que nunca viajaram = 3;@1" +
                            "Rapazes que viajaram uma vez = 6;@1" +
                            "Moças que viajaram uma vez = 7;@1" +
                            "Rapazes que viajaram duas vezes = 4;@1" +
                            "Moças que viajaram duas vezes = 5;@2" +

                            "Se somarmos isso tudo, fica: @2" +
                            "" +
                            "5+3+6+7+4+5 = 30. @2" +
                            "" +
                            "Sendo assim temos 30 alunos nessa turma.@1" +
                            "Agora podemos analisar as alternativas:@2" +
                            "" +
                            "@b Letra A: b@ @1" +
                            "Esta alternativa nos diz que 30% dos alunos nunca viajaram de avião, vamos ver:@2" +
                            "" +
                            "5 rapazes e 3 moças nunca viajaram, portanto 8 alunos nunca viajaram.@1" +
                            "10% de 30 = 3.@1" +
                            "30% de 30 = 9.@2" +
                            "" +
                            "8 alunos é menor do que 9, logo menos de 30% dos alunos nunca viajaram, logo a alternativa A está incorreta. @2" +
                            "" +
                            "" +
                            "@b Letra B: b@ @1" +
                            "Esta está nos dizendo que 30% dos alunos viajaram de avião duas vezes.@1" +
                            "4 rapazes e 5 moças viajaram duas vezes, então 9 alunos viajaram duas vezes.@1" +
                            "30% de 30 = 9.@2" +
                            "" +
                            "9 alunos constituem 30% da turma, e 30% dos alunos viajaram duas vezes, então a alternativa B está correta." +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 18:

                    sourceString = "Observe os desenhos abaixo.@2 "+
                            "@cimg mt510181 cimg@ @1"+

                            "@1Quais desses desenhos representam planificações de uma pirâmide reta de base quadrada? ";
                    qA = "I e III, apenas. ";
                    qB = "II e IV, apenas. ";
                    qC = "I, II e IV, apenas. ";
                    qD = "I, II, III e IV. ";
                    resolucao = "Isto é uma pirâmide reta de base quadrada:@1" +
                            "@cimg rmt510181 cimg@ @2"+
                            "" +
                            "Apenas as imagens I e III formam esse objeto." +
                            ""; prerequisito = ""; break;
                case 19:

                    sourceString = "Um recipiente cilíndrico cujo diâmetro da base é igual a 12 cm contém água até certa altura. Sofia colocou "+
                            "uma esfera de chumbo no interior do recipiente, que ficou totalmente submersa, e a altura da água desse "+
                            "recipiente subiu 1 cm.@1"+
                            "@1Qual é o raio dessa esfera? ";
                    qA = "2,0 cm ";
                    qB = "3,0 cm ";
                    qC = "3,5 cm ";
                    qD = "4,5 cm ";
                    resolucao = "Bem, o enunciado nos diz que há um recipiente cilíndrico. @1" +
                            "@cimg rmt510191 cimg@ @2"+
                            "" +
                            "Também nos revela o diâmetro da base deste cilindro.@1" +
                            "@cimg rmt510192 cimg@ @2"+
                            "" +
                            "E que Sofia colocou uma esfera de chumbo dentro desse recipiente, e a altura do líquido subiu em 1cm.@1" +
                            "@cimg rmt510193 cimg@ @2"+
                            "" +
                            "Bem, sabemos que a altura da água aumentou em 1 centímetro, então devemos calcular o volume que foi deslocado. O volume que deslocado será igual ao volume da esfera. @2" +
                            "" +
                            "Volume do cilíndro: π . r². h @2" +
                            "Não queremos saber o volume do cilíndro inteiro, só da parte que foi deslocada, sabemos que a altura aumentou em 1cm e sabemos que o raio é 6cm, portanto: @2" +
                            "" +
                            "Volume deslocado = π . 6@sp2sp@ . 1 @1" +
                            "Volume deslocado = π . 36 . 1 @1" +
                            "Volume deslocado = 36π @2" +
                            "" +
                            "Achamos a quantidade de volume deslocado, que será igual ao volume da esfera, agora que já sabemos o volume da esfera, basta descobrirmos o raio. @2" +
                            "" +
                            "@cimg rmt510194 cimg@ @2"+
                            "" +
                            "O enunciado não especificou o valor de π, sendo assim podemos considerá-lo como 3. " +
                            "" +
                            "@cimg rmt510195 cimg@"+
                            "" +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 20:

                    sourceString = "Uma fila é formada por 6 pessoas, entre as quais os amigos Arlindo, Breno e Clóvis, que ocupam posições "+
                            "consecutivas nessa fila, não necessariamente nessa ordem.@1"+
                            "@1De quantas maneiras distintas essas 6 pessoas podem estar dispostas nessa fila? ";
                    qA = "24 ";
                    qB = "72 ";
                    qC = "144 ";
                    qD = "240 ";
                    resolucao = "Como os três amigos sempre estão juntos, então é como se eles representassem uma só pessoa (grupo)! @2" +
                            "__, __, __, Arlindo, Breno, Clóvis @1" +
                            "__, __, __, Grupo @2" +
                            " Logo, tempos uma permutação de 4 elementos  @2" +
                            "P₄ = 4! = 4∙3∙2∙1=24 @2" +
                            " Mas, dentro do grupo, pode haver permutação de três elementos: @2" +
                            "P₃ = 3! = 3∙2∙1 = 6 @2" +
                            "O número de maneiras distintas que essas 6 pessoas podem estar dispostas nessa fila é @2" +
                            "P₄∙P₃ = 24∙6 ∴ P₄∙P₃ = 144 "; prerequisito = ""; break;
                case 21:

                    sourceString = "Os pontos M, N, P e Q são os vértices consecutivos de um retângulo, sendo N (3, 2) e P (9, 2). Esse retângulo "+
                            "situa-se no primeiro quadrante do plano cartesiano e um de seus lados mede 5 unidades de comprimento.@1"+
                            "@1Quais as coordenadas do vértice M desse retângulo? ";
                    qA = "(3, 5) ";
                    qB = "(3, 7) ";
                    qC = "(9, 5) ";
                    qD = "(9, 7) ";
                    resolucao = "Em primeiro lugar, precisamos criar o plano cartesiano para conseguir ver melhor o que o enunciado está dizendo.@2" +
                            "" +
                            "Sabemos que os pontos formam um retângulo quando conectados, também sabemos a localização de N e P. @1" +
                            "" +
                            "@cimg rmt510211 cimg@ @2" +
                            "" +
                            "" +
                            "A questão também nos diz que um dos lados vale 5, então basta usar estas informações para descobrir onde está localizado o vértice M. @1" +
                            "@cimg rmt510212 cimg@ @1" +
                            "" +
                            "" +
                            "z - 2 = 5 @1" +
                            "z = 5 + 2 @1" +
                            "z = 7 @2" +
                            "" +
                            "Logo o ponto M está localizado em (3,7)." +
                            "" +
                            ""; prerequisito = ""; break;
                case 22:

                    sourceString = "Observe as dízimas abaixo. @2" +
                            "I. 8,10110111011110... @1" +
                            "II. 9,05005000500005... @1" +
                            "III. 0,369369369369... @2" +
                            "Considerando-se o número de casas decimais apresentadas nesses números, quais dessas dízimas\n" +
                            "representam números irracionais? ";
                    qA = " I e II, apenas.";
                    qB = "I e III, apenas.";
                    qC = "II e III, apenas.";
                    qD = "I, II e III.";
                    resolucao = "Número Irracional é um número decimal infinito que não repete a mesma sequência numérica.@2" +
                            "" +
                            "0,369369369... É a única dizima que se repete, portanto ela é racional, 369 = 369 = 369. @2" +
                            "" +
                            "Já as dizimas I e II não repetem a mesma sequência numérica, sendo assim eles são irracionais. "; prerequisito = ""; break;

                case 23:

                    sourceString = "Duas urnas contêm, cada uma, 6 bolas brancas e 4 bolas pretas, todas do mesmo tamanho e confeccionadas "+
                            "com o mesmo material. Válter tirou, ao acaso, uma bola de cada urna.@1"+
                            "@1Qual é a probabilidade de ele ter tirado duas bolas brancas? ";
                    qA = "6/25 ";
                    qB = "9/25 ";
                    qC = "2/5 ";
                    qD = "3/5 ";
                    resolucao = "Temos 6 bolas brancas e 4 bolas pretas em cada urna, totalizando bolas em cada.@1" +
                            "Para calcularmos a chance de retirar uma bola branca ao acaso, precisamos saber quais possibilidades favoráveis e quais possibilidades totais. @2" +
                            "" +
                            "As possibilidades favoráveis são 6 (6 bolas brancas).@1" +
                            "As possibilidades totais são 10 (10 bolas ao total). @2" +
                            "" +
                            "Em vista disso, a probabilidade de retirar ao acaso uma bola branca em uma urna é de 6/10. @2" +
                            "" +
                            "Entretanto são duas urnas, como são eventos independentes, basta multiplicarmos uma probabilidade pela outra. @2" +
                            "" +
                            "6/10 · 6/10  @1" +
                            "36/100 @2" +
                            "" +
                            "Basta simplificarmos por 4: @2" +
                            "" +
                            "9/25"; prerequisito = ""; break;
                case 24:

                    sourceString = "Um produtor de leite armazena seu produto em caixas com a forma de bloco retangular com altura de 25 cm "+
                            "e capacidade de 1 litro. Ele deseja trocar as caixas por embalagens em forma de cilindro, de mesma altura "+
                            "e mesma capacidade.@1"+
                            "@1Para que isso ocorra, o raio da base dessa embalagem cilíndrica, em cm, deve ser igual a ";
                    qA = "@img mt51024a img@";
                    qB = "@img mt51024b img@";
                    qC = "@img mt51024c img@";
                    qD = "@img mt51024d img@";
                    resolucao =

                            "h = 25cm @1" +
                            "Vt = 1 litro convertendo = 1000 cm³ @1" +
                            "@1" +
                            "Cálculo de Volume do Cilindro @1" +
                            "V = π.r².h @1" +
                            "1000cm³ = π.r².h@1" +
                            "1000cm³ = π.r².25@1" +
                            "@1" +
                            "Cálculo de Volume do Paralelepípedo@1" +
                            "V =  l.l.h@1" +
                            "1000cm³ = l².25@1" +
                            "l² = 1000/25@1" +
                            "l² = 40c@1" +
                            "l = raizd_40@1" +
                            "@1" +
                            "Substituindo uma equação na outra temos.@1" +
                            "π.r².25  = (raizd_40)².25@1" +
                            "π.r² = 40@1" +
                            "r = raizd_40/π"; prerequisito = ""; break;
                case 25:

                    sourceString = "Elias é dono de uma loja de eletrodomésticos. Para que não tenha prejuízo, o preço de venda dos " +
                            "produtos que ele comercializa deve ser no mínimo 26% superior ao preço de custo. No entanto, como os " +
                            "clientes gostam de obter desconto no ato da compra, ele coloca os preços de venda de seus produtos " +
                            "acrescentando 80% ao preço de custo.@2" +
                            "Qual é o maior desconto, em percentual, que Elias pode conceder ao cliente, sobre o preço de venda, de " +
                            "maneira que ele não tenha prejuízo?  ";
                    qA = "70,0%";
                    qB = "54,0%";
                    qC = "32,5%";
                    qD = "30,0%";
                    resolucao = "Esta é uma pegadinha clássica, a maioria dos alunos erram essa questão, pois ela exige \n" +
                            "que você preste bastante atenção no enunciado. Nesses casos de aumento de preço de produtos, \n" +
                            "a melhor coisa a se fazer, é criar um preço (se o enunciado não te der um).@2\n" +
                            "\n" +
                            "Vamos supor que o valor de custo do produto seja @b 10 b@ reais. @1\n" +
                            "Se somarmos @b 26% b@ desse valor ao produto, teremos: @2\n" +
                            "\n" +
                            "10 + (10 . 26/100) = x @1" +
                            "10 + 26/10 = x @1" +
                            "10 + 2,6 = x @1" +
                            "12,60 = x @2" +
                            "\n" +
                            "Se aumentarmos em @b 80% b@ o valor de custo do produto teremos: @2" +
                            "\n" +
                            "10 + (10 . 80/100) = y @1" +
                            "10 + (80/10) = y @1" +
                            "10 + 8 = y @1" +
                            "18 = y @2\n" +
                            "\n" +
                            "Bem, agora sabemos que: @2\n" +
                            "\n" +
                            "- O valor de custo é @b 10b@.@1\n" +
                            "- O valor mínimo para obter lucro é @b 12,60b@.@1\n" +
                            "- O valor que ele venderá o produto é @b 18 b@. @2\n" +
                            "\n" +
                            "Então qual a porcentagem de desconto que ele pode dar?@1\n" +
                            "Ora, se o produto custa @b 18 b@ reais, o valor dele deverá ser @b 12,60 b@ ou superior para obter lucro.@1\n" +
                            "Para sabermos a porcentagem, basta descobrirmos quantos por centos @b 12,60 b@ é de @b 18b@. @2\n" +
                            "\n" +
                            "18 . (x/100) = 12,60 @1\n" +
                            "18 . x = 12,60 . 100 @1 \n" +
                            "18 . x = 1260 @1\n" +
                            "x = 1260/18 @1\n" +
                            "x = 70 @2\n" +
                            "\n" +
                            "@b 12,60 b@ equivale a @b 70% b@ de @b 18b@, portanto @b 70% b@ é o máximo de desconto que Elias poderá dar.\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n"; prerequisito = ""; break;
                case 26:

                    sourceString = "Os ingressos para um espetáculo teatral, de apresentação única, foram vendidos por R$ 15,00, quando "+
                            "comprados antecipadamente, e por R$ 28,00, no dia do espetáculo. Após a contabilização dos valores, "+
                            "verificou-se que o valor arrecadado foi de R$ 9 998,00 e que foram vendidos um total de 540 ingressos.@1"+
                            "@1Quantos ingressos foram vendidos no dia desse espetáculo? ";
                    qA = "146 ";
                    qB = "270 ";
                    qC = "394 ";
                    qD = "540 ";
                    resolucao = "Vamos fazer assim: @2" +
                            "" +
                            "x = ingressos antecipados.@1" +
                            "y = ingressos no dia. @2" +
                            "" +
                            "15x + 28y = arrecadação total. @1" +
                            "15x + 28y = 9998. @2" +
                            "" +
                            "Já temos nosso primeiro sistema, agora vamos construir o segundo. @2" +
                            "" +
                            "O enunciado nos diz que foram vendidos um total de 540 ingressos, então: @2" +
                            "" +
                            "x + y = 540. @2" +
                            "" +
                            "Segundo sistema formado, agora vamos relacionar os dois e ver os dados que conseguimos obter: @2" +
                            "" +
                            "15x + 28y = 9998 (I) @1" +
                            "x + y = 540 (II) @2" +
                            "" +
                            "Temos que tentar isolar um dos termos para sabermos seu valor, isolaremos o y, pois é ele quem estamos buscando.@1" +
                            "Perceba que se multiplicarmos a segunda equação por 15 obteremos: @2" +
                            "" +
                            "(x + y = 540).15 @1" +
                            "15x + 15y = 15.540 @1" +
                            "15x + 15y = 8100 @2" +
                            "" +
                            "Agora temos @b 15x b@ nos dois sistemas, podemos subtrair um pelo outro para isolar o @b y b@: @2" +
                            "" +
                            "15x + 28y = 9998 @1" +
                            "15x + 15y = 8100 @2" +
                            "" +
                            "(15x - 15x) + (28y - 15y) = (9998 - 8100) @1" +
                            "0 + 13y = 1898 @1" +
                            "13y = 1898 @1" +
                            "y = 1898/13 @1" +
                            "y = 146 @2" +
                            "" +
                            "Então 146 ingressos foram vendidos no dia." +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 27:

                    sourceString = "O quadro abaixo mostra o consumo de gasolina do carro de Silas, em três viagens. @1  "+
                            "@cimg mt510271 cimg@ @1"+

                            "Considerando-se as três viagens, qual foi o consumo médio de gasolina do carro de Silas? ";
                    qA = "6,6 km/litro ";
                    qB = "7,0 km/litro ";
                    qC = "7,3 km/litro ";
                    qD = "8,0 km/litro ";
                    
                    resolucao = "Média = número de KM rodados / número de litros gastos @2" +

                            "@b número de KM rodados b@ = @1" +
                            " 360+240+100= 700 KM  @2" +

                            "@b litros gastos b@ = @1 " +
                            "(360/6)+(240/8)+(100/10) = @1" +
                            " 60+30+10 = 100 litros @2" +

                            "logo, @1 " +
                            "Média= 700/100 = 7 KM/L"; prerequisito = ""; break;
                case 28:

                    sourceString = "Em uma livraria, os preços de alguns gêneros de livros sofreram desconto em uma promoção, como\n" +
                            "representado na tabela abaixo.@1" +
                            "@cimg mt510281 cimg@ "+

                            "@1 Qual é o valor total da compra de 15 livros de aventura nessa promoção? ";
                    qA = "R$ 450,00";
                    qB = "R$ 270,00";
                    qC = "R$ 45,00";
                    qD = "R$ 33,00";
                    resolucao = "Bem, o livro de aventura está em promoção e custa @b 18 b@ reais e " +
                            "a questão quer saber o valor de @b 15 b@ livros de aventura, então basta multiplicar " +
                            "@b 15 b@ por @b 18b@. @2" +
                            "" +
                            "@b 15 . 18 = 270 b@";
                    prerequisito = ""; break;
                case 29:

                    sourceString = "Paulo comprou uma moto cujo preço à vista era de R$ 10 200,00 e pagou em duas prestações iguais. @1" +
                            "Para fazer esse financiamento, a loja cobrou juros de 4% sobre o valor à vista da moto. @2" +
                            "Qual é o valor de cada uma dessas prestações?";
                    qA = "R$ 5 100,00";
                    qB = "R$ 5 202,00";
                    qC = "R$ 5 304,00";
                    qD = "R$ 5 508,00";
                    resolucao = "Primeiro fazemos uma regra de 3 para descobrir quantos ficará o valor total com o acréscimo de 4%:@2" +

                            "10.200 = 100% @1" +
                            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x = 104% @2" +

                            "100x = 10200 . 104 @1" +
                            "x = (10200 . 104)/100 @1" +
                            "x = 102 . 104 @1" +
                            "x = 10608 @2" +

                            "Portanto agora já sabemos o valor total com o acréscimo de 4%, agora basta dividir por 2 e encontrar a alternativa adequada:@2" +

                            "10608/2 = 5304 "; prerequisito = ""; break;
                case 30:

                    sourceString = "Para economizar papelão, um fabricante de sabão em pó mudou as dimensões da embalagem de 1 Kg.@1"+
                            "As duas embalagens têm o formato de um paralelepípedo retângulo e suas dimensões estão indicadas "+
                            "no desenho abaixo.@2 "+
                            "@cimg mt510301 cimg@ @2"+

                            "Considerando-se as medidas dadas e apenas a área externa das caixas, a economia de papelão que "+
                            "essa mudança resultou para a empresa, por caixa, foi de ";
                    qA = "12 cm2 ";
                    qB = "60 cm2 ";
                    qC = "100 cm2 ";
                    qD = "200 cm2 ";

                    resolucao = "@b Área da primeira caixa: b@ @2" +
                            "" +
                            "@b Áreas laterais b@ = 18 x 20 x 2 = 720 @1" +
                            "@b Áreas frontal e traseira b@ = 5 x 20 x 2 = 200 @1" +
                            "@b Área da base e da parte superior b@ = 5 x 18 x 2 = 180 @2" +
                            "@b Total b@ = 180+200+720= 1.100cm@sp2sp@" +

                            "@b Área da segunda caixa: b@ @2" +
                            "@b Áreas laterais b@ = 15 x 12 x 2 = 360 @1" +
                            "@b Áreas frontal e traseira b@ = 10 x 12 x 2= 240 @1" +
                            "@b Área da base e da parte superior b@ = 15 x 10 x 2= 300 @1" +
                            "@b Total b@ = 360+240+300 = 900cm@sp2sp@ @2" +

                            "Área da caixa 1 - Área da caixa 2 = Área economizada @1" +
                            "1.100 - 900 = 200cm2 ";
                    prerequisito = ""; break;

            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {

                case 1:

                    sourceString = "Os protozoários são organismos de diferentes habitats e hábitos de vida, sendo que algumas espécies "+
                            "são parasitas humanos, como os representados abaixo.@2 "+
                            "@cimg cn510011 cimg@"+
                            "@1<small>Disponível em: http://www.saaemachado.mg.gov.br/doencas.php. Acesso em: 5 abr. 212.</small> @2 "+
                            "Esses parasitas podem ser adquiridos por meio da ";
                    qA = "entrada da larva no organismo através do contato com solo contaminado. ";
                    qB = "ingestão de água e alimentos contaminados por cistos. ";
                    qC = "ingestão de cisticerco nas carnes de porco ou boi mal passadas. ";
                    qD = "picada de insetos que hospedam o parasita. ";
                    resolucao = "Cistos são uma espécie de ovos de parasita, muito resistêntes, podendo sobreviver por meses ou anos até serem ingeridos por outros seres.@1" +
                            "Esses cistos se transportam através de diverasos meios, corrente de ar, água, fezes de animais e etc, eles podem acabar parando em alimentos " +
                            "e na água, contaminando seus consumidores. Por isto é importante ferver a água e alimentos, é uma forma de eliminar os cistos e evitar doenças."; prerequisito = ""; break;
                case 2:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Mosquito transmissor da dengue já é resistente a diversos inseticidas "+
                            "Pesquisadores da Fundação Oswaldo Cruz, em Pernambuco, descobriram que o Aedes "+
                            "aegypti, transmissor da dengue [...] se tornou resistente a vários tipos de inseticidas comuns. A "+
                            "descoberta foi feita no insetário, onde 70 mil mosquitos são criados em laboratório. Nesse local, "+
                            "os estudiosos acompanham todas as etapas da vida do Aedes aegypti.@1"+
                            "@1<small>Disponível em: http://g1.globo.com/jornal-hoje/noticia/212/3/mosquito-transmissor-da-dengue-ja-e-resistente-diversos-inseticidas.html. Acesso em: 6 abr. 212.</small> @2 "+
                            "Essa resistência é resultante ";
                    qA = "da eliminação dos focos do mosquito feita com inseticidas caseiros. ";
                    qB = "da seleção dos mosquitos pela utilização de inseticidas potentes. ";
                    qC = "das aplicações do mesmo inseticida pelos órgãos governamentais. ";
                    qD = "das mutações selecionadas pelo uso indiscriminado de inseticidas. ";
                    resolucao = "Alguns mosquitos desenvolvem uma mutação que os deixa mais resistentes contra inseticidas, mas ao copularem, seus filhotes podem nascer com essa mutação ou não.@1" +
                            "O uso indiscriminado de inseticidas está matando os mosquitos que não possuem a mutação e deixando vivos os que possuem ela, portanto os mosquitos mutantes estão copulando com outros mosquitos mutante " +
                            "fazendo com que seus filhotes nasçam com esta mutação também.";
                    prerequisito = ""; break;
                case 3:

                    sourceString = "A respiração celular e a fermentação são processos responsáveis pela liberação de energia. Nesses "+
                            "processos ocorre também a liberação de gás carbônico.@1"+
                            "@1A formação desse gás ocorre através da quebra de moléculas de ";
                    qA = "água. ";
                    qB = "carboidratos. ";
                    qC = "minerais. ";
                    qD = "vitaminas. ";
                    resolucao = "Carboidratos geralmente seguem está forma: [C(H2O)]n, sendo n ≥ 7, logo quando essas moléculas são quebradas, ocorre a formação de CO@_2_@ (gás carbônico)."; prerequisito = ""; break;
                case 4:

                    sourceString = "Em um teste de colisão, visando a aumentar o nível de segurança no trânsito, um ônibus bate de frente " +
                            "com um carro pequeno. O ônibus tem como consequência a pintura estragada e o para-choques um " +
                            "pouco amassado. O carro ficou com toda a frente destruída; o motor desprendeu-se do chassi e empenou " +
                            "o eixo, além de quebrar o vidro dianteiro. @2" +
                            "O que pode ser dito sobre a força que um veículo faz sobre o outro?";
                    qA = "O carro, sendo menor, aplicou uma força menor sobre o ônibus. ";
                    qB = "O carro, mesmo sendo menor, aplicou uma força maior no ônibus.";
                    qC = "O ônibus, por ser bem maior, aplicou uma força maior sobre o carro. ";
                    qD = "O ônibus, mesmo sendo maior, aplicou a mesma força que o carro. ";

                    resolucao = "A Terceira Lei de Newton nos diz que sempre que aplicamos alguma força sobre um determinado objeto, esta força é aplicada também sobre nós.@1" +
                            "Ou seja, quando o carro e o ônibus bateram de frente um com o outro, a força que o carro aplicou no ônibus também foi aplicada contra ele mesmo e a força que o ônibus aplicou contra o " +
                            "carro também foi aplicada contra ele, portanto: @2" +
                            "" +
                            "- O carro recebeu a força do próprio carro e do ônibus. @1" +
                            "- O ônibus recebeu a força do próprio ônibus e do carro. @2" +
                            "" +
                            "Sendo assim o ônibus, mesmo sendo maior, aplicou a mesma força que o carro.";
                    prerequisito = ""; break;
                case 5:

                    sourceString = "Durante o processo evolutivo, novas espécies foram surgindo e as mais adaptadas ao ambiente "+
                            "perpetuaram-se, proporcionando a biodiversidade conhecida hoje. O surgimento dessa biodiversidade "+
                            "dependeu dos mecanismos evolutivos.@1"+
                            "Associe as duas colunas, relacionando os mecanismos evolutivos com a maneira como cada um atua.@1"+
                            "@cimg cn510051 cimg@"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "1, 2, 3, 4. ";
                    qB = "1, 4, 2, 3. ";
                    qC = "4, 1, 3, 2. ";
                    qD = "4, 2, 1, 3. ";
                    resolucao = "@b Mutação: b@ Cria novos genes que poderão ou não favorecer o aumento " +
                            "populacional de "+
                            "determinado grupo. @2" +
                            "" +
                            "@b Recombinação gênica: b@ Cria novos genótipos que poderão ser favoráveis ou não a determinado " +
                            "grupo @2" +
                            "" +
                            "@b Seleção Natural: b@ Escolhe os indivíduos melhor adaptados a determinado " +
                            "ambiente. @2" +
                            "" +
                            "@b Migração: b@ Altera a frequência gênica pela entrada ou saída de indivíduos " +
                                    "da população. @2" ; prerequisito = ""; break;
                case 6:

                    sourceString = "O odor característico dos peixes é atribuído à presença de trimetilamina, uma base nitrogenada. Muitas " +
                            "pessoas, antes de cozinhar ou assar o peixe, colocam vinagre ou suco de limão sobre o alimento para " +
                            "diminuir a liberação desse odor durante o preparo. @2" +
                            "O processo que explica a diminuição da liberação desse odor pela adição de vinagre ou suco de limão é a ";
                    qA = "diluição.";
                    qB = "dissociação.";
                    qC = "evaporação.";
                    qD = "neutralização.";
                    resolucao = "As @b aminas b@ têm caráter básico, a trimetil@baminab@, como o próprio nome já diz, é uma amina, portanto tem caráter básico.@1" +
                            "Vinagre e suco de limão são ácidos.@2" +
                            "" +
                            "Quando colocamos algo com caráter ácido em algo com caráter básico, ocorre a @b neutralização b@.";
                    prerequisito = "";

                    break;
                case 7:

                    sourceString = "Para que ocorra a percepção sensorial é necessário que a sensação detectada na pele seja conduzida "+
                            "por um _____________________ até o Sistema Nervoso________________ onde ela será analisada, e "+
                            "retornará por meio de um ___________________ que trará a resposta ao estímulo inicial.@1"+
                            "@1As palavras que completam corretamente essas lacunas são, respectivamente, ";
                    qA = "gânglio, medular, neurônio. ";
                    qB = "gânglio, periférico, nervo. ";
                    qC = "nervo, central, nervo. ";
                    qD = "nervo, cerebral, oligodendrócito. ";

                    resolucao = "Para que ocorra a percepção sensorial é necessário que a sensação detectada na pele seja conduzida "+
                            "por um @b nervo b@ até o Sistema Nervoso @b Central b@ onde ela será analisada, e "+
                            "retornará por meio de um @b nervo b@ que trará a resposta ao estímulo inicial.@1";

                    prerequisito = ""; break;
                case 8:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "@cimg cn510081 cimg@"+

                            "@1<small>Disponível em: http://ciceroart.blogspot.com.br/209/11/mais-uma-de-aquecimento-global.html. Acesso em: 26 mar. 212.</small> @2 "+
                            "A intensificação do problema ambiental abordado nessa charge é uma consequência de diferentes ações "+
                            "antrópicas sobre o meio ambiente.@1"+
                            "@1Essas ações apresentam em comum o fato de interferirem no ciclo biogeoquímico do ";
                    qA = "cálcio. ";
                    qB = "carbono. ";
                    qC = "fósforo. ";
                    qD = "nitrogênio. ";

                    resolucao = "A charge está falando sobre o aquecimento global. @1" +
                            "O principal gás que está promovendo esse super aquecimento global é o gás carbônico que é gerado através de ações antrópicas (dos seres humanos), " +
                            "em vista disso, essas ações apresentam em comum o fato de interferirem no ciclo biogeoquímico do carbono.  ";
                    prerequisito = ""; break;
                case 9:

                    sourceString = "A caatinga, bioma exclusivamente nacional, tem sua maior extensão no semiárido nordestino, sendo "+
                            "encontrado também no extremo norte do estado de Minas Gerais.@1"+
                            "Nessas áreas vivem as cactáceas, plantas adaptadas a esse bioma por apresentarem:@2"+
                            "I - Caules capazes de armazenar água.@1"+
                            "II - Folhas transformadas em espinhos.@1 "+
                            "III - Raízes escassas, longas e profundas.@1 "+
                            "IV - Sementes que estocam água para germinar. @2 "+
                            "Estão corretas apenas as afirmativas ";
                    qA = "I e II. ";
                    qB = "I e IV. ";
                    qC = "II e III. ";
                    qD = "III e IV. ";

                    resolucao = "A caatinga é um bioma com solo com baixa fertilidade e pedregoso, baixo índice de chuvas e clima quente. Tendo isso " +
                            "em mente, analisemos as afirmativas: @2 " +
                            "" +
                            "@b I - Caules capazes de armazenar água. b@@1" +
                            "Sim, a caatinga possui um baixo índice chuvas, portanto os caules das árvores necessitam armazenar água para que elas sobrevivam. @2" +
                            "" +
                            "@b II - Folhas transformadas em espinhos. b@ @1 " +
                            "Sim, as folhas perdem muita água por transpiração. Então as árvores substituem suas folhas por espinhos para poder economizar a maior quantidade " +
                            "de água possível. @2" +
                            "" +
                            "@b III - Raízes escassas, longas e profundas. b@ @1 " +
                            "Não, as raízes são profundas para poder obter mais umidade do solo, mas não são escassas. @2" +
                            "" +
                            "@b IV - Sementes que estocam água para germinar. b@ @1 "+
                            "Não, as sementes da caatinga não possuem a habilidade de estocar água para germinar." +
                            ""; prerequisito = ""; break;
                case 10:

                    sourceString = "Em 1838, foi proposta a teoria celular por Schleiden e Schwann, segundo a qual todo ser vivo é formado por "+
                            "células. Sabe-se que as células apresentam estruturas diferenciadas que exercem funções específicas.@1"+
                            "Associe as duas colunas, relacionando as estruturas celulares às suas respectivas funções.@1"+
                            "@cimg cn510101 cimg@"+

                            "@2A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "1, 4, 3, 2, 5. ";
                    qB = "1, 3, 5, 4, 2. ";
                    qC = "4, 2, 3, 1, 5. ";
                    qD = "4, 2, 5, 1, 3. ";


                    resolucao =
                            "@b Ribossomos: b@ Síntese de proteínas citoplasmáticas. @2" +

                            "@b Complexo golgiense: b@ Secreção de substâncias celulares. @2" +

                            "@b Membrana celular: b@ Proteção do citoplasma.@2" +

                            "@b Mitocôndria: b@  Produção de energia pela respiração celular. @2" +

                            "@b Ácido desoxirribonucleico: b@ Comando das atividades celulares. @2" +

                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 11:

                    sourceString = "A água usada no preparo de café ou chá pode ser aquecida em uma chaleira. Durante esse aquecimento, " +
                            "observa-se que ela entra em ebulição produzindo um vapor esbranquiçado que sai do bico da chaleira. @2" +
                            "A cor branca desse vapor é resultado da";

                    qA = "condensação da água em pequenas gotículas suspensas no ar. ";
                    qB = "dissolução e desprendimento do ar presente na água durante a ebulição. ";
                    qC = "formação do oxigênio e hidrogênio pela decomposição das moléculas de água. ";
                    qD = "passagem da água para o estado sólido devido ao resfriamento. ";

                    resolucao = "Ao entrar em ebulição, a água se transforma em vapor, entretanto quando esse vapor entra em contato com o ar, começa a esfriar e " +
                            "condensar, se transformando em pequenas gotículas suspensas no ar."; prerequisito = ""; break;
                case 12:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Pesquisadores da Universidade Regional do Cariri (URCA) desenterraram fósseis de duas "+
                    "espécies de ouriços-do-mar no sertão nordestino. Os fósseis desses animais foram datados "+
                            "como tendo vivido há 110 milhões de anos, quando os dinossauros ocupavam boa parte da Terra.@1"+
                            "@1<small>Disponível em: http://www.ufcg.edu.br/prt_ufcg/assessoria_imprensa/mostra_noticia.php?codigo=692. Acesso em: 23 mar. 212.</small> @2 "+
                            "Adaptado para fins pedagógicos.@1"+
                            "@1A presença desses fósseis no sertão nordestino é uma prova de que ";
                    qA = "o ouriço colonizou o sertão nordestino. ";
                    qB = "o mar cobria o sertão no passado. ";
                    qC = "os animais foram transportados pelos humanos. ";
                    qD = "os grandes açudes faziam parte do semiárido. ";
                    resolucao = "Bem, encontraram fósseis de ouriços-do-@bmarb@ e esses animais vivem no @b mar b@ e estão datados como tendo vivido há 110 milhões de anos, " +
                            "portanto tudo indica que há 110 milhões de anos, o mar cobria o sertão nordestino e esses animais viveram lá."; prerequisito = ""; break;
                case 13:

                    sourceString = "Desde a revolução verde, o uso de defensivos agrícolas tem aumentado significativamente, bem como a "+
                            "utilização de adubos químicos para garantir uma boa produtividade e rentabilidade.@1"+
                            "@1Uma maneira de reduzir o impacto ambiental provocado por esses produtos é fazer a adoção de ";
                    qA = "controle biológico e adubação verde. ";
                    qB = "espécies exóticas e fertilizantes fosfatados. ";
                    qC = "máquinas agrícolas movidas a gasolina. ";
                    qD = "rotação de culturas de leguminosas. ";

                    resolucao = "Primeiro temos que raciocinar sobre quais impactos estamos falando, só aí conseguiremos pensar numa maneira de reduzí-los. @2" +
                            "" +
                            "@b Defensivos agrícolas b@ desequilibram o lugar onde são lançados, pois eles servem para matar insetos e outras plantas que não sejam as plantas " +
                            "que estão sendo cultivadas, então isso acaba contaminando o ar e recursos hídricos, expulsando ribeirinhos de suas casas e afetandoa as espécies nativas do local. @2" +
                            "" +
                            "@b Adubos químicos b@ causam o mesmo problema, eles poluem o local onde são aplicados e isso afeta diretamente a vida próxima do local. @2" +
                            "" +
                            "Tendo esses impactos em vista, a forma de reduzí-los, seria reduzindo o uso desses defensivos agrícolas e adubos químicos. @2" +
                            "" +
                            " Para evitar os defensivos agrícolas, podemos usar o @b controle biológico b@, que seria inserir outras espécies neste local que matassem as espécies que prejudicam o cultivo," +
                            " ou seja, inserir parasitas, predadores, micro-organismos e etc, que não atrapalhassem o cultivo, mas sim ajudasse no controle de pragras, ou seja, utilizar seres vivos ao invés de usar venenos. @2" +
                            "" +
                            "Para evitar o uso de adubos químicos, pode-se utilizar a @b adubação verdeb@, que se trata de plantar leguminosas no solo, essas leguminosas capitam nutrientes no ar (principalmente " +
                            "o nitrogênio) e os colocam no solo, fazendo com que o solo fique mais rico e fértil, sem que seja preciso utilizar adubos químicos que contaminam as plantas e toda a área em torno deles. "; prerequisito = ""; break;
                case 14:

                    sourceString = "A insulina humana, produzida por bactéria geneticamente modificada, foi o primeiro medicamento criado "+
                            "pela tecnologia do DNA recombinante. Antes da criação dessa insulina, essa proteína essencial para "+
                            "muitos portadores de diabetes era extraída do pâncreas de bois e porcos, o que muitas vezes lhes "+
                            "causavam problemas.@1"+
                            "@1A vantagem da utilização da insulina recombinante é que ela ";
                    qA = "apresenta maior quantidade de aminoácidos do que a natural, o que reduz o seu consumo. ";
                    qB = "é idêntica à produzida pelo organismo, evitando, assim, as possíveis reações alérgicas. ";
                    qC = "é produzida por animais domésticos, apresentando, assim, um preço reduzido. ";
                    qD = "estimula a produção de anticorpos pelos diabéticos, tornando-os imunes a doenças. ";
                    resolucao = "A insulina recombinante é obtida por meio de uma técnica da engenharia genética chamada DNA " +
                            "recombinante. Esta técnica consiste na inserção do gene humano codidficador da " +
                            "insulina em um microorganismo que passa a produzir esse hormônio. A insulina " +
                            "recombinante é mais vantajosa em relação àquela extraída de outros animais, pois " +
                            "é idêntica à produzida pelo organismo e elimina quase totalmente o risco de haver rejeição do hormônio pelo organismo " +
                            "humano.";
                    prerequisito = ""; break;
                case 15:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "@b Hidrelétrica de Belo Monte: impactos ambientais b@ @2"+
                            "O projeto, aprovado para licitação, embora afirme que as principais obras ficarão fora dos "+
                            "limites das terras indígenas, desconsidera e/ou subestima os reais impactos ambientais, sociais, "+
                            "econômicos e culturais do empreendimento. Além disso, é esperado que a obra intensifique o "+
                            "desmatamento e incite a ocupação desordenada do território, incentivada pela chegada de "+
                            "migrantes em toda a bacia e que, de alguma forma, trarão impactos sobre as populações indígenas.@1"+
                            "@1<small>Disponível em: http://www.problemasambientais.com.br/impactos-ambientais/hidreletrica-de-belo-monte-impactos-ambientais/. Acesso em: 10 abr. 212.</small> @2 "+
                            "Um dos possíveis impactos sobre a população indígena relaciona-se à ";
                    qA = "ampliação e conservação das reservas naturais da terra indígena. ";
                    qB = "elevação do percentual de pescados e da caça na área de reserva. ";
                    qC = "exposição a diferentes tipos de parasitas introduzidos por migrantes. ";
                    qD = "preservação da cultura indígena pela convivência com migrantes. ";

                    resolucao = "A construção de uma hidrelétrica, não é algo simples. Necessita de muita mão de obra, especializada como a de engenheiros e não-especializada como " +
                            "a de construtores, portanto há um fluxo muito alto de migrantes para que uma hidrelétrica possa ser construída e mantenha seu funcionamento. @1" +
                            "Esses migrantes que trabalham na hidrelétrica, precisam comer, dormir, ter um tempo de lazer, transporte e etc... para que isso seja possível, " +
                            "será necessário que criem esses serviços próximo à hidrelétrica, o que aumenta o fluxo de migrantes para que possam trabalhar nesses serviços. @2" +
                            "" +
                            "Todo esse fluxo de migrantes vindo de várias partes do Brasil e até mesmo do mundo, expõe os indígenas a diferentes tipos de parasítas, que, antes, não " +
                            "eram encontrados naquele local.";
                    prerequisito = ""; break;
                case 16:

                    sourceString = "A classificação dos seres vivos em cinco reinos foi proposta por R. H. Whittaker, em 1969, sendo a mais "+
                            "usada atualmente. A imagem abaixo mostra seres vivos pertencentes a um desses reinos.@1"+
                            "@cimg cn510161 cimg@ @1"+

                            "Os indivíduos desse reino caracterizam-se por ";
                    qA = "apresentarem parede celular constituída de quitina. ";
                    qB = "apresentarem glicogênio como reserva energética. ";
                    qC = "serem constituídos por células procariotas. ";
                    qD = "serem constituídos por diferentes tipos de tecidos. ";

                    resolucao = "O reino ilustrado na imagem, se trada do Reino Vegetal (Plantae) e a característica dos seres deste reino é que eles são " +
                            "constituídos por diferentes tipos de tecidos."; prerequisito = ""; break;
                case 17:

                    sourceString = "A maioria das lesões na medula espinhal é causada por fraturas ou compreensão das vértebras que "+
                            "acabam destruindo os axônios. Uma lesão na medula espinhal pode danificar alguns, muitos ou quase "+
                            "todos os axônios. Dessas lesões, algumas serão totalmente recuperadas, enquanto outras podem resultar "+
                            "em paralisia completa.@1"+
                            "@1Essa paralisia ocorre devido à ";
                    qA = "ausência das proteínas nas fibras musculares que impedem a contração. ";
                    qB = "baixa produção de energia pelas células do músculo que foi lesionado. ";
                    qC = "lesão no Sistema Nervoso, que deixa de conduzir o impulso à musculatura. ";
                    qD = "lesão no Sistema Ósseo, que passa a impedir a sustentação muscular. ";

                    resolucao = "Quando os impulsos nervosos atingem as extremidades do axônio da célula, ocorre liberação " +
                            "de substâncias químicas denominadas neurotransmissores, que " +
                            "tem a capacidade de se combinar com receptores presentes na membrana das célula, desencadeando " +
                            "o impulso nervoso, mas se esses axônios forem destruídos, os impulsos irão atingir as células e serão perdidos, já que elas não " +
                            "poderão liberar os neurotransmissores, logo os impulsos os impulsos não serão conduzidos à musculatura.";

                    prerequisito = ""; break;

                case 18:

                    sourceString = "O consumo de energia é cada vez maior em nosso planeta, por isso é constante a busca por novas fontes "+
                            "energéticas. Hoje, preferem-se as fontes renováveis, pois oferecem menor (ou nenhum) impacto ao meio ambiente.@1"+
                            "@1Qual fonte de energia é considerada renovável? ";
                    qA = "Carvão Mineral. ";
                    qB = "Eólica. ";
                    qC = "Gás Natural. ";
                    qD = "Petróleo. ";

                    resolucao = "A única fonte de energia renovável nas alternativas é a energia eólica, pois ela depende dos ventos e os ventos podem ser renovados, " +
                            "diferente do carvão mineral, gás natural e petróleo que irão acabar um dia."; prerequisito = ""; break;
                case 19:

                    sourceString = "O inverno é a estação mais fria do ano. Isso faz com que pessoas, quando em períodos de folga, "+
                            "aconcheguem-se ao Sol para se aquecer. A energia solar conforta, atenuando a sensação de frio.@1"+
                            "@1De que forma a energia enviada pelo Sol chega até os corpos das pessoas? ";
                    qA = "Condução. ";
                    qB = "Convecção. ";
                    qC = "Irradiação. ";
                    qD = "Irrigação. ";

                    resolucao =
                            "@b Condução: b@ Tipo de propagação do calor que consiste na transferência de energia térmica entre as partículas que compõe o sistema. Por exemplo: coloca-se uma das extremidades de uma barra metálica na chama de fogo. Após alguns instantes, percebe-se que a outra extremidade também esquenta, mesmo estando fora da chama de fogo.@2" +
                            "@b Convecção: b@ É o tipo de propagação do calor que ocorre nos fluidos em geral em decorrência da diferença de densidade entre as partes que formam o sistema. Por exemplo: na geladeira os alimentos são resfriados dessa forma. Como sabemos, o ar quente é menos denso que o ar frio e é por esse motivo que o congelador fica na parte de cima da geladeira. @2" +
                            "@b Irradiação: b@ A condução e a convecção são formas de propagação de calor que para ocorrer é necessário que haja meio material, contudo, existe uma forma de propagação de calor que não necessita de um meio material (vácuo) para se propagar, esta é a irradiação térmica. Esse tipo de propagação do calor ocorre através dos raios infravermelhos que são chamadas ondas eletromagnéticas. É dessa forma que o Sol aquece a Terra todos os dias. @2" +
                            "@b Irrigação: b@ É uma técnica utilizada para fornecer água para as plantas.  @2" +
                            "" +
                            "Irradiação é a opção correta.";
                    prerequisito = ""; break;
                case 20:

                    sourceString = "Durante uma viagem de férias, Lucas dirige seu automóvel de massa 1 t por uma rodovia. O limite de "+
                            "velocidade estipulado naquele local é de 110 km/h. Para ter certeza de que não será multado, impõe uma "+
                            "velocidade constante de 108 km/h em seu deslocamento.@1"+
                            "@1Qual é a energia cinética do automóvel de Lucas nesse trecho da viagem? ";
                    qA = "5 832 000 J ";
                    qB = "450 000 J ";
                    qC = "5 832 J ";
                    qD = "450 J ";

                    resolucao = "A questão deseja saber a energia cinética do carro e te dá alguns dados. @1" +
                            "Mas perceba que, logo de início, há uma pegadinha. A questão te dá a massa em tonelada e " +
                            "te dá a velocidade em kilometros por hora. Se você colocar esses dados na fórmula, você realmente " +
                            "vai encontrar um resultado que está nas alternativas, mas estará errado. @1" +
                            "Isso porque a fórmula de energia cinética, necessita que a massa esteja em @b kg b@ e " +
                            "que a velocidade esteja em @b m/sb@, então antes de colocar na fórmula, precisamos converter os dados. @2" +
                            "" +
                            "" +
                            "Para converter tonelada para kilos,  basta multiplicar por 1000. Sendo assim: @2" +
                            "" +
                            "@b 1t = 1000kg b@ @2" +
                            "" +
                            "Para converter km/h para m/s, basta dividir por 3,6: @2" +
                            "" +
                            "@cimg rcn510202 cimg@ @2" +
                            "" +
                            "Agora que temos nossos dados convertidos, 1000kg e 30m/s, podemos utilizar a fórmula da energia cinética: @2" +
                            "" +
                            "@cimg rcn510201 cimg@ @1" +
                            "@cimg rcn510203 cimg@ @2" +
                            "" +
                            "Logo a energia cinética do automóvel de Lucas nesse trecho da viagem é de 450000J." +
                            "" +
                            "" +
                            "";
                    prerequisito = "";
                    break;

                case 21:

                    sourceString = "Luciano precisa deslocar a máquina de costuras de sua avó de um lado a outro no cômodo onde ela se "+
                            "encontra. A distância entre o ponto no qual a máquina está até onde ela deve ficar é de 200 cm. Aplicando "+
                            "uma força constante de 30 N na mesma direção do movimento, ele consegue realizar o deslocamento.@1"+
                            "@1Qual é o valor do trabalho da força aplicada por Luciano em unidades do Sistema Internacional? ";
                    qA = "60 J ";
                    qB = "60 N ";
                    qC = "6000 J ";
                    qD = "6000 N ";

                    resolucao = "O trabalho é dado pela fórmula: @2" +
                            "T = F . d @2" +
                            "" +
                            "@b T b@ é o trabalho, dado em J (Joule). @1" +
                            "@b F b@ é a força, dada em N (Newton). @1" +
                            "@b d b@ é a distância, dada em metros. @2" +
                            "" +
                            "A força já foi dada em @b N b@, mas a distancia foi dada em centímetros, então precisamos converter para metros. @2" +
                            "" +
                            "200cm/100 = 2m @2" +
                            "" +
                            "T = F . d @1" +
                            "T = 30 . 2 @1" +
                            "T = 60 J"
                            ; prerequisito = ""; break;
                case 22:

                    sourceString = "Em um aparelho de som acontecem várias conversões de energia, desde o fio de alimentação ligado à "+
                            "tomada na parede até a saída do som nos alto-falantes.@1"+
                            "@1Basicamente, um alto-falante converte energia ";
                    qA = "elétrica em magnética. ";
                    qB = "elétrica em sonora. ";
                    qC = "magnética em sonora. ";
                    qD = "magnética em mecânica. ";

                    resolucao = "O texto nos diz que o fio de alimentação ligado à tomada na parede, portanto o fio de alimentação está recebendo energia elétrica " +
                            "e transformando essa energia em som, pode ser uma música por exemplo, sendo assim, um alto falante converte energia elétrica em sonora.";
                    prerequisito = ""; break;
                case 23:

                    sourceString = "Uma lâmpada de vapor de mercúrio solta-se do bocal onde fora instalada a 11,25 m de altura. A aceleração "+
                            "da gravidade nesse local é de 10 m/s².@1"+
                            "@1Qual é a velocidade da lâmpada ao atingir o solo? ";
                    qA = "10,6 km/h ";
                    qB = "15,0 km/h ";
                    qC = "38,2 km/h ";
                    qD = "54,0 km/h ";
                    resolucao = "Para resolver esta equação, iremos utilizar a Equação de Torricelli: @2" +
                            "" +
                            "V@_f_@@sp2sp@ = V@_i_@@sp2sp@ + 2 . a . ∆S @2" +
                            "" +
                            "@b V@_f_@ b@ é velocidade final. @1" +
                            "@b V@_i_@ b@ é a velocidade inicial. @1" +
                            "@b a b@ a é a aceleração. @1" +
                            "@b ∆S b@ é o deslocamento. @2" +
                            "" +
                            "Precisamos descobrir a @b velocidade finalb@, que é a velocidade na qual a lâmpada atingiu o solo. @2 " +
                            "Os dados que temos: @2" +
                            "" +
                            "- @b Velocidade inicial = 0 b@, pois no momento em que a lâmpada se soltou do bocal, ela tinha velocidade igual a zero. @1" +
                            "- @b Aceleração = 10 m/s b@ @1" +
                            "- @b ∆S = 11,25m b@ já que a altura do bocal onde a lâmpada foi instalada é de 11,25m, ela se deslocou nesse espaço até atingir o chão. @2" +
                            "" +
                            "As unidades estão todas em metros e segundos, portanto não precisamos converter nada para realizar o cálculo da fórmula. @2" +
                            "" +
                            "V@_f_@@sp2sp@ = V@_i_@@sp2sp@ + 2 . a . ∆S @1" +
                            "V@_f_@@sp2sp@ = 0 + 2 . 10 . 11,25 @1" +
                            "V@_f_@@sp2sp@ =  2 . 112,5 @1" +
                            "V@_f_@ = @img raiz225 img@ @1" +
                            "V@_f_@ = 15 m/s @2" +
                            "" +
                            "Já que as alternativas estão em @b km/h b@, devemos converter os valores. Para converter m/s para km/h, basta multiplicar o valor por 3,6. @2" +
                            "" +
                            "15 . 3,6 = 54 @2" +
                            "" +
                            "Logo a velocidade da lâmpada ao atingir o solo é de 54km/h." +
                            "" +
                            "" +
                            "  "; prerequisito = ""; break;
                case 24:

                    sourceString = "Marta possui em sua casa vários aparelhos elétricos. Todos os dias, ela gasta 30 min passando roupas, "+
                            "15 min tomando banho e 15 min secando o cabelo com um secador elétrico. Enquanto ela realiza todas "+
                            "essas atividades, o rádio fica ligado para ouvir música. O quadro abaixo mostra a potência dos aparelhos "+
                            "da casa de Marta.@1"+
                            "@cimg cn510241 cimg@"+

                            "@1Qual aparelho proporciona maior custo diário na casa de Marta? ";
                    qA = "Chuveiro. ";
                    qB = "Ferro de passar. ";
                    qC = "Rádio. ";
                    qD = "Secador de cabelo. ";
                    resolucao = "Quanto maior o consumo elétrico, maior o gasto, sendo assim basta encontrar o aparelho que " +
                            "mais consome energia na casa de Marta e ele será o que proporciona maior custo diário na casa dela. @2" +
                            "" +
                            "O ferro de passar consome 1000 Watts a cada hora e ela o usa por 30 minutos (1/2 hora).@1" +
                            "Ferro = 1000 . 1/2 = 500. @1" +
                            "O ferro consome 500 Watts por dia. @2" +
                            "" +
                            "O chuveiro consome 1900 Watts a cada hora e ela o usa por 15 minutos (1/4 hora).@1" +
                            "Chuveiro = 1900 . 1/4 = 475. @1" +
                            "O chuveiro consome 475 Watts por dia. @2" +                            "" +
                            "" +
                            "O secador de cabelo consome 1250 Watts a cada hora e ela o usa por 15 minutos (1/4 hora).@1" +
                            "Secador = 1250 . 1/4 = 312,5. @1" +
                            "O secador consome 312,5 Watts por dia. @2" +                            "" +
                            "" +
                            "O rádio consome 150 Watts a cada hora e ela o usa enquanto realiza as outras tarefas, " +
                            "@b 30 minutos + 15 minutos + 15 minutos = 1 hora b@.@1" +
                            "Rádio = 150 . 1 = 150. @1" +
                            "O rádio consome 150 Watts por dia. @2" +                            "" +
                            "" +
                            "Portanto o ferro de passar proporciona maior custo diário na casa de Marta."; prerequisito = ""; break;
                case 25:

                    sourceString = "Uma máquina térmica funciona em ciclos, absorvendo 8 753 cal. Após a realização do trabalho, a variação "+
                            "de sua energia interna atinge o valor de 3 425 cal.@1"+
                            "@1Qual é o trabalho realizado por está máquina térmica? ";
                    qA = "5 328 cal ";
                    qB = "– 5 328 cal ";
                    qC = "12 178 cal ";
                    qD = "– 12 178 cal ";

                    resolucao = "Nessa questão teremos que usar a Primeira Lei da Térmodinâmica. @2" +
                            "" +
                            "Q = t + ΔU @2" +
                            "" +
                            "@b Onde: b@ @1" +
                            "Q = Quantidade de calor; @1" +
                            "t = trabalho; @1" +
                            "ΔU = Variação de energia interna. @2" +
                            "" +
                            "Sabemos que a quantidade de calor é 8 753 cal.@1" +
                            "A variação de energia interna é de 3425 cal. @1" +
                            "Agora só falta descobrir o trabalho, vamos utilizar a fórmula. @2" +
                            "" +
                            "Q = t + ΔU @1" +
                            "8753 = t + 3425 @1" +
                            "8753 - 3425 = t @1" +
                            "5328 = t @2" +
                            "" +
                            "Portanto o trabalho realizado pela máquina térmica é de 5328 cal.";
                    prerequisito = ""; break;
                case 26:

                    sourceString = "O ferro de passar roupas é um aparelho de grande consumo de energia, pois possui uma potência "+
                            "elevada. Por isso, deve ser ligado à rede elétrica por meio de um cabo mais grosso para suportar a "+
                            "corrente que o percorrerá durante o seu funcionamento. Um ferro de potência 1 kW é ligado à rede "+
                            "elétrica que disponibiliza 125 V.@1"+
                            "@1Qual é a corrente elétrica que passará pelo cabo desse ferro? ";
                    qA = "8 x 10@sp-3sp@ A ";
                    qB = "8 x 10@sp0sp@ "+
                            " A ";
                    qC = "1,25 x 10@sp-1sp@ A ";
                    qD = "1,25 x 10@sp2sp@ A";
                    resolucao = "Utilizaremos, nessa questão de eletrodinâmica, a Lei de Ohm que diz: @2" +
                            "" +
                            "@cimg rcn510261 cimg@ @2"+
                            "" +
                            "@b Onde: b@ @1" +
                            "" +
                            "I = Corrente elétrica (Amperes - A) @1" +
                            "P = Potência (Watts - W) @1" +
                            "V = Voltagem (Volts - V) @2" +
                            "" +
                            "Sabemos que a potência do ferro é de @b 1 kW (1000 W) b@ e sabemos que a voltagem é de @b 125 V b@. Agora " +
                            "basta substituir os dados na fórmula: @2" +
                            "" +
                            "@cimg rcn510262 cimg@ @2" +
                            "" +
                            "Sabemos que a amperagem (corrente elétrica) é 8A. @2" +
                            "" +
                            "Todavia não existe nenhum 8 A nas alternativas, mas existe: @2" +
                            "" +
                            "@b 8 x 10@sp0sp@ A b@ @1" +
                            "Qualquer número elevado à 0 é 1. @1" +
                            "@b 8 x 1 A b@ @1" +
                            "@b 8 A b@ @2" +
                            "" +
                            "Portanto a alternativa correta é 8 x 10@sp0sp@ A."+
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;

                case 27:

                    sourceString = "Gustavo é um fã dos Beatles e planejou uma viagem até a cidade de Liverpool na Inglaterra, onde o grupo "+
                            "foi formado. Chegou lá no meio de janeiro, o ambiente estava muito frio. Observando um termômetro em "+
                            "uma praça, leu a indicação de 41 ºF.@1"+
                            "@1Qual a temperatura em Liverpool, medida na escala Celsius, naquele momento? ";
                    qA = "1 ºC ";
                    qB = "5 ºC ";
                    qC = "22,7 ºC ";
                    qD = "41,8 ºC ";
                    resolucao = "Para convertemos Fahrenheit (ºF) para Celsius (ºC), usaremos esta fórmula: @2" +
                            "" +
                            "@cimg rcn510271 cimg@ @2" +
                            "" +
                            "Para dividir um número inteiro por um decimal, podemos transformar os dois números " +
                            "em fraçoes, após isso basta repetir a primeira fração e multiplicar pelo inverso da " +
                            "segunda. @2" +
                            "" +
                            "@cimg rcn510272 cimg@ @2" +
                            "" +
                            "Agora podemos simplificar o 9 e o 18. @2" +
                            "" +
                            "@cimg rcn510273 cimg@ @2" +
                            "" +
                            "Sendo assim, 41ºF = 5ºC." +
                            "" +
                            "" +
                            ""; prerequisito = ""; break;
                case 28:

                    sourceString = "Sobre um corpo em movimento atuam as forças representadas na figura abaixo.@2 "+
                            "@cimg cn510281 cimg@"+

                            "Qual é o módulo, a direção e o sentido da força que sozinha é capaz de proporcionar o mesmo efeito que "+
                            "o conjunto apresentado nessa figura? ";
                    qA = "4 N, horizontal e para a direita. ";
                    qB = "8 N, horizontal e para a esquerda. ";
                    qC = "12 N, horizontal e para a direita. ";
                    qD = "20 N, horizontal e para a esquerda. ";

                    resolucao =
                            "A força N está movimentando a figura para cima e possui 10 N. @1" +
                            "A força P está movimentando a figura para baixo e tem 10 N. @1" +
                            "Portanto as duas se anulam, basta fazer N - P que resultará em 0, sendo assim, a figura não irá " +
                                    "se movimentar nem para cima, nem para baixo. @2" +
                                    "" +
                                    "A força F@_at_@ está movimentando a figura para a esquerda e tem força de 8 N. @1" +
                                    "A força F está movimentando a figura para a direita e tem força de 12 N. @1" +
                                    "Logo a força F é maior que a F@_at_@, sendo assim a figura se moverá para a direita. @1" +
                                    "Para sabermos com qual força a figura fará isso, basta fazermos @b F - F@_at_@ b@. @2" +
                                    "" +
                                    "12 - 8 = 4 @2" +
                                    "" +
                                    "Em vista disso Uma força com 4N, na horizontal, para a direita porporcionaria o mesmo efeito do conjunto apresentado nessa figura." +
                                    "" +
                                    "" +
                            "" +
                            "" +
                            "" +
                            "" +
                            " "; prerequisito = ""; break;
                case 29:

                    sourceString = "Partindo de uma cidade situada no km 1 240 de uma rodovia às 8h e 30min, um automóvel se desloca "+
                            "com velocidade constante de módulo 80 km/h. Seu destino fica no km 920.@1"+
                            "@1Qual é a hora prevista para a chegada ao seu destino? ";
                    qA = "4,0 h ";
                    qB = "4,5 h ";
                    qC = "12,0 h ";
                    qD = "12,5 h ";

                    resolucao = "O automóvel está no km 1240 e precisa ir para o km 920, portanto ele se locomoverá por @2" +
                            " " +
                            "@b 1240 - 920 = 320 b@ @2 " +
                            "" +
                            "320km. Sabemos que o automóvel se move na velocidade de 80km/h, ou seja, a cada hora, ele se deslocorá por 80 km. @2" +
                            "" +
                            "1ª hora: 80km @1 " +
                            "2ª hora: 160km @1 " +
                            "3ª hora: 240km @1 " +
                            "4ª hora: 320km @2" +
                            "" +
                            "Ou seja, ele irá levar 4 horas para se mover por 320km. Sabendo que ele partiu às 8h e 30m (8,5h), basta adicionarmos " +
                            "4h à esse valor. @2" +
                            "" +
                            "8,5 h + 4 h = 12,5 h" +
                            "" +
                            "" +
                            "" +
                            "";
                    prerequisito = ""; break;
                case 30:

                    sourceString = "Da janela de um edifício, a 60 m do solo, uma criança joga verticalmente para baixo uma pequena bola "+
                            "de borracha em uma piscina. Três segundos após ser lançada, a bola toca a água, que está no nível do "+
                            "solo. Adotando-se a aceleração da gravidade como 10 m/s², qual é a velocidade com que a criança lançou "+
                            "essa bola? ";
                    qA = "2,0 m/s ";
                    qB = "5,0 m/s ";
                    qC = "35 m/s ";
                    qD = "50 m/s ";
                    resolucao = "Utilizaremos a fórmula do movimento uniformemente variado (MUV) para resolver esta questão. @2" +
                            "" +
                            "@cimg rcn510301 cimg@ @2" +
                            "" +
                            "@b Onde: b@ @2" +
                            "" +
                            "@b S b@ é o espaço final = 60. @1" +
                            "@b S@_0_@ b@ é o espaço inicial = 0. @1" +
                            "@b V@_0_@ b@ é velocidade inicial (não temos o valor). @1" +
                            "@b t b@ é o tempo = 3. @1" +
                            "@b g b@ é a aceleração da gravidade = 10. @2" +
                            "" +
                            "Basta aplicarmos os valores na fórmula: @2" +
                            "" +
                            "@cimg rcn510302 cimg@ @1" +
                            "" +
                            "Sendo assim, 5 m/s é a velocidade inicial, portanto a criança lançou a bola com essa velocidade. " +
                            "" +
                            "" +
                            "";
                    prerequisito = ""; break;

            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {


                case 1:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "“Devemos sempre ter o cuidado de não comprar mais aos estrangeiros do que lhe vendemos.” "+
                            "@2<small>SMITH, Thomas, apud BRAUDEL, F. Os jogos das trocas. Lisboa: Cosmos, 1985.</small> @2 "+
                            "Essa frase explica uma das bases do mercantilismo, que é ";
                    qA = "a balança comercial favorável. ";
                    qB = "a liberdade de comércio. ";
                    qC = "o aumento das importações. ";
                    qD = "o incentivo ao industrialismo. ";

                    resolucao = "Dizemos que a balança comercial de um determinado país está favorável, quando este exporta (vende para outros países) mais do que importa (compra de outros países). " +
                            "Do contrário, dizemos que a balança comercial é negativa ou desfavorável. ";
                    prerequisito = ""; break;
                case 2:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Com o fim do pacto colonial, as elites brasileiras poderiam avolumar suas transações "+
                            "comerciais e ampliar significativamente seus lucros. De fato, essa primeira medida já colocava "+
                            "o Brasil enquanto nação economicamente autônoma. Do ponto de vista político, a condição de "+
                            "colônia foi abandonada quando o Brasil ascendeu à condição de Reino Unido de Portugal.@1"+
                            "@1<small>Disponível em: http://www.mundoeducacao.com.br/historiadobrasil/os-tratados-1810.htm. Acesso em: 10 fev. 212.</small> @2 "+
                            "Do ponto de vista político e histórico, o fim do pacto colonial no Brasil contribuiu para a ";
                    qA = "agroexportação. ";
                    qB = "independência. ";
                    qC = "industrialização. ";
                    qD = "recolonização. ";

                    resolucao = "O pacto colonial era um acordo entre a metrópole e a sua colônia. Ex: Brasil e Portugal. @1" +
                            "Esse acordo fazia com que a colônia só pudesse negociar com a metrópole, que vendia produtos acima do preço. @1" +
                            "Tendo isso em vista, no fim do pacto colonial, a colônia tinha uma maior liberdade, poderia negociar com outras países, contribuindo, assim, para sua independência. ";
                    prerequisito = ""; break;
                case 3:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A Inglaterra foi o país pioneiro da industrialização. A agricultura inglesa desenvolveu-se com "+
                            "o cercamento dos campos e a difusão de novas técnicas e instrumentos de cultivo. O fim do uso "+
                            "comum das terras gerou o “trabalhador livre”, expulso do campo onde não tinha mais condições "+
                            "de sobrevivência, transformando-o em mão de obra urbana. [...] "+
                            "A prática dos cercamentos era legalmente utilizada e permitida pelo Parlamento Inglês desde "+
                            "o século XVI e foi intensificada no século XVIII, causando a eliminação dos yeomen e dos "+
                            "arrendatários. Os cercamentos provocaram também um brutal desemprego na área rural, com os "+
                            "camponeses e suas famílias perdendo os lotes de onde tradicionalmente tiravam o seu sustento.@1"+
                            "@1<small>Disponível em: http://www.algosobre.com.br/historia/revolucao-industrial-origens.html. Acesso em: 6 fev. 212. Fragmento.</small> @2 "+
                            "A exclusão social dos camponeses apresentada nesse texto relaciona-se à estrutura de poder ";
                    qA = "da aristocracia agrária. ";
                    qB = "da burguesia mercantil. ";
                    qC = "dos pequenos proprietários. ";
                    qD = "dos trabalhadores livres. ";

                    resolucao = "Aristocracia pode ser definida como um grupo constituído por integrantes de camadas sociais com grande poder político e econômico. @1 " +
                            "Portanto, é visível que os camponeses foram expulsos das terras, essa expulsão foi feita pela elite política e econômica envolvida com as terras, ou seja, " +
                            "pela aristocracia agrária." +
                            "" +
                            "" +
                            "";
                    prerequisito = ""; break;
                case 4:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Lembro-me muito bem do efeito que causou em mim minha primeira visão de Manchester, "+
                            "quando olhei para a cidade pela primeira vez, do final da linha férrea que vinha de Liverpool, e vi "+
                            "uma floresta de chaminés expelindo vapor e fumaça, formando uma cobertura escura que parecia "+
                            "abraçar e envolver todo o lugar [...].@1"+
                            "@1<small>BRADSHAW, L.D (org). Visitors to Manchester – a selection of British and foreing visitors descriptions of Manchester from 1538 to 1865. "+
                            "Manchester: Neil Richardson, 1987.</small> @2"+
                            "As condições retratadas nesse texto são consequências de que acontecimento histórico? ";
                    qA = "Revolução Meiji. ";
                    qB = "Revolução Industrial. ";
                    qC = "Revolução Francesa. ";
                    qD = "Revolução Burguesa. ";

                    resolucao = "\"...vi uma floresta de chaminés expelindo vapor e fumaça...\", esse trecho faz alusão às indústrias, e essas indústrias foram " +
                            "vistas em Manchester, Inglaterra, onde se iniciou a Revolução Industrial.";
                    prerequisito = ""; break;
                case 5:

                    sourceString = "Leia o texto abaixo sobre a crise da mão de obra escrava.@2 "+
                            "Com o fim do tráfico negreiro, os escravos que restaram no país eram mandados para as regiões "+
                            "onde houvesse uma lavoura lucrativa. Portanto, a região Sudeste, onde o café estava em expansão, "+
                            "era o lugar mais interessante. Desse modo, havia um tráfico interno, transferindo os escravos de "+
                            "uma região para outra. Mas a população de escravos foi diminuindo gradualmente e os donos "+
                            "continuavam a maltratá-los. A mortalidade era grande, havia poucos casamentos, quase nenhuma "+
                            "vida familiar e poucas crianças sobreviviam por conta das péssimas condições de higiene.@1"+
                            "@1<small>Disponível em: http://www.administradores.com.br/informe-se/artigos/transicao-do-trabalho-escravo-para-o-trabalho assalariado/2598/. Acesso em: 9 mar. 211.</small> @2 "+
                            "O fim do tráfico negreiro, em 1850, possibilitou a ";
                    qA = "abolição do tráfico interno entre as províncias. ";
                    qB = "implantação imediata do trabalho livre. ";
                    qC = "substituição do escravo pelo imigrante europeu. ";
                    qD = "utilização do trabalho compulsório e gratuito. ";

                    resolucao = "Quando o tráfico negreiro foi proíbido, os senhores de terras precisavam de pessoas para trabalhar em suas lavouras e a Europa passava por uma crise" +
                            " onde muitos não possuiam emprego, então esses senhores de terras contrataram esses imigrantes europeus que estavam sem emprego, por um salário baixo.";
                    prerequisito = ""; break;
                case 6:

                    sourceString = "Em uma sociedade, o processo decorrente da disputa de indivíduos e grupos por bens escassos é " +
                            "denominado";
                    qA = "acordo.";
                    qB = "conflito.";
                    qC = "debate.";
                    qD = "escolha.";

                    resolucao = "O enunciado está perguntando, o que acontece quando indivíduos disputam por bens escassos. E a resposta é conflíto, pois esses indivíduos/grupos irão " +
                            "entrar em conflito, onde o vencedor terá acesso à esse bem escasso.";

                    prerequisito = ""; break;
                case 7:

                    sourceString = "Os textos abaixo são de autores que protagonizaram movimentos sociais do século XIX.@2 "+
                            "@b Texto 1 b@ @2 "+
                            "Os únicos pontos que distinguem os comunistas dos outros partidos operários são os seguintes:@2"+
                            "1) nas lutas nacionais dos proletários dos diversos países, destacam e fazem prevalecer os "+
                            "interesses comuns a todo o proletariado, independente da nacionalidade; 2) nos vários estágios "+
                            "de desenvolvimento da luta da classe operária contra a burguesia, representam, sempre e em "+
                            "toda parte, os interesses do movimento em geral.@1"+
                            "@1<small>MARX, Karl e ENGELS, Friedrich. O Manifesto Comunista.Disponível em: http://www.culturabrasil.org/manifestocomunista.htm. Acesso em: 9 fev. 212. Fragmento.</small> @2 "+
                            "@b Texto 2 b@ @2 "+
                            "A propriedade do Estado é a miséria da nação real, do povo; a grandeza e o poderio do Estado "+
                            "resultam da escravidão do povo. O povo é, de resto, o inimigo natural e legítimo do Estado; e "+
                            "como ele se submete, o que aliás acontece muitas vezes, às autoridades, todo o “poder” se lhe "+
                            "torna odioso. O Estado não é Pátria: é a abstração, a ficção metafísica, jurídica, mística e política "+
                            "da Pátria.@1"+
                            "@1<small>BAKUNIN, Mikhail. O Estado: alienação e natureza. Disponível em: http://www.culturabrasil.org/bakunin1.htm. Acesso em: 10 fev. 212. Fragmento.</small> @2 "+
                            "Os ideais defendidos pelos autores desses textos referem-se, respectivamente, ao ";
                    qA = "comunismo e ao anarquismo. ";
                    qB = "sindicalismo e ao liberalismo. ";
                    qC = "socialismo e ao capitalismo. ";
                    qD = "trabalhismo e ao populismo. ";

                    resolucao = "Comunismo é uma ideologia política e socioeconômica, que pretende promover o estabelecimento de uma sociedade igualitária, sem classes sociais e apátrida, baseada na propriedade comum dos meios de produção. E o Texto I, está descrevendo exatamente isso. @2" +
                            "" +
                            "Anarquismo é uma ideologia política que se opõe à todo tipo de hierarquia e dominação, seja ela política, econômica, social ou cultural, como o Estado, o capitalismo, as instituições religiosas, o racismo e o patriarcado. O Texto II, está se opondo ao Estado, " +
                            "dizendo que a propriedade do Estado é a miséria da nação, uma característica do anarquismo."; prerequisito = ""; break;
                case 8:

                    sourceString = "Leia o texto abaixo. @2" +
                            "O exemplo mais recente de todo esse dinamismo está na escrita cifrada usada na internet [...]. " +
                            "O uso criativo da linguagem da comunicação via computador é uma novidade. Abreviações eram " +
                            "feitas desde a época do latim, mas nunca houve nada como a inventividade do “internetês”. @2" +
                            "<small> Disponível em: <http://revistaescola.abril.com.br/lingua-portuguesa/pratica-pedagogica/lingua-viva-423717.shtml>. Acesso em: 24 fev. 2012. Fragmento. </small> @2" +
                            "De acordo com esse texto, constata-se que no mundo contemporâneo têm havido alterações nos modos " +
                            "de produção e compartilhamento das";
                    qA = "identidades. ";
                    qB = "ideologias.";
                    qC = "informações. ";
                    qD = "mercadorias. ";
                    resolucao = "Internetês, são abreviações criadas para aumentar a velocidade " +
                            "com que uma pessoa escreve, ou seja, quanto mais internetês, mais rápido uma " +
                            "pessoa transmite informações para outras pessoas na internet, através de redes sociais principalmente."; prerequisito = ""; break;
                case 9:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@cimg ch510091 cimg@"+
                            "Marcha do Movimento Tenentista pela Avenida Atlântica em julho de 1922.@1"+
                            "@1<small>Disponível em: http://www.portalsaofrancisco.com.br. Acesso em: 6 fev. 212.</small> @2 "+
                            "Essa revolta militar relaciona-se com a crise do sistema brasileiro ";
                    qA = "democrático. ";
                    qB = "desenvolvimentista. ";
                    qC = "oligárquico. ";
                    qD = "populista. ";
                    resolucao = "Oligarquia é quando um pequeno grupo de pessoas exerce pode sobre uma população, " +
                            "e esse grupo pertence ao mesmo partido, família ou classe. @1" +
                            "No período de 1922, o Brasil estava sendo governado (por muitos anos) por representantes das oligarquias brasileiras. @1" +
                            "Esses grupos utilizavam artifícios como o voto de cabresto e voto aberto, para manipularem a população e serem elegidos. @1" +
                            "Portanto, esta revolta militar relaciona-se com a crise do sistema brasileiro oligárquico."; prerequisito = ""; break;
                case 10:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Fazia quase dois anos que ocorrera a quebra na Bolsa de Valores de Nova York, em outubro de "+
                            "1929. Mas os estragos provocados pela crise ainda eram sentidos em todo o planeta – e também "+
                            "no Brasil. [...] Todos os elos envolvidos na cadeia de produção do café brasileiro – fazendeiros, "+
                            "comerciantes, banqueiros e trabalhadores rurais (a maior parte imigrantes) – foram atingidos pela "+
                            "crise. Muitos produtores foram à bancarrota.@1"+
                            "@1<small>Disponível em: http://historiablog.wordpress.com/209/1/3/a-crise-de-1929-e-o-brasil/. Acesso em: 8 fev. 212. Fragmento.</small> @2 "+
                            "Essa crise fez com que o governo brasileiro adotasse como medida de recuperação econômica a ";
                    qA = "emissão de moedas estrangeiras. ";
                    qB = "importação de produtos agrícolas. ";
                    qC = "queima de estoques de café. ";
                    qD = "reforma do trabalho no campo. ";
                    resolucao = "Esta é a famosa crise de 29, crise da super produção, onde os produtos estavam sendo produzidos em excesso, haviam mais produtos do que as pessoas poderiam comprar. @1" +
                            "Como haviam muitos produtos, os preços começaram a despencar, quanto mais de um produto no mercado, mais barato ele será. Vendo isso, o governo brasileiro " +
                            "queimou os estoques de café para que tivesse menos café, aumentando, assim, o seu preço."; prerequisito = ""; break;
                case 11:

                    sourceString = "Observe o cartaz abaixo de 1930, que oferecia recompensa pela captura de Lampião vivo ou morto.@2 "+
                            "@cimg ch510111 cimg@"+
                            "@1<small>Disponível em: http://www.revistabrasileiros.com.br/imagens/450/em/textos/93/. Acesso em: 6 fev. 211.</small> @2 "+
                            "O Cangaço é caracterizado como um movimento que ";
                    qA = "adotou um tipo de banditismo que se desenvolveu no sertão nordestino. ";
                    qB = "estimulou a prática do messianismo entre os seus participantes. ";
                    qC = "ocorreu no sudeste do Brasil em meados do século XIX. ";
                    qD = "utilizou a infiuência religiosa para agir em favor dos coronéis. ";
                    resolucao = "Os cangaceiros - bandos de malfeitores, ladrões, assassinos, bem armados, conhecedores da região - saqueavam fazendas, povoados e cidades, impunemente, ou, pior, impondo sua própria lei à região em que atuavam. @1" +
                            "\n" +
                            "Para isso, contavam com o isolamento do sertão, com o tradicional descaso e a incompetência das autoridades constituídas, bem como com a conivência ou proteção de vários chefes políticos locais, os grandes proprietários rurais, conhecidos como \"coroneis\".@1" +
                            "\n" +
                            "\n" +
                            "O cangaceiro - um deles, em especial, Lampião - tornou-se personagem do imaginário nacional, ora caracterizado como uma espécie de Robin Hood, que roubava dos ricos para dar aos pobres, ora caracterizado como uma figura pré-revolucionária, que questionava e subvertia a ordem social de sua época e região.@1" +
                            "\n" +
                            "Nesse sentido - heróico/mitológico - o cangaço é precursor do banditismo que ocorre atualmente nos morros do Rio de Janeiro ou na periferia de São Paulo, onde chefes de quadrilhas também são considerados muitas vezes benfeitores das comunidades carentes."; prerequisito = ""; break;
                case 12:

                    sourceString = "Leia a notícia abaixo relacionada à campanha “O petróleo é nosso”, realizada durante a Era Vargas.@2 "+
                            "Muitos devem estar lembrados da frase “O petróleo é nosso”, quando da campanha para "+
                            "diminuir a importação e a dependência do petróleo pelo Brasil, implantado pelo então Presidente "+
                            "da República Getúlio Vargas. Getúlio tinha razão em dizer que o Brasil poderia, no futuro, ser um "+
                            "grande explorador dessa matéria-prima.@1"+
                            "@1<small>Disponível em: http://www.biodieselbr.com/noticias/energia/o-petroleo-e-nosso-23-2-6.htm. Acesso em: 3 de jan. 211.</small> @2 "+
                            "Essa campanha possuiu caráter ";
                    qA = "entreguista. ";
                    qB = "imperialista. ";
                    qC = "nacionalista. ";
                    qD = "neoliberal. ";
                    resolucao = "Nacionalismo é a preferência pelo que é próprio da nação a que se pertence, exaltação de suas características e valores tradicionais. @2" +
                            "" +
                            "O texto diz que a campanha serviu para diminuir a importação e a dependência do petróleo pelo Brasil, ao invés disso, Getúlio Vargas queria que o Brasil explorasse essa " +
                            "matéria-prima. Ou seja, foi um campanha com caráter nacionalista, dando preferência ao petróleo do Brasil, ao invés de comprar de outros países."; prerequisito = ""; break;
                case 13:;

                    sourceString = "No início foram as cidades. O intelectual da Idade " +
                            "Média - o Ocidente - nasceu com elas. Foi com o " +
                            "desenvolvimento urbano ligado às funções comercial e " +
                            "industrial - digamos modestamente artesanal - que ele " +
                            "apareceu, como um desses homens de ofício que se " +
                            "instalavam nas cidades nas quais se impôs a divisão do " +
                            "trabalho. Um homem cujo ofício é escrever ou ensinar, e " +
                            "de preferência as duas coisas a um só tempo, um homem " +
                            "e erudito, em resumo, um intelectual - esse homem só " +
                            "aparecerá com as cidades. @2" +
                            "" +
                            "<small> LE GOFF, J. @b Os intelectuais na idade Média. b@ @1" +
                            "Rio de Janeiro: José Olympio, 2010 </small> @2" +
                            "" +
                            "O surgimento da categoria mencionada no período em destaque no texto evidencia o(a) " +
                            "" +
                            "";
                    qA = "apoio dado pela Igreja ao trabalho abstrato.";
                    qB = "relação entre desenvolvimento urbano e divisão de trabalho.";
                    qC = "importância organizacional das corporações de ofício.";
                    qD = "acúmulo de trabalho dos professores e eruditos.";

                    resolucao = "O Renascimento Comercial e Urbano, da Baixa Idade " +
                            "Média, iniciado por volta do século XII, caracterizou-" +
                            "se pelo crescimento das cidades já existentes e pelo " +
                            "surgimento de novos centros populacionais (burgos). @1" +
                            "Esse fenômeno, além de ter uma relação fundamental com as atividades mercantis, exigiu a diversifição das funões humanas urbanas, abrindo espaço para o trabalho de professores - inicialmente atuando de forma isolada, e depois de forma mais estruturada.";
                    prerequisito = ""; break;
                case 14:

                    this.sourceString =
                            "Sentimos que toda satisfação de nossos desejos " +
                                    "advinda do mundo assemelha-se à esmola que mantém " +
                                    "hoje o mendigo vivo, porém prolonga amanhã a sua " +
                                    "fome. A resignação, ao contrário, assemelha-se à " +
                                    "fortuna herdada: livra o herdeiro para sempre de todas " +
                                    "as preocupações. @2" +
                                    "<small> SCHOPENHAUER, A. Aforismo para a sabedoria da vida. São Paulo: Martins Fontes, 2005. </small> @2" +
                                    "O trecho destaca uma ideia remanescente de uma  " +
                                    "tradição filosófica ocidental, segundo a qual a felicidade " +
                                    "se mostra indissociavelmente ligada à";
                    this.qA = "consagração de relacionamentos afetivos.";
                    this.qB = "administração da independência interior";
                    this.qC = "busca de prazeres efêmeros.";
                    this.qD = "liberdade de expressão religiosa. ";

                    resolucao = "O trecho sugere que a busca de prazeres efêmeros não é suficiente" +
                            " para a conquista da felicidade. Em oposilçao, a resignação livra o indivíduo " +
                            "de qualquer preocuoação, sendo que a renúncia ao prazer permite a " +
                            "independência interior."; prerequisito = ""; break;
                case 15:

                    sourceString = "Leia o texto abaixo sobre o movimento grevista desencadeado pelos metalúrgicos do ABC paulista.@2 "+
                            "Às seis da manhã do dia 12 de maio de 1978, mais de 3 000 metalúrgicos de uma montadora "+
                            "em São Bernardo entraram na fábrica, mas não ligaram as máquinas. Tinha início a primeira "+
                            "greve dez anos após a última mobilização, em 1968, ano da promulgação do AI-5, que acabou "+
                            "com a liberdade de expressão e a representação política.@1"+
                            "@1<small>Disponível em: http://www1.folha.uol.com.br/folha/dinheiro/ult91u563971.shtml. Acesso em: 9 mar. 211. *Adaptado para fins didáticos.</small> @2 "+
                            "Esse movimento grevista tinha como objetivo ";
                    qA = "defender o reajuste salarial e também a liberdade democrática. ";
                    qB = "forçar os patrões a aceitar os contratos individuais de trabalho. ";
                    qC = "garantir a manutenção da estrutura sindical corporativista. ";
                    qD = "retornar ao regime de estabilidade no emprego. ";
                    resolucao = "Neste movimento, os grevistas exigiram um reajuste salarial e lutavam a favor da liberdade democrática."; prerequisito = ""; break;
                case 16:

                    sourceString = "O texto abaixo é sobre a elaboração da Constituição Federal de 1988.@2 "+
                            "A atual Constituição Federal do Brasil, chamada de “Constituição Cidadã”, foi promulgada no "+
                            "dia 5 de outubro de 1988. [...]. A Constituição é a lei maior, a Carta Magna, que organiza o Estado "+
                            "brasileiro. Após o fim do Regime Militar, em todos os segmentos da sociedade, era unânime "+
                            "a necessidade de uma nova Carta, pois a anterior havia sido promulgada em 1967, em plena "+
                            "Ditadura Militar. [...] Representando um avanço em direção a democracia, a sociedade, em seus "+
                            "diversos setores, foi estimulada a contribuir e apresentar propostas.@1"+
                            "@1<small>Disponível em: http://contextopolitico.blogspot.com/208/8/histria-constituio-de-1988.html. Acesso em: 7 fev. 212. Fragmento.</small> @2 "+
                            "Essa Constituição acrescentou avanços na cidadania representados por meio da ";
                    qA = "criação da justiça do trabalho. ";
                    qB = "formulação da lei de imprensa. ";
                    qC = "liberação do divórcio para as mulheres. ";
                    qD = "permissão do voto para os analfabetos. ";
                    resolucao = "cidadania é a condição de pessoa que, como membro de um Estado, se acha no direito que a permite participar da vida política. @2" +
                            "" +
                            "Quando a Constituição Federal de 1988 foi promulgada, os analfabetos também obtiveram o direito ao voto, e isso foi um avanço para a cidadania, já que eles também podiam participar da vida política."; prerequisito = ""; break;
                case 17:

                    sourceString = "Leia os textos abaixo.@2 "+
                            "@b Texto 1 b@ @2 "+
                            "As privatizações ocorrem quando uma empresa ou uma instituição estatal – grupos de "+
                            "investimentos, multinacionais, organizações estratégicas, entre outros – são vendidas para a "+
                            "esfera privada, quase sempre através de leilões públicos.@1"+
                            "@1<small>Disponível em: http://www.infoescola.com/economia/privatizacoes/ Acesso em: 8 fev. 212. Fragmento.</small> @2 "+
                            "@b Texto 2 b@ @2 "+
                            "O país conduzia-se a uma autonomia econômica. Este crescimento independente só foi "+
                            "possível devido ao contexto em que estavam situados: com o pós-guerra, o “assédio” dos "+
                            "países hegemônicos sobre o Brasil era quase nulo. Com isso, o crescimento foi controlado pelo "+
                            "empresariado brasileiro – que era justamente a ideia de Getúlio Vargas.@1"+
                            "@1<small>Disponível em: http://perspectivabr.wordpress.com/208/5/9 Acesso em: 8 fev. 212. Fragmento.</small> @2 "+
                            "As políticas e os princípios econômicos, aos quais esses textos se referem, são, respectivamente, o ";
                    qA = "mercantilismo e o liberalismo clássico. ";
                    qB = "mercantilismo e o nacional desenvolvimentismo. ";
                    qC = "neoliberalismo e o liberalismo clássico. ";
                    qD = "neoliberalismo e o nacional desenvolvimentismo. ";
                    resolucao = "Neoliberalismo é um cenário onde o Estado intervem econômicamente apenas em setores imprescindíveis e ainda assim num grau mínimo. " +
                            "Portanto quando ocorre a privatização, significa que o Estado está deixando de intervir econômicamente em um serviço e deixando isso na mão de terceiros. @2" +
                            "" +
                            "Nacional Desenvolvimento ocorreu no Brasil em sua época de grande expansão. O Brasil abriu as" +
                            " portas para capital externo e novas tecnologias, além de privatizar diversos serviços, o que gerou um " +
                            "alto fluxo de capital vindo do empresariado, fazendo com que o Brasil tivesse um desenvolvimento nacional muito acelerado."; prerequisito = ""; break;

                case 18:

                    sourceString = "Observe as imagens abaixo.@2 " +
                            "@cimg ch510181 cimg@ @1" +
                            "Na Idade Média, os jovens ricos e nobres "+
                            "gostavam de passar o tempo ouvindo canções e "+
                            "lendo poemas sobre pessoas apaixonadas "+
                            "@1<small>Disponível em: http://dan-poucodetudo.blogspot.com/211/9/ alguns-aspectos-da-vida-na-idade-media.html. Acesso em: 15 "+
                            "mar. 212.</small> @2" +
                            "@cimg ch510182 cimg@ @1" +
                            "No século XXI, milhares de jovens assistem a um "+
                            "show de música.@1"+
                            "@1<small>Disponível em: http://www.fotologando.com/211/1/garota-bonita-daplateia.html. Acesso em: 14 mar. 212.</small> @2 "+

                            "Comparando-se a vida dos jovens apresentada nessas imagens, identificam-se diferenças marcantes "+
                            "entre elas.@1"+
                            "@1Essas diferenças decorrem ";
                    qA = "da formação profissional. ";
                    qB = "da migração internacional. ";
                    qC = "do crescimento urbano. ";
                    qD = "do sistema educacional. ";
                    resolucao = "Com o crescimento urbano (crescimento das cidades) um mundo novo se abriu, dando " +
                            "espaço para novos serviços, lazeres e etc. @1" +
                            "Nos dias atuais os centros urbanas são infinitamente maiores do que na Idade Média, " +
                            "e isso porporcionou às pessoas, novas possibilidades, como ir à um show de música, viajar para outros países e etc.  "; prerequisito = ""; break;
                case 19:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Desde que se mudou de Feira de Santana, na Bahia, para assumir a gerência de marketing "+
                            "de um shopping de Brasília, há cinco meses, mandar e-mails relacionados ao trabalho após o "+
                            "horário de expediente ou até aos fins de semana tem sido uma prática trivial para S., 35 anos.@1"+
                            "S. é parte de um grupo de brasileiros que não consegue desvincular-se do trabalho, mesmo "+
                            "depois de “bater o ponto”.@1"+
                            "@1<small>Disponível em: http://www.relacoesdotrabalho.com.br/profiles/blogs/no-correio-braziliense-a-rotina-de-quem-fica-o-dia-inteiro-ligado. Acesso em: 8 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "A mudança nas relações de trabalho apresentada nesse texto decorre ";
                    qA = "da facilidade de troca de informações. ";
                    qB = "da redução da jornada diária de trabalho. ";
                    qC = "do aumento do período de tempo livre. ";
                    qD = "do pagamento mensal de horas extras. ";
                    resolucao = "Atualmente, com o desenvolvimento da tecnologia, o ser humano " +
                            "pode entrar em contato instantaneamente com lugares que ele não poderia há 100 anos. @1" +
                            "A facilidade de se comunicar é extremamente grande, onde uma pessoa pode falar, quase que instantaneamente com outra pessoa do outro lado do mundo, " +
                            "ou até mesmo fora do mundo. Isso possibilitou que pessoas trabalhem até mesmo em casa ou num ônibus, já que em trabalhos " +
                            "que não requerem esforço físico, o principal é a informação passada pela pessoa."; prerequisito = ""; break;
                case 20:

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
                            "é possível sustentar negócios que fiquem abertos 24h por dia, já que haverá um grande fluxo de pessoas a qualquer hora do dia."; prerequisito = ""; break;
                case 21:

                    sourceString = "Observe a imagem abaixo, que apresenta produtos agropecuários naturais ou manufaturados.@2 "+
                            "@cimg ch510211 cimg@ @2 "+
                            "A unidade produtiva que transforma o produto agropecuário natural ou manufaturado para a sua utilização "+
                            "intermediária ou final é ";
                    qA = "a agroindústria. ";
                    qB = "a agroquímica. ";
                    qC = "o celeiro. ";
                    qD = "o latifúndio. ";
                    resolucao = "A agroindústria é o conjunto de atividades relacionadas à transformação de matérias-primas provenientes da agricultura, pecuária, aqüicultura ou silvicultura. "; prerequisito = ""; break;
                case 22:

                    sourceString = "Leia o texto abaixo sobre o agronegócio.@2 "+
                            "No caso da soja, toda a cadeia produtiva é controlada por poucas grandes empresas. São as "+
                            "mesmas que financiam os insumos e equipamentos e compram a produção. Essas empresas "+
                            "atuam convencendo muitos pequenos agricultores a plantarem sua soja e usar seus produtos, "+
                            "prometendo comprar tudo no final. Toda a produção nacional de soja é comprada por meia "+
                            "dúzia de empresas. Como controlam também a comercialização, definem os preços pagos "+
                            "aos agricultores, criando um ciclo de dependência na qual as empresas ficam com o lucro e os "+
                            "pequenos agricultores têm que pagar por qualquer perda nas safras.@1"+
                            "@1<small>Disponível em: http://www.sof.org.br/arquivos/pdf/Livreto_Oxfam_web.pdf. Acesso em: 22 mar. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "O agronegócio provoca transformações significativas no meio rural brasileiro.@1"+
                            "@1Essas transformações ";
                    qA = "ampliam a necessidade de mão de obra nas propriedades. ";
                    qB = "estimulam a concorrência entre os agricultores familiares. ";
                    qC = "promovem a constituição de cooperativas camponesas. ";
                    qD = "provocam a queda do lucro dos pequenos agricultores. ";
                    resolucao = "O texto no trecho \"[...] as empresas ficam com o lucro e os pequenos agricultores têm que pagar por qualquer perda nas safras.\" admite que os pequenos agricultores bancam as perdas, portanto as transformações decritas no texto provoca a queda do lucro dos pequenos agricultores.  "; prerequisito = ""; break;
                case 23:

                    sourceString = "O mapa abaixo apresenta as regiões de planejamento de Minas Gerais.@2 " +
                            "@cimg ch510231 cimg@"+
                            "@1<small>Disponível em: http://www.fjp.gov.br/index.php/servicos/81-servicos-cei/68-informativo-cei-demografia-regioes-de-planejamento. Acesso em: 8 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "Na Região Central, a cidade que é considerada o centro da rede urbana é ";
                    qA = "Belo Horizonte. ";
                    qB = "Montes Claros. ";
                    qC = "Poços de Caldas. ";
                    qD = "Teófilo Otoni. ";
                    resolucao = "O centro da rede urbana é a capital, como a imagem mostra o planejamento de Minas Gerais, a resposta será Belo Horizonte, já que este é a capital de Minas Gerais."; prerequisito = ""; break;
                case 24:

                    sourceString = "Leia o texto abaixo sobre os impasses no comércio mundial.@2 "+
                            "Atualmente, o Brasil ocupa uma posição de liderança do chamado G-20, grupo de países em "+
                            "desenvolvimento que buscam mais espaço no comércio internacional e exigem igualdade de "+
                            "aplicações das regras estabelecidas pela Organização Mundial do Comércio (OMC).@1"+
                            "@1<small>Disponível em: http://www.atualidadesconcursos.com.br/artigos/OMC_Comercio_Internacional.pdf. Acesso em: 28 mar. 212.  *Adaptado para fins didáticos.</small> @2 "+
                            "A OMC contribui para a desigualdade no comércio internacional ao permitir que os países ricos tornem "+
                            "seus produtos mais baratos através de ";
                    qA = "distribuição de terras. ";
                    qB = "insumos industriais. ";
                    qC = "isenção de impostos. ";
                    qD = "subsídios agrícolas. ";
                    resolucao = "O subsídio agrícola é o valor pago ao produtor por unidade produzida ou exportada, no geral via departamentos governamentais ou associações de comércio, através de financiamentos com juros abaixo do mercado, isenção de impostos e outras políticas. Na prática, barateia a produção, tornando este produtor mais competitivo. @1" +
                            "\n" +
                            "Atualmente, os produtores de países desenvolvidos são os que mais se beneficiam com os subsídios. Produzem para o mercado local com incentivo financeiro, o que compromete a competitividade do produto importado, principalmente daquele oriundo de um país em desenvolvimento. "; prerequisito = ""; break;
                case 25:

                    sourceString = "Leia o texto abaixo sobre adubação orgânica.@2 "+
                            "Muitos agricultores familiares utilizam a adubação orgânica em seus plantios. Adubação "+
                            "orgânica é feita através da utilização de vários tipos de resíduos, tais como: esterco curtido, "+
                            "vermicomposto de minhocas, compostos fermentados, biofertilizantes enriquecidos com "+
                            "micronutrientes e cobertura morta.@1"+
                            "@1<small>Disponível em: http://mundoorgnico.blogspot.com.br/209/4/tecnica.html. Acesso em: 2 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "A adubação orgânica é uma técnica ";
                    qA = "agroecológica. ";
                    qB = "artificializada. ";
                    qC = "hidropônica. ";
                    qD = "ultrapassada. ";
                    resolucao = "A agroecologia pode ser definida como o estudo da agricultura a partir de uma perspectiva ecológica. Trata-se de um tipo de prática agrícola que prioriza a utilização dos recursos naturais com mais consciência, respeitando e mantendo o que a natureza oferece ao longo de todo o processo produtivo. @2" +
                            "" +
                            "São obtidos da decomposição da matéria de origem vegetal ou animal, como esterco, restos de comida, algas, cascas e restos de vegetais.  São de ação mais lenta que os minerais, já que necessitam continuar transformado-se antes de serem utilizados pelas plantas. Fornece lenta, mas continuamente os nutrientes requeridos pelas plantas. Promovem o desenvolvimento da flora microbiana e por conseqüência melhoram as condições físicas do solo. @2" +
                            "" +
                            "Portanto a adubação orgânica é agroecológica."; prerequisito = ""; break;
                case 26:

                    sourceString = "A imagem abaixo retrata o meio rural brasileiro.@1" +
                            "@cimg ch510261 cimg@"+
                            "@1<small>Disponível em: http://sosriosdobrasil.blogspot.com.br/209_7_1_archive.html. Acesso em: 1 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "A sociedade modifica a natureza para promover a sua subsistência.@1"+
                            "@1Nessa imagem, o meio rural apresenta impactos ambientais negativos percebidos na ";
                    qA = "construção de estradas vicinais. ";
                    qB = "eliminação da fauna silvestre. ";
                    qC = "exploração do lençol freático. ";
                    qD = "poluição dos recursos hídricos. ";
                    resolucao = "No texto é visível: @2" +
                            "" +
                            "- Desmatamento das matas ciliares. @1" +
                            "- Esgoto do banheiro e dos animais indo para o rio. @1" +
                            "- Uma pessoa jogando lixo no rio. @1" +
                            "- Agricultores usando agrotóxicos, que irão contaminar o rio. @2" +
                            "" +
                            "" +
                            "Portanto os impactos ambientais percebidos na imagem são a poluição de recursos hídricos."; prerequisito = ""; break;
                case 27:

                    sourceString = "O texto abaixo apresenta as transformações ocorridas no meio rural brasileiro.@2 "+
                            "O avanço da tecnificação na agricultura é tão forte, que os trabalhos rurais são cada vez mais "+
                            "individualizados e menos familiares, dada a elevação da produtividade do trabalho. As unidades de "+
                            "produção têm passado, assim, de uma exploração familiar para uma exploração individualizada.@1"+
                            "@1<small>Disponível em: http://www.iapar.br/arquivos/File/zip_pdf/transf_rural_pr.pdf. Acesso em: 18 mar. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "Essas transformações provocam a ";
                    qA = "dispensa de parte da mão de obra. ";
                    qB = "eliminação dos impactos ambientais. ";
                    qC = "migração de retorno da população. ";
                    qD = "redução da produção agropecuária. ";
                    resolucao = "A tecnificação na agricultura trouxa diversas máquinas, por exemplo, máquinas que cortam cana substituem o trabalho de até centenas de cortadores; " +
                            "Colheitadeiras, semeadoras, tratores, essas e centenas de outras máquinas trazidas para à agricultura acabaram dispensando boa parte da mão de obra. " +
                            ""; prerequisito = ""; break;
                case 28:

                    sourceString = "Observe abaixo o mapa da Região Sul do Brasil.@1 " +
                            "@cimg ch510281 cimg@"+
                            "@1<small>Disponível em: http://www.professor.bio.br/geografia/. Acesso em: 10 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "Nesse mapa, estão representadas as reservas de ";
                    qA = "bauxita. ";
                    qB = "carvão mineral. ";
                    qC = "manganês. ";
                    qD = "minério de ferro. ";
                    resolucao = "A Região onde há as maiores reservas de carvão mineral do Brasil é o Sul."; prerequisito = ""; break;
                case 29:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Quando falamos em mudança climática e em aquecimento global, estamos nos referindo "+
                            "ao incremento, além do nível normal, da capacidade da atmosfera em reter calor. Isso vem "+
                            "acontecendo devido a um progressivo aumento na concentração dos gases de efeito estufa na "+
                            "atmosfera nos últimos 150 anos. Tal aumento tem sido provocado pelas atividades do homem "+
                            "que produzem emissões excessivas de poluentes para a atmosfera.@1"+
                            "@1<small>Disponível em: http://www.ipam.org.br/biblioteca/livro/Perguntas-e-respostas-sobre-Aquecimento-Global/572. Acesso em: 10 abr. 212.</small> @2 "+
                            "O aumento no efeito estufa trará consequências sérias para a vida na Terra.@1"+
                            "@1As mudanças climáticas previstas alterarão ";
                    qA = "as erupções vulcânicas. ";
                    qB = "as placas tectônicas. ";
                    qC = "os cisalhamentos. ";
                    qD = "os ecossistemas. ";
                    resolucao = "Este texto está falando sobre o aquecimento global, que altera a capacidade da atmosfera reter calor, retendo mais calor, a terra aquece mais. @1" +
                            "Esse aquecimento afeta diretamente os ecossistemas, que são sistemas compostos pelos seres vivos (meio biótico) e o local onde eles vivem (meio abiótico, onde estão inseridos todos os componentes não vivos do ecossistema como os minerais, as pedras, o clima, a própria luz solar, e etc.) "; prerequisito = ""; break;
                case 30:

                    sourceString = "O texto abaixo apresenta as características de um domínio morfoclimático do Brasil.@2 "+
                            "Apresenta depressões e clima semiárido, caracterizado pelas altas temperaturas e pela má "+
                            "distribuição de chuvas durante o ano.@1"+
                            "Apesar de sua aparência, sua vegetação é muito rica, variando a maioria delas conforme a "+
                            "época de chuvas e conforme a localização. Muitas espécies ainda não foram catalogadas. As "+
                            "bromélias e os cactos são as duas principais famílias da região, destacando-se os mandacarus, "+
                            "os caroás, os xique-xiques, as macambiras e outras mais.@1"+
                            "@1<small>Disponível em: http://pt.wikipedia.org/wiki/Geografia_do_Brasil. Acesso em: 4 abr. 212. *Adaptado para fins didáticos.</small> @2 "+
                            "Esse domínio é a ";
                    qA = "Caatinga. ";
                    qB = "Floresta. ";
                    qC = "Pradaria. ";
                    qD = "Savana. ";
                    resolucao = "Esta é a descrição da caatinga, um domínio morfoclimático muito quente, com baixos índices de chuvas, possuem diversas plantas com espinhos (cactos) e com " +
                            "alta capacidade de armazenar água (mandacarus)."; prerequisito = ""; break;

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
        this.prerequisito = traduzir.enunciado(prerequisito);
        sEnunciado = Html.fromHtml(sourceString, simulado , null);
        sqA = Html.fromHtml(qA, simulado , null);
        sqB = Html.fromHtml(qB, simulado , null);
        sqC = Html.fromHtml(qC, simulado , null);
        sqD = Html.fromHtml(qD, simulado , null);
        sqE = Html.fromHtml(qE, simulado , null);
        sResolucao = Html.fromHtml(resolucao, simulado , null);
        sPrerequisito = Html.fromHtml(prerequisito, simulado , null);
    }


    public Spanned getEnunciado() {
        return sEnunciado;
    };

    public int getEspecie() { return especie; };

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
    public Spanned getsPrerequisito() {
        return sPrerequisito;
    }

    public int getCountQuestao(String materia, String tipo ) {
        countQuestao = 1;

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