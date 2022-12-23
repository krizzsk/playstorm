package com.mbridge.msdk.video.p346bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8402c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.p066db.C2369b;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.tools.C8582k;
import com.mbridge.msdk.foundation.tools.C8594o;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.video.dynview.p353d.C9257a;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.video.p346bt.module.p348a.C9236a;
import com.mbridge.msdk.video.p346bt.module.p348a.C9237b;
import com.mbridge.msdk.video.p346bt.module.p349b.C9246h;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;
import com.mbridge.msdk.video.signal.factory.C9529b;
import com.mbridge.msdk.video.signal.p369a.C9416c;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer */
public class MBridgeBTContainer extends AbstractJSContainer implements C9431b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f22261a = MBridgeBTContainer.class.getSimpleName();

    /* renamed from: A */
    private boolean f22262A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public List<CampaignEx> f22263B;

    /* renamed from: C */
    private List<C9552a> f22264C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C9236a f22265D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C9246h f22266E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C9246h f22267F;

    /* renamed from: G */
    private C9237b f22268G;

    /* renamed from: H */
    private String f22269H;

    /* renamed from: I */
    private String f22270I;

    /* renamed from: J */
    private String f22271J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f22272K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public int f22273L;

    /* renamed from: M */
    private C9257a f22274M;

    /* renamed from: b */
    private int f22275b = 0;

    /* renamed from: c */
    private int f22276c = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FrameLayout f22277d;

    /* renamed from: e */
    private MBridgeBTLayout f22278e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public WindVaneWebView f22279f;

    /* renamed from: g */
    private LayoutInflater f22280g;

    /* renamed from: h */
    private Context f22281h;

    /* renamed from: i */
    private boolean f22282i = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f22283y = true;

    /* renamed from: z */
    private String f22284z;

    public void click(int i, String str) {
    }

    public void handlerH5Exception(int i, String str) {
    }

    public MBridgeBTContainer(Context context) {
        super(context);
        init(context);
    }

    public MBridgeBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public void init(Context context) {
        this.f22281h = context;
        this.f22280g = LayoutInflater.from(context);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:44|(5:46|(7:49|50|51|(1:56)|57|(1:59)|60)|61|(2:62|(2:64|(2:95|66))(1:96))|67)|68|69|70|71|72|73|(1:101)(2:77|102)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x02fb */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "_"
            java.lang.String r2 = "mbridge_bt_container"
            int r2 = r9.findLayout(r2)     // Catch:{ all -> 0x036c }
            if (r2 >= 0) goto L_0x0012
            java.lang.String r0 = "mbridge_bt_container layout null"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            return
        L_0x0012:
            android.view.LayoutInflater r3 = r9.f22280g     // Catch:{ all -> 0x036c }
            android.view.View r2 = r3.inflate(r2, r9)     // Catch:{ all -> 0x036c }
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2     // Catch:{ all -> 0x036c }
            r9.f22277d = r2     // Catch:{ all -> 0x036c }
            if (r2 != 0) goto L_0x0024
            java.lang.String r0 = "ViewIds null"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            return
        L_0x0024:
            r9.f22270I = r0     // Catch:{ all -> 0x036c }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r9.f22263B     // Catch:{ all -> 0x036c }
            r3 = 0
            if (r2 == 0) goto L_0x0046
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r9.f22263B     // Catch:{ all -> 0x036c }
            int r2 = r2.size()     // Catch:{ all -> 0x036c }
            if (r2 <= 0) goto L_0x0046
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r9.f22263B     // Catch:{ all -> 0x036c }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r2.getCMPTEntryUrl()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r2.getRequestId()     // Catch:{ all -> 0x036c }
            r9.f22270I = r2     // Catch:{ all -> 0x036c }
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r2.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r5 = r9.f23339k     // Catch:{ all -> 0x036c }
            r2.append(r5)     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            java.lang.String r5 = r9.f22270I     // Catch:{ all -> 0x036c }
            r2.append(r5)     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            r2.append(r4)     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.videocommon.a$a r2 = com.mbridge.msdk.videocommon.C9536a.m27222a(r2)     // Catch:{ all -> 0x036c }
            r5 = 0
            if (r2 == 0) goto L_0x0090
            java.lang.String r6 = r2.mo63074b()     // Catch:{ all -> 0x036c }
            r9.f22284z = r6     // Catch:{ all -> 0x036c }
            java.lang.String r6 = f22261a     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r7.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r8 = "get BT wraper.getTag = "
            r7.append(r8)     // Catch:{ all -> 0x036c }
            java.lang.String r8 = r9.f22284z     // Catch:{ all -> 0x036c }
            r7.append(r8)     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r6, r7)     // Catch:{ all -> 0x036c }
            r2.mo63072a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r2.mo63070a()     // Catch:{ all -> 0x036c }
            goto L_0x0091
        L_0x0090:
            r2 = r5
        L_0x0091:
            r9.f22279f = r2     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r2.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r6 = r9.f23339k     // Catch:{ all -> 0x036c }
            r2.append(r6)     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            java.lang.String r6 = r9.f22270I     // Catch:{ all -> 0x036c }
            r2.append(r6)     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            r2.append(r4)     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.videocommon.C9536a.m27228b(r2)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f22279f     // Catch:{ all -> 0x036c }
            if (r2 == 0) goto L_0x0322
            com.mbridge.msdk.video.signal.factory.b r2 = new com.mbridge.msdk.video.signal.factory.b     // Catch:{ all -> 0x036c }
            android.app.Activity r4 = r9.f23338j     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r6 = r9.f22279f     // Catch:{ all -> 0x036c }
            r2.<init>(r4, r9, r6)     // Catch:{ all -> 0x036c }
            r9.registerJsFactory(r2)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22279f     // Catch:{ all -> 0x036c }
            r4.setApiManagerJSFactory(r2)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22279f     // Catch:{ all -> 0x036c }
            android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x00d5
            java.lang.String r0 = "preload template webview is null or load error"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            return
        L_0x00d5:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22279f     // Catch:{ all -> 0x036c }
            java.lang.Object r4 = r4.getObject()     // Catch:{ all -> 0x036c }
            boolean r4 = r4 instanceof com.mbridge.msdk.video.signal.p369a.C9425j     // Catch:{ all -> 0x036c }
            r6 = 1
            if (r4 == 0) goto L_0x0188
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22279f     // Catch:{ all -> 0x036c }
            java.lang.Object r4 = r4.getObject()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.a.j r4 = (com.mbridge.msdk.video.signal.p369a.C9425j) r4     // Catch:{ all -> 0x036c }
            r2.mo63067a(r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r2 = r9.f22279f     // Catch:{ all -> 0x036c }
            if (r2 == 0) goto L_0x017d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x036c }
            r2.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.C8413a.f20328j     // Catch:{ all -> 0x036c }
            android.content.Context r7 = r9.getContext()     // Catch:{ all -> 0x036c }
            float r7 = com.mbridge.msdk.foundation.tools.C8613y.m24941d((android.content.Context) r7)     // Catch:{ all -> 0x036c }
            double r7 = (double) r7     // Catch:{ all -> 0x036c }
            r2.put(r4, r7)     // Catch:{ all -> 0x036c }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r4.<init>()     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r7 = "name"
            com.mbridge.msdk.videocommon.b.c r8 = r9.f23343o     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r8 = r8.mo63097a()     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r4.put(r7, r8)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r7 = "amount"
            com.mbridge.msdk.videocommon.b.c r8 = r9.f23343o     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            int r8 = r8.mo63100b()     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r4.put(r7, r8)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r7 = "id"
            java.lang.String r8 = r9.f23344p     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r4.put(r7, r8)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r7 = "userId"
            java.lang.String r8 = r9.f23342n     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r2.put(r7, r8)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r7 = "reward"
            r2.put(r7, r4)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r4 = "playVideoMute"
            int r7 = r9.f23345q     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r2.put(r4, r7)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            java.lang.String r4 = "extra"
            java.lang.String r7 = r9.f22271J     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            r2.put(r4, r7)     // Catch:{ JSONException -> 0x014a, Exception -> 0x013f }
            goto L_0x0154
        L_0x013f:
            r4 = move-exception
            java.lang.String r7 = f22261a     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r7, r4)     // Catch:{ all -> 0x036c }
            goto L_0x0154
        L_0x014a:
            r4 = move-exception
            java.lang.String r7 = f22261a     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r7, r4)     // Catch:{ all -> 0x036c }
        L_0x0154:
            com.mbridge.msdk.video.bt.module.b.c r4 = new com.mbridge.msdk.video.bt.module.b.c     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.a.b r7 = r9.m26339c()     // Catch:{ all -> 0x036c }
            r4.<init>(r7, r0)     // Catch:{ all -> 0x036c }
            r9.f22267F = r4     // Catch:{ all -> 0x036c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.f r2 = r9.getJSNotifyProxy()     // Catch:{ all -> 0x036c }
            r2.mo62843a((java.lang.Object) r0)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.c r0 = r9.getJSCommon()     // Catch:{ all -> 0x036c }
            r0.mo62820b((boolean) r6)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.c r0 = r9.getJSCommon()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$b r2 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$b     // Catch:{ all -> 0x036c }
            r2.<init>()     // Catch:{ all -> 0x036c }
            r0.mo62814a((com.mbridge.msdk.video.signal.C9432c.C9433a) r2)     // Catch:{ all -> 0x036c }
        L_0x017d:
            com.mbridge.msdk.video.signal.c r0 = r9.getJSCommon()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.a.c r0 = (com.mbridge.msdk.video.signal.p369a.C9416c) r0     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.signal.c$a r0 = r0.f23028l     // Catch:{ all -> 0x036c }
            r0.mo62253a()     // Catch:{ all -> 0x036c }
        L_0x0188:
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r0 = r9.f22279f     // Catch:{ all -> 0x036c }
            r0.setBackgroundColor(r3)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f23339k     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r9.f22270I     // Catch:{ all -> 0x036c }
            java.util.LinkedHashMap r0 = r0.mo62135b((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x031c
            java.lang.String r2 = r9.f22284z     // Catch:{ all -> 0x036c }
            boolean r2 = r0.containsKey(r2)     // Catch:{ all -> 0x036c }
            if (r2 == 0) goto L_0x031c
            java.lang.String r2 = r9.f22284z     // Catch:{ all -> 0x036c }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x036c }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x036c }
            boolean r4 = r2 instanceof com.mbridge.msdk.video.p346bt.module.MBridgeBTLayout     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x02ae
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r2 = (com.mbridge.msdk.video.p346bt.module.MBridgeBTLayout) r2     // Catch:{ all -> 0x036c }
            r9.f22278e = r2     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.b.b r2 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r4.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r9.f23339k     // Catch:{ all -> 0x036c }
            r4.append(r7)     // Catch:{ all -> 0x036c }
            r4.append(r1)     // Catch:{ all -> 0x036c }
            r4.append(r6)     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$1 r7 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$1     // Catch:{ all -> 0x036c }
            r7.<init>()     // Catch:{ all -> 0x036c }
            r2.mo15767a((java.lang.String) r4, (com.mbridge.msdk.foundation.p064b.C2339a) r7)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r2 = r9.f22278e     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r4 = r9.f22279f     // Catch:{ all -> 0x036c }
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x036c }
            r8 = -1
            r7.<init>(r8, r8)     // Catch:{ all -> 0x036c }
            r2.addView(r4, r3, r7)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.b.b r2 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r4.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r9.f23339k     // Catch:{ all -> 0x036c }
            r4.append(r7)     // Catch:{ all -> 0x036c }
            r4.append(r1)     // Catch:{ all -> 0x036c }
            r7 = 2
            r4.append(r7)     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x036c }
            r2.mo15774c(r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.b.b r2 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r4.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r7 = r9.f23339k     // Catch:{ all -> 0x036c }
            r4.append(r7)     // Catch:{ all -> 0x036c }
            r4.append(r1)     // Catch:{ all -> 0x036c }
            r4.append(r6)     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.widget.FeedBackButton r2 = r2.mo15771b(r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.b.b r4 = com.mbridge.msdk.foundation.p064b.C2347b.m5579a()     // Catch:{ all -> 0x036c }
            boolean r4 = r4.mo15773b()     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x026c
            if (r2 == 0) goto L_0x026c
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()     // Catch:{ Exception -> 0x022c }
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4     // Catch:{ Exception -> 0x022c }
            r5 = r4
            goto L_0x0230
        L_0x022c:
            r4 = move-exception
            r4.printStackTrace()     // Catch:{ all -> 0x036c }
        L_0x0230:
            if (r5 != 0) goto L_0x023b
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x036c }
            int r4 = com.mbridge.msdk.foundation.p064b.C2347b.f4896a     // Catch:{ all -> 0x036c }
            int r6 = com.mbridge.msdk.foundation.p064b.C2347b.f4897b     // Catch:{ all -> 0x036c }
            r5.<init>(r4, r6)     // Catch:{ all -> 0x036c }
        L_0x023b:
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x036c }
            android.content.Context r4 = r4.mo15792g()     // Catch:{ all -> 0x036c }
            r6 = 1092616192(0x41200000, float:10.0)
            int r4 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r4, (float) r6)     // Catch:{ all -> 0x036c }
            r5.topMargin = r4     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x036c }
            android.content.Context r4 = r4.mo15792g()     // Catch:{ all -> 0x036c }
            int r4 = com.mbridge.msdk.foundation.tools.C8613y.m24929b((android.content.Context) r4, (float) r6)     // Catch:{ all -> 0x036c }
            r5.leftMargin = r4     // Catch:{ all -> 0x036c }
            r2.setLayoutParams(r5)     // Catch:{ all -> 0x036c }
            android.view.ViewParent r4 = r2.getParent()     // Catch:{ all -> 0x036c }
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x0267
            r4.removeView(r2)     // Catch:{ all -> 0x036c }
        L_0x0267:
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r4 = r9.f22278e     // Catch:{ all -> 0x036c }
            r4.addView(r2)     // Catch:{ all -> 0x036c }
        L_0x026c:
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r2 = r9.f22278e     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r9.f22284z     // Catch:{ all -> 0x036c }
            r2.setTag(r4)     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f22284z     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.MBridgeBTLayout r4 = r9.f22278e     // Catch:{ all -> 0x036c }
            r0.put(r2, r4)     // Catch:{ all -> 0x036c }
            java.util.Collection r2 = r0.values()     // Catch:{ all -> 0x036c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x036c }
        L_0x0282:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x036c }
            if (r4 == 0) goto L_0x02a4
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x036c }
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x036c }
            boolean r5 = r4 instanceof com.mbridge.msdk.video.p346bt.module.MBridgeBTRootLayout     // Catch:{ all -> 0x036c }
            if (r5 == 0) goto L_0x0282
            com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout r4 = (com.mbridge.msdk.video.p346bt.module.MBridgeBTRootLayout) r4     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r4.getInstanceId()     // Catch:{ all -> 0x036c }
            r9.f22269H = r2     // Catch:{ all -> 0x036c }
            android.widget.FrameLayout r2 = r9.f22277d     // Catch:{ all -> 0x036c }
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch:{ all -> 0x036c }
            r5.<init>(r8, r8)     // Catch:{ all -> 0x036c }
            r2.addView(r4, r5)     // Catch:{ all -> 0x036c }
        L_0x02a4:
            java.lang.String r2 = r9.f22269H     // Catch:{ all -> 0x036c }
            r0.remove(r2)     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f22269H     // Catch:{ all -> 0x036c }
            r0.put(r2, r9)     // Catch:{ all -> 0x036c }
        L_0x02ae:
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f23339k     // Catch:{ all -> 0x036c }
            int r4 = r9.f23345q     // Catch:{ all -> 0x036c }
            r0.mo62130a((java.lang.String) r2, (int) r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f22284z     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r9.f22270I     // Catch:{ all -> 0x036c }
            r0.mo62132a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = r9.f22269H     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r9.f22270I     // Catch:{ all -> 0x036c }
            r0.mo62132a((java.lang.String) r2, (java.lang.String) r4)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.a.c r0 = com.mbridge.msdk.video.p346bt.p347a.C9196c.m26194a()     // Catch:{ all -> 0x036c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x036c }
            r2.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r4 = r9.f23339k     // Catch:{ all -> 0x036c }
            r2.append(r4)     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            java.lang.String r1 = r9.f22270I     // Catch:{ all -> 0x036c }
            r2.append(r1)     // Catch:{ all -> 0x036c }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x036c }
            android.app.Activity r2 = r9.f23338j     // Catch:{ all -> 0x036c }
            r0.mo62131a((java.lang.String) r1, (android.app.Activity) r2)     // Catch:{ all -> 0x036c }
            java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.p304f.C8442b.m24388a()     // Catch:{ all -> 0x02fb }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$2 r1 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$2     // Catch:{ all -> 0x02fb }
            r1.<init>()     // Catch:{ all -> 0x02fb }
            r0.execute(r1)     // Catch:{ all -> 0x02fb }
            goto L_0x0302
        L_0x02fb:
            java.lang.String r0 = f22261a     // Catch:{ all -> 0x036c }
            java.lang.String r1 = "remove campaign failed"
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r0, r1)     // Catch:{ all -> 0x036c }
        L_0x0302:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f22263B     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x0381
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f22263B     // Catch:{ all -> 0x036c }
            int r0 = r0.size()     // Catch:{ all -> 0x036c }
            if (r0 <= 0) goto L_0x0381
            com.mbridge.msdk.videocommon.d.c r0 = r9.f23341m     // Catch:{ all -> 0x036c }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r9.f22263B     // Catch:{ all -> 0x036c }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1     // Catch:{ all -> 0x036c }
            r9.mo63044a((com.mbridge.msdk.videocommon.p373d.C9551c) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r1)     // Catch:{ all -> 0x036c }
            goto L_0x0381
        L_0x031c:
            java.lang.String r0 = "big template webviewLayout is null"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            return
        L_0x0322:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f22263B     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x0366
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f22263B     // Catch:{ all -> 0x036c }
            int r0 = r0.size()     // Catch:{ all -> 0x036c }
            if (r0 <= 0) goto L_0x0366
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r9.f22263B     // Catch:{ all -> 0x036c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x0366
            boolean r0 = r0.isDynamicView()     // Catch:{ all -> 0x036c }
            if (r0 == 0) goto L_0x0366
            android.content.Context r0 = r9.f22281h     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.dynview.d.a r1 = r9.f22274M     // Catch:{ all -> 0x036c }
            if (r1 != 0) goto L_0x034a
            java.lang.String r0 = "ChoiceOneCallback is null"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            goto L_0x0365
        L_0x034a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x036c }
            r1.<init>()     // Catch:{ all -> 0x036c }
            java.lang.String r2 = "choice_one_callback"
            com.mbridge.msdk.video.dynview.d.a r3 = r9.f22274M     // Catch:{ all -> 0x036c }
            r1.put(r2, r3)     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.dynview.C9249b.m26477a()     // Catch:{ all -> 0x036c }
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r9.f22263B     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.bt.module.MBridgeBTContainer$3 r3 = new com.mbridge.msdk.video.bt.module.MBridgeBTContainer$3     // Catch:{ all -> 0x036c }
            r3.<init>()     // Catch:{ all -> 0x036c }
            com.mbridge.msdk.video.dynview.h.a r4 = new com.mbridge.msdk.video.dynview.h.a     // Catch:{ all -> 0x036c }
            r4.<init>(r0, r2, r3, r1)     // Catch:{ all -> 0x036c }
        L_0x0365:
            return
        L_0x0366:
            java.lang.String r0 = "big template webview is null"
            r9.mo62204a((java.lang.String) r0)     // Catch:{ all -> 0x036c }
            goto L_0x0381
        L_0x036c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onCreate exception "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.mo62204a((java.lang.String) r0)
        L_0x0381:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.MBridgeBTContainer.onCreate():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62204a(String str) {
        C9246h hVar = this.f22266E;
        if (hVar != null) {
            hVar.mo60932a(str);
        }
        super.mo62204a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62257a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        CampaignEx campaignEx2 = campaignEx;
                        C2295a.m5360a(C2350a.m5601e().mo15792g(), campaignEx2, this.f23339k, a, false, true);
                    }
                }
            } catch (Throwable th) {
                C8608u.m24884d(f22261a, th.getMessage());
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).onConfigurationChanged(configuration);
                    } else if (next instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) next).onConfigurationChanged(configuration);
                    } else if (next instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) next).onConfigurationChanged(configuration);
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    /* renamed from: c */
    private C9237b m26339c() {
        if (this.f22268G == null) {
            this.f22268G = new C9237b() {
                /* renamed from: a */
                public final void mo62282a(String str) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.f23340l);
                            jSONObject2.put("unitId", MBridgeBTContainer.this.f23339k);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onAdShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewPlayStart", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: a */
                public final void mo62286a(String str, boolean z, C9541c cVar) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            if (cVar != null) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("name", cVar.mo63097a());
                                jSONObject3.put("amount", cVar.mo63100b());
                                jSONObject2.put("reward", jSONObject3);
                            }
                            jSONObject2.put("isComplete", z);
                            jSONObject2.put("convert", z ? 1 : 2);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onAdClose " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewDismissed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: a */
                public final void mo62287a(boolean z, int i) {
                    boolean unused = MBridgeBTContainer.this.f22272K = z;
                    int unused2 = MBridgeBTContainer.this.f22273L = i;
                }

                /* renamed from: a */
                public final void mo62284a(String str, String str2) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, MBridgeBTContainer.this.f23340l);
                            jSONObject2.put("unitId", MBridgeBTContainer.this.f23339k);
                            jSONObject2.put("error", str2);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onShowFail " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewPlayFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: a */
                public final void mo62285a(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put("unitId", str3);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onVideoAdClicked " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: b */
                public final void mo62288b(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("convert", true);
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put("unitId", str3);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onVideoComplete " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewPlayCompleted", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: c */
                public final void mo62289c(String str, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22279f != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", str);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(MBridgeConstans.PLACEMENT_ID, str2);
                            jSONObject2.put("unitId", str3);
                            jSONObject.put("data", jSONObject2);
                            String a = MBridgeBTContainer.f22261a;
                            C8608u.m24880a(a, " BT Call H5 onEndcardShow " + jSONObject.toString());
                        } catch (JSONException e) {
                            C8608u.m24880a(MBridgeBTContainer.f22261a, e.getMessage());
                        }
                        C8824g.m25670a().mo58310a((WebView) MBridgeBTContainer.this.f22279f, "onSubPlayTemplateViewEndcardShowSuccess", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    }
                }

                /* renamed from: a */
                public final void mo62283a(String str, int i, String str2, String str3) {
                    if (MBridgeBTContainer.this.f22266E != null) {
                        MBridgeBTContainer.this.f22266E.mo60931a(i, str2, str3);
                    }
                }
            };
        }
        return this.f22268G;
    }

    public void onResume() {
        super.onResume();
        if (!C2347b.f4898c) {
            try {
                LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
                if (b != null && b.size() > 0) {
                    for (View next : b.values()) {
                        if (next instanceof MBridgeBTVideoView) {
                            ((MBridgeBTVideoView) next).onResume();
                        }
                    }
                }
            } catch (Throwable th) {
                C8608u.m24880a(f22261a, th.getMessage());
            }
        }
    }

    public void onStop() {
        super.onStop();
        try {
            LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).onStop();
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    public void onBackPressed() {
        try {
            LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).onBackPressed();
                    } else if (next instanceof MBridgeBTWebView) {
                        ((MBridgeBTWebView) next).onBackPressed();
                    } else if (next instanceof MBridgeBTLayout) {
                        ((MBridgeBTLayout) next).onBackPressed();
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    public void onPause() {
        super.onPause();
        try {
            LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).onPause();
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onAdClose() {
        if (this.f23338j != null) {
            this.f23338j.finish();
        }
    }

    public void onDestroy() {
        if (!this.f22262A) {
            this.f22262A = true;
            super.onDestroy();
            C9196c a = C9196c.m26194a();
            a.mo62142d(this.f23339k + "_" + this.f22270I);
            try {
                if (this.f22279f != null) {
                    ViewGroup viewGroup = (ViewGroup) this.f22279f.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    this.f22279f.clearWebView();
                    this.f22279f.release();
                }
                if (this.f22268G != null) {
                    this.f22268G = null;
                }
                if (this.f22265D != null) {
                    this.f22265D = null;
                }
                if (this.f22281h != null) {
                    this.f22281h = null;
                }
                if (this.f22263B != null && this.f22263B.size() > 0) {
                    for (CampaignEx next : this.f22263B) {
                        if (!(next == null || next.getRewardTemplateMode() == null)) {
                            C9536a.m27228b(this.f23339k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57205e());
                        }
                    }
                }
                C9196c.m26194a().mo62146f(this.f22284z);
                C9196c.m26194a().mo62148g(this.f23339k);
                C9196c.m26194a().mo62135b(this.f23339k, this.f22270I).remove(this.f22284z);
                C9196c.m26194a().mo62135b(this.f23339k, this.f22270I).remove(this.f22269H);
                C9196c.m26194a().mo62135b(this.f23339k, this.f22270I).clear();
            } catch (Throwable th) {
                C8608u.m24880a(f22261a, th.getMessage());
            }
        }
    }

    public void reactDeveloper(Object obj, String str) {
        if (this.f22265D == null || TextUtils.isEmpty(str)) {
            mo63046a(obj, "listener is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            String optString = jSONObject.optString("unitId", getUnitId());
            String optString2 = jSONObject.optString(MBridgeConstans.PLACEMENT_ID, getPlacementId());
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            CampaignEx campaignEx = this.f22263B.get(0);
            boolean z = true;
            if (optInt == 1 && optJSONObject != null) {
                boolean optBoolean = optJSONObject.optBoolean("expired");
                if (campaignEx != null) {
                    if (optBoolean) {
                        campaignEx.setSpareOfferFlag(1);
                    } else {
                        campaignEx.setSpareOfferFlag(0);
                    }
                }
            }
            setCBT(campaignEx);
            JSONObject jSONObject2 = null;
            switch (optInt) {
                case 1:
                    this.f22265D.mo61012a();
                    this.f22265D.mo61013a(2, optString2, optString);
                    break;
                case 2:
                    if (optJSONObject != null) {
                        jSONObject2 = optJSONObject.optJSONObject("error");
                    }
                    String str2 = "";
                    if (jSONObject2 != null) {
                        str2 = jSONObject2.optString("msg");
                    }
                    this.f22265D.mo61014a(str2);
                    this.f22265D.mo61013a(4, optString2, optString);
                    break;
                case 3:
                    this.f22265D.mo61015a(optString2, optString);
                    this.f22265D.mo61013a(5, optString2, optString);
                    break;
                case 4:
                    this.f22265D.mo61019b(optString2, optString);
                    this.f22265D.mo61013a(6, optString2, optString);
                    break;
                case 5:
                    this.f22265D.mo61018a(jSONObject.optBoolean("isAutoClick"), optString2, optString);
                    break;
                case 6:
                    if (optJSONObject != null) {
                        if (optJSONObject.optInt("convert") != 1) {
                            z = false;
                        }
                        jSONObject2 = optJSONObject.optJSONObject("reward");
                        String optString3 = optJSONObject.optString("extra");
                        if (!TextUtils.isEmpty(optString3)) {
                            this.f22271J = optString3;
                        }
                    } else {
                        z = false;
                    }
                    CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(optJSONObject.optJSONObject("campaign"));
                    C9541c a = C9541c.m27262a(jSONObject2);
                    if (a == null) {
                        a = this.f23343o;
                    }
                    this.f22265D.mo61013a(7, optString2, optString);
                    if (this.f23346r && (this.f23348t == C8413a.f20332n || this.f23348t == C8413a.f20333o)) {
                        this.f22265D.mo61016a(this.f22272K, this.f22273L);
                    }
                    if (!z) {
                        a.mo63098a(0);
                    }
                    this.f22265D.mo61017a(z, a);
                    C8608u.m24880a(f22261a, "sendToServerRewardInfo");
                    if (!this.f23346r && z) {
                        if (parseCampaignWithBackData == null) {
                            C9410b.m26946a(campaignEx, a, optString, this.f23342n, this.f22271J);
                            break;
                        } else {
                            C9410b.m26946a(parseCampaignWithBackData, a, optString, this.f23342n, this.f22271J);
                            break;
                        }
                    }
            }
            mo63045a(obj);
        } catch (JSONException e) {
            mo63046a(obj, e.getMessage());
            C8608u.m24880a(f22261a, e.getMessage());
        }
    }

    public void appendSubView(MBridgeBTContainer mBridgeBTContainer, MBTempContainer mBTempContainer, JSONObject jSONObject) {
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (jSONObject != null) {
                Context g = C2350a.m5601e().mo15792g();
                int optInt = jSONObject.optInt("left", -999);
                int optInt2 = jSONObject.optInt("top", -999);
                int optInt3 = jSONObject.optInt("right", -999);
                int optInt4 = jSONObject.optInt(TJAdUnitConstants.String.BOTTOM, -999);
                if (!(optInt == -999 || g == null)) {
                    layoutParams.leftMargin = C8613y.m24929b(g, (float) optInt);
                }
                if (!(optInt2 == -999 || g == null)) {
                    layoutParams.topMargin = C8613y.m24929b(g, (float) optInt2);
                }
                if (!(optInt3 == -999 || g == null)) {
                    layoutParams.rightMargin = C8613y.m24929b(g, (float) optInt3);
                }
                if (!(optInt4 == -999 || g == null)) {
                    layoutParams.bottomMargin = C8613y.m24929b(g, (float) optInt4);
                }
                int optInt5 = jSONObject.optInt("width");
                int optInt6 = jSONObject.optInt("height");
                if (optInt5 > 0) {
                    layoutParams.width = optInt5;
                }
                if (optInt6 > 0) {
                    layoutParams.height = optInt6;
                }
            }
            mBridgeBTContainer.addView(mBTempContainer, layoutParams);
            mBTempContainer.setActivity(this.f23338j);
            mBTempContainer.setMute(this.f23345q);
            mBTempContainer.setBidCampaign(this.f22282i);
            mBTempContainer.setIV(this.f23346r);
            mBTempContainer.setBigOffer(this.f22283y);
            mBTempContainer.setIVRewardEnable(this.f23348t, this.f23349u, this.f23350v);
            mBTempContainer.setShowRewardListener(this.f22267F);
            mBTempContainer.setCampaignDownLoadTask(m26341d(mBTempContainer.getCampaign()));
            mBTempContainer.setMBridgeTempCallback(m26339c());
            mBTempContainer.setWebViewFront(getJSCommon().mo62810a());
            mBTempContainer.init(this.f22281h);
            mBTempContainer.onCreate();
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    /* renamed from: d */
    private C9552a m26341d(CampaignEx campaignEx) {
        List<C9552a> list = this.f22264C;
        if (list == null || campaignEx == null) {
            return null;
        }
        for (C9552a next : list) {
            if (next.mo63212g().getId().equals(campaignEx.getId())) {
                C8608u.m24880a(f22261a, "tempContainer task initSuccess");
                return next;
            }
        }
        return null;
    }

    public void broadcast(String str, JSONObject jSONObject) {
        if (this.f22279f != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", this.f22275b);
                jSONObject2.put("id", this.f22284z);
                jSONObject2.put("eventName", str);
                jSONObject2.put("data", jSONObject);
                C8824g.m25670a().mo58310a((WebView) this.f22279f, "broadcast", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            } catch (Exception unused) {
                C9196c.m26194a().mo62126a((WebView) this.f22279f, "broadcast", this.f22284z);
            }
        }
    }

    public int findID(String str) {
        return C8594o.m24812a(getContext(), str, "id");
    }

    public int findLayout(String str) {
        return C8594o.m24812a(getContext(), str, "layout");
    }

    public void setBTContainerCallback(C9236a aVar) {
        this.f22265D = aVar;
    }

    public void setCampaigns(List<CampaignEx> list) {
        this.f22263B = list;
    }

    public void setCampaignDownLoadTasks(List<C9552a> list) {
        this.f22264C = list;
    }

    public void setJSFactory(C9529b bVar) {
        this.f23352x = bVar;
    }

    public void setShowRewardVideoListener(C9246h hVar) {
        this.f22266E = hVar;
    }

    public void setChoiceOneCallback(C9257a aVar) {
        this.f22274M = aVar;
    }

    public void setCBT(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        if (campaignEx.getSpareOfferFlag() != 1) {
            campaignEx.setCbt(0);
        } else if (this.f23341m == null) {
        } else {
            if (this.f23341m.mo63186x() == 1) {
                campaignEx.setCbt(1);
            } else {
                campaignEx.setCbt(0);
            }
        }
    }

    public void setNotchPadding(int i, int i2, int i3, int i4, int i5) {
        try {
            String a = C8582k.m24787a(i, i2, i3, i4, i5);
            C8608u.m24884d(f22261a, a);
            if (this.f22279f != null) {
                if ((this.f22279f.getObject() instanceof C9425j) && !TextUtils.isEmpty(a)) {
                    ((C9425j) this.f22279f.getObject()).mo62819b(a);
                    C8824g.m25670a().mo58310a((WebView) this.f22279f, "oncutoutfetched", Base64.encodeToString(a.getBytes(), 0));
                }
            }
            C9196c.m26194a().mo62124a(i, i2, i3, i4, i5);
            LinkedHashMap<String, View> b = C9196c.m26194a().mo62135b(this.f23339k, this.f22270I);
            if (b != null && b.size() > 0) {
                for (View next : b.values()) {
                    if (next instanceof MBridgeBTVideoView) {
                        ((MBridgeBTVideoView) next).setNotchPadding(i2, i3, i4, i5);
                    } else {
                        int i6 = i2;
                        int i7 = i3;
                        int i8 = i4;
                        int i9 = i5;
                    }
                    if (next instanceof MBTempContainer) {
                        ((MBTempContainer) next).setNotchPadding(i, i2, i3, i4, i5);
                    }
                    if ((next instanceof WindVaneWebView) && !TextUtils.isEmpty(a)) {
                        C8824g.m25670a().mo58312a((Object) next, "oncutoutfetched", Base64.encodeToString(a.getBytes(), 0));
                    }
                }
            }
        } catch (Throwable th) {
            C8608u.m24880a(f22261a, th.getMessage());
        }
    }

    public void setDeveloperExtraData(String str) {
        this.f22271J = str;
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$b */
    private class C9220b extends C9416c.C9417a {
        private C9220b() {
        }

        /* renamed from: a */
        public final void mo62253a() {
            super.mo62253a();
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            super.onStartRedirection(campaign, str);
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            super.onFinishRedirection(campaign, str);
            if (campaign != null && (campaign instanceof CampaignEx)) {
                try {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    String optString = new JSONObject(MBridgeBTContainer.this.getJSVideoModule().getCurrentProgress()).optString(NotificationCompat.CATEGORY_PROGRESS, "");
                    if (campaignEx.getLinkType() == 3 && campaignEx.getEndcard_click_result() == 2 && optString.equals("1.0") && MBridgeBTContainer.this.f23338j != null) {
                        if (MBridgeBTContainer.this.f22283y) {
                            MBridgeBTContainer.this.onAdClose();
                        } else {
                            MBridgeBTContainer.this.f23338j.finish();
                        }
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            super.onRedirectionFailed(campaign, str);
        }

        /* renamed from: a */
        public final void mo62255a(boolean z) {
            super.mo62255a(z);
            MBridgeBTContainer.this.f22267F.mo60936a(z, MBridgeBTContainer.this.f23340l, MBridgeBTContainer.this.f23339k);
        }

        /* renamed from: a */
        public final void mo62254a(int i, String str) {
            super.mo62254a(i, str);
        }

        /* renamed from: b */
        public final void mo62256b() {
            super.mo62256b();
        }
    }

    /* renamed from: com.mbridge.msdk.video.bt.module.MBridgeBTContainer$a */
    private static final class C9219a implements Runnable {

        /* renamed from: a */
        private final List<CampaignEx> f22289a;

        /* renamed from: b */
        private final String f22290b;

        public C9219a(List<CampaignEx> list, String str) {
            this.f22289a = list;
            this.f22290b = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x006b, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x006c, code lost:
            r5 = r0;
            r3 = r7;
            r4 = r8;
            r7 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0079, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x007a, code lost:
            r3 = r7;
            r4 = r8;
            r7 = null;
            r5 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x007f, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0080, code lost:
            r6 = null;
            r3 = r7;
            r4 = r8;
            r5 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0085, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0086, code lost:
            r6 = null;
            r3 = r7;
            r4 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x008a, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x008b, code lost:
            r4 = r0;
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0093, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0094, code lost:
            r3 = null;
            r4 = null;
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x009c, code lost:
            com.mbridge.msdk.video.module.p367b.C9408a.m26940a(r2, "", "", "", (java.lang.String[]) null, (java.lang.String[]) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:17:0x0024] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                java.lang.String r0 = ""
                java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r11.f22289a
                if (r1 == 0) goto L_0x00a7
                int r1 = r1.size()
                if (r1 <= 0) goto L_0x00a7
                java.lang.String r2 = r11.f22290b     // Catch:{ Exception -> 0x00a7 }
                java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r11.f22289a     // Catch:{ Exception -> 0x00a7 }
                r3 = 0
                int r4 = r1.size()     // Catch:{ Exception -> 0x0016 }
                goto L_0x0017
            L_0x0016:
                r4 = r3
            L_0x0017:
                boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00a7 }
                if (r5 != 0) goto L_0x00a7
                if (r1 == 0) goto L_0x00a7
                if (r4 != 0) goto L_0x0023
                goto L_0x00a7
            L_0x0023:
                r5 = 0
                java.lang.Object r6 = r1.get(r3)     // Catch:{ Exception -> 0x009c, all -> 0x0093 }
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x009c, all -> 0x0093 }
                java.lang.String r7 = r6.getRequestId()     // Catch:{ Exception -> 0x009c, all -> 0x0093 }
                java.lang.String r8 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x009c, all -> 0x008e }
                boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x009c, all -> 0x008a }
                if (r9 != 0) goto L_0x003f
                java.lang.String r9 = "cltp"
                java.lang.String r8 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r8, r9)     // Catch:{ Exception -> 0x009c, all -> 0x008a }
                goto L_0x0040
            L_0x003f:
                r8 = r0
            L_0x0040:
                java.lang.String r6 = r6.getMof_template_url()     // Catch:{ Exception -> 0x009c, all -> 0x0085 }
                boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x009c, all -> 0x007f }
                if (r9 != 0) goto L_0x0050
                java.lang.String r9 = "xt"
                java.lang.String r0 = com.mbridge.msdk.foundation.tools.C8557ad.m24740a(r6, r9)     // Catch:{ Exception -> 0x009c, all -> 0x007f }
            L_0x0050:
                java.lang.String[] r6 = new java.lang.String[r4]     // Catch:{ Exception -> 0x009c, all -> 0x007f }
                java.lang.String[] r9 = new java.lang.String[r4]     // Catch:{ Exception -> 0x009c, all -> 0x0079 }
            L_0x0054:
                if (r3 >= r4) goto L_0x0071
                java.lang.Object r5 = r1.get(r3)     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                java.lang.String r10 = r5.getId()     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                r6[r3] = r10     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                java.lang.String r5 = r5.getRequestIdNotice()     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                r9[r3] = r5     // Catch:{ Exception -> 0x009c, all -> 0x006b }
                int r3 = r3 + 1
                goto L_0x0054
            L_0x006b:
                r1 = move-exception
                r5 = r0
                r3 = r7
                r4 = r8
                r7 = r9
                goto L_0x0098
            L_0x0071:
                r3 = r7
                r4 = r8
                r5 = r0
                r7 = r9
                com.mbridge.msdk.video.module.p367b.C9408a.m26940a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a7 }
                goto L_0x00a7
            L_0x0079:
                r1 = move-exception
                r3 = r7
                r4 = r8
                r7 = r5
                r5 = r0
                goto L_0x0098
            L_0x007f:
                r1 = move-exception
                r6 = r5
                r3 = r7
                r4 = r8
                r5 = r0
                goto L_0x0097
            L_0x0085:
                r1 = move-exception
                r6 = r5
                r3 = r7
                r4 = r8
                goto L_0x0097
            L_0x008a:
                r1 = move-exception
                r4 = r0
                r6 = r5
                goto L_0x0091
            L_0x008e:
                r1 = move-exception
                r4 = r5
                r6 = r4
            L_0x0091:
                r3 = r7
                goto L_0x0097
            L_0x0093:
                r1 = move-exception
                r3 = r5
                r4 = r3
                r6 = r4
            L_0x0097:
                r7 = r6
            L_0x0098:
                com.mbridge.msdk.video.module.p367b.C9408a.m26940a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a7 }
                throw r1     // Catch:{ Exception -> 0x00a7 }
            L_0x009c:
                java.lang.String r3 = ""
                java.lang.String r4 = ""
                java.lang.String r5 = ""
                r6 = 0
                r7 = 0
                com.mbridge.msdk.video.module.p367b.C9408a.m26940a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a7 }
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.p346bt.module.MBridgeBTContainer.C9219a.run():void");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26336a(MBridgeBTContainer mBridgeBTContainer, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                HashMap hashMap = new HashMap();
                List<C8402c> b = C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15850b(campaignEx.getCampaignUnitId(), campaignEx.getRequestId());
                if (b != null && b.size() > 0 && b.get(0) != null) {
                    int d = b.get(0).mo57315d();
                    String b2 = b.get(0).mo57310b();
                    if (d == 1) {
                        hashMap.put("encrypt_p=", "encrypt_p=" + b2);
                        hashMap.put("irlfa=", "irlfa=" + 1);
                        for (Map.Entry entry : hashMap.entrySet()) {
                            campaignEx.setOnlyImpressionURL(campaignEx.getOnlyImpressionURL().replaceAll((String) entry.getKey(), (String) entry.getValue()));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
