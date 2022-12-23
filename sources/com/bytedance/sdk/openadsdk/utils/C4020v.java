package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2962d;
import com.bytedance.sdk.component.utils.C2967g;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.core.video.p163b.C3661a;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.utils.v */
/* compiled from: UIUtils */
public class C4020v {

    /* renamed from: a */
    private static float f10267a = -1.0f;

    /* renamed from: b */
    private static int f10268b = -1;

    /* renamed from: c */
    private static float f10269c = -1.0f;

    /* renamed from: d */
    private static int f10270d = -1;

    /* renamed from: e */
    private static int f10271e = -1;

    /* renamed from: f */
    private static WindowManager f10272f;

    /* renamed from: a */
    public static void m13279a(Context context, C3498n nVar, String str, WebView webView) {
    }

    /* renamed from: a */
    private static boolean m13295a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    static {
        m13278a(C3578m.m11231a());
    }

    /* renamed from: a */
    private static boolean m13294a() {
        return f10267a < 0.0f || f10268b < 0 || f10269c < 0.0f || f10270d < 0 || f10271e < 0;
    }

    /* renamed from: a */
    public static void m13278a(Context context) {
        m13280a(context, false);
    }

    /* renamed from: a */
    public static void m13280a(Context context, boolean z) {
        Context a = context == null ? C3578m.m11231a() : context;
        if (a != null) {
            f10272f = (WindowManager) a.getSystemService("window");
            if (m13294a() || z) {
                DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
                f10267a = displayMetrics.density;
                f10268b = displayMetrics.densityDpi;
                f10269c = displayMetrics.scaledDensity;
                f10270d = displayMetrics.widthPixels;
                f10271e = displayMetrics.heightPixels;
            }
            if (context != null && context.getResources() != null && context.getResources().getConfiguration() != null) {
                if (context.getResources().getConfiguration().orientation == 1) {
                    int i = f10270d;
                    int i2 = f10271e;
                    if (i > i2) {
                        f10270d = i2;
                        f10271e = i;
                        return;
                    }
                    return;
                }
                int i3 = f10270d;
                int i4 = f10271e;
                if (i3 < i4) {
                    f10270d = i4;
                    f10271e = i3;
                }
            }
        }
    }

