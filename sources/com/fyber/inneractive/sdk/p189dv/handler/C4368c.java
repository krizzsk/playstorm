package com.fyber.inneractive.sdk.p189dv.handler;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4565o;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.p189dv.C4364g;
import com.fyber.inneractive.sdk.p189dv.enums.C4362a;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.c */
public class C4368c extends C4365a<QueryInfo> {

    /* renamed from: a */
    public final HashMap<AdFormat, QueryInfo> f10773a = new HashMap<>();

    /* renamed from: b */
    public boolean f10774b = false;

    /* renamed from: c */
    public final Object f10775c = new Object();

    /* renamed from: d */
    public int f10776d = 0;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.c$a */
    public static /* synthetic */ class C4369a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10777a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10777a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10777a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10777a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p189dv.handler.C4368c.C4369a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo24400a() {
        for (AdFormat adFormat : AdFormat.values()) {
            if (adFormat != AdFormat.NATIVE) {
                C5357n.m16773a(new C4366b(this, adFormat));
            }
        }
    }

    /* renamed from: a */
    public C4364g mo24399a(UnitDisplayType unitDisplayType) {
        AdFormat adFormat;
        C4364g gVar;
        int i = C4369a.f10777a[unitDisplayType.ordinal()];
        if (i == 1 || i == 2) {
            adFormat = AdFormat.BANNER;
        } else if (i != 3) {
            adFormat = AdFormat.INTERSTITIAL;
        } else {
            adFormat = AdFormat.REWARDED;
        }
        QueryInfo queryInfo = this.f10773a.get(adFormat);
        if (queryInfo != null) {
            synchronized (this.f10775c) {
                this.f10773a.remove(adFormat);
            }
            gVar = new C4364g(queryInfo);
        } else {
            gVar = null;
        }
        IAlog.m16699a("DVHanlder - get query: %s", gVar);
        C5357n.m16773a(new C4366b(this, adFormat));
        return gVar;
    }

    /* renamed from: a */
    public static void m13611a(String str, C4362a aVar, InneractiveAdRequest inneractiveAdRequest, C5291e eVar, String str2) {
        String str3;
        IAlog.m16699a(String.format("Firing Event 1001 -Phase - %s  Fetch error DV - msg  %s", new Object[]{aVar.name(), str2}), new Object[0]);
        C4565o oVar = C4565o.DV_ERROR_PHASE;
        C4569q.C4570a aVar2 = new C4569q.C4570a(eVar);
        aVar2.f11364b = oVar;
        aVar2.f11363a = inneractiveAdRequest;
        aVar2.f11366d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spot_id", str);
        } catch (Exception unused) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "spot_id", str);
        }
        String lowerCase = aVar.name().toLowerCase();
        try {
            jSONObject.put("phase", lowerCase);
        } catch (Exception unused2) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "phase", lowerCase);
        }
        try {
            str3 = MobileAds.getVersionString();
        } catch (Exception unused3) {
            str3 = "na";
        }
        try {
            jSONObject.put("version", str3);
        } catch (Exception unused4) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "version", str3);
        }
        try {
            jSONObject.put("message", str2);
        } catch (Exception unused5) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "message", str2);
        }
        aVar2.f11368f.put(jSONObject);
        aVar2.mo24768a((String) null);
    }
}
