package com.ogury.p375cm;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ogury.core.OguryError;
import com.ogury.p375cm.internal.aabca;
import com.ogury.p375cm.internal.abbbb;
import com.ogury.p375cm.internal.abbbc;
import com.ogury.p375cm.internal.babbc;
import com.ogury.p375cm.internal.babca;
import com.ogury.p375cm.internal.bbabb;
import com.ogury.p375cm.internal.bbabc;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ogury.cm.ConsentActivity */
public class ConsentActivity extends Activity {

    /* renamed from: a */
    public static final aaaaa f25527a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final FrameLayout.LayoutParams f25528b = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: c */
    private HashMap f25529c;

    /* renamed from: com.ogury.cm.ConsentActivity$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        private static int m30513a(int i, int i2) {
            int i3 = i % 1;
            return i3 >= 0 ? i3 : i3 + 1;
        }

        /* renamed from: a */
        public static int m30514a(int i, int i2, int i3) {
            return i >= i2 ? i2 : i2 - m30513a(m30513a(i2, 1) - m30513a(i, 1), 1);
        }

        /* renamed from: a */
        public static /* synthetic */ long m30515a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
            bbabc.m30943b(inputStream, "receiver$0");
            bbabc.m30943b(outputStream, "out");
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            long j = 0;
            while (read >= 0) {
                outputStream.write(bArr, 0, read);
                j += (long) read;
                read = inputStream.read(bArr);
            }
            return j;
        }

        /* renamed from: a */
        private static long m30516a(Reader reader, Writer writer, int i) {
            bbabc.m30943b(reader, "receiver$0");
            bbabc.m30943b(writer, "out");
            char[] cArr = new char[8192];
            int read = reader.read(cArr);
            long j = 0;
            while (read >= 0) {
                writer.write(cArr, 0, read);
                j += (long) read;
                read = reader.read(cArr);
            }
            return j;
        }

        /* renamed from: a */
        public static NetworkInfo m30517a(Context context) {
            bbabc.m30943b(context, "receiver$0");
            bbabc.m30943b(context, "receiver$0");
            bbabc.m30943b("android.permission.ACCESS_NETWORK_STATE", "permission");
            if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
                return null;
            }
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                return ((ConnectivityManager) systemService).getActiveNetworkInfo();
            }
            throw new babca("null cannot be cast to non-null type android.net.ConnectivityManager");
        }

        /* renamed from: a */
        public static <A, B> babbc<A, B> m30518a(A a, B b) {
            return new babbc<>(a, b);
        }

        /* renamed from: a */
        public static String m30519a(Reader reader) {
            bbabc.m30943b(reader, "receiver$0");
            StringWriter stringWriter = new StringWriter();
            m30516a(reader, (Writer) stringWriter, 8192);
            String stringWriter2 = stringWriter.toString();
            bbabc.m30940a((Object) stringWriter2, "buffer.toString()");
            return stringWriter2;
        }

        /* renamed from: a */
        public static void m30520a(Closeable closeable) {
            bbabc.m30943b(closeable, "receiver$0");
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public static boolean m30521a(JSONObject jSONObject) {
            bbabc.m30943b(jSONObject, "receiver$0");
            return jSONObject.length() == 0;
        }

        /* renamed from: b */
        public static boolean m30522b(Context context) {
            bbabc.m30943b(context, "receiver$0");
            NetworkInfo a = m30517a(context);
            return a != null && a.isConnected();
        }

        /* renamed from: c */
        public static String m30523c(Context context) {
            PackageInfo packageInfo;
            bbabc.m30943b(context, "receiver$0");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                return null;
            }
            return packageInfo.versionName;
        }
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f25529c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f25529c == null) {
            this.f25529c = new HashMap();
        }
        View view = (View) this.f25529c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25529c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            finish();
            return;
        }
        aabca aabca = aabca.f25663a;
        aabca.m30654a("DISPLAYING");
        aaaac aaaac = aaaac.f25543a;
        if (aaaac.m30543c() != null) {
            Context context = this;
            FrameLayout frameLayout = new FrameLayout(context, (AttributeSet) null);
            frameLayout.setLayoutParams(this.f25528b);
            aaaac aaaac2 = aaaac.f25543a;
            aaaaa b = aaaac.m30542b();
            if (b != null) {
                b.mo66478a(context);
            }
            aaaac aaaac3 = aaaac.f25543a;
            WebView c = aaaac.m30543c();
            if (Build.VERSION.SDK_INT < 16 && c != null) {
                c.setLayerType(1, (Paint) null);
            }
            aaaac aaaac4 = aaaac.f25543a;
            frameLayout.addView(aaaac.m30543c(), this.f25528b);
            aaaac aaaac5 = aaaac.f25543a;
            aaaac.m30534a((WebView) null);
            setContentView(frameLayout);
            return;
        }
        aaaac aaaac6 = aaaac.f25543a;
        abbbb a = aaaac.m30532a();
        if (a != null) {
            a.mo66485a(new OguryError(1003, "Cached webview has been destroyed"));
        }
        abbbc abbbc = abbbc.f25732a;
        abbbc.m30748b("Cached webview has been destroyed");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        aaaac aaaac = aaaac.f25543a;
        aaaac.m30534a((WebView) null);
        aaaac aaaac2 = aaaac.f25543a;
        aaaac.m30535a((aaaaa) null);
        super.onDestroy();
    }
}
