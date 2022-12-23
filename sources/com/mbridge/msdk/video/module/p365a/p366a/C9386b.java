package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.module.a.a.b */
/* compiled from: ContainerViewDefaultListener */
public final class C9386b extends C9388d {

    /* renamed from: j */
    private MBridgeVideoView f22962j;

    /* renamed from: k */
    private MBridgeContainerView f22963k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9386b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9541c cVar, C9552a aVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        this.f22962j = mBridgeVideoView2;
        this.f22963k = mBridgeContainerView2;
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f22973a = false;
        }
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        if (this.f22973a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.f22963k;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f22962j;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (!mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f22962j;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.showAlertView();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f22962j;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.alertWebViewShowed();
                    }
                }
            } else if (i == 107) {
                this.f22963k.showVideoClickView(-1);
                this.f22962j.setCover(false);
                this.f22962j.setMiniEndCardState(false);
                this.f22962j.videoOperate(1);
            } else if (i == 112) {
                this.f22962j.setCover(true);
                this.f22962j.setMiniEndCardState(true);
                this.f22962j.videoOperate(2);
            } else if (i == 115) {
                this.f22963k.resizeMiniCard(this.f22962j.getBorderViewWidth(), this.f22962j.getBorderViewHeight(), this.f22962j.getBorderViewRadius());
            }
        }
        super.mo62252a(i, obj);
    }
}
