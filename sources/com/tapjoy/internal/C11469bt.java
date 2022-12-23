package com.tapjoy.internal;

import java.io.InputStream;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bt */
public abstract class C11469bt<Result> extends C11470bu<Result> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo72253a(C11452bh bhVar);

    /* renamed from: a */
    public final Map<String, Object> mo72255a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Accept", "application/json");
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Result mo72254a(URI uri, InputStream inputStream) {
        C11452bh a = C11452bh.m33264a(inputStream);
        a.mo72204a("BASE_URI", uri);
        int i = 0;
        try {
            a.mo72223h();
            Result result = null;
            String str = null;
            while (a.mo72225j()) {
                String l = a.mo72227l();
                if ("status".equals(l)) {
                    i = a.mo72233r();
                } else if ("message".equals(l)) {
                    str = a.mo72228m();
                } else if ("data".equals(l)) {
                    result = mo72253a(a);
                } else {
                    a.mo72234s();
                }
            }
            a.mo72224i();
            if (i == 200) {
                return result;
            }
            throw new C11471bv(i, str);
        } finally {
            a.close();
        }
    }
}
