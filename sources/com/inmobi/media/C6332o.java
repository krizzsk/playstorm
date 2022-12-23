package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.share.internal.ShareConstants;
import com.google.common.base.Ascii;
import com.iab.omid.library.inmobi.adsession.media.Position;
import com.iab.omid.library.inmobi.adsession.media.VastProperties;
import com.inmobi.media.C6022eg;
import com.inmobi.media.C6286j;
import com.inmobi.media.C6318n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.o */
/* compiled from: NativeVideoAdContainer */
public class C6332o extends C6318n {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final String f16038y = C6332o.class.getSimpleName();

    /* renamed from: A */
    private final C6286j.C6287a f16039A = new C6286j.C6287a() {
        /* renamed from: a */
        public final void mo35510a() {
            String unused = C6332o.f16038y;
            C6318n.C6331c e = C6332o.this.mo35565e();
            if (e != null) {
                e.mo34564a();
            }
        }

        /* renamed from: a */
        public final void mo35511a(Object obj) {
            if (C6332o.this.mo35572l() != null) {
                C5923cg cgVar = (C5923cg) obj;
                String unused = C6332o.f16038y;
                cgVar.f14913v.put("didRequestFullScreen", Boolean.TRUE);
                cgVar.f14913v.put("isFullScreen", Boolean.TRUE);
                cgVar.f14913v.put("shouldAutoPlay", Boolean.TRUE);
                if (cgVar.f14916y != null) {
                    cgVar.f14916y.f14913v.put("didRequestFullScreen", Boolean.TRUE);
                    cgVar.f14916y.f14913v.put("isFullScreen", Boolean.TRUE);
                    cgVar.f14916y.f14913v.put("shouldAutoPlay", Boolean.TRUE);
                }
                if (C6332o.this.getPlacementType() == 0) {
                    C6332o.this.getViewableAd().mo35116a((byte) 1);
                    cgVar.mo34877a("fullscreen", (Map<String, String>) C6332o.this.m19013h(cgVar));
                }
                C6318n.C6331c e = C6332o.this.mo35565e();
                if (e != null) {
                    e.mo34567b();
                }
            }
        }

        /* renamed from: b */
        public final void mo35512b(Object obj) {
            String unused = C6332o.f16038y;
            C5923cg cgVar = (C5923cg) obj;
            cgVar.f14913v.put("didRequestFullScreen", Boolean.FALSE);
            cgVar.f14913v.put("isFullScreen", Boolean.FALSE);
            if (cgVar.f14916y != null) {
                cgVar.f14916y.f14913v.put("didRequestFullScreen", Boolean.FALSE);
                cgVar.f14916y.f14913v.put("isFullScreen", Boolean.FALSE);
                cgVar.f14916y.f14916y = null;
            }
            cgVar.f14916y = null;
            if (C6332o.this.getPlacementType() == 0) {
                C6332o.this.getViewableAd().mo35116a((byte) 2);
                if (C6332o.this.f16011l != null) {
                    C6332o.this.f16011l.getViewableAd().mo35116a((byte) Ascii.DLE);
                }
                cgVar.mo34877a("exitFullscreen", (Map<String, String>) C6332o.this.m19013h(cgVar));
            } else {
                C6332o.this.getViewableAd().mo35116a((byte) 3);
            }
            C6318n.C6331c e = C6332o.this.mo35565e();
            if (e != null) {
                e.mo34571f();
            }
        }
    };

    /* renamed from: x */
    public final C6022eg.C6026a f16040x = new C6022eg.C6026a() {
        /* renamed from: a */
        public final void mo35152a(View view, boolean z) {
            C6332o.this.mo35561a(z);
            C6332o.m19007a(C6332o.this, view, z);
        }
    };

    /* renamed from: z */
    private WeakReference<View> f16041z;

