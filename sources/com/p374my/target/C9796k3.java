package com.p374my.target;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import com.amazon.aps.shared.APSAnalytics;
import com.p374my.target.common.MyTargetVersion;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* renamed from: com.my.target.k3 */
public class C9796k3 {

    /* renamed from: a */
    public static String f24177a = "https://ad.mail.ru/sdk/log/";

    /* renamed from: b */
    public static boolean f24178b = true;

    /* renamed from: c */
    public final String f24179c;

    /* renamed from: d */
    public final String f24180d;

    /* renamed from: e */
    public String f24181e;

    /* renamed from: f */
    public int f24182f;

    /* renamed from: g */
    public String f24183g;

    /* renamed from: h */
    public String f24184h;

    /* renamed from: i */
    public String f24185i;

    public C9796k3(String str, String str2) {
        this.f24179c = str;
        this.f24180d = str2;
    }

    /* renamed from: a */
    public static C9796k3 m28465a(String str) {
        return new C9796k3(str, "error");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m28466a(Context context) {
        String a = mo64576a();
        C9672e0.m27882a("send message to log:\n " + a);
        if (f24178b) {
            C9712g3.m28065d().mo64164b(f24177a, Base64.encodeToString(a.getBytes(Charset.forName("UTF-8")), 0), context);
        }
    }

    /* renamed from: a */
    public C9796k3 mo64575a(int i) {
        this.f24182f = i;
        return this;
    }

    /* renamed from: a */
    public String mo64576a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk", "myTarget");
            jSONObject.put("sdkver", MyTargetVersion.VERSION);
            jSONObject.put("os", APSAnalytics.OS_NAME);
            jSONObject.put("osver", Build.VERSION.RELEASE);
            jSONObject.put("type", this.f24180d);
            jSONObject.put("name", this.f24179c);
            String str = this.f24181e;
            if (str != null) {
                jSONObject.put("message", str);
            }
            int i = this.f24182f;
            if (i > 0) {
                jSONObject.put("slot", i);
            }
            String str2 = this.f24183g;
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            String str3 = this.f24184h;
            if (str3 != null) {
                jSONObject.put("bannerId", str3);
            }
            String str4 = this.f24185i;
            if (str4 != null) {
                jSONObject.put("data", str4);
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public C9796k3 mo64577b(String str) {
        this.f24183g = str;
        return this;
    }

    /* renamed from: b */
    public void mo64578b(Context context) {
        C9693f0.m27981b(new Runnable(context) {
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C9796k3.this.m28466a(this.f$1);
            }
        });
    }

    /* renamed from: c */
    public C9796k3 mo64579c(String str) {
        this.f24184h = str;
        return this;
    }

    /* renamed from: d */
    public C9796k3 mo64580d(String str) {
        this.f24181e = str;
        return this;
    }
}
