package com.applovin.impl.mediation.p028a;

import com.applovin.impl.mediation.C1730g;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.e */
public abstract class C1577e extends C1573a {
    protected C1577e(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1730g gVar, C1959m mVar) {
        super(map, jSONObject, jSONObject2, gVar, mVar);
    }

    /* renamed from: C */
    public int mo13199C() {
        MaxAdFormat format = getFormat();
        C1857b bVar = format == MaxAdFormat.BANNER ? C1857b.f3133bJ : format == MaxAdFormat.MREC ? C1857b.f3135bL : format == MaxAdFormat.LEADER ? C1857b.f3137bN : format == MaxAdFormat.NATIVE ? C1857b.f3139bP : null;
        if (bVar != null) {
            return mo13231b("viewability_min_width", ((Integer) this.f2066b.mo14311a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: D */
    public int mo13200D() {
        MaxAdFormat format = getFormat();
        C1857b bVar = format == MaxAdFormat.BANNER ? C1857b.f3134bK : format == MaxAdFormat.MREC ? C1857b.f3136bM : format == MaxAdFormat.LEADER ? C1857b.f3138bO : format == MaxAdFormat.NATIVE ? C1857b.f3140bQ : null;
        if (bVar != null) {
            return mo13231b("viewability_min_height", ((Integer) this.f2066b.mo14311a(bVar)).intValue());
        }
        return 0;
    }

    /* renamed from: E */
    public float mo13201E() {
        return mo13223a("viewability_min_alpha", ((Float) this.f2066b.mo14311a(C1856a.f3141bR)).floatValue() / 100.0f);
    }

    /* renamed from: F */
    public int mo13202F() {
        return mo13231b("viewability_min_pixels", -1);
    }

    /* renamed from: G */
    public boolean mo13203G() {
        return mo13202F() >= 0;
    }

    /* renamed from: H */
    public long mo13204H() {
        return mo13232b("viewability_timer_min_visible_ms", ((Long) this.f2066b.mo14311a(C1856a.f3142bS)).longValue());
    }
}
