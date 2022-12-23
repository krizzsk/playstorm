package com.tapjoy;

import android.content.Context;
import android.text.TextUtils;
import com.tapjoy.internal.C11434at;
import com.tapjoy.internal.C11706hf;
import com.tapjoy.internal.C11728ho;

public class TJPlacementManager {

    /* renamed from: a */
    private static final C11434at<String, TJCorePlacement> f27432a = C11434at.m33228a();

    /* renamed from: b */
    private static int f27433b = 0;

    /* renamed from: c */
    private static int f27434c = 0;

    /* renamed from: d */
    private static int f27435d = 3;

    /* renamed from: e */
    private static int f27436e = 3;

    public static TJPlacement createPlacement(Context context, String str, boolean z, TJPlacementListener tJPlacementListener) {
        TJCorePlacement a = m33112a(str, (String) null, (String) null, z, false);
        a.f27352j = z;
        a.f27345c.setPlacementType("sdk");
        a.setContext(context);
        return new TJPlacement(a, tJPlacementListener);
    }

    /* renamed from: a */
    public static TJPlacement m33113a(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f27432a) {
            tJPlacement = new TJPlacement(m33112a(str, str2, str3, false, false), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: b */
    public static TJPlacement m33114b(String str, String str2, String str3, TJPlacementListener tJPlacementListener) {
        TJPlacement tJPlacement;
        synchronized (f27432a) {
            tJPlacement = new TJPlacement(m33112a(str, str2, str3, false, true), tJPlacementListener);
        }
        return tJPlacement;
    }

    /* renamed from: a */
    static TJCorePlacement m33111a(String str) {
        TJCorePlacement tJCorePlacement;
        synchronized (f27432a) {
            tJCorePlacement = f27432a.get(str);
        }
        return tJCorePlacement;
    }

    public static void setCachedPlacementLimit(int i) {
        f27435d = i;
    }

    public static void setPreRenderedPlacementLimit(int i) {
        f27436e = i;
    }

    public static int getCachedPlacementLimit() {
        return f27435d;
    }

    public static int getPreRenderedPlacementLimit() {
        return f27436e;
    }

    public static int getCachedPlacementCount() {
        return f27433b;
    }

    public static int getPreRenderedPlacementCount() {
        return f27434c;
    }

    public static boolean canCachePlacement() {
        return getCachedPlacementCount() < getCachedPlacementLimit();
    }

    public static boolean canPreRenderPlacement() {
        return getPreRenderedPlacementCount() < getPreRenderedPlacementLimit();
    }

    public static void incrementPlacementCacheCount() {
        int i = f27433b + 1;
        f27433b = i;
        int i2 = f27435d;
        if (i > i2) {
            f27433b = i2;
        }
        printPlacementCacheInformation();
    }

    public static void decrementPlacementCacheCount() {
        int i = f27433b - 1;
        f27433b = i;
        if (i < 0) {
            f27433b = 0;
        }
        printPlacementCacheInformation();
    }

    public static void incrementPlacementPreRenderCount() {
        int i = f27434c + 1;
        f27434c = i;
        int i2 = f27436e;
        if (i > i2) {
            f27434c = i2;
        }
    }

    public static void decrementPlacementPreRenderCount() {
        int i = f27434c - 1;
        f27434c = i;
        if (i < 0) {
            f27434c = 0;
        }
    }

    public static void printPlacementCacheInformation() {
        TapjoyLog.m33197i("TJPlacementManager", "Space available in placement cache: " + f27433b + " out of " + f27435d);
    }

    public static void printPlacementPreRenderInformation() {
        TapjoyLog.m33197i("TJPlacementManager", "Space available for placement pre-render: " + f27434c + " out of " + f27436e);
    }

    public static void dismissContentShowing(boolean z) {
        if (z) {
            TJAdUnitActivity.m33048a();
        }
        C11728ho.m34075a();
        C11706hf.m33966a();
    }

    /* renamed from: a */
    static TJCorePlacement m33112a(String str, String str2, String str3, boolean z, boolean z2) {
        TJCorePlacement a;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "!SYSTEM!" : "");
        sb.append(!TextUtils.isEmpty(str) ? str : "");
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        sb.append(str3);
        sb.append(Boolean.toString(z2));
        String sb2 = sb.toString();
        TapjoyLog.m33194d("TJPlacementManager", "TJCorePlacement key=".concat(String.valueOf(sb2)));
        synchronized (f27432a) {
            a = m33111a(sb2);
            if (a == null) {
                a = new TJCorePlacement(str, sb2, z2);
                f27432a.put(sb2, a);
                TapjoyLog.m33194d("TJPlacementManager", "Created TJCorePlacement with GUID: " + a.f27346d);
            }
        }
        return a;
    }
}
