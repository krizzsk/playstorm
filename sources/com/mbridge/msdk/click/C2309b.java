package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.click.b */
/* compiled from: CommonClickUtil */
public final class C2309b {

    /* renamed from: a */
    static Handler f4764a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            String str;
            String str2;
            String str3;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string = data.getString("rid");
                        String string2 = data.getString("cid_n");
                        str = data.getString(BidResponsedEx.KEY_CID);
                        str3 = string;
                        str2 = string2;
                    } else {
                        str3 = "";
                        str2 = str3;
                        str = str2;
                    }
                    new C8526d(C2350a.m5601e().mo15792g()).mo57689a(i, i2, str3, str2, str);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    };

    /* renamed from: a */
    public static void m5447a(Context context, String str) {
        if (str != null && context != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.addFlags(268435456);
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    intent.setClassName(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.name);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m5449b(Context context, String str) {
        if (context != null && str != null) {
            try {
                Class.forName("com.mbridge.msdk.activity.MBCommonActivity");
                Intent intent = new Intent(context, Class.forName("com.mbridge.msdk.activity.MBCommonActivity"));
                intent.putExtra("url", str);
                if (!(context instanceof ContextThemeWrapper)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (ClassNotFoundException e) {
                C8608u.m24884d("CommonClickUtil", e.getMessage());
            } catch (Throwable th) {
                C8608u.m24884d("CommonClickUtil", th.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static boolean m5450c(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m5451d(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            intent.setData(parse);
            if (parse.getScheme().startsWith(C8595p.m24815b("L7QthdSsLkP8")) && m5448a(context, intent)) {
                return true;
            }
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            C8608u.m24881a("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m5448a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                context.startActivity(intent);
                return true;
            } else if (C2350a.m5601e().mo15787c() == null) {
                return false;
            } else {
                C2350a.m5601e().mo15787c().startActivity(intent);
                return true;
            }
        } catch (Throwable th) {
            C8608u.m24881a("CommonClickUtil", th.getMessage(), th);
            return false;
        }
    }

    /* renamed from: e */
    public static void m5452e(Context context, String str) {
        Intent launchIntentForPackage;
        ResolveInfo next;
        try {
            if (!TextUtils.isEmpty(str) && m5450c(context, str) && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) != null) {
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0);
                if (queryIntentActivities.size() > 0 && (next = queryIntentActivities.iterator().next()) != null) {
                    ComponentName componentName = new ComponentName(next.activityInfo.packageName, next.activityInfo.name);
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    intent.addFlags(268435456);
                    context.startActivity(intent);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static String m5445a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    str = str.replaceAll(next, str2);
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public static String m5444a(String str, String str2, String str3) {
        Map<String, C2278a.C2279a> af;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null || (af = b.mo15467af()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            for (Map.Entry<String, C2278a.C2279a> key : af.entrySet()) {
                String str4 = (String) key.getKey();
                if (!TextUtils.isEmpty(str4) && host.contains(str4)) {
                    C2278a.C2279a aVar = af.get(str4);
                    if (aVar != null) {
                        return m5445a(m5445a(m5445a(m5445a(str, aVar.mo15552d(), String.valueOf((float) C8596q.m24838i(C2350a.m5601e().mo15792g()))), aVar.mo15551c(), String.valueOf((float) C8596q.m24837h(C2350a.m5601e().mo15792g()))), aVar.mo15548a(), str2), aVar.mo15550b(), str3);
                    }
                    return str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static void m5446a(final Context context, int i, final String str) {
        if (i != 0) {
            try {
                C8442b.m24388a().execute(new Runnable() {
                    public final void run() {
                        try {
                            Method method = Class.forName("com.mbridge.msdk.foundation.tools.n").getMethod("mia", new Class[]{Context.class, String.class});
                            if (context == null) {
                                method.invoke((Object) null, new Object[]{C2350a.m5601e().mo15792g(), str});
                                return;
                            }
                            method.invoke((Object) null, new Object[]{context, str});
                        } catch (Throwable th) {
                            C8608u.m24884d("CommonClickUtil", th.getMessage());
                        }
                    }
                });
            } catch (Throwable th) {
                C8608u.m24884d("CommonClickUtil", th.getMessage());
            }
        }
    }
}
