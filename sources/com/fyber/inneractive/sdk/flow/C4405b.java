package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.metrics.C4470a;
import com.fyber.inneractive.sdk.response.C5291e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.b */
public class C4405b<T extends C5291e> extends C4470a {

    /* renamed from: e */
    public static final String f10865e = String.valueOf(24);

    /* renamed from: f */
    public static final String f10866f = String.valueOf(1);

    /* renamed from: b */
    public final T f10867b;

    /* renamed from: c */
    public final InneractiveAdRequest f10868c;

    /* renamed from: d */
    public final JSONArray f10869d;

    public C4405b(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f10867b = t;
        this.f10868c = inneractiveAdRequest;
        this.f10869d = jSONArray;
    }
}
