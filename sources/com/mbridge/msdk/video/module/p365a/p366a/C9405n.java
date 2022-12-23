package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;

/* renamed from: com.mbridge.msdk.video.module.a.a.n */
/* compiled from: VideoViewJSListener */
public final class C9405n extends C9406o {

    /* renamed from: k */
    private IJSFactory f23000k;

    /* renamed from: l */
    private int f23001l;

    /* renamed from: m */
    private boolean f23002m = false;

    /* renamed from: n */
    private int f23003n;

    /* renamed from: o */
    private boolean f23004o = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9405n(IJSFactory iJSFactory, CampaignEx campaignEx, C9541c cVar, C9552a aVar, String str, String str2, int i, int i2, C9384a aVar2, int i3, boolean z, int i4) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i3, z);
        IJSFactory iJSFactory2 = iJSFactory;
        this.f23000k = iJSFactory2;
        this.f23001l = i;
        this.f23002m = i2 == 0;
        if (iJSFactory2 == null) {
            this.f22973a = false;
        }
        this.f23003n = i4;
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        Integer num;
        int i2;
        if (this.f22973a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        int i3 = 6;
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 114) {
                                    if (i != 116) {
                                        switch (i) {
                                            case 10:
                                                this.f23004o = true;
                                                this.f23000k.getJSNotifyProxy().mo62839a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.f23000k.getJSVideoModule().videoOperate(3);
                                                if (this.f22974b.getVideo_end_type() == 3) {
                                                    this.f23000k.getJSVideoModule().setVisible(0);
                                                } else if (this.f22974b.getAdSpaceT() != 2) {
                                                    this.f23000k.getJSVideoModule().setVisible(8);
                                                }
                                                if (i == 12) {
                                                    mo62792h();
                                                    i2 = 2;
                                                } else {
                                                    i2 = 1;
                                                }
                                                this.f23000k.getJSNotifyProxy().mo62839a(i2);
                                                if (this.f23000k.getJSCommon().mo62830g() == 2) {
                                                    this.f23000k.getJSVideoModule().setVisible(0);
                                                    C9532i jSVideoModule = this.f23000k.getJSVideoModule();
                                                    this.f23000k.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else if (i == 12) {
                                                    if (this.f23003n == 1) {
                                                        if (this.f22974b.getAdSpaceT() != 2) {
                                                            this.f23000k.getJSContainerModule().showEndcard(this.f22974b.getVideo_end_type());
                                                        } else {
                                                            this.f23000k.getJSContainerModule().showVideoEndCover();
                                                        }
                                                    }
                                                } else if (this.f22974b.getAdSpaceT() != 2) {
                                                    this.f23000k.getJSContainerModule().showEndcard(this.f22974b.getVideo_end_type());
                                                } else {
                                                    this.f23000k.getJSContainerModule().showVideoEndCover();
                                                }
                                                this.f23000k.getJSVideoModule().dismissAllAlert();
                                                if (i == 12 && !this.f23004o && this.f23003n == 1) {
                                                    mo62792h();
                                                    mo62791g();
                                                    mo62790f();
                                                    mo62789e();
                                                    break;
                                                }
                                            case 13:
                                                if (!this.f23000k.getJSVideoModule().isH5Canvas()) {
                                                    this.f23000k.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.f23000k.getJSNotifyProxy().mo62839a(-1);
                                                break;
                                            case 14:
                                                if (!this.f23002m) {
                                                    this.f23000k.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof MBridgeVideoView.C9382a)) {
                                                    this.f23002m = true;
                                                    this.f23000k.getJSNotifyProxy().mo62842a((MBridgeVideoView.C9382a) obj);
                                                    break;
                                                }
                                            default:
                                                switch (i) {
                                                    case 123:
                                                    case 124:
                                                        C9527f jSNotifyProxy = this.f23000k.getJSNotifyProxy();
                                                        if (i == 123) {
                                                            i3 = 7;
                                                        }
                                                        jSNotifyProxy.mo62841a(i3, "");
                                                        break;
                                                    case 125:
                                                        this.f23000k.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        C9532i jSVideoModule2 = this.f23000k.getJSVideoModule();
                                        this.f23000k.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.f23000k.getJSCommon().mo62830g() == 2) {
                                    C9532i jSVideoModule3 = this.f23000k.getJSVideoModule();
                                    this.f23000k.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (!this.f23000k.getJSContainerModule().showAlertWebView()) {
                                this.f23000k.getJSVideoModule().showAlertView();
                            } else {
                                this.f23000k.getJSVideoModule().alertWebViewShowed();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f23000k.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.f23000k.getJSNotifyProxy().mo62841a(5, num + "");
                    }
                }
                this.f23000k.getJSVideoModule().dismissAllAlert();
                if (i == 2) {
                    this.f23000k.getJSNotifyProxy().mo62841a(2, "");
                }
                this.f23000k.getJSVideoModule().videoOperate(3);
                if (this.f23000k.getJSCommon().mo62830g() != 2) {
                    if (this.f22974b.getVideo_end_type() != 3) {
                        this.f23000k.getJSVideoModule().setVisible(8);
                    } else {
                        this.f23000k.getJSVideoModule().setVisible(0);
                    }
                    if (this.f23001l == 2 && !this.f23000k.getJSContainerModule().endCardShowing() && this.f22974b.getAdSpaceT() != 2) {
                        this.f23000k.getJSContainerModule().showEndcard(this.f22974b.getVideo_end_type());
                        this.f23000k.getJSNotifyProxy().mo62839a(1);
                    }
                }
                i = 16;
                this.f23000k.getJSNotifyProxy().mo62839a(1);
            } else if (!this.f23000k.getJSContainerModule().endCardShowing()) {
                this.f23000k.getJSNotifyProxy().mo62841a(1, "");
            }
        }
        super.mo62252a(i, obj);
    }
}
