package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.cache.a */
public class C4596a {

    /* renamed from: a */
    public File f11430a;

    /* renamed from: b */
    public String f11431b;

    /* renamed from: c */
    public boolean f11432c;

    /* renamed from: d */
    public Object f11433d = new Object();

    /* renamed from: e */
    public Map<String, String> f11434e = new HashMap();

    /* renamed from: f */
    public volatile boolean f11435f = false;

    public C4596a(String str, String str2, File file, boolean z, String str3) {
        this.f11430a = file;
        this.f11431b = str2;
        this.f11432c = z;
    }

    /* renamed from: a */
    public File mo24803a() {
        File file;
        synchronized (this.f11433d) {
            file = this.f11430a;
        }
        return file;
    }
}
