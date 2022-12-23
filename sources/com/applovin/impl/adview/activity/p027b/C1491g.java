package com.applovin.impl.adview.activity.p027b;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.net.Uri;
import android.os.StrictMode;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.impl.adview.C1423a;
import com.applovin.impl.adview.C1523g;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.adview.activity.p026a.C1438d;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p045a.C1799d;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.C2392R;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.g */
public class C1491g extends C1440a implements C1523g {

    /* renamed from: A */
    private AtomicBoolean f1812A = new AtomicBoolean();

    /* renamed from: B */
    private boolean f1813B = Utils.isVideoMutedInitially(this.f1681b);
    /* access modifiers changed from: private */

    /* renamed from: C */
    public long f1814C = -2;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public long f1815D = 0;

    /* renamed from: s */
    private final C1438d f1816s = new C1438d(this.f1680a, this.f1684e, this.f1681b);
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1540m f1817t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final ImageView f1818u;

    /* renamed from: v */
    private final C1423a f1819v;

    /* renamed from: w */
    private final boolean f1820w = this.f1680a.mo12626f();

    /* renamed from: x */
    private double f1821x;

    /* renamed from: y */
    private double f1822y;

    /* renamed from: z */
    private AtomicBoolean f1823z = new AtomicBoolean();

    /* renamed from: com.applovin.impl.adview.activity.b.g$a */
    private class C1496a implements View.OnClickListener {
        private C1496a() {
        }

        public void onClick(View view) {
            if (view == C1491g.this.f1817t) {
                if (C1491g.this.mo12787s()) {
                    C1491g.this.mo12784p();
                    C1491g.this.f1696q.mo14041b();
                    return;
                }
                C1491g.this.mo12865v();
            } else if (view == C1491g.this.f1818u) {
                C1491g.this.mo12867x();
            } else if (C2092v.m5047a()) {
                C2092v vVar = C1491g.this.f1682c;
                vVar.mo14793e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
            }
        }
    }

    public C1491g(C1829e eVar, Activity activity, C1959m mVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, mVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        C1496a aVar = new C1496a();
        if (eVar.mo14010q() >= 0) {
            C1540m mVar2 = new C1540m(eVar.mo14016w(), activity);
            this.f1817t = mVar2;
            mVar2.setVisibility(8);
            this.f1817t.setOnClickListener(aVar);
        } else {
            this.f1817t = null;
        }
        if (m2680a(this.f1813B, mVar)) {
            ImageView imageView = new ImageView(activity);
            this.f1818u = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.f1818u.setClickable(true);
            this.f1818u.setOnClickListener(aVar);
            m2684d(this.f1813B);
        } else {
            this.f1818u = null;
        }
        if (this.f1820w) {
            C1423a aVar2 = new C1423a(activity, ((Integer) mVar.mo14311a(C1857b.f3177cB)).intValue(), 16842874);
            this.f1819v = aVar2;
            aVar2.setColor(Color.parseColor("#75FFFFFF"));
            this.f1819v.setBackgroundColor(Color.parseColor("#00000000"));
            this.f1819v.setVisibility(8);
            return;
        }
        this.f1819v = null;
    }

    /* renamed from: a */
    private static boolean m2680a(boolean z, C1959m mVar) {
        if (!((Boolean) mVar.mo14311a(C1857b.f3218cq)).booleanValue()) {
            return false;
        }
        if (!((Boolean) mVar.mo14311a(C1857b.f3219cr)).booleanValue() || z) {
            return true;
        }
        return ((Boolean) mVar.mo14311a(C1857b.f3221ct)).booleanValue();
    }

