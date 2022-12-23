package com.mbridge.msdk.video.dynview.moffer;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.video.dynview.p353d.C9259c;
import com.mbridge.msdk.video.dynview.p359h.C9288b;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.video.dynview.moffer.a */
/* compiled from: MOfferEnergize */
public class C9320a {

    /* renamed from: a */
    private static volatile C9320a f22628a;

    /* renamed from: b */
    private Map<String, SoftReference<MOfferModel>> f22629b = new ConcurrentHashMap();

    private C9320a() {
    }

    /* renamed from: a */
    public static C9320a m26714a() {
        C9320a aVar;
        if (f22628a != null) {
            return f22628a;
        }
        synchronized (C9320a.class) {
            if (f22628a == null) {
                f22628a = new C9320a();
            }
            aVar = f22628a;
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo62522a(CampaignEx campaignEx) {
        Map<String, SoftReference<MOfferModel>> map = this.f22629b;
        if (map != null && !map.containsKey(campaignEx.getRequestId())) {
            try {
                SoftReference softReference = new SoftReference(new MOfferModel());
                if (softReference.get() != null) {
                    ((MOfferModel) softReference.get()).bulidMofferAd(campaignEx);
                }
                this.f22629b.put(campaignEx.getRequestId(), softReference);
            } catch (Exception e) {
                C8608u.m24884d("MOfferEnergize", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void mo62521a(final ViewGroup viewGroup, String str, C9384a aVar) {
        SoftReference softReference;
        MOfferModel mOfferModel;
        Map<String, SoftReference<MOfferModel>> map = this.f22629b;
        if (map != null && map.containsKey(str) && (softReference = this.f22629b.get(str)) != null && softReference.get() != null && (mOfferModel = (MOfferModel) softReference.get()) != null) {
            mOfferModel.setMoreOfferListener(new C9259c() {
                /* renamed from: a */
                public final void mo62390a(int i, String str) {
                }

                /* renamed from: a */
                public final void mo62391a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
                    try {
                        if (viewGroup != null && viewGroup != null) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            }
                            layoutParams.addRule(12, -1);
                            viewGroup.setLayoutParams(layoutParams);
                            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeAllViews();
                            }
                            viewGroup.addView(viewGroup);
                            if (viewGroup != null) {
                                new C9288b().mo62474a((RelativeLayout) viewGroup.findViewById(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_native_ec_layout", "id")), 0, C8613y.m24929b(C2350a.m5601e().mo15792g(), 100.0f), 500);
                            }
                            new C9288b().mo62473a(viewGroup, 0, C8613y.m24950h(C2350a.m5601e().mo15792g()), 0, C8613y.m24929b(C2350a.m5601e().mo15792g(), 90.0f), 0);
                            try {
                                if (viewGroup instanceof MBridgeNativeEndCardView) {
                                    ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
                                }
                            } catch (Throwable th) {
                                C8608u.m24880a("MOfferEnergize", th.getMessage());
                            }
                        }
                    } catch (Exception e) {
                        C8608u.m24880a("MOfferEnergize", e.getMessage());
                    }
                }
            }, aVar);
        }
    }

    /* renamed from: a */
    public final void mo62523a(CampaignEx campaignEx, final ViewGroup viewGroup, C9384a aVar) {
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setMoreOfferListener(new C9259c() {
                /* renamed from: a */
                public final void mo62390a(int i, String str) {
                }

                /* renamed from: a */
                public final void mo62391a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
                    try {
                        if (viewGroup != null && viewGroup != null) {
                            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            }
                            layoutParams.addRule(12, -1);
                            viewGroup.setLayoutParams(layoutParams);
                            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeAllViews();
                            }
                            viewGroup.addView(viewGroup);
                            if (viewGroup != null) {
                                new C9288b().mo62474a((RelativeLayout) viewGroup.findViewById(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_native_ec_layout", "id")), 0, C8613y.m24929b(C2350a.m5601e().mo15792g(), 100.0f), 500);
                            }
                            new C9288b().mo62473a(viewGroup, 0, C8613y.m24950h(C2350a.m5601e().mo15792g()), 0, C8613y.m24929b(C2350a.m5601e().mo15792g(), 90.0f), 0);
                            try {
                                if (viewGroup instanceof MBridgeNativeEndCardView) {
                                    ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
                                }
                            } catch (Throwable th) {
                                C8608u.m24880a("MOfferEnergize", th.getMessage());
                            }
                        }
                    } catch (Exception e) {
                        C8608u.m24880a("MOfferEnergize", e.getMessage());
                    }
                }
            }, aVar);
            mOfferModel.bulidMofferAd(campaignEx);
        } catch (Exception e) {
            C8608u.m24884d("MOfferEnergize", e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f22629b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo62524a(java.lang.String r2) {
        /*
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<com.mbridge.msdk.video.dynview.moffer.MOfferModel>> r0 = r1.f22629b
            if (r0 == 0) goto L_0x0012
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.moffer.C9320a.mo62524a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo62525b() {
        try {
            if (this.f22629b != null) {
                for (SoftReference<MOfferModel> softReference : this.f22629b.values()) {
                    ((MOfferModel) softReference.get()).mofDestroy();
                }
                this.f22629b.clear();
            }
        } catch (Exception e) {
            C8608u.m24884d("MOfferEnergize", e.getMessage());
        }
    }
}
