package com.mbridge.msdk.video.module.p365a.p366a;

import android.os.Handler;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.mbridge.msdk.video.module.a.a.m */
/* compiled from: VideoViewDefaultListener */
public final class C9402m extends C9406o {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MBridgeVideoView f22989k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MBridgeContainerView f22990l;

    /* renamed from: m */
    private int f22991m;

    /* renamed from: n */
    private Timer f22992n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Handler f22993o = new Handler();

    /* renamed from: p */
    private boolean f22994p = false;

    /* renamed from: q */
    private boolean f22995q = false;

    /* renamed from: r */
    private int f22996r;

    /* renamed from: s */
    private int f22997s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9402m(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C9541c cVar, C9552a aVar, String str, String str2, int i, int i2, C9384a aVar2, int i3, boolean z, int i4) {
        super(campaignEx, cVar, aVar, str, str2, aVar2, i3, z);
        MBridgeVideoView mBridgeVideoView2 = mBridgeVideoView;
        MBridgeContainerView mBridgeContainerView2 = mBridgeContainerView;
        boolean z2 = true;
        this.f22996r = 1;
        this.f22989k = mBridgeVideoView2;
        this.f22990l = mBridgeContainerView2;
        this.f22997s = i;
        this.f22991m = i2;
        this.f22996r = i4;
        if (mBridgeVideoView2 != null) {
            this.f22994p = mBridgeVideoView.getVideoSkipTime() != 0 ? false : z2;
        }
        if (mBridgeVideoView2 == null || mBridgeContainerView2 == null) {
            this.f22973a = false;
        }
    }

    /* renamed from: a */
    public final void mo62252a(int i, Object obj) {
        Integer num;
        if (this.f22973a) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                switch (i) {
                                    case 10:
                                        this.f22995q = true;
                                        this.f22989k.soundOperate(0, 2);
                                        this.f22989k.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.f22989k.videoOperate(3);
                                        this.f22989k.dismissAllAlert();
                                        if (this.f22974b.getVideo_end_type() == 3) {
                                            this.f22989k.setVisibility(0);
                                        } else if (this.f22974b.getAdSpaceT() != 2) {
                                            this.f22989k.setVisibility(8);
                                        }
                                        if (this.f22974b.getAdSpaceT() != 2) {
                                            this.f22990l.showEndcard(this.f22974b.getVideo_end_type());
                                            break;
                                        } else {
                                            this.f22990l.showVideoEndCover();
                                            break;
                                        }
                                    case 12:
                                        mo62792h();
                                        this.f22989k.videoOperate(3);
                                        this.f22989k.dismissAllAlert();
                                        if (this.f22974b.getVideo_end_type() != 3) {
                                            this.f22989k.setVisibility(8);
                                        } else {
                                            this.f22989k.setVisibility(0);
                                        }
                                        if (this.f22995q || this.f22996r != 0) {
                                            if (!this.f22995q && this.f22996r == 1) {
                                                mo62791g();
                                                mo62790f();
                                                mo62789e();
                                            }
                                            if (this.f22974b.getAdSpaceT() == 2) {
                                                this.f22990l.showVideoEndCover();
                                                break;
                                            } else {
                                                this.f22990l.showEndcard(this.f22974b.getVideo_end_type());
                                                break;
                                            }
                                        }
                                    case 13:
                                        this.f22989k.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.f22994p) {
                                            this.f22989k.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof MBridgeVideoView.C9382a)) {
                                            MBridgeVideoView.C9382a aVar = (MBridgeVideoView.C9382a) obj;
                                            int videoInteractiveType = this.f22990l.getVideoInteractiveType();
                                            if (this.f22974b.getAdSpaceT() == 2) {
                                                this.f22990l.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && aVar.f22942a >= videoInteractiveType) {
                                                this.f22990l.showVideoClickView(1);
                                                this.f22989k.soundOperate(0, 1);
                                            }
                                            this.f22994p = aVar.f22944c;
                                            if (((this.f22991m >= 0 && (aVar.f22942a >= this.f22991m || aVar.f22942a == aVar.f22943b)) || (this.f22974b.getVideoCompleteTime() > 0 && (aVar.f22942a > this.f22974b.getVideoCompleteTime() || aVar.f22942a == aVar.f22943b))) && !this.f22994p) {
                                                this.f22989k.closeVideoOperate(0, 2);
                                                this.f22994p = true;
                                                break;
                                            }
                                        }
                                }
                            } else {
                                MBridgeContainerView mBridgeContainerView = this.f22990l;
                                if (mBridgeContainerView == null) {
                                    MBridgeVideoView mBridgeVideoView = this.f22989k;
                                    if (mBridgeVideoView != null) {
                                        mBridgeVideoView.showAlertView();
                                    }
                                } else if (!mBridgeContainerView.showAlertWebView()) {
                                    MBridgeVideoView mBridgeVideoView2 = this.f22989k;
                                    if (mBridgeVideoView2 != null) {
                                        mBridgeVideoView2.showAlertView();
                                    }
                                } else {
                                    MBridgeVideoView mBridgeVideoView3 = this.f22989k;
                                    if (mBridgeVideoView3 != null) {
                                        mBridgeVideoView3.alertWebViewShowed();
                                    }
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        if (((Integer) obj).intValue() == 1) {
                            num = 2;
                        } else {
                            num = 1;
                        }
                        this.f22989k.soundOperate(num.intValue(), -1);
                    }
                }
                this.f22989k.dismissAllAlert();
                this.f22989k.videoOperate(3);
                if (this.f22997s != 2 || this.f22990l.endCardShowing() || this.f22974b.getAdSpaceT() == 2) {
                    i = 16;
                } else {
                    this.f22990l.showEndcard(this.f22974b.getVideo_end_type());
                }
            } else if (!this.f22990l.endCardShowing()) {
                int videoInteractiveType2 = this.f22990l.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.f22990l.isLast()) {
                            this.f22990l.showVideoClickView(1);
                            this.f22989k.soundOperate(0, 1);
                            try {
                                m26932i();
                                this.f22992n = new Timer();
                                this.f22992n.schedule(new TimerTask() {
                                    public final void run() {
                                        try {
                                            C9402m.this.f22993o.post(new Runnable() {
                                                public final void run() {
                                                    C9402m.this.f22990l.showVideoClickView(-1);
                                                    C9402m.this.f22989k.soundOperate(0, 2);
                                                }
                                            });
                                        } catch (Throwable th) {
                                            if (MBridgeConstans.DEBUG) {
                                                th.printStackTrace();
                                            }
                                        }
                                    }
                                }, 3000);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            this.f22990l.showVideoClickView(-1);
                            this.f22989k.soundOperate(0, 2);
                            m26932i();
                        }
                    }
                } else if (this.f22990l.miniCardLoaded()) {
                    this.f22990l.showVideoClickView(2);
                }
            }
        }
        super.mo62252a(i, obj);
    }

    /* renamed from: i */
    private void m26932i() {
        try {
            if (this.f22992n != null) {
                this.f22992n.cancel();
                this.f22992n = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
