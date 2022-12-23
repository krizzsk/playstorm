package com.mbridge.msdk.foundation.same.report.p313b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Log;
import com.facebook.share.internal.ShareInternalUtility;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.report.b.a */
/* compiled from: CrashHandlerUtil */
public class C8522a implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static volatile C8522a f20656c;

    /* renamed from: a */
    Handler f20657a = new Handler() {
        public final void handleMessage(Message message) {
            Context context;
            HashMap hashMap;
            super.handleMessage(message);
            if (message.what == 101 && (context = (Context) C8522a.this.f20658b.get()) != null && (message.obj instanceof HashMap) && (hashMap = (HashMap) message.obj) != null) {
                new C8526d(context).mo57693a((String) hashMap.get("crashinfo"), (File) hashMap.get(ShareInternalUtility.STAGING_PARAM));
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WeakReference<Context> f20658b;

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f20659d;

    /* renamed from: e */
    private Throwable f20660e;

    private C8522a(Context context) {
        this.f20658b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static C8522a m24622a(Context context) {
        if (f20656c == null) {
            synchronized (C8522a.class) {
                if (f20656c == null) {
                    f20656c = new C8522a(context);
                }
            }
        }
        return f20656c;
    }

    /* renamed from: a */
    public final void mo57684a() {
        this.f20659d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    private String m24624a(Throwable th, String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject();
            Context context = (Context) this.f20658b.get();
            if (context == null) {
                return "";
            }
            float f = (float) ((((double) Runtime.getRuntime().totalMemory()) * 1.0d) / 1048576.0d);
            float freeMemory = (float) ((((double) Runtime.getRuntime().freeMemory()) * 1.0d) / 1048576.0d);
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            long usableSpace = externalStorageDirectory.getUsableSpace();
            String str3 = "appversionname";
            Object obj = "-1";
            long totalSpace = externalStorageDirectory.getTotalSpace();
            String formatFileSize = Formatter.formatFileSize(context, usableSpace);
            String formatFileSize2 = Formatter.formatFileSize(context, totalSpace);
            jSONObject.put("max_memory", String.valueOf((float) ((((double) Runtime.getRuntime().maxMemory()) * 1.0d) / 1048576.0d)));
            jSONObject.put("memoryby_app", String.valueOf(f));
            jSONObject.put("remaining_memory", (double) freeMemory);
            jSONObject.put("sdcard_remainder", formatFileSize);
            jSONObject.put("totalspacestr", formatFileSize2);
            jSONObject.put("crashtime", str);
            String b = C2338a.m5535a().mo15735b(MBridgeConstans.SDK_APP_ID);
            if (!TextUtils.isEmpty(b)) {
                jSONObject.put("appid", b);
            }
            try {
                jSONObject.put("osversion", Build.VERSION.SDK_INT);
                jSONObject.put("appversioncode", m24629b(context));
                str2 = str3;
                try {
                    jSONObject.put(str2, m24631c(context));
                    jSONObject.put("appname", m24632d(context));
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                str2 = str3;
                jSONObject.put("osversion", 0);
                Object obj2 = obj;
                jSONObject.put("appversioncode", obj2);
                jSONObject.put(str2, obj2);
                jSONObject.put("appname", "");
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                jSONObject.put("crashinfo", stringWriter.toString());
                String jSONObject2 = jSONObject.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("key=2000052");
                stringBuffer.append("&exception=" + jSONObject2);
                return stringBuffer.toString();
            }
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            jSONObject.put("crashinfo", stringWriter2.toString());
            String jSONObject22 = jSONObject.toString();
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("key=2000052");
            stringBuffer2.append("&exception=" + jSONObject22);
            return stringBuffer2.toString();
        } catch (Throwable th2) {
            th2.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    private int m24629b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: c */
    private static String m24631c(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("", e.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    private String m24632d(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.f20660e = th;
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b == null) {
                b = C2283b.m5275a().mo15562b();
            }
            String G = b.mo15433G() == null ? "mbridge" : b.mo15433G();
            List<String> a = m24626a(G, "<mvpackage>(.*?)</mvpackage>");
            if (a.size() > 0) {
                for (int i = 0; i < a.size(); i++) {
                    m24627a(m24623a(th), a.get(i), th, thread);
                }
                return;
            }
            m24627a(m24623a(th), G, th, thread);
        } catch (Exception e) {
            m24628a(thread, th);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private String m24623a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTrace.length; i++) {
            sb.append(stackTrace[i].toString() + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m24627a(String str, String str2, Throwable th, Thread thread) {
        if (str.contains(str2)) {
            HashMap<String, Object> b = m24630b();
            if (b != null && b.get(ShareInternalUtility.STAGING_PARAM) != null) {
                Message obtain = Message.obtain();
                HashMap hashMap = new HashMap();
                hashMap.put("crashinfo", m24624a(th, (String) b.get("time")));
                hashMap.put(ShareInternalUtility.STAGING_PARAM, b.get(ShareInternalUtility.STAGING_PARAM));
                obtain.obj = hashMap;
                obtain.what = 101;
                this.f20657a.sendMessage(obtain);
                m24628a(thread, th);
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20659d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private List<String> m24626a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m24628a(Thread thread, Throwable th) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }

    /* renamed from: b */
    private HashMap<String, Object> m24630b() {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (this.f20660e == null) {
            return null;
        }
        String b = C8422e.m24335b(C8420c.MBRIDGE_CRASH_INFO);
        File file = new File(b + "/");
        if (!file.exists()) {
            file.mkdirs();
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(b + "/" + "sdkcrash" + format + ".txt");
        try {
            PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            printWriter.println(m24624a(this.f20660e, format));
            printWriter.println("====");
            this.f20660e.printStackTrace(printWriter);
            printWriter.close();
            hashMap.put(ShareInternalUtility.STAGING_PARAM, file2);
            hashMap.put("time", format);
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
