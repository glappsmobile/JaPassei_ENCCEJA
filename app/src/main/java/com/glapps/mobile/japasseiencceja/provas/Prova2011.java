package com.glapps.mobile.japasseiencceja.provas;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;

import com.glapps.mobile.japasseiencceja.BuildConfig;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.helper.Traduzir;


public class Prova2011 {





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
            C,C,A,D,A,B,D,B,C,C,
            A,C,A,D,C,B,B,D,D,A,
            C,A,C,B,C,B,C,B,A,A,
    };

    String[] gabmt = {
            B,C,A,D,C,A,B,D,A,C,
            A,D,C,A,B,D,B,D,C,D,
            B,C,B,A,D,B,C,B,A,B,
    };

    String[] gabcn = {
            B,C,B,C,A,C,A,C,A,B,
            A,C,A,B,C,D,B,C,B,C,
            A,A,D,B,D,B,D,C,D,A,
    };

    String[] gabch = {
            D,C,D,B,D,A,D,B,C,B,
            C,B,D,C,B,B,C,D,C,D,
            B,C,B,C,B,C,A,C,A,D,
    };


    //Simulado 2 FUNDAMENTAL - Prova 6
    public Prova2011(Context contexto, Simulado simulado) {
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

                    texto =  "@b Antonio Cardoso do Amaral é eleito o Homem do Ano pelos internautas b@@1"+
                            "Professor de Cocal dos Alves, Piauí, transformou o município no campeão da Olimpíada "+
                            "Brasileira de Matemática.@2"+
                            "Antonio Cardoso do Amaral, professor de matemática do Piauí, venceu a eleição de Homens "+
                            "do Ano ALFA – Escolha do Leitor, realizada no site de ALFA. Filho de analfabetos, Amaral é o "+
                            "responsável pelo treinamento de alunos de escolas públicas de Cocal dos Alves para a Olimpíada "+
                            "Brasileira de Matemática. “Eu ensino a matemática como de fato ela é: uma disciplina cumulativa, "+
                            "cujo avanço é feito aos poucos. Não quero enganar os alunos, jogando uma fórmula ou uma regra”.@1"+
                            "Para conseguir esse resultado, o professor mobilizou toda a cidade e utilizou as redes sociais "+
                            "como Facebook e Twitter. A eleição no site de ALFA foi destaque na mídia piauiense [...]. “Meu desafio "+
                            "é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos Alves”, disse o "+
                            "professor durante a festa Homens do Ano, realizada na noite de segunda-feira, 5, em São Paulo.@1"+
                            "[...] Todos os seus alunos que se candidataram à Universidade Federal do Piauí (UFPI) foram "+
                            "aprovados.@1"+
                            "Os resultados alcançados podem ser considerados verdadeiros milagres. Os recursos das "+
                            "escolas, em suas palavras, “são minímos”. O professor ganha cerca de R$ 3 mil reais por mês "+
                            "pelas 60 horas-aula que ministra. “Eu já pensei em sair de Cocal dos Alves, mas foi muito trabalho "+
                            "para chegar até aqui. Eu tenho muitos alunos. Não posso abandoná-los agora.” [...] "+
                            "@2<small>Disponível em: http://revistaalfa.abril.com.br/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";

                    sourceString = texto+"Considerando as características estruturais, temáticas e o meio de circulação, conclui-se que esse texto "+
                            "é um exemplo de ";
                    qA = "artigo de opinião. ";
                    qB = "e-mail. ";
                    qC = "notícia. ";
                    qD = "relato. ";
                    break;
                case 2:

                    texto =  "@b Antonio Cardoso do Amaral é eleito o Homem do Ano pelos internautas b@@1"+
                            "Professor de Cocal dos Alves, Piauí, transformou o município no campeão da Olimpíada "+
                            "Brasileira de Matemática.@2"+
                            "Antonio Cardoso do Amaral, professor de matemática do Piauí, venceu a eleição de Homens "+
                            "do Ano ALFA – Escolha do Leitor, realizada no site de ALFA. Filho de analfabetos, Amaral é o "+
                            "responsável pelo treinamento de alunos de escolas públicas de Cocal dos Alves para a Olimpíada "+
                            "Brasileira de Matemática. “Eu ensino a matemática como de fato ela é: uma disciplina cumulativa, "+
                            "cujo avanço é feito aos poucos. Não quero enganar os alunos, jogando uma fórmula ou uma regra”.@1"+
                            "Para conseguir esse resultado, o professor mobilizou toda a cidade e utilizou as redes sociais "+
                            "como Facebook e Twitter. A eleição no site de ALFA foi destaque na mídia piauiense [...]. “Meu desafio "+
                            "é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos Alves”, disse o "+
                            "professor durante a festa Homens do Ano, realizada na noite de segunda-feira, 5, em São Paulo.@1"+
                            "[...] Todos os seus alunos que se candidataram à Universidade Federal do Piauí (UFPI) foram "+
                            "aprovados.@1"+
                            "Os resultados alcançados podem ser considerados verdadeiros milagres. Os recursos das "+
                            "escolas, em suas palavras, “são minímos”. O professor ganha cerca de R$ 3 mil reais por mês "+
                            "pelas 60 horas-aula que ministra. “Eu já pensei em sair de Cocal dos Alves, mas foi muito trabalho "+
                            "para chegar até aqui. Eu tenho muitos alunos. Não posso abandoná-los agora.” [...] "+
                            "@2<small>Disponível em: http://revistaalfa.abril.com.br/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";

                    sourceString = texto+"1No trecho “‘Eu ensino a matemática como de fato ela é:...’”, os dois pontos foram usados para introduzir uma ";
                    qA = "crítica. ";
                    qB = "enumeração. ";
                    qC = "explicação. ";
                    qD = "opinião. ";
                    break;
                case 3:

                    texto =  "@b Antonio Cardoso do Amaral é eleito o Homem do Ano pelos internautas b@@1"+
                            "Professor de Cocal dos Alves, Piauí, transformou o município no campeão da Olimpíada "+
                            "Brasileira de Matemática.@2"+
                            "Antonio Cardoso do Amaral, professor de matemática do Piauí, venceu a eleição de Homens "+
                            "do Ano ALFA – Escolha do Leitor, realizada no site de ALFA. Filho de analfabetos, Amaral é o "+
                            "responsável pelo treinamento de alunos de escolas públicas de Cocal dos Alves para a Olimpíada "+
                            "Brasileira de Matemática. “Eu ensino a matemática como de fato ela é: uma disciplina cumulativa, "+
                            "cujo avanço é feito aos poucos. Não quero enganar os alunos, jogando uma fórmula ou uma regra”.@1"+
                            "Para conseguir esse resultado, o professor mobilizou toda a cidade e utilizou as redes sociais "+
                            "como Facebook e Twitter. A eleição no site de ALFA foi destaque na mídia piauiense [...]. “Meu desafio "+
                            "é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos Alves”, disse o "+
                            "professor durante a festa Homens do Ano, realizada na noite de segunda-feira, 5, em São Paulo.@1"+
                            "[...] Todos os seus alunos que se candidataram à Universidade Federal do Piauí (UFPI) foram "+
                            "aprovados.@1"+
                            "Os resultados alcançados podem ser considerados verdadeiros milagres. Os recursos das "+
                            "escolas, em suas palavras, “são minímos”. O professor ganha cerca de R$ 3 mil reais por mês "+
                            "pelas 60 horas-aula que ministra. “Eu já pensei em sair de Cocal dos Alves, mas foi muito trabalho "+
                            "para chegar até aqui. Eu tenho muitos alunos. Não posso abandoná-los agora.” [...] "+
                            "@2<small>Disponível em: http://revistaalfa.abril.com.br/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";

                    sourceString = texto+"Nesse texto, o título e o subtítulo ";
                    qA = "antecipam o assunto que será tratado no texto. ";
                    qB = "criam suspense em relação ao que será abordado. ";
                    qC = "expressam de modo crítico o assunto em questão. ";
                    qD = "manifestam uma opinião sobre o assunto do texto. ";
                    break;
                case 4:

                    texto =  "@b Antonio Cardoso do Amaral é eleito o Homem do Ano pelos internautas b@@1"+
                            "Professor de Cocal dos Alves, Piauí, transformou o município no campeão da Olimpíada "+
                            "Brasileira de Matemática.@2"+
                            "Antonio Cardoso do Amaral, professor de matemática do Piauí, venceu a eleição de Homens "+
                            "do Ano ALFA – Escolha do Leitor, realizada no site de ALFA. Filho de analfabetos, Amaral é o "+
                            "responsável pelo treinamento de alunos de escolas públicas de Cocal dos Alves para a Olimpíada "+
                            "Brasileira de Matemática. “Eu ensino a matemática como de fato ela é: uma disciplina cumulativa, "+
                            "cujo avanço é feito aos poucos. Não quero enganar os alunos, jogando uma fórmula ou uma regra”.@1"+
                            "Para conseguir esse resultado, o professor mobilizou toda a cidade e utilizou as redes sociais "+
                            "como Facebook e Twitter. A eleição no site de ALFA foi destaque na mídia piauiense [...]. “Meu desafio "+
                            "é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos Alves”, disse o "+
                            "professor durante a festa Homens do Ano, realizada na noite de segunda-feira, 5, em São Paulo.@1"+
                            "[...] Todos os seus alunos que se candidataram à Universidade Federal do Piauí (UFPI) foram "+
                            "aprovados.@1"+
                            "Os resultados alcançados podem ser considerados verdadeiros milagres. Os recursos das "+
                            "escolas, em suas palavras, “são minímos”. O professor ganha cerca de R$ 3 mil reais por mês "+
                            "pelas 60 horas-aula que ministra. “Eu já pensei em sair de Cocal dos Alves, mas foi muito trabalho "+
                            "para chegar até aqui. Eu tenho muitos alunos. Não posso abandoná-los agora.” [...] "+
                            "@2<small>Disponível em: http://revistaalfa.abril.com.br/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";

                    sourceString = texto+"Com a fala “‘Meu desafio é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos "+
                            "Alves’,...”, o professor expressa ";
                    qA = "autoridade. ";
                    qB = "desânimo. ";
                    qC = "egoísmo. ";
                    qD = "otimismo. ";
                    break;
                case 5:

                    texto =  "@b Antonio Cardoso do Amaral é eleito o Homem do Ano pelos internautas b@@1"+
                            "Professor de Cocal dos Alves, Piauí, transformou o município no campeão da Olimpíada "+
                            "Brasileira de Matemática.@2"+
                            "Antonio Cardoso do Amaral, professor de matemática do Piauí, venceu a eleição de Homens "+
                            "do Ano ALFA – Escolha do Leitor, realizada no site de ALFA. Filho de analfabetos, Amaral é o "+
                            "responsável pelo treinamento de alunos de escolas públicas de Cocal dos Alves para a Olimpíada "+
                            "Brasileira de Matemática. “Eu ensino a matemática como de fato ela é: uma disciplina cumulativa, "+
                            "cujo avanço é feito aos poucos. Não quero enganar os alunos, jogando uma fórmula ou uma regra”.@1"+
                            "Para conseguir esse resultado, o professor mobilizou toda a cidade e utilizou as redes sociais "+
                            "como Facebook e Twitter. A eleição no site de ALFA foi destaque na mídia piauiense [...]. “Meu desafio "+
                            "é muito grande. Estou ajudando a transformar a vida das pessoas em Cocal dos Alves”, disse o "+
                            "professor durante a festa Homens do Ano, realizada na noite de segunda-feira, 5, em São Paulo.@1"+
                            "[...] Todos os seus alunos que se candidataram à Universidade Federal do Piauí (UFPI) foram "+
                            "aprovados.@1"+
                            "Os resultados alcançados podem ser considerados verdadeiros milagres. Os recursos das "+
                            "escolas, em suas palavras, “são minímos”. O professor ganha cerca de R$ 3 mil reais por mês "+
                            "pelas 60 horas-aula que ministra. “Eu já pensei em sair de Cocal dos Alves, mas foi muito trabalho "+
                            "para chegar até aqui. Eu tenho muitos alunos. Não posso abandoná-los agora.” [...] "+
                            "@2<small>Disponível em: http://revistaalfa.abril.com.br/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";

                    sourceString = texto+"Qual é a justificativa para a afirmação “Os resultados alcançados podem ser considerados verdadeiros "+
                            "milagres.”? ";
                    qA = "As escolas dispõem de poucos recursos. ";
                    qB = "As universidades são muito difíceis. ";
                    qC = "Os alunos têm baixo rendimento. ";
                    qD = "Os professores são mal remunerados. ";
                    break;

                case 6:
                    texto = "@cimg lc560061 cimg@"+
                            "@1<small>Disponível em: http://cantinhodosaber.buscasulfluminense.com/wp-content/uploads/2010/01/Cartaz-com-as-Palavrinhas-M%C3%A1gicas. jpg. Acesso em: 18 jul. 2010.</small> @2 ";
                    sourceString = texto+"Qual é a palavra que resume a ideia desse texto? ";
                    qA = "Amizade. ";
                    qB = "Educação. ";
                    qC = "Magia. ";
                    qD = "Perdão. ";
                    break;


                case 7:
                    texto = "@b Geleia de morango com limão b@ @2"+
                            "Tipo de Culinária: Culinária Popular.@1"+
                            "Categoria: Doces.@1"+
                            "Subcategorias: Docinhos.@1"+
                            "Rendimento: 1 porção.@2"+
                            "Ingredientes:@2"+
                            "• 1 kg de morango; @1"+
                            "• 1 kg de açúcar; @1"+
                            "• 20 ml de suco de limão; @1"+
                            "• 1 envelope de gelatina incolor sem sabor.@2"+
                            "Modo de preparo:@2"+
                            "• Escolha os morangos maduros. Coloque-os sobre uma peneira, mergulhe em água fria e "+
                            "escorra bem.@1"+
                            "• Retire os cabinhos e corte em dois os morangos maiores.@1"+
                            "• Deixe macerar uma noite inteira numa tigela com o açúcar. Coloque então os morangos "+
                            "numa panela de cobre ou aço inoxidável, com o suco de limão e a gelatina preparada.@1"+
                            "• Deixe ferver e mantenha no fogo por mais 5 minutos.@1"+
                            "• A seguir, coe tudo numa peneira retirando apenas o caldo do morango, sem desmanchá-lo muito.@1"+
                            "• Você obterá um xarope. Leve o xarope ao fogo e deixe ferver por alguns minutos. Em seguida, "+
                            "junte os morangos.@1"+
                            "• Repita essa operação algumas vezes retirando sempre a espuma que se forma.@1"+
                            "• Feito isso, retire do fogo e despeje a geleia em potes, pouco a pouco, para que os morangos "+
                            "não subam à superfície.@1"+
                            "• Deixe que entre o mínimo possível de ar entre a geleia e a tampa; assim obterá uma melhor "+
                            "conservação da geleia.@1"+
                            "@1<small>Disponível em: http://cybercook.terra.com.br/receita-de-geleia-de-morango-com-limao.html?codigo=8950. Acesso em: 11 set. 2011.</small> @2 ";

                    sourceString = texto+"Nesse texto, a expressão “Feito isso” transmite ideia de ";
                    qA = "adição. ";
                    qB = "condição. ";
                    qC = "conclusão. ";
                    qD = "tempo. ";
                    break;
                case 8:

                    texto = "@b Geleia de morango com limão b@ @2"+
                            "Tipo de Culinária: Culinária Popular.@1"+
                            "Categoria: Doces.@1"+
                            "Subcategorias: Docinhos.@1"+
                            "Rendimento: 1 porção.@2"+
                            "Ingredientes:@2"+
                            "• 1 kg de morango; @1"+
                            "• 1 kg de açúcar; @1"+
                            "• 20 ml de suco de limão; @1"+
                            "• 1 envelope de gelatina incolor sem sabor.@2"+
                            "Modo de preparo:@2"+
                            "• Escolha os morangos maduros. Coloque-os sobre uma peneira, mergulhe em água fria e "+
                            "escorra bem.@1"+
                            "• Retire os cabinhos e corte em dois os morangos maiores.@1"+
                            "• Deixe macerar uma noite inteira numa tigela com o açúcar. Coloque então os morangos "+
                            "numa panela de cobre ou aço inoxidável, com o suco de limão e a gelatina preparada.@1"+
                            "• Deixe ferver e mantenha no fogo por mais 5 minutos.@1"+
                            "• A seguir, coe tudo numa peneira retirando apenas o caldo do morango, sem desmanchá-lo muito.@1"+
                            "• Você obterá um xarope. Leve o xarope ao fogo e deixe ferver por alguns minutos. Em seguida, "+
                            "junte os morangos.@1"+
                            "• Repita essa operação algumas vezes retirando sempre a espuma que se forma.@1"+
                            "• Feito isso, retire do fogo e despeje a geleia em potes, pouco a pouco, para que os morangos "+
                            "não subam à superfície.@1"+
                            "• Deixe que entre o mínimo possível de ar entre a geleia e a tampa; assim obterá uma melhor "+
                            "conservação da geleia.@1"+
                            "@1<small>Disponível em: http://cybercook.terra.com.br/receita-de-geleia-de-morango-com-limao.html?codigo=8950. Acesso em: 11 set. 2011.</small> @2 ";

                    sourceString = texto+"De acordo com esse texto, o tempo de preparo dessa receita é de ";
                    qA = "alguns minutos. ";
                    qB = "pelo menos dois dias. ";
                    qC = "poucas horas. ";
                    qD = "um dia inteiro. ";
                    break;


                case 9:
                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"No trecho “... por serem equânimes, justos e respeitosos com o meio ambiente.”, o uso da palavra "+
                            "destacada imprime ao texto um tom ";
                    qA = "crítico. ";
                    qB = "enfático. ";
                    qC = "positivo. ";
                    qD = "questionador. ";
                    break;
                case 10:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"A finalidade desse texto é ";
                    qA = "alertar sobre um problema. ";
                    qB = "criticar um posicionamento. ";
                    qC = "opinar sobre um assunto. ";
                    qD = "relatar um fato ocorrido. ";
                    break;
                case 11:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"No primeiro parágrafo desse texto, o autor refere-se aos pessimistas como pessoas ";
                    qA = "desinformadas. ";
                    qB = "insensíveis. ";
                    qC = "perigosas. ";
                    qD = "rancorosas. ";
                    break;
                case 12:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"No trecho “... que é a geração de resíduos.”, o pronome em destaque refere-se à palavra ";
                    qA = "competitividade. ";
                    qB = "geração. ";
                    qC = "problema. ";
                    qD = "resíduos. ";
                    break;
                case 13:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"É uma afirmação contida nesse texto: ";
                    qA = "O Brasil é um país criativo, mas ainda descuidado em relação à inovação. ";
                    qB = "O Brasil é um país resistente em relação ao registro de patentes. ";
                    qC = "Os brasileiros concordam que falta competitividade ao setor produtivo. ";
                    qD = "Os brasileiros copiam ideias alheias por falta de iniciativa. ";
                    break;
                case 14:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"Em que fragmento desse texto há uma palavra usada no sentido figurado? ";
                    qA = "“A eles é dedicada esta edição.”. ";
                    qB = "“O importante é questionar,...”. ";
                    qC = "“A proposta desta edição...”. ";
                    qD = "“Em inovação, o Brasil ainda patina.”. ";
                    break;
                case 15:

                    texto = "Perdoem-me os pessimistas de plantão, que olham para o Brasil como um país que muito fala "+
                            "e pouco faz. A eles é dedicada esta edição. Apesar de ser uma visão cautelosa, o pessimismo "+
                            "pode inibir a compreensão da realidade, pois ignora processos.@1"+
                            "O importante é questionar, econômica e socialmente, o alinhamento das agendas e desses "+
                            "processos com o desenvolvimento sustentável, por serem equânimes, justos e respeitosos "+
                            "com o meio ambiente. Dito isto, precisamos entender que, nas últimas três décadas, o Brasil se "+
                            "transformou e conseguiu tomar a direção certa, pautado pelo consenso: não há um só agente "+
                            "da sociedade brasileira que discorde da necessidade em melhorar a competitividade do setor "+
                            "produtivo, por meio da inovação e da resolução do grande problema que é a geração de resíduos.@1"+
                            "A proposta desta edição [...] é fazer uma análise mais cuidadosa dos setores da ciência, "+
                            "tecnologia e inovação e de resíduos sólidos e saneamento ambiental. Em inovação, o Brasil "+
                            "ainda patina. Apesar de nossa reconhecida criatividade, não registramos um número de patentes "+
                            "condizentes com uma população de 190 milhões, com as dezenas de milhões de empresas "+
                            "ativas, nem com a diversidade cultural e biológica de nosso país. Nossa comunidade togada de "+
                            "12 mil doutores e 41 mil mestrados nos coloca entre os 15 países que mais geram conhecimento "+
                            "de qualidade, mas na corrida por patentes, estamos na 68º posição: em 2010 registramos apenas "+
                            "422 patentes, uma fração dos 45 mil registrados pelos Estados Unidos e dos 12 mil registrados "+
                            "pela China. [...] "+
                            "@2<small>Disponível em:http://www.revistasustentabilidade.com.br/editorial/editorial-da-revista-sustentabilidade-edicao-especial-jun-jul. "+
                            "em: 11 set. 2011. Fragmento.Acesso</small> @2";

                    sourceString = texto+"No trecho “Apesar de nossa reconhecida criatividade,...”, a expressão em destaque introduz uma "+
                            "circunstância de ";
                    qA = "causa. ";
                    qB = "comparação. ";
                    qC = "concessão. ";
                    qD = "condição. ";
                    break;

                case 16:
                    texto = "@cimg lc560161 cimg@ "+
                            "@1<small>SOUSA, Maurício de. Disponível em: http://www.monica.com.br/comics/tirinhas/tira191.htm. Acesso em: 5 out. 2011.</small> @2 ";
                    sourceString = texto+"Observando-se o último quadrinho, percebe-se que ";
                    qA = "a menina foi atacada pelo animal. ";
                    qB = "a menina teve medo do animal. ";
                    qC = "o menino pretendia dar um susto na menina. ";
                    qD = "o menino queria seu animal de volta. ";
                    break;
                case 17:

                    texto = "@cimg lc560161 cimg@ "+
                            "@1<small>SOUSA, Maurício de. Disponível em: http://www.monica.com.br/comics/tirinhas/tira191.htm. Acesso em: 5 out. 2011.</small> @2 ";
                    sourceString = texto+"Na frase “Que desenho da hora!”, a menina expressa ";
                    qA = "crítica. ";
                    qB = "elogio. ";
                    qC = "gozação. ";
                    qD = "inveja. ";
                    break;



                case 18:
                    texto = "@b Semente de abóbora melhora o humor e a depressão b@ @2"+
                            "Rica em ácidos graxos mono e poli-insaturados, a semente de abóbora possui elevado teor "+
                            "de fibras e é fonte de minerais, como zinco, magnésio e potássio, além de vitaminas E, A e do "+
                            "complexo B.@1"+
                            "O óleo de semente de abóbora extravirgem possui sabor suave, o que permite sua utilização "+
                            "em diversas preparações, principalmente em saladas.@1"+
                            "Torrada e salgada pode ser acrescentada aos pães, sopas e saladas ou usada como aperitivo.@1"+
                            "Moída, substitui o sal para temperar.@2"+

                            "@b Benefícios da semente de abóbora b@ @2"+
                            "Saúde do coração @1"+
                            "O óleo de semente de abóbora extravirgem é fonte de ômega 9, ácido graxo monoinsaturado "+
                            "que auxilia na prevenção e controle de doenças cardiovasculares. Seu consumo auxilia na "+
                            "redução do colesterol e triglicérides. Como a semente é rica em potássio, auxilia no controle da "+
                            "pressão arterial. [...] @2"+
                            "Sistema imunológico @1"+
                            "O consumo de semente de abóbora ajuda a fortalecer o sistema imunológico, uma vez que é "+
                            "fonte de zinco mineral necessário para a diferenciação das células do sistema imunológico.@2"+
                            "Semente de abóbora e depressão @1"+
                            "A semente de abóbora é fonte de triptofano, aminoácido precursor da serotonina – hormônio "+
                            "relacionado ao bem-estar. Seu consumo está relacionado com a melhora do humor e depressão.@1"+
                            "@1<small>PRECIOSO, Karla. Apud MURTA, Bruna. Disponível em: http://mdemulher.abril.com.br/blogs/karlinha/geral/semente-de-aboboramelhora-o-humor-e-a-depressao/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";
                    sourceString = texto+"Nesse texto, predomina uma linguagem ";
                    qA = "coloquial. ";
                    qB = "formal. ";
                    qC = "regional. ";
                    qD = "técnica. ";
                    break;
                case 19:

                    texto = "@b Semente de abóbora melhora o humor e a depressão b@ @2"+
                            "Rica em ácidos graxos mono e poli-insaturados, a semente de abóbora possui elevado teor "+
                            "de fibras e é fonte de minerais, como zinco, magnésio e potássio, além de vitaminas E, A e do "+
                            "complexo B.@1"+
                            "O óleo de semente de abóbora extravirgem possui sabor suave, o que permite sua utilização "+
                            "em diversas preparações, principalmente em saladas.@1"+
                            "Torrada e salgada pode ser acrescentada aos pães, sopas e saladas ou usada como aperitivo.@1"+
                            "Moída, substitui o sal para temperar.@2"+
                            "@b Benefícios da semente de abóbora b@ @2"+
                            "Saúde do coração @1"+
                            "O óleo de semente de abóbora extravirgem é fonte de ômega 9, ácido graxo monoinsaturado "+
                            "que auxilia na prevenção e controle de doenças cardiovasculares. Seu consumo auxilia na "+
                            "redução do colesterol e triglicérides. Como a semente é rica em potássio, auxilia no controle da "+
                            "pressão arterial. [...] @2"+
                            "Sistema imunológico @1"+
                            "O consumo de semente de abóbora ajuda a fortalecer o sistema imunológico, uma vez que é "+
                            "fonte de zinco mineral necessário para a diferenciação das células do sistema imunológico.@2"+
                            "Semente de abóbora e depressão @1"+
                            "A semente de abóbora é fonte de triptofano, aminoácido precursor da serotonina – hormônio "+
                            "relacionado ao bem-estar. Seu consumo está relacionado com a melhora do humor e depressão.@1"+
                            "@1<small>PRECIOSO, Karla. Apud MURTA, Bruna. Disponível em: http://mdemulher.abril.com.br/blogs/karlinha/geral/semente-de-aboboramelhora-o-humor-e-a-depressao/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";
                    sourceString = texto+"De acordo com esse texto, a semente de abóbora melhora a depressão, porque ";
                    qA = "a utilização na alimentação é bastante diversificada. ";
                    qB = "a vitamina E tem potente ação atioxidante. ";
                    qC = "o consumo diário é recomendado pelos médicos. ";
                    qD = "o hormônio do bem-estar é incentivado por seu consumo. ";
                    break;
                case 20:

                    texto = "@b Semente de abóbora melhora o humor e a depressão b@ @2"+
                            "Rica em ácidos graxos mono e poli-insaturados, a semente de abóbora possui elevado teor "+
                            "de fibras e é fonte de minerais, como zinco, magnésio e potássio, além de vitaminas E, A e do "+
                            "complexo B.@1"+
                            "O óleo de semente de abóbora extravirgem possui sabor suave, o que permite sua utilização "+
                            "em diversas preparações, principalmente em saladas.@1"+
                            "Torrada e salgada pode ser acrescentada aos pães, sopas e saladas ou usada como aperitivo.@1"+
                            "Moída, substitui o sal para temperar.@2"+
                            "@b Benefícios da semente de abóbora b@ @2"+
                            "Saúde do coração @1"+
                            "O óleo de semente de abóbora extravirgem é fonte de ômega 9, ácido graxo monoinsaturado "+
                            "que auxilia na prevenção e controle de doenças cardiovasculares. Seu consumo auxilia na "+
                            "redução do colesterol e triglicérides. Como a semente é rica em potássio, auxilia no controle da "+
                            "pressão arterial. [...] @2"+
                            "Sistema imunológico @1"+
                            "O consumo de semente de abóbora ajuda a fortalecer o sistema imunológico, uma vez que é "+
                            "fonte de zinco mineral necessário para a diferenciação das células do sistema imunológico.@2"+
                            "Semente de abóbora e depressão @1"+
                            "A semente de abóbora é fonte de triptofano, aminoácido precursor da serotonina – hormônio "+
                            "relacionado ao bem-estar. Seu consumo está relacionado com a melhora do humor e depressão.@1"+
                            "@1<small>PRECIOSO, Karla. Apud MURTA, Bruna. Disponível em: http://mdemulher.abril.com.br/blogs/karlinha/geral/semente-de-aboboramelhora-o-humor-e-a-depressao/. Acesso em: 11 set. 2011. Fragmento.</small> @2 ";
                    sourceString = texto+"No fragmento “... tanto a semente quanto o óleo...”, as palavras destacadas expressam ideia de ";
                    qA = "adição. ";
                    qB = "comparação. ";
                    qC = "consequência. ";
                    qD = "tempo. ";
                    break;
                case 21:

                    sourceString = "Associe as duas colunas, relacionando os gêneros fílmicos às suas respectivas características.@1"+
                            "Gêneros: Características:@2"+
                            "1. Suspense.@1"+
                            "2. Ficção científica.@1"+
                            "3. Musical.@1"+
                            "4. Terror.@2"+
                            "( ) É um gênero que aborda temas mórbidos ou repelentes, "+
                            "pretendendo provocar a sensação de medo.@1"+
                            "( ) É um gênero que utiliza recursos para provocar no leitor ou "+
                            "espectador um sentimento de apreensão.@1"+
                            "( ) É um gênero no qual a narrativa se apoia sobre uma sequência "+
                            "de canções coreografadas.@1"+
                            "( ) É um gênero que lida, principalmente, com o impacto da ciência, tanto "+
                            "verdadeira como imaginada, sobre a sociedade ou os indivíduos.@1"+
                            "@1A sequência correta dessa associação, de cima para baixo, é: ";
                    qA = "4, 2, 3, 1 ";
                    qB = "1, 4, 2, 3 ";
                    qC = "4, 1, 3, 2 ";
                    qD = "1, 2, 4, 3 ";
                    break;
                case 22:

                    sourceString = "A respeito da arte rupestre, são feitas as seguintes afirmativas:@2"+
                            "I. O termo designa gravação, traçado e pintura sobre suporte rochoso, qualquer que seja a técnica "+
                            "empregada.@1"+
                            "II. O meio natural e suas relações com o mundo sobrenatural são elementos fundamentais para a"+
                            "análise da arte rupestre.@1"+
                            "III. Estão presentes na arte rupestre figuras fantásticas, objetos e cenas, domésticas ou de trabalho. @2"+
                            "Estão corretas as afirmativas ";
                    qA = "I, II e III. ";
                    qB = "I e II, apenas. ";
                    qC = "I e III, apenas. ";
                    qD = "II e III, apenas. ";
                    break;

                case 23:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] Seu repertório técnico abrange principalmente golpes contundentes, como pontapés, socos, "+
                            "joelhadas, bofetadas etc., executadas com as mãos desarmadas. Todavia, técnicas de projeção, "+
                            "imobilização e bloqueios – nage waza, katame waza, uke waza – também são ensinados, com "+
                            "maior ou menor ênfase dependendo de onde se aprende. [...] "+
                            "@2<small>Disponível em: http://pt.wikipedia.org/wiki/.. Acesso em: 5 out. 2011. Fragmento.</small> @2 "+
                            "Esse texto define qual modalidade esportiva? ";
                    qA = "Boxe. ";
                    qB = "Capoeira. ";
                    qC = "Caratê. ";
                    qD = "Luta greco-romana. ";
                    break;
                case 24:

                    sourceString = "Durante a prática de uma atividade física, é necessário que o praticante realize uma adequada hidratação "+
                            "corporal. A respeito dessa necessidade, são feitas as seguintes afirmativas:@2"+

                            "I. A hidratação corporal otimiza o desempenho e protege a saúde de quem está se exercitando.@1"+
                            "II. A hidratação corporal reduz a temperatura do corpo, evitando um colapso.@1"+
                            "III. O consumo adequado de líquidos faz a reposição de nutrientes, evitando a desidratação.@1 "+
                            "IV. O consumo adequado de líquidos controla a eliminação de suor e calor.@2 "+

                            "São corretas apenas as afirmativas ";
                    qA = "I e II. ";
                    qB = "I e III. ";
                    qC = "II e III. ";
                    qD = "III e IV. ";
                    break;



                case 25:
                    texto = "@b TEXT 1 b@ @1" +
                            "@cimg lc560251 cimg@ @2"+
                            "<small>Available at: http://amiexmoth.blogspot.com/2011/02/blood-donation-program.html. Access on: September 5th, 2011.</small>@2";
                    sourceString = texto+"The text above is directed to ";
                    qA = "doctors. ";
                    qB = "donators. ";
                    qC = "everyone. ";
                    qD = "savers. ";
                    break;
                case 26:

                    texto = "@b TEXT 1 b@ @1" +
                            "@cimg lc560251 cimg@ @2"+
                            "<small>Available at: http://amiexmoth.blogspot.com/2011/02/blood-donation-program.html. Access on: September 5th, 2011.</small>@2";
                    sourceString = texto+"People that are not doctors can save lives ";
                    qA = "being safe and simple. ";
                    qB = "donating blood. ";
                    qC = "studying medicine. ";
                    qD = "supporting medicine. ";
                    break;
                case 27:

                    texto = "@b TEXT 1 b@ @1" +
                            "@cimg lc560251 cimg@ @2"+
                            "<small>Available at: http://amiexmoth.blogspot.com/2011/02/blood-donation-program.html. Access on: September 5th, 2011.</small>@2";
                    sourceString = texto+"To support the Blood Donation Day you can tell people that ";
                    qA = "it hurts and leaves scars. ";
                    qB = "it’s not safe and simple. ";
                    qC = "they can save lives. ";
                    qD = "they have to be doctors. ";
                    break;

                case 28:

                    texto = "@b TEXT 2 b@ @2"+
                            "Fast food is the term given to food that can be prepared and served very quickly. While any "+
                            "meal with low preparation time can be considered to be fast food, typically the term refers to food "+
                            "sold in a restaurant or store with preheated or precooked ingredients, and served to the customer "+
                            "in a packaged form for take-out/take-away. The term “fast food” was recognized in a dictionary by "+
                            "Merriam – Webster in 1951.@1"+
                            "A typical fast food meal in the United States includes a hamburger, French fries, and a soft drink.@2"+
                            "<small>AAvailable at: http://en.wikipedia.org/wiki/Fast_food. Access on: September 4th, 2011.</small>@2";
                    sourceString = texto+"You can order fast food if you ";
                    qA = "are not hungry. ";
                    qB = "don’t have time. ";
                    qC = "don’t like food. ";
                    qD = "like to wait. ";
                    break;
                case 29:

                    texto = "@b TEXT 2 b@ @2"+
                            "Fast food is the term given to food that can be prepared and served very quickly. While any "+
                            "meal with low preparation time can be considered to be fast food, typically the term refers to food "+
                            "sold in a restaurant or store with preheated or precooked ingredients, and served to the customer "+
                            "in a packaged form for take-out/take-away. The term “fast food” was recognized in a dictionary by "+
                            "Merriam – Webster in 1951.@1"+
                            "A typical fast food meal in the United States includes a hamburger, French fries, and a soft drink.@2"+
                            "<small>AAvailable at: http://en.wikipedia.org/wiki/Fast_food. Access on: September 4th, 2011.</small>@2";
                    sourceString = texto+"The term fast food can be found in dictionaries published ";
                    qA = "after 1951. ";
                    qB = "before 1951. ";
                    qC = "in 2011. ";
                    qD = "next year. ";
                    break;
                case 30:

                    texto = "@b TEXT 2 b@ @2"+
                            "Fast food is the term given to food that can be prepared and served very quickly. While any "+
                            "meal with low preparation time can be considered to be fast food, typically the term refers to food "+
                            "sold in a restaurant or store with preheated or precooked ingredients, and served to the customer "+
                            "in a packaged form for take-out/take-away. The term “fast food” was recognized in a dictionary by "+
                            "Merriam – Webster in 1951.@1"+
                            "A typical fast food meal in the United States includes a hamburger, French fries, and a soft drink.@2"+
                            "<small>AAvailable at: http://en.wikipedia.org/wiki/Fast_food. Access on: September 4th, 2011.</small>@2";
                    sourceString = texto+"A typical fast food meal includes a hamburger, French fries and a ";
                    qA = "beverage. ";
                    qB = "dessert. ";
                    qC = "napkin. ";
                    qD = "present. ";
                    break;

            }

        }

        if (materia.equals(CHAVE_MATEMATICA)) {

            switch (indice) {

                case 1:

                    sourceString = "Observe o preço de uma mesma televisão em três lojas diferentes.@1"+
                            "@cimg mt560011 cimg@ @1"+
                            "Considerando esses preços, qual é o preço médio dessa televisão? ";
                    qA = "R$ 800,00. ";
                    qB = "R$ 810,00. ";
                    qC = "R$ 1 215,00. ";
                    qD = "R$ 2 430,00. ";
                    break;

                case 2:

                    sourceString = "Celina comprou 3 metros de tecido para fazer um vestido e 0,5 metro para fazer uma saia.@1"+
                            "@1Quantos centímetros de tecido Celina comprou, ao todo, para fazer essas duas peças de roupa? ";
                    qA = "3,5. ";
                    qB = "35. ";
                    qC = "350. ";
                    qD = "3 500. ";
                    break;
                case 3:

                    sourceString = "Veja o anúncio que estava exposto na vitrine de uma loja de bicicletas.@1"+
                            "@cimg mt560031 cimg@ @1"+
                            "Vitor comprou essa bicicleta e pagou à vista.@1"+
                            "@1Quanto Vitor pagou por essa bicicleta? ";
                    qA = "R$ 408,00. ";
                    qB = "R$ 448,00. ";
                    qC = "R$ 465,00. ";
                    qD = "R$ 480,00. ";
                    break;
                case 4:

                    sourceString = "Veja a equação abaixo.@2 "+
                            "@b x2 "+
                            " – 6x + 8 = 0 b@"+
                            "@2Quais são as raízes dessa equação? ";
                    qA = "– 6 e 8. ";
                    qB = "– 2 e – 4. ";
                    qC = "1 e 5. ";
                    qD = "2 e 4. ";
                    break;
                case 5:

                    sourceString = "A tabela abaixo apresenta dados sobre o estado nutricional de adolescentes distribuídos por sexo.@2 "+
                            "@cimg mt560051 cimg@ @1"+
                            "Considerando que o número de meninos e meninas que participou dessa pesquisa foi o mesmo, qual é o "+
                            "percentual de adolescentes com sobrepeso? ";
                    qA = "4,7%. ";
                    qB = "10,9%. ";
                    qC = "15,6%. ";
                    qD = "46,4%. ";
                    break;
                case 6:

                    sourceString = "A região Centro-Oeste do Brasil tem na agricultura uma de suas mais fortes atividades econômicas.@1"+
                            "O solo produtivo e o relevo com áreas planas facilitam a mecanização. É importante, entretanto, preservar "+
                            "a vegetação natural para reduzir o impacto ambiental da atividade agrícola.@1"+
                            "O desenho abaixo representa a área total de uma propriedade dessa região que manteve 20% de sua "+
                            "área intacta como área de preservação.@1"+
                            "@cimg mt560061 cimg@ @1"+
                            "Qual é a medida da área que foi mantida intacta nessa propriedade? ";
                    qA = "2,6 km2 ";
                    qB = "3,6 km2 ";
                    qC = "13 km2 ";
                    qD = "18 km2 ";
                    break;

                case 7:

                    sourceString = "No Brasil, utiliza-se o grau Celsius (ºC) para medir a temperatura. O grau Fahrenheit (ºF) é outra escala "+
                    "de medida de temperatura, utilizada em alguns países, como por exemplo, nos Estados Unidos.@1"+
                            "A conversão de graus Celsius para graus Fahrenheit é dada pela expressão: "+
                            "@cimg mt560071ex cimg@ @1"+
                            "@1Quando um termômetro marcar 19,4 ºF, a temperatura em graus Celsius será de ";
                    qA = "– 2,9 ºC. ";
                    qB = "– 7,0 ºC. ";
                    qC = "7,0 ºC. ";
                    qD = "7,2 ºC. ";
                    break;
                case 8:

                    sourceString = "Um geoplano é uma prancheta de madeira ou de plástico composta de pregos ou metais que formam "+
                            "uma malha quadriculada, onde é possível construir polígonos utilizando-se um elástico. Veja abaixo os "+
                            "polígonos que os amigos Ana, Maria, Marcos e Paulo construíram nos geoplanos.@1"+
                            "@cimg mt560081 cimg@ @1"+
                            "Qual desses amigos representou no geoplano um par de polígonos simétricos em relação à reta r? ";
                    qA = "Ana. ";
                    qB = "Marcos. ";
                    qC = "Maria. ";
                    qD = "Paulo. ";
                    break;
                case 9:

                    sourceString = "Sobre o perímetro, são feitas as seguintes afirmativas. Classifique-as como verdadeiras (V) ou falsas (F).@2"+
                            "( ) O perímetro de um quadrado cujo lado mede 4 centímetros é igual a 16 centímetros.@1"+
                            "( ) O perímetro de um hexágono regular cujo lado mede 2 centímetros é igual a 10 "+
                            "centímetros.@1"+
                            "( ) O perímetro de um retângulo de dimensões 2 centímetros e 5 centímetros é igual a 10 "+
                            "centímetros.@1"+
                            "( ) O perímetro de um triângulo de dimensões 3 centímetros, 4 centímetros e 5 centímetros "+
                            "é igual a 12 centímetros.@1"+
                            "@1A sequência correta dessa classificação, de cima para baixo, é ";
                    qA = "V F F V. ";
                    qB = "V F V F. ";
                    qC = "F F V V. ";
                    qD = "F V F V. ";
                    break;
                case 10:

                    sourceString = "No freezer da casa de Ana há 6 picolés de manga, 8 de chocolate e 7 de coco.@1"+
                            "@1Sabendo que Ana retirou um picolé desse freezer, qual é a probabilidade desse picolé ser de manga? ";
                    qA = "1/21.";
                    qB = "1/6.";
                    qC = "6/21.";
                    qD = "1/3.";
                    break;
                case 11:

                    sourceString = "Observe o ângulo x representado no mapa abaixo.@1 "+
                            "@cimg mt560111 cimg@ @1"+
                            "O ângulo x representado nesse mapa é ";
                    qA = "agudo. ";
                    qB = "obtuso. ";
                    qC = "raso. ";
                    qD = "reto. ";
                    break;
                case 12:

                    sourceString = "Luiza gasta 10 kg de limão para fazer 30 litros de limonada em seu restaurante.@1"+
                            "@1Mantendo essa proporção, quantos litros de limonada Luiza poderá fazer com 50 kg de limão? ";
                    qA = "50. ";
                    qB = "70. ";
                    qC = "80. ";
                    qD = "150. ";
                    break;
                case 13:

                    sourceString = "A professora de Priscila passou as quatro sentenças abaixo como dever de casa e pediu para que ela as@2 "+
                            "classificasse em verdadeiro (V) ou falso (F).@2"+
                            "I (– 3)@sp2sp@ = 9 @1" +
                            "II – 3@sp2sp@ = – 9 @1" +
                            "III (– 3)@sp2sp@ = 6 @1" +
                            "IV – 3@sp2sp@ = – 6 @2"+
                            "Sabendo que Priscila classificou corretamente, a sequência de respostas encontradas por ela para as "+
                            "sentenças I, II, III e IV, respectivamente, foi ";
                    qA = "F F V V. ";
                    qB = "F F V F. ";
                    qC = "V V F F. ";
                    qD = "V F F F. ";
                    break;
                case 14:

                    sourceString = "Antônio está construindo uma casa em formato retangular, com L metros de frente. A equação que "+
                            "relaciona a área A em m2 "+
                            ", com a medida da frente L, em metros, é @2 "+
                            "@b A(L) = L(L + 10) b@ @2 "+
                            "A área da casa de Antônio mede 119 m2 "+
                            ", então a medida da frente L é igual a ";
                    qA = "7 m. ";
                    qB = "10 m. ";
                    qC = "13 m. ";
                    qD = "17 m. ";
                    break;
                case 15:

                    sourceString = "Observe o cubo abaixo.@1 "+
                            "@cimg mt560151 cimg@ @1"+
                            "A planificação desse cubo é ";
                    qA = "@cimg mt56015a cimg@";
                    qB = "@cimg mt56015b cimg@";
                    qC = "@cimg mt56015c cimg@";
                    qD = "@cimg mt56015d cimg@";
                    break;
                case 16:

                    sourceString = "Ao medir a espessura de um livro de História, um aluno encontrou 3,5 cm.@1"+
                            "@1Esse número escrito em forma de uma fração é ";
                    qA = "2/7";
                    qB = "3/5";
                    qC = "5/3";
                    qD = "7/2";
                    break;
                case 17:

                    sourceString = "Sabe-se que:@2"+
                            "• Se a medida da área de um quadrado é A, então a medida do lado desse quadrado é dado pela raiz quadradada de A .@1"+
                            "• Se a medida do lado de um quadrado é L, então a medida da área desse quadrado é dada por L@sp2sp@"+
                            ".@2"+
                            "Com base nessas informações, observe os três quadrados abaixo.@2 "+
                            "@cimg mt560171 cimg@ @1"+
                            "@1Qual é a medida da área do quadrado III ? ";
                    qA = "20 cm2 ";
                    qB = "36 cm2 ";
                    qC = "64 cm2 ";
                    qD = "100 cm2 ";
                    break;
                case 18:

                    sourceString = "Juliana irá fazer uma festa de aniversário para sua filha. Para isso, ela foi a um bufê especializado em "+
                            "festas infantis, que oferece 2 modelos de decoração, 3 tipos de bolos e 10 tipos de doces.@1"+
                            "De quantas maneiras diferentes Juliana poderá montar a festa de sua filha, escolhendo um modelo de "+
                            "decoração, um tipo de bolo e um tipo de doce nesse bufê? ";
                    qA = "10. ";
                    qB = "15. ";
                    qC = "45. ";
                    qD = "60. ";
                    break;
                case 19:

                    sourceString = "O gráfico abaixo foi construído por Luciano para analisar o consumo de energia de sua casa nos meses "+
                            "de Janeiro a Junho desse ano.@1"+
                            "@cimg mt560191 cimg@ @1"+
                            "@1Em qual mês o consumo na casa de Luciano foi de 238 kW? ";
                    qA = "Janeiro. ";
                    qB = "Março. ";
                    qC = "Maio. ";
                    qD = "Junho. ";
                    break;
                case 20:

                    sourceString = "Uma torre de telefonia com 24 metros de altura foi construída no centro de um terreno retangular de "+
                            "dimensões 16 m x 12 m. Quatro cabos foram esticados do topo da torre até os vértices do terreno para "+
                            "fixá-la, conforme mostra a figura abaixo.@2 "+
                            "@cimg mt560201 cimg@ @1"+
                            "Qual foi a quantidade mínima de cabos utilizada nessa construção? ";
                    qA = "40 m. ";
                    qB = "56 m. ";
                    qC = "96 m. ";
                    qD = "104 m. ";
                    break;
                case 21:

                    sourceString = "Márcia recebe R$ 2 400,00 mensais. Este mês, ela usou 1/3 "+
                            "de seu salário para pagar a prestação de seu "+
                            "apartamento e 1/4 "+
                            " de seu salário para pagar uma prestação do consórcio de seu carro novo.@1"+
                            "@1Nesse mês, quanto restou do salário de Márcia após pagar essas despesas? ";
                    qA = "R$ 685,71. ";
                    qB = "R$ 1 000,00. ";
                    qC = "R$ 1 400,00. ";
                    qD = "R$ 1 714, 29. ";
                    break;
                case 22:

                    sourceString = "Com dois pedaços de arame de mesmo comprimento, Débora fez um quadrado e um triângulo equilátero, "+
                            "conforme as figuras abaixo.@2 "+
                            "@cimg mt560221 cimg@ @1"+
                            "Sabendo que foi usado todo o comprimento dos arames na confeccção das duas figuras, qual é a medida "+
                            "do lado desse triângulo? ";
                    qA = "21 cm. ";
                    qB = "63 cm. ";
                    qC = "84 cm. ";
                    qD = "189 cm. ";
                    break;
                case 23:

                    sourceString = "Em um jogo de adivinhações, foi dada a seguinte dica:@2"+
                            "• Polígono regular cuja soma dos ângulos internos é igual a 540º.@1"+
                            "@1Qual é esse polígono? ";
                    qA = "Hexágono. ";
                    qB = "Pentágono. ";
                    qC = "Quadrado. ";
                    qD = "Triângulo. ";
                    break;
                case 24:

                    sourceString = "Roberto e Lucas estão disputando um jogo no computador. Veja abaixo quantos pontos cada um deles "+
                            "tem nesse jogo.@1"+
                            "@cimg mt560241 cimg@ @1"+
                            "@1Quantos pontos Lucas tem a mais que Roberto nesse jogo? ";
                    qA = "405. ";
                    qB = "415. ";
                    qC = "2 035. ";
                    qD = "3 035. ";
                    break;
                case 25:

                    sourceString = "Uma caixa d’água em formato de bloco retangular possui as seguintes medidas internas:@2"+
                            "2 m de comprimento, 3 m de largura e 1,5 m de altura.@1"+
                            "@1Qual é a capacidade máxima, em litros, dessa caixa d’água? @1" +
                            "Dado: 1 m3  = 1 000 L";
                    qA = "6,5. ";
                    qB = "9. ";
                    qC = "6 500. ";
                    qD = "9 000. ";
                    break;

                case 26:

                    sourceString = "Vânia trabalha em uma fábrica de bolsas e recebe R$ 500,00 fixos mais R$ 2,50 por cada bolsa que ela "+
                            "confecciona. No mês de outubro, Vânia recebeu R$ 1 140,00.@1"+
                            "@1Quantas bolsas Vânia confeccionou no mês de outubro? ";
                    qA = "200. ";
                    qB = "256. ";
                    qC = "456. ";
                    qD = "640. ";
                    break;
                case 27:

                    sourceString = "Para facilitar o acesso de cadeirantes ao saguão de uma prefeitura, cuja entrada do prédio fica a uma "+
                            "altura de 2 m em relação ao solo, foi construída uma rampa com uma inclinação de 12°, como mostra o "+
                            "desenho abaixo.@2 "+
                            "@cimg mt560271 cimg@ @1"+
                            "@1Qual é a medida x, em metros, dessa rampa? ";
                    qA = "1,94 m. ";
                    qB = "2,06 m. ";
                    qC = "10 m. ";
                    qD = "12 m. ";
                    break;
                case 28:

                    sourceString = "A solução do sistema @cimg mt560281ex cimg@ é ";
                    qA = "(11,5 ; 4,5). ";
                    qB = "(7 ; 9). ";
                    qC = "(1,4 ; 14,6). ";
                    qD = "(– 57 ; 73). ";
                    break;
                case 29:

                    sourceString = "Uma indústria trabalha com 60% de sua capacidade e possui, em seu estoque, matéria-prima suficiente "+
                            "para 50 dias de produção nesse ritmo. Com o aquecimento do mercado e o aumento de pedidos, essa "+
                            "indústria passará a operar com 75% da capacidade.@1"+
                            "@1Nessas condições, esse mesmo estoque será suficiente para ";
                    qA = "40 dias. ";
                    qB = "62 dias. ";
                    qC = "65 dias. ";
                    qD = "90 dias. ";
                    break;
                case 30:

                    sourceString = "Veja abaixo o anúncio de uma sorveteria.@1 "+
                            "@cimg mt560301 cimg@ @1"+
                            "Roberta comprou um sorvete e dois picolés nessa sorveteria.@1"+
                            "@1Quanto ela pagou por essa compra? ";
                    qA = "R$ 4,30. ";
                    qB = "R$ 5,80. ";
                    qC = "R$ 7,10. ";
                    qD = "R$ 8,60. ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_DA_NATUREZA)) {

            switch (indice) {

                case 1:

                    sourceString = "A água possui diversas funções no organismo, como a quebra de açúcares presentes na alimentação.@1"+
                            "Além disso, a água também participa do ";
                    qA = "conjunto de nutrientes energéticos. ";
                    qB = "controle da temperatura corporal. ";
                    qC = "grupo de substâncias orgânicas. ";
                    qD = "processo de absorção no estômago. ";
                    break;

                case 2:

                    sourceString = "No dia a dia, as pessoas se deparam com diferentes situações. Entre elas, algumas desagradáveis, como "+
                            "aquela que faz o indivíduo correr assustado, quando está atravessando a rua ao ouvir o som de uma buzina.@1"+
                            "Graças ao sistema nervoso, a pessoa estimulada por um sinal de perigo apresenta uma reação "+
                            "caracterizada ";
                    qA = "pela queda de fluxo de sangue. ";
                    qB = "pela queda de produção do suor. ";
                    qC = "pelo aumento da atividade mental. ";
                    qD = "pelo aumento da função digestiva. ";
                    break;
                case 3:

                    sourceString = "A imagem abaixo mostra parte do sistema nervoso, sistema que é especializado em receber e interpretar "+
                            "informações do ambiente comandando as respostas que são bastante variáveis de acordo com o tipo de estímulo.@1"+
                            "@cimg cn560031 cimg@"+
                            "@1<small>Disponível em: http://www.auladeanatomia.com/neurologia/snc3.jpg. Acesso em: 2 set. 2011.</small> @2 "+
                            "Nesse sistema, o órgão responsável pela resposta de equilíbrio corporal é denominado ";
                    qA = "bulbo. ";
                    qB = "cerebelo. ";
                    qC = "diencéfalo. ";
                    qD = "telencéfalo. ";
                    break;
                case 4:

                    sourceString = "O fenótipo é o conjunto de características observáveis de um organismo. Ele resulta da interação entre o "+
                            "genótipo e o meio ambiente, podendo ser alterado frequentemente por esse último.@1"+
                            "Considere os caracteres abaixo:@2"+

                            "I. Cor da pele.@1"+
                            "II. Massa muscular.@1 "+
                            "III. Tipo de cabelo.@1 "+
                            "IV. Tipo sanguíneo.@2 "+
                            "Quais deles podem ser alterados pelo meio ambiente? ";
                    qA = "I e II, apenas. ";
                    qB = "III e IV, apenas. ";
                    qC = "I, II e III. ";
                    qD = "I, II e IV. ";
                    break;
                case 5:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Pequenos aumentos na pressão arterial frequentemente causam aumentos acentuados na "+
                            "eliminação urinária de sódio e água.@1"+
                            "@1<small>GUYTON, A.C.; HALL, J. E. Tratado de Fisiologia Médica. 11ª ed. Rio de Janeiro: Elsevier, 2006. p. 341. Adaptado.</small> @2 "+
                            "O organismo humano é formado por diversos sistemas que se integram e trabalham juntos. Uma leve "+
                            "alteração em um sistema interfere em outro. Nesse texto, os sistemas citados são o ";
                    qA = "cardiovascular e o urinário. ";
                    qB = "circulatório e o nervoso. ";
                    qC = "reprodutor e o endócrino. ";
                    qD = "respiratório e o digestório. ";
                    break;
                case 6:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "Linhaça na dieta "+
                            "Alimento rico em substâncias funcionais, essa semente é uma grande aliada para quem quer "+
                            "perder aqueles quilinhos extras. Isso porque ela contém alta taxa de vitaminas, ferro, zinco, "+
                            "ômegas 3, 6 e 9 e, principalmente, fibras solúveis, nutrientes que auxiliam na digestão e mantêm "+
                            "a boa forma.@1"+
                            "Dieta Já, nº 189, p. 8. Adaptado.@1"+
                            "@1Os nutrientes citados nesse texto são absorvidos no ";
                    qA = "estômago. ";
                    qB = "fígado. ";
                    qC = "intestino. ";
                    qD = "pâncreas. ";
                    break;
                case 7:

                    sourceString = "Leia o texto abaixo.@2 "+
                            "[...] o Maranhão vai fornecer coco babaçu para abastecer usinas termoelétricas na Alemanha.@1"+
                            "[...]@1 "+
                            "A casca do coco será exportada para a Alemanha e transformada em fonte de energia, "+
                            "substituindo o carvão. A meta é substituir, até 2015, 17 milhões de toneladas de carvão mineral, "+
                            "por cascas de coco babaçu [...].@1"+
                            "@1<small>Disponível em: http://oglobo.globo.com/cidades/mat/2009/09/22/coco-babacu-maranhense-vai-substituir-carvao-em-termoeletrica-da-  alemanha-767723660.asp.. Acesso em: 1 abr. 2011. Adaptado.</small> @2 "+
                            "Com a substituição do carvão mineral pelo coco babaçu, a Alemanha diminuirá a emissão dos gases "+
                            "dióxido de enxofre (SO2 "+
                            ") e dióxido de nitrogênio (NO2 "+
                            ") para a atmosfera.@1"+
                            "@1Que problema ambiental será amenizado com essa atitude? ";
                    qA = "Chuva ácida. ";
                    qB = "Diminuição da camada de ozônio. ";
                    qC = "Efeito estufa. ";
                    qD = "Eutrofização das águas. ";
                    break;
                case 8:

                    sourceString = "A água se encontra em muitos lugares; corrente ou represada, no ambiente natural ou nas casas. Servindo "+
                            "para a limpeza geral, para o preparo dos alimentos e, principalmente, para a ingestão, a água permite a "+
                            "vida e constitui a maior parte da composição corporal do ser humano e de outros seres vivos.@1"+
                            "@1Entre as propriedades dessa substância está a capacidade de ";
                    qA = "apresentar densidade igual a 0,0012 g/cm3 "+
                            " ao nível do mar. ";
                    qB = "dissolver substâncias como o sal, o açúcar e o óleo. ";
                    qC = "entrar em ebulição à temperatura de 100 ºC ao nível do mar. ";
                    qD = "sintetizar as proteínas para a digestão doando nitrogênio. ";
                    break;
                case 9:

                    sourceString = "Após a evaporação da água de uma chaleira, observa-se uma “fumaça” branca que é formada quando o "+
                            "vapor de água se resfria, ocorrendo uma transformação física da água.@1"+
                            "@1Essa transformação é denominada ";
                    qA = "condensação. ";
                    qB = "solidificação. ";
                    qC = "sublimação. ";
                    qD = "vaporização. ";
                    break;
                case 10:

                    sourceString = "A tricomoníase é uma doença muito comum. Embora no homem os seus sintomas sejam imperceptíveis, "+
                            "na mulher, a doença provoca corrimento e intensa coceira. Existem medicamentos capazes de eliminar o "+
                            "agente causador e que devem ser utilizados ao mesmo tempo por ambos os parceiros.@1"+
                            "@1A tricomoníase é provocada pelo micro-organismo Trichomonas vaginalis, que pertence ao grupo dos ";
                    qA = "platelmintos. ";
                    qB = "protozoários. ";
                    qC = "nematelmintos. ";
                    qD = "vírus. ";
                    break;
                case 11:

                    sourceString = "As reações de combustão são aquelas que envolvem oxigênio. Elas podem ocorrer no ambiente externo "+
                            "ou dentro do organismo. Veja a reação abaixo:@2"+
                            "@cimg cn560111 cimg@ @1"+
                            "Essa reação se caracteriza por ";
                    qA = "acontecer no interior da célula. ";
                    qB = "gastar pouco tempo para ocorrer. ";
                    qC = "ser classificada como endotérmica. ";
                    qD = "utilizar uma proteína como reagente. ";
                    break;
                case 12:

                    sourceString = "No alto de uma montanha, dois amigos aproveitavam as férias enquanto conversavam:@2"+
                            "– É, aqui estamos livres da pressão do trabalho.@1"+
                            "– É verdade. E a pressão do ar à nossa volta é menor também.@2"+
                            "A segunda fala revela uma verdade científica: a grandes altitudes, a pressão atmosférica é menor. Isso "+
                            "ocorre, porque ";
                    qA = "a quantidade de gás carbônico no alto é maior. ";
                    qB = "a quantidade de oxigênio no alto é maior. ";
                    qC = "o ar é mais rarefeito no alto da montanha. ";
                    qD = "o aumento da altitude eleva a temperatura. ";
                    break;
                case 13:

                    sourceString = "Na natureza, os materiais passam por constantes mudanças, as quais podem ou não originar um "+
                            "outro material. Quando um novo material é formado, com características distintas do original, houve "+
                            "transformação química; se não há alteração na composição do material, houve transformação física.@1"+
                            "@1Ocorrre uma transformação física ";
                    qA = "na quebra de um copo. ";
                    qB = "na queima de uma vela. ";
                    qC = "no crescimento do bolor. ";
                    qD = "no surgimento da ferrugem. ";
                    break;
                case 14:

                    sourceString = "Observe a imagem abaixo.@2 "+
                            "@cimg cn560141 cimg@"+
                            "@1<small>Disponível em: http://eideguimaraes.wordpress.com/2009/05/16/semana-internet-segura-1-vírus-worms-trojans/. Acesso em: 2 set. 2011.</small> @2 "+
                            "Diferentes daqueles encontrados no computador do aluno, os vírus encontrados no meio ambiente são "+
                            "micro-organismos ";
                    qA = "agrupados no reino Monera. ";
                    qB = "considerados parasitas obrigatórios. ";
                    qC = "formados por célula e cápsula. ";
                    qD = "portadores de núcleo sem carioteca. ";
                    break;
                case 15:

                    sourceString = "A lombriga, Ascaris lumbricoides, é um nematodo que pode ser encontrado parasitando o intestino "+
                            "humano causando uma doença conhecida como Ascaridíase.@1"+
                            "@1Uma maneira de prevenir essa doença é ";
                    qA = "andar calçado em lugares sujos. ";
                    qB = "comer carne de boi mal passada. ";
                    qC = "lavar bem as mãos e os alimentos. ";
                    qD = "retirar os vegetais da alimentação. ";
                    break;
                case 16:

                    sourceString = "Na natureza, relações estabelecidas entre seres vivos diferentes são comuns. Em um jardim, observa-se "+
                            "a beleza da abelha que suga lentamente o néctar de uma flor.@1"+
                            "@1Nessa relação, a abelha e a flor são seres vivos que ";
                    qA = "absorvem a energia luminosa e são capazes de convertê-la em energia química. ";
                    qB = "possuem muitas células revestidas externamente por uma rígida parede celular. ";
                    qC = "realizam a síntese de proteínas a partir de estruturas chamadas mitocôndrias. ";
                    qD = "são classificados como eucariontes devido à presença da membrana nuclear. ";
                    break;
                case 17:

                    sourceString = "Ambientes com aglomeração de pessoas, mal ventilados ou fechados são, muitas vezes, oportunidades "+
                            "para transmissão de doenças. Alguns micro-organismos presentes na saliva e nas secreções nasais "+
                            "infectam as pessoas através do ar após serem expelidos.@1"+
                            "@1Uma doença transmitida pelo ar é a ";
                    qA = "dengue, cujo causador é um inseto do ar. ";
                    qB = "gripe, que ataca órgãos do sistema respiratório. ";
                    qC = "rubéola, cujo transmissor é um tipo de bactéria. ";
                    qD = "toxoplasmose, que atinge o sistema cardiovascular. ";
                    break;
                case 18:

                    sourceString = "O esquema abaixo mostra a fotossíntese. Processo pelo qual a energia luminosa, o gás carbônico e a "+
                            "água são absorvidos para formar o alimento denominado glicose.@1"+
                            "@cimg cn560181 cimg@ @2"+
                            "Os seres vivos responsáveis pela realização desse processo são ";
                    qA = "consumidores na cadeia alimentar e autótrofos. ";
                    qB = "consumidores na cadeia alimentar e heterótrofos. ";
                    qC = "produtores na cadeia alimentar e autótrofos. ";
                    qD = "produtores na cadeia alimentar e heterótrofos. ";
                    break;
                case 19:

                    sourceString = "Um clima quente com estação seca rigorosa, embora chova em certas épocas do ano, é o que caracteriza "+
                            "um ambiente terrestre brasileiro, cujo aspecto da vegetação é mostrado na imagem abaixo.@2 "+
                            "@cimg cn560191 cimg@"+
                            "@1<small>Disponível em: http://olhares.uol.com. Acesso em: 2 set. 2011.</small> @2 "+
                            "Esse ambiente é denominado ";
                    qA = "caatinga. ";
                    qB = "cerrado. ";
                    qC = "floresta. ";
                    qD = "mangue. ";
                    break;
                case 20:

                    sourceString = "Testículos e ovários são órgãos do sistema genital masculino e feminino, respectivamente. No homem, os "+
                            "testículos se encontram na bolsa escrotal e na mulher, os ovários se encontram na cavidade abdominal.@1"+
                            "@1Esses órgãos estão relacionados à função de ";
                    qA = "desenvolvimento do embrião. ";
                    qB = "mobilidade de células. ";
                    qC = "produção de hormônios. ";
                    qD = "secreção de líquidos. ";
                    break;
                case 21:

                    sourceString = "A decomposição de restos de plantas e animais forma o húmus, camada superior do solo, rica em "+
                            "nutrientes. O processo de decomposição ocorre devido à ação de seres vivos presentes no solo "+
                            "denominados ";
                    qA = "bactérias e fungos. ";
                    qB = "cianobactérias e vírus. ";
                    qC = "eucariontes e autótrofos. ";
                    qD = "vírus e protozoários. ";
                    break;
                case 22:

                    sourceString = "Dentre as muitas características dos seres vivos, está a sua capacidade de se reproduzir. Quando os "+
                            "indivíduos realizam a reprodução assexuada ocorre ";
                    qA = "a formação de indivíduos idênticos ao progenitor. ";
                    qB = "a participação de dois indivíduos semelhantes. ";
                    qC = "o envolvimento de gametas no meio externo. ";
                    qD = "o processo de fecundação no interior do organismo. ";
                    break;
                case 23:

                    sourceString = "O albinismo se caracteriza pela ausência de melanina na pele, nos cabelos e nos olhos. É um caráter "+
                            "hereditário, portanto transmitido de pais para filhos.@1"+
                            "Considerando que esse caráter seja representado por dois tipos de genes:@2"+
                            "A – mais frequente, permite a fabricação de melanina.@1"+
                            "a – mais raro, causa o albinismo.@1"+
                            "@1Um casal normal (sem albinismo) pode ter um filho albino? ";
                    qA = "Não, pois o pigmento melanina será transmitido aos descendentes. ";
                    qB = "Não, se o casal é normal, não pode ter um filho com esta característica. ";
                    qC = "Sim, considerando que o albinismo é condicionado por um gene dominante. ";
                    qD = "Sim, desde que o casal seja heterozigoto para a característica citada. ";
                    break;
                case 24:

                    sourceString = "O sangue é formado por uma parte líquida, o plasma, e pelos elementos figurados constituídos pelas "+
                            "células e plaquetas. Para se fazer a separação dos seus constituintes, usa-se a técnica que acelera o "+
                            "processo de decantação denominada ";
                    qA = "catação. ";
                    qB = "centrifugação. ";
                    qC = "destilação. ";
                    qD = "filtração. ";
                    break;
                case 25:

                    sourceString = "Nas mulheres, o sistema genital passa por modificações que caracterizam fases dentro de um ciclo de, "+
                            "aproximadamente, 28 dias denominado ciclo menstrual.@1"+
                            "@1Uma dessas fases é a menstruação, que se caracteriza por ";
                    qA = "descamar os ovários após a liberação dos óvulos. ";
                    qB = "eliminar uma pequena parte da mucosa da vagina. ";
                    qC = "ocorrer devido a um aumento da taxa de hormônio. ";
                    qD = "ter seu início no primeiro dia do ciclo sexual mensal. ";
                    break;
                case 26:

                    sourceString = "O fio-terra está presente em alguns aparelhos como o chuveiro. Esse fio, geralmente de cobre, é ligado a "+
                            "uma ou mais hastes metálicas, enterradas no chão.@1"+
                            "@1O fio-terra diminui o risco de um choque elétrico, porque ";
                    qA = "a condução elétrica é interrompida considerando ser o fio um isolante. ";
                    qB = "as cargas elétricas armazenadas descem pelo fio até a terra durante o banho. ";
                    qC = "o acúmulo de cargas elétricas na estrutura do aparelho ocorre através do fio. ";
                    qD = "os aparelhos elétricos transferem para o fio a energia e o calor. ";
                    break;
                case 27:

                    sourceString = "A propagação do calor ocorre por condução, por convecção ou por irradiação. O aquecimento de uma "+
                            "colher utilizada na cozinha para mexer o alimento de uma panela no fogo ocorre por condução.@1"+
                            "@1Esse tipo de propagação se caracteriza por ";
                    qA = "contar com a participação de ondas para ocorrer. ";
                    qB = "depender de bons condutores como a borracha. ";
                    qC = "transmitir calor através do deslocamento de gases. ";
                    qD = "transmitir o calor por contato entre os objetos. ";
                    break;
                case 28:

                    sourceString = "O plástico é um dos materiais mais utilizados pela sociedade. Consequentemente, é um dos maiores "+
                            "poluentes do ambiente, fazendo-se necessárias medidas urgentes do controle de seu uso.@1"+
                            "São iniciativas que ajudam a diminuir a poluição ambiental provocada pelo uso de plásticos:@2"+

                            "I. Aumentar a queima do lixo plástico.@1"+
                            "II. Reduzir o consumo de embalagens plásticas.@1 "+
                            "III. Desenvolver tecnologias de plásticos biodegradáveis.@2 "+

                            "Estão corretas as iniciativas ";
                    qA = "I e II, apenas. ";
                    qB = "I e III, apenas. ";
                    qC = "II e III, apenas. ";
                    qD = "I, II e III. ";
                    break;
                case 29:

                    sourceString = "O Princípio da Inércia, também conhecido como Primeira Lei de Newton, diz que os corpos tendem a "+
                            "manter seu estado de movimento ou repouso, havendo alteração caso ocorra interferência de alguma "+
                            "força sobre eles.@1"+
                            "Assim, de acordo com essa Lei, se alguém está dentro de um ônibus em repouso e, de repente, o "+
                            "motorista acelera, esse indivíduo será ";
                    qA = "lançado para frente a fim de acompanhar o movimento. ";
                    qB = "mantido em seu lugar, pois o ônibus estava em repouso. ";
                    qC = "removido para fora por causa da ação da gravidade. ";
                    qD = "submetido à ação de uma força e jogado para trás. ";
                    break;
                case 30:

                    sourceString = "Os benefícios reais dos alimentos transgênicos, já disponíveis nos mercados, ainda não estão totalmente "+
                            "esclarecidos e seu uso é muito questionado. Alguns pesquisadores justificam o uso da técnica na tentativa "+
                            "de diminuir os desastres ambientais provenientes do uso de pesticidas, ao introduzirem, nas plantas, "+
                            "@1modificações em seu ";
                    qA = "conjunto de cromossomos. ";
                    qB = "grupo de ramificações. ";
                    qC = "material citoplasmático. ";
                    qD = "sistema de raízes. ";
                    break;

            }
        }

        if (materia.equals(CIENCIAS_HUMANAS)) {


            switch (indice) {

                case 1:

                    sourceString = "Veja abaixo a imagem de um botton distribuído na década de oitenta do século passado.@1 "+
                            "@cimg ch560011 cimg@"+
                            "@1<small>Disponível em: http://www.republicaonline.org.br/html/tt/tt_imagensG.asp?ind=0. Acesso em: 9 jul. 2011.</small> @2 "+
                            "Esse botton esteve associado a um movimento que lutava pela ";
                    qA = "anistia aos presos políticos do regime militar. ";
                    qB = "cassação do presidente da república. ";
                    qC = "elaboração de uma nova constituição. ";
                    qD = "implantação de eleições diretas para presidente. ";
                    break;
                case 2:

                    sourceString = "Leia o texto abaixo sobre os povos que habitavam a América, antes da chegada dos europeus.@2 "+
                            "@b Indígenas da América b@ @2"+
                            "Alguns povos eram caçadores, coletores e nômades e viviam em florestas tropicais densas e "+
                            "fechadas. Outros eram agricultores, viviam em regiões de grandes altitudes e edificavam construções "+
                            "imponentes. Astecas, Olmecas, Incas, Caraíbas, Tupinambás, Tamoios, Cheyennes, Siouxs, "+
                            "Comanches, entre outros, eram algumas das centenas de representantes das culturas pré-colombiana.@1"+
                            "Entretanto é comum utilizar a expressão “índios” a todas as culturas e habitantes da América "+
                            "antes da chegada dos europeus. Trata-se de um nome generalizante que não consegue traduzir "+
                            "a complexidade e a diversidade dessas culturas.@1"+
                            " CABRINI, Conceição. História Temática: diversidade cultural e conflitos. São Paulo: Scipione, 2004, p. 78.@1"+
                            "@1De acordo com o texto, esses povos ";
                    qA = "adotavam as mesmas práticas econômicas. ";
                    qB = "construíam os mesmos tipos de edificações. ";
                    qC = "eram diferentes culturalmente. ";
                    qD = "eram superiores aos europeus. ";
                    break;
                case 3:

                    sourceString = "Leia o texto abaixo sobre o Tenentismo no Brasil.@2 "+
                            "Influenciados pelos anseios políticos das populações urbanas, os militares envolvidos nesse "+
                            "movimento se mostraram favoráveis às tendências políticas republicanas liberais. Entre outros "+
                            "pontos, reivindicavam uma reforma constitucional capaz de trazer critérios mais justos ao cenário "+
                            "político nacional. Exigiam que o processo eleitoral fosse feito com o uso do voto secreto e "+
                            "criticavam os vários episódios de fraude e corrupção que marcavam as eleições.@1"+
                            "@1<small>Disponível em: http://www.brasilescola.com/historiab/tenentismo.htm. Acesso em: 9 jul. 2011.</small> @2 "+
                            "De acordo com esse texto, o Tenentismo ";
                    qA = "defendia a implantação de uma ditadura. ";
                    qB = "era composto pela elite. ";
                    qC = "era influenciado pelo comunismo. ";
                    qD = "se opunha à política oligárquica. ";
                    break;
                case 4:

                    sourceString = "Leia o texto abaixo sobre a produção de açúcar na América Portuguesa.@2 "+
                            "A produção do açúcar era uma atividade complexa, que envolvia um grande volume de "+
                            "recursos. Não bastava plantar as mudas de cana trazidas da Ásia e da África, colher e enviá-las "+
                            "a Portugal depois de cultivadas. Inúmeras atividades exigiam a aplicação de imensos capitais, "+
                            "tanto para a compra de escravos como para a compra dos equipamentos dos engenhos, onde se "+
                            "moía a cana e se fabricava o açúcar.@1"+
                            "@1<small>VICENTINO, Claúdio. Viver a História. São Paulo: Scipione, 2002, p. 251.</small> @2 "+
                            "Essa atividade, na América Portuguesa, esteve associada à região ";
                    qA = "Centro-Oeste. ";
                    qB = "Nordeste. ";
                    qC = "Norte. ";
                    qD = "Sul. ";
                    break;
                case 5:

                    sourceString = "Leia abaixo o trecho da carta testamento de Getúlio Vargas.@2 "+
                            "@b Carta Testamento b@ @1"+
                            "Tenho lutado mês a mês, dia a dia, hora a hora, resistindo a uma pressão constante, incessante, "+
                            "tudo suportando em silêncio, tudo esquecendo, renunciando a mim mesmo, para defender o "+
                            "povo, que agora se queda desamparado. Nada mais vos posso dar, a não ser meu sangue. Se "+
                            "as aves de rapina querem o sangue de alguém, querem continuar sugando o povo brasileiro, eu "+
                            "ofereço em holocausto a minha vida. [...] "+
                            "@2<small>Disponível em: http://www.culturabrasil.org/cartatestamento.htm. Acesso em: 9 jul. 2011.</small> @2 "+
                            "Nessa carta, observa-se características da política ";
                    qA = "comunista. ";
                    qB = "desenvolvimentista. ";
                    qC = "fascista. ";
                    qD = "populista. ";
                    break;
                case 6:

                    sourceString = "Leia o texto abaixo sobre os bandeirantes.@2 "+
                            "Os bandeirantes paulistas, em suas expedições de caça aos indígenas ou à procura de riquezas "+
                            "minerais, conheceram novas terras e ajudaram Portugal a se apossar do sul e centro-oeste da colônia.@1"+
                            "@1<small>VICENTINO, Claúdio. Viver a História. São Paulo: Scipione, 2002, p. 272.</small> @2 "+
                            "De acordo com esse texto, os bandeirantes ";
                    qA = "ajudaram a ocupar o interior da colônia. ";
                    qB = "consideraram o Tratado de Tordesilhas. ";
                    qC = "melhoraram a relação entre índios e europeus. ";
                    qD = "respeitaram a cultura indígena. ";
                    break;
                case 7:

                    sourceString = "Leia o texto abaixo sobre o pacto colonial entre Brasil e Portugal.@2 "+
                            "Um dos itens mais importantes do pacto colonial determinava que a colônia só poderia manter "+
                            "relações com a metrópole. Assim, era Portugal quem estabelecia os preços de compra de produtos "+
                            "agrícolas coloniais brasileiros, sempre muito inferiores aos que alcançariam se fossem vendidos "+
                            "no mercado livre europeu.@1"+
                            "@1<small>CABRINI, Conceição. História Temática: diversidade cultural e conflitos. São Paulo: Scipione, 2004, p. 129.</small> @2 "+
                            "Segundo esse texto, a relação entre Brasil e Portugal era baseada ";
                    qA = "na limitação do poder de Portugal sobre o Brasil. ";
                    qB = "na planificação da economia da metrópole. ";
                    qC = "no emprego de práticas liberais na colônia. ";
                    qD = "no monopólio comercial da colônia com a metrópole. ";
                    break;
                case 8:

                    sourceString = "Leia o texto abaixo sobre a Guerra da Cisplatina.@2 "+
                            "Entre 1825 e 1828, o governo brasileiro declarou guerra contra os revolucionários em um conflito "+
                            "que provocou um sério esvaziamento dos cofres brasileiros. Além disso, as autoridades imperiais "+
                            "realizaram o recrutamento forçado de vários populares que buscavam uma vida melhor após a "+
                            "independência. Em pouco tempo, os ataques políticos contra Dom Pedro I eram cada vez mais "+
                            "contundentes. As derrotas sucessivas nos campos de batalha e a necessidade de se contrair novas "+
                            "dívidas mostraram que a opção pela guerra era completamente equivocada. Por fim, em 1828, os "+
                            "revolucionários vitoriosos conseguiram estabelecer a República Oriental do Uruguai. Colocando "+
                            "a nação derrotada e afundada em dívidas, a autoridade de Dom Pedro I foi criticada por jornais e "+
                            "personalidades políticas que questionavam sua autoridade frente ao trono brasileiro.@1"+
                            "@1<small>Disponível em: http://guerras.brasilescola.com/seculo-xvi-xix/guerra-cisplatina.htm. Acesso em: 10 jul. 2011.</small> @2 "+
                            "A Guerra da Cisplatina ";
                    qA = "aumentou a popularidade de D. Pedro I. ";
                    qB = "gerou problemas econômicos para o Brasil. ";
                    qC = "representou o fortalecimento do império brasileiro. ";
                    qD = "teve como consequência a independência do Brasil. ";
                    break;
                case 9:

                    sourceString = "Em 1822, o Brasil ficou independente de Portugal e foi instalado o regime monárquico. Sobre esse regime "+
                            "no Brasil, são feitas as seguintes afirmativas. Classifique-as como verdadeiras (V) ou falsas (F).@2"+
                            "( ) O poder era hereditário.@1"+
                            "( ) Existiam quatro poderes.@1"+
                            "( ) Existiram dois imperadores.@1"+
                            "( ) O mando do imperador era limitado pelo poder Moderador.@1"+
                            "@1A sequência correta dessa classificação, de cima para baixo, é ";
                    qA = "V, V, V, V. ";
                    qB = "F, F, F, F. ";
                    qC = "V, V, V, F. ";
                    qD = "F, F, F, V. ";
                    break;
                case 10:

                    sourceString = "Leia o texto abaixo sobre a Revolução Chinesa.@2 "+
                            "Sob a liderança de Mao Tsé-tung, os chineses reorganizaram o país com a orientação expressa "+
                            "do ideário comunista. O novo governo traçou um plano econômico quinquenal que pretendia "+
                            "impulsionar a agricultura e a indústria. Paralelamente, as tropas comunistas impuseram uma "+
                            "terrível perseguição contra todos aqueles que não aderiram às políticas revolucionárias. No plano "+
                            "político internacional, os chineses optaram pela formação de um Estado socialista independente "+
                            "da orientação soviética.@1"+
                            "@1<small>Disponível em: http://www.brasilescola.com/historiag/revolucao-chinesa.htm. Acesso em: 10 jul. 2011.</small> @2 "+
                            "A China, após a revolução, adotou um regime caracterizado pelo ";
                    qA = "apoio internacional. ";
                    qB = "autoritarismo. ";
                    qC = "liberalismo econômico. ";
                    qD = "monarquismo. ";
                    break;
                case 11:

                    sourceString = "Leia o texto abaixo sobre um movimento de resistência dos trabalhadores durante a Revolução Industrial.@2 "+
                            "Os operários não aceitaram passivamente as péssimas condições de trabalho das fábricas. Eles "+
                            "consideravam que a mecanização era responsável pela falta de trabalho e por isso destruíam máquinas.@1"+
                            "@1<small>BOULOS JR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 3, p. 126.</small> @2 "+
                            "Esse movimento ficou conhecido como ";
                    qA = "Anarquismo. ";
                    qB = "Cartismo. ";
                    qC = "Ludismo. ";
                    qD = "Socialismo. ";
                    break;
                case 12:

                    sourceString = "Leia o texto abaixo sobre a Ação Integralista Brasileira.@2 "+
                            "Os integralistas fundaram em 1932 a Ação Integralista Brasileira (AIB), uma organização política "+
                            "que defendia um governo autoritário dirigido por um chefe e um partido único. Defendia ainda o "+
                            "predomínio dos interesses da nação sobre os indivíduos, o uso da violência contra adversários "+
                            "políticos, especialmente contra os comunistas, e a censura aos meios de comunicação.@1"+
                            "@1<small>BOULOS JR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, v. 3, p. 128.</small> @2 "+
                            "Segundo esse texto, os integralistas ";
                    qA = "eram adeptos do entreguismo econômico. ";
                    qB = "eram influenciados pela ideologia fascista. ";
                    qC = "queriam a formação de um governo popular. ";
                    qD = "queriam um Estado de caráter liberal. ";
                    break;
                case 13:

                    sourceString = "Leia o texto abaixo sobre a Revolução Russa, ocorrida em 1917.@2 "+
                            "A luta estava declarada. O Governo Provisório foi deposto e os Bolchevistas assumiram o poder.@1"+
                            "No entanto, essa era apenas a primeira etapa, pois, agora, não se tratava de uma simples tomada "+
                            "de poder por um novo grupo. Os homens que tomaram o poder em 1917 procuraram, em atos e "+
                            "palavras, criar um novo tipo de sociedade que apenas existia na mente de seus adeptos até então.@1"+
                            "No resto do mundo, a amplitude do fenômeno só foi totalmente compreendida no pós-guerra.@1"+
                            "@1<small>Disponível em: http://www.culturabrasil.pro.br/revolucaorussa.htm. Acesso em: 10 jan. 2010.</small> @2 "+
                            "Essa revolução implantou na Rússia o regime ";
                    qA = "absolutista. ";
                    qB = "anarquista. ";
                    qC = "czarista. ";
                    qD = "socialista. ";
                    break;
                case 14:

                    sourceString = "Veja o esquema abaixo sobre a relação entre as colônias de exploração e suas metrópoles.@2 "+
                            "@cimg ch560141 cimg@"+
                            "@1<small>Disponível em: http://2.bp.blogspot.com/_acpXnWVXBHo/SqJvRnavnKI/AAAAAAAAAF4/tm5Qh_DTL9E/. Acesso em: 12 jan. 2011.</small> @2 "+
                            "Sobre a relação entre as colônias de exploração e suas metrópoles, são feitas as seguintes afirmativas.@1"+
                            "I. A metrópole vendia à sua colônia matérias-primas.@1"+
                            "II. A colônia vendia à sua metrópole gêneros tropicais. @1 "+
                            "III. A colônia só poderia vender seus produtos à sua metrópole.@1 "+
                            "IV. A metrópole só poderia vender seus produtos à sua colônia.@2 "+
                            "São corretas apenas as afirmativas ";
                    qA = "I e II. ";
                    qB = "III e IV. ";
                    qC = "II e III. ";
                    qD = "I e IV. ";
                    break;
                case 15:

                    sourceString = "Leia abaixo o texto sobre a Constituição Cidadã, promulgada em 1988.@2 "+
                            "Para dar uma base legal ao processo de democratização, os deputados e senadores eleitos "+
                            "em 1986 formaram o Congresso Constituinte, que discutiu e aprovou uma nova Constituição para "+
                            "o país. Os Constituintes trabalharam um ano e oito meses discutindo os projetos e recebendo "+
                            "sugestões dos diferentes movimentos e grupos sociais.@1"+
                            " BOULOS JR, Alfredo. Coleção história: sociedade & cidadania. São Paulo: FTD, 2004.@1"+
                            "@1A atual Constituição assegura ";
                    qA = "a censura aos jornais e revistas. ";
                    qB = "a demarcação das terras indígenas. ";
                    qC = "o bipartidarismo político. ";
                    qD = "o fortalecimento do poder executivo. ";
                    break;
                case 16:

                    sourceString = "As fotografias abaixo mostram a Avenida Rio Branco, em Juiz de Fora - MG, em datas diferentes.@2 "+
                            "@cimg ch560161 cimg@"+
                            "@2<small>Disponível em: http://www.tramz.com/br/ch/ch1.html. Acesso "+
                            "em: 10 jul. 2011.</small> @2"+
                            "@cimg ch560162 cimg@"+
                            "@1<small>Disponível em: http://www.portaldoturismo.pjf.mg.gov.br/ informacoes_teis. php. Acesso em: 10 jul. 2011.</small> @2 "+
                            "O espaço urbano sofreu mudanças, que promoveram a ";
                    qA = "ampliação do setor primário da economia. ";
                    qB = "introdução de novos meios de transporte. ";
                    qC = "preservação dos imóveis mais antigos. ";
                    qD = "valorização das áreas verdes da avenida. ";
                    break;
                case 17:

                    sourceString = "Leia o texto abaixo que define os termos de território e territorialidade.@2 "+
                            "Os conceitos de território e territorialidade estão interligados. O território é o espaço que sofre "+
                            "o domínio de vários agentes (políticos, econômicos e sociais), e à forma como eles moldaram a "+
                            "organização desse território chamamos territorialidade.@1"+
                            "@1<small>Disponível em: http://geopoliticatocolando.blogspot.com/2010/04/fronteira-territorio-e-territorialidade.html. Acesso em: 12 jul. 2011. Adaptado.</small> @2 "+
                            "Os vereadores, que são um dos agentes políticos, interferem no território ao ";
                    qA = "cobrarem impostos. ";
                    qB = "construírem casas. ";
                    qC = "elaborarem leis. ";
                    qD = "fecharem clubes. ";
                    break;
                case 18:

                    sourceString = "Leia o texto abaixo que aponta o resultado de uma pesquisa.@2 "+
                            "A pesquisa “A geração interativa na Ibero-América”, realizada em 900 escolas públicas e privadas "+
                            "de sete países da América Latina (Brasil, Colômbia, Chile, Argentina, México, Peru e Venezuela), "+
                            "concluiu que, para a maioria dos 25 mil estudantes entrevistados, o computador, celular, videogame "+
                            "e a TV significam diversão e que ainda são pouco usados com função educativa.@1"+
                            "@1<small>Disponível em: http://educarparacrescer.abril.com.br/comportamento/geracao-interativa-427328.shtml. Acesso em: 9 jul. 2011. Adaptado.</small> @2 "+
                            "O resultado dessa pesquisa demonstra a mundialização de um fenômeno ";
                    qA = "comercial. ";
                    qB = "econômico. ";
                    qC = "político. ";
                    qD = "tecnológico. ";
                    break;
                case 19:

                    sourceString = "Observe as imagens abaixo.@2 "+
                            "@cimg ch560191 cimg@"+
                            "@1<small>Disponível em: http://remadas.blogspot.com/2009/06/rafting-. Acesso em: 9 jul. 2011.</small> @2 "+
                            "@cimg ch560192 cimg@"+

                            "@1<small>Disponível em: http://www.rj.gov.br/web/imprensa/exibeconteudo?articleid=415555. "+
                            "Acesso em: 9 jul. 2011.</small> @1"+
                            "@1Essas imagens apresentam ";
                    qA = "as ações que preservam o ambiente. ";
                    qB = "as diferenças do espaço geoeconômico. ";
                    qC = "o lazer em áreas urbanas e rurais. ";
                    qD = "o trabalho como forma de inclusão. ";
                    break;
                case 20:

                    sourceString = "Leia o texto abaixo relacionado às metrópoles brasileiras.@2 "+
                            "Uma das características mais marcantes das metrópoles brasileiras é a segregação espacial das "+
                            "classes sociais em áreas distintas da cidade. Basta uma volta pela cidade – e nem precisa ser uma "+
                            "metrópole – para constatar a diferenciação entre os bairros.@1"+
                            "@1<small>Disponível em: http://urbanidades.arq.br/2009/05/segregacao-espacial-urbana/. Acesso em: 12 jul. 2011. Adaptado.</small> @2 "+
                            "A segregação espacial pode contribuir para o aumento da ";
                    qA = "concentração fundiária. ";
                    qB = "poluição atmosférica. ";
                    qC = "população desempregada. ";
                    qD = "violência urbana. ";
                    break;
                case 21:

                    sourceString = "O gráfico abaixo apresenta o crescimento da população brasileira.@2 "+
                            "@cimg ch560211 cimg@"+
                            "@1<small>Disponível em: http://www.potencialpesquisas.com/downloads/Crescimento_da_Populacao_brasilerira.pdf. Acesso em: 8 jul. 2011.</small> @2 "+
                            "Esses dados indicam que o crescimento populacional foi maior entre os anos ";
                    qA = "1960 e 1970. ";
                    qB = "1980 e 1990. ";
                    qC = "1990 e 2000. ";
                    qD = "2000 e 2010. ";
                    break;
                case 22:

                    sourceString = "Leia o texto abaixo que apresenta uma maneira de regionalizar o mundo.@2 "+
                            "Apesar de todas as interações e semelhanças entre as regiões do mundo ainda é possível "+
                            "regionalizá-lo. Línguas, religiões, hábitos e costumes dividem o mundo de maneira muito rica. Cada "+
                            "sociedade se adapta de forma diferente, cada um encontra suas próprias soluções para a questão "+
                            "da sobrevivência. O que cria essa variedade? A cultura! "+
                            "@2<small>Disponível em: http://jogligidel.tripod.com/regionalizacao.html. Acesso em: 13 jul. 2011. Adaptado.</small> @2 "+
                            "A primeira grande divisão do mundo em regiões culturais é aquela que distingue ";
                    qA = "Centro e Periferia. ";
                    qB = "Norte e Sul. ";
                    qC = "Oriente e Ocidente. ";
                    qD = "Ricos e Pobres. ";
                    break;
                case 23:

                    sourceString = "Observe as imagens abaixo que apresentam paisagens urbanas.@2 "+
                            "@cimg ch560231 cimg@"+
                            "@1Os elementos representados nessas paisagens conferem ao local sua identidade ";
                    qA = "ambiental. ";
                    qB = "cultural. ";
                    qC = "política. ";
                    qD = "tecnológica. ";
                    break;
                case 24:

                    sourceString = "Leia o texto abaixo que trata da guerra fiscal no Brasil.@2 "+
                            "Uma das questões em pauta no atual cenário político brasileiro é a chamada guerra fiscal. Trata-se "+
                            "de um jogo de ações e reações travado entre governos estaduais (e adicionalmente entre governos "+
                            "municipais) com o intuito de atrair investimentos privados ou de retê-los em seus territórios.@1"+
                            "@1<small>Disponível em: http://www.scielo.br/pdf/rsocp/n18/10704.pdf. Acesso em: 11 jul. 2011.</small> @2 "+
                            "A disputa por atrair mais investimentos decorre ";
                    qA = "da defasagem tecnológica da indústria nacional. ";
                    qB = "da importação de produtos manufaturados. ";
                    qC = "das desigualdades regionais brasileiras. ";
                    qD = "das diferenças de produtividade da agricultura. ";
                    break;
                case 25:

                    sourceString = "Leia o texto abaixo referente à Terceira Revolução Industrial.@2 "+
                            "A partir da segunda metade do século XX, inicia-se uma nova fase de processos tecnológicos, "+
                            "decorrentes de uma integração física entre ciência e produção, denominada Terceira Revolução "+
                            "Industrial ou Revolução Tecnocientífica. Como resultado, temos a aplicação quase imediata das "+
                            "descobertas científicas no processo produtivo. Esse fato proporcionou a ascensão das atividades "+
                            "que empregam alta tecnologia em sua produção.@1"+
                            "@1<small>Disponível em: http://comunicacao8h.blogspot.com/2008/04/partir-da-segunda-metade-do-sculo-xx.html. Acesso em: 13 jul. 2011.</small> @2 "+
                            "Na Terceira Revolução Industrial, destaca-se a ";
                    qA = "indústria artesanal. ";
                    qB = "pesquisa científica. ";
                    qC = "produção de energia. ";
                    qD = "utilização de máquinas. ";
                    break;
                case 26:

                    sourceString = "Observe o cartograma abaixo.@2 "+
                            "@cimg ch560261 cimg@"+
                            "@1<small>Disponível em: http://4.bp.blogspot.com/_nUk_xZ-aeWM/S2jQSQQ0gKI/AAAAAAAAA-s/duwpGPqRyWM/s1600-h/F1.large.jpg. Acesso em:"+
                            "11 jul. 2011. Adaptado </small> @2"+
                            "Nesse cartograma, as linhas que ligam os continentes representam ";
                    qA = "a área de prática da pesca comercial. ";
                    qB = "a trajetória dos satélites artificiais. ";
                    qC = "o fluxo do transporte marítimo. ";
                    qD = "o percurso das correntes marítimas. ";
                    break;
                case 27:

                    sourceString = "O texto abaixo fala sobre uma lei que regulamenta a melhor convivência das pessoas em Belo Horizonte - MG.@2 "+
                            "Um conjunto de normas, que regulam a utilização do espaço urbano pelos cidadãos, foi "+
                            "regulamentada em Belo Horizonte, em 2010. A utilização de passeios públicos, a instalação de "+
                            "mobiliário urbano, o exercício de atividades profissionais ao ar livre e a instalação de faixas e cartazes "+
                            "de publicidade em locais públicos são alguns dos itens contemplados pelo regulamento municipal.@1"+
                            "@1<small>Disponível em: http://portalpbh.pbh.gov.br/pbh/ecp/comunidade.do?evento=portlet&pIdPlcecpTaxonomiaMenu Portal&app=legislacao &tax=12157&lang=pt_BR&pg=6480&taxp=0&. Acesso em: 10 jul. 2011. Adaptado.</small> @2 "+
                            "Essa lei é o ";
                    qA = "Código de Posturas. ";
                    qB = "Estatuto da Cidade. ";
                    qC = "Plano Diretor. ";
                    qD = "Projeto Urbanísitico. ";
                    break;
                case 28:

                    sourceString = "Leia o texto abaixo que apresenta um problema do mundo atual.@2 "+
                            "O planeta está chegando num ponto cada vez mais crítico, observando-se que não pode "+
                            "ser mantida a lógica prevalecente de aumento constante do consumo. Já se verificam os seus "+
                            "impactos no plano ecológico global.@1"+
                            "Sabe-se que se trata de um tema muito complexo, pois as possibilidades de fixar limites são "+
                            "politicamente problemáticas, em qualquer parte do planeta.@1"+
                            "A exploração crescente dos recursos naturais dessa maneira coloca em risco as condições "+
                            "físicas de vida na Terra, na medida em que a economia capitalista exige um nível e tipo de "+
                            "produção e consumo que são ambientalmente insustentáveis.@1"+
                            "@1<small>Disponível em: http://www.scielo.br/scielo.php?script=sci_arttext&pid=S1414-753X2006000100010. Acesso em: 11 jul. 2011. Adaptado.</small> @2 "+
                            "Os recursos naturais estão em risco devido ";
                    qA = "a reengenharia. ";
                    qB = "a teconologia. ";
                    qC = "ao consumismo. ";
                    qD = "ao intemperismo. ";
                    break;
                case 29:

                    sourceString = "Leia o texto abaixo sobre a Agenda 21.@2 "+
                            "Agenda 21 é um plano de ação formulado internacionalmente para ser adotado em escala "+
                            "global, nacional e local por organizações do sistema das Nações Unidas, pelos governos e pela "+
                            "sociedade civil, em todas as áreas em que a ação humana gera impactos ao meio ambiente.@1"+
                            "@1<small>Disponível em: http://www.institutoatkwhh.org.br/compendio/?q=node/21. Acesso em: 9 jul. 2011.</small> @2 "+
                            "Uma das diretrizes desse plano de ação é ";
                    qA = "combater a prática do desmatamento. ";
                    qB = "impedir o crescimento populacional. ";
                    qC = "limitar o número de unidades industriais. ";
                    qD = "proibir a utilização da biotecnologia. ";
                    break;
                case 30:

                    sourceString = "Leia o texto abaixo que apresenta um dos problemas ambientais urbanos.@2 "+
                            "A poluição gerada nas cidades são resultado, principalmente, da queima de combustíveis "+
                            "fósseis como, por exemplo, carvão mineral e derivados do petróleo (gasolina e diesel). A queima "+
                            "desses produtos tem lançado uma grande quantidade de monóxido de carbono e dióxido de "+
                            "carbono (gás carbônico) na atmosfera.@1"+
                            "@1<small>Disponível em: http://pt.wikipedia.org/wiki/Problemas_ambientais_no_Brasil Acesso em: 10 jul. 2011. Adaptado.</small> @2 "+
                            "De acordo com esse texto, há uma relação entre problemas ambientais e ";
                    qA = "a extração de minerais. ";
                    qB = "a ocorrência de epidemias. ";
                    qC = "o descaso da prefeitura. ";
                    qD = "o uso de automóveis. ";
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