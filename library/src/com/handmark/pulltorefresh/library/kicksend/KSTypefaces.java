package com.handmark.pulltorefresh.library.kicksend;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

import java.util.Hashtable;

import com.handmark.pulltorefresh.library.BuildConfig;

public class KSTypefaces {

    private static final String  TAG   = "KSTypefaces";

    private static final Hashtable<String, Typeface> cache = new Hashtable<String, Typeface>();

    public static Typeface get(Context c, String assetPath) {
        synchronized (cache) {
            if (!cache.containsKey(assetPath)) {
                try {
                    Typeface t = Typeface.createFromAsset(c.getAssets(), assetPath);
                    cache.put(assetPath, t);
                } catch (Exception e) {
                    if (BuildConfig.DEBUG)
                        Log.e(TAG, "Could not get typeface '" + assetPath + "' because " + e.getMessage());
                    return null;
                }
            }
            return cache.get(assetPath);
        }
    }
}
