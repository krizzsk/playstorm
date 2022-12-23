package com.applovin.adview;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.applovin.impl.adview.C1542o;
import com.applovin.impl.adview.activity.p027b.C1440a;
import com.applovin.impl.sdk.C1959m;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenAdViewObserver implements LifecycleObserver {

    /* renamed from: a */
    private final C1959m f1503a;

    /* renamed from: b */
    private final AtomicBoolean f1504b = new AtomicBoolean(true);

    /* renamed from: c */
    private C1440a f1505c;

    /* renamed from: d */
    private C1542o f1506d;

    public AppLovinFullscreenAdViewObserver(Lifecycle lifecycle, C1542o oVar, C1959m mVar) {
        this.f1506d = oVar;
        this.f1503a = mVar;
        lifecycle.addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C1542o oVar = this.f1506d;
        if (oVar != null) {
            oVar.mo12993e();
            this.f1506d = null;
        }
        C1440a aVar = this.f1505c;
        if (aVar != null) {
            aVar.mo12776h();
            this.f1505c.mo12779k();
            this.f1505c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        C1440a aVar = this.f1505c;
        if (aVar != null) {
            aVar.mo12775g();
            this.f1505c.mo12773e();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        C1440a aVar;
        if (!this.f1504b.getAndSet(false) && (aVar = this.f1505c) != null) {
            aVar.mo12774f();
            this.f1505c.mo12759a(0);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        C1440a aVar = this.f1505c;
        if (aVar != null) {
            aVar.mo12778j();
        }
    }

    public void setPresenter(C1440a aVar) {
        this.f1505c = aVar;
    }
}
