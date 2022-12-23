package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.internal.security.CertificateUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.ic */
/* compiled from: DisplayInfo */
public class C6252ic {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15832a = C6252ic.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f15833b = null;

    /* renamed from: a */
    public static int m18654a(int i) {
        return Math.round(((float) i) * m18655a().f15840c);
    }

    /* renamed from: a */
    public static C6255id m18655a() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return new C6255id(0, 0, 2.0f);
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        float f = displayMetrics.density;
        return new C6255id(Math.round(((float) displayMetrics.widthPixels) / f), Math.round(((float) displayMetrics.heightPixels) / f), f);
    }

    /* renamed from: b */
    public static int m18660b(int i) {
        return Math.round(((float) i) / m18655a().f15840c);
    }

    /* renamed from: b */
    public static byte m18659b() {
        Context c = C6227ho.m18551c();
        if (c == null) {
            return 1;
        }
        int rotation = ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 3;
        }
        if (rotation == 2) {
            return 2;
        }
        if (rotation != 3) {
            return 1;
        }
        return 4;
    }

    /* renamed from: c */
    public static Map<String, String> m18662c() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("d-device-screen-density", String.valueOf(m18655a().f15840c));
            C6255id a = m18655a();
            hashMap.put("d-device-screen-size", a.f15838a + "X" + a.f15839b);
            Context c = C6227ho.m18551c();
            if (c == null) {
                str = "0x0";
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) c.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                str = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
            }
            hashMap.put("d-density-dependent-screen-size", str);
            hashMap.put("d-orientation", String.valueOf(m18659b()));
            hashMap.put("d-textsize", String.valueOf(new TextView(C6227ho.m18551c()).getTextSize()));
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m18657a(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (rootWindowInsets = window.getDecorView().getRootWindowInsets()) != null) {
            m18658a(context, rootWindowInsets);
        }
    }

    /* renamed from: a */
    public static void m18658a(final Context context, final WindowInsets windowInsets) {
        C6227ho.m18543a((Runnable) new Runnable() {
            public final void run() {
                try {
                    String[] split = windowInsets.getSystemGestureInsets().toString().split("Insets");
                    StringBuffer stringBuffer = new StringBuffer();
                    if (split.length > 1) {
                        String[] split2 = split[1].replaceAll("[^0-9,=a-zA-Z]*", "").split(",");
                        stringBuffer.append("{");
                        for (int i = 0; i < split2.length; i++) {
                            String[] split3 = split2[i].split("=");
                            if (split3.length == 2) {
                                stringBuffer.append("\"" + split3[0] + "\"");
                                stringBuffer.append(CertificateUtil.DELIMITER);
                                stringBuffer.append(C6252ic.m18660b(Integer.parseInt(split3[1])));
                                if (i < split2.length - 1) {
                                    stringBuffer.append(", ");
                                }
                            }
                        }
                        stringBuffer.append("}");
                    }
                    if (stringBuffer.length() > 0) {
                        String unused = C6252ic.f15833b = stringBuffer.toString();
                        C6216hf.m18493a(context, "gesture_info_store").mo35416a("gesture_margin", stringBuffer.toString());
                    }
                } catch (Exception unused2) {
                    String unused3 = C6252ic.f15832a;
                }
            }
        });
    }

    /* renamed from: d */
    public static String m18663d() {
        String str;
        String str2 = f15833b;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "gesture_info_store").mo35419b("gesture_margin");
        }
        f15833b = str;
        return str;
    }

    /* renamed from: b */
    public static C6254a m18661b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new C6254a(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    /* renamed from: com.inmobi.media.ic$a */
    /* compiled from: DisplayInfo */
    public static class C6254a {

        /* renamed from: a */
        public int f15836a;

        /* renamed from: b */
        public int f15837b;

        public C6254a(int i, int i2) {
            this.f15836a = i;
            this.f15837b = i2;
        }

        public final String toString() {
            return "Size{width=" + this.f15836a + ", height=" + this.f15837b + '}';
        }
    }
}
