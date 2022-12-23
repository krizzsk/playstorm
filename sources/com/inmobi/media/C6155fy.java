package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fy */
/* compiled from: ConfigNetworkResponse */
final class C6155fy {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15604b = C6155fy.class.getSimpleName();

    /* renamed from: a */
    Map<String, C6156a> f15605a = new HashMap();

    /* renamed from: c */
    private TreeMap<String, C6144fr> f15606c;

    /* renamed from: d */
    private C6207gy f15607d;

    /* renamed from: e */
    private C6150fu f15608e;

    /* renamed from: f */
    private long f15609f;

    /* renamed from: a */
    private static boolean m18353a(int i) {
        return 500 <= i && i < 600;
    }

    C6155fy(C6154fx fxVar, C6207gy gyVar, long j) {
        this.f15606c = new TreeMap<>(fxVar.f15603c);
        this.f15607d = gyVar;
        this.f15609f = j;
        m18356c();
    }

    /* renamed from: c */
    private void m18356c() {
        if (!this.f15607d.mo35396a()) {
            try {
                JSONObject jSONObject = new JSONObject(this.f15607d.mo35397b());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    if (this.f15606c.get(next) != null) {
                        this.f15605a.put(next, new C6156a(jSONObject2, this.f15606c.get(next)));
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("name", m18352a((Map<String, C6144fr>) this.f15606c));
                hashMap.put("lts", m18355b(this.f15606c));
                C6218hh.m18506a().mo35424a("ConfigFetched", (Map<String, Object>) hashMap);
            } catch (JSONException e) {
                this.f15608e = new C6150fu((byte) 2, e.getLocalizedMessage());
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_ERROR_CODE, (byte) 1);
                hashMap2.put("name", m18352a((Map<String, C6144fr>) this.f15606c));
                hashMap2.put("lts", m18355b(this.f15606c));
                hashMap2.put("networkType", C6251ib.m18652b());
                C6218hh.m18506a().mo35424a("InvalidConfig", (Map<String, Object>) hashMap2);
            }
        } else {
            for (Map.Entry next2 : this.f15606c.entrySet()) {
                C6156a aVar = new C6156a((JSONObject) null, (C6144fr) next2.getValue());
                aVar.f15612c = new C6150fu((byte) 0, "Network error in fetching config.");
                this.f15605a.put((String) next2.getKey(), aVar);
            }
            this.f15608e = new C6150fu((byte) 0, this.f15607d.f15722a.f15701b);
            HashMap hashMap3 = new HashMap();
            hashMap3.put(IronSourceConstants.EVENTS_ERROR_CODE, String.valueOf(this.f15607d.f15722a.f15700a));
            hashMap3.put("name", m18352a((Map<String, C6144fr>) this.f15606c));
            hashMap3.put("lts", m18355b(this.f15606c));
            hashMap3.put("networkType", C6251ib.m18652b());
            C6218hh.m18506a().mo35424a("InvalidConfig", (Map<String, Object>) hashMap3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35340a() {
        C6207gy gyVar = this.f15607d;
        if (gyVar == null || gyVar.f15722a == null) {
            return false;
        }
        return this.f15607d.f15722a.f15700a == -7 || m18353a(this.f15607d.f15722a.f15700a);
    }

    /* renamed from: com.inmobi.media.fy$a */
    /* compiled from: ConfigNetworkResponse */
    public static class C6156a {

        /* renamed from: a */
        int f15610a;

        /* renamed from: b */
        C6144fr f15611b;

        /* renamed from: c */
        C6150fu f15612c;

        C6156a(JSONObject jSONObject, C6144fr frVar) {
            this.f15611b = frVar;
            if (jSONObject != null) {
                try {
                    int i = jSONObject.getInt("status");
                    int i2 = 500;
                    if (i == 200) {
                        i2 = 200;
                    } else if (i == 304) {
                        i2 = 304;
                    } else if (i == 404) {
                        i2 = 404;
                    } else if (i != 500) {
                        i2 = -1;
                    }
                    this.f15610a = i2;
                    if (i2 == 200) {
                        C6144fr a = C6144fr.m18315a(this.f15611b.mo35325b(), jSONObject.getJSONObject("content"), this.f15611b.mo35331g());
                        if (a != null) {
                            this.f15611b = a;
                        }
                        if (this.f15611b == null || !this.f15611b.mo35327d()) {
                            this.f15612c = new C6150fu((byte) 2, "The received config has failed validation.");
                            String unused = C6155fy.f15604b;
                            this.f15611b.mo35325b();
                        }
                    } else if (i2 == 304) {
                        String unused2 = C6155fy.f15604b;
                        this.f15611b.mo35325b();
                    } else {
                        this.f15612c = new C6150fu((byte) 1, "Internal error");
                        String unused3 = C6155fy.f15604b;
                        this.f15611b.mo35325b();
                    }
                } catch (JSONException e) {
                    this.f15612c = new C6150fu((byte) 2, e.getLocalizedMessage());
                    String unused4 = C6155fy.f15604b;
                    this.f15611b.mo35325b();
                }
            }
        }

        /* renamed from: a */
        public final boolean mo35341a() {
            return this.f15612c != null;
        }
    }

    /* renamed from: a */
    private static String m18352a(Map<String, C6144fr> map) {
        if (map.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : map.keySet()) {
            sb.append(append);
            sb.append(",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }

    /* renamed from: b */
    private static String m18355b(Map<String, C6144fr> map) {
        if (map.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        new C6149ft();
        for (Map.Entry next : map.entrySet()) {
            sb.append(C6149ft.m18342c((String) next.getKey(), ((C6144fr) next.getValue()).mo35331g()));
            sb.append(",");
        }
        return "[" + sb.substring(0, sb.length() - 1) + "]";
    }
}
