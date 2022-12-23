package com.applovin.impl.sdk.p046ad;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.ad.c */
public class C1826c {

    /* renamed from: a */
    private final C1959m f2929a;

    /* renamed from: b */
    private final String f2930b;

    /* renamed from: com.applovin.impl.sdk.ad.c$a */
    public enum C1827a {
        UNSPECIFIED("UNSPECIFIED"),
        REGULAR("REGULAR"),
        AD_RESPONSE_JSON("AD_RESPONSE_JSON");
        

        /* renamed from: d */
        private final String f2935d;

        private C1827a(String str) {
            this.f2935d = str;
        }

        public String toString() {
            return this.f2935d;
        }
    }

    public C1826c(String str, C1959m mVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Identifier is empty");
        } else if (mVar != null) {
            this.f2930b = str;
            this.f2929a = mVar;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private String m3839a(C1857b<String> bVar) {
        for (String next : this.f2929a.mo14344b(bVar)) {
            if (this.f2930b.startsWith(next)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo13923a() {
        return this.f2930b;
    }

    /* renamed from: b */
    public C1827a mo13924b() {
        return m3839a(C1857b.f3150ba) != null ? C1827a.REGULAR : m3839a(C1857b.f3151bb) != null ? C1827a.AD_RESPONSE_JSON : C1827a.UNSPECIFIED;
    }

    /* renamed from: c */
    public String mo13925c() {
        String a = m3839a(C1857b.f3150ba);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String a2 = m3839a(C1857b.f3151bb);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }

    /* renamed from: d */
    public JSONObject mo13926d() {
        if (mo13924b() != C1827a.AD_RESPONSE_JSON) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(new String(Base64.decode(this.f2930b.substring(mo13925c().length()), 0), "UTF-8"));
                if (C2092v.m5047a()) {
                    C2092v A = this.f2929a.mo14286A();
                    A.mo14789b("AdToken", "Decoded token into ad response: " + jSONObject);
                }
                return jSONObject;
            } catch (JSONException e) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                C2092v A2 = this.f2929a.mo14286A();
                A2.mo14790b("AdToken", "Unable to decode token '" + this.f2930b + "' into JSON", e);
                return null;
            }
        } catch (UnsupportedEncodingException e2) {
            if (!C2092v.m5047a()) {
                return null;
            }
            C2092v A3 = this.f2929a.mo14286A();
            A3.mo14790b("AdToken", "Unable to process ad response from token '" + this.f2930b + "'", e2);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1826c)) {
            return false;
        }
        String str = this.f2930b;
        String str2 = ((C1826c) obj).f2930b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f2930b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String prefixToIndex = StringUtils.prefixToIndex(32, this.f2930b);
        return "AdToken{id=" + prefixToIndex + ", type=" + mo13924b() + '}';
    }
}
