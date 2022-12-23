package com.ogury.p375cm.internal;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.ogury.cm.internal.baaab */
public interface baaab {
    void activateProduct(baacb baacb);

    void endDataSourceConnections();

    boolean isBillingDisabled();

    boolean isProductActivated();

    void launchBillingFlow(Activity activity);

    void queryProductDetails();

    void queryPurchase(babaa babaa);

    void setBillingFinishedListener(baaaa baaaa);

    void setQueryProductDetailsListener(baacc baacc);

    void startDataSourceConnections(Context context);

    boolean tokenExistsForActiveProduct();
}
