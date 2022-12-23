package com.applovin.impl.sdk.p048c;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.c.c */
public class C1858c {

    /* renamed from: a */
    protected final C1959m f3332a;

    /* renamed from: b */
    protected final Context f3333b;

    /* renamed from: c */
    protected final SharedPreferences f3334c;

    /* renamed from: d */
    private final Map<String, Object> f3335d = new HashMap();

    /* renamed from: e */
    private final Object f3336e = new Object();

    public C1858c(C1959m mVar) {
        this.f3332a = mVar;
        Context L = mVar.mo14297L();
        this.f3333b = L;
        this.f3334c = L.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(C1857b.class.getName());
            Class.forName(C1856a.class.getName());
        } catch (Throwable unused) {
        }
        mo14066b();
    }

    /* renamed from: a */
    private static Object m4027a(String str, JSONObject jSONObject, Object obj) throws JSONException {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }

    /* renamed from: e */
    private String m4028e() {
        return "com.applovin.sdk." + Utils.shortenKey(this.f3332a.mo14374z()) + ".";
    }

    /* renamed from: a */
    public <T> C1857b<T> mo14060a(String str, C1857b<T> bVar) {
        synchronized (this.f3336e) {
            for (C1857b<T> next : C1857b.m4023c()) {
                if (next.mo14057a().equals(str)) {
                    return next;
                }
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public <T> T mo14061a(C1857b<T> bVar) {
        if (bVar != null) {
            synchronized (this.f3336e) {
                Object obj = this.f3335d.get(bVar.mo14057a());
                if (obj == null) {
                    T b = bVar.mo14058b();
                    return b;
                }
                T a = bVar.mo14056a(obj);
                return a;
            }
        }
        throw new IllegalArgumentException("No setting type specified");
    }

    /* renamed from: a */
    public void mo14062a() {
        String e = m4028e();
        synchronized (this.f3336e) {
            SharedPreferences.Editor edit = this.f3334c.edit();
            for (C1857b next : C1857b.m4023c()) {
                Object obj = this.f3335d.get(next.mo14057a());
                if (obj != null) {
                    this.f3332a.mo14324a(e + next.mo14057a(), obj, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: a */
    public <T> void mo14063a(C1857b<?> bVar, Object obj) {
        if (bVar == null) {
            throw new IllegalArgumentException("No setting type specified");
        } else if (obj != null) {
            synchronized (this.f3336e) {
                this.f3335d.put(bVar.mo14057a(), obj);
            }
        } else {
            throw new IllegalArgumentException("No new value specified");
        }
    }

    /* renamed from: a */
    public void mo14064a(JSONObject jSONObject) {
        C2092v A;
        String str;
        String str2;
        synchronized (this.f3336e) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && next.length() > 0) {
                    try {
                        C1857b<Long> a = mo14060a(next, (C1857b) null);
                        if (a != null) {
                            this.f3335d.put(a.mo14057a(), m4027a(next, jSONObject, a.mo14058b()));
                            if (a == C1857b.f3321er) {
                                this.f3335d.put(C1857b.f3322es.mo14057a(), Long.valueOf(System.currentTimeMillis()));
                            }
                        }
                    } catch (JSONException e) {
                        th = e;
                        if (C2092v.m5047a()) {
                            A = this.f3332a.mo14286A();
                            str = "SettingsManager";
                            str2 = "Unable to parse JSON settingsValues array";
                            A.mo14790b(str, str2, th);
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (C2092v.m5047a()) {
                            A = this.f3332a.mo14286A();
                            str = "SettingsManager";
                            str2 = "Unable to convert setting object ";
                            A.mo14790b(str, str2, th);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.applovin.impl.sdk.c.b<java.lang.String>, com.applovin.impl.sdk.c.b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo14065b(com.applovin.impl.sdk.p048c.C1857b<java.lang.String> r1) {
        /*
            r0 = this;
            java.lang.Object r1 = r0.mo14061a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = com.applovin.impl.sdk.utils.CollectionUtils.explode(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p048c.C1858c.mo14065b(com.applovin.impl.sdk.c.b):java.util.List");
    }

    /* renamed from: b */
    public void mo14066b() {
        String e = m4028e();
        synchronized (this.f3336e) {
            for (C1857b next : C1857b.m4023c()) {
                try {
                    Object a = this.f3332a.mo14313a(e + next.mo14057a(), null, next.mo14058b().getClass(), this.f3334c);
                    if (a != null) {
                        this.f3335d.put(next.mo14057a(), a);
                    }
                } catch (Exception e2) {
                    if (C2092v.m5047a()) {
                        C2092v A = this.f3332a.mo14286A();
                        A.mo14790b("SettingsManager", "Unable to load \"" + next.mo14057a() + "\"", e2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public List<MaxAdFormat> mo14067c(C1857b<String> bVar) {
        ArrayList arrayList = new ArrayList(6);
        for (String formatFromString : mo14065b(bVar)) {
            arrayList.add(MaxAdFormat.formatFromString(formatFromString));
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo14068c() {
        synchronized (this.f3336e) {
            this.f3335d.clear();
        }
        this.f3332a.mo14316a(this.f3334c);
    }

    /* renamed from: d */
    public boolean mo14069d() {
        return this.f3332a.mo14363p().isVerboseLoggingEnabled() || ((Boolean) mo14061a(C1857b.f3098ab)).booleanValue();
    }
}
