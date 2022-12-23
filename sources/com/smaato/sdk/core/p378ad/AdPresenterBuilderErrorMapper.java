package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.resourceloader.ResourceLoaderException;

/* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderErrorMapper */
public final class AdPresenterBuilderErrorMapper {
    private AdPresenterBuilderErrorMapper() {
    }

    /* renamed from: com.smaato.sdk.core.ad.AdPresenterBuilderErrorMapper$1 */
    static /* synthetic */ class C109401 {

        /* renamed from: $SwitchMap$com$smaato$sdk$core$resourceloader$ResourceLoader$Error */
        static final /* synthetic */ int[] f27125x20b590f9;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error[] r0 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27125x20b590f9 = r0
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27125x20b590f9     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.IO_ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27125x20b590f9     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.resourceloader.ResourceLoader$Error r1 = com.smaato.sdk.core.resourceloader.ResourceLoader.Error.NETWORK_GENERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.AdPresenterBuilderErrorMapper.C109401.<clinit>():void");
        }
    }

    public static AdPresenterBuilderException mapError(ResourceLoaderException resourceLoaderException) {
        AdPresenterBuilder.Error error;
        int i = C109401.f27125x20b590f9[resourceLoaderException.getErrorType().ordinal()];
        if (i == 1) {
            error = AdPresenterBuilder.Error.RESOURCE_EXPIRED;
        } else if (i == 2) {
            error = AdPresenterBuilder.Error.TRANSPORT_IO_ERROR;
        } else if (i == 3) {
            error = AdPresenterBuilder.Error.TRANSPORT_GENERIC;
        } else {
            throw new IllegalArgumentException(String.format("Unexpected %s: %s", new Object[]{ResourceLoader.Error.class.getSimpleName(), resourceLoaderException}));
        }
        return new AdPresenterBuilderException(error, resourceLoaderException);
    }
}
