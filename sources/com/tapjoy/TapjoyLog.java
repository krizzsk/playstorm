package com.tapjoy;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.internal.C11710hg;
import com.tapjoy.internal.C11714hj;

public class TapjoyLog {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f27640a = TapjoyLog.class.getSimpleName();

    /* renamed from: b */
    private static int f27641b = 6;

    /* renamed from: c */
    private static int f27642c = 4;

    /* renamed from: d */
    private static int f27643d = 2;

    /* renamed from: e */
    private static boolean f27644e = false;

    /* renamed from: f */
    private static int f27645f = 6;

    public static void setDebugEnabled(boolean z) {
        boolean z2;
        f27644e = z;
        C11714hj a = C11714hj.m33999a();
        if (C11710hg.f28464a != z) {
            C11710hg.f28464a = z;
            if (z) {
                C11710hg.m33975a("The debug mode has been enabled");
            } else {
                C11710hg.m33975a("The debug mode has been disabled");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z && a.f28489j) {
            a.f28487h.mo72598a();
        }
        if (f27644e) {
            m33193a(TapjoyConstants.LOG_LEVEL_DEBUG_ON, false);
        } else {
            m33193a(TapjoyConstants.LOG_LEVEL_DEBUG_OFF, false);
        }
    }

    public static void setInternalLogging(boolean z) {
        if (z) {
            m33193a(TapjoyConstants.LOG_LEVEL_INTERNAL, true);
        }
    }

    /* renamed from: a */
    static void m33193a(String str, boolean z) {
        if (z || TapjoyAppSettings.getInstance() == null || TapjoyAppSettings.getInstance().f27487a == null) {
            if (str.equals(TapjoyConstants.LOG_LEVEL_INTERNAL)) {
                f27645f = f27643d;
                if (Build.VERSION.SDK_INT >= 19) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            TapjoyLog.m33194d(TapjoyLog.f27640a, "Enabling WebView debugging");
                            WebView.setWebContentsDebuggingEnabled(true);
                        }
                    });
                }
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_ON)) {
                f27645f = f27642c;
            } else if (str.equals(TapjoyConstants.LOG_LEVEL_DEBUG_OFF)) {
                f27645f = f27641b;
            } else {
                m33194d(f27640a, "unrecognized loggingLevel: ".concat(String.valueOf(str)));
                f27645f = f27641b;
            }
            String str2 = f27640a;
            m33194d(str2, "logThreshold=" + f27645f);
            return;
        }
        m33194d(f27640a, "setLoggingLevel -- log setting already persisted");
    }

    public static boolean isLoggingEnabled() {
        return f27644e;
    }

    /* renamed from: i */
    public static void m33197i(String str, String str2) {
        m33192a(4, str, str2);
    }

    /* renamed from: e */
    public static void m33196e(String str, String str2) {
        m33195e(str, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTERNAL_ERROR, str2));
    }

    /* renamed from: e */
    public static void m33195e(String str, TapjoyErrorMessage tapjoyErrorMessage) {
        if (tapjoyErrorMessage == null) {
            return;
        }
        if (f27645f == f27643d || tapjoyErrorMessage.getType() != TapjoyErrorMessage.ErrorType.INTERNAL_ERROR) {
            m33192a(6, str, tapjoyErrorMessage.toString());
        }
    }

    /* renamed from: w */
    public static void m33199w(String str, String str2) {
        m33192a(5, str, str2);
    }

    /* renamed from: d */
    public static void m33194d(String str, String str2) {
        m33192a(3, str, str2);
    }

    /* renamed from: v */
    public static void m33198v(String str, String str2) {
        m33192a(2, str, str2);
    }

    /* renamed from: a */
    private static void m33192a(int i, String str, String str2) {
        String str3 = f27640a + CertificateUtil.DELIMITER + str;
        if (f27645f > i) {
            return;
        }
        if (str2.length() > 4096) {
            int i2 = 0;
            while (i2 <= str2.length() / 4096) {
                int i3 = i2 * 4096;
                i2++;
                int i4 = i2 * 4096;
                if (i4 > str2.length()) {
                    i4 = str2.length();
                }
                Log.println(i, str3, str2.substring(i3, i4));
            }
            return;
        }
        Log.println(i, str3, str2);
    }
}
