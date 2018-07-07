package com.glapps.mobile.japasseiencceja.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.ToxicBakery.viewpager.transforms.RotateUpTransformer;
import com.glapps.mobile.japasseiencceja.Adapter.ShopPagerAdapter;
import com.glapps.mobile.japasseiencceja.R;
import com.glapps.mobile.japasseiencceja.helper.Background;
import com.pixelcan.inkpageindicator.InkPageIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Shop extends AppCompatActivity {

    @BindView(R.id.pagerLoja)
    ViewPager pagerLoja;
    @BindView(R.id.container_pager)
    RelativeLayout containerPager;
    @BindView(R.id.indicatorPager)
    InkPageIndicator indicatorPager;
    @BindView(R.id.container_indicatorPager)
    RelativeLayout containerIndicatorPager;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.MRL_shop)
    RelativeLayout MRLShop;
    Background background;
    String[] links = {
            "http://www.apostilasopcao.com.br/apostilas/2266/4543/encceja-2017/encceja-ensino-ma-dio.php?afiliado=12849&origem=LOJA-ENCCEJA-MEDIO",
            "http://www.apostilasopcao.com.br/apostilas/2266/4544/encceja-2017/encceja-ensino-fundamental.php?afiliado=12849&origem=LOJA-ENCCEJA-FUNDAMENTAL",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        ButterKnife.bind(this);
        configuracoesIniciais();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              goToSite(links[pagerLoja.getCurrentItem()]);
            }
        });
    }

    private void configurarPagerView(){
        PagerAdapter mShopPagerAdapter = new ShopPagerAdapter(this);
        pagerLoja.setAdapter(mShopPagerAdapter);
        indicatorPager.setViewPager(pagerLoja);
        pagerLoja.setPageTransformer(true, new RotateUpTransformer());
    }

    private void configuracoesIniciais(){
        configurarPagerView();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Loja");
        background = new Background();
        background.setWallpaper(MRLShop);
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

    //-------- Animacoes de Transicao --------//

    protected void onLeaveThisActivity() {
        overridePendingTransition(R.anim.enter_from_left, R.anim.exit_to_right);
    }

    protected void onStartNewActivity() {
        overridePendingTransition(R.anim.enter_from_right, R.anim.exit_to_left);
    }

    //-----------------------------------------//

    private void goToSite(final String site){
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(site));
                 startActivity(i);

    }
}

