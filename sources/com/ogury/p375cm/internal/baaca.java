package com.ogury.p375cm.internal;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ogury.core.OguryError;

/* renamed from: com.ogury.cm.internal.baaca */
public final class baaca implements baaab {

    /* renamed from: a */
    private baacc f25901a;

    public final void activateProduct(baacb baacb) {
        bbabc.m30943b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        throw new OguryError(1005, "This SDK implementation does not support FairChoice, but your asset has FairChoice enabled");
    }

    public final void endDataSourceConnections() {
        Log.d("FairChoice", "endDataSourceConnections");
    }

    public final boolean isBillingDisabled() {
        return true;
    }

    public final boolean isProductActivated() {
        return false;
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m30943b(activity, "activity");
    }

    public final void queryProductDetails() {
        baacc baacc = this.f25901a;
        if (baacc != null) {
            baacc.mo66547a("ok", "");
        }
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m30943b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        babaa.mo66497a();
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        this.f25901a = baacc;
        if (baacc != null) {
            baacc.mo66547a("ok", "");
        }
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m30943b(context, "context");
        acccc acccc = acccc.f25869a;
        acccc.m30879b(context);
    }

    public final boolean tokenExistsForActiveProduct() {
        return false;
    }
}
