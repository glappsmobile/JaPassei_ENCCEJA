package com.glapps.mobile.japasseiencceja.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.glapps.mobile.japasseiencceja.Adapter.CustomPagerAdapter;
import com.glapps.mobile.japasseiencceja.Adapter.MainListAdapter;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.helper.Background;
import com.glapps.mobile.japasseiencceja.objects.Questao;
import com.pixelcan.inkpageindicator.InkPageIndicator;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //----------------- Binder View --------------//
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.container_pager)
    RelativeLayout containerPager;
    @BindView(R.id.indicatorPager)
    InkPageIndicator indicatorPager;
    @BindView(R.id.container_indicatorPager)
    RelativeLayout containerIndicatorPager;
    @BindView(R.id.lista)
    ListView lista;
    @BindView(R.id.MRL_main_activity)
    RelativeLayout MRLMainActivity;
    //--------------------------------------------//
    String[] array_vazio = {};
    Background background;
    Handler h;
    String title;
    String message;
    String link;
    String wichList;
    private final String KEY_LIST_FACEBOOK = "LIST FACEBOOK";
    private final String KEY_LIST_MAIN = "LIST MAIN";
    private final String KEY_LIST_PATROCINADORES = "LIST PATROCINADORES";
    private final String KEY_LIST_CURSOS = "LIST CURSOS";

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
    Intent i;
    int delay;

    String[] info = {
            KEY_INSCRICOES,
            KEY_APLICACAO,
            KEY_EXAMES,
            KEY_DOCUMENTACAO,
            KEY_OBJETOS,
            KEY_ATENDIMENTO,
            KEY_SENHA,
            KEY_CORRECAO,
            KEY_DIVULGACAO,
            KEY_UTILIZACAO

    };

    int[] infoimg = {
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
            R.drawable.ic_instrucoes,
    };

    String area_da_informacao = "";

    private final static String KEY_SIMULADO = "Simulado";
    private final static String KEY_INFORMACOES = "Informações";
    private final static String KEY_FACEBOOK = "Facebook - Grupo de Estudos";
    private final static String KEY_LOJA = "Apostilas/Cursos";
    private final static String KEY_MAIS_APPS = "Mais Apps";
    private final static String KEY_FALE_CONOSCO = "Fale Conosco";
    private final static String KEY_AVALIE = "Avalie";

    //FACEBOOK
    private final static String KEY_PG_ENCCEJA = "Página ENCCEJA - JaPassei Concursos";
    private final static String KEY_GP_ENCCEJA = "Grupo de Estudos ENCCEJA";
    private final static String BACK = "Voltar";
    private final static String KEY_LINK_PG_FACEBOOK = "https://web.facebook.com/pg/Encceja-JaPassei-Concursos-1053681078107668/";
    private final static String KEY_LINK_GP_FACEBOOK = "https://web.facebook.com/groups/enccejajpconcursos/";


    String [] startMenuList = {
            KEY_SIMULADO,
            KEY_LOJA,
            KEY_FACEBOOK,
            KEY_INFORMACOES,
            KEY_MAIS_APPS,
            KEY_FALE_CONOSCO,
            KEY_AVALIE
    };

    int [] imageId = {
            R.drawable.ic_simulado,
            R.drawable.ic_shop,
            R.drawable.ic_facebook,
            R.drawable.ic_instrucoes,
            R.drawable.ic_outros,
            R.drawable.ic_falar_conosco,
            R.drawable.ic_avalie,
    };

    String[] facePagesText = {
            KEY_PG_ENCCEJA,
            KEY_GP_ENCCEJA,
            BACK
    };

    int[] facePagesImages = {
            R.drawable.ic_facebook,
            R.drawable.ic_facebook,
            R.drawable.ic_back,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        configuracoesIniciais();



    }

    private void createDialog(String title, String message, final String link){
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("SIM", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse(link));
                        startActivity(i);                    }
                })
                .setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // do nothing
                    }
                });
        dialog.show();


    }

    private void configuracoesIniciais() {
        definirVariaveisIniciais();
        changePages();
        configurarPagerViews();
        resetGlobalVariables();
        changeList(KEY_LIST_MAIN);

        setTitle("JaPassei Encceja");
        background = new Background();
        background.setWallpaper(MRLMainActivity);
    }

    private void resetGlobalVariables() {
        ((MyApplication) getApplication()).setRespostas(array_vazio);
        ((MyApplication) getApplication()).setSee_results(false);
        ((MyApplication) getApplication()).setPosicao(0);
        ((MyApplication) getApplication()).setListaDeQuestoes(new ArrayList<Questao>());
        ((MyApplication) getApplication()).setFinished(false);
    }

    private void changeList(String key){
        YoYo.with(Techniques.FadeOut)
                .duration(1000)
                .playOn(lista);
        YoYo.with(Techniques.FadeIn)
                .duration(1000)
                .playOn(lista);

        switch (key){
            case KEY_LIST_FACEBOOK:
                goToListaFacebook();
                break;
            case KEY_INFORMACOES:
                area_da_informacao = "";
                Intent intent = new Intent(MainActivity.this, Info.class);
                intent.putExtra("area_da_informacao", area_da_informacao);
                startActivity(intent);
                break;
            case KEY_LIST_MAIN:
                goToListaInicial();
                break;

        }
    }

    private void goToListaInicial(){

        wichList = KEY_LIST_MAIN;
        MainListAdapter adapter = new MainListAdapter(getApplicationContext(), startMenuList, imageId);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = startMenuList[position];
                switch (item){
                    case KEY_SIMULADO:
                        Intent go_simulado = new Intent(getApplicationContext(), MenuProva.class);
                        startActivity(go_simulado);
                        break;

                    case KEY_LOJA:
                        Intent go_shop = new Intent(getApplicationContext(), Shop.class);
                        startActivity(go_shop);
                        break;

                    case KEY_MAIS_APPS:
                        title = "IR PARA O GOOGLE PLAY";
                        message = "Deseja ir para a página do Google Play e conferir nossos outros simulados?";
                        link = "https://play.google.com/store/apps/developer?id=J%C3%A1Passei+Concursos";
                        createDialog(title, message, link);
                        break;

                    case KEY_FACEBOOK:
                         changeList(KEY_LIST_FACEBOOK);
                        break;
                    case KEY_INFORMACOES:

                        area_da_informacao = "";
                        Intent intent = new Intent(MainActivity.this, Info.class);
                        intent.putExtra("area_da_informacao", area_da_informacao);
                        startActivity(intent);
                        break;
                    case KEY_FALE_CONOSCO:
                        title = "ENTRE EM CONTATO";
                        message = "Dúvidas, Sugestões, Críticas, Elogios, Contato comercial... \n" +
                                "Basta entrar em contato conosco via Facebook, nossa equipe está pronta para te responder. \n\n" +
                                "" +
                                "Deseja entrar em contato via Facebook?";
                        link = KEY_LINK_PG_FACEBOOK;
                        createDialog(title, message, link);
                        break;
                    case KEY_AVALIE:
                        title = "AVALIAR O APP";
                        message = "Sua avaliação é muito importante para nós. Assim, sabemos que você está gostando e podemos nos dedicar mais em melhorias!\n\nDeseja avaliar o app?";
                        link = "https://play.google.com/store/apps/details?id=com.glapps.mobile.japasseiencceja&hl=pt_BR";
                        createDialog(title, message, link);
                        break;
                }

            }
        });
    }

    private void goToListaFacebook(){

        wichList = KEY_LIST_FACEBOOK;
        MainListAdapter adapter = new MainListAdapter(getApplicationContext(), facePagesText, facePagesImages);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (facePagesText[position]){
                    case KEY_PG_ENCCEJA:
                        link = KEY_LINK_PG_FACEBOOK;
                        i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse(link));
                        startActivity(i);
                        break;

                    case KEY_GP_ENCCEJA:
                        link = KEY_LINK_GP_FACEBOOK;
                        i = new Intent(Intent.ACTION_VIEW,
                                Uri.parse(link));
                        startActivity(i);
                        break;

                    case BACK:
                        changeList(KEY_LIST_MAIN);
                        break;
                }
            }
        });
    }





    private void definirVariaveisIniciais() {
        h = new Handler();
    }

    private void configurarPagerViews() {
        PagerAdapter mCustomPagerAdapter = new CustomPagerAdapter(this);
        pager.setAdapter(mCustomPagerAdapter);
        InkPageIndicator inkPageIndicatorPager = (InkPageIndicator) findViewById(R.id.indicatorPager);
        inkPageIndicatorPager.setViewPager(pager);
        pager.setPageTransformer(true, new RotateUpTransformer());
    }

    private void changePages() {
        delay = 30000; //milliseconds
        h.postDelayed(new Runnable() {
            public void run() {
                int position = pager.getCurrentItem();

                switch (position){

                    case 0:
                        delay = 30000;
                        break;
                    case 1:
                        delay = 5000;
                        break;
                }
                MoveNext(pager);
                //  mViewPager.setAdapter(null);
                //   vpPager.setAdapter(null);
                h.postDelayed(this, delay);
            }
        }, delay);
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();
    }

    public void MoveNext(View view) {
        //it doesn't matter if you're already in the last item
        int ultimoItem = pager.getAdapter().getCount() - 1;
        if (pager.getCurrentItem() == ultimoItem) {
            pager.setCurrentItem(0);
        } else {
            pager.setCurrentItem(pager.getCurrentItem() + 1);
        }


    }

    public void MovePrevious(View view) {
        //it doesn't matter if you're already in the first item
        pager.setCurrentItem(pager.getCurrentItem() - 1);
    }

    public String getArea_da_informacao() {
        return area_da_informacao;
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
    public void onBackPressed() {

        if (wichList.equals(KEY_LIST_FACEBOOK)){
            changeList(KEY_LIST_MAIN);
        }else{
            super.onBackPressed();
        }

    }

    //-------- Animacoes de Transicao --------//

    protected void onLeaveThisActivity() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }

    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }

    //-----------------------------------------//
}



