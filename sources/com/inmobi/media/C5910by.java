package com.inmobi.media;

import android.os.Build;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.by */
/* compiled from: NativeGifAsset */
public class C5910by extends C5901bt {

    /* renamed from: A */
    private static final String f14967A = C5910by.class.getSimpleName();

    /* renamed from: z */
    public C6051ev f14968z;

    C5910by(String str, String str2, C5902bu buVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b, jSONObject);
    }

    C5910by(String str, String str2, C5902bu buVar, String str3, List<C5922cf> list, byte b, JSONObject jSONObject) {
        super(str, str2, "GIF", buVar, list);
        C5858be.m17531a();
        C5839av b2 = C5858be.m17534b(str3);
        this.f14896e = b2 == null ? null : b2.f14716e;
        if (b2 != null) {
            try {
                String str4 = b2.f14716e;
                this.f14968z = Build.VERSION.SDK_INT < 28 ? new C6053ew(str4) : new C6045et(str4);
            } catch (Exception e) {
                this.f14968z = null;
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
        }
        if (jSONObject != null) {
            this.f14900i = b;
            this.f14897f = jSONObject;
        }
    }
}
