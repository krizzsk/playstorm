package com.ironsource.environment;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.tapjoy.TapjoyConstants;
import java.io.DataOutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.e */
public final class C6416e {

    /* renamed from: c */
    public static String f16310c = "";

    /* renamed from: a */
    Context f16311a;

    /* renamed from: b */
    String f16312b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public JSONObject f16313d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f16314e;

    /* renamed from: f */
    private String f16315f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f16316g;

    /* renamed from: h */
    private Thread.UncaughtExceptionHandler f16317h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f16318i;

    /* renamed from: com.ironsource.environment.e$a */
    static class C6420a {

        /* renamed from: a */
        static volatile C6416e f16324a = new C6416e((byte) 0);
    }

    private C6416e() {
        this.f16316g = false;
        this.f16313d = new JSONObject();
        this.f16317h = Thread.getDefaultUncaughtExceptionHandler();
        this.f16312b = " ";
        this.f16318i = "https://outcome-crash-report.supersonicads.com/reporter";
        Thread.setDefaultUncaughtExceptionHandler(new C6413d(this.f16317h));
    }

    /* synthetic */ C6416e(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6416e m19260a() {
        return C6420a.f16324a;
    }

    /* renamed from: a */
    private static String m19261a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities == null) {
                    return "none";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
            } else {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                        return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
                    }
                    if (activeNetworkInfo.getTypeName().equalsIgnoreCase("MOBILE")) {
                        return "cellular";
                    }
                }
            }
            return "none";
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    /* renamed from: a */
    public final void mo35925a(final Context context, HashSet<String> hashSet, String str, String str2, boolean z, final String str3, int i, boolean z2) {
        if (context != null) {
            Log.d("automation_log", "init ISCrashReporter");
            this.f16311a = context;
            if (!TextUtils.isEmpty(str2)) {
                this.f16312b = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f16318i = str;
            }
            this.f16315f = str3;
            if (z) {
                C6399a aVar = new C6399a(i);
                aVar.f16280c = z2;
                aVar.f16279b = true;
                aVar.f16278a = new C6405b() {
                    /* renamed from: a */
                    public final void mo35911a() {
                        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                        StringBuilder sb = new StringBuilder(128);
                        for (Thread next : allStackTraces.keySet()) {
                            StackTraceElement[] stackTrace = next.getStackTrace();
                            if (stackTrace != null && stackTrace.length > 0) {
                                sb.append("*** Thread Name ");
                                sb.append(next.getName());
                                sb.append(" Thread ID ");
                                sb.append(next.getId());
                                sb.append(" (");
                                sb.append(next.getState().toString());
                                sb.append(") ***\n");
                                for (StackTraceElement stackTraceElement : stackTrace) {
                                    sb.append(stackTraceElement.toString());
                                    sb.append(" ");
                                    sb.append(next.getState().toString());
                                    sb.append("\n");
                                }
                            }
                        }
                        C6416e.f16310c = sb.toString();
                    }

                    /* renamed from: b */
                    public final void mo35912b() {
                    }
                };
                aVar.start();
            }
            String a = m19261a(this.f16311a);
            if (!a.equals("none")) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CRep", 0);
                String string = sharedPreferences.getString("String1", this.f16314e);
                String string2 = sharedPreferences.getString("sId", this.f16315f);
                new StringBuilder();
                for (C6408c next : C6424f.m19284a()) {
                    String b = next.mo35917b();
                    String a2 = next.mo35916a();
                    String c = next.mo35918c();
                    String packageName = context.getPackageName();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("crashDate", b);
                        jSONObject.put("stacktraceCrash", a2);
                        jSONObject.put("crashType", c);
                        jSONObject.put("CrashReporterVersion", "1.0.5");
                        jSONObject.put("SDKVersion", VersionInfo.VERSION);
                        jSONObject.put("deviceLanguage", C6429h.m19303a(context));
                        jSONObject.put("appVersion", C6408c.m19242c(context, packageName));
                        jSONObject.put("deviceOSVersion", C6429h.m19315e());
                        jSONObject.put("network", a);
                        jSONObject.put("deviceApiLevel", C6429h.m19317f());
                        jSONObject.put("deviceModel", C6429h.m19319g());
                        jSONObject.put("deviceOS", C6429h.m19323i());
                        jSONObject.put("advertisingId", string);
                        jSONObject.put("isLimitAdTrackingEnabled", this.f16316g);
                        jSONObject.put("deviceOEM", C6429h.m19321h());
                        jSONObject.put("systemProperties", System.getProperties());
                        jSONObject.put("bundleId", packageName);
                        jSONObject.put("sId", string2);
                        JSONObject jSONObject2 = new JSONObject();
                        if (hashSet != null && !hashSet.isEmpty()) {
                            Iterator<String> it = hashSet.iterator();
                            while (it.hasNext()) {
                                String next2 = it.next();
                                try {
                                    if (jSONObject.has(next2)) {
                                        jSONObject2.put(next2, jSONObject.opt(next2));
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            jSONObject = jSONObject2;
                        }
                        this.f16313d = jSONObject;
                    } catch (Exception unused) {
                    }
                    if (this.f16313d.length() == 0) {
                        Log.d("ISCrashReport", " Is Empty");
                    } else {
                        new Thread(new Runnable() {
                            public final void run() {
                                try {
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C6416e.m19260a().f16318i).openConnection();
                                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                                    httpURLConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
                                    httpURLConnection.setRequestProperty("Accept", "application/json");
                                    httpURLConnection.setDoOutput(true);
                                    httpURLConnection.setDoInput(true);
                                    Log.i("JSON", C6416e.this.f16313d.toString());
                                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                                    dataOutputStream.writeBytes(C6416e.this.f16313d.toString());
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                    Log.i("STATUS", String.valueOf(httpURLConnection.getResponseCode()));
                                    Log.i("MSG", httpURLConnection.getResponseMessage());
                                    httpURLConnection.disconnect();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }).start();
                        C6424f.m19287c();
                    }
                }
            }
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        String[] C = C6429h.m19297C(context);
                        if (C != null && C.length == 2) {
                            if (!TextUtils.isEmpty(C[0])) {
                                String unused = C6416e.this.f16314e = C[0];
                            }
                            boolean unused2 = C6416e.this.f16316g = Boolean.parseBoolean(C[1]);
                            SharedPreferences.Editor edit = context.getSharedPreferences("CRep", 0).edit();
                            edit.putString("String1", C6416e.this.f16314e);
                            edit.putString("sId", str3);
                            edit.apply();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
