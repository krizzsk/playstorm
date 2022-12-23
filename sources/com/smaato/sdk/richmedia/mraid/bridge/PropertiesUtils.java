package com.smaato.sdk.richmedia.mraid.bridge;

import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory;
import com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType;
import com.smaato.sdk.richmedia.util.DeviceUtils;
import com.tapjoy.TJAdUnitConstants;

final class PropertiesUtils {
    static String placementTypeToString(PlacementType placementType) {
        int i = C112451.f27147x3c837bb5[placementType.ordinal()];
        if (i == 1) {
            return "interstitial";
        }
        if (i == 2) {
            return TJAdUnitConstants.String.INLINE;
        }
        throw new IllegalArgumentException("Unknown placement type: " + placementType);
    }

    static String screenOrientationToString(DeviceUtils.ScreenOrientation screenOrientation) {
        int i = C112451.f27148xecb9dd8b[screenOrientation.ordinal()];
        if (i != 1) {
            return i != 2 ? "none" : "landscape";
        }
        return "portrait";
    }

    static DeviceUtils.ScreenOrientation stringToScreenOrientation(String str) {
        if (TextUtils.isEmpty(str)) {
            return DeviceUtils.ScreenOrientation.UNKNOWN;
        }
        str.hashCode();
        if (str.equals("portrait")) {
            return DeviceUtils.ScreenOrientation.PORTRAIT;
        }
        if (!str.equals("landscape")) {
            return DeviceUtils.ScreenOrientation.UNKNOWN;
        }
        return DeviceUtils.ScreenOrientation.LANDSCAPE;
    }

    /* renamed from: com.smaato.sdk.richmedia.mraid.bridge.PropertiesUtils$1 */
    static /* synthetic */ class C112451 {

        /* renamed from: $SwitchMap$com$smaato$sdk$richmedia$mraid$dataprovider$MraidStateMachineFactory$State */
        static final /* synthetic */ int[] f27146x94e48a94;

        /* renamed from: $SwitchMap$com$smaato$sdk$richmedia$mraid$dataprovider$PlacementType */
        static final /* synthetic */ int[] f27147x3c837bb5;

        /* renamed from: $SwitchMap$com$smaato$sdk$richmedia$util$DeviceUtils$ScreenOrientation */
        static final /* synthetic */ int[] f27148xecb9dd8b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State[] r0 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27146x94e48a94 = r0
                r1 = 1
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r2 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27146x94e48a94     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r3 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27146x94e48a94     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r4 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.RESIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f27146x94e48a94     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r4 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f27146x94e48a94     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory$State r4 = com.smaato.sdk.richmedia.mraid.dataprovider.MraidStateMachineFactory.State.LOADING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation[] r3 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f27148xecb9dd8b = r3
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r4 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x004f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r3 = f27148xecb9dd8b     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r4 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r3 = f27148xecb9dd8b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r4 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType[] r2 = com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f27147x3c837bb5 = r2
                com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType r3 = com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r1 = f27147x3c837bb5     // Catch:{ NoSuchFieldError -> 0x007e }
                com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType r2 = com.smaato.sdk.richmedia.mraid.dataprovider.PlacementType.INLINE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.mraid.bridge.PropertiesUtils.C112451.<clinit>():void");
        }
    }

    static String stateToString(MraidStateMachineFactory.State state) {
        int i = C112451.f27146x94e48a94[state.ordinal()];
        if (i == 1) {
            return "hidden";
        }
        if (i == 2) {
            return "expanded";
        }
        if (i == 3) {
            return "resized";
        }
        if (i == 4) {
            return "default";
        }
        if (i == 5) {
            return "loading";
        }
        throw new IllegalArgumentException("Unknown state: " + state);
    }
}
