package com.p374my.target.common;

import android.content.Context;
import com.p374my.target.C9672e0;
import com.p374my.target.C9693f0;
import com.p374my.target.C9754i5;
import com.p374my.target.C9851m8;
import com.p374my.target.C9889o8;
import com.p374my.target.common.MyTargetConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.MyTargetManager */
public final class MyTargetManager {
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static volatile MyTargetConfig myTargetConfig = new MyTargetConfig.Builder().build();

    public static String getBidderToken(Context context) {
        C9754i5 c = C9754i5.m28266c();
        c.mo64274a(MyTargetPrivacy.currentPrivacy().isConsent());
        return c.mo64272a(context);
    }

    public static MyTargetConfig getSdkConfig() {
        return myTargetConfig;
    }

    public static void initSdk(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            C9672e0.m27884c("MyTarget cannot be initialized due to a null application context");
        } else if (INITIALIZED.compareAndSet(false, true)) {
            C9672e0.m27884c("MyTarget initialization");
            C9693f0.m27979a(new Runnable(applicationContext) {
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    MyTargetManager.lambda$initSdk$0(this.f$0);
                }
            });
        }
    }

    static /* synthetic */ void lambda$initSdk$0(Context context) {
        C9851m8.m28751a(context);
        C9754i5.m28266c().mo64277c(context);
        C9889o8.m28935a(context);
    }

    public static void setDebugMode(boolean z) {
        C9672e0.f23794a = z;
        if (z) {
            C9672e0.m27882a("Debug mode enabled");
        }
    }

    public static void setSdkConfig(MyTargetConfig myTargetConfig2) {
        myTargetConfig = myTargetConfig2;
    }
}
