package com.p374my.target;

import android.content.Context;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.m3 */
public final class C9840m3 {

    /* renamed from: a */
    public static volatile C9840m3 f24290a;

    /* renamed from: b */
    public final CookieHandler f24291b;

    public C9840m3(CookieManager cookieManager) {
        this.f24291b = cookieManager;
    }

    /* renamed from: a */
    public static C9840m3 m28662a(Context context) {
        C9840m3 m3Var = f24290a;
        if (m3Var == null) {
            synchronized (C9840m3.class) {
                m3Var = f24290a;
                if (m3Var == null) {
                    m3Var = new C9840m3(new CookieManager(new C9859n3(context.getApplicationContext()), (CookiePolicy) null));
                    f24290a = m3Var;
                }
            }
        }
        return m3Var;
    }

    /* renamed from: a */
    public void mo64726a(URLConnection uRLConnection) {
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        try {
            this.f24291b.put(URI.create(uRLConnection.getURL().toString()), headerFields);
        } catch (Throwable th) {
            C9672e0.m27882a("unable to set cookies from urlconnection: " + th.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo64727a(URLConnection uRLConnection, Map<String, List<String>> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            for (String addRequestProperty : (List) next.getValue()) {
                uRLConnection.addRequestProperty(str, addRequestProperty);
            }
        }
    }

    /* renamed from: b */
    public void mo64728b(URLConnection uRLConnection) {
        HashMap hashMap = new HashMap();
        try {
            mo64727a(uRLConnection, this.f24291b.get(URI.create(uRLConnection.getURL().toString()), hashMap));
        } catch (Throwable th) {
            C9672e0.m27882a("unable to set cookies to urlconnection " + th.getMessage());
        }
    }
}
