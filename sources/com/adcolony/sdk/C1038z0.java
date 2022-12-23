package com.adcolony.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import androidx.preference.PreferenceManager;
import com.adcolony.sdk.C0817e0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.CRC32;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.z0 */
class C1038z0 {

    /* renamed from: a */
    private static ExecutorService f908a = m1219h();

    /* renamed from: b */
    static Handler f909b;

    /* renamed from: com.adcolony.sdk.z0$a */
    class C1039a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f910a;

        /* renamed from: b */
        final /* synthetic */ String f911b;

        /* renamed from: c */
        final /* synthetic */ int f912c;

        C1039a(Context context, String str, int i) {
            this.f910a = context;
            this.f911b = str;
            this.f912c = i;
        }

        public void run() {
            Toast.makeText(this.f910a, this.f911b, this.f912c).show();
        }
    }

    /* renamed from: com.adcolony.sdk.z0$b */
    interface C1040b extends Runnable {
        /* renamed from: a */
        boolean mo10251a();
    }

    /* renamed from: a */
    static boolean m1190a(ExecutorService executorService, Runnable runnable) {
        try {
            executorService.execute(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static String m1196b(Context context, String str) {
        return m1197b(m1203c(context), str);
    }

    /* renamed from: c */
    static SharedPreferences m1203c(Context context) {
        try {
            Class.forName("androidx.preference.PreferenceManager");
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (ClassNotFoundException unused) {
            return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
        }
    }

    @Deprecated
    /* renamed from: d */
    static int m1208d() {
        Context a = C0714a.m129a();
        if (a == null) {
            return 0;
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            new C0817e0.C0818a().mo10684a("Failed to retrieve package info.").mo10685a(C0817e0.f434i);
            return 0;
        }
    }

    /* renamed from: e */
    private static Handler m1211e() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        if (f909b == null) {
            f909b = new Handler(mainLooper);
        }
        return f909b;
    }

    /* renamed from: f */
    static int m1215f(String str) {
        try {
            return (int) Long.parseLong(str, 16);
        } catch (NumberFormatException unused) {
            new C0817e0.C0818a().mo10684a("Unable to parse '").mo10684a(str).mo10684a("' as a color.").mo10685a(C0817e0.f432g);
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: g */
    static boolean m1218g() {
        Context a = C0714a.m129a();
        return a != null && Build.VERSION.SDK_INT >= 24 && (a instanceof Activity) && ((Activity) a).isInMultiWindowMode();
    }

    /* renamed from: h */
    static ExecutorService m1219h() {
        return new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: com.adcolony.sdk.z0$c */
    static class C1041c {

        /* renamed from: a */
        private long f913a;

        /* renamed from: b */
        private long f914b = System.currentTimeMillis();

        C1041c(long j) {
            mo11153a(j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11153a(long j) {
            this.f913a = j;
            this.f914b = System.currentTimeMillis() + this.f913a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public long mo11155b() {
            return this.f913a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public long mo11156c() {
            return this.f914b - this.f913a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public long mo11157d() {
            long currentTimeMillis = this.f914b - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                return 0;
            }
            return currentTimeMillis;
        }

        public String toString() {
            return String.valueOf(((double) mo11157d()) / 1000.0d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo11154a() {
            return mo11157d() == 0;
        }
    }

    /* renamed from: a */
    static boolean m1186a(Runnable runnable) {
        return m1190a(f908a, runnable);
    }

    /* renamed from: b */
    static String m1197b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, (String) null);
        } catch (ClassCastException unused) {
            C0817e0.C0818a aVar = new C0817e0.C0818a();
            aVar.mo10684a("Key " + str + " in SharedPreferences ").mo10684a("does not have a String value.").mo10685a(C0817e0.f432g);
            return null;
        }
    }

    /* renamed from: a */
    static int m1171a(Context context, String str) {
        return m1172a(m1203c(context), str);
    }

    /* renamed from: a */
    static int m1172a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            C0817e0.C0818a aVar = new C0817e0.C0818a();
            aVar.mo10684a("Key " + str + " in SharedPreferences ").mo10684a("does not have an int value.").mo10685a(C0817e0.f432g);
            return -1;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", r1).parse(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return new java.text.SimpleDateFormat("yyyy-MM-dd", r1).parse(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0021 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Date m1217g(java.lang.String r5) {
        /*
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "yyyy-MM-dd'T'HH:mmZ"
            r0.<init>(r2, r1)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "yyyy-MM-dd'T'HH:mm:ssZ"
            r2.<init>(r3, r1)
            java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat
            java.lang.String r4 = "yyyy-MM-dd"
            r3.<init>(r4, r1)
            java.util.Date r5 = r0.parse(r5)     // Catch:{ Exception -> 0x001c }
            return r5
        L_0x001c:
            java.util.Date r5 = r2.parse(r5)     // Catch:{ Exception -> 0x0021 }
            return r5
        L_0x0021:
            java.util.Date r5 = r3.parse(r5)     // Catch:{ Exception -> 0x0026 }
            return r5
        L_0x0026:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C1038z0.m1217g(java.lang.String):java.util.Date");
    }

    /* renamed from: c */
    static C0823f1 m1204c(C0823f1 f1Var) {
        f1Var.mo10721a(new String[]{"ads_to_restore"});
        return f1Var;
    }

    /* renamed from: f */
    static int m1214f(Context context) {
        int identifier;
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: b */
    static C0823f1 m1194b(C0823f1 f1Var) {
        f1Var.mo10749r("launch_metadata");
        return f1Var;
    }

    /* renamed from: e */
    static boolean m1213e(String str) {
        if (str != null && str.length() <= 128) {
            return true;
        }
        new C0817e0.C0818a().mo10684a("String must be non-null and the max length is 128 characters.").mo10685a(C0817e0.f431f);
        return false;
    }

    /* renamed from: b */
    static String m1195b() {
        Application application;
        Context a = C0714a.m129a();
        if (a == null) {
            return "";
        }
        if (a instanceof Application) {
            application = (Application) a;
        } else {
            application = ((Activity) a).getApplication();
        }
        PackageManager packageManager = application.getPackageManager();
        try {
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(a.getPackageName(), 0)).toString();
        } catch (Exception unused) {
            new C0817e0.C0818a().mo10684a("Failed to retrieve application label.").mo10685a(C0817e0.f434i);
            return "";
        }
    }

    /* renamed from: c */
    static boolean m1207c(String str) {
        Application application;
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        try {
            if (a instanceof Application) {
                application = (Application) a;
            } else {
                application = ((Activity) a).getApplication();
            }
            application.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    static C0823f1 m1177a(C0823f1 f1Var) {
        C0823f1 f1Var2 = f1Var;
        f1Var2.mo10721a(new String[]{"data_path", "media_path", "temp_storage_path", "device_api", "display_dpi", "mac_address", "memory_class", "memory_used_mb", DeviceRequestsHelper.DEVICE_INFO_MODEL, "arch", "timezone_ietf", "timezone_gmt_m", "timezone_dst_m", "density", "dark_mode", "launch_metadata"});
        return f1Var2;
    }

    /* renamed from: d */
    static String m1210d(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: f */
    static String m1216f() {
        Context a = C0714a.m129a();
        return (!(a instanceof Activity) || a.getResources().getConfiguration().orientation != 1) ? "landscape" : "portrait";
    }

    /* renamed from: d */
    static int m1209d(String str) {
        str.hashCode();
        if (!str.equals("portrait")) {
            return !str.equals("landscape") ? -1 : 1;
        }
        return 0;
    }

    /* renamed from: e */
    static C0819e1 m1212e(Context context) {
        C0819e1 a = C0764c0.m308a();
        if (context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    a = C0764c0.m308a();
                    int i = 0;
                    while (true) {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length) {
                            break;
                        }
                        a.mo10692b(strArr[i]);
                        i++;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return a;
    }

    /* renamed from: c */
    static String m1205c() {
        Context a = C0714a.m129a();
        if (a == null) {
            return "1.0";
        }
        try {
            return a.getPackageManager().getPackageInfo(a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            new C0817e0.C0818a().mo10684a("Failed to retrieve package info.").mo10685a(C0817e0.f434i);
            return "1.0";
        }
    }

    /* renamed from: a */
    static int m1174a(String str) {
        CRC32 crc32 = new CRC32();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            crc32.update(str.charAt(i));
        }
        return (int) crc32.getValue();
    }

    /* renamed from: c */
    static boolean m1206c(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m1211e()) == null) {
            return false;
        }
        e.removeCallbacks(runnable);
        return true;
    }

    /* renamed from: b */
    static String m1199b(String str) {
        try {
            return C0814d1.m436a(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    static boolean m1202b(Runnable runnable) {
        Handler e;
        if (runnable == null || (e = m1211e()) == null) {
            return false;
        }
        if (e.getLooper() != Looper.myLooper()) {
            return e.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: a */
    static String m1178a() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    static C0819e1 m1176a(int i) {
        C0819e1 a = C0764c0.m308a();
        for (int i2 = 0; i2 < i; i2++) {
            C0764c0.m315a(a, m1178a());
        }
        return a;
    }

    /* renamed from: a */
    static boolean m1187a(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        if (j <= 0) {
            return m1202b(runnable);
        }
        Handler e = m1211e();
        if (e != null) {
            return e.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: b */
    static boolean m1201b(AudioManager audioManager) {
        if (audioManager == null) {
            new C0817e0.C0818a().mo10684a("isAudioEnabled() called with a null AudioManager").mo10685a(C0817e0.f434i);
            return false;
        }
        try {
            if (audioManager.getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            new C0817e0.C0818a().mo10684a("Exception occurred when accessing AudioManager.getStreamVolume: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1185a(C1040b bVar) {
        Handler e;
        if (bVar == null || (e = m1211e()) == null) {
            return false;
        }
        e.removeCallbacks(bVar);
        if (bVar.mo10251a()) {
            return true;
        }
        if (e.getLooper() == Looper.myLooper()) {
            bVar.run();
            return true;
        }
        e.post(bVar);
        return true;
    }

    /* renamed from: a */
    static double m1170a(AudioManager audioManager) {
        if (audioManager == null) {
            new C0817e0.C0818a().mo10684a("getAudioVolume() called with a null AudioManager").mo10685a(C0817e0.f434i);
            return 0.0d;
        }
        try {
            double streamVolume = (double) audioManager.getStreamVolume(3);
            double streamMaxVolume = (double) audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume == 0.0d) {
                return 0.0d;
            }
            return streamVolume / streamMaxVolume;
        } catch (Exception e) {
            new C0817e0.C0818a().mo10684a("Exception occurred when accessing AudioManager: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            return 0.0d;
        }
    }

    /* renamed from: b */
    static int m1191b(Context context) {
        int i;
        if (context == null) {
            return 0;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            i = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        } else {
            i = context.getResources().getIdentifier("navigation_bar_height_landscape", "dimen", "android");
        }
        if (i > 0) {
            return context.getResources().getDimensionPixelSize(i);
        }
        return 0;
    }

    /* renamed from: b */
    static String m1198b(C0819e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo10690b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            str = str + e1Var.mo10691b(i);
        }
        return str;
    }

    /* renamed from: b */
    static int m1193b(C0983v0 v0Var) {
        boolean z = false;
        try {
            Context a = C0714a.m129a();
            if (a == null) {
                return 0;
            }
            int i = (int) (a.getPackageManager().getPackageInfo(a.getPackageName(), 0).lastUpdateTime / 1000);
            C0823f1 g = v0Var.mo11098g();
            int i2 = 1;
            if (!g.mo10722a("last_update")) {
                i2 = 2;
                z = true;
            } else if (C0764c0.m332d(g, "last_update") != i) {
                z = true;
            } else {
                i2 = 0;
            }
            if (z) {
                try {
                    C0764c0.m326b(g, "last_update", i);
                    v0Var.mo11092a(g);
                } catch (Exception unused) {
                    return i2;
                }
            }
            return i2;
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: a */
    static AudioManager m1175a(Context context) {
        if (context != null) {
            return (AudioManager) context.getSystemService("audio");
        }
        new C0817e0.C0818a().mo10684a("getAudioManager called with a null Context").mo10685a(C0817e0.f434i);
        return null;
    }

    /* renamed from: a */
    static boolean m1189a(String str, File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    try {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        instance.update(bArr, 0, read);
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to process file for MD5", e);
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                            new C0817e0.C0818a().mo10684a("Exception on closing MD5 input stream").mo10685a(C0817e0.f434i);
                        }
                        throw th;
                    }
                }
                boolean equals = str.equals(String.format("%40s", new Object[]{new BigInteger(1, instance.digest()).toString(16)}).replace(' ', '0'));
                try {
                    fileInputStream.close();
                } catch (IOException unused2) {
                    new C0817e0.C0818a().mo10684a("Exception on closing MD5 input stream").mo10685a(C0817e0.f434i);
                }
                return equals;
            } catch (FileNotFoundException unused3) {
                new C0817e0.C0818a().mo10684a("Exception while getting FileInputStream").mo10685a(C0817e0.f434i);
                return false;
            }
        } catch (NoSuchAlgorithmException unused4) {
            new C0817e0.C0818a().mo10684a("Exception while getting Digest").mo10685a(C0817e0.f434i);
            return false;
        }
    }

    /* renamed from: b */
    static int m1192b(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[1]) / C0714a.m136b().mo10843n().mo10996s());
    }

    /* renamed from: b */
    private static void m1200b(Vibrator vibrator, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            m1181a(vibrator, j);
        } else {
            vibrator.vibrate(j);
        }
    }

    /* renamed from: a */
    static String m1179a(C0819e1 e1Var) throws JSONException {
        String str = "";
        for (int i = 0; i < e1Var.mo10690b(); i++) {
            if (i > 0) {
                str = str + ",";
            }
            switch (e1Var.mo10691b(i)) {
                case 1:
                    str = str + "MO";
                    break;
                case 2:
                    str = str + "TU";
                    break;
                case 3:
                    str = str + "WE";
                    break;
                case 4:
                    str = str + "TH";
                    break;
                case 5:
                    str = str + "FR";
                    break;
                case 6:
                    str = str + "SA";
                    break;
                case 7:
                    str = str + "SU";
                    break;
            }
        }
        return str;
    }

    /* renamed from: a */
    static boolean m1184a(Intent intent, boolean z) {
        try {
            Context a = C0714a.m129a();
            if (a == null) {
                return false;
            }
            if (!(a instanceof Activity)) {
                intent.addFlags(268435456);
            }
            AdColonyInterstitial j = C0714a.m136b().mo10839j();
            if (j != null && j.mo10392i()) {
                j.mo10384e().mo10945f();
            }
            if (z) {
                a.startActivity(Intent.createChooser(intent, "Handle this via..."));
                return true;
            }
            a.startActivity(intent);
            return true;
        } catch (Exception e) {
            new C0817e0.C0818a().mo10684a(e.toString()).mo10685a(C0817e0.f432g);
            return false;
        }
    }

    /* renamed from: a */
    static boolean m1183a(Intent intent) {
        return m1184a(intent, false);
    }

    /* renamed from: a */
    static boolean m1188a(String str, int i) {
        Context a = C0714a.m129a();
        if (a == null) {
            return false;
        }
        m1202b((Runnable) new C1039a(a, str, i));
        return true;
    }

    /* renamed from: a */
    static String m1180a(C0983v0 v0Var) {
        C0823f1 g = v0Var.mo11098g();
        String h = C0764c0.m336h(g, "adc_alt_id");
        if (!h.isEmpty()) {
            return h;
        }
        String a = m1178a();
        C0764c0.m319a(g, "adc_alt_id", a);
        v0Var.mo11092a(g);
        return a;
    }

    /* renamed from: a */
    static int m1173a(View view) {
        if (view == null) {
            return 0;
        }
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return (int) (((float) iArr[0]) / C0714a.m136b().mo10843n().mo10996s());
    }

    /* renamed from: a */
    static boolean m1182a(Context context, long j) {
        try {
            Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
            if (vibrator == null || !vibrator.hasVibrator()) {
                return false;
            }
            m1200b(vibrator, j);
            return true;
        } catch (Exception unused) {
            new C0817e0.C0818a().mo10684a("Vibrate command failed.").mo10685a(C0817e0.f431f);
            return false;
        }
    }

    /* renamed from: a */
    private static void m1181a(Vibrator vibrator, long j) {
        vibrator.vibrate(VibrationEffect.createOneShot(j, -1));
    }
}