    /* renamed from: d */
    private void m2684d(boolean z) {
        if (C2039g.m4885d()) {
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) this.f1684e.getDrawable(z ? C2392R.C2393drawable.unmute_to_mute : C2392R.C2393drawable.mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.f1818u.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f1818u.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return;
            }
        }
        Uri aC = z ? this.f1680a.mo13971aC() : this.f1680a.mo13972aD();
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        this.f1818u.setImageURI(aC);
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m2685y() {
        if (this.f1812A.compareAndSet(false, true)) {
            mo12762a(this.f1817t, this.f1680a.mo14010q(), new Runnable() {
                public void run() {
                    long unused = C1491g.this.f1814C = -1;
                    long unused2 = C1491g.this.f1815D = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    /* renamed from: a */
    public void mo12802a() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Continue video from prompt - will resume in onWindowFocusChanged(true) when alert dismisses");
        }
    }

    /* renamed from: a */
    public void mo12861a(double d) {
        mo12769b("javascript:al_setVideoMuted(" + this.f1813B + ");");
        C1423a aVar = this.f1819v;
        if (aVar != null) {
            aVar.mo12733b();
        }
        if (this.f1817t != null) {
            m2685y();
        }
        this.f1685f.getController().mo12900m();
        this.f1822y = d;
        mo12789u();
        if (this.f1680a.mo13993am()) {
            this.f1696q.mo14039a(this.f1680a, (Runnable) null);
        }
    }

    /* renamed from: a */
    public void mo12759a(long j) {
    }

    /* renamed from: a */
    public void mo12761a(ViewGroup viewGroup) {
        this.f1816s.mo12755a(this.f1818u, this.f1817t, this.f1686g, this.f1819v, this.f1685f, viewGroup);
        this.f1685f.getController().mo12879a((C1523g) this);
        mo12766a(false);
        C1423a aVar = this.f1819v;
        if (aVar != null) {
            aVar.mo12732a();
        }
        this.f1685f.renderAd(this.f1680a);
        if (this.f1817t != null) {
            this.f1681b.mo14303S().mo14208a(new C1934z(this.f1681b, new Runnable() {
                public void run() {
                    C1491g.this.m2685y();
                }
            }), C1908o.C1910a.MAIN, this.f1680a.mo14011r(), true);
        }
        this.f1681b.mo14303S().mo14207a((C1877a) new C1934z(this.f1681b, new Runnable() {
            public void run() {
                if (C1491g.this.f1686g != null) {
                    C1491g.this.f1680a.mo12640o().mo13839a((View) C1491g.this.f1685f, (List<C1799d>) Collections.singletonList(new C1799d(C1491g.this.f1686g, FriendlyObstructionPurpose.CLOSE_AD, "close button")));
                } else {
                    C1491g.this.f1680a.mo12640o().mo13838a((View) C1491g.this.f1685f);
                }
            }
        }), C1908o.C1910a.MAIN, 500);
        super.mo12770b(this.f1813B);
    }

    /* renamed from: a_ */
    public void mo12862a_() {
        mo12866w();
    }

    /* renamed from: b */
    public void mo12803b() {
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video from prompt");
        }
        mo12865v();
    }

    /* renamed from: b */
    public void mo12863b(double d) {
        this.f1821x = d;
    }

    /* renamed from: b_ */
    public void mo12864b_() {
        C1423a aVar = this.f1819v;
        if (aVar != null) {
            aVar.mo12732a();
        }
    }

    /* renamed from: c */
    public void mo12808c() {
        C1423a aVar = this.f1819v;
        if (aVar != null) {
            aVar.mo12733b();
        }
    }

    /* renamed from: d */
    public void mo12772d() {
        mo12761a((ViewGroup) null);
    }

    /* renamed from: e */
    public void mo12773e() {
    }

    /* renamed from: h */
    public void mo12776h() {
        mo12781m();
        super.mo12776h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo12781m() {
        super.mo12758a((int) this.f1821x, this.f1820w, mo12786r(), this.f1814C);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo12786r() {
        return this.f1821x >= ((double) this.f1680a.mo13954Q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo12787s() {
        return mo12788t() && !mo12786r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo12789u() {
        long j;
        long millis;
        long j2 = 0;
        if (this.f1680a.mo13984ad() >= 0 || this.f1680a.mo13985ae() >= 0) {
            if (this.f1680a.mo13984ad() >= 0) {
                j = this.f1680a.mo13984ad();
            } else {
                C1824a aVar = (C1824a) this.f1680a;
                if (this.f1822y > 0.0d) {
                    j2 = 0 + TimeUnit.SECONDS.toMillis((long) this.f1822y);
                }
                if (aVar.mo13986af()) {
                    int l = (int) ((C1824a) this.f1680a).mo13919l();
                    if (l > 0) {
                        millis = TimeUnit.SECONDS.toMillis((long) l);
                    } else {
                        int s = (int) aVar.mo14012s();
                        if (s > 0) {
                            millis = TimeUnit.SECONDS.toMillis((long) s);
                        }
                    }
                    j2 += millis;
                }
                j = (long) (((double) j2) * (((double) this.f1680a.mo13985ae()) / 100.0d));
            }
            mo12768b(j);
        }
    }

    /* renamed from: v */
    public void mo12865v() {
        this.f1814C = SystemClock.elapsedRealtime() - this.f1815D;
        if (C2092v.m5047a()) {
            this.f1682c.mo14789b("AppLovinFullscreenActivity", "Skipping video with skip time: " + this.f1814C + "ms");
        }
        this.f1683d.mo14111f();
        this.f1689j++;
        if (this.f1680a.mo14017x()) {
            mo12776h();
        } else {
            mo12866w();
        }
    }

    /* renamed from: w */
    public void mo12866w() {
        if (this.f1823z.compareAndSet(false, true)) {
            if (C2092v.m5047a()) {
                this.f1682c.mo14789b("AppLovinFullscreenActivity", "Showing postitial...");
            }
            mo12769b("javascript:al_showPostitial();");
            C1540m mVar = this.f1817t;
            if (mVar != null) {
                mVar.setVisibility(8);
            }
            ImageView imageView = this.f1818u;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            C1423a aVar = this.f1819v;
            if (aVar != null) {
                aVar.mo12733b();
            }
            if (this.f1686g != null) {
                if (this.f1680a.mo14012s() >= 0) {
                    mo12762a(this.f1686g, this.f1680a.mo14012s(), new Runnable() {
                        public void run() {
                            C1491g.this.f1688i = SystemClock.elapsedRealtime();
                        }
                    });
                } else {
                    this.f1686g.setVisibility(0);
                }
            }
            this.f1685f.getController().mo12901n();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo12867x() {
        this.f1813B = !this.f1813B;
        mo12769b("javascript:al_setVideoMuted(" + this.f1813B + ");");
        m2684d(this.f1813B);
        mo12767a(this.f1813B, 0);
    }
}
