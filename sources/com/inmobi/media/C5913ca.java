package com.inmobi.media;

import com.facebook.share.internal.ShareConstants;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ca */
/* compiled from: NativeImageAsset */
public final class C5913ca extends C5901bt {
    public C5913ca(String str, String str2, C5902bu buVar, String str3, byte b, JSONObject jSONObject) {
        this(str, str2, buVar, str3, new LinkedList(), b, jSONObject);
    }

    public C5913ca(String str, String str2, C5902bu buVar, String str3, List<C5922cf> list, byte b, JSONObject jSONObject) {
        super(str, str2, ShareConstants.IMAGE_URL, buVar, list);
        this.f14896e = str3;
        if (jSONObject != null) {
            this.f14900i = b;
            this.f14897f = jSONObject;
        }
    }
}
