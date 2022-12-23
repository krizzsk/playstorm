package com.applovin.impl.adview;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.s */
public class C1553s {

    /* renamed from: a */
    private final int f1962a;

    /* renamed from: b */
    private final int f1963b;

    /* renamed from: c */
    private final int f1964c;

    /* renamed from: d */
    private final int f1965d;

    /* renamed from: e */
    private final boolean f1966e;

    /* renamed from: f */
    private final int f1967f;

    /* renamed from: g */
    private final int f1968g;

    /* renamed from: h */
    private final int f1969h;

    /* renamed from: i */
    private final float f1970i;

    /* renamed from: j */
    private final float f1971j;

    public C1553s(JSONObject jSONObject, C1959m mVar) {
        if (C2092v.m5047a()) {
            C2092v A = mVar.mo14286A();
            A.mo14791c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f1962a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f1963b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f1964c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f1965d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f1966e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", false).booleanValue();
        this.f1967f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f1968g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f1969h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f1970i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f1971j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    /* renamed from: a */
    public int mo13007a() {
        return this.f1962a;
    }

    /* renamed from: b */
    public int mo13008b() {
        return this.f1963b;
    }

    /* renamed from: c */
    public int mo13009c() {
        return this.f1964c;
    }

    /* renamed from: d */
    public int mo13010d() {
        return this.f1965d;
    }

    /* renamed from: e */
    public boolean mo13011e() {
        return this.f1966e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1553s sVar = (C1553s) obj;
        if (this.f1962a == sVar.f1962a && this.f1963b == sVar.f1963b && this.f1964c == sVar.f1964c && this.f1965d == sVar.f1965d && this.f1966e == sVar.f1966e && this.f1967f == sVar.f1967f && this.f1968g == sVar.f1968g && this.f1969h == sVar.f1969h && Float.compare(sVar.f1970i, this.f1970i) == 0) {
            return Float.compare(sVar.f1971j, this.f1971j) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public long mo13013f() {
        return (long) this.f1967f;
    }

    /* renamed from: g */
    public long mo13014g() {
        return (long) this.f1968g;
    }

    /* renamed from: h */
    public long mo13015h() {
        return (long) this.f1969h;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f1962a * 31) + this.f1963b) * 31) + this.f1964c) * 31) + this.f1965d) * 31) + (this.f1966e ? 1 : 0)) * 31) + this.f1967f) * 31) + this.f1968g) * 31) + this.f1969h) * 31;
        float f = this.f1970i;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f1971j;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }

    /* renamed from: i */
    public float mo13017i() {
        return this.f1970i;
    }

    /* renamed from: j */
    public float mo13018j() {
        return this.f1971j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f1962a + ", heightPercentOfScreen=" + this.f1963b + ", margin=" + this.f1964c + ", gravity=" + this.f1965d + ", tapToFade=" + this.f1966e + ", tapToFadeDurationMillis=" + this.f1967f + ", fadeInDurationMillis=" + this.f1968g + ", fadeOutDurationMillis=" + this.f1969h + ", fadeInDelay=" + this.f1970i + ", fadeOutDelay=" + this.f1971j + '}';
    }
}
