package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.module.a.a.c */
/* compiled from: ContainerViewJSListener */
public final class C9387c extends C9388d {

    /* renamed from: j */
    private IJSFactory f22964j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9387c(IJSFactory iJSFactory, CampaignEx campaignEx, C9541c cVar, C9552a aVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f22964j = iJSFactory2;
        if (iJSFactory2 == null) {
            this.f22973a = false;
        }
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        if (this.f22973a) {
            if (i != 8) {
                if (i == 105) {
                    this.f22964j.getJSNotifyProxy().mo62841a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.f22964j.getJSContainerModule().showVideoClickView(-1);
                    this.f22964j.getJSVideoModule().setCover(false);
                    this.f22964j.getJSVideoModule().setMiniEndCardState(false);
                    this.f22964j.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.f22964j.getJSVideoModule().setCover(true);
                    this.f22964j.getJSVideoModule().setMiniEndCardState(true);
                    this.f22964j.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    C9532i jSVideoModule = this.f22964j.getJSVideoModule();
                    this.f22964j.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (!this.f22964j.getJSContainerModule().showAlertWebView()) {
                this.f22964j.getJSVideoModule().showAlertView();
            } else {
                this.f22964j.getJSVideoModule().alertWebViewShowed();
            }
        }
        super.mo62252a(i, obj);
    }
}
