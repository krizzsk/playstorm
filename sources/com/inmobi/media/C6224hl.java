package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.ResolveInfo;
import java.net.URISyntaxException;
import java.util.List;

/* renamed from: com.inmobi.media.hl */
/* compiled from: DeeplinkHandler */
public final class C6224hl {

    /* renamed from: a */
    private static C6224hl f15770a;

    private C6224hl() {
    }

    /* renamed from: a */
    public static synchronized C6224hl m18530a() {
        C6224hl hlVar;
        synchronized (C6224hl.class) {
            if (f15770a == null) {
                f15770a = new C6224hl();
            }
            hlVar = f15770a;
        }
        return hlVar;
    }

    /* renamed from: b */
    private static boolean m18532b(Context context, String str) {
        try {
            C6236hs.m18601b(context, str);
            return true;
        } catch (ActivityNotFoundException unused) {
            try {
                C6236hs.m18596a(context, str, (ResolveInfo) null);
                return true;
            } catch (ActivityNotFoundException | URISyntaxException unused2) {
                return false;
            }
        } catch (URISyntaxException unused3) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18531a(Context context, String str) {
        if (str.isEmpty()) {
            return false;
        }
        List<ResolveInfo> c = C6236hs.m18603c(context, str);
        if (c.isEmpty()) {
            return m18532b(context, str);
        }
        String str2 = c.get(0).activityInfo.name;
        try {
            C6236hs.m18596a(context, str, c.get(0));
            return true;
        } catch (URISyntaxException unused) {
            return false;
        }
    }
}
