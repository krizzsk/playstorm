package com.applovin.impl.sdk;

import android.app.Activity;
import com.applovin.sdk.AppLovinUserService;

public class UserServiceImpl implements AppLovinUserService {

    /* renamed from: a */
    private final C1959m f2828a;

    UserServiceImpl(C1959m mVar) {
        this.f2828a = mVar;
    }

    public void preloadConsentDialog() {
        this.f2828a.mo14307W().mo14278c();
    }

    public void showConsentDialog(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        this.f2828a.mo14307W().mo14277a(activity, onConsentDialogDismissListener);
    }

    public String toString() {
        return "UserService{}";
    }
}
