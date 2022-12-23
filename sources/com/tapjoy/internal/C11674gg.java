package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;

/* renamed from: com.tapjoy.internal.gg */
final class C11674gg extends C11673gf {
    C11674gg() {
    }

    /* renamed from: a */
    public final Object mo72552a(Context context, String str, TJPlacementListener tJPlacementListener) {
        return new TJPlacement(context, str, tJPlacementListener);
    }

    /* renamed from: b */
    public final Object mo72553b() {
        return TJPrivacyPolicy.getInstance();
    }
}
