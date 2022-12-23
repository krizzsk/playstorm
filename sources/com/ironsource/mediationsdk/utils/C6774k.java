package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.model.C6696f;
import com.ironsource.mediationsdk.model.C6701k;
import com.ironsource.mediationsdk.model.C6703l;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.utils.k */
public class C6774k {

    /* renamed from: a */
    private static C6774k f17737a;

    /* renamed from: b */
    private final HashSet<ImpressionDataListener> f17738b = new HashSet<>();

    /* renamed from: c */
    private ConcurrentHashMap<String, List<String>> f17739c = new ConcurrentHashMap<>();

    /* renamed from: com.ironsource.mediationsdk.utils.k$1 */
    static /* synthetic */ class C67751 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17740a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.l[] r0 = com.ironsource.mediationsdk.model.C6703l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17740a = r0
                com.ironsource.mediationsdk.model.l r1 = com.ironsource.mediationsdk.model.C6703l.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17740a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.l r1 = com.ironsource.mediationsdk.model.C6703l.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6774k.C67751.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.k$a */
    public enum C6776a {
        ;
        

        /* renamed from: a */
        public static final int f17741a = 1;

        /* renamed from: b */
        public static final int f17742b = 2;

        /* renamed from: c */
        public static final int f17743c = 3;

        /* renamed from: d */
        public static final int f17744d = 4;

        static {
            f17745e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m20625a() {
            return (int[]) f17745e.clone();
        }
    }

    C6774k() {
    }

    /* renamed from: a */
    private static int m20597a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, m20601a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return C6776a.f17741a;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20601a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m20601a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.getIntFromSharedPrefs(context, m20601a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000))) {
                return C6776a.f17743c;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20601a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m20601a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m20601a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            String a2 = m20601a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a2, 0)) {
                IronSourceUtils.saveIntToSharedPrefs(context, a, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, a2, 0);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return C6776a.f17742b;
            }
        }
        return C6776a.f17744d;
    }

    /* renamed from: a */
    private static long m20598a(C6703l lVar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C67751.f17740a[lVar.ordinal()];
        if (i == 1) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 0);
            instance.add(6, 1);
        } else if (i == 2) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.add(11, 1);
        }
        return instance.getTimeInMillis();
    }

    /* renamed from: a */
    public static synchronized C6774k m20599a() {
        C6774k kVar;
        synchronized (C6774k.class) {
            if (f17737a == null) {
                f17737a = new C6774k();
            }
            kVar = f17737a;
        }
        return kVar;
    }

    /* renamed from: a */
    private static String m20600a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: a */
    private static String m20601a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* renamed from: a */
    public static synchronized void m20602a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6774k.class) {
            if (context != null) {
                C6701k placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20605a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m20603a(Context context, Placement placement) {
        synchronized (C6774k.class) {
            if (context != null) {
                C6701k placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20605a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m20604a(Context context, C6696f fVar) {
        synchronized (C6774k.class) {
            if (context != null) {
                C6701k placementAvailabilitySettings = fVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20605a(context, IronSourceConstants.BANNER_AD_UNIT, fVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m20605a(Context context, String str, String str2, C6701k kVar) {
        boolean z = kVar.f17518a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, m20601a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = kVar.f17519b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m20601a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.saveIntToSharedPrefs(context, m20601a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), kVar.f17522e);
                IronSourceUtils.saveStringToSharedPrefs(context, m20601a(str, "CappingManager.CAPPING_TYPE", str2), kVar.f17521d.toString());
            }
            boolean z3 = kVar.f17520c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m20601a(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.saveIntToSharedPrefs(context, m20601a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), kVar.f17523f);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m20606a(Context context, String str) {
        boolean z;
        synchronized (C6774k.class) {
            z = m20597a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != C6776a.f17744d;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized boolean m20607a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (C6774k.class) {
            z = m20597a(context, m20600a(ad_unit), str) != C6776a.f17744d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized int m20608b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6774k.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int a = m20597a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                    return a;
                }
            }
            int i = C6776a.f17744d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized int m20609b(Context context, Placement placement) {
        synchronized (C6774k.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int a = m20597a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return a;
                }
            }
            int i = C6776a.f17744d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized void m20610b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (C6774k.class) {
            m20611b(context, m20600a(ad_unit), str);
        }
    }

    /* renamed from: b */
    private static void m20611b(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20601a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m20601a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20601a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, m20601a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m20601a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m20601a(str, "CappingManager.CAPPING_TYPE", str2), C6703l.PER_DAY.toString());
                C6703l lVar = null;
                C6703l[] values = C6703l.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C6703l lVar2 = values[i];
                    if (lVar2.f17533c.equals(stringFromSharedPrefs)) {
                        lVar = lVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m20601a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), m20598a(lVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m20612b(Context context, String str) {
        boolean z;
        synchronized (C6774k.class) {
            z = m20597a(context, IronSourceConstants.BANNER_AD_UNIT, str) != C6776a.f17744d;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m20613c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6774k.class) {
            if (interstitialPlacement != null) {
                m20611b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m20614c(Context context, Placement placement) {
        synchronized (C6774k.class) {
            if (placement != null) {
                m20611b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m20615c(Context context, String str) {
        boolean z;
        synchronized (C6774k.class) {
            z = m20597a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != C6776a.f17744d;
        }
        return z;
    }

    /* renamed from: d */
    public static synchronized void m20616d(Context context, String str) {
        synchronized (C6774k.class) {
            m20611b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    /* renamed from: e */
    public static synchronized void m20617e(Context context, String str) {
        synchronized (C6774k.class) {
            m20611b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    /* renamed from: f */
    public static synchronized void m20618f(Context context, String str) {
        synchronized (C6774k.class) {
            if (!TextUtils.isEmpty(str)) {
                m20611b(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    /* renamed from: a */
    public void mo36973a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17738b.add(impressionDataListener);
        }
    }

    /* renamed from: a */
    public void mo36974a(String str, List<String> list) {
        this.f17739c.put(str, list);
    }

    /* renamed from: b */
    public HashSet<ImpressionDataListener> mo36975b() {
        return this.f17738b;
    }

    /* renamed from: b */
    public void mo36976b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f17738b.remove(impressionDataListener);
        }
    }

    /* renamed from: c */
    public void mo36977c() {
        synchronized (this) {
            this.f17738b.clear();
        }
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, List<String>> mo36978d() {
        return this.f17739c;
    }
}
