package com.mbridge.msdk.mbsignalcommon.windvane;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.j */
/* compiled from: WindVaneUtil */
public final class C8827j {

    /* renamed from: a */
    private static final String[] f21477a = {"wv_hybrid:", "mraid:", "ssp:", "mvb_hybrid:"};

    /* renamed from: b */
    private static final Pattern f21478b = Pattern.compile("hybrid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: c */
    private static final Pattern f21479c = Pattern.compile("mraid://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: d */
    private static final Pattern f21480d = Pattern.compile("ssp://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: e */
    private static final Pattern f21481e = Pattern.compile("mv://(.+?):(.+?)/(.+?)(\\?(.*?))?");

    /* renamed from: f */
    private static Map<String, String> f21482f = new HashMap();

    static {
        for (C8822e eVar : C8822e.values()) {
            f21482f.put(eVar.mo58303a(), eVar.mo58304b());
        }
    }

    /* renamed from: a */
    public static boolean m25679a(String str) {
        for (String equals : f21477a) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Pattern m25680b(String str) {
        if ("wv_hybrid:".equals(str)) {
            return f21481e;
        }
        if ("mraid:".equals(str)) {
            return f21479c;
        }
        if ("ssp:".equals(str)) {
            return f21480d;
        }
        if ("mvb_hybrid:".equals(str)) {
            return f21481e;
        }
        return null;
    }

    /* renamed from: c */
    public static String m25681c(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuffer stringBuffer = new StringBuffer(1000);
        stringBuffer.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z = true;
            if (charAt > 255) {
                stringBuffer.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> 8).toUpperCase();
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase2);
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        z = false;
                        break;
                    } else if (cArr[i2] == charAt) {
                        stringBuffer.append("\\" + charAt);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z) {
                    stringBuffer.append(charAt);
                }
            }
        }
        return new String(stringBuffer);
    }

    /* renamed from: d */
    public static boolean m25682d(String str) {
        return m25683e(str).startsWith("image");
    }

    /* renamed from: e */
    public static String m25683e(String str) {
        String str2 = f21482f.get(m25684f(str));
        return str2 == null ? "" : str2;
    }

    /* renamed from: f */
    private static String m25684f(String str) {
        String path;
        int lastIndexOf;
        if (TextUtils.isEmpty(str) || (path = Uri.parse(str).getPath()) == null || (lastIndexOf = path.lastIndexOf(".")) == -1) {
            return "";
        }
        return path.substring(lastIndexOf + 1);
    }
}
