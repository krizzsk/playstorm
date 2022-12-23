package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C6004dw;
import com.inmobi.media.C6125fq;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.ee */
/* compiled from: InMobiTrackedNativeV2DisplayAd */
public class C6020ee extends C6003dv {

    /* renamed from: d */
    private static final String f15308d = C6020ee.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f15309e;

    /* renamed from: f */
    private final C6004dw f15310f;

    /* renamed from: g */
    private final C6022eg f15311g = new C6022eg((byte) 1);

    /* renamed from: h */
    private final C6318n f15312h;

    public C6020ee(Context context, C6318n nVar, C6004dw dwVar) {
        super(nVar);
        this.f15309e = new WeakReference<>(context);
        this.f15310f = dwVar;
        this.f15312h = nVar;
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15310f.mo35120b();
    }

    /* renamed from: a */
    public final C6004dw.C6005a mo35115a() {
        return this.f15310f.mo35115a();
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            Context context = (Context) this.f15309e.get();
            View b = this.f15310f.mo35120b();
            C6125fq.C6142m mVar = this.f15273c.viewability;
            C6318n nVar = (C6318n) this.f15271a;
            if (!(context == null || b == null || nVar.f16009j)) {
                this.f15311g.mo35148a(context, b, nVar, mVar);
                this.f15311g.mo35147a(context, b, this.f15312h, this.f15312h.f16022w, mVar);
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15310f.mo35119a(map);
            throw th;
        }
        this.f15310f.mo35119a(map);
    }

    /* renamed from: a */
    public final void mo35116a(byte b) {
        this.f15310f.mo35116a(b);
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        if (b == 0) {
            C6022eg.m18002b(context);
        } else if (b == 1) {
            C6022eg.m18003c(context);
        } else if (b == 2) {
            try {
                this.f15311g.mo35145a(context);
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            } catch (Throwable th) {
                this.f15310f.mo35117a(context, b);
                throw th;
            }
        }
        this.f15310f.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        this.f15311g.mo35146a(this.f15312h.mo35564d(), this.f15310f.mo35120b(), this.f15312h);
        super.mo35123e();
        this.f15309e.clear();
        this.f15310f.mo35123e();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15310f.mo35120b();
        if (b != null) {
            this.f15311g.mo35146a(this.f15312h.mo35564d(), b, this.f15312h);
        }
        return this.f15310f.mo35114a(view, viewGroup, z);
    }

    /* renamed from: d */
    public final void mo35122d() {
        try {
            C6318n nVar = (C6318n) this.f15271a;
            if (!nVar.f16009j) {
                this.f15311g.mo35149a((Context) this.f15309e.get(), nVar);
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15310f.mo35122d();
            throw th;
        }
        this.f15310f.mo35122d();
    }
}
