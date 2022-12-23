package com.vungle.warren.p393ui.contract;

import com.vungle.warren.p393ui.contract.AdContract;
import com.vungle.warren.p393ui.presenter.NativeAdPresenter;

/* renamed from: com.vungle.warren.ui.contract.NativeAdContract */
public interface NativeAdContract {

    /* renamed from: com.vungle.warren.ui.contract.NativeAdContract$NativePresenter */
    public interface NativePresenter extends AdContract.AdvertisementPresenter<NativeView> {
        void onDownload();

        void onPrivacy();

        void onProgressUpdate(int i, float f);

        void setAdVisibility(boolean z);
    }

    /* renamed from: com.vungle.warren.ui.contract.NativeAdContract$NativeView */
    public interface NativeView extends AdContract.AdView<NativeAdPresenter> {
        boolean isDialogVisible();
    }
}
