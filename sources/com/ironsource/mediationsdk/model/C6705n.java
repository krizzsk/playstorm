package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.n */
public final class C6705n {

    /* renamed from: b */
    private static C6705n f17541b;

    /* renamed from: a */
    private ArrayList<NetworkSettings> f17542a = new ArrayList<>();

    private C6705n() {
    }

    /* renamed from: a */
    public static synchronized C6705n m20411a() {
        C6705n nVar;
        synchronized (C6705n.class) {
            if (f17541b == null) {
                f17541b = new C6705n();
            }
            nVar = f17541b;
        }
        return nVar;
    }

    /* renamed from: a */
    public final NetworkSettings mo36826a(String str) {
        Iterator<NetworkSettings> it = this.f17542a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        mo36827a(networkSettings);
        return networkSettings;
    }

    /* renamed from: a */
    public final void mo36827a(NetworkSettings networkSettings) {
        this.f17542a.add(networkSettings);
    }

    /* renamed from: b */
    public final void mo36828b() {
        Iterator<NetworkSettings> it = this.f17542a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = mo36826a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo36829b(String str) {
        Iterator<NetworkSettings> it = this.f17542a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
