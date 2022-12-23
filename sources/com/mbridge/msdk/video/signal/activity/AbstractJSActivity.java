package com.mbridge.msdk.video.signal.activity;

import android.content.res.Configuration;
import com.mbridge.msdk.activity.MBBaseActivity;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.signal.C9413a;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9531h;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.factory.C9528a;
import com.mbridge.msdk.video.signal.factory.IJSFactory;

public abstract class AbstractJSActivity extends MBBaseActivity implements IJSFactory {
    protected static final String TAG = "AbstractJSActivity";
    protected IJSFactory jsFactory = new C9528a();

    public boolean canBackPress() {
        return false;
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.jsFactory = iJSFactory;
    }

    public void onResume() {
        super.onResume();
        if (!C2347b.f4898c) {
            if (getJSCommon().mo62821b()) {
                getActivityProxy().mo62803b();
            }
            getActivityProxy().mo62801a(0);
        }
    }

    public void onPause() {
        super.onPause();
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62800a();
        }
        getActivityProxy().mo62801a(1);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getJSCommon().mo62821b()) {
            getActivityProxy().mo62802a(configuration);
        }
    }

    public void onBackPressed() {
        if (getJSCommon().mo62821b()) {
            if (getJSContainerModule() == null || !getJSContainerModule().miniCardShowing()) {
                getActivityProxy().mo62808g();
            }
        } else if (canBackPress()) {
            super.onBackPressed();
        } else {
            C8608u.m24880a(TAG, "onBackPressed can't excute");
        }
    }

    public C9413a getActivityProxy() {
        return this.jsFactory.getActivityProxy();
    }

    public C9432c getJSCommon() {
        return this.jsFactory.getJSCommon();
    }

    public C9532i getJSVideoModule() {
        return this.jsFactory.getJSVideoModule();
    }

    public C9527f getJSNotifyProxy() {
        return this.jsFactory.getJSNotifyProxy();
    }

    public C9526e getJSContainerModule() {
        return this.jsFactory.getJSContainerModule();
    }

    public C9531h getIJSRewardVideoV1() {
        return this.jsFactory.getIJSRewardVideoV1();
    }

    public C9431b getJSBTModule() {
        return this.jsFactory.getJSBTModule();
    }
}
