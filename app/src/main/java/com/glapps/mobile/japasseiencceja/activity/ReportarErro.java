package com.glapps.mobile.japasseiencceja.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReportarErro extends AppCompatActivity {

    @BindView(R.id.tv_nome)
    TextView tvNome;
    @BindView(R.id.et_nome)
    EditText etNome;
    @BindView(R.id.tv_email)
    TextView tvEmail;
    @BindView(R.id.et_email)
    EditText etEmail;
    @BindView(R.id.tv_motivo)
    TextView tvMotivo;
    @BindView(R.id.spinner_motivo)
    Spinner spinnerMotivo;
    @BindView(R.id.tv_mensagem)
    TextView tvMensagem;
    @BindView(R.id.et_mensagem)
    EditText etMensagem;
    @BindView(R.id.bt_enviar)
    Button btEnviar;
    @BindView(R.id.MRL_reportar_erro)
    RelativeLayout MRLReportarErro;
    final static private String NAO_IDENTIFICADO = "Não identificado";
    String nome = NAO_IDENTIFICADO;
    String email = NAO_IDENTIFICADO;
    String tipo = NAO_IDENTIFICADO;
    String mensagem = NAO_IDENTIFICADO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar_erro);
        ButterKnife.bind(this);

        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = etNome.getText().toString();
                email = etEmail.getText().toString();
                mensagem = etMensagem.getText().toString();
            }
        });
    }
}
