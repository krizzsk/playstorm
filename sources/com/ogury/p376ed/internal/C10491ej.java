package com.ogury.p376ed.internal;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: com.ogury.ed.internal.ej */
public enum C10491ej {
    INTERSTITIAL("interstitial", IronSourceConstants.INTERSTITIAL_AD_UNIT),
    OPTIN_VIDEO("optin_video", "Optin Video"),
    OVERLAY_THUMBNAIL("overlay_thumbnail", "Thumbnail"),
    SMALL_BANNER("banner_320x50", "Small Banner (320x50)"),
    MEDIUM_RECTANGLE("medium_rectangle", "MPU (300x250)");
    

    /* renamed from: a */
    public static final C10492a f26522a = null;

    /* renamed from: g */
    private final String f26529g;

    /* renamed from: h */
    private final String f26530h;

    private C10491ej(String str, String str2) {
        this.f26529g = str;
        this.f26530h = str2;
    }

    /* renamed from: a */
    public final String mo67287a() {
        return this.f26529g;
    }

    /* renamed from: b */
    public final String mo67288b() {
        return this.f26530h;
    }

    static {
        f26522a = new C10492a((byte) 0);
    }

    /* renamed from: c */
    public final boolean mo67289c() {
        return this == INTERSTITIAL || this == OPTIN_VIDEO;
    }

    /* renamed from: d */
    public final boolean mo67290d() {
        return this == OVERLAY_THUMBNAIL;
    }

    /* renamed from: e */
    public final boolean mo67291e() {
        return this == SMALL_BANNER || this == MEDIUM_RECTANGLE;
    }

    /* renamed from: com.ogury.ed.internal.ej$a */
    public static final class C10492a {
        public /* synthetic */ C10492a(byte b) {
            this();
        }

        private C10492a() {
        }

        /* renamed from: a */
        public static String m31804a(String str) {
            C10765mq.m32773b(str, "adUnitType");
            C10491ej[] values = C10491ej.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C10491ej ejVar = values[i];
                i++;
                if (C10765mq.m32772a((Object) ejVar.mo67287a(), (Object) str)) {
                    return ejVar.mo67288b();
                }
            }
            return str;
        }
    }
}
