package com.applovin.impl.mediation.debugger.p038ui.p043d;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: com.applovin.impl.mediation.debugger.ui.d.b */
public class C1706b {

    /* renamed from: a */
    public TextView f2533a;

    /* renamed from: b */
    public TextView f2534b;

    /* renamed from: c */
    public ImageView f2535c;

    /* renamed from: d */
    public ImageView f2536d;

    /* renamed from: e */
    private C1707c f2537e;

    /* renamed from: f */
    private int f2538f;

    /* renamed from: a */
    public int mo13527a() {
        return this.f2538f;
    }

    /* renamed from: a */
    public void mo13528a(int i) {
        this.f2538f = i;
    }

    /* renamed from: a */
    public void mo13529a(C1707c cVar) {
        this.f2537e = cVar;
        this.f2533a.setText(cVar.mo13533k());
        this.f2533a.setTextColor(cVar.mo13536n());
        if (this.f2534b != null) {
            if (!TextUtils.isEmpty(cVar.mo13508c_())) {
                this.f2534b.setTypeface((Typeface) null, 0);
                this.f2534b.setVisibility(0);
                this.f2534b.setText(cVar.mo13508c_());
                this.f2534b.setTextColor(cVar.mo13487c());
                if (cVar.mo13509d_()) {
                    this.f2534b.setTypeface((Typeface) null, 1);
                }
            } else {
                this.f2534b.setVisibility(8);
            }
        }
        if (this.f2535c != null) {
            if (cVar.mo13504e() > 0) {
                this.f2535c.setImageResource(cVar.mo13504e());
                this.f2535c.setColorFilter(cVar.mo13537o());
                this.f2535c.setVisibility(0);
            } else {
                this.f2535c.setVisibility(8);
            }
        }
        if (this.f2536d == null) {
            return;
        }
        if (cVar.mo13505f() > 0) {
            this.f2536d.setImageResource(cVar.mo13505f());
            this.f2536d.setColorFilter(cVar.mo13506g());
            this.f2536d.setVisibility(0);
            return;
        }
        this.f2536d.setVisibility(8);
    }

    /* renamed from: b */
    public C1707c mo13530b() {
        return this.f2537e;
    }
}
