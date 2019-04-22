package com.aras.modir.mylibrary;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;

public class MyButton extends AppCompatButton {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeFaceOne(context);
    }

    void setTypeFaceOne(Context mContext) {
        this.setTypeface(Typeface.createFromAsset(
                mContext.getAssets(), "ir_sans.ttf"
        ));
    }
}
