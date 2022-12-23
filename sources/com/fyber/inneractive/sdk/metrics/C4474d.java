package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.d */
public class C4474d implements C4476f {

    /* renamed from: a */
    public Long f11048a = null;

    /* renamed from: b */
    public Long f11049b = null;

    /* renamed from: c */
    public Long f11050c = null;

    /* renamed from: d */
    public Long f11051d = null;

    /* renamed from: e */
    public Long f11052e = null;

    /* renamed from: f */
    public Long f11053f = null;

    /* renamed from: g */
    public Long f11054g = null;

    /* renamed from: h */
    public Long f11055h = null;

    /* renamed from: a */
    public boolean mo24672a() {
        return true;
    }

    /* renamed from: b */
    public Long mo24673b() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11054g = valueOf;
        return valueOf;
    }

    /* renamed from: c */
    public Long mo24674c() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11048a = valueOf;
        return valueOf;
    }

    /* renamed from: d */
    public Long mo24675d() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11051d = valueOf;
        return valueOf;
    }

    /* renamed from: e */
    public Long mo24676e() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11053f = valueOf;
        return valueOf;
    }

    /* renamed from: f */
    public Long mo24677f() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11049b = valueOf;
        return valueOf;
    }

    /* renamed from: g */
    public Long mo24678g() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11050c = valueOf;
        return valueOf;
    }

    /* renamed from: h */
    public Long mo24679h() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11055h = valueOf;
        return valueOf;
    }

    /* renamed from: i */
    public Long mo24680i() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        this.f11052e = valueOf;
        return valueOf;
    }

    /* renamed from: j */
    public Map<String, Long> mo24681j() {
        HashMap hashMap = new HashMap();
        Long l = this.f11049b;
        if (!(l == null || this.f11048a == null)) {
            hashMap.put("sdk_init_network_req", Long.valueOf(l.longValue() - this.f11048a.longValue()));
        }
        Long l2 = this.f11055h;
        if (!(l2 == null || this.f11049b == null)) {
            hashMap.put("sdk_got_response_from_markup_url", Long.valueOf(l2.longValue() - this.f11049b.longValue()));
        }
        Long l3 = this.f11051d;
        if (!(l3 == null || this.f11055h == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l3.longValue() - this.f11055h.longValue()));
        }
        Long l4 = this.f11050c;
        if (!(l4 == null || this.f11049b == null)) {
            hashMap.put("sdk_got_server_res", Long.valueOf(l4.longValue() - this.f11049b.longValue()));
        }
        Long l5 = this.f11051d;
        if (!(l5 == null || this.f11050c == null)) {
            hashMap.put("sdk_parsed_res", Long.valueOf(l5.longValue() - this.f11050c.longValue()));
        }
        Long l6 = this.f11052e;
        if (!(l6 == null || this.f11051d == null)) {
            hashMap.put("ad_loaded_result", Long.valueOf(l6.longValue() - this.f11051d.longValue()));
        }
        Long l7 = this.f11053f;
        if (!(l7 == null || this.f11052e == null)) {
            hashMap.put("publisher_notified", Long.valueOf(l7.longValue() - this.f11052e.longValue()));
        }
        Long l8 = this.f11054g;
        if (!(l8 == null || this.f11048a == null)) {
            hashMap.put("roundtrip", Long.valueOf(l8.longValue() - this.f11048a.longValue()));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MetricsCollectorData{");
        if (!(this.f11048a == null || this.f11049b == null)) {
            sb.append(" sdk_init_network_req=");
            sb.append(this.f11049b.longValue() - this.f11048a.longValue());
        }
        if (!(this.f11055h == null || this.f11049b == null)) {
            sb.append(", sdk_got_response_from_markup_url=");
            sb.append(this.f11055h.longValue() - this.f11049b.longValue());
        }
        if (!(this.f11050c == null || this.f11049b == null)) {
            sb.append(", sdk_got_server_res=");
            sb.append(this.f11050c.longValue() - this.f11049b.longValue());
        }
        if (!(this.f11051d == null || this.f11050c == null)) {
            sb.append(", sdk_parsed_res=");
            sb.append(this.f11051d.longValue() - this.f11050c.longValue());
        }
        if (!(this.f11052e == null || this.f11051d == null)) {
            sb.append(", ad_loaded_result=");
            sb.append(this.f11052e.longValue() - this.f11051d.longValue());
        }
        if (!(this.f11053f == null || this.f11052e == null)) {
            sb.append(", publisher_notified=");
            sb.append(this.f11053f.longValue() - this.f11052e.longValue());
        }
        if (!(this.f11054g == null || this.f11048a == null)) {
            sb.append(", roundtrip=");
            sb.append(this.f11054g.longValue() - this.f11048a.longValue());
        }
        sb.append(" }");
        return sb.toString();
    }
}
