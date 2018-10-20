package com.play.custom.edittext;

import android.content.res.Resources;

public class Utils {

    public  Utils(){
    }
    public static int dpToPx(int dp){
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }
}
