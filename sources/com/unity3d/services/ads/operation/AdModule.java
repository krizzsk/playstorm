package com.unity3d.services.ads.operation;

import com.unity3d.services.core.request.metrics.ISDKMetricSender;
import com.unity3d.services.core.webview.bridge.IWebViewSharedObject;
import com.unity3d.services.core.webview.bridge.WebViewBridgeSharedObjectStore;
import com.unity3d.services.core.webview.bridge.invocation.WebViewBridgeInvocationSingleThreadedExecutor;
import java.util.concurrent.ExecutorService;

public abstract class AdModule<T extends IWebViewSharedObject, T2> extends WebViewBridgeSharedObjectStore<T> implements IAdModule<T, T2> {
    protected ExecutorService _executorService = WebViewBridgeInvocationSingleThreadedExecutor.getInstance().getExecutorService();
    /* access modifiers changed from: protected */
    public ISDKMetricSender _sdkMetricSender;

    protected AdModule(ISDKMetricSender iSDKMetricSender) {
        this._sdkMetricSender = iSDKMetricSender;
    }

    public ISDKMetricSender getMetricSender() {
        return this._sdkMetricSender;
    }
}
