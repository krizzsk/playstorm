package com.p374my.target.nativeads;

import android.content.Context;
import com.p374my.target.C9615b;
import com.p374my.target.C9672e0;
import com.p374my.target.C9733h2;
import com.p374my.target.C9822l3;
import com.p374my.target.C9916q2;
import com.p374my.target.C9939s;
import com.p374my.target.C9997v2;
import com.p374my.target.common.BaseAd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.target.nativeads.NativeBannerAdLoader */
public final class NativeBannerAdLoader extends BaseAd {
    private C9615b<C9997v2> adFactory;
    private final Context appContext;
    private OnLoad onLoad;

    /* renamed from: com.my.target.nativeads.NativeBannerAdLoader$OnLoad */
    public interface OnLoad {
        void onLoad(List<NativeBannerAd> list);
    }

    private NativeBannerAdLoader(int i, int i2, Context context) {
        super(i, "nativebanner");
        if (i2 < 1) {
            C9672e0.m27882a("NativeBannerAdLoader: invalid bannersCount < 1, bannersCount set to 1");
            i2 = 1;
        }
        this.adConfig.setBannersCount(i2);
        this.adConfig.setMediationEnabled(false);
        this.appContext = context.getApplicationContext();
        C9672e0.m27884c("NativeBannerAdLoader created. Version: 5.15.0");
    }

    private void handleResult(C9997v2 v2Var, String str) {
        OnLoad onLoad2;
        ArrayList arrayList;
        if (this.onLoad != null) {
            List<C9733h2> c = v2Var == null ? null : v2Var.mo65603c();
            if (c == null || c.size() < 1) {
                onLoad2 = this.onLoad;
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                for (C9733h2 banner : c) {
                    NativeBannerAd nativeBannerAd = new NativeBannerAd(this.adConfig.getSlotId(), this.appContext);
                    nativeBannerAd.setCachePolicy(this.adConfig.getCachePolicy());
                    nativeBannerAd.setBanner(banner);
                    arrayList.add(nativeBannerAd);
                }
                onLoad2 = this.onLoad;
            }
            onLoad2.onLoad(arrayList);
        }
    }

    public static NativeBannerAdLoader newLoader(int i, int i2, Context context) {
        return new NativeBannerAdLoader(i, i2, context);
    }

    public int getCachePolicy() {
        return this.adConfig.getCachePolicy();
    }

    public /* synthetic */ void lambda$load$0$NativeBannerAdLoader(C9615b bVar, C9997v2 v2Var, String str) {
        if (bVar == this.adFactory) {
            this.adFactory = null;
            handleResult(v2Var, str);
        }
    }

    public NativeBannerAdLoader load() {
        C9822l3 a = this.metricFactory.mo64679a();
        C9615b<C9997v2> a2 = C9939s.m29175a(this.adConfig, this.metricFactory);
        this.adFactory = a2;
        a2.mo63560a(new C9939s.C9941b(a2) {
            public final /* synthetic */ C9615b f$1;

            {
                this.f$1 = r2;
            }

            /* renamed from: a */
            public final void mo63321a(C9916q2 q2Var, String str) {
                NativeBannerAdLoader.this.lambda$load$0$NativeBannerAdLoader(this.f$1, (C9997v2) q2Var, str);
            }
        }).mo63567b(a, this.appContext);
        return this;
    }

    public void setCachePolicy(int i) {
        this.adConfig.setCachePolicy(i);
    }

    public NativeBannerAdLoader setOnLoad(OnLoad onLoad2) {
        this.onLoad = onLoad2;
        return this;
    }
}
