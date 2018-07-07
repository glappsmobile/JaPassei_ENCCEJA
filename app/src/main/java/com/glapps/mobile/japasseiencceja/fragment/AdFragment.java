package com.glapps.mobile.japasseiencceja.fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.glapps.mobile.japasseiencceja.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdFragment extends Fragment {


    @BindView(R.id.ivAd)
    ImageView ivAd;
    @BindView(R.id.ivClose)
    ImageView ivClose;
    Unbinder unbinder;

    public AdFragment() {
        // Required empty public constructor
    }

    AdFragment adFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ad, container, false);
        ivAd = (ImageView) view.findViewById(R.id.ivAd);
        ivClose = (ImageView) view.findViewById(R.id.ivClose);
     /*   Random random = new Random();
        int sorteio = random.nextInt(2)+1;*/

        adFragment = this;
    /*    switch (sorteio){*/
          /*  case 1:
                ivAd.setBackgroundResource(R.drawable.interestial_vip);
                goTo("https://play.google.com/store/apps/details?id=com.glapps.mobile.essasimuladospremium");
                break;*/
          //  case 1:
                ivAd.setBackgroundResource(R.drawable.intersticial_encceja_medio);
                goTo("http://www.apostilasopcao.com.br/apostilas/2266/4543/encceja-2017/encceja-ensino-ma-dio.php?afiliado=12849&origem=INTERSTICIAL-ENCCEJA-RESOLUCAO");
             //   break;


     //   }

        ivClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             //   Appodeal.show(getActivity(), Appodeal.BANNER_BOTTOM);
                getActivity().getSupportFragmentManager().beginTransaction().remove(adFragment).commit();

            }
        });

        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    private void goTo(final String link){
        ivAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(link));
                startActivity(i);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
