package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1542o;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;

public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$a */
    private static class C1425a extends Handler {
        private C1425a() {
        }

        public void handleMessage(Message message) {
            try {
                C1542o oVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (oVar != null) {
                    C1829e a = oVar.mo12988a();
                    if (message.what == C1426b.AD.mo12737a()) {
                        Bundle bundle = new Bundle();
                        bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, a.getRawFullResponse());
                        bundle.putInt("ad_source", a.getSource().mo13922a());
                        Message obtain = Message.obtain((Handler) null, C1426b.AD.mo12737a());
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    } else if (message.what == C1426b.AD_DISPLAYED.mo12737a()) {
                        C2043j.m4941a(oVar.mo12991c(), (AppLovinAd) a);
                    } else if (message.what == C1426b.AD_CLICKED.mo12737a()) {
                        C2043j.m4940a(oVar.mo12992d(), (AppLovinAd) a);
                    } else if (message.what == C1426b.AD_VIDEO_STARTED.mo12737a()) {
                        C2043j.m4945a(oVar.mo12990b(), (AppLovinAd) a);
                    } else if (message.what == C1426b.AD_VIDEO_ENDED.mo12737a()) {
                        Bundle data = message.getData();
                        C2043j.m4946a(oVar.mo12990b(), (AppLovinAd) a, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    } else if (message.what == C1426b.AD_HIDDEN.mo12737a()) {
                        C2043j.m4953b(oVar.mo12991c(), (AppLovinAd) a);
                    } else {
                        super.handleMessage(message);
                    }
                } else if (!Utils.getBooleanForProbability(1)) {
                    super.handleMessage(message);
                } else {
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
            } catch (RemoteException e) {
                if (C2092v.m5047a()) {
                    C2092v.m5049c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.FullscreenAdService$b */
    public enum C1426b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        

        /* renamed from: g */
        private final int f1648g;

        private C1426b(int i) {
            this.f1648g = i;
        }

        /* renamed from: a */
        public int mo12737a() {
            return this.f1648g;
        }
    }

    public IBinder onBind(Intent intent) {
        return new Messenger(new C1425a()).getBinder();
    }
}
