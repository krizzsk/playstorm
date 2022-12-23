package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.t */
public class C5435t {

    /* renamed from: a */
    public final String f14396a;

    /* renamed from: b */
    public final String f14397b;

    /* renamed from: c */
    public final Map<String, String> f14398c;

    public C5435t(WebResourceRequest webResourceRequest) {
        Map<String, String> map;
        this.f14396a = webResourceRequest.getUrl().toString();
        this.f14397b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            map = Collections.emptyMap();
        } else {
            map = webResourceRequest.getRequestHeaders();
        }
        this.f14398c = new HashMap(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5435t.class != obj.getClass()) {
            return false;
        }
        C5435t tVar = (C5435t) obj;
        if (this.f14396a.equals(tVar.f14396a) && this.f14397b.equals(tVar.f14397b)) {
            return this.f14398c.equals(tVar.f14398c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f14396a.hashCode() * 31) + this.f14397b.hashCode()) * 31) + this.f14398c.hashCode();
    }
}
