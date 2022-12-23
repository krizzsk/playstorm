package com.tapjoy.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tapjoy.internal.co */
public final class C11491co {

    /* renamed from: a */
    public final C11498cv f27767a;

    /* renamed from: b */
    final WebView f27768b;

    /* renamed from: c */
    public final List<C11499cw> f27769c = new ArrayList();

    /* renamed from: d */
    public final Map<String, C11499cw> f27770d = new HashMap();

    /* renamed from: e */
    final String f27771e;

    /* renamed from: f */
    public final String f27772f;

    /* renamed from: g */
    public final String f27773g;

    /* renamed from: h */
    public final C11492cp f27774h;

    public C11491co(C11498cv cvVar, String str, List<C11499cw> list, String str2, String str3, C11492cp cpVar) {
        this.f27767a = cvVar;
        this.f27768b = null;
        this.f27771e = str;
        this.f27774h = cpVar;
        if (list != null) {
            this.f27769c.addAll(list);
            for (C11499cw put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f27770d.put(uuid, put);
            }
        }
        this.f27773g = str2;
        this.f27772f = str3;
    }
}
