package com.bytedance.sdk.openadsdk.core.video.p165d;

import android.os.Build;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2404a;
import com.bytedance.sdk.component.p104b.p105a.C2807f;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.p132b.p133a.C3133a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3136a;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3144i;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3145j;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3146k;
import com.bytedance.sdk.openadsdk.p130b.p132b.p134b.C3147l;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.d.a */
/* compiled from: VideoPreloadFactory */
public class C3687a {

    /* renamed from: a */
    public static final C2531a f9384a = new C2404a();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.bytedance.sdk.openadsdk.core.e.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11850a(com.bykv.p068vk.openvk.component.video.api.p085c.C2522c r13, com.bykv.p068vk.openvk.component.video.api.p087e.C2531a.C2532a r14) {
        /*
            int r0 = r13.mo16380b()
            if (r0 > 0) goto L_0x000c
            boolean r0 = r13.mo16396h()
            if (r0 == 0) goto L_0x0013
        L_0x000c:
            int r0 = r13.mo16400l()
            r1 = -2
            if (r0 != r1) goto L_0x0014
        L_0x0013:
            return
        L_0x0014:
            r0 = 6000(0x1770, float:8.408E-42)
            r13.mo16387d((int) r0)
            r13.mo16391e((int) r0)
            r13.mo16392f(r0)
            java.lang.String r0 = "material_meta"
            java.lang.Object r1 = r13.mo16390e((java.lang.String) r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r13.mo16390e((java.lang.String) r0)
            boolean r1 = r1 instanceof com.bytedance.sdk.openadsdk.core.p151e.C3498n
            if (r1 == 0) goto L_0x0033
            r1 = r3
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            java.lang.String r4 = "ad_slot"
            java.lang.Object r5 = r13.mo16390e((java.lang.String) r4)
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r13.mo16390e((java.lang.String) r4)
            boolean r5 = r5 instanceof com.bytedance.sdk.openadsdk.AdSlot
            if (r5 == 0) goto L_0x0045
            r2 = r3
        L_0x0045:
            r5 = 0
            if (r1 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            java.lang.Object r0 = r13.mo16390e((java.lang.String) r0)
            r5 = r0
            com.bytedance.sdk.openadsdk.core.e.n r5 = (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5
            java.lang.Object r0 = r13.mo16390e((java.lang.String) r4)
            com.bytedance.sdk.openadsdk.AdSlot r0 = (com.bytedance.sdk.openadsdk.AdSlot) r0
            m11856b(r13, r5, r0)
            goto L_0x005c
        L_0x005b:
            r0 = r5
        L_0x005c:
            long r1 = android.os.SystemClock.elapsedRealtime()
            com.bytedance.sdk.openadsdk.core.video.d.a$1 r4 = new com.bytedance.sdk.openadsdk.core.video.d.a$1
            r6 = r4
            r7 = r14
            r8 = r5
            r9 = r0
            r10 = r1
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r12)
            java.lang.String r6 = r13.mo16398j()
            boolean r6 = m11855a((java.lang.String) r6)
            if (r6 != 0) goto L_0x00a1
            if (r14 == 0) goto L_0x0091
            r3 = 404(0x194, float:5.66E-43)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "unexpected url: "
            r4.append(r6)
            java.lang.String r6 = r13.mo16398j()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r14.mo16475a(r13, r3, r4)
        L_0x0091:
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r9 = r3 - r1
            r11 = -1
            java.lang.String r12 = "video url is invalid"
            r6 = r13
            r7 = r5
            r8 = r0
            m11858b(r6, r7, r8, r9, r11, r12)
            return
        L_0x00a1:
            int r14 = r13.mo16400l()
            if (r14 != r3) goto L_0x00a8
            goto L_0x00bf
        L_0x00a8:
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r14 < r0) goto L_0x00b8
            com.bykv.vk.openvk.component.video.api.e.a r14 = f9384a     // Catch:{ Exception -> 0x00bf }
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()     // Catch:{ Exception -> 0x00bf }
            r14.mo16082a(r0, r13, r4)     // Catch:{ Exception -> 0x00bf }
            goto L_0x00bf
        L_0x00b8:
            com.bykv.vk.openvk.component.video.a.b.f.a r14 = com.bykv.p068vk.openvk.component.video.p069a.p073b.p079f.C2460a.m5990a()
            r14.mo16191a(r13)
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.video.p165d.C3687a.m11850a(com.bykv.vk.openvk.component.video.api.c.c, com.bykv.vk.openvk.component.video.api.e.a$a):void");
    }

    /* renamed from: a */
    private static boolean m11854a(C2522c cVar) {
        return Build.VERSION.SDK_INT >= 23 || cVar.mo16400l() != 0;
    }

    /* renamed from: b */
    private static void m11856b(C2522c cVar, C3498n nVar, AdSlot adSlot) {
        if (m11854a(cVar)) {
            C3133a.m9044a((C3136a<C3146k>) new C3136a(nVar, C4014u.m13198b(adSlot.getDurationSlotType()), C3133a.m9040a(nVar, (String) null, -1, cVar.mo16400l()), new C3146k(cVar.mo16398j(), cVar.mo16396h() ? cVar.mo16394g() : (long) cVar.mo16380b())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11858b(C2522c cVar, C3498n nVar, AdSlot adSlot, long j, int i, String str) {
        if (m11854a(cVar)) {
            String b = C4014u.m13198b(adSlot.getDurationSlotType());
            JSONObject a = C3133a.m9040a(nVar, (String) null, -1, cVar.mo16400l());
            C3145j jVar = new C3145j();
            jVar.mo18699a(cVar.mo16398j());
            jVar.mo18698a((long) cVar.mo16380b());
            jVar.mo18700b(j);
            jVar.mo18697a(i);
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            jVar.mo18701b(str);
            jVar.mo18702c("");
            C3133a.m9057c((C3136a<C3145j>) new C3136a(nVar, b, a, jVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m11857b(C2522c cVar, C3498n nVar, AdSlot adSlot, long j) {
        if (m11854a(cVar)) {
            String b = C4014u.m13198b(adSlot.getDurationSlotType());
            JSONObject a = C3133a.m9040a(nVar, (String) null, -1, cVar.mo16400l());
            C3147l lVar = new C3147l();
            lVar.mo18704a(cVar.mo16398j());
            lVar.mo18703a((long) cVar.mo16380b());
            lVar.mo18705b(j);
            if (cVar.mo16404p() == 1) {
                lVar.mo18706c(1);
            } else {
                lVar.mo18706c(0);
            }
            C3133a.m9054b((C3136a<C3147l>) new C3136a(nVar, b, a, lVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m11859c(C2522c cVar, C3498n nVar, AdSlot adSlot) {
        if (m11854a(cVar)) {
            C3133a.m9060d((C3136a<C3144i>) new C3136a(nVar, C4014u.m13198b(adSlot.getDurationSlotType()), C3133a.m9040a(nVar, (String) null, -1, cVar.mo16400l()), new C3144i(cVar.mo16398j(), (long) cVar.mo16380b())));
        }
    }

    /* renamed from: a */
    public static boolean m11855a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.regionMatches(true, 0, "ws:", 0, 3)) {
            str = "http:" + str.substring(3);
        } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
            str = "https:" + str.substring(4);
        }
        if (C2807f.m7700c(str) == null) {
            return false;
        }
        return true;
    }
}
