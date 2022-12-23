package com.fyber.inneractive.sdk.bidder;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* renamed from: com.fyber.inneractive.sdk.bidder.f */
public class C4233f {

    /* renamed from: com.fyber.inneractive.sdk.bidder.f$a */
    public static /* synthetic */ class C4234a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10478a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10478a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.BANNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10478a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10478a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10478a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.MRECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C4233f.C4234a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableBool m13390a(Boolean bool) {
        TokenParametersOuterClass$TokenParameters.NullableBool.C4187a newBuilder = TokenParametersOuterClass$TokenParameters.NullableBool.newBuilder();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            newBuilder.mo25812c();
            ((TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.f13688b).setData(booleanValue);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableBool) newBuilder.mo25809a();
    }

    /* renamed from: b */
    public static TokenParametersOuterClass$TokenParameters.C4198d m13394b(String str) {
        if (str.equals("native")) {
            return TokenParametersOuterClass$TokenParameters.C4198d.NATIVE;
        }
        if (!str.equals("unity3d")) {
            return TokenParametersOuterClass$TokenParameters.C4198d.UNRECOGNIZED;
        }
        return TokenParametersOuterClass$TokenParameters.C4198d.UNITY3D;
    }

    /* renamed from: c */
    public static TokenParametersOuterClass$TokenParameters.NullableString m13395c(String str) {
        TokenParametersOuterClass$TokenParameters.NullableString.C4190a newBuilder = TokenParametersOuterClass$TokenParameters.NullableString.newBuilder();
        if (!TextUtils.isEmpty(str)) {
            newBuilder.mo25812c();
            ((TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.f13688b).setData(str);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableString) newBuilder.mo25809a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableUInt32 m13392a(int i) {
        TokenParametersOuterClass$TokenParameters.NullableUInt32.C4191a newBuilder = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
        if (i > 0) {
            newBuilder.mo25812c();
            ((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.f13688b).setData(i);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder.mo25809a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.NullableFloat m13391a(String str) {
        TokenParametersOuterClass$TokenParameters.NullableFloat.C4188a newBuilder = TokenParametersOuterClass$TokenParameters.NullableFloat.newBuilder();
        if (str != null) {
            float parseFloat = Float.parseFloat(str);
            newBuilder.mo25812c();
            ((TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.f13688b).setData(parseFloat);
        }
        return (TokenParametersOuterClass$TokenParameters.NullableFloat) newBuilder.mo25809a();
    }

    /* renamed from: a */
    public static TokenParametersOuterClass$TokenParameters.C4205k m13393a(UnitDisplayType unitDisplayType) {
        int i = C4234a.f10478a[unitDisplayType.ordinal()];
        if (i == 1) {
            return TokenParametersOuterClass$TokenParameters.C4205k.BANNER;
        }
        if (i == 2) {
            return TokenParametersOuterClass$TokenParameters.C4205k.INTERSTITIAL;
        }
        if (i == 3) {
            return TokenParametersOuterClass$TokenParameters.C4205k.REWARDED;
        }
        if (i != 4) {
            return TokenParametersOuterClass$TokenParameters.C4205k.UNITDISPLAYTYPEUNKNOWN;
        }
        return TokenParametersOuterClass$TokenParameters.C4205k.MRECT;
    }
}
