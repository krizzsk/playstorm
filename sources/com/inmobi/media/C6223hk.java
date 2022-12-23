package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.applovin.impl.sdk.utils.Utils;

/* renamed from: com.inmobi.media.hk */
/* compiled from: AppstoreLinkHandler */
public final class C6223hk {

    /* renamed from: a */
    private static C6223hk f15769a;

    private C6223hk() {
    }

    /* renamed from: a */
    public static synchronized C6223hk m18526a() {
        C6223hk hkVar;
        synchronized (C6223hk.class) {
            if (f15769a == null) {
                f15769a = new C6223hk();
            }
            hkVar = f15769a;
        }
        return hkVar;
    }

    /* renamed from: a */
    private static boolean m18529a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (Utils.PLAY_STORE_SCHEME.equals(parse.getScheme()) || "play.google.com".equals(parse.getHost()) || "market.android.com".equals(parse.getHost())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m18527a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18528a(Context context, String str) {
        if (!m18529a(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (m18527a(context)) {
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setPackage("com.android.vending");
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        }
        C6224hl.m18530a();
        if (C6224hl.m18531a(context, str)) {
            return true;
        }
        return false;
    }
}
