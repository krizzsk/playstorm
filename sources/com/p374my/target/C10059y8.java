package com.p374my.target;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.my.target.y8 */
public class C10059y8 {

    /* renamed from: a */
    public static final AtomicInteger f25024a = new AtomicInteger(1);

    /* renamed from: b */
    public final Context f25025b;

    /* renamed from: com.my.target.y8$a */
    public static class C10060a {

        /* renamed from: a */
        public static final DisplayMetrics f25026a;

        /* renamed from: b */
        public static final float f25027b;

        /* renamed from: c */
        public static final int f25028c;

        static {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            f25026a = displayMetrics;
            f25027b = displayMetrics.density;
            f25028c = displayMetrics.densityDpi;
        }
    }

    /* renamed from: com.my.target.y8$b */
    public static class C10061b extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final String f25029a;

        public C10061b(String str) {
            this.f25029a = str;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setViewIdResourceName(this.f25029a);
        }
    }

    public C10059y8(Context context) {
        this.f25025b = context;
    }

    /* renamed from: a */
    public static float m29821a() {
        return C10060a.f25027b;
    }

    /* renamed from: a */
    public static int m29822a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: a */
    public static int m29823a(int i, int i2, int i3) {
        return i3 <= i ? i : i3 > i2 ? i2 : i3;
    }

    /* renamed from: a */
    public static int m29824a(int i, Context context) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static int m29825a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        C9672e0.m27882a("Unknown screen orientation. Defaulting to portrait.");
        return 9;
    }

    /* renamed from: a */
    public static int m29826a(int... iArr) {
        int i = 0;
        for (int max : iArr) {
            i = Math.max(max, i);
        }
        return i;
    }

    /* renamed from: a */
    public static DisplayMetrics m29827a(Context context) {
        Display defaultDisplay;
        Display display;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return displayMetrics;
            }
            display.getRealMetrics(displayMetrics);
        } else {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
                return displayMetrics;
            }
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: a */
    public static void m29828a(int i, int i2, int i3, int i4, View... viewArr) {
        int i5 = i3 - i;
        for (View view : viewArr) {
            if (view.getVisibility() != 8) {
                m29844c(view, ((i5 - view.getMeasuredHeight()) / 2) + i, i2);
                if (view.getMeasuredWidth() > 0) {
                    i2 += view.getMeasuredWidth() + i4;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m29829a(View view, int i, int i2) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        ColorDrawable colorDrawable2 = new ColorDrawable(i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, colorDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, colorDrawable);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{m29822a(i2), m29822a(i)}), stateListDrawable, (Drawable) null));
        } else if (i3 >= 18) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    public static void m29830a(View view, int i, int i2, int i3) {
        if (view != null && view.getVisibility() != 8) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i3));
        }
    }

    /* renamed from: a */
    public static void m29831a(View view, int i, int i2, int i3, int i4) {
        if (view != null && view.getVisibility() != 8) {
            int measuredWidth = i + (((i3 - i) - view.getMeasuredWidth()) / 2);
            int measuredHeight = i2 + (((i4 - i2) - view.getMeasuredHeight()) / 2);
            view.layout(measuredWidth, measuredHeight, view.getMeasuredWidth() + measuredWidth, view.getMeasuredHeight() + measuredHeight);
        }
    }

    /* renamed from: a */
    public static void m29832a(View view, int i, int i2, int i3, int i4, int i5) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i});
        float f = (float) i5;
        gradientDrawable.setCornerRadius(f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i2, i2});
        gradientDrawable2.setCornerRadius(f);
        if (i3 != 0) {
            gradientDrawable.setStroke(i4, i3);
            gradientDrawable2.setStroke(i4, i3);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            view.setBackground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}, StateSet.WILD_CARD}, new int[]{m29822a(i2), m29822a(i)}), stateListDrawable, (Drawable) null));
        } else if (i6 >= 16) {
            view.setBackground(stateListDrawable);
        } else {
            view.setBackgroundDrawable(stateListDrawable);
        }
    }

    /* renamed from: a */
    public static void m29833a(View view, String str) {
        view.setContentDescription(str);
        m29840b(view, str);
    }

    /* renamed from: a */
    public static boolean m29834a(Activity activity, View view) {
        while (view.isHardwareAccelerated() && (view.getLayerType() & 1) == 0) {
            if (!(view.getParent() instanceof View)) {
                Window window = activity.getWindow();
                return (window == null || (window.getAttributes().flags & 16777216) == 0) ? false : true;
            }
            view = (View) view.getParent();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m29835a(View view) {
        Window window;
        View view2 = view;
        while (view2.isHardwareAccelerated() && (view2.getLayerType() & 1) == 0) {
            if (!(view2.getParent() instanceof View)) {
                Context context = view.getContext();
                if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null) {
                    return true;
                }
                return (window.getAttributes().flags & 16777216) != 0;
            }
            view2 = (View) view2.getParent();
        }
        return false;
    }

    /* renamed from: b */
    public static int m29836b() {
        return C10060a.f25028c;
    }

    /* renamed from: b */
    public static Point m29837b(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return point;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            point.y = bounds.height() - i2;
            point.x = bounds.width() - i;
            return point;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    /* renamed from: b */
    public static void m29838b(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.layout(i2 - view.getMeasuredWidth(), i, i2, view.getMeasuredHeight() + i);
        }
    }

    /* renamed from: b */
    public static void m29839b(View view, int i, int i2, int i3) {
        m29832a(view, i, i2, 0, 0, i3);
    }

    /* renamed from: b */
    public static void m29840b(View view, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setAccessibilityDelegate(new C10061b(str));
        }
    }

    /* renamed from: c */
    public static int m29841c() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f25024a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: c */
    public static int m29842c(int i) {
        return Math.round(((float) i) / (((float) m29836b()) / 160.0f));
    }

    /* renamed from: c */
    public static C10059y8 m29843c(Context context) {
        return new C10059y8(context);
    }

    /* renamed from: c */
    public static void m29844c(View view, int i, int i2) {
        if (view != null && view.getVisibility() != 8) {
            view.layout(i2, i, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + i);
        }
    }

    /* renamed from: d */
    public static void m29845d(View view, int i, int i2) {
        if (view.getVisibility() != 8) {
            view.layout(i2 - view.getMeasuredWidth(), i - view.getMeasuredHeight(), i2, i);
        }
    }

    /* renamed from: d */
    public static boolean m29846d() {
        try {
            Class.forName(RecyclerView.class.getName());
            return true;
        } catch (Throwable unused) {
            C9672e0.m27882a("RecyclerView doesn't exist, add RecyclerView dependency to show cards");
            return false;
        }
    }

    /* renamed from: e */
    public static void m29847e(View view, int i, int i2) {
        if (view != null && view.getVisibility() != 8) {
            view.layout(i2, i - view.getMeasuredHeight(), view.getMeasuredWidth() + i2, i);
        }
    }

    /* renamed from: a */
    public int mo65777a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f25025b.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    public int mo65778b(int i) {
        return mo65777a((float) i);
    }

    /* renamed from: d */
    public int mo65779d(int i) {
        return (int) TypedValue.applyDimension(2, (float) i, this.f25025b.getResources().getDisplayMetrics());
    }
}
