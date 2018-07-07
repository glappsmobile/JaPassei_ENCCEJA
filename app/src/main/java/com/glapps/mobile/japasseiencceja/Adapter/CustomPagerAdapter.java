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

import com.glapps.mobile.japasseiencceja.R;

/**
 * Created by GlaucoVillasBoas on 18/04/2017.
 */

 public class CustomPagerAdapter extends PagerAdapter {

    Context mContext;
    LayoutInflater mLayoutInflater;
    int[] mResources = {
            R.drawable.banner_encceja_apostila_medio,
            R.drawable.banner_encceja_apostila_fundamental,
    };
    ImageView imageView;
    public CustomPagerAdapter(Context context) {
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
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);

        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(mResources[position]);

        container.addView(itemView);

        switch (position){
           /* case 0:
                break;*/

            case 0:
                goToSite("http://www.apostilasopcao.com.br/apostilas/2266/4543/encceja-2017/encceja-ensino-ma-dio.php?afiliado=12849&origem=BANNER-INICIAL-ENCCEJA-MEDIO");
                break;

            case 1:
                goToSite("http://www.apostilasopcao.com.br/apostilas/2266/4544/encceja-2017/encceja-ensino-fundamental.php?afiliado=12849&origem=BANNER-INICIAL-ENCCEJA-FUNDAMENTAL");
                break;

        }

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
//        container.removeView((LinearLayout) object);
    }

    private void goToSite(final String site){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(site));
                mContext.startActivity(i);
            }
        });
    }
}