package com.ctrlplusz.anytextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class AnyTextView extends TextView {

    public AnyTextView(Context context) {
        super(context);
    }

    public AnyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()) {
            Util.setTypeface(attrs, this);
        }
    }

    public AnyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode()) {
            Util.setTypeface(attrs, this);
        }
    }
}
