package com.inmobi.media;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ir */
/* compiled from: UidMap */
public class C6271ir {

    /* renamed from: a */
    private C6163gb f15880a;

    public C6271ir(C6163gb gbVar) {
        this.f15880a = gbVar;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo35481a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("u-id-map", m18740b());
        return hashMap;
    }

    /* renamed from: b */
    private String m18740b() {
        return new JSONObject(m18741c()).toString();
    }

    /* renamed from: c */
    private Map<String, String> m18741c() {
        C6268ip e;
        HashMap hashMap = new HashMap();
        String str = null;
        try {
            if (!(!this.f15880a.GPID || (e = C6269iq.m18729a().mo35478e()) == null || (str = e.mo35475b()) == null)) {
                hashMap.put("GPID", str);
            }
            m18739a(hashMap, str);
        } catch (Exception unused) {
            C6271ir.class.getSimpleName();
            m18739a(hashMap, (String) null);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m18739a(Map<String, String> map, String str) {
        try {
            if (this.f15880a.UM5 && str == null) {
                C6269iq.m18729a();
                C6269iq.m18729a();
                map.put("UM5", C6269iq.m18730a(C6269iq.m18731d(), SameMD5.TAG));
            }
            if (this.f15880a.f15619O1 && str == null) {
                C6269iq.m18729a();
                C6269iq.m18729a();
                map.put("O1", C6269iq.m18730a(C6269iq.m18731d(), "SHA-1"));
            }
        } catch (Exception unused) {
            C6271ir.class.getSimpleName();
        }
    }
}
