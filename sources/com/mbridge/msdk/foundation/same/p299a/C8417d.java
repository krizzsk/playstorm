package com.mbridge.msdk.foundation.same.p299a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8401b;
import com.mbridge.msdk.foundation.entity.C8402c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.same.p302d.C8433a;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8608u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.a.d */
/* compiled from: StaticDataPoll */
public class C8417d {

    /* renamed from: a */
    public static Map<String, Long> f20351a = new HashMap();

    /* renamed from: b */
    public static Map<String, List<C8433a>> f20352b = new HashMap();

    /* renamed from: c */
    public static Map<String, List<C8433a>> f20353c = new HashMap();

    /* renamed from: d */
    public static Map<String, List<C8433a>> f20354d = new HashMap();

    /* renamed from: e */
    public static Map<String, List<C8433a>> f20355e = new HashMap();

    /* renamed from: f */
    public static Map<String, List<C8433a>> f20356f = new HashMap();

    /* renamed from: g */
    public static Map<String, List<C8433a>> f20357g = new HashMap();

    /* renamed from: h */
    public static Map<String, List<C8433a>> f20358h = new HashMap();

    /* renamed from: i */
    public static Map<String, List<C8433a>> f20359i = new HashMap();

    /* renamed from: j */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, C8401b>> f20360j;

    /* renamed from: k */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f20361k;

    /* renamed from: l */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f20362l;

    /* renamed from: m */
    private static final String f20363m = C8417d.class.getSimpleName();

