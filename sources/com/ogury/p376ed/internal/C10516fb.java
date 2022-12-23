package com.ogury.p376ed.internal;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: com.ogury.ed.internal.fb */
public final class C10516fb {

    /* renamed from: a */
    public static final C10516fb f26575a = new C10516fb();

    private C10516fb() {
    }

    /* renamed from: a */
    public static String m31899a(String str) {
        C10765mq.m32773b(str, "s");
        try {
            MessageDigest instance = MessageDigest.getInstance(SameMD5.TAG);
            C10765mq.m32770a((Object) instance, "getInstance(\"MD5\")");
            Charset forName = Charset.forName("US-ASCII");
            C10765mq.m32770a((Object) forName, "forName(\"US-ASCII\")");
            byte[] bytes = str.getBytes(forName);
            C10765mq.m32770a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            instance.update(bytes, 0, str.length());
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            C10770mv mvVar = C10770mv.f27006a;
            String format = String.format("%0" + (digest.length << 1) + 'x', Arrays.copyOf(new Object[]{bigInteger}, 1));
            C10765mq.m32770a((Object) format, "java.lang.String.format(format, *args)");
            return format;
        } catch (NoSuchAlgorithmException e) {
            C10427da daVar = C10427da.f26371a;
            C10427da.m31544a(e);
            return "";
        }
    }
}
