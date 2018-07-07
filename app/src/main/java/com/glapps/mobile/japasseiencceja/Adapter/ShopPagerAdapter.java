package com.glapps.mobile.japasseiencceja.Adapter;

        import android.content.Context;
        import android.content.Intent;
        import android.net.Uri;
        import android.support.v4.view.PagerAdapter;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.RelativeLayout;
        import android.widget.TextView;

        import com.glapps.mobile.japasseiencceja.R;

/**
 * Created by GlaucoVillasBoas on 18/04/2017.
 */

public class ShopPagerAdapter extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;

    int[] mResources = {
            R.drawable.apostila_medio,
            R.drawable.apostila_fundamental,
    };

    String[] nomes = {
            "Apostila ENCCEJA \n" +
                    "ENSINO MÉDIO",
            "Apostila ENCCEJA \n" +
                    "ENSINO FUNDAMENTAL",

    };
    String[] links = {
            "http://www.apostilasopcao.com.br/apostilas/2266/4543/encceja-2017/encceja-ensino-ma-dio.php?afiliado=12849&origem=LOJA-ENCCEJA-MEDIO",
            "http://www.apostilasopcao.com.br/apostilas/2266/4544/encceja-2017/encceja-ensino-fundamental.php?afiliado=12849&origem=LOJA-ENCCEJA-FUNDAMENTAL",
    };
    public ShopPagerAdapter(Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item_loja, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(mResources[position]);
        TextView texto = (TextView) itemView.findViewById(R.id.tv_pager_shop);
        texto.setText(nomes[position]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSite(links[position]);
            }
        });
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

    private void goToSite(final String site){
        Intent i = new Intent(Intent.ACTION_VIEW,
                Uri.parse(site));
        mContext.startActivity(i);

    }
}