    /* renamed from: b */
    private void m19010b(C6089fj fjVar) {
        int videoVolume = fjVar.getVideoVolume();
        int lastVolume = fjVar.getLastVolume();
        if (videoVolume != lastVolume && lastVolume > 0) {
            m19012b(true);
            fjVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: b */
    private void m19012b(boolean z) {
        C6318n.C6331c e;
        if (getPlacementType() == 0 && !mo35569i() && (e = mo35565e()) != null) {
            e.mo34566a(z);
        }
    }

    C6332o(Context context, byte b, C5907bx bxVar, String str, Set<C6002du> set, C6125fq fqVar, long j, boolean z, String str2) {
        super(context, b, bxVar, str, set, fqVar, j, z, str2);
        this.f16000a = bxVar;
    }

    /* renamed from: a */
    public final void mo35555a(View view) {
        if (!mo35571k() && !this.f16009j && (view instanceof C6089fj)) {
            this.f16008i = true;
            C5923cg cgVar = (C5923cg) ((C6089fj) view).getTag();
            if (!((Boolean) cgVar.f14913v.get("didImpressionFire")).booleanValue()) {
                List<C5922cf> list = cgVar.f14912u;
                Map<String, String> h = m19013h(cgVar);
                List<String> arrayList = new ArrayList<>();
                for (C5922cf next : list) {
                    if ("VideoImpression".equals(next.f15004d)) {
                        if (next.f15002b.startsWith("http")) {
                            C5923cg.m17642a(next, h);
                        }
                        arrayList = (List) next.f15006f.get("referencedEvents");
                        if (arrayList != null) {
                            for (String a : arrayList) {
                                cgVar.mo34877a(a, h);
                            }
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    cgVar.mo34877a("start", h);
                    cgVar.mo34877a("Impression", h);
                }
                this.f16000a.f14938d.mo34877a("Impression", m19013h(cgVar));
                cgVar.f14913v.put("didImpressionFire", Boolean.TRUE);
                this.f16007h.mo35116a((byte) 0);
                if (mo35565e() != null) {
                    mo35565e().mo34569d();
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean mo35569i() {
        return getPlacementType() == 0 && mo35572l() != null;
    }

    public C6004dw getViewableAd() {
        VastProperties vastProperties;
        Context j = mo35570j();
        if (this.f16007h == null && j != null) {
            mo35567g();
            this.f16007h = new C6021ef(this, new C6008dz(this));
            if (this.f16006g != null) {
                for (C6002du duVar : this.f16006g) {
                    try {
                        if (duVar.f15269a == 3) {
                            C6034ek ekVar = (C6034ek) duVar.f15270b.get("omidAdSession");
                            boolean booleanValue = ((Boolean) duVar.f15270b.get("videoAutoPlay")).booleanValue();
                            boolean booleanValue2 = ((Boolean) duVar.f15270b.get("videoSkippable")).booleanValue();
                            int intValue = ((Integer) duVar.f15270b.get("videoSkipOffset")).intValue();
                            if (booleanValue2) {
                                vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) intValue, booleanValue, Position.STANDALONE);
                            } else {
                                vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                            }
                            VastProperties vastProperties2 = vastProperties;
                            if (ekVar != null) {
                                this.f16007h = new C6041eq(j, this.f16007h, this, ekVar, vastProperties2);
                            }
                        }
                    } catch (Exception e) {
                        C6181gg.m18398a().mo35357a(new C6217hg(e));
                    }
                }
            }
        }
        return this.f16007h;
    }

    public C6286j.C6287a getFullScreenEventsListener() {
        return this.f16039A;
    }

    public View getVideoContainerView() {
        WeakReference<View> weakReference = this.f16041z;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo35574n() {
        return !this.f16015p;
    }

    /* renamed from: v */
    public final void mo35603v() {
        this.f16007h.mo35116a((byte) 5);
    }

    /* renamed from: x */
    private void m19015x() {
        this.f16007h.mo35116a((byte) Ascii.f17944SI);
    }

    /* renamed from: q */
    public final void mo35584q() {
        super.mo35584q();
        C6102fk fkVar = (C6102fk) getVideoContainerView();
        if (fkVar != null) {
            C6089fj videoView = fkVar.getVideoView();
            if (getPlacementType() == 0 && !mo35569i() && videoView.getVideoVolume() > 0) {
                videoView.setLastVolume(-2);
                m19012b(true);
            }
            videoView.pause();
        }
    }

    /* renamed from: y */
    private static String m19016y() {
        SecureRandom secureRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i == 0) {
            i = (secureRandom.nextInt() & Integer.MAX_VALUE) % 10;
        }
        sb.append(i);
        for (int i2 = 1; i2 < 8; i2++) {
            sb.append((secureRandom.nextInt() & Integer.MAX_VALUE) % 10);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m19005a(int i) {
        long j = (long) i;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j))), Long.valueOf(j - (TimeUnit.MILLISECONDS.toSeconds(j) * 1000))});
    }

    public void destroy() {
        C6102fk fkVar;
        if (!this.f16009j) {
            if (!(getVideoContainerView() == null || (fkVar = (C6102fk) getVideoContainerView()) == null)) {
                fkVar.getVideoView().mo35260g();
            }
            super.destroy();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35562b(C5901bt btVar) {
        C6102fk fkVar;
        byte b = btVar.f14903l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            super.mo35562b(btVar);
        } else if (b == 3) {
            try {
                if (ShareConstants.VIDEO_URL.equals(btVar.f14893b)) {
                    if (this.f16019t != null) {
                        this.f16019t.mo35620d("window.imraid.broadcastEvent('replay');");
                    }
                    if (mo35566f() != null) {
                        View f = mo35566f();
                        C5919ce b2 = C6318n.m18925b(f);
                        if (b2 != null) {
                            b2.mo34907a();
                        }
                        ViewGroup viewGroup = (ViewGroup) f.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(f);
                        }
                    }
                    C6102fk fkVar2 = (C6102fk) getVideoContainerView();
                    if (fkVar2 != null) {
                        fkVar2.getVideoView().mo35275i();
                        fkVar2.getVideoView().start();
                    }
                }
            } catch (Exception e) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0 && (fkVar = (C6102fk) getVideoContainerView()) != null) {
                    C6089fj videoView = fkVar.getVideoView();
                    C5923cg cgVar = (C5923cg) videoView.getTag();
                    if (videoView.getState() != 1) {
                        try {
                            if (this.f16009j) {
                                return;
                            }
                            if (this.f16013n.get() != null) {
                                if (!((Boolean) cgVar.f14913v.get("didRequestFullScreen")).booleanValue()) {
                                    cgVar.f14913v.put("didRequestFullScreen", Boolean.TRUE);
                                    cgVar.f14913v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                                    cgVar.f14913v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                                    if (videoView.getMediaPlayer().isPlaying()) {
                                        videoView.getMediaPlayer().pause();
                                        videoView.getAudioFocusManager().mo35198a();
                                    }
                                    videoView.getMediaPlayer().f15470a = 4;
                                    cgVar.f14913v.put("isFullScreen", Boolean.TRUE);
                                    cgVar.f14913v.put("seekPosition", Integer.valueOf(videoView.getMediaPlayer().getCurrentPosition()));
                                    mo35573m();
                                }
                            }
                        } catch (Exception e2) {
                            C6181gg.m18398a().mo35357a(new C6217hg(e2));
                        }
                    }
                }
            } catch (Exception e3) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in expanding video to fullscreen");
                C6181gg.m18398a().mo35357a(new C6217hg(e3));
            }
        } else if (b != 5) {
            try {
                if (1 == getPlacementType()) {
                    super.mo35562b(btVar);
                    if (ShareConstants.VIDEO_URL.equals(btVar.f14893b)) {
                        C6102fk fkVar3 = (C6102fk) getVideoContainerView();
                        if (fkVar3 != null) {
                            fkVar3.getVideoView().mo35274h();
                            C6089fj videoView2 = fkVar3.getVideoView();
                            if (videoView2.mo35259f() && videoView2.f15495a.isPlaying()) {
                                videoView2.f15495a.pause();
                                videoView2.f15495a.seekTo(0);
                                videoView2.f15496b.mo35198a();
                                if (videoView2.getTag() != null) {
                                    C5923cg cgVar2 = (C5923cg) videoView2.getTag();
                                    cgVar2.f14913v.put("didPause", Boolean.TRUE);
                                    cgVar2.f14913v.put("seekPosition", 0);
                                    cgVar2.f14913v.put("didCompleteQ4", Boolean.TRUE);
                                }
                                videoView2.f15495a.f15470a = 4;
                                videoView2.getPlaybackEventListener().mo35232a((byte) 4);
                            }
                            if (videoView2.f15495a != null) {
                                videoView2.f15495a.f15471b = 4;
                            }
                        }
                        m19015x();
                        return;
                    }
                    return;
                }
                C6318n.C6331c e4 = mo35565e();
                if (e4 != null) {
                    e4.mo34574i();
                }
                m19015x();
            } catch (Exception e5) {
                C6181gg.m18398a().mo35357a(new C6217hg(e5));
            }
        } else {
            try {
                C6102fk fkVar4 = (C6102fk) getVideoContainerView();
                if (fkVar4 != null) {
                    C5923cg cgVar3 = (C5923cg) fkVar4.getVideoView().getTag();
                    cgVar3.f14913v.put("shouldAutoPlay", Boolean.TRUE);
                    if (cgVar3.f14916y != null) {
                        cgVar3.f14916y.f14913v.put("shouldAutoPlay", Boolean.TRUE);
                    }
                    fkVar4.getVideoView().start();
                }
            } catch (Exception e6) {
                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in playing video");
                C6181gg.m18398a().mo35357a(new C6217hg(e6));
            }
        }
    }

