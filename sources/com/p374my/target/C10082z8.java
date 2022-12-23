package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.net.URLEncoder;

/* renamed from: com.my.target.z8 */
public class C10082z8 {

    /* renamed from: a */
    public static final String[] f25067a = {"http://play.google.com", "https://play.google.com", "http://market.android.com", "https://market.android.com", "market://", "samsungapps://"};

    /* renamed from: b */
    public final String f25068b;

    /* renamed from: c */
    public C10083a f25069c;

    /* renamed from: com.my.target.z8$a */
    public interface C10083a {
        /* renamed from: a */
        void mo63342a(String str);
    }

    public C10082z8(String str) {
        this.f25068b = str;
    }

    /* renamed from: a */
    public static String m29919a(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Throwable th) {
            C9672e0.m27882a("Unable to decode url " + th.getMessage());
            return str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29920a(Context context) {
        String str = (String) C9752i3.m28221d().mo64164b(this.f25068b, (String) null, context);
        if (this.f25069c != null) {
            C9693f0.m27983c(new Runnable(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C10082z8.this.m29925f(this.f$1);
                }
            });
        }
    }

    /* renamed from: b */
    public static String m29921b(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable th) {
            C9672e0.m27882a("Unable to encode url " + th.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m29922c(String str) {
        return str.startsWith("samsungapps://");
    }

    /* renamed from: d */
    public static boolean m29923d(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("https");
    }

    /* renamed from: e */
    public static boolean m29924e(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String startsWith : f25067a) {
                if (str.startsWith(startsWith)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m29925f(String str) {
        C10083a aVar = this.f25069c;
        if (aVar != null) {
            aVar.mo63342a(str);
            this.f25069c = null;
        }
    }

    /* renamed from: g */
    public static C10082z8 m29926g(String str) {
        return new C10082z8(str);
    }

    /* renamed from: a */
    public C10082z8 mo65880a(C10083a aVar) {
        this.f25069c = aVar;
        return this;
    }

    /* renamed from: b */
    public void mo65881b(Context context) {
        C9693f0.m27981b(new Runnable(context.getApplicationContext()) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C10082z8.this.m29920a(this.f$1);
            }
        });
    }
}
