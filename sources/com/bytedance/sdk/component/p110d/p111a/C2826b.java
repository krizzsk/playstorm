package com.bytedance.sdk.component.p110d.p111a;

import com.bytedance.sdk.component.p110d.C2896h;
import com.bytedance.sdk.component.p110d.C2899k;
import com.bytedance.sdk.component.p110d.p113c.p118c.C2869c;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.sdk.component.d.a.b */
/* compiled from: KeyGeneratorFactory */
public class C2826b {
    /* renamed from: a */
    public static C2899k m7784a() {
        return new C2899k() {

            /* renamed from: a */
            private WeakHashMap<String, String> f6365a = new WeakHashMap<>();

            /* renamed from: b */
            public String mo17604b(C2896h hVar) {
                return m7785a(hVar.mo17681a());
            }

            /* renamed from: a */
            public String mo17603a(C2896h hVar) {
                return m7785a(hVar.mo17681a() + "#width=" + hVar.mo17688b() + "#height=" + hVar.mo17690c() + "#scaletype=" + hVar.mo17691d());
            }

            /* renamed from: a */
            private String m7785a(String str) {
                String str2 = this.f6365a.get(str);
                if (str2 != null) {
                    return str2;
                }
                String a = C2869c.m8000a(str);
                this.f6365a.put(str, a);
                return a;
            }
        };
    }
}
