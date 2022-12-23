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

/* renamed from: com.applovin.impl.adview.activity.b.c */
public class C1459c extends C1463e {
    /* access modifiers changed from: private */

    /* renamed from: F */
    public final C1401a f1731F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final Set<C1415j> f1732G = new HashSet();

    public C1459c(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1401a aVar = (C1401a) eVar;
        this.f1731F = aVar;
        this.f1732G.addAll(aVar.mo12610a(C1401a.C1405c.VIDEO, C1416k.f1601a));
        m2549a(C1401a.C1405c.IMPRESSION);
        m2551a(C1401a.C1405c.VIDEO, "creativeView");
        this.f1731F.mo12640o().mo13846d();
    }

    /* renamed from: E */
    private void m2547E() {
        if (mo12786r() && !this.f1732G.isEmpty()) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14792d("AppLovinFullscreenActivity", "Firing " + this.f1732G.size() + " un-fired video progress trackers when video was completed.");
            }
            m2554a(this.f1732G);
        }
    }

    /* renamed from: a */
    private void m2549a(C1401a.C1405c cVar) {
        m2550a(cVar, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2550a(C1401a.C1405c cVar, C1410f fVar) {
        m2552a(cVar, "", fVar);
    }

    /* renamed from: a */
    private void m2551a(C1401a.C1405c cVar, String str) {
        m2552a(cVar, str, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2552a(C1401a.C1405c cVar, String str, C1410f fVar) {
        m2555a(this.f1731F.mo12609a(cVar, str), fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2554a(Set<C1415j> set) {
        m2555a(set, C1410f.UNSPECIFIED);
    }

    /* renamed from: a */
    private void m2555a(Set<C1415j> set, C1410f fVar) {
        if (set != null && !set.isEmpty()) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(this.f1752t.getCurrentPosition());
            C1421n n = this.f1731F.mo12639n();
            Uri a = n != null ? n.mo12716a() : null;
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1682c;
                vVar.mo14789b("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
            }
            C1417l.m2437a(set, seconds, a, fVar, this.f1681b);
        }
    }

    /* renamed from: a */
    public void mo12807a(PointF pointF) {
        m2549a(C1401a.C1405c.VIDEO_CLICK);
        this.f1731F.mo12640o().mo13878o();
        super.mo12807a(pointF);
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        super.mo12761a(viewGroup);
        this.f1758z.mo12965a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1), (C1527j.C1529a) new C1527j.C1529a() {
            /* renamed from: a */
            public void mo12815a() {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(C1459c.this.f1738B - (C1459c.this.f1752t.getDuration() - C1459c.this.f1752t.getCurrentPosition()));
                int D = C1459c.this.mo12827D();
                HashSet hashSet = new HashSet();
                for (C1415j jVar : new HashSet(C1459c.this.f1732G)) {
                    if (jVar.mo12700a(seconds, D)) {
                        hashSet.add(jVar);
                        C1459c.this.f1732G.remove(jVar);
                    }
                }
                C1459c.this.m2554a((Set<C1415j>) hashSet);
                if (D >= 25 && D < 50) {
                    C1459c.this.f1731F.mo12640o().mo13869f();
                } else if (D >= 50 && D < 75) {
                    C1459c.this.f1731F.mo12640o().mo13870g();
                } else if (D >= 75) {
                    C1459c.this.f1731F.mo12640o().mo13871h();
                }
            }

            /* renamed from: b */
            public boolean mo12816b() {
                return !C1459c.this.f1740D;
            }
        });
        ArrayList arrayList = new ArrayList();
        if (this.f1753u != null) {
            arrayList.add(new C1799d(this.f1753u, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        if (this.f1754v != null) {
            arrayList.add(new C1799d(this.f1754v, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        if (this.f1757y != null) {
            arrayList.add(new C1799d(this.f1757y, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        if (this.f1755w != null) {
            arrayList.add(new C1799d(this.f1755w, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        if (this.f1756x != null) {
            arrayList.add(new C1799d(this.f1756x, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        this.f1731F.mo12640o().mo13839a((View) this.f1751s, (List<C1799d>) arrayList);
    }

    /* renamed from: c */
    public void mo12808c() {
        m2551a(C1401a.C1405c.VIDEO, "skip");
        this.f1731F.mo12640o().mo13877n();
        super.mo12808c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo12809c(long j) {
        super.mo12809c(j);
        this.f1731F.mo12640o().mo13867a((float) TimeUnit.MILLISECONDS.toSeconds(j), Utils.isVideoMutedInitially(this.f1681b));
    }

    /* renamed from: c */
    public void mo12810c(String str) {
        m2550a(C1401a.C1405c.ERROR, C1410f.MEDIA_FILE_ERROR);
        this.f1731F.mo12640o().mo13841a(str);
        super.mo12810c(str);
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12773e() {
        this.f1758z.mo12967c();
        super.mo12773e();
    }

    /* renamed from: f */
    public void mo12774f() {
        super.mo12774f();
        m2551a(this.f1740D ? C1401a.C1405c.COMPANION : C1401a.C1405c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
        this.f1731F.mo12640o().mo13874k();
    }

    /* renamed from: g */
    public void mo12775g() {
        super.mo12775g();
        m2551a(this.f1740D ? C1401a.C1405c.COMPANION : C1401a.C1405c.VIDEO, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
        this.f1731F.mo12640o().mo13873j();
    }

    /* renamed from: h */
    public void mo12776h() {
        if (this.f1731F != null) {
            m2551a(C1401a.C1405c.VIDEO, "close");
            m2551a(C1401a.C1405c.COMPANION, "close");
        }
        super.mo12776h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12789u() {
        long j;
        int s;
        long j2 = 0;
        if (this.f1731F.mo13984ad() >= 0 || this.f1731F.mo13985ae() >= 0) {
            if (this.f1731F.mo13984ad() >= 0) {
                j = this.f1731F.mo13984ad();
            } else {
                C1401a aVar = this.f1731F;
                C1418m m = aVar.mo12638m();
                if (m != null && m.mo12707b() > 0) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) m.mo12707b());
                } else if (this.f1738B > 0) {
                    j2 = 0 + this.f1738B;
                }
                if (aVar.mo13986af() && (s = (int) aVar.mo14012s()) > 0) {
                    j2 += TimeUnit.SECONDS.toMillis((long) s);
                }
                j = (long) (((double) j2) * (((double) this.f1731F.mo13985ae()) / 100.0d));
            }
            mo12768b(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo12811v() {
        super.mo12811v();
        C1401a aVar = this.f1731F;
        if (aVar != null) {
            aVar.mo12640o().mo13875l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo12812w() {
        super.mo12812w();
        C1401a aVar = this.f1731F;
        if (aVar != null) {
            aVar.mo12640o().mo13876m();
        }
    }

    /* renamed from: x */
    public void mo12813x() {
        super.mo12813x();
        m2551a(C1401a.C1405c.VIDEO, this.f1737A ? "mute" : "unmute");
        this.f1731F.mo12640o().mo13868a(this.f1737A);
    }

    /* renamed from: y */
    public void mo12814y() {
        m2547E();
        if (!C1417l.m2444c(this.f1731F)) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14789b("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            mo12776h();
        } else if (!this.f1740D) {
            m2551a(C1401a.C1405c.COMPANION, "creativeView");
            this.f1731F.mo12640o().mo13872i();
            this.f1731F.mo12640o().mo13839a((View) this.f1685f, (List<C1799d>) Collections.singletonList(new C1799d(this.f1685f, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
            super.mo12814y();
        }
    }
}
