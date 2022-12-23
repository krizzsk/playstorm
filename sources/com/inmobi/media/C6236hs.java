package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.hs */
/* compiled from: ClickUrlHandler */
public class C6236hs {

    /* renamed from: a */
    private static final String f15797a = C6236hs.class.getSimpleName();

    /* renamed from: a */
    public static boolean m18597a(Context context, String str) {
        if (str == null) {
            return false;
        }
        if (context == null) {
            return m18598a(Uri.parse(str));
        }
        try {
            if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(context.getPackageManager()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m18596a(Context context, String str, ResolveInfo resolveInfo) throws ActivityNotFoundException, URISyntaxException {
        if (context != null) {
            Intent c = m18602c(str);
            if (resolveInfo != null) {
                c.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
            c.setFlags(268435456);
            context.startActivity(c);
        }
    }

    /* renamed from: b */
    public static void m18601b(Context context, String str) throws ActivityNotFoundException, URISyntaxException {
        while (context != null) {
            try {
                Intent parseUri = Intent.parseUri(str, 0);
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return;
            } catch (ActivityNotFoundException e) {
                if (SDKConstants.PARAM_INTENT.equals(Uri.parse(str).getScheme())) {
                    str = m18600b(str);
                    if (TextUtils.isEmpty(str)) {
                    }
                }
                throw e;
            }
        }
    }

    /* renamed from: a */
    public static String m18595a(Context context, String str, String str2) {
        if (context == null) {
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            if (parseUri.resolveActivity(context.getPackageManager()) != null) {
                parseUri.setFlags(268435456);
                context.startActivity(parseUri);
                return str;
            } else if (!TextUtils.isEmpty(str2)) {
                return m18595a(context, str2, (String) null);
            } else {
                if (SDKConstants.PARAM_INTENT.equals(Uri.parse(str).getScheme())) {
                    String b = m18600b(str);
                    if (!TextUtils.isEmpty(b)) {
                        return m18595a(context, URLDecoder.decode(b, "UTF-8"), (String) null);
                    }
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static String m18600b(String str) {
        try {
            return Intent.parseUri(str, 1).getStringExtra("browser_fallback_url");
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m18598a(Uri uri) {
        return "http".equals(uri.getScheme()) || "https".equals(uri.getScheme());
    }

    /* renamed from: a */
    public static boolean m18599a(String str) {
        Uri parse = Uri.parse(str);
        return m18598a(parse) && !"play.google.com".equals(parse.getHost()) && !"market.android.com".equals(parse.getHost()) && !Utils.PLAY_STORE_SCHEME.equals(parse.getScheme());
    }

    /* renamed from: c */
    public static List<ResolveInfo> m18603c(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str) || context == null) {
            return arrayList;
        }
        try {
            for (ResolveInfo next : context.getPackageManager().queryIntentActivityOptions((ComponentName) null, (Intent[]) null, m18602c(str), 0)) {
                if (next.activityInfo.exported) {
                    arrayList.add(next);
                }
            }
        } catch (URISyntaxException unused) {
        }
        return arrayList;
    }

    /* renamed from: c */
    private static Intent m18602c(String str) throws URISyntaxException {
        Uri parse = Uri.parse(str);
        if (parse == null || parse.getScheme() == null) {
            throw new URISyntaxException(str, "url is not getting parsed");
        } else if (!parse.getScheme().equals(SDKConstants.PARAM_INTENT)) {
            return new Intent("android.intent.action.VIEW", parse);
        } else {
            try {
                return Intent.parseUri(str, 1);
            } catch (URISyntaxException e) {
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                throw e;
            }
        }
    }
}
