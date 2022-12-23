package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.p365a.C9384a;

/* renamed from: com.mbridge.msdk.video.module.a.a.g */
/* compiled from: MiniCardProxyNotifyListener */
public final class C9392g extends C9394i {

    /* renamed from: a */
    private MBridgeClickMiniCardView f22970a;

    public C9392g(MBridgeClickMiniCardView mBridgeClickMiniCardView, C9384a aVar) {
        super(aVar);
        this.f22970a = mBridgeClickMiniCardView;
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f22970a;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f22970a;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                    break;
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (!z) {
            super.mo62252a(i, obj);
        }
    }
}
