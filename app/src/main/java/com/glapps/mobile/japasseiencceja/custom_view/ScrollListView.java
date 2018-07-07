package com.glapps.mobile.japasseiencceja.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.glapps.mobile.japasseiencceja.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GlaucoVillasBoas on 26/04/2017.
 */


public class ScrollListView extends RelativeLayout {

    @BindView(R.id.main_linear_layout)
    LinearLayout mainLinearLayout;
    Context contexto;
    public ScrollListView(final Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.scroll_list_view_layout, this);
        ButterKnife.bind(this);
        contexto = context;

    }

    public void addRow(String firstText, String lastText){
        ScrollListViewRow row = new ScrollListViewRow(contexto, null);
        row.setText(firstText, lastText);
        mainLinearLayout.addView(row);
    }


}


