package com.smaato.sdk.rewarded.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.rewarded.C11155R;
import com.smaato.sdk.rewarded.repository.RetainedAdPresenterRepository;

public class RewardedInterstitialAdActivity extends Activity {
    private static final String EXTRA_ENABLE_CLOSE_BUTTON = "extra_enable_close_button";
    private static final String EXTRA_RETAINED_CACHE_KEY = "extra_retained_cache_key";
    private static final String LOG_TAG = "com.smaato.sdk.rewarded.widget.RewardedInterstitialAdActivity";
    /* access modifiers changed from: private */
    public boolean enableCloseButton;
    @Inject
    private Logger logger;
    private final RewardedAdPresenter.OnCloseEnabledListener onCloseEnabledListener = new RewardedAdPresenter.OnCloseEnabledListener() {
        public void onCloseEnabled(RewardedAdPresenter rewardedAdPresenter) {
            RewardedInterstitialAdActivity.this.findViewById(C11155R.C11157id.smaato_sdk_rewarded_ads_close).setVisibility(0);
            boolean unused = RewardedInterstitialAdActivity.this.enableCloseButton = true;
        }

        public void onClose(RewardedAdPresenter rewardedAdPresenter) {
            RewardedInterstitialAdActivity.this.finish();
        }
    };
    @Inject
    private RetainedAdPresenterRepository retainedAdPresenterRepository;
    private RewardedAdPresenter rewardedAdPresenter;

    public static void start(Context context, String str, boolean z) {
        Objects.requireNonNull(str);
        context.startActivity(new Intent(context, RewardedInterstitialAdActivity.class).addFlags(268435456).putExtra(EXTRA_RETAINED_CACHE_KEY, str).putExtra(EXTRA_ENABLE_CLOSE_BUTTON, z));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AndroidsInjector.inject((Activity) this);
        if (this.retainedAdPresenterRepository == null) {
            onError("SmaatoSdk is not initialised.");
            return;
        }
        this.enableCloseButton = getIntent().getBooleanExtra(EXTRA_ENABLE_CLOSE_BUTTON, false);
        RewardedAdPresenter adPresenterFromRepository = getAdPresenterFromRepository(this.retainedAdPresenterRepository);
        this.rewardedAdPresenter = adPresenterFromRepository;
        if (adPresenterFromRepository != null) {
            initWithAdPresenter(adPresenterFromRepository);
        } else {
            onError("Video Ad is not available for presentation");
        }
    }

    private RewardedAdPresenter getAdPresenterFromRepository(RetainedAdPresenterRepository retainedAdPresenterRepository2) {
        String stringExtra = getIntent().getStringExtra(EXTRA_RETAINED_CACHE_KEY);
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return retainedAdPresenterRepository2.get(stringExtra);
    }

    private void initWithAdPresenter(RewardedAdPresenter rewardedAdPresenter2) {
        AdContentView adContentView = rewardedAdPresenter2.getAdContentView(this);
        if (adContentView != null) {
            initView(adContentView);
            rewardedAdPresenter2.setOnCloseEnabledListener(this.onCloseEnabledListener);
            return;
        }
        onError("Video Ad is not available to provide View for presentation");
    }

    private void initView(AdContentView adContentView) {
        setContentView(C11155R.layout.smaato_sdk_rewarded_ads_activity);
        ((FrameLayout) findViewById(C11155R.C11157id.smaato_sdk_rewarded_ads_content)).addView(adContentView);
        View findViewById = findViewById(C11155R.C11157id.smaato_sdk_rewarded_ads_close);
        findViewById.setVisibility(this.enableCloseButton ? 0 : 8);
        findViewById.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                RewardedInterstitialAdActivity.this.lambda$initView$0$RewardedInterstitialAdActivity(view);
            }
        });
    }

    public /* synthetic */ void lambda$initView$0$RewardedInterstitialAdActivity(View view) {
        onClose();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (isFinishing()) {
            Objects.onNotNull(this.rewardedAdPresenter, $$Lambda$_BTNuxu0Js4coEMGLUW9uYzPEcM.INSTANCE);
        }
        super.onDestroy();
    }

    private void onError(String str) {
        RewardedAdPresenter rewardedAdPresenter2 = this.rewardedAdPresenter;
        if (rewardedAdPresenter2 != null) {
            rewardedAdPresenter2.release();
        }
        logError(str);
        finish();
    }

    private void logError(String str) {
        Logger logger2 = this.logger;
        if (logger2 != null) {
            logger2.error(LogDomain.WIDGET, str, new Object[0]);
        } else {
            Log.e(LOG_TAG, str);
        }
    }

    public void onBackPressed() {
        if (this.enableCloseButton) {
            onClose();
        }
    }

    private void onClose() {
        Objects.onNotNull(this.rewardedAdPresenter, $$Lambda$MyDgG483o8NnGe00daRutl3T5ds.INSTANCE);
        finish();
    }
}
