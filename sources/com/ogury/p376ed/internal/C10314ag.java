package com.ogury.p376ed.internal;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import p394io.presage.C12358R;

/* renamed from: com.ogury.ed.internal.ag */
public final class C10314ag {

    /* renamed from: a */
    private final C10318aj f26130a;

    /* renamed from: b */
    private final ViewGroup f26131b;

    /* renamed from: c */
    private final C10469dv f26132c;

    /* renamed from: d */
    private final String f26133d;

    /* renamed from: e */
    private ImageButton f26134e = new ImageButton(this.f26131b.getContext());

    /* renamed from: f */
    private Handler f26135f = new Handler(Looper.getMainLooper());

    public C10314ag(C10318aj ajVar, ViewGroup viewGroup, C10469dv dvVar, String str) {
        C10765mq.m32773b(ajVar, "adController");
        C10765mq.m32773b(viewGroup, "root");
        C10765mq.m32773b(dvVar, "presageApi");
        C10765mq.m32773b(str, "closeButtonCallUrl");
        this.f26130a = ajVar;
        this.f26131b = viewGroup;
        this.f26132c = dvVar;
        this.f26133d = str;
        m31170d();
    }

    /* renamed from: d */
    private final void m31170d() {
        m31172f();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 5;
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        this.f26134e.setLayoutParams(layoutParams2);
        this.f26134e.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10314ag.m31169a(C10314ag.this, view);
            }
        });
        this.f26134e.setVisibility(8);
        this.f26131b.addView(this.f26134e, layoutParams2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31169a(C10314ag agVar, View view) {
        C10765mq.m32773b(agVar, "this$0");
        agVar.f26130a.mo67050s();
        agVar.m31171e();
    }

    /* renamed from: e */
    private final void m31171e() {
        if (this.f26133d.length() > 0) {
            this.f26132c.mo67207a(this.f26133d);
        }
    }

    /* renamed from: f */
    private final void m31172f() {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f26134e.setBackground((Drawable) null);
        } else {
            this.f26134e.setBackgroundResource(0);
        }
        this.f26134e.setImageResource(C12358R.C12359drawable.btn_presage_mraid_close);
    }

    /* renamed from: a */
    public final void mo67014a(long j) {
        this.f26135f.postDelayed(new Runnable() {
            public final void run() {
                C10314ag.m31168a(C10314ag.this);
            }
        }, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m31168a(C10314ag agVar) {
        C10765mq.m32773b(agVar, "this$0");
        agVar.mo67013a();
    }

    /* renamed from: a */
    public final void mo67013a() {
        this.f26134e.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo67015b() {
        this.f26135f.removeCallbacksAndMessages((Object) null);
        this.f26134e.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo67016c() {
        this.f26135f.removeCallbacksAndMessages((Object) null);
    }
}