    /* renamed from: a */
    public final void mo35596a(C6089fj fjVar) {
        fjVar.setIsLockScreen(this.f16017r);
        C6102fk fkVar = (C6102fk) fjVar.getParent();
        this.f16041z = new WeakReference<>(fkVar);
        C6086fi mediaController = fkVar.getVideoView().getMediaController();
        if (mediaController != null) {
            mediaController.setVideoAd(this);
        }
    }

    /* renamed from: a */
    public final void mo35594a(C5923cg cgVar) {
        if (!this.f16009j) {
            cgVar.mo34877a("error", m19013h(cgVar));
            this.f16007h.mo35116a((byte) 17);
        }
    }

    /* renamed from: b */
    public final void mo35597b(C5923cg cgVar) {
        if (!this.f16009j) {
            if (getPlacementType() == 0) {
                if (((Integer) cgVar.f14913v.get("currentMediaVolume")).intValue() > 0 && ((Integer) cgVar.f14913v.get("lastMediaVolume")).intValue() == 0) {
                    mo35601f(cgVar);
                }
                if (((Integer) cgVar.f14913v.get("currentMediaVolume")).intValue() == 0 && ((Integer) cgVar.f14913v.get("lastMediaVolume")).intValue() > 0) {
                    mo35600e(cgVar);
                }
            }
            if (!((Boolean) cgVar.f14913v.get("didStartPlaying")).booleanValue()) {
                cgVar.f14913v.put("didStartPlaying", Boolean.TRUE);
                getViewableAd().mo35116a((byte) 6);
            }
        }
    }

