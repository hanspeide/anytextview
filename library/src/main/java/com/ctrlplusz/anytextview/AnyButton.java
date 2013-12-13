package com.ctrlplusz.anytextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class AnyButton extends Button {

    public AnyButton(Context context) {
        super(context);
    }

    public AnyButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            Util.setTypeface(attrs, this);
        }
    }

    public AnyButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode()) {
            Util.setTypeface(attrs, this);
        }
    }
}
