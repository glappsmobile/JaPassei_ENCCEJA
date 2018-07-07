package com.glapps.mobile.japasseiencceja.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;
import com.victor.loading.book.BookLoading;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class Loading extends Fragment {


    @BindView(R.id.ivCharacter)
    ImageView ivCharacter;

    Unbinder unbinder;
    Handler handler;
    int progresso;
    @BindView(R.id.tvCarregando)
    TextView tvCarregando;
    @BindView(R.id.bookloading)
    BookLoading bookloading;

    int[] characters = {
            R.drawable.character_doutor1,
            R.drawable.character_doutor2,
            R.drawable.character_advogado1,
            R.drawable.character_advogado2,
            R.drawable.character_engenheira1,
            R.drawable.character_engenheira2,
    };
    Runnable runnable;
    public Loading() {
        // Required empty public constructor
    }
    Boolean fechado = false;
    Loading loading;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_loading, container, false);
        unbinder = ButterKnife.bind(this, view);
        loading = this;
        handler = new Handler();
        progresso = 0;
        Random random = new Random();

        ivCharacter.setImageResource(characters[random.nextInt(6)]);
        bookloading.start();
        /*runnable = new Runnable() {
            @Override
            public void run() {
                progresso += 3;

                if (!fechado) {
                    if (progresso >= 100) {
                        fecharFragmento();
                        fechado = true;
                        handler.removeCallbacks(runnable);
                    }
                }
                if (!fechado) {
                    handler.postDelayed(this, 100);
                }

            }
        };

//Start
        handler.postDelayed(runnable, 10);*/


        return view;
    }

    private void fecharFragmento() {
        getActivity().getSupportFragmentManager().beginTransaction().remove(loading).commit();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
