package com.play.custom.edittext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.AppCompatEditText;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class CustomEditTextAnimation extends AppCompatEditText{


    public static Utils utils;

    public CustomEditTextAnimation(Context context) {
        super(context);
        utils = new Utils();
    }


    public CustomEditTextAnimation(Context context, AttributeSet attrs) {
        super(context, attrs);
        utils = new Utils();
    }

    public CustomEditTextAnimation(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        utils = new Utils();
    }


    public static void init(final CustomEditTextAnimation edt,final ViewGroup viewGroup, final int initWidth, final int initHeight, final int transitWidth, final int transitHeight){
        edt.setOnFocusChangeListener(new OnFocusChangeListener() {
            @SuppressLint("NewApi")
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    TransitionManager.beginDelayedTransition(viewGroup);
                    edt.setWidth(utils.dpToPx(transitWidth));
                    edt.setHeight(utils.dpToPx(transitHeight));
                } else {
                    TransitionManager.beginDelayedTransition(viewGroup);
                    edt.setWidth(utils.dpToPx(initWidth));
                    edt.setHeight(utils.dpToPx(initHeight));
                }
            }
        });
    }
}
