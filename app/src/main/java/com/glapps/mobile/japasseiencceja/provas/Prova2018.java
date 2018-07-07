package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2018 {





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
            D,A,D,B,B,D,C,B,D,C,
            C,D,C,C,A,B,A,A,D,B,
            A,C,C,B,A,D,D,C,D,C,
    };

    String[] gabch = {
            D,C,C,A,B,C,A,A,D,D,
            C,A,B,C,C,A,D,C,D,C,
            B,D,C,C,A,D,B,D,C,B,
    };

    String[] gablc = {
            D,A,C,A,D,B,C,B,A,D,
            A,D,B,B,C,B,C,A,C,A,
            C,B,A,C,A,D,D,D,D,C,
    };

    String[] gabmt = {
            A,C,D,B,C,D,A,C,C,B,
            C,A,C,D,B,B,B,C,B,B,
            D,D,D,B,B,B,C,A,B,B,
    };


    public Prova2018(Context contexto, Simulado simulado) {
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
                    sourceString ="@b A internetb@ @2 "+
                            "<i>Sites</i> de relacionamento, serviços de mensagem instantânea, salas de bate-papo, fóruns, b<i>logs</i> e <i>logs</i> e mais <i>logs</i>, todos tinham algo a dizer e tudo estava lá para quem quisesse saber. Muitos dizem que a internet encurtou o mundo, mas a sensação que tenho é de que ela deixou o mundo maior, muito maior, com ela se vai mais longe. Você pode usá-la para o que quiser, pode ser praticamente quem quiser, pode tentar se descobrir dentro dela ou simplesmente pode viver completamente sem ela.@1 "+
                            "<small>Disponível em: http://sociedaderacionalista.org. Acesso em: 13 set. 2013.</small> @2 "+
                            "O advento da internet modificou a sociedade e as possibilidades de relação humana. A partir da leitura do texto, destaca-se o aspecto da  ";
                    qA = "fonte de informações temporárias.  ";
                    qB = "descoberta de meios conversacionais.  ";
                    qC = "comunicação regulada entre os lugares.  ";
                    qD = "aproximação entre pessoas e conhecimento. ";
                    break;

                case 2:
                    sourceString ="@b A linguagem dos jovensb@ @2 "+
                            "O uso do \"internetês\" e o exagero do gerúndio no dia a dia de universitários preocupam os professores de língua portuguesa. Junto com o surgimento dos comunicadores instantâneos (<i>chats on-line, blogs</i>, MSN, ICQ), surgiu também uma linguagem típica da internet. Ela é caracterizada pela agilidade e facilidade de escrita e, por isso, é composta quase que inteiramente por abreviações — ou podemos até dizer por códigos. Aliás, se uma pessoa que não está acostumada a conversar em chats on-line se deparar com a frase a seguir, dificilmente conseguirá entender muita coisa: \"Pq vc naum xego na hr q eu t flei?\" Traduzindo, seria: \"Por que você não chegou na hora em que eu te falei?\". Esse é o chamado \"internetês\", a linguagem típica usada para se comunicar na internet. @1 "+
                            "<small>Disponível em: www.universia.com.br. Acesso em: 2 maio 2010.</small>@2 "+
                            "A preocupação dos professores de língua portuguesa se dá em razão da formação de um linguajar próprio da internet (o \"internetês\"), que enfatiza a  ";
                    qA = "comunicação e ignora as regras de grafia, esquecendo a necessidade de exercitar uma "+
                            "modalidade da linguagem formal, culta.  ";
                    qB = "conversação entre as pessoas que estão mais próximas e por isso não atendem a correção gramatical.  ";
                    qC = "formalidade das conversas realizadas na internet, que exigem dos usuários um linguajar "+
                            "formal e baseado na estrutura da gramática.  ";
                    qD = "linguagem no sentido do discurso da escrita, em que as expressões devem ser corretamente "+
                            "prescritas pelas regras gramaticais.  ";
                    break;

                case 3:
                    sourceString ="A Geração <i>Net</i> não se conforma em ser apenas espectadora dos acontecimentos. Ao contrário dos seus pais <i>boomers</i> (primeira geração que teve efetivamente uma tecnologia da comunicação), acostumados a sentar e receber informações, seja pela TV ou na escola, os nativos digitais estão acostumados a buscar pelas informações que lhes interessam e a interagir com quem disponibilizou tais informações. @2 "+
                            "<small>PARAIBA, C. S.; GOBBI, M. C. Os jovens e as tecnologias da informação e da comunicação: aprendizado na prática. <b>Revista Anagrama</b>, n. 4, jul. 2010 (adaptado). </small> @2 "+
                            "Com todas essas transformações que os seres humanos vêm enfrentando, qual seria a essência da Geração <i>Net</i>?  ";
                    qA = "Contextualização das informações.  ";
                    qB = "Recepção passiva de informações.  ";
                    qC = "Interatividade.  ";
                    qD = "Hiperatividade. ";
                    break;

                case 4:
                    sourceString ="@cimg lc580041 cimg@@2 "+
                            "<small>SOUSA, M. Disponível em: www.turmadamonica.com.br. Acesso em: 17 set. 2013.</small> @2 "+
                            "No diálogo travado na tirinha, a dificuldade de compreensão entre o personagem Chico Bento e sua professora revela, implicitamente, ";
                    qA = "desconsideração da escola em relação a uma variedade linguística.  ";
                    qB = "desobediência do aluno em aprender a língua portuguesa corretamente.  ";
                    qC = "descontentamento da professora em relação à sua atuação profissional.  ";
                    qD = "desinteresse da escola em atribuir boas notas aos alunos nas aulas de português. ";
                    break;

                case 5:
                    sourceString ="@b Seja uma pessoa menos ocupadab@ @2 "+
                            "Desde cedo aprendemos que é preciso \"ralar\" pra ter sucesso, que Deus ajuda quem cedo madruga, e por aí vai. Mas acredite: os que mais \"ralam\" nem sempre se tornam os melhores. Claro que é preciso investir tempo para se tornar bom em algo. Mas o principal não é trabalhar horas a fio, e sim ter foco no tipo certo de trabalho. Se você vive ocupado, está fazendo algo errado.@1 "+
                            "Diversos estudos mostram isso há muito tempo. Por exemplo, uma análise feita por psicólogos alemães sobre a rotina de violinistas da Universidade das Artes de Berlim, 1993. Eles dividiram os alunos em dois grupos de acordo com sua habilidade: os de \"elite\" e os \"medianos\". Os dois grupos dedicaram em média 50 horas por semana ao estudo do violino. Só que os medianos praticavam aleatoriamente ao longo do dia, enquanto os de elite concentravam seu trabalho em dois períodos fixos: manhã e tarde.@1 "+
                            "Quanto melhor o violinista, mais rígida era a divisão entre trabalho e lazer. Os melhores dormiam uma hora a mais e dedicavam mais tempo à diversão. No fim das contas, os mais habilidosos eram os mais relaxados.@2 "+
                            "<small>NEWPORT, C. <b>Superinteressante</b>, n. 10, ago. 2013.</small> @2 "+
                            "Textos veiculados em jornais e revistas podem ter diferentes finalidades, como divertir, desafiar, comentar, entre outras. Nesse texto, a referência ao estudo realizado pelos psicólogos alemães tem como objetivo ";
                    qA = "divulgar a importância da pesquisa para a ciência.  ";
                    qB = "avaliar problemas sociais decorrentes do trabalho.  ";
                    qC = "criticar o estilo de vida dos grupos estudados.  ";
                    qD = "convencer o leitor a mudar de atitude. ";
                    break;

                case 6:
                    sourceString ="@cimg lc580061 cimg@ @2 "+
                            "<small>Disponível em: www.hortifruti.com. Acesso em: 23 set. 2013.</small> @2 "+
                            "O <i>outdoor Chuchurek</i>, elaborado a partir do diálogo com o filme <i>Shrek</i>, para divulgar o produto e atrair clientes, utiliza a criatividade e o humor na relação estabelecida entre o(a) ";
                    qA = "lugar de origem e o lugar de destino do chuchu.  ";
                    qB = "sucesso do personagem e o produto anunciado.  ";
                    qC = "imagem do chuchu e a palavra estrela.  ";
                    qD = "nome da empresa e o objetivo do texto. ";
                    break;

                case 7:
                    sourceString ="@cimg lc580071 cimg@ @1 "+
                            "<small>CEDRAZ, A. <b>Xaxado</b>. Disponível em: http://jornaldatarde.uol.com.br. Acesso em: 11 set. 2014.</small> @2 "+
                            "A tirinha de Antônio Cedraz apresenta uma variedade linguística da língua portuguesa evidenciada no texto em função do(a) ";
                    qA = "caracterização das personagens.  ";
                    qB = "simplicidade do vocabulário.  ";
                    qC = "grafia das palavras.  ";
                    qD = "assunto do texto. ";
                    break;

                case 8:
                    sourceString ="@cimg lc580081 cimg@ @2 "+
                            "Levar água tratada até sua casa custa caro. Se 10% dos 3,2 milhões de casas conectadas à rede de água na cidade de São Paulo tiverem um vazamento da largura de um palito de dente, após 6 dias, elas perderão 6,2 bilhões de litros de água. Para fornecer essa água que é jogada fora, o governo gasta o dinheiro que poderia ser aplicado em outras áreas, como educação, por exemplo. @2 "+
                            "<small>Disponível em: http://planetasustentavel.abril.com.br. Acesso em: 1 set. 2013 (adaptado).</small> @2 "+
                            "Esse texto publicitário faz parte de uma campanha realizada pelo Instituto Akatu para o Consumo Consciente. Pela mobilização de elementos verbais e não verbais, com finalidade persuasiva, a campanha espera que o leitor compreenda que: ";
                    qA = "o consumo excessivo de água determina a falta de qualidade na educação do país.  ";
                    qB = "o mau uso da água pelo cidadão resulta em um desperdício de verbas públicas.  ";
                    qC = "os recursos destinados à escola dependem do consumo de água nas cidades.  ";
                    qD = "a redução de verbas públicas decorre da falta de educação ambiental do povo. ";
                    break;

                case 9:
                    sourceString ="O leitor Bruno Zilberman Vainer conta que teve problemas com o serviço de internet da empresa X. Ele conta que tem em casa o serviço <i>Live</i> X, de banda larga. Sete meses depois de o produto ter sido instalado, o sinal da internet foi cortado sem nenhuma explicação.@1 "+
                            "\"Não entendi o ocorrido e telefonei para a empresa. E a atendente me disse que meu produto nunca existiu\", relata. Vainer afirma estar sem internet há 20 dias. \"Isso tem me trazido um prejuízo incalculável, já que não consigo mais fazer qualquer negócio de casa. Além de tudo, o meu telefone só funciona com internet. Eles também disseram que a instalação do produto está pendente na empresa, mesmo depois de sete meses de uso.\"@2 "+
                            "<small>Disponível em: www1.folha.uol.com.br. Acesso em: 6 set. 2013 (adaptado).</small> @2 "+
                            "O texto apresenta causas e consequências sobre o problema do corte do serviço de acesso à internet oferecido pela empresa X a um de seus usuários. O enunciado que expressa uma consequência do problema narrado pelo autor é:  ";
                    qA = "\"Isso tem me trazido um prejuízo incalculável [...]\".  ";
                    qB = "\"[...] a instalação do produto está pendente na empresa [...]\".  ";
                    qC = "\"E a atendente me disse que meu produto nunca existiu [...]\".  ";
                    qD = "\"[...] o sinal da internet foi cortado sem nenhuma explicação\". ";
                    break;

                case 10:
                    sourceString ="TEXTO 1 "+
                            "@b Acúmulo ou desvio de função? Só remuneradob@ @2 "+
                            "O mundo corporativo nem sempre é tranquilo como se espera. Muitas vezes, é comum um profissional contratado para determinado cargo ser solicitado em outro setor, ou para cobrir a ausência de um colega. Muitas vezes, a pessoa acaba se sobrecarregando e desempenhando uma tarefa que não lhe compete. Isso pode acarretar diversas implicações, tanto para a pessoa quanto para a empresa. As situações correspondem aos chamados desvio e acúmulo de funções. Tanto o acúmulo quanto o desvio só podem ocorrer se houver equiparação salarial. No primeiro caso, o profissional tem direito ao seu salário normal e um <i>plus</i> referente à função acumulada. Na outra situação, deve prevalecer o salário mais alto entre os dois postos. Nas duas situações, é necessário que trabalhadores e empresas estejam dispostos a fazer concessões.@1 "+
                            "<small>VIEIRA, T. <b>Folha de Pernambuco</b>, 1 out. 2013.</small> @2 "+
                            "TEXTO 2 "+
                            "Art. 468 — Nos contratos individuais de trabalho, só é lícita a alteração das respectivas condições por mútuo consentimento, e ainda assim desde que não resultem, direta ou indiretamente, prejuízos ao empregado, sob pena de nulidade da cláusula infrigente desta garantia. @1 "+
                            "<small>Consolidação das Leis Trabalhistas. Disponível em: www.planalto.gov.br. Acesso em: 2 out. 2013.</small> @2 "+
                            "Com vistas a solucionar possíveis conflitos entre trabalhadores e empresas, os dois textos tendem a reconhecer que o(a)  ";
                    qA = "realização de tarefas adicionais ou o desempenho de atividades diferentes daquelas para "+
                            "qual o empregado foi originalmente contratado são práticas ilegais.  ";
                    qB = "trabalhador que está desempenhando função diferente daquela para a qual foi inicialmente "+
                            "admitido pode ter perda salarial.  ";
                    qC = "possibilidade de incremento na remuneração é discutível nos casos em que o trabalhador "+
                            "tem aumento de tarefas.  ";
                    qD = "estabelecimento das duas situações descritas depende de negociação entre contratados e "+
                            "empregadores. ";
                    break;

                case 11:
                    sourceString ="@cimg lc580111 cimg@@1 "+
                            "<small>Disponível em: www.ccms.saude.gov.br. Acesso em: 3 set. 2013 (adaptado). </small> @2 "+
                            "Esse cartaz contém recursos expressivos que o caracterizam como um texto  ";
                    qA = "publicitário, pois busca convencer os idosos a se vacinar.  ";
                    qB = "artístico, pois detalha aspectos próprios das artes visuais.  ";
                    qC = "científico, pois informa sobre uma importante descoberta recente.  ";
                    qD = "de entretenimento, pois apresenta uma foto de pessoas se divertindo. ";
                    break;

                case 12:
                    sourceString ="A língua é a nacionalidade do pensamento como a pátria é a nacionalidade do povo. Não é obrigando-a a estacionar que hão de manter e polir as qualidades que porventura ornem uma língua qualquer; mas sim fazendo que acompanhe o progresso das ideias e se molde às novas tendências do espírito.@1 "+
                            "Criar termos necessários para exprimir os inventos recentes, assimilar-se aqueles que, embora oriundos de línguas diversas, sejam indispensáveis, e sobretudo explorar as próprias fontes, veios preciosos onde talvez ficaram esquecidas muitas pedras finas, essa é a missão das línguas cultas e seu verdadeiro classicismo.@1 "+
                            "Quanto à frase ou estilo, também não se pode imobilizar quando o espírito, de que ela é expressão, varia com os séculos de aspirações e hábitos. Sem o arremedo vil da locução alheia e a imitação dos estrangeiros, devem as línguas aceitar algumas novas maneiras de dizer, graciosas e elegantes, que não repugnem ao seu gênio e organismo.@1 "+
                            "<small>ALENCAR, J. Língua e progresso. In: CARDOSO, W.; CUNHA, C. Português através de textos: estilística e gramática histórica. Rio de Janeiro: Tempo Brasileiro, 1978 (adaptado).</small> @2  "+
                            "De acordo com o texto, para sua preservação e sobrevivência, a língua deve acompanhar o progresso. A respeito dessa dinâmica nas formas de expressão das línguas, o autor considera que  ";
                    qA = "a imitação da linguagem de outros povos garante o desenvolvimento da nação.  ";
                    qB = "os neologismos válidos para a preservação da língua são os oriundos do próprio idioma.  ";
                    qC = "as palavras antigas são desnecessárias na língua corrente porque pertencem a outra época.";
                    qD = "as inovações no vocabulário devem ser aceitas para que a língua expresse a nacionalidade do povo.";
                    break;

                case 13:
                    sourceString ="@b O peixeb@ @2 "+
                            "<centro>Tendo por berço o lago cristalino, @1 "+
                            "Folga o peixe, a nadar todo inocente, @1 "+
                            "Medo ou receio do porvir não sente, @1 "+
                            "Pois vive incauto do fatal destino. @1 "+
                            "Se na ponta de um fio longo e fino @1 "+
                            "A isca avista, ferra-a inconsciente, @1 "+
                            "Ficando o pobre peixe de repente, @1 "+
                            "Preso ao anzol do pescador ladino. @1 "+
                            "O camponês, também, do nosso Estado, @1 "+
                            "Ante a campanha eleitoral, coitado!@1 "+
                            "Daquele peixe tem a mesma sorte. @1 "+
                            "Antes do pleito, festa, riso e gosto,@1  "+
                            "Depois do pleito, imposto e mais imposto.@1 "+
                            "Pobre matuto do sertão do Norte!</centro> @1 "+
                            "<small>PATATIVA DO ASSARÉ. Digo e não peço segredo. São Paulo: Escrituras, 2001. </small> @2 "+
                            "No contexto em que foi usado, o peixe está representando, simbolicamente, o(s)  ";
                    qA = "destino incerto.  ";
                    qB = "sertanejo iludido.  ";
                    qC = "pescador maldoso.  ";
                    qD = "políticos em campanha. ";
                    break;

                case 14:
                    sourceString ="Como a educação ainda é privilégio de muito pouca gente em nosso país, uma quantidade gigantesca de brasileiros permanece à margem do domínio de uma norma-padrão. <i>Assim</i>, da mesma forma como existem milhões de brasileiros sem terra, sem escola, sem teto, sem trabalho, sem saúde, também existem milhões de brasileiros sem língua. <i>Afinal</i>, se formos acreditar no mito da língua única, existem milhões de pessoas neste país que não têm acesso a essa língua, que é a norma literária, culta, empregada pelos escritores e jornalistas, pelas instituições oficiais, pelos órgãos do poder 2 são os sem-língua.@1 "+
                            "É claro que eles também falam português, uma variedade de português não padrão, com sua gramática particular, que no entanto não é reconhecida como válida, que é desprestigiada, ridicularizada, alvo de chacota e de escárnio por parte dos falantes do português-padrão ou mesmo daqueles que, não falando o português.padrão, o tomam como referência ideal — por isso podemos chamá-los de sem-língua. @2 "+
                            "<small>BAGNO, M. <b>Preconceito linguístico</b>: o que é, como se faz. São Paulo: Loyola, 1999 (adaptado).</small>@2  "+
                            "Na elaboração de um texto, alguns elementos concorrem para sua organização e estruturação. Nesse trecho, as palavras e a expressão destacadas  ";
                    qA = "reforçam as ideias apresentadas.  ";
                    qB = "relacionam os argumentos apresentados.  ";
                    qC = "resumem crenças sobre a língua portuguesa.  ";
                    qD = "contradizem concepções de escritores e jornalistas. ";
                    break;

                case 15:
                    sourceString ="@b Coração civilb@ @2 "+
                            "<centro>Quero a utopia, quero tudo e mais @1 "+
                            "Quero a felicidade nos olhos de um pai @1 "+
                            "Quero a alegria muita gente feliz @1 "+
                            "Quero que a justiça reine em meu país @1 "+
                            "Quero a liberdade, quero o vinho e o pão @1 "+
                            "Quero ser amizade, quero amor, prazer @1 "+
                            "Quero nossa cidade sempre ensolarada @1 "+
                            "Os meninos e o povo no poder, eu quero ver @1  "+
                            "São José da Costa Rica, coração civil @1 "+
                            "Me inspire no meu sonho de amor Brasil @1  "+
                            "Se o poeta é o que sonha o que vai ser real @1  "+
                            "Vou sonhar coisas boas que o homem faz @1 "+
                            "E esperar pelos frutos no quintal </centro> @2 "+
                            "<small>BRANT, F.; NASCIMENTO, M. Disponível em: http://musica.com.br. Acesso em: 14 jul. 2014 (fragmento)</small>.  "+
                            "Nessa letra da canção, o eu poético expressa seus anseios em relação à nação brasileira. Nesse sentido, expressa uma visão  ";
                    qA = "prática.  ";
                    qB = "racional.  ";
                    qC = "idealista.  ";
                    qD = "fantasiosa. ";
                    break;

                case 16:
                    sourceString ="@b Voz do sangueb@ @2 "+
                            "<centro>Palpitam-me @1 "+
                            "os sons do batuque @1 "+
                            "e os ritmos melancólicos do blue @1 "+
                            "Ó negro esfarrapado @1 "+
                            "do Harlem @1 "+
                            "ó dançarino de Chicago @1 "+
                            "ó negro servidor do South @1 "+
                            "Ó negro da África negros de todo o mundo @1 "+
                            "[...] @1 "+
                            "Eu vos acompanho @1 "+
                            "pelas emaranhadas áfricas @1 "+
                            "do nosso Rumo. @1 "+
                            "Eu vos sinto @1 "+
                            "negros de todo o mundo @1 "+
                            "eu vivo a nossa história @1 "+
                            "meus irmãos.</centro> @2 "+
                            "<small>AGOSTINHO NETO. Disponível em: www.agostinhoneto.org. Acesso em: 15 jul. 2014 (fragmento).</small> @2  "+
                            "A voz poética dirige-se a seu interlocutor, a quem manifesta um sentimento identificado como  ";
                    qA = "orgulho de sua condição provinciana.  ";
                    qB = "pertencimento ao seu grupo étnico.  ";
                    qC = "valorização de seu local de origem.  ";
                    qD = "resignação diante do sofrimento. ";
                    break;

                case 17:
                    sourceString ="@b Geração Paissandub@ @2 "+
                            "<centro>Vim, como todo mundo, @1 "+
                            "do quarto escuro da infância, @1 "+
                            "mundo de coisas e ânsias indecifráveis, @1 "+
                            "de só desejo e repulsa. @1 "+
                            "Cresci com a pressa de sempre.@2 "+
                            "Fui jovem, com a sede de todos, @1 "+
                            "em tempo de seco fascismo. @1 "+
                            "Por isso não tive pátria, só discos. @1 "+
                            "Amei, como todos pensam. @1 "+
                            "Troquei carícias cegas nos cinemas, @1 "+
                            "li todos os livros, acreditei @1 "+
                            "em quase tudo por ao menos um minuto, @1 "+
                            "provei do que pintou, adolesci. @2 "+
                            "Vi tudo que vi, entendi como pude. @1 "+
                            "Depois, como de direito, endureci. @1 "+
                            "Agora a minha boca não arde tanto de sede. @1 "+
                            "As minhas mãos é que coçam — @1 "+
                            "vontade de destilar depressa, @1 "+
                            "antes que esfrie, @1 "+
                            "esse caldo morno de vida.</centro> @2 "+
                            "<small>BRITTO, P. H. Geração Paissandu. In: MORICONI, I. (Org.). <b>Os cem melhores poemas brasileiros do século</b>. Rio de Janeiro: Objetiva, 2001.</small> @2 "+
                            "No poema, observam-se, nas três estrofes, respectivamente, a infância, a juventude e a idade adulta. Nesta última fase, os versos \"As minhas mãos é que coçam — /vontade de destilar /depressa, antes que esfrie, /esse caldo morno de vida\" proclamam o seguinte valor humano: ";
                    qA = "Vontade de sonhar.  ";
                    qB = "Força para descobrir.  ";
                    qC = "Desejo de realização.  ";
                    qD = "Igualdade de direitos. ";
                    break;

                case 18:
                    sourceString ="@cimg lc580181 cimg@@1 "+
                            "<centro><small>ELZAN, K. <b>Long Pipe</b>, 1812.</small>@2 "+
                            "<small>Disponível em: www.sabercultural.com. Acesso em: 7 dez. 2010.</small>@2 "+
                            "Ao utilizar a xilogravura, técnica que faz uso de blocos de madeira para impressão, Kikukawa Elzan, atento aos padrões estéticos de sua época, estava interessado em ";
                    qA = "demonstrar a elegância das vestimentas usadas no século XIX.  ";
                    qB = "reproduzir a vida tranquila da mulher camponesa.  ";
                    qC = "demonstrar a beleza dos ideogramas. ";
                    qD = "reproduzir a simplicidade feminina. ";
                    break;

                case 19:
                    sourceString ="@b Morte de lutador de MMA reabre discussão sobre perda de pesob@ @2 "+
                            "Um laudo preliminar do Instituto Médico Legal (IML) apontou que Feijão, 26, sofreu um acidente vascular cerebral hemorrágico, agravado por esforço excessivo ou doença preliminar. Ele estava na sauna e tentava perder peso para lutar no <i>Shooto</i>, torneio que aconteceria ontem, no Rio, e foi cancelado.@2 "+
                            "<small><b>Folha de São Paulo</b>, 2 out. 2013 (adaptado).</small>@2 "+
                            "O fato apresentado na reportagem evidencia que a prática do esporte nem sempre é sinônimo de saúde. Descartando-se a possibilidade desse acontecimento ter se agravado por doenças preliminares, conclui-se que isso acontece em função da ";
                    qA = "fragilidade do acompanhamento clínico nos treinamentos.  ";
                    qB = "falta de seletividade observada nas cargas genéticas dos atletas.  ";
                    qC = "obrigação dos atletas em superar seus limites físicos nos esportes competitivos.  ";
                    qD = "influência provocada em atletas praticantes de esportes de lutas por abalos emocionais. ";
                    break;

                case 20:
                    sourceString ="@cimg lc580201 cimg@@2 "+
                            "<centro><small>PAULINO, R. <i>Sem título</i>. Série Bastidores. Imagem sobre tecido com bordado em bastidor. MAM, São Paulo, 1997.</small></centro> "+
                            "<small>Disponível em: www.mam.org.br. Acesso em: 5 set. 2013.</small> @2 "+
                            "Por meio das tarjas pretas bordadas sobre os retratos, a artista Rosana Paulino denuncia a ";
                    qA = "condição social das mulheres negras.  ";
                    qB = "falta de inovação nas artes visuais.  ";
                    qC = "tortura física durante a escravidão.  ";
                    qD = "limitação da fotografia como forma de crítica social. ";
                    break;

                case 21:
                    sourceString ="@cimg lc580211 cimg@@2 "+
                            "<small>ROSSETTI, C. Disponível em: www.carolrossetti.com.br. Acesso em: 13 maio 2015.</small>@2 "+
                            "Na imagem e no texto, a compreensão da linguagem corporal como forma de expressão crítica é percebida a partir do  ";
                    qA = "descontentamento com a aparência.  ";
                    qB = "desgaste da autoestima devido aos rótulos.  ";
                    qC = "uso do cabelo como construtor de identidade.  ";
                    qD = "desejo de adequar.se aos padrões estético.sociais. ";
                    break;

                case 22:
                    sourceString ="A escolha de uma nação como sede de uma Copa do Mundo de Futebol ou uma edição dos Jogos Olímpicos, por exemplo, representa muito mais do que uma conquista esportiva, pode ser um meio de divulgação política, de retorno e investimento econômico e evocação de sentimentos identitários, emotivos e culturais... No caso específico do futebol, podemos observar o interesse de países que não possuem reconhecimento nesse esporte, buscando sediar o principal evento futebolístico, a Copa do Mundo.@2 "+
                            "<small>BOSCHILIA, B.; VLASTUIN, J.; MARCHI JR., W. <b>Revista Brasileira de Ciências do Esporte</b>, n. 1, set. 2008.</small>@2 "+
                            "Nesse texto, é possível perceber que as razões da escolha de sedes em países sem a vivência do futebol têm raízes na  ";
                    qA = "modificação frequente das regras como mecanismo de socialização.  ";
                    qB = "criação de meios que atraiam potenciais consumidores desse esporte.  ";
                    qC = "intenção objetiva de absorver as mais variadas culturas esportivas mundiais. ";
                    qD = "investida crescente de estudos sobre o treinamento desportivo e eventos competitivos. ";
                    break;

                case 23:
                    sourceString ="@b Prepárate para visitar Perú, un país megadiversob@ @2 "+
                            "Prepara tus ojos para ver desde el Hermoso Barroco hasta los vertiginosos colores del desierto...@1 "+
                            "Prepara tu nariz para sentir la fragancia de especias extrañas y desconocidas... @1 "+
                            "Prepara tu lengua para el sabor de los platos más sazonados de la Cocina Criolla... @1 "+
                            "Prepara tus manos para la sensación de suavidad de la lana de Alpaca que abriga y protege tu cuerpo en la sierra...@1 "+
                            "Prepara tus oídos para el sonido encantado de Flautas Andinas y acompañamientos... y finalmente...@1 "+
                            "<centro><b>Prepara tu corazón para conocer y apreciar gente especial que ama, siente y vive la vida trascendiendo la herencia de sus ancestros...</b></centro> @2 "+
                            "<small>Disponível em: www.sumaqperu.com. Acesso em: 14 set. 2013 (adaptado).</small>@2 "+
                            "No anúncio, a repetição da palavra \"prepara\" é um recurso empregado para ";
                    qA = "convencer o leitor a visitar o Peru.  ";
                    qB = "divulgar os pontos turísticos do país.  ";
                    qC = "destacar a sonoridade da música peruana.  ";
                    qD = "ressaltar os sabores da culinária peruana. ";
                    break;

                case 24:
                    sourceString ="@b Hollywood bate a las aulas b@ @2 "+
                            "Da igual que sea cierto o no lo que ven en las películas históricas: los estudiantes lo recuerdan como válido aun cuando hayan leído en sus libros de texto o hayan escuchado de sus profesores lo contrario. Ése es el resultado de una investigación realizada por la universidad de Washington en San Luis. En su experimento con 108 estudiantes, cuando la información de los filmes contradecía los textos, hasta la mitad de los jóvenes recordaban únicamente los datos, incorrectos, de los filmes. En ocasiones incluso atribuyeron al texto en lugar de a las películas.@2 "+
                            "<small><b>Revista Historia y Vida</b>, n. 499, out. 2009.</small>@2 "+
                            "O título <i>Hollywood bate a las aulas</i> antecipa o resultado de uma pesquisa, segundo a qual ";
                    qA = "os filmes históricos reproduzem as informações contidas nos livros.  ";
                    qB = "os estudantes preferem filmes sobre fatos históricos a livros e aulas.  ";
                    qC = "os estudantes memorizam mais informações históricas contidas em filmes do que em livros e aulas.  ";
                    qD = "os filmes históricos são usados pelos estudantes para conferir informações obtidas em sala de aula. ";
                    break;

                case 25:
                    sourceString ="Ladies and Gentlemen, welcome aboard [...]. Place all carry.on baggage in the overhead compartments or under the seat in front of you. It is prohibited to smoke, and the use of electronic equipment and cellular phones is restricted. Please refer to the safety card or to the flight attendant. Thanks.@2 "+
                            "<small>Disponível em: http://issuu.com. Acesso em: 15 set. 2013.</small>@2 "+
                            "O texto traz orientações que geralmente são ouvidas em ";
                    qA = "embarque em aviões.  ";
                    qB = "abertura de conferências.  ";
                    qC = "recepção de grupos turísticos.  ";
                    qD = "início de espetáculos musicais. ";
                    break;

                case 26:
                    sourceString ="@cimg lc580261 cimg@@1"+
                            "<small>Disponível em: http://web.mta.info. Acesso em: 10 set. 2013.</small>@2 "+
                            "Os transportes públicos, em geral, divulgam mensagens a seus usuários. Nessa mensagem, o objetivo é  ";
                    qA = "apontar para o local das portas de saída.  ";
                    qB = "orientar para atitudes em caso de incêndio.  ";
                    qC = "alertar contra a descida de trens em movimento.  ";
                    qD = "informar sobre procedimentos em caso de emergência. ";
                    break;

                case 27:
                    sourceString ="@b Grupo de cientistas consegue decifrar 95% do genoma do trigob@ @2 "+
                            "Poucas coisas mudaram tanto o mundo quanto uma planta selvagem. Ao semear as melhores versões de uma espécie daninha 10 mil anos atrás, o homem viu crescer aquele que se transformaria no motor da civilização. O trigo é apontado como principal agente da revolução neolítica: para cultivá-lo, o <i>Homo sapiens</i> abandonou o estilo nômade e se fixou no campo. Alguns historiadores defendem, inclusive, que não foi o ser humano que domesticou esse grão: mais justo seria dizer que a sociedade foi domesticada por ele.@1 "+
                            "Apesar da importância dessa gramínea, que provocou uma explosão demográfica e até hoje é a principal fonte de calorias da alimentação mundial, com uma produção de 711 milhões de toneladas no ano passado, o genoma do trigo não foi decifrado. Agora, porém, uma equipe internacional de pesquisadores anunciou na revista <i>Science</i> o primeiro rascunho genético do cereal. O trabalho de quase 10 anos resultou na identificação de 120 mil genes — mais de 95% do total —, muitos dos quais com importância direta para a agricultura, como a qualidade do grão, a resistência a pestes e a tolerância ao estresse ambiental. O sequenciamento cobre 61% do genoma de uma variação do trigo branco, além do detalhamento mais aprofundado do maior cromossomo do grão, o 3B.@2 "+
                            "<small>OLIVETO, P. Disponível em: www.correiobraziliense.com.br. Acesso em: 19 jul. 2014.</small>@2 "+
                            "Alguns temas, apesar de muito técnicos, são apresentados em revistas e jornais de grande circulação, destinados a um público comum. Tendo em vista seu público-alvo, esse texto busca ";
                    qA = "persuadir o leitor a cultivar trigo para consumo próprio.  ";
                    qB = "aconselhar o leitor a consumir mais trigo em sua dieta rotineira.  ";
                    qC = "descrever como o genoma do trigo foi decifrado pelos cientistas.  ";
                    qD = "informar o leitor a respeito das novas descobertas sobre o genoma do trigo. ";
                    break;

                case 28:
                    sourceString ="@b Gentileza gera gentilezab@ @2 "+
                            "Vivo num prédio em que boa parte das pessoas não dá bom dia. Nem mesmo um grunhido.@1 "+
                            "Nada. Volta e meia cruzo no pátio, indo ou vindo, com gente que vai ou vem — e abaixa rapidamente a cabeça para não cruzar os olhos e, então, ser obrigada a me cumprimentar. Essas pessoas não me conhecem, nem sabem se sou bacana ou chata, logo, não é pessoal. Até o zelador, cujas atribuições incluem dar bom dia, só cumprimenta quando está de bom humor. Então, aconteceu: Aquele vizinho, em especial, me irritava muito, porque ignorava solenemente meus sonoros bom-dia e boa-noite. Ele simplesmente passava por mim — e por todo mundo — numa marcha militar, olhos fixos em alguma movimentação de tropas no campo adversário. Eu voltava da minha aula de pilates, na manhã de quarta.feira, toda alongada e saltitante, quando o vi avançando em passadas largas na minha direção. \"Bom dia!\", eu disse. Nada.@1 "+
                            "Aquilo me irritou muito. Mas muito mesmo. Não pensei. Simplesmente me virei, marchei mais rápido do que ele, postei-me na sua frente e gritei: \"Bom dia! É importante dar bom dia para as pessoas!\". Ele ficou totalmente desconcertado. E o resto eu não vi, porque marchei direto para o elevador, num passo tão marcial como o dele.@1 "+
                            "Mas o episódio serviu para que eu pensasse nessa virtude tão subestimada em nosso mundo. Gentileza parece algo menor, descartável. Em alguns casos, até meio otário.@2 "+
                            "<small>BRUM, E. Disponível em: http://revistaepoca.globo.com. Acesso em: 20 set. 2013 (adaptado).</small>@2 "+
                            "A principal crítica que a autora desenvolve no texto recai sobre o(a)  ";
                    qA = "falta de tempo para aprofundar laços afetivos.  ";
                    qB = "excesso de timidez que prejudica o relacionamento entre condôminos.  ";
                    qC = "qualidade questionável dos serviços prestados pelos funcionários de seu edifício.  ";
                    qD = "ignorância de princípios de polidez em interações sociais por alguns indivíduos. ";
                    break;

                case 29:
                    sourceString ="@cimg lc580291 cimg@@2 "+
                            "<small><b>J. Pediatr</b>, n. 4, jul..ago. 2012.</small>@2 "+
                            "Esse fragmento de um manual orienta como deve ser feito o transporte seguro de crianças e de adolescentes. Essas instruções são relevantes para a sociedade, pois têm o objetivo de ";
                    qA = "incentivar a mudança de comportamento com os recém-nascidos.  ";
                    qB = "descrever os cuidados que se deve ter com o transporte dos filhos.  ";
                    qC = "obrigar os motoristas a transportar as pessoas de acordo com o peso.  ";
                    qD = "diminuir a incidência de lesões provocadas pelos acidentes de trânsito. ";
                    break;

                case 30:
                    sourceString ="@cimg lc580301 cimg@@2 "+
                            "<small>Disponível em: www.confiramais.com.br. Acesso em: 21 jul. 2014 (adaptado).</small>@2 "+
                            "No texto, a frase \"Pedala comigo por mais saúde para as crianças primeiro\" sugere que o leitor deve ";
                    qA = "praticar ciclismo com o autor do texto.  ";
                    qB = "lutar por brincadeiras mais saudáveis na infância.  ";
                    qC = "incentivar as crianças à prática de atividades físicas.  ";
                    qD = "posicionar-se à frente de seus filhos ao andar de bicicleta. ";
                    break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice+30) {

                case 31:
                    sourceString ="Um dos cuidados que se deve ter com os pneus de um veículo é o ajuste da \"cambagem\", isto é, do ângulo de inclinação da roda. O ângulo de cambagem é o ângulo agudo entre a reta perpe "+
                            "ndicular ao solo e a linha pontilhada, cuja intersecção ocorre no ponto <i>O</i> indicado na figura.@2 "+
                            "@cimg mt580311 cimg@@2 "+
                            "O ângulo de cambagem, em grau, representado na figura, é ";
                    qA = "20°.  ";
                    qB = "50°.  ";
                    qC = "110°.  ";
                    qD = "160°. ";
                    break;

                case 32:
                    sourceString ="Numa propriedade rural, foi instalada uma antena representada pelo ponto <i>D</i>, situado a 14 km da estrada que liga as cidades <i>A</i> e <i>B</i>. O sinal dessa antena alcança um raio de 15 km. Ela foi instalada para emitir sinais de rádio para os policiais que fazem ronda no trecho <i>AB</i>, porém, nem os moradores da cidade <i>A</i>, distante 9 km do ponto <i>C</i>, nem os moradores da cidade <i>B</i>, distante 12 km do ponto <i>C</i>, conseguem receber o sinal da antena.@2 "+
                            "@cimg mt580321 cimg@@2 "+
                            "O proprietário pretende afastar a torre da antena de sua casa o mínimo possível de sua posição original, na direção <i>CD</i>, aproximando-a de <i>C</i>, para que o sinal da antena alcance os moradores das cidades <i>A</i> e <i>B</i>. Para tanto, foram sugeridas as seguintes alterações na distância da torre de rádio em relação à sua posição original <i>D</i>:@2 "+
                            "I. 1 km. @1 "+
                            "II. 2 km. @1 "+
                            "III. 5 km. @1 "+
                            "IV. 8 km. @2 "+
                            "Dentre essas, a que atende aos interesses do proprietário é a opção ";
                    qA = "I.  ";
                    qB = "II.  ";
                    qC = "III.  ";
                    qD = "IV. ";
                    break;

                case 33:
                    sourceString ="O projeto de uma escada com 5 degraus apresenta as seguintes especificações: todos os degraus apresentam a mesma altura, o ângulo de inclinação da escada é de 30° com relação ao chão e o comprimento da escada é de 180 cm, conforme a figura.@1 "+
                            "Considere @cimg mt580331 cimg@@2 "+
                            "@cimg mt580332 cimg@@2 "+
                            "A medida, em centímetro, da altura de cada degrau é igual a ";
                    qA = "90. ";
                    qB = "36. ";
                    qC = "31. ";
                    qD = "18 ";
                    break;

                case 34:
                    sourceString ="Uma indústria fará um investimento na aquisição de novas máquinas para a produção de uma peça. Para isso, foi solicitado aos seus gerentes de produção que escolhessem um modelo de máquina que apresentasse a menor probabilidade de produzir peças defeituosas. Ao analisarem as quatro opções de compra de máquinas (I, II, III e IV), os gerentes elaboraram o quadro.@1 "+
                            "@cimg mt580341 cimg@@2 "+
                            "A quantidade de peças produzidas, a cada minuto, com ou sem defeito, é sempre constante. Qual máquina deve ser escolhida pelos gerentes de produção? ";
                    qA = "I  ";
                    qB = "II  ";
                    qC = "III  ";
                    qD = "IV ";
                    break;

                case 35:
                    sourceString ="Uma senhora que estava regando seu jardim saiu para atender o telefone e esqueceu a torneira aberta. Sua neta, preocupada com o desperdício, fechou a torneira e, em seguida, esboçou um gráfico para mostrar à avó o quanto de água seria perdida com a torneira aberta. Ela sabe que a vazão dessa torneira é de 3 litros de água por minuto. Em seu gráfico, <i>t</i> representa o tempo, em minuto, e a representa a quantidade total de água desperdiçada, em litro.@1 "+
                            "Qual é o gráfico que representa o desperdício de água dessa torneira com o passar do tempo? ";
                    qA = "@cimg mt58035a cimg@ ";
                    qB = "@cimg mt58035b cimg@ ";
                    qC = "@cimg mt58035c cimg@ ";
                    qD = "@cimg mt58035d cimg@ ";
                    break;

                case 36:
                    sourceString ="Um jardineiro trabalha na colocação de um gramado no quintal de um terreno retangular, ao redor de uma casa, conforme ilustrado na figura. Foram gastos 120 minutos de trabalho para a colocação do gramado na região quadrada sombreada. Considere que o jardineiro continuará trabalhando no mesmo ritmo até a conclusão da obra, sem interrupções, executando áreas iguais em tempos iguais.@2 "+
                            "@cimg mt580361 cimg@@2 "+
                            "Nessas condições, o jardineiro concluirá o trabalho em quantos minutos? ";
                    qA = "200  ";
                    qB = "210  ";
                    qC = "270  ";
                    qD = "300 ";
                    break;

                case 37:
                    sourceString ="Um hotel para animais hospedará 5 gatos e 10 cães pelo período de 30 dias. Por dia, cada gato consome 35 g de ração e cada cão consome 70 g. A compra das rações é feita em um dos estabelecimentos a seguir (I, II, III ou IV), em sacos fechados (sem fracionamento) de 2 000 g de ração para gatos e de 5 000 g de ração para cães, e os preços praticados, por saco de ração, em cada estabelecimento, são: @2 "+
                            "I. Ração para gatos: R$ 13,00; Ração para cães: R$ 24,00. @1 "+
                            "II. Ração para gatos: R$ 10,00; Ração para cães: R$ 26,00. @1 "+
                            "III. Ração para gatos: R$ 8,00; Ração para cães: R$ 29,00. @1 "+
                            "IV. Ração para gatos: R$ 17,00; Ração para cães: R$ 23,00. @2 "+
                            "No dia anterior à hospedagem, o administrador do hotel verifica que já possui 1 450 g de ração para gatos e 2 200 g de ração para cães. Ele decide utilizar a ração já existente, efetuando uma compra, em quantidades mínimas suficientes, e em um mesmo estabelecimento, do que falta para atender à necessidade para os 30 dias de hospedagem dos animais. A compra deverá ser feita no estabelecimento que ofereça o menor custo total.@1 "+
                            "Em qual estabelecimento deverão ser compradas as rações? ";
                    qA = "I  ";
                    qB = "II  ";
                    qC = "III ";
                    qD = "IV ";
                    break;

                case 38:
                    sourceString ="Um banco analisou o perfil de um cliente e ofereceu-lhe um empréstimo de R$ 10 000,00, podendo escolher uma das propostas a seguir: @2 "+
                            "I. Empréstimo com taxa de juros simples de 10% ao ano, a ser pago integralmente após "+
                            "15 anos. @1 "+
                            "II. Empréstimo com taxa de juros simples de 11% ao ano, a ser pago integralmente após "+
                            "16 anos. @1 "+
                            "III. Empréstimo com taxa de juros simples de 20% ao ano, a ser pago integralmente após "+
                            "6 anos. @1 "+
                            "IV. Empréstimo com taxa de juros simples de 25% ao ano, a ser pago integralmente após "+
                            "5 anos. @2 "+
                            "A proposta que gera o menor valor a pagar ao término do empréstimo é a ";
                    qA = "I.  ";
                    qB = "II. ";
                    qC = "III.  ";
                    qD = "IV. ";
                    break;

                case 39:
                    sourceString ="O prefeito de uma cidade decidiu ampliar o número de creches nos bairros mais populosos, começando por aquele que apresenta o maior número de crianças de 0 a 2 anos. As informações sobre os quatro bairros mais populosos desse município são as seguintes:@2 "+
                            "- O bairro I possui 6 500 habitantes, sendo que 15% desse total são crianças de 0 a 2 anos. @1 "+
                            "- O bairro II possui 7 800 habitantes, sendo que 12% desse total são crianças de 0 a 2 anos. @1 "+
                            "- O bairro III possui 9 000 habitantes, sendo que 11% desse total são crianças de 0 a 2 anos. @1  "+
                            "- O bairro IV possui 10 600 habitantes, sendo que 9% desse total são crianças de 0 a 2 anos. @2 "+
                            "Nas condições apresentadas, a ampliação do número de creches começará no bairro ";
                    qA = "I.  ";
                    qB = "II.  ";
                    qC = "III.  ";
                    qD = "IV. ";
                    break;

                case 40:
                    sourceString ="A Figura 1 representa um molde da planificação de um sólido geométrico. As faces desse sólido são figuras geométricas planas. Após montado, o sólido terá o formato de uma caixa, indicada na Figura 2. @2 "+
                            "@cimg mt580401 cimg@@2 "+
                            "Qual o número de arestas dessa caixa? ";
                    qA = "10  ";
                    qB = "15  ";
                    qC = "17  ";
                    qD = "18 ";
                    break;

                case 41:
                    sourceString ="Segundo dados de um relatório produzido pela Organização das Nações Unidas (ONU), 1,24 milhão de pessoas morreram em acidentes rodoviários em todo o mundo no ano de 2010.@2 "+
                            "<small>Disponível em: http://expresso.sapo.pt. Acesso em: 14 ago. 2014 (adaptado).</small>@2 "+
                            "Outra forma de constar, nesse relatório, a quantidade de pessoas que morreram em acidentes rodoviários em todo o mundo no ano de 2010 é ";
                    qA = "1 milhão e 24 pessoas.  ";
                    qB = "1 milhão e 24 000 pessoas.  ";
                    qC = "1 milhão e 240 000 pessoas.  ";
                    qD = "1 milhão e 24 000 000 pessoas. ";
                    break;

                case 42:
                    sourceString ="Um técnico de som fez uma pesquisa, durante uma semana, medindo os níveis de ruídos, em decibel, provocados pelas propagandas feitas por carros de som na cidade A. O gráfico apresenta os dados coletados na pesquisa.@2 "+
                            "@cimg mt580421 cimg@@2 "+
                            "Nessas condições, o período de um dia em que houve a maior variação de aumento do nível de ruídos foi de ";
                    qA = "segunda-feira para terça-feira.  ";
                    qB = "quinta-feira para sexta-feira.  ";
                    qC = "sexta-feira para sábado.  ";
                    qD = "sábado para domingo. ";
                    break;

                case 43:
                    sourceString ="O interior de um armazém é dividido em seis salas (<i>A, B, C, D, E, F</i>) e uma recepção (<i>R</i>), que estão conectadas por onze portas de segurança, conforme ilustrado na planta. @2 "+
                            "@cimg mt580431 cimg@@2 "+
                            "Para fazer a ronda, o guarda precisa passar por cada sala do armazém. À noite, cada vez que o guarda faz a ronda, uma porta deve ser aberta com uma chave e, em seguida, trancada após adentrar na próxima sala antes que ele se dirija para outra porta. O caminho seguido pelo guarda será indicado pela seta ->, de modo que, por exemplo, <i>A</i> -> <i>B</i> significa que ele caiu da sala <i>A</i> e chegou à sala <i>B</i>.@1 "+
                            "Os percursos que permitem ao guarda partir da recepção, passar por todas as salas, passando por cada sala uma única vez, e voltar para a recepção são: ";
                    qA = "R -> A -> B -> D -> E -> F -> R ou R -> F -> E -> D -> B -> A -> E ";
                    qB = "R -> A -> B -> D -> E -> C -> F -> E ou R -> F -> C -> E -> D -> B -> A -> R ";
                    qC = "R -> F -> E -> D -> B -> C -> A -> R ou R -> A -> C -> B -> D -> E -> F -> R ";
                    qD = "R -> F -> E -> C -> B -> A -> R ou R -> A -> B -> C -> E -> F -> R ";
                    break;

                case 44:
                    sourceString ="Uma empresa solicitou a uma gráfica um orçamento para a impressão de panfletos de propaganda. A gráfica apresentou à empresa os seguintes valores: @2 "+
                            "@cimg mt580441 cimg@@2 "+
                            "Foi explicitado no orçamento que, para qualquer quantidade de panfletos, o preço <i>P</i> da impressão é diretamente proporcional ao número <i>q</i> de panfletos impressos.@1 "+
                            "A expressão algébrica que relaciona o preço, em real, da impressão (<i>P</i>) e a quantidade de panfletos impressos (<i>q</i>) é ";
                    qA = "@cimg mt58044a cimg@ ";
                    qB = "@cimg mt58044b cimg@ ";
                    qC = "@cimg mt58044c cimg@ ";
                    qD = "@cimg mt58044d cimg@ ";
                    break;

                case 45:
                    sourceString ="Uma pequena fábrica de panelas possui uma única máquina que produz 1 000 panelas por mês. Em média, há uma perda de 2% dessa produção. Para aumentar sua produção, o dono da fábrica decide adquirir novas máquinas idênticas à que possui, que devem apresentar, portanto, o mesmo percentual de perda na produção. O dono dessa fábrica considera tolerável uma perda mensal de, no máximo, 90 panelas.@1 "+
                            "Para que a perda mensal de sua produção não ultrapasse o limite de tolerância por ele estabelecido, o número máximo de novas máquinas que ele pode adquirir é ";
                    qA = "2.  ";
                    qB = "3.  ";
                    qC = "44.  ";
                    qD = "45. ";
                    break;

                case 46:
                    sourceString ="Um agricultor deseja utilizar em toda a sua fazenda um único modelo de plantio de grãos em sua produção de grãos. Ele argumenta que o modelo a ser selecionado deverá corresponder àquele que apresente a maior média, em tonelada produzida, ao longo de um período de três anos de testes. Para isso, em pequenas áreas de sua propriedade, testa os quatro modelos disponíveis (I, II, III e IV) em um período de três anos seguidos. Os dados de produtividade que coletou desse teste se encontram no quadro comparativo.@1 "+
                            "@cimg mt580461 cimg@@2 "+
                            "Ao final dos testes, o modelo de plantio selecionado foi o de número ";
                    qA = "I.  ";
                    qB = "II.  ";
                    qC = "III.  ";
                    qD = "IV. ";
                    break;

                case 47:
                    sourceString ="O painel de um <i>outdoor</i> publicitário foi construído com a forma de um retângulo, em que os lados medem, respectivamente, 6 m e 4 m. A empresa responsável pelo <i>outdoor</i> decidiu colocar uma moldura de alumínio, ao longo dos lados do painel, melhorando o seu acabamento. O orçamento apresentado pela firma 1 indicou que o preço do metro linear dessa moldura é de R$ 14,00, enquanto que na firma 2 esse mesmo material foi orçado em R$ 16,00 o metro linear. Diante do conhecimento desses orçamentos, o gerente da firma 2 ofereceu uma redução de <i>K</i> reais no valor total da compra, tornando o seu custo final igual ao apresentado pela firma 1. @1 "+
                            "Nas condições apresentadas, o valor de <i>K</i> é igual a ";
                    qA = "R$ 48,00.  ";
                    qB = "R$ 40,00.  ";
                    qC = "R$ 24,00.  ";
                    qD = "R$ 20,00. ";
                    break;

                case 48:
                    sourceString ="Uma família agrupa seu gasto mensal em dois referenciais: Gastos residenciais (custos para manter a casa) e Gastos extras (custos pessoais e com diversão e lazer). O gráfico ilustra o gasto mensal da família, em real, em quatro meses, segundo os referenciais citados. @2 "+
                            "@cimg mt580481 cimg@@2 "+
                            "Em qual dos meses apresentados a família gastou menos? ";
                    qA = "Julho  ";
                    qB = "Agosto  ";
                    qC = "Setembro  ";
                    qD = "Outubro ";
                    break;

                case 49:
                    sourceString ="Ao utilizar a escala de um mapa, um viajante calcula que ainda precisa percorrer 12 milhões de centímetros para chegar ao seu destino.@1 "+
                            "A distância, em quilômetro, que esse viajante precisa percorrer é igual a ";
                    qA = "12.  ";
                    qB = "120.  ";
                    qC = "1 200.  ";
                    qD = "12 000. ";
                    break;

                case 50:
                    sourceString ="No mês passado, uma loja de automóveis vendeu um total de 300 carros. No mês atual, essa loja deseja que a venda total de veículos supere a do mês passado em 15%. No setor de vendas dessa loja, trabalham cinco funcionários. O funcionário I já vendeu, neste mês, 68 carros, o funcionário II vendeu 79, o funcionário III vendeu 56 e o funcionário IV vendeu 57. Esses quatro funcionários não venderão mais nenhum carro neste mês.@1 "+
                            "O funcionário V, conhecendo a quantidade vendida por seus companheiros, tem agora uma meta de vendas para que a loja alcance o objetivo deste mês.@1 "+
                            "Para alcançar sua meta, a quantidade mínima de carros que o funcionário V deve vender é ";
                    qA = "52.  ";
                    qB = "85.  ";
                    qC = "299.  ";
                    qD = "345. ";
                    break;

                case 51:
                    sourceString ="Um refeitório registrou as quantidades de refeições, em tonelada, preparadas durante os anos de 2010 a 2014. Dessas quantidades de refeições, a parte que não é consumida pelo público é considerada desperdício. Esse desperdício, observado no mesmo período, também foi registrado. Os dados estão apresentados nos gráficos.@2 "+
                            "@cimg mt580511 cimg@@2 "+
                            "Como meta para o ano de 2015, foi estabelecido que o desperdício deve ser reduzido, não devendo ultrapassar o valor dado pela diferença entre a menor quantidade de refeições preparadas em um dos anos observados e a maior quantidade de desperdício registrada em algum desses anos. O planejamento para 2015 é cumprir a meta de desperdício preparando a mesma quantidade de refeições do ano de 2012.@1 "+
                            "Para cumprir o planejamento, qual a quantidade mínima de refeições, em tonelada, que deverá ser consumida no ano de 2015? ";
                    qA = "900 ";
                    qB = "950 ";
                    qC = "1 050 ";
                    qD = "1 100 ";
                    break;

                case 52:
                    sourceString ="Uma pessoa se matriculou em um curso de informática. Ao matricular-se, foi informada de que as aulas ocorreriam sempre em 2 dias da semana, com 3 horas de aula por dia, durante 54 semanas.@1 "+
                            "Qual é a carga horária total desse curso, em hora? ";
                    qA = "59  ";
                    qB = "162  ";
                    qC = "270  ";
                    qD = "324 ";
                    break;

                case 53:
                    sourceString ="Um pedreiro foi contratado para construir uma varanda em uma residência. A varanda foi desenhada numa planta baixa da casa usando a escala 1 : 300. Ela foi desenhada em uma malha quadriculada, em que o lado de cada quadrado mede 1 cm.@2 "+
                            "@cimg mt580531 cimg@@2 "+
                            "As dimensões reais da varanda são ";
                    qA = "1 m x 2 m.  ";
                    qB = "1 m x 3 m.  ";
                    qC = "2 m x 3 m.  ";
                    qD = "3 m x 6 m. ";
                    break;

                case 54:
                    sourceString ="O Índice de Desenvolvimento da Educação Básica (Ideb) é calculado a partir de pontuações obtidas pelas escolas de ensino básico (por meio de diversas avaliações envolvendo as próprias escolas e exames realizados com alguns de seus alunos), que auxilia os governos federal, estadual e municipal brasileiros no desenvolvimento de políticas públicas para a área de educação, bem como para o estabelecimento de metas para tal pontuação no médio prazo.@1 "+
                            "O Ideb observado no ano de 2005 foi de 3,4. O quadro mostra os índices observados e as metas desejadas para os anos de 2007, 2009, 2011 e 2013. A meta prevista para 2021 é que o Ideb seja de 5,2.@2 "+
                            "@cimg mt580541 cimg@@2 "+
                            "<small>Disponível em: http://ideb.inep.gov.br. Acesso em: 6 set. 2014.</small>@2 "+
                            "Em quantos pontos o Ideb observado em 2013 deve ser aumentado para que a meta prevista para 2021 seja alcançada? ";
                    qA = "1,3  ";
                    qB = "1,5  ";
                    qC = "1,7  ";
                    qD = "1,8 ";
                    break;

                case 55:
                    sourceString ="Em 2013, o preço da diária em um determinado hotel era de R$ 310,00. Em 2014, o valor da diária nesse mesmo hotel subiu para R$ 350,00. Um turista que se hospedou nesse hotel por cinco dias em 2013 pretende, em 2014, hospedar-se por seis dias. Ele possui, em 2014, a mesma quantia em dinheiro que possuía em 2013 para gastar com hospedagem e alimentação. Sabe-se que, em 2013, ele gastou R$ 1 000,00 com alimentação durante aquela hospedagem.@2 "+
                            "<small>Disponível em: http://g1.globo.com. Acesso em: 8 ago. 2014 (adaptado).</small>@2 "+
                            "Para assegurar que seu orçamento não seja ultrapassado, o valor máximo aproximado, em real, que o turista pode gastar diariamente com alimentação durante sua hospedagem em 2014 é ";
                    qA = "68,00.  ";
                    qB = "75,00.  ";
                    qC = "127,00.  ";
                    qD = "160,00. ";
                    break;

                case 56:
                    sourceString ="Uma nutricionista receitou uma mesma dieta para quatro pacientes. Ela os pesou no início do tratamento e, ao final de cinco meses, fez uma nova pesagem. Os dados estão apresentados no gráfico.@2 "+
                            "@cimg mt580561 cimg@@2 "+
                            "Segundo os dados, quem teve a maior perda de massa, em quilograma, foi o paciente ";
                    qA = "1. ";
                    qB = "2. ";
                    qC = "3. ";
                    qD = "4. ";
                    break;

                case 57:
                    sourceString ="O proprietário de uma loja paga a seus vendedores um salário fixo de R$ 1 500,00. Com o objetivo de motivá-los e valorizá-los, também paga a cada um deles um adicional de 10% sobre o valor das vendas efetuadas por cada um durante o mês.@1 "+
                            "A expressão algébrica que permite determinar o salário mensal total (<i>y</i>) de cada vendedor dessa loja, em função das suas vendas mensais (<i>x</i>), é ";
                    qA = "<i>y</i> 150 % <i>x</i>  ";
                    qB = "<i>y</i> 150 % 0,1<i>x</i> ";
                    qC = "<i>y</i> 1 500 % 0,1<i>x</i>  ";
                    qD = "<i>y</i> 1 500<i>x</i> % 10 ";
                    break;

                case 58:
                    sourceString ="No gráfico, pode.se observar o índice de precipitação de água das chuvas (em milímetro) e a variação da temperatura média mensal (em grau Celsius) no decorrer de um ano no estado de São Paulo.@2 "+
                            "@cimg mt580581 cimg@@2 "+
                            "<small>Disponível em: http://meteoropole.com.br. Acesso em: 20 ago. 2014.</small>@2 "+
                            "Nesse período, os meses em que houve, respectivamente, o maior índice de precipitação de chuvas e a menor temperatura média foram ";
                    qA = "janeiro e julho.  ";
                    qB = "janeiro e agosto.  ";
                    qC = "fevereiro e julho.  ";
                    qD = "fevereiro e agosto. ";
                    break;

                case 59:
                    sourceString ="O diagrama de colunas mostra a produção de canetas, em milhão, entre os anos 2007 e 2011.@2 "+
                            "@cimg mt580591 cimg@@2 "+
                            "O setor de controle de qualidade da empresa visa aferir os motivos que levaram às distorções entre a produção média esperada, nesse período, e a produção registrada ano a ano.@1 "+
                            "Nessas condições, constatou-se que a média anual de canetas produzidas no período, em milhão, é igual a ";
                    qA = "7,5.  ";
                    qB = "7,8.  ";
                    qC = "9,0.  ";
                    qD = "10,5. ";
                    break;

                case 60:
                    sourceString ="O minuto da ligação de celular no Brasil custa US$ 0,74. Segundo dados do Instituto Brasileiro de Geografia e Estatística (IBGE), nos Estados Unidos, o minuto da ligação de celular custa US$ 0,27.@2 "+
                            "<small>Disponível em: http://g1.globo.com. Acesso em: 10 jul. 2014.</small>@2 "+
                            "Quanto se paga a mais, em dólar, por minuto, nas ligações de celulares no Brasil em relação às ligações nos Estados Unidos? ";
                    qA = "0,43  ";
                    qB = "0,47  ";
                    qC = "0,53  ";
                    qD = "0,57 ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {
                case 1:
                    sourceString ="Para diminuir a emissão de gases poluentes, os veículos automotores possuem equipamentos providos de substâncias capazes de converter monóxido de carbono em dióxido de carbono.@1 "+
                            "A substância que desempenha essa função é o: ";
                    qA = "inibidor.  ";
                    qB = "redutor.  ";
                    qC = "promotor.  ";
                    qD = "catalisador. ";
                    break;

                case 2:
                    sourceString ="O gráfico ilustra o desempenho do atleta canadense Donavan Bailey, em termos de sua velocidade instantânea, numa corrida de 100 m rasos nos Jogos Olímpicos de Atlanta, 1996.@1 "+
                            "@cimg cn580021 cimg@@2 "+
                            "<small>Disponível em: http://axpfep1.if.usp.br. Acesso em: 4 set. 2014 (adaptado).</small>@2 "+
                            "Em qual intervalo de tempo a magnitude da aceleração média do atleta foi maior? ";
                    qA = "Entre 0 s e 1 s. ";
                    qB = "Entre 3 s e 4 s.  ";
                    qC = "Entre 5 s e 6 s.  ";
                    qD = "Entre 7 s e 8 s. ";
                    break;

                case 3:
                    sourceString ="Técnicas de melhoramento do solo possibilitam o cultivo em solos antes inadequados. Um agricultor deseja aumentar a área cultivada para uma região de sua propriedade cujo problema é o solo encharcado.@1 "+
                            "Em um solo com esse problema, deve ser utilizada a técnica de ";
                    qA = "calagem.  ";
                    qB = "irrigação.  ";
                    qC = "adubação.  ";
                    qD = "drenagem. ";
                    break;

                case 4:
                    sourceString ="Num exame de ultrassonografia, ondas sonoras, na faixa de frequência do ultrassom, são emitidas em direção a uma parte do corpo do paciente. Essas ondas sofrem reflexão, refração e dispersão quando atravessam os tecidos com características físicas diferentes até que se possa produzir uma imagem a partir delas. O quadro indica a velocidade de propagação dessas ondas ao atravessarem quatro camadas distintas de tecidos humanos durante um exame.@1 "+
                            "@cimg cn580041 cimg@@2 "+
                            "Entre a primeira e a quarta camada, o número de refrações ocorridas é ";
                    qA = "1.  ";
                    qB = "2.  ";
                    qC = "3.  ";
                    qD = "4. ";
                    break;

                case 5:
                    sourceString ="Dengue e <i>chikungunya</i> são doenças que possuem sintomas semelhantes, tais como febre alta e fortes dores de cabeça. Além disso, a forma de transmissão é a mesma entre as duas doenças.@1 "+
                            "<small>Disponível em: http://g1.globo.com. Acesso em: 19 set. 2014 (adaptado).</small>@2 "+
                            "Uma medida que pode proporcionar a redução da disseminação dessa nova doença é ";
                    qA = "aplicar vacina na população.  ";
                    qB = "combater o vetor da doença.  ";
                    qC = "evitar contato direto com pessoas doentes.  ";
                    qD = "distribuir remédios pela rede pública de saúde. ";
                    break;

                case 6:
                    sourceString ="Os xampus comercializados no mercado com a propriedade de serem antirresíduo prometem uma limpeza profunda dos cabelos e do couro cabeludo. Esses produtos possuem pH alcalino e fazem com que as cutículas dos fios se abram, facilitando a remoção de resíduos (sujeiras, cremes etc.).@1 "+
                            "O pH desses xampus apresenta um valor mais próximo de ";
                    qA = "0,0. ";
                    qB = "3,5.  ";
                    qC = "7,0. ";
                    qD = "8,5. ";
                    break;

                case 7:
                    sourceString ="Muitos acidentes de trânsito são provocados por pessoas que dirigem sob o efeito de bebida alcoólica. Uma das possibilidades de confirmar o consumo de álcool pelo motorista é submetê-lo ao bafômetro.@1 "+
                            "Esse aparelho tem como objetivo ";
                    qA = "identificar o tipo de bebida ingerida. ";
                    qB = "calcular quando o álcool foi ingerido.  ";
                    qC = "determinar a concentração de álcool no sangue. ";
                    qD = "reconhecer os efeitos do álcool no comportamento do condutor. ";
                    break;

                case 8:
                    sourceString ="@cimg cn580081 cimg@@2 "+
                            "<small>Disponível em: http://qnint.sbq.org. Acesso em: 6 set. 2014 (adaptado).</small>@2 "+
                            "Considerando uma dieta de restrição calórica, qual a vantagem do consumo do produto light sobre o normal? ";
                    qA = "Pode ser consumido livremente por diabéticos. ";
                    qB = "Apresenta uma redução de mais de 25% da energia total.  ";
                    qC = "Apresenta todos os nutrientes energéticos em quantidades reduzidas. ";
                    qD = "Pode ser consumido livremente por pessoas em dieta para emagrecimento. ";
                    break;

                case 9:
                    sourceString ="Recentemente, foi descoberta no Brasil uma nova forma de produzir plástico utilizando uma fonte renovável: a cana-de-açúcar. Esse plástico, chamado de plástico verde, é obtido por meio da desidratação do produto final da fermentação do caldo de cana-de-açúcar e posterior polimerização.@1 "+
                            "Na etapa final de produção do plástico verde, identifica.se a transformação de ";
                    qA = "etanol em eteno.  ";
                    qB = "água em plástico.  ";
                    qC = "açúcar em etanol.  ";
                    qD = "eteno em polietileno. ";
                    break;

                case 10:
                    sourceString ="Atitudes corriqueiras ao volante são as principais causas de acidentes. O envio de mensagens de texto, por exemplo, é o tipo de falta de atenção mais alarmante, pois envolve distração manual, visual e cognitiva simultaneamente. A maioria dos condutores submetidos ao teste levou 2,0 segundos para ler uma mensagem. Para um automóvel a 108 km/h, esse tempo implicaria percorrer uma distância significativa como se o condutor estivesse de olhos vendados.@1 "+
                            "<small>CARVALHO, I. <b>Distração ao volante</b>. Disponível em: http://quatrorodas.abril.com.br. Acesso em: 8 set. 2014 (adaptado).</small>@2 "+
                            "A distância percorrida por esse automóvel, enquanto o motorista está distraído lendo a mensagem, será de ";
                    qA = "15 m.  ";
                    qB = "54 m.  ";
                    qC = "60 m.  ";
                    qD = "216 m. ";
                    break;

                case 11:
                    sourceString ="O alambique é utilizado como sistema de produção da grapa, bebida alcoólica de origem italiana. A imagem mostra o alambique utilizado para a produção de grapa a partir do bagaço da uva. Esse sistema baseia.se na diferença de temperatura de ebulição dos componentes da mistura.@1 "+
                            "@cimg cn580111 cimg@@2 "+
                            "<small>RIZZON, L. A.; MENEGUZZO, J. Disponível em: http://sistemasdeproducao.cnptia.embrapa.br. Acesso em: 15 set. 2014.</small>@2 "+
                            "O processo de separação de misturas usado é a ";
                    qA = "recristalização.  ";
                    qB = "decantação.  ";
                    qC = "destilação.  ";
                    qD = "filtração. ";
                    break;

                case 12:
                    sourceString ="As lontras, também conhecidas como ariranhas, são animais típicos do Pantanal, apresentam hábitos de vida semiaquáticos e são carnívoros. Quando adultos, se alimentam de peixes herbívoros.@1 "+
                            "<small>MOUTINHO, S. Disponível em: http://cienciahoje.uol.com.br. Acesso em: 25 ago. 2014 (adaptado).</small>@2 "+
                            "Esses animais, quando adultos, ocupam o nível trófico de ";
                    qA = "produtores.  ";
                    qB = "decompositores.  ";
                    qC = "consumidores primários.  ";
                    qD = "consumidores secundários. ";
                    break;

                case 13:
                    sourceString ="Em uma sala, instalou.se corretamente um <i>spot</i>, mostrado na figura, para duas lâmpadas. Para testar a instalação, rosqueou.se nos bocais duas lâmpadas com especificações 100 W — 127 V. A rede elétrica da casa é compatível com as lâmpadas utilizadas.@1 "+
                            "@cimg cn580131 cimg@@2 "+
                            "Ao ligar o interruptor, a potência total, em watt, do conjunto de duas lâmpadas brilhando é de ";
                    qA = "100.  ";
                    qB = "127.  ";
                    qC = "200.  ";
                    qD = "254. ";
                    break;

                case 14:
                    sourceString ="A figura alerta para a Campanha Nacional de Saúde Auditiva que tem como um dos lemas a seguinte frase: \"MP3 <i>players</i>: abaixe o volume ou diminua sua audição para sempre\". O objetivo da campanha é conscientizar as pessoas sobre os danos à audição que podem ser causados por atos como ouvir música alta no fone de ouvido.@1 "+
                            "@cimg cn580141 cimg@@2 "+
                            "<small>Disponível em: www.tecmundo.com.br. Acesso em: 14 set. 2014 (adaptado).</small>@2 "+
                            "A unidade que aparece na figura relaciona.se com qual propriedade da onda sonora? ";
                    qA = "Velocidade.  ";
                    qB = "Frequência.  ";
                    qC = "Intensidade.  ";
                    qD = "Comprimento de onda. ";
                    break;

                case 15:
                    sourceString ="Muitos alimentos industrializados utilizam técnicas de conservação usadas na Antiguidade e que foram aperfeiçoadas. Este é o caso do processo de defumação. As carnes defumadas, por exemplo, passam por esse processo para garantir um bom tempo de conservação e realçar o sabor.@1 "+
                            "Esse processo consiste em ";
                    qA = "expor ao calor e à fumaça da queima de alguns tipos de madeira.  ";
                    qB = "desidratar ao sol para retirar a água por meio do calor e da salga.  ";
                    qC = "impedir o contato com o oxigênio do ar pela imersão em óleos e gorduras.  ";
                    qD = "diminuir a temperatura para tornar as reações de decomposição mais lentas. ";
                    break;

                case 16:
                    sourceString ="Em construções, é comum os operários lançarem as telhas uns para os outros, de forma a transferi-las do solo para o alto do telhado. A figura ilustra essa situação. A linha tracejada representa a trajetória da telha. Desconsidere qualquer tipo de força de resistência do ar.@1 "+
                            "@cimg cn580161 cimg@@2 "+
                            "Qual a direção e o sentido da força resultante sobre a telha a partir do momento em que é lançada? ";
                    qA = "@cimg cn58016a cimg@ ";
                    qB = "@cimg cn58016b cimg@ ";
                    qC = "@cimg cn58016c cimg@ ";
                    qD = "@cimg cn58016d cimg@ ";
                    break;

                case 17:
                    sourceString ="@cimg cn580171 cimg@@2 "+
                            "<small>Disponível em: www.cbpf.br. Acesso em: 14 set. 2014 (adaptado).</small>@2 "+
                            "O organismo em questão pode ser assim denominado porque: ";
                    qA = "recebeu genes de outra espécie.  ";
                    qB = "foi irradiado com raios ultravioletas.  ";
                    qC = "sofreu mutação por perda de genes.  ";
                    qD = "passou a ser cópia genética de outro organismo. ";
                    break;

                case 18:
                    sourceString ="Em um laboratório, o professor pede a seu aluno que retire da estante um frasco contendo ácido pentanodioico poli-insaturado para seguir com o procedimento do experimento. Na estante encontram-se os seguintes ácidos, com suas respectivas fórmulas:@2 "+
                            "@cimg cn580181 cimg@@2 "+
                            "O frasco que corresponde à solicitação é o ";
                    qA = "A. ";
                    qB = "B. ";
                    qC = "C. ";
                    qD = "D. ";
                    break;

                case 19:
                    sourceString ="Durante a ditadura argentina, na década de 1970, várias crianças foram arrancadas de suas famílias e entregues a lares adotivos. Após 36 anos de busca, uma senhora conseguiu reencontrar seu neto que havia sido roubado logo após o nascimento.@1 "+
                            "<small>CRAVEIRO, R. Após 36 anos, ativista conhece neto roubado. <b>Correio Braziliense</b>, 6 ago. 2014 (adaptado).</small>@2 "+
                            "A comprovação do parentesco, após tanto tempo, foi possível graças à análise do(a) ";
                    qA = "impressão digital.  ";
                    qB = "arcada dentária.  ";
                    qC = "tipo sanguíneo.  ";
                    qD = "DNA. ";
                    break;

                case 20:
                    sourceString ="Para explicar o movimento dos astros, desde a Antiguidade foram propostos modelos planetários. Ptolomeu propôs o modelo geocêntrico. De acordo com esse modelo, a Terra ocupava o centro do universo e em torno dela moviam-se a Lua, os planetas e o Sol. O modelo de Ptolomeu contemplava os movimentos que observamos das estrelas à noite e do Sol durante o dia. No século XVI, Copérnico propôs outro modelo planetário, no qual a Terra e os outros planetas giram em torno do Sol (modelo heliocêntrico).@1 "+
                            "A explicação dada por esses modelos no movimento que observamos do Sol no céu durante o dia é a ";
                    qA = "translação da Terra, para Copérnico, e a translação do Sol, para Ptolomeu.  ";
                    qB = "rotação da Terra, para Copérnico, e a translação do Sol, para Ptolomeu.  ";
                    qC = "translação da Terra, para Copérnico, e a rotação do Sol, para Ptolomeu.  ";
                    qD = "rotação da Terra, para Copérnico, e a rotação do Sol, para Ptolomeu. ";
                    break;

                case 21:
                    sourceString ="Quando, em 1928, Alexander Fleming observava o crescimento de uma colônia de bactérias causadoras de graves infecções no organismo humano, constatou que um fungo havia contaminado a placa de vidro em que as bactérias se desenvolviam, e começava a crescer. Ele percebeu que o fungo produzia uma substância que destruía as bactérias à sua volta. Essa substância deu origem a medicamentos que, até hoje, ajudam no combate às infecções bacterianas.@2 "+
                            "<small>Disponível em: www.dec.ufcg.edu.br. Acesso em: 8 set. 2014 (adaptado).</small>@2 "+
                            "O acaso e a capacidade de observação do cientista levaram.no à descoberta de ";
                    qA = "antibióticos.  ";
                    qB = "antitérmicos.  ";
                    qC = "analgésicos.  ";
                    qD = "anti.inflamatórios. ";
                    break;

                case 22:
                    sourceString ="A figura mostra uma etiqueta de eficiência energética emitida pelo Inmetro para um veículo leve, com tanque de 40 litros, e que pode utilizar tanto gasolina quanto álcool como fonte de combustível.@2 "+
                            "@cimg cn580221 cimg@@2 "+
                            "<small>Disponível em: www.inmetro.gov.br. Acesso em: 6 set. 2014.</small>@2 "+
                            "A diferença de autonomia do veículo, em km, entre a situação de maior e a de menor consumo é de ";
                    qA = "56 km.  ";
                    qB = "60 km.  ";
                    qC = "104 km.  ";
                    qD = "116 km. ";
                    break;

                case 23:
                    sourceString ="O petróleo é um importante recurso natural para a produção de combustíveis. Seu transporte é realizado por navios-tanque até os terminais marítimos. Embora essa operação seja vantajosa economicamente, pode provocar acidentes levando ao derramamento de grandes quantidades desse material no mar. Nessa situação, a mancha é cercada e o óleo é recolhido.@1 "+
                            "Em escala laboratorial, o método empregado na separação desse material da água do mar é a ";
                    qA = "filtração.  ";
                    qB = "evaporação.  ";
                    qC = "decantação.  ";
                    qD = "destilação simples. ";
                    break;

                case 24:
                    sourceString ="Famosos de todo o mundo participaram do \"desafio do balde de gelo\", uma campanha que pretende chamar a atenção para um mal degenerativo que, em 2013, acometia cerca de 15 mil pessoas no Brasil: a esclerose lateral amiotrófica (ELA). Essa doença provoca a morte gradativa de células que controlam os movimentos voluntários, provocando diversas limitações nos doentes.@2 "+
                            "<small>Disponível em: http://g1.globo.com. Acesso em: 27 ago. 2014 (adaptado).</small>@2 "+
                            "Essa doença provoca a morte das células que compõem o tecido ";
                    qA = "ósseo.  ";
                    qB = "nervoso.  ";
                    qC = "muscular.  ";
                    qD = "cartilaginoso. ";
                    break;

                case 25:
                    sourceString ="As embalagens cartonadas ou caixinhas Longa Vida foram criadas em 1950. Essas embalagens, constituídas de papel, alumínio e plástico, aumentam a durabilidade dos alimentos, protegendo.os para que não estraguem, mesmo sem refrigeração.@1 "+
                            "Qual fator biótico é minimizado com a utilização desse tipo de embalagem? ";
                    qA = "Proliferação de microrganismos.  ";
                    qB = "Variação térmica no seu interior.  ";
                    qC = "Mudança de coloração.  ";
                    qD = "Alteração do pH. ";
                    break;

                case 26:
                    sourceString ="Os planetas percorrem órbitas ao redor do Sol que podemos considerar aproximadamente circulares. O período de revolução de um planeta é o tempo que ele demora para completar uma volta em torno do Sol.@1 "+
                            "A característica que determina que um planeta tenha o maior período é o fato de ter maior ";
                    qA = "massa.  ";
                    qB = "tamanho.  ";
                    qC = "gravidade.  ";
                    qD = "distância do Sol. ";
                    break;

                case 27:
                    sourceString ="Um experimento realizado em laboratórios didáticos é a reação de sódio metálico com água para explicar as características do produto formado. Um professor executou esse experimento para os alunos colocando algumas gotas de fenolftaleína na água e observou que nada aconteceu. Em seguida, colocou um minúsculo pedaço de sódio na mesma mistura, e uma reação violenta aconteceu com a alteração de cor da mistura para a cor violeta.@1 "+
                            "A mudança de cor aconteceu devido à formação de ";
                    qA = "NaH.  ";
                    qB = "Na@_2_@O. ";
                    qC = "Na@_2_@O@_2_@. ";
                    qD = "NaOH ";
                    break;

                case 28:
                    sourceString ="Um removedor de maquiagem bifásico é composto de duas substâncias diferentes no mesmo frasco. Quando agitado, os líquidos se misturam temporariamente, mas instantes depois já começam a se separar em duas fases distintas.@1 "+
                            "Qual propriedade desses líquidos é responsável pela ordem de separação observada? ";
                    qA = "Massa.  ";
                    qB = "Volume.  ";
                    qC = "Densidade.  ";
                    qD = "Viscosidade. ";
                    break;

                case 29:
                    sourceString ="O motor de partida, ou motor de arranque, tem o objetivo de colocar em funcionamento o motor de combustão de um veículo, que não possui força própria para começar a girar. Para dar a partida em um desses motores de combustão, é necessário que sua bateria estabeleça uma certa corrente elétrica durante 5,0 segundos. Sabe-se que a potência útil da bateria é igual a 1,2 kW.@2 "+
                            "<small>Disponível em: www.omecanico.com.br. Acesso em: 20 ago. 2014 (adaptado).</small>@2 "+
                            "A energia, em joule, fornecida pela bateria ao motor de partida, durante esse intervalo de tempo, corresponde a ";
                    qA = "@cimg cn58029a cimg@ ";
                    qB = "@cimg cn58029b cimg@ ";
                    qC = "@cimg cn58029c cimg@ ";
                    qD = "@cimg cn58029d cimg@ ";
                    break;

                case 30:
                    sourceString ="O caracol gigante africano foi introduzido no Brasil na década de 1980 e aparentava apresentar vantagens econômicas em relação à criação tradicional de escargot. Entretanto, o insucesso mercadológico tem gerado populações excedentes desses animais, que podem ser hospedeiros intermediários de vermes. Eles terminam fugindo ou sendo soltos em ecossistemas florestais, agrícolas e áreas urbanas, gerando problemas aos seres vivos.@2 "+
                            "<small>CARVALHO, R. A. Disponível em: www.mma.gov.br. Acesso em: 21 set. 2014 (adaptado).</small>@2 "+
                            "O problema gerado pela espécie citada é o aumento da ";
                    qA = "contaminação do solo.  ";
                    qB = "quantidade de toxinas.  ";
                    qC = "incidência de doenças.  ";
                    qD = "população de plantas daninhas. ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice+30) {

                case 31:
                    sourceString ="Nós temos que mudar. Um novo governador com os mesmos brasileiros não poderá fazer nada. Sim, creio que isso encaixa muito bem em tudo o que anda nos acontecendo: desculpamos a mediocridade mediante programas de televisão francamente tolerantes com o fracasso. É a indústria da desculpa e da estupidez. Decidi procurar o responsável, não para castigá.lo, senão para exigir.lhe que melhore seu comportamento e que não se faça de surdo, de desentendido. Sim, decidi procurar o responsável e estou seguro de que o encontrarei quando me olhar no espelho.@2 "+
                            "<small>RIBEIRO, J. U. Precisa.se de matéria.prima para construir um país. <b>Jornal do Meio Ambiente</b>, 14 nov. 2005 (adaptado).</small>@2 "+
                            "A reflexão do autor destaca que a modificação dos panoramas social e político brasileiro depende basicamente da ";
                    qA = "atuação da liderança nacional.  ";
                    qB = "pressão das entidades sindicais.  ";
                    qC = "organização de partidos políticos.  ";
                    qD = "ampliação da participação cidadã. ";
                    break;

                case 32:
                    sourceString ="A Lei n. 11.340/2006 (Lei Maria da Penha) transforma o ordenamento jurídico brasileiro, expressa o necessário respeito aos direitos humanos das mulheres e tipifica as condutas criminosas. Além disso, essa lei modifica, significativamente, a conduta civil e penal em termos de investigação, procedimentos, apuração e solução para os casos de violência doméstica contra a mulher.@2 "+
                            "<small>Disponível em: www.observe.ufba.br. Acesso em: 21 ago. 2013 (adaptado).</small>@2 "+
                            "A referida lei constitui um instrumento para ";
                    qA = "estabilizar as estatísticas de conflito familiar.  ";
                    qB = "implantar os núcleos de apoio psicossocial.  ";
                    qC = "reduzir os índices de agressão doméstica.  ";
                    qD = "ampliar as técnicas de investigação criminal. ";
                    break;

                case 33:
                    sourceString ="Nos principais centros urbanos do Brasil, os movimentos populares passaram a desenvolver ações contestatórias a partir da metade dos anos 1970, tendo por eixo a posse da terra e o acesso aos serviços urbanos.@1 "+
                            "<small>BAIERLE, S. A explosão da experiência de um novo princípio ético-político nos movimentos populares urbanos em Porto Alegre. In: ALVAREZ, S.; DAGNINO, E.; ESCOBAR, A. (Org.). <b>Cultura e política nos movimentos sociais latino-americanos</b>. Belo Horizonte: UFMG, 2000 (adaptado).</small>@2 "+
                            "Os objetivos da mobilização dos grupos citados estão associados à busca de ";
                    qA = "auxílio de obras de caridade.  ";
                    qB = "obtenção de favores do Estado.  ";
                    qC = "garantia de exercício da cidadania. ";
                    qD = "reconhecimento de privilégio de classe. ";
                    break;

                case 34:
                    sourceString ="@b  A festa é dos negrosb@ @2 "+
                            "Atualmente, muitas festas negras ganharam especial valorização, para além dos próprios grupos ou do interesse pontual de alguns folcloristas. Dentre elas, jongos, sambas de roda, tambores de crioula e festas do boi receberam o reconhecimento oficial do Instituto do Patrimônio Histórico e Artístico Nacional.@2 "+
                            "<small>ABREU, M. <b>Revista de História da Biblioteca Nacional</b>, n. 100, jan. 2014.</small>@2 "+
                            "Essas manifestações foram reconhecidas oficialmente como parte do patrimônio histórico e artístico brasileiro porque ";
                    qA = "integram a cultura imaterial.  ";
                    qB = "reforçam a tradição clássica.  ";
                    qC = "destacam a estética regional.  ";
                    qD = "preservam a herança europeia. ";
                    break;

                case 35:
                    sourceString ="A Zona Franca de Manaus foi inicialmente idealizada como Porto Livre, em 1957. Dez anos mais tarde, em 1967, o modelo foi reformulado e foram instituídos incentivos fiscais para implantação de um polo industrial, comercial e agropecuário. Há incentivos tributários, com redução ou isenção de tributos federais, estaduais e municipais, além da venda de terrenos a preços simbólicos no parque industrial de Manaus, com completa infraestrutura de serviços sanitários, energia e comunicações.@2 "+
                            "<small>MIRANDA, R. N. <b>Zona Franca de Manaus</b>: desafios e vulnerabilidades. Disponível em: www12.senado.gov.br. Acesso em: 3 ago. 2014 (adaptado).</small>@2 "+
                            "A ação estatal mencionada teve como objetivo o(a) ";
                    qA = "valorização da matéria-prima amazônica.  ";
                    qB = "estímulo do desenvolvimento regional.  ";
                    qC = "assimilação das populações indígenas.  ";
                    qD = "aproveitamento do conhecimento tradicional. ";
                    break;

                case 36:
                    sourceString ="A Organização da ONU para a Agricultura e a Alimentação (FAO) divulgou em 2013 um estudo no qual defende a importância dos insetos como fonte de proteínas para alimentação humana. Segundo a agência, existe um potencial inexplorado na criação de insetos, que é de baixo custo e ecológica. São necessários 2 quilos de ração para produzir 1 quilo de insetos, enquanto o gado requer 8 quilos de alimento para produzir 1 quilo de carne.@1 "+
                            "<small>Disponível em: www1.folha.uol.com.br. Acesso em: 2 ago. 2014 (adaptado).</small>@2 "+
                            "No Brasil, a proposta apresentada no texto tem como obstáculo a ";
                    qA = "limitada disponibilidade de tecnologias.  ";
                    qB = "expressiva atuação dos ambientalistas.  ";
                    qC = "difícil modificação dos hábitos.  ";
                    qD = "forte oposição de religiosos. ";
                    break;

                case 37:
                    sourceString ="@cimg ch580371 cimg@@2 "+
                            "Nenhuma região no mundo, hoje, encarna melhor do que o Oriente Médio o trabalho mal. acabado realizado ao final da Primeira Guerra Mundial. Depois da queda do Império Otomano, fronteiras arbitrárias foram traçadas por potências imperialistas, como Reino Unido e França, com base unicamente nos seus interesses.@2 "+
                            "<small>Disponível em: http://oglobo.globo.com. Acesso em: 8 ago. 2014. </small>@2 "+
                            "Dadas as informações, uma consequência da reconfiguração socioespacial dessa região é a ";
                    qA = "instabilidade política.  ";
                    qB = "desigualdade social.  ";
                    qC = "semelhança cultural.  ";
                    qD = "dependência energética. ";
                    break;

                case 38:
                    sourceString ="A imagem do rapaz de blusão de couro, topete e <i>jeans</i>, em motos ou lambretas, na década de 1960, mostrava uma rebeldia ingênua sintonizada com ídolos do cinema como James Dean e Marlon Brando. As moças bem comportadas já começavam a abandonar as saias rodadas e atacavam de calças cigarette, num prenúncio de liberdade.@2 "+
                            "<small>Disponível em: http://almanaque.folha.uol.com.br. Acesso em: 21 ago. 2014 (adaptado).</small>@2 "+
                            "A comercialização dos produtos descritos no texto favoreceu a ";
                    qA = "difusão da cultura norte-americana.  ";
                    qB = "oposição ao modelo consumista.  ";
                    qC = "adesão ao movimento feminista.  ";
                    qD = "contestação da ordem política. ";
                    break;

                case 39:
                    sourceString ="@b Distribuição dos brasileiros de 15 a 24 anos de idade que frequentavam escola, por cor ou raça, segundo o nível de ensino (em %)b@ @2 "+
                            "@cimg ch580391 cimg@@2 "+
                            "<small>IBGE. Disponível em: http://noticias.uol.com.br. Acesso em: 22 set. 2013 (adaptado).</small>@2 "+
                            "As diferenças quanto ao acesso ao ensino superior, para essa faixa da população brasileira, são resultados da ";
                    qA = "ausência de crédito para financiamento estudantil.  ";
                    qB = "redução do número de linhas de pesquisas acadêmicas.  ";
                    qC = "manutenção da qualidade das universidades do setor privado.  ";
                    qD = "reprodução das desigualdades de oportunidades educacionais. ";
                    break;

                case 40:
                    sourceString ="@b Aspectos da agricultura famillitar comparados a não familitarb@ @2 "+
                            "@cimg ch580401 cimg@@2 "+
                            "<small>IBGE. Censo agropecuário de 2006. Disponível em: www.mma.gov.br. Acesso em: 3 ago. 2014 (adaptado).</small>@2 "+
                            "A análise do gráfico demonstra que a agricultura familiar apresenta vantagem econômica com relação ao(à) ";
                    qA = "geração de lucro.  ";
                    qB = "volume da produção.  ";
                    qC = "utilização de maquinários.  ";
                    qD = "emprego de trabalhadores. ";
                    break;

                case 41:
                    sourceString ="A definição mais aceita para desenvolvimento sustentável é o desenvolvimento capaz de suprir as necessidades da geração atual, sem comprometer a capacidade de atender às necessidades das futuras gerações. É o desenvolvimento que não esgota os recursos para o futuro. Essa definição surgiu na Comissão Mundial sobre Meio Ambiente e Desenvolvimento, criada pelas Nações Unidas para discutir e propor meios de harmonizar dois objetivos: o desenvolvimento econômico e a conservação ambiental.@2 "+
                            "<small>Disponível em: www.wwf.org.br. Acesso em: 5 jun. 2014.</small>@2 "+
                            "A iniciativa que atende ao modelo de desenvolvimento citado no texto é o(a) ";
                    qA = "incentivo à pesca industrial.  ";
                    qB = "uso de combustíveis fósseis.  ";
                    qC = "promoção da agricultura orgânica.  ";
                    qD = "desativação de usinas hidrelétricas. ";
                    break;

                case 42:
                    sourceString ="@cimg ch580421 cimg@@2 "+
                            "<small>CARNEIRO, M. Disponível em: https://38.media.tumblr.com. Acesso em: 28 jul. 2014.</small>@2 "+
                            "O poema traz uma crítica a um momento histórico brasileiro indicando que o esporte era utilizado como ";
                    qA = "instrumento de dominação política.  ";
                    qB = "elemento de realização pessoal.  ";
                    qC = "promotor de vida saudável.  ";
                    qD = "fator de ascensão social. ";
                    break;

                case 43:
                    sourceString ="@b Todo dia é dia de índiob@ @2 "+
                            "Preconceitos em nossa sociedade nutrem estereótipos sobre as populações indígenas. O resultado é um jeito de enxergar os índios, condenando-os a serem \"primitivos\" ou considerando que o fato de os nossos contemporâneos usarem celulares, aparelhos de televisão ou computadores os torna \"menos índios\". Como se mais de 500 anos de contatos entre os índios e a sociedade não indígena não tivessem consequências e fosse possível esperar que os atikuns, terenas, xavantes, baniwas, kaingangs e tantos outros apresentem comportamentos e cultura material semelhantes aos de seus ancestrais.@2 "+
                            "<small>SILVA, G. J. Revista de História da Biblioteca Nacional, n. 82, jul. 2012 (adaptado).</small>@2 "+
                            "O preconceito descrito no texto reforça a ";
                    qA = "separação de tribos locais.  ";
                    qB = "exclusão de grupos minoritários.  ";
                    qC = "preservação das identidades regionais.  ";
                    qD = "valorização das inovações tecnológicas. ";
                    break;

                case 44:
                    sourceString ="No final do século XIX e nas duas primeiras décadas do século XX, o processo de conhecimento sobre futebol, tanto na Argentina quanto no Brasil, ocorreu de uma maneira múltipla e complementar. Ao mesmo tempo que as elites praticavam com a bola nos colégios, as camadas populares jogavam nos terrenos baldios, construindo seus laços com o esporte.@2 "+
                            "<small>SANTOS, R. P. <b>Entre rivais</b>: futebol, racismo e modernidade no Rio de Janeiro e em Buenos Aires (1897.1924). Rio de Janeiro: Mauad, 2012 (adaptado).</small>@2 "+
                            "Ao comentar o desenvolvimento do futebol em dois países, o texto chama a atenção para o aspecto do(a)  ";
                    qA = "falta de preparação física.  ";
                    qB = "atuação dos governos locais.  ";
                    qC = "distanciamento das classes sociais.  ";
                    qD = "importância da influência estrangeira. ";
                    break;

                case 45:
                    sourceString ="@cimg ch580451 cimg@@2 "+
                            "<small>BECK, A. Disponível em: www.livrosepessoas.com. Acesso em: 17 ago. 2014.</small>@2 "+
                            "A atitude discriminatória apresentada na tirinha é reflexo da  ";
                    qA = "homofobia institucional.  ";
                    qB = "intolerância religiosa.  ";
                    qC = "sociedade patriarcal.  ";
                    qD = "prática racista. ";
                    break;

                case 46:
                    sourceString ="Criado em 1961 para evitar que os moradores da Alemanha Oriental, comunista, se mudassem para a Alemanha Ocidental, capitalista, o Muro de Berlim repartiu a cidade em duas durante a Guerra Fria. Até que, em 1989, o governo da Alemanha Oriental anunciou que seus cidadãos poderiam cruzar o muro para visitar a parte ocidental, o que era proibido antes. @2 "+
                            "<small>Disponível em: http://revistagalileu.globo.com. Acesso em: 11 ago. 2014.</small>@2 "+
                            "A permissão citada no texto simbolizou o fim de um período marcado pela  ";
                    qA = "divisão política mundial.  ";
                    qB = "fragilidade militar europeia.  ";
                    qC = "convivência étnica pacífica.  ";
                    qD = "integração econômica internacional. ";
                    break;

                case 47:
                    sourceString ="Os países reconquistados, ou que voltavam a ser católicos, tinham que seguir o programa traçado em 1554 por Inácio de Loyola, o qual determinava que os reis não poderiam permitir em sua administração a presença de heréticos. Essa determinação era fruto da criação, em 1542, pelo papa, da congregação da Inquisição. @2 "+
                            "<small>DELUMEAU, J. <b>Nascimento e afirmação da Reforma</b>. São Paulo: Pioneira,1989 (adaptado).</small> @2 "+
                            "A criação da instituição mencionada no texto teve como objetivo combater, no continente europeu, aqueles que ";
                    qA = "viviam do lucro comercial.  ";
                    qB = "recusavam a língua latina.  ";
                    qC = "apoiavam a arte renascentista.  ";
                    qD = "divergiam da religião predominante. ";
                    break;

                case 48:
                    sourceString ="@b TEXTO 1b@ @2 "+
                            "@cimg ch580481 cimg@@2 "+
                            "@b TEXTO 2b@ @2 "+
                            "Durante a chamada República Velha (1889 a 1930), as eleições, apesar de diretas e periódicas, serviam tão só para legitimar o controle do governo pelas elites políticas estaduais através do poder dos coronéis. As fraudes ocorriam em todas as fases do processo eleitoral (alistamento, voto, apuração, reconhecimento dos eleitos), de forma institucionalizada e estatizada. @2 "+
                            "<small>MACIEL, A. R. R. Disponível em: www.boletimjuridico.com.br. Acesso em: 21 jul. 2017.</small> @2 "+
                            "No período a que a imagem e o texto se referem, o processo eleitoral limitava a ";
                    qA = "força da elite.  ";
                    qB = "renda do eleitor.  ";
                    qC = "liberdade de escolha.  ";
                    qD = "jurisdição do governo ";
                    break;

                case 49:
                    sourceString ="Em 1897, ocorreu um conflito armado que opôs a população de Canudos, no interior da Bahia, e o recém.criado governo da República. Enviado como repórter à região conflagrada, o engenheiro Euclides da Cunha lá permaneceu durante as três semanas finais do conflito, tendo presenciado o dramático desfecho da guerra, com o massacre dos sertanejos. Cinco anos mais tarde, publicou o livro <i>Os sertões</i>, que se tornou um clássico, com implicações ainda mais amplas do que o evento histórico narrado.@2 "+
                            "<small>LIMA, N. T. Campo e cidade: veredas do Brasil moderno. In: BOTELHO, A.; SCHWARCZ, L. M. (Org.). <b>Agenda brasileira</b>: temas de uma sociedade em mudança. São Paulo: Cia. das Letras, 2011 (adaptado).</small> @2 "+
                            "O impacto da obra literária mencionada está relacionado ao fato de ter chamado a atenção para a ";
                    qA = "divisão partidária da sociedade brasileira.  ";
                    qB = "formação política do exército nacional.  ";
                    qC = "migração forçada dos camponeses nordestinos.  ";
                    qD = "situação sociocultural do interior do país. ";
                    break;

                case 50:
                    sourceString ="@b O Brasil rural não é só agrícolab@ @2 "+
                            "Em 1950, 64% dos brasileiros viviam no campo, nas contas do Instituto Brasileiro de Geografia e Estatística (IBGE). Vinte anos depois, com a modernização da agricultura e a migração em direção aos centros urbanos, esse percentual caiu para 44%. Nos anos de 1980, no entanto, as estatísticas surpreenderam: apesar da queda no emprego agrícola, a população ocupada crescia, sinalizando que um profundo processo de mudanças estava em curso. Mais duas décadas, e o novo cenário se delineou: a agropecuária moderna e a agricultura de subsistência estavam dividindo espaço com atividades ligadas à prestação de serviços, à indústria, ao turismo e ao lazer.@2 "+
                            "<small>IZIQUE, C. <b>Revista Pesquisa Fapesp</b>, maio 2012 (adaptado).</small>@2 "+
                            "No campo, as mudanças descritas resultam na ";
                    qA = "ampliação das reservas ambientais.  ";
                    qB = "desvalorização do modo de vida urbano.  ";
                    qC = "diversificação das atividades econômicas.  ";
                    qD = "redução do fornecimento de créditos rurais. ";
                    break;

                case 51:
                    sourceString ="@cimg ch580511 cimg@@1 "+
                            "<título imagem><centro>Palafitas no bairro chamado Terra Firme, em Belém (PA).</título imagem></centro>@2 "+
                            "<small>ARAÚJO, T. Disponível em: www1.folha.uol.com.br. Acesso em: 26 ago. 2014.</small> @2 "+
                            "Os alicerces das casas são de madeira e foram erguidos sobre fétidos córregos que acumulam lixo e dejetos. Quando chove, a água suja invade as casas, que correm o risco de desabar. Nas chamadas palafitas, habitações da periferia de Belém (PA), o saneamento básico não chegou, e a energia elétrica, em alguns casos, é obtida clandestinamente.@2 "+
                            "</small>TALENTO, A. <b>Mais da metade da Grande Belém vive em casas precárias</b>. Disponível em: www1.folha.uol.com.br. Acesso em: 26 ago. 2014.</small> @2 "+
                            "Um fator que explica o problema socioambiental apresentado é a ";
                    qA = "facilidade de transporte viário.  ";
                    qB = "falta de planejamento público.  ";
                    qC = "ausência de recursos naturais.  ";
                    qD = "proximidade do comércio local. ";
                    break;

                case 52:
                    sourceString ="A invenção do avião tornou os transportes mais rápidos e facilitou a vida do homem, principalmente no caso de longas distâncias. Quando a aviação começou a crescer significativamente, em meados do século XX, chegou.se até a pensar que o transporte de um continente para outro por meio de navios perderia espaço, o que não aconteceu.@2 "+
                            "<small>GIMENEZ, K. <b>Os oceanos</b>: o movimento da vida em um universo pouco conhecido. São Paulo: Atual, 2008.</small> @2 "+
                            "Qual o fator determinante para que a previsão citada no texto não se concretizasse? ";
                    qA = "Infraestrutura simplificada dos portos.  ";
                    qB = "Segurança no deslocamento marítimo.  ";
                    qC = "Rapidez para a circulação de pessoas.  ";
                    qD = "Capacidade de carga das embarcações. ";
                    break;

                case 53:
                    sourceString ="Em 1913, Henry Ford lançou a moderna linha de montagem em sua fábrica, nas proximidades de Detroit, com a qual provocou uma transformação radical da produção e da sociedade norte.americana. Reduziu o tempo necessário para montar um Ford Modelo T, de 12,5 horas para apenas 93 minutos. Henry Ford dizia que se pudesse economizar a cada um de seus trabalhadores 50 passos diários, poderia economizar milhares no final do ano.@2 "+
                            "<small><b>Há um século, a linha de montagem da Ford mudava a sociedade</b>. Disponível em: http://exame.abril.com.br. Acesso em: 25 jul. 2014 (adaptado).</small>@2 "+
                            "Um impacto do modelo produtivo descrito para o setor industrial foi a ";
                    qA = "redução dos estoques.  ";
                    qB = "diversificação de bens.  ";
                    qC = "especialização de tarefas.  ";
                    qD = "desorganização dos sindicatos. ";
                    break;

                case 54:
                    sourceString ="A primeira colheita mecanizada de arroz no Brasil começou nos anos 1930, no Rio Grande do Sul. Era o início de um processo que teria consequências não apenas na economia, mas em toda a sociedade. Em algumas décadas, o país passou da tração animal para a máquina, da subsistência para a economia de escala no campo, da agricultura tradicional para a agroindústria.@2 "+
                            "<small>MONTEIRO, A. <b>Décadas de mudanças</b>. Disponível em: http://revistagloborural.globo.com. Acesso em: 30 jul. 2014 (adaptado).</small>@2 "+
                            "O processo de transformação descrito no texto contribuiu para qual mudança na estrutura agrária brasileira? ";
                    qA = "Crescimento de áreas desapropriadas.  ";
                    qB = "Estímulo do consumo regional.  ";
                    qC = "Aumento da produção rural.  ";
                    qD = "Impulso do cultivo familiar. ";
                    break;

                case 55:
                    sourceString ="O período que se estende de 1850 a 1920 constitui.se no período em que a rede urbana amazônica ganha nova dimensão, quer em termos econômicos, quer em termos espaciais. Esse período tem como pano de fundo o auge do extrativismo da borracha, que revigorou tanto a economia como a rede urbana. @2 "+
                            "<small>CORRÉA, R. L. <b>Estudos sobre a rede urbana</b>. Rio de Janeiro: Bertrand Brasil, 2006. @2 "+
                            "Um fator socioeconômico que estimulou o surgimento da atividade citada foi o: ";
                    qA = "abastecimento do mercado externo.  ";
                    qB = "esvaziamento das aldeias indígenas.  ";
                    qC = "desenvolvimento do transporte regional.  ";
                    qD = "crescimento das atividades ecoturísticas. ";
                    break;

                case 56:
                    sourceString ="Era essencial para o projeto político de Getúlio Vargas que não apenas os discursos, mas canções, e até mesmo os jogos de futebol transmitidos pela Rádio Nacional, ensinassem às massas o modo \"correto\" de perceber as coisas, que deveria funcionar também como uma espécie de filtro através do qual a realidade deveria ser vista. Considerando o caráter do Estado Novo, o método correto de perceber a realidade estaria intimamente ligado ao privilégio de ser brasileiro: as pessoas comuns poderiam ser pobres, subnutridas e ignorantes, mas eram, por outro lado, abençoadas por Deus por terem nascido e crescido neste país. @2 "+
                            "<small>DUARTE, R. Indústria cultural: uma introdução. Rio de Janeiro: Editora FGV, 2010 (adaptado).</small>@2 "+
                            "O texto analisa a forma como Getúlio Vargas utilizava os meios de comunicação visando reforçar uma característica do Estado Novo, que foi o: ";
                    qA = "Industrialismo.  ";
                    qB = "Trabalhismo.  ";
                    qC = "Reformismo.  ";
                    qD = "Nacionalismo. ";
                    break;

                case 57:
                    sourceString ="No ano de 1269, um bispo da cidade portuguesa do Porto deixou em testamento ao tesoureiro do cabido 50 <i>maravedis</i>, em moedas, para comprar um <i>Código legal</i>, e outros 50 <i>maravedis</i> a um sobrinho para comprar umas <i>Decretais</i>. Para dar uma ideia desses preços: 1 <i>maravedi</i> era o preço de quatro carneiros vivos, ou um porco grande; 3 <i>maravedis</i> era o preço de um boi dos melhores. Assim, cada um dos livros a que se refere o testamento do citado bispo valia aproximadamente 17 bois; ou 50 porcos; ou 200 carneiros.@2 "+
                            "<small>SARAIVA, A. J. J. <b>História da cultura em Portugal</b>. Lisboa: Jornal do Foro, 1950 (adaptado).</small>@2 "+
                            "Um fator que limitava a leitura, no contexto citado, era a ";
                    qA = "carência crônica de tempo de lazer.  ";
                    qB = "circulação restrita de obras escritas.  ";
                    qC = "produção voltada à atividade científica.  ";
                    qD = "preferência popular pelas artes teatrais. ";
                    break;

                case 58:
                    sourceString ="Está reestabelecido no país o princípio da eleição direta para presidente da República em dois turnos, com data a ser fixada pela Constituinte. As capitais dos estados também poderão escolher seus prefeitos municipais. Por 458 votos a favor na Câmara, 62 no Senado e nenhum contra, essas mudanças constitucionais foram aprovadas pelo Congresso no dia 8 de maio de 1985.@2 "+
                            "<small><b>Folha de São Paulo</b>, 9 maio 1985 (adaptado).</small>@2 "+
                            "O fato político institucional, mencionado no texto, está associado à ";
                    qA = "promulgação da Lei da Anistia política.  ";
                    qB = "instalação do sistema multipartidário no Brasil.  ";
                    qC = "definição do plebiscito sobre o regime de governo.  ";
                    qD = "contribuição do movimento pela redemocratização do país. ";
                    break;

                case 59:
                    sourceString ="A queima da cana-de-açúcar para colheita traz sérias consequências, tais como: desequilíbrios na flora e fauna; diminuição da qualidade do ar nas cidades e o aumento do efeito estufa, bem como a destruição da camada de ozônio. No entanto, a mecanização da colheita pode gerar desastrosos impactos sociais. Uma máquina colhedora substitui cerca de 100 trabalhadores, e como consequência, decerto ocorrerá um aumento significativo do número de pessoas desempregadas no país, além de contribuir para a diminuição da qualidade social dessa mão de obra carente de postos de trabalhos na sociedade. @2 "+
                            "<small>MARTINS, M. S. R. <b>Os impactos sociais e econômicos da mecanização da colheita da cana-de-açúcar</b>. Disponível em: www.portaldoagronegocio.com.br. Acesso em: 5 dez. 2012.</small> @2 "+
                            "No texto, são analisados dois efeitos possíveis da mecanização na agricultura, um positivo e outro negativo, os quais estão relacionados, respectivamente, ao(à) ";
                    qA = "natureza e ao consumo.  ";
                    qB = "clima e à produção.  ";
                    qC = "ambiente e ao emprego.  ";
                    qD = "poluição e à tecnologia. ";
                    break;

                case 60:
                    sourceString ="A ocupação da costa brasileira foi marcada pela condição de área de defesa, com o estabelecimento de fortes marcando as primeiras instalações, seguida das atividades de extração do pau-brasil e da cultura de cana-de-açúcar. @2 "+
                            "<small>IBGE. <b>Atlas das representações literárias de regiões brasileiras</b>. Rio de Janeiro: IBGE, 2009.</small> @2 "+
                            "Essas atividades contribuíram para qual aspecto do povoamento do território brasileiro? ";
                    qA = "Proteção da diversidade natural.  ";
                    qB = "Fixação dos colonizadores europeus.  ";
                    qC = "Valorização das populações nativas.  ";
                    qD = "Consolidação da soberania nacional. ";
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