package com.bytedance.sdk.openadsdk.p130b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p104b.p105a.C2807f;
import com.bytedance.sdk.component.p110d.p113c.p117b.C2859a;
import com.bytedance.sdk.component.p110d.p119d.C2885g;
import com.bytedance.sdk.component.p120e.p123c.C2927d;
import com.bytedance.sdk.component.p120e.p123c.C2931g;
import com.bytedance.sdk.component.p120e.p124d.C2933b;
import com.bytedance.sdk.component.p120e.p124d.C2938c;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C3423b;
import com.bytedance.sdk.openadsdk.core.C3538j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3639p;
import com.bytedance.sdk.openadsdk.core.p150d.C3466c;
import com.bytedance.sdk.openadsdk.core.p151e.C3476g;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.dislike.C3777a;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.p131a.C3129a;
import com.bytedance.sdk.openadsdk.p179k.C3909e;
import com.bytedance.sdk.openadsdk.utils.C3985e;
import com.bytedance.sdk.openadsdk.utils.C4009p;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.e */
/* compiled from: AdEventManager */
public class C3156e {
    /* renamed from: a */
    public static void m9165a(Context context, C3498n nVar) {
        m9166a(context, nVar, C2927d.d1655274989178dc("l`lgmkawino"));
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        while (true) {
                            switch (c2) {
                                case '[':
                                case '\\':
                                case ']':
                                    break;
                                default:
                                    c2 = '[';
                            }
                        }
                    case '^':
                        if (c2 <= 4) {
                            continue;
                        } else {
                            return;
                        }
                }
                c = '^';
                c2 = 'K';
            }
        }
    }

    /* renamed from: a */
    public static void m9166a(Context context, C3498n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(C2927d.d1655274989178dc("rdlgawYsqyo"), C2927d.d1655274989178dc("h4"));
            jSONObject2.putOpt(C2927d.d1655274989178dc("rdlgawYsqyoT>"), 0);
            jSONObject.putOpt(C2927d.d1655274989178dc("ae]f|qtfWmkm"), jSONObject2);
        } catch (Exception unused) {
        }
        m9199c(context, nVar, str, C2927d.d1655274989178dc("oqgm[ptkWa?"), jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0004, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        switch(r2) {
            case 52: goto L_0x0004;
            case 53: goto L_0x000e;
            case 54: goto L_0x0072;
            default: goto L_0x000d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        switch(r1) {
            case 29: goto L_0x0018;
            case 30: goto L_0x0004;
            case 31: goto L_0x000a;
            default: goto L_0x0011;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r1 = 30;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9167a(android.content.Context r5, com.bytedance.sdk.openadsdk.core.p151e.C3498n r6, java.lang.String r7, long r8) {
        /*
            r0 = 0
            r1 = 55
            r2 = r0
        L_0x0004:
            r3 = 72
        L_0x0006:
            switch(r3) {
                case 72: goto L_0x0072;
                case 73: goto L_0x0014;
                case 74: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0004
        L_0x000a:
            switch(r2) {
                case 52: goto L_0x0004;
                case 53: goto L_0x000e;
                case 54: goto L_0x0072;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0004
        L_0x000e:
            switch(r1) {
                case 29: goto L_0x0018;
                case 30: goto L_0x0004;
                case 31: goto L_0x000a;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = 30
            goto L_0x000e
        L_0x0014:
            r3 = 57
            if (r2 > r3) goto L_0x0004
        L_0x0018:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0068 }
            r2.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "rdlgawYsqyo"
            java.lang.String r3 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r4 = "h4"
            java.lang.String r4 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r4)     // Catch:{ Exception -> 0x0068 }
            r2.putOpt(r3, r4)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r3 = "rdlgawYsqyoT>"
            java.lang.String r3 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0068 }
            r2.putOpt(r3, r0)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r0 = "iovfvdesafdTahzgu"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r0)     // Catch:{ Exception -> 0x0068 }
            int r3 = r6.mo19708g()     // Catch:{ Exception -> 0x0068 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x0068 }
            r2.putOpt(r0, r3)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r0 = "ae]f|qtfWmkm"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r0)     // Catch:{ Exception -> 0x0068 }
            r1.putOpt(r0, r2)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r0 = "dtpbplii"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r0)     // Catch:{ Exception -> 0x0068 }
            r2 = 600000(0x927c0, double:2.964394E-318)
            long r8 = java.lang.Math.min(r8, r2)     // Catch:{ Exception -> 0x0068 }
            r1.put(r0, r8)     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            java.lang.String r8 = "lncg"
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p123c.C2927d.d1655274989178dc(r8)
            m9199c((android.content.Context) r5, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r6, (java.lang.String) r7, (java.lang.String) r8, (org.json.JSONObject) r1)
            return
        L_0x0072:
            r3 = 73
            r2 = 16
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3156e.m9167a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        switch(r1) {
            case 52: goto L_0x0003;
            case 53: goto L_0x000d;
            case 54: goto L_0x0062;
            default: goto L_0x000c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        switch(r0) {
            case 29: goto L_0x0015;
            case 30: goto L_0x0003;
            case 31: goto L_0x0009;
            default: goto L_0x0010;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = 30;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9168a(android.content.Context r3, com.bytedance.sdk.openadsdk.core.p151e.C3498n r4, java.lang.String r5, long r6, boolean r8) {
        /*
            r0 = 55
            r1 = 0
        L_0x0003:
            r2 = 72
        L_0x0005:
            switch(r2) {
                case 72: goto L_0x0062;
                case 73: goto L_0x0013;
                case 74: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0003
        L_0x0009:
            switch(r1) {
                case 52: goto L_0x0003;
                case 53: goto L_0x000d;
                case 54: goto L_0x0062;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0015
        L_0x000d:
            switch(r0) {
                case 29: goto L_0x0015;
                case 30: goto L_0x0003;
                case 31: goto L_0x0009;
                default: goto L_0x0010;
            }
        L_0x0010:
            r0 = 30
            goto L_0x000d
        L_0x0013:
            r0 = 57
        L_0x0015:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "ig]otZjhimcekR}zsrw`g"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r2)     // Catch:{ all -> 0x0044 }
            if (r8 == 0) goto L_0x0029
            r8 = 1
            goto L_0x002a
        L_0x0029:
            r8 = 2
        L_0x002a:
            r0.put(r2, r8)     // Catch:{ all -> 0x0044 }
            java.lang.String r8 = "ae]f|qtfWmkm"
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r8)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0044 }
            r1.put(r8, r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r8 = "dtpbplii"
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r8)     // Catch:{ all -> 0x0044 }
            r1.put(r8, r6)     // Catch:{ all -> 0x0044 }
            goto L_0x004c
        L_0x0044:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            com.bytedance.sdk.component.utils.C2975l.m8383b(r6)
        L_0x004c:
            java.lang.String r6 = "lq]okdbnfn"
            java.lang.String r6 = com.bytedance.sdk.component.p120e.p124d.C2933b.b1655274989200dc(r6)
            java.lang.String r4 = r4.mo19622Y()
            com.bytedance.sdk.openadsdk.b.a r3 = com.bytedance.sdk.openadsdk.p130b.C3126a.m9004a(r3, r5, r6, r4, r1)
            com.bytedance.sdk.openadsdk.b.c r4 = com.bytedance.sdk.openadsdk.core.C3578m.m11236c()
            r4.mo18743a(r3)
            return
        L_0x0062:
            r2 = 73
            r1 = 16
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3156e.m9168a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, long, boolean):void");
    }

    /* renamed from: a */
    public static void m9169a(Context context, C3498n nVar, String str, String str2) {
        m9197c(context, nVar, str, str2);
    }

    /* renamed from: a */
    public static void m9170a(Context context, C3498n nVar, String str, String str2, long j, int i, Map<String, Object> map, C3167j jVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(C2859a.a1655274989226dc("dtpbplii"), j);
            jSONObject.put(C2859a.a1655274989226dc("pdp`akr"), i);
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            if ((C2859a.a1655274989226dc("fdgg[gtbib").equals(str2) || C2859a.a1655274989226dc("fdgg[jpbz").equals(str2)) && jVar != null) {
                jVar.mo18768a(jSONObject2);
            }
            jSONObject.put(C2859a.a1655274989226dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m9203e(context, nVar, str, str2, jSONObject);
    }

    /* renamed from: a */
    public static void m9171a(Context context, C3498n nVar, String str, String str2, long j, JSONObject jSONObject) {
        while (true) {
            char c = 15;
            while (true) {
                switch (c) {
                    case 13:
                    case 14:
                        if (context != null && nVar != null && jSONObject != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put(C2938c.c1655274989199dc("dtpbplii"), j);
                                jSONObject2.put(C2938c.c1655274989199dc("ae]f|qtfWmkm"), jSONObject.toString());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            m9203e(context, nVar, str, str2, jSONObject2);
                            return;
                        }
                        return;
                    default:
                        c = 14;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m9172a(Context context, C3498n nVar, String str, String str2, Map<String, Object> map) {
        char c = '(';
        while (true) {
            switch (c) {
                case ')':
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    if (map != null) {
                        try {
                            for (Map.Entry next : map.entrySet()) {
                                jSONObject.put((String) next.getKey(), next.getValue());
                            }
                        } catch (Throwable th) {
                            C2975l.m8383b(th.toString());
                        }
                    }
                    jSONObject2.put(C2933b.b1655274989200dc("ae]f|qtfWmkm"), jSONObject.toString());
                    m9203e(context, nVar, str, str2, jSONObject2);
                    return;
                default:
                    c = ')';
            }
        }
    }

    /* renamed from: a */
    public static void m9173a(Context context, C3498n nVar, String str, String str2, JSONObject jSONObject) {
        while (true) {
            char c = '^';
            char c2 = '}';
            while (true) {
                switch (c) {
                    case '^':
                        break;
                    case '_':
                        switch (c2) {
                            case '^':
                            case '`':
                                break;
                            case '_':
                                break;
                        }
                    case '`':
                        break;
                }
                switch (c2) {
                    case '7':
                    case '9':
                        break;
                    case '8':
                        break;
                }
                c = '_';
                c2 = '_';
            }
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C2927d.d1655274989178dc("ae]f|qtfWmkm"), jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            m9203e(context, nVar, str, str2, jSONObject2);
        } else {
            m9197c(context, nVar, str, str2);
        }
        if (C2927d.d1655274989178dc("cmk`o").equals(str2)) {
            C3639p.m11566c(nVar);
        }
    }

    /* renamed from: a */
    public static void m9174a(Context context, C3498n nVar, String str, String str2, JSONObject jSONObject, long j) {
        if (context != null && nVar != null && jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(C2938c.c1655274989199dc("ae]f|qtfWmkm"), jSONObject.toString());
                jSONObject2.put(C2885g.g1655274989219dc("dtpbplii"), j);
            } catch (Exception e) {
                e.printStackTrace();
            }
            m9203e(context, nVar, str, str2, jSONObject2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:4|5|(3:7|(2:10|8)|51)|11|(1:13)(1:14)|15|16|(4:18|19|20|(2:22|23))|27|(3:29|30|(2:34|(1:36)(2:37|(1:39))))|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0139 */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9175a(android.content.Context r4, com.bytedance.sdk.openadsdk.core.p151e.C3498n r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.Object> r7, java.lang.Double r8) {
        /*
            com.bytedance.sdk.openadsdk.core.C3639p.m11564b((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5)
            if (r4 != 0) goto L_0x0008
            com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
        L_0x0008:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x013c }
            r0.<init>()     // Catch:{ JSONException -> 0x013c }
            if (r7 == 0) goto L_0x0036
            java.util.Set r7 = r7.entrySet()     // Catch:{ JSONException -> 0x013c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x013c }
        L_0x001c:
            boolean r1 = r7.hasNext()     // Catch:{ JSONException -> 0x013c }
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r7.next()     // Catch:{ JSONException -> 0x013c }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ JSONException -> 0x013c }
            java.lang.Object r2 = r1.getKey()     // Catch:{ JSONException -> 0x013c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ JSONException -> 0x013c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ JSONException -> 0x013c }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x013c }
            goto L_0x001c
        L_0x0036:
            java.lang.String r7 = "iovfvdesafdTahzgu"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ JSONException -> 0x013c }
            int r1 = r5.mo19708g()     // Catch:{ JSONException -> 0x013c }
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r7 = "rdco[lhsm{khxdaaO|wg|zr"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ JSONException -> 0x013c }
            int r1 = r5.mo19705f()     // Catch:{ JSONException -> 0x013c }
            r0.put(r7, r1)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r7 = "ae]f|qtfWmkm"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x013c }
            r4.put(r7, r0)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r7 = "lne\\a}rui"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r0 = r5.mo19659ac()     // Catch:{ JSONException -> 0x013c }
            r4.putOpt(r7, r0)     // Catch:{ JSONException -> 0x013c }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x013c }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            double r0 = (double) r0     // Catch:{ JSONException -> 0x013c }
            double r2 = com.bytedance.sdk.openadsdk.utils.C4014u.m13228g((com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5)     // Catch:{ JSONException -> 0x013c }
            double r0 = r0 - r2
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ JSONException -> 0x013c }
            float r7 = r7.floatValue()     // Catch:{ JSONException -> 0x013c }
            java.lang.String r0 = "simt[qojm"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r0)     // Catch:{ JSONException -> 0x013c }
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x008b
            goto L_0x008c
        L_0x008b:
            r7 = r1
        L_0x008c:
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ JSONException -> 0x013c }
            r4.putOpt(r0, r7)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r7 = "u`]skiodq"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)     // Catch:{ JSONException -> 0x013c }
            int r0 = r5.mo19603F()     // Catch:{ JSONException -> 0x013c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x013c }
            r4.putOpt(r7, r0)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r7 = r5.mo19744s()     // Catch:{ JSONException -> 0x013c }
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ JSONException -> 0x013c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x013c }
            java.lang.String r1 = "tufptZvuajo"
            if (r0 != 0) goto L_0x00dc
            r0 = r7
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ JSONException -> 0x013c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x013c }
            if (r0 != 0) goto L_0x00dc
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ all -> 0x00d0 }
            r0 = 1203982336(0x47c35000, float:100000.0)
            float r7 = r7 * r0
            int r7 = java.lang.Math.round(r7)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r1)     // Catch:{ all -> 0x00d0 }
            r4.put(r0, r7)     // Catch:{ all -> 0x00d0 }
            goto L_0x00dc
        L_0x00d0:
            r7 = move-exception
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r1)     // Catch:{ JSONException -> 0x013c }
            r2 = 0
            r4.put(r0, r2)     // Catch:{ JSONException -> 0x013c }
            r7.printStackTrace()     // Catch:{ JSONException -> 0x013c }
        L_0x00dc:
            java.util.Map r7 = r5.mo19666aj()     // Catch:{ JSONException -> 0x013c }
            if (r7 == 0) goto L_0x0139
            java.util.Map r7 = r5.mo19666aj()     // Catch:{ all -> 0x0139 }
            java.lang.String r0 = "sei\\flbcagmTxt~j"
            java.lang.String r0 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r0)     // Catch:{ all -> 0x0139 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0139 }
            if (r7 == 0) goto L_0x0139
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0139 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ all -> 0x0139 }
            r0 = 2
            if (r7 != r0) goto L_0x0139
            r2 = 4681608360884174848(0x40f86a0000000000, double:100000.0)
            if (r8 == 0) goto L_0x0115
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r1)     // Catch:{ all -> 0x0139 }
            double r0 = r8.doubleValue()     // Catch:{ all -> 0x0139 }
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0139 }
            r4.put(r7, r0)     // Catch:{ all -> 0x0139 }
            goto L_0x0139
        L_0x0115:
            java.util.Map r7 = r5.mo19666aj()     // Catch:{ all -> 0x0139 }
            java.lang.String r8 = "psk`a"
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r8)     // Catch:{ all -> 0x0139 }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0139 }
            if (r7 == 0) goto L_0x0139
            java.lang.String r8 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r1)     // Catch:{ all -> 0x0139 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0139 }
            double r0 = java.lang.Double.parseDouble(r7)     // Catch:{ all -> 0x0139 }
            double r0 = r0 * r2
            long r0 = java.lang.Math.round(r0)     // Catch:{ all -> 0x0139 }
            r4.put(r8, r0)     // Catch:{ all -> 0x0139 }
        L_0x0139:
            com.bytedance.sdk.openadsdk.p130b.C3175o.m9300a(r5, r6)     // Catch:{ JSONException -> 0x013c }
        L_0x013c:
            com.bytedance.sdk.openadsdk.b.a$a r7 = new com.bytedance.sdk.openadsdk.b.a$a
            r7.<init>()
            com.bytedance.sdk.openadsdk.b.a$a r6 = r7.mo18662b((java.lang.String) r6)
            java.lang.String r7 = "simt"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)
            com.bytedance.sdk.openadsdk.b.a$a r6 = r6.mo18663c((java.lang.String) r7)
            java.lang.String r7 = r5.mo19622Y()
            com.bytedance.sdk.openadsdk.b.a$a r6 = r6.mo18666f((java.lang.String) r7)
            java.lang.String r7 = r5.mo19623Z()
            com.bytedance.sdk.openadsdk.b.a$a r6 = r6.mo18659a((java.lang.String) r7)
            com.bytedance.sdk.openadsdk.b.a$a r4 = r6.mo18660a((org.json.JSONObject) r4)
            r6 = 0
            r4.mo18661a((com.bytedance.sdk.openadsdk.p130b.p131a.C3129a) r6)
            android.content.Context r4 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            java.lang.String r4 = com.bytedance.sdk.openadsdk.core.C3538j.m11045a(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0187
            java.util.List r4 = r5.mo19615R()
            com.bytedance.sdk.openadsdk.k.a r6 = com.bytedance.sdk.openadsdk.core.C3578m.m11240g()
            r7 = 1
            java.util.List r4 = com.bytedance.sdk.openadsdk.p179k.C3909e.m12826a(r4, r7)
            r6.mo20785a(r4)
        L_0x0187:
            boolean r4 = com.bytedance.sdk.component.utils.C2975l.m8389c()
            if (r4 == 0) goto L_0x01af
            java.lang.String r4 = "AeGuakr"
            java.lang.String r4 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "simt$"
            java.lang.String r7 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r7)
            r6.append(r7)
            java.lang.String r5 = r5.mo19622Y()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.bytedance.sdk.component.utils.C2975l.m8387c(r4, r5)
        L_0x01af:
            com.bytedance.sdk.openadsdk.core.C3644s.m11589b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3156e.m9175a(android.content.Context, com.bytedance.sdk.openadsdk.core.e.n, java.lang.String, java.util.Map, java.lang.Double):void");
    }

    /* renamed from: a */
    public static void m9176a(Context context, String str, long j) {
        C3466c.m10392a(context, str, j);
    }

    @JProtect
    /* renamed from: a */
    public static void m9177a(Context context, String str, C3498n nVar, C3476g gVar, String str2, boolean z, Map<String, Object> map, int i) {
        char c = 18;
        while (true) {
            char c2 = '.';
            while (true) {
                switch (c2) {
                    case '-':
                        if (c <= '?') {
                            break;
                        } else {
                            break;
                        }
                    case '.':
                        break;
                    case '/':
                        if (c != 4) {
                            if (c == 5) {
                                break;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                }
                c2 = '-';
                c = 6;
            }
        }
        if (context == null) {
            C3578m.m11231a();
        }
        JSONObject jSONObject = new JSONObject();
        if (gVar != null) {
            try {
                JSONObject a = gVar.mo19511a();
                a.put(C2931g.g1655274989199dc("ir]ueioc"), z);
                if (i >= 1 && i <= 2) {
                    a.put(C2938c.c1655274989199dc("urgq[gcoicd~Rzv`t"), i);
                }
                if (map != null) {
                    for (Map.Entry next : map.entrySet()) {
                        a.put((String) next.getKey(), next.getValue());
                    }
                }
                a.put(C2931g.g1655274989199dc("iovfvdesafdTahzgu"), nVar.mo19708g());
                jSONObject.put(C2931g.g1655274989199dc("ae]f|qtfWmkm"), a.toString());
            } catch (JSONException unused) {
            }
        }
        jSONObject.putOpt(C2931g.g1655274989199dc("lne\\a}rui"), nVar.mo19659ac());
        float floatValue = Double.valueOf(((double) (System.currentTimeMillis() / 1000)) - C4014u.m13228g(nVar)).floatValue();
        String g1655274989199dc = C2931g.g1655274989199dc("simt[qojm");
        if (floatValue <= 0.0f) {
            floatValue = 0.0f;
        }
        jSONObject.putOpt(g1655274989199dc, Float.valueOf(floatValue));
        jSONObject.putOpt(C2931g.g1655274989199dc("u`]skiodq"), Integer.valueOf(nVar.mo19603F()));
        new C3126a.C3127a().mo18662b(str2).mo18663c(str).mo18666f(nVar.mo19622Y()).mo18659a(nVar.mo19623Z()).mo18660a(jSONObject).mo18661a((C3129a) null);
        if (!TextUtils.isEmpty(C3538j.m11045a(C3578m.m11231a())) && C2931g.g1655274989199dc("cmk`o").equals(str)) {
            C3578m.m11240g().mo20785a(C3909e.m12826a(nVar.mo19616S(), true));
        }
        if (C2975l.m8389c()) {
            C2975l.m8387c(C2931g.g1655274989199dc("AeGuakr"), str + C2931g.g1655274989199dc(" ") + nVar.mo19622Y());
        }
        if (C2931g.g1655274989199dc("cmk`o").equals(str)) {
            C3639p.m11566c(nVar);
        }
    }

    /* renamed from: a */
    public static void m9178a(AdSlot adSlot) {
        String codeId;
        if (adSlot == null) {
            codeId = "";
        } else if (TextUtils.isEmpty(adSlot.getBidAdm())) {
            codeId = adSlot.getCodeId();
        } else {
            return;
        }
        m9188a(codeId);
    }

    /* renamed from: a */
    public static void m9179a(C3498n nVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0041;
            case 56: goto L_0x000f;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9180a(com.bytedance.sdk.openadsdk.core.p151e.C3498n r5, java.lang.String r6) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0046
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0041;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0041;
                case 56: goto L_0x000f;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0041
        L_0x000f:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "rdtfmfcX|z"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r2)     // Catch:{ Exception -> 0x0033 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0033 }
            r1.put(r2, r3)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r2 = "ae]f|qtfWmkm"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r2)     // Catch:{ Exception -> 0x0033 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0033 }
            r0.put(r2, r1)     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3578m.m11231a()
            java.lang.String r2 = "bhfgmkaXzline{k"
            java.lang.String r2 = com.bytedance.sdk.component.p120e.p123c.C2928e.e1655274989197dc(r2)
            m9203e((android.content.Context) r1, (com.bytedance.sdk.openadsdk.core.p151e.C3498n) r5, (java.lang.String) r6, (java.lang.String) r2, (org.json.JSONObject) r0)
            return
        L_0x0041:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x0046:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3156e.m9180a(com.bytedance.sdk.openadsdk.core.e.n, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m9181a(C3498n nVar, String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2938c.c1655274989199dc("dtpbplii"), j);
        } catch (Exception unused) {
        }
        m9203e(C3578m.m11231a(), nVar, str, C2938c.c1655274989199dc("bhfgmkaXdfko"), jSONObject);
    }

    /* renamed from: a */
    public static void m9182a(C3498n nVar, String str, long j, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (j != -1) {
            try {
                jSONObject.put(C2933b.b1655274989200dc("dtpbplii"), j);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                jSONObject2.put((String) next.getKey(), next.getValue());
            }
        }
        jSONObject.put(C2933b.b1655274989200dc("ae]f|qtfWmkm"), jSONObject2.toString());
        m9185a(nVar, C2933b.b1655274989200dc("oqgm[db"), str, jSONObject, (C3167j) null, (C3129a) null);
    }

    /* renamed from: a */
    public static void m9183a(C3498n nVar, String str, String str2) {
        while (true) {
            char c = 15;
            while (true) {
                switch (c) {
                    case 13:
                    case 14:
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.putOpt(C2938c.c1655274989199dc("esplvZkto"), str2);
                            jSONObject.putOpt(C2938c.c1655274989199dc("ae]f|qtfWmkm"), jSONObject2);
                        } catch (JSONException unused) {
                        }
                        m9203e(C3578m.m11231a(), nVar, str, C2938c.c1655274989199dc("simt[`tug{"), jSONObject);
                        return;
                    default:
                        c = 14;
                }
            }
        }
    }

    @JProtect
    /* renamed from: a */
    public static void m9184a(C3498n nVar, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (jSONObject != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                String optString = jSONObject.optString(C2927d.d1655274989178dc("ae]f|qtfWmkm"), (String) null);
                if (optString != null) {
                    jSONObject2 = new JSONObject(optString);
                }
                if (!C2927d.d1655274989178dc("cmk`o").equals(str3)) {
                    jSONObject2.put(C2927d.d1655274989178dc("ddtjg`"), C3985e.m13067e(C3578m.m11231a()).toString());
                }
                jSONObject.put(C2927d.d1655274989178dc("ae]f|qtfWmkm"), jSONObject2.toString());
                jSONObject.put(C2927d.d1655274989178dc("t`e"), str2);
                if (C2927d.d1655274989178dc("cmk`o").equals(str3)) {
                    C3639p.m11566c(nVar);
                    float floatValue = Double.valueOf(((double) (System.currentTimeMillis() / 1000)) - C4014u.m13217e(jSONObject.optString(C2927d.d1655274989178dc("lne\\a}rui")))).floatValue();
                    String d1655274989178dc = C2927d.d1655274989178dc("simt[qojm");
                    if (floatValue <= 0.0f) {
                        floatValue = 0.0f;
                    }
                    jSONObject.putOpt(d1655274989178dc, Float.valueOf(floatValue));
                    if (!TextUtils.isEmpty(C3538j.m11045a(C3578m.m11231a())) && nVar != null) {
                        C3578m.m11240g().mo20785a(C3909e.m12826a(nVar.mo19616S(), true));
                    }
                }
            } catch (JSONException unused) {
            }
        }
        new C3126a.C3127a().mo18664d(str).mo18662b(str2).mo18663c(str3).mo18666f(String.valueOf(j)).mo18667g(String.valueOf(j2)).mo18659a(nVar.mo19623Z()).mo18660a(jSONObject).mo18661a((C3129a) null);
        if (C2975l.m8389c()) {
            C2975l.m8387c(C2927d.d1655274989178dc("AeGuakr"), C2927d.d1655274989178dc("sdlgNvGcMoex"));
        }
    }

    /* renamed from: a */
    public static void m9185a(C3498n nVar, String str, String str2, JSONObject jSONObject, C3167j jVar, C3129a aVar) {
        if (nVar != null) {
            new C3126a.C3127a().mo18666f(nVar.mo19622Y()).mo18665e(nVar.mo19659ac()).mo18659a(nVar.mo19623Z()).mo18662b(str).mo18663c(str2).mo18660a(jSONObject).mo18661a(aVar);
        }
    }

    @JProtect
    /* renamed from: a */
    public static void m9186a(C3498n nVar, String str, Map<String, Object> map) {
        char c = 'R';
        while (true) {
            switch (c) {
                case 'P':
                case 'Q':
                    Context a = C3578m.m11231a();
                    JSONObject jSONObject = new JSONObject();
                    if (map == null || map.size() <= 0) {
                        m9197c(a, nVar, str, C2927d.d1655274989178dc("lncg[dbXl|xjxdaa"));
                        return;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C2927d.d1655274989178dc("ddtjg`"), C3985e.m13067e(a).toString());
                        Object remove = map.remove(C2859a.a1655274989226dc("tnvbhZrnel"));
                        for (Map.Entry next : map.entrySet()) {
                            jSONObject2.put((String) next.getKey(), next.getValue());
                        }
                        if (remove instanceof Long) {
                            jSONObject.put(C2859a.a1655274989226dc("dtpbplii"), remove);
                        } else {
                            jSONObject.put(C2859a.a1655274989226dc("dtpbplii"), 0);
                        }
                        jSONObject.put(C2859a.a1655274989226dc("ae]f|qtfWmkm"), jSONObject2.toString());
                    } catch (Exception unused) {
                    }
                    m9203e(a, nVar, str, C2859a.a1655274989226dc("lncg[dbXl|xjxdaa"), jSONObject);
                    return;
                default:
                    c = 'P';
            }
        }
    }

    /* renamed from: a */
    public static void m9187a(C3498n nVar, List<FilterWord> list) {
        C3777a.m12419a().mo20582a(nVar, list);
        if (C2975l.m8389c()) {
            String d1655274989178dc = C2927d.d1655274989178dc("AeGuakr");
            C2975l.m8387c(d1655274989178dc, C2927d.d1655274989178dc("tu]gmvjnclUbob`/") + nVar.mo19622Y());
        }
    }

    /* renamed from: a */
    public static void m9188a(final String str) {
        C2968h.m8366a().post(new Runnable() {
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C2885g.g1655274989219dc("smmw"), str);
                    jSONObject.put(C2885g.g1655274989219dc("ae]f|qtfWmkm"), jSONObject2.toString());
                    long currentTimeMillis = System.currentTimeMillis() - C4009p.m13159c();
                    if (currentTimeMillis > 600000 || currentTimeMillis < 0) {
                        C4009p.m13160d();
                        return;
                    }
                    jSONObject.put(C2885g.g1655274989219dc("dtpbplii"), currentTimeMillis);
                    C3156e.m9185a(C3423b.m10208a(new JSONObject(C4009p.m13156a())), C4009p.m13158b(), C2885g.g1655274989219dc("ndzw[iiflVymy}"), jSONObject, (C3167j) null, (C3129a) null);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @JProtect
    /* renamed from: a */
    public static void m9189a(String str, C3498n nVar, String str2, C3167j jVar) {
        if (nVar != null && jVar != null && jVar.mo18771a()) {
            final String str3 = str;
            final C3167j jVar2 = jVar;
            final C3498n nVar2 = nVar;
            final String str4 = str2;
            C2952e.m8311b().execute(new C2955g(C2807f.f1655274989236dc("aeQkkrRnelXn|b|{")) {
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C2885g.g1655274989219dc("dtpbplii"), str3);
                        if (!(jVar2 == null || jVar2.mo18772b() == null)) {
                            jSONObject.put(C2807f.f1655274989236dc("ae]f|qtfWmkm"), jVar2.mo18772b().toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C3156e.m9203e(C3578m.m11231a(), nVar2, str4, C2807f.f1655274989236dc("ae]pljqX|`gn"), jSONObject);
                }
            });
        }
    }

    /* renamed from: b */
    public static void m9190b(Context context, C3498n nVar, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(C2931g.g1655274989199dc("ae]phjrX|pzn"), nVar.mo19754x().getNativeAdType());
            jSONObject.put(C2931g.g1655274989199dc("iovfvdesafdTahzgu"), nVar.mo19708g());
            jSONObject2.put(C2931g.g1655274989199dc("ae]f|qtfWmkm"), jSONObject.toString());
        } catch (Throwable th) {
            C2975l.m8383b(th.toString());
        }
        C3578m.m11236c().mo18743a(C3126a.m9004a(context, str, C2931g.g1655274989199dc("phawqwcXkechg"), nVar.mo19622Y(), jSONObject2));
    }

    @JProtect
    /* renamed from: b */
    public static void m9191b(Context context, C3498n nVar, String str, long j) {
        String str2;
        String str3;
        if (context != null && C3578m.m11241h().mo19919F()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C2938c.c1655274989199dc("dtpbplii"), System.currentTimeMillis() - j);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1695837674:
                    if (str.equals(C2938c.c1655274989199dc("b`lmawYfl"))) {
                        c = 0;
                        break;
                    }
                    break;
                case -1364000502:
                    if (str.equals(C2938c.c1655274989199dc("rdubvaccWcoib"))) {
                        c = 3;
                        break;
                    }
                    break;
                case -764631662:
                    if (str.equals(C2938c.c1655274989199dc("ftnowftbmgUbbyk}ce{g}tzHy}"))) {
                        c = 4;
                        break;
                    }
                    break;
                case -712491894:
                    if (str.equals(C2938c.c1655274989199dc("el`f``bXim"))) {
                        c = 2;
                        break;
                    }
                    break;
                case 1844104722:
                    if (str.equals(C2938c.c1655274989199dc("iovfvdesafd"))) {
                        c = 1;
                        break;
                    }
                    break;
                case 1912999166:
                    if (str.equals(C2938c.c1655274989199dc("dsct[db"))) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                str3 = "b`lmawYflVfdmizf}t";
            } else if (c == 1) {
                str3 = "iovfvdesafdT`bokdxv";
            } else if (c == 2) {
                str3 = "el`f``bXimUgclj{y|w";
            } else if (c == 3) {
                str3 = "rdubvaccWcoibQcpvg}xs";
            } else if (c == 4) {
                str3 = "ftnowftbmgUbbyk}ce{g}tzHy}Ews|zkILG";
            } else if (c != 5) {
                str2 = "";
                m9203e(context, nVar, str, str2, jSONObject);
            } else {
                str3 = "dsct[dbXdfkoxdcj";
            }
            str2 = C2938c.c1655274989199dc(str3);
            m9203e(context, nVar, str, str2, jSONObject);
        }
    }

    /* renamed from: b */
    public static void m9192b(Context context, C3498n nVar, String str, String str2) {
        m9197c(context, nVar, str, str2);
    }

    /* renamed from: b */
    public static void m9193b(Context context, C3498n nVar, String str, String str2, long j, JSONObject jSONObject) {
        while (true) {
            char c = 15;
            while (true) {
                switch (c) {
                    case 13:
                    case 14:
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put(C2975l.l1655274989215dc("dtpbplii"), j);
                            if (jSONObject != null) {
                                jSONObject2.putOpt(C2975l.l1655274989215dc("ae]f|qtfWmkm"), jSONObject);
                            }
                        } catch (Exception unused) {
                        }
                        String l1655274989215dc = C2975l.l1655274989215dc("ile@efnb");
                        C2975l.m8387c(l1655274989215dc, C2975l.l1655274989215dc("Rdrlvq&ci}k1,") + jSONObject2.toString());
                        m9203e(context, nVar, str, str2, jSONObject2);
                        return;
                    default:
                        c = 14;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m9194b(Context context, C3498n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put(C2975l.l1655274989215dc("ae]f|qtfWmkm"), jSONObject2.toString());
        m9203e(context, nVar, str, str2, jSONObject);
    }

    /* renamed from: b */
    public static void m9195b(Context context, C3498n nVar, String str, String str2, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                jSONObject2.put(C2933b.b1655274989200dc("ae]f|qtfWmkm"), jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        m9203e(context, nVar, str, str2, jSONObject2);
    }

    /* renamed from: b */
    public static void m9196b(C3498n nVar, String str, Map<String, Object> map) {
        m9182a(nVar, str, -1, map);
    }

    @JProtect
    /* renamed from: c */
    private static void m9197c(Context context, C3498n nVar, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt(C2933b.b1655274989200dc("lne\\a}rui"), nVar.mo19659ac());
            jSONObject.putOpt(C2933b.b1655274989200dc("u`]skiodq"), Integer.valueOf(nVar.mo19603F()));
        } catch (JSONException unused) {
        }
        new C3126a.C3127a().mo18662b(str).mo18663c(str2).mo18666f(nVar.mo19622Y()).mo18659a(nVar.mo19623Z()).mo18660a(jSONObject).mo18661a((C3129a) null);
        if (C2975l.m8389c()) {
            String b1655274989200dc = C2933b.b1655274989200dc("AeGuakr");
            C2975l.m8387c(b1655274989200dc, C2933b.b1655274989200dc("t`e9$") + str + C2933b.b1655274989200dc("l``fh?&") + str2 + C2933b.b1655274989200dc(" ") + nVar.mo19622Y());
        }
    }

    /* renamed from: c */
    public static void m9198c(Context context, C3498n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        jSONObject.put(C2885g.g1655274989219dc("ae]f|qtfWmkm"), jSONObject2.toString());
        m9203e(context, nVar, str, str2, jSONObject);
    }

    @JProtect
    /* renamed from: c */
    public static void m9199c(Context context, C3498n nVar, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m9203e(context, nVar, str, str2, jSONObject);
    }

    /* renamed from: d */
    public static void m9200d(Context context, C3498n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            jSONObject.put(C2933b.b1655274989200dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (Exception unused) {
        }
        m9203e(context, nVar, str, str2, jSONObject);
    }

    /* renamed from: e */
    public static void m9202e(Context context, C3498n nVar, String str, String str2, Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject2.put((String) next.getKey(), next.getValue());
                }
            }
            jSONObject.put(C2975l.l1655274989215dc("ae]f|qtfWmkm"), jSONObject2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m9203e(context, nVar, str, str2, jSONObject);
    }

    /* access modifiers changed from: private */
    @JProtect
    /* renamed from: e */
    public static void m9203e(Context context, C3498n nVar, String str, String str2, JSONObject jSONObject) {
        if (nVar != null) {
            if (jSONObject != null) {
                try {
                    jSONObject.putOpt(C2885g.g1655274989219dc("lne\\a}rui"), nVar.mo19659ac());
                    jSONObject.putOpt(C2885g.g1655274989219dc("u`]skiodq"), Integer.valueOf(nVar.mo19603F()));
                } catch (JSONException unused) {
                }
            } else {
                C2975l.m8387c(C2885g.g1655274989219dc("AeGuakr"), C2885g.g1655274989219dc("cbp#hja+(eelShv{bp2zg5szhmc"));
            }
            new C3126a.C3127a().mo18662b(str).mo18663c(str2).mo18666f(nVar.mo19622Y()).mo18659a(nVar.mo19623Z()).mo18660a(jSONObject).mo18661a((C3129a) null);
            if (C2975l.m8389c()) {
                String g1655274989219dc = C2885g.g1655274989219dc("AeGuakr");
                C2975l.m8387c(g1655274989219dc, C2885g.g1655274989219dc("t`e9$") + str + C2885g.g1655274989219dc("l``fh?&") + str2 + C2885g.g1655274989219dc(" ") + nVar.mo19622Y());
            }
        }
    }
}
