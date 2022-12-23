package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C6004dw;
import com.inmobi.media.C6125fq;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.ef */
/* compiled from: InMobiTrackedNativeV2VideoAd */
public class C6021ef extends C6003dv {

    /* renamed from: d */
    private static final String f15313d = C6021ef.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f15314e;

    /* renamed from: f */
    private final C6004dw f15315f;

    /* renamed from: g */
    private final C6022eg f15316g = new C6022eg((byte) 0);

    /* renamed from: h */
    private final C6318n f15317h;

    public C6021ef(C6332o oVar, C6004dw dwVar) {
        super(oVar);
        this.f15314e = new WeakReference<>(oVar.mo35570j());
        this.f15315f = dwVar;
        this.f15317h = oVar;
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15315f.mo35120b();
    }

    /* renamed from: a */
    public final C6004dw.C6005a mo35115a() {
        return this.f15315f.mo35115a();
    }

    /* renamed from: d */
    public final void mo35122d() {
        try {
            Context context = (Context) this.f15314e.get();
            C6332o oVar = (C6332o) this.f15271a;
            if (!oVar.f16009j && context != null) {
                this.f15316g.mo35149a(context, (C6318n) oVar);
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15315f.mo35122d();
            throw th;
        }
        this.f15315f.mo35122d();
    }

    /* renamed from: a */
    public final void mo35116a(byte b) {
        this.f15315f.mo35116a(b);
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        if (b == 0) {
            C6022eg.m18002b(context);
        } else if (b == 1) {
            C6022eg.m18003c(context);
        } else if (b == 2) {
            try {
                this.f15316g.mo35145a(context);
            } catch (Exception e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            } catch (Throwable th) {
                this.f15315f.mo35117a(context, b);
                throw th;
            }
        }
        this.f15315f.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        this.f15316g.mo35146a((Context) this.f15314e.get(), this.f15315f.mo35120b(), this.f15317h);
        super.mo35123e();
        this.f15314e.clear();
        this.f15315f.mo35123e();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15315f.mo35120b();
        if (b != null) {
            this.f15316g.mo35146a((Context) this.f15314e.get(), b, this.f15317h);
        }
        return this.f15315f.mo35114a(view, viewGroup, z);
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            C6332o oVar = (C6332o) this.f15271a;
            C6102fk fkVar = (C6102fk) oVar.getVideoContainerView();
            Context context = (Context) this.f15314e.get();
            C6125fq.C6142m mVar = this.f15273c.viewability;
            if (!(context == null || fkVar == null || oVar.f16009j)) {
                C6089fj videoView = fkVar.getVideoView();
                this.f15316g.mo35148a(context, videoView, oVar, mVar);
                View b = this.f15315f.mo35120b();
                if (!(videoView.getTag() == null || b == null)) {
                    C5923cg cgVar = (C5923cg) videoView.getTag();
                    if (oVar.getPlacementType() == 0 && !((Boolean) cgVar.f14913v.get("isFullScreen")).booleanValue()) {
                        this.f15316g.mo35147a(context, b, this.f15317h, ((C6332o) this.f15317h).f16040x, mVar);
                    }
                }
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15315f.mo35119a(map);
            throw th;
        }
        this.f15315f.mo35119a(map);
    }
}
