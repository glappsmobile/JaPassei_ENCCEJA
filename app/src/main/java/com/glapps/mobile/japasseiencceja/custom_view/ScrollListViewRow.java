package com.glapps.mobile.japasseiencceja.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.glapps.mobile.japasseiencceja.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GlaucoVillasBoas on 27/04/2017.
 */

public class ScrollListViewRow extends RelativeLayout {
    @BindView(R.id.tv_start)
    TextView tvStart;
    @BindView(R.id.tv_end)
    TextView tvEnd;
    public ScrollListViewRow(final Context context, AttributeSet attrs) {
        super(context, attrs);
        inflate(context, R.layout.scroll_list_view_row, this);
        ButterKnife.bind(this);

        }

        public void setText(String firstText, String lastText){
            tvStart.setText(firstText);
            tvEnd.setText(lastText);
        }
    }
