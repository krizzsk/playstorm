package com.p374my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.C10029x2;
import com.p374my.target.C9672e0;
import com.p374my.target.ads.MyTargetView;
import com.p374my.target.common.CustomParams;
import com.p374my.target.mediation.MediationStandardAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetStandardAdAdapter */
public final class MyTargetStandardAdAdapter implements MediationStandardAdAdapter {
    private MyTargetView myTargetView;
    private C10029x2 section;

    /* renamed from: com.my.target.mediation.MyTargetStandardAdAdapter$AdListener */
    public class AdListener implements MyTargetView.MyTargetViewListener {
        private final MediationStandardAdAdapter.MediationStandardAdListener mediationListener;

        public AdListener(MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener) {
            this.mediationListener = mediationStandardAdListener;
        }

        public void onClick(MyTargetView myTargetView) {
            C9672e0.m27882a("MyTargetStandardAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetStandardAdAdapter.this);
        }

        public void onLoad(MyTargetView myTargetView) {
            C9672e0.m27882a("MyTargetStandardAdAdapter: ad loaded");
            this.mediationListener.onLoad(myTargetView, MyTargetStandardAdAdapter.this);
        }

        public void onNoAd(String str, MyTargetView myTargetView) {
            C9672e0.m27882a("MyTargetStandardAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetStandardAdAdapter.this);
        }

        public void onShow(MyTargetView myTargetView) {
            C9672e0.m27882a("MyTargetStandardAdAdapter: ad shown");
            this.mediationListener.onShow(MyTargetStandardAdAdapter.this);
        }
    }

    public void destroy() {
        MyTargetView myTargetView2 = this.myTargetView;
        if (myTargetView2 != null) {
            myTargetView2.setListener((MyTargetView.MyTargetViewListener) null);
            this.myTargetView.destroy();
            this.myTargetView = null;
        }
    }

    public void load(MediationAdConfig mediationAdConfig, MyTargetView.AdSize adSize, MediationStandardAdAdapter.MediationStandardAdListener mediationStandardAdListener, Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            MyTargetView myTargetView2 = new MyTargetView(context);
            this.myTargetView = myTargetView2;
            myTargetView2.setSlotId(parseInt);
            this.myTargetView.setAdSize(adSize);
            this.myTargetView.setRefreshAd(false);
            this.myTargetView.setMediationEnabled(false);
            this.myTargetView.setListener(new AdListener(mediationStandardAdListener));
            CustomParams customParams = this.myTargetView.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry next : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                C9672e0.m27882a("MyTargetStandardAdAdapter: got banner from mediation response");
                this.myTargetView.handleSection(this.section, adSize);
            } else if (TextUtils.isEmpty(payload)) {
                C9672e0.m27882a("MyTargetStandardAdAdapter: load id " + parseInt);
                this.myTargetView.load();
            } else {
                C9672e0.m27882a("MyTargetStandardAdAdapter: load id " + parseInt + " from BID " + payload);
                this.myTargetView.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C9672e0.m27883b("MyTargetStandardAdAdapter error: " + str);
            mediationStandardAdListener.onNoAd(str, this);
        }
    }

    public void setSection(C10029x2 x2Var) {
        this.section = x2Var;
    }
}
