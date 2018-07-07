package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2017 {





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
            B,D,C,B,A,C,D,A,A,A,
            D,B,B,D,D,A,A,D,B,B,
            D,C,C,D,B,C,C,B,D,C,
    };

    String[] gabch = {
            A,B,C,D,D,A,A,B,C,D,
            B,C,C,D,B,A,C,A,D,C,
            A,D,D,C,C,B,D,A,D,A,
    };

    String[] gablc = {
            B,B,B,C,A,B,C,B,B,B,
            B,C,A,B,D,A,D,B,C,B,
            B,B,C,C,D,A,D,C,A,A,
    };

    String[] gabmt = {
            C,C,C,D,D,B,B,B,C,D,
            A,B,C,C,C,A,D,D,A,C,
            D,D,C,B,A,D,D,C,D,A,
    };


    public Prova2017(Context contexto, Simulado simulado) {
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
                    sourceString = "@cimg lc570011 cimg@ @1 " +
                            "<small>BECK, A. Tirinhas do Armandinho. Disponível em: tirasbeck.blogspot.com.br. Acesso em: 5 ago. 2014.</small>@2 " +
                            "A tirinha une a linguagem visual ao texto verbal para construir uma mensagem cujo sentido é de  ";
                    qA = "estímulo à esperteza.  ";
                    qB = "crítica econômico.social.  ";
                    qC = "discriminação de raça/cor.  ";
                    qD = "combate à distribuição de renda. ";
                    break;

                case 2:
                    sourceString = "@b Resenha: Cine <i>Holliúdy</i> b@ @2 " +
                            "Começou o filme e descubro que a \"brincadeira\" do <i>trailer</i>, de ter legendas pra entender o cearensês, se estendeu ao longa. Somos apresentados aos personagens, como o Francisgleydisson, sua esposa Maria das Graças (Miriam Freeland) e Francisgleydisson Filho, cria do casal. A história se passa no interior cearense, nos anos 1970, onde Francisgleydisson é um pequeno exibidor que luta para manter seu negócio de pé, que é exibir filmes no cinema, a despeito da iminente chegada das TVs ao interior. Após fracassar em uma cidade, ele e sua família se mudam para o município de Pacatuba, onde conhecem os tipos da cidade. Em Pacatuba, eles vão tentar, pela última vez, ter sucesso no seu empreendimento. Fui - fomos - presenteado com um filme muito engraçado, mas também muito emocionante. Percebe-se a delicadeza do Halder Gomes em contar uma história ingênua e bela dando destaque a toda uma cultura cearense. Delicado e apaixonado, impossível não rir e se identificar com essa homenagem engraçadíssima ao Ceará, e ao cinema em geral. O ator Edmilson Filho, que também é mestre em artes marciais, dá <i>show</i> do início ao fim. Enquanto houver vida haverá cinema. Pois enquanto houver histórias pra contar haverá vida.@1 " +
                            "<small>Disponível em: http://pautalivrenews.com. Acesso em: 29 set. 2013 (adaptado).</small>@2 " +
                            "Muitas pessoas, antes de irem ao cinema, procuram informações sobre o filme a que irão assistir. Os jornais e revistas, por sua vez, publicam resenhas, como é o caso desse texto, cuja função social é ";
                    qA = "resumir a história narrada no filme.  ";
                    qB = "avaliar a obra em exibição nos cinemas.  ";
                    qC = "descrever aspectos técnicos da produção.  ";
                    qD = "promover reflexões sobre o tema da película. ";
                    break;

                case 3:
                    sourceString = "@b Estatuto da Igualdade Racial b@ @2 " +
                            "Sancionado em 2010, esse estatuto destina-se a garantir à população negra do país saúde, moradia, acesso à terra, ao esporte e ao lazer; além de ser instrumento usado no combate à discriminação e às demais formas de intolerância étnica. " +
                            "O estatuto garante o financiamento de pesquisas nas áreas de educação, saúde e emprego, voltadas para a melhoria da qualidade de vida da população negra, e que podem subsidiar políticas públicas. @1 " +
                            "Outra estrutura instituída pelo estatuto é o Sistema Nacional de Promoção da Igualdade Racial (Sinapir), para organizar e colocar em prática a implementação do conjunto de políticas e serviços destinados a superar as desigualdades étnicas. @1 " +
                            "<small>Disponível em: www.brasil.gov.br. Acesso em: 22 jun. 2014 (adaptado).</small> @2 " +
                            "Um estatuto é um regulamento ou lei que rege um Estado, uma sociedade, um estabelecimento e outras entidades. O Estatuto da Igualdade Racial tem como função: ";
                    qA = "conceder privilégios a um grupo social.  ";
                    qB = "assegurar os direitos dos cidadãos.  ";
                    qC = "informar os deveres da população.  ";
                    qD = "criar obrigações para a sociedade. ";
                    break;

                case 4:
                    sourceString = "@b Sua excelência, o leitor b@ @2 " +
                            "Os livros vivem fechados, capa contra capa, esmagados na estante, às vezes durante décadas - é preciso arrancá-los de lá e abri-los para ver o que têm dentro. Já o jornal são folhas escancaradas ao mundo, que gritam para ser lidas desde a primeira página. As mãos do texto puxam o leitor pelo colarinho em cada linha, porque tudo é feito diretamente para ele. O jornal do dia sabe que tem vida curta e ofegante e dependente desse arisco, indócil, que segura as páginas amassando.as, dobrando.as, às vezes indiferente, passando adiante, largando no chão cadernos inteiros, às vezes recortando com a tesoura alguma coisa que o agrada ou o anúncio classificado. Súbito diz em voz alta, ao ler uma notícia grave, \"Que absurdo!\", como quem conversa. O jornal se retalha entre dois, três, quatro leitores, cada um com um caderno, já de olho no outro, enquanto bebem café. Nas salas de espera, o jornal é cruelmente dilacerado. Ao contrário do escritor, que se esconde, o cronista vive uma agitada reunião social entre textos - todos falam em voz alta ao mesmo tempo, disputam ávidos o olhar do leitor, que logo vira a página, e silenciamos no papel. Renascemos amanhã. @1 " +
                            "<small>TEZZA, C. <b>Revista Língua</b>, n. 98, dez. 2013 (adaptado). </small> @2 " +
                            "O autor evidencia seu posicionamento em favor dos textos publicados em jornais ao mesmo tempo em que afirma que os usos sociais das linguagens dependem dos ";
                    qA = "espaços para ler.  ";
                    qB = "autores dos livros.  ";
                    qC = "leitores dos textos.  ";
                    qD = "objetivos da leitura. ";
                    break;

                case 5:
                    sourceString = "Tomato purée is a thick, red paste or concentrate made from crushed tomato pulp that has been cooked and reduced. It is widely produced and used in Mediterranean countries, where it is added to dishes to give them a bright colour and a pronounced tomato flavour. @1 " +
                            "@cimg lc570051 cimg@ @1 " +
                            "<small>Disponível em: www.bbc.co.uk. Acesso em: 27 jul. 2014.</small> @2 " +
                            "O assunto abordado no texto passa pela definição de extrato de tomate para chegar na ";
                    qA = "utilidade do produto.  ";
                    qB = "popularidade da fruta.  ";
                    qC = "versatilidade de seu preparo.  ";
                    qD = "internacionalização de seu consumo. ";
                    break;

                case 6:
                    sourceString = "@b TEXTO 1 b@ @2 " +
                            "@cimg lc570061 cimg@ @1 " +
                            "<small>CRUZ, V. <b>Demini-teri</b>. Série Yanomami I. Plata sobre gelatina con pigmento de selenio. Brasil, 1995.</small> @2 " +
                            "@b TEXTO 2 b@ @2 " +
                            "Valdir Cruz se adentra en las profundidades de la selva de su país para retratar a los pueblos indígenas del Amazonas. Aunque sus modelos, casi del todo ajenos a la tecnología moderna, no suelen sentirse cómodos ante la cámara, Cruz logra captarlos en sus actitudes más relajadas y espontáneas. La irresistible mirada de este niño yanomami casi nos hace olvidar que su pueblo está enfrascado en una lucha por la supervivencia. @1 " +
                            "<small><b>Reader’s Digest Selecciones</b>, n. 719, out. 2000.</small> @2 " +
                            "O trabalho do fotógrafo Valdir Cruz, exemplificado na imagem, indica que ele ";
                    qA = "familiariza os índios à tecnologia.  ";
                    qB = "capta a espontaneidade dos índios.  ";
                    qC = "apoia a luta dos índios pela sobrevivência.  ";
                    qD = "registra temas relacionados à selva amazônica. ";
                    break;

                case 7:
                    sourceString = "@cimg lc570071 cimg@@1 " +
                            "<small>Disponível em: www.bbc.co.uk. Acesso em: 12 ago. 2014.</small> @2 " +
                            "Essa ferramenta de busca <i>on-line</i> auxilia pessoas interessadas em: ";
                    qA = "dados sobre programas de culinária de chefs associados ao site.  ";
                    qB = "informações sobre diversos tipos de ingredientes alimentícios. ";
                    qC = "receitas culinárias de acordo com suas necessidades.  ";
                    qD = "opções de restaurantes vegetarianos cadastrados. ";
                    break;

                case 8:
                    sourceString = "@b Parques b@ @2 " +
                            "En los parques, usted tendrá la oportunidad de vivir los hábitos consagrados por las personas de Porto Alegre, como la vida al aire libre, las charlas alegres y el inseparable mate. Cariñosamente llamado Redenção, las 40 hectáreas del Parque Farroupilha forman el más antiguo y popular punto de encuentro de la ciudad. Los sábados por la mañana, recibe la Feria Ecológica, y, los domingos, el Brique da Redenção, con artesanías, artes plásticas, antigüedades y manifestaciones culturales. Vale la pena ir también al Parque Moinhos de Vento (más conocido como Parcão), ubicado en una de las áreas más nobles de la Capital, que ofrece una excelente estructura para practicar deportes. @1 " +
                            "<small>PREFEITURA DE PORTO ALEGRE. <b>Sugerencias para disfrutar</b>. Porto Alegre: SMT, 2013.</small> @2 " +
                            "Ao publicar esse texto sobre seus parques, a Prefeitura de Porto Alegre objetiva ";
                    qA = "promover exposições artísticas.  ";
                    qB = "divulgar pontos turísticos da cidade.  ";
                    qC = "destacar os costumes dos cidadãos porto.alegrenses.  ";
                    qD = "ressaltar a importância da prática de esportes ao ar livre. ";
                    break;

                case 9:
                    sourceString = "@cimg lc570091 cimg@@1 " +
                            "<small>ROSSETTI, C. Disponível em: www.carolrossetti.com.br. Acesso em: 13 maio 2015 (adaptado).</small> @2 " +
                            "A padronização da beleza e sua divulgação na mídia levam as mulheres e garotas a recorrerem a extremos para alcançar esse padrão. De acordo com o texto, a busca de um padrão ideal leva ao(à) ";
                    qA = "satisfação pessoal.  ";
                    qB = "perda da identidade.  ";
                    qC = "adequação a um modelo.  ";
                    qD = "investimento na autoestima. ";
                    break;

                case 10:
                    sourceString = "A escolha de uma nação como sede de uma Copa do Mundo de Futebol ou uma edição dos Jogos Olímpicos, por exemplo, representa muito mais do que uma conquista esportiva, pode ser um meio de divulgação política, de retorno e investimento econômico e evocação de sentimentos identitários, emotivos e culturais... No caso específico do futebol, podemos observar o interesse de países que não possuem reconhecimento nesse esporte, buscando sediar o principal evento futebolístico, a Copa do Mundo. @1 " +
                            "<small>BOSCHILIA, B.; VLASTUIN, J.; MARCHI JR., W. Revista Brasileira de Ciências do Esporte, n. 1, set. 2008.</small> @2 " +
                            "Nesse texto, é possível perceber que as razões da escolha de sedes em países sem a vivência do futebol têm raízes na ";
                    qA = "modificação frequente das regras como mecanismo de socialização.  ";
                    qB = "criação de meios que atraiam potenciais consumidores desse esporte.  ";
                    qC = "intenção objetiva de absorver as mais variadas culturas esportivas mundiais.  ";
                    qD = "investida crescente de estudos sobre o treinamento desportivo e eventos competitivos. ";
                    break;

                case 11:
                    sourceString = "Nos anos 1970, Kenneth Cooper revolucionou o mundo esportivo dizendo que o meio. termo entre a caminhada e a corrida era o segredo da saúde. Na virada do século, todo mundo apertou o passo e passou a correr, literalmente, atrás de qualidade de vida. Agora, médicos pedem calma e indicam a caminhada como fonte da juventude. Mas, muita gente pensa que andar é exercício para velhos, convalescentes. Não é. Assim como a corrida não é para todos e está longe de ser \"democrática\", como entusiastas gostam de repetir. \"Há preconceito em relação aos caminhantes, porque vivemos em um mundo no qual o desempenho é colocado acima até da saúde. Quem vive em um ritmo alucinado de treinos, sem acompanhamento, está sujeito a lesões inerentes à corrida, além de ficar estressado por carregar o peso de sempre estar no pico de sua <i>performance</i>. É desgastante\", afirma José Rubens D,Elia, educador físico e fisiologista do exercício. @1 " +
                            "<small>Disponível em: www.educacaofisica.com.br. Acesso em: 13 jan. 2013.</small> @2 " +
                            "Ao buscarem melhor desempenho físico, muitos praticantes exageram e começam a praticar a corrida sem acompanhamento, colocando a saúde em risco. Nesse sentido, o texto é um alerta para compreender a importância de: ";
                    qA = "praticar exercícios intensos, uma vez que um bom desempenho físico deve estar acima da promoção da saúde.  ";
                    qB = "respeitar os limites físicos individuais na prática de exercícios, preocupando.se mais com a manutenção da saúde.  ";
                    qC = "acelerar o ritmo de treinamento, procurando atingir o máximo de sua performance na busca de uma vida mais saudável.  ";
                    qD = "considerar que todos podem seguir um ritmo intenso na prática de exercícios, a fim de conseguir um bom desempenho. ";
                    break;

                case 12:
                    sourceString = "@cimg lc570121 cimg@ @1 " +
                            "<small>ÓRION, A. Ossário. Grafite, 2006. Disponível em: http://revistacult.uol.com.br. Acesso em: 20 set. 2013.</small> @2 " +
                            "Em <i>Ossário</i>, Alexandre Órion explorou a poluição que tinge de preto os túneis das cidades e desenvolveu a \"arte menos poluição\", uma técnica de grafite reverso que consiste em limpar a parede, em vez de pintá.la. Com a aplicação dessa técnica, ele evitou ser autuado por vandalismo. Sua obra revela um(a) ";
                    qA = "análise sobre o alto índice de mortes no trânsito das grandes cidades.  ";
                    qB = "alerta ao poder público para a necessidade de limpar os túneis urbanos.  ";
                    qC = "crítica aos resíduos poluentes deixados nos túneis pelos automóveis que ali trafegam.  ";
                    qD = "solução definitiva de economia para a prática do grafite e contra a indústria de tintas. ";
                    break;

                case 13:
                    sourceString = "No caso da mulher burguesa, [...] seu foco corporal é indiscutivelmente a beleza. Utilizando.se de um arsenal sofisticado de técnicas, seu corpo se transforma num corpo voltado para o consumo e o prazer. Situação muito diferente é a das camponesas da Zona do Agreste pernambucano, entre as quais o foco corporal não é a beleza, mas sim a força. Sentem.se relativamente bem quando têm energia para suportar a pesada carga de trabalho a que estão expostas. Mas, alarmante é a situação das camponesas da Zona da Mata (também de Pernambuco), [...] exercem uma jornada tripla de trabalho, cortando cana, cuidando do roçado e da casa. São magérrimas, sofrem de velhice precoce, são desdentadas e muitas trabalham feridas. Mantêm uma relação frágil e alienada com o próprio corpo. @1 " +
                            "<small>MEDINA, J. P. S. O brasileiro e seu corpo. São Paulo: Papirus, 1987 (adaptado).</small> @2 " +
                            "O texto apresenta três percepções sobre o corpo das mulheres, considerando o(a) ";
                    qA = "segmento social a que pertencem.  ";
                    qB = "interação entre trabalho e beleza corporal.  ";
                    qC = "omissão a que seus corpos estão sujeitos na sociedade.  ";
                    qD = "necessidade de inserção no meio social em diferentes culturas. ";
                    break;

                case 14:
                    sourceString = "@b TEXTO 1 b@ @2 " +
                            "@cimg lc570141 cimg@@1 " +
                            "@b Bonecas da fertilidadeb@, etnia Ashanti, Gana. @1 " +
                            "<small>Visual encyclopedia of art: arte africana. Itália: Scala Group, 2010.</small> @2 " +
                            "@b TEXTO 2 b@ @2 " +
                            "O domínio técnico de alguns artistas tribais é surpreendente. Eles possuem mais do que um conhecimento primitivo de seu trabalho. Muitas tribos remotas desenvolvem uma arte realmente maravilhosa em obras de talha e cestaria, na preparação do couro ou mesmo nos trabalhos com metais. @1 " +
                            "<small>GOMBRICH, E. H. A história da arte. Rio de Janeiro: LTC,1999 (adaptado).</small> @2 " +
                            "As Bonecas da fertilidade, de Gana, e o texto expressam uma característica própria das artes, que é ";
                    qA = "comparar os modos de produção sem levar em conta o período em que as obras foram " +
                            "realizadas.  ";
                    qB = "dar a mesma importância cultural ao artista primitivo e àquele que atua em nossos dias.  ";
                    qC = "privilegiar a personalidade do artista, independentemente do valor de suas obras.  ";
                    qD = "revelar a proximidade intercultural que valida a importância de uma obra. ";
                    break;

                case 15:
                    sourceString = "@b Foi-se a Copa? b@ @2 " +
                            "Foi-se a Copa? Não faz mal. @1 " +
                            "Adeus chutes e sistemas. @1 " +
                            "A gente pode, afinal, @1 " +
                            "cuidar de nossos problemas. @1 " +
                            "Faltou inflação de pontos? @1 " +
                            "Perdura a inflação de fato. @1 " +
                            "Deixaremos de ser tontos @1 " +
                            "se chutarmos no alvo exato. @1 " +
                            "O povo, noutro torneio, @1 " +
                            "havendo tenacidade, @1 " +
                            "ganhará, rijo, e de cheio, @1 " +
                            "a Copa da Liberdade. @1 " +
                            "<small>ANDRADE, C. D. Disponível em: www.carlosdrummonddeandrade.com.br. Acesso em: 12 jul. 2014. </small> @2 " +
                            "O poema tematiza um acontecimento esportivo de grande repercussão nacional e se relaciona com seu momento histórico na medida em que o eu lírico  ";
                    qA = "consola o povo brasileiro.  ";
                    qB = "revela um espírito esportivo.  ";
                    qC = "exalta os aficionados pelo futebol.  ";
                    qD = "mostra uma visão crítica sobre o país. ";
                    break;

                case 16:
                    sourceString = "Pálida, à luz da lâmpada sombria, @1 " +
                            "Sobre o leito de flores reclinada, @1 " +
                            "Como a lua por noite embalsamada, @1 " +
                            "Entre as nuvens do amor ela dormia! @2 " +
                            "Era a virgem do mar, na escuma fria @1 " +
                            "Pela maré das águas embalada! @1 " +
                            "Era um anjo entre nuvens d,alvorada @1 " +
                            "Que em sonhos se banhava e se esquecia! @2 " +
                            "Era mais bela! o seio palpitando... @1 " +
                            "Negros olhos as pálpebras abrindo... @1 " +
                            "Formas nuas no leito resvalando... @1 " +
                            "Não te rias de mim, meu anjo lindo! @1 " +
                            "Por ti as noites eu velei chorando, @1 " +
                            "Por ti nos sonhos morrerei sorrindo! @1 " +
                            "<small>AZEVEDO, A. Disponível em: www.academia.org.br. Acesso em: 10 set. 2014.</small> @2 " +
                            "Na construção do soneto, a forma como o eu lírico percebe a mulher se expressa num conflito marcado pelas ideias de  ";
                    qA = "pureza e sensualidade.  ";
                    qB = "beleza e imperfeição.  ";
                    qC = "alegria e tristeza.  ";
                    qD = "vida e morte. ";
                    break;

                case 17:
                    sourceString = "\"Não troco meu oxente pelo OK de ninguém.\" (Ariano Suassuna) @1 " +
                            "<small>Disponível em: http://veja.abril.com.br. Acesso em: 13 set. 2013.</small> @2 " +
                            "A declaração do escritor Ariano Suassuna revela um posicionamento sobre a incorporação de estrangeirismos na língua portuguesa falada no Brasil, que é de ";
                    qA = "adesão.  ";
                    qB = "análise.  ";
                    qC = "comoção.  ";
                    qD = "resistência. ";
                    break;

                case 18:
                    sourceString = "As sacolas plásticas estão com seus dias contados nos mercados de São Paulo. Acordo entre o governo de São Paulo e supermercados paulistas prevê o fim de sacolas plásticas. A iniciativa, porém, é questionada pelo setor de plásticos, para quem não é a melhor solução para a preservação ambiental nem para o consumidor. @1 " +
                            "O objetivo da iniciativa é contribuir para a preservação ambiental, trocando os atuais sacos produzidos a partir do polietileno obtido do petróleo ou do etanol, cujo tempo de decomposição na natureza é de 100 anos, por uma \"sacolinha verde\", também fabricada com polietileno, mas com amido de milho e um elemento pró.degradante, capaz de se decompor depois de dois anos. @1 " +
                            "Em termos práticos e ambientais, isso significa a retirada de 2,4 milhões de sacolas por mês dos supermercados de São Paulo. @1 " +
                            "<small>MUSARRA, F. Revista Planeta, n. 465, jun. 2011 (adaptado).</small> @2 " +
                            "O texto sobre o uso das sacolas plásticas apresenta informações em determinada ordem para facilitar a compreensão do leitor. Na organização desse texto, depois de informar sobre o tempo de decomposição das sacolas, a autora esclarece que o(a) ";
                    qA = "sacola plástica é produzida com polietileno.  ";
                    qB = "decomposição da \"sacolinha verde\" leva dois anos.  ";
                    qC = "proibição do uso das sacolas é questionada pelo setor de plásticos.  ";
                    qD = "objetivo da proibição das sacolas plásticas é proteger o meio ambiente. ";
                    break;

                case 19:
                    sourceString = "@b Será que vai chover? b@ @1 " +
                            "<i>A mudança climática impacta o Brasil de norte a sul</i> @2 " +
                            "Os cientistas avaliaram a mudança climática em todo o mundo. No Brasil, o Painel Brasileiro de Mudanças Climáticas produziu o primeiro grande relatório dedicado exclusivamente à nossa realidade. Muitos impactos já são perceptíveis — e outros vão ficar mais intensos nos próximos 50 anos. @2 " +
                            "MUDANÇA DE CULTURA - As terras agricultáveis do Nordeste serão reduzidas: vai ficar mais seco. Teremos uma forte migração da população do campo para as cidades. @1 " +
                            "RISCO NA ENCOSTA - Enchentes e deslizamentos de terra em encostas habitadas têm se tornado frequentes no Sul e Sudeste nos últimos anos, principalmente no começo do ano. A tendência é que esse quadro se agrave. @1 " +
                            "BRASIL MAIS QUENTE - Em 50 anos, o aumento da temperatura no Brasil será da ordem de 2ºC a 3ºC. O pior cenário será na Amazônia, onde a temperatura pode aumentar 6ºC. @1 " +
                            "CAFÉ MIGRANTE - O plantio do café deixará de ser rentável na região Sudeste e deve migrar para o Sul do país. " +
                            "A AMAZÔNIA VAI SOFRER - Em alguns anos teremos grandes cheias, e, em outros, fortes secas. A capacidade hídrica da região pode se reduzir em 40%, influindo na vazão dos rios e na floresta, que ficará mais vulnerável a incêndios e à perda de sua biodiversidade. @1 " +
                            "A PREVISÃO - O país terá de enfrentar a mudança nos padrões de precipitação de chuvas. Momentos de seca e enchentes serão mais intensos e mais frequentes, exigindo esforços e investimentos na adaptação do campo e das cidades.@1 " +
                            "<small><b>Revista do Clima</b>. Disponível em: http://planetasustentavel.abril.com.br. Acesso em: 20 ago. 2014 (adaptado).</small> @2 " +
                            "O texto apresenta um conjunto de mudanças climáticas extraídas de um relatório. A função predominante da linguagem é a referencial, cujo objetivo principal é o de ";
                    qA = "emocionar o leitor.  ";
                    qB = "elaborar a mensagem.  ";
                    qC = "transmitir informações.  ";
                    qD = "influenciar o público-alvo. ";
                    break;

                case 20:
                    sourceString = "@b Balaio de ideias: poucas palavras, muita sabedoria b@ @1 " +
                            "<i>Mãe Stella destaca a sabedoria dos provérbios</i>  @2 " +
                            "A cultura africana sugere que o que existe em potencial no universo pode ser materializado pela palavra. Além da palavra, a memória também é reverenciada pela oralidade. Os fatos passados são reavivados pela memória e reatualizados pelos rituais. No Candomblé, a vivência mítica das divindades é cantada e contada através do que é chamado de Corpo das Tradições Orais, do qual os provérbios fazem parte. @1 " +
                            "Os provérbios fazem parte da oralidade africana, mas também de outros continentes. É universal a maneira de falar em frases curtas e expressivas. Aristóteles disse: \"relíquias que, em virtude de sua brevidade e exatidão, salvaram.se dos naufrágios e das ruínas das antigas filosofias\". Os provérbios podem ser conceituados como: enunciados breves, de origem desconhecida, que expressam uma sabedoria a ser utilizada em qualquer tempo e lugar; frases sintéticas, cujos conteúdos condensados expressam grande sabedoria; fontes de prazer que, pela sua estrutura, possibilitam ao cérebro fixar mensagens que colaboram para que o homem se harmonize consigo e com o outro. Diz.se que uma frase expressiva é um provérbio quando: sua origem é desconhecida porque seu autor se perdeu no tempo, uma vez que geralmente é pronunciada de maneira natural a partir de uma determinada situação; torna.se popular porque, sendo criada a partir de uma circunstância particular, passa a ser utilizada pela população em geral, sempre que circunstâncias semelhantes voltam a acontecer; é universal, de forma ampla ou restrita - uma comunidade, por exemplo. @1 " +
                            "<small>SANTOS, M. S. A. Disponível em: http://mundoafro.atarde.uol.com.br. Acesso em: 25 ago. 2014 (adaptado).</small> @2 " +
                            "Tomando como exemplo os provérbios, o texto sugere a importância do uso oral da língua como instrumento de ";
                    qA = "divulgação da cultura clássica.  ";
                    qB = "preservação da memória cultural.  ";
                    qC = "exaltação de personagens populares.  ";
                    qD = "desvendamento de mistérios religiosos. ";
                    break;

                case 21:
                    sourceString = "@cimg lc570211 cimg@ @1 " +
                            "<small>Disponível em: http://tinyurl.com. Acesso em: 16 set. 2013.</small> @2 " +
                            "A articulação entre os elementos verbais e não verbais utilizados na construção dessa charge tem a clara intenção de motivar os leitores a ";
                    qA = "diminuírem gastos com a conta de água.  ";
                    qB = "desenvolverem atitudes sustentáveis.  ";
                    qC = "modificarem momentos de diversão.  ";
                    qD = "adquirirem hábitos de higiene. ";
                    break;

                case 22:
                    sourceString = "@cimg lc570221 cimg@ @1 " +
                            "<small>Disponível em: www.segtransito.com.br. Acesso em: 12 ago. 2014 (adaptado).</small> @2 " +
                            "A propaganda, normalmente, busca vender um produto. Essa dirige.se ao leitor para ";
                    qA = "descrever os efeitos nocivos do álcool.  ";
                    qB = "alertar sobre o perigo de beber e dirigir.  ";
                    qC = "divulgar hábitos dos motoristas brasileiros.  ";
                    qD = "apresentar o pacto pela redução de acidentes. ";
                    break;

                case 23:
                    sourceString = "@b Alfredo e o copo b@ @1 " +
                            "Alfredo estava cabisbaixo num bar, sentado, olhando para seu copo. Quando, de repente, levantou um valentão, chutou a cadeira que estava na frente dele, pegou o copo e bebeu tudo numa só golada: @1 " +
                            "— E aí? Não vai reagir? — disse o valentão todo soberbo. @1 " +
                            "— Eu não! — disse Alfredo. Eu vou é embora! Imagine que hoje cedo briguei com minha mulher, saí atrasado para o trabalho, bati o carro num poste, fui demitido, cheguei em casa e peguei minha mulher com o vizinho... aí eu venho pra cá, chega você e toma meu veneno. @1 " +
                            "<small>Disponível em: www.piadasonline.com.br. Acesso em: 1 set. 2013.</small> @2 " +
                            "Nessa piada, o autor procura despertar o efeito de humor em seu público por meio da: ";
                    qA = "atitude hostil de uma personagem.  ";
                    qB = "descrição de ações em estilo original.  ";
                    qC = "resposta irônica a uma pergunta atrevida.  ";
                    qD = "ausência de reação diante de uma provocação. ";
                    break;

                case 24:
                    sourceString = "Aprendi o silêncio com os faladores, a tolerância com os intolerantes, a bondade com os maldosos; e, por estranho que pareça, sou grato a esses professores. @1 " +
                            "<small>GIBRAN, K. Nova Escola, n. 177, nov. 2004.</small> @2 " +
                            "No texto, o poeta libanês Kahlil Gibran utiliza estratégias argumentativas para atingir seu objetivo: chamar a atenção das pessoas para o que se aprende na relação com o outro. Pode-se perceber isso quando ele  ";
                    qA = "utiliza palavras antônimas.  ";
                    qB = "releva ações grosseiras das pessoas.  ";
                    qC = "relaciona atitudes de valores opostos.  ";
                    qD = "apresenta suas ideias na 1ª pessoa do singular. ";
                    break;

                case 25:
                    sourceString = "@cimg lc570251 cimg@@1 " +
                            "<small>Disponível em: www.lucaslima.com. Acesso em: 5 set. 2014.</small> @2 " +
                            "Na charge, o autor explora a relação entre a imagem de Marechal Deodoro da Fonseca e o uso de uma variedade linguística específica incompatível com a figura histórica. Essa incompatibilidade evidencia-se pela ";
                    qA = "incoerência da pergunta do computador ao Marechal.  ";
                    qB = "presença de estrangeirismos na fala do Marechal.  ";
                    qC = "ironia expressa na resposta.  ";
                    qD = "utilização de uma gíria. ";
                    break;

                case 26:
                    sourceString = "@cimg lc570261 cimg@@1 " +
                            "<small>QUINO. Toda Mafalda. São Paulo: Martins Fontes, 2000.</small> @2 " +
                            "Conhecido pela forte crítica social em suas tirinhas, nesse texto, Quino tem como objetivo ";
                    qA = "promover a reflexão sobre as prioridades das pessoas.  ";
                    qB = "demonstrar o estresse dos adultos com as notícias.  ";
                    qC = "discutir a importância de bons árbitros de futebol.  ";
                    qD = "denunciar a violência nos jogos de futebol. ";
                    break;

                case 27:
                    sourceString = "@b Aí, galera b@ @2 " +
                            "Jogadores de futebol podem ser vítimas de estereotipação. Por exemplo, você pode imaginar um joga dor de futebol dizendo \"estereotipação\"? E, no entanto, por que não? @1 " +
                            "— Aí, campeão. Uma palavrinha pra galera. @1 " +
                            "— Minha saudação aos aficionados do clube e aos demais esportistas, aqui presentes ou no recesso dos seus lares. @1 " +
                            "— Como é? @1 " +
                            "— Aí, galera. @1 " +
                            "— Quais são as instruções do técnico? @1 " +
                            "— Nosso treinador vaticinou que, com um trabalho de contenção coordenada, com energia otimizada, na zona de preparação, aumentam as probabilidades de, recuperado o esférico, concatenarmos um contragolpe agudo com parcimônia de meios e extrema objetividade, valendo.nos da desestruturação momentânea do sistema oposto, surpreendido pela reversão inesperada do fluxo da ação. @1 " +
                            "— Ahn? @1 " +
                            "— É pra dividir no meio e ir pra cima pra pegar eles sem calça. @1 " +
                            "— Certo. Você quer dizer mais alguma coisa? @1 " +
                            "— Posso dirigir uma mensagem de caráter sentimental. Algo banal, talvez mesmo previsível e piegas, a uma pessoa à qual sou ligado por razões, inclusive, genéticas? @1 " +
                            "— Pode. @1 " +
                            "— Uma saudação para a minha progenitora. @1 " +
                            "— Como é? @1 " +
                            "— Alô, mamãe! @1 " +
                            "<small>VERÍSSIMO, L. F. Disponível em: www.releituras.com. Acesso em: 5 set. 2014.</small> @2 " +
                            "Nessa simulação de entrevista, o autor retrata um jogador de futebol que supera as expectativas do entrevistador por utilizar uma linguagem muito elaborada, o que mostra uma situação de: ";
                    qA = "confusão.  ";
                    qB = "afobação.  ";
                    qC = "preocupação.  ";
                    qD = "discriminação. ";
                    break;

                case 28:
                    sourceString = "@b Clássicos em game b@ @2 " +
                            "Uma fundação transformou algumas pérolas da literatura brasileira em videogames. Nas versões para jogo eletrônico de <i>Memórias de um Sargento de Milícias</i>, de Manuel Antônio de Almeida, <i>O Cortiço</i>, de Aluísio Azevedo, e <i>Dom Casmurro</i>, de Machado de Assis, o jogador controla um dos personagens das obras. João Romão, o proprietário do cortiço de <i>O Cortiço</i>, por exemplo, precisa aumentar seu patrimônio. O jogador toma decisões como se fosse o próprio Romão na construção de novos cômodos, na gestão dos custos de aluguel, salários e venda de produtos. Enquanto isso, aparecem, em cada fase, trechos do livro original, instigando o jogador a ler o texto na íntegra. Os videogames se inscrevem na lógica de que o leitor.jogador vai interagir e decidir o destino de personagens e da trama. Os jogos podem ser acessados pelo site www.livroegame.com.br ou por CD-ROMs distribuídos gratuitamente por 80 monitores de postos dos telecentros <i>Acessa São Paulo.</i> @1 " +
                            "<small><b>Revista Língua</b>, n. 84, 2012 (adaptado).</small> @2 " +
                            "O <i>videogame</i> foi desenvolvido para promover o entretenimento. Essa tecnologia, ao ser empregada para fins educativos, ";
                    qA = "impede o diálogo literário entre o jogador e as obras de literatura.  ";
                    qB = "desestimula os jogadores à leitura de outras obras clássicas.  ";
                    qC = "proporciona a formação de um novo conceito de leitor.  ";
                    qD = "substitui o livro de papel pelo livro eletrônico. ";
                    break;

                case 29:
                    sourceString = "É perceptível o fato de que as relações interpessoais e linguísticas entre os sujeitos estão se modificando à medida que interagem com o outro, mediados pelo computador conectado à internet. Tamanha é a inserção do computador nas práticas sociais que se torna possível afirmar que ele já é constitutivo da \"nova identidade humana\", se é que podemos denominar de \"novas\" as relações de mobilidade, troca, diálogo e escrita que se estabelecem entre os indivíduos interligados pelas tecnologias, em especial a telemática digital. @1 " +
                            "<small>RODRIGUES JUNIOR, A. S. et al. Internet & ensino: novos gêneros, outros desafios. Rio de Janeiro: Singular, 2009.</small> @2 " +
                            "Ao possibilitar a interação nos ambientes virtuais, o uso do computador tem ";
                    qA = "gerado alterações na dinâmica das relações sociais.  ";
                    qB = "levado as pessoas à ausência de identidade própria.  ";
                    qC = "diminuído as interações por meio da escrita.  ";
                    qD = "prejudicado o diálogo entre as pessoas. ";
                    break;

                case 30:
                    sourceString = "Aguarda votação na Câmara dos Deputados proposta que equipara, na legislação brasileira, livros eletrônicos a livros tradicionais, principalmente no que se refere à isenção de impostos. A proposta modifica a Lei n. 10 753/2003, que institui a Política Nacional do Livro. Na avaliação do autor do projeto, a definição de livro que consta na lei não acompanhou os avanços tecnológicos dos últimos anos, com o surgimento dos leitores eletrônicos e consequente crescimento do segmento dos chamados <i>e-books</i>. Daí a necessidade de incluir os livros eletrônicos no texto da lei, ao lado dos livros em papel ou em sistema Braile. Os livros eletrônicos podem ser lidos em <i>e-readers, tablets</i>, computadores ou até <i>smartphones</i>, por meio de aplicativos próprios. @1 " +
                            "<small>LIMA, P. Disponível em: www12.senado.gov.br. Acesso em: 11 set. 2013 (adaptado).</small> @2 " +
                            "Incentivar o uso das novas tecnologias tem sido uma preocupação encontrada em todos os setores da sociedade. Segundo o texto, a necessidade de modificação na Lei n. 10 753/2003 surge para: ";
                    qA = "atender aos leitores de publicações em formato digital.  ";
                    qB = "facilitar o acesso da população às inovações tecnológicas.  ";
                    qC = "possibilitar a aquisição de materiais eletrônicos pelo governo.  ";
                    qD = "estimular a leitura por meio de aparelhos conectados à internet. ";
                    break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice+30) {

                case 31:
                    sourceString = "No esboço de um projeto de construção, um viaduto passará sobre duas avenidas paralelas.@1 " +
                            "@cimg mt570311 cimg@@2 " +
                            "O menor ângulo formado pela avenida que segue pelo sentido 1 e o viaduto é de 30°.@1 " +
                            "Qual será o maior ângulo formado pela avenida que segue no sentido 2 e o viaduto? ";
                    qA = "60° ";
                    qB = "120° ";
                    qC = "150° ";
                    qD = "210° ";
                    break;

                case 32:
                    sourceString = "Um carpinteiro guarda, em quatro caixas opacas (não transparentes), dois tipos de parafusos que se diferenciam apenas por suas tonalidades (claros e escuros). Ele sabe exatamente quantos parafusos de cada tipo há em cada caixa. As quantidades estão apresentadas a seguir.@1 " +
                            "@cimg mt570321 cimg@@2 " +
                            "Considere que esse carpinteiro queira retirar, sem olhar, um parafuso de uma de suas caixas, esperando ter a maior probabilidade de obter um de cor clara. " +
                            "A retirada deve ser feita da caixa ";
                    qA = "I.  ";
                    qB = "II.  ";
                    qC = "III.  ";
                    qD = "IV. ";
                    break;

                case 33:
                    sourceString = "A Ponte Estaiada é um dos pontos turísticos de Teresina, capital do Piauí, principalmente pelo mirante que há na ponte. Nesse mirante, os turistas têm uma vista panorâmica de toda a cidade por meio de um corredor elíptico, conforme ilustra a figura.@1 " +
                            "@cimg mt570331 cimg@@2 " +
                            "Considere que um turista se deslocou em linha reta do ponto <i>P</i> ao ponto Q (centro do elevador) para entrar num elevador que sobe verticalmente até o centro do mirante. Quando chega ao mirante, esse turista sai do elevador em linha reta paralela ao trecho <i>PQ</i> até uma das extremidades do corredor elíptico. Em seguida, ele descreve uma trajetória elíptica no contorno do corredor para contemplar a vista da cidade.@1 " +
                            "<small>Disponível em: www.skyscrapercity.com. Acesso em: 7 ago. 2014 (adaptado).</small>@2 " +
                            "A vista superior da trajetória desse turista, desde o ponto <i>P</i> até o final da trajetória no mirante, é melhor representada pela figura: ";
                    qA = "<q33img2>@cimg mt57033a cimg@ ";
                    qB = "<q33img3>@cimg mt57033b cimg@ ";
                    qC = "<q33img4>@cimg mt57033c cimg@ ";
                    qD = "<q33img5>@cimg mt57033d cimg@ ";
                    
                    break;

                case 34:
                    sourceString = "O quadro exibe o gasto calórico aproximado de algumas atividades, tomando como referência uma pessoa de 60 kg que realiza atividades físicas cotidianas, durante um tempo de 30 minutos.@2 " +
                            "@cimg mt570341 cimg@@1 " +
                            "<small>Disponível em: http://maisequilibrio.com.br. Acesso em: 20 ago. 2014.</small>@2 " +
                            "Um preparador físico deseja escolher duas dessas atividades para que uma pessoa com o mesmo padrão da referência venha a praticá.las diariamente durante 30 minutos. Desejando equilibrar essas duas atividades, o preparador escolhe a que tem maior gasto calórico e a que tem menor gasto calórico.@1 " +
                            "Qual o gasto calórico total, em quilocaloria, dessas duas atividades escolhidas pelo preparador físico? ";
                    qA = "178 ";
                    qB = "220 ";
                    qC = "275 ";
                    qD = "356 ";
                    break;

                case 35:
                    sourceString = "Em uma corrida, a quatro voltas do final, registrou.se em um quadro as distâncias entre os dois primeiros competidores, nos instantes em que o primeiro deles completava cada volta.@2 " +
                            "@cimg mt570351 cimg@@1 " +
                            "A expressão algébrica que descreve a relação de interdependência entre a distância <i>D</i> e o número v de voltas restantes para o final da corrida é: ";
                    qA = "<i>D</i> = 150v  ";
                    qB = "<i>D</i> = 200v  ";
                    qC = "<i>D</i> 150(4 - v) - 800  ";
                    qD = "<i>D</i> = 800 - 150(4 - v) ";
                    break;

                case 36:
                    sourceString = "Um grupo de amigos tem um time de futebol e necessita comprar uniformes novos. Para tanto, um modelo de uniforme foi escolhido e orçamentos foram tomados em quatro lojas, conforme descrito na tabela.@1 " +
                            "@cimg mt570361 cimg@@1 " +
                            "As lojas só vendem uniformes completos: camisas, calções e pares de meiões. O grupo vai se reunir para escolher três das propostas mais adequadas para tentar uma segunda negociação de preços, eliminando a loja que apresentar o orçamento mais caro para a compra de um uniforme completo.@2 " +
                            "Qual dessas lojas terá seu orçamento eliminado? ";
                    qA = "1  ";
                    qB = "2  ";
                    qC = "3  ";
                    qD = "4 ";
                    break;

                case 37:
                    sourceString = "A obesidade é um dos maiores fatores de risco para doenças e, para evitá.la, é importante conhecer as categorias de peso, que podem ser identificadas através do Índice de Massa Corpórea (IMC). O IMC é a razão entre a massa de uma pessoa (em quilograma) e o quadrado " +
                            "de sua altura (em metro), ou seja,@img mt570371 img@. As categorias para os resultados " +
                            "do IMC são mostradas na tabela.@2 " +
                            "@cimg mt570372 cimg@@2 " +
                            "Considere uma pessoa com obesidade mórbida, com IMC igual a 42 e altura 1,50 m. Para evitar problemas de saúde, seu médico lhe recomendou que emagrecesse o suficiente para chegar na categoria de sobrepeso.@1 " +
                            "A quantidade mínima de massa, em quilograma, que essa pessoa deve perder para alcançar a meta proposta pelo médico é: ";
                    qA = "38,0.  ";
                    qB = "27,0.  ";
                    qC = "22,0.  ";
                    qD = "12,0. ";
                    break;

                case 38:
                    sourceString = "A safra de grãos no Brasil em 2013 atingiu 185,7 milhões de toneladas, resultado superior à safra de 2012, que foi de 161,9 milhões de toneladas, segundo o Levantamento Sistemático da Produção Agrícola (LSPA).@1 " +
                            "<small>Disponível em: www.ibge.gov.br. Acesso em: 18 ago. 2014.</small>@2 " +
                            "Em quantos milhões de toneladas a produção de grãos de 2013 superou a de 2012? ";
                    qA = "23,2  ";
                    qB = "23,8  ";
                    qC = "24,2  ";
                    qD = "24,8 ";
                    break;

                case 39:
                    sourceString = "Uma fábrica de parafusos tem uma preocupação especial com as arestas de seus produtos, pois podem causar acidentes quando não lixadas corretamente. Os funcionários precisam lixar manualmente todas as arestas dos parafusos produzidos. A figura representa um tipo desses parafusos produzidos, conhecido como sextavado, que possui a cabeça na forma de um prisma regular hexagonal.@1 " +
                            "@cimg mt570391 cimg@@2 " +
                            "O número de arestas na cabeça de um parafuso sextavado que devem ser lixadas é ";
                    qA = "6.  ";
                    qB = "12.  ";
                    qC = "18.  ";
                    qD = "24. ";
                    break;

                case 40:
                    sourceString = "De acordo com a Secretaria de Aviação Civil, entre 10 de junho de 2014 e 13 de julho de 2014, a movimentação nos 21 aeroportos brasileiros que atenderam às demandas provenientes da Copa do Mundo de Futebol de 2014 foi de 16,7 milhões de passageiros.@1 " +
                            "<small>Disponível em: www.istoe.com.br. Acesso em: 7 ago. 2014.</small>@2 " +
                            "Segundo essas informações, o número de passageiros mencionados equivale a ";
                    qA = "dezesseis milhões e sete.  ";
                    qB = "dezesseis milhões e sete mil.  ";
                    qC = "dezesseis milhões e setenta mil.  ";
                    qD = "dezesseis milhões e setecentos mil. ";
                    break;

                case 41:
                    sourceString = "Numa lanchonete, são vendidos diariamente 200 sanduíches de queijo com presunto. Na preparação de cada sanduíche, são utilizados 25 g de queijo e 30 g de presunto, e a compra desses produtos é feita em peças inteiras de 2 kg. Existem quatro estabelecimentos fornecedores (I, II, III e IV) cujos preços praticados são indicados a seguir.@2 " +
                            "I. 2 kg de queijo ± R$ 19,00; 2 kg de presunto ± R$ 15,00.@1 " +
                            "II. 2 kg de queijo ± R$ 15,00; 2 kg de presunto ± R$ 18,00. @1 " +
                            "III. 2 kg de queijo ± R$ 23,00; 2 kg de presunto ± R$ 13,00.@1  " +
                            "IV. 2 kg de queijo ± R$ 14,00; 2 kg de presunto ± R$ 21,00.@2 " +
                            "Por razões operacionais, o administrador da lanchonete opta por comprar os dois produtos em um só estabelecimento. Antes de realizar a compra, verifica que na lanchonte há 1,2 kg de queijo e 900 g de presunto a serem utilizados. Ele deseja comprar os dois produtos em quantidade suficiente para um dia de funcionamento da lanchonete, pagando o menor preço.@1 " +
                            "Nessas condições, em qual estabelecimento deverá ser realizada a compra do queijo e do presunto? ";
                    qA = "I  ";
                    qB = "II  ";
                    qC = "III  ";
                    qD = "IV ";
                    break;

                case 42:
                    sourceString = "A tabela apresenta a expectativa de vida, em ano, no Brasil e suas regiões, nos anos 1950 e 2000.@2 " +
                            "@cimg mt570421 cimg@@1 " +
                            "<small>Disponível em: www.epsjv.fiocruz.br. Acesso em: 7 set. 2014.</small>@2 " +
                            "De acordo com a tabela, no ano 2000, a região em que a expectativa de vida teve valor mais próximo da expectativa de vida do país foi a região ";
                    qA = "Sul.  ";
                    qB = "Norte.  ";
                    qC = "Nordeste.  ";
                    qD = "Centro-Oeste. ";
                    break;

                case 43:
                    sourceString = "Um reservatório com capacidade de 3.000 litros possui 240 litros de água em seu interior. Para encher esse reservatório, uma pessoa utiliza uma bomba com vazão (quantidade de litros que entram no reservatório em relação ao tempo transcorrido) de x litros por minuto. Logo após o início do enchimento do reservatório, a bomba foi desligada por 10 minutos. Ao ser religada, completou o enchimento do reservatório. Enquanto esteve funcionando, a bomba trabalhou sempre na mesma vazão e houve somente essa entrada de água no reservatório e não houve saída.@1 " +
                            "A expressão que representa o tempo de enchimento do reservatório, em minuto, em função da quantidade x de água, em litro, é igual a ";
                    qA = "@cimg mt57043a cimg@ ";
                    qB = "@cimg mt57043b cimg@ ";
                    qC = "@cimg mt57043c cimg@ ";
                    qD = "@cimg mt57043d cimg@ ";
                    break;

                case 44:
                    sourceString = "Com a finalidade de motivar seus funcionários, uma empresa premia o funcionário do mês organizando um sorteio de brindes. O sorteio é feito colocando-se em um globo não transparente: 3 bolas vermelhas, 5 bolas azuis, 8 bolas amarelas e 4 bolas brancas. O funcionário do mês deve retirar uma bola ao acaso e seu prêmio será determinado de acordo com a cor da bola: a bola vermelha corresponde a um televisor; a bola azul, a uma bicicleta; a bola amarela, a um ventilador; e a bola branca, a um micro-ondas. " +
                            "Qual é a probabilidade de o funcionário do mês ganhar um televisor? ";
                    qA = "@cimg mt57044a cimg@ ";
                    qB = "@cimg mt57044b cimg@ ";
                    qC = "@cimg mt57044c cimg@ ";
                    qD = "@cimg mt57044d cimg@ ";
                    break;

                case 45:
                    sourceString = "Para a produção de um produto de massa 1,5 kg, uma indústria utiliza 0,5 kg da matéria-prima A e 1,0 kg da matéria-prima B. O preço de custo, por quilo, é de R$ 15,00 para a matéria-prima A e de R$ 4,50 para a matéria-prima B. O valor de venda desse produto é calculado acrescentando-se 50% ao valor de custo total dessas duas matérias-primas.@1 " +
                            "A partir do próximo mês, o preço de custo por quilograma da matéria-prima A sofrerá um aumento de R$ 6,00. Entretanto, deseja-se manter a mesma composição na produção e o mesmo valor de venda do produto. Para isso, a indústria analisa que necessitará reduzir o percentual de acréscimo aplicado sobre o valor de custo para calcular o seu valor de venda.@1 " +
                            "Para atender a essas condições, o novo percentual aplicado sobre o valor de custo deve ser de ";
                    qA = "12,8%.  ";
                    qB = "14,7%.  ";
                    qC = "20,0%.  ";
                    qD = "25,0%. ";
                    break;

                case 46:
                    sourceString = "No planejamento de uma viagem entre duas cidades, foram avaliados dois distintos trajetos. As opções estudadas envolvem a distância total a ser percorrida e o custo com pedágio nos respectivos trajetos.@1 " +
                            "@cimg mt570461 cimg@@2 " +
                            "O carro a ser utilizado na viagem percorre 10 km por litro. O preço do combustível utilizado é sempre igual a R$ 3,00 por litro.@1 " +
                            "A diferença positiva entre os custos da viagem, segundo o planejamento apresentado, referente aos trajetos avaliados é igual a ";
                    qA = "R$ 4,20.  ";
                    qB = "R$ 10,00.  ";
                    qC = "R$ 12,00.  ";
                    qD = "R$ 16,20. ";
                    break;

                case 47:
                    sourceString = "O esquema mostra o percurso de um barco ao longo de todo o seu trajeto.@2 " +
                            "@cimg mt570471 cimg@@2 " +
                            "O barco mantém-se sempre na mesma direção, perpendicular à correnteza. Porém, devido à ação desta, sua trajetória é direcionada para o ponto <i>C</i>, no outro lado da margem, a 100 metros do ponto inicial de destino <i>B</i>. Sabe-se também que o ângulo formado entre o novo trajeto e a direção perpendicular à margem, no ponto <i>A</i>, é de 30º?.@1 " +
                            "A distância, em metro, percorrida pelo barco é de ";
                    qA = "@cimg mt57047a cimg@ ";
                    qB = "@cimg mt57047b cimg@ ";
                    qC = "@cimg mt57047c cimg@ ";
                    qD = "200 ";
                    break;

                case 48:
                    sourceString = "A cápsula que retirou os mineiros que permaneceram presos durante vários dias sob a terra no norte do Chile, em 2010, ficará exposta em Londres. A figura representa a Fênix 2, como foi chamada a cápsula, uma jaula metálica de quase 400 centímetros de comprimento e 53 centímetros de diâmetro.@1 " +
                            "@cimg mt570481 cimg@@2 " +
                            "<small>Disponível em: http://g1.globo.com. Acesso em: 29 jul. 2014 (adaptado).</small>@2 " +
                            "As medidas do comprimento e do diâmetro, em metro, da Fênix 2 são, respectivamente,  ";
                    qA = "0,004 e 0,00053.  ";
                    qB = "0,04 e 0,0053.  ";
                    qC = "0,4 e 0,053.  ";
                    qD = "4 e 0,53. ";
                    break;

                case 49:
                    sourceString = "Um relatório do uso da internet no segundo semestre de 2012 mostrou que a velocidade média das conexões feitas no Brasil era de 2 Mbps. Essa velocidade média está bem abaixo das médias internacionais, como mostra o quadro.@1 " +
                            "@cimg mt570491 cimg@@2 " +
                            "<small>Disponível em: http://meiobit.com. Acesso em: 30 jul. 2014 (adaptado)</small>@2 " +
                            "Considere que a meta no Brasil seja conseguir que a velocidade média das conexões fique igual à média desses países. Uma das ações das empresas que fornecem os serviços de internet para atingir essa meta será trocar o sistema de fiação existente pelo sistema de fibra ótica. Para atingir essa meta, o percentual da velocidade de conexão deve aumentar em  ";
                    qA = "1 250%.  ";
                    qB = "1 350%.  ";
                    qC = "7 407%.  ";
                    qD = "9 259%. ";
                    break;

                case 50:
                    sourceString = "Para obter uma melhora mais rápida, quando da internação de um paciente, alguns tipos de medicamentos são administrados por via venosa. Quando o paciente recebe alta hospitalar, o médico prescreve um remédio, com fórmula similar, para ser ingerido por via oral, dando continuidade ao tratamento. Considere que um paciente passou por essa situação e enquanto estava internado tomava, na veia, 300 mg de medicamento. Ao avaliar a correspondência entre os medicamentos prescritos por vias distintas, o médico elaborou um gráfico retilíneo.@1 " +
                            "@cimg mt570501 cimg@@2 " +
                            "Qual é a dosagem, em miligrama, do medicamento prescrito pelo médico por via oral correspondente à dosagem do medicamento que o paciente tomava enquanto estava internado? ";
                    qA = "1 200  ";
                    qB = "300  ";
                    qC = "75  ";
                    qD = "25 ";
                    break;

                case 51:
                    sourceString = "Um corretor deseja publicar em jornal um anúncio referente a um empreendimento que ele está vendendo. O empreendimento tem formato retangular, de dimensões 200 m x 100 m, e o espaço disponível para o anúncio no jornal é também de formato retangular, de 10 cm x 5 cm. Ele pretende utilizar todo o espaço de que dispõe e, para isso, deve determinar a escala adequada.@1 " +
                            "A escala a ser utilizada será ";
                    qA = "1 : 20.  ";
                    qB = "1 : 100.  ";
                    qC = "1 : 400.  ";
                    qD = "1 : 2 000. ";
                    break;

                case 52:
                    sourceString = "Uma empresa que realiza serviços gráficos possui 6 funcionários que trabalham em uma jornada de 10 horas diárias no setor de cópias. A fim de evitar o pagamento de horas extras e outros encargos trabalhistas, o gerente dobrou o número de funcionários que trabalham nesse setor e reduziu a jornada de trabalho para 6 horas diárias. Verificou ainda que, na sua nova equipe, cada funcionário produz 600 cópias por hora trabalhada.@1 " +
                            "Nessas condições, o número total de cópias produzidas em um dia pela nova equipe passará a ser igual a ";
                    qA = "3 600.  ";
                    qB = "7 200.  ";
                    qC = "36 000.  ";
                    qD = "43 200. ";
                    break;

                case 53:
                    sourceString = "O dono de uma papelaria precisa comprar 1 000 resmas de papel no formato A4 para repor seu estoque. Após uma pesquisa de preços, escolhe realizar a compra em uma loja atacadista que vende cada resma ao preço de R$ 7,00. Constatou, também, que R$ 400,00 é o valor mais barato a ser pago pelo transporte dessas resmas. Sabe-se que, nessa papelaria, ele vende esse produto com lucro de 100% sobre seu custo total. Sabe-se ainda que ele deseja manter sua margem de lucro e vender essas resmas por, no máximo, R$ 14,10 cada. Para tanto, precisará conseguir um desconto no preço de compra das resmas, uma vez que o valor do frete não poderá ser negociado.@1 " +
                            "Para atingir seus objetivos, qual dever ser o valor mais próximo do menor desconto que o dono da papelaria precisa obter no valor de compra dessas resmas? ";
                    qA = "0,72%  ";
                    qB = "4,23%  ";
                    qC = "5,00%  ";
                    qD = "10,00% ";
                    break;

                case 54:
                    sourceString = "Uma pesquisa realizada em uma cidade apresentou o número de casos de dengue que foram confirmados no período de 2010 a 2013. O gráfico apresenta o número de casos por ano.@2 " +
                            "@cimg mt570541 cimg@@1 " +
                            "A média aritmética anual do número de casos de dengue confirmados, no período de 2010 a 2013, foi igual a ";
                    qA = "262,5.  ";
                    qB = "300,0.  ";
                    qC = "325,0.  ";
                    qD = "337,5. ";
                    break;

                case 55:
                    sourceString = "As máquinas de uma lavanderia consomem, quando em funcionamento, 1.500 litros de água por hora, de forma constante. Elas funcionam das 8h às 12h e das 14h às 18h. A caixa-d.água que abastece essas máquinas tem capacidade de 15.000 litros. Ela é continuamente alimentada por uma tubulação com vazão constante de 3.000 litros por hora e possui sistema de controle de volume (boia). " +
                            "Considere um dia em que houve interrupção do fornecimento de água na faixa horária entre 0h e 14h.@1 " +
                            "O gráfico que representa o volume de água, em litro, existente na caixa, na faixa horária entre 0h e 18h desse dia é ";
                    qA = "@cimg mt57055a cimg@ ";
                    qB = "@cimg mt57055b cimg@ ";
                    qC = "@cimg mt57055c cimg@ ";
                    qD = "@cimg mt57055d cimg@ ";
                    break;

                case 56:
                    sourceString = "De acordo com a Organização das Nações Unidas (ONU), cada pessoa necessita de cerca de 110 litros de água por dia para atender às suas necessidades de consumo e higiene. No entanto, no Brasil, o consumo por pessoa ultrapassa esse valor.@1 " +
                            "<small>Disponível em: http://site.sabesp.com.br. Acesso em: 4 set. 2014 (adaptado).</small>@2 " +
                            "A prefeitura de uma cidade desenvolveu uma campanha para que cada morador cumpra, diariamente, o equivalente a 80% daquilo que é indicado pela ONU. Um morador utiliza, diariamente, 220 litros de água.@1 " +
                            "Para cumprir a meta da prefeitura, esse morador deve reduzir seu consumo diário de água em ";
                    qA = "20%  ";
                    qB = "40%  ";
                    qC = "50%  ";
                    qD = "60% ";
                    break;

                case 57:
                    sourceString = "Uma construtora solicita ao seu fabricante de pré.moldados que altere as dimensões dos blocos retangulares utilizados na construção de paredes. Foi solicitado que cada bloco tenha comprimento externo de 100 cm e largura externa de 15 cm. O fabricante calculou que a espessura da parede do bloco será de 3 cm para suportar o peso no empilhamento dos blocos, sendo necessário dimensionar a altura do bloco de forma a utilizar um volume de concreto de 39 240 cm3 na produção de cada bloco, conforme ilustra a figura.@1 " +
                            "@cimg mt570571 cimg@@2 " +
                            "Nessas circunstâncias, qual deve ser a altura do bloco, em centímetro? ";
                    qA = "13  ";
                    qB = "26  ";
                    qC = "57  ";
                    qD = "60 ";
                    break;

                case 58:
                    sourceString = "O gerente de uma concessionária, com a finalidade de mostrar o bom desempenho de sua equipe, traçou um plano de ação para seus vendedores baseado no número de vendas de veículos do ano anterior. Ele apresentou a quantidade de veículos vendidos, distribuída mensalmente, conforme o gráfico.@2 " +
                            "@cimg mt570581 cimg@@2 " +
                            "Seu plano para o próximo ano é estabelecer, como meta de vendas mensais, a média aritmética dos seis meses com maiores quantidades de veículos vendidos apresentados no gráfico.@1 " +
                            "Qual é o número mínimo de veículos que deverão ser vendidos para se cumprir a meta projetada pelo gerente? ";
                    qA = "130  ";
                    qB = "145 ";
                    qC = "150  ";
                    qD = "154 ";
                    break;

                case 59:
                    sourceString = "Um construtor pretende cobrir um telhado. No mercado existem diferentes medidas de comprimento de telhas de mesma largura. Na junção, as telhas se sobrepõem em 10 cm e na extremidade inferior devem ultrapassar a parede, conforme ilustra a figura.@1 " +
                            "@cimg mt570591 cimg@@2 " +
                            "Os tipos de telha são:@2 " +
                            "@cimg mt570592 cimg@ @1 " +
                            "@cimg mt570593 cimg@ @1 " +
                            "@cimg mt570594 cimg@ @2 " +
                            "Para cobrir toda a casa, foram consideradas algumas possibilidades.@2 " +
                            "I. Todo o telhado com telhas do tipo A;@1 " +
                            "II. Combinar telhas do tipo A com telhas do tipo B;@1 " +
                            "III. Combinar telhas do tipo A com telhas do tipo C;@1 " +
                            "IV. Combinar telhas do tipo B com telhas do tipo C.@2 " +
                            "A possibilidade que resultou no menor custo na compra das telhas é a ";
                    qA = "I. ";
                    qB = "II. ";
                    qC = "III. ";
                    qD = "IV. ";
                    break;

                case 60:
                    sourceString = "Uma pessoa tem duas dívidas parceladas: uma no valor de R$ 150,00 mensais, faltando 30 parcelas para quitar, e outra, no valor de R$ 120,00 mensais, faltando 15 parcelas para quitar. Uma financeira, ao entrar em contato com essa pessoa, propõe-lhe quitar as duas dívidas se ela fizer um financiamento pagando 48 parcelas de RS 200,00 e recebendo de retorno um valor de R$ 1 500,00.@1 " +
                            "Se a pessoa aceitar o financiamento oferecido por essa financeira, quanto ela pagará a mais por suas dívidas atuais? ";
                    qA = "R$ 1 800,00  ";
                    qB = "R$ 3 300,00  ";
                    qC = "R$ 4 800,00  ";
                    qD = "R$ 8 100,00 ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {

                case 1:
                    sourceString = "@cimg cn570011 cimg@ @1 " +
                            "<small> GONSALES, F. Disponível em: www1.folha.uol.com.br. Acesso em: 30 ago, 2014. </small>@2 " +
                            "A tirinha pode ilustrar a transmissão de: ";
                    qA = "aids ";
                    qB = "gripe ";
                    qC = "dengue ";
                    qD = "hepatite ";
                    break;

                case 2:
                    sourceString = "Para avaliar as concepções de força e velocidade que estejam de acordo com a física newtoniana, um pesquisador propôs a seguinte situação: uma esfera de massa <i>m</i> é lançada horizontalmente a partir de uma altura <i>h</i> e, ao desprezar a resistência do ar, descreve uma trajetória parabólica, conforme ilustra a figura.@1 " +
                            "@cimg cn570021 cimg@ @2 " +
                            "Ao analisar o movimento da esfera no ponto <b>A</b>, as representações dos vetores força (<i>F</i>) e velocidade (<i>V</i>) são: ";
                    qA = "@cimg cn57002a cimg@ ";
                    qB = "@cimg cn57002b cimg@ ";
                    qC = "@cimg cn57002c cimg@ ";
                    qD = "@cimg cn57002d cimg@ ";
                    break;

                case 3:
                    sourceString = "O Ministério da Saúde determinou o aumento das ações de vigilância e prevenção relativas a uma doença que nunca havia sido registrada no Brasil: a <i>Chikungunya</i>. Provocada por um vírus, a doença possui a mesma forma de contágio da dengue, bem como sintomas semelhantes, embora seja menos letal. Para evitar que o vírus se alastre pelo país, é necessário que a população se envolva nos trabalhos de vigilância e prevenção.@1 " +
                            "<small> Disponível em: http://veja.abril.com.br. Acesso em: 17 set, 2014 (adaptado). </small>@2 " +
                            "Um desses trabalhos é ";
                    qA = "higienizar as verduras ";
                    qB = "lavar as mãos constantemente ";
                    qC = "combater o mosquito transmissor ";
                    qD = "consumir exclusivamente água filtrada ";
                    break;

                case 4:
                    sourceString = "Na região sucroalcooleira de Ribeirão Preto (SP), vários produtores de cana-de-açúcar resolveram utilizar o controle biológico no combate da cigarrinha-da-folha, um inseto que vem destruindo as plantações atacadas.@2 " +
                            "Um exemplo dessa estratégia de controle é a ";
                    qA = "aplicação de inseticidas ";
                    qB = "pulverização de fungo verde ";
                    qC = "aração do solo antes do plantio ";
                    qD = "utilização de armadilhas luminosas ";
                    break;

                case 5:
                    sourceString = "Antigamente, para atingir um aspecto facial pálido, que era o padrão estético da época, as mulheres e os homens utilizavam um pó facial à base de compostos de chumbo como hidróxidos, carbonatos e óxidos. A partir do século XIX, esse pó facial começou a ser fabricado com óxido de zinco.@1 " +
                            "<small>MARTELL, J. The History of Cosmetics. Disponível em: www.thehistoryof.net. Acesso em: 15 set. 2014 (adaptado).</small>@2 " +
                            "Os compostos de chumbo tiveram que ser substituídos devido ao(à) ";
                    qA = "sua toxicidade ";
                    qB = "seu alto custo ";
                    qC = "sua escassez ";
                    qD = "sua ineficácia ";
                    break;

                case 6:
                    sourceString = "A brisa marítima é um fenômeno diário. Ela sopra do mar para a praia durante o dia e em sentido contrário à noite. Durante o dia, a temperatura da superfície da praia se eleva mais rapidamente que a da água, e à noite o movimento se inverte e o ar mais quente é o que está em contato com a água. Por ser menos densa, essa massa de ar sobe, dando lugar ao ar mais frio que está em contato com a praia. Produz-se então a brisa da praia para o mar. Todo esse processo ocorre, pois a superfície da praia possui uma característica física diferente da água.@2 " +
                            "O fenômeno descrito ocorre porque, em relação à praia, a água possui maior ";
                    qA = "massa ";
                    qB = "calor latente ";
                    qC = "calor específico ";
                    qD = "condutividade térmica ";
                    break;

                case 7:
                    sourceString = "Ao comprar um xampu, vendido em supermercados, um consumidor verificou a seguinte informação no rótulo: sem sal. A composição do produto apresentava os seguintes compostos: laurel éter sulfato de sódio, formaldeído, ácido cítrico, perfume e silicone. " +
                            "Esse xampu não pode ser considerado sem sal devido à presença de ";
                    qA = "silicone ";
                    qB = "formaldeído ";
                    qC = "citrato de hidrogênio ";
                    qD = "laurel éter sulfato de sódio ";
                    break;

                case 8:
                    sourceString = "A figura apresenta o esquema elétrico do painel luminoso de uma vitrine. Um técnico deseja trocar as duas lâmpadas ligadas em paralelo por uma única lâmpada, de modo que, com o circuito fechado, a corrente na bateria seja a mesma.@1 " +
                            "@cimg cn570081 cimg@@2 " +
                            "Para que isso ocorra, a nova lâmpada deve ter resistência elétrica, em ohm, de ";
                    qA = "1,0 ";
                    qB = "2,0 ";
                    qC = "4,0 ";
                    qD = "8,0 ";
                    break;

                case 9:
                    sourceString = "Após um tempo pulverizando as plantações de maracujá para combater as larvas que danificavam os frutos, observou-se que estas pararam de frutificar. As flores do maracujá não possuem autofecundação e seu pólen é viscoso e pesado, não podendo ser transportado pelo vento. Assim, para voltar a colher frutos dos maracujazeiros, é necessário fazer a polinização manual das flores. @1 " +
                            "<small>Disponível em: http://revistagloborural.globo.com. Acesso em: 3 set. 2014 (adaptado).</small>@2 " +
                            "Isso acontece porque o ciclo natural de polinização foi alterado pelo(a): ";
                    qA = "uso de inseticidas ";
                    qB = "engenharia genética ";
                    qC = "uso de adubos químicos ";
                    qD = "alteração do regime de chuvas ";
                    break;

                case 10:
                    sourceString = "A água para consumo humano deve respeitar parâmetros de aspectos físicos, químicos e biológicos determinados. Um exemplo de água quimicamente inconveniente para consumo, e que pode causar danos econômicos, é aquela que possui elevada concentração de sais de cálcio e magnésio dissolvidos. Estes dificultam a utilização da água para lavagem e danificam sistemas de aparelhos que usam água aquecida, como maquinários das indústrias e das residências.@2 " +
                            "A água, nessas condições, é conhecida como água ";
                    qA = "dura ";
                    qB = "ácida ";
                    qC = "potável ";
                    qD = "patogênica ";
                    break;

                case 11:
                    sourceString = "Um grupo de alunos de engenharia de uma universidade norte.americana criou um protótipo para gerar energia. O protótipo é acoplado à sola do sapato e tem uma espécie de alavanca que é acionada cada vez que o pé entra em contato com o chão. Esse movimento faz girar um conjunto de engrenagens conectadas a um gerador preso à lateral do sapato. A ideia é que o protótipo possa ser utilizado para carregar eletrônicos como celulares e outros aparelhos portáteis.@1 " +
                            "<small>Disponível em: http://olhardigital.uol.com.br. Acesso em: 5 out. 2013 (adaptado).</small>@2 " +
                            "A finalidade do protótipo acoplado ao tênis é transformar energia ";
                    qA = "elétrica em energia térmica ";
                    qB = "química em energia elétrica ";
                    qC = "térmica em energia mecânica ";
                    qD = "mecânica em energia elétrica ";
                    break;

                case 12:
                    sourceString = "O fermento biológico constitui.se de um fungo unicelular muito utilizado no preparo em receitas de pão caseiro. Há o costume, entre alguns cozinheiros, de colocar uma bolinha da massa em um copo com água. No início, a bolinha vai para o fundo do copo, porém, depois de algum tempo a bolinha fica flutuando na água. A flutuação da bolinha de massa indica o momento de levar a massa para assar. @2 " +
                            "A bolinha de massa flutua na água porque ocorre a liberação de gás ";
                    qA = "nitrogênio ";
                    qB = "carbônico ";
                    qC = "oxigênio ";
                    qD = "amônia ";
                    break;

                case 13:
                    sourceString = "@cimg cn570131 cimg@@1 " +
                            "<small>Disponível em: www1.folha.uol.com.br. Acesso em: 4 set. 2014.</small>@2 " +
                            "A consequência direta da introdução desse mosquito na natureza será o(a)  ";
                    qA = "aumento no uso de inseticidas ";
                    qB = "redução da população de mosquitos transmissores ";
                    qC = "extinção de uma espécie importante para a teia alimentar da região ";
                    qD = "risco de surgimento de uma nova espécie devido à manipulação genética ";
                    break;

                case 14:
                    sourceString = "Para aliviar o mal.estar digestivo, dois irmãos colocaram água do filtro em dois copos. Em um deles, foi colocado um antiácido na forma de comprimido e, no outro, na forma de pó. Apesar de os antiácidos possuírem mesma composição e mesma massa, um deles dissolveu mais rápido que o outro. A diferença no tempo da reação deve-se ao(à)  ";
                    qA = "catalisador ";
                    qB = "temperatura ";
                    qC = "concentração ";
                    qD = "área de contato ";
                    break;

                case 15:
                    sourceString = "A incidência de radiação solar no Brasil é alta praticamente o ano todo, mas difere um pouco de região para região. O mapa mostra a média anual da incidência diária de radiação solar (em MJ/[m² dia]).@1 " +
                            "@cimg cn570151 cimg@@1 " +
                            "<small>TIBA, C. et al. Atlas solarimétrico do Brasil. Recife: EdUFPE, 2000 (adaptado).</small>@2 " +
                            "De acordo com o mapa, a região mais indicada para a construção de usinas solares de geração de eletricidade é a: ";
                    qA = "sul ";
                    qB = "norte ";
                    qC = "sudeste ";
                    qD = "nordeste ";
                    break;

                case 16:
                    sourceString = "A reciclagem é um processo importante quando se pensa em desenvolvimento sustentável, uma vez que determinados tipos de materiais, cotidianamente reconhecidos como lixo, por exemplo, o papel, são reutilizados para a fabricação de novos produtos. Além disso, a reciclagem também contribui para reduzir a exploração de recursos naturais tidos como matéria-prima.@2 " +
                            "No caso do material citado no texto, sua reciclagem reduziria a exploração de ";
                    qA = "celulose vegetal ";
                    qB = "fibras de algodão ";
                    qC = "látex das seringueiras ";
                    qD = "petróleo e seus derivados ";
                    break;

                case 17:
                    sourceString = "Para atletas de esportes como corrida, natação e ciclismo, cada milésimo de segundo é crucial nas competições. Um nadador aderiu à depilação, pois, nesse esporte, ter o corpo depilado pode ser decisivo. Sem pelos, o nadador pode reduzir seu tempo de prova, em que o vencedor, às vezes, ganha por diferença de milésimos de segundos. @2 " +
                            "A redução obtida no tempo de prova se deve ao(à): ";
                    qA = "diminuição da força de atrito ";
                    qB = "aumento da força de empuxo ";
                    qC = "diminuição da força da gravidade ";
                    qD = "aumento da força elástica da pele ";
                    break;

                case 18:
                    sourceString = "Ao acompanhar a tendência mundial de utilização de combustíveis mais limpos, o Brasil tem investido na expansão de um produto que apresenta menor emissão de poluentes no processo de combustão, além de proporcionar maior durabilidade aos equipamentos que o utilizam. Assim como o petróleo, pode ser encontrado em rochas porosas do subsolo. Ele pode ser utilizado como fonte de geração de energia elétrica, em aplicações automotivas e domésticas.@1 " +
                            "<small>AGÉNCIA PETROBRAS DE NOTÍCIAS. Disponível em: www.brasil.gov.br. Acesso em: 31 ago. 2014 (adaptado).</small>@2 " +
                            "O produto que apresenta as características mencionadas no texto é o(a): ";
                    qA = "diesel ";
                    qB = "etanol ";
                    qC = "gasolina ";
                    qD = "gás natural ";
                    break;

                case 19:
                    sourceString = "O crescimento excessivo de cabelos no nariz e nas orelhas é um problema enfrentado por muitos homens. Essa condição genética, presente em várias populações, é conhecida como hipertricose e, curiosamente, atinge apenas pessoas do sexo masculino. Nas famílias acometidas pelo problema, sempre, todos os homens herdam esta característica do pai, enquanto as mulheres estão livres do problema.@2 " +
                            "Esse é um caso clássico de herança restrita ao sexo, cujo gene determinante encontra-se no cromossomo ";
                    qA = "X ";
                    qB = "Y ";
                    qC = "13 ";
                    qD = "21 ";
                    break;

                case 20:
                    sourceString = "Adicionar formol em produtos para alisamento capilar é uma prática proibida pela Agência Nacional de Vigilância Sanitária (Anvisa). A adição de glutaral também é proibida, pois, devido à sua semelhança química com o formol, apresenta os mesmos riscos e restrições. Os princípios ativos desses materiais são apresentados:@1 " +
                            "@cimg cn570201 cimg@@1 " +
                            "<small>ANVISA. Disponível em: www.anvisa.gov.br. Acesso em: 2 set. 2014 (adaptado).</small>@2 " +
                            "Esses princípios ativos apresentam propriedades químicas semelhantes, pois possuem: ";
                    qA = "igual número de hidrogênio ";
                    qB = "mesmo grupo funcional ";
                    qC = "oxigênio na estrutura ";
                    qD = "grupo carboxila ";
                    break;

                case 21:
                    sourceString = "Existe uma noção de que fazer xixi em uma piscina não tem problema porque a água contém cloro, mas isso não é \"verdade\", adverte um engenheiro químico norte.americano. Em uma piscina, a função do cloro é matar bactérias, e a urina apresenta na sua composição substâncias, como a ureia e o ácido úrico. O cloro, presente na piscina, reage prontamente com o ácido úrico, que contém nitrogênio. O resultado é a formação de cloreto de cianogênio (CNCI) e tricloramina (NCI3), potencialmente perigosos.@1 " +
                            "<small>ARNOLD, C. Não faça xixi na piscina. Scientific American Brasil, n. 148, set. 2014.</small>@2 " +
                            "O problema caracterizado nessa situação ocorre porque o ácido úrico ";
                    qA = "dilui-se nos compostos líquidos ";
                    qB = "vaporiza-se para o ar atmosférico ";
                    qC = "mistura-se com secreções do corpo ";
                    qD = "transforma-se em outras substâncias ";
                    break;

                case 22:
                    sourceString = "A imagem representa uma balança utilizada para a medida da massa de uma fruta. A massa colocada no prato direito da balança é de 100 g e o sistema encontra.se em equilíbrio.@1 " +
                            "@cimg cn570221 cimg@@2 " +
                            "A massa dessa fruta, em grama, é ";
                    qA = "100 ";
                    qB = "120 ";
                    qC = "500 ";
                    qD = "600 ";
                    break;

                case 23:
                    sourceString = "Ao separar as camisas coloridas de algodão, antes de colocá-las para lavar na máquina, uma pessoa percebeu que o colarinho de uma delas estava muito sujo e engordurado. Para retirar esse tipo de sujeira, ela utilizou um truque: aplicou xampu neutro sobre o colarinho da camisa, pois sabe que o xampu ajuda a tirar as manchas de gordura mais resistentes. Na falta desse produto, um que o substitui para a mesma finalidade, conservando suas propriedades, é o(a): ";
                    qA = "aguarrás ";
                    qB = "água sanitária ";
                    qC = "detergente líquido ";
                    qD = "desinfetante de uso geral ";
                    break;

                case 24:
                    sourceString = "Imagine passear por aí com um carro sem freio 2 só o pedal para acelerar funciona. Se a situação parece absurda, em termos automobilísticos, saiba que algo semelhante ocorre no seu corpo quando o balanço entre sódio e potássio se encontra descompensado. É que, assim como o freio e o acelerador, esses minerais atuam de maneira essencialmente opostas. A ação do sódio nos vasos sanguíneos promove a elevação da pressão arterial.@1 " +
                            "<small>MANARINI, T. Potássio para o equilíbrio perfeito. Saúde, n. 380, ago. 2014.</small>@2 " +
                            "A ação exercida pelo potássio nessas partes do corpo é o(a): ";
                    qA = "contração ";
                    qB = "ramificação ";
                    qC = "calcificação  ";
                    qD = "relaxamento ";
                    break;

                case 25:
                    sourceString = "A figura ilustra o instante em que um carro em alta velocidade é fotografado por uma câmara de um dispositivo controlador de velocidade. Para que isso ocorra, esse dispositivo mede o tempo que o carro leva para atravessar os sensores L1, L2 e L3.@1 " +
                            "@cimg cn570251 cimg@@1 " +
                            "<small>Disponível em: http://galileu.globo.com. Acesso em: 12 set. 2014.</small>@2 " +
                            "Para que seja possível calcular a velocidade do veículo, é necessário que se conheça também o(a): ";
                    qA = "comprimento do automóvel ";
                    qB = "distância entre os sensores ";
                    qC = "frequência da luz do <i>flash</i> da lâmpada ";
                    qD = "coeficiente de atrito entre os pneus e o asfalto ";
                    break;

                case 26:
                    sourceString = "Em um dia de sol, um jardineiro usa uma mangueira para irrigar um pequeno jardim e observa a formação de um arco-íris próximo às gotas de água espalhadas no ar.@2 " +
                            "O fenômeno observado ocorre porque as gotas de água provenientes da mangueira são capazes de ";
                    qA = "polarizar as diferentes cores de luz que compõem a luz branca ";
                    qB = "refletir seletivamente os raios de luz solar em direções preferenciais. ";
                    qC = "refratar os raios de luz, separando a luz branca em suas cores componentes ";
                    qD = "absorver a luz branca, permitindo que se observem suas cores componentes ";
                    break;

                case 27:
                    sourceString = "Na Inglaterra, há dois tipos da mariposa <i>Biston betularia</i>: clara e escura, que costumam repousar na árvore bétula.@1 " +
                            "@cimg cn570271 cimg@@1 " +
                            "As árvores de casca branca eram abundantes na Inglaterra, e os líquens claros cobriam a maioria dos troncos das árvores. Isso permitiu às mariposas claras uma excelente camuflagem contra a predação. Com a Revolução Industrial, o advento de fábricas espalhou muita fuligem pelas florestas próximas. A fuligem eliminou os líquens, que são extremamente sensíveis à poluição, e enegreceu os troncos das árvores. Contra um fundo escuro, as aves podiam ver melhor as mariposas claras, que se tornaram um alvo fácil de predação. Por conseguirem se camuflar melhor no novo ambiente, as mariposas escuras sobreviveram, puderam se reproduzir e passaram seus genes para as gerações seguintes.@1 " +
                            "<small>Disponível em: http://darwin2009.cienciaviva.pt. Acesso em: 16 set. 2014 (adaptado).</small>@2 " +
                            "A predominância de uma das cores de mariposas inglesas constitui uma evidência a favor da: ";
                    qA = "endossimbiose, isto é, a interação obrigatória para a sobrevivência dos organismos ";
                    qB = "geração espontânea, isto é, organismos vivos podem se originar facilmente a partir de matéria " +
                            "inorgânica ";
                    qC = "seleção natural, isto é, indivíduos mais aptos em determinado ambiente têm maior " +
                            "probabilidade de se reproduzir ";
                    qD = "lei do uso e do desuso, isto é, alterações no ambiente causam mudanças nos organismos " +
                            "que ali vivem, que podem ser transmitidas aos descendentes ";
                    break;

                case 28:
                    sourceString = "Em condições normais, as substâncias podem ser encontradas em três estados físicos: sólido, líquido e gasoso. Entretanto, algumas substâncias só podem ser encontradas em dois estados físicos, como, por exemplo, a naftalina, o gelo seco e a cânfora, que passam do estado sólido diretamente para o gasoso, sem passar pelo estado líquido.@2 " +
                            "A mudança de estado físico sofrida por essas substâncias é chamada de ";
                    qA = "liquefação ";
                    qB = "sublimação ";
                    qC = "vaporização ";
                    qD = "solidificação ";
                    break;

                case 29:
                    sourceString = "Em um bioma brasileiro ocorrem dois períodos secos anualmente. Nele, predominam arbustos e árvores de pequeno porte, alguns com espinhos e outros com queda de folhas devido ao déficit hídrico.@1 " +
                            "<small>Disponível em: www.brasil.gov.br. Acesso em: 29 ago. 2014 (adaptado).</small>@2 " +
                            "Esse conjunto de características adaptativas é típico da vegetação do(a) ";
                    qA = "Pampa  ";
                    qB = "Cerrado  ";
                    qC = "Pantanal  ";
                    qD = "Caatinga ";
                    break;

                case 30:
                    sourceString = "Os satélites são ditos geoestacionários quando são colocados em uma órbita circular em torno da Terra. Para um observador sobre a sua superfície, o satélite comporta.se como se estivesse fixo em um determinado local no céu. A figura representa quatro possíveis órbitas circulares de satélites em relação ao plano equatorial da Terra. Todas as órbitas com período de 24 horas:@2 " +
                            "— órbita polar ± plano da órbita faz 90° com o plano equatorial;@1 " +
                            "— órbita inclinada ± plano da órbita faz um ângulo maior que 0° e menor que 90° com o plano " +
                            "equatorial;@1 " +
                            "— órbita equatorial direta ± mesmo sentido de rotação da Terra e no plano equatorial;@1 " +
                            "— órbita equatorial retrógrada ± sentido de rotação oposto ao da Terra e no plano equatorial.@1 " +
                            "@cimg cn570301 cimg@@1 " +
                            "<small>ESCALANT, E. G. Disponível em: http://ingenieria.anahuac.mx. Acesso em: 9 set. 2014(adaptado).</small>@2 " +
                            "Para que um satélite fique geoestacionário, sua órbita deve ser: ";
                    qA = "polar ";
                    qB = "inclinada ";
                    qC = "equatorial direta ";
                    qD = "equatorial retrógrada ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice+30) {

                case 31:
                    sourceString = "Somos todos iguais ou somos todos diferentes? Queremos ser iguais ou queremos ser diferentes? Houve um tempo em que a resposta se abrigava segura de si no primeiro termo. Já faz um quarto de século, porém, que a resposta se deslocou. A começar da segunda metade dos anos 1970, passamos a nos ver envoltos numa atmosfera cultural e ideológica inteiramente nova, na qual parece generalizar.se a consciência de que nós somos diferentes de fato e de direito. É o chamado \"direito à diferença\", o direito à diferença cultural, o direito de ser, sendo diferente. @1 " +
                            "<small>PIERUCCI, A. F. Ciladas das diferenças. São Paulo: Editora 34, 1999.</small> @2 " +
                            "O autor apresenta uma característica das democracias contemporâneas. Essa característica combate a exclusão social na medida em que: ";
                    qA = "possibilita que a cidadania seja estendida a grupos minoritários ";
                    qB = "impede que a educação escolar promova a consciência de classe  ";
                    qC = "admite que a justiça elimine os desequilíbrios entre pobres e ricos ";
                    qD = "obriga que as cotas garantam participação política aos marginalizados ";
                    break;

                case 32:
                    sourceString = "Qualquer brasileiro que tenha passado pelo ensino fundamental provavelmente já ouviu falar da cidade.Estado grega, do Império Romano, do feudalismo, da Revolução Francesa, das Guerras Mundiais; de nomes como Nero, César, Napoleão, Hitler ou Stalin, mas dificilmente ouviu falar das cidades.Estado Yorubas, ou de povos como os Haussa, Bakongo, Makonde, Xhosa e Swahíli. E da rainha Nzinga, de Mussa Keita ou Samora Machel? Longe de querer fazer elogios a impérios e heróis africanos, é preciso reconhecer a sua existência, apagada dos nossos livros escolares. @1 " +
                            "<small>ZAMPARONI, V. Imagens da África no Brasil. In: BOTELHO, A.; SCHWARCZ, L. M. (Org.). Agenda brasileira: temas de uma sociedade em mudança. São Paulo: Cia. das Letras, 2011 (adaptado).</small> @2 " +
                            "O uso da memória, criticado no texto, é um exercício de poder na medida em que: ";
                    qA = "reproduz a realidade de fatos passados.  ";
                    qB = "ignora a existência de certas sociedades.  ";
                    qC = "descreve a variedade de tradições culturais.  ";
                    qD = "questiona as consequências de alguns conflitos. ";
                    break;

                case 33:
                    sourceString = "Nos anos 1960, a etnóloga Margaret Mead combateu veementemente a noção de \"eterno feminino\", mostrando que os atributos de cada sexo variam segundo os povos. Por exemplo, entre os arapeches da Nova Guiné, que ela estava estudando, era aos homens que se atribuíam traços de caráter geralmente considerados femininos, tais como a sensibilidade, a passividade e o amor pelos filhos. @1 " +
                            "<small>DORTIER, J..F. Gênero. In: Dicionário de ciências humanas. São Paulo: Martins Fontes, 2010.</small> @2 " +
                            "De acordo com o estudo citado, os papéis e responsabilidades de homens e mulheres em uma sociedade são: ";
                    qA = "economicamente estabelecidos.  ";
                    qB = "biologicamente definidos.  ";
                    qC = "culturalmente construídos.  ";
                    qD = "juridicamente atribuídos. ";
                    break;

                case 34:
                    sourceString = "<b>Distribuição percentual da população por situação de domicílio - Brasil - 1980 a 2010</b> @1" +
                            "@cimg ch570341 cimg@@1 " +
                            "<small>IBGE. Disponível em: http://7a12.ibge.gov.br. Acesso em: 16 ago. 2014.</small> @2 " +
                            "A evolução da distribuição populacional retratada no gráfico sofreu influência do seguinte processo ocorrido no espaço agrário brasileiro: ";
                    qA = "Expansão de frentes pioneiras ";
                    qB = "Formação de cooperativas agrícolas ";
                    qC = "Criação de assentamentos familiares  ";
                    qD = "Modernização de métodos produtivos ";
                    break;

                case 35:
                    sourceString = "O folclore consiste em \"uma educação informal\" que se dá ao lado da sistemática; uma educação que orienta e revigora comportamentos, faz participar de crenças e valores, perpetua um universo simbólico. Se as condições da vida social que garantem a sua persistência são ameaçadas, também o folclore entra em crise. @1 " +
                            "<small>BOSI, E. Cultura de massa e cultura popular: leituras de operárias. Petrópolis: Vozes, 2000.</small> @2 " +
                            "A valorização do tipo de manifestação cultural descrita é importante para a promoção ";
                    qA = "dos costumes elitizados.  ";
                    qB = "das práticas religiosas.  ";
                    qC = "dos saberes científicos.  ";
                    qD = "das identidades regionais. ";
                    break;

                case 36:
                    sourceString = "As novas formas de interconexão e de organização política e cultural, rotuladas com a expressão \"cibercultura\", têm potencial para originar uma verdadeira revolução, com uma inédita multiplicidade de pontos de vista em todos os debates socialmente relevantes. @1 " +
                            "<small>MAEDA, D. O fim da dicotomia? Revista de Ciências Sociais, n. 1, abr..maio 2012 (adaptado).</small> @2 " +
                            "No texto, a originalidade da \"cibercultura\" está associada à ";
                    qA = "capacidade de promover a circulação de ideias.  ";
                    qB = "competência de inovar a organização dos sindicatos.  ";
                    qC = "vocação de esclarecer a consciência de classe.  ";
                    qD = "virtude de reforçar a aplicação das leis. ";
                    break;

                case 37:
                    sourceString = "É importante enfatizar a relação entre estudo e maternidade. Nota.se que, entre as mulheres de 15 a 17 anos de idade que não tinham filho, 88,1% estavam estudando; para aquelas que tinham um filho ou mais, somente 28,5% estudavam e 68,7% delas não estudavam nem completaram o ensino médio, que seria o adequado para estarem cursando. @1 " +
                            "<small>IBGE. Síntese de indicadores sociais: uma análise das condições de vidada população brasileira. Rio de Janeiro, 2013.</small> @2 " +
                            "A política pública para minimizar o problema descrito no texto é: ";
                    qA = "universalizar o acesso das crianças à creche.  ";
                    qB = "promover os cuidados à saúde da gestante.  ";
                    qC = "favorecer a inserção no mercado de trabalho.  ";
                    qD = "ampliar as vagas nos cursos profissionalizantes. ";
                    break;

                case 38:
                    sourceString = "Cerca de 1,1 bilhão de pessoas em todo o mundo não têm acesso à água potável. Nos países em desenvolvimento, esse problema aparece relacionado a 80% das mortes e enfermidades. No século XX, o consumo da água multiplicou-se por seis 2 duas vezes a taxa do crescimento da população mundial. @1 " +
                            "<small>NÓRCIO, I. Falta de água potável no mundo aparece relacionada a 80% das mortes e doenças. Disponível em: www.folhadaregiao.com.br. Acesso em: 27 ago. 2014.</small> @2 " +
                            "No Brasil, uma ação capaz de minimizar o problema descrito no texto é o(a): ";
                    qA = "aterramento de resíduos sólidos.  ";
                    qB = "tratamento de esgoto das cidades.  ";
                    qC = "construção de usinas hidrelétricas.  ";
                    qD = "privatização de redes de abastecimento. ";
                    break;

                case 39:
                    sourceString = "@cimg ch570391 cimg@ @1 " +
                            "<small>MARIANO. Disponível em: www.controversia.com.br. Acesso em: 24 ago. 2013 (adaptado).</small> @2 " +
                            "Comparando os indicadores apresentados na imagem, evidencia.se que a nação brasileira tem sido marcada pela disparidade entre: ";
                    qA = "autonomia econômica e divisão do trabalho.  ";
                    qB = "liberdade econômica e autoritarismo político.  ";
                    qC = "dimensão econômica e distribuição de renda.  ";
                    qD = "globalização econômica e acesso ao emprego. ";
                    break;

                case 40:
                    sourceString = "A China tem os estados africanos como parceiros, e não como alvos de ajuda, e muitos governos árabes e africanos falam entusiasticamente de um \"modelo chinês\", de regime fechado com economia aberta. A China cancelou a maior parte da dívida dos países africanos, forneceu créditos em condições favoráveis e multiplicou as importações da África. Adis-Abeba, sede da União Africana, também é a base regional da China para o estabelecimento de contatos comerciais na venda de equipamentos militares. @1 " +
                            "<small>KHANNA, P. O segundo mundo: impérios e influência na nova ordem global. Rio de Janeiro: Intrínseca, 2008 (adaptado).</small> @2 " +
                            "Uma consequência desse tipo de intervenção para o continente africano é a: ";
                    qA = "consolidação do regime socialista.  ";
                    qB = "ampliação do modelo democrático.  ";
                    qC = "preservação dos recursos naturais.  ";
                    qD = "expansão das atividades produtivas. ";
                    break;

                case 41:
                    sourceString = "O novo!... Esse foi o pensamento estético que nos agitou aqui durante a guerra. @1 Onde estava o novo? Lá fomos buscar o novo nas Europas. E imitamos os \"ismos\" europeus. @1 " +
                            "<small>ANDRADE, M. Modernismo e ação. Jornal do Commercio, Rio de Janeiro, 24 abr. 1925, apud SCHWARTZ, J. (Org.). Vanguardas latino-americanas: polêmicas, manifestos e textos críticos. São Paulo: Iluminuras; Edusp; Fapesp, 1995.</small> @2 " +
                            "No texto, o autor, participante da Semana de Arte Moderna de 1922, está criticando a ";
                    qA = "construção de hábitos consumistas.  ";
                    qB = "reprodução de estilos estrangeiros.  ";
                    qC = "expressão de ideias nacionalistas.  ";
                    qD = "exposição de projetos políticos. ";
                    break;

                case 42:
                    sourceString = "Em junho de 1917, uma greve geral paralisou totalmente a cidade de São Paulo por oito dias. As principais reivindicações eram o aumento de salários, a redução de jornada - trabalhava.se de 12 a 16 horas diárias -, o fim da exploração de menores e mulheres, e a transformação das condições gerais de trabalho. Vitorioso, o movimento assustou as elites. @1 " +
                            "<small>IPEA. Disponível em: www.ipea.gov.br. Acesso em: 24 ago. 2013.</small> @2 " +
                            "A iniciativa que viabilizou a conquista dos direitos mencionados no texto partiu dos ";
                    qA = "grupos empresariais receosos de retaliação.  ";
                    qB = "partidos políticos atuantes nas causas sociais.  ";
                    qC = "trabalhadores organizados em sindicatos de classe.  ";
                    qD = "líderes religiosos preocupados com o avanço socialista. ";
                    break;

                case 43:
                    sourceString = "@cimg ch570431 cimg@ @1 " +
                            "<small>DAHMER, A. Disponível em: www.malvados.com.br. Acesso em: 16 ago. 2014 (adaptado).</small> @2 " +
                            "De acordo com o texto, a expansão do modelo de trabalho referido na imagem encontra limites no seguinte fator: ";
                    qA = "Inexistência da regulação legal.  ";
                    qB = "Carência da formação profissional.  ";
                    qC = "Resistência da cultura das organizações.  ";
                    qD = "Deficiência da estrutura de comunicação. ";
                    break;

                case 44:
                    sourceString = "O integralista é o soldado de Deus e da Pátria, o homem.novo do Brasil que vai construir uma grande nação, dizia um slogan. A Ação Integralista Brasileira se organizou a partir de uma série de pequenos grupos de extrema.direita que se aglutinaram em torno da liderança de Plínio Salgado. @1 " +
                            "<small>CYRYNOWICZ, R. Força e a pátria em ação. Revista de História da Biblioteca Nacional, n. 61, out. 2010 (adaptado).</small> @2 " +
                            "O movimento descrito no texto, surgido no Brasil após a Primeira Guerra, sofreu influência de grupos europeus que enfatizavam a ";
                    qA = "supremacia da raça ariana.  ";
                    qB = "legitimidade da livre.iniciativa.  ";
                    qC = "participação da classe operária.  ";
                    qD = "subordinação do indivíduo ao Estado. ";
                    break;

                case 45:
                    sourceString = "A discriminação com base em castas foi abolida pela Constituição promulgada na Índia depois da independência do Reino Unido, em 1947. Mas a instituição continua sólida e é um dos principais fatores da baixa mobilidade social do país. Vinculado ao hinduísmo, religião praticada por 85% dos indianos, o sistema de castas tem uma história de 3 000 anos e resiste às tentativas oficiais de extingui-lo. @1 " +
                            "<small>TREVISAN, C. Disponível em: www1.folha.uol.com.br. Acesso em: 26 ago. 2014.</small> @2 " +
                            "A reação social à legislação mencionada é um exemplo de ";
                    qA = "valorização da cultura estrangeira.  ";
                    qB = "manutenção das tradições ancestrais.  ";
                    qC = "emancipação das camadas populares.  ";
                    qD = "redução das desigualdades econômicas. ";
                    break;

                case 46:
                    sourceString = "Em consequência da divisão do trabalho, o mesmo número de pessoas é capaz de executar uma quantidade maior de trabalho. Isso ocorre por três motivos: primeiro, o aumento de destreza de cada um dos trabalhadores; segundo, a possibilidade de poupar o tempo que habitualmente se perdia ao passar de uma tarefa a outra; e, finalmente, a invenção de um grande número de máquinas que facilitam e reduzem o trabalho e tornam um só homem capaz de realizar o trabalho de muitos. @1 " +
                            "<small>SMITH, A. A riqueza das nações. Lisboa: Fundação Calouste Gulbenkian, 1981 (adaptado).</small> @2 " +
                            "Uma consequência econômica da situação descrita no texto foi a ";
                    qA = "diminuição dos custos produtivos.  ";
                    qB = "falência das grandes corporações.  ";
                    qC = "redução dos mercados consumidores. ";
                    qD = "decadência das instituições financeiras. ";
                    break;

                case 47:
                    sourceString = "@cimg ch570471 cimg@ @1 " +
                            "O Selo Procel Eletrobras de Economia de Energia, ou simplesmente Selo Procel, foi instituído por decreto presidencial em 8 de dezembro de 1993. @1 " +
                            "<small>Disponível em: www.eletrobras.com. Acesso em: 20 ago. 2014 (adaptado).</small> @2 " +
                            "A iniciativa apresentada está associada à preocupação contemporânea de garantir a ";
                    qA = "produção padronizada de bens industriais.  ";
                    qB = "prestação qualificada de serviços urbanos.  ";
                    qC = "utilização consciente dos recursos naturais. ";
                    qD = "dispersão espacial das unidades produtivas. ";
                    break;

                case 48:
                    sourceString = "O Sertão semiárido permanece uma peça.chave da identidade cultural e do regionalismo nordestino e, por essa razão, suas representações devem ser estudadas a fundo, sobretudo as dicotomias clássicas, como litoral <i>versus</i> interior, progresso e atraso, seca e irrigação. Parece problemático falar em \"Nordeste\", sendo preferível referirmo-nos a \"Nordestes\", bem como a \"Sertões\". @1 " +
                            "<small>IBGE. Atlas das representações literárias de regiões brasileiras. Rio de Janeiro: IBGE, 2009 (adaptado).</small> @2 " +
                            "A dificuldade da definição das identidades, apontada no texto, expressa a ";
                    qA = "diversidade de aspectos naturais e socioeconômicos.  ";
                    qB = "modificação de hábitos festivos e religiosos.  ";
                    qC = "atuação dos órgãos públicos e privados.  ";
                    qD = "fragilidade do turismo local e regional. ";
                    break;

                case 49:
                    sourceString = "O açúcar inventou uma paisagem originalíssima, marcada por canaviais e pelo famoso \"triângulo rural\", a casa.grande e a senzala, a capela e a fábrica, mas também depredou o meio físico, empobreceu o solo, poluiu as águas dos rios e devastou a Mata Atlântica. @1 " +
                            "<small>MELLO, E. C. Um imenso Portugal: história e historiografia. São Paulo: Editora 34, 2002 (adaptado).</small> @2 " +
                            "Uma técnica do modelo agrícola descrito que contribuiu para esses resultados ambientais foi ";
                    qA = "arar a terra.  ";
                    qB = "adubar a lavoura.  ";
                    qC = "irrigar a plantação.  ";
                    qD = "queimar a vegetação. ";
                    break;

                case 50:
                    sourceString = "Os produtores de algodão estão realizando o maior investimento da história. A nova colheitadeira substitui até duas colheitadeiras convencionais e poupa seis dos oito trabalhadores. @1 " +
                            "<small>Produtor de algodão investe em renovação de máquinas. Disponível em: www.valor.com.br. Acesso em: 7 set. 2013 (adaptado).</small> @2 " +
                            "As transformações nas relações de trabalho, nesse tipo de cultivo, devem-se à ";
                    qA = "escassez de mão de obra.  ";
                    qB = "abertura do comércio externo.  ";
                    qC = "mudança da técnica produtiva.  ";
                    qD = "agregação de valor de mercado. ";
                    break;

                case 51:
                    sourceString = "<b>TEXTO 1</b>@1 " +
                            "@cimg ch570511 cimg@ @1 " +
                            "<small>Disponível em: www.portobr.com. Acesso em: 6 ago. 2014.</small> @2 " +
                            "<b>TEXTO 2</b> @1 " +
                            "As vantagens da conteinerização são inúmeras: aumento da eficiência carga/descarga, maior controle da carga, menores índices de avaria e, consequentemente, maior rapidez na entrega. Com a padronização dos contêineres foi possível que o movimento de mercadorias pudesse ser realizado de ponto a ponto, utilizando mais de um meio de transporte. @1 " +
                            "<small>BERTOLANI, A. D.; LEME, F. L. Carregamento de contêineres em navios. Disponível em: www.mackenzie.br. Acesso em: 31 jul. 2014 (adaptado).</small> @2 " +
                            "Que consequência para a estrutura comercial a padronização apresentada promoveu? ";
                    qA = "Dinamização das atividades dos portos.  ";
                    qB = "Valorização dos produtos vendidos.  ";
                    qC = "Modificação das rotas marítimas.  ";
                    qD = "Redução de locais de armazenamento. ";
                    break;

                case 52:
                    sourceString = "<b>Asa branca</b> @2 " +
                            "Quando oiei a terra ardendo  @1 " +
                            "Quá fogueira de São João @1 " +
                            "Eu perguntei a Deus do céu, uai @1 " +
                            "Por que tamanha judiação @1 " +
                            "Que braseiro, que fornaia @1 " +
                            "Nem um pé de prantação @1 " +
                            "Pru farta d,água perdi meu gado @1 " +
                            "Morreu de sede meu alazão @1 " +
                            "Inté mesmo a asa branca @1 " +
                            "Bateu asas do sertão @1 " +
                            "Entonce eu disse adeus @1 " +
                            "Rosinha Guarda contigo meu coração @1 " +
                            "Hoje longe muitas léguas @1 " +
                            "Numa triste solidão @1 " +
                            "Espero a chuva cair de novo @1 " +
                            "Pra mim vortar pro meu sertão @1 " +
                            "Quando o verde dos teus oios @1 " +
                            "Se espalhar na prantação @1 " +
                            "Eu te asseguro não chore não, viu @1 " +
                            "Qui eu vortarei, viu @1 " +
                            "Meu coração @1 " +
                            "<small>GONZAGA, L.; TEIXEIRA, H. Asa branca toada. São Paulo: RCA Victor, 1947.</small> @2 " +
                            "Qual aspecto da identidade nordestina mais se destaca nessa canção gravada por Luiz Gonzaga? ";
                    qA = "A musicalidade, lembrada pelo ritmo sanfonado.  ";
                    qB = "A festividade, indicada pela lembrança da festa junina.  ";
                    qC = "A religiosidade, marcada pela busca da proteção divina.  ";
                    qD = "A oralidade, representada pela transcrição da fala sertaneja. ";
                    break;

                case 53:
                    sourceString = "<b>TEXTO 1</b> @1 " +
                            "No clã Rom, os casamentos têm festas que duram três dias e custam até R$ 140 mil. A família da noiva costuma oferecer um dote ao noivo. \"A tradição cigana é casamento, três dias de festa, 5 mil litros de chope, 20 carneiros no rolete, 16 porcos no rolete, festa grande mesmo\". @1 " +
                            "<small>JINKINGS, D.; CHAGAS, M. Casamento entre jovens ainda é tradição mantida por ciganos. Disponível em: http://memoria.ebc.com.br. Acesso em: 26 ago. 2014.</small> @2 " +
                            "<b>TEXTO 2</b> @1 " +
                            "Ao invés de jogar o buquê, a noiva peruana convida as solteiras para escolherem uma fitinha que fica presa no bolo do casamento. A ideia é que, antes dele ser cortado, cada mulher puxe um pedaço. A convidada que pegar a fitinha que está presa num anel de casamento será a próxima a se casar. @1 " +
                            "<small>GOMIERO, A. 10 diferentes tradições de casamento pelo mundo. Disponível em: http://mdemulher.abril.com.br. Acesso em: 27 ago. 2014.</small> @2 " +
                            "A comparação entre as situações descritas demonstra a ";
                    qA = "valorização de hábitos rurais.  ";
                    qB = "imposição de padrões morais.  ";
                    qC = "decadência de costumes ancestrais.  ";
                    qD = "predominância de práticas patriarcais. ";
                    break;

                case 54:
                    sourceString = "Nas primeiras eleições gerais em que está sendo aplicada, a Lei da Ficha Limpa já barrou grandes nomes da política brasileira, mas ainda é vista com ressalvas por setores do Poder Judiciário brasileiro. Os defensores falam de avanços e afirmam que a nova regra já está consolidada; os críticos dizem que a lei é cheia de brechas, com uma jurisprudência que ainda não é totalmente clara e passível de manipulação. Independentemente da divergência de opiniões, tanto críticos quanto defensores afirmam: a Lei da Ficha Limpa não substitui o papel do eleitor na hora de se escolher um candidato. @1 " +
                            "<small>LIMA, W. Lei da Ficha Limpa deu resultados, mas ainda é vista com ressalvas. Disponível em: http://ultimosegundo.ig.com.br. Acesso em: 21 set. 2014.</small> @2 " +
                            "A legislação abordada no texto impõe uma exigência ética ao impedir que os candidatos ";
                    qA = "utilizem palavras de baixo calão contra adversários de campanha.  ";
                    qB = "distribuam produtos ou brindes em período de campanha eleitoral.  ";
                    qC = "possuam condenação judicial determinada por tribunal colegiado.  ";
                    qD = "realizem campanha de rua antes do período determinado pela Justiça. ";
                    break;

                case 55:
                    sourceString = "O Japão produzia mais de 10 por cento da energia nuclear global, mas desativou temporariamente suas usinas depois do acidente de Fukushima, em março de 2011. O país se junta agora à Alemanha, Suíça e Bélgica como nações que decidiram eliminar suas usinas atômicas e investir mais em energias renováveis. Em Paris, o presidente da França, François Hollande, confirmou sua promessa de campanha de reduzir a energia nuclear de 75 para 50 por cento da matriz energética até 2025. @1 " +
                            "<small>Disponível em: http://exame.abril.com.br. Acesso em: 19 ago. 2014.</small> @2 " +
                            "A reportagem revela uma nova tendência estabelecida por alguns países que têm como objetivo ";
                    qA = "reestruturar os custos de produção.  ";
                    qB = "incentivar a concentração industrial.  ";
                    qC = "prevenir a ocorrência de acidentes.  ";
                    qD = "minimizar o desperdício de recursos. ";
                    break;

                case 56:
                    sourceString = "@cimg ch570561 cimg@ @1 " +
                            "<small>Diário da liberdade. Disponível em: www.diarioliberdade.org. Acesso em: 1 ago. 2014.</small> @2 " +
                            "@cimg ch570562 cimg@ @1 " +
                            "<small>Disponível em: www.dhlzf.com.br. Acesso em: 1 ago. 2014.</small> @2 " +
                            "Uma implicação socioespacial no campo, resultante da passagem do sistema 1 para o sistema 2, é a ";
                    qA = "redução do trabalho formal.  ";
                    qB = "intensificação do êxodo rural.  ";
                    qC = "diversificação da cultura alimentar.  ";
                    qD = "desconcentração da estrutura fundiária. ";
                    break;

                case 57:
                    sourceString = "O termo grilo, ou grilagem, tem sua origem na tentativa de transformar títulos falsificados, dando.lhes aparência de legais. O mecanismo utilizado, e que acabou denominando o processo de apropriação ilegal de terras públicas, era o de \"comprar\" dos cartórios ou de terceiros um falso título da terra e, para lhe dar uma certa aparência de autenticidade, o documento era colocado em uma gaveta com alguns grilos. Passado algum tempo, os grilos iriam alimentar.se das bordas da escritura e auxiliar na transformação do papel de cor branca para uma cor amarelada, ficando com um aspecto envelhecido. Assim, o título de propriedade da terra com esse novo visual daria maior credibilidade ao seu possuidor, que alegaria já ser proprietário daquela terra há algum tempo.@1 " +
                            "<small>A grilagem de terras públicas na Amazônia brasileira. Disponível em: www.mma.gov.br. Acesso em: 15 ago. 2014 (adaptado).</small> @2 " +
                            "Na região amazônica, uma consequência socioambiental da fraude descrita é o(a) ";
                    qA = "enfraquecimento da atividade agroindustrial.  ";
                    qB = "desestruturação das fronteiras nacionais.  ";
                    qC = "expansão da agricultura de subsistência.  ";
                    qD = "desmatamento da floresta nativa. ";
                    break;

                case 58:
                    sourceString = "A temática dos direitos da criança e do adolescente 2 a qual se inscreve na agenda dos Direitos Humanos 2 foi se consolidando e se renovando. É uma área que ainda exige esforços teóricos concentrados, à altura da grande rede de atores e processos envolvidos na implementação do Estatuto da Criança e do Adolescente (Lei n. 8.069/90), que, muito mais do que uma legislação, constitui uma política de aposta no presente e no futuro das crianças e dos adolescentes de todo o país. @1 " +
                            "<small>SALES, M. A. Metáforas da violência: adolescentes infratores sob a mira da mídia, da polícia e da política. In: FRANCISCO, E. M. V.; ALMEIDA, C. C. L. (Org.). Trabalho, território, cultura: novos prismas para o debate das políticas públicas. São Paulo: Cortez, 2007 (adaptado).</small> @2 " +
                            "No contexto do Brasil atual, dentre os desafios para a concretização dos direitos assegurados pela lei mencionada está a ";
                    qA = "erradicação do trabalho infantil.  ";
                    qB = "valorização da diversidade religiosa.  ";
                    qC = "divulgação de campanhas de vacinação.  ";
                    qD = "implementação do estímulo da natalidade. ";
                    break;

                case 59:
                    sourceString = "São Paulo é conhecida como a maior cidade italiana fora da Itália, a maior cidade japonesa fora do Japão, a maior cidade baiana ou mineira fora da Bahia ou de Minas. São Paulo registra as ruas dos Ingleses, Franceses, Italianos, Portugueses. Registra a estação Armênia, uma dentre outras tantas homenagens ao seu multiculturalismo. @1 " +
                            "<small>SPOSATI, A. Cidade em pedaços. São Paulo: Brasiliense, 2001.</small> @2 " +
                            "Qual a causa da multiplicidade cultural descrita no texto? ";
                    qA = "A revolução digital.  ";
                    qB = "O potencial turístico.  ";
                    qC = "A condição climática.  ";
                    qD = "O processo migratório. ";
                    break;

                case 60:
                    sourceString = "Muitos acordos foram negociados entre as nações do mundo para regulamentar a guerra, dentre os quais os mais importantes antes da Segunda Guerra Mundial foram os das Convenções de Haia de 1899 e 1907 e os das Convenções de Genebra em 1929. Esses acordos estavam baseados em dois princípios fundamentais: o da necessidade e o da humanidade. Sob o princípio da necessidade, tudo que pudesse ser feito para evitar o militarismo deveria ser feito. Sob o princípio da humanidade, tudo o que causasse sofrimento desnecessário seria proibido. @1 " +
                            "<small>NEIER, A. Guerra e crimes de guerra: uma breve história. In: BARTOV, O. (Org.). Crimes de guerra: culpa e negação no século XX. Rio de Janeiro: Difel, 2005 (adaptado).</small> @2 " +
                            "Um dos objetivos da realização das convenções descritas foi a ";
                    qA = "proteção das populações civis.  ";
                    qB = "segregação das minorias étnicas.  ";
                    qC = "reafirmação dos tratados bilaterais.  ";
                    qD = "destruição dos arsenais nucleares. ";
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