package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2961c;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.p154h.C3526a;
import com.bytedance.sdk.openadsdk.core.p154h.C3527b;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.r */
/* compiled from: SecSdkHelper */
public class C3641r {

    /* renamed from: a */
    private static C3526a f9249a;

    /* renamed from: b */
    private String f9250b;

    /* renamed from: com.bytedance.sdk.openadsdk.core.r$a */
    /* compiled from: SecSdkHelper */
    private static class C3643a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C3641r f9251a = new C3641r();
    }

    private C3641r() {
        this.f9250b = null;
        f9249a = new C3527b();
    }

    /* renamed from: a */
    public void mo20213a(String str) {
        C3526a aVar;
        if (!TextUtils.isEmpty(str) && (aVar = f9249a) != null) {
            aVar.mo19876a(str);
        }
    }

    /* renamed from: a */
    public static C3641r m11577a() {
        return C3643a.f9251a;
    }

    /* renamed from: b */
    public void mo20215b(String str) {
        C3526a aVar = f9249a;
        if (aVar != null) {
            aVar.mo19878b(str);
        }
    }

    /* renamed from: b */
    public String mo20214b() {
        try {
            C2975l.m8387c("mssdk", "进入getSha1");
            if (!TextUtils.isEmpty(this.f9250b)) {
                C2975l.m8387c("mssdk", "sha1 内存 getSha1 " + this.f9250b);
                return this.f9250b;
            }
            String a = C3524h.m10849a("sdk_app_sha1", 2592000000L);
            this.f9250b = a;
            if (!TextUtils.isEmpty(a)) {
                C2975l.m8387c("mssdk", "sha1 return sha1: " + this.f9250b);
                return this.f9250b;
            }
            if (f9249a != null) {
                this.f9250b = f9249a.mo19877b();
                C2975l.m8387c("mssdk", "sha1: mssdk:  " + this.f9250b);
            }
            if (m11578c(this.f9250b)) {
                String upperCase = this.f9250b.toUpperCase();
                this.f9250b = upperCase;
                C3524h.m10851a("sdk_app_sha1", upperCase);
                return this.f9250b;
            }
            String a2 = C2961c.m8342a(C3578m.m11231a());
            this.f9250b = a2;
            if (!m11578c(a2)) {
                return "";
            }
            String upperCase2 = this.f9250b.toUpperCase();
            this.f9250b = upperCase2;
            C3524h.m10851a("sdk_app_sha1", upperCase2);
            return this.f9250b;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    private boolean m11578c(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(CertificateUtil.DELIMITER)) == null || split.length < 20) {
            return false;
        }
        for (String equals : split) {
            if (!"00".equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String mo20216c() {
        C3526a aVar = f9249a;
        if (aVar == null) {
            return "";
        }
        String a = aVar.mo19874a();
        C2975l.m8387c("mssdk", "sec_did: " + a);
        return a != null ? a : "";
    }

    /* renamed from: a */
    public Map<String, String> mo20212a(String str, byte[] bArr) {
        C3526a aVar = f9249a;
        if (aVar != null) {
            return aVar.mo19875a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", bArr);
        }
        return new HashMap();
    }
}
