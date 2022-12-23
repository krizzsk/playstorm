package com.ogury.p376ed.internal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* renamed from: com.ogury.ed.internal.gp */
public final class C10564gp {
    /* renamed from: a */
    public static final Activity m32101a(View view) {
        View findViewById;
        C10765mq.m32773b(view, "<this>");
        View rootView = view.getRootView();
        Context context = null;
        if (!(rootView == null || (findViewById = rootView.findViewById(16908290)) == null)) {
            context = findViewById.getContext();
        }
        return m32100a(context);
    }

    /* renamed from: a */
    private static final Activity m32100a(Context context) {
        while (true) {
            ContextWrapper contextWrapper = null;
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof ContextWrapper) {
                contextWrapper = (ContextWrapper) baseContext;
            }
            context = contextWrapper;
        }
    }
}
