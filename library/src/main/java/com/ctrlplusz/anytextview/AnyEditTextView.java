package com.ctrlplusz.anytextview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

public class AnyEditTextView extends EditText {

    public AnyEditTextView(Context context) {
        super(context);
    }

    public AnyEditTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Util.setTypeface(attrs, this);
    }

    public AnyEditTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Util.setTypeface(attrs, this);
    }
}
