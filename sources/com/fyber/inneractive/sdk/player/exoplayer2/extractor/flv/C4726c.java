package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import java.util.HashMap;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.c */
public final class C4726c extends C4727d {

    /* renamed from: b */
    public long f11930b = -9223372036854775807L;

    public C4726c(C4804n nVar) {
        super((C4804n) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m14535a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r4, int r5) {
        /*
            r0 = 8
            if (r5 == r0) goto L_0x009e
            r0 = 10
            r1 = 0
            if (r5 == r0) goto L_0x0084
            r0 = 11
            r2 = 2
            if (r5 == r0) goto L_0x006a
            if (r5 == 0) goto L_0x005d
            r0 = 1
            if (r5 == r0) goto L_0x0051
            if (r5 == r2) goto L_0x0040
            r0 = 3
            if (r5 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
        L_0x001f:
            int r0 = r4.mo25613q()
            int r1 = r4.f13445b
            r4.mo25602f(r0)
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r4.f13444a
            r2.<init>(r3, r1, r0)
            int r0 = r4.mo25608l()
            r1 = 9
            if (r0 != r1) goto L_0x0038
            return r5
        L_0x0038:
            java.lang.Object r0 = m14535a(r4, r0)
            r5.put(r2, r0)
            goto L_0x001f
        L_0x0040:
            int r5 = r4.mo25613q()
            int r0 = r4.f13445b
            r4.mo25602f(r5)
            java.lang.String r1 = new java.lang.String
            byte[] r4 = r4.f13444a
            r1.<init>(r4, r0, r5)
            return r1
        L_0x0051:
            int r4 = r4.mo25608l()
            if (r4 != r0) goto L_0x0058
            r1 = r0
        L_0x0058:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            return r4
        L_0x005d:
            long r4 = r4.mo25605i()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L_0x006a:
            java.util.Date r5 = new java.util.Date
            long r0 = r4.mo25605i()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            double r0 = r0.doubleValue()
            long r0 = (long) r0
            r5.<init>(r0)
            r4.mo25602f(r2)
            return r5
        L_0x0084:
            int r5 = r4.mo25611o()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
        L_0x008d:
            if (r1 >= r5) goto L_0x009d
            int r2 = r4.mo25608l()
            java.lang.Object r2 = m14535a(r4, r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x008d
        L_0x009d:
            return r0
        L_0x009e:
            java.util.HashMap r4 = m14536b(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4726c.m14535a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int):java.lang.Object");
    }

    /* renamed from: a */
    public boolean mo25168a(C5036k kVar) {
        return true;
    }

    /* renamed from: b */
    public void mo25169b(C5036k kVar, long j) throws C4873l {
        if (kVar.mo25608l() == 2) {
            int q = kVar.mo25613q();
            int i = kVar.f13445b;
            kVar.mo25602f(q);
            if ("onMetaData".equals(new String(kVar.f13444a, i, q)) && kVar.mo25608l() == 8) {
                HashMap<String, Object> b = m14536b(kVar);
                if (b.containsKey("duration")) {
                    double doubleValue = ((Double) b.get("duration")).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.f11930b = (long) (doubleValue * 1000000.0d);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        throw new C4873l();
    }

    /* renamed from: b */
    public static HashMap<String, Object> m14536b(C5036k kVar) {
        int o = kVar.mo25611o();
        HashMap<String, Object> hashMap = new HashMap<>(o);
        for (int i = 0; i < o; i++) {
            int q = kVar.mo25613q();
            int i2 = kVar.f13445b;
            kVar.mo25602f(q);
            hashMap.put(new String(kVar.f13444a, i2, q), m14535a(kVar, kVar.mo25608l()));
        }
        return hashMap;
    }
}