    /* renamed from: a */
    public static int m13272a(Context context, float f) {
        m13278a(context);
        float f2 = m13317f(context);
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: b */
    public static float m13297b(Context context, float f) {
        m13278a(context);
        return (f * m13314e(context)) + 0.5f;
    }

    /* renamed from: c */
    public static float m13305c(Context context, float f) {
        m13278a(context);
        return f * m13314e(context);
    }

    /* renamed from: d */
    public static int m13311d(Context context, float f) {
        m13280a(context, true);
        float e = m13314e(context);
        if (e <= 0.0f) {
            e = 1.0f;
        }
        return (int) ((f / e) + 0.5f);
    }

    /* renamed from: b */
    public static int[] m13303b(Context context) {
        if (context == null) {
            return null;
        }
        if (f10272f == null) {
            f10272f = (WindowManager) C3578m.m11231a().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f10272f;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (Build.VERSION.SDK_INT >= 14 && Build.VERSION.SDK_INT < 17) {
                try {
                    i = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    i2 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
                    i = point.x;
                    i2 = point.y;
                } catch (Exception unused2) {
                }
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    /* renamed from: c */
    public static int m13306c(Context context) {
        m13278a(context);
        return f10270d;
    }

    /* renamed from: d */
    public static int m13310d(Context context) {
        m13278a(context);
        return f10271e;
    }

    /* renamed from: e */
    public static float m13314e(Context context) {
        m13278a(context);
        return f10267a;
    }

    /* renamed from: f */
    public static float m13317f(Context context) {
        m13278a(context);
        return f10269c;
    }

    /* renamed from: g */
    public static int m13319g(Context context) {
        m13278a(context);
        return f10268b;
    }

    /* renamed from: a */
    public static void m13283a(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) view.getParent()).setTouchDelegate(new C2967g(rect, view));
    }

    /* renamed from: a */
    public static int[] m13296a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: b */
    public static int[] m13304b(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: c */
    public static int[] m13309c(View view) {
        if (view == null) {
            return null;
        }
        return new int[]{view.getWidth(), view.getHeight()};
    }

    /* renamed from: a */
    public static void m13282a(View view, int i) {
        if (view != null && view.getVisibility() != i && m13295a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: d */
    public static boolean m13313d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public static void m13291a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    public static void m13301b(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            m13286a(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    private static void m13286a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null) {
            if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4) {
                if (i != -3) {
                    marginLayoutParams.leftMargin = i;
                }
                if (i2 != -3) {
                    marginLayoutParams.topMargin = i2;
                }
                if (i3 != -3) {
                    marginLayoutParams.rightMargin = i3;
                }
                if (i4 != -3) {
                    marginLayoutParams.bottomMargin = i4;
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m13275a(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    /* renamed from: e */
    public static void m13316e(final View view) {
        if (view != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    C4020v.m13282a(view, 8);
                    ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f}).setDuration(0).start();
                }
            });
            ofFloat.setDuration(800);
            ofFloat.start();
        }
    }

    /* renamed from: f */
    public static void m13318f(View view) {
        if (view != null) {
            m13282a(view, 0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.0f, 1.0f});
            ofFloat.addListener(new AnimatorListenerAdapter() {
                public void onAnimationStart(Animator animator) {
                    super.onAnimationEnd(animator);
                }
            });
            ofFloat.setDuration(300);
            ofFloat.start();
        }
    }

    /* renamed from: e */
    public static int m13315e(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: h */
    public static int m13320h(Context context) {
        if (context == null) {
            context = C3578m.m11231a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: i */
    public static int m13321i(Context context) {
        if (context == null) {
            context = C3578m.m11231a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: j */
    public static float m13322j(Context context) {
        if (context == null) {
            context = C3578m.m11231a();
        }
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return (float) context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static void m13277a(Activity activity) {
        if (activity != null) {
            try {
                if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(8);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(3846);
                    activity.getWindow().addFlags(1792);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m13300b(Activity activity) {
        if (activity != null) {
            try {
                activity.getWindow().getDecorView().setSystemUiVisibility(1792);
                activity.getWindow().clearFlags(1792);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static boolean m13308c(Activity activity) {
        if (m13312d(activity) || m13274a("ro.miui.notch", activity) == 1 || m13323k(activity) || m13327o(activity) || m13324l(activity) || m13325m(activity) || m13326n(activity)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m13312d(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        DisplayCutout displayCutout = null;
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            }
            if (displayCutout != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static int m13274a(String str, Activity activity) {
        if (!C4003m.m13129e()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(loadClass, new Object[]{new String(str), new Integer(0)})).intValue();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
            return 0;
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return 0;
        } catch (IllegalArgumentException e4) {
            e4.printStackTrace();
            return 0;
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13323k(android.content.Context r3) {
        /*
            r0 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "com.huawei.android.util.HwNotchSizeUtil"
            java.lang.Class r3 = r3.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.String r1 = "hasNotchInScreen"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Object r3 = r1.invoke(r3, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            boolean r0 = r3.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x0022, all -> 0x0020 }
            goto L_0x0022
        L_0x0020:
            r3 = move-exception
            throw r3
        L_0x0022:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4020v.m13323k(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m13324l(android.content.Context r5) {
        /*
            r0 = 0
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "android.util.FtFeature"
            java.lang.Class r5 = r5.loadClass(r1)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.String r1 = "isFeatureSupport"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3[r0] = r4     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.reflect.Method r1 = r5.getMethod(r1, r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r3 = 32
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            r2[r0] = r3     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Object r5 = r1.invoke(r5, r2)     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            boolean r0 = r5.booleanValue()     // Catch:{ ClassNotFoundException | Exception | NoSuchMethodException -> 0x002f, all -> 0x002d }
            goto L_0x002f
        L_0x002d:
            r5 = move-exception
            throw r5
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.C4020v.m13324l(android.content.Context):boolean");
    }

    /* renamed from: m */
    public static boolean m13325m(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    /* renamed from: n */
    public static boolean m13326n(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string == null || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: o */
    public static boolean m13327o(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: a */
    public static void m13284a(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            C2975l.m8391e("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public static void m13285a(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            C2975l.m8391e("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    /* renamed from: a */
    public static void m13281a(View view, float f) {
        if (view != null) {
            view.setAlpha(f);
        }
    }

    /* renamed from: a */
    public static void m13290a(TextView textView, TTRatingBar2 tTRatingBar2, C3498n nVar, Context context) {
        m13289a(textView, tTRatingBar2, (nVar == null || nVar.mo19657aa() == null) ? -1.0d : nVar.mo19657aa().mo19500d(), context);
    }

    /* renamed from: a */
    public static void m13289a(TextView textView, TTRatingBar2 tTRatingBar2, double d, Context context) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Double.valueOf(d)}));
        }
        m13293a(tTRatingBar2, d, 0, 14);
    }

    /* renamed from: a */
    public static void m13293a(TTRatingBar2 tTRatingBar2, double d, int i, int i2) {
        if (d < 0.0d) {
            tTRatingBar2.setVisibility(8);
            return;
        }
        tTRatingBar2.setVisibility(0);
        tTRatingBar2.mo20511a(d, i, i2);
    }

    /* renamed from: a */
    public static void m13288a(TextView textView, C3498n nVar, Context context, String str) {
        m13287a(textView, nVar.mo19657aa() != null ? nVar.mo19657aa().mo19501e() : -1, context, str);
    }

    /* renamed from: a */
    public static void m13287a(TextView textView, int i, Context context, String str) {
        StringBuilder sb;
        String str2;
        String a = C2984t.m8425a(context, str);
        if (i > 10000) {
            sb = new StringBuilder();
            sb.append(i / 1000);
            str2 = CampaignEx.JSON_KEY_AD_K;
        } else {
            sb = new StringBuilder();
            sb.append(i);
            str2 = "";
        }
        sb.append(str2);
        textView.setText(String.format(a, new Object[]{sb.toString()}));
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static Bitmap m13276a(SSWebView sSWebView) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, (Paint) null);
        Bitmap b = m13298b(sSWebView);
        if (b == null) {
            b = m13275a(webView);
        }
        webView.setLayerType(layerType, (Paint) null);
        if (b == null) {
            return null;
        }
        return C2962d.m8346a(b, b.getWidth() / 6, b.getHeight() / 6);
    }

    /* renamed from: a */
    public static void m13292a(C3498n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        final C3498n nVar2 = nVar;
        final String str4 = str;
        final String str5 = str2;
        final Bitmap bitmap2 = bitmap;
        final String str6 = str3;
        final long j2 = j;
        C2952e.m8314b(new C2955g("startCheckPlayableStatusPercentage") {
            public void run() {
                C4020v.m13307c(nVar2, str4, str5, bitmap2, str6, j2);
            }
        }, 5);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m13307c(C3498n nVar, String str, String str2, Bitmap bitmap, String str3, long j) {
        JSONObject jSONObject;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    if (!bitmap.isRecycled()) {
                        int a = m13273a(bitmap);
                        JSONObject jSONObject2 = null;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("url", str3);
                            if (j != -1) {
                                jSONObject3.put("page_id", j);
                            }
                            jSONObject3.put("render_type", "h5");
                            int i = 0;
                            jSONObject3.put("render_type_2", 0);
                            jSONObject3.put("is_blank", a == 100 ? 1 : 0);
                            jSONObject3.put("is_playable", C3501p.m10761a(nVar) ? 1 : 0);
                            if (C3661a.m11659a().mo20258a(nVar)) {
                                i = 1;
                            }
                            jSONObject3.put("usecache", i);
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("ad_extra_data", jSONObject3.toString());
                            } catch (JSONException unused) {
                                jSONObject2 = jSONObject;
                            }
                        } catch (JSONException unused2) {
                            jSONObject = jSONObject2;
                            C3156e.m9199c(C3578m.m11231a(), nVar, str, str2, jSONObject);
                        }
                        C3156e.m9199c(C3578m.m11231a(), nVar, str, str2, jSONObject);
                    }
                }
            } catch (Throwable th) {
                C2975l.m8391e("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>" + th.toString());
            }
        }
    }

    /* renamed from: b */
    private static Bitmap m13298b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m13273a(Bitmap bitmap) {
        try {
            ArrayList<Integer> b = m13299b(bitmap);
            if (b == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = b.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((((float) i2) / (((float) (bitmap.getWidth() * bitmap.getHeight())) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    private static ArrayList<Integer> m13299b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }
}
