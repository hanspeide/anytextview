package com.ctrlplusz.anytextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import java.lang.String;

public class AnyTextView extends TextView {

    private final Util util = new Util();

    public AnyTextView(Context context){
        super(context);
    }

    public AnyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if (!isInEditMode()){
            setTypefaceFromAttrs(context, attrs);
        }
    }

    public AnyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        if (!isInEditMode()){
            setTypefaceFromAttrs(context, attrs);
        }
    }

    private void setTypefaceFromAttrs(Context context, AttributeSet attrs) {
        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.AnyTextView);
        String typefaceName = values.getString(R.styleable.AnyTextView_typeface);

        if (!isInEditMode()){
            util.setTypeface(this, typefaceName);
        }
    }

    /*
     *  <attr name="typeface" format="reference" />

static somewhere (gets the internal android R stylable id)
private static final int resourceId = Resources.getSystem().getIdentifier("typeface", "attr", "android");

you can probably override setTypeface to check your typeface setter before calling the parent function:
void setTypeface(AttributeSet attrs) {
for (int i = 0; i < attrs.getAttributeCount(); i++) {
           if (resourceId == attrs.getAttributeNameResource(i)) {
           	// this is the internal android:typeface attribute
               break;
           }
       }
}﻿
     */
}
