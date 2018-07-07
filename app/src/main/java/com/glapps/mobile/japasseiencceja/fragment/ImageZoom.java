package com.glapps.mobile.japasseiencceja.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.application.MyApplication;
import com.glapps.mobile.japasseiencceja.custom_view.TouchImageView;
import com.glapps.mobile.japasseiencceja.objects.Imgz;
import com.glapps.mobile.japasseiencceja.objects.Questao;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageZoom extends Fragment {


    @BindView(R.id.tv_tip_touch)
    TextView tvTipTouch;
    @BindView(R.id.zoom_image)
    TouchImageView zoomImage;
    @BindView(R.id.rl_container_image)
    RelativeLayout rlContainerImage;
    @BindView(R.id.bt_back)
    Button btBack;
    Unbinder unbinder;
    ImageZoom imageZoom;
    ArrayList<Questao> listaDeQuestoes;
    int position;

    @BindView(R.id.bt_previous)
    Button btPrevious;
    @BindView(R.id.bt_next)
    Button btNext;
    int imagem1 = 0;
    int imagem2 = 0;
    private static final String CHAVE_MATEMATICA = "Matemática";
    private static final String LINGUAGENS_CÓDIGOS = "Linguagens e Códigos";
    private static final String CIENCIAS_HUMANAS = "Ciências Humanas";
    private static final String CIENCIAS_DA_NATUREZA = "Ciências da Natureza";
    private static final String INGLES = "Inglês";
    private static final String ESPANHOL = "Espanhol";
    @BindView(R.id.btTIV_Scroll)
    TouchImageView btTIVScroll;
    @BindView(R.id.scrollZoom)
    ScrollView scrollZoom;
    @BindView(R.id.container_buttons)
    RelativeLayout containerButtons;
    @BindView(R.id.tvCreditos)
    TextView tvCreditos;

    public ImageZoom() {
        // Required empty public constructor
    }

    int indice = 0;
    int quantidade = 0;
    ArrayList<Imgz> imgzs = new ArrayList<>();
    String str_img;
    String str_img2;
    int modo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image_zoom, container, false);
        unbinder = ButterKnife.bind(this, view);
        imageZoom = this;
        position = ((MyApplication) getActivity().getApplication()).getPosicao();
        scrollZoom.setScrollbarFadingEnabled(false);

        str_img = getArguments().getString("str_img");
        str_img2 = getArguments().getString("str_img2");
        modo = getArguments().getInt("modo");

        Log.i("ImageZoom", "str_img = " + str_img);
        Log.i("ImageZoom", "str_img2 = " + str_img2);


            btTIVScroll.setVisibility(View.GONE);
            tvCreditos.setVisibility(View.GONE);

            showImageMode1(str_img, str_img2);


        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().remove(imageZoom).commit();
            }
        });


        if (quantidade == 1) {
            btPrevious.setVisibility(View.GONE);
            btNext.setVisibility(View.GONE);

        } else if (quantidade == 2) {

            if (indice == 0) {
                btPrevious.setVisibility(View.GONE);
                btNext.setVisibility(View.VISIBLE);
            } else if (indice == 1) {
                btPrevious.setVisibility(View.VISIBLE);
                btNext.setVisibility(View.GONE);
            }
        }

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice = 1;
                zoomImage.setImageResource(imagem2);
                btPrevious.setVisibility(View.VISIBLE);
                btNext.setVisibility(View.GONE);
                YoYo.with(Techniques.FadeOut)
                        .duration(1000)
                        .playOn(zoomImage);
                YoYo.with(Techniques.FadeIn)
                        .duration(1000)
                        .playOn(zoomImage);
                zoomImage.resetZoom();
            }
        });

        btPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indice = 0;
                zoomImage.setImageResource(imagem1);
                btPrevious.setVisibility(View.GONE);
                btNext.setVisibility(View.VISIBLE);
                YoYo.with(Techniques.FadeOut)
                        .duration(1000)
                        .playOn(zoomImage);
                YoYo.with(Techniques.FadeIn)
                        .duration(1000)
                        .playOn(zoomImage);
                zoomImage.resetZoom();
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    private void showImageMode1(String str_img, String str_img2) {

                    int id = getResources().getIdentifier(str_img, "drawable", getContext().getPackageName());
                    int id2 = getResources().getIdentifier(str_img2, "drawable", getContext().getPackageName());
                    zoomImage.setImageResource(id);

                    if (id2 != 0) {
                        quantidade = 2;
                        imagem1 = id;
                        imagem2 = id2;
                    } else {
                        quantidade = 1;
                        imagem1 = id;

                    }

    }

}
