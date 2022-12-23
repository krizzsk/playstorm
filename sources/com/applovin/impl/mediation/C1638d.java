package com.applovin.impl.mediation;

import android.content.Context;
import com.applovin.impl.mediation.ads.C1604a;
import com.applovin.impl.mediation.p028a.C1573a;
import com.applovin.impl.mediation.p031c.C1623b;
import com.applovin.impl.mediation.p031c.C1627c;
import com.applovin.impl.mediation.p032d.C1645c;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;

/* renamed from: com.applovin.impl.mediation.d */
public class C1638d {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2268a;

    /* renamed from: b */
    private final Map<String, C1642b> f2269b = new HashMap(4);

    /* renamed from: c */
    private final Object f2270c = new Object();

    /* renamed from: d */
    private final Map<String, C1573a> f2271d = new HashMap(4);

    /* renamed from: e */
    private final Object f2272e = new Object();

    /* renamed from: com.applovin.impl.mediation.d$a */
    private static class C1640a implements C1604a.C1605a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1959m f2280a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final WeakReference<Context> f2281b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1638d f2282c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C1642b f2283d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final MaxAdFormat f2284e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final Map<String, Object> f2285f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Map<String, Object> f2286g;

        /* renamed from: h */
        private final int f2287h;

        private C1640a(Map<String, Object> map, Map<String, Object> map2, C1642b bVar, MaxAdFormat maxAdFormat, C1638d dVar, C1959m mVar, Context context) {
            this.f2280a = mVar;
            this.f2281b = new WeakReference<>(context);
            this.f2282c = dVar;
            this.f2283d = bVar;
            this.f2284e = maxAdFormat;
            this.f2286g = map2;
            this.f2285f = map;
            this.f2287h = CollectionUtils.getBoolean(map2, "disable_auto_retries") ? -1 : (!maxAdFormat.isAdViewAd() || !CollectionUtils.getBoolean(map2, "auto_refresh_stopped")) ? ((Integer) mVar.mo14311a(C1856a.f3031N)).intValue() : Math.min(2, ((Integer) mVar.mo14311a(C1856a.f3031N)).intValue());
        }

        public void onAdClicked(MaxAd maxAd) {
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
            throw new IllegalStateException("Wrong callback invoked for ad: " + maxAd);
        }

