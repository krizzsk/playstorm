package com.mbridge.msdk.reward.p341a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8401b;
import com.mbridge.msdk.foundation.entity.C8404e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p062a.p063a.C2338a;
import com.mbridge.msdk.foundation.p064b.C2347b;
import com.mbridge.msdk.foundation.p066db.C2369b;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2377h;
import com.mbridge.msdk.foundation.p066db.C2378i;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8554aa;
import com.mbridge.msdk.foundation.tools.C8556ac;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.reward.adapter.C9068a;
import com.mbridge.msdk.reward.adapter.C9069b;
import com.mbridge.msdk.reward.adapter.C9070c;
import com.mbridge.msdk.reward.adapter.C9090d;
import com.mbridge.msdk.reward.p342b.C9112a;
import com.mbridge.msdk.video.p346bt.module.p349b.C9246h;
import com.mbridge.msdk.videocommon.C9536a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9572h;
import com.mbridge.msdk.videocommon.download.C9578j;
import com.mbridge.msdk.videocommon.listener.C9584a;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import com.mbridge.msdk.videocommon.p370a.C9538a;
import com.mbridge.msdk.videocommon.p371b.C9540b;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.reward.a.a */
/* compiled from: RewardVideoController */
public class C9047a {

    /* renamed from: K */
    private static Map<String, Integer> f21690K = new HashMap();

    /* renamed from: L */
    private static ConcurrentHashMap<String, String> f21691L = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String f21692a;

    /* renamed from: b */
    public static Map<String, C9064d> f21693b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f21694A = false;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f21695B = false;

    /* renamed from: C */
    private boolean f21696C = false;

    /* renamed from: D */
    private boolean f21697D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f21698E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public boolean f21699F = false;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ArrayList<Integer> f21700G = new ArrayList<>(7);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f21701H = false;

    /* renamed from: I */
    private final Object f21702I = new Object();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f21703J = false;

    /* renamed from: M */
    private Queue<Integer> f21704M;

    /* renamed from: N */
    private String f21705N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C2376g f21706O = null;

    /* renamed from: P */
    private volatile boolean f21707P = true;

    /* renamed from: Q */
    private volatile boolean f21708Q = false;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public volatile boolean f21709R = false;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public volatile boolean f21710S = false;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public volatile boolean f21711T = false;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public volatile boolean f21712U = false;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public volatile boolean f21713V = false;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<CampaignEx> f21714W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public List<CampaignEx> f21715X;

    /* renamed from: c */
    volatile boolean f21716c = false;

    /* renamed from: d */
    volatile boolean f21717d = false;

    /* renamed from: e */
    volatile boolean f21718e = false;

    /* renamed from: f */
    volatile boolean f21719f = false;

    /* renamed from: g */
    volatile boolean f21720g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Context f21721h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f21722i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9090d f21723j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9551c f21724k;

    /* renamed from: l */
    private C9548a f21725l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile InterVideoOutListener f21726m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile C9063c f21727n;

    /* renamed from: o */
    private String f21728o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f21729p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public MBridgeIds f21730q;

    /* renamed from: r */
    private String f21731r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public volatile String f21732s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f21733t;

