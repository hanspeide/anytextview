package com.ctrlplusz.anytextviewsample;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class AnyTextView extends TextView {

    public static Map<String, Typeface> typefaceCache = new HashMap<String, Typeface>();

    public AnyTextView(Context context) {
        super(context);
    }

    public AnyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypefaceFromAttrs(context, attrs);
    }

    public AnyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setTypefaceFromAttrs(context, attrs);
    }

    private void setTypefaceFromAttrs(Context context, AttributeSet attrs) {
        TypedArray values = context.obtainStyledAttributes(attrs, R.styleable.AnyTextView);
        String typefaceName = values.getString(R.styleable.AnyTextView_typeface);

        if (typefaceCache.containsKey(typefaceName)){
            setTypeface(typefaceCache.get(typefaceName));
        } else {
            Typeface typeface = null;
            try {
                typeface = Typeface.createFromAsset(this.getContext().getAssets(), "fonts/" + typefaceName);
            } catch (Exception e){
                Log.i("AnyTextView", "Typeface with name " + typefaceName + " was not found, or font could not be loaded. " +
                        "Showing default typeface.");
                return;
            }

            typefaceCache.put(typefaceName, typeface);
            setTypeface(typeface);
        }
    }
}
