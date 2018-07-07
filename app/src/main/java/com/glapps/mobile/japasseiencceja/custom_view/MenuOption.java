package com.glapps.mobile.japasseiencceja.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;

/**
 * Created by GlaucoVillasBoas on 18/04/2017.
 */

public class MenuOption extends RelativeLayout {

    private TextView textView;
    private ImageView imageView;

    public MenuOption(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.menu_option, this);

        imageView = (ImageView) findViewById(R.id.imagem);
        textView = (TextView) findViewById(R.id.texto);
    }

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }

    public void setText(String text){
        textView.setText(text);
    }
}
