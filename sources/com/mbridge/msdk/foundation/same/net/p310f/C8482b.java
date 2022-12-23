package com.mbridge.msdk.foundation.same.net.p310f;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.tools.C8556ac;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.net.f.b */
/* compiled from: HttpUtils */
public class C8482b {

    /* renamed from: a */
    private static final String f20500a = C8482b.class.getSimpleName();

    /* renamed from: a */
    public static String m24482a(List<C8457b> list) {
        C8457b b = m24485b(list, "Content-Type");
        if (b != null) {
            String b2 = b.mo57559b();
            if (!TextUtils.isEmpty(b2)) {
                String[] split = b2.split(";");
                for (int i = 1; i < split.length; i++) {
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    /* renamed from: b */
    private static C8457b m24485b(List<C8457b> list, String str) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C8457b bVar = list.get(i);
                if (bVar != null && str.equals(bVar.mo57558a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m24483a(List<C8457b> list, String str) {
        C8457b b = m24485b(list, str);
        return b != null ? b.mo57559b() : "";
    }

    /* renamed from: b */
    public static boolean m24486b(List<C8457b> list) {
        return TextUtils.equals(m24483a(list, "Content-Encoding"), "gzip");
    }

    /* renamed from: a */
    public static void m24484a(C8494d dVar, String str, String str2) {
        if (dVar != null) {
            try {
                if (C8556ac.m24737a(str)) {
                    return;
                }
                if (!C8556ac.m24737a(str2)) {
                    dVar.mo57606a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