    /* renamed from: c */
    public final void mo35598c(C5923cg cgVar) {
        if (!this.f16009j) {
            m18929c(mo35566f());
            cgVar.mo34877a(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, m19013h(cgVar));
            this.f16007h.mo35116a((byte) 7);
        }
    }

    /* renamed from: d */
    public final void mo35599d(C5923cg cgVar) {
        if (!this.f16009j) {
            m18931d(mo35566f());
            cgVar.mo34877a(CampaignEx.JSON_NATIVE_VIDEO_RESUME, m19013h(cgVar));
            this.f16007h.mo35116a((byte) 8);
        }
    }

    /* renamed from: e */
    public final void mo35600e(C5923cg cgVar) {
        if (!this.f16009j) {
            cgVar.f14913v.put("lastMediaVolume", 0);
            cgVar.mo34877a("mute", m19013h(cgVar));
            this.f16007h.mo35116a((byte) Ascii.f17935CR);
        }
    }

    /* renamed from: f */
    public final void mo35601f(C5923cg cgVar) {
        if (!this.f16009j) {
            cgVar.f14913v.put("lastMediaVolume", 15);
            cgVar.mo34877a("unmute", m19013h(cgVar));
            this.f16007h.mo35116a((byte) Ascii.f17945SO);
        }
    }

