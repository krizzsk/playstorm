package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* renamed from: com.fyber.inneractive.sdk.flow.f */
public class C4411f extends C4408e implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: h */
    public final InneractiveAdSpot.RequestListener f10885h;

    /* renamed from: i */
    public final C4423m f10886i;

    public C4411f(InneractiveAdSpot.RequestListener requestListener, C4423m mVar) {
        this.f10885h = requestListener;
        this.f10886i = mVar;
    }

    /* renamed from: a */
    public void mo24578a() {
        super.mo24578a();
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!z) {
            mo24579a(this.f10881e, mo24582c(), InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
        }
    }

    /* renamed from: a */
    public void mo24580a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        super.mo24580a(inneractiveInfrastructureError);
        InneractiveAdSpot.RequestListener requestListener = this.f10885h;
        if (requestListener != null) {
            requestListener.onInneractiveFailedAdRequest(this.f10886i, inneractiveInfrastructureError.getErrorCode());
        }
    }
}
