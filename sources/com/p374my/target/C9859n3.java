package com.p374my.target;

import android.content.Context;
import android.content.SharedPreferences;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.my.target.n3 */
public class C9859n3 implements CookieStore {

    /* renamed from: a */
    public final SharedPreferences f24388a;

    /* renamed from: b */
    public final Map<URI, Set<HttpCookie>> f24389b = new HashMap();

    public C9859n3(Context context) {
        this.f24388a = context.getSharedPreferences("mytarget_httpcookie_prefs", 0);
        mo64851a();
    }

    /* renamed from: a */
    public static URI m28814a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() == null) {
            return uri;
        }
        String domain = httpCookie.getDomain();
        if (domain.charAt(0) == '.') {
            domain = domain.substring(1);
        }
        try {
            return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? "/" : httpCookie.getPath(), (String) null);
        } catch (Throwable th) {
            C9672e0.m27882a(th.getMessage());
            return uri;
        }
    }

    /* renamed from: a */
    public final List<HttpCookie> mo64850a(URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : this.f24389b.entrySet()) {
            URI uri2 = (URI) next.getKey();
            if (mo64853a(uri2.getHost(), uri.getHost()) && mo64857b(uri2.getPath(), uri.getPath())) {
                hashSet.addAll((Collection) next.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            mo64852a(uri, (List<HttpCookie>) arrayList);
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: a */
    public final void mo64851a() {
        for (Map.Entry next : this.f24388a.getAll().entrySet()) {
            try {
                URI uri = new URI(((String) next.getKey()).split("\\|", 2)[0]);
                HttpCookie a = new C9880o3().mo65156a((String) next.getValue());
                Set set = this.f24389b.get(uri);
                if (set == null) {
                    set = new HashSet();
                    this.f24389b.put(uri, set);
                }
                set.add(a);
            } catch (Throwable th) {
                C9672e0.m27882a(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo64852a(URI uri, List<HttpCookie> list) {
        SharedPreferences.Editor edit = this.f24388a.edit();
        for (HttpCookie name : list) {
            edit.remove(uri.toString() + "|" + name.getName());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final boolean mo64853a(String str, String str2) {
        if (!str2.equals(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(".");
            sb.append(str);
            return str2.endsWith(sb.toString());
        }
    }

    public synchronized void add(URI uri, HttpCookie httpCookie) {
        URI a = m28814a(uri, httpCookie);
        Set set = this.f24389b.get(a);
        if (set == null) {
            set = new HashSet();
            this.f24389b.put(a, set);
        }
        set.remove(httpCookie);
        set.add(httpCookie);
        mo64858c(a, httpCookie);
    }

    /* renamed from: b */
    public final void mo64855b() {
        this.f24388a.edit().clear().apply();
    }

    /* renamed from: b */
    public final void mo64856b(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f24388a.edit();
        edit.remove(uri.toString() + "|" + httpCookie.getName());
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo64857b(String str, String str2) {
        return str2.equals(str) || (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') || (str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/');
    }

    /* renamed from: c */
    public final void mo64858c(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f24388a.edit();
        edit.putString(uri.toString() + "|" + httpCookie.getName(), new C9880o3().mo65155a(httpCookie));
        edit.apply();
    }

    public synchronized List<HttpCookie> get(URI uri) {
        return mo64850a(uri);
    }

    public synchronized List<HttpCookie> getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (URI a : this.f24389b.keySet()) {
            arrayList.addAll(mo64850a(a));
        }
        return arrayList;
    }

    public synchronized List<URI> getURIs() {
        return new ArrayList(this.f24389b.keySet());
    }

    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z;
        Set set = this.f24389b.get(uri);
        z = set != null && set.remove(httpCookie);
        if (z) {
            mo64856b(uri, httpCookie);
        }
        return z;
    }

    public synchronized boolean removeAll() {
        this.f24389b.clear();
        mo64855b();
        return true;
    }
}
