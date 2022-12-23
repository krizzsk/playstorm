package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8405f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p066db.C2369b;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2378i;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.mbsignalcommon.p338b.C8789a;
import com.mbridge.msdk.mbsignalcommon.p338b.C8790b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8815a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.reward.adapter.C9070c;
import com.mbridge.msdk.reward.p341a.C9047a;
import com.mbridge.msdk.reward.p342b.C9112a;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import com.mbridge.msdk.video.p346bt.module.p349b.C9246h;
import com.mbridge.msdk.video.p346bt.p347a.C9196c;
import com.mbridge.msdk.video.signal.p369a.C9425j;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9575i;
import com.mbridge.msdk.videocommon.p370a.C9538a;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.adapter.d */
/* compiled from: RewardMVVideoAdapter */
public final class C9090d implements C9068a {

    /* renamed from: A */
    private int f21942A;

    /* renamed from: B */
    private int f21943B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public CampaignUnit f21944C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public List<CampaignEx> f21945D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f21946E = false;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public long f21947F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C9109d f21948G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f21949H = false;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f21950I = false;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public Handler f21951J = new Handler(Looper.getMainLooper()) {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: com.mbridge.msdk.foundation.entity.CampaignEx} */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r3v10 */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v12 */
        /* JADX WARNING: type inference failed for: r3v13 */
        /* JADX WARNING: type inference failed for: r11v1 */
        /* JADX WARNING: type inference failed for: r3v15 */
        /* JADX WARNING: type inference failed for: r2v17 */
        /* JADX WARNING: type inference failed for: r11v14 */
        /* JADX WARNING: type inference failed for: r11v15 */
        /* JADX WARNING: type inference failed for: r11v16 */
        /* JADX WARNING: type inference failed for: r11v17 */
        /* JADX WARNING: type inference failed for: r11v18 */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x060c, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x060d, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x0614, code lost:
            if (com.mbridge.msdk.reward.adapter.C9090d.m26054i(r1.f21982a) != null) goto L_0x0616;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x0616, code lost:
            com.mbridge.msdk.reward.adapter.C9090d.m26054i(r1.f21982a).removeMessages(5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x061f, code lost:
            removeMessages(6);
            com.mbridge.msdk.reward.adapter.C9090d.m26033a(r1.f21982a, com.mbridge.msdk.reward.adapter.C9090d.m26045d(r1.f21982a), com.mbridge.msdk.reward.adapter.C9090d.m26039b(r1.f21982a), com.mbridge.msdk.reward.adapter.C9090d.m26049f(r1.f21982a));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x063d, code lost:
            if (r1.f21982a.f21964i == false) goto L_0x063f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x063f, code lost:
            r1.f21982a.f21964i = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0643, code lost:
            if (r11 != 0) goto L_0x0645;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x0645, code lost:
            com.mbridge.msdk.reward.p342b.C9112a.m26118a(r11, com.mbridge.msdk.reward.adapter.C9090d.m26052h(r1.f21982a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C9090d.m26045d(r1.f21982a), com.mbridge.msdk.reward.adapter.C9090d.m26049f(r1.f21982a), r11.getRequestId(), r11.getRequestIdNotice());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0669, code lost:
            com.mbridge.msdk.reward.p342b.C9112a.m26118a(r11, com.mbridge.msdk.reward.adapter.C9090d.m26052h(r1.f21982a), r2.getMessage(), com.mbridge.msdk.reward.adapter.C9090d.m26045d(r1.f21982a), com.mbridge.msdk.reward.adapter.C9090d.m26049f(r1.f21982a), "", "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0688, code lost:
            com.mbridge.msdk.reward.adapter.C9090d.m26024a(r1.f21982a).mo15715a("errorCode: 3508 errorMessage: data load failed, exception is " + r2.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x071a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x071b, code lost:
            r2 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
            com.mbridge.msdk.foundation.tools.C8608u.m24880a("RewardMVVideoAdapter", r2.getLocalizedMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x0725, code lost:
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0727;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x0727, code lost:
            r2.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x07c9, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x07ca, code lost:
            com.mbridge.msdk.foundation.tools.C8608u.m24880a("RewardMVVideoAdapter", r0.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x07d3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x07d4, code lost:
            r0.printStackTrace();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:297:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x02fe A[SYNTHETIC, Splitter:B:106:0x02fe] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x03a5 A[SYNTHETIC, Splitter:B:125:0x03a5] */
        /* JADX WARNING: Removed duplicated region for block: B:250:0x07c9 A[ExcHandler: all (r0v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
        /* JADX WARNING: Removed duplicated region for block: B:256:0x0226 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x029a A[SYNTHETIC, Splitter:B:92:0x029a] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:153:0x04ab=Splitter:B:153:0x04ab, B:225:0x072c=Splitter:B:225:0x072c} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r26) {
            /*
                r25 = this;
                r1 = r25
                r2 = r26
                java.lang.String r3 = "_"
                java.lang.String r4 = "RewardMVVideoAdapter"
                int r5 = r2.what     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r6 = 8
                if (r5 == r6) goto L_0x079a
                r6 = 9
                r7 = 4
                r8 = 3
                r9 = 2
                java.lang.String r10 = ""
                r11 = 0
                r12 = 6
                r13 = 5
                r14 = 0
                if (r5 == r6) goto L_0x072c
                r6 = 16
                if (r5 == r6) goto L_0x072c
                r6 = 17
                r15 = 1
                if (r5 == r6) goto L_0x06e5
                switch(r5) {
                    case 1: goto L_0x06d4;
                    case 2: goto L_0x06c3;
                    case 3: goto L_0x06a8;
                    case 4: goto L_0x046b;
                    case 5: goto L_0x00ab;
                    case 6: goto L_0x0029;
                    default: goto L_0x0027;
                }
            L_0x0027:
                goto L_0x07d8
            L_0x0029:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r3 = r3.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r5 = r5.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21955N     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r7 = r7.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.C9090d.m26032a((com.mbridge.msdk.reward.adapter.C9090d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x0062
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x0062:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = r2.f21963h     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.f21963h = r15     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r2 = r2.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 != 0) goto L_0x00a0
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                long r5 = r5.f21952K     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r5 = r5.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r7 = r7.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.p342b.C9112a.m26117a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x00a0:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.mo15714a()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x00ab:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 <= 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r2.getCMPTEntryUrl()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r5 != 0) goto L_0x00df
                r5 = r15
                goto L_0x00e0
            L_0x00df:
                r5 = r14
            L_0x00e0:
                int r2 = r2.getNscpt()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r7 = r7.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = r6.mo60968a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r7, (boolean) r5, (int) r2, (boolean) r15)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x0155
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r3 = r3.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r5 = r5.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21955N     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r7 = r7.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.C9090d.m26032a((com.mbridge.msdk.reward.adapter.C9090d) r2, (java.lang.String) r3, (java.util.List) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r1.sendEmptyMessage(r12)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r1.removeMessages(r13)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = r2.f21963h     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 != 0) goto L_0x0154
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.f21963h = r15     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r2 = r2.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 != 0) goto L_0x014b
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                long r5 = r5.f21952K     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                long r2 = r2 - r5
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r5 = r5.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r7 = r7.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.p342b.C9112a.m26117a(r5, r6, r7, r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x014b:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.mo15714a()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x0154:
                return
            L_0x0155:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r5.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r7 = r7.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.C9090d.m26033a((com.mbridge.msdk.reward.adapter.C9090d) r2, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x0186
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.removeMessages(r12)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x0186:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r2 = r2.f21964i     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.f21964i = r15     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x01b1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 <= 0) goto L_0x01b1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.Object r2 = r2.get(r14)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r11 = r2
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x01b1:
                if (r11 == 0) goto L_0x01fc
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r17 = r2.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.<init>()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = "resource load timeout is tpl: "
                r2.append(r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r5 != 0) goto L_0x01cf
                r5 = r15
                goto L_0x01d0
            L_0x01cf:
                r5 = r14
            L_0x01d0:
                r2.append(r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r18 = r2.toString()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r19 = r2.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r20 = r2.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r11 != 0) goto L_0x01e8
                r21 = r10
                goto L_0x01ee
            L_0x01e8:
                java.lang.String r2 = r11.getRequestId()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r21 = r2
            L_0x01ee:
                if (r11 != 0) goto L_0x01f1
                goto L_0x01f5
            L_0x01f1:
                java.lang.String r10 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x01f5:
                r22 = r10
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x01fc:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = "errorCode: 3401 errorMessage: resource load timeout"
                r2.mo15715a(r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                int r2 = r2.size()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 <= 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r2 = r2.f21945D     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r5 = r14
            L_0x0226:
                boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r6 == 0) goto L_0x07d8
                java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r6 == 0) goto L_0x0297
                java.lang.String r7 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r7 != 0) goto L_0x0297
                com.mbridge.msdk.videocommon.download.i r7 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = r6.getVideoUrlEncode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r7 = r7.mo63250a((java.lang.String) r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r7 != 0) goto L_0x0297
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                android.content.Context r17 = r7.f21965j     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                r7.<init>()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r8 = "resource load timeout exception video is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                if (r8 != 0) goto L_0x0268
                r8 = r15
                goto L_0x0269
            L_0x0268:
                r8 = r14
            L_0x0269:
                r7.append(r8)     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r19 = r7.f21966k     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                boolean r20 = r7.f21979x     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                long r9 = r9.f21952K     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0295, all -> 0x07c9 }
            L_0x0295:
                r7 = r15
                goto L_0x0298
            L_0x0297:
                r7 = r14
            L_0x0298:
                if (r6 == 0) goto L_0x02fc
                java.lang.String r8 = r6.getendcard_url()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x02fc
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r6.getendcard_url()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = r8.mo63252b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x02fc
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                android.content.Context r17 = r7.f21965j     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                r7.<init>()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r8 = "resource load timeout exception endcard is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                if (r8 != 0) goto L_0x02ce
                r8 = r15
                goto L_0x02cf
            L_0x02ce:
                r8 = r14
            L_0x02cf:
                r7.append(r8)     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r19 = r7.f21966k     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                boolean r20 = r7.f21979x     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                long r9 = r9.f21952K     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x02fb, all -> 0x07c9 }
            L_0x02fb:
                r7 = r15
            L_0x02fc:
                if (r6 == 0) goto L_0x03a3
                java.lang.String r8 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x03a3
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = r8.mo63252b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x0345
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                android.content.Context r17 = r7.f21965j     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                java.lang.String r18 = "resource load timeout exception tpl"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                java.lang.String r19 = r7.f21966k     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                boolean r20 = r7.f21979x     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                long r9 = r9.f21952K     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
                long r23 = r7 - r9
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0343, all -> 0x07c9 }
            L_0x0343:
                r7 = r15
                goto L_0x03a3
            L_0x0345:
                if (r5 != 0) goto L_0x03a3
                if (r7 != 0) goto L_0x03a3
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.<init>()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r9 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r9.f21966k     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.append(r3)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.append(r3)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r8.append(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.videocommon.a$a r8 = com.mbridge.msdk.videocommon.C9536a.m27222a(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x03a3
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                android.content.Context r17 = r5.f21965j     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                java.lang.String r18 = "resource load timeout exception tpl preload"
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                java.lang.String r19 = r5.f21966k     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                boolean r20 = r5.f21979x     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                long r12 = r5.f21952K     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
                long r23 = r8 - r12
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x03a2, all -> 0x07c9 }
            L_0x03a2:
                r5 = r15
            L_0x03a3:
                if (r6 == 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 == 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = r8.mo57205e()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x0226
                com.mbridge.msdk.foundation.entity.CampaignEx$c r8 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = r8.mo57205e()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = "cmpt=1"
                boolean r8 = r8.contains(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x0226
                com.mbridge.msdk.videocommon.download.i r8 = com.mbridge.msdk.videocommon.download.C9575i.m27485a()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.foundation.entity.CampaignEx$c r9 = r6.getRewardTemplateMode()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r9 = r9.mo57205e()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = r8.mo63252b(r9)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x0426
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                android.content.Context r17 = r7.f21965j     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                r7.<init>()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = "resource load timeout exception template is tpl: "
                r7.append(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r8 = r11.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 != 0) goto L_0x03f7
                r8 = r15
                goto L_0x03f8
            L_0x03f7:
                r8 = r14
            L_0x03f8:
                r7.append(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r18 = r7.toString()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r19 = r7.f21966k     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r20 = r7.f21979x     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r8 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r8 = r8.f21952K     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r23 = r6 - r8
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                goto L_0x0226
            L_0x0426:
                java.lang.String r8 = r6.getCMPTEntryUrl()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r8 == 0) goto L_0x0226
                if (r7 != 0) goto L_0x0226
                int r7 = r6.getAdType()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.videocommon.a$a r7 = com.mbridge.msdk.videocommon.C9536a.m27221a(r7, r6)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                if (r7 != 0) goto L_0x0226
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                android.content.Context r17 = r7.f21965j     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r18 = "resource load timeout exception template preload"
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r19 = r7.f21966k     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                boolean r20 = r7.f21979x     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r21 = r6.getRequestId()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                java.lang.String r22 = r6.getRequestIdNotice()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r8 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r8 = r8.f21952K     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                long r23 = r6 - r8
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0226, all -> 0x07c9 }
                goto L_0x0226
            L_0x046b:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r5.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r7 = r7.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.C9090d.m26033a((com.mbridge.msdk.reward.adapter.C9090d) r3, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r3 = r3.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x04ab
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r3 = r3.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                int r3 = r3.size()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 <= 0) goto L_0x04ab
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r3 = r3.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.Object r3 = r3.get(r14)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r11 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x04ab:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r3 != 0) goto L_0x051b
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r2 == 0) goto L_0x04c0
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x04c0:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r2 = r2.f21964i     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r2 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r2.f21964i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r11 == 0) goto L_0x04f1
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r2.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r2.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r2.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x050e
            L_0x04f1:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r2.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r18 = "data load failed"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r2.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r2.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x050e:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r3 = "errorCode: 3506 errorMessage: data load failed"
                r2.mo15715a(r3)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x07d8
            L_0x051b:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r3 == 0) goto L_0x0591
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r2 == 0) goto L_0x0536
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r2 = r2.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r2.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x0536:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r2 = r2.f21964i     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r2 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r2.f21964i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r11 == 0) goto L_0x0567
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r2.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r2.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r2.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x0584
            L_0x0567:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r2.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r18 = "data load failed, errorMsg null"
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r2.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r2.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x0584:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r3 = "errorCode: 3507 errorMessage: data load failed, errorMsg null"
                r2.mo15715a(r3)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x07d8
            L_0x0591:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r3 = r3.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r3 == 0) goto L_0x05a2
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.os.Handler r3 = r3.f21951J     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x05a2:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r3 = r3.f21964i     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r3 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r3.f21964i = r15     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                if (r11 == 0) goto L_0x05d3
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r3.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r3.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r3.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x05f0
            L_0x05d3:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                android.content.Context r17 = r3.f21965j     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r19 = r3.f21966k     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                boolean r20 = r3.f21979x     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                r18 = r2
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
            L_0x05f0:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f21974s     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r5.<init>()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r6 = "errorCode: 3507 errorMessage: data load failed, errorMsg is "
                r5.append(r6)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r5.append(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                r3.mo15715a(r2)     // Catch:{ Exception -> 0x060c, all -> 0x07c9 }
                goto L_0x07d8
            L_0x060c:
                r0 = move-exception
                r2 = r0
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r3 = r3.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x061f
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.os.Handler r3 = r3.f21951J     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r3.removeMessages(r13)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x061f:
                r1.removeMessages(r12)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r5.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r6 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.util.List r6 = r6.f21954M     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r7 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r7 = r7.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.C9090d.m26033a((com.mbridge.msdk.reward.adapter.C9090d) r3, (java.lang.String) r5, (java.util.List) r6, (boolean) r7)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r3 = r3.f21964i     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r3.f21964i = r15     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r11 == 0) goto L_0x0669
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r17 = r3.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r19 = r3.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r20 = r3.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r21 = r11.getRequestId()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r22 = r11.getRequestIdNotice()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x0688
            L_0x0669:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r17 = r3.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r18 = r2.getMessage()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r19 = r3.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r20 = r3.f21979x     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r21 = ""
                java.lang.String r22 = ""
                r16 = r11
                com.mbridge.msdk.reward.p342b.C9112a.m26118a(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x0688:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r5.<init>()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r6 = "errorCode: 3508 errorMessage: data load failed, exception is "
                r5.append(r6)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r5.append(r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r3.mo15715a(r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x06a8:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x06bb
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r2 = r2.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r3 = "campaign is ok"
                r2.mo15716b(r3)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x06bb:
                int r2 = com.mbridge.msdk.foundation.same.C8413a.f20331m     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                long r2 = (long) r2     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r1.sendEmptyMessageDelayed(r13, r2)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x06c3:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x06cd
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x06cd:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.mo60969b((java.lang.String) r11)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x06d4:
                java.lang.Object r3 = r2.obj     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x06de
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
            L_0x06de:
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.mo60969b((java.lang.String) r11)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x06e5:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r3 = r2[r14]     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r18 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r18 = (com.mbridge.msdk.foundation.entity.CampaignEx) r18     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r3 = r2[r15]     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r19 = r3
                java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r3 = r2[r9]     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r3 = r2[r8]     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p373d.C9551c) r21     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r2 = r2[r7]     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r17 = r2
                java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                if (r18 == 0) goto L_0x07d8
                boolean r2 = android.text.TextUtils.isEmpty(r19)     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                if (r2 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                r16 = r2
                com.mbridge.msdk.reward.adapter.C9090d.m26030a(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x071a, all -> 0x07c9 }
                goto L_0x07d8
            L_0x071a:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r3)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x07d8
                r2.printStackTrace()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x072c:
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r3 = r2[r14]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r17 = r3
                com.mbridge.msdk.foundation.entity.CampaignEx r17 = (com.mbridge.msdk.foundation.entity.CampaignEx) r17     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r3 = r2[r9]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r20 = r3
                java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r3 = r2[r8]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r21 = r3
                com.mbridge.msdk.videocommon.d.c r21 = (com.mbridge.msdk.videocommon.p373d.C9551c) r21     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r3 = r2[r7]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                int r3 = r2.length     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r5 = 7
                if (r3 != r5) goto L_0x0758
                r3 = r2[r13]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r10 = r3
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r2 = r2[r12]     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                r11 = r2
                com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r11 = (com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView) r11     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
            L_0x0758:
                r22 = r10
                r15 = r11
                if (r17 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.util.concurrent.CopyOnWriteArrayList r2 = r2.f21976u     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                if (r2 != 0) goto L_0x077b
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.util.List r2 = r2.f21955N     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.util.List r18 = r2.f21955N     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C9090d.m26028a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                goto L_0x07d8
            L_0x077b:
                com.mbridge.msdk.reward.adapter.d r14 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.util.concurrent.CopyOnWriteArrayList r18 = r2.f21976u     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                java.lang.String r19 = ""
                com.mbridge.msdk.reward.adapter.C9090d.m26028a(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0789, all -> 0x07c9 }
                goto L_0x07d8
            L_0x0789:
                r0 = move-exception
                r2 = r0
                java.lang.String r3 = r2.getLocalizedMessage()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r3)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r3 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x07d8
                r2.printStackTrace()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x079a:
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.b r3 = r3.f21974s     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 == 0) goto L_0x07d8
                java.lang.Object r2 = r2.obj     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r2 == 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r3 = r3.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                if (r3 != 0) goto L_0x07d8
                com.mbridge.msdk.reward.adapter.d r3 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                android.content.Context r3 = r3.f21965j     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r5 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                java.lang.String r5 = r5.f21966k     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.p342b.C9112a.m26114a((android.content.Context) r3, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r5)     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                r2.mo60971b()     // Catch:{ Exception -> 0x07d3, all -> 0x07c9 }
                goto L_0x07d8
            L_0x07c9:
                r0 = move-exception
                r2 = r0
                java.lang.String r2 = r2.getMessage()
                com.mbridge.msdk.foundation.tools.C8608u.m24880a(r4, r2)
                goto L_0x07d8
            L_0x07d3:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x07d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9090d.C90911.handleMessage(android.os.Message):void");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: K */
    public long f21952K = 0;

    /* renamed from: L */
    private String f21953L = "";
    /* access modifiers changed from: private */

    /* renamed from: M */
    public List<CampaignEx> f21954M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public List<CampaignEx> f21955N;

    /* renamed from: a */
    public String f21956a = "";

    /* renamed from: b */
    public String f21957b = "";

    /* renamed from: c */
    public Object f21958c = new Object();

    /* renamed from: d */
    boolean f21959d = false;

    /* renamed from: e */
    volatile boolean f21960e = false;

    /* renamed from: f */
    volatile boolean f21961f = false;

    /* renamed from: g */
    volatile boolean f21962g = false;

    /* renamed from: h */
    volatile boolean f21963h = false;

    /* renamed from: i */
    volatile boolean f21964i = false;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Context f21965j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f21966k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f21967l;

    /* renamed from: m */
    private int f21968m;

    /* renamed from: n */
    private int f21969n;

    /* renamed from: o */
    private int f21970o;

    /* renamed from: p */
    private boolean f21971p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f21972q;

    /* renamed from: r */
    private C9246h f21973r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile C9069b f21974s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9551c f21975t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public CopyOnWriteArrayList<CampaignEx> f21976u = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f21977v = 2;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f21978w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f21979x;

    /* renamed from: y */
    private String f21980y = "";

    /* renamed from: z */
    private int f21981z;

    /* renamed from: a */
    public final String mo60958a(boolean z) {
        List<CampaignEx> a;
        CampaignEx campaignEx;
        if (!z) {
            return this.f21956a;
        }
        if (TextUtils.isEmpty(this.f21957b) && (a = C9556c.getInstance().mo63225a(this.f21966k)) != null && a.size() > 0 && (campaignEx = a.get(0)) != null) {
            this.f21957b = campaignEx.getRequestId();
        }
        return this.f21957b;
    }

    /* renamed from: b */
    public final void mo60970b(boolean z) {
        this.f21978w = z;
    }

    /* renamed from: c */
    public final void mo60972c(boolean z) {
        this.f21979x = z;
    }

    /* renamed from: a */
    public final void mo60965a(String str) {
        this.f21980y = str;
    }

    /* renamed from: a */
    public final void mo60959a(int i) {
        this.f21977v = i;
    }

    /* renamed from: a */
    public final String mo60957a() {
        return this.f21966k;
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$b */
    /* compiled from: RewardMVVideoAdapter */
    private class C9107b implements Runnable {

        /* renamed from: b */
        private String f22037b;

        /* renamed from: c */
        private CampaignEx f22038c;

        /* renamed from: d */
        private String f22039d;

        /* renamed from: e */
        private String f22040e;

        /* renamed from: f */
        private C9551c f22041f;

        /* renamed from: g */
        private int f22042g;

        /* renamed from: h */
        private C9090d f22043h;

        public C9107b(String str, CampaignEx campaignEx, String str2, String str3, C9551c cVar, int i, C9090d dVar) {
            this.f22037b = str;
            this.f22038c = campaignEx;
            this.f22039d = str2;
            this.f22040e = str3;
            this.f22041f = cVar;
            this.f22042g = i;
            this.f22043h = dVar;
        }

        public final void run() {
            C9425j jVar;
            try {
                C9536a.C9537a aVar = new C9536a.C9537a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C2350a.m5601e().mo15792g());
                aVar.mo63071a(windVaneWebView);
                String b = C9196c.m26194a().mo62134b();
                aVar.mo63072a(b);
                if (C9090d.this.f21944C.getAds() == null || C9090d.this.f21944C.getAds().size() <= 0) {
                    jVar = new C9425j((Activity) null, this.f22038c);
                } else {
                    jVar = new C9425j((Activity) null, this.f22038c, C9090d.this.f21944C.getAds());
                }
                C9425j jVar2 = jVar;
                jVar2.mo62811a(this.f22042g);
                jVar2.mo62816a(this.f22040e);
                jVar2.mo62850c(b);
                jVar2.mo62815a(this.f22041f);
                jVar2.mo62853d(C9090d.this.f21946E);
                windVaneWebView.setWebViewListener(new C9106a(this.f22039d, this.f22037b, aVar, this.f22038c, this.f22043h, (C9107b) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f22039d);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C8608u.m24880a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$c */
    /* compiled from: RewardMVVideoAdapter */
    private class C9108c implements Runnable {

        /* renamed from: b */
        private WindVaneWebView f22045b;

        /* renamed from: c */
        private String f22046c;

        /* renamed from: d */
        private CampaignEx f22047d;

        /* renamed from: e */
        private List<CampaignEx> f22048e;

        /* renamed from: f */
        private String f22049f;

        /* renamed from: g */
        private String f22050g;

        /* renamed from: h */
        private C9551c f22051h;

        /* renamed from: i */
        private int f22052i;

        /* renamed from: j */
        private C9090d f22053j;

        public C9108c(WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List<CampaignEx> list, String str2, String str3, C9551c cVar, int i, C9090d dVar) {
            this.f22045b = windVaneWebView;
            this.f22046c = str;
            this.f22047d = campaignEx;
            this.f22048e = list;
            this.f22049f = str2;
            this.f22050g = str3;
            this.f22051h = cVar;
            this.f22052i = i;
            this.f22053j = dVar;
        }

        public final void run() {
            C9425j jVar;
            try {
                C9536a.C9537a aVar = new C9536a.C9537a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(C2350a.m5601e().mo15792g());
                aVar.mo63071a(windVaneWebView);
                if (this.f22048e == null || this.f22048e.size() <= 0) {
                    jVar = new C9425j((Activity) null, this.f22047d);
                } else {
                    jVar = new C9425j((Activity) null, this.f22047d, this.f22048e);
                }
                C9425j jVar2 = jVar;
                jVar2.mo62811a(this.f22052i);
                jVar2.mo62816a(this.f22050g);
                jVar2.mo62815a(this.f22051h);
                jVar2.mo62853d(C9090d.this.f21946E);
                windVaneWebView.setWebViewListener(new C9111f(this.f22045b, this.f22049f, this.f22046c, aVar, this.f22047d, this.f22053j, (C9108c) null, (Handler) null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f22049f);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                C8608u.m24880a("RewardMVVideoAdapter", th.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$a */
    /* compiled from: RewardMVVideoAdapter */
    private static class C9106a extends C8789a {

        /* renamed from: a */
        private C9090d f22027a;

        /* renamed from: b */
        private String f22028b;

        /* renamed from: c */
        private String f22029c;

        /* renamed from: d */
        private C9536a.C9537a f22030d;

        /* renamed from: e */
        private CampaignEx f22031e;

        /* renamed from: f */
        private boolean f22032f;

        /* renamed from: g */
        private boolean f22033g;

        /* renamed from: h */
        private C9107b f22034h;

        /* renamed from: i */
        private Handler f22035i;

        /* renamed from: a */
        public final void mo58184a(WebView webView, String str, String str2, int i, int i2) {
        }

        public C9106a(String str, String str2, C9536a.C9537a aVar, CampaignEx campaignEx, C9090d dVar, C9107b bVar, Handler handler) {
            this.f22028b = str;
            this.f22029c = str2;
            this.f22030d = aVar;
            if (dVar != null) {
                this.f22027a = dVar;
            }
            this.f22031e = campaignEx;
            this.f22034h = bVar;
            this.f22035i = handler;
        }

        /* renamed from: a */
        public final void mo57899a(WebView webView, int i) {
            Handler handler;
            if (!this.f22033g) {
                C9107b bVar = this.f22034h;
                if (!(bVar == null || (handler = this.f22035i) == null)) {
                    handler.removeCallbacks(bVar);
                }
                C9575i.m27485a().mo63255d(this.f22028b, true);
                C9536a.C9537a aVar = this.f22030d;
                if (aVar != null) {
                    aVar.mo63073a(true);
                }
                List<CampaignEx> a = C9538a.m27238a().mo63078a(this.f22029c, 1, this.f22027a.f21979x);
                if (a != null && a.size() > 0) {
                    for (CampaignEx rewardTemplateMode : a) {
                        CampaignEx.C8398c rewardTemplateMode2 = rewardTemplateMode.getRewardTemplateMode();
                        if (rewardTemplateMode2 != null && !TextUtils.isEmpty(rewardTemplateMode2.mo57205e()) && !rewardTemplateMode2.mo57205e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && TextUtils.equals(rewardTemplateMode2.mo57205e(), this.f22028b)) {
                            if (!TextUtils.isEmpty(this.f22031e.getCMPTEntryUrl()) || this.f22031e.getMof_tplid() != -1) {
                                this.f22031e.getMof_tplid();
                                this.f22031e.getRequestIdNotice();
                            } else {
                                this.f22031e.getRequestIdNotice();
                            }
                            C9090d dVar = this.f22027a;
                            if (dVar == null || !dVar.f21978w) {
                                if (this.f22031e.isBidCampaign()) {
                                    C9536a.m27224a(94, this.f22031e.getRequestIdNotice(), this.f22030d);
                                }
                            } else if (this.f22031e.isBidCampaign()) {
                                C9536a.m27224a(287, this.f22031e.getRequestIdNotice(), this.f22030d);
                            }
                        }
                    }
                }
                try {
                    if (this.f22027a != null) {
                        synchronized (this.f22027a) {
                            if (!(this.f22027a == null || !this.f22027a.mo60971b() || this.f22027a.f21951J == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                C8608u.m24880a("RVWindVaneWebView", "WHAT_ON_RES_LOAD_SUCCESS TPL");
                                obtain.obj = this.f22031e;
                                this.f22027a.f21951J.sendMessage(obtain);
                                this.f22027a.f21951J.removeMessages(5);
                                this.f22027a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8608u.m24881a("RVWindVaneWebView", th.getMessage(), th);
                }
                this.f22033g = true;
            }
        }

        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            super.mo57902a(webView, str);
            if (!this.f22032f) {
                C8824g.m25670a().mo58309a(webView);
                this.f22032f = true;
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            super.mo57900a(webView, i, str, str2);
            try {
                if (this.f22027a != null) {
                    synchronized (this.f22027a) {
                        C9090d.m26031a(this.f22027a, str, str2);
                        this.f22027a = null;
                    }
                }
            } catch (Throwable th) {
                C8608u.m24881a("RVWindVaneWebView", th.getMessage(), th);
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$f */
    /* compiled from: RewardMVVideoAdapter */
    private static class C9111f extends C8790b {

        /* renamed from: a */
        private C9090d f22058a;

        /* renamed from: b */
        private WindVaneWebView f22059b;

        /* renamed from: c */
        private String f22060c;

        /* renamed from: d */
        private String f22061d;

        /* renamed from: e */
        private C9536a.C9537a f22062e;

        /* renamed from: f */
        private CampaignEx f22063f;

        /* renamed from: g */
        private boolean f22064g;

        /* renamed from: h */
        private boolean f22065h;

        /* renamed from: i */
        private C9108c f22066i;

        /* renamed from: j */
        private Handler f22067j;

        public C9111f(WindVaneWebView windVaneWebView, String str, String str2, C9536a.C9537a aVar, CampaignEx campaignEx, C9090d dVar, C9108c cVar, Handler handler) {
            this.f22059b = windVaneWebView;
            this.f22060c = str;
            this.f22061d = str2;
            this.f22062e = aVar;
            if (dVar != null) {
                this.f22058a = dVar;
            }
            this.f22063f = campaignEx;
            this.f22066i = cVar;
            this.f22067j = handler;
        }

        /* renamed from: a */
        public final void mo57899a(WebView webView, int i) {
            Handler handler;
            if (!this.f22065h) {
                C9108c cVar = this.f22066i;
                if (!(cVar == null || (handler = this.f22067j) == null)) {
                    handler.removeCallbacks(cVar);
                }
                String str = this.f22061d + "_" + this.f22060c;
                C9536a.C9537a aVar = this.f22062e;
                if (aVar != null) {
                    aVar.mo63073a(true);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 1);
                    jSONObject.put("id", str);
                    jSONObject.put("unitid", this.f22061d);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                C9575i.m27485a().mo63255d(this.f22060c, true);
                C9538a.m27238a().mo63078a(this.f22061d, 1, this.f22058a.f21979x);
                C9090d dVar = this.f22058a;
                if (dVar == null || !dVar.f21978w) {
                    if (this.f22063f.isBidCampaign()) {
                        C9536a.m27224a(94, this.f22063f.getRequestIdNotice(), this.f22062e);
                    }
                } else if (this.f22063f.isBidCampaign()) {
                    C9536a.m27224a(287, this.f22063f.getRequestIdNotice(), this.f22062e);
                }
                try {
                    if (this.f22058a != null) {
                        synchronized (this.f22058a) {
                            if (!(this.f22058a == null || !this.f22058a.mo60971b() || this.f22058a.f21951J == null)) {
                                Message obtain = Message.obtain();
                                obtain.what = 6;
                                obtain.obj = this.f22063f;
                                this.f22058a.f21951J.sendMessage(obtain);
                                this.f22058a.f21951J.removeMessages(5);
                                this.f22058a = null;
                            }
                        }
                    }
                } catch (Throwable th) {
                    C8608u.m24881a("WindVaneWebView", th.getMessage(), th);
                }
                this.f22065h = true;
            }
        }

        /* renamed from: a */
        public final void mo57902a(WebView webView, String str) {
            super.mo57902a(webView, str);
            if (!this.f22064g) {
                C8824g.m25670a().mo58309a(webView);
                this.f22064g = true;
            }
        }

        /* renamed from: a */
        public final void mo57900a(WebView webView, int i, String str, String str2) {
            super.mo57900a(webView, i, str, str2);
            try {
                if (this.f22058a != null) {
                    synchronized (this.f22058a) {
                        C9090d.m26031a(this.f22058a, str, str2);
                        this.f22058a = null;
                    }
                }
            } catch (Throwable th) {
                C8608u.m24881a("WindVaneWebView", th.getMessage(), th);
            }
        }
    }

    public C9090d(Context context, String str, String str2) {
        try {
            this.f21965j = context.getApplicationContext();
            this.f21966k = str2;
            this.f21967l = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo60964a(C9551c cVar) {
        try {
            this.f21975t = cVar;
            if (cVar != null && cVar.mo63133C() * 1000 != C8413a.f20331m) {
                C8413a.f20331m = this.f21975t.mo63133C() * 1000;
            }
        } catch (Throwable th) {
            C8608u.m24881a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    public final boolean mo60967a(List<CampaignEx> list, boolean z, int i) {
        return mo60968a(list, z, i, false);
    }

    /* renamed from: a */
    public final boolean mo60968a(List<CampaignEx> list, boolean z, int i, boolean z2) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (C9556c.getInstance().mo63230a(94, this.f21966k, this.f21979x, list.size(), z, i, list, z2)) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            C8608u.m24882b("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        } else if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            C8608u.m24882b("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    C9575i a = C9575i.m27485a();
                    if (a.mo63254c(this.f21966k + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                } else if (campaignEx != null && campaignEx.isDynamicView()) {
                    return true;
                } else {
                    if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().mo57205e())) {
                            C9575i a2 = C9575i.m27485a();
                            if (a2.mo63254c(this.f21966k + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().mo57205e())) {
                                return true;
                            }
                        }
                        return true;
                    }
                    C8608u.m24882b("RewardMVVideoAdapter", "Is not check template download status");
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo60971b() {
        List<CampaignEx> a = C9538a.m27238a().mo63079a(this.f21966k, 1, this.f21979x, this.f21980y);
        if (a == null || a.size() <= 0) {
            C8608u.m24880a("RewardVideoController", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = a.get(0);
        int b = C9538a.m27238a().mo63088b(this.f21966k, 1, this.f21979x, this.f21980y);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || a.size() >= b) {
            return mo60967a(a, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo60973c() {
        List<CampaignEx> c = C9538a.m27238a().mo63093c(this.f21966k, 1, this.f21979x, this.f21980y);
        if (c == null || c.size() <= 0) {
            C8608u.m24880a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = c.get(0);
        int b = C9538a.m27238a().mo63088b(this.f21966k, 1, this.f21979x, this.f21980y);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || c.size() >= b) {
            return mo60967a(c, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60963a(C9246h hVar, String str, String str2, int i, String str3) {
        try {
            this.f21973r = hVar;
            if (this.f21965j != null) {
                if (!C8556ac.m24737a(this.f21966k)) {
                    Intent intent = new Intent(this.f21965j, MBRewardVideoActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.f21966k);
                    intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.f21967l);
                    intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                    intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.f21978w);
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.f21979x);
                    intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                    List<CampaignEx> a = C9556c.getInstance().mo63225a(this.f21966k);
                    boolean z = false;
                    if (a != null && a.size() > 0) {
                        CampaignEx campaignEx = a.get(0);
                        if (campaignEx != null) {
                            this.f21957b = campaignEx.getRequestId();
                        }
                        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                            z = true;
                        }
                        m26047e();
                    } else if (this.f21973r != null) {
                        this.f21973r.mo60932a("load failed");
                        return;
                    }
                    intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z);
                    if (this.f21978w) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.f21981z);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.f21942A);
                        intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.f21943B);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                    }
                    RewardUnitCacheManager.getInstance().add(this.f21967l, this.f21966k, this.f21975t);
                    this.f21965j.startActivity(intent);
                    return;
                }
            }
            if (this.f21973r != null) {
                this.f21973r.mo60932a("context or unitid is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
            C9246h hVar2 = this.f21973r;
            if (hVar2 != null) {
                hVar2.mo60932a("show failed, exception is " + e.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e A[Catch:{ Exception -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26047e() {
        /*
            r5 = this;
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()
            android.content.Context r0 = r0.mo15792g()
            com.mbridge.msdk.foundation.db.b r0 = com.mbridge.msdk.foundation.p066db.C2369b.m5662a((android.content.Context) r0)
            java.lang.String r1 = r5.f21966k
            java.lang.String r2 = r5.f21957b
            java.util.List r0 = r0.mo15850b(r1, r2)
            if (r0 == 0) goto L_0x00a6
            int r1 = r0.size()
            java.lang.String r2 = r5.f21966k
            java.lang.String r2 = com.mbridge.msdk.foundation.same.p299a.C8417d.m24315c(r2)
            if (r1 != 0) goto L_0x0023
            return
        L_0x0023:
            r3 = 1
            java.lang.String r4 = ""
            if (r1 != r3) goto L_0x0044
            r1 = 0
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x006f
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r3 = (com.mbridge.msdk.foundation.entity.C8402c) r3     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r3.mo57313c()     // Catch:{ Exception -> 0x009c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r0 = (com.mbridge.msdk.foundation.entity.C8402c) r0     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r0.mo57310b()     // Catch:{ Exception -> 0x009c }
            goto L_0x0070
        L_0x0044:
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x006f
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x009c }
        L_0x004e:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.entity.c r1 = (com.mbridge.msdk.foundation.entity.C8402c) r1     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x004e
            java.lang.String r3 = r1.mo57307a()     // Catch:{ Exception -> 0x009c }
            boolean r3 = r2.equals(r3)     // Catch:{ Exception -> 0x009c }
            if (r3 == 0) goto L_0x004e
            java.lang.String r4 = r1.mo57313c()     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r1.mo57310b()     // Catch:{ Exception -> 0x009c }
            goto L_0x0070
        L_0x006f:
            r0 = r4
        L_0x0070:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x009c }
            if (r1 != 0) goto L_0x00a6
            java.lang.String r1 = r5.f21957b     // Catch:{ Exception -> 0x009c }
            boolean r1 = r4.equals(r1)     // Catch:{ Exception -> 0x009c }
            if (r1 == 0) goto L_0x00a6
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x009c }
            android.content.Context r1 = r1.mo15792g()     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.db.b r1 = com.mbridge.msdk.foundation.p066db.C2369b.m5662a((android.content.Context) r1)     // Catch:{ Exception -> 0x009c }
            java.lang.String r3 = r5.f21966k     // Catch:{ Exception -> 0x009c }
            r1.mo15847a((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x009c }
            java.lang.String r1 = r5.f21966k     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = r5.f21957b     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.same.p299a.C8417d.m24310a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r0)     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = r5.f21966k     // Catch:{ Exception -> 0x009c }
            com.mbridge.msdk.foundation.same.p299a.C8417d.m24312b(r0)     // Catch:{ Exception -> 0x009c }
            goto L_0x00a6
        L_0x009c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "RewardMVVideoAdapter"
            com.mbridge.msdk.foundation.tools.C8608u.m24880a(r1, r0)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9090d.m26047e():void");
    }

    /* renamed from: a */
    public final void mo60961a(int i, int i2, boolean z) {
        mo60962a(i, i2, z, "", this.f21946E);
    }

    /* renamed from: a */
    public final void mo60962a(int i, int i2, boolean z, String str, boolean z2) {
        this.f21969n = i;
        this.f21970o = i2;
        this.f21971p = z;
        this.f21946E = z2;
        List<CampaignEx> list = this.f21945D;
        if (list != null) {
            list.clear();
        }
        List<CampaignEx> list2 = this.f21954M;
        if (list2 != null) {
            list2.clear();
        }
        boolean z3 = false;
        this.f21960e = false;
        this.f21961f = false;
        synchronized (this.f21958c) {
            if (this.f21962g) {
                this.f21962g = false;
            }
        }
        this.f21964i = false;
        this.f21963h = false;
        try {
            z3 = C8815a.m25647a(this.f21965j);
        } catch (Exception unused) {
        }
        if (!z3) {
            m26044c("WebView is not available");
        } else if (this.f21965j == null) {
            m26044c("Context is null");
        } else if (C8556ac.m24737a(this.f21966k)) {
            m26044c("UnitId is null");
        } else if (this.f21975t == null) {
            m26044c("RewardUnitSetting is null");
        } else {
            m26057j();
            m26059k();
            m26048f();
            m26040b(str, z2);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(36:20|(1:22)(1:23)|24|(1:26)(1:27)|28|(1:30)(1:31)|32|(1:34)|35|(1:37)|38|(1:40)|41|42|(5:44|45|46|(3:48|49|(1:51)(1:52))|53)|54|(1:58)|59|(1:63)|64|(1:66)(1:67)|68|(1:70)|71|72|73|74|75|76|(1:78)(1:79)|80|(3:81|82|(1:84))|85|87|88|92) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x021f */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023a A[Catch:{ Exception -> 0x0289 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023d A[Catch:{ Exception -> 0x0289 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025b A[Catch:{ Exception -> 0x026b }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m26036a(java.lang.String r23, boolean r24) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "1"
            java.lang.String r3 = ""
            android.content.Context r4 = r1.f21965j     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "Context is null"
            r1.m26044c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x0012:
            java.lang.String r4 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            boolean r4 = com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r4)     // Catch:{ Exception -> 0x0289 }
            if (r4 == 0) goto L_0x0020
            java.lang.String r0 = "UnitId is null"
            r1.m26044c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x0020:
            com.mbridge.msdk.videocommon.d.c r4 = r1.f21975t     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x002a
            java.lang.String r0 = "RewardUnitSetting is null"
            r1.m26044c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x002a:
            boolean r4 = android.text.TextUtils.isEmpty(r23)     // Catch:{ Exception -> 0x0289 }
            if (r4 == 0) goto L_0x004a
            com.mbridge.msdk.videocommon.d.c r4 = r1.f21975t     // Catch:{ Exception -> 0x0289 }
            int r4 = r4.mo63136a()     // Catch:{ Exception -> 0x0289 }
            int r4 = r4 * 1000
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0289 }
            long r7 = r1.f21947F     // Catch:{ Exception -> 0x0289 }
            long r5 = r5 - r7
            long r7 = (long) r4     // Catch:{ Exception -> 0x0289 }
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x004a
            java.lang.String r0 = "EXCEPTION_RETURN_EMPTY"
            r1.m26044c((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            return
        L_0x004a:
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = r4.mo15793h()     // Catch:{ Exception -> 0x0289 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r6.mo15793h()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r6 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r6.mo15794i()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r5)     // Catch:{ Exception -> 0x0289 }
            boolean r6 = r1.f21971p     // Catch:{ Exception -> 0x0289 }
            if (r6 == 0) goto L_0x007b
            r6 = 2
            goto L_0x007c
        L_0x007b:
            r6 = 3
        L_0x007c:
            com.mbridge.msdk.videocommon.d.c r7 = r1.f21975t     // Catch:{ Exception -> 0x0289 }
            r8 = 0
            if (r7 == 0) goto L_0x008e
            com.mbridge.msdk.videocommon.d.c r7 = r1.f21975t     // Catch:{ Exception -> 0x0289 }
            int r8 = r7.mo63174r()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.c r7 = r1.f21975t     // Catch:{ Exception -> 0x0289 }
            int r7 = r7.mo63176s()     // Catch:{ Exception -> 0x0289 }
            goto L_0x008f
        L_0x008e:
            r7 = r8
        L_0x008f:
            java.lang.String r9 = r1.f21972q     // Catch:{ Exception -> 0x0289 }
            java.lang.String r10 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            java.lang.String r11 = "reward"
            java.lang.String r10 = com.mbridge.msdk.foundation.same.p299a.C8417d.m24306a(r10, r11)     // Catch:{ Exception -> 0x0289 }
            int r11 = r22.m26050g()     // Catch:{ Exception -> 0x0289 }
            r1.f21968m = r11     // Catch:{ Exception -> 0x0289 }
            java.lang.String r11 = r22.m26055i()     // Catch:{ Exception -> 0x0289 }
            int r12 = r1.f21969n     // Catch:{ Exception -> 0x0289 }
            boolean r13 = r1.f21978w     // Catch:{ Exception -> 0x0289 }
            if (r13 == 0) goto L_0x00ac
            r13 = 287(0x11f, float:4.02E-43)
            goto L_0x00ae
        L_0x00ac:
            r13 = 94
        L_0x00ae:
            com.mbridge.msdk.foundation.same.net.g.d r14 = new com.mbridge.msdk.foundation.same.net.g.d     // Catch:{ Exception -> 0x0289 }
            r14.<init>()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r15 = "app_id"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r15, r4)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "unit_id"
            java.lang.String r15 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r15)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = r1.f21967l     // Catch:{ Exception -> 0x0289 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0289 }
            if (r4 != 0) goto L_0x00ce
            java.lang.String r4 = com.mbridge.msdk.MBridgeConstans.PLACEMENT_ID     // Catch:{ Exception -> 0x0289 }
            java.lang.String r15 = r1.f21967l     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r15)     // Catch:{ Exception -> 0x0289 }
        L_0x00ce:
            java.lang.String r4 = "sign"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "req_type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_num"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r8)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "tnum"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            boolean r6 = r1.f21978w     // Catch:{ Exception -> 0x0289 }
            if (r6 == 0) goto L_0x0107
            r7 = 1
        L_0x0107:
            r5.append(r7)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "only_impression"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r2)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ping_mode"
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r2)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p311g.C8494d.f20561b     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r10)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p311g.C8494d.f20562c     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r9)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_source_id"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r12)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = com.mbridge.msdk.foundation.same.net.p311g.C8494d.f20560a     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r11)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "ad_type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.append(r13)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r5)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "offset"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            int r6 = r1.f21968m     // Catch:{ Exception -> 0x0289 }
            r5.append(r6)     // Catch:{ Exception -> 0x0289 }
            r5.append(r3)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.same.net.p310f.C8482b.m24484a(r14, r4, r3)     // Catch:{ Exception -> 0x0289 }
            boolean r3 = android.text.TextUtils.isEmpty(r23)     // Catch:{ Exception -> 0x0289 }
            if (r3 != 0) goto L_0x0185
            java.lang.String r3 = "token"
            r14.mo57606a(r3, r0)     // Catch:{ Exception -> 0x0289 }
        L_0x0185:
            boolean r3 = r1.f21978w     // Catch:{ Exception -> 0x0289 }
            java.lang.String r4 = "0"
            if (r3 == 0) goto L_0x01a1
            int r3 = r1.f21981z     // Catch:{ Exception -> 0x0289 }
            int r5 = com.mbridge.msdk.foundation.same.C8413a.f20333o     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = "ivrwd"
            if (r3 == r5) goto L_0x019e
            int r3 = r1.f21981z     // Catch:{ Exception -> 0x0289 }
            int r5 = com.mbridge.msdk.foundation.same.C8413a.f20332n     // Catch:{ Exception -> 0x0289 }
            if (r3 != r5) goto L_0x019a
            goto L_0x019e
        L_0x019a:
            r14.mo57606a(r6, r4)     // Catch:{ Exception -> 0x0289 }
            goto L_0x01a1
        L_0x019e:
            r14.mo57606a(r6, r2)     // Catch:{ Exception -> 0x0289 }
        L_0x01a1:
            com.mbridge.msdk.videocommon.d.b r3 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.foundation.controller.a r5 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r5 = r5.mo15793h()     // Catch:{ Exception -> 0x0289 }
            java.lang.String r6 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            boolean r7 = r1.f21978w     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.c r3 = r3.mo63124a((java.lang.String) r5, (java.lang.String) r6, (boolean) r7)     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x01ca
            java.lang.String r5 = r3.mo63158j()     // Catch:{ Exception -> 0x0289 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0289 }
            if (r5 != 0) goto L_0x01ca
            java.lang.String r5 = "u_stid"
            java.lang.String r3 = r3.mo63158j()     // Catch:{ Exception -> 0x0289 }
            r14.mo57606a(r5, r3)     // Catch:{ Exception -> 0x0289 }
        L_0x01ca:
            com.mbridge.msdk.videocommon.d.b r3 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.videocommon.d.a r3 = r3.mo63129b()     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x01e7
            java.lang.String r5 = r3.mo63105a()     // Catch:{ Exception -> 0x0289 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0289 }
            if (r5 != 0) goto L_0x01e7
            java.lang.String r5 = "r_stid"
            java.lang.String r3 = r3.mo63105a()     // Catch:{ Exception -> 0x0289 }
            r14.mo57606a(r5, r3)     // Catch:{ Exception -> 0x0289 }
        L_0x01e7:
            java.lang.String r3 = "rw_plus"
            if (r24 == 0) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r2 = r4
        L_0x01ed:
            r14.mo57606a(r3, r2)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r2 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8613y.m24945e((java.lang.String) r2)     // Catch:{ Exception -> 0x0289 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0289 }
            if (r3 != 0) goto L_0x0201
            java.lang.String r3 = "j"
            r14.mo57606a(r3, r2)     // Catch:{ Exception -> 0x0289 }
        L_0x0201:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0289 }
            r1.f21952K = r2     // Catch:{ Exception -> 0x0289 }
            r4 = 0
            android.content.Context r5 = r1.f21965j     // Catch:{ Exception -> 0x021f }
            java.lang.String r6 = "start load offer from server"
            java.lang.String r7 = r1.f21966k     // Catch:{ Exception -> 0x021f }
            boolean r8 = r1.f21979x     // Catch:{ Exception -> 0x021f }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x021f }
            long r11 = r1.f21952K     // Catch:{ Exception -> 0x021f }
            long r11 = r2 - r11
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x021f }
        L_0x021f:
            com.mbridge.msdk.reward.c.b r2 = new com.mbridge.msdk.reward.c.b     // Catch:{ Exception -> 0x0289 }
            android.content.Context r3 = r1.f21965j     // Catch:{ Exception -> 0x0289 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.reward.adapter.d$2 r5 = new com.mbridge.msdk.reward.adapter.d$2     // Catch:{ Exception -> 0x0289 }
            r5.<init>()     // Catch:{ Exception -> 0x0289 }
            r5.mo60995a((java.lang.String) r0)     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r1.f21966k     // Catch:{ Exception -> 0x0289 }
            r5.f20497d = r3     // Catch:{ Exception -> 0x0289 }
            java.lang.String r3 = r1.f21967l     // Catch:{ Exception -> 0x0289 }
            r5.f20498e = r3     // Catch:{ Exception -> 0x0289 }
            boolean r3 = r1.f21978w     // Catch:{ Exception -> 0x0289 }
            if (r3 == 0) goto L_0x023d
            r3 = 287(0x11f, float:4.02E-43)
            goto L_0x023f
        L_0x023d:
            r3 = 94
        L_0x023f:
            r5.f20499f = r3     // Catch:{ Exception -> 0x0289 }
            int r3 = com.mbridge.msdk.foundation.same.C8413a.f20342x     // Catch:{ Exception -> 0x0289 }
            int r4 = com.mbridge.msdk.foundation.same.C8413a.f20343y     // Catch:{ Exception -> 0x0289 }
            int r6 = com.mbridge.msdk.foundation.same.C8413a.f20341w     // Catch:{ Exception -> 0x0289 }
            int r7 = com.mbridge.msdk.foundation.same.C8413a.f20344z     // Catch:{ Exception -> 0x0289 }
            com.mbridge.msdk.c.b r8 = com.mbridge.msdk.p054c.C2283b.m5275a()     // Catch:{ Exception -> 0x026b }
            com.mbridge.msdk.foundation.controller.a r9 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x026b }
            java.lang.String r9 = r9.mo15793h()     // Catch:{ Exception -> 0x026b }
            com.mbridge.msdk.c.a r8 = r8.mo15571f(r9)     // Catch:{ Exception -> 0x026b }
            if (r8 == 0) goto L_0x026b
            int r3 = r8.mo15535t()     // Catch:{ Exception -> 0x026b }
            int r4 = r8.mo15538u()     // Catch:{ Exception -> 0x026b }
            int r6 = r8.mo15540v()     // Catch:{ Exception -> 0x026b }
            int r7 = r8.mo15542w()     // Catch:{ Exception -> 0x026b }
        L_0x026b:
            r17 = r3
            r18 = r4
            r16 = r6
            r20 = r7
            com.mbridge.msdk.foundation.same.net.b r7 = new com.mbridge.msdk.foundation.same.net.b     // Catch:{ Exception -> 0x0289 }
            int r3 = r1.f21970o     // Catch:{ Exception -> 0x0289 }
            int r3 = r3 * 1000
            r21 = 4
            r15 = r7
            r19 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0289 }
            r3 = 1
            r4 = r14
            r6 = r23
            r2.mo57599a((int) r3, (com.mbridge.msdk.foundation.same.net.p311g.C8494d) r4, (com.mbridge.msdk.foundation.same.net.C8476e) r5, (java.lang.String) r6, (com.mbridge.msdk.foundation.same.net.C8502l) r7)     // Catch:{ Exception -> 0x0289 }
            goto L_0x0295
        L_0x0289:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = "Load exception"
            r1.m26044c((java.lang.String) r0)
            r22.m26053h()
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9090d.m26036a(java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m26044c(String str) {
        if (this.f21951J == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f21951J.sendEmptyMessage(4);
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = str;
        if (str.contains("exception")) {
            this.f21951J.sendMessageAtFrontOfQueue(obtain);
        } else {
            this.f21951J.sendMessage(obtain);
        }
    }

    /* renamed from: f */
    private void m26048f() {
        if (C9538a.m27238a() != null) {
            try {
                C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                C9538a.m27238a().mo63081a(b.mo15436J() * 1000, this.f21966k);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo60941a(C9069b bVar) {
        this.f21974s = bVar;
    }

    /* renamed from: d */
    public final void mo60975d(boolean z) {
        List<CampaignEx> list;
        if (!z && (list = this.f21945D) != null && list.size() > 0) {
            C9538a.m27238a().mo63086a(this.f21966k, this.f21945D);
        }
    }

    /* renamed from: e */
    public final void mo60976e(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f21955N;
            if (list != null && list.size() > 0) {
                for (CampaignEx next : this.f21955N) {
                    if (next != null) {
                        next.setLoadTimeoutState(0);
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57205e())) {
                            C9575i a = C9575i.m27485a();
                            a.mo63255d(this.f21966k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57205e(), false);
                        }
                    }
                }
                C9538a.m27238a().mo63087a(this.f21966k, this.f21955N, "load_timeout", 0);
                return;
            }
            return;
        }
        List<CampaignEx> list2 = this.f21945D;
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx next2 : this.f21945D) {
                if (next2 != null) {
                    next2.setLoadTimeoutState(0);
                    if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo57205e())) {
                        C9575i a2 = C9575i.m27485a();
                        a2.mo63255d(this.f21966k + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo57205e(), false);
                    }
                }
            }
            C9538a.m27238a().mo63087a(this.f21966k, this.f21945D, "load_timeout", 0);
        }
    }

    /* renamed from: f */
    public final boolean mo60977f(boolean z) {
        if (z) {
            List<CampaignEx> list = this.f21955N;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx next : this.f21955N) {
                if (next != null) {
                    next.setLoadTimeoutState(1);
                    if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57205e())) {
                        C9575i a = C9575i.m27485a();
                        a.mo63255d(this.f21966k + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57205e(), true);
                    }
                }
            }
            C9538a.m27238a().mo63087a(this.f21966k, this.f21955N, "load_timeout", 1);
            return true;
        }
        List<CampaignEx> list2 = this.f21945D;
        if (list2 == null || list2.size() <= 0) {
            return false;
        }
        for (CampaignEx next2 : this.f21945D) {
            if (next2 != null) {
                next2.setLoadTimeoutState(1);
                if (next2.getRewardTemplateMode() != null && !TextUtils.isEmpty(next2.getRewardTemplateMode().mo57205e())) {
                    C9575i a2 = C9575i.m27485a();
                    a2.mo63255d(this.f21966k + "_" + next2.getRequestId() + "_" + next2.getRewardTemplateMode().mo57205e(), true);
                }
            }
        }
        C9538a.m27238a().mo63087a(this.f21966k, this.f21945D, "load_timeout", 1);
        return true;
    }

    /* renamed from: a */
    private void m26035a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        if (!(C9538a.m27238a() == null || this.f21944C == null)) {
            C9538a.m27238a().mo63090b(str);
        }
        if (!(C9538a.m27238a() == null || this.f21944C == null)) {
            C9538a.m27238a().mo63091b(str, this.f21944C.getVcn());
        }
        if (list != null && list.size() > 0) {
            if (!(this.f21944C == null || list.get(0) == null)) {
                C9047a.m25868a(this.f21944C.getRequestId(), list.get(0).getBidToken());
            }
            for (CampaignEx next : list) {
                if (next != null) {
                    C8417d.m24311a(next.getCampaignUnitId(), next.getRequestId(), next.getId(), next.getPlct(), next.getPlctb(), next.getTimestamp());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx next2 : list2) {
                if (next2 != null) {
                    C8417d.m24313b(next2.getCampaignUnitId(), next2.getRequestId());
                }
            }
        }
        C8417d.m24312b(str);
        C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15845a();
    }

    /* renamed from: a */
    private void m26026a(CampaignEx campaignEx) {
        try {
            C9538a a = C9538a.m27238a();
            if (a != null) {
                a.mo63082a(campaignEx);
            }
        } catch (Throwable th) {
            C8608u.m24881a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01c6, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d2, code lost:
        if (r1 != null) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018a, code lost:
        if (com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r5.getVideoUrlEncode()) != false) goto L_0x018c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01be A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01d8 A[SYNTHETIC, Splitter:B:114:0x01d8] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0131 A[SYNTHETIC, Splitter:B:64:0x0131] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0158 A[Catch:{ Exception -> 0x01ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0191 A[Catch:{ Exception -> 0x01ce }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m26025a(com.mbridge.msdk.foundation.entity.CampaignUnit r13) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            com.mbridge.msdk.videocommon.d.c r2 = r12.f21975t     // Catch:{ Exception -> 0x01ce }
            if (r2 == 0) goto L_0x0010
            com.mbridge.msdk.videocommon.d.c r2 = r12.f21975t     // Catch:{ Exception -> 0x01ce }
            int r2 = r2.mo63176s()     // Catch:{ Exception -> 0x01ce }
        L_0x0010:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r3 == 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r3 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r3 <= 0) goto L_0x01c6
            java.util.ArrayList r3 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r12.f21954M = r3     // Catch:{ Exception -> 0x01ce }
            r4 = 0
            if (r13 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            if (r5 == 0) goto L_0x005a
            java.util.ArrayList r5 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 <= 0) goto L_0x005a
            java.util.ArrayList r13 = r13.getAds()     // Catch:{ Exception -> 0x01ce }
            r5 = r4
        L_0x0043:
            int r6 = r13.size()     // Catch:{ Exception -> 0x01ce }
            if (r5 >= r6) goto L_0x005a
            java.lang.Object r6 = r13.get(r5)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r6 = (com.mbridge.msdk.foundation.entity.CampaignEx) r6     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r12.f21966k     // Catch:{ Exception -> 0x01ce }
            r6.setCampaignUnitId(r7)     // Catch:{ Exception -> 0x01ce }
            r13.set(r5, r6)     // Catch:{ Exception -> 0x01ce }
            int r5 = r5 + 1
            goto L_0x0043
        L_0x005a:
            r13 = r4
        L_0x005b:
            int r5 = r3.size()     // Catch:{ Exception -> 0x01ce }
            if (r13 >= r5) goto L_0x01c6
            if (r13 >= r2) goto L_0x01c6
            java.lang.Object r5 = r3.get(r13)     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x01ce }
            boolean r6 = r5.isMraid()     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x015c
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01c2
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 287(0x11f, float:4.02E-43)
            java.lang.String r8 = ""
            if (r6 != r7) goto L_0x008a
            java.lang.String r6 = "3"
            goto L_0x00a1
        L_0x008a:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 94
            if (r6 != r7) goto L_0x0095
            java.lang.String r6 = "1"
            goto L_0x00a1
        L_0x0095:
            int r6 = r5.getAdType()     // Catch:{ Exception -> 0x01ce }
            r7 = 42
            if (r6 != r7) goto L_0x00a0
            java.lang.String r6 = "2"
            goto L_0x00a1
        L_0x00a0:
            r6 = r8
        L_0x00a1:
            com.mbridge.msdk.foundation.same.b.c r7 = com.mbridge.msdk.foundation.same.p300b.C8420c.MBRIDGE_700_HTML     // Catch:{ Exception -> 0x011f }
            java.lang.String r7 = com.mbridge.msdk.foundation.same.p300b.C8422e.m24335b(r7)     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = com.mbridge.msdk.foundation.tools.SameMD5.getMD5(r9)     // Catch:{ Exception -> 0x011f }
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x011f }
            if (r10 == 0) goto L_0x00bd
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011f }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x011f }
        L_0x00bd:
            java.lang.String r10 = ".html"
            java.lang.String r9 = r9.concat(r10)     // Catch:{ Exception -> 0x011f }
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x011f }
            r10.<init>(r7, r9)     // Catch:{ Exception -> 0x011f }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x011f }
            r7.<init>(r10)     // Catch:{ Exception -> 0x011f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.<init>()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "<script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.c.b.a r9 = com.mbridge.msdk.p054c.p056b.C2284a.m5293a()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r9.mo15574b()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = "</script>"
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r9 = r5.getMraid()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r1.append(r9)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            byte[] r1 = r1.getBytes()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.write(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.flush()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r5.setMraid(r1)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            java.lang.String r1 = r12.f21966k     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            com.mbridge.msdk.foundation.same.report.C8524c.m24634a(r5, r8, r1, r6)     // Catch:{ Exception -> 0x0118, all -> 0x0115 }
            r7.close()     // Catch:{ Exception -> 0x0111, all -> 0x010d }
            r1 = r7
            goto L_0x0134
        L_0x010d:
            r13 = move-exception
            r1 = r7
            goto L_0x01d6
        L_0x0111:
            r13 = move-exception
            r1 = r7
            goto L_0x01cf
        L_0x0115:
            r13 = move-exception
            r1 = r7
            goto L_0x0156
        L_0x0118:
            r1 = move-exception
            r11 = r7
            r7 = r1
            r1 = r11
            goto L_0x0120
        L_0x011d:
            r13 = move-exception
            goto L_0x0156
        L_0x011f:
            r7 = move-exception
        L_0x0120:
            r7.printStackTrace()     // Catch:{ all -> 0x011d }
            r5.setMraid(r8)     // Catch:{ all -> 0x011d }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x011d }
            java.lang.String r8 = r12.f21966k     // Catch:{ all -> 0x011d }
            com.mbridge.msdk.foundation.same.report.C8524c.m24634a(r5, r7, r8, r6)     // Catch:{ all -> 0x011d }
            if (r1 == 0) goto L_0x0134
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x0134:
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            r6.<init>(r7)     // Catch:{ Exception -> 0x01ce }
            boolean r7 = r6.exists()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r7 = r6.isFile()     // Catch:{ Exception -> 0x01ce }
            if (r7 == 0) goto L_0x014f
            boolean r6 = r6.canRead()     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x015c
        L_0x014f:
            java.lang.String r5 = "mraid resource write fail"
            r12.m26044c((java.lang.String) r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x0156:
            if (r1 == 0) goto L_0x015b
            r1.close()     // Catch:{ Exception -> 0x01ce }
        L_0x015b:
            throw r13     // Catch:{ Exception -> 0x01ce }
        L_0x015c:
            if (r5 == 0) goto L_0x01c2
            int r6 = r5.getOfferType()     // Catch:{ Exception -> 0x01ce }
            r7 = 99
            if (r6 == r7) goto L_0x01c2
            boolean r6 = r12.m26041b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            r7 = 1
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = r5.getendcard_url()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            java.lang.String r6 = r5.getMraid()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
            goto L_0x018c
        L_0x0182:
            java.lang.String r6 = r5.getVideoUrlEncode()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8556ac.m24737a(r6)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x018e
        L_0x018c:
            r6 = r4
            goto L_0x018f
        L_0x018e:
            r6 = r7
        L_0x018f:
            if (r6 == 0) goto L_0x01be
            int r6 = r5.getWtick()     // Catch:{ Exception -> 0x01ce }
            if (r6 == r7) goto L_0x01ba
            android.content.Context r6 = r12.f21965j     // Catch:{ Exception -> 0x01ce }
            java.lang.String r7 = r5.getPackageName()     // Catch:{ Exception -> 0x01ce }
            boolean r6 = com.mbridge.msdk.foundation.tools.C8613y.m24940c(r6, r7)     // Catch:{ Exception -> 0x01ce }
            if (r6 != 0) goto L_0x01a4
            goto L_0x01ba
        L_0x01a4:
            boolean r6 = com.mbridge.msdk.foundation.tools.C8613y.m24935b((com.mbridge.msdk.foundation.entity.CampaignEx) r5)     // Catch:{ Exception -> 0x01ce }
            if (r6 == 0) goto L_0x01ae
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ae:
            java.lang.String r6 = r12.f21966k     // Catch:{ Exception -> 0x01ce }
            int r7 = com.mbridge.msdk.foundation.same.C8413a.f20340v     // Catch:{ Exception -> 0x01ce }
            com.mbridge.msdk.foundation.tools.C8613y.m24923a((java.lang.String) r6, (com.mbridge.msdk.foundation.entity.CampaignEx) r5, (int) r7)     // Catch:{ Exception -> 0x01ce }
            java.lang.String r5 = "APP ALREADY INSTALLED"
            r12.f21953L = r5     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01ba:
            r0.add(r5)     // Catch:{ Exception -> 0x01ce }
            goto L_0x01c2
        L_0x01be:
            java.lang.String r5 = "No video campaign"
            r12.f21953L = r5     // Catch:{ Exception -> 0x01ce }
        L_0x01c2:
            int r13 = r13 + 1
            goto L_0x005b
        L_0x01c6:
            if (r1 == 0) goto L_0x01d5
        L_0x01c8:
            r1.close()     // Catch:{ IOException -> 0x01d5 }
            goto L_0x01d5
        L_0x01cc:
            r13 = move-exception
            goto L_0x01d6
        L_0x01ce:
            r13 = move-exception
        L_0x01cf:
            r13.printStackTrace()     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x01d5
            goto L_0x01c8
        L_0x01d5:
            return r0
        L_0x01d6:
            if (r1 == 0) goto L_0x01db
            r1.close()     // Catch:{ IOException -> 0x01db }
        L_0x01db:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9090d.m26025a(com.mbridge.msdk.foundation.entity.CampaignUnit):java.util.List");
    }

    /* renamed from: g */
    private int m26050g() {
        try {
            int a = C8556ac.m24738b(this.f21966k) ? C9047a.m25860a(this.f21966k) : 0;
            if (this.f21975t == null || a > this.f21975t.mo63178t()) {
                return 0;
            }
            return a;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m26053h() {
        try {
            if (C8556ac.m24738b(this.f21966k)) {
                C9047a.m25867a(this.f21966k, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    private String m26055i() {
        try {
            if (C8556ac.m24738b(C9047a.f21692a)) {
                return C9047a.f21692a;
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: j */
    private void m26057j() {
        try {
            if (C8417d.f20351a != null && C8417d.f20351a.size() > 0) {
                C8417d.f20351a.clear();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    private void m26059k() {
        try {
            C2378i.m5736a((C2374f) C2376g.m5723a(this.f21965j)).mo15905a(this.f21966k);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private boolean m26041b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            if (campaignEx.getPlayable_ads_without_video() == 2) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo60966a(List<CampaignEx> list) {
        this.f21955N = list;
    }

    /* renamed from: d */
    public final List<CampaignEx> mo60974d() {
        return this.f21945D;
    }

    /* renamed from: a */
    public final void mo60960a(int i, int i2, int i3) {
        this.f21981z = i;
        this.f21942A = i2;
        this.f21943B = i3;
    }

    /* renamed from: b */
    public final void mo60969b(String str) {
        if (this.f21975t != null && TextUtils.isEmpty(str)) {
            int b = this.f21975t.mo63141b() * 1000;
            List<CampaignEx> list = this.f21955N;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.f21955N.get(0).getTimestamp() < ((long) b)) {
                    m26044c("hit ltorwc");
                    return;
                }
            }
        }
        m26036a(str, this.f21946E);
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$e */
    /* compiled from: RewardMVVideoAdapter */
    public class C9110e implements Runnable {

        /* renamed from: b */
        private String f22057b;

        public C9110e(String str) {
            this.f22057b = str;
        }

        public final void run() {
            try {
                String unused = C9090d.this.f21972q = C8613y.m24931b(C9090d.this.f21965j, C9090d.this.f21966k);
                if (!C9090d.this.f21950I) {
                    if (!(C9090d.this.f21948G == null || C9090d.this.f21951J == null)) {
                        C9090d.this.f21951J.removeCallbacks(C9090d.this.f21948G);
                    }
                    boolean unused2 = C9090d.this.f21949H = true;
                    if (C9090d.this.f21951J != null) {
                        Message obtainMessage = C9090d.this.f21951J.obtainMessage();
                        obtainMessage.obj = this.f22057b;
                        obtainMessage.what = 1;
                        C9090d.this.f21951J.sendMessage(obtainMessage);
                    }
                    if (!TextUtils.isEmpty(C9090d.this.f21972q)) {
                        C8608u.m24884d("RewardMVVideoAdapter", "excludeId : " + C9090d.this.f21972q);
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.d$d */
    /* compiled from: RewardMVVideoAdapter */
    public class C9109d implements Runnable {

        /* renamed from: b */
        private String f22055b;

        public C9109d(String str) {
            this.f22055b = str;
        }

        public final void run() {
            try {
                if (!C9090d.this.f21949H) {
                    boolean unused = C9090d.this.f21950I = true;
                    if (C9090d.this.f21951J != null) {
                        Message obtainMessage = C9090d.this.f21951J.obtainMessage();
                        obtainMessage.obj = this.f22055b;
                        obtainMessage.what = 2;
                        C9090d.this.f21951J.sendMessage(obtainMessage);
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m26040b(String str, boolean z) {
        C8442b.m24388a().execute(new C9110e(str));
        if (this.f21951J != null) {
            C9109d dVar = new C9109d(str);
            this.f21948G = dVar;
            this.f21951J.postDelayed(dVar, 90000);
            return;
        }
        m26036a(str, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m26032a(C9090d dVar, String str, List list, List list2, boolean z) {
        C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15873a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2, z);
        if (list2 != null && list2.size() > 0) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CampaignEx campaignEx = (CampaignEx) it.next();
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().mo57205e())) {
                    C9536a.m27228b(str + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().mo57205e());
                    C9536a.m27226b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            dVar.m26035a(str, (List<CampaignEx>) list, (List<CampaignEx>) list2);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26033a(C9090d dVar, String str, List list, boolean z) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15874a(str, (List<CampaignEx>) list, z);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26028a(C9090d dVar, WindVaneWebView windVaneWebView, String str, CampaignEx campaignEx, List list, String str2, String str3, C9551c cVar, String str4) {
        C9425j jVar;
        C9090d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        List list2 = list;
        try {
            C9536a.C9537a aVar = new C9536a.C9537a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(C2350a.m5601e().mo15792g());
            aVar.mo63071a(windVaneWebView2);
            if (list2 == null || list.size() <= 0) {
                jVar = new C9425j((Activity) null, campaignEx2);
            } else {
                jVar = new C9425j((Activity) null, campaignEx2, list2);
            }
            C9425j jVar2 = jVar;
            jVar2.mo62811a(dVar2.f21977v);
            jVar2.mo62816a(str3);
            jVar2.mo62815a(cVar);
            jVar2.mo62853d(dVar2.f21946E);
            C9108c cVar2 = r1;
            C9108c cVar3 = new C9108c(windVaneWebView, str3, campaignEx, list, str2, str3, cVar, dVar2.f21977v, dVar);
            windVaneWebView2.setWebViewListener(new C9111f(windVaneWebView, str, str3, aVar, campaignEx, dVar, cVar2, dVar2.f21951J));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            dVar2.f21951J.postDelayed(cVar2, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C8608u.m24880a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26030a(C9090d dVar, String str, CampaignEx campaignEx, String str2, String str3, C9551c cVar) {
        C9425j jVar;
        C9090d dVar2 = dVar;
        CampaignEx campaignEx2 = campaignEx;
        try {
            C9536a.C9537a aVar = new C9536a.C9537a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(C2350a.m5601e().mo15792g());
            aVar.mo63071a(windVaneWebView);
            String b = C9196c.m26194a().mo62134b();
            aVar.mo63072a(b);
            if (dVar2.f21944C == null || dVar2.f21944C.getAds() == null || dVar2.f21944C.getAds().size() <= 0) {
                jVar = new C9425j((Activity) null, campaignEx2);
            } else {
                jVar = new C9425j((Activity) null, campaignEx2, dVar2.f21944C.getAds());
            }
            C9425j jVar2 = jVar;
            jVar2.mo62811a(dVar2.f21977v);
            jVar2.mo62816a(str3);
            jVar2.mo62850c(b);
            jVar2.mo62815a(cVar);
            jVar2.mo62853d(dVar2.f21946E);
            C9107b bVar = new C9107b(str3, campaignEx, str2, str3, cVar, dVar2.f21977v, dVar);
            windVaneWebView.setWebViewListener(new C9106a(str, str3, aVar, campaignEx, dVar, bVar, dVar2.f21951J));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str2);
            dVar2.f21951J.postDelayed(bVar, 5000);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        } catch (Throwable th) {
            C8608u.m24880a("RewardMVVideoAdapter", th.getMessage());
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26031a(C9090d dVar, String str, String str2) {
        try {
            if (dVar.f21976u != null && !TextUtils.isEmpty(str2)) {
                Iterator<CampaignEx> it = dVar.f21976u.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CampaignEx next = it.next();
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        if (!TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                            dVar.f21976u.remove(next);
                            dVar.m26026a(next);
                            break;
                        }
                        String str3 = next.getendcard_url();
                        if (!TextUtils.isEmpty(str3) && str2.equals(str3)) {
                            dVar.f21976u.remove(next);
                            dVar.m26026a(next);
                            break;
                        }
                        CampaignEx.C8398c rewardTemplateMode = next.getRewardTemplateMode();
                        if (rewardTemplateMode != null) {
                            List<CampaignEx.C8398c.C8399a> f = rewardTemplateMode.mo57206f();
                            if (f != null) {
                                Iterator<CampaignEx.C8398c.C8399a> it2 = f.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        CampaignEx.C8398c.C8399a next2 = it2.next();
                                        if (next2 != null && next2.f20183b != null && next2.f20183b.contains(str2)) {
                                            dVar.f21976u.remove(next);
                                            dVar.m26026a(next);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            String e = rewardTemplateMode.mo57205e();
                            if (!TextUtils.isEmpty(e) && str2.equals(e)) {
                                dVar.f21976u.remove(next);
                                dVar.m26026a(next);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (dVar.f21974s != null && dVar.f21976u != null && dVar.f21976u.size() == 0) {
                    if (dVar.f21951J != null) {
                        dVar.f21951J.removeMessages(5);
                    }
                    dVar.m26044c(str);
                    dVar.f21974s.mo15715a(str);
                }
            } else if (dVar.f21974s != null) {
                if (dVar.f21951J != null) {
                    dVar.f21951J.removeMessages(5);
                }
                dVar.m26044c(str);
                dVar.f21974s.mo15715a(str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26027a(C9090d dVar, CampaignUnit campaignUnit) {
        C9090d dVar2 = dVar;
        final CampaignUnit campaignUnit2 = campaignUnit;
        dVar2.f21944C = campaignUnit2;
        dVar2.f21945D = dVar.m26025a(campaignUnit);
        try {
            CampaignEx campaignEx = campaignUnit.getAds().get(0);
            Context context = dVar2.f21965j;
            StringBuilder sb = new StringBuilder();
            sb.append("start download resource tpl ");
            sb.append(!TextUtils.isEmpty(campaignUnit.getAds().get(0).getCMPTEntryUrl()));
            C9112a.m26119a(campaignEx, context, sb.toString(), dVar2.f21966k, dVar2.f21979x, "", "", System.currentTimeMillis() - dVar2.f21952K);
        } catch (Exception unused) {
        }
        List<CampaignEx> list = dVar2.f21945D;
        C8442b.m24388a().execute(new Runnable() {
            public final void run() {
                C2379j.m5740a((C2374f) C2376g.m5723a(C9090d.this.f21965j)).mo15909b();
                CampaignUnit campaignUnit = campaignUnit2;
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit2.getAds().size() > 0) {
                    C9090d.m26034a(C9090d.this, (List) campaignUnit2.getAds());
                }
            }
        });
        List<CampaignEx> list2 = dVar2.f21945D;
        if (list2 == null || list2.size() <= 0) {
            C8608u.m24882b("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
            if (TextUtils.isEmpty(dVar2.f21953L)) {
                dVar2.f21953L = "APP ALREADY INSTALLED";
            }
            dVar2.m26044c(dVar2.f21953L);
            return;
        }
        C8608u.m24882b("RewardMVVideoAdapter", "onload load success size:" + dVar2.f21945D.size());
        Handler handler = dVar2.f21951J;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
        if (campaignUnit2 != null) {
            String sessionId = campaignUnit.getSessionId();
            if (C8556ac.m24738b(sessionId)) {
                C9047a.f21692a = sessionId;
            }
        }
        List<CampaignEx> list3 = dVar2.f21945D;
        if (list3 != null) {
            try {
                if (list3.size() > 0) {
                    dVar2.f21968m += list3.size();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (dVar2.f21975t == null || dVar2.f21968m > dVar2.f21975t.mo63178t()) {
            dVar2.f21968m = 0;
        }
        if (C8556ac.m24738b(dVar2.f21966k)) {
            C9047a.m25867a(dVar2.f21966k, dVar2.f21968m);
        }
        List<CampaignEx> list4 = dVar2.f21945D;
        if (list4 != null && list4.size() > 0) {
            String str = dVar2.f21967l;
            String str2 = dVar2.f21966k;
            List<CampaignEx> list5 = dVar2.f21945D;
            if (C9538a.m27238a() != null) {
                C9538a.m27238a().mo63085a(str, str2, list5);
            }
        }
        final CampaignEx campaignEx2 = dVar2.f21945D.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
        final int nscpt = campaignEx2.getNscpt();
        dVar2.f21960e = false;
        dVar2.f21961f = false;
        synchronized (dVar2.f21958c) {
            if (dVar2.f21962g) {
                dVar2.f21962g = false;
            }
        }
        dVar2.f21964i = false;
        dVar2.f21963h = false;
        if (dVar2.f21979x && campaignEx2 != null) {
            C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15848a(campaignEx2.getBidToken(), campaignEx2.getCampaignUnitId(), campaignEx2.getEncryptPrice());
        }
        C9070c.C9089m.f21941a.mo60943a(dVar2.f21965j, z, nscpt, dVar2.f21979x, dVar2.f21978w ? 287 : 94, dVar2.f21967l, dVar2.f21966k, campaignEx2.getRequestId(), dVar2.f21945D, new C9070c.C9076c() {
            /* renamed from: a */
            public final void mo60917a(String str, String str2, String str3, List<CampaignEx> list) {
                final String str4 = str2;
                final List<CampaignEx> list2 = list;
                C9090d.this.f21960e = true;
                if (list2 != null && list.size() > 0) {
                    try {
                        Context h = C9090d.this.f21965j;
                        C9112a.m26119a(list2.get(0), h, "resource download success is tpl :" + z, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                    } catch (Exception unused) {
                    }
                }
                if (!z) {
                    for (final CampaignEx next : list) {
                        if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo57205e()) || next.getRewardTemplateMode().mo57205e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C9090d.this.f21951J == null) {
                            C9090d dVar = C9090d.this;
                            if (dVar.mo60967a((List<CampaignEx>) dVar.f21945D, z, nscpt)) {
                                C9090d dVar2 = C9090d.this;
                                C9090d.m26032a(dVar2, dVar2.f21966k, (List) list2, C9090d.this.f21955N, C9090d.this.f21979x);
                                if (C9090d.this.f21951J != null) {
                                    C9090d.this.f21951J.removeMessages(5);
                                }
                                if (C9090d.this.f21974s != null && !C9090d.this.f21963h) {
                                    C9090d.this.f21963h = true;
                                    if (!TextUtils.isEmpty(C9090d.this.f21966k)) {
                                        C9112a.m26117a(C9090d.this.f21965j, C9090d.this.f21945D, C9090d.this.f21966k, System.currentTimeMillis() - C9090d.this.f21952K);
                                    }
                                    C9090d.this.f21974s.mo15714a();
                                }
                            } else {
                                C9090d dVar3 = C9090d.this;
                                C9090d.m26033a(dVar3, str4, dVar3.f21954M, C9090d.this.f21979x);
                                if (C9090d.this.f21951J != null) {
                                    C9090d.this.f21951J.removeMessages(5);
                                }
                                if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                    C9090d.this.f21964i = true;
                                    if (!TextUtils.isEmpty(C9090d.this.f21966k) && C9090d.this.f21945D != null && C9090d.this.f21945D.size() > 0) {
                                        C9112a.m26118a((CampaignEx) C9090d.this.f21945D.get(0), C9090d.this.f21965j, "have no temp but isReady false", C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice());
                                    }
                                    C9090d.this.f21974s.mo15715a("errorCode: 3503 errorMessage: have no temp but isReady false");
                                }
                            }
                        } else {
                            final String str5 = str;
                            final String str6 = str2;
                            final String str7 = str3;
                            final List<CampaignEx> list3 = list;
                            C9090d.this.f21951J.post(new Runnable() {
                                public final void run() {
                                    C9070c a = C9070c.C9089m.f21941a;
                                    boolean l = C9090d.this.f21946E;
                                    Handler i = C9090d.this.f21951J;
                                    boolean m = C9090d.this.f21978w;
                                    boolean f = C9090d.this.f21979x;
                                    String e = next.getRewardTemplateMode().mo57205e();
                                    int o = C9090d.this.f21977v;
                                    CampaignEx campaignEx = campaignEx2;
                                    List c = C9090d.this.f21945D;
                                    String b = C9563g.m27460a().mo63242b(next.getRewardTemplateMode().mo57205e());
                                    String str = str5;
                                    String str2 = str6;
                                    String str3 = str7;
                                    String requestIdNotice = next.getRequestIdNotice();
                                    C9551c p = C9090d.this.f21975t;
                                    C90951 r17 = r6;
                                    C90951 r6 = new C9070c.C9084j() {
                                        /* renamed from: a */
                                        public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                            try {
                                                Context h = C9090d.this.f21965j;
                                                C9112a.m26119a((CampaignEx) list3.get(0), h, "preload template success is tpl :" + z, C9090d.this.f21966k, C9090d.this.f21979x, str7, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                            } catch (Exception unused) {
                                            }
                                            if (C9090d.this.mo60967a((List<CampaignEx>) C9090d.this.f21945D, z, nscpt)) {
                                                C9090d.m26032a(C9090d.this, C9090d.this.f21966k, list3, C9090d.this.f21955N, C9090d.this.f21979x);
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21963h) {
                                                    C9090d.this.f21963h = true;
                                                    if (!TextUtils.isEmpty(C9090d.this.f21966k)) {
                                                        C9112a.m26117a(C9090d.this.f21965j, C9090d.this.f21945D, C9090d.this.f21966k, System.currentTimeMillis() - C9090d.this.f21952K);
                                                    }
                                                    C9090d.this.f21974s.mo15714a();
                                                    return;
                                                }
                                                return;
                                            }
                                            C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                            if (C9090d.this.f21951J != null) {
                                                C9090d.this.f21951J.removeMessages(5);
                                            }
                                            if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                C9090d.this.f21964i = true;
                                                if (!TextUtils.isEmpty(C9090d.this.f21966k) && C9090d.this.f21945D != null && C9090d.this.f21945D.size() > 0) {
                                                    C9112a.m26118a((CampaignEx) C9090d.this.f21945D.get(0), C9090d.this.f21965j, "temp preload success but isReady false", C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                }
                                                C9090d.this.f21974s.mo15715a("errorCode: 3502 errorMessage: temp preload success but isReady false");
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                            String str7 = str6;
                                            try {
                                                Context h = C9090d.this.f21965j;
                                                C9112a.m26119a((CampaignEx) list3.get(0), h, "preload template failed is tpl :" + z + " " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str7, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                            } catch (Exception unused) {
                                            }
                                            if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                    C9090d.this.f21964i = true;
                                                    if (!TextUtils.isEmpty(C9090d.this.f21966k) && C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                                        Context h2 = C9090d.this.f21965j;
                                                        C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), h2, "temp preload failed: " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9069b a = C9090d.this.f21974s;
                                                    a.mo15715a("errorCode: 3301 errorMessage: temp preload failed: " + str7);
                                                    return;
                                                }
                                                return;
                                            }
                                            C8608u.m24882b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                        }
                                    };
                                    a.mo60944a(l, i, m, f, (WindVaneWebView) null, e, o, campaignEx, c, b, str, str2, str3, requestIdNotice, p, r17);
                                }
                            });
                        }
                    }
                } else if (C9090d.this.f21961f && !C9090d.this.f21962g && C9090d.this.f21951J != null) {
                    synchronized (C9090d.this.f21958c) {
                        if (!C9090d.this.f21962g) {
                            C9090d.this.f21962g = true;
                            final String str8 = str3;
                            C9090d.this.f21951J.post(new Runnable() {
                                public final void run() {
                                    C9070c a = C9070c.C9089m.f21941a;
                                    boolean l = C9090d.this.f21946E;
                                    Handler i = C9090d.this.f21951J;
                                    boolean m = C9090d.this.f21978w;
                                    boolean f = C9090d.this.f21979x;
                                    String str = str8;
                                    String requestIdNotice = campaignEx2.getRequestIdNotice();
                                    String q = C9090d.this.f21967l;
                                    String str2 = str4;
                                    String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                                    int o = C9090d.this.f21977v;
                                    CampaignEx campaignEx = campaignEx2;
                                    List c = C9090d.this.f21945D;
                                    String b = C9563g.m27460a().mo63242b(campaignEx2.getCMPTEntryUrl());
                                    String str3 = str4;
                                    C9070c cVar = a;
                                    C9551c p = C9090d.this.f21975t;
                                    C90971 r17 = r1;
                                    C90971 r1 = new C9070c.C9084j() {
                                        /* renamed from: a */
                                        public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                            try {
                                                Context h = C9090d.this.f21965j;
                                                C9112a.m26119a((CampaignEx) list2.get(0), h, "preload template success is tpl :" + z, C9090d.this.f21966k, C9090d.this.f21979x, str8, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                            } catch (Exception unused) {
                                            }
                                            if (C9090d.this.mo60967a((List<CampaignEx>) C9090d.this.f21945D, z, nscpt)) {
                                                C9090d.m26032a(C9090d.this, C9090d.this.f21966k, list2, C9090d.this.f21955N, C9090d.this.f21979x);
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21963h) {
                                                    C9090d.this.f21963h = true;
                                                    if (!TextUtils.isEmpty(C9090d.this.f21966k)) {
                                                        C9112a.m26117a(C9090d.this.f21965j, C9090d.this.f21945D, C9090d.this.f21966k, System.currentTimeMillis() - C9090d.this.f21952K);
                                                    }
                                                    C9090d.this.f21974s.mo15714a();
                                                    return;
                                                }
                                                return;
                                            }
                                            C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                            if (C9090d.this.f21951J != null) {
                                                C9090d.this.f21951J.removeMessages(5);
                                            }
                                            if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                C9090d.this.f21964i = true;
                                                if (!TextUtils.isEmpty(C9090d.this.f21966k) && C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                                    C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), C9090d.this.f21965j, "tpl temp preload success but isReady false", C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                }
                                                C9090d.this.f21974s.mo15715a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                            String str7 = str6;
                                            try {
                                                Context h = C9090d.this.f21965j;
                                                C9112a.m26119a((CampaignEx) list2.get(0), h, "preload template failed is tpl :" + z + " " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str8, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                            } catch (Exception unused) {
                                            }
                                            if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                    C9090d.this.f21964i = true;
                                                    if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                                        Context h2 = C9090d.this.f21965j;
                                                        C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), h2, "tpl temp preload failed: " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9069b a = C9090d.this.f21974s;
                                                    a.mo15715a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str7);
                                                    return;
                                                }
                                                return;
                                            }
                                            C8608u.m24882b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                                        }
                                    };
                                    cVar.mo60945a(l, i, m, f, str, requestIdNotice, q, str2, cMPTEntryUrl, o, campaignEx, c, b, str3, p, r17, false);
                                }
                            });
                        }
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:16:0x0071  */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo60918a(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r20, java.lang.String r21) {
                /*
                    r16 = this;
                    r6 = r16
                    r3 = r20
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this
                    r1 = 0
                    r0.f21960e = r1
                    if (r3 == 0) goto L_0x005f
                    int r0 = r20.size()
                    if (r0 <= 0) goto L_0x005f
                    java.lang.Object r0 = r3.get(r1)     // Catch:{ Exception -> 0x005f }
                    r7 = r0
                    com.mbridge.msdk.foundation.entity.CampaignEx r7 = (com.mbridge.msdk.foundation.entity.CampaignEx) r7     // Catch:{ Exception -> 0x005f }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x005f }
                    android.content.Context r8 = r0.f21965j     // Catch:{ Exception -> 0x005f }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f }
                    r0.<init>()     // Catch:{ Exception -> 0x005f }
                    java.lang.String r1 = "resource download failed: "
                    r0.append(r1)     // Catch:{ Exception -> 0x005f }
                    r4 = r21
                    r0.append(r4)     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r1 = " is tpl: "
                    r0.append(r1)     // Catch:{ Exception -> 0x0061 }
                    boolean r1 = r0     // Catch:{ Exception -> 0x0061 }
                    r0.append(r1)     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r9 = r0.toString()     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r10 = r0.f21966k     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0061 }
                    boolean r11 = r0.f21979x     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.foundation.entity.CampaignEx r0 = r6     // Catch:{ Exception -> 0x0061 }
                    java.lang.String r13 = r0.getRequestIdNotice()     // Catch:{ Exception -> 0x0061 }
                    long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0061 }
                    com.mbridge.msdk.reward.adapter.d r2 = com.mbridge.msdk.reward.adapter.C9090d.this     // Catch:{ Exception -> 0x0061 }
                    long r14 = r2.f21952K     // Catch:{ Exception -> 0x0061 }
                    long r14 = r0 - r14
                    r12 = r19
                    com.mbridge.msdk.reward.p342b.C9112a.m26119a(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0061 }
                    goto L_0x0061
                L_0x005f:
                    r4 = r21
                L_0x0061:
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this
                    com.mbridge.msdk.reward.adapter.b r0 = r0.f21974s
                    if (r0 == 0) goto L_0x008a
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this
                    android.os.Handler r0 = r0.f21951J
                    if (r0 == 0) goto L_0x008a
                    com.mbridge.msdk.reward.adapter.d r0 = com.mbridge.msdk.reward.adapter.C9090d.this
                    android.os.Handler r7 = r0.f21951J
                    com.mbridge.msdk.reward.adapter.d$3$3 r8 = new com.mbridge.msdk.reward.adapter.d$3$3
                    r0 = r8
                    r1 = r16
                    r2 = r18
                    r3 = r20
                    r4 = r21
                    r5 = r19
                    r0.<init>(r2, r3, r4, r5)
                    r7.post(r8)
                L_0x008a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.C9090d.C90933.mo60918a(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
            }
        }, new C9070c.C9083i() {
            /* renamed from: a */
            public final void mo60923a(String str, String str2, String str3, String str4) {
            }

            /* renamed from: a */
            public final void mo60924a(String str, final String str2, final String str3, String str4, final String str5) {
                if (z || C9090d.this.f21974s == null || C9090d.this.f21951J == null) {
                    if (nscpt == 1) {
                        if (campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                            if (campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                C8608u.m24882b("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                                return;
                            } else if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                C8608u.m24882b("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                                return;
                            }
                        }
                        if (C9090d.this.f21974s != null && C9090d.this.f21951J != null) {
                            C9090d.this.f21951J.post(new Runnable() {
                                public final void run() {
                                    C9090d.m26033a(C9090d.this, str2, C9090d.this.f21954M, C9090d.this.f21979x);
                                    if (C9090d.this.f21951J != null) {
                                        C9090d.this.f21951J.removeMessages(5);
                                    }
                                    if (!C9090d.this.f21964i && C9090d.this.f21974s != null) {
                                        C9090d.this.f21964i = true;
                                        if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                            C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), C9090d.this.f21965j, "tpl temp resource download failed", C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice());
                                        }
                                        C9090d.this.f21974s.mo15715a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                                    }
                                }
                            });
                        }
                    }
                } else if (campaignEx2.getRsIgnoreCheckRule() == null || campaignEx2.getRsIgnoreCheckRule().size() <= 0 || !campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                    C9090d.this.f21951J.post(new Runnable() {
                        public final void run() {
                            C9090d.m26033a(C9090d.this, str2, C9090d.this.f21954M, C9090d.this.f21979x);
                            if (C9090d.this.f21951J != null) {
                                C9090d.this.f21951J.removeMessages(5);
                            }
                            if (!C9090d.this.f21964i && C9090d.this.f21974s != null) {
                                C9090d.this.f21964i = true;
                                if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                    Context h = C9090d.this.f21965j;
                                    C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), h, "" + str5, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice());
                                }
                                C9090d.this.f21974s.mo15715a("errorCode: 3202 errorMessage: temp resource download failed");
                            }
                        }
                    });
                } else {
                    C8608u.m24882b("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                }
            }
        });
        if (z) {
            C9070c.C9089m.f21941a.mo60942a(dVar2.f21965j, campaignEx2, dVar2.f21967l, dVar2.f21966k, campaignEx2.getRequestId(), new C9070c.C9083i() {
                /* renamed from: a */
                public final void mo60923a(final String str, final String str2, final String str3, String str4) {
                    try {
                        CampaignEx campaignEx = campaignEx2;
                        Context h = C9090d.this.f21965j;
                        C9112a.m26119a(campaignEx, h, "resource download success is tpl :" + z, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                    } catch (Exception unused) {
                    }
                    C9090d.this.f21961f = true;
                    if (C9090d.this.f21960e && !C9090d.this.f21962g && C9090d.this.f21951J != null) {
                        synchronized (C9090d.this.f21958c) {
                            if (!C9090d.this.f21962g) {
                                C9090d.this.f21962g = true;
                                C9090d.this.f21951J.post(new Runnable() {
                                    public final void run() {
                                        C9070c a = C9070c.C9089m.f21941a;
                                        boolean l = C9090d.this.f21946E;
                                        Handler i = C9090d.this.f21951J;
                                        boolean m = C9090d.this.f21978w;
                                        boolean f = C9090d.this.f21979x;
                                        String str = str3;
                                        String requestIdNotice = campaignEx2.getRequestIdNotice();
                                        String str2 = str;
                                        String str3 = str2;
                                        String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                                        int o = C9090d.this.f21977v;
                                        CampaignEx campaignEx = campaignEx2;
                                        List c = C9090d.this.f21945D;
                                        String b = C9563g.m27460a().mo63242b(campaignEx2.getCMPTEntryUrl());
                                        String str4 = str2;
                                        C9070c cVar = a;
                                        C9551c p = C9090d.this.f21975t;
                                        C91041 r17 = r1;
                                        C91041 r1 = new C9070c.C9084j() {
                                            /* renamed from: a */
                                            public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                                try {
                                                    CampaignEx campaignEx = campaignEx2;
                                                    Context h = C9090d.this.f21965j;
                                                    C9112a.m26119a(campaignEx, h, "preload template success is tpl :" + z, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                                } catch (Exception unused) {
                                                }
                                                if (C9090d.this.mo60967a((List<CampaignEx>) C9090d.this.f21945D, z, nscpt)) {
                                                    C9090d.m26032a(C9090d.this, C9090d.this.f21966k, C9090d.this.f21954M, C9090d.this.f21955N, C9090d.this.f21979x);
                                                    if (C9090d.this.f21951J != null) {
                                                        C9090d.this.f21951J.removeMessages(5);
                                                    }
                                                    if (C9090d.this.f21974s != null && !C9090d.this.f21963h) {
                                                        C9090d.this.f21963h = true;
                                                        if (!TextUtils.isEmpty(C9090d.this.f21966k)) {
                                                            C9112a.m26117a(C9090d.this.f21965j, C9090d.this.f21945D, C9090d.this.f21966k, System.currentTimeMillis() - C9090d.this.f21952K);
                                                        }
                                                        C9090d.this.f21974s.mo15714a();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                    C9090d.this.f21964i = true;
                                                    if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                                        C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), C9090d.this.f21965j, "tpl temp preload success but isReady false", C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9090d.this.f21974s.mo15715a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                                }
                                            }

                                            /* renamed from: a */
                                            public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                                String str7 = str6;
                                                C9090d.m26033a(C9090d.this, str3, C9090d.this.f21954M, C9090d.this.f21979x);
                                                try {
                                                    CampaignEx campaignEx = campaignEx2;
                                                    Context h = C9090d.this.f21965j;
                                                    C9112a.m26119a(campaignEx, h, "preload template failed is tpl :" + z + " " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                                                } catch (Exception unused) {
                                                }
                                                if (C9090d.this.f21951J != null) {
                                                    C9090d.this.f21951J.removeMessages(5);
                                                }
                                                if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                                                    C9090d.this.f21964i = true;
                                                    if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                                                        Context h2 = C9090d.this.f21965j;
                                                        C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), h2, "tpl temp preload failed: " + str7, C9090d.this.f21966k, C9090d.this.f21979x, str4, campaignEx2.getRequestIdNotice());
                                                    }
                                                    C9069b a = C9090d.this.f21974s;
                                                    a.mo15715a("errorCode: 3303 errorMessage: tpl temp preload failed: " + str7);
                                                }
                                            }
                                        };
                                        cVar.mo60945a(l, i, m, f, str, requestIdNotice, str2, str3, cMPTEntryUrl, o, campaignEx, c, b, str4, p, r17, false);
                                    }
                                });
                            }
                        }
                    }
                }

                /* renamed from: a */
                public final void mo60924a(String str, String str2, String str3, String str4, String str5) {
                    String str6 = str5;
                    if (C9090d.this.f21954M.get(0) != null && C9090d.this.f21954M.size() > 0) {
                        try {
                            Context h = C9090d.this.f21965j;
                            C9112a.m26119a((CampaignEx) C9090d.this.f21954M.get(0), h, "resource download failed: " + str6 + " is tpl: " + z, C9090d.this.f21966k, C9090d.this.f21979x, str3, ((CampaignEx) C9090d.this.f21954M.get(0)).getRequestIdNotice(), System.currentTimeMillis() - C9090d.this.f21952K);
                        } catch (Exception unused) {
                        }
                    }
                    if (campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                            C8608u.m24882b("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                            return;
                        } else if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                            C8608u.m24882b("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                            return;
                        }
                    }
                    C9090d.this.f21961f = false;
                    C9090d dVar = C9090d.this;
                    C9090d.m26033a(dVar, str2, dVar.f21954M, C9090d.this.f21979x);
                    if (C9090d.this.f21951J != null) {
                        C9090d.this.f21951J.removeMessages(5);
                    }
                    if (C9090d.this.f21974s != null && !C9090d.this.f21964i) {
                        C9090d.this.f21964i = true;
                        if (C9090d.this.f21954M != null && C9090d.this.f21954M.size() > 0) {
                            Context h2 = C9090d.this.f21965j;
                            C9112a.m26118a((CampaignEx) C9090d.this.f21954M.get(0), h2, "" + str6, C9090d.this.f21966k, C9090d.this.f21979x, str3, campaignEx2.getRequestIdNotice());
                        }
                        C9090d.this.f21974s.mo15715a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                    }
                }
            });
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m26034a(C9090d dVar, List list) {
        if (dVar.f21965j != null && list != null && list.size() != 0) {
            C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(dVar.f21965j));
            for (int i = 0; i < list.size(); i++) {
                CampaignEx campaignEx = (CampaignEx) list.get(i);
                if (!(campaignEx == null || a == null || a.mo15907a(campaignEx.getId()))) {
                    C8405f fVar = new C8405f();
                    fVar.mo57347a(campaignEx.getId());
                    fVar.mo57345a(campaignEx.getFca());
                    fVar.mo57349b(campaignEx.getFcb());
                    fVar.mo57353d(0);
                    fVar.mo57351c(0);
                    fVar.mo57346a(System.currentTimeMillis());
                    a.mo15906a(fVar);
                }
            }
        }
    }
}
