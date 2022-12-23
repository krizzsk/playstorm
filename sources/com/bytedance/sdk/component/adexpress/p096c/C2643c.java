package com.bytedance.sdk.component.adexpress.p096c;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.c.c */
/* compiled from: UrlUtils */
public class C2643c {
    /* renamed from: a */
    public static C2644a m6902a(String str) {
        C2644a aVar;
        C2644a aVar2 = C2644a.IMAGE;
        if (TextUtils.isEmpty(str)) {
            return aVar2;
        }
        try {
            String path = Uri.parse(str).getPath();
            if (path == null) {
                return aVar2;
            }
            if (path.endsWith(".css")) {
                aVar = C2644a.CSS;
            } else if (path.endsWith(".js")) {
                aVar = C2644a.JS;
            } else {
                if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp")) {
                    if (!path.endsWith(".ico")) {
                        if (!path.endsWith(".html")) {
                            return aVar2;
                        }
                        aVar = C2644a.HTML;
                    }
                }
                aVar = C2644a.IMAGE;
            }
            return aVar;
        } catch (Throwable unused) {
            return aVar2;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.c.c$a */
    /* compiled from: UrlUtils */
    public enum C2644a {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");
        

        /* renamed from: e */
        private String f5702e;

        private C2644a(String str) {
            this.f5702e = str;
        }

        /* renamed from: a */
        public String mo16812a() {
            return this.f5702e;
        }
    }
}