    /* renamed from: a */
    public final void mo35595a(C5923cg cgVar, byte b) {
        if (!this.f16009j) {
            if (b == 0) {
                cgVar.mo34877a(TJAdUnitConstants.String.VIDEO_FIRST_QUARTILE, m19013h(cgVar));
                this.f16007h.mo35116a((byte) 9);
            } else if (b == 1) {
                cgVar.mo34877a("midpoint", m19013h(cgVar));
                this.f16007h.mo35116a((byte) 10);
            } else if (b == 2) {
                cgVar.mo34877a(TJAdUnitConstants.String.VIDEO_THIRD_QUARTILE, m19013h(cgVar));
                this.f16007h.mo35116a((byte) Ascii.f17948VT);
            } else if (b == 3 && !((Boolean) cgVar.f14913v.get("didQ4Fire")).booleanValue()) {
                mo35602g(cgVar);
            }
        }
    }

    /* renamed from: g */
    public final void mo35602g(C5923cg cgVar) {
        cgVar.f14913v.put("didQ4Fire", Boolean.TRUE);
        cgVar.mo34877a("complete", m19013h(cgVar));
        this.f16007h.mo35116a((byte) Ascii.f17937FF);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public Map<String, String> m19013h(C5923cg cgVar) {
        C5903bv bvVar = (C5903bv) cgVar.f14911t;
        HashMap hashMap = new HashMap(4);
        C6102fk fkVar = (C6102fk) this.f16041z.get();
        if (fkVar != null) {
            hashMap.put("$MD", String.valueOf((int) Math.round((((double) fkVar.getVideoView().getDuration()) * 1.0d) / 1000.0d)));
        }
        hashMap.put("[ERRORCODE]", "405");
        hashMap.put("[CONTENTPLAYHEAD]", m19005a(((Integer) cgVar.f14913v.get("seekPosition")).intValue()));
        hashMap.put("[CACHEBUSTING]", m19016y());
        hashMap.put("[ASSETURI]", cgVar.mo34920b().mo35108b());
        hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
        hashMap.put("$LTS", String.valueOf(this.f16000a.f14938d.f14931z));
        if (bvVar != null) {
            hashMap.put("$STS", String.valueOf(bvVar.f14931z));
        }
        if (this.f16000a != null) {
            hashMap.putAll(this.f16000a.mo34895a());
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = (com.inmobi.media.C5923cg) r4.getTag();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m19007a(com.inmobi.media.C6332o r3, android.view.View r4, final boolean r5) {
        /*
            r0 = 2147483647(0x7fffffff, float:NaN)
            android.view.View r4 = r4.findViewById(r0)
            com.inmobi.media.fj r4 = (com.inmobi.media.C6089fj) r4
            if (r4 == 0) goto L_0x0024
            java.lang.Object r0 = r4.getTag()
            com.inmobi.media.cg r0 = (com.inmobi.media.C5923cg) r0
            if (r0 == 0) goto L_0x0024
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.inmobi.media.o$3 r2 = new com.inmobi.media.o$3
            r2.<init>(r0, r5, r4)
            r1.post(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6332o.m19007a(com.inmobi.media.o, android.view.View, boolean):void");
    }

    /* renamed from: a */
    static /* synthetic */ void m19008a(C6332o oVar, C6089fj fjVar) {
        int videoVolume;
        if (oVar.getPlacementType() == 0 && !oVar.mo35569i() && (videoVolume = fjVar.getVideoVolume()) != fjVar.getLastVolume() && fjVar.isPlaying()) {
            oVar.m19012b(videoVolume <= 0);
            fjVar.setLastVolume(videoVolume);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m19009a(C6332o oVar, C6089fj fjVar, C5923cg cgVar) {
        if (oVar.getPlacementType() == 0 && !oVar.mo35569i() && !cgVar.f15009C && !fjVar.isPlaying() && fjVar.getState() == 5) {
            oVar.m19010b(fjVar);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m19011b(C6332o oVar, C6089fj fjVar) {
        if (oVar.getPlacementType() == 0 && !oVar.mo35569i() && !oVar.f16010k) {
            oVar.m19010b(fjVar);
        }
    }
}
