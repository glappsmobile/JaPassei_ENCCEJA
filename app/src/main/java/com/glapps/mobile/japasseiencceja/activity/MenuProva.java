package com.glapps.mobile.japasseiencceja.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.helper.Background;
import com.glapps.mobile.japasseiencceja.helper.QuestaoManager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuProva extends AppCompatActivity {

    //------------- BindView -----------------//
    Background background;
    @BindView(R.id.imageView2)
    ImageView imageView2;
    @BindView(R.id.tv_ano)
    TextView tvAno;
    @BindView(R.id.spinner_ano)
    Spinner spinnerAno;
    @BindView(R.id.tv_materia)
    TextView tvMateria;
    @BindView(R.id.spinner_materia)
    Spinner spinnerMateria;
    @BindView(R.id.tv_tipo)
    TextView tvTipo;
    @BindView(R.id.spinner_tipo)
    Spinner spinnerTipo;
    @BindView(R.id.cb_conferir)
    CheckBox cbConferir;
    @BindView(R.id.bt_confirmar)
    Button btConfirmar;
    @BindView(R.id.MRL_menu_prova)
    RelativeLayout MRLMenuProva;
    //-----------------------------------------//

    //------------------------------- KEYS ----------------------------------//
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS  = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String PRIMEIRO_DIA = "1º Dia";
    private static final String SEGUNDO_DIA = "2º Dia";
    private static final String CHAVE_COMPLETA = "Prova Completa";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    private static final String ENSINO_MEDIO = "Ensino Médio";
    private static final String ENSINO_FUNDAMENTAL = "Ensino Fundamental";
    //-----------------------------------------------------------------------//

    //----------------------------- Arrays ----------------------------------//
    String[] anos = {
            "Selecione o ano...",
            "2016",
            "2015",
            "2014",
            "2013",
            "2012",
            "2011",
            "2010",
    };

    String[] anosMedio = {
            "Selecione o ano...",
            "2017",
            "2018",
            "2016",
            "2015",
            "2013",
            "2012",
    };

    String[] anosFundamental = {
            "Selecione o ano...",
            "2014",
            "2011",
    };

    String[] simuladosMedio = {
            "Selecione o simulado...",
            "Simulado 1",
            "Simulado 2",
            "Simulado 3",
            "Simulado 4",
            "Simulado 5",
            "Simulado 5"
    };

    String[] simuladosFundamental = {
            "Selecione o simulado...",
            "Simulado 1",
            "Simulado 2",

    };


    String[] materias = {
            "Selecione a disciplina...",
         //   PRIMEIRO_DIA,
         //   SEGUNDO_DIA,
            LINGUAGENS_CÓDIGOS,
            CHAVE_MATEMATICA,
            CIENCIAS_DA_NATUREZA,
            CIENCIAS_HUMANAS,

    };

    String[] tipos = {
            ENSINO_MEDIO,
            ENSINO_FUNDAMENTAL
    };

    String[] desativado = {
            ""
    };


    //-------------------------------------------------------------------------//
    QuestaoManager manager;
    String materia = "Não selecionada";
    String ano = "ano";
    String tipo = "";
    ArrayAdapter<String> adapter;
    @BindView(R.id.scrollView)
    ScrollView scrollView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_prova);
        ButterKnife.bind(this);
        setInitialConfig();
        scrollView.setScrollbarFadingEnabled(false);
                manager = new QuestaoManager(getApplicationContext(), new Simulado());

        spinnerAno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (spinnerTipo.getSelectedItemPosition() == 0){
                    ano = anosMedio[position];
                }else{
                    ano = anosFundamental[position];
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerMateria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    materia = materias[position];


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tipo = tipos[position];

                if (position == 0){
                    adapter = new ArrayAdapter<String>(MenuProva.this, R.layout.custom_spinner, simuladosMedio);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerAno.setAdapter(adapter);

                }else{
                    adapter = new ArrayAdapter<String>(MenuProva.this, R.layout.custom_spinner, simuladosFundamental);
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    spinnerAno.setAdapter(adapter);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int indiceAno = spinnerAno.getSelectedItemPosition();
                int indiceMateria = spinnerMateria.getSelectedItemPosition();
                int indiceTipo = spinnerTipo.getSelectedItemPosition();

                if (indiceAno != 0 && indiceMateria != 0) {

                    Intent intent = new Intent(MenuProva.this, Simulado.class);
                    intent.putExtra("materia", materia);
                    intent.putExtra("ano", ano);
                    intent.putExtra("tipo", tipo);
                    ((MyApplication) getApplication()).setMateria(materia);
                    ((MyApplication) getApplication()).setAno(ano);
                    ((MyApplication) getApplication()).setVer_resposta(cbConferir.isChecked());
                    ((MyApplication) getApplication()).setTipo(tipo);
                    finish();
                    startActivity(intent);
                }

                if (indiceAno == 0 && indiceMateria != 0) {
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(spinnerAno);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(tvAno);
                    Toast.makeText(MenuProva.this, "Escolha o simulado!", Toast.LENGTH_SHORT).show();

                }


                if (indiceMateria == 0 && indiceAno != 0) {
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(spinnerMateria);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(tvMateria);
                    Toast.makeText(MenuProva.this, "Escolha a matéria!", Toast.LENGTH_SHORT).show();
                }

                if (indiceAno == 0 && indiceMateria == 0) {
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(spinnerAno);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(spinnerMateria);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(tvMateria);
                    YoYo.with(Techniques.Tada)
                            .duration(700)
                            .playOn(tvAno);

                    Toast.makeText(MenuProva.this, "Escolha a matéria e o simulado!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void setInitialConfig() {
        configAnimations();
        configBars();
        configBackground();
        configSpinner();
    }

    private void configBackground() {
        background = new Background();
        background.setWallpaper(MRLMenuProva);
    }

    private void configBars() {
        setTitle("MONTANDO A PROVA");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    private void configAnimations() {
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    private void configSpinner() {

        adapter = new ArrayAdapter<String>(MenuProva.this, R.layout.custom_spinner, simuladosMedio);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerAno.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(MenuProva.this, R.layout.custom_spinner, materias);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerMateria.setAdapter(adapter);

        adapter = new ArrayAdapter<String>(MenuProva.this, R.layout.custom_spinner, tipos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipo.setAdapter(adapter);
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

    public String getMateria() {
        return materia;
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