        public void onAdLoadFailed(final String str, MaxError maxError) {
            if (!this.f2280a.mo14326a(C1856a.f3032O, this.f2284e) || this.f2283d.f2293c >= this.f2287h) {
                int unused = this.f2283d.f2293c = 0;
                this.f2283d.f2292b.set(false);
                if (this.f2283d.f2294d != null) {
                    ((MaxErrorImpl) maxError).setLoadTag(this.f2283d.f2291a);
                    C2043j.m4931a((MaxAdListener) this.f2283d.f2294d, str, maxError);
                    C1604a.C1605a unused2 = this.f2283d.f2294d = null;
                    return;
                }
                return;
            }
            C1642b.m3305e(this.f2283d);
            final int pow = (int) Math.pow(2.0d, (double) this.f2283d.f2293c);
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    C1640a.this.f2286g.put("retry_delay_sec", Integer.valueOf(pow));
                    C1640a.this.f2286g.put("retry_attempt", Integer.valueOf(C1640a.this.f2283d.f2293c));
                    Context context = (Context) C1640a.this.f2281b.get();
                    if (context == null) {
                        context = C1640a.this.f2280a.mo14297L();
                    }
                    C1640a.this.f2282c.m3287a(str, C1640a.this.f2284e, C1640a.this.f2285f, C1640a.this.f2286g, context, C1640a.this);
                }
            }, TimeUnit.SECONDS.toMillis((long) pow));
        }

        public void onAdLoaded(MaxAd maxAd) {
            C1573a aVar = (C1573a) maxAd;
            aVar.mo13136a(this.f2283d.f2291a);
            int unused = this.f2283d.f2293c = 0;
            if (this.f2283d.f2294d != null) {
                aVar.mo13143g().mo13618e().mo13122a(this.f2283d.f2294d);
                this.f2283d.f2294d.onAdLoaded(aVar);
                if (aVar.mo13140d().endsWith("load")) {
                    this.f2283d.f2294d.onAdRevenuePaid(aVar);
                }
                C1604a.C1605a unused2 = this.f2283d.f2294d = null;
                if ((this.f2280a.mo14344b(C1856a.f3030M).contains(maxAd.getAdUnitId()) || this.f2280a.mo14326a(C1856a.f3029L, maxAd.getFormat())) && !this.f2280a.mo14295J().mo13583a() && !this.f2280a.mo14295J().mo13585b()) {
                    Context context = (Context) this.f2281b.get();
                    if (context == null) {
                        context = this.f2280a.mo14297L();
                    }
                    this.f2282c.m3287a(maxAd.getAdUnitId(), maxAd.getFormat(), this.f2285f, this.f2286g, context, this);
                    return;
                }
            } else {
                this.f2282c.m3284a(aVar);
            }
            this.f2283d.f2292b.set(false);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }
    }

    /* renamed from: com.applovin.impl.mediation.d$b */
    private static class C1642b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f2291a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AtomicBoolean f2292b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f2293c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public volatile C1604a.C1605a f2294d;

        private C1642b(String str) {
            this.f2292b = new AtomicBoolean();
            this.f2291a = str;
        }

        /* renamed from: e */
        static /* synthetic */ int m3305e(C1642b bVar) {
            int i = bVar.f2293c;
            bVar.f2293c = i + 1;
            return i;
        }
    }

    public C1638d(C1959m mVar) {
        this.f2268a = mVar;
    }

    /* renamed from: a */
    private C1642b m3282a(String str, String str2) {
        String str3;
        C1642b bVar;
        synchronized (this.f2270c) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (StringUtils.isValidString(str2)) {
                str3 = "-" + str2;
            } else {
                str3 = "";
            }
            sb.append(str3);
            String sb2 = sb.toString();
            bVar = this.f2269b.get(sb2);
            if (bVar == null) {
                bVar = new C1642b(str2);
                this.f2269b.put(sb2, bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3284a(C1573a aVar) {
        synchronized (this.f2272e) {
            if (this.f2271d.containsKey(aVar.getAdUnitId()) && C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdk", "Ad in cache already: " + aVar.getAdUnitId());
            }
            this.f2271d.put(aVar.getAdUnitId(), aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3287a(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1604a.C1605a aVar) {
        final String str2 = str;
        final MaxAdFormat maxAdFormat2 = maxAdFormat;
        final Map<String, Object> map3 = map;
        final Map<String, Object> map4 = map2;
        final Context context2 = context;
        final C1604a.C1605a aVar2 = aVar;
        this.f2268a.mo14303S().mo14206a((C1877a) new C1623b(maxAdFormat, map, context, this.f2268a, new C1623b.C1625a() {
            /* renamed from: a */
            public void mo13359a(JSONArray jSONArray) {
                C1638d.this.f2268a.mo14303S().mo14205a((C1877a) new C1627c(str2, maxAdFormat2, map3, map4, jSONArray, context2, C1638d.this.f2268a, aVar2));
            }
        }), C1645c.m3312a(maxAdFormat));
    }

    /* renamed from: b */
    private C1573a m3288b(String str) {
        C1573a aVar;
        synchronized (this.f2272e) {
            aVar = this.f2271d.get(str);
            this.f2271d.remove(str);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo13381a(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1604a.C1605a aVar) {
        C1604a.C1605a aVar2 = aVar;
        C1573a b = (this.f2268a.mo14295J().mo13585b() || Utils.isDspDemoApp(this.f2268a.mo14297L())) ? null : m3288b(str);
        String str3 = str2;
        if (b != null) {
            b.mo13136a(str2);
            b.mo13143g().mo13618e().mo13122a(aVar2);
            aVar2.onAdLoaded(b);
            if (b.mo13140d().endsWith("load")) {
                aVar2.onAdRevenuePaid(b);
            }
        }
        C1642b a = m3282a(str, str2);
        if (a.f2292b.compareAndSet(false, true)) {
            if (b == null) {
                C1604a.C1605a unused = a.f2294d = aVar2;
            }
            m3287a(str, maxAdFormat, map, map2, context, new C1640a(map, map2, a, maxAdFormat, this, this.f2268a, context));
            return;
        }
        if (!(a.f2294d == null || a.f2294d == aVar2 || !C2092v.m5047a())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempting to load ad for same ad unit id (");
            String str4 = str;
            sb.append(str);
            sb.append(") while another ad load is already in progress!");
            C2092v.m5052h("MediationAdLoadManager", sb.toString());
        }
        C1604a.C1605a unused2 = a.f2294d = aVar2;
    }

    /* renamed from: a */
    public boolean mo13382a(String str) {
        boolean z;
        synchronized (this.f2272e) {
            z = this.f2271d.get(str) != null;
        }
        return z;
    }
}
