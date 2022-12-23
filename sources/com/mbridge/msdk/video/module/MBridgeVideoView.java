package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p301c.C8428c;
import com.mbridge.msdk.foundation.same.report.C8542e;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.video.dynview.C9247a;
import com.mbridge.msdk.video.dynview.C9249b;
import com.mbridge.msdk.video.dynview.p352c.C9256a;
import com.mbridge.msdk.video.dynview.p353d.C9260d;
import com.mbridge.msdk.video.dynview.p360i.C9295a;
import com.mbridge.msdk.video.dynview.p360i.C9297b;
import com.mbridge.msdk.video.dynview.p364j.C9311c;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.signal.C9532i;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.video.widget.SoundImageView;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import com.mbridge.msdk.widget.C9587a;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.C9593a;
import com.mbridge.msdk.widget.dialog.MBAlertDialog;
import org.json.JSONObject;

public class MBridgeVideoView extends MBridgeBaseView implements C9532i {
    /* access modifiers changed from: private */

    /* renamed from: W */
    public static boolean f22873W = false;

    /* renamed from: m */
    private static int f22874m;

    /* renamed from: n */
    private static int f22875n;

    /* renamed from: o */
    private static int f22876o;

    /* renamed from: p */
    private static int f22877p;

    /* renamed from: q */
    private static int f22878q;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C9384a f22879A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f22880B = false;

    /* renamed from: C */
    private String f22881C;

    /* renamed from: D */
    private int f22882D;

    /* renamed from: E */
    private int f22883E;

    /* renamed from: F */
    private int f22884F;

    /* renamed from: G */
    private MBAlertDialog f22885G;

    /* renamed from: H */
    private C9593a f22886H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public String f22887I = "";

    /* renamed from: J */
    private double f22888J;

    /* renamed from: K */
    private double f22889K;

    /* renamed from: L */
    private boolean f22890L = false;

    /* renamed from: M */
    private boolean f22891M = false;

    /* renamed from: N */
    private boolean f22892N = false;

    /* renamed from: O */
    private boolean f22893O = false;

    /* renamed from: P */
    private boolean f22894P = false;

    /* renamed from: Q */
    private boolean f22895Q = false;

    /* renamed from: R */
    private boolean f22896R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f22897S = false;

    /* renamed from: T */
    private boolean f22898T = false;

    /* renamed from: U */
    private int f22899U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public boolean f22900V = false;

    /* renamed from: aa */
    private int f22901aa = 2;

    /* renamed from: ab */
    private AdSession f22902ab;
    /* access modifiers changed from: private */

    /* renamed from: ac */
    public MediaEvents f22903ac;
    /* access modifiers changed from: private */

    /* renamed from: ad */
    public String f22904ad;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public int f22905ae;

    /* renamed from: af */
    private int f22906af;

    /* renamed from: ag */
    private int f22907ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f22908ah = false;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public boolean f22909ai = false;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public boolean f22910aj = false;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public boolean f22911ak = true;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public boolean f22912al = false;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public boolean f22913am = false;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public boolean f22914an = false;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public AlphaAnimation f22915ao;

    /* renamed from: ap */
    private C9383b f22916ap = new C9383b(this);

    /* renamed from: aq */
    private boolean f22917aq = false;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public PlayerView f22918r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public SoundImageView f22919s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public TextView f22920t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public View f22921u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public RelativeLayout f22922v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ImageView f22923w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ProgressBar f22924x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public FeedBackButton f22925y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f22926z;

    public void init(Context context) {
    }

    public void setContainerViewOnNotifyListener(C9384a aVar) {
        this.f22879A = aVar;
    }

    public boolean isShowingAlertView() {
        return this.f22880B;
    }

    public void setUnitId(String str) {
        this.f22887I = str;
        C9383b bVar = this.f22916ap;
        if (bVar != null) {
            bVar.mo62777a(str);
        }
    }

    public String getUnitId() {
        return this.f22887I;
    }

    public boolean isMiniCardShowing() {
        return this.f22893O;
    }

    public boolean isShowingTransparent() {
        return this.f22898T;
    }

    public void setShowingTransparent(boolean z) {
        this.f22898T = z;
    }

    public MBridgeVideoView(Context context) {
        super(context);
    }

