package com.bytedance.sdk.openadsdk.p176i;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p110d.C2898j;
import com.bytedance.sdk.component.p110d.C2902n;
import com.bytedance.sdk.openadsdk.core.C3513g;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import com.bytedance.sdk.openadsdk.p172h.p173a.C3814b;
import com.smaato.sdk.video.vast.model.ErrorCode;

/* renamed from: com.bytedance.sdk.openadsdk.i.b */
/* compiled from: StatsImageListener */
public class C3852b implements C2902n<Bitmap> {

    /* renamed from: a */
    private boolean f9966a;

    /* renamed from: b */
    private C3814b f9967b;

    /* renamed from: a */
    public void mo20699a(String str) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20637c(str);
        }
    }

    /* renamed from: a */
    public void mo20698a(int i) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20632a(i);
        }
    }

    /* renamed from: b */
    public void mo20700b(String str) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20641e(str);
        }
    }

    /* renamed from: c */
    public void mo20701c(String str) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20639d(str);
        }
    }

    /* renamed from: d */
    public void mo20702d(String str) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20645g(str);
        }
    }

    public C3852b(boolean z) {
        this.f9966a = z;
        if (z) {
            this.f9967b = C3814b.m12522b();
        }
    }

    /* renamed from: a */
    public void mo17257a(C2898j<Bitmap> jVar) {
        if (this.f9966a && this.f9967b != null) {
            if (jVar == null || jVar.mo17725b() == null) {
                this.f9967b.mo20635b((int) ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR).mo20643f(C3513g.m10825a(ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR));
                C3815b.m12552a().mo20670e(this.f9967b);
            }
        }
    }

    /* renamed from: a */
    public void mo17256a(int i, String str, Throwable th) {
        C3814b bVar;
        if (this.f9966a && (bVar = this.f9967b) != null) {
            bVar.mo20635b((int) ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR).mo20643f(C3513g.m10825a(ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR));
            C3815b.m12552a().mo20670e(this.f9967b);
        }
    }
}
