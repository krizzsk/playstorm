package com.ironsource.sdk.controller;

import com.ironsource.sdk.utils.C8393c;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;

/* renamed from: com.ironsource.sdk.controller.t */
final class C8245t {

    /* renamed from: a */
    String f19716a;

    C8245t(String str) {
        this.f19716a = str;
    }

    /* renamed from: a */
    private String m23647a(String str) {
        try {
            return C8393c.m24046a(str);
        } catch (Exception e) {
            e.printStackTrace();
            return m23648b(str);
        }
    }

    /* renamed from: b */
    private String m23648b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo56595a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(m23647a(str + str2 + this.f19716a));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