    public MBridgeVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setVideoLayout(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f22694b = campaignEx;
            this.f22701i = campaignEx.isDynamicView();
        }
        if (this.f22701i) {
            C9249b.m26477a().mo62361a(new C9311c().mo62510a(this, campaignEx), new C9260d() {
                /* renamed from: a */
                public final void mo62280a(C9247a aVar) {
                    if (aVar != null) {
                        if (!(this == null || aVar.mo62357a() == null)) {
                            aVar.mo62357a().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                            this.addView(aVar.mo62357a());
                        }
                        if (aVar.mo62360b() != null) {
                            for (View onClickListener : aVar.mo62360b()) {
                                onClickListener.setOnClickListener(new C9587a() {
                                    /* access modifiers changed from: protected */
                                    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ab A[SYNTHETIC, Splitter:B:24:0x00ab] */
                                    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                                    /* renamed from: a */
                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                    public final void mo58122a(android.view.View r10) {
                                        /*
                                            r9 = this;
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.video.module.a.a r10 = r10.f22879A
                                            if (r10 == 0) goto L_0x00cb
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b
                                            if (r10 == 0) goto L_0x0076
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx$c r10 = r10.getRewardTemplateMode()     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r0 = ""
                                            if (r10 == 0) goto L_0x0033
                                            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0072 }
                                            r1.<init>()     // Catch:{ Exception -> 0x0072 }
                                            int r10 = r10.mo57202b()     // Catch:{ Exception -> 0x0072 }
                                            r1.append(r10)     // Catch:{ Exception -> 0x0072 }
                                            r1.append(r0)     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0072 }
                                        L_0x0033:
                                            r7 = r0
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            android.content.Context r0 = r10.f22693a     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r1 = "video_play_click"
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r2 = r10.getCampaignUnitId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            boolean r3 = r10.isBidCampaign()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r4 = r10.getRequestId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r5 = r10.getRequestIdNotice()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r10 = r10.f22694b     // Catch:{ Exception -> 0x0072 }
                                            java.lang.String r6 = r10.getId()     // Catch:{ Exception -> 0x0072 }
                                            com.mbridge.msdk.foundation.same.report.C8542e.m24704a((android.content.Context) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x0072 }
                                            goto L_0x0076
                                        L_0x0072:
                                            r10 = move-exception
                                            r10.printStackTrace()
                                        L_0x0076:
                                            r10 = 0
                                            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x008d }
                                            r0.<init>()     // Catch:{ JSONException -> 0x008d }
                                            java.lang.String r10 = com.mbridge.msdk.foundation.same.C8413a.f20325g     // Catch:{ JSONException -> 0x008b }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r1 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ JSONException -> 0x008b }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r1 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ JSONException -> 0x008b }
                                            r2 = 0
                                            org.json.JSONObject r1 = r1.mo62562a(r2)     // Catch:{ JSONException -> 0x008b }
                                            r0.put(r10, r1)     // Catch:{ JSONException -> 0x008b }
                                            goto L_0x0094
                                        L_0x008b:
                                            r10 = move-exception
                                            goto L_0x0091
                                        L_0x008d:
                                            r0 = move-exception
                                            r8 = r0
                                            r0 = r10
                                            r10 = r8
                                        L_0x0091:
                                            r10.printStackTrace()
                                        L_0x0094:
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r10 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this
                                            com.mbridge.msdk.video.module.MBridgeVideoView r10 = com.mbridge.msdk.video.module.MBridgeVideoView.this
                                            com.mbridge.msdk.video.module.a.a r10 = r10.f22879A
                                            r1 = 105(0x69, float:1.47E-43)
                                            r10.mo62252a(r1, r0)
                                            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
                                            android.content.Context r10 = r10.mo15792g()
                                            if (r10 == 0) goto L_0x00cb
                                            com.mbridge.msdk.foundation.controller.a r10 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x00c1 }
                                            android.content.Context r10 = r10.mo15792g()     // Catch:{ Exception -> 0x00c1 }
                                            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView$1 r0 = com.mbridge.msdk.video.module.MBridgeVideoView.C93721.this     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.MBridgeVideoView r0 = com.mbridge.msdk.video.module.MBridgeVideoView.this     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r0.f22694b     // Catch:{ Exception -> 0x00c1 }
                                            com.mbridge.msdk.video.module.p367b.C9410b.m26953d(r10, r0)     // Catch:{ Exception -> 0x00c1 }
                                            goto L_0x00cb
                                        L_0x00c1:
                                            r10 = move-exception
                                            java.lang.String r10 = r10.getMessage()
                                            java.lang.String r0 = "MBridgeBaseView"
                                            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r0, r10)
                                        L_0x00cb:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoView.C93721.C93731.mo58122a(android.view.View):void");
                                    }
                                });
                            }
                        }
                        MBridgeVideoView.this.m26848a();
                        boolean unused = MBridgeVideoView.f22873W = false;
                    }
                }

                /* renamed from: a */
                public final void mo62281a(C9256a aVar) {
                    C8608u.m24884d(MBridgeBaseView.TAG, "errorMsg：" + aVar.mo62387b());
                }
            });
            return;
        }
        int findLayout = findLayout("mbridge_reward_videoview_item");
        if (findLayout > 0) {
            this.f22695c.inflate(findLayout, this);
            m26848a();
        }
        f22873W = false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m26848a() {
        this.f22698f = m26860e();
        if (!this.f22698f) {
            C8608u.m24884d(MBridgeBaseView.TAG, "MBridgeVideoView init fail");
        }
        mo62563c();
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
        this.f22915ao = alphaAnimation;
        alphaAnimation.setDuration(200);
    }

    public void setIsIV(boolean z) {
        this.f22900V = z;
        C9383b bVar = this.f22916ap;
        if (bVar != null) {
            bVar.mo62778a(z);
        }
    }

    public void setCampaign(CampaignEx campaignEx) {
        int i;
        super.setCampaign(campaignEx);
        C9383b bVar = this.f22916ap;
        if (bVar != null) {
            bVar.mo62776a(campaignEx);
            C9383b bVar2 = this.f22916ap;
            if (campaignEx == null) {
                i = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22887I, false).mo63170p();
            } else if (campaignEx.getReady_rate() != -1) {
                i = campaignEx.getReady_rate();
            } else {
                i = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22887I, false).mo63170p();
            }
            bVar2.mo62775a(i, C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22887I, false).mo63172q());
        }
    }

    public void setSoundState(int i) {
        this.f22901aa = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62563c() {
        super.mo62563c();
        if (this.f22698f) {
            if (!this.f22701i) {
                this.f22918r.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (MBridgeVideoView.this.f22697e != null) {
                            MBridgeVideoView.this.f22697e.mo62252a(1, "");
                        }
                    }
                });
            } else if (C9297b.m26661a(this.f22694b) == -1 || C9297b.m26661a(this.f22694b) == 100) {
                this.f22918r.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (MBridgeVideoView.this.f22697e != null) {
                            MBridgeVideoView.this.f22697e.mo62252a(1, "");
                        }
                        if (MBridgeVideoView.this.f22903ac != null) {
                            MBridgeVideoView.this.f22903ac.adUserInteraction(InteractionType.CLICK);
                        }
                    }
                });
            }
            this.f22919s.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    int i = 2;
                    if (MBridgeVideoView.this.f22918r != null && MBridgeVideoView.this.f22918r.isSilent()) {
                        i = 1;
                    }
                    if (MBridgeVideoView.this.f22697e != null) {
                        MBridgeVideoView.this.f22697e.mo62252a(5, i);
                    }
                }
            });
            this.f22921u.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (MBridgeVideoView.this.f22900V) {
                        boolean unused = MBridgeVideoView.this.f22914an = true;
                        if (MBridgeVideoView.this.f22911ak) {
                            MBridgeVideoView.this.m26853b();
                        } else if (MBridgeVideoView.this.f22697e != null) {
                            MBridgeVideoView.this.f22697e.mo62252a(123, "");
                        }
                    } else {
                        MBridgeVideoView.this.m26853b();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m26853b() {
        try {
            if (this.f22900V) {
                if (this.f22905ae == C8413a.f20332n || this.f22905ae == C8413a.f20333o) {
                    if (this.f22908ah) {
                        if (this.f22905ae == C8413a.f20333o && this.f22697e != null) {
                            this.f22697e.mo62252a(2, m26852b(this.f22912al));
                            return;
                        }
                        return;
                    } else if (this.f22905ae != C8413a.f20333o || !this.f22914an) {
                        if (this.f22911ak) {
                            int curPosition = this.f22918r.getCurPosition() / 1000;
                            int videoLength = (int) ((((float) curPosition) / ((float) (this.f22918r.getDuration() == 0 ? this.f22694b.getVideoLength() : this.f22918r.getDuration()))) * 100.0f);
                            if (this.f22905ae == C8413a.f20332n) {
                                m26864f();
                                if (this.f22906af != C8413a.f20334p || videoLength < this.f22907ag) {
                                    if (this.f22906af != C8413a.f20335q || curPosition < this.f22907ag) {
                                        if (this.f22697e != null) {
                                            this.f22697e.mo62252a(8, "");
                                        }
                                    } else if (this.f22697e != null) {
                                        this.f22697e.mo62252a(2, m26852b(this.f22912al));
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (this.f22697e != null) {
                                    this.f22697e.mo62252a(2, m26852b(this.f22912al));
                                    return;
                                } else {
                                    return;
                                }
                            }
                            if (this.f22905ae != C8413a.f20333o) {
                                return;
                            }
                            if (this.f22906af == C8413a.f20334p && videoLength >= this.f22907ag) {
                                m26864f();
                                if (this.f22697e != null) {
                                    this.f22697e.mo62252a(8, "");
                                    return;
                                }
                                return;
                            } else if (this.f22906af == C8413a.f20335q && curPosition >= this.f22907ag) {
                                m26864f();
                                if (this.f22697e != null) {
                                    this.f22697e.mo62252a(8, "");
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (this.f22697e != null) {
                        this.f22697e.mo62252a(2, m26852b(this.f22912al));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (this.f22694b != null && this.f22694b.getAdSpaceT() != 2) {
                int videoCompleteTime = this.f22694b.getVideoCompleteTime();
                if (((videoCompleteTime > 0 && this.f22918r.getCurPosition() / 1000 < videoCompleteTime) || videoCompleteTime == 0) && this.f22884F == 1 && !this.f22898T) {
                    m26864f();
                    if (this.f22697e != null) {
                        this.f22697e.mo62252a(8, "");
                    }
                } else if (this.f22697e != null) {
                    this.f22697e.mo62252a(2, "");
                }
            } else if (this.f22697e != null) {
                this.f22697e.mo62252a(2, "");
            }
        } catch (Exception e) {
            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
        }
    }

    public void hideAlertView(int i) {
        if (this.f22880B) {
            this.f22880B = false;
            this.f22908ah = true;
            setShowingAlertViewCover(false);
            C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22887I, false);
            C8542e.m24698a(this.f22693a, this.f22694b, C9551c.f23420a, this.f22887I, 1, i);
            if (i == 0) {
                m26866g();
                if (!this.f22900V) {
                    return;
                }
                if (this.f22905ae == C8413a.f20333o || this.f22905ae == C8413a.f20332n) {
                    this.f22909ai = true;
                    if (this.f22697e != null) {
                        this.f22697e.mo62252a(124, "");
                    }
                    this.f22913am = true;
                    gonePlayingCloseView();
                    return;
                }
                return;
            }
            this.f22910aj = true;
            if (this.f22900V && this.f22905ae == C8413a.f20333o) {
                m26866g();
            } else if (!this.f22900V || this.f22905ae != C8413a.f20332n) {
                if (this.f22697e != null) {
                    this.f22697e.mo62252a(2, "");
                }
            } else if (this.f22697e != null) {
                this.f22697e.mo62252a(2, m26852b(this.f22912al));
            }
        }
    }

    public void alertWebViewShowed() {
        this.f22880B = true;
        setShowingAlertViewCover(true);
    }

    public void dismissAllAlert() {
        MBAlertDialog mBAlertDialog = this.f22885G;
        if (mBAlertDialog != null) {
            mBAlertDialog.dismiss();
        }
        if (this.f22697e != null) {
            this.f22697e.mo62252a(125, "");
        }
    }

    public void showAlertView() {
        if (!this.f22893O) {
            if (this.f22886H == null) {
                this.f22886H = new C9593a() {
                    /* renamed from: a */
                    public final void mo15754a() {
                        boolean unused = MBridgeVideoView.this.f22880B = false;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f22880B);
                        if (MBridgeVideoView.this.f22900V && (MBridgeVideoView.this.f22905ae == C8413a.f20333o || MBridgeVideoView.this.f22905ae == C8413a.f20332n)) {
                            boolean unused2 = MBridgeVideoView.this.f22909ai = true;
                            if (MBridgeVideoView.this.f22697e != null) {
                                MBridgeVideoView.this.f22697e.mo62252a(124, "");
                            }
                            boolean unused3 = MBridgeVideoView.this.f22913am = true;
                            MBridgeVideoView.this.gonePlayingCloseView();
                        }
                        MBridgeVideoView.this.m26866g();
                        C8542e.m24698a(MBridgeVideoView.this.f22693a, MBridgeVideoView.this.f22694b, MBridgeVideoView.this.f22904ad, MBridgeVideoView.this.f22887I, 1, 0);
                    }

                    /* renamed from: b */
                    public final void mo15755b() {
                        boolean unused = MBridgeVideoView.this.f22880B = false;
                        boolean unused2 = MBridgeVideoView.this.f22910aj = true;
                        MBridgeVideoView mBridgeVideoView = MBridgeVideoView.this;
                        mBridgeVideoView.setShowingAlertViewCover(mBridgeVideoView.f22880B);
                        C8542e.m24698a(MBridgeVideoView.this.f22693a, MBridgeVideoView.this.f22694b, MBridgeVideoView.this.f22904ad, MBridgeVideoView.this.f22887I, 1, 1);
                        if (!MBridgeVideoView.this.f22900V || MBridgeVideoView.this.f22905ae != C8413a.f20332n) {
                            if (MBridgeVideoView.this.f22900V && MBridgeVideoView.this.f22905ae == C8413a.f20333o) {
                                MBridgeVideoView.this.m26866g();
                            } else if (MBridgeVideoView.this.f22697e != null) {
                                MBridgeVideoView.this.f22697e.mo62252a(2, "");
                            }
                        } else if (MBridgeVideoView.this.f22697e != null) {
                            C9384a aVar = MBridgeVideoView.this.f22697e;
                            MBridgeVideoView mBridgeVideoView2 = MBridgeVideoView.this;
                            aVar.mo62252a(2, mBridgeVideoView2.m26852b(mBridgeVideoView2.f22912al));
                        }
                    }
                };
            }
            if (this.f22885G == null) {
                MBAlertDialog mBAlertDialog = new MBAlertDialog(getContext(), this.f22886H);
                this.f22885G = mBAlertDialog;
                AdSession adSession = this.f22902ab;
                if (adSession != null) {
                    adSession.addFriendlyObstruction(mBAlertDialog.getWindow().getDecorView(), FriendlyObstructionPurpose.NOT_VISIBLE, (String) null);
                }
            }
            if (this.f22900V) {
                this.f22885G.makeIVAlertView(this.f22905ae, this.f22887I);
            } else {
                this.f22885G.makeRVAlertView(this.f22887I);
            }
            PlayerView playerView = this.f22918r;
            if (playerView != null && !playerView.isComplete()) {
                this.f22885G.show();
                this.f22908ah = true;
                this.f22880B = true;
                setShowingAlertViewCover(true);
                C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f22887I, false);
                this.f22904ad = C9551c.f23420a;
                C8542e.m24697a(this.f22693a, this.f22694b, this.f22904ad, this.f22887I, 1);
            }
        }
    }

    public void preLoadData(C9529b bVar) {
        if (this.f22698f && !TextUtils.isEmpty(this.f22881C) && this.f22694b != null) {
            AdSession adSession = this.f22902ab;
            if (adSession != null) {
                adSession.registerAdView(this.f22918r);
                this.f22902ab.addFriendlyObstruction(this.f22919s, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22902ab.addFriendlyObstruction(this.f22920t, FriendlyObstructionPurpose.OTHER, (String) null);
                this.f22902ab.addFriendlyObstruction(this.f22921u, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
            }
            if (this.f22694b != null && C8556ac.m24738b(this.f22694b.getVideoResolution())) {
                String videoResolution = this.f22694b.getVideoResolution();
                C8608u.m24882b(MBridgeBaseView.TAG, "MBridgeBaseView videoResolution:" + videoResolution);
                String[] split = videoResolution.split("x");
                if (split.length == 2) {
                    if (C8613y.m24928b(split[0]) > 0.0d) {
                        this.f22888J = C8613y.m24928b(split[0]);
                    }
                    if (C8613y.m24928b(split[1]) > 0.0d) {
                        this.f22889K = C8613y.m24928b(split[1]);
                    }
                    C8608u.m24882b(MBridgeBaseView.TAG, "MBridgeBaseView mVideoW:" + this.f22888J + "  mVideoH:" + this.f22889K);
                }
                if (this.f22888J <= 0.0d) {
                    this.f22888J = 1280.0d;
                }
                if (this.f22889K <= 0.0d) {
                    this.f22889K = 720.0d;
                }
            }
            this.f22918r.initBufferIngParam(this.f22883E);
            this.f22918r.initVFPData(this.f22881C, this.f22694b.getVideoUrlEncode(), this.f22916ap);
            soundOperate(this.f22901aa, -1, (String) null);
        }
        f22873W = false;
    }

    public void defaultShow() {
        super.defaultShow();
        this.f22890L = true;
        showVideoLocation(0, 0, C8613y.m24950h(this.f22693a), C8613y.m24948g(this.f22693a), 0, 0, 0, 0, 0);
        videoOperate(1);
        if (this.f22882D == 0) {
            closeVideoOperate(-1, 2);
        }
    }

    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C8608u.m24882b(MBridgeBaseView.TAG, "showVideoLocation marginTop:" + i + " marginLeft:" + i2 + " width:" + i3 + "  height:" + i4 + " radius:" + i5 + " borderTop:" + i6 + " borderLeft:" + i7 + " borderWidth:" + i8 + " borderHeight:" + i9);
        if (this.f22698f) {
            this.f22922v.setPadding(0, 0, 0, 0);
            setVisibility(0);
            if (this.f22922v.getVisibility() != 0) {
                this.f22922v.setVisibility(0);
            }
            if (this.f22920t.getVisibility() == 0) {
                m26875j();
            }
            if (!(i3 > 0 && i4 > 0 && C8613y.m24950h(this.f22693a) >= i3 && C8613y.m24948g(this.f22693a) >= i4) || this.f22890L) {
                m26869h();
                return;
            }
            f22875n = i6;
            f22876o = i7;
            f22877p = i8 + 4;
            f22878q = i9 + 4;
            float f = ((float) i3) / ((float) i4);
            float f2 = 0.0f;
            try {
                f2 = (float) (this.f22888J / this.f22889K);
            } catch (Throwable th) {
                C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
            }
            if (i5 > 0) {
                f22874m = i5;
                if (i5 > 0) {
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius((float) C8613y.m24929b(getContext(), (float) i5));
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setStroke(1, 0);
                    if (Build.VERSION.SDK_INT >= 16) {
                        setBackground(gradientDrawable);
                        this.f22918r.setBackground(gradientDrawable);
                    } else {
                        setBackgroundDrawable(gradientDrawable);
                        this.f22918r.setBackgroundDrawable(gradientDrawable);
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        setClipToOutline(true);
                        this.f22918r.setClipToOutline(true);
                    }
                }
            }
            if (Math.abs(f - f2) <= 0.1f || this.f22899U == 1) {
                m26869h();
                if (this.f22898T) {
                    setLayoutCenter(i3, i4);
                    if (f22873W) {
                        this.f22697e.mo62252a(114, "");
                    } else {
                        this.f22697e.mo62252a(116, "");
                    }
                } else {
                    setLayoutParam(i2, i, i3, i4);
                }
            } else {
                m26869h();
                videoOperate(1);
            }
        }
    }

    public void soundOperate(int i, int i2) {
        soundOperate(i, i2, "2");
    }

    public void soundOperate(int i, int i2, String str) {
        if (this.f22698f) {
            this.f22901aa = i;
            if (i == 1) {
                this.f22919s.setSoundStatus(false);
                this.f22918r.closeSound();
                try {
                    if (this.f22903ac != null) {
                        this.f22903ac.volumeChange(0.0f);
                    }
                } catch (IllegalArgumentException e) {
                    C8608u.m24880a("OMSDK", e.getMessage());
                }
            } else if (i == 2) {
                this.f22919s.setSoundStatus(true);
                this.f22918r.openSound();
                try {
                    if (this.f22903ac != null) {
                        this.f22903ac.volumeChange(1.0f);
                    }
                } catch (IllegalArgumentException e2) {
                    C8608u.m24880a("OMSDK", e2.getMessage());
                }
            }
            if (this.f22694b != null && this.f22694b.isDynamicView()) {
                this.f22919s.setVisibility(0);
            } else if (i2 == 1) {
                this.f22919s.setVisibility(8);
            } else if (i2 == 2) {
                this.f22919s.setVisibility(0);
            }
        }
        if (str != null && str.equals("2") && this.f22697e != null) {
            this.f22697e.mo62252a(7, Integer.valueOf(i));
        }
    }

    public void videoOperate(int i) {
        C8608u.m24880a(MBridgeBaseView.TAG, "VideoView videoOperate:" + i);
        if (!this.f22698f) {
            return;
        }
        if (i == 1) {
            if (getVisibility() == 0 && isfront()) {
                C8608u.m24880a(MBridgeBaseView.TAG, "VideoView videoOperate:play");
                if (!this.f22880B && !C2347b.f4898c) {
                    m26866g();
                }
            }
        } else if (i == 2) {
            if (getVisibility() == 0 && isfront()) {
                C8608u.m24880a(MBridgeBaseView.TAG, "VideoView videoOperate:pause");
                m26864f();
            }
        } else if (i == 3 && !this.f22892N) {
            this.f22918r.release();
            this.f22892N = true;
        }
    }

    public void closeVideoOperate(int i, int i2) {
        if (i == 1) {
            this.f22914an = true;
            if (getVisibility() == 0) {
                m26853b();
            }
        }
        if (i2 == 1) {
            gonePlayingCloseView();
        } else if (i2 != 2) {
        } else {
            if ((!this.f22913am || getVisibility() != 0) && this.f22698f && this.f22921u.getVisibility() != 0) {
                if (!this.f22701i || this.f22926z) {
                    this.f22921u.setVisibility(0);
                }
                this.f22894P = true;
            }
        }
    }

    public void progressBarOperate(int i) {
        ProgressBar progressBar;
        if (!this.f22698f) {
            return;
        }
        if (i == 1) {
            ProgressBar progressBar2 = this.f22924x;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
        } else if (i == 2 && (progressBar = this.f22924x) != null) {
            progressBar.setVisibility(0);
        }
    }

    public void progressOperate(int i, int i2) {
        if (this.f22698f) {
            C8608u.m24882b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
            int videoLength = this.f22694b != null ? this.f22694b.getVideoLength() : 0;
            if (i > 0 && i <= videoLength && this.f22918r != null) {
                C8608u.m24882b(MBridgeBaseView.TAG, "progressOperate progress:" + i);
                this.f22918r.seekTo(i * 1000);
            }
            if (i2 == 1) {
                this.f22920t.setVisibility(8);
            } else if (i2 == 2) {
                this.f22920t.setVisibility(0);
            }
            if (this.f22920t.getVisibility() == 0) {
                m26875j();
            }
        }
    }

    public String getCurrentProgress() {
        try {
            int a = this.f22916ap.mo62774a();
            int i = 0;
            if (this.f22694b != null) {
                i = this.f22694b.getVideoLength();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, m26847a(a, i));
            jSONObject.put("time", a);
            jSONObject.put("duration", i + "");
            return jSONObject.toString();
        } catch (Throwable th) {
            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
            return JsonUtils.EMPTY_JSON;
        }
    }

    public void setScaleFitXY(int i) {
        this.f22899U = i;
    }

    public void setVisible(int i) {
        setVisibility(i);
    }

    public void setCover(boolean z) {
        if (this.f22698f) {
            this.f22918r.setIsCovered(z);
        }
    }

    public void setMiniEndCardState(boolean z) {
        this.f22893O = z;
    }

    public void setShowingAlertViewCover(boolean z) {
        this.f22918r.setIsCovered(z);
    }

    public boolean isH5Canvas() {
        return getLayoutParams().height < C8613y.m24948g(this.f22693a.getApplicationContext());
    }

    public int getBorderViewHeight() {
        return f22878q;
    }

    public int getBorderViewWidth() {
        return f22877p;
    }

    public int getBorderViewLeft() {
        return f22876o;
    }

    public int getBorderViewTop() {
        return f22875n;
    }

    public int getBorderViewRadius() {
        return f22874m;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if ((this.f22694b == null || !this.f22694b.isDynamicView()) && this.f22698f && this.f22890L) {
            m26869h();
        }
    }

    /* renamed from: a */
    private String m26847a(int i, int i2) {
        if (i2 != 0) {
            double d = (double) (((float) i) / ((float) i2));
            try {
                return C8613y.m24910a(Double.valueOf(d)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2 + "";
    }

    public int getCloseAlert() {
        return this.f22884F;
    }

    public void setCloseAlert(int i) {
        this.f22884F = i;
    }

    public int getVideoSkipTime() {
        return this.f22882D;
    }

    public void setVideoSkipTime(int i) {
        this.f22882D = i;
    }

    public void setPlayURL(String str) {
        this.f22881C = str;
    }

    public void setBufferTimeout(int i) {
        this.f22883E = i;
    }

    /* renamed from: e */
    private boolean m26860e() {
        try {
            this.f22918r = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f22919s = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f22920t = (TextView) findViewById(findID("mbridge_tv_count"));
            View findViewById = findViewById(findID("mbridge_rl_playing_close"));
            this.f22921u = findViewById;
            findViewById.setVisibility(4);
            this.f22922v = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.f22923w = (ImageView) findViewById(findID("mbridge_videoview_bg"));
            this.f22924x = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f22925y = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            return isNotNULL(this.f22918r, this.f22919s, this.f22920t, this.f22921u);
        } catch (Throwable th) {
            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    public boolean isfront() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        int childCount = viewGroup.getChildCount();
        int i = indexOfChild + 1;
        boolean z = false;
        while (i <= childCount - 1) {
            if (viewGroup.getChildAt(i).getVisibility() == 0 && this.f22893O) {
                return false;
            }
            i++;
            z = true;
        }
        return z;
    }

    /* renamed from: f */
    private void m26864f() {
        try {
            if (this.f22918r != null) {
                this.f22918r.onPause();
                if (!(this.f22694b == null || this.f22694b.getNativeVideoTracking() == null || this.f22694b.isHasReportAdTrackPause())) {
                    this.f22694b.setHasReportAdTrackPause(true);
                    C2295a.m5362a(C2350a.m5601e().mo15792g(), this.f22694b, this.f22887I, this.f22694b.getNativeVideoTracking().mo57386f(), false, false);
                }
                if (this.f22903ac != null) {
                    this.f22903ac.pause();
                    C8608u.m24880a("omsdk", "play:  videoEvents.pause()");
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a(MBridgeBaseView.TAG, th.getMessage(), th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m26866g() {
        try {
            if (!this.f22891M) {
                try {
                    if (this.f22903ac != null) {
                        float duration = (float) this.f22918r.getDuration();
                        float f = 0.0f;
                        if (duration == 0.0f && this.f22694b != null) {
                            duration = (float) this.f22694b.getVideoLength();
                        }
                        MediaEvents mediaEvents = this.f22903ac;
                        if (getMute() == 2) {
                            f = 1.0f;
                        }
                        mediaEvents.start(duration, f);
                        C8608u.m24880a("omsdk", "play: videoEvents.start()");
                    }
                } catch (IllegalArgumentException e) {
                    C8608u.m24880a(MBridgeBaseView.TAG, e.getMessage());
                }
                boolean playVideo = this.f22918r.playVideo();
                if (!(this.f22694b == null || this.f22694b.getPlayable_ads_without_video() == 2 || playVideo || this.f22916ap == null)) {
                    this.f22916ap.onPlayError("play video failed");
                }
                this.f22891M = true;
                return;
            }
            this.f22918r.onResume();
            try {
                if (this.f22903ac != null) {
                    this.f22903ac.resume();
                    C8608u.m24880a("omsdk", "play:  videoEvents.resume()");
                }
            } catch (IllegalArgumentException e2) {
                C8608u.m24880a(MBridgeBaseView.TAG, e2.getMessage());
            }
        } catch (Exception e3) {
            C8608u.m24881a(MBridgeBaseView.TAG, e3.getMessage(), e3);
        }
    }

    public void gonePlayingCloseView() {
        if (this.f22698f && this.f22921u.getVisibility() != 8) {
            this.f22921u.setVisibility(8);
            this.f22894P = false;
        }
        if (!this.f22917aq && !this.f22897S && !this.f22895Q) {
            this.f22917aq = true;
            int i = this.f22882D;
            if (i >= 0) {
                if (i == 0) {
                    this.f22897S = true;
                } else {
                    new Handler().postDelayed(new Runnable() {
                        public final void run() {
                            boolean unused = MBridgeVideoView.this.f22897S = true;
                        }
                    }, (long) (this.f22882D * 1000));
                }
            }
        }
    }

    /* renamed from: h */
    private void m26869h() {
        float f;
        float h = (float) C8613y.m24950h(this.f22693a);
        float g = (float) C8613y.m24948g(this.f22693a);
        int b = C8613y.m24929b(getContext(), 58.0f);
        int b2 = C8613y.m24929b(getContext(), 104.0f);
        if (this.f22694b != null && this.f22694b.getAdSpaceT() == 2) {
            int c = this.f22694b.getRewardTemplateMode().mo57203c();
            if (c == 1) {
                h -= (float) (b * 2);
                g -= (float) (b2 * 2);
            }
            if (c == 2) {
                h -= (float) (b2 * 2);
                g -= (float) (b * 2);
            }
            if (c == 0) {
                if (this.f22696d == 1) {
                    h -= (float) (b * 2);
                    f = (float) (b2 * 2);
                } else {
                    h -= (float) (b2 * 2);
                    f = (float) (b * 2);
                }
                g -= f;
            }
        }
        double d = this.f22888J;
        if (d > 0.0d) {
            double d2 = this.f22889K;
            if (d2 > 0.0d && h > 0.0f && g > 0.0f) {
                double d3 = d / d2;
                double d4 = (double) (h / g);
                C8608u.m24882b(MBridgeBaseView.TAG, "videoWHDivide:" + d3 + "  screenWHDivide:" + d4);
                double a = C8613y.m24910a(Double.valueOf(d3));
                double a2 = C8613y.m24910a(Double.valueOf(d4));
                C8608u.m24882b(MBridgeBaseView.TAG, "videoWHDivideFinal:" + a + "  screenWHDivideFinal:" + a2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22918r.getLayoutParams();
                if (a > a2) {
                    layoutParams.width = -1;
                    layoutParams.height = (int) ((((double) h) * this.f22889K) / this.f22888J);
                    layoutParams.gravity = 17;
                } else if (a < a2) {
                    layoutParams.width = (int) (((double) g) * d3);
                    layoutParams.height = -1;
                    layoutParams.gravity = 17;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -1;
                }
                try {
                    if (this.f22694b != null && this.f22694b.isDynamicView()) {
                        int b3 = this.f22694b.getRewardTemplateMode().mo57202b();
                        int c2 = this.f22694b.getRewardTemplateMode().mo57203c();
                        if (b3 == 102 || b3 == 202) {
                            if (c2 == 1) {
                                layoutParams.width = -1;
                                layoutParams.gravity = 17;
                                layoutParams.height = (int) (this.f22889K / (this.f22888J / ((double) h)));
                            } else {
                                layoutParams.height = -1;
                                layoutParams.gravity = 17;
                                layoutParams.width = (int) (((double) g) * d3);
                            }
                        }
                        if (b3 == 202 && !TextUtils.isEmpty(this.f22694b.getImageUrl())) {
                            m26849a(this.f22694b.getImageUrl());
                        }
                        if (b3 == 302 || b3 == 802) {
                            if (this.f22888J / this.f22889K > 1.0d) {
                                layoutParams.width = -1;
                                layoutParams.height = (int) ((this.f22889K * ((double) h)) / this.f22888J);
                            } else {
                                int b4 = C8613y.m24929b(getContext(), 220.0f);
                                layoutParams.width = (int) ((this.f22888J * ((double) b4)) / this.f22889K);
                                layoutParams.height = b4;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8608u.m24884d(MBridgeBaseView.TAG, th.getMessage());
                }
                this.f22918r.setLayoutParams(layoutParams);
                setMatchParent();
                return;
            }
        }
        m26873i();
    }

    /* renamed from: i */
    private void m26873i() {
        try {
            setLayoutParam(0, 0, -1, -1);
            if (!isLandscape() && this.f22698f) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f22918r.getLayoutParams();
                int h = C8613y.m24950h(this.f22693a);
                layoutParams.width = -1;
                layoutParams.height = (h * 9) / 16;
                layoutParams.gravity = 17;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$b */
    private static final class C9383b extends DefaultVideoPlayerStatusListener {

        /* renamed from: a */
        private MBridgeVideoView f22945a;

        /* renamed from: b */
        private int f22946b;

        /* renamed from: c */
        private int f22947c;

        /* renamed from: d */
        private boolean f22948d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public MediaEvents f22949e;

        /* renamed from: f */
        private C9382a f22950f = new C9382a();

        /* renamed from: g */
        private boolean f22951g = false;

        /* renamed from: h */
        private boolean f22952h = false;

        /* renamed from: i */
        private boolean f22953i = false;

        /* renamed from: j */
        private boolean f22954j;

        /* renamed from: k */
        private String f22955k;

        /* renamed from: l */
        private CampaignEx f22956l;

        /* renamed from: m */
        private int f22957m;

        /* renamed from: n */
        private int f22958n;

        /* renamed from: o */
        private boolean f22959o = false;

        /* renamed from: a */
        public final void mo62776a(CampaignEx campaignEx) {
            this.f22956l = campaignEx;
        }

        /* renamed from: a */
        public final void mo62778a(boolean z) {
            this.f22954j = z;
        }

        /* renamed from: a */
        public final void mo62777a(String str) {
            this.f22955k = str;
        }

        /* renamed from: a */
        public final int mo62774a() {
            return this.f22946b;
        }

        /* renamed from: a */
        public final void mo62775a(int i, int i2) {
            this.f22957m = i;
            this.f22958n = i2;
        }

        public C9383b(MBridgeVideoView mBridgeVideoView) {
            this.f22945a = mBridgeVideoView;
        }

        public final void onPlayStarted(int i) {
            super.onPlayStarted(i);
            if (!this.f22948d) {
                MBridgeVideoView mBridgeVideoView = this.f22945a;
                if (mBridgeVideoView != null) {
                    boolean unused = mBridgeVideoView.f22926z = true;
                }
                this.f22945a.f22697e.mo62252a(10, this.f22950f);
                this.f22948d = true;
            }
            CampaignEx campaignEx = this.f22956l;
            if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
                this.f22945a.f22920t.setBackgroundResource(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_shape_progress", "drawable"));
            } else {
                this.f22945a.f22920t.setBackgroundResource(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_time_count_num_bg", "drawable"));
                if (!this.f22956l.isDynamicView()) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C8613y.m24929b(C2350a.m5601e().mo15792g(), 30.0f));
                    int b = C8613y.m24929b(C2350a.m5601e().mo15792g(), 5.0f);
                    layoutParams.addRule(1, C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_native_endcard_feed_btn", "id"));
                    layoutParams.setMargins(b, 0, 0, 0);
                    this.f22945a.f22920t.setPadding(b, 0, b, 0);
                    this.f22945a.f22920t.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f22945a.f22920t.getLayoutParams();
                    if (layoutParams2 != null) {
                        layoutParams2.width = -2;
                        layoutParams2.height = C8613y.m24929b(C2350a.m5601e().mo15792g(), 25.0f);
                        this.f22945a.f22920t.setLayoutParams(layoutParams2);
                    }
                    int b2 = C8613y.m24929b(C2350a.m5601e().mo15792g(), 5.0f);
                    this.f22945a.f22920t.setPadding(b2, 0, b2, 0);
                }
            }
            if (this.f22945a.f22924x != null) {
                this.f22945a.f22924x.setMax(i);
            }
            CampaignEx campaignEx2 = this.f22956l;
            if (campaignEx2 != null && campaignEx2.getAdSpaceT() == 2) {
                this.f22945a.f22922v.setVisibility(0);
            }
            if (this.f22945a.f22920t.getVisibility() == 0) {
                this.f22945a.m26875j();
            }
            boolean unused2 = MBridgeVideoView.f22873W = false;
        }

        public final void onPlayCompleted() {
            super.onPlayCompleted();
            boolean unused = this.f22945a.f22912al = true;
            CampaignEx campaignEx = this.f22956l;
            if (campaignEx != null) {
                if (campaignEx.getVideoCompleteTime() > 0) {
                    this.f22945a.f22920t.setText(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    this.f22945a.f22920t.setText("0");
                }
                if (this.f22956l.getAdSpaceT() == 2) {
                    this.f22945a.f22921u.setVisibility(4);
                    if (this.f22945a.f22925y != null) {
                        this.f22945a.f22925y.setClickable(false);
                    }
                    this.f22945a.f22919s.setClickable(false);
                }
            } else {
                this.f22945a.f22920t.setText("0");
            }
            MediaEvents mediaEvents = this.f22949e;
            if (mediaEvents != null) {
                mediaEvents.complete();
                C8608u.m24880a("omsdk", "play:  videoEvents.complete()");
            }
            this.f22945a.f22918r.setClickable(false);
            String f = this.f22945a.m26852b(true);
            this.f22945a.f22697e.mo62252a(121, "");
            this.f22945a.f22697e.mo62252a(11, f);
            this.f22946b = this.f22947c;
            boolean unused2 = MBridgeVideoView.f22873W = true;
        }

        public final void onPlayError(String str) {
            C8608u.m24884d("DefaultVideoPlayerStatusListener", "errorStr" + str);
            super.onPlayError(str);
            this.f22945a.f22697e.mo62252a(12, str);
        }

        public final void onPlayProgress(int i, int i2) {
            int i3;
            String str;
            String str2;
            String str3;
            StringBuilder sb;
            super.onPlayProgress(i, i2);
            if (this.f22945a.f22698f) {
                int i4 = 0;
                CampaignEx campaignEx = this.f22956l;
                if (campaignEx != null) {
                    i4 = campaignEx.getVideoCompleteTime();
                    C2347b.m5579a().mo15772b(this.f22956l.getCampaignUnitId() + "_" + 1, i);
                }
                if (i4 > i2) {
                    i4 = i2;
                }
                int i5 = i4 <= 0 ? i2 - i : i4 - i;
                if (i5 > 0) {
                    if (i4 <= 0) {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str3 = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i5);
                        str3 = (String) this.f22945a.getContext().getResources().getText(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_view_reward_time_left", "string"));
                    }
                    sb.append(str3);
                    str2 = sb.toString();
                } else if (i4 <= 0) {
                    str2 = "0";
                } else {
                    str2 = (String) this.f22945a.getContext().getResources().getText(C8594o.m24812a(C2350a.m5601e().mo15792g(), "mbridge_reward_video_view_reward_time_complete", "string"));
                }
                this.f22945a.f22920t.setText(str2);
                if (this.f22945a.f22924x != null && this.f22945a.f22924x.getVisibility() == 0) {
                    this.f22945a.f22924x.setProgress(i);
                }
            }
            this.f22947c = i2;
            this.f22950f.f22942a = i;
            this.f22950f.f22943b = i2;
            this.f22950f.f22944c = this.f22945a.f22913am;
            this.f22946b = i;
            this.f22945a.f22697e.mo62252a(15, this.f22950f);
            MediaEvents mediaEvents = this.f22949e;
            if (mediaEvents != null) {
                int i6 = (i * 100) / i2;
                int i7 = ((i + 1) * 100) / i2;
                if (i6 <= 25 && 25 < i7 && !this.f22951g) {
                    this.f22951g = true;
                    mediaEvents.firstQuartile();
                    C8608u.m24880a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i6 <= 50 && 50 < i7 && !this.f22952h) {
                    this.f22952h = true;
                    this.f22949e.midpoint();
                    C8608u.m24880a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i6 <= 75 && 75 < i7 && !this.f22953i) {
                    this.f22953i = true;
                    this.f22949e.thirdQuartile();
                    C8608u.m24880a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            if (this.f22945a.f22900V && !this.f22945a.f22908ah && this.f22945a.f22905ae == C8413a.f20333o) {
                this.f22945a.m26853b();
            }
            int i8 = this.f22957m;
            if (i8 != 100 && !this.f22959o && i8 != 0) {
                if (this.f22958n > i8) {
                    this.f22958n = i8 / 2;
                }
                int i9 = this.f22958n;
                if (i9 >= 0 && i >= (i3 = (i2 * i9) / 100)) {
                    if (this.f22956l.getAdType() == 94 || this.f22956l.getAdType() == 287) {
                        str = this.f22956l.getRequestId() + this.f22956l.getId() + this.f22956l.getVideoUrlEncode();
                    } else {
                        str = this.f22956l.getId() + this.f22956l.getVideoUrlEncode() + this.f22956l.getBidToken();
                    }
                    C9552a a = C9556c.getInstance().mo63224a(this.f22955k, str);
                    if (a != null) {
                        a.mo63215j();
                        this.f22959o = true;
                        C8608u.m24884d("DefaultVideoPlayerStatusListener", "CDRate is : " + i3 + " and start download !");
                    }
                }
            }
        }

        public final void onBufferingStart(String str) {
            try {
                super.onBufferingStart(str);
                if (this.f22949e != null) {
                    this.f22949e.bufferStart();
                }
                this.f22945a.f22697e.mo62252a(13, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f22949e != null) {
                    this.f22949e.bufferFinish();
                    C8608u.m24880a("omsdk", "play:  videoEvents.bufferFinish()");
                }
                this.f22945a.f22697e.mo62252a(14, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public final void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        /* renamed from: b */
        public final void mo62779b() {
            this.f22945a = null;
            boolean unused = MBridgeVideoView.f22873W = false;
        }
    }

    /* renamed from: com.mbridge.msdk.video.module.MBridgeVideoView$a */
    public static class C9382a {

        /* renamed from: a */
        public int f22942a;

        /* renamed from: b */
        public int f22943b;

        /* renamed from: c */
        public boolean f22944c;

        public final String toString() {
            return "ProgressData{curPlayPosition=" + this.f22942a + ", allDuration=" + this.f22943b + '}';
        }
    }

    public void onBackPress() {
        if (!this.f22893O && !this.f22880B && !this.f22909ai) {
            if (this.f22894P) {
                m26853b();
            } else if (this.f22895Q && this.f22896R) {
                m26853b();
            } else if (!this.f22895Q && this.f22897S) {
                m26853b();
            }
        }
    }

    public void notifyCloseBtn(int i) {
        if (i == 0) {
            this.f22895Q = true;
            this.f22897S = false;
        } else if (i == 1) {
            this.f22896R = true;
        }
    }

    public void showIVRewardAlertView(String str) {
        this.f22697e.mo62252a(8, "");
    }

    public void notifyVideoClose() {
        this.f22697e.mo62252a(2, "");
    }

    public void setAdSession(AdSession adSession) {
        this.f22902ab = adSession;
    }

    public void setVideoEvents(MediaEvents mediaEvents) {
        this.f22903ac = mediaEvents;
        C9383b bVar = this.f22916ap;
        if (bVar != null) {
            MediaEvents unused = bVar.f22949e = mediaEvents;
        }
    }

    public int getMute() {
        return this.f22901aa;
    }

    public void setIVRewardEnable(int i, int i2, int i3) {
        this.f22905ae = i;
        this.f22906af = i2;
        this.f22907ag = i3;
    }

    public void setDialogRole(int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f22911ak = z;
        C8608u.m24884d(MBridgeBaseView.TAG, i + " " + this.f22911ak);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public String m26852b(boolean z) {
        if (!this.f22900V) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (!this.f22908ah) {
                jSONObject.put("Alert_window_status", C8413a.f20336r);
            }
            if (this.f22910aj) {
                jSONObject.put("Alert_window_status", C8413a.f20338t);
            }
            if (this.f22909ai) {
                jSONObject.put("Alert_window_status", C8413a.f20337s);
            }
            jSONObject.put("complete_info", z ? 1 : 2);
            return jSONObject.toString();
        } catch (Exception unused) {
            C8608u.m24884d(MBridgeBaseView.TAG, "getIVRewardStatusString ERROR");
            return "";
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("NOTCH VideoView ");
        boolean z = false;
        sb.append(String.format("%1s-%2s-%3s-%4s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        C8608u.m24884d(MBridgeBaseView.TAG, sb.toString());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
        if (Math.max(Math.max(layoutParams.leftMargin, layoutParams.rightMargin), Math.max(layoutParams.topMargin, layoutParams.bottomMargin)) > Math.max(Math.max(i, i2), Math.max(i3, i4))) {
            z = true;
        }
        if (!z) {
            final int i5 = i;
            final int i6 = i3;
            final int i7 = i2;
            final int i8 = i4;
            this.f22922v.postDelayed(new Runnable() {
                public final void run() {
                    if (!(MBridgeVideoView.this.f22694b == null || MBridgeVideoView.this.f22694b.isDynamicView() || MBridgeVideoView.this.f22694b.getAdSpaceT() == 2)) {
                        MBridgeVideoView.this.f22922v.setPadding(i5, i6, i7, i8);
                        MBridgeVideoView.this.f22922v.startAnimation(MBridgeVideoView.this.f22915ao);
                    }
                    MBridgeVideoView.this.f22922v.setVisibility(0);
                }
            }, 200);
        }
        if (this.f22920t.getVisibility() == 0) {
            m26875j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m26875j() {
        if (C2347b.m5579a().mo15773b()) {
            this.f22694b.setCampaignUnitId(this.f22887I);
            C2347b a = C2347b.m5579a();
            a.mo15768a(this.f22887I + "_" + 1, this.f22694b);
            C2347b a2 = C2347b.m5579a();
            a2.mo15769a(this.f22887I + "_" + 1, this.f22925y);
            return;
        }
        FeedBackButton feedBackButton = this.f22925y;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m26849a(String str) {
        C8425b.m24339a(C2350a.m5601e().mo15792g()).mo57506a(str, (C8428c) new C8428c() {
            public final void onSuccessLoad(Bitmap bitmap, String str) {
                if (bitmap != null) {
                    try {
                        if (!bitmap.isRecycled() && MBridgeVideoView.this.f22923w != null) {
                            MBridgeVideoView.this.f22923w.setVisibility(0);
                            MBridgeVideoView.this.f22923w.setImageBitmap(C9295a.m26655a().mo62489a(bitmap, 20));
                        }
                    } catch (Throwable th) {
                        C8608u.m24884d(MBridgeBaseView.TAG, th.getMessage());
                    }
                }
            }

            public final void onFailedLoad(String str, String str2) {
                C8608u.m24884d(MBridgeBaseView.TAG, str);
            }
        });
    }

    public void releasePlayer() {
        try {
            if (this.f22918r != null && !this.f22892N) {
                this.f22918r.release();
            }
            if (this.f22916ap != null) {
                this.f22916ap.mo62779b();
            }
            if (this.f22879A != null) {
                this.f22879A = null;
            }
        } catch (Exception e) {
            C8608u.m24884d(MBridgeBaseView.TAG, e.getMessage());
        }
    }
}
