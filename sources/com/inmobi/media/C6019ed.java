package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C6004dw;
import java.util.Map;

/* renamed from: com.inmobi.media.ed */
/* compiled from: InMobiTrackedHtmlAd */
public class C6019ed extends C6004dw {

    /* renamed from: d */
    private static final String f15303d = C6019ed.class.getSimpleName();

    /* renamed from: e */
    private final C6004dw f15304e;

    /* renamed from: f */
    private final C6014ec f15305f;

    /* renamed from: g */
    private final int f15306g;

    /* renamed from: h */
    private final int f15307h;

    /* renamed from: a */
    public final void mo35116a(byte b) {
    }

    public C6019ed(C6286j jVar, C6014ec ecVar, C6004dw dwVar, int i, int i2) {
        super(jVar);
        this.f15304e = dwVar;
        this.f15305f = ecVar;
        this.f15306g = i;
        this.f15307h = i2;
    }

    /* renamed from: a */
    public final C6004dw.C6005a mo35115a() {
        return this.f15304e.mo35115a();
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15304e.mo35120b();
    }

    /* renamed from: c */
    public final View mo35121c() {
        return this.f15304e.mo35121c();
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        if (b == 0) {
            this.f15305f.mo35139b();
        } else if (b == 1) {
            this.f15305f.mo35135a();
        } else if (b == 2) {
            try {
                this.f15305f.mo35141d();
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            } catch (Throwable th) {
                this.f15304e.mo35117a(context, b);
                throw th;
            }
        }
        this.f15304e.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        this.f15305f.mo35141d();
        super.mo35123e();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15304e.mo35120b();
        if (b != null) {
            this.f15305f.mo35136a(b);
        }
        return this.f15304e.mo35114a(view, viewGroup, z);
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        View b = this.f15304e.mo35120b();
        if (b != null) {
            this.f15305f.mo35137a(b, b, this.f15306g, this.f15307h);
            this.f15304e.mo35119a(map);
        }
    }

    /* renamed from: d */
    public final void mo35122d() {
        View b = this.f15304e.mo35120b();
        if (b != null) {
            this.f15305f.mo35136a(b);
            this.f15304e.mo35122d();
        }
    }
}
