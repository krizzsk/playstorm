package com.ogury.p375cm.internal;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;

/* renamed from: com.ogury.cm.internal.baaba */
public final class baaba implements baaab {

    /* renamed from: a */
    public static final baaba f25874a = new baaba();

    /* renamed from: b */
    private static baaab f25875b;

    private baaba() {
    }

    /* renamed from: a */
    public static void m30885a(Context context) {
        bbabc.m30943b(context, "context");
        acccc acccc = acccc.f25869a;
        acccc.m30877a();
        f25875b = acccc.f25869a.mo66643a(context);
    }

    public final void activateProduct(baacb baacb) {
        bbabc.m30943b(baacb, AppLovinEventTypes.USER_VIEWED_PRODUCT);
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.activateProduct(baacb);
    }

    public final void endDataSourceConnections() {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.endDataSourceConnections();
    }

    public final boolean isBillingDisabled() {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        return baaab.isBillingDisabled();
    }

    public final boolean isProductActivated() {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        return baaab.isProductActivated();
    }

    public final void launchBillingFlow(Activity activity) {
        bbabc.m30943b(activity, "activity");
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.launchBillingFlow(activity);
    }

    public final void queryProductDetails() {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.queryProductDetails();
    }

    public final void queryPurchase(babaa babaa) {
        bbabc.m30943b(babaa, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.queryPurchase(babaa);
    }

    public final void setBillingFinishedListener(baaaa baaaa) {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.setBillingFinishedListener(baaaa);
    }

    public final void setQueryProductDetailsListener(baacc baacc) {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        baaab.setQueryProductDetailsListener(baacc);
    }

    public final void startDataSourceConnections(Context context) {
        bbabc.m30943b(context, "context");
        baaab a = acccc.f25869a.mo66643a(context);
        f25875b = a;
        if (a == null) {
            bbabc.m30941a("implementation");
        }
        a.startDataSourceConnections(context);
    }

    public final boolean tokenExistsForActiveProduct() {
        baaab baaab = f25875b;
        if (baaab == null) {
            bbabc.m30941a("implementation");
        }
        return baaab.tokenExistsForActiveProduct();
    }
}
