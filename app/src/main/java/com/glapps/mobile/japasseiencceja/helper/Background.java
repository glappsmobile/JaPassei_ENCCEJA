package com.glapps.mobile.japasseiencceja.helper;

import android.view.View;

import com.glapps.mobile.japasseiencceja.R;

import java.util.Random;

/**
 * Created by GlaucoVillasBoas on 19/04/2017.
 */

public class Background {
    int[] list_backgrounds = {
      R.drawable.bg_1,
      R.drawable.bg_2,
      R.drawable.bg_3,
      R.drawable.bg_4,
      R.drawable.bg_5,
      R.drawable.bg_6,
      R.drawable.bg_7,
      R.drawable.bg_8,
      R.drawable.bg_9,
      R.drawable.bg_10,
      R.drawable.bg_11,
      R.drawable.bg_12,
      R.drawable.bg_13,
      R.drawable.bg_14,
      R.drawable.bg_15,
      R.drawable.bg_16,
      R.drawable.bg_17,
      R.drawable.bg_18,

    };
    public Background() {

        }

        public void setWallpaper(View background){
            Random randomico = new Random();
            int random_background = randomico.nextInt(18);
            background.setBackgroundResource(list_backgrounds[random_background]);
        }


    }

