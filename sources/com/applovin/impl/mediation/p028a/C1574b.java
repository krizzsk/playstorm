package com.applovin.impl.mediation.p028a;

import android.view.View;
import com.applovin.impl.mediation.C1730g;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.b */
public class C1574b extends C1577e {
    private C1574b(C1574b bVar, C1730g gVar) {
        super(bVar.mo13216T(), bVar.mo13206J(), bVar.mo13205I(), gVar, bVar.f2066b);
    }

    public C1574b(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1959m mVar) {
        super(map, jSONObject, jSONObject2, (C1730g) null, mVar);
    }

    /* renamed from: A */
    public boolean mo13172A() {
        return mo13233b("proe", (Boolean) this.f2066b.mo14311a(C1856a.f3027J)).booleanValue();
    }

    /* renamed from: B */
    public long mo13173B() {
        return Utils.parseColor(mo13234b("bg_color", (String) null));
    }

    /* renamed from: a */
    public C1573a mo13132a(C1730g gVar) {
        return new C1574b(this, gVar);
    }

    /* renamed from: u */
    public int mo13174u() {
        int b = mo13231b("ad_view_width", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getWidth();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: v */
    public int mo13175v() {
        int b = mo13231b("ad_view_height", -2);
        if (b != -2) {
            return b;
        }
        MaxAdFormat format = getFormat();
        if (format.isAdViewAd()) {
            return format.getSize().getHeight();
        }
        throw new IllegalStateException("Invalid ad format");
    }

    /* renamed from: w */
    public View mo13176w() {
        if (!mo13141e() || this.f2056a == null) {
            return null;
        }
        return this.f2056a.mo13607a();
    }

    /* renamed from: x */
    public long mo13177x() {
        return mo13232b("viewability_imp_delay_ms", ((Long) this.f2066b.mo14311a(C1857b.f3132bI)).longValue());
    }

    /* renamed from: y */
    public boolean mo13178y() {
        return mo13179z() >= 0;
    }

    /* renamed from: z */
    public long mo13179z() {
        long b = mo13232b("ad_refresh_ms", -1);
        return b >= 0 ? b : mo13225a("ad_refresh_ms", ((Long) this.f2066b.mo14311a(C1856a.f3052m)).longValue());
    }
}
