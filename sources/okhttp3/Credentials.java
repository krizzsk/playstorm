package okhttp3;

import com.facebook.internal.security.CertificateUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.ByteString;

public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        return basic(str, str2, StandardCharsets.ISO_8859_1);
    }

    public static String basic(String str, String str2, Charset charset) {
        String base64 = ByteString.encodeString(str + CertificateUtil.DELIMITER + str2, charset).base64();
        return "Basic " + base64;
    }
}
