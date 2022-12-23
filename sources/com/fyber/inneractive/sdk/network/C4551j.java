package com.fyber.inneractive.sdk.network;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.j */
public class C4551j {

    /* renamed from: a */
    public int f11243a;

    /* renamed from: b */
    public String f11244b;

    /* renamed from: c */
    public InputStream f11245c;

    /* renamed from: d */
    public Map<String, List<String>> f11246d;

    /* renamed from: e */
    public String f11247e;

    public C4551j() {
    }

    /* renamed from: a */
    public void mo24758a(InputStream inputStream) {
        this.f11245c = inputStream;
    }

    public C4551j(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) {
        this.f11245c = inputStream;
        this.f11243a = i;
        this.f11244b = str;
        this.f11246d = map;
        this.f11247e = str2;
    }

    /* renamed from: a */
    public void mo24757a(int i) {
        this.f11243a = i;
    }

    /* renamed from: a */
    public void mo24760a(Map<String, List<String>> map) {
        this.f11246d = map;
    }

    /* renamed from: a */
    public void mo24759a(String str) {
        this.f11247e = str;
    }

    /* renamed from: a */
    public void mo24755a() throws IOException {
        InputStream inputStream = this.f11245c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }
}
