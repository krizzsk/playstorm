package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class TapjoyDisplayMetricsUtil {

    /* renamed from: a */
    private Context f27625a;

    /* renamed from: b */
    private Configuration f27626b;

    /* renamed from: c */
    private DisplayMetrics f27627c = new DisplayMetrics();

    public TapjoyDisplayMetricsUtil(Context context) {
        this.f27625a = context;
        ((WindowManager) this.f27625a.getSystemService("window")).getDefaultDisplay().getMetrics(this.f27627c);
        this.f27626b = this.f27625a.getResources().getConfiguration();
    }

    public int getScreenDensityDPI() {
        return this.f27627c.densityDpi;
    }

    public float getScreenDensityScale() {
        return this.f27627c.density;
    }

    public int getScreenLayoutSize() {
        return this.f27626b.screenLayout & 15;
    }
}
