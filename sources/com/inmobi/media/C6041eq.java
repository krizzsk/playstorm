package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.VerificationScriptResource;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.C6004dw;
import com.inmobi.media.C6042er;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.eq */
/* compiled from: OmidTrackedNativeV2VideoAd */
public class C6041eq extends C6003dv {

    /* renamed from: d */
    private static final String f15370d = C6041eq.class.getSimpleName();

    /* renamed from: e */
    private final VastProperties f15371e;

    /* renamed from: f */
    private final WeakReference<Context> f15372f;

    /* renamed from: g */
    private final C6004dw f15373g;

    /* renamed from: h */
    private C6034ek f15374h;

    /* renamed from: i */
    private WeakReference<View> f15375i;

    public C6041eq(Context context, C6004dw dwVar, C6332o oVar, C6034ek ekVar, VastProperties vastProperties) {
        super(oVar);
        this.f15372f = new WeakReference<>(context);
        this.f15373g = dwVar;
        this.f15374h = ekVar;
        this.f15371e = vastProperties;
    }

    /* renamed from: c */
    public final View mo35121c() {
        return this.f15373g.mo35121c();
    }

    /* renamed from: a */
    public final View mo35114a(View view, ViewGroup viewGroup, boolean z) {
        return this.f15373g.mo35114a(view, viewGroup, z);
    }

    /* renamed from: b */
    public final View mo35120b() {
        return this.f15373g.mo35120b();
    }

    /* renamed from: a */
    public final C6004dw.C6005a mo35115a() {
        return this.f15373g.mo35115a();
    }

    /* renamed from: a */
    public final void mo35117a(Context context, byte b) {
        this.f15373g.mo35117a(context, b);
    }

    /* renamed from: e */
    public final void mo35123e() {
        super.mo35123e();
        try {
            this.f15372f.clear();
            if (this.f15375i != null) {
                this.f15375i.clear();
            }
            this.f15374h = null;
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15373g.mo35123e();
            throw th;
        }
        this.f15373g.mo35123e();
    }

    /* renamed from: a */
    public static C6034ek m18074a(List<VerificationScriptResource> list, String str, String str2) {
        return new C6035el("native_video_ad", ImpressionType.VIEWABLE, C6042er.C6043a.f15376a.mo35168a(list, str2, str));
    }

    /* renamed from: a */
    public final void mo35119a(Map<View, FriendlyObstructionPurpose> map) {
        C6102fk fkVar;
        try {
            if (this.f15273c.viewability.omidConfig.omidEnabled && C6042er.C6043a.f15376a.mo35170a() && (this.f15271a instanceof C6332o) && (fkVar = (C6102fk) this.f15271a.getVideoContainerView()) != null) {
                C6086fi mediaController = fkVar.getVideoView().getMediaController();
                WeakReference<View> weakReference = new WeakReference<>(fkVar);
                this.f15375i = weakReference;
                this.f15374h.mo35164a((View) weakReference.get(), mediaController != null ? mediaController.getFriendlyViews() : null, this.f15373g.mo35120b());
                this.f15374h.hashCode();
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15373g.mo35119a(map);
            throw th;
        }
        this.f15373g.mo35119a(map);
    }

    /* renamed from: d */
    public final void mo35122d() {
        try {
            if (!((C6332o) this.f15271a).mo35569i()) {
                this.f15374h.mo35161a();
                this.f15374h.hashCode();
            }
        } catch (Exception e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        } catch (Throwable th) {
            this.f15373g.mo35122d();
            throw th;
        }
        this.f15373g.mo35122d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (((com.inmobi.media.C6332o) r6.f15271a).mo35569i() != false) goto L_0x0064;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35116a(byte r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = 5
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r7 == r1) goto L_0x0054
            r1 = 6
            if (r7 == r1) goto L_0x0011
            r1 = 13
            if (r7 == r1) goto L_0x006b
            r1 = 14
            goto L_0x006a
        L_0x0011:
            com.inmobi.media.j r1 = r6.f15271a     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1 instanceof com.inmobi.media.C6332o     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.j r1 = r6.f15271a     // Catch:{ Exception -> 0x0075 }
            android.view.View r1 = r1.getVideoContainerView()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.fk r1 = (com.inmobi.media.C6102fk) r1     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.fj r0 = r1.getVideoView()     // Catch:{ Exception -> 0x0075 }
            int r0 = r0.getDuration()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.fj r1 = r1.getVideoView()     // Catch:{ Exception -> 0x0075 }
            java.lang.Object r1 = r1.getTag()     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.cg r1 = (com.inmobi.media.C5923cg) r1     // Catch:{ Exception -> 0x0075 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f14913v     // Catch:{ Exception -> 0x0075 }
            java.lang.String r5 = "currentMediaVolume"
            java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception -> 0x0075 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Exception -> 0x0075 }
            int r4 = r4.intValue()     // Catch:{ Exception -> 0x0075 }
            if (r4 <= 0) goto L_0x006b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f14913v     // Catch:{ Exception -> 0x0075 }
            java.lang.String r4 = "lastMediaVolume"
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x0075 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0075 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0075 }
            if (r1 != 0) goto L_0x006b
            goto L_0x006a
        L_0x0054:
            com.inmobi.media.j r1 = r6.f15271a     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1 instanceof com.inmobi.media.C6332o     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            com.inmobi.media.j r1 = r6.f15271a     // Catch:{ Exception -> 0x0075 }
            com.inmobi.media.o r1 = (com.inmobi.media.C6332o) r1     // Catch:{ Exception -> 0x0075 }
            boolean r1 = r1.mo35569i()     // Catch:{ Exception -> 0x0075 }
            if (r1 == 0) goto L_0x006a
        L_0x0064:
            com.inmobi.media.dw r0 = r6.f15373g
            r0.mo35116a((byte) r7)
            return
        L_0x006a:
            r2 = r3
        L_0x006b:
            com.inmobi.media.ek r1 = r6.f15374h     // Catch:{ Exception -> 0x0075 }
            com.iab.omid.library.inmobi.adsession.media.VastProperties r3 = r6.f15371e     // Catch:{ Exception -> 0x0075 }
            r1.mo35163a(r7, r0, r2, r3)     // Catch:{ Exception -> 0x0075 }
            goto L_0x0064
        L_0x0073:
            r0 = move-exception
            goto L_0x0083
        L_0x0075:
            r0 = move-exception
            com.inmobi.media.gg r1 = com.inmobi.media.C6181gg.m18398a()     // Catch:{ all -> 0x0073 }
            com.inmobi.media.hg r2 = new com.inmobi.media.hg     // Catch:{ all -> 0x0073 }
            r2.<init>(r0)     // Catch:{ all -> 0x0073 }
            r1.mo35357a((com.inmobi.media.C6217hg) r2)     // Catch:{ all -> 0x0073 }
            goto L_0x0064
        L_0x0083:
            com.inmobi.media.dw r1 = r6.f15373g
            r1.mo35116a((byte) r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6041eq.mo35116a(byte):void");
    }
}