    /* renamed from: u */
    private int f21734u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Handler f21735v = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            Message message2 = message;
            switch (message2.what) {
                case 8:
                    if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                        boolean z = (C9047a.this.f21715X == null || C9047a.this.f21715X.size() <= 0) ? false : !TextUtils.isEmpty(((CampaignEx) C9047a.this.f21715X.get(0)).getCMPTEntryUrl());
                        int nscpt = ((CampaignEx) C9047a.this.f21714W.get(0)).getNscpt();
                        if (C9047a.this.f21723j == null || !C9047a.this.f21723j.mo60967a((List<CampaignEx>) C9047a.this.f21714W, z, nscpt)) {
                            if (C9047a.this.f21727n != null && C9047a.this.f21698E) {
                                C9536a.m27229c(C9047a.this.f21729p);
                                C9536a.m27223a();
                                C9063c.m25951a(C9047a.this.f21727n, "load timeout");
                                return;
                            }
                            return;
                        } else if (C9047a.this.f21727n != null && C9047a.this.f21698E) {
                            C9063c.m25952a(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 9:
                    if (C9047a.this.f21726m != null && C9047a.this.f21698E) {
                        Object obj = message2.obj;
                        if (obj instanceof String) {
                            obj.toString();
                        }
                        Bundle data = message.getData();
                        if (data != null && data.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty = TextUtils.isEmpty(data.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C9047a.this.f21695B) {
                                C9047a.m25899j(C9047a.this);
                            }
                            C9047a.this.f21726m.onVideoLoadSuccess(C9047a.this.f21730q);
                            return;
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                e.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 16:
                case 18:
                    if (C9047a.this.f21726m != null && C9047a.this.f21698E) {
                        Object obj2 = message2.obj;
                        String obj3 = obj2 instanceof String ? obj2.toString() : "";
                        C9536a.m27229c(C9047a.this.f21729p);
                        C9536a.m27223a();
                        try {
                            if (C9047a.this.f21695B) {
                                C9047a.m25899j(C9047a.this);
                            }
                            C9047a.this.f21726m.onVideoLoadFail(C9047a.this.f21730q, obj3);
                            return;
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 17:
                    if (C9047a.this.f21726m != null && C9047a.this.f21698E) {
                        Object obj4 = message2.obj;
                        if (obj4 instanceof String) {
                            obj4.toString();
                        }
                        Bundle data2 = message.getData();
                        if (data2 != null && data2.containsKey(MBridgeConstans.PLACEMENT_ID)) {
                            boolean isEmpty2 = TextUtils.isEmpty(data2.getString(MBridgeConstans.PLACEMENT_ID));
                        }
                        try {
                            if (C9047a.this.f21695B) {
                                C9047a.m25899j(C9047a.this);
                            }
                            C9047a.this.f21726m.onLoadSuccess(C9047a.this.f21730q);
                            return;
                        } catch (Exception e3) {
                            if (MBridgeConstans.DEBUG) {
                                e3.printStackTrace();
                                return;
                            }
                            return;
                        }
                    } else {
                        return;
                    }
                case 1001001:
                    C9047a.this.mo60911d(false);
                    return;
                case 1001002:
                    int E = C9047a.this.f21724k != null ? C9047a.this.f21724k.mo63135E() : 0;
                    if (C9047a.this.f21723j != null) {
                        if (C9047a.this.f21723j.mo60971b()) {
                            if (C9047a.this.f21727n != null) {
                                C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady exception");
                                try {
                                    List<CampaignEx> d = C9047a.this.f21723j.mo60974d();
                                    if (d != null && d.size() > 0) {
                                        Context g = C2350a.m5601e().mo15792g();
                                        C9112a.m26119a(d.get(0), g, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9047a.this.f21729p, C9047a.this.f21695B, "", "", (long) E);
                                        C9112a.m26117a(C9047a.this.f21721h, d, C9047a.this.f21729p, 0);
                                    }
                                } catch (Throwable th) {
                                    C8608u.m24884d("RewardVideoController", th.getMessage());
                                }
                                C9063c.m25956b(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
                                return;
                            }
                            return;
                        } else if (C9047a.this.f21723j.mo60977f(false)) {
                            if (!C9047a.this.f21723j.mo60971b()) {
                                C9047a.this.f21723j.mo60976e(false);
                                if (C9047a.this.f21723j.mo60977f(true)) {
                                    if (!C9047a.this.f21723j.mo60971b()) {
                                        if (C9047a.this.f21727n != null) {
                                            C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + "s exception");
                                        }
                                        C9047a.this.f21723j.mo60976e(true);
                                        return;
                                    } else if (C9047a.this.f21727n != null) {
                                        C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                        C9047a.this.f21723j.mo60975d(true);
                                        try {
                                            List<CampaignEx> d2 = C9047a.this.f21723j.mo60974d();
                                            if (d2 != null && d2.size() > 0) {
                                                Context g2 = C2350a.m5601e().mo15792g();
                                                C9112a.m26119a(d2.get(0), g2, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9047a.this.f21729p, C9047a.this.f21695B, "", "", (long) E);
                                                C9112a.m26117a(C9047a.this.f21721h, d2, C9047a.this.f21729p, 0);
                                            }
                                        } catch (Throwable th2) {
                                            C8608u.m24884d("RewardVideoController", th2.getMessage());
                                        }
                                        C9063c.m25956b(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
                                        return;
                                    } else {
                                        return;
                                    }
                                } else if (C9047a.this.f21727n != null) {
                                    C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + "s exception");
                                    return;
                                } else {
                                    return;
                                }
                            } else if (C9047a.this.f21727n != null) {
                                C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                C9047a.this.f21723j.mo60975d(false);
                                try {
                                    List<CampaignEx> d3 = C9047a.this.f21723j.mo60974d();
                                    if (d3 != null && d3.size() > 0) {
                                        Context g3 = C2350a.m5601e().mo15792g();
                                        C9112a.m26119a(d3.get(0), g3, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9047a.this.f21729p, C9047a.this.f21695B, "", "", (long) E);
                                        C9112a.m26117a(C9047a.this.f21721h, d3, C9047a.this.f21729p, 0);
                                    }
                                } catch (Throwable th3) {
                                    C8608u.m24884d("RewardVideoController", th3.getMessage());
                                }
                                C9063c.m25956b(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C9047a.this.f21723j.mo60977f(true)) {
                            if (!C9047a.this.f21723j.mo60971b()) {
                                if (C9047a.this.f21727n != null) {
                                    C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + " s");
                                }
                                C9047a.this.f21723j.mo60976e(true);
                                return;
                            } else if (C9047a.this.f21727n != null) {
                                C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState");
                                C9047a.this.f21723j.mo60975d(true);
                                try {
                                    List<CampaignEx> d4 = C9047a.this.f21723j.mo60974d();
                                    if (d4 != null && d4.size() > 0) {
                                        Context g4 = C2350a.m5601e().mo15792g();
                                        C9112a.m26119a(d4.get(0), g4, "load timeout task called onVideoLoadSuccess after " + E + "s exception", C9047a.this.f21729p, C9047a.this.f21695B, "", "", (long) E);
                                        C9112a.m26117a(C9047a.this.f21721h, d4, C9047a.this.f21729p, 0);
                                    }
                                } catch (Throwable th4) {
                                    C8608u.m24884d("RewardVideoController", th4.getMessage());
                                }
                                C9063c.m25956b(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
                                return;
                            } else {
                                return;
                            }
                        } else if (C9047a.this.f21727n != null) {
                            C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadFail after " + E + " s");
                            return;
                        } else {
                            return;
                        }
                    } else if (C9047a.this.f21727n != null) {
                        C8608u.m24880a("RewardVideoController", "load timeout task called for onVideoLoadFail by mRewardMvVideoAdapter is null exception");
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f21736w = 2;

    /* renamed from: x */
    private int f21737x;

    /* renamed from: y */
    private int f21738y;

    /* renamed from: z */
    private int f21739z;

    /* renamed from: a */
    public final void mo60905a(boolean z) {
        this.f21694A = z;
    }

    /* renamed from: b */
    public final void mo60909b(boolean z) {
        this.f21695B = z;
    }

    /* renamed from: a */
    public final void mo60900a(int i) {
        this.f21736w = i;
    }

    /* renamed from: a */
    public final String mo60899a() {
        C9090d dVar = this.f21723j;
        return dVar != null ? dVar.mo60958a(this.f21701H) : "";
    }

    /* renamed from: a */
    public final void mo60904a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            Context context = this.f21721h;
            C8554aa.m24732a(context, "MBridge_ConfirmTitle" + this.f21729p, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            Context context2 = this.f21721h;
            C8554aa.m24732a(context2, "MBridge_ConfirmContent" + this.f21729p, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            Context context3 = this.f21721h;
            C8554aa.m24732a(context3, "MBridge_CancelText" + this.f21729p, str4.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            Context context4 = this.f21721h;
            C8554aa.m24732a(context4, "MBridge_ConfirmText" + this.f21729p, str3.trim());
        }
    }

    /* renamed from: c */
    public final void mo60910c(boolean z) {
        this.f21699F = z;
    }

    /* renamed from: a */
    public final void mo60901a(int i, int i2, int i3) {
        this.f21737x = i;
        this.f21738y = i2;
        if (i2 == C8413a.f20335q) {
            this.f21739z = i3 < 0 ? 5 : i3;
        }
        if (this.f21738y == C8413a.f20334p) {
            this.f21739z = i3 < 0 ? 80 : i3;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            int i4 = 1;
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i == C8413a.f20332n ? 0 : 1);
            if (i2 == C8413a.f20334p) {
                i4 = 0;
            }
            jSONObject.put("ivRewardPlayValueMode", i4);
            jSONObject.put("ivRewardPlayValue", i3);
            C2283b.m5275a();
            String str = this.f21729p;
            String jSONObject2 = jSONObject.toString();
            C2338a.m5535a().mo15733a("ivreward_" + str, jSONObject2);
        } catch (Exception unused) {
            C8608u.m24884d("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    /* renamed from: a */
    public static void m25867a(String str, int i) {
        try {
            if (f21690K != null && C8556ac.m24738b(str)) {
                f21690K.put(str, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m25860a(String str) {
        Integer num;
        try {
            if (!C8556ac.m24738b(str) || f21690K == null || !f21690K.containsKey(str) || (num = f21690K.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m25868a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (concurrentHashMap = f21691L) != null && !concurrentHashMap.containsKey(str)) {
            f21691L.put(str, str2);
        }
    }

    /* renamed from: b */
    public final void mo60907b() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (this.f21701H && (concurrentHashMap = f21691L) != null && !concurrentHashMap.containsKey(mo60899a())) {
            f21691L.remove(mo60899a());
        }
    }

    public static void insertExcludeId(String str, CampaignEx campaignEx) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C2350a.m5601e().mo15792g() != null) {
            C2378i a = C2378i.m5736a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
            C8404e eVar = new C8404e();
            eVar.mo57338a(System.currentTimeMillis());
            eVar.mo57341b(str);
            eVar.mo57339a(campaignEx.getId());
            a.mo15904a(eVar);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$d */
    /* compiled from: RewardVideoController */
    private final class C9064d implements C9246h {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C9047a f21793b;

        /* renamed from: c */
        private int f21794c;

        /* renamed from: d */
        private Handler f21795d;

        /* renamed from: e */
        private int f21796e;

        private C9064d(C9047a aVar, int i, Handler handler) {
            this.f21796e = 0;
            this.f21793b = aVar;
            this.f21794c = i;
            this.f21795d = handler;
        }

        /* renamed from: a */
        public final void mo60930a() {
            boolean unused = C9047a.this.f21703J = false;
            try {
                if (this.f21793b != null) {
                    boolean unused2 = this.f21793b.f21701H = true;
                    if (this.f21793b.f21723j != null) {
                        this.f21793b.f21723j.f21957b = "";
                    }
                    C8442b.m24388a().execute(new Runnable(this.f21794c) {

                        /* renamed from: a */
                        final /* synthetic */ int f21776a;

                        {
                            this.f21776a = r2;
                        }

                        public final void run() {
                            try {
                                if (C9047a.this.f21706O == null) {
                                    C2376g unused = C9047a.this.f21706O = C2376g.m5723a(C2350a.m5601e().mo15792g());
                                }
                                C2377h a = C2377h.m5731a((C2374f) C9047a.this.f21706O);
                                if (a != null) {
                                    a.mo15902a(C9047a.this.f21729p);
                                }
                            } catch (Throwable unused2) {
                                C8608u.m24884d("RewardVideoController", "can't find DailyPlayCapDao");
                            }
                            if (this.f21776a == 1) {
                                Context m = C9047a.this.f21721h;
                                C8554aa.m24732a(m, C9047a.this.f21732s + "_" + this.f21776a, Integer.valueOf(C9047a.this.f21722i + 1));
                            }
                        }
                    });
                    if (C9047a.this.f21695B) {
                        C9047a.m25899j(C9047a.this);
                    }
                    if (this.f21793b.f21726m != null) {
                        this.f21793b.f21726m.onAdShow(C9047a.this.f21730q);
                        this.f21796e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo60935a(boolean z, C9541c cVar) {
            try {
                if (this.f21793b != null && this.f21793b.f21726m != null) {
                    if (cVar == null) {
                        cVar = C9541c.m27264b(this.f21793b.f21733t);
                    }
                    if (C9047a.this.f21695B) {
                        C9047a.m25899j(C9047a.this);
                        C9047a.this.mo60907b();
                        C8417d.m24317d(C9047a.this.f21729p, C9047a.this.mo60899a());
                    }
                    this.f21793b.f21726m.onAdClose(C9047a.this.f21730q, new RewardInfo(z, cVar.mo63097a(), String.valueOf(cVar.mo63100b())));
                    this.f21796e = 7;
                    boolean unused = this.f21793b.f21701H = false;
                    C9047a.this.f21700G.clear();
                    this.f21793b = null;
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0073 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo60932a(java.lang.String r12) {
            /*
                r11 = this;
                r0 = 0
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x008f }
                boolean unused = r1.f21703J = r0     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.a.a r1 = r11.f21793b     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0099
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x008f }
                boolean r1 = r1.f21695B     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0017
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.p341a.C9047a.m25899j(r1)     // Catch:{ Exception -> 0x008f }
            L_0x0017:
                com.mbridge.msdk.reward.a.a r1 = r11.f21793b     // Catch:{ Exception -> 0x008f }
                boolean unused = r1.f21701H = r0     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.reward.a.a r1 = r11.f21793b     // Catch:{ Exception -> 0x008f }
                com.mbridge.msdk.videocommon.listener.InterVideoOutListener r1 = r1.f21726m     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x0099
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0073 }
                java.util.List r1 = r1.f21714W     // Catch:{ Exception -> 0x0073 }
                if (r1 == 0) goto L_0x0073
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0073 }
                java.util.List r1 = r1.f21714W     // Catch:{ Exception -> 0x0073 }
                int r1 = r1.size()     // Catch:{ Exception -> 0x0073 }
                if (r1 <= 0) goto L_0x0073
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0073 }
                java.util.List r1 = r1.f21714W     // Catch:{ Exception -> 0x0073 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0073 }
                r2 = r1
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x0073 }
                android.content.Context r3 = r1.mo15792g()     // Catch:{ Exception -> 0x0073 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0073 }
                r1.<init>()     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = "show failed: "
                r1.append(r4)     // Catch:{ Exception -> 0x0073 }
                r1.append(r12)     // Catch:{ Exception -> 0x0073 }
                java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0073 }
                java.lang.String r5 = r1.f21729p     // Catch:{ Exception -> 0x0073 }
                com.mbridge.msdk.reward.a.a r1 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0073 }
                boolean r6 = r1.f21695B     // Catch:{ Exception -> 0x0073 }
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r9 = 0
                com.mbridge.msdk.reward.p342b.C9112a.m26119a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0073 }
            L_0x0073:
                com.mbridge.msdk.reward.a.a r1 = r11.f21793b     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.videocommon.listener.InterVideoOutListener r1 = r1.f21726m     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.reward.a.a r2 = com.mbridge.msdk.reward.p341a.C9047a.this     // Catch:{ Exception -> 0x0083 }
                com.mbridge.msdk.out.MBridgeIds r2 = r2.f21730q     // Catch:{ Exception -> 0x0083 }
                r1.onShowFail(r2, r12)     // Catch:{ Exception -> 0x0083 }
                goto L_0x008b
            L_0x0083:
                r12 = move-exception
                boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x008f }
                if (r1 == 0) goto L_0x008b
                r12.printStackTrace()     // Catch:{ Exception -> 0x008f }
            L_0x008b:
                r12 = 4
                r11.f21796e = r12     // Catch:{ Exception -> 0x008f }
                goto L_0x0099
            L_0x008f:
                r12 = move-exception
                r11.f21796e = r0
                boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r0 == 0) goto L_0x0099
                r12.printStackTrace()
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p341a.C9047a.C9064d.mo60932a(java.lang.String):void");
        }

        /* renamed from: a */
        public final void mo60936a(boolean z, String str, String str2) {
            try {
                if (this.f21793b != null && this.f21793b.f21726m != null) {
                    if (C9047a.this.f21695B) {
                        C9047a.m25899j(C9047a.this);
                    }
                    boolean unused = this.f21793b.f21701H = false;
                    try {
                        this.f21793b.f21726m.onVideoAdClicked(z, C9047a.this.f21730q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo60933a(String str, String str2) {
            try {
                if (this.f21793b != null && this.f21793b.f21726m != null) {
                    try {
                        this.f21793b.f21726m.onVideoComplete(C9047a.this.f21730q);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f21796e = 5;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo60934a(boolean z, int i) {
            try {
                if (this.f21793b != null && this.f21793b.f21726m != null) {
                    try {
                        this.f21793b.f21726m.onAdCloseWithIVReward(C9047a.this.f21730q, new RewardInfo(z, i));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: b */
        public final void mo60937b(String str, String str2) {
            try {
                if (this.f21793b != null && this.f21793b.f21726m != null) {
                    try {
                        this.f21793b.f21726m.onEndcardShow(C9047a.this.f21730q);
                        C2347b a = C2347b.m5579a();
                        a.mo15775c(str2 + "_" + 2, 2);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    this.f21796e = 6;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }

        /* renamed from: a */
        public final void mo60931a(int i, String str, String str2) {
            this.f21796e = i;
            C9047a aVar = this.f21793b;
            if (aVar != null && !aVar.f21695B && !this.f21793b.f21694A && this.f21793b.f21724k != null && this.f21793b.f21724k.mo63177s(this.f21796e) && this.f21793b.f21727n != null && this.f21793b.f21727n.f21788c.get() != 1 && this.f21793b.f21727n.f21788c.get() != 3 && !C9047a.this.f21700G.contains(Integer.valueOf(this.f21796e))) {
                C9047a.this.f21700G.add(Integer.valueOf(this.f21796e));
                int z = this.f21793b.f21724k.mo63189z() * 1000;
                if (this.f21796e == 4) {
                    z = 3000;
                }
                Handler handler = this.f21795d;
                if (handler != null) {
                    handler.removeMessages(1001001);
                    this.f21795d.sendEmptyMessageDelayed(1001001, (long) z);
                    return;
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        if (C9064d.this.f21793b != null) {
                            C9064d.this.f21793b.mo60911d(false);
                        }
                    }
                }, (long) z);
            }
        }
    }

    /* renamed from: a */
    public final void mo60902a(InterVideoOutListener interVideoOutListener) {
        this.f21726m = interVideoOutListener;
        this.f21727n = new C9063c(interVideoOutListener, this.f21735v, this.f21729p);
    }

    /* renamed from: b */
    public final void mo60908b(String str, String str2) {
        List<CampaignEx> a;
        try {
            this.f21721h = C2350a.m5601e().mo15792g();
            this.f21729p = str2;
            this.f21732s = str;
            this.f21730q = new MBridgeIds(this.f21732s, this.f21729p);
            this.f21725l = C9549b.m27299a().mo63129b();
            C8442b.m24389b().execute(new Runnable() {
                public final void run() {
                    if (C9047a.this.f21721h != null && !TextUtils.isEmpty(C9047a.this.f21729p)) {
                        try {
                            C9112a.m26115a(C9047a.this.f21721h, C9047a.this.f21729p);
                        } catch (Exception unused) {
                        }
                    }
                }
            });
            C8602s.m24870b();
            C9578j.m27494a().mo63258b();
            C9572h.m27477a().mo63247b();
            C9549b.m27299a().mo63125a(this.f21729p);
            if (!TextUtils.isEmpty(this.f21729p) && (a = C9538a.m27238a().mo63077a(this.f21729p, 1)) != null && a.size() > 0) {
                C9556c.getInstance().createUnitCache(this.f21721h, this.f21729p, a, 94, (C9584a) null);
            }
            if (this.f21706O == null) {
                this.f21706O = C2376g.m5723a(C2350a.m5601e().mo15792g());
            }
        } catch (Throwable th) {
            C8608u.m24881a("RewardVideoController", th.getMessage(), th);
        }
    }

    /* renamed from: d */
    public final void mo60911d(boolean z) {
        mo60906a(z, "");
    }

    /* renamed from: c */
    private void m25880c() {
        C2372e.m5679a((C2374f) C2376g.m5723a(this.f21721h)).mo15864a(this.f21729p);
    }

    /* renamed from: d */
    private void m25884d() {
        try {
            List<CampaignEx> b = C2372e.m5679a((C2374f) C2376g.m5723a(this.f21721h)).mo15878b(this.f21729p);
            if (b != null && b.size() > 0) {
                for (CampaignEx next : b) {
                    if (!TextUtils.isEmpty(next.getCMPTEntryUrl())) {
                        C9536a.m27228b(this.f21729p + "_" + next.getRequestId() + "_" + next.getCMPTEntryUrl());
                        if (next.getRewardTemplateMode() != null && !TextUtils.isEmpty(next.getRewardTemplateMode().mo57205e())) {
                            C9536a.m27228b(this.f21729p + "_" + next.getId() + "_" + next.getRequestId() + "_" + next.getRewardTemplateMode().mo57205e());
                        }
                    } else {
                        C9536a.m27226b(next.getAdType(), next);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:72|73|74|(1:78)|79|80|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d5, code lost:
        com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25951a(r13.f21727n, "load exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d1 */
    /* JADX WARNING: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d5 A[Catch:{ Exception -> 0x01db }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60906a(boolean r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = "load exception"
            com.mbridge.msdk.reward.a.a$c r1 = r13.f21727n
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0045
            com.mbridge.msdk.reward.a.a$c r1 = r13.f21727n
            int r1 = r1.f21788c.get()
            if (r1 != r2) goto L_0x0045
            boolean r15 = r13.f21698E
            if (r15 == 0) goto L_0x0040
            if (r14 == 0) goto L_0x0044
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W
            if (r14 == 0) goto L_0x0038
            int r14 = r14.size()
            if (r14 <= 0) goto L_0x0038
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W
            java.lang.Object r14 = r14.get(r3)
            r0 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            android.content.Context r1 = r13.f21721h
            java.lang.String r3 = r13.f21729p
            boolean r4 = r13.f21695B
            java.lang.String r2 = "current unit is loading"
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            com.mbridge.msdk.reward.p342b.C9112a.m26121b(r0, r1, r2, r3, r4, r5, r6)
        L_0x0038:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n
            java.lang.String r15 = "errorCode: 3501 errorMessage: current unit is loading"
            r14.m25953a((java.lang.String) r15)
            goto L_0x0044
        L_0x0040:
            if (r14 == 0) goto L_0x0044
            r13.f21698E = r14
        L_0x0044:
            return
        L_0x0045:
            com.mbridge.msdk.reward.a.a$c r1 = r13.f21727n
            if (r1 == 0) goto L_0x0055
            com.mbridge.msdk.reward.a.a$c r1 = r13.f21727n
            int r1 = r1.f21788c.get()
            r4 = 3
            if (r1 != r4) goto L_0x0055
            r13.f21707P = r3
            goto L_0x005c
        L_0x0055:
            r13.f21707P = r2
            com.mbridge.msdk.reward.a.a$c r1 = r13.f21727n
            r1.f21788c.set(r2)
        L_0x005c:
            r13.f21698E = r14
            android.os.Handler r1 = r13.f21735v
            r2 = 1001001(0xf4629, float:1.402701E-39)
            r1.removeMessages(r2)
            r13.f21710S = r3
            r13.f21709R = r3
            r13.f21711T = r3
            r13.f21712U = r3
            r13.m25884d()
            r13.m25880c()
            com.mbridge.msdk.reward.adapter.C9070c.m25978a()
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x0098
            boolean r1 = r13.f21694A     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x008d
            com.mbridge.msdk.d.b r1 = com.mbridge.msdk.p059d.C2332b.getInstance()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f21732s     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            r1.addInterstitialList(r2, r4)     // Catch:{ Exception -> 0x01db }
            goto L_0x0098
        L_0x008d:
            com.mbridge.msdk.d.b r1 = com.mbridge.msdk.p059d.C2332b.getInstance()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f21732s     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            r1.addRewardList(r2, r4)     // Catch:{ Exception -> 0x01db }
        L_0x0098:
            boolean r1 = r13.f21695B     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x00d2
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x01db }
            if (r1 == 0) goto L_0x00d2
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00d1
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00ca
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01db }
            if (r14 <= 0) goto L_0x00ca
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x01db }
            r4 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01db }
            android.content.Context r5 = r13.f21721h     // Catch:{ Exception -> 0x01db }
            java.lang.String r6 = "bidToken is empty"
            java.lang.String r7 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            boolean r8 = r13.f21695B     // Catch:{ Exception -> 0x01db }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            com.mbridge.msdk.reward.p342b.C9112a.m26121b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01db }
        L_0x00ca:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            java.lang.String r15 = "bidToken is empty"
            com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25957c(r14, r15)     // Catch:{ Exception -> 0x01db }
        L_0x00d1:
            return
        L_0x00d2:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.mbridge.msdk.system.C9131a.f22132a     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0106
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x0105
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x00fe
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            int r14 = r14.size()     // Catch:{ Exception -> 0x01db }
            if (r14 <= 0) goto L_0x00fe
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r14 = r13.f21714W     // Catch:{ Exception -> 0x01db }
            java.lang.Object r14 = r14.get(r3)     // Catch:{ Exception -> 0x01db }
            r4 = r14
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01db }
            android.content.Context r5 = r13.f21721h     // Catch:{ Exception -> 0x01db }
            java.lang.String r6 = "init error"
            java.lang.String r7 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            boolean r8 = r13.f21695B     // Catch:{ Exception -> 0x01db }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            com.mbridge.msdk.reward.p342b.C9112a.m26121b(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01db }
        L_0x00fe:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            java.lang.String r15 = "init error"
            com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25957c(r14, r15)     // Catch:{ Exception -> 0x01db }
        L_0x0105:
            return
        L_0x0106:
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r2.mo15793h()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.c r1 = r1.mo63123a(r2, r4)     // Catch:{ Exception -> 0x01db }
            r13.f21724k = r1     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0154
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r1 = r1.mo15793h()     // Catch:{ Exception -> 0x01db }
            r13.f21705N = r1     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f21705N     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r4.mo15794i()     // Catch:{ Exception -> 0x01db }
            java.lang.String r5 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.reward.a.a$3 r6 = new com.mbridge.msdk.reward.a.a$3     // Catch:{ Exception -> 0x01db }
            r6.<init>()     // Catch:{ Exception -> 0x01db }
            r1.mo63127a(r2, r4, r5, r6)     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.b r1 = com.mbridge.msdk.videocommon.p373d.C9549b.m27299a()     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r2.mo15793h()     // Catch:{ Exception -> 0x01db }
            java.lang.String r4 = r13.f21729p     // Catch:{ Exception -> 0x01db }
            boolean r5 = r13.f21694A     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.videocommon.d.c r1 = r1.mo63124a((java.lang.String) r2, (java.lang.String) r4, (boolean) r5)     // Catch:{ Exception -> 0x01db }
            r13.f21724k = r1     // Catch:{ Exception -> 0x01db }
        L_0x0154:
            java.lang.String r1 = r13.f21732s     // Catch:{ Exception -> 0x01db }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x01db }
            if (r1 != 0) goto L_0x0163
            com.mbridge.msdk.videocommon.d.c r1 = r13.f21724k     // Catch:{ Exception -> 0x01db }
            java.lang.String r2 = r13.f21732s     // Catch:{ Exception -> 0x01db }
            r1.mo63143b((java.lang.String) r2)     // Catch:{ Exception -> 0x01db }
        L_0x0163:
            com.mbridge.msdk.videocommon.d.c r1 = r13.f21724k     // Catch:{ Exception -> 0x01db }
            int r1 = r1.mo63135E()     // Catch:{ Exception -> 0x01db }
            int r1 = r1 * 1000
            android.os.Handler r2 = r13.f21735v     // Catch:{ Exception -> 0x01db }
            if (r2 == 0) goto L_0x0178
            android.os.Handler r2 = r13.f21735v     // Catch:{ Exception -> 0x01db }
            r4 = 1001002(0xf462a, float:1.402703E-39)
            long r5 = (long) r1     // Catch:{ Exception -> 0x01db }
            r2.sendEmptyMessageDelayed(r4, r5)     // Catch:{ Exception -> 0x01db }
        L_0x0178:
            com.mbridge.msdk.videocommon.d.c r1 = r13.f21724k     // Catch:{ Exception -> 0x01db }
            java.util.Queue r1 = r1.mo63131A()     // Catch:{ Exception -> 0x01db }
            r13.f21704M = r1     // Catch:{ Exception -> 0x01db }
            boolean r1 = r13.m25891f()     // Catch:{ Exception -> 0x018a }
            if (r1 == 0) goto L_0x0192
            r13.m25887e()     // Catch:{ Exception -> 0x018a }
            goto L_0x0192
        L_0x018a:
            r1 = move-exception
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01db }
            if (r2 == 0) goto L_0x0192
            r1.printStackTrace()     // Catch:{ Exception -> 0x01db }
        L_0x0192:
            r13.m25875b((boolean) r14, (java.lang.String) r15)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0221
        L_0x0197:
            r14 = move-exception
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f21714W     // Catch:{ Exception -> 0x01d1 }
            if (r15 == 0) goto L_0x01d1
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f21714W     // Catch:{ Exception -> 0x01d1 }
            int r15 = r15.size()     // Catch:{ Exception -> 0x01d1 }
            if (r15 <= 0) goto L_0x01d1
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f21714W     // Catch:{ Exception -> 0x01d1 }
            java.lang.Object r15 = r15.get(r3)     // Catch:{ Exception -> 0x01d1 }
            r4 = r15
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x01d1 }
            android.content.Context r5 = r13.f21721h     // Catch:{ Exception -> 0x01d1 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d1 }
            r15.<init>()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r1 = "load exception: "
            r15.append(r1)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ Exception -> 0x01d1 }
            r15.append(r14)     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r7 = r13.f21729p     // Catch:{ Exception -> 0x01d1 }
            boolean r8 = r13.f21695B     // Catch:{ Exception -> 0x01d1 }
            java.lang.String r9 = ""
            java.lang.String r10 = ""
            r11 = 0
            com.mbridge.msdk.reward.p342b.C9112a.m26119a(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01d1 }
        L_0x01d1:
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            if (r14 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x01db }
            com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25951a((com.mbridge.msdk.reward.p341a.C9047a.C9063c) r14, (java.lang.String) r0)     // Catch:{ Exception -> 0x01db }
            goto L_0x0221
        L_0x01db:
            r14 = move-exception
            com.mbridge.msdk.reward.a.a$c r15 = r13.f21727n
            if (r15 == 0) goto L_0x021a
            com.mbridge.msdk.reward.a.a$c r15 = r13.f21727n
            com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25951a((com.mbridge.msdk.reward.p341a.C9047a.C9063c) r15, (java.lang.String) r0)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f21714W
            if (r15 == 0) goto L_0x021a
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x021a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r15 = r13.f21714W
            java.lang.Object r15 = r15.get(r3)
            r0 = r15
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            android.content.Context r1 = r13.f21721h
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "load exception "
            r15.append(r2)
            java.lang.String r2 = r14.getMessage()
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            java.lang.String r3 = r13.f21729p
            boolean r4 = r13.f21695B
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            com.mbridge.msdk.reward.p342b.C9112a.m26121b(r0, r1, r2, r3, r4, r5, r6)
        L_0x021a:
            boolean r15 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r15 == 0) goto L_0x0221
            r14.printStackTrace()
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p341a.C9047a.mo60906a(boolean, java.lang.String):void");
    }

    /* renamed from: b */
    private void m25875b(boolean z, String str) {
        if (this.f21727n == null) {
            return;
        }
        if (!this.f21695B) {
            this.f21713V = m25877b(this.f21729p);
            if (!this.f21713V) {
                this.f21713V = false;
                C9090d dVar = this.f21723j;
                if (dVar != null) {
                    dVar.mo60966a(this.f21714W);
                }
                this.f21727n.mo60929a(this.f21695B);
                m25871a(this.f21704M, z, str);
            } else if (!m25900j()) {
                List<CampaignEx> list = this.f21714W;
                if (list != null && list.size() > 0) {
                    C9063c.m25958c(this.f21727n, this.f21732s, this.f21729p);
                    CampaignEx campaignEx = list.get(0);
                    this.f21727n.mo60929a(this.f21695B);
                    C9090d dVar2 = this.f21723j;
                    if (dVar2 == null || !dVar2.mo60967a(list, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                        m25869a(list, this.f21723j);
                    } else {
                        C9112a.m26117a(this.f21721h, this.f21714W, this.f21729p, 0);
                        C9063c.m25956b(this.f21727n, this.f21732s, this.f21729p);
                    }
                    if (this.f21707P) {
                        C9090d dVar3 = this.f21723j;
                        if (dVar3 != null) {
                            dVar3.mo60966a(this.f21714W);
                        }
                        m25871a(this.f21704M, z, str);
                    }
                }
            } else {
                this.f21713V = false;
                C9090d dVar4 = this.f21723j;
                if (dVar4 != null) {
                    dVar4.mo60966a(this.f21714W);
                }
                this.f21727n.mo60929a(this.f21695B);
                m25871a(this.f21704M, z, str);
            }
        } else {
            List<CampaignEx> a = C9538a.m27238a().mo63079a(this.f21729p, 1, this.f21695B, "");
            if (a == null || a.size() <= 0) {
                if (!m25900j()) {
                    this.f21713V = false;
                    this.f21727n.mo60929a(this.f21695B);
                    m25871a(this.f21704M, z, str);
                    return;
                }
                C9538a.m27238a().mo63084a(this.f21729p, str);
                if (z && this.f21727n != null) {
                    C9063c.m25957c(this.f21727n, "checkOverCap failed");
                }
            } else if (!m25900j()) {
                List<CampaignEx> b = m25874b(str, a);
                if (b == null || b.size() <= 0) {
                    List<CampaignEx> a2 = m25863a(str, a);
                    if (a2 != null && a2.size() > 0) {
                        m25870a(a2, str);
                        C2369b.m5662a(C2350a.m5601e().mo15792g()).mo15849a(str, a2);
                        C9090d dVar5 = this.f21723j;
                        if (dVar5 != null) {
                            dVar5.mo60966a(a2);
                        }
                    }
                    this.f21713V = false;
                    this.f21727n.mo60929a(this.f21695B);
                    m25871a(this.f21704M, z, str);
                    return;
                }
                m25870a(b, str);
            } else {
                C9538a.m27238a().mo63084a(this.f21729p, str);
                if (z && this.f21727n != null) {
                    C9063c.m25957c(this.f21727n, "checkOverCap failed");
                }
            }
        }
    }

    /* renamed from: a */
    private void m25870a(List<CampaignEx> list, String str) {
        if (list != null && list.size() > 0) {
            this.f21713V = true;
            this.f21727n.mo60929a(this.f21695B);
            C9063c.m25958c(this.f21727n, this.f21732s, this.f21729p);
            CampaignEx campaignEx = list.get(0);
            m25868a(campaignEx.getRequestId(), str);
            C9090d dVar = this.f21723j;
            if (dVar == null || !dVar.mo60967a(list, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                m25869a(list, this.f21723j);
                return;
            }
            C9112a.m26117a(this.f21721h, this.f21714W, this.f21729p, 0);
            C9063c.m25956b(this.f21727n, this.f21732s, this.f21729p);
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m25863a(String str, List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int i = 1;
                    for (CampaignEx next : list) {
                        if (next != null) {
                            if (next.getVcn() > i) {
                                i = next.getVcn();
                            }
                            if (next.getTokenRule() == 1) {
                                String requestId = next.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        ((List) linkedHashMap.get(requestId)).add(next);
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(next);
                                        linkedHashMap.put(requestId, arrayList2);
                                    }
                                }
                            } else {
                                String requestId2 = next.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        ((List) linkedHashMap2.get(requestId2)).add(next);
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(next);
                                        linkedHashMap2.put(requestId2, arrayList3);
                                    }
                                }
                            }
                        }
                    }
                    if (!(linkedHashMap2.size() + linkedHashMap.size() < i || linkedHashMap.size() <= 0 || linkedHashMap.entrySet() == null || linkedHashMap.entrySet().iterator() == null || linkedHashMap.entrySet().iterator().next() == null || ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() == null)) {
                        arrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        C8417d.m24309a(this.f21729p, str, i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<CampaignEx> m25874b(String str, List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx next : list) {
                if (next != null && str.equals(next.getBidToken())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m25869a(List<CampaignEx> list, C9090d dVar) {
        final CampaignEx campaignEx = list.get(0);
        final boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        final int nscpt = campaignEx.getNscpt();
        this.f21716c = false;
        this.f21717d = false;
        this.f21718e = false;
        this.f21719f = false;
        this.f21720g = false;
        C9070c a = C9070c.m25978a();
        Context context = this.f21721h;
        boolean z2 = this.f21695B;
        final boolean z3 = z;
        final CampaignEx campaignEx2 = campaignEx;
        final C9090d dVar2 = dVar;
        final int i = nscpt;
        int i2 = nscpt;
        final boolean z4 = z;
        CampaignEx campaignEx3 = campaignEx;
        a.mo60943a(context, z, nscpt, z2, this.f21694A ? 287 : 94, this.f21732s, this.f21729p, campaignEx.getRequestId(), list, new C9070c.C9076c() {
            /* renamed from: a */
            public final void mo60917a(String str, String str2, String str3, List<CampaignEx> list) {
                String str4 = str2;
                List<CampaignEx> list2 = list;
                C9047a.this.f21716c = true;
                if (!z3) {
                    for (final CampaignEx next : list) {
                        if (next == null || next.getRewardTemplateMode() == null || TextUtils.isEmpty(next.getRewardTemplateMode().mo57205e()) || next.getRewardTemplateMode().mo57205e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || C9047a.this.f21735v == null) {
                            C9090d dVar = dVar2;
                            if (dVar == null || !dVar.mo60967a(list2, z3, i)) {
                                String str5 = str;
                                C9047a aVar = C9047a.this;
                                C9047a.m25866a(aVar, str4, aVar.f21715X);
                                if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                    C9047a.this.f21719f = true;
                                    C8608u.m24880a("RewardVideoController", "Cache onVideoLoadFailForCache");
                                    if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                        C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), C9047a.this.f21721h, "have no temp but isReady false", C9047a.this.f21729p, C9047a.this.f21695B, str3, next.getRequestIdNotice());
                                    }
                                    C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3503 errorMessage: have no temp but isReady false");
                                }
                            } else if (C9047a.this.f21727n != null && !C9047a.this.f21720g) {
                                C9047a.this.f21720g = true;
                                C8608u.m24880a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                C9112a.m26117a(C9047a.this.f21721h, list2, C9047a.this.f21729p, 0);
                                C9063c.m25956b(C9047a.this.f21727n, str, str4);
                            }
                        } else {
                            final List<CampaignEx> list3 = list;
                            final String str6 = str;
                            final String str7 = str2;
                            final String str8 = str3;
                            C9047a.this.f21735v.post(new Runnable() {
                                public final void run() {
                                    C9070c a = C9070c.m25978a();
                                    boolean r = C9047a.this.f21699F;
                                    Handler q = C9047a.this.f21735v;
                                    boolean p = C9047a.this.f21694A;
                                    boolean i = C9047a.this.f21695B;
                                    String e = next.getRewardTemplateMode().mo57205e();
                                    int s = C9047a.this.f21736w;
                                    CampaignEx campaignEx = campaignEx2;
                                    List list = list3;
                                    String b = C9563g.m27460a().mo63242b(next.getRewardTemplateMode().mo57205e());
                                    String str = str6;
                                    String str2 = str7;
                                    String str3 = str8;
                                    String requestIdNotice = next.getRequestIdNotice();
                                    C9551c l = C9047a.this.f21724k;
                                    C90531 r17 = r6;
                                    C90531 r6 = new C9070c.C9084j() {
                                        /* renamed from: a */
                                        public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                            if (dVar2 == null || !dVar2.mo60967a((List<CampaignEx>) list3, z3, i)) {
                                                C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                                if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                                    C9047a.this.f21719f = true;
                                                    if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                                        C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), C9047a.this.f21721h, "temp preload success but isReady false", C9047a.this.f21729p, C9047a.this.f21695B, str4, next.getRequestIdNotice());
                                                    }
                                                    C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                                                }
                                            } else if (C9047a.this.f21727n != null && !C9047a.this.f21720g) {
                                                C9047a.this.f21720g = true;
                                                C9112a.m26117a(C9047a.this.f21721h, list3, C9047a.this.f21729p, 0);
                                                C9063c.m25956b(C9047a.this.f21727n, str2, str3);
                                            }
                                        }

                                        /* renamed from: a */
                                        public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                            C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                            if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                                C9047a.this.f21719f = true;
                                                if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                                    Context m = C9047a.this.f21721h;
                                                    C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "temp preload failed: " + str6, C9047a.this.f21729p, C9047a.this.f21695B, str4, next.getRequestIdNotice());
                                                }
                                                C9063c d = C9047a.this.f21727n;
                                                C9063c.m25959d(d, "errorCode: 3301 errorMessage: temp preload failed: " + str6);
                                            }
                                        }
                                    };
                                    a.mo60944a(r, q, p, i, (WindVaneWebView) null, e, s, campaignEx, list, b, str, str2, str3, requestIdNotice, l, r17);
                                }
                            });
                        }
                        String str9 = str;
                    }
                    return;
                }
                String str10 = str;
                if (C9047a.this.f21717d && !C9047a.this.f21718e && C9047a.this.f21735v != null) {
                    C9047a.this.f21718e = true;
                    final String str11 = str3;
                    final String str12 = str;
                    final String str13 = str2;
                    final List<CampaignEx> list4 = list;
                    C9047a.this.f21735v.post(new Runnable() {
                        public final void run() {
                            C9070c a = C9070c.m25978a();
                            boolean r = C9047a.this.f21699F;
                            Handler q = C9047a.this.f21735v;
                            boolean p = C9047a.this.f21694A;
                            boolean i = C9047a.this.f21695B;
                            String str = str11;
                            String requestIdNotice = campaignEx2.getRequestIdNotice();
                            String str2 = str12;
                            String str3 = str13;
                            String cMPTEntryUrl = campaignEx2.getCMPTEntryUrl();
                            int s = C9047a.this.f21736w;
                            CampaignEx campaignEx = campaignEx2;
                            List list = list4;
                            String b = C9563g.m27460a().mo63242b(campaignEx2.getCMPTEntryUrl());
                            String str4 = str13;
                            C9070c cVar = a;
                            C9551c l = C9047a.this.f21724k;
                            C90551 r17 = r1;
                            C90551 r1 = new C9070c.C9084j() {
                                /* renamed from: a */
                                public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                    if (dVar2 == null || !dVar2.mo60967a((List<CampaignEx>) list4, z3, i)) {
                                        C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                        if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                            C9047a.this.f21719f = true;
                                            if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                                C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), C9047a.this.f21721h, "tpl temp preload success but isReady false", C9047a.this.f21729p, C9047a.this.f21695B, str4, campaignEx2.getRequestIdNotice());
                                            }
                                            C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                                        }
                                    } else if (C9047a.this.f21727n != null && !C9047a.this.f21720g) {
                                        C9047a.this.f21720g = true;
                                        C8608u.m24880a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                                        C9112a.m26117a(C9047a.this.f21721h, list4, C9047a.this.f21729p, 0);
                                        C9063c.m25956b(C9047a.this.f21727n, str2, str3);
                                    }
                                }

                                /* renamed from: a */
                                public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                    C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                    if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                        C9047a.this.f21719f = true;
                                        if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                            Context m = C9047a.this.f21721h;
                                            C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "tpl temp preload failed: " + str6, C9047a.this.f21729p, C9047a.this.f21695B, str4, campaignEx2.getRequestIdNotice());
                                        }
                                        C9063c d = C9047a.this.f21727n;
                                        C9063c.m25959d(d, "errorCode: 3302 errorMessage: tpl temp preload failed: " + str6);
                                    }
                                }
                            };
                            cVar.mo60945a(r, q, p, i, str, requestIdNotice, str2, str3, cMPTEntryUrl, s, campaignEx, list, b, str4, l, r17, true);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo60918a(String str, String str2, String str3, List<CampaignEx> list, String str4) {
                C9047a.this.f21716c = false;
                C9047a aVar = C9047a.this;
                C9047a.m25866a(aVar, str2, aVar.f21715X);
                if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                    C9047a.this.f21719f = true;
                    if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                        Context m = C9047a.this.f21721h;
                        C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "" + str4, C9047a.this.f21729p, C9047a.this.f21695B, str3, campaignEx2.getRequestIdNotice());
                    }
                    C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3201 errorMessage: campaign resource download failed");
                }
            }
        }, new C9070c.C9083i() {
            /* renamed from: a */
            public final void mo60923a(String str, String str2, String str3, String str4) {
            }

            /* renamed from: a */
            public final void mo60924a(String str, String str2, String str3, String str4, String str5) {
                C9047a aVar = C9047a.this;
                C9047a.m25866a(aVar, str2, aVar.f21715X);
                if (z || C9047a.this.f21727n == null) {
                    if (nscpt == 1 && !C9047a.this.f21719f && C9047a.this.f21727n != null) {
                        C9047a.this.f21719f = true;
                        if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                            C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), C9047a.this.f21721h, "temp resource download failed", C9047a.this.f21729p, C9047a.this.f21695B, str3, campaignEx.getRequestIdNotice());
                        }
                        C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3202 errorMessage: temp resource download failed");
                    }
                } else if (!C9047a.this.f21719f) {
                    C9047a.this.f21719f = true;
                    if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                        Context m = C9047a.this.f21721h;
                        C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "" + str5, C9047a.this.f21729p, C9047a.this.f21695B, str3, campaignEx.getRequestIdNotice());
                    }
                    C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3202 errorMessage: temp resource download failed");
                }
            }
        });
        if (z4) {
            final CampaignEx campaignEx4 = campaignEx3;
            final List<CampaignEx> list2 = list;
            final C9090d dVar3 = dVar;
            final int i3 = i2;
            C9070c.m25978a().mo60942a(this.f21721h, campaignEx3, this.f21732s, this.f21729p, campaignEx3.getRequestId(), new C9070c.C9083i() {
                /* renamed from: a */
                public final void mo60923a(final String str, final String str2, final String str3, String str4) {
                    C9047a.this.f21717d = true;
                    if (C9047a.this.f21716c && !C9047a.this.f21718e && C9047a.this.f21735v != null) {
                        C9047a.this.f21718e = true;
                        C9047a.this.f21735v.post(new Runnable() {
                            public final void run() {
                                C9070c a = C9070c.m25978a();
                                boolean r = C9047a.this.f21699F;
                                Handler q = C9047a.this.f21735v;
                                boolean p = C9047a.this.f21694A;
                                boolean i = C9047a.this.f21695B;
                                String str = str3;
                                String requestIdNotice = campaignEx4.getRequestIdNotice();
                                String str2 = str;
                                String str3 = str2;
                                String cMPTEntryUrl = campaignEx4.getCMPTEntryUrl();
                                int s = C9047a.this.f21736w;
                                CampaignEx campaignEx = campaignEx4;
                                List list = list2;
                                String b = C9563g.m27460a().mo63242b(campaignEx4.getCMPTEntryUrl());
                                String str4 = str2;
                                C9070c cVar = a;
                                C9551c l = C9047a.this.f21724k;
                                C90591 r17 = r1;
                                C90591 r1 = new C9070c.C9084j() {
                                    /* renamed from: a */
                                    public final void mo60920a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar) {
                                        if (!dVar3.mo60967a((List<CampaignEx>) list2, z4, i3)) {
                                            C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                            if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                                C9047a.this.f21719f = true;
                                                if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                                    C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), C9047a.this.f21721h, "tpl temp preload success but isReady false", C9047a.this.f21729p, C9047a.this.f21695B, str4, campaignEx4.getRequestIdNotice());
                                                }
                                                C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                            }
                                        } else if (C9047a.this.f21727n != null && !C9047a.this.f21720g) {
                                            C9047a.this.f21720g = true;
                                            C8608u.m24880a("RewardVideoController", "Cache onVideoLoadSuccess");
                                            C9112a.m26117a(C9047a.this.f21721h, list2, C9047a.this.f21729p, 0);
                                            C9063c.m25956b(C9047a.this.f21727n, str2, str3);
                                        }
                                    }

                                    /* renamed from: a */
                                    public final void mo60921a(String str, String str2, String str3, String str4, String str5, C9536a.C9537a aVar, String str6) {
                                        C9047a.m25866a(C9047a.this, str3, C9047a.this.f21715X);
                                        if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                                            C9047a.this.f21719f = true;
                                            if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                                                Context m = C9047a.this.f21721h;
                                                C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "tpl temp preload failed: " + str6, C9047a.this.f21729p, C9047a.this.f21695B, str4, campaignEx4.getRequestIdNotice());
                                            }
                                            C9063c d = C9047a.this.f21727n;
                                            C9063c.m25959d(d, "errorCode: 3303 errorMessage: tpl temp preload failed: " + str6);
                                        }
                                    }
                                };
                                cVar.mo60945a(r, q, p, i, str, requestIdNotice, str2, str3, cMPTEntryUrl, s, campaignEx, list, b, str4, l, r17, true);
                            }
                        });
                    }
                }

                /* renamed from: a */
                public final void mo60924a(String str, String str2, String str3, String str4, String str5) {
                    C9047a aVar = C9047a.this;
                    C9047a.m25866a(aVar, str2, aVar.f21715X);
                    C9047a.this.f21717d = false;
                    if (C9047a.this.f21727n != null && !C9047a.this.f21719f) {
                        C9047a.this.f21719f = true;
                        if (C9047a.this.f21714W != null && C9047a.this.f21714W.size() > 0) {
                            Context m = C9047a.this.f21721h;
                            C9112a.m26118a((CampaignEx) C9047a.this.f21714W.get(0), m, "" + str5, C9047a.this.f21729p, C9047a.this.f21695B, str3, campaignEx4.getRequestIdNotice());
                        }
                        C9063c.m25959d(C9047a.this.f21727n, "errorCode: 3203 errorMessage: tpl temp resource download failed");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private boolean m25877b(String str) {
        try {
            if (this.f21723j == null || !str.equals(this.f21723j.mo60957a())) {
                C9090d dVar = new C9090d(this.f21721h, this.f21732s, str);
                this.f21723j = dVar;
                dVar.mo60970b(this.f21694A);
                this.f21723j.mo60972c(this.f21695B);
            }
            this.f21723j.mo60959a(this.f21736w);
            this.f21723j.mo60964a(this.f21724k);
        } catch (Exception unused) {
        }
        List<CampaignEx> a = C9538a.m27238a().mo63078a(str, 1, this.f21695B);
        this.f21715X = C9538a.m27238a().mo63089b(str, 1, this.f21695B);
        if (a == null || a.size() <= 0) {
            List<CampaignEx> list = this.f21714W;
            if (list == null) {
                return false;
            }
            list.clear();
            return false;
        }
        List<CampaignEx> list2 = this.f21714W;
        if (list2 == null) {
            this.f21714W = new ArrayList();
        } else {
            list2.clear();
        }
        this.f21714W.addAll(a);
        return true;
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$c */
    /* compiled from: RewardVideoController */
    private final class C9063c {

        /* renamed from: b */
        private WeakReference<InterVideoOutListener> f21787b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public volatile AtomicInteger f21788c;

        /* renamed from: d */
        private Handler f21789d;

        /* renamed from: e */
        private String f21790e;

        /* renamed from: f */
        private boolean f21791f;

        private C9063c(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f21787b = new WeakReference<>(interVideoOutListener);
            this.f21788c = new AtomicInteger(0);
            this.f21789d = handler;
            this.f21790e = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m25953a(String str) {
            if (this.f21789d != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.f21789d.sendMessage(obtain);
            }
        }

        /* renamed from: a */
        public final void mo60929a(boolean z) {
            this.f21791f = z;
        }

        /* renamed from: a */
        static /* synthetic */ void m25952a(C9063c cVar, String str, String str2) {
            Handler handler = cVar.f21789d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f21788c.get() == 1 || cVar.f21788c.get() == 3) && cVar.f21789d != null) {
                    cVar.f21788c.set(2);
                    if (!C9047a.this.f21710S) {
                        boolean unused = C9047a.this.f21710S = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f21789d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m25951a(C9063c cVar, String str) {
            Handler handler = cVar.f21789d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f21788c.get() == 1 || cVar.f21788c.get() == 3) && cVar.f21789d != null) {
                    boolean unused = C9047a.this.f21711T = true;
                    if (!C9047a.this.f21713V || str.contains("resource load timeout")) {
                        boolean unused2 = C9047a.this.f21712U = true;
                    }
                    if (C9047a.this.f21710S) {
                        cVar.f21788c.set(2);
                    }
                    if (C9047a.this.f21711T && C9047a.this.f21712U && !C9047a.this.f21710S) {
                        cVar.f21788c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f21789d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: b */
        static /* synthetic */ void m25956b(C9063c cVar, String str, String str2) {
            Handler handler = cVar.f21789d;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f21788c.get() == 1 || cVar.f21788c.get() == 3) && cVar.f21789d != null) {
                    if (cVar.f21788c.get() == 1) {
                        cVar.f21788c.set(3);
                    }
                    if (!C9047a.this.f21710S) {
                        boolean unused = C9047a.this.f21710S = true;
                        Message obtain = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                        obtain.setData(bundle);
                        obtain.obj = str2;
                        obtain.what = 9;
                        cVar.f21789d.sendMessage(obtain);
                        if (C9047a.this.f21711T) {
                            cVar.f21788c.set(2);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        static /* synthetic */ void m25957c(C9063c cVar, String str) {
            cVar.f21788c.set(2);
            cVar.m25953a(str);
        }

        /* renamed from: c */
        static /* synthetic */ void m25958c(C9063c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null && cVar.f21789d != null && !C9047a.this.f21709R) {
                boolean unused = C9047a.this.f21709R = true;
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                cVar.f21789d.sendMessage(obtain);
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m25959d(C9063c cVar, String str) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f21788c.get() == 1 || cVar.f21788c.get() == 3) && cVar.f21789d != null) {
                    boolean unused = C9047a.this.f21712U = true;
                    if (str.contains("resource load timeout")) {
                        boolean unused2 = C9047a.this.f21711T = true;
                    }
                    if (C9047a.this.f21712U && C9047a.this.f21711T && !C9047a.this.f21710S) {
                        cVar.f21788c.set(2);
                        Message obtain = Message.obtain();
                        obtain.obj = str;
                        obtain.what = 16;
                        cVar.f21789d.sendMessage(obtain);
                    }
                }
            }
        }

        /* renamed from: d */
        static /* synthetic */ void m25960d(C9063c cVar, String str, String str2) {
            WeakReference<InterVideoOutListener> weakReference = cVar.f21787b;
            if (weakReference != null && ((InterVideoOutListener) weakReference.get()) != null) {
                if ((cVar.f21788c.get() == 1 || cVar.f21788c.get() == 3) && cVar.f21789d != null && !C9047a.this.f21709R) {
                    boolean unused = C9047a.this.f21709R = true;
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    cVar.f21789d.sendMessage(obtain);
                }
            }
        }
    }

    /* renamed from: e */
    private void m25887e() {
        try {
            List<C9540b> w = this.f21724k.mo63184w();
            if (w != null && w.size() > 0) {
                for (int i = 0; i < w.size(); i++) {
                    C8554aa.m24732a(this.f21721h, this.f21732s + "_" + w.get(i).mo63095a(), 0);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    private boolean m25891f() {
        int i;
        try {
            List<C9540b> w = this.f21724k.mo63184w();
            if (this.f21725l == null) {
                this.f21725l = C9549b.m27299a().mo63129b();
            }
            Map<String, Integer> h = this.f21725l.mo63120h();
            if (w == null || w.size() <= 0) {
                return true;
            }
            for (int i2 = 0; i2 < w.size(); i2++) {
                C9540b bVar = w.get(i2);
                if (h.containsKey(bVar.mo63095a() + "")) {
                    i = h.get(bVar.mo63095a() + "").intValue();
                } else {
                    i = 0;
                }
                Object b = C8554aa.m24733b(this.f21721h, this.f21732s + "_" + bVar.mo63095a(), 0);
                if ((b != null ? ((Integer) b).intValue() : 0) < i) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            C8608u.m24884d("RewardVideoController", e.getMessage());
            return true;
        }
    }

    /* renamed from: a */
    private void m25871a(Queue<Integer> queue, boolean z, String str) {
        int i = 8;
        if (queue != null) {
            try {
                if (queue.size() > 0) {
                    i = queue.poll().intValue();
                }
            } catch (Exception e) {
                List<CampaignEx> list = this.f21714W;
                if (list != null && list.size() > 0) {
                    C9112a.m26121b(this.f21714W.get(0), this.f21721h, "can't show because unknow error", this.f21729p, this.f21695B, "", "");
                }
                m25881c("can't show because unknow error");
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        try {
            m25864a(1, i, z, str);
        } catch (Exception e2) {
            if (this.f21714W != null) {
                if (this.f21714W.size() > 0) {
                    Context context = this.f21721h;
                    C9112a.m26121b(this.f21714W.get(0), context, "load mv api error:" + e2.getMessage(), this.f21729p, this.f21695B, "", "");
                }
            }
            m25881c("load mv api error:" + e2.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25881c(String str) {
        if (this.f21727n != null) {
            this.f21712U = true;
            C9063c.m25951a(this.f21727n, str);
        }
    }

    /* renamed from: a */
    private void m25864a(int i, int i2, boolean z, String str) {
        try {
            if (this.f21723j == null || !this.f21729p.equals(this.f21723j.mo60957a())) {
                C9090d dVar = new C9090d(this.f21721h, this.f21732s, this.f21729p);
                this.f21723j = dVar;
                dVar.mo60970b(this.f21694A);
                this.f21723j.mo60972c(this.f21695B);
            }
            if (this.f21694A) {
                this.f21723j.mo60960a(this.f21737x, this.f21738y, this.f21739z);
            }
            this.f21723j.mo60959a(this.f21736w);
            this.f21723j.mo60964a(this.f21724k);
            C9061a aVar = new C9061a(this.f21723j, i, z);
            C9062b bVar = new C9062b(this.f21723j, z);
            bVar.mo60928a((Runnable) aVar);
            this.f21723j.mo60941a((C9069b) bVar);
            this.f21735v.postDelayed(aVar, (long) (i2 * 1000));
            this.f21723j.mo60962a(i, i2, z, str, this.f21699F);
        } catch (Exception e) {
            List<CampaignEx> list = this.f21714W;
            if (list != null && list.size() > 0) {
                C9112a.m26121b(this.f21714W.get(0), this.f21721h, e.getMessage(), this.f21729p, this.f21695B, "", "");
            }
            m25881c(e.getMessage());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r7 = r13.f21725l.mo63120h();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25885d(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "_"
            java.lang.String r2 = "RewardVideoController"
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 0
            com.mbridge.msdk.videocommon.d.a r7 = r13.f21725l     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0027
            com.mbridge.msdk.videocommon.d.a r7 = r13.f21725l     // Catch:{ Exception -> 0x015e }
            java.util.Map r7 = r7.mo63120h()     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0027
            boolean r8 = r7.containsKey(r0)     // Catch:{ Exception -> 0x015e }
            if (r8 == 0) goto L_0x0027
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x015e }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x015e }
            goto L_0x0028
        L_0x0027:
            r0 = r6
        L_0x0028:
            android.content.Context r7 = r13.f21721h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r8.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r13.f21732s     // Catch:{ Exception -> 0x015e }
            r8.append(r9)     // Catch:{ Exception -> 0x015e }
            r8.append(r1)     // Catch:{ Exception -> 0x015e }
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C8554aa.m24733b(r7, r8, r9)     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x006e
            android.content.Context r7 = r13.f21721h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r8.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r9 = r13.f21732s     // Catch:{ Exception -> 0x015e }
            r8.append(r9)     // Catch:{ Exception -> 0x015e }
            r8.append(r1)     // Catch:{ Exception -> 0x015e }
            r8.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            java.lang.Object r7 = com.mbridge.msdk.foundation.tools.C8554aa.m24733b(r7, r8, r9)     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x015e }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x015e }
            r13.f21722i = r7     // Catch:{ Exception -> 0x015e }
        L_0x006e:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            if (r7 != 0) goto L_0x0075
            r13.m25897i()     // Catch:{ Exception -> 0x015e }
        L_0x0075:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x00f5
            java.lang.String r7 = "controller 819"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r7)     // Catch:{ Exception -> 0x015e }
            boolean r7 = r13.f21695B     // Catch:{ Exception -> 0x015e }
            if (r7 == 0) goto L_0x0087
            boolean r7 = r13.m25894g()     // Catch:{ Exception -> 0x015e }
            goto L_0x008d
        L_0x0087:
            com.mbridge.msdk.reward.adapter.d r7 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            boolean r7 = r7.mo60971b()     // Catch:{ Exception -> 0x015e }
        L_0x008d:
            if (r7 == 0) goto L_0x00be
            int r1 = r13.f21722i     // Catch:{ Exception -> 0x015e }
            if (r1 < r0) goto L_0x0098
            if (r0 <= 0) goto L_0x0098
            r13.f21703J = r6     // Catch:{ Exception -> 0x015e }
            return
        L_0x0098:
            java.lang.String r0 = "invoke adapter show isReady"
            com.mbridge.msdk.foundation.tools.C8608u.m24882b(r2, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015e }
            android.os.Handler r11 = r13.f21735v     // Catch:{ Exception -> 0x015e }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015e }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f21693b     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = r13.f21729p     // Catch:{ Exception -> 0x015e }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.f21728o     // Catch:{ Exception -> 0x015e }
            int r11 = r13.f21736w     // Catch:{ Exception -> 0x015e }
            java.lang.String r12 = r13.f21731r     // Catch:{ Exception -> 0x015e }
            r8 = r0
            r9 = r14
            r7.mo60963a((com.mbridge.msdk.video.p346bt.module.p349b.C9246h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015e }
            return
        L_0x00be:
            boolean r0 = r13.f21695B     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r13.m25896h()     // Catch:{ Exception -> 0x015e }
            goto L_0x00cd
        L_0x00c7:
            com.mbridge.msdk.reward.adapter.d r0 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            boolean r0 = r0.mo60973c()     // Catch:{ Exception -> 0x015e }
        L_0x00cd:
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "invoke adapter show isSpareOfferReady"
            com.mbridge.msdk.foundation.tools.C8608u.m24882b(r2, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.a.a$d r0 = new com.mbridge.msdk.reward.a.a$d     // Catch:{ Exception -> 0x015e }
            android.os.Handler r11 = r13.f21735v     // Catch:{ Exception -> 0x015e }
            r12 = 0
            r10 = 1
            r7 = r0
            r8 = r13
            r9 = r13
            r7.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x015e }
            java.util.Map<java.lang.String, com.mbridge.msdk.reward.a.a$d> r1 = f21693b     // Catch:{ Exception -> 0x015e }
            java.lang.String r7 = r13.f21729p     // Catch:{ Exception -> 0x015e }
            r1.put(r7, r0)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.reward.adapter.d r7 = r13.f21723j     // Catch:{ Exception -> 0x015e }
            java.lang.String r10 = r13.f21728o     // Catch:{ Exception -> 0x015e }
            int r11 = r13.f21736w     // Catch:{ Exception -> 0x015e }
            java.lang.String r12 = r13.f21731r     // Catch:{ Exception -> 0x015e }
            r8 = r0
            r9 = r14
            r7.mo60963a((com.mbridge.msdk.video.p346bt.module.p349b.C9246h) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11, (java.lang.String) r12)     // Catch:{ Exception -> 0x015e }
            return
        L_0x00f5:
            int r0 = r13.f21722i     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x011a
            android.content.Context r0 = r13.f21721h     // Catch:{ Exception -> 0x015e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
            r7.<init>()     // Catch:{ Exception -> 0x015e }
            java.lang.String r8 = r13.f21732s     // Catch:{ Exception -> 0x015e }
            r7.append(r8)     // Catch:{ Exception -> 0x015e }
            r7.append(r1)     // Catch:{ Exception -> 0x015e }
            r7.append(r5)     // Catch:{ Exception -> 0x015e }
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x015e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.foundation.tools.C8554aa.m24732a(r0, r1, r7)     // Catch:{ Exception -> 0x015e }
            r13.m25885d((java.lang.String) r14)     // Catch:{ Exception -> 0x015e }
            return
        L_0x011a:
            r13.f21703J = r6     // Catch:{ Exception -> 0x015e }
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f21726m     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x0132
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r14 = r13.f21726m     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.out.MBridgeIds r0 = r13.f21730q     // Catch:{ Exception -> 0x012a }
            java.lang.String r1 = "can't show because load is failed"
            r14.onShowFail(r0, r1)     // Catch:{ Exception -> 0x012a }
            goto L_0x0132
        L_0x012a:
            r14 = move-exception
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x015e }
            if (r0 == 0) goto L_0x0132
            r14.printStackTrace()     // Catch:{ Exception -> 0x015e }
        L_0x0132:
            boolean r14 = r13.f21694A     // Catch:{ Exception -> 0x015e }
            if (r14 != 0) goto L_0x01aa
            boolean r14 = r13.f21695B     // Catch:{ Exception -> 0x015e }
            if (r14 != 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f21724k     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f21724k     // Catch:{ Exception -> 0x015e }
            boolean r14 = r14.mo63177s(r4)     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x015e }
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x015e }
            int r14 = r14.f21788c.get()     // Catch:{ Exception -> 0x015e }
            if (r14 == r5) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n     // Catch:{ Exception -> 0x015e }
            int r14 = r14.f21788c.get()     // Catch:{ Exception -> 0x015e }
            if (r14 == r3) goto L_0x01aa
            r13.mo60911d((boolean) r6)     // Catch:{ Exception -> 0x015e }
            goto L_0x01aa
        L_0x015e:
            r14 = move-exception
            r13.f21703J = r6
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x016c
            java.lang.String r0 = r14.getLocalizedMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r2, r0)
        L_0x016c:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f21726m
            if (r0 == 0) goto L_0x0181
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r0 = r13.f21726m     // Catch:{ Exception -> 0x017a }
            com.mbridge.msdk.out.MBridgeIds r1 = r13.f21730q     // Catch:{ Exception -> 0x017a }
            java.lang.String r2 = "show exception"
            r0.onShowFail(r1, r2)     // Catch:{ Exception -> 0x017a }
            goto L_0x0181
        L_0x017a:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r0 == 0) goto L_0x0181
            r14.printStackTrace()
        L_0x0181:
            boolean r14 = r13.f21694A
            if (r14 != 0) goto L_0x01aa
            boolean r14 = r13.f21695B
            if (r14 != 0) goto L_0x01aa
            com.mbridge.msdk.videocommon.d.c r14 = r13.f21724k
            if (r14 == 0) goto L_0x01aa
            boolean r14 = r14.mo63177s(r4)
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n
            if (r14 == 0) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n
            int r14 = r14.f21788c.get()
            if (r14 == r5) goto L_0x01aa
            com.mbridge.msdk.reward.a.a$c r14 = r13.f21727n
            int r14 = r14.f21788c.get()
            if (r14 == r3) goto L_0x01aa
            r13.mo60911d((boolean) r6)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p341a.C9047a.m25885d(java.lang.String):void");
    }

    /* renamed from: e */
    public final boolean mo60912e(boolean z) {
        try {
            if (m25900j()) {
                return false;
            }
            if (this.f21695B) {
                try {
                    return m25894g();
                } catch (Exception unused) {
                    return false;
                }
            } else {
                if (this.f21723j == null) {
                    m25897i();
                }
                if (this.f21723j == null) {
                    return false;
                }
                boolean b = this.f21723j.mo60971b();
                return !b ? this.f21723j.mo60973c() : b;
            }
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: g */
    private boolean m25894g() {
        if (this.f21723j == null) {
            m25897i();
        }
        List<C8401b> a = C9538a.m27238a().mo63076a(this.f21729p);
        boolean z = false;
        if (a == null || a.size() <= 0) {
            return false;
        }
        String c = C8417d.m24315c(this.f21729p);
        if (!TextUtils.isEmpty(c)) {
            z = m25878b(a, c);
        }
        if (z) {
            return z;
        }
        for (C8401b next : a) {
            if (next != null) {
                this.f21723j.mo60965a(next.mo57298b());
                if (this.f21723j.mo60971b()) {
                    return true;
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m25878b(List<C8401b> list, String str) {
        if (list == null) {
            return false;
        }
        for (C8401b next : list) {
            if (next != null && str.equals(next.mo57293a())) {
                this.f21723j.mo60965a(next.mo57298b());
                if (this.f21723j.mo60971b()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    private boolean m25896h() {
        if (this.f21723j == null) {
            m25897i();
        }
        List<C8401b> a = C9538a.m27238a().mo63076a(this.f21729p);
        if (a == null || a.size() <= 0) {
            return false;
        }
        for (C8401b next : a) {
            if (next != null) {
                this.f21723j.mo60965a(next.mo57298b());
                if (this.f21723j.mo60973c()) {
                    return true;
                }
                C9538a.m27238a().mo63092b(this.f21729p, next.mo57298b());
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m25897i() {
        C9090d dVar = new C9090d(this.f21721h, this.f21732s, this.f21729p);
        this.f21723j = dVar;
        dVar.mo60970b(this.f21694A);
        this.f21723j.mo60972c(this.f21695B);
        if (this.f21694A) {
            this.f21723j.mo60960a(this.f21737x, this.f21738y, this.f21739z);
        }
        this.f21723j.mo60964a(this.f21724k);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:148|149|193) */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0104, code lost:
        if (r6.f21727n == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x010c, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 1) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0114, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 3) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0116, code lost:
        mo60906a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x011b, code lost:
        r6.f21703J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x011d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0122, code lost:
        if (m25900j() == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0126, code lost:
        if (r6.f21726m == null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r6.f21726m.onShowFail(r6.f21730q, "Play more than limit");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0132, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0135, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0137, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x013c, code lost:
        if (r6.f21694A != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0140, code lost:
        if (r6.f21695B != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0144, code lost:
        if (r6.f21724k == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x014c, code lost:
        if (r6.f21724k.mo63177s(4) == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0150, code lost:
        if (r6.f21727n == null) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0158, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 1) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0160, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 3) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0162, code lost:
        mo60906a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0167, code lost:
        r6.f21703J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0170, code lost:
        if (android.text.TextUtils.isEmpty(r6.f21728o) == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0172, code lost:
        r6.f21728o = com.mbridge.msdk.foundation.tools.C8596q.m24839i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r8 = new java.text.SimpleDateFormat("dd").format(new java.util.Date());
        r9 = (java.lang.String) com.mbridge.msdk.foundation.tools.C8554aa.m24733b(r6.f21721h, "reward_date", "0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0198, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x019e, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x01a4, code lost:
        if (r9.equals(r8) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x01a6, code lost:
        com.mbridge.msdk.foundation.tools.C8554aa.m24732a(r6.f21721h, "reward_date", r8);
        r8 = r6.f21721h;
        com.mbridge.msdk.foundation.tools.C8554aa.m24732a(r8, r6.f21732s + "_" + 1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        m25885d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002e, code lost:
        if (r6.f21727n == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25954b(r6.f21727n).get() != 1) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        if (r6.f21726m == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.f21726m.onShowFail(r6.f21730q, "campaing is loading");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        if (r6.f21694A != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0058, code lost:
        if (r6.f21695B != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005c, code lost:
        if (r6.f21724k == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        if (r6.f21724k.mo63177s(4) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0068, code lost:
        if (r6.f21727n == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 1) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0078, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 3) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007a, code lost:
        mo60906a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
        r6.f21703J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0084, code lost:
        if (r6.f21721h != null) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0088, code lost:
        if (r6.f21726m == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r6.f21726m.onShowFail(r6.f21730q, "context is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0094, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0097, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0099, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x009e, code lost:
        if (r6.f21694A != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a2, code lost:
        if (r6.f21695B != false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00a6, code lost:
        if (r6.f21724k == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if (r6.f21724k.mo63177s(4) == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00b2, code lost:
        if (r6.f21727n == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ba, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00c2, code lost:
        if (com.mbridge.msdk.reward.p341a.C9047a.C9063c.m25949a(r6.f21727n) == 3) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c4, code lost:
        mo60906a(false, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c9, code lost:
        r6.f21703J = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00ce, code lost:
        if (r6.f21694A == false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00d6, code lost:
        if (com.mbridge.msdk.foundation.tools.C8613y.m24939c(r6.f21721h) != false) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00da, code lost:
        if (r6.f21726m == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.f21726m.onShowFail(r6.f21730q, "network exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00e9, code lost:
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00eb, code lost:
        r7.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00f0, code lost:
        if (r6.f21694A != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00f4, code lost:
        if (r6.f21695B != false) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00f8, code lost:
        if (r6.f21724k == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0100, code lost:
        if (r6.f21724k.mo63177s(4) == false) goto L_0x011b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:148:0x01cc */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60903a(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 3
            r1 = 4
            r2 = 1
            r3 = 0
            r6.f21733t = r7     // Catch:{ Exception -> 0x01d3 }
            r6.f21728o = r8     // Catch:{ Exception -> 0x01d3 }
            r6.f21731r = r9     // Catch:{ Exception -> 0x01d3 }
            java.lang.Object r8 = r6.f21702I     // Catch:{ Exception -> 0x01d3 }
            monitor-enter(r8)     // Catch:{ Exception -> 0x01d3 }
            boolean r9 = r6.f21703J     // Catch:{ all -> 0x01d0 }
            if (r9 == 0) goto L_0x0029
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ all -> 0x01d0 }
            if (r7 == 0) goto L_0x0027
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x001f }
            com.mbridge.msdk.out.MBridgeIds r9 = r6.f21730q     // Catch:{ Exception -> 0x001f }
            java.lang.String r4 = "campaing is show progressing "
            r7.onShowFail(r9, r4)     // Catch:{ Exception -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r7 = move-exception
            boolean r9 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ all -> 0x01d0 }
            if (r9 == 0) goto L_0x0027
            r7.printStackTrace()     // Catch:{ all -> 0x01d0 }
        L_0x0027:
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            return
        L_0x0029:
            r6.f21703J = r2     // Catch:{ all -> 0x01d0 }
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            com.mbridge.msdk.reward.a.a$c r8 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0082
            com.mbridge.msdk.reward.a.a$c r8 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            java.util.concurrent.atomic.AtomicInteger r8 = r8.f21788c     // Catch:{ Exception -> 0x01d3 }
            int r8 = r8.get()     // Catch:{ Exception -> 0x01d3 }
            if (r8 != r2) goto L_0x0082
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0052
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x004a }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f21730q     // Catch:{ Exception -> 0x004a }
            java.lang.String r9 = "campaing is loading"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x004a }
            goto L_0x0052
        L_0x004a:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0052
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x0052:
            boolean r7 = r6.f21694A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x007f
            boolean r7 = r6.f21695B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x007f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63177s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x007f
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x007f
            java.lang.String r7 = ""
            r6.mo60906a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x007f:
            r6.f21703J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x0082:
            android.content.Context r8 = r6.f21721h     // Catch:{ Exception -> 0x01d3 }
            if (r8 != 0) goto L_0x00cc
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x009c
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x0094 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f21730q     // Catch:{ Exception -> 0x0094 }
            java.lang.String r9 = "context is null"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x0094 }
            goto L_0x009c
        L_0x0094:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x009c
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x009c:
            boolean r7 = r6.f21694A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x00c9
            boolean r7 = r6.f21695B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x00c9
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63177s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x00c9
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x00c9
            java.lang.String r7 = ""
            r6.mo60906a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x00c9:
            r6.f21703J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x00cc:
            boolean r8 = r6.f21694A     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x011e
            android.content.Context r8 = r6.f21721h     // Catch:{ Exception -> 0x01d3 }
            boolean r8 = com.mbridge.msdk.foundation.tools.C8613y.m24939c((android.content.Context) r8)     // Catch:{ Exception -> 0x01d3 }
            if (r8 != 0) goto L_0x011e
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x00ee
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x00e6 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f21730q     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r9 = "network exception"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00ee
        L_0x00e6:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x00ee
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x00ee:
            boolean r7 = r6.f21694A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x011b
            boolean r7 = r6.f21695B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x011b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63177s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x011b
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x011b
            java.lang.String r7 = ""
            r6.mo60906a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x011b:
            r6.f21703J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x011e:
            boolean r8 = r6.m25900j()     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x016a
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x013a
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r7 = r6.f21726m     // Catch:{ Exception -> 0x0132 }
            com.mbridge.msdk.out.MBridgeIds r8 = r6.f21730q     // Catch:{ Exception -> 0x0132 }
            java.lang.String r9 = "Play more than limit"
            r7.onShowFail(r8, r9)     // Catch:{ Exception -> 0x0132 }
            goto L_0x013a
        L_0x0132:
            r7 = move-exception
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x013a
            r7.printStackTrace()     // Catch:{ Exception -> 0x01d3 }
        L_0x013a:
            boolean r7 = r6.f21694A     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x0167
            boolean r7 = r6.f21695B     // Catch:{ Exception -> 0x01d3 }
            if (r7 != 0) goto L_0x0167
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k     // Catch:{ Exception -> 0x01d3 }
            boolean r7 = r7.mo63177s(r1)     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            if (r7 == 0) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r2) goto L_0x0167
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n     // Catch:{ Exception -> 0x01d3 }
            int r7 = r7.f21788c.get()     // Catch:{ Exception -> 0x01d3 }
            if (r7 == r0) goto L_0x0167
            java.lang.String r7 = ""
            r6.mo60906a((boolean) r3, (java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
        L_0x0167:
            r6.f21703J = r3     // Catch:{ Exception -> 0x01d3 }
            return
        L_0x016a:
            java.lang.String r8 = r6.f21728o     // Catch:{ Exception -> 0x01d3 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x01d3 }
            if (r8 == 0) goto L_0x0178
            java.lang.String r8 = com.mbridge.msdk.foundation.tools.C8596q.m24839i()     // Catch:{ Exception -> 0x01d3 }
            r6.f21728o = r8     // Catch:{ Exception -> 0x01d3 }
        L_0x0178:
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = "dd"
            r8.<init>(r9)     // Catch:{ Exception -> 0x01cc }
            java.util.Date r9 = new java.util.Date     // Catch:{ Exception -> 0x01cc }
            r9.<init>()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r8 = r8.format(r9)     // Catch:{ Exception -> 0x01cc }
            android.content.Context r9 = r6.f21721h     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "reward_date"
            java.lang.String r5 = "0"
            java.lang.Object r9 = com.mbridge.msdk.foundation.tools.C8554aa.m24733b(r9, r4, r5)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x01cc }
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x01cc }
            if (r4 != 0) goto L_0x01cc
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x01cc }
            if (r4 != 0) goto L_0x01cc
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x01cc }
            if (r9 != 0) goto L_0x01cc
            android.content.Context r9 = r6.f21721h     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "reward_date"
            com.mbridge.msdk.foundation.tools.C8554aa.m24732a(r9, r4, r8)     // Catch:{ Exception -> 0x01cc }
            android.content.Context r8 = r6.f21721h     // Catch:{ Exception -> 0x01cc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01cc }
            r9.<init>()     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = r6.f21732s     // Catch:{ Exception -> 0x01cc }
            r9.append(r4)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r4 = "_"
            r9.append(r4)     // Catch:{ Exception -> 0x01cc }
            r9.append(r2)     // Catch:{ Exception -> 0x01cc }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x01cc }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x01cc }
            com.mbridge.msdk.foundation.tools.C8554aa.m24732a(r8, r9, r4)     // Catch:{ Exception -> 0x01cc }
        L_0x01cc:
            r6.m25885d((java.lang.String) r7)     // Catch:{ Exception -> 0x01d3 }
            goto L_0x0221
        L_0x01d0:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x01d0 }
            throw r7     // Catch:{ Exception -> 0x01d3 }
        L_0x01d3:
            r7 = move-exception
            r6.f21703J = r3
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01e3
            java.lang.String r8 = "RewardVideoController"
            java.lang.String r9 = r7.getLocalizedMessage()
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r8, r9)
        L_0x01e3:
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f21726m
            if (r8 == 0) goto L_0x01f8
            com.mbridge.msdk.videocommon.listener.InterVideoOutListener r8 = r6.f21726m     // Catch:{ Exception -> 0x01f1 }
            com.mbridge.msdk.out.MBridgeIds r9 = r6.f21730q     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r4 = "show exception"
            r8.onShowFail(r9, r4)     // Catch:{ Exception -> 0x01f1 }
            goto L_0x01f8
        L_0x01f1:
            boolean r8 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r8 == 0) goto L_0x01f8
            r7.printStackTrace()
        L_0x01f8:
            boolean r7 = r6.f21694A
            if (r7 != 0) goto L_0x0221
            boolean r7 = r6.f21695B
            if (r7 != 0) goto L_0x0221
            com.mbridge.msdk.videocommon.d.c r7 = r6.f21724k
            if (r7 == 0) goto L_0x0221
            boolean r7 = r7.mo63177s(r1)
            if (r7 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n
            if (r7 == 0) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n
            int r7 = r7.f21788c.get()
            if (r7 == r2) goto L_0x0221
            com.mbridge.msdk.reward.a.a$c r7 = r6.f21727n
            int r7 = r7.f21788c.get()
            if (r7 == r0) goto L_0x0221
            r6.mo60911d((boolean) r3)
        L_0x0221:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.p341a.C9047a.mo60903a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    private boolean m25900j() {
        try {
            if (this.f21706O == null) {
                this.f21706O = C2376g.m5723a(C2350a.m5601e().mo15792g());
            }
            C2377h a = C2377h.m5731a((C2374f) this.f21706O);
            if (this.f21724k == null) {
                this.f21724k = C9549b.m27299a().mo63124a(C2350a.m5601e().mo15793h(), this.f21729p, this.f21694A);
            }
            int d = this.f21724k.mo63146d();
            if (a == null || !a.mo15903a(this.f21729p, d)) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            C8608u.m24884d("RewardVideoController", "cap check error");
            return false;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$a */
    /* compiled from: RewardVideoController */
    public class C9061a implements Runnable {

        /* renamed from: b */
        private C9068a f21779b;

        /* renamed from: c */
        private int f21780c;

        /* renamed from: d */
        private boolean f21781d;

        public C9061a(C9068a aVar, int i, boolean z) {
            this.f21779b = aVar;
            this.f21780c = i;
            this.f21781d = z;
        }

        public final void run() {
            C8608u.m24884d("RewardVideoController", "adSource=" + this.f21780c + " CommonCancelTimeTask mIsDevCall：" + this.f21781d);
            C9112a.m26121b((CampaignEx) null, C9047a.this.f21721h, "v3 is timeout", C9047a.this.f21729p, C9047a.this.f21695B, "", "");
            C9047a.this.m25881c("v3 is timeout");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.a.a$b */
    /* compiled from: RewardVideoController */
    public class C9062b implements C9069b {

        /* renamed from: b */
        private C9068a f21783b;

        /* renamed from: c */
        private boolean f21784c;

        /* renamed from: d */
        private Runnable f21785d;

        public C9062b(C9068a aVar, boolean z) {
            this.f21783b = aVar;
            this.f21784c = z;
        }

        /* renamed from: a */
        public final void mo60928a(Runnable runnable) {
            this.f21785d = runnable;
        }

        /* renamed from: b */
        public final void mo15716b(String str) {
            if (this.f21785d != null) {
                C9047a.this.f21735v.removeCallbacks(this.f21785d);
            }
            if (C9047a.this.f21727n != null) {
                C9063c.m25960d(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
            }
        }

        /* renamed from: a */
        public final void mo15714a() {
            if (this.f21785d != null) {
                C9047a.this.f21735v.removeCallbacks(this.f21785d);
            }
            if (C9047a.this.f21727n != null) {
                C9063c.m25952a(C9047a.this.f21727n, C9047a.this.f21732s, C9047a.this.f21729p);
            }
        }

        /* renamed from: a */
        public final void mo15715a(String str) {
            if (this.f21785d != null) {
                C9047a.this.f21735v.removeCallbacks(this.f21785d);
            }
            C9068a aVar = this.f21783b;
            if (aVar != null) {
                aVar.mo60941a((C9069b) null);
                this.f21783b = null;
            }
            if (C9047a.this.f21727n != null) {
                C9063c.m25951a(C9047a.this.f21727n, str);
            }
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m25899j(C9047a aVar) {
        String str;
        if (aVar.f21730q != null) {
            if (aVar.f21701H) {
                String a = aVar.mo60899a();
                if (!TextUtils.isEmpty(a)) {
                    ConcurrentHashMap<String, String> concurrentHashMap = f21691L;
                    if (concurrentHashMap != null && concurrentHashMap.containsKey(a) && !TextUtils.isEmpty(f21691L.get(a))) {
                        str = f21691L.get(a);
                        aVar.f21730q.setBidToken(str);
                    }
                } else {
                    return;
                }
            }
            str = "";
            aVar.f21730q.setBidToken(str);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25866a(C9047a aVar, String str, List list) {
        if (list != null && list.size() > 0 && !aVar.f21710S) {
            C2372e.m5679a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15875a((List<CampaignEx>) list, str);
        }
    }
}
