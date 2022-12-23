package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.cv */
/* compiled from: JsonMarkupAdHandler */
public class C5954cv extends C5948cr {

    /* renamed from: a */
    private final String f15119a = C5954cv.class.getSimpleName();

    /* renamed from: b */
    private final String f15120b = "InMobi";

    /* renamed from: c */
    private WeakReference<Activity> f15121c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6286j f15122d;

    /* renamed from: e */
    private RelativeLayout f15123e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6089fj f15124f;

    /* renamed from: g */
    private boolean f15125g = false;

    /* renamed from: h */
    private boolean f15126h = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo35021a(float f) {
        super.mo35021a(f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo35022a(C5977df dfVar) {
        super.mo35022a(dfVar);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo35028g() {
        super.mo35028g();
    }

    public C5954cv(WeakReference<Activity> weakReference, C6286j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f15121c = weakReference;
        this.f15122d = jVar;
        this.f15123e = relativeLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35020a() {
        C6102fk fkVar;
        byte placementType = this.f15122d.getPlacementType();
        this.f15123e.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C5907bx bxVar = (C5907bx) this.f15122d.getDataModel();
        Point point = bxVar.f14938d.f14894c.f14917a;
        C6004dw viewableAd = this.f15122d.getViewableAd();
        View b = bxVar.f14937c ? viewableAd.mo35120b() : null;
        int i = 0;
        if (b == null) {
            b = viewableAd.mo35114a((View) null, this.f15123e, false);
        }
        C6286j jVar = this.f15122d;
        if ((jVar instanceof C6332o) && (fkVar = (C6102fk) jVar.getVideoContainerView()) != null) {
            C6089fj videoView = fkVar.getVideoView();
            this.f15124f = videoView;
            videoView.requestFocus();
            C5923cg cgVar = (C5923cg) this.f15124f.getTag();
            if (cgVar.f14916y != null) {
                cgVar.mo34918a((C5923cg) cgVar.f14916y);
            }
            if (placementType == 0) {
                cgVar.f14913v.put("placementType", (byte) 0);
            } else {
                cgVar.f14913v.put("placementType", (byte) 1);
            }
        }
        if (b != null) {
            this.f15123e.addView(b, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = (Activity) this.f15121c.get();
        if (activity != null && bxVar != null) {
            byte b2 = bxVar.f14935a;
            if (b2 == 1) {
                i = 1;
            } else if (b2 != 2) {
                i = activity.getRequestedOrientation();
            }
            if (activity instanceof InMobiAdActivity) {
                ((InMobiAdActivity) activity).f19388a.f15116b.setRequestedOrientation(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|(2:20|29)(1:32)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r7.f15122d.getFullScreenEventsListener() != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r7.f15122d.getFullScreenEventsListener().mo35510a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0051 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35023b() {
        /*
            r7 = this;
            java.lang.String r0 = "time"
            com.inmobi.media.j r1 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.fq r1 = r1.getAdConfig()     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j r2 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.dw r2 = r2.getViewableAd()     // Catch:{ Exception -> 0x0063 }
            android.view.View r3 = r2.mo35120b()     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0062
            com.inmobi.media.j r3 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            boolean r3 = r3 instanceof com.inmobi.media.C6332o     // Catch:{ Exception -> 0x0063 }
            r4 = 0
            if (r3 == 0) goto L_0x0047
            com.inmobi.media.fj r3 = r7.f15124f     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.cg r3 = (com.inmobi.media.C5923cg) r3     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0046
            com.inmobi.media.fq$m r1 = r1.viewability     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.fq$l r5 = r1.video     // Catch:{ Exception -> 0x0063 }
            int r5 = r5.impressionMinTimeViewed     // Catch:{ Exception -> 0x0063 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r3.f15013G     // Catch:{ Exception -> 0x0063 }
            boolean r6 = r6.containsKey(r0)     // Catch:{ Exception -> 0x0063 }
            if (r6 == 0) goto L_0x003f
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f15013G     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0063 }
            int r5 = r0.intValue()     // Catch:{ Exception -> 0x0063 }
        L_0x003f:
            com.inmobi.media.fq$l r0 = r1.video     // Catch:{ Exception -> 0x0063 }
            r0.impressionMinTimeViewed = r5     // Catch:{ Exception -> 0x0063 }
            r2.mo35119a((java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose>) r4)     // Catch:{ Exception -> 0x0063 }
        L_0x0046:
            return
        L_0x0047:
            com.inmobi.media.j r0 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            boolean r0 = r0 instanceof com.inmobi.media.C6318n     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0062
            r2.mo35119a((java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose>) r4)     // Catch:{ Exception -> 0x0051 }
            return
        L_0x0051:
            com.inmobi.media.j r0 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0062
            com.inmobi.media.j r0 = r7.f15122d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x0063 }
            r0.mo35510a()     // Catch:{ Exception -> 0x0063 }
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            com.inmobi.media.j r1 = r7.f15122d
            com.inmobi.media.j$a r1 = r1.getFullScreenEventsListener()
            if (r1 == 0) goto L_0x0075
            com.inmobi.media.j r1 = r7.f15122d
            com.inmobi.media.j$a r1 = r1.getFullScreenEventsListener()
            r1.mo35510a()
        L_0x0075:
            com.inmobi.media.gg r1 = com.inmobi.media.C6181gg.m18398a()
            com.inmobi.media.hg r2 = new com.inmobi.media.hg
            r2.<init>(r0)
            r1.mo35357a((com.inmobi.media.C6217hg) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5954cv.mo35023b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo35024c() {
        C6089fj fjVar;
        if (!(this.f15122d instanceof C6332o) || (fjVar = this.f15124f) == null) {
            C6286j jVar = this.f15122d;
            if (jVar instanceof C6318n) {
                try {
                    if (!this.f15126h) {
                        this.f15126h = true;
                        jVar.getFullScreenEventsListener().mo35511a((Object) null);
                    }
                } catch (Exception e) {
                    C6181gg.m18398a().mo35357a(new C6217hg(e));
                }
            }
        } else {
            final C5923cg cgVar = (C5923cg) fjVar.getTag();
            if (cgVar != null && this.f15125g) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        if (C5954cv.this.f15122d == null) {
                            return;
                        }
                        if (C5954cv.this.f15122d.getPlacementType() != 1 || !((Boolean) cgVar.f14913v.get("didCompleteQ4")).booleanValue()) {
                            C5954cv.this.f15124f.start();
                        }
                    }
                }, 50);
            }
            if (this.f15122d.getFullScreenEventsListener() != null) {
                try {
                    if (!this.f15126h) {
                        this.f15126h = true;
                        this.f15122d.getFullScreenEventsListener().mo35511a(cgVar);
                    }
                } catch (Exception e2) {
                    C6181gg.m18398a().mo35357a(new C6217hg(e2));
                }
            }
        }
        this.f15125g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35025d() {
        this.f15125g = true;
        C6089fj fjVar = this.f15124f;
        if (fjVar != null) {
            fjVar.pause();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo35027f() {
        if (!this.f15122d.mo35500c()) {
            C6286j jVar = this.f15122d;
            if (jVar instanceof C6332o) {
                C6332o oVar = (C6332o) jVar;
                if (oVar != null && !oVar.mo35568h().f14936b) {
                    Activity activity = (Activity) this.f15121c.get();
                    if (activity instanceof InMobiAdActivity) {
                        ((InMobiAdActivity) activity).f19389b = true;
                    }
                    C6089fj fjVar = this.f15124f;
                    if (fjVar != null) {
                        C5923cg cgVar = (C5923cg) fjVar.getTag();
                        if (cgVar != null) {
                            if (1 == oVar.getPlacementType()) {
                                this.f15124f.mo35258e();
                            }
                            try {
                                if (((Boolean) cgVar.f14913v.get("isFullScreen")).booleanValue()) {
                                    cgVar.f14913v.put("seekPosition", Integer.valueOf(this.f15124f.getCurrentPosition()));
                                    if (!oVar.f16009j && ((Boolean) cgVar.f14913v.get("didRequestFullScreen")).booleanValue()) {
                                        cgVar.f14913v.put("didRequestFullScreen", Boolean.FALSE);
                                        if (cgVar.f14916y != null) {
                                            cgVar.f14916y.f14913v.put("didRequestFullScreen", Boolean.FALSE);
                                        }
                                        oVar.mo35499b();
                                        cgVar.f14913v.put("isFullScreen", Boolean.FALSE);
                                    }
                                }
                            } catch (Exception e) {
                                C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                                C6181gg.m18398a().mo35357a(new C6217hg(e));
                            }
                        }
                    } else {
                        m17797h();
                    }
                }
            } else if (jVar instanceof C6318n) {
                C6318n nVar = (C6318n) jVar;
                if (nVar == null) {
                    m17797h();
                } else if (!nVar.mo35568h().f14936b) {
                    nVar.mo35499b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m17795a(C5901bt btVar) {
        try {
            this.f15122d.getFullScreenEventsListener().mo35512b(btVar);
        } catch (Exception e) {
            C6238hu.m18605a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            C6181gg.m18398a().mo35357a(new C6217hg(e));
        }
    }

    /* renamed from: h */
    private void m17797h() {
        Activity activity = (Activity) this.f15121c.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo35026e() {
        boolean z;
        C5923cg cgVar;
        Activity activity = (Activity) this.f15121c.get();
        if (activity instanceof InMobiAdActivity) {
            z = ((InMobiAdActivity) activity).f19389b;
        } else {
            z = false;
        }
        if (z) {
            C6286j jVar = this.f15122d;
            if (jVar instanceof C6332o) {
                C6102fk fkVar = (C6102fk) ((C6332o) jVar).getVideoContainerView();
                if (fkVar != null) {
                    m17795a((C5901bt) (C5923cg) fkVar.getVideoView().getTag());
                }
            } else if (jVar instanceof C6318n) {
                m17795a((C5901bt) null);
            }
        } else {
            C6286j jVar2 = this.f15122d;
            if (jVar2 instanceof C6332o) {
                C6332o oVar = (C6332o) jVar2;
                C6089fj fjVar = this.f15124f;
                if (!(fjVar == null || (cgVar = (C5923cg) fjVar.getTag()) == null)) {
                    if (1 == oVar.getPlacementType()) {
                        this.f15124f.mo35258e();
                    }
                    m17795a((C5901bt) cgVar);
                }
            } else if (jVar2 instanceof C6318n) {
                m17795a((C5901bt) null);
            }
            InMobiAdActivity.m23431a((Object) this.f15122d);
        }
        this.f15122d.destroy();
    }
}
