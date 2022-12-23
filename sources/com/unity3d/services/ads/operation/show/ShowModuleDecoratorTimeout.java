package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.request.metrics.SDKMetricEvents;
import com.unity3d.services.core.webview.bridge.IWebViewBridgeInvoker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShowModuleDecoratorTimeout extends ShowModuleDecorator {
    /* access modifiers changed from: private */
    public static String errorMsgTimeout = "[UnityAds] Timeout while trying to show ";
    private ExecutorService _executorService = Executors.newSingleThreadExecutor();

    public ShowModuleDecoratorTimeout(IShowModule iShowModule) {
        super(iShowModule);
    }

    public void executeAdOperation(IWebViewBridgeInvoker iWebViewBridgeInvoker, ShowOperationState showOperationState) {
        startShowTimeout(showOperationState);
        super.executeAdOperation(iWebViewBridgeInvoker, showOperationState);
    }

    private void startShowTimeout(final ShowOperationState showOperationState) {
        this._executorService.submit(new Runnable() {
            public void run() {
                if (!showOperationState.timeoutCV.block((long) showOperationState.configuration.getShowTimeout())) {
                    ShowModuleDecoratorTimeout showModuleDecoratorTimeout = ShowModuleDecoratorTimeout.this;
                    ShowOperationState showOperationState = showOperationState;
                    UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    showModuleDecoratorTimeout.onOperationTimeout(showOperationState, unityAdsShowError, ShowModuleDecoratorTimeout.errorMsgTimeout + showOperationState.placementId);
                }
            }
        });
    }

    public void onUnityAdsShowConsent(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowConsent(str);
    }

    public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowFailure(str, unityAdsShowError, str2);
    }

    public void onUnityAdsShowStart(String str) {
        releaseOperationTimeoutLock(str);
        super.onUnityAdsShowStart(str);
    }

    private void releaseOperationTimeoutLock(String str) {
        IShowOperation iShowOperation = get(str);
        if (iShowOperation != null && iShowOperation.getShowOperationState() != null && iShowOperation.getShowOperationState().timeoutCV != null) {
            iShowOperation.getShowOperationState().timeoutCV.open();
        }
    }

    /* access modifiers changed from: private */
    public void onOperationTimeout(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        if (showOperationState != null) {
            remove(showOperationState.f29313id);
            showOperationState.onUnityAdsShowFailure(unityAdsShowError, str);
        }
        getMetricSender().sendSDKMetricEvent(SDKMetricEvents.native_show_timeout_error);
    }
}
