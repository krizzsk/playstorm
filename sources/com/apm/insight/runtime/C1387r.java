package com.apm.insight.runtime;

import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.apm.insight.C1176b;
import com.apm.insight.C1205c;
import com.apm.insight.C1240h;
import com.apm.insight.p023l.C1285a;
import com.apm.insight.p023l.C1298i;
import com.apm.insight.p023l.C1308o;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONArray;

/* renamed from: com.apm.insight.runtime.r */
public class C1387r {

    /* renamed from: a */
    private static File f1464a;

    /* renamed from: com.apm.insight.runtime.r$a */
    public static class C1388a {

        /* renamed from: a */
        public String f1465a;

        /* renamed from: b */
        public String f1466b;

        /* renamed from: c */
        public long f1467c;

        C1388a(String str) {
            String[] split = str.split("\\s+");
            if (split.length == 3) {
                this.f1465a = split[0];
                this.f1466b = split[1];
                try {
                    this.f1467c = Long.parseLong(split[2]);
                } catch (Throwable th) {
                    C1205c a = C1176b.m1249a();
                    a.mo12218a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str, th));
                }
            } else {
                C1205c a2 = C1176b.m1249a();
                a2.mo12218a("NPTH_CATCH", (Throwable) new RuntimeException("err ProcessTrack line:" + str));
            }
        }
    }

    /* renamed from: a */
    private static File m2271a() {
        if (f1464a == null) {
            String c = C1285a.m1725c(C1240h.m1558g());
            if (c == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String j = C1308o.m1860j(C1240h.m1558g());
            f1464a = new File(j, "apminsight/ProcessTrack/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + '/' + c.replace(':', '_') + ".txt");
        }
        return f1464a;
    }

    /* renamed from: a */
    public static File m2272a(long j) {
        String j2 = C1308o.m1860j(C1240h.m1558g());
        return new File(j2, "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* renamed from: a */
    public static HashMap<String, C1388a> m2273a(long j, String str) {
        File file = new File(C1308o.m1860j(C1240h.m1558g()), "apminsight/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, C1388a> hashMap = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray a = C1298i.m1767a(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0);
                    int length2 = a.length() - 1;
                    while (true) {
                        if (length2 < 0) {
                            break;
                        }
                        String optString = a.optString(length2);
                        if (!TextUtils.isEmpty(optString)) {
                            if (optString.startsWith(str)) {
                                hashMap.put(str2.replace('_', ':').replace(".txt", ""), new C1388a(optString));
                                break;
                            }
                        }
                        length2--;
                    }
                } catch (IOException unused) {
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m2274a(String str, String str2) {
        try {
            File a = m2271a();
            if (a != null) {
                C1298i.m1769a(a, str + ' ' + str2 + ' ' + System.currentTimeMillis() + 10, true);
            }
        } catch (Throwable unused) {
        }
    }
}
