package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.o */
public final class C5429o implements View.OnTouchListener {

    /* renamed from: a */
    public final C5430a f14380a;

    /* renamed from: b */
    public float f14381b;

    /* renamed from: c */
    public float f14382c;

    /* renamed from: d */
    public float f14383d;

    /* renamed from: com.fyber.inneractive.sdk.web.o$a */
    public interface C5430a {
    }

    public C5429o(C5430a aVar, Context context) {
        this.f14380a = aVar;
        this.f14383d = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14380a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((C5396a) this.f14380a).mo26508d();
                this.f14381b = motionEvent.getX();
                this.f14382c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((C5396a) this.f14380a).mo26508d();
                this.f14382c = -1.0f;
                this.f14381b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.f14381b;
                if (f >= 0.0f && this.f14382c >= 0.0f) {
                    float round = (float) Math.round(Math.abs(this.f14382c - motionEvent.getY()));
                    float f2 = this.f14383d;
                    if (((float) Math.round(Math.abs(f - motionEvent.getX()))) < f2 && round < f2) {
                        C5396a aVar = (C5396a) this.f14380a;
                        aVar.getClass();
                        IAlog.m16699a("IAWebViewController onClicked()", new Object[0]);
                        if (aVar.f14290l != null) {
                            IAlog.m16702d("Native click detected in time. Processing pending click", new Object[0]);
                            aVar.f14290l.mo26521d();
                            Runnable runnable = aVar.f14291m;
                            if (runnable != null) {
                                C5357n.f14225b.removeCallbacks(runnable);
                            }
                            aVar.f14290l = null;
                            aVar.mo26508d();
                        } else {
                            if (aVar.f14292n != null) {
                                C5357n.f14225b.postDelayed(aVar.f14292n, (long) IAConfigManager.f10525J.f10557v.f10660b.mo24345a("click_timeout", 1000, 1000));
                            }
                            aVar.f14288j = true;
                        }
                    }
                    this.f14381b = -1.0f;
                    this.f14382c = -1.0f;
                }
            }
        }
        return false;
    }
}
