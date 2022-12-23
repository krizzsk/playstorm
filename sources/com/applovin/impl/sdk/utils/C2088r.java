package com.applovin.impl.sdk.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.r */
public class C2088r {

    /* renamed from: a */
    public static final C2088r f4088a = new C2088r();

    /* renamed from: b */
    protected String f4089b;

    /* renamed from: c */
    protected final List<C2088r> f4090c;

    /* renamed from: d */
    private final C2088r f4091d;

    /* renamed from: e */
    private final String f4092e;

    /* renamed from: f */
    private final Map<String, String> f4093f;

    private C2088r() {
        this.f4091d = null;
        this.f4092e = "";
        this.f4093f = Collections.emptyMap();
        this.f4089b = "";
        this.f4090c = Collections.emptyList();
    }

    public C2088r(String str, Map<String, String> map, C2088r rVar) {
        this.f4091d = rVar;
        this.f4092e = str;
        this.f4093f = Collections.unmodifiableMap(map);
        this.f4090c = new ArrayList();
    }

    /* renamed from: a */
    public String mo14765a() {
        return this.f4092e;
    }

    /* renamed from: a */
    public List<C2088r> mo14766a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f4090c.size());
            for (C2088r next : this.f4090c) {
                if (str.equalsIgnoreCase(next.mo14765a())) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public C2088r mo14767b(String str) {
        if (str != null) {
            for (C2088r next : this.f4090c) {
                if (str.equalsIgnoreCase(next.mo14765a())) {
                    return next;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public Map<String, String> mo14768b() {
        return this.f4093f;
    }

    /* renamed from: c */
    public C2088r mo14769c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified.");
        } else if (this.f4090c.size() <= 0) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this);
            while (!arrayList.isEmpty()) {
                C2088r rVar = (C2088r) arrayList.get(0);
                arrayList.remove(0);
                if (str.equalsIgnoreCase(rVar.mo14765a())) {
                    return rVar;
                }
                arrayList.addAll(rVar.mo14771d());
            }
            return null;
        }
    }

    /* renamed from: c */
    public String mo14770c() {
        return this.f4089b;
    }

    /* renamed from: d */
    public List<C2088r> mo14771d() {
        return Collections.unmodifiableList(this.f4090c);
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f4092e + '\'' + ", text='" + this.f4089b + '\'' + ", attributes=" + this.f4093f + '}';
    }
}
