package com.fyber.inneractive.sdk.player.p191ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.C5367q0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.c */
public abstract class C5094c extends RelativeLayout implements C5098g {

    /* renamed from: a */
    public final C5364p0 f13638a;

    /* renamed from: b */
    public int f13639b;

    /* renamed from: c */
    public C4346z f13640c;

    /* renamed from: d */
    public UnitDisplayType f13641d;

    /* renamed from: e */
    public boolean f13642e;

    /* renamed from: f */
    public boolean f13643f;

    /* renamed from: g */
    public C5099h f13644g;

    /* renamed from: h */
    public boolean f13645h;

    public C5094c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13638a = C5364p0.m16776a();
        this.f13639b = 0;
        this.f13642e = false;
        this.f13643f = false;
        this.f13645h = false;
        this.f13639b = Math.min(C5350l.m16769e(), C5350l.m16767d());
    }

    /* renamed from: a */
    public String mo25725a() {
        return IAlog.m16696a((Object) this);
    }

    /* renamed from: a */
    public abstract void mo25726a(C5367q0 q0Var, int i, int i2);

    /* renamed from: b */
    public void mo25727b() {
        boolean z = isShown() && hasWindowFocus() && this.f13643f && !this.f13645h;
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.f13642e && this.f13644g != null) {
            IAlog.m16699a("%supdateVisibility changing to %s", IAlog.m16696a((Object) this), Boolean.valueOf(z));
            this.f13642e = z;
            this.f13644g.mo24891a(z);
        }
    }

    public void destroy() {
        if (this.f13644g != null) {
            this.f13644g = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m16699a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m16696a((Object) this), Boolean.valueOf(this.f13643f));
        this.f13643f = true;
        C5099h hVar = this.f13644g;
        if (hVar != null) {
            hVar.mo24892b();
        }
        mo25727b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m16699a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m16696a((Object) this), Boolean.valueOf(this.f13643f));
        this.f13643f = false;
        C5099h hVar = this.f13644g;
        if (hVar != null) {
            hVar.mo24927d();
        }
        mo25727b();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m16699a("%sgot onVisibilityChanged with %d", IAlog.m16696a((Object) this), Integer.valueOf(i));
            mo25727b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m16699a("%sgot onWindowFocusChanged with: %s", IAlog.m16696a((Object) this), Boolean.valueOf(z));
        mo25727b();
    }

    public void setListener(C5099h hVar) {
        this.f13644g = hVar;
    }

    public void setUnitConfig(C4346z zVar) {
        UnitDisplayType unitDisplayType;
        this.f13640c = zVar;
        C4345y yVar = (C4345y) zVar;
        if (yVar.f10749e == null) {
            unitDisplayType = yVar.f10750f.f10579j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.f13641d = unitDisplayType;
    }
}
