package com.glapps.mobile.japasseiencceja.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

import com.glapps.mobile.japasseiencceja.Adapter.MyExpandleAdapter;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.helper.Background;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Info extends AppCompatActivity {

    //------- Binder View ---------//
    @BindView(R.id.elv_lista)
    ExpandableListView elvLista;
    @BindView(R.id.MLL_info)
    LinearLayout MLLInfo;
    //-----------------------------//
    private final String KEY_EXAMES = "Exame";
    private final String KEY_INSCRICOES = "Inscrições";
    private final String KEY_ATENDIMENTO = "Atendimentos";
    private final String KEY_SENHA = "Senhas";
    private final String KEY_APLICACAO = "Aplicação da Prova";
    private final String KEY_DOCUMENTACAO = "Documentos de Identificação";
    private final String KEY_OBJETOS = "Objetos não permitidos";
    private final String KEY_CORRECAO = "Correção das Provas";
    private final String KEY_DIVULGACAO = "Divulgação dos Resultados";
    private final String KEY_UTILIZACAO = "Utilização dos Resultados";
    Background background;
    MyExpandleAdapter expandableadapter;
    ExpandableListView expandableListView;
    List<String> headers;
    HashMap<String, List<String>> headeritems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);
        configuracoesIniciais();

        setTitle("JaPassei ENCCEJA - INFORMAÇÕES");
        goToInfo();
        //prepareDummyData();
        expandableListView = (ExpandableListView) findViewById(R.id.elv_lista);
        expandableadapter = new MyExpandleAdapter(this, headers, headeritems);
        expandableListView.setAdapter(expandableadapter);
    }



    private void goToInfo() {
        headers = new ArrayList<String>();
        headeritems = new HashMap<String, List<String>>();

        //adding headers
        headers.add("Quando a prova do Encceja será realizada?"); //1
        headers.add("Quando será liberado o resultado?"); //2
        headers.add("Quem pode fazer a prova?"); //3
        headers.add("Quais os documentos obrigatórios?"); //4
        headers.add("Qual o site para fazer a inscrição?"); //5
        headers.add("Qual conteúdo será cobrado? O que o aluno deve estudar?"); //6
        headers.add("Como será a prova?"); //7
        headers.add("Qual a pontuação mínima para ser aprovado?"); //8
        headers.add("Não terminei o ensino fundamental, posso fazer a prova do ensino médio?"); //9
        headers.add("O diploma será concedido pelo governo federal?"); //10
        headers.add("Quem mora no exterior pode fazer a prova?"); //11
        headers.add("Como vai funcionar o Encceja para pessoas privadas de liberdade?"); //12
        headers.add("Posso ser atendido(a) pelo meu nome social?"); //13


        //preparing header items data

        List<String> item0 = new ArrayList<String>();
        item0.add("05/08/2018 (ENCCEJA REGULAR)");

        List<String> item1 = new ArrayList<String>();
        item1.add("Início de outubro de 2018");

        List<String> item2 = new ArrayList<String>();
        item2.add("A partir de 15 anos para tentar o diploma do ensino fundamental; e a partir de 18 anos para tentar o diploma do ensino médio.");

        List<String> item3 = new ArrayList<String>();
        item3.add("O interessado deverá informar o número do seu Cadastro de Pessoa Física (CPF) e o número da sua Cédula de Identidade. No caso de pessoas privadas de liberdade e jovens sob medida socioeducativa, o Responsável Pedagógico deve informar, no ato da inscrição, o número do Cadastro de Pessoa Física (CPF) do interessado, documento obrigatório para a efetivação da inscrição.");

        List<String> item4 = new ArrayList<String>();
        item4.add("O endereço do portal oficial para inscrições ainda não foi divulgado. Atualmente, o Inep mantém informações sobre o exame no endereço: http://portal.inep.gov.br/encceja");

        List<String> item5 = new ArrayList<String>();
        item5.add("Segundo o MEC, cada área do conhecimento tem uma Matriz de Referência composta por 30 habilidades. As áreas do conhecimento foram estabelecidas a partir do currículo da Base Nacional Comum, de acordo com os Parâmetros Curriculares Nacionais (PCN's).");

        List<String> item6 = new ArrayList<String>();
        item6.add("Cada prova é composta por uma redação e por 30 questões para cada nível de conhecimento, somando 120 questões. As questões serão do tipo múltipla escolha com quatro alternativas de resposta.\n" +
                "A prova do ensino fundamental terá, pela manhã, ciências naturais, história e geografia. À tarde, lingua portuguesa, língua estrangeira moderna, artes, educação física e redação; e matemática.\n" +
                "Já a prova do ensino médio terá, pela manhã, ciências da natureza e ciencias humanas. Durante a tarde são aplicadas as provas de linguagens e códigos, redação e matemática.");

        List<String> item7 = new ArrayList<String>();
        item7.add("Para obter a certificação, o participante deverá alcançar em cada uma das provas objetivas do Exame no mínimo o nível 100 (cem), em uma escala de proficiência que varia do nível 60 (sessenta) ao nível 180 (cento e oitenta).");

        List<String> item8 = new ArrayList<String>();
        item8.add("Candidatos que tenham realizado 18 anos até o dia da prova que não têm o diploma do ensino fundamental podem prestar diretamente o Encceja para o diploma do ensino médio. \n" +
                "Se o candidato for menor de 18 anos, entretanto maior que 15 anos, ele poderá presta somento o Encceja para o diploma do ensino fundamental.");

        List<String> item9 = new ArrayList<String>();
        item9.add("Não. O Inep é responsável por elaborar e aplicar a prova. A confecção dos diplomas ficará a cargo das secretarias estaduais.");

        List<String> item10 = new ArrayList<String>();
        item10.add("Candidatos que moram no exterior também terão a oportunidade de fazer a prova, que será aplicada em 10 de setembro em 10 países diferentes. A aplicação será entre 11 e 22 de setembro na Guiana Francesa (Caiena) e no Japão (Tóquio).\n" +
                "Em 10 de setembro as provas serão aplicadas nos seguintes locais: Estados Unidos (Boston e New York), Bélgica (Bruxelas), Guiana Francesa (Caiena), Portugal (Lisboa), Suíça (Genebra), Espanha (Madri), Reino Unido (Londres), França (Paris), Japão (Nagóia, Hamamatsu e Ota), Holanda (Amsterdã).");

        List<String> item11 = new ArrayList<String>();
        item11.add("Ele segue o mesmo padrão, mas tem cronograma distinto.\n" +
                "O edital sai em 7 de agosto, as unidades terão entre 14 e 25 de agosto para aderir. As inscrições serão de 21 de agosto a 1º de setembro, enquanto a aplicaçãoserá em 24 e 25 de outubro");

        List<String> item12 = new ArrayList<String>();
        item12.add("Sim! \n" +
                "O PARTICIPANTE travesti ou transexual (pessoa que se " +
                "identifica e quer ser reconhecido(a) socialmente em consonância com sua " +
                "identidade de gênero) que após realizar sua inscrição desejar atendimento " +
                "pelo NOME SOCIAL poderá solicitá-lo somente na Página do Participante, " +
                "http://enccejanacional.inep.gov.br/encceja/#!/loginParticipante" +
                ", no período de 21/08/2017 a 25/08/2017 para análise e deferimento. \n\n" +
                "" +
                "O PARTICIPANTE deve dispor de documentos comprobatórios " +
                "da condição que motiva a solicitação de atendimento pelo " +
                "NOME SOCIAL, quais sejam:\n" +
                "a) fotografia atual, individual, colorida, com fundo branco, " +
                "da cabeça e do tronco sendo que a cabeça deverá estar descoberta;\n" +
                "b) cópia digitalizada de um dos documentos de identificação " +
                "oficial com foto;\n" +
                "c) cópia assinada e digitalizada do formulário de solicitação " +
                "de atendimento pelo NOME SOCIAL disponibilizado na Página do " +
                "Participante: http://enccejanacional.inep.gov.br/encceja/#!/loginParticipante, " +
                "das 10h do dia 21/08/2017 às 23h59min do dia " +
                "25/08/2017.");


        //contain header and header items
        headeritems.put(headers.get(0), item0);
        headeritems.put(headers.get(1), item1);
        headeritems.put(headers.get(2), item2);
        headeritems.put(headers.get(3), item3);
        headeritems.put(headers.get(4), item4);
        headeritems.put(headers.get(5), item5);
        headeritems.put(headers.get(6), item6);
        headeritems.put(headers.get(7), item7);
        headeritems.put(headers.get(8), item8);
        headeritems.put(headers.get(9), item9);
        headeritems.put(headers.get(10), item10);
        headeritems.put(headers.get(11), item11);
        headeritems.put(headers.get(12), item12);


    }

    private void configuracoesIniciais(){
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        background = new Background();
        background.setWallpaper(MLLInfo);
        setTitle("Informações");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void prepareDummyData() {
        headers = new ArrayList<String>();
        headeritems = new HashMap<String, List<String>>();
        //adding headers
        headers.add("O que é a EsSA?"); //
        headers.add("Quais são os pré-requisitos?");
        headers.add("Quando começam as inscrições?");
        headers.add("Qual o dia da prova?");
        headers.add("Quanto devo pagar pela inscrição?");
        headers.add("Quanto recebo após me formar?");
        headers.add("Quantas vagas serão abertas?");
        headers.add("Onde o curso será ministrado?"); //
        headers.add("Como o curso será ministrado?"); //
        headers.add("Quais os benefícios do aluno?"); //
        headers.add("E depois de concluir o Curso de Formação de Sargentos?"); //
        headers.add("Quais são as fases até ingressar na EsSA?"); //

        //preparing header items data
        List<String> primary = new ArrayList<String>();
        primary.add("A Escola de Sargentos das Armas (EsSA) é, atualmente, o estabelecimento de ensino do Exército Brasileiro destinado exclusivamente à formação de Sargentos Combatentes de carreira, das armas de Infantaria, Cavalaria, Artilharia, Engenharia e Comunicações.");

        List<String> duvido2 = new ArrayList<String>();
        duvido2.add("São pré-requisitos para ingresso no concurso de admissão: \n\n" +
                "- Ser brasileiro(a) nato(a) ou naturalizado(a); \n" +
                "- Ter concluído o ensino médio em instituição de ensino reconhecida pelo MEC; \n" +
                "- Ter no mínimo 1,60m se do sexo masculino e 1,55m se do sexo feminino; \n" +
                "- Possuir no mínimo 17 e no máximo 24 anos de idade no dia 31 de dezembro do ano da inscrição; \n" +
                "- Estar em dia com as obrigações eleitorais, dentre outras.");

        List<String> duvidaDiaDaProva = new ArrayList<String>();
        duvidaDiaDaProva.add("Provas: 24/09/2017");

        List<String> secondary = new ArrayList<String>();
        secondary.add("As inscrições de 2017 iniciaram em 08/05/2017 com término em 12/06/2017.");
        List<String> college = new ArrayList<String>();
        college.add("O valor de inscrição é de R$80,00.");
        List<String> duvida4 = new ArrayList<String>();
        duvida4.add("Após a formatura o candidato aprovado no curso de formação será engajado no Exército como 3º Sargento e terá soldo inicial de R$ 3.325,00.");
        List<String> duvida5 = new ArrayList<String>();
        duvida5.add("Para a área de Geral/Aviação masculino há 900 vagas para os cursos de Infantaria, Cavalaria, Artilharia, Engenharia, Comunicações, Intendência, Topografia, Material Bélico – Armamento, Material Bélico – Mecânico Operador, Manutenção de Comunicações, Material Bélico – Mnt Vtr Auto e Aviação – Manutenção. Para a área Geral/Aviação feminino as 100 vagas são para as áreas de Intendência, Topografia, Material Bélico – Mnt Armamento, Material Bélico – Mecânico Operador, Manutenção de Comunicações, Material Bélico – Mnt Vtr Auto e Aviação - Manutenção.\n" +
                "\n" +
                "Na área de Música, as 40 oportunidades são para os seguintes naipes: Clarineta, Flauta em dó/Flautim em dó, Saxhorne, Saxofone, Trombone Tenor/Trombone Baixo, Trompa, Trompete/Cornetim/Flueghorne e Tuba. Por fim, na Saúde, as 60 chances abertas são para o curso de Técnico em Enfermagem.");

        List<String> duvida6 = new ArrayList<String>();
        duvida6.add("Os Cursos de Formação de Sargentos (CFS) serão realizados em aproximadamente 18 meses. Os primeiros sete meses, referentes ao período básico, ocorrerão em uma das 13 (treze) Organizações Militares de Corpo de Tropa situadas nas seguintes cidades: Rio de Janeiro/RJ; Juiz de Fora/MG (2 unidades); Recife/PE; Alegrete/RS; Jundiaí/SP; Pirassununga/SP; Pouso Alegre/MG; Campo Grande/MS; Fortaleza/CE; Blumenau/SC; Jataí/GO; e Altamira/PA.\n" +
                "O restante do curso (11 meses), relativo ao período de qualificação, será ministrado na Escola de Sargentos das Armas (situada em Três Corações/MG), na Escola de Sargentos de Logística (estabelecida no Rio de Janeiro/RJ) ou no Centro de Instrução de Aviação do Exército (localizado em Taubaté/SP), de acordo com a área de atuação escolhida pelo candidato.\n" +
                "");
        List<String> duvida7 = new ArrayList<String>();
        duvida7.add("A formação profissional do Sargento Combatente do Exército é a razão de ser da Escola. Todas as atividades do ano letivo são desenvolvidas com a finalidade de capacitar o aluno ao exercício da função a ser desempenhada nos corpos de tropa.\n" +
                "O ensino, fundamentalmente técnico-profissional, é ministrado de forma prática, considerando que o futuro sargento deve ser, ao mesmo tempo, chefe e executante. As Instruções são dinâmicas e os princípios do “aprender a aprender” operacionalizados em todas as disciplinas de forma a permitir ao futuro sargento a vontade de se auto-aperfeiçoar e o crescimento pessoal e profissional, decorrentes desta atitude.\n" +
                "As atividades de instrução desenvolvem-se em ritmo intenso. Busca-se, constantemente, a imitação das condições de combate. O aluno desempenha, sob a orientação dos instrutores e monitores, funções de executante e de comando, que serão exercidas nos corpos de tropa.\n" +
                "O treinamento físico militar, alvo de atenção especial, fortalece a têmpera do aluno e capacita-o a liderar o seu grupo, sob quaisquer condições.");
        List<String> duvida8 = new ArrayList<String>();
        duvida8.add("O aluno vive em regime de internato durante todo o período de formação, sendo alojado, alimentado e fardado por conta do Estado, além de receber salário militar previsto em lei. Participa, ainda, de atividades sociais, culturais, recreativas e esportivas, patrocinadas pela EsSA e pelo Grêmio dos Alunos da ESA (GRESA). \n" +
                "O curso de Sargentos da Armas, a partir de 2016 será considerado ensino superior, ou seja, após o aluno se tornar um Sargento ele receberá um diploma de nível superior na área Bélica (curso Tecnólogo).");
        List<String> duvida9 = new ArrayList<String>();
        duvida9.add("A cerimônia de encerramento do curso é o ponto culminante e o marco de encerramento do ano escolar, com a entrega dos diplomas e a promoção dos alunos à graduação de 3º Sargento.");
        List<String> duvida10 = new ArrayList<String>();
        duvida10.add("O concurso de admissão para a matrícula nos CFS terá as seguintes fases:\n" +
                "\n" +
                "a) 1ª fase, composta pelas etapas de exame intelectual, valoração de títulos, inspeção de saúde, exame de aptidão física e exame de habilitação musical, para os candidatos da área Música aprovados (aptos) nas etapas anteriores e convocados para este exame prático;\n" +
                "\n" +
                "b) 2ª fase: revisão médica e comprovação dos requisitos biográficos dos candidatos, de caráter eliminatório, quando de sua apresentação nas OMCT.\n" +
                "\n" +
                "As provas (exame intelectual) serão aplicadas provavelmente no dia 24 de setembro de 2017, em locais anunciados no site da EsSa, com bastante antecedência.\n" +
                "\n" +
                "O manual do candidato está acessível no link: http://concurso.esa.ensino.eb.br/priol2017/ e deve ser conferido atentamente.");
       /* List<String> duvida6 = new ArrayList<String>();
        duvida5.add("");*/

        //contain header and header items
        headeritems.put(headers.get(0), primary);
        headeritems.put(headers.get(1), duvido2);
        headeritems.put(headers.get(2), secondary);
        headeritems.put(headers.get(3), duvidaDiaDaProva);
        headeritems.put(headers.get(4), college);
        headeritems.put(headers.get(5), duvida4);
        headeritems.put(headers.get(6), duvida5);
        headeritems.put(headers.get(7), duvida6);
        headeritems.put(headers.get(8), duvida7);
        headeritems.put(headers.get(9), duvida8);
        headeritems.put(headers.get(10), duvida9);
        headeritems.put(headers.get(11), duvida10);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        onLeaveThisActivity();
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        onStartNewActivity();
    }

    @Override
    public void startActivity(Intent intent, Bundle options) {
        super.startActivity(intent, options);
        onStartNewActivity();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    //--------------------------- Animacoes de Transicao --------------------------//

    protected void onLeaveThisActivity() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }

    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }

    //------------------------------------------------------------------------------//

}
