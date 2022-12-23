package com.applovin.impl.adview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.applovin.impl.adview.i */
public abstract class C1525i extends View {

    /* renamed from: a */
    protected float f1899a = 1.0f;

    /* renamed from: b */
    protected final Context f1900b;

    /* renamed from: com.applovin.impl.adview.i$a */
    public enum C1526a {
        WHITE_ON_BLACK(0),
        WHITE_ON_TRANSPARENT(1),
        INVISIBLE(2),
        TRANSPARENT_SKIP(3);
        

        /* renamed from: e */
        private final int f1906e;

        private C1526a(int i) {
            this.f1906e = i;
        }

        /* renamed from: a */
        public int mo12963a() {
            return this.f1906e;
        }
    }

    protected C1525i(Context context) {
        super(context);
        this.f1900b = context;
    }

    /* renamed from: a */
    public static C1525i m2800a(C1526a aVar, Context context) {
        return aVar.equals(C1526a.INVISIBLE) ? new C1550p(context) : aVar.equals(C1526a.WHITE_ON_TRANSPARENT) ? new C1551q(context) : aVar.equals(C1526a.TRANSPARENT_SKIP) ? new C1552r(context) : new C1558w(context);
    }

    /* renamed from: a */
    public void mo12959a(int i) {
        setViewScale(((float) i) / 30.0f);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (int) getSize();
            layoutParams.height = (int) getSize();
        }
    }

    public float getSize() {
        return this.f1899a * 30.0f;
    }

    public abstract C1526a getStyle();

    public void setViewScale(float f) {
        this.f1899a = f;
    }
}
