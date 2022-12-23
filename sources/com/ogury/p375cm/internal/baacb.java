package com.ogury.p375cm.internal;

import android.util.Log;
import com.applovin.sdk.AppLovinEventParameters;

/* renamed from: com.ogury.cm.internal.baacb */
public final class baacb {

    /* renamed from: a */
    private String f25902a = "";

    /* renamed from: b */
    private final String f25903b;

    public baacb(String str, String str2) {
        bbabc.m30943b(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        bbabc.m30943b(str2, "skuType");
        this.f25903b = str;
        int hashCode = str2.hashCode();
        if (hashCode != 505523517) {
            if (hashCode == 1741942868 && str2.equals("OneTimePurchase")) {
                this.f25902a = "inapp";
                return;
            }
        } else if (str2.equals("Subscription")) {
            this.f25902a = "subs";
            return;
        }
        Log.e("FairChoice", "Illegal SKU type");
    }

    /* renamed from: a */
    public final String mo66663a() {
        return this.f25902a;
    }

    /* renamed from: b */
    public final String mo66664b() {
        return this.f25903b;
    }
}
