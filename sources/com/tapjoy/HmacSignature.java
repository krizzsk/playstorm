package com.tapjoy;

import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSignature {

    /* renamed from: a */
    private String f27197a;

    /* renamed from: b */
    private String f27198b;

    public HmacSignature(String str, String str2) {
        this.f27197a = str;
        this.f27198b = str2;
    }

    public String sign(String str, Map<String, String> map) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f27198b.getBytes(), this.f27197a);
            Mac instance = Mac.getInstance(this.f27197a);
            instance.init(secretKeySpec);
            Uri parse = Uri.parse(str);
            String str2 = parse.getScheme() + "://" + parse.getHost();
            if (!((parse.getScheme().equals("http") && parse.getPort() == 80) || (parse.getScheme().equals("https") && parse.getPort() == 443)) && -1 != parse.getPort()) {
                str2 = str2 + CertificateUtil.DELIMITER + parse.getPort();
            }
            String str3 = str2.toLowerCase() + parse.getPath();
            String a = m33003a(map);
            String str4 = "POST&" + Uri.encode(str3) + "&" + Uri.encode(a);
            TapjoyLog.m33198v("HmacSignature", "Base Url: ".concat(String.valueOf(str4)));
            byte[] doFinal = instance.doFinal(str4.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : doFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean matches(String str, Map<String, String> map, String str2) {
        return sign(str, map).equals(str2);
    }

    /* renamed from: a */
    private static String m33003a(Map<String, String> map) {
        TreeSet treeSet = new TreeSet(map.keySet());
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str + "=" + map.get(str) + "&");
        }
        sb.deleteCharAt(sb.lastIndexOf("&"));
        TapjoyLog.m33198v("HmacSignature", "Unhashed String: " + sb.toString());
        return sb.toString();
    }
}