    /* renamed from: a */
    public static void m24308a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<C8433a>> d = m24316d(str2);
        if (campaignEx != null && d != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    C8433a aVar = new C8433a(campaignEx.getId(), campaignEx.getRequestIdNotice());
                    if (d.containsKey(str)) {
                        List list = d.get(str);
                        if (list != null && list.size() == 20) {
                            list.remove(0);
                        }
                        if (list != null) {
                            list.add(aVar);
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    d.put(str, arrayList);
                }
            } catch (Throwable th) {
                C8608u.m24881a(f20363m, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    public static String m24306a(String str, String str2) {
        Map<String, List<C8433a>> map;
        List list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            map = null;
            if (f20353c.containsKey(str)) {
                map = f20353c;
            } else if (f20354d.containsKey(str)) {
                map = f20354d;
            } else if (f20355e.containsKey(str)) {
                map = f20355e;
            } else if (f20356f.containsKey(str)) {
                map = f20356f;
            } else if (f20357g.containsKey(str)) {
                map = f20357g;
            } else if (f20358h.containsKey(str)) {
                map = f20358h;
            } else if (f20359i.containsKey(str)) {
                map = f20359i;
            }
        } else {
            map = m24316d(str2);
        }
        if (map != null) {
            try {
                if (C8556ac.m24738b(str) && map.containsKey(str) && (list = map.get(str)) != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", ((C8433a) list.get(i)).mo57522a());
                        jSONObject.put("1", ((C8433a) list.get(i)).mo57523b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static void m24311a(String str, String str2, String str3, long j, long j2, long j3) {
        if (f20360j == null) {
            f20360j = new ConcurrentHashMap<>();
        }
        try {
            if (f20360j.containsKey(str)) {
                Map map = f20360j.get(str);
                if (map != null) {
                    C8401b bVar = (C8401b) map.get(str2);
                    if (bVar == null) {
                        C8401b bVar2 = new C8401b();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        bVar2.mo57297a((List<String>) arrayList);
                        bVar2.mo57295a(j);
                        bVar2.mo57300b(j2);
                        bVar2.mo57304c(j3);
                        map.put(str2, bVar2);
                    } else if (bVar.mo57302c() != null) {
                        bVar.mo57295a(j);
                        bVar.mo57300b(j2);
                        bVar.mo57304c(j3);
                        bVar.mo57302c().add(str3);
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                C8401b bVar3 = new C8401b();
                bVar3.mo57297a((List<String>) arrayList2);
                bVar3.mo57295a(j);
                bVar3.mo57300b(j2);
                bVar3.mo57304c(j3);
                concurrentHashMap.put(str2, bVar3);
                f20360j.put(str, concurrentHashMap);
            }
        } catch (Throwable th) {
            C8608u.m24884d(f20363m, th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m24313b(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C8401b>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f20360j) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f20360j.remove(str);
            return;
        }
        Map map = f20360j.get(str);
        if (map != null && map.containsKey(str2)) {
            map.remove(str2);
        }
    }

    /* renamed from: a */
    public static ConcurrentHashMap<String, C8401b> m24307a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C8401b>> concurrentHashMap = f20360j;
        if (concurrentHashMap == null) {
            C2372e a = C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
            if (a != null) {
                a.mo15888d(str, "");
                f20360j = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f20360j.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m24309a(String str, String str2, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        int size;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if (f20361k == null) {
                f20361k = new ConcurrentHashMap<>();
            }
            try {
                if (f20361k.containsKey(str)) {
                    copyOnWriteArrayList = f20361k.get(str);
                    copyOnWriteArrayList.add(str2);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    copyOnWriteArrayList2.add(str2);
                    f20361k.put(str, copyOnWriteArrayList2);
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                }
                if (copyOnWriteArrayList != null && (size = copyOnWriteArrayList.size() - i) >= 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        copyOnWriteArrayList.remove(i2);
                    }
                }
            } catch (Exception e) {
                C8608u.m24880a(f20363m, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m24312b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && (concurrentHashMap = f20361k) != null && concurrentHashMap.containsKey(str) && (copyOnWriteArrayList = f20361k.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            copyOnWriteArrayList.remove(0);
        }
    }

    /* renamed from: c */
    public static String m24315c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && (concurrentHashMap = f20361k) != null && concurrentHashMap.containsKey(str) && (copyOnWriteArrayList = f20361k.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            return (String) copyOnWriteArrayList.get(0);
        }
        return "";
    }

    /* renamed from: a */
    public static void m24310a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if (f20362l == null) {
                    f20362l = new ConcurrentHashMap<>();
                }
                if (!f20362l.containsKey(str)) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    concurrentHashMap.put(str2, str3);
                    f20362l.put(str, concurrentHashMap);
                } else if (f20362l.get(str) == null) {
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    concurrentHashMap2.put(str2, str3);
                    f20362l.put(str, concurrentHashMap2);
                }
            } catch (Exception e) {
                C8608u.m24880a(f20363m, e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static C8402c m24314c(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        C8402c cVar = new C8402c();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return cVar;
        }
        try {
            if (f20362l != null && f20362l.containsKey(str) && (concurrentHashMap = f20362l.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                cVar.mo57311b(1);
                cVar.mo57314c((String) concurrentHashMap.get(str2));
            }
        } catch (Exception e) {
            C8608u.m24880a(f20363m, e.getMessage());
        }
        return cVar;
    }

    /* renamed from: d */
    public static void m24317d(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (f20362l != null && f20362l.containsKey(str) && (concurrentHashMap = f20362l.get(str2)) != null && concurrentHashMap.containsKey(str2)) {
                    concurrentHashMap.remove(str2);
                }
            } catch (Exception e) {
                C8608u.m24880a(f20363m, e.getMessage());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.p302d.C8433a>> m24316d(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1396342996: goto L_0x0044;
                case -1052618729: goto L_0x003a;
                case -934326481: goto L_0x0030;
                case -895866265: goto L_0x0026;
                case 538816457: goto L_0x001c;
                case 604727084: goto L_0x0012;
                case 1844104930: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "interactive"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "interstitial"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "h5_native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "splash"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "reward"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 0
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "banner"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0063;
                case 2: goto L_0x0060;
                case 3: goto L_0x005d;
                case 4: goto L_0x005a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            r1 = 0
            goto L_0x0068
        L_0x0054:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20359i
            goto L_0x0068
        L_0x0057:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20358h
            goto L_0x0068
        L_0x005a:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20357g
            goto L_0x0068
        L_0x005d:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20356f
            goto L_0x0068
        L_0x0060:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20355e
            goto L_0x0068
        L_0x0063:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20354d
            goto L_0x0068
        L_0x0066:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20353c
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p299a.C8417d.m24316d(java.lang.String):java.util.Map");
    }
}
