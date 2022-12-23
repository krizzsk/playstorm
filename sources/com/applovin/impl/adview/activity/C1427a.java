package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C1542o;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p027b.C1440a;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.p046ad.C1828d;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1914p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.activity.a */
public class C1427a implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f1649a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2092v f1650b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<AppLovinFullscreenActivity> f1651c;

    /* renamed from: d */
    private final AtomicBoolean f1652d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Messenger f1653e;

    /* renamed from: com.applovin.impl.adview.activity.a$a */
    private class C1430a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C1430a() {
        }

        /* renamed from: a */
        private void m2479a(Bundle bundle, FullscreenAdService.C1426b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.mo12737a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                C1427a.this.f1653e.send(obtain);
            } catch (RemoteException e) {
                if (C2092v.m5047a()) {
                    C2092v b = C1427a.this.f1650b;
                    b.mo14790b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.mo12737a() + ")", e);
                }
            }
        }

        /* renamed from: a */
        private void m2480a(FullscreenAdService.C1426b bVar) {
            m2479a((Bundle) null, bVar);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            m2480a(FullscreenAdService.C1426b.AD_CLICKED);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            m2480a(FullscreenAdService.C1426b.AD_DISPLAYED);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            m2480a(FullscreenAdService.C1426b.AD_HIDDEN);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            m2480a(FullscreenAdService.C1426b.AD_VIDEO_STARTED);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m2479a(bundle, FullscreenAdService.C1426b.AD_VIDEO_ENDED);
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$b */
    private static class C1431b extends Handler {

        /* renamed from: a */
        private final WeakReference<C1427a> f1660a;

        private C1431b(C1427a aVar) {
            this.f1660a = new WeakReference<>(aVar);
        }

        public void handleMessage(Message message) {
            C1427a aVar;
            if (message.what != FullscreenAdService.C1426b.AD.mo12737a() || (aVar = (C1427a) this.f1660a.get()) == null) {
                super.handleMessage(message);
                return;
            }
            aVar.m2472a(C1825b.m3837a(message.getData().getInt("ad_source")), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
        }
    }

    public C1427a(AppLovinFullscreenActivity appLovinFullscreenActivity, C1959m mVar) {
        this.f1649a = mVar;
        this.f1650b = mVar.mo14286A();
        this.f1651c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2470a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f1651c.get();
        if (appLovinFullscreenActivity != null) {
            if (C2092v.m5047a()) {
                this.f1650b.mo14789b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (C2092v.m5047a()) {
            this.f1650b.mo14793e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2472a(C1825b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            C1825b bVar2 = bVar;
            this.f1649a.mo14303S().mo14205a((C1877a) new C1914p(jSONObject, C1828d.m3846a(JsonUtils.getString(jSONObject, "zone_id", "")), bVar2, new AppLovinAdLoadListener() {
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) C1427a.this.f1651c.get();
                    boolean a = C2092v.m5047a();
                    if (appLovinFullscreenActivity != null) {
                        if (a) {
                            C1427a.this.f1650b.mo14789b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C1430a aVar = new C1430a();
                        C1440a.m2492a((C1829e) appLovinAd, aVar, aVar, aVar, C1427a.this.f1649a, appLovinFullscreenActivity, new C1440a.C1452a() {
                            /* renamed from: a */
                            public void mo12566a(C1440a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.mo12772d();
                            }

                            /* renamed from: a */
                            public void mo12567a(String str, Throwable th) {
                                C1542o.m2843a((C1829e) appLovinAd, aVar, str, th, appLovinFullscreenActivity);
                            }
                        });
                    } else if (a) {
                        C2092v b = C1427a.this.f1650b;
                        b.mo14793e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                public void failedToReceiveAd(int i) {
                    C1427a.this.m2470a();
                }
            }, this.f1649a));
        } catch (JSONException e) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1650b;
                vVar.mo14790b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m2470a();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1652d.compareAndSet(false, true)) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1650b;
                vVar.mo14789b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f1653e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.C1426b.AD.mo12737a());
            obtain.replyTo = new Messenger(new C1431b());
            try {
                if (C2092v.m5047a()) {
                    this.f1650b.mo14789b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f1653e.send(obtain);
            } catch (RemoteException e) {
                if (C2092v.m5047a()) {
                    this.f1650b.mo14790b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m2470a();
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f1652d.compareAndSet(true, false) && C2092v.m5047a()) {
            C2092v vVar = this.f1650b;
            vVar.mo14789b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
