package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.graphics.PointF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.adview.C1527j;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1410f;
import com.applovin.impl.p025a.C1415j;
import com.applovin.impl.p025a.C1416k;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.p025a.C1418m;
import com.applovin.impl.p025a.C1421n;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p045a.C1799d;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.adview.activity.b.d */
public class C1461d extends C1476f {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C1401a f1734C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Set<C1415j> f1735D = new HashSet();

    public C1461d(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1401a aVar = (C1401a) eVar;
        this.f1734C = aVar;
        this.f1735D.addAll(aVar.mo12610a(C1401a.C1405c.VIDEO, C1416k.f1601a));
        m2576a(C1401a.C1405c.IMPRESSION);
        m2578a(C1401a.C1405c.VIDEO, "creativeView");
        this.f1734C.mo12640o().mo13846d();
    }

    /* renamed from: A */
    private void m2574A() {
        if (mo12786r() && !this.f1735D.isEmpty()) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14792d("AppLovinFullscreenActivity", "Firing " + this.f1735D.size() + " un-fired video progress trackers when video was completed.");
            }
            m2581a(this.f1735D);
        }
    }

    /* renamed from: a */
    private void m2576a(C1401a.C1405c cVar) {
        m2577a(cVar, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2577a(C1401a.C1405c cVar, C1410f fVar) {
        m2579a(cVar, "", fVar);
    }

    /* renamed from: a */
    private void m2578a(C1401a.C1405c cVar, String str) {
        m2579a(cVar, str, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2579a(C1401a.C1405c cVar, String str, C1410f fVar) {
        m2582a(this.f1734C.mo12609a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2581a(Set<C1415j> set) {
        m2582a(set, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2582a(Set<C1415j> set, C1410f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds((long) this.f1788s.getCurrentPosition());
            C1421n n = this.f1734C.mo12639n();
            Uri a = n != null ? n.mo12716a() : null;
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            C1417l.m2437a(set, seconds, a, fVar, this.f1681b);
        }
    }

    /* renamed from: a */
    public void mo12817a(PointF pointF) {
        m2576a(C1401a.C1405c.VIDEO_CLICK);
        this.f1734C.mo12640o().mo13878o();
        super.mo12817a(pointF);
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        super.mo12761a(viewGroup);
        this.f1794y.mo12965a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (C1527j.C1529a) new C1527j.C1529a() {
            /* renamed from: a */
            public void mo12815a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C1461d.this.f1773A - ((long) (C1461d.this.f1788s.getDuration() - C1461d.this.f1788s.getCurrentPosition())));
                int z = C1461d.this.mo12845z();
                HashSet hashSet = new HashSet();
                for (C1415j jVar : new HashSet(C1461d.this.f1735D)) {
                    if (jVar.mo12700a(seconds, z)) {
                        hashSet.add(jVar);
                        C1461d.this.f1735D.remove(jVar);
                    }
                }
                C1461d.this.m2581a((Set<C1415j>) hashSet);
                if (z >= 25 && z < 50) {
                    C1461d.this.f1734C.mo12640o().mo13869f();
                } else if (z >= 50 && z < 75) {
                    C1461d.this.f1734C.mo12640o().mo13870g();
                } else if (z >= 75) {
                    C1461d.this.f1734C.mo12640o().mo13871h();
                }
            }

            /* renamed from: b */
            public boolean mo12816b() {
                return !C1461d.this.f1774B;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.f1789t != null) {
            arrayList.add(new C1799d(this.f1789t, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.f1790u != null) {
            arrayList.add(new C1799d(this.f1790u, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.f1793x != null) {
            arrayList.add(new C1799d(this.f1793x, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.f1791v != null) {
            arrayList.add(new C1799d(this.f1791v, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.f1792w != null) {
            arrayList.add(new C1799d(this.f1792w, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f1734C.mo12640o().mo13839a((View) this.f1788s, (List<C1799d>) arrayList);
    }

    /* renamed from: c */
    public void mo12808c() {
        m2578a(C1401a.C1405c.VIDEO, "skip");
        this.f1734C.mo12640o().mo13877n();
        super.mo12808c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12818c(long j) {
        super.mo12818c(j);
        this.f1734C.mo12640o().mo13867a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f1681b));
    }

    /* renamed from: c */
    public void mo12819c(String str) {
        m2577a(C1401a.C1405c.ERROR, C1410f.MEDIA_FILE_ERROR);
        this.f1734C.mo12640o().mo13841a(str);
        super.mo12819c(str);
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12773e() {
        this.f1794y.mo12967c();
        super.mo12773e();
    }

    /* renamed from: f */
    public void mo12774f() {
        super.mo12774f();
        m2578a(this.f1774B ? C1401a.C1405c.COMPANION : C1401a.C1405c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f1734C.mo12640o().mo13874k();
    }

    /* renamed from: g */
    public void mo12775g() {
        super.mo12775g();
        m2578a(this.f1774B ? C1401a.C1405c.COMPANION : C1401a.C1405c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f1734C.mo12640o().mo13873j();
    }

    /* renamed from: h */
    public void mo12776h() {
        if (this.f1734C != null) {
            m2578a(C1401a.C1405c.VIDEO, "close");
            m2578a(C1401a.C1405c.COMPANION, "close");
        }
        super.mo12776h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12789u() {
        long j;
        int s;
        long j2 = 0;
        if (this.f1734C.mo13984ad() >= 0 || this.f1734C.mo13985ae() >= 0) {
            if (this.f1734C.mo13984ad() >= 0) {
                j = this.f1734C.mo13984ad();
            } else {
                C1401a aVar = this.f1734C;
                C1418m m = aVar.mo12638m();
                if (m != null && m.mo12707b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) m.mo12707b());
                } else if (this.f1773A > 0) {
                    j2 = 0 + this.f1773A;
                }
                if (aVar.mo13986af() && (s = (int) aVar.mo14012s()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) s);
                }
                j = (long) (((double) j2) * (((double) this.f1734C.mo13985ae()) / 100.0d));
            }
            mo12768b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo12820v() {
        super.mo12820v();
        C1401a aVar = this.f1734C;
        if (aVar != null) {
            aVar.mo12640o().mo13875l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo12821w() {
        super.mo12821w();
        C1401a aVar = this.f1734C;
        if (aVar != null) {
            aVar.mo12640o().mo13876m();
        }
    }

    /* renamed from: x */
    public void mo12822x() {
        super.mo12822x();
        m2578a(C1401a.C1405c.VIDEO, this.f1795z ? "mute" : "unmute");
        this.f1734C.mo12640o().mo13868a(this.f1795z);
    }

    /* renamed from: y */
    public void mo12823y() {
        m2574A();
        if (!C1417l.m2444c(this.f1734C)) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14789b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo12776h();
        } else if (!this.f1774B) {
            m2578a(C1401a.C1405c.COMPANION, "creativeView");
            this.f1734C.mo12640o().mo13872i();
            this.f1734C.mo12640o().mo13839a((View) this.f1685f, (List<C1799d>) Collections.singletonList(new C1799d(this.f1685f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo12823y();
        }
    }
}
