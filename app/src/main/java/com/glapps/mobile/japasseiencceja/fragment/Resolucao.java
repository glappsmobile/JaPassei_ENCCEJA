package com.glapps.mobile.japasseiencceja.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.activity.Simulado;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.objects.Questao;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class Resolucao extends Fragment {


    @BindView(R.id.tvEnunciado)
    TextView tvEnunciado;
    @BindView(R.id.tv_resolucao)
    TextView tvResolucao;
    @BindView(R.id.btVoltar)
    Button btVoltar;
    Unbinder unbinder;
    ArrayList<Questao> listaDeQuestoes;
    int position;
    Simulado simulado;
    @BindView(R.id.tv_static_resolucao)
    TextView tvStaticResolucao;
    @BindView(R.id.adView)
    AdView adView;
    @BindView(R.id.menu_bar)
    RelativeLayout menuBar;

    public Resolucao() {
        // Required empty public constructor
    }

    Resolucao resolucao;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_resolucao, container, false);
        unbinder = ButterKnife.bind(this, view);
        listaDeQuestoes = ((MyApplication) getActivity().getApplication()).getListaDeQuestoes();
        position = ((MyApplication) getActivity().getApplication()).getPosicao();

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        resolucao = this;

        String textoApostila = "Se você ainda não possui a apostila, pode comprá-la <b><a href='http://www.apostilasopcao.com.br/apostilas/2266/4543/encceja-2017/encceja-ensino-ma-dio.php?afiliado=12849&origem=CLICK-TEXTO-RESOLUCAO'> clicando aqui </a></b>. <br>" +
                "A apostila da Apostila Opção possui um conteúdo de qualidade e foi feita por profissionais para que você consiga ser aprovado(a) no ENCCEJA. <br>" +
                "Vale a pena conferir, irá te ajudar muito na resolução dos exercícios, pois você poderá ler lá o assunto que abordamos aqui.<br>" +
                "Nunca é tarde demais para aprender, corra atrás dos seus sonhos! ";
       tvEnunciado.setClickable(true);
        tvEnunciado.setText(Html.fromHtml(textoApostila));

        tvResolucao.setText(listaDeQuestoes.get(position).getResolucao());

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(resolucao).commit();

            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
