package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2521b;
import com.bytedance.sdk.component.p120e.C2913b;
import com.bytedance.sdk.component.p120e.p121a.C2912a;
import com.bytedance.sdk.component.p120e.p122b.C2914a;
import com.bytedance.sdk.component.p120e.p122b.C2918c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p176i.C3854d;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.g */
/* compiled from: RewardVideoCache */
public class C3351g {

    /* renamed from: a */
    private static volatile C3351g f8005a;

    /* renamed from: b */
    private final Context f8006b;

    /* renamed from: c */
    private final C3368j f8007c;

    /* renamed from: d */
    private Map<C3498n, Long> f8008d = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.g$a */
    /* compiled from: RewardVideoCache */
    interface C3355a<T> {
        /* renamed from: a */
        void mo19216a(boolean z, T t);
    }

    /* renamed from: a */
    public void mo19209a(String str) {
        this.f8007c.mo19234d(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|(2:5|6)(1:7)|8|(2:14|(5:16|17|18|(2:20|44)(2:21|43)|22))|24|25|(1:52)(4:35|(5:37|38|39|46|40)|45|53)) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0075 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097 A[Catch:{ all -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19205a() {
        /*
            r9 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0075 }
            java.lang.String r2 = "shared_prefs"
            r3 = 24
            if (r1 < r3) goto L_0x0015
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0075 }
            android.content.Context r4 = r9.f8006b     // Catch:{ all -> 0x0075 }
            java.io.File r4 = r4.getDataDir()     // Catch:{ all -> 0x0075 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x002b
        L_0x0015:
            android.content.Context r1 = r9.f8006b     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "1"
            java.io.File r1 = r1.getDatabasePath(r4)     // Catch:{ all -> 0x0075 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            java.io.File r1 = r1.getParentFile()     // Catch:{ all -> 0x0075 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0075 }
            r1 = r4
        L_0x002b:
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x0075 }
            if (r2 == 0) goto L_0x0075
            com.bytedance.sdk.openadsdk.component.reward.g$1 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$1     // Catch:{ all -> 0x0075 }
            r2.<init>()     // Catch:{ all -> 0x0075 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x0075
            int r2 = r1.length     // Catch:{ all -> 0x0075 }
            r4 = r0
        L_0x0044:
            if (r4 >= r2) goto L_0x0075
            r5 = r1[r4]     // Catch:{ all -> 0x0075 }
            java.lang.String r6 = r5.getName()     // Catch:{ all -> 0x0072 }
            java.lang.String r7 = ".xml"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replace(r7, r8)     // Catch:{ all -> 0x0072 }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0072 }
            if (r7 < r3) goto L_0x005e
            android.content.Context r5 = r9.f8006b     // Catch:{ all -> 0x0072 }
            r5.deleteSharedPreferences(r6)     // Catch:{ all -> 0x0072 }
            goto L_0x0072
        L_0x005e:
            android.content.Context r7 = r9.f8006b     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences r6 = r7.getSharedPreferences(r6, r0)     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch:{ all -> 0x0072 }
            android.content.SharedPreferences$Editor r6 = r6.clear()     // Catch:{ all -> 0x0072 }
            r6.apply()     // Catch:{ all -> 0x0072 }
            com.bytedance.sdk.component.utils.C2964f.m8359c(r5)     // Catch:{ all -> 0x0072 }
        L_0x0072:
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0075:
            android.content.Context r1 = r9.f8006b     // Catch:{ all -> 0x00a2 }
            java.io.File r1 = r1.getCacheDir()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            boolean r2 = r1.exists()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            boolean r2 = r1.isDirectory()     // Catch:{ all -> 0x00a2 }
            if (r2 == 0) goto L_0x00a2
            com.bytedance.sdk.openadsdk.component.reward.g$2 r2 = new com.bytedance.sdk.openadsdk.component.reward.g$2     // Catch:{ all -> 0x00a2 }
            r2.<init>()     // Catch:{ all -> 0x00a2 }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
            if (r2 <= 0) goto L_0x00a2
            int r2 = r1.length     // Catch:{ all -> 0x00a2 }
        L_0x0098:
            if (r0 >= r2) goto L_0x00a2
            r3 = r1[r0]     // Catch:{ all -> 0x00a2 }
            com.bytedance.sdk.component.utils.C2964f.m8359c(r3)     // Catch:{ all -> 0x009f }
        L_0x009f:
            int r0 = r0 + 1
            goto L_0x0098
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.C3351g.mo19205a():void");
    }

    /* renamed from: a */
    public void mo19207a(AdSlot adSlot, C3498n nVar) {
        mo19206a(adSlot);
        if (nVar != null) {
            try {
                this.f8007c.mo19230a(adSlot.getCodeId(), nVar.mo19674ar().toString());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public AdSlot mo19211b(String str) {
        return this.f8007c.mo19235e(str);
    }

    /* renamed from: a */
    public void mo19206a(AdSlot adSlot) {
        this.f8007c.mo19229a(adSlot);
    }

    /* renamed from: b */
    public void mo19212b(AdSlot adSlot) {
        this.f8007c.mo19232b(adSlot);
    }

    /* renamed from: b */
    public AdSlot mo19210b() {
        return this.f8007c.mo19227a();
    }

    /* renamed from: a */
    public static C3351g m9945a(Context context) {
        if (f8005a == null) {
            synchronized (C3351g.class) {
                if (f8005a == null) {
                    f8005a = new C3351g(context);
                }
            }
        }
        return f8005a;
    }

    private C3351g(Context context) {
        this.f8006b = context == null ? C3578m.m11231a() : context.getApplicationContext();
        this.f8007c = new C3368j(this.f8006b, "sp_reward_video");
    }

    /* renamed from: a */
    public String mo19203a(C3498n nVar) {
        if (nVar == null || nVar.mo19607J() == null || TextUtils.isEmpty(nVar.mo19607J().mo16360i())) {
            return null;
        }
        return mo19204a(nVar.mo19607J().mo16360i(), nVar.mo19607J().mo16364l(), nVar.mo19650aD());
    }

    /* renamed from: a */
    public String mo19204a(String str, String str2, int i) {
        File a;
        if (!TextUtils.isEmpty(str) && (a = m9946a(str2, i)) != null && a.exists() && a.isFile() && a.length() > 0) {
            return a.getAbsolutePath();
        }
        return null;
    }

    /* renamed from: c */
    public C3498n mo19213c(String str) {
        C3498n a;
        long b = this.f8007c.mo19231b(str);
        boolean c = this.f8007c.mo19233c(str);
        if (!(System.currentTimeMillis() - b < 10500000) || c) {
            return null;
        }
        try {
            String a2 = this.f8007c.mo19228a(str);
            if (TextUtils.isEmpty(a2) || (a = C3423b.m10208a(new JSONObject(a2))) == null) {
                return null;
            }
            if (C3501p.m10769i(a)) {
                return a;
            }
            C2521b J = a.mo19607J();
            if (J == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 || !TextUtils.isEmpty(mo19204a(J.mo16360i(), J.mo16364l(), a.mo19650aD()))) {
                return a;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m9948a(boolean z, C3498n nVar, long j, String str) {
        long j2;
        Long remove = this.f8008d.remove(nVar);
        if (remove == null) {
            j2 = 0;
        } else {
            j2 = SystemClock.elapsedRealtime() - remove.longValue();
        }
        C3156e.m9172a(this.f8006b, nVar, "rewarded_video", z ? "load_video_success" : "load_video_error", C4014u.m13187a(z, nVar, j2, j, (z || str == null) ? null : str));
    }

    /* renamed from: a */
    public void mo19208a(final C3498n nVar, final C3355a<Object> aVar) {
        this.f8008d.put(nVar, Long.valueOf(SystemClock.elapsedRealtime()));
        if (nVar == null || nVar.mo19607J() == null || TextUtils.isEmpty(nVar.mo19607J().mo16360i())) {
            if (aVar != null) {
                aVar.mo19216a(false, null);
            }
            m9948a(false, nVar, -1, (String) null);
            return;
        }
        String i = nVar.mo19607J().mo16360i();
        File a = m9946a(nVar.mo19607J().mo16364l(), nVar.mo19650aD());
        C2914a d = C3854d.m12660a().mo20705b().mo17763d();
        d.mo17789a(i);
        d.mo17784a(a.getParent(), a.getName());
        d.mo17783a((C2912a) new C2912a() {
            /* renamed from: a */
            public void mo17771a(C2918c cVar, C2913b bVar) {
                if (!bVar.mo17779f() || bVar.mo17778e() == null || !bVar.mo17778e().exists()) {
                    C3355a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo19216a(false, null);
                    }
                    C2975l.m8387c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                    C3351g.this.m9948a(false, nVar, (long) bVar.mo17773a(), bVar.mo17775b());
                    return;
                }
                C3355a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.mo19216a(true, null);
                }
                C2975l.m8387c("RewardVideoCache", "onFailure: RewardVideo preload success ");
                C3351g.this.m9948a(true, nVar, (long) bVar.mo17773a(), bVar.mo17775b());
            }

            /* renamed from: a */
            public void mo17772a(C2918c cVar, IOException iOException) {
                C3355a aVar = aVar;
                if (aVar != null) {
                    aVar.mo19216a(false, null);
                }
                C2975l.m8387c("RewardVideoCache", "onFailure: RewardVideo preload fail ");
                C3351g.this.m9948a(false, nVar, -2, iOException.getMessage());
            }
        });
    }

    /* renamed from: a */
    private File m9946a(String str, int i) {
        return new File(CacheDirFactory.getICacheDir(i).mo16072b(), str);
    }
}
