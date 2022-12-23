package com.bytedance.sdk.component.adexpress.p091a.p093b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2616b;
import com.bytedance.sdk.component.adexpress.p091a.p094c.C2617c;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p122b.C2916b;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2975l;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.d */
/* compiled from: TmplDiffManager */
public class C2611d {

    /* renamed from: a */
    private static volatile C2611d f5584a;

    /* renamed from: b */
    private AtomicBoolean f5585b = new AtomicBoolean(false);

    /* renamed from: a */
    public static C2611d m6675a() {
        if (f5584a == null) {
            synchronized (C2611d.class) {
                if (f5584a == null) {
                    f5584a = new C2611d();
                }
            }
        }
        return f5584a;
    }

    private C2611d() {
    }

    /* renamed from: a */
    public C2616b mo16665a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2609c.m6666a().mo16658a(str);
    }

    /* renamed from: b */
    public Set<String> mo16668b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return C2609c.m6666a().mo16662b(str);
    }

    /* renamed from: b */
    private void m6679b() {
        if (C2599a.m6611a().mo16628c() != null) {
            int a = C2599a.m6611a().mo16628c().mo16635a();
            if (a <= 0) {
                a = 100;
            }
            List<C2616b> b = C2609c.m6666a().mo16661b();
            if (b.isEmpty() || a >= b.size()) {
                C2975l.m8384b("TmplDiffManager", "end doCheckAndDeleteTask maxTplCnt,local size" + a + ", 目前存储的模版的个数 " + b.size());
                return;
            }
            TreeMap treeMap = new TreeMap();
            for (C2616b next : b) {
                treeMap.put(next.mo16702g(), next);
            }
            HashSet hashSet = new HashSet();
            int size = (int) (((float) b.size()) - (((float) a) * 0.75f));
            int i = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                if (entry != null && i < size) {
                    i++;
                    ((Long) entry.getKey()).longValue();
                    C2616b bVar = (C2616b) entry.getValue();
                    if (bVar != null) {
                        hashSet.add(bVar.mo16693b());
                    }
                }
            }
            mo16667a((Set<String>) hashSet);
            this.f5585b.set(false);
        }
    }

    /* renamed from: c */
    private JSONObject m6681c(String str) {
        if (C2599a.m6611a().mo16628c() == null) {
            return null;
        }
        C2916b g = C2599a.m6611a().mo16628c().mo16641g();
        g.mo17789a(str);
        C2913b a = g.mo17785a();
        if (a != null) {
            try {
                if (a.mo17779f() && a.mo17777d() != null) {
                    return new JSONObject(a.mo17777d());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo16666a(C2617c cVar, String str) {
        if (cVar == null) {
            C2975l.m8391e("TmplDiffManager", "saveTemplate error: tplInfo == null");
            return;
        }
        final String str2 = cVar.f5609a;
        final String str3 = cVar.f5611c;
        final String str4 = cVar.f5610b;
        final String str5 = cVar.f5612d;
        final String str6 = cVar.f5613e;
        final String h = TextUtils.isEmpty(str) ? C2599a.m6611a().mo16628c() != null ? C2599a.m6611a().mo16628c().mo16642h() : "" : str;
        if (TextUtils.isEmpty(str2)) {
            C2975l.m8391e("TmplDiffManager", "saveTemplate error:tmpId is empty");
        } else {
            C2952e.m8308a(new C2955g("saveTemplate") {
                public void run() {
                    C2611d.this.m6678a(str2, str3, str4, str5, str6, h);
                }
            }, 10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m6678a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.bytedance.sdk.component.adexpress.a.c.b r0 = r7.mo16665a((java.lang.String) r8)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0021
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x001f
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0014
            goto L_0x001f
        L_0x0014:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m6680b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x001f:
            monitor-exit(r7)
            return
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x002b
            r7.m6677a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x002b:
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0035
            r7.m6677a(r9, r13, r8)     // Catch:{ all -> 0x0055 }
            goto L_0x003f
        L_0x0035:
            r0 = r7
            r1 = r13
            r2 = r8
            r3 = r10
            r4 = r9
            r5 = r11
            r6 = r12
            r0.m6680b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0055 }
        L_0x003f:
            boolean r8 = com.bytedance.sdk.component.adexpress.p091a.p093b.C2613e.m6690b(r12)     // Catch:{ all -> 0x0055 }
            boolean r9 = com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a.m6648f()     // Catch:{ all -> 0x0055 }
            if (r9 == 0) goto L_0x004b
            if (r8 == 0) goto L_0x0053
        L_0x004b:
            com.bytedance.sdk.component.adexpress.a.b.b r8 = com.bytedance.sdk.component.adexpress.p091a.p093b.C2605b.m6649a()     // Catch:{ all -> 0x0055 }
            r9 = 1
            r8.mo16648a((boolean) r9)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r7)
            return
        L_0x0055:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p091a.p093b.C2611d.m6678a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private void m6680b(String str, String str2, String str3, String str4, String str5, String str6) {
        C2609c.m6666a().mo16659a(new C2616b().mo16690a(str).mo16692b(str2).mo16694c(str3).mo16696d(str4).mo16698e(str5).mo16700f(str6).mo16689a(Long.valueOf(System.currentTimeMillis())));
        m6679b();
    }

    /* renamed from: a */
    private void m6677a(String str, String str2, String str3) {
        JSONObject c;
        if (!TextUtils.isEmpty(str) && (c = m6681c(str)) != null) {
            String optString = c.optString(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
            String optString2 = c.optString("version");
            String optString3 = c.optString("data");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                C2616b a = new C2616b().mo16690a(str2).mo16692b(str3).mo16694c(optString).mo16696d(str).mo16698e(optString3).mo16700f(optString2).mo16689a(Long.valueOf(System.currentTimeMillis()));
                C2609c.m6666a().mo16659a(a);
                m6679b();
                if (C2613e.m6690b(optString2)) {
                    a.mo16700f(optString2);
                    C2605b.m6649a().mo16648a(true);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo16667a(Set<String> set) {
        try {
            C2609c.m6666a().mo16660a(set);
        } catch (Throwable th) {
            C2975l.m8384b("TmplDiffManager", th.getMessage());
        }
    }
}
