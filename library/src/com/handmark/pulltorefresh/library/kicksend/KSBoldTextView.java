package com.handmark.pulltorefresh.library.kicksend;

import java.util.Locale;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class KSBoldTextView extends TextView {

    public KSBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setCustomTypeface(context);
    }

    public KSBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setCustomTypeface(context);
    }

    public KSBoldTextView(Context context) {
        super(context);
        setCustomTypeface(context);
    }

    public void setCustomTypeface(Context context) {
    	String language = Locale.getDefault().getLanguage();
        if (language.equals("da") || 
    		language.equals("de") ||
    		language.equals("en") || 
    		language.equals("es") ||
    		language.equals("fr") || 
    		language.equals("in") ||
    		language.equals("it") || 
    		language.equals("nl") ||
    		language.equals("pt")) {
			setTypeface(KSTypefaces.get(context, "font/proximanova-semibold.ttf"), Typeface.NORMAL);
        } else {
        	setTypeface(KSTypefaces.get(context, "font/Roboto-Bold.ttf"), Typeface.NORMAL);
        }
    }
}
