package com.ctrlplusz.anytextview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static Map<String, Typeface> typefaceCache = new HashMap<String, Typeface>();

    public static void setTypeface(TextView textView, String typefaceName) {
        Context context = textView.getContext();

        if (typefaceCache.containsKey(typefaceName)) {
            textView.setTypeface(typefaceCache.get(typefaceName));
        } else {
            Typeface typeface;
            try {
                typeface = Typeface.createFromAsset(textView.getContext().getAssets(), context.getString(R.string.fonts_folder) + typefaceName);
            } catch (Exception e) {
                Log.v(context.getString(R.string.app), String.format(context.getString(R.string.typeface_not_found), typefaceName));
                return;
            }

            typefaceCache.put(typefaceName, typeface);
            textView.setTypeface(typeface);
        }
    }
}