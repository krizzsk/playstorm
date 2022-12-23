package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.de */
/* compiled from: ResizeProperties */
public class C5976de {
    public static final String DEFAULT_POSITION = "top-right";
    private static final String TAG = C5976de.class.getSimpleName();
    Boolean allowOffscreen;
    String customClosePosition;
    int height;
    int offsetX = 0;
    int offsetY = 0;
    int width;

    public C5976de(String str, Boolean bool) {
        this.customClosePosition = str;
        this.allowOffscreen = bool;
    }

    /* renamed from: a */
    public static C5976de m17845a(String str, C5976de deVar) {
        boolean z;
        String str2;
        try {
            C5976de deVar2 = (C5976de) new C6262ij().mo35467a(new JSONObject(str), C5976de.class);
            if (deVar2 == null) {
                return null;
            }
            if (deVar2.customClosePosition == null) {
                if (deVar == null) {
                    str2 = DEFAULT_POSITION;
                } else {
                    str2 = deVar.customClosePosition;
                }
                deVar2.customClosePosition = str2;
            }
            if (deVar2.allowOffscreen == null) {
                if (deVar == null) {
                    z = true;
                } else {
                    z = deVar.allowOffscreen.booleanValue();
                }
                deVar2.allowOffscreen = Boolean.valueOf(z);
            }
            return deVar2;
        } catch (JSONException unused) {
            return null;
        }
    }
}
