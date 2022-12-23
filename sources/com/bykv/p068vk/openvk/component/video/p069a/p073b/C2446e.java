package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.content.Context;
import android.util.Log;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2411b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2413c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e */
/* compiled from: Proxy */
public class C2446e {

    /* renamed from: a */
    static volatile C2411b f5185a;

    /* renamed from: b */
    static volatile C2413c f5186b;

    /* renamed from: c */
    public static final boolean f5187c = C2975l.m8389c();

    /* renamed from: d */
    public static volatile boolean f5188d;

    /* renamed from: e */
    static volatile boolean f5189e = true;

    /* renamed from: f */
    static volatile boolean f5190f;

    /* renamed from: g */
    static volatile int f5191g = 0;

    /* renamed from: h */
    public static volatile int f5192h = 3;

    /* renamed from: i */
    public static volatile Integer f5193i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static volatile C2427c f5194j;

    /* renamed from: k */
    private static volatile Context f5195k;

    /* renamed from: a */
    public static Context m5929a() {
        return f5195k;
    }

    /* renamed from: a */
    public static void m5932a(boolean z) {
        f5189e = z;
    }

    /* renamed from: b */
    public static void m5934b(boolean z) {
        f5190f = z;
    }

    /* renamed from: a */
    public static void m5930a(int i) {
        f5191g = i;
    }

    /* renamed from: a */
    public static void m5931a(C2413c cVar, Context context) {
        if (cVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f5195k = context.getApplicationContext();
        if (f5186b == null) {
            C2411b bVar = f5185a;
            if (bVar == null || !bVar.f5101a.getAbsolutePath().equals(cVar.f5103a.getAbsolutePath())) {
                f5186b = cVar;
                f5194j = C2427c.m5902a(context);
                f5186b.mo16107a((C2413c.C2420a) new C2413c.C2420a() {
                    /* renamed from: a */
                    public void mo16115a(String str) {
                        if (C2446e.f5187c) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + str);
                        }
                    }

                    /* renamed from: a */
                    public void mo16116a(Set<String> set) {
                        C2446e.f5194j.mo16138a((Collection<String>) set, 0);
                        if (C2446e.f5187c) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set);
                        }
                    }
                });
                C2455f a = C2455f.m5963a();
                a.mo16179a(cVar);
                a.mo16180a(f5194j);
                C2436d c = C2436d.m5913c();
                c.mo16147a(cVar);
                c.mo16148a(f5194j);
                return;
            }
            throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
        }
    }

    /* renamed from: b */
    public static C2413c m5933b() {
        return f5186b;
    }

    /* renamed from: c */
    public static C2411b m5935c() {
        return f5185a;
    }
}
