package com.bytedance.sdk.component.p090a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.p090a.C2570k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.v */
/* compiled from: PermissionConfig */
class C2587v {

    /* renamed from: a */
    private final Map<String, List<C2590b>> f5533a = new ConcurrentHashMap();

    /* renamed from: b */
    private final LruCache<String, C2591c> f5534b;

    /* renamed from: c */
    private final C2570k.C2571a f5535c;

    /* renamed from: d */
    private final String f5536d;

    /* renamed from: e */
    private volatile boolean f5537e = false;

    /* renamed from: com.bytedance.sdk.component.a.v$c */
    /* compiled from: PermissionConfig */
    static final class C2591c {

        /* renamed from: a */
        C2594x f5544a = C2594x.PUBLIC;

        /* renamed from: b */
        Set<String> f5545b = new HashSet();

        /* renamed from: c */
        Set<String> f5546c = new HashSet();

        C2591c() {
        }
    }

    C2587v(String str, int i, C2570k.C2571a aVar, final Executor executor, JSONObject jSONObject) {
        this.f5536d = str;
        if (i <= 0) {
            this.f5534b = new LruCache<>(16);
        } else {
            this.f5534b = new LruCache<>(i);
        }
        this.f5535c = aVar;
        if (jSONObject == null) {
            aVar.mo16581a(m6589d(str), (C2570k.C2571a.C2572a) new C2570k.C2571a.C2572a() {
            });
        } else {
            mo16614a(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16614a(JSONObject jSONObject) {
        m6586b(jSONObject);
        this.f5535c.mo16582a(m6589d(this.f5536d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2591c mo16613a(String str, Set<String> set) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        C2591c cVar = new C2591c();
        if (authority == null || authority.isEmpty()) {
            cVar.f5544a = C2594x.PUBLIC;
            return cVar;
        }
        for (String next : set) {
            if (!authority.equals(next)) {
                if (authority.endsWith("." + next)) {
                }
            }
            cVar.f5544a = C2594x.PRIVATE;
            return cVar;
        }
        C2591c cVar2 = this.f5534b.get(builder);
        if (cVar2 != null) {
            return cVar2;
        }
        return m6584a(builder);
    }

    /* renamed from: b */
    private void m6586b(JSONObject jSONObject) {
        this.f5533a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                LinkedList linkedList = new LinkedList();
                this.f5533a.put(next, linkedList);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(m6587c(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            C2568i.m6527b("Parse configurations failed, response: " + jSONObject.toString(), e);
        }
        this.f5537e = true;
    }

    /* renamed from: a */
    private C2591c m6584a(String str) throws C2589a {
        C2591c cVar = new C2591c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String b = m6585b(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || b == null) {
            cVar.f5544a = C2594x.PUBLIC;
            return cVar;
        }
        List<C2590b> c = m6588c(b);
        if (c == null) {
            return cVar;
        }
        for (C2590b next : c) {
            if (next.f5540a.matcher(str).find()) {
                if (next.f5541b.compareTo(cVar.f5544a) >= 0) {
                    cVar.f5544a = next.f5541b;
                }
                cVar.f5545b.addAll(next.f5542c);
                cVar.f5546c.addAll(next.f5543d);
            }
        }
        this.f5534b.put(str, cVar);
        return cVar;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$a */
    /* compiled from: PermissionConfig */
    static class C2589a extends IllegalStateException {
        C2589a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r4.split("[.]");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m6585b(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "[.]"
            java.lang.String[] r1 = r4.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L_0x000f
            return r0
        L_0x000f:
            if (r2 != r3) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = r2 + -2
            r0 = r1[r0]
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            int r2 = r2 + -1
            r0 = r1[r2]
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p090a.C2587v.m6585b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private List<C2590b> m6588c(String str) throws C2589a {
        if (this.f5537e) {
            return this.f5533a.get(str);
        }
        throw new C2589a("Permission config is outdated!");
    }

    /* renamed from: c */
    private static C2590b m6587c(JSONObject jSONObject) throws JSONException {
        C2590b bVar = new C2590b();
        bVar.f5540a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f5541b = C2594x.m6596a(jSONObject.getString("group"));
        bVar.f5542c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                bVar.f5542c.add(optJSONArray.getString(i));
            }
        }
        bVar.f5543d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                bVar.f5543d.add(optJSONArray2.getString(i2));
            }
        }
        return bVar;
    }

    /* renamed from: d */
    private static String m6589d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig." + str;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$b */
    /* compiled from: PermissionConfig */
    private static final class C2590b {

        /* renamed from: a */
        Pattern f5540a;

        /* renamed from: b */
        C2594x f5541b;

        /* renamed from: c */
        List<String> f5542c;

        /* renamed from: d */
        List<String> f5543d;

        private C2590b() {
        }
    }
}
