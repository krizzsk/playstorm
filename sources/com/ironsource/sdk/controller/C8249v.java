package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.p206f.C6427b;
import com.ironsource.sdk.service.C8387c;
import com.ironsource.sdk.service.C8388d;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.v */
public class C8249v {

    /* renamed from: a */
    static final String f19726a = C8249v.class.getSimpleName();

    /* renamed from: b */
    C8388d f19727b;

    /* renamed from: c */
    C8387c f19728c;

    /* renamed from: d */
    Context f19729d;

    /* renamed from: e */
    private final String f19730e = "oneToken";

    /* renamed from: f */
    private C6427b f19731f;

    /* renamed from: com.ironsource.sdk.controller.v$a */
    static class C8250a {

        /* renamed from: a */
        String f19732a;

        /* renamed from: b */
        JSONObject f19733b;

        /* renamed from: c */
        String f19734c;

        /* renamed from: d */
        String f19735d;

        private C8250a() {
        }

        /* synthetic */ C8250a(byte b) {
            this();
        }
    }

    public C8249v(Context context, C8388d dVar) {
        this.f19727b = dVar;
        this.f19729d = context;
        this.f19728c = new C8387c();
        this.f19731f = new C6427b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JSONObject mo56612a() {
        JSONObject a = this.f19731f.mo35937a();
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = a.get(next);
            if (obj instanceof String) {
                a.put(next, C6399a.C64001.m19213a((String) obj));
            }
        }
        return a;
    }
}
