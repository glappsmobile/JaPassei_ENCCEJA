package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2014 {





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
            A,D,C,B,B,D,C,B,D,A,
            C,A,C,B,C,B,A,C,A,C,
            A,D,A,D,A,B,C,D,B,C,
    };

    String[] gabch = {
            C,A,D,B,A,C,D,C,A,A,
            B,C,C,C,B,C,A,D,D,B,
            D,B,C,D,B,D,A,D,B,C,
    };

    String[] gablc = {
            B,D,A,D,D,C,B,D,C,B,
            B,A,D,B,D,B,A,B,D,B,
            B,D,A,C,A,B,C,B,D,A,
    };

    String[] gabmt = {
            B,C,A,D,B,D,A,B,D,B,
            C,A,C,B,A,D,C,D,C,A,
            B,D,A,B,C,D,B,D,A,C,
    };

    // SIMULADO 1 - ENSINO FUNDAMENTAL

    public Prova2014(Context contexto, Simulado simulado) {
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

                    texto = "@b Tati, a garota b@ @2 "+
                            "Vendo que era mesmo impossível, Tati desistiu de pegar o raio de Sol estendido no chão. Os "+
                            "dedos feriam a terra inutilmente: o reflexo não tinha espessura.@1"+
                            "Seu capricho agora era com a água. Queria ver se retirava ao menos um pedacinho do tanque, "+
                            "mas o líquido suspenso em suas mãos vira uma coisa diferente que se desmancha logo, cintilando "+
                            "entre os dedinhos. E na superfície do tanque não ficava a menor cicatriz! "+
                            "É a primeira vez que Tati brinca na água com intenção de agarrá-la, de sentir-lhe o mistério.@1"+
                            "Fica tão absorta, que os apelos “Anda Tati! Larga isso, menina!”, que vêm da janela, nem chegam "+
                            "a serem ouvidos.@1"+
                            "Logo depois começa a ventar. Mas, com o vento era diferente: Tati já sabia que ele nunca "+
                            "se deixa agarrar nem ver, embora viva sempre em toda parte dando demonstrações de sua "+
                            "presença. Esse vento!...@1"+
                            "Antes de subir, joga água em si mesma, apressadamente borrifando-se no rosto e no vestido.@1"+
                            "Chegando a noite, Manuela atira-se à cama, sem responder a algumas perguntas que lhe faz a "+
                            "filha, sempre intrigada com a água. Debaixo das cobertas, Tati ainda balbucia os últimos pedidos:"+
                            "um carrinho e um patinho igual ao que viu nas mãos de outra criança.@1"+
                            "– Esse menino tinha patinho, não sabe, mamãe? Comia cada bombom que só você vendo!...@1"+
                            "O papel era uma beleza! Aqui, eu acho que todo mundo come muita bala, também...@1"+
                            "– Dorme, Tati.@1"+
                            "– Aqui é bom.@1"+
                            "– Dorme [...] "+
                            "@2<small>MACHADO, Aníbal. A morte da porta-estandarte; Tati, a garota e outras histórias. São Paulo: José Olympio, 1997. Fragmento. (P070109D3_SUP)</small> @2 ";


                            sourceString = texto+"Por suas características formais, é possível classificar esse fragmento de texto como ";
                    qA = "biografia. ";
                    qB = "conto. ";
                    qC = "crônica. ";
                    qD = "diário. ";
                    break;
                case 2:

                    texto = "@b Tati, a garota b@ @2 "+
                            "Vendo que era mesmo impossível, Tati desistiu de pegar o raio de Sol estendido no chão. Os "+
                            "dedos feriam a terra inutilmente: o reflexo não tinha espessura.@1"+
                            "Seu capricho agora era com a água. Queria ver se retirava ao menos um pedacinho do tanque, "+
                            "mas o líquido suspenso em suas mãos vira uma coisa diferente que se desmancha logo, cintilando "+
                            "entre os dedinhos. E na superfície do tanque não ficava a menor cicatriz! "+
                            "É a primeira vez que Tati brinca na água com intenção de agarrá-la, de sentir-lhe o mistério.@1"+
                            "Fica tão absorta, que os apelos “Anda Tati! Larga isso, menina!”, que vêm da janela, nem chegam "+
                            "a serem ouvidos.@1"+
                            "Logo depois começa a ventar. Mas, com o vento era diferente: Tati já sabia que ele nunca "+
                            "se deixa agarrar nem ver, embora viva sempre em toda parte dando demonstrações de sua "+
                            "presença. Esse vento!...@1"+
                            "Antes de subir, joga água em si mesma, apressadamente borrifando-se no rosto e no vestido.@1"+
                            "Chegando a noite, Manuela atira-se à cama, sem responder a algumas perguntas que lhe faz a "+
                            "filha, sempre intrigada com a água. Debaixo das cobertas, Tati ainda balbucia os últimos pedidos:"+
                            "um carrinho e um patinho igual ao que viu nas mãos de outra criança.@1"+
                            "– Esse menino tinha patinho, não sabe, mamãe? Comia cada bombom que só você vendo!...@1"+
                            "O papel era uma beleza! Aqui, eu acho que todo mundo come muita bala, também...@1"+
                            "– Dorme, Tati.@1"+
                            "– Aqui é bom.@1"+
                            "– Dorme [...] "+
                            "@2<small>MACHADO, Aníbal. A morte da porta-estandarte; Tati, a garota e outras histórias. São Paulo: José Olympio, 1997. Fragmento. (P070109D3_SUP)</small> @2 ";


                    sourceString = texto+"O desfecho dessa narrativa ocorre quando ";
                    qA = "a menina desiste de pegar o raio de Sol. ";
                    qB = "a menina quer agarrar a água do tanque. ";
                    qC = "Manuela deita na cama sem responder à filha. ";
                    qD = "Manuela insiste para a filha dormir. ";
                    break;
                case 3:

                    texto = "@b Tati, a garota b@ @2 "+
                            "Vendo que era mesmo impossível, Tati desistiu de pegar o raio de Sol estendido no chão. Os "+
                            "dedos feriam a terra inutilmente: o reflexo não tinha espessura.@1"+
                            "Seu capricho agora era com a água. Queria ver se retirava ao menos um pedacinho do tanque, "+
                            "mas o líquido suspenso em suas mãos vira uma coisa diferente que se desmancha logo, cintilando "+
                            "entre os dedinhos. E na superfície do tanque não ficava a menor cicatriz! "+
                            "É a primeira vez que Tati brinca na água com intenção de agarrá-la, de sentir-lhe o mistério.@1"+
                            "Fica tão absorta, que os apelos “Anda Tati! Larga isso, menina!”, que vêm da janela, nem chegam "+
                            "a serem ouvidos.@1"+
                            "Logo depois começa a ventar. Mas, com o vento era diferente: Tati já sabia que ele nunca "+
                            "se deixa agarrar nem ver, embora viva sempre em toda parte dando demonstrações de sua "+
                            "presença. Esse vento!...@1"+
                            "Antes de subir, joga água em si mesma, apressadamente borrifando-se no rosto e no vestido.@1"+
                            "Chegando a noite, Manuela atira-se à cama, sem responder a algumas perguntas que lhe faz a "+
                            "filha, sempre intrigada com a água. Debaixo das cobertas, Tati ainda balbucia os últimos pedidos:"+
                            "um carrinho e um patinho igual ao que viu nas mãos de outra criança.@1"+
                            "– Esse menino tinha patinho, não sabe, mamãe? Comia cada bombom que só você vendo!...@1"+
                            "O papel era uma beleza! Aqui, eu acho que todo mundo come muita bala, também...@1"+
                            "– Dorme, Tati.@1"+
                            "– Aqui é bom.@1"+
                            "– Dorme [...] "+
                            "@2<small>MACHADO, Aníbal. A morte da porta-estandarte; Tati, a garota e outras histórias. São Paulo: José Olympio, 1997. Fragmento. (P070109D3_SUP)</small> @2 ";


                    sourceString = texto+"Com base nesse texto, constata-se que Tati, em relação à impossibilidade de agarrar o vento, sentia-se ";
                    qA = "conformada. ";
                    qB = "decepcionada. ";
                    qC = "indiferente. ";
                    qD = "surpresa. ";
                    break;
                case 4:

                    texto = "@b Tati, a garota b@ @2 "+
                            "Vendo que era mesmo impossível, Tati desistiu de pegar o raio de Sol estendido no chão. Os "+
                            "dedos feriam a terra inutilmente: o reflexo não tinha espessura.@1"+
                            "Seu capricho agora era com a água. Queria ver se retirava ao menos um pedacinho do tanque, "+
                            "mas o líquido suspenso em suas mãos vira uma coisa diferente que se desmancha logo, cintilando "+
                            "entre os dedinhos. E na superfície do tanque não ficava a menor cicatriz! "+
                            "É a primeira vez que Tati brinca na água com intenção de agarrá-la, de sentir-lhe o mistério.@1"+
                            "Fica tão absorta, que os apelos “Anda Tati! Larga isso, menina!”, que vêm da janela, nem chegam "+
                            "a serem ouvidos.@1"+
                            "Logo depois começa a ventar. Mas, com o vento era diferente: Tati já sabia que ele nunca "+
                            "se deixa agarrar nem ver, embora viva sempre em toda parte dando demonstrações de sua "+
                            "presença. Esse vento!...@1"+
                            "Antes de subir, joga água em si mesma, apressadamente borrifando-se no rosto e no vestido.@1"+
                            "Chegando a noite, Manuela atira-se à cama, sem responder a algumas perguntas que lhe faz a "+
                            "filha, sempre intrigada com a água. Debaixo das cobertas, Tati ainda balbucia os últimos pedidos:"+
                            "um carrinho e um patinho igual ao que viu nas mãos de outra criança.@1"+
                            "– Esse menino tinha patinho, não sabe, mamãe? Comia cada bombom que só você vendo!...@1"+
                            "O papel era uma beleza! Aqui, eu acho que todo mundo come muita bala, também...@1"+
                            "– Dorme, Tati.@1"+
                            "– Aqui é bom.@1"+
                            "– Dorme [...] "+
                            "@2<small>MACHADO, Aníbal. A morte da porta-estandarte; Tati, a garota e outras histórias. São Paulo: José Olympio, 1997. Fragmento. (P070109D3_SUP)</small> @2 ";


                    sourceString = texto+"No trecho “Tati já sabia que ele nunca se deixa agarrar...”, o termo em destaque refere-se à palavra ";
                    qA = "Sol. ";
                    qB = "reflexo. ";
                    qC = "tanque. ";
                    qD = "vento. ";
                    break;
                case 5:

                    texto = "@b Tati, a garota b@ @2 "+
                            "Vendo que era mesmo impossível, Tati desistiu de pegar o raio de Sol estendido no chão. Os "+
                            "dedos feriam a terra inutilmente: o reflexo não tinha espessura.@1"+
                            "Seu capricho agora era com a água. Queria ver se retirava ao menos um pedacinho do tanque, "+
                            "mas o líquido suspenso em suas mãos vira uma coisa diferente que se desmancha logo, cintilando "+
                            "entre os dedinhos. E na superfície do tanque não ficava a menor cicatriz! "+
                            "É a primeira vez que Tati brinca na água com intenção de agarrá-la, de sentir-lhe o mistério.@1"+
                            "Fica tão absorta, que os apelos “Anda Tati! Larga isso, menina!”, que vêm da janela, nem chegam "+
                            "a serem ouvidos.@1"+
                            "Logo depois começa a ventar. Mas, com o vento era diferente: Tati já sabia que ele nunca "+
                            "se deixa agarrar nem ver, embora viva sempre em toda parte dando demonstrações de sua "+
                            "presença. Esse vento!...@1"+
                            "Antes de subir, joga água em si mesma, apressadamente borrifando-se no rosto e no vestido.@1"+
                            "Chegando a noite, Manuela atira-se à cama, sem responder a algumas perguntas que lhe faz a "+
                            "filha, sempre intrigada com a água. Debaixo das cobertas, Tati ainda balbucia os últimos pedidos:"+
                            "um carrinho e um patinho igual ao que viu nas mãos de outra criança.@1"+
                            "– Esse menino tinha patinho, não sabe, mamãe? Comia cada bombom que só você vendo!...@1"+
                            "O papel era uma beleza! Aqui, eu acho que todo mundo come muita bala, também...@1"+
                            "– Dorme, Tati.@1"+
                            "– Aqui é bom.@1"+
                            "– Dorme [...] "+
                            "@2<small>MACHADO, Aníbal. A morte da porta-estandarte; Tati, a garota e outras histórias. São Paulo: José Olympio, 1997. Fragmento. (P070109D3_SUP)</small> @2 ";


                    sourceString = texto+"No trecho “... cintilando entre os dedinhos.”, o uso do diminutivo na palavra em destaque indica ";
                    qA = "crítica. ";
                    qB = "deboche. ";
                    qC = "exagero. ";
                    qD = "tamanho. ";
                    break;


                case 6:
                    texto = "@b Os livros daqui e os d’além-mar b@ @2"+
                            "Enquanto cai o consumo de livros em Portugal, cresce o mercado brasileiro "+
                            "Reflexo da crise europeia ou do momento econômico que o Brasil atravessa? Ou ambos? Embora "+
                            "especialistas não sejam categóricos em explicar os motivos das oscilações no mercado livreiro "+
                            "mundial, no final de 2011, os brasileiros gastaram R$7,18 bilhões comprando livros e publicações, "+
                            "segundo o Ibope. Ao passo que em Portugal, durante o primeiro semestre de 2011, os portugueses "+
                            "compraram menos livros do que no mesmo período em 2010. A queda no consumo de livros por "+
                            "parte dos portugueses foi de 3%, um declínio bem menor do que houve em outras áreas, [...]. Até "+
                            "junho de 2011, os portugueses gastaram 168 milhões e, em 2008, 156 milhões. Todavia, esses "+
                            "números são inconclusivos. A diferença de critérios entre as pesquisas daqui e d’além-mar não "+
                            "permite tirar muitas conclusões sobre a dinâmica desses mercados. Ainda assim, tais discrepâncias "+
                            "estatísticas espelham o momento que estão atravessando as economias desses países, e indicam "+
                            "mudanças no tocante ao consumo de bens culturais.@2"+
                            "Língua Portuguesa, ano 7, n. 75, jan. 2012, p. 8. Fragmento.@2";
                    sourceString = texto+"Qual é o assunto desse texto? ";
                    qA = "A crise no mercado livreiro mundial. ";
                    qB = "A diferença entre o leitor brasileiro e o europeu. ";
                    qC = "A oscilação no mercado livreiro mundial. ";
                    qD = "A queda do número de leitores no mundo. ";
                    break;
                case 7:

                    texto = "@b Os livros daqui e os d’além-mar b@ @2"+
                            "Enquanto cai o consumo de livros em Portugal, cresce o mercado brasileiro "+
                            "Reflexo da crise europeia ou do momento econômico que o Brasil atravessa? Ou ambos? Embora "+
                            "especialistas não sejam categóricos em explicar os motivos das oscilações no mercado livreiro "+
                            "mundial, no final de 2011, os brasileiros gastaram R$7,18 bilhões comprando livros e publicações, "+
                            "segundo o Ibope. Ao passo que em Portugal, durante o primeiro semestre de 2011, os portugueses "+
                            "compraram menos livros do que no mesmo período em 2010. A queda no consumo de livros por "+
                            "parte dos portugueses foi de 3%, um declínio bem menor do que houve em outras áreas, [...]. Até "+
                            "junho de 2011, os portugueses gastaram 168 milhões e, em 2008, 156 milhões. Todavia, esses "+
                            "números são inconclusivos. A diferença de critérios entre as pesquisas daqui e d’além-mar não "+
                            "permite tirar muitas conclusões sobre a dinâmica desses mercados. Ainda assim, tais discrepâncias "+
                            "estatísticas espelham o momento que estão atravessando as economias desses países, e indicam "+
                            "mudanças no tocante ao consumo de bens culturais.@2"+
                            "Língua Portuguesa, ano 7, n. 75, jan. 2012, p. 8. Fragmento.@2";
                    sourceString = texto+"Nesse texto, predomina uma estrutura textual ";
                    qA = "descritiva. ";
                    qB = "informativa. ";
                    qC = "instrucional. ";
                    qD = "narrativa. ";
                    break;

                case 8:
                    texto = "@cimg lc530081 cimg@" +
                            "@1 A Gazeta, Vitória, 15 abr. 2011, p.4. (P090310D3_SUP) @2";
                    sourceString = texto+"Nesse texto, a atitude da personagem zero sugere que ele é ";
                    qA = "amigo. ";
                    qB = "distraído. ";
                    qC = "educado. ";
                    qD = "esperto. ";
                    break;
                case 9:

                    texto = "@cimg lc530081 cimg@" +
                            "@1 A Gazeta, Vitória, 15 abr. 2011, p.4. (P090310D3_SUP) @2";
                    sourceString = texto+"Infere-se desse texto que o sargento é ";
                    qA = "compreensivo. ";
                    qB = "distraído. ";
                    qC = "guloso. ";
                    qD = "obediente. ";
                    break;
                case 10:

                    texto = "@cimg lc530081 cimg@" +
                            "@1 A Gazeta, Vitória, 15 abr. 2011, p.4. (P090310D3_SUP) @2";
                    sourceString = texto+"O efeito de humor desse texto está na ";
                    qA = "expressão de raiva do sargento no primeiro quadrinho. ";
                    qB = "forma encontrada por zero para despistar o sargento. ";
                    qC = "pergunta do soldado ao Zero no último quadrinho. ";
                    qD = "expressão dispersa do sargento a caminho do refeitório. ";
                    break;


                case 11:
                    texto =  "@b A satisfação de ganhar presentes b@ @2"+
                            "O anseio de receber é construído no cérebro graças à liberação dos “hormônios da expectativa” "+
                            "Se doar é bom, receber é ótimo. Ao ganharmos um presente que corresponde às nossas "+
                            "expectativas, sentimos uma onda de bem-estar. Essa sensação é resultado da ação de um "+
                            "conjunto de neurônios especializados na percepção do prazer. Surgidos ao longo da evolução, eles "+
                            "cumprem uma função crucial: a manutenção da vida. Os sistemas cerebrais que mais influenciam "+
                            "o comportamento são os que nos levam a satisfazer as necessidades vitais (comer, beber, "+
                            "reproduzir-se e proteger-se). O prazer é o meio empregado pela evolução para que essas funções "+
                            "sejam asseguradas. Para favorecê-la foi desenvolvido o sistema neuronal da recompensa. [...] "+
                            "@2<small>Disponível em: http://www2.uol.com.br/. Acesso em: 1 mar. 2012. Fragmento. (P0903SU12.1_SUP)</small> @2 ";
                    sourceString = texto+"No trecho “Surgidos ao longo da evolução, eles cumprem uma função crucial:...”, os dois pontos foram "+
                            "usados para ";
                    qA = "acrescentar uma opinião. ";
                    qB = "apresentar uma explicação. ";
                    qC = "comentar uma informação. ";
                    qD = "introduzir uma suposição. ";
                    break;
                case 12:

                    texto =  "@b A satisfação de ganhar presentes b@ @2"+
                            "O anseio de receber é construído no cérebro graças à liberação dos “hormônios da expectativa” "+
                            "Se doar é bom, receber é ótimo. Ao ganharmos um presente que corresponde às nossas "+
                            "expectativas, sentimos uma onda de bem-estar. Essa sensação é resultado da ação de um "+
                            "conjunto de neurônios especializados na percepção do prazer. Surgidos ao longo da evolução, eles "+
                            "cumprem uma função crucial: a manutenção da vida. Os sistemas cerebrais que mais influenciam "+
                            "o comportamento são os que nos levam a satisfazer as necessidades vitais (comer, beber, "+
                            "reproduzir-se e proteger-se). O prazer é o meio empregado pela evolução para que essas funções "+
                            "sejam asseguradas. Para favorecê-la foi desenvolvido o sistema neuronal da recompensa. [...] "+
                            "@2<small>Disponível em: http://www2.uol.com.br/. Acesso em: 1 mar. 2012. Fragmento. (P0903SU12.1_SUP)</small> @2 ";
                    sourceString = texto+"Nesse texto, o título e o subtítulo ";
                    qA = "antecipam o assunto que será tratado no texto. ";
                    qB = "criam suspense em relação ao que será abordado. ";
                    qC = "expressam de modo crítico o assunto em questão. ";
                    qD = "manifestam uma opinião sobre o assunto do texto. ";
                    break;


                case 13:
                    texto = "@b Confidências do itabirano b@ @2"+
                            "Alguns anos vivi em Itabira.@1"+
                            "Principalmente nasci em Itabira.@1"+
                            "Por isso sou triste, orgulhoso: de ferro.@1"+
                            "Noventa por cento de ferro nas calçadas.@1"+
                            "Oitenta por cento de ferro nas almas.@1"+
                            "E esse alheamento do que na vida é porosidade e comunicação.@1"+
                            "A vontade de amar, que me paralisa o trabalho, @1"+
                            "vem de Itabira, de suas noites brancas, sem mulheres e sem horizontes.@1"+
                            "E o hábito de sofrer, que tanto me diverte,@1 "+
                            "é doce herança itabirana.@1"+
                            "De Itabira trouxe prendas diversas que ora te ofereço:@1"+
                            "este São Benedito do velho santeiro Alfredo Duval; @1"+
                            "este couro de anta, estendido no sofá da sala de visitas; @1"+
                            "este orgulho, esta cabeça baixa...@1"+
                            "Tive ouro, tive gado, tive fazendas.@1"+
                            "Hoje sou funcionário público.@1"+
                            "Itabira é apenas uma fotografia na parede.@1"+
                            "Mas como dói! "+
                            "@2<small>ANDRADE, Carlos Drummond de. Disponível em: http://www.nossosaopaulo.com.br/Reg_SP/Amar_Instruir/Ainst_MensOut2006.htm. Acesso em: 21 maio 2012. (P090443D3_SUP)</small> @2 ";
                    sourceString = texto+"Em relação à cidade de Itabira, o eu lírico expressa um sentimento de ";
                    qA = "amor. ";
                    qB = "desespero. ";
                    qC = "indiferença. ";
                    qD = "saudade. ";
                    break;
                case 14:

                    texto = "@b Confidências do itabirano b@ @2"+
                            "Alguns anos vivi em Itabira.@1"+
                            "Principalmente nasci em Itabira.@1"+
                            "Por isso sou triste, orgulhoso: de ferro.@1"+
                            "Noventa por cento de ferro nas calçadas.@1"+
                            "Oitenta por cento de ferro nas almas.@1"+
                            "E esse alheamento do que na vida é porosidade e comunicação.@2"+
                            "A vontade de amar, que me paralisa o trabalho, @1"+
                            "vem de Itabira, de suas noites brancas, sem mulheres e sem horizontes.@1"+
                            "E o hábito de sofrer, que tanto me diverte,@1 "+
                            "é doce herança itabirana.@2"+
                            "De Itabira trouxe prendas diversas que ora te ofereço:@1"+
                            "este São Benedito do velho santeiro Alfredo Duval; @1"+
                            "este couro de anta, estendido no sofá da sala de visitas; @1"+
                            "este orgulho, esta cabeça baixa...@2"+
                            "Tive ouro, tive gado, tive fazendas.@1"+
                            "Hoje sou funcionário público.@1"+
                            "Itabira é apenas uma fotografia na parede.@1"+
                            "Mas como dói! "+
                            "@2<small>ANDRADE, Carlos Drummond de. Disponível em: http://www.nossosaopaulo.com.br/Reg_SP/Amar_Instruir/Ainst_MensOut2006.htm. Acesso em: 21 maio 2012. (P090443D3_SUP)</small> @2 ";
                    sourceString = texto+"Nesse texto, destaca-se um conflito do eu lírico entre ";
                    qA = "a foto na parede e suas lembranças de Itabira. ";
                    qB = "a pobreza do presente e a grandeza do passado. ";
                    qC = "o amor e a paralisia do trabalho. ";
                    qD = "o ferro das calçadas e o das almas. ";
                    break;

                case 15:
                    texto = "@cimg lc530151 cimg@ @1"+
                            "A Tribuna,17 jun. 2011. @2";
                    sourceString = texto+"O que torna esse texto engraçado é ";
                    qA = "a forma afetuosa como o garoto é chamado. ";
                    qB = "a intenção do garoto de romper o namoro. ";
                    qC = "o garoto querer evitar a choradeira da namorada. ";
                    qD = "o modo encontrado pelo garoto para terminar o namoro. ";
                    break;
                case 16:

                    texto = "@cimg lc530151 cimg@ @1"+
                            "A Tribuna,17 jun. 2011. @2";
                    sourceString = texto+"No segundo quadrinho, a palavra “choradeira” indica ";
                    qA = "carinho. ";
                    qB = "deboche. ";
                    qC = "desprezo. ";
                    qD = "sentimentalismo. ";
                    break;



                case 17:
                    texto = "@b Se o pelo esquenta, por que o árabe é peludo e esquimó, pelado? b@ @2"+
                            "O que define a presença de maior ou menor quantidade de pelos não é apenas a temperatura "+
                            "do lugar onde o povo mora. No caso de povos do Oriente Médio, a grande amplitude térmica e "+
                            "a incidência solar são as prováveis razões para terem pelos no corpo. No inverno e à noite, eles "+
                            "retêm o calor do corpo, mas, sob o Sol, agem como proteção contra queimaduras. Senão seria "+
                            "como a marchinha: “o Sol estava quente e queimou a nossa cara”.@1"+
                            "Já os esquimós têm pouco pelo, provavelmente, por causa da migração do homem da Ásia "+
                            "para as Américas, entre 20 mil e 35 mil anos atrás. Os povos que atravessaram o estreito de "+
                            "Bering tinham poucos pelos, mas dominavam técnicas para manter-se aquecidos, como o uso "+
                            "de peles de animais. Ou seja, a adaptação cultural permitiu que vivessem em um ambiente frio "+
                            "mesmo que algumas características fossem propícias a climas mais mornos. Eles continuaram "+
                            "descendo as Américas até chegarem ao atual Brasil, com nossos índios de poucos pelos.@2"+
                            "Superinteressante, Edição especial, jan. 2012, p. 12. (P0905SU12.1_SUP) @2 ";
                    sourceString = texto+"Esse texto serve para ";
                    qA = "dar uma informação. ";
                    qB = "fazer uma reflexão. ";
                    qC = "justificar um acontecimento. ";
                    qD = "manifestar uma opinião. ";
                    break;
                case 18:

                    texto = "@b Se o pelo esquenta, por que o árabe é peludo e esquimó, pelado? b@ @2"+
                            "O que define a presença de maior ou menor quantidade de pelos não é apenas a temperatura "+
                            "do lugar onde o povo mora. No caso de povos do Oriente Médio, a grande amplitude térmica e "+
                            "a incidência solar são as prováveis razões para terem pelos no corpo. No inverno e à noite, eles "+
                            "retêm o calor do corpo, mas, sob o Sol, agem como proteção contra queimaduras. Senão seria "+
                            "como a marchinha: “o Sol estava quente e queimou a nossa cara”.@1"+
                            "Já os esquimós têm pouco pelo, provavelmente, por causa da migração do homem da Ásia "+
                            "para as Américas, entre 20 mil e 35 mil anos atrás. Os povos que atravessaram o estreito de "+
                            "Bering tinham poucos pelos, mas dominavam técnicas para manter-se aquecidos, como o uso "+
                            "de peles de animais. Ou seja, a adaptação cultural permitiu que vivessem em um ambiente frio "+
                            "mesmo que algumas características fossem propícias a climas mais mornos. Eles continuaram "+
                            "descendo as Américas até chegarem ao atual Brasil, com nossos índios de poucos pelos.@2"+
                            "Superinteressante, Edição especial, jan. 2012, p. 12. (P0905SU12.1_SUP) @2 ";
                    sourceString = texto+"No trecho “... mesmo que algumas características fossem propícias a climas mais mornos.”, a expressão "+
                            "em destaque introduz uma ";
                    qA = "comparação. ";
                    qB = "concessão. ";
                    qC = "explicação. ";
                    qD = "finalidade. ";
                    break;
                case 19:

                    texto = "@b Se o pelo esquenta, por que o árabe é peludo e esquimó, pelado? b@ @2"+
                            "O que define a presença de maior ou menor quantidade de pelos não é apenas a temperatura "+
                            "do lugar onde o povo mora. No caso de povos do Oriente Médio, a grande amplitude térmica e "+
                            "a incidência solar são as prováveis razões para terem pelos no corpo. No inverno e à noite, eles "+
                            "retêm o calor do corpo, mas, sob o Sol, agem como proteção contra queimaduras. Senão seria "+
                            "como a marchinha: “o Sol estava quente e queimou a nossa cara”.@1"+
                            "Já os esquimós têm pouco pelo, provavelmente, por causa da migração do homem da Ásia "+
                            "para as Américas, entre 20 mil e 35 mil anos atrás. Os povos que atravessaram o estreito de "+
                            "Bering tinham poucos pelos, mas dominavam técnicas para manter-se aquecidos, como o uso "+
                            "de peles de animais. Ou seja, a adaptação cultural permitiu que vivessem em um ambiente frio "+
                            "mesmo que algumas características fossem propícias a climas mais mornos. Eles continuaram "+
                            "descendo as Américas até chegarem ao atual Brasil, com nossos índios de poucos pelos.@2"+
                            "Superinteressante, Edição especial, jan. 2012, p. 12. (P0905SU12.1_SUP) @2 ";
                    sourceString = texto+"A segunda vírgula que aparece no título desse texto foi usada para ";
                    qA = "enfatizar o termo seguinte. ";
                    qB = "gerar um suspense no leitor. ";
                    qC = "introduzir uma explicação. ";
                    qD = "marcar a omissão de um termo. ";
                    break;
                case 20:

                    texto = "@b Se o pelo esquenta, por que o árabe é peludo e esquimó, pelado? b@ @2"+
                            "O que define a presença de maior ou menor quantidade de pelos não é apenas a temperatura "+
                            "do lugar onde o povo mora. No caso de povos do Oriente Médio, a grande amplitude térmica e "+
                            "a incidência solar são as prováveis razões para terem pelos no corpo. No inverno e à noite, eles "+
                            "retêm o calor do corpo, mas, sob o Sol, agem como proteção contra queimaduras. Senão seria "+
                            "como a marchinha: “o Sol estava quente e queimou a nossa cara”.@1"+
                            "Já os esquimós têm pouco pelo, provavelmente, por causa da migração do homem da Ásia "+
                            "para as Américas, entre 20 mil e 35 mil anos atrás. Os povos que atravessaram o estreito de "+
                            "Bering tinham poucos pelos, mas dominavam técnicas para manter-se aquecidos, como o uso "+
                            "de peles de animais. Ou seja, a adaptação cultural permitiu que vivessem em um ambiente frio "+
                            "mesmo que algumas características fossem propícias a climas mais mornos. Eles continuaram "+
                            "descendo as Américas até chegarem ao atual Brasil, com nossos índios de poucos pelos.@2"+
                            "Superinteressante, Edição especial, jan. 2012, p. 12. (P0905SU12.1_SUP) @2 ";
                    sourceString = texto+"O trecho desse texto que apresenta uma marca de informalidade é: ";
                    qA = "“No inverno e à noite...”. ";
                    qB = "“... queimou a nossa cara.”. ";
                    qC = "“... a adaptação cultural permitiu...”. ";
                    qD = "“... com nossos índios de poucos pelos.”. ";
                    break;

                case 21:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] projetado por Oscar Niemeyer (1907) entre 1942 e 1944, surge de uma encomenda [...] "+
                            "para a construção de uma série de edifícios em torno do lago artificial [...]. A obra prevê cinco "+
                            "edifícios: um cassino, um clube de elite, um salão de danças popular, uma igreja e um hotel, "+
                            "que não foi realizado. [...] Para a execução da obra, Niemeyer conta com a colaboração do "+
                            "engenheiro de estruturas, e também poeta, Joaquim Cardoso (1897–1978) e do paisagista Burle "+
                            "Marx (1909–1994). A obra é projetada por Niemeyer como um conjunto, mas onde cada elemento "+
                            "é visto como uma forma independente e autônoma. Além disso, os edifícios são pensados em "+
                            "estreita relação com o entorno, que fornece a moldura natural e a inspiração para os desenhos "+
                            "e plantas. [...] "+
                            "@2<small>Disponível em: http://www.itaucultural.org.br/aplicexternas/enciclopedia_ic/index.cfm?fuseaction=marcos_texto&cd_verbete=4268. Acesso em: 16 mar. 2012. Fragmento. (A0901SU12.1_SUP)</small> @2 "+
                            "Esse texto refere-se ao Conjunto Arquitetônico ";
                    qA = "da Lapa, no Rio de Janeiro. ";
                    qB = "da Pampulha, em Belo Horizonte. ";
                    qC = "do Parque do Ibirapuera, em São Paulo. ";
                    qD = "do Santuário do Bom Jesus de Matosinhos, em Congonhas. ";
                    break;
                case 22:

                    sourceString = "Observe a imagem abaixo que reproduz a obra Retirantes, de Candido Portinari.@2 " +
                            "@cimg lc530221 cimg@"+
                            "@1<small>Disponível em: http://www.proa.org/exhibiciones/pasadas/portinari/salas/id_portinari_retirantes.jpg. Acesso em: 8 mar. 2012. (A0902SU12.1_SUP)</small> @2 "+
                            "As figuras humanas ilustradas por Portinari fazem uma denúncia sobre a ";
                    qA = "corrupção no meio político. ";
                    qB = "degradação do meio ambiente. ";
                    qC = "individualidade do ser humano. ";
                    qD = "miséria provocada pela seca. ";
                    break;
                case 23:

                    sourceString = "A ginástica é um conceito que engloba modalidades competitivas e não competitivas. Além disso, envolve "+
                            "a prática de uma série de movimentos exigentes de força, flexibilidade e coordenação motora para fins "+
                            "únicos de aperfeiçoamento físico e mental, sendo dividida em cinco campos de atuação e desenvolvimento.@1"+
                            "Associe as duas colunas, relacionando os campos de atuação da ginástica às suas respectivas características.@1"+
                            "Campos de atuação: Características:@2"+
                            "1. Condicionamento físico.@1"+
                            "2. Competição.@1"+
                            "3. Fisioterapêutica.@1"+
                            "4. Demonstração.@1"+
                            "5. Conscientização corporal.@2"+
                            "( ) Reúne todas as modalidades abarcadas pela Federação "+
                            "Internacional de Ginástica.@1"+
                            "( ) Abarca todas aquelas práticas responsáveis pela "+
                            "utilização do exercício físico na prevenção ou tratamento "+
                            "de doenças e reabilitação de acidentados.@1"+
                            "( ) Tem como principal função a interação social e o "+
                            "compartilhamento do aprendizado e da evolução gímnica.@1"+
                            "( ) Utiliza, principalmente, exercícios aeróbicos (esteira, "+
                            "bicicleta ergométrica, dentre outros) visando ao "+
                            "aprimoramento cardíaco e pulmonar do atleta.@1"+
                            "( ) Reúne novas propostas de abordagem do corpo na "+
                            "busca de soluções para problemas físicos e posturais.@1"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "2, 3, 4, 1, 5. ";
                    qB = "3, 2, 4, 5, 1. ";
                    qC = "4, 1, 5, 2, 3. ";
                    qD = "5, 1, 4, 3, 2. ";
                    break;
                case 24:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] é uma modalidade desportiva criada pelo alemão Karl Schelenz, em 1919 — embora se "+
                            "baseasse em outros desportos praticados desde fins do século XIX, na Europa Setentrional e no "+
                            "Uruguai. O jogo, inicialmente, era praticado na relva em um campo similar ao do futebol [...] e era "+
                            "disputado por duas equipes de onze jogadores cada, sendo a bola semelhante à usada na versão "+
                            "de sete jogadores. [...] ao contrário do futebol, um jogador destro prefere jogar pela esquerda, "+
                            "e um jogador canhoto prefere atuar pela direita. Esta preferência deve-se ao fato do braço de "+
                            "arremesso ficar no lado de dentro da baliza, e por isso com maior ângulo para o remate à baliza.@1"+
                            "Os atletas utilizam uma cola especial [...] nas mãos para ter um contato mais firme com a bola. É "+
                            "por isso que as bolas [...] parecem sempre sujas.@1"+
                            "@1<small>Disponível em: http://pt.wikipedia.org/wiki/. Acesso em: 16 mar. 2012. Fragmento. *Adaptado: Reforma Ortográfica.</small> @2 "+
                            "Qual é a modalidade esportiva definida por esse texto? ";
                    qA = "Basquetebol. ";
                    qB = "Bocha. ";
                    qC = "Handebol. ";
                    qD = "Queimada. ";
                    break;


                case 25:
                    texto = "@b Text 1 b@ @2"+
                            "@b LONDON 2012 PARALYMPIC GAMES b@@2 "+

                            "The London 2012 Organising Committee "+
                            "has confirmed that Her Majesty The Queen, "+
                            "accompanied by His Royal Highness The "+
                            "Duke of Edinburgh, will open the Paralympic "+
                            "Games in the Olympic Stadium on 29 August.@1"+
                            "As Head of State, The Queen will proclaim the "+
                            "Paralympic Games open by saying: ‘I declare "+
                            "open theLondon 2012 Paralympic Games’.@2"+

                            "<small>Available at: http://www.london2012.com/news/2012/02/ "+
                            "london-2012-paralympic-games-to-be-opened-by-the-queen."+
                            "php. Access on: March 1st, 2012. Adapted. </small> @1"+

                            "@b Text 2 b@ @2"+
                            "@b OLYMPIC GAMES b@ @2 "+
                            "The Olympic Games is a major international "+
                            "event in which thousands of athletes participate "+
                            "in a variety of competitions. More than 200 "+
                            "nations of the world participate. The Games are "+
                            "currently held every two years, with Summer "+
                            "and Winter Olympic Games alternating.@1"+
                            "Originally, the ancient Olympic Games were "+
                            "held in Olympia, Greece, from the 8th century "+
                            "BC to the 4th century A.D. @2"+
                            "<small>Available at: http://en.wikipedia.org/wiki/Olympic_Games.@1"+
                            "Access on: March 13 th, 2012. Adapted. </small> @2";

                    sourceString = texto+"Write True (T) or False (F):@2"+
                            "( ) The Duke of Edinburgh will open the Paralympic games alone.@1"+
                            "( ) The Queen is not the Head of State.@1"+
                            "( ) There are more than 200 nations participating in the Olympic Games.@1"+
                            "( ) There are thousands of athletes taking part in the Olympic Games.@1"+
                            "@1The correct sequence is ";
                    qA = "F, F, T, T. ";
                    qB = "F, T, T, F. ";
                    qC = "T, T, F, F. ";
                    qD = "T, F, F, T. ";
                    break;
                case 26:

                    texto = "@b Text 1 b@ @2"+
                            "@b LONDON 2012 PARALYMPIC GAMES b@@2 "+

                            "The London 2012 Organising Committee "+
                            "has confirmed that Her Majesty The Queen, "+
                            "accompanied by His Royal Highness The "+
                            "Duke of Edinburgh, will open the Paralympic "+
                            "Games in the Olympic Stadium on 29 August.@1"+
                            "As Head of State, The Queen will proclaim the "+
                            "Paralympic Games open by saying: ‘I declare "+
                            "open theLondon 2012 Paralympic Games’.@2"+

                            "<small>Available at: http://www.london2012.com/news/2012/02/ "+
                            "london-2012-paralympic-games-to-be-opened-by-the-queen."+
                            "php. Access on: March 1st, 2012. Adapted. </small> @1"+

                            "@b Text 2 b@ @2"+
                            "@b OLYMPIC GAMES b@ @2 "+
                            "The Olympic Games is a major international "+
                            "event in which thousands of athletes participate "+
                            "in a variety of competitions. More than 200 "+
                            "nations of the world participate. The Games are "+
                            "currently held every two years, with Summer "+
                            "and Winter Olympic Games alternating.@1"+
                            "Originally, the ancient Olympic Games were "+
                            "held in Olympia, Greece, from the 8th century "+
                            "BC to the 4th century A.D. @2"+
                            "<small>Available at: http://en.wikipedia.org/wiki/Olympic_Games.@1"+
                            "Access on: March 13 th, 2012. Adapted. </small> @2";

                    sourceString = texto+"The 2012 Paralympic Games will be opened by ";
                    qA = "neither the Queen nor the Duke. ";
                    qB = "Queen Elizabeth and her husband. ";
                    qC = "the Duke of Edinburgh alone. ";
                    qD = "the Queen by herself. ";
                    break;
                case 27:

                    texto = "@b Text 1 b@ @2"+
                            "@b LONDON 2012 PARALYMPIC GAMES b@@2 "+

                            "The London 2012 Organising Committee "+
                            "has confirmed that Her Majesty The Queen, "+
                            "accompanied by His Royal Highness The "+
                            "Duke of Edinburgh, will open the Paralympic "+
                            "Games in the Olympic Stadium on 29 August.@1"+
                            "As Head of State, The Queen will proclaim the "+
                            "Paralympic Games open by saying: ‘I declare "+
                            "open theLondon 2012 Paralympic Games’.@2"+

                            "<small>Available at: http://www.london2012.com/news/2012/02/ "+
                            "london-2012-paralympic-games-to-be-opened-by-the-queen."+
                            "php. Access on: March 1st, 2012. Adapted. </small> @1"+

                            "@b Text 2 b@ @2"+
                            "@b OLYMPIC GAMES b@ @2 "+
                            "The Olympic Games is a major international "+
                            "event in which thousands of athletes participate "+
                            "in a variety of competitions. More than 200 "+
                            "nations of the world participate. The Games are "+
                            "currently held every two years, with Summer "+
                            "and Winter Olympic Games alternating.@1"+
                            "Originally, the ancient Olympic Games were "+
                            "held in Olympia, Greece, from the 8th century "+
                            "BC to the 4th century A.D. @2"+
                            "<small>Available at: http://en.wikipedia.org/wiki/Olympic_Games.@1"+
                            "Access on: March 13 th, 2012. Adapted. </small> @2";

                    sourceString = texto+"In the past, the Olympic Games took place in ";
                    qA = "200 nations. ";
                    qB = "Edinburgh. ";
                    qC = "Greece. ";
                    qD = "London. ";
                    break;


                case 28:
                    texto = "@b TEXT 3 b@ @2"+
                            "Cancer begins in the cells, which are the building blocks "+
                            "of your body. Normally, new cells form as you need them, "+
                            "replacing old cells that die. Sometimes, this process goes "+
                            "wrong. New cells form when you don’t need them, and "+
                            "old cells don’t die when they should. The extra cells can "+
                            "form a tumor. Benign tumors aren’t cancer while malignant "+
                            "ones are. Malignant tumor cells can invade nearby tissues "+
                            "or break away and spread to other parts of the body.@1"+
                            "<small> Available at: http://www.nlm.nih.gov/medlineplus/cancerinchildren.html . Access on: March 1st, 2012. Adapted. </small> @2";

                    sourceString = texto+"This text is an explanation of how cancer is ";
                    qA = "diagnosed. ";
                    qB = "formed. ";
                    qC = "spread. ";
                    qD = "treated. ";
                    break;
                case 29:

                    texto = "@b TEXT 3 b@ @2"+
                            "Cancer begins in the cells, which are the building blocks "+
                            "of your body. Normally, new cells form as you need them, "+
                            "replacing old cells that die. Sometimes, this process goes "+
                            "wrong. New cells form when you don’t need them, and "+
                            "old cells don’t die when they should. The extra cells can "+
                            "form a tumor. Benign tumors aren’t cancer while malignant "+
                            "ones are. Malignant tumor cells can invade nearby tissues "+
                            "or break away and spread to other parts of the body.@1"+
                            "<small> Available at: http://www.nlm.nih.gov/medlineplus/cancerinchildren.html . Access on: March 1st, 2012. Adapted. </small> @2";

                    sourceString = texto+"The word them in “Normally, new cells form as you need them,” refers to ____ cells.@1"+
                            "@1The word that correctly completes the sentence is ";
                    qA = "benign. ";
                    qB = "dead. ";
                    qC = "extra. ";
                    qD = "new. ";
                    break;
                case 30:

                    texto = "@b TEXT 3 b@ @2"+
                            "Cancer begins in the cells, which are the building blocks "+
                            "of your body. Normally, new cells form as you need them, "+
                            "replacing old cells that die. Sometimes, this process goes "+
                            "wrong. New cells form when you don’t need them, and "+
                            "old cells don’t die when they should. The extra cells can "+
                            "form a tumor. Benign tumors aren’t cancer while malignant "+
                            "ones are. Malignant tumor cells can invade nearby tissues "+
                            "or break away and spread to other parts of the body.@1"+
                            "<small> Available at: http://www.nlm.nih.gov/medlineplus/cancerinchildren.html . Access on: March 1st, 2012. Adapted. </small> @2";

                    sourceString = texto+"The text above has antonyms. Some examples are new and old, malignant and ";
                    qA = "benign. ";
                    qB = "break. ";
                    qC = "cancer. ";
                    qD = "tumor. ";
                    break;
            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice) {

                case 1:

                    sourceString = "Uma costureira dobrou um tecido retangular ao meio, seguindo a linha pontilhada, conforme mostra a "+
                            "figura 1. Em seguida, riscou com o giz o formato da gola que queria, como visto na figura 2. Finalmente, "+
                            "fez o recorte, deixando a peça conforme indicado na figura 3.@1"+
                            "@cimg mt530011 cimg@"+
                            "Considerando-se que a dobra que essa costureira fez na figura 1 é representada pela reta r, a figura que "+
                            "indica o modelo da gola feito pela costureira é: ";
                    qA = "@cimg mt53001a cimg@";
                    qB = "@cimg mt53001b cimg@";
                    qC = "@cimg mt53001c cimg@";
                    qD = "@cimg mt53001d cimg@";
                    break;
                case 2:

                    sourceString = "Observe as igualdades abaixo.@2 "+

                            "(I) (x + 3)² = x² + 9 @1"+
                            "(II) (y – 4).(y + 4) = y² – 16 @1"+
                            "(III) (2x – 5)² = 4x² – 20x + 25 "+

                            "@2Quais dessas igualdades estão corretas? ";
                    qA = "I e II, apenas. ";
                    qB = "I e III, apenas. ";
                    qC = "II e III, apenas. ";
                    qD = "I, II e III. ";
                    break;
                case 3:

                    sourceString = "Douglas propôs a seguinte charada para seus amigos decifrarem:@2"+
                            "“A diferença entre o triplo do meu peso e sua quinta parte é igual a 70. Qual é o meu peso?” "+
                            "@1Denotando-se por x o peso de Douglas, a equação que traduz as informações contidas nessa charada é: ";
                    qA = "@cimg mt53003a cimg@";
                    qB = "3x – 5 = 70 ";
                    qC = "@cimg mt53003c cimg@";
                    qD = "3x – 5x = 70 ";
                    break;
                case 4:

                    sourceString = "O valor numérico da expressão 4x² – 2y + z@sp0sp@ "+
                            " para x = 2, y = – 4 e z = 3 é igual a ";
                    qA = "8 ";
                    qB = "9 ";
                    qC = "24 ";
                    qD = "25 ";
                    break;
                case 5:

                    sourceString = "Uma embalagem de 1 litro de suco de laranja traz a seguinte informação:@2"+
                            "Esta embalagem contém suco de 4,5 laranjas.@1"+
                            "@1Quantas laranjas são utilizadas na fabricação de 16 litros desse suco? ";
                    qA = "49 ";
                    qB = "72 ";
                    qC = "690 ";
                    qD = "720 ";
                    break;
                case 6:

                    sourceString = "Os círculos desenhados abaixo possuem o mesmo raio.@2 "+
                            "@cimg mt530061 cimg@"+
                            "@1Em qual desses círculos a parte colorida na cor cinza representa 25% da região circular? ";
                    qA = "I ";
                    qB = "II ";
                    qC = "III ";
                    qD = "IV ";
                    break;
                case 7:

                    sourceString = "O dono de uma floricultura perguntou a algumas mulheres qual é a flor que elas mais gostam de ganhar.@1"+
                            "As respostas foram: 52%, rosas; 28%, margaridas; 15%, orquídeas; e 5%, violetas.@1"+
                            "@1O gráfico que apresenta corretamente os resultados obtidos nessa pesquisa é: ";
                    qA = "@cimg mt53007a cimg@";
                    qB = "@cimg mt53007b cimg@";
                    qC = "@cimg mt53007c cimg@";
                    qD = "@cimg mt53007d cimg@";
                    break;

                case 8:

                    sourceString = "A forma fatorada da expressão 6ab + 15a – 2b – 5 é: ";
                    qA = "(3a – 1).(2b – 5) ";
                    qB = "(3a – 1).(2b + 5) ";
                    qC = "(3a + 1).(2b – 5) ";
                    qD = "(3a + 1).(2b + 5) ";
                    break;
                case 9:

                    sourceString = "A figura abaixo representa uma parede retangular que vai ser totalmente preenchida por azulejos@2 "+
                            "retangulares, colocados lado a lado. As partes menores representam metade de um azulejo, e o espaço "+
                            "entre os azulejos é desprezível.@1"+
                            "@cimg mt530091 cimg@"+

                            "@1Quantos azulejos serão necessários para preencher totalmente essa parede? ";
                    qA = "11 ";
                    qB = "15 ";
                    qC = "27 ";
                    qD = "36 ";
                    break;
                case 10:

                    sourceString = "Em uma cidade, um vendedor ambulante vende bonés e camisas com a logomarca do time de futebol "+
                            "local. No último domingo, quem comprou um boné e uma camisa pagou 38 reais. Nesse dia, o ambulante "+
                            "vendeu 45 camisas e 15 bonés, arrecadando um total de 1 260 reais.@1"+
                            "@1Quanto custou cada camisa nesse domingo? ";
                    qA = "R$ 21,00 ";
                    qB = "R$ 23,00 ";
                    qC = "R$ 28,00 ";
                    qD = "R$ 42,00 ";
                    break;
                case 11:

                    sourceString = "Para descongelar 1 kg de carne no micro-ondas, Miriam digitou o tempo de 8,07 minutos. Após o término "+
                            "desse tempo, ela deixou a carne no micro-ondas por mais 0,8 minutos.@1"+
                            "@1O tempo total de descongelamento da carne, em minutos, foi de ";
                    qA = "8,078 ";
                    qB = "8,15 ";
                    qC = "8,87 ";
                    qD = "9,50 ";
                    break;
                case 12:

                    sourceString = "Renata resolveu corretamente a expressão: @1" +
                            "@cimg mt530121 cimg@"+
                            "@1O resultado encontrado por ela foi igual a ";
                    qA = "– 2 ";
                    qB = "– 0,5 ";
                    qC = "+ 0,5 ";
                    qD = "+ 2 ";
                    break;
                case 13:

                    sourceString = "As lojas de um shopping utilizam uma semana do mês de janeiro para liquidarem os produtos do ano anterior.@1"+
                            "Essa semana recebe o nome de “Semana da Liquidação Verde e Vermelha”, que são as cores da logomarca "+
                            "desse shopping. O produto identificado pela etiqueta “Verde” recebe um desconto de 30%, e o identificado "+
                            "pela etiqueta “Vermelha”, um desconto de 40%. Marina comprou a blusa e a calça mostradas abaixo.@2 "+
                            "@cimg mt530131 cimg@ @1"+

                            "Quanto Marina pagou por essa compra? ";
                    qA = "R$ 44,00 ";
                    qB = "R$ 50,00 ";
                    qC = "R$ 76,00 ";
                    qD = "R$ 84,00 ";
                    break;
                case 14:

                    sourceString = "As notas de um candidato a concurso para professor em cada uma das etapas estão representadas no "+
                            "quadro abaixo.@2 "+
                            "@cimg mt530141 cimg@ @1"+

                            "A nota final de cada candidato foi obtida utilizando-se a média aritmética das quatro notas.@1"+
                            "@1Qual foi a nota final desse candidato? ";
                    qA = "18 ";
                    qB = "19 ";
                    qC = "20 ";
                    qD = "22 ";
                    break;
                case 15:

                    sourceString = "O fuxico é o nome dado a um tipo de artesanato feito com tecido, agulha, linha e muita paciência. Ele é "+
                            "composto pela união de várias pequenas trouxas de tecido, como mostra a figura 1. O esquema da figura "+
                            "2 mostra uma estrutura formada por quatro trouxas, representada por quatro circunferências de centros "+
                            "A, B, C e D e raio 2 cm que se tangenciam duas a duas. Neste esquema, a área na cor cinza representa "+
                            "o espaço vazio entre as quatro trouxas, e ABCD é um quadrado.@1"+
                            "@cimg mt530151 cimg@ @1" +
                            "Dado π = 3,1 @2"+

                            "@1Qual é a medida da área destacada na cor cinza na figura 2? ";
                    qA = "3,6 cm2 ";
                    qB = "9,8 cm2 ";
                    qC = "12,4 cm2 ";
                    qD = "12,9 cm2 ";
                    break;
                case 16:

                    sourceString = "A forma fatorada do número 360 cujos fatores são números primos é dada por ";
                    qA = "2 x 3 x 5 ";
                    qB = "2³ x 3 x 5 ";
                    qC = "2² x 3² x 5 ";
                    qD = "2³ x 3² x 5 ";
                    break;

                case 17:

                    sourceString = "Observe a questão que Gabriela propôs para seus alunos.@2"+
                            "Qual é o resultado de 2 5 + x 4 – v9 ? "+
                            "@2A resposta correta dessa questão é ";
                    qA = "4 ";
                    qB = "7 ";
                    qC = "19 ";
                    qD = "25 ";
                    break;
                case 18:

                    sourceString = "Observe os objetos tridimensionais representados nas figuras abaixo.@2 "+
                            "@cimg mt530181 cimg@ @1" +
                            "Esses objetos têm, respectivamente, as formas de ";
                    qA = "cilindro, prisma e paralelepípedo retângulo. ";
                    qB = "cilindro, pirâmide e prisma. ";
                    qC = "cone, prisma e paralelepípedo retângulo. ";
                    qD = "cone, pirâmide e prisma. ";
                    break;
                case 19:

                    sourceString = "As raízes da equação 2x² – 5x – 3 = 0 são: ";
                    qA = "– 1 e 6. ";
                    qB = "– 3 e 1/2. ";
                    qC = "– 1/2 e 3. ";
                    qD = "1 e 3/2. ";
                    break;

                case 20:

                    sourceString = "Samira perguntou a dez amigos sobre a quantidade de televisão que cada um possuía em sua casa. As "+
                            "respostas foram: 1, 4, 3, 2, 1, 2, 2, 2,1 e 3.@1"+
                            "@1O quadro que apresenta corretamente essas informações é ";
                    qA = "@cimg mt53020a cimg@";
                    qB = "@cimg mt53020b cimg@";
                    qC = "@cimg mt53020c cimg@";
                    qD = "@cimg mt53020d cimg@";
                    break;

                case 21:

                    sourceString = "Lucas anotou a quantidade de ligações locais e interurbanas que ele realizou em três meses e montou o "+
                            "quadro abaixo.@2 "+
                            "@cimg mt530211 cimg@" +
                            "@1O gráfico que apresenta corretamente as informações contidas nesse quadro é: ";
                    qA = "@cimg mt53021a cimg@";
                    qB = "@cimg mt53021b cimg@";
                    qC = "@cimg mt53021c cimg@";
                    qD = "@cimg mt53021d cimg@";
                    break;

                case 22:

                    sourceString = "Uma empresa de telefonia celular oferece um plano com uma taxa fixa mensal, através do qual o cliente "+
                            "poderá enviar uma quantidade ilimitada de mensagens. Uma mensagem é formada por caracteres "+
                            "(letras, algarismos, espaços entre as palavras, acentos, etc.). Por exemplo, para escrever a mensagem "+
                            "Seja atencioso! foram dados 15 toques.@1"+
                            "Durante o mês de fevereiro, Thaís enviou 4 035 mensagens.@1"+
                            "Considerando-se que a média de toques por mensagem é igual a 15, quantos toques foram dados, em "+
                            "média, por Thaís, para escrever todas as mensagens? ";
                    qA = "24 090 ";
                    qB = "24 210 ";
                    qC = "60 405 ";
                    qD = "60 525 ";
                    break;
                case 23:

                    sourceString = "O gráfico abaixo mostra de que forma Joana utilizou seu cartão de crédito em um determinado mês.@2 "+
                            "@cimg mt530231 cimg@" +
                            "@1De acordo com esse gráfico, constata-se que o gasto com lazer foi ";
                    qA = "a metade do gasto com vestuário. ";
                    qB = "maior que o gasto com vestuário. ";
                    qC = "menor que o gasto com saúde. ";
                    qD = "o dobro do gasto com alimentação. ";
                    break;
                case 24:

                    sourceString = "A decomposição de um polinômio em fatores do 1º grau é dada por: 5 · (x + 1) · (x - 2/3) · (x - 4). "+
                            "As raízes desse polinômio são: ";
                    qA = "-5, 10/3 e 20.";
                    qB = "-1, 2/3 e 4.";
                    qC = "1, -2/3 e -4.";
                    qD = "5, -10/3 e -20. ";
                    break;
                case 25:

                    sourceString = "São dados os polinômios: G = 3x² – y, H = 5y + 3 e J = – 7x² + 2y."+
                            "@1Qual é o resultado de G · H – J? ";
                    qA = "15x²y + 7x² – 5y ";
                    qB = "15x²y + 2x² + 16y² – y ";
                    qC = "15x²y + 16x² – 5y² – 5y ";
                    qD = "15x²y + 16x² + 5y² + 5y ";
                    break;
                case 26:

                    sourceString = "O esquema abaixo mostra os tipos de transportes que podem ser usados para ir de uma cidade A até uma "+
                            "cidade B e de uma cidade B para uma cidade C.@1"+
                            "@cimg mt530261 cimg@ @1" +
                            "De quantos modos diferentes é possível ir da cidade A para a cidade C, passando pela cidade B? ";
                    qA = "4 ";
                    qB = "5 ";
                    qC = "6 ";
                    qD = "8 ";
                    break;
                case 27:

                    sourceString = "Luciene pediu a seus alunos que classificassem as afirmativas abaixo como verdadeiras (V) ou falsas (F).@2 "+
                            "( ) 1 m = 100 cm @1"+
                            "( ) 1 cm = 0,1 dm @1"+
                            "( ) 1 km = 100 m @2"+
                            "A sequência correta dessa classificação, de cima para baixo, é: ";
                    qA = "V, V, V. ";
                    qB = "V, V, F. ";
                    qC = "F, F, V. ";
                    qD = "F, F, F. ";
                    break;
                case 28:

                    sourceString = "Observe a equação abaixo.@2 "+
                            "@b – 2x + 8 = – 10 b@ @1"+
                            "@1A solução dessa equação é: ";
                    qA = "– 9 ";
                    qB = "– 1 ";
                    qC = "1 ";
                    qD = "9 ";
                    break;
                case 29:

                    sourceString = "Ao resolverem a equação 3x – 9 = – 3, Renata encontrou como resposta – 4; Gabriela, 2; Júlia, 1/2;"+
                            " "+
                            "Luísa, -1/4. "+
                            "@1Quem acertou o resultado? ";
                    qA = "Gabriela. ";
                    qB = "Júlia. ";
                    qC = "Luísa. ";
                    qD = "Renata. ";
                    break;
                case 30:

                    sourceString = "Na figura abaixo, os espelhos 1 e 2 são paralelos.@2 "+
                            "@cimg mt530301 cimg@"+
                            "@1<small>Disponível em: www.google.com.br/. Acesso em: 9 fev. 2012. *Adaptado para fins didáticos.</small> @2 "+
                            "Qual é a relação entre as medidas dos ângulos x e y? ";
                    qA = "x + y = 90º ";
                    qB = "x + y = 180º ";
                    qC = "x = y ";
                    qD = "x > y ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {
                case 1:

                    sourceString = "O coaxar de um sapo, a dança de um tangará e alguns dos movimentos corporais de um pinguim são "+
                            "formas de exibição que fazem parte do comportamento de corte desses animais.@1"+
                            "@1Esse tipo de comportamento tem como finalidade ";
                    qA = "atrair fêmea. ";
                    qB = "espantar predadores. ";
                    qC = "localizar alimentos. ";
                    qD = "marcar território. ";
                    break;
                case 2:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A epidemia de cólera que já matou mais de mil pessoas no Haiti é parte de uma pandemia "+
                            "iniciada há 49 anos, que provavelmente chegou ao país caribenho por causa de uma só pessoa "+
                            "contaminada [...]. Essa enfermidade bacteriana pode matar por diarreia em questão de horas se "+
                            "não houver tratamento.@1"+
                            "Disponível: http://www1.folha.uol.com.br/mundo/832621-colera-no-haiti-e-parte-de-pandemia-antiga-dizem-especialistas.shtml.@1"+
                            "Acesso em: 12 jan. 2011. Adaptado para fins didáticos.@1"+
                            "@1Uma medida eficiente para a prevenção dessa doença é ";
                    qA = "a utilização de preservativos. ";
                    qB = "o uso de calçados. ";
                    qC = "a ingestão de carnes bem cozidas. ";
                    qD = "o acesso ao saneamento básico. ";
                    break;
                case 3:

                    sourceString = "Ao se cortar uma maçã, deixando-a exposta ao ar por algumas horas, pode-se observar o fenômeno "+
                            "químico demonstrado nas imagens abaixo.@2 "+
                            "@cimg cn530031 cimg@ @1"+
                            "A explicação correta para esse fenômeno é que ";
                    qA = "a maçã, sem a proteção da casca, desidrata, o que provoca o seu escurecimento. ";
                    qB = "as partículas de poeira presentes no ar são depositadas sobre a maçã, tornando-a escura. ";
                    qC = "o gás oxigênio reage com substâncias presentes na maçã, provocando a sua oxidação. ";
                    qD = "os micro-organismos do ar alimentam-se da maçã, provocando o seu apodrecimento. ";
                    break;
                case 4:

                    sourceString = "Há alguns anos, os diabéticos utilizam insulina humana produzida por bactérias. Esse uso só tornou-se "+
                            "possível graças ao avanço da biotecnologia, que isolou o gene produtor da insulina e o inseriu em bactérias "+
                            "que se tornaram verdadeiras fábricas dessa substância produzida.@1"+
                            "@1As bactérias produtoras de insulina são organismos ";
                    qA = "clonados das células do pâncreas. ";
                    qB = "modificados geneticamente. ";
                    qC = "produtores de células-tronco. ";
                    qD = "receptores do gene da diabetes. ";
                    break;
                case 5:

                    sourceString = "A reciclagem consiste no reaproveitamento de materiais para a produção de um novo objeto. Esse "+
                            "processo tem se mostrado uma necessidade real para a preservação ambiental, uma vez que diminui a "+
                            "exploração de recursos naturais.@1"+
                            "Associe as duas colunas, relacionando o objeto ao respectivo recurso natural que será preservado com "+
                            "a sua reciclagem.@1"+
                            "@cimg cn530051 cimg@ "+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "1, 3, 4, 2 ";
                    qB = "2, 3, 4, 1 ";
                    qC = "2, 4, 3, 1 ";
                    qD = "4, 2, 1, 3 ";
                    break;
                case 6:

                    sourceString = "O esquema abaixo representa as etapas de tratamento da água em uma estação de tratamento (ETA).@2 "+
                            "@cimg cn530061 cimg@ @1"+
                            "<small>Disponível em: http://meioambiente.culturamix.com/blog/wp-content/gallery/tratamento-de-agua/tratamento-de-agua3.gif. Acesso: 3 mar. 2012. Adaptado para fins didáticos.</small> @2 "+
                            "Nesse esquema, a eliminação dos micro-organismos causadores de doenças ocorre na etapa ";
                    qA = "1 ";
                    qB = "2 ";
                    qC = "4 ";
                    qD = "5 ";
                    break;
                case 7:

                    sourceString = "Durante uma aula de Ciências, a professora explicou que a excreção realizada pelos rins por meio da "+
                            "urina tem, basicamente, duas finalidades: remover os resíduos metabólicos de origem celular e manter a "+
                            "regulação osmótica, isto é, o equilíbrio entre a água e os sais dos fiuidos corpóreos.@1"+
                            "Após essa explicação, ela perguntou a Arthur quais substâncias deveriam estar presentes na urina. Ele, "+
                            "então, respondeu:@2"+
                            "I - Excesso de água ingerida.@1"+
                            "II - Excesso de sódio consumido.@1"+
                            "III - Ureia produzida pelas células.@1"+
                            "IV - Gás carbônico produzido pelas células.@2 "+
                            "Quais substâncias o aluno acertou? ";
                    qA = "I e III, apenas. ";
                    qB = "II e IV, apenas. ";
                    qC = "I, II e III, apenas. ";
                    qD = "I, II, III e IV. ";
                    break;
                case 8:

                    sourceString = "O esquema abaixo representa o ciclo sexual feminino.@2 "+
                            "@cimg cn530081 cimg@ @1"+
                            "Sobre os dados apresentados nesse esquema, são feitas as seguintes afirmativas. Classifique-as como "+
                            "verdadeiras (V) ou falsas (F).@2"+
                            "( ) A descamação do útero ocorre no 14° dia do ciclo.@1"+
                            "( ) O gameta feminino é liberado na metade do ciclo.@1"+
                            "( ) Um novo ciclo inicia-se no primeiro dia da menstruação.@1"+
                            "( ) A possibilidade de uma gravidez é máxima no 28° dia do ciclo.@1"+
                            "@1A sequência correta dessa classificação, de cima para baixo, é: ";
                    qA = "F, F, V, V. ";
                    qB = "F, V, V, F. ";
                    qC = "V, F, V, F. ";
                    qD = "V, V, F, F. ";
                    break;
                case 9:

                    sourceString = "Os métodos contraceptivos, de forma geral, impedem o encontro entre o espermatozoide e o óvulo, "+
                            "evitando a ocorrência de gravidez.@1"+
                            "Considere os métodos contraceptivos apresentados abaixo.@2 "+
                            "@cimg cn530091 cimg@"+
                            "@1Qual desses métodos também é utilizado como prevenção às doenças sexualmente transmissíveis? ";
                    qA = "1 ";
                    qB = "2 ";
                    qC = "3 ";
                    qD = "4 ";
                    break;
                case 10:

                    sourceString = "Ao longo de sua história, o ser humano desenvolveu diversas formas de retardar a deterioração dos "+
                            "alimentos pelos micro-organismos. Uma dessas formas consiste na retirada da água.@1"+
                            "Uma técnica muito utilizada pela indústria alimentícia para conservar o alimento através da retirada de "+
                            "água é a ";
                    qA = "adição de sódio. ";
                    qB = "embalagem a vácuo. ";
                    qC = "pasteurização. ";
                    qD = "refrigeração. ";
                    break;
                case 11:

                    sourceString = "No dia a dia ocorrem constantes transformações entre os tipos de energia. Um exemplo dessa "+
                            "transformação é mostrada na imagem abaixo.@2 "+
                            "@cimg cn530111 cimg@"+
                            "@1Nesse exemplo, ocorre a transformação da energia ";
                    qA = "elétrica em nuclear. ";
                    qB = "mecânica em luminosa. ";
                    qC = "química em térmica. ";
                    qD = "solar em química. ";
                    break;
                case 12:

                    sourceString = "No planeta Terra, a fonte primária de energia é o Sol. Essa energia pode ser absorvida por organismos "+
                            "clorofilados, como as plantas, que, através do processo de fotossíntese, produzem o seu próprio alimento, "+
                            "sendo, por essa razão, classificadas como organismos autotróficos.@1"+
                            "@1O alimento produzido na fotossíntese será utilizado pela planta para que ela obtenha ";
                    qA = "energia. ";
                    qB = "gás carbônico. ";
                    qC = "gás oxigênio. ";
                    qD = "glicose. ";
                    break;
                case 13:

                    sourceString = "As características relacionadas ao estado físico de três substâncias estão organizadas no quadro abaixo.@2 "+
                            "@cimg cn530131 cimg@ @1"+
                            "De acordo com as informações desse quadro, conclui-se que as substâncias I, II e III encontram-se, "+
                            "respectivamente, nos estados físicos ";
                    qA = "gasoso, líquido e sólido. ";
                    qB = "líquido, gasoso e sólido. ";
                    qC = "líquido, sólido e gasoso. ";
                    qD = "sólido, gasoso e líquido. ";
                    break;
                case 14:

                    sourceString = "A água, como toda substância, pode mudar de estado físico dependendo das condições de temperatura "+
                            "e de pressão a que está submetida. A imagem abaixo representa o ciclo da água na natureza.@1"+
                            "@cimg cn530141 cimg@"+
                            "@1<small>Disponível em: http://revistaescola.abril.com.br/img/ciencias/planeta-ciclo.jpg. Acesso em: 27 set. 2010.</small> @2 "+
                            "Nesse ciclo, as mudanças de estado físico mostradas em 2 e 3 são, respectivamente, chamadas de ";
                    qA = "condensação e fusão. ";
                    qB = "evaporação e condensação. ";
                    qC = "solidificação e liquefação. ";
                    qD = "sublimação e ebulição. ";
                    break;
                case 15:

                    sourceString = "Alguns materiais são bons condutores de calor; dentre eles, está o alumínio. As panelas são, geralmente, "+
                            "fabricadas com esse material, o que permite o cozimento dos alimentos em menor tempo e a economia "+
                            "de gás.@1"+
                            "@1Além do alumínio, outro tipo de material eficaz na condução de calor é ";
                    qA = "a borracha. ";
                    qB = "a madeira. ";
                    qC = "o cobre. ";
                    qD = "o vidro. ";
                    break;
                case 16:

                    sourceString = "A imagem abaixo mostra um processo de separação de uma mistura heterogênea (areia + serragem),@2 "+
                            "denominada sedimentação fracionada.@1"+
                            "@cimg cn530161 cimg@ @1"+
                            "Esse tipo de separação é utilizado quando ";
                    qA = "os componentes apresentam diferentes pontos de ebulição. ";
                    qB = "os componentes possuem acentuada diferença de densidade. ";
                    qC = "um dos componentes se condensa mediante contato com o ar. ";
                    qD = "um dos componentes envolvidos tem alto grau de solubilidade. ";
                    break;
                case 17:

                    sourceString = "A dieta mediterrânea destaca-se pelo uso do azeite de oliva e de castanhas. Adotando-se esses alimentos "+
                            "na dieta em substituição àqueles com alto teor de gordura saturada e gordura trans, previne-se o "+
                            "surgimento ou agravamento de doenças ";
                    qA = "cardiovasculares. ";
                    qB = "metabólicas. ";
                    qC = "parasitárias. ";
                    qD = "respiratórias. ";
                    break;
                case 18:

                    sourceString = "A reprodução é uma das características exclusivas dos seres vivos. Durante um longo período só havia "+
                            "a reprodução assexuada. À medida que os organismos mais simples começaram a aumentar a sua "+
                            "complexidade, surgiu uma nova modalidade reprodutiva, a reprodução sexuada.@1"+
                            "@1Essa reprodução veio favorecer ";
                    qA = "a eliminação de características indesejáveis. ";
                    qB = "a manutenção da qualidade das espécies. ";
                    qC = "o aumento da diversidade das espécies. ";
                    qD = "o crescimento da densidade populacional. ";
                    break;
                case 19:

                    sourceString = "As células do corpo humano guardam em seus núcleos estruturas muito importantes chamadas de "+
                            "cromossomos. Esses cromossomos são constituídos por gens, e, geralmente, cada par de gens é "+
                            "responsável por uma característica do indivíduo.@1"+
                            "Essas características são provenientes de ";

                    qA = "células gaméticas unidas na fecundação. ";
                    qB = "células somáticas do casal progenitor. ";
                    qC = "mitoses ocorridas na célula-ovo. ";
                    qD = "processos iniciados pelo útero na gestação. ";
                    break;
                case 20:

                    sourceString = "O átomo é constituído de três tipos de partículas, sendo que duas delas se encontram no núcleo, e a outra "+
                            "gira ao seu redor, conforme mostra o modelo atômico de Bohr representado abaixo.@2 "+
                            "@cimg cn530201 cimg@"+
                            "@2<small>Disponível em: http://portaldoprofessor.mec.gov.br/fichaTecnicaAula.html?aula=21709. Acesso em: 6 mar. 2012. Adaptado para fins didáticos.</small> @2 "+
                            "Nesse modelo, a partícula indicada pela seta ";
                    qA = "atrai partículas negativas. ";
                    qB = "é a maior das três partículas. ";
                    qC = "é denominada elétron. ";
                    qD = "possui carga positiva. ";
                    break;
                case 21:

                    sourceString = "Dentre as muitas utilidades da água está o fato de ela participar do controle da temperatura corporal nas "+
                            "aves e nos mamíferos, sendo que, nas aves, a temperatura fica em torno de 40 ºC e, nos mamíferos, varia "+
                            "bastante. No corpo humano, por exemplo, a temperatura gira em torno de 36,5 ºC.@1"+
                            "@1Essa utilidade explica-se porque a água é uma substância que ";
                    qA = "apresenta resistência à elevação de temperatura. ";
                    qB = "dissolve poucos tipos de substâncias. ";
                    qC = "é classificada como substância pura simples. ";
                    qD = "possui uma natureza denominada apolar. ";
                    break;
                case 22:

                    sourceString = "Em um consultório, o médico dá a seguinte explicação ao paciente sobre seu diagnóstico:@2"+
                            "– É uma doença bacteriana, transmitida pelo ar contaminado, que afetou o seu sistema respiratório. O "+
                            "tratamento deve ser completo, pois, caso haja reincidência da doença, será ainda mais grave.@1"+
                            "@1A doença que atingiu esse paciente é denominada ";
                    qA = "dengue. ";
                    qB = "poliomielite. ";
                    qC = "sarampo. ";
                    qD = "tuberculose. ";
                    break;
                case 23:

                    sourceString = "As espécies de plantas que habitam o ecossistema são, em geral, dotadas de adaptações que favorecem a "+
                            "sobrevivência nesse meio. É comum a presença de folhas pequenas ou transformadas em espinhos, caules "+
                            "suculentos que armazenam água, raízes bem desenvolvidas, sendo que muitas apresentam queda das "+
                            "folhas na estação seca. Alguns animais possuem hábitos noturnos como adaptação ao meio onde vivem.@1"+
                            "@1O ecossistema descrito é ";
                    qA = "a Caatinga. ";
                    qB = "a Mata Atlântica. ";
                    qC = "o Cerrado. ";
                    qD = "o Pantanal. ";
                    break;
                case 24:

                    sourceString = "Os seres vivos são agrupados segundo alguns critérios. Um desses critérios é a forma como esses seres "+
                            "obtêm o seu alimento. Considere os seres citados abaixo.@2 "+
                            "@b BALEIA - BARATA - EMA b@ @2"+
                            "Quanto à nutrição, esses seres vivos reúnem-se em um mesmo grupo por serem ";
                    qA = "autótrofos decompositores. ";
                    qB = "autótrofos produtores. ";
                    qC = "heterótrofos por absorção. ";
                    qD = "heterótrofos por ingestão. ";
                    break;
                case 25:

                    sourceString = "Termoelétrica é uma instalação industrial usada para geração de energia elétrica a partir da energia "+
                            "liberada em forma de calor, normalmente por meio da combustão de algum combustível fóssil, como "+
                            "carvão ou gás natural. A queima desses combustíveis contribui para o aquecimento global devido à "+
                            "liberação de gases poluentes.@1"+
                            "@1Uma alternativa que tem sido muito utilizada como combustível pelas termoelétricas no Brasil é ";
                    qA = "a biomassa. ";
                    qB = "a gasolina. ";
                    qC = "o diesel. ";
                    qD = "o querosene. ";
                    break;
                case 26:

                    sourceString = "Em um dia bastante frio, após se levantar e observar o orvalho, um homem aquece a água, prepara seu "+
                            "café e o toma antes de iniciar as atividades em seu trabalho. Às doze horas, faz uma refeição rica em "+
                            "carboidratos que, após digeridos e absorvidos, vão lhe proporcionar energia. Ao final do dia, ainda lhe "+
                            "sobra tempo para suar a camisa no jogo de futebol que tanto aprecia.@1"+
                            "@1Dentre as situações vividas por esse trabalhador, a que mostra a ocorrência de um fenômeno químico é a ";
                    qA = "condensação do suor eliminado durante a partida de futebol. ";
                    qB = "digestão dos carboidratos ingeridos no almoço. ";
                    qC = "evaporação de parte da água usada para o preparo do café. ";
                    qD = "formação do orvalho durante a noite. ";
                    break;
                case 27:

                    sourceString = "Observe o esquema abaixo.@2 "+
                            "@cimg cn530271 cimg@"+
                            "@1<small>Disponível em: http://www.dombosco.com.br/curso/estudemais/biologia/imagens/circula02.jpg. Acesso em: 28 mar. 2012.</small> @2 "+
                            "Nesse esquema, o vaso sanguíneo responsável por transportar para todo o corpo o sangue arterial, "+
                            "aquele rico em oxigênio, está indicado pelo número ";
                    qA = "2 ";
                    qB = "3 ";
                    qC = "4 ";
                    qD = "5 ";
                    break;
                case 28:

                    sourceString = "A infecção por papiloma vírus é uma doença sexualmente transmissível, que pode, muitas vezes, não "+
                            "apresentar sintomas. Essa doença caracteriza-se pelo surgimento de verrugas nos órgãos genitais e "+
                            "pode levar ao aparecimento de câncer no colo uterino.@1"+
                            "@1Uma forma de prevenção dessa doença é a ";
                    qA = "ingestão de pílulas à base de hormônios. ";
                    qB = "interrupção do coito antes da ejaculação. ";
                    qC = "retirada dos ovários. ";
                    qD = "utilização de preservativo. ";
                    break;
                case 29:

                    sourceString = "A diversidade de seres vivos que habitam o planeta Terra é imensa, e isso gerou a necessidade de classificá-los.@1"+
                            "Dentro da chave de classificação, o Reino é o grupo que reúne a maior quantidade de indivíduos que, embora "+
                            "apresentem muitas diferenças, apresentam também algumas características comuns.@1"+
                            "A imagem abaixo mostra dois exemplares que pertencem ao Reino Animal.@1"+
                            "@cimg cn530291 cimg@"+
                            "@1Uma característica comum a esses animais é a ";
                    qA = "classificação como seres autótrofos. ";
                    qB = "constituição por células eucariotas. ";
                    qC = "ocupação do mesmo habitat. ";
                    qD = "respiração através de brânquias. ";
                    break;
                case 30:

                    sourceString = "A água é uma necessidade básica dos seres vivos e para ser consumida precisa ser de boa qualidade. A "+
                            "ingestão de água não tratada ocasiona, muitas vezes, doenças, como a amebíase.@1"+
                            "@1Para se evitar essa doença, é necessária a existência de ";
                    qA = "medidas de controle dos caramujos transmissores. ";
                    qB = "programas de combate aos roedores e insetos de maneira geral. ";
                    qC = "saneamento básico nas grandes e pequenas cidades. ";
                    qD = "tratamento adequado para a água que contém os vírus causadores. ";
                    break;
            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {
                case 1:

                    sourceString = "O texto abaixo é um fragmento de uma carta direcionada ao Rei de Portugal.@2 "+
                            "[...] E assim seguimos nosso caminho, por este mar, de longo, até que, terça-feira das Oitavas "+
                            "de Páscoa, que foram vinte e um dias de abril, estando da dita ilha obra de 660 ou 670 léguas, "+
                            "segundo os pilotos diziam, topamos alguns sinais de terra, os quais eram muita quantidade de "+
                            "ervas compridas, a que os mareantes chamam botelho, assim como outras a que dão o nome "+
                            "de rabo-de-asno. E, quarta feira seguinte, pela manhã topamos aves a que chamam furabuchos.@1"+
                            "Quarta-feira, 22 de abril: Neste dia, a horas de vésperas, houvemos vista de terra! Primeiramente "+
                            "dum grande monte, mui alto e redondo; e doutras serras mais baixas ao sul dele: e de terra chá, "+
                            "com grandes arvoredos. Ao monte alto o capitão pôs nome: o MONTE PASCOAL e à terra; a "+
                            "@2<small>TERRA DE VERA CRUZ. Disponível em: http://educacao.uol.com.br/historia-brasil. Acesso em: 25 jan. 2012. Fragmento.</small> @2 "+
                            "Essa carta é uma descrição ";
                    qA = "da chegada dos portugueses a Calicute. ";
                    qB = "da viagem de Vasco da Gama às Índias. ";
                    qC = "do descobrimento da terra de Vera Cruz. ";
                    qD = "do contorno do Cabo das Tormentas. ";
                    break;
                case 2:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Durante o reinado de Dom João III (1521-1557), o comércio português na Índia entrou em "+
                            "crise, em virtude da concorrência de outras nações europeias, principalmente da Holanda e da "+
                            "Inglaterra. Ao mesmo tempo, as enormes despesas com a montagem e a manutenção do império "+
                            "português na África e na Ásia – construção de navios, pagamento de tripulações, edificação "+
                            "de fortalezas etc. – arruinaram as finanças do país. Nessa situação, tornava-se urgente o "+
                            "aproveitamento do Brasil, até então pouco lucrativo. Por outro lado, os portugueses esperavam "+
                            "encontrar metais preciosos, incentivados pelas notícias da descoberta de grandes jazidas de "+
                            "ouro e prata na América espanhola.@1"+
                            "@1<small>Disponível em: http://www.portalbrasil.net/brasil_historiadobrasil_brasilcolonia.htm. Acesso em: 6 fev. 2012. Fragmento.</small> @2 "+
                            "De acordo com esse texto, um dos motivos que levou os portugueses a iniciarem a colonização do Brasil foi ";
                    qA = "a expectativa de encontrar metais preciosos. ";
                    qB = "a possibilidade de comercializar com os índios. ";
                    qC = "o compromisso de explorar o pau-brasil. ";
                    qD = "o interesse de investir na agricultura. ";
                    break;
                case 3:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Existiam as Câmaras Municipais que eram órgãos políticos compostos pelos “homens-bons”.@1"+
                            "Estes eram os ricos proprietários que definiam os rumos políticos das vilas e cidades. O povo não "+
                            "podia participar da vida pública nesta fase.@1"+
                            "@1<small>Disponível em: http://www.suapesquisa.com/colonia/. Acesso em: 18 jan. 2012. Fragmento.</small> @2 "+
                            "Esse texto mostra que os “homens bons” eram os principais participantes da política do período colonial, porque ";
                    qA = "controlavam o sistema religioso. ";
                    qB = "detinham o controle ideológico. ";
                    qC = "influenciavam o regime militar. ";
                    qD = "possuíam o poder econômico. ";
                    break;
                case 4:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] Mesmo findo o rush (apogeu), a região das Minas Gerais possuía vasta população, livre e escrava, "+
                            "e uma rede de comercialização e distribuição de produtos, bastante ampla, convertendo-se em campo de "+
                            "produção de alimentos, dessa vez para o abastecimento do Rio de Janeiro, já na alvorada do século XIX.@1"+
                            "@1<small>LINHARES, Maria Yeda (org.). História Geral do Brasil. Rio de Janeiro: Campus, 1996. Fragmento.</small> @2 "+
                            "Nesse texto, a região das Minas, na América Portuguesa, gerou ";
                    qA = "a ampliação do parque industrial. ";
                    qB = "a ampliação do mercado interno. ";
                    qC = "o aumento das exportações. ";
                    qD = "o aumento das importações. ";
                    break;
                case 5:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Declaração dos Direitos do Homem e do Cidadão "+
                            "Artigo 1º – Os homens nascem e são livres e iguais em direitos. As distinções sociais só podem "+
                            "fundar-se na utilidade comum.@1"+
                            "@1<small>Disponível em: http://pfdc.pgr.mpf.gov.br/atuacao-e-conteudos-de-apoio/legislacao/direitos-humanos/declar_dir_homem_cidadao.pdf. Acesso em: 8 dez. 2011. Fragmento.</small> @2 "+
                            "Esse texto está relacionado à ";
                    qA = "Revolução Francesa. ";
                    qB = "Revolução Industrial. ";
                    qC = "Revolução Inglesa. ";
                    qD = "Revolução Russa. ";
                    break;
                case 6:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A essência do sistema não era mais o comércio. O bom lucro vinha da produção de mercadorias.@1"+
                            "Mudanças importantes estavam ocorrendo: a produtividade e a capacidade de produção "+
                            "aumentavam rapidamente; e a produção em série crescia na segunda metade do século XIX.@1"+
                            "Um dos aspectos importantes desse período foi a introdução de tecnologias e novas fontes de "+
                            "energia, passando a haver um interesse pela pesquisa científica com o objetivo de desenvolver "+
                            "novas e melhores técnicas de produção.@1"+
                            "@1<small>Disponível em: http://www.juliobattisti.com.br. Acesso em: 6 fev. 2012. Fragmento.</small> @2 "+
                            "Esse texto refere-se às características do capitalismo ";
                    qA = "comercial. ";
                    qB = "financeiro. ";
                    qC = "industrial. ";
                    qD = "mercantil. ";
                    break;
                case 7:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] Os revolucionários pernambucanos foram derrotados por tropas enviadas por D. João "+
                            "@2<small>VI, porém o ideal de liberdade, baseada na instituição de uma República, ficou entre os</small> @2 "+
                            "pernambucanos que, alguns anos depois, novamente se rebelam desejando para o Brasil uma "+
                            "República Federativa e verdadeiramente independente. [...] "+
                            "@2<small>Disponível em: http://www.mauriciodenassau.edu.br/artigo/listar/rec/293. Acesso em: 22 ago. 2009. Fragmento.</small> @2 "+
                            "A Revolução Pernambucana de 1817 possuiu caráter ";
                    qA = "anarquista. ";
                    qB = "fascista. ";
                    qC = "monarquista. ";
                    qD = "separatista. ";
                    break;
                case 8:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A Inglaterra, já nessa época, iniciou a dominação do mercado consumidor brasileiro com "+
                            "uma enxurrada de produtos. Com isso, seria praticamente impossível que algum mercador ou "+
                            "comerciante local tivesse interesse ou condições de dispor investimentos que pudessem competir "+
                            "com a qualidade e o preço das mercadorias britânicas.@1"+
                            "Para sacramentar essa mudança no cenário econômico brasileiro, autoridades portuguesas "+
                            "e inglesas realizaram, em 1810, a assinatura do Treaty of Cooperation and Friendship (Tratado "+
                            "de Cooperação e Amizade). Esse acordo confirmou a liberação dos portos brasileiros para as "+
                            "demais nações do mundo. Sob o ponto de vista histórico, a assinatura desse termo simbolizava a "+
                            "vitória da doutrina econômica liberal sobre as antigas diretrizes do mercantilismo.@1"+
                            "@1<small>Disponível em: http://www.mundoeducacao.com.br/historiadobrasil/os-tratados-1810.htm. Acesso em: 10 fev. 2012. Fragmento.</small> @2 "+
                            "Qual país obteve vantagens econômicas com o tratado de 1810? ";
                    qA = "Espanha. ";
                    qB = "França. ";
                    qC = "Inglaterra. ";
                    qD = "Portugal. ";
                    break;
                case 9:

                    sourceString = "O primeiro país, na América, a tornar-se independente de sua metrópole foram os Estados Unidos, no fim do "+
                            "século XVIII. Mas praticamente todos os países do nosso continente ficaram independentes no século XIX.@1"+
                            "@1Após a independência, um país americano que adotou a monarquia foi o ";
                    qA = "Brasil. ";
                    qB = "Canadá. ";
                    qC = "Chile. ";
                    qD = "Panamá. ";
                    break;
                case 10:

                    sourceString = "O texto abaixo refere-se aos anos finais da escravidão no Brasil.@2 "+
                            "Em 1879, um grupo de parlamentares lançou oficialmente a campanha pela abolição da "+
                            "escravatura. Foi uma resposta à crescente onda de agitações e manifestações sociais pelo fim "+
                            "da escravidão.@1"+
                            "@1<small>Disponível em: http://educacao.uol.com.br/. Acesso em: 16 jan. 2012. Fragmento.</small> @2 "+
                            "Esse texto trata de uma mobilização política e social que deu origem à assinatura da ";
                    qA = "Lei Áurea. ";
                    qB = "Lei Eusébio de Queirós. ";
                    qC = "Lei do Ventre Livre. ";
                    qD = "Lei dos Sexagenários. ";
                    break;
                case 11:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O rádio obteve um papel muito importante na época da Era Vargas (período compreendido entre "+
                            "1930-1945). Inicialmente, o rádio era um meio de comunicação das elites e só depois, na década "+
                            "de 30, no governo do Presidente Getúlio Vargas, com o objetivo de atingir toda a população, "+
                            "transforma-se em meio de comunicação de massa, voltado à diversão e entretenimento do povo "+
                            "brasileiro. Foi então que, em meio a tanto sucesso, Vargas resolveu explorar o rádio e passou a "+
                            "utilizá-lo como um grande aliado político.@1"+
                            "@1<small>Disponível em: http://dialogoshistoricos.wordpress.com/historia/o-radio-e-a-era-vargas/ Acesso em: 8 fev. 2012. Fragmento.</small> @2 "+
                            "Esse texto refere-se ao uso do rádio por Getúlio Vargas como ";
                    qA = "ferramenta de disseminação da livre expressão. ";
                    qB = "instrumento de propaganda de seu governo. ";
                    qC = "meio de popularização do direito à comunicação. ";
                    qD = "sistema de democratização do governo no Brasil. ";
                    break;
                case 12:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@bPlano de Metas b@ @1 "+
                            "@cimg ch530121 cimg@"+
                            "@1<small>Disponível em: http://giropelahistoria.blogspot.com/2011/03/o-plano-de-metas-do-governo-jk.html. Acesso em: 7 fev. 2012.</small> @2 "+
                            "De acordo com essa imagem, o governo de Juscelino Kubitschek investiu, principalmente, no setor da ";
                    qA = "agricultura familiar. ";
                    qB = "educação militar. ";
                    qC = "indústria de transportes. ";
                    qD = "restauração de estradas. ";
                    break;
                case 13:

                    sourceString = "Leia o texto abaixo sobre o período da Ditadura Militar no Brasil.@2 "+
                            "Censura prévia "+
                            "O decreto-lei 1 077, de 21 de janeiro de 1970, instituiu a censura prévia, exercida de dois "+
                            "modos: ou uma equipe de censores instalava-se permanentemente na redação dos jornais e das "+
                            "revistas, para decidir o que poderia ou não ser publicado, ou os veículos eram obrigados a enviar, "+
                            "antecipadamente, o que pretendiam publicar para a Divisão de Censura do Departamento de "+
                            "Polícia Federal, em Brasília.@1"+
                            "@1<small>Disponível em: http://educacao.uol.com.br/historia-brasil/censura-ditadura-militar.jhtm. Acesso em: 12 jan. 2012. Fragmento.</small> @2 "+
                            "Esse texto refere-se à suspensão do direito civil de ";
                    qA = "igualdade perante a lei. ";
                    qB = "inviolabilidade do lar. ";
                    qC = "liberdade de expressão. ";
                    qD = "livre associação. ";
                    break;
                case 14:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Manifestações de apoio e oposição ao governo eclodem por todo o país. Em 13 de março, "+
                            "ocorreu o comício da estação da Estrada de Ferro Central do Brasil, no Rio de Janeiro, que "+
                            "reuniu 300 mil trabalhadores em apoio a Jango. Uma semana depois, as elites rurais, a burguesia "+
                            "industrial e setores conservadores da Igreja realizaram a “Marcha da Família com Deus e pela "+
                            "Liberdade”, considerado o ápice do movimento de oposição ao governo. As Forças Armadas "+
                            "também foram influenciadas pela polarização ideológica vivenciada pela sociedade brasileira "+
                            "naquela conjuntura política, ocasionando rompimento da hierarquia.@1"+
                            "@1<small>Disponível em:http://educacao.uol.com.br/historia-brasil/ult1689u67.jhtm. Acesso em: 8 abr. 2011. Fragmento.</small> @2 "+
                            "O presidente João Goulart, mais conhecido como Jango, saiu do governo brasileiro em 1964, porque foi ";
                    qA = "assassinado por um grupo de revolucionários. ";
                    qB = "derrotado nas eleições presidenciais. ";
                    qC = "derrubado por um golpe dado por militares. ";
                    qD = "retirado através de um impeachment. ";
                    break;
                case 15:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@cimg ch530151 cimg@"+
                            "@1<small>Disponível em: http://veja.abril.com.br/110398/p_070.html. Acesso em: 6 fev. 2012. Adaptado.</small> @2 "+
                            "Essa imagem relaciona-se ao conceito de ";
                    qA = "interiorização. ";
                    qB = "migração. ";
                    qC = "ruralização. ";
                    qD = "urbanização. ";
                    break;
                case 16:

                    sourceString = "As imagens abaixo apresentam a cidade de Maringá, no Paraná, em anos distintos.@2 "+
                            "@cimg ch530161 cimg@"+
                            "@2<small>Disponível em: http://www.skyscrapercity.com/showthread.php?t=556377. Acesso em: 12 mar. 2012.</small> @2 "+
                            "Nessas imagens, as mudanças observadas no espaço urbano de Maringá decorrem ";
                    qA = "da expansão sociocultural. ";
                    qB = "da preservação ambiental. ";
                    qC = "do crescimento populacional. ";
                    qD = "do processo de municipalização. ";
                    break;
                case 17:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Os meios de comunicação em massa, como a televisão, o rádio, a Internet, entre outros, "+
                            "incentivam, de certa forma, a sociedade ao consumo. Ocorre, então, a massificação de hábitos, "+
                            "costumes e atitudes, fazendo com que certa sociedade seja exemplo a ser seguido por outras.@1"+
                            "@1<small>Disponível em: http://alb.com.br/arquivo-morto/anais-jornal/jornal4/comunicacoesPDF/62_tecnologiasFABIANO.pdf. Acesso em: 30 mar. 2012. *Adaptado para fins didáticos.</small> @2 "+
                            "Nas sociedades tradicionais, um elemento que amplia as transformações tanto culturais como sociais é a ";
                    qA = "informação. ";
                    qB = "planificação. ";
                    qC = "regionalização. ";
                    qD = "uniformização. ";
                    break;
                case 18:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "A estruturação interna das cidades obedece, prioritariamente, à lógica de localização das "+
                            "camadas de mais alta renda. Estas procuram localizar-se em áreas com boa acessibilidade ao "+
                            "centro principal e, ao fazê-lo, pioram a acessibilidade das outras áreas. Com o deslocamento "+
                            "progressivo dos serviços e equipamentos urbanos na direção das áreas de mais alta renda, a "+
                            "localização das outras classes vai se tornando relativamente pior.@1"+
                            "@1<small>Disponível em: http://urbanidades.arq.br/2009/05/segregacao-espacial-urbana/. Acesso em: 26 mar. 2012. Adaptado para fins didáticos.</small> @2 "+
                            "Nesse texto, a segregação espacial urbana provoca a ";
                    qA = "ampliação do setor primário da economia. ";
                    qB = "diminuição da oferta de empregos formais. ";
                    qC = "melhoria de vida da populção de baixa renda. ";
                    qD = "valorização de parcelas do espaço da cidade. ";
                    break;
                case 19:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Nas cidades pequenas, a praça ainda é o local onde se encontram amigos, compadres, "+
                            "comadres, crianças, jovens e nem tão jovens assim. Em qualquer hora do dia, alguém faz uso do "+
                            "espaço, seja para descansar, passear com a família, praticar alguma atividade, como ler ou jogar "+
                            "dominó com os amigos, brincar, ter contato com a natureza, aliviar as tensões do dia a dia ou para "+
                            "simplesmente fugir da solidão.@1"+
                            "@1<small>Disponível em: http://www.geointeracao.com.br/artigos/vol1n1/ARTIGO_LILIAN.pdf. Acesso em: 25 mar. 2012. *Adaptado: Reforma Ortográfica.</small> @2 "+
                            "Na praça, um dos elementos que identifica a territorialidade do lazer é ";
                    qA = "a área para o estacionamento. ";
                    qB = "a presença de árvores e flores. ";
                    qC = "o local ocupado pelo posto policial. ";
                    qD = "o parquinho para as crianças. ";
                    break;
                case 20:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O shopping center ocupa cada vez mais um lugar privilegiado na mente das pessoas na hora "+
                            "de optar pelas atividades a serem exercidas em seu tempo livre.@1"+
                            "A ênfase cada vez maior no oferecimento de um leque amplo de opções de cultura, arte, música "+
                            "e até esportes sinaliza uma nova fase inaugurada há alguns anos pelos shoppings, que vêm "+
                            "procurando renovar seu conceito original de centro de compras, ampliando-o para centro de lazer.@1"+
                            "@1<small>Disponível em: http://www.novomilenio.br/comunicacoes/1/artigo/4_aparecida.pdf. Acesso em: 24 mar. 2012. *Adaptado para fins didáticos.</small> @2 "+
                            "Os shoppings tornam-se centros de lazer, porque eles ";
                    qA = "impedem o comércio de ambulantes. ";
                    qB = "oferecem espaços planejados e seguros. ";
                    qC = "proíbem a cobrança do estacionamento. ";
                    qD = "promovem a igualdade entre as pessoas. ";
                    break;
                case 21:

                    sourceString = "Observe o mapa abaixo.@2 "+
                            "@cimg ch530211 cimg@"+
                            "@1<small>Disponível em: http://cartographie.dessciences-po.fr/cartotheque/03_Commerce_mondial_marchandises_2006.jpg. Acesso em: 6 abr. 2012. *Adaptado para fins didáticos.</small> @2 "+
                            "Nesse mapa, está representado um aspecto da Nova Ordem Mundial, que é ";
                    qA = "a migração de países pobres para os ricos. ";
                    qB = "a navegação marítima entre os continentes. ";
                    qC = "o fim das fronteiras políticas e econômicas. ";
                    qD = "o predomínio de três polos geoeconômicos. ";
                    break;
                case 22:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "@cimg ch530221 cimg@"+
                            "@1<small>Disponível em: http://digartmedia.wordpress.com/. Acesso em: 28 mar. 2012.</small> @2 "+
                            "Nesse texto, está em destaque um serviço que possibilita o envio e o recebimento de mensagens eletrônicas.@1"+
                            "@1Esse serviço está disponível ";
                    qA = "na impressora. ";
                    qB = "na internet. ";
                    qC = "no satélite. ";
                    qD = "no telégrafo. ";
                    break;
                case 23:

                    sourceString = "O gráfico abaixo relaciona a modalidade de transporte utilizada pela população de São Paulo e sua renda.@2 "+
                            "@cimg ch530231 cimg@"+
                            "@1<small>Disponível em: http://brasil.indymedia.org/media/2006/12//369497.pdf. Acesso em: 27 mar. 2012.</small> @2 "+
                            "Nesse gráfico, constata-se que os usuários de renda mais elevada utilizam, majoritariamente, ";
                    qA = "trem. ";
                    qB = "ônibus. ";
                    qC = "metrô. ";
                    qD = "lotação. ";
                    break;
                case 24:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O próprio nome já diz: Bonito. Essa cidade que alguns anos atrás era praticamente "+
                            "desconhecida, hoje é referência de turismo ecológico no Brasil. A descoberta de suas belezas "+
                            "leva a cada ano mais e mais turistas para lá. Cresce, então, o desafio de evitar a destruição do "+
                            "que a cidade tem de mais precioso. Empresários unidos à comunidade trabalham duro para "+
                            "preservar tanta “boniteza”.@1"+
                            "@1<small>Disponível em: http://pegntv.globo.com/Pegn/0,6993,LIR163448-5027,00.html. Acesso em: 28 mar. 2012. *Adaptado para fins didáticos.</small> @2 "+
                            "Há a necessidade de as pessoas prepararem-se para usufruir adequadamente do mundo do lazer, "+
                            "@1preservando a natureza. Essa necessidade é satisfeita através da ";
                    qA = "cobrança de multas para aqueles que degradarem os atrativos turísticos visitados. ";
                    qB = "divulgação dos atrativos turísticos pelas diversas esferas governamentais. ";
                    qC = "gratuidade dos ingressos para a visitação de museus, parques ecológicos e galerias de arte. ";
                    qD = "implementação de uma educação para o turismo por meio do sistema oficial de ensino formal e informal. ";
                    break;
                case 25:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Ao se apropriarem da natureza e transformá-la, os seres humanos criam ou produzem o espaço "+
                            "geográfico, utilizando as técnicas de que dispõem, segundo o momento histórico e de acordo com "+
                            "suas representações, ou seja, crenças, valores, normas (direito) e interesses políticos e econômicos.@1"+
                            "@1<small>Disponível em: http://educacao.uol.com.br/geografia/espaco-geografico-sociedade-transforma-a-natureza.jhtm. Acesso em: 29 mar. 2012.</small> @2 "+
                            "Nesse texto, a transformação da natureza está relacionada com a ";
                    qA = "arte. ";
                    qB = "cultura. ";
                    qC = "geologia. ";
                    qD = "história. ";
                    break;
                case 26:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O turismo é uma atividade capitalista, por isso ela é contraditória, ou seja, gera benefícios e "+
                            "simultaneamente problemas e conflitos.@1"+
                            "Há uma maneira de promover pontos turísticos sem que a infraestrutura criada para receber "+
                            "os visitantes impacte de forma negativa naquele local, conciliando as atividades e as expansões "+
                            "turísticas com medidas pela preservação do meio ambiente.@1"+
                            "@1<small>Disponível em: www.revistaturismo.com.br/artigos/guaramiranga.html. Acesso em: 29 mar. 2012. Adaptado.</small> @2 "+
                            "Essa maneira é denominada de turismo ";
                    qA = "estrutural. ";
                    qB = "natural. ";
                    qC = "planejado. ";
                    qD = "sustentável. ";
                    break;
                case 27:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "O desenvolvimento tecnológico ocasionou a terceira revolução industrial e permitiu mudanças "+
                            "revolucionárias no processo produtivo e organizacional da produção, constituindo-se no grande "+
                            "aliado da eliminação dos empregos. O declínio da força de trabalho global é registrado na "+
                            "indústria, na agricultura e até no setor de serviços. As mudanças tecnológicas aumentaram os "+
                            "lucros e diminuíram os empregos.@1"+
                            "@1<small>Disponível em: http://www.scielo.br/scielo.php?script=sci_arttext&pid=S0101-73302001000200006l. Acesso em: 4 abr. 2012.</small> @2 "+
                            "* Adaptado para fins didáticos.@1"+
                            "@1A terceira revolução industrial contribuiu para a diminuição do emprego, porque ";
                    qA = "ampliou a produtividade industrial. ";
                    qB = "aumentou o consumo de energia. ";
                    qC = "contratou mão de obra informal. ";
                    qD = "reduziu os benefícios trabalhistas. ";
                    break;
                case 28:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Um balanço das últimas décadas mostra que, apesar da intervenção direta do Estado, persistem "+
                            "na economia nacional os mecanismos geográficos que levaram ao desenvolvimento desigual das "+
                            "regiões brasileiras. E as desigualdades resultam do ritmo diferenciado de acumulação da riqueza "+
                            "e de geração da renda, nas diferentes parcelas do território.@1"+
                            "@1<small>Disponível em: http://pvprestinga.weebly.com/uploads/6/9/8/9/6989204/aula_21_geografia_do_brasil.pdf. Acesso em: 31 mar. 2012.</small> @2 "+
                            "A maior geração de renda ocorre nos estados que detêm as ";
                    qA = "grandes propriedades rurais. ";
                    qB = "maiores reservas de minérios. ";
                    qC = "maiores taxas de natalidade. ";
                    qD = "principais áreas industriais. ";
                    break;
                case 29:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Empresa multinacional investe 270 milhões de reais em programas de gestão ambiental e "+
                            "reduz o uso de insumos não renováveis na produção de aço.@1"+
                            "Um dos resultados mais expressivos dessa empresa na área ambiental é o aproveitamento "+
                            "de 98% dos resíduos. Durante o processo de produção de aço, a empresa gera cerca de "+
                            "3,7 milhões de toneladas de resíduos (como lama, poeira e escória), que são reciclados e "+
                            "usados como matéria-prima em várias aplicações industriais: desde a fabricação de cimento "+
                            "até produtos para a correção de acidez do solo para a agricultura.@1"+
                            "@1<small>Disponível em: http://planetasustentavel.abril.com.br/noticia/desenvolvimento/conteudo_265715.shtml. Acesso em: 5 abr. 2012.</small> @2 "+
                            "A adoção de processos ambientalmente mais sustentáveis contribui para ";
                    qA = "a elevação dos custos de produção. ";
                    qB = "a preservação dos recursos naturais. ";
                    qC = "o aumento do pagamento de impostos. ";
                    qD = "o uso da energia proveniente do carvão. ";
                    break;
                case 30:

                    sourceString = "As imagens abaixo apresentam pessoas trabalhando em atividades que caracterizam muitas cidades mineiras.@2 "+
                            "@cimg ch530301 cimg@"+
                            "@1<small>Disponível em: http://estudiof8.blogspot.com/2009/09/blog-post.html. Acesso em: 10 mar. 2012.</small> @2 "+
                            "A cidade mineira reconhecida pela ocupação de sua população ativa nessas atividades é a de ";
                    qA = "Boa Esperança. ";
                    qB = "Montes Claros. ";
                    qC = "Ouro Branco. ";
                    qD = "Pouso Alegre. ";
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