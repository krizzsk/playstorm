package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.room.RoomMasterTable;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C2295a;
import com.mbridge.msdk.click.C2309b;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8404e;
import com.mbridge.msdk.foundation.entity.C8405f;
import com.mbridge.msdk.foundation.entity.C8409j;
import com.mbridge.msdk.foundation.entity.C8412m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2378i;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.p066db.C2385p;
import com.mbridge.msdk.foundation.same.C8413a;
import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.same.p301c.C8425b;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.same.p303e.C8437b;
import com.mbridge.msdk.foundation.same.p303e.C8439c;
import com.mbridge.msdk.foundation.same.report.C8524c;
import com.mbridge.msdk.foundation.same.report.C8526d;
import com.mbridge.msdk.foundation.tools.C8595p;
import com.mbridge.msdk.foundation.tools.C8596q;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8613y;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.mbnative.controller.C8757a;
import com.mbridge.msdk.mbnative.p331a.C8735b;
import com.mbridge.msdk.mbnative.p331a.C8736c;
import com.mbridge.msdk.mbnative.p332b.C8737a;
import com.mbridge.msdk.mbnative.p333c.C8738a;
import com.mbridge.msdk.mbnative.p334d.C8772a;
import com.mbridge.msdk.mbnative.p334d.C8775b;
import com.mbridge.msdk.mbnative.p335e.p336a.C8779a;
import com.mbridge.msdk.mbnative.p335e.p336a.C8780b;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.C8815a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnImageLoadListener;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2290c;
import com.mbridge.msdk.p054c.C2294d;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.mbridge.msdk.videocommon.download.C9581k;
import com.mbridge.msdk.widget.C9587a;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class NativeController {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static boolean f21186A;

    /* renamed from: c */
    public static Map<String, Long> f21187c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final String f21188e = NativeController.class.getSimpleName();

    /* renamed from: B */
    private int f21189B = 0;

    /* renamed from: C */
    private int f21190C = 0;

    /* renamed from: D */
    private int f21191D = 0;

    /* renamed from: E */
    private int f21192E = 0;

    /* renamed from: F */
    private C8437b f21193F;

    /* renamed from: G */
    private List<C8757a> f21194G;

    /* renamed from: H */
    private List<C8757a.C8761a> f21195H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public CopyOnWriteArrayList<C8434a> f21196I = new CopyOnWriteArrayList<>();

    /* renamed from: J */
    private Hashtable<String, AdSession> f21197J = new Hashtable<>();

    /* renamed from: K */
    private int f21198K = 1;

    /* renamed from: L */
    private int f21199L = 2;

    /* renamed from: M */
    private C8750a f21200M;

    /* renamed from: N */
    private boolean f21201N;

    /* renamed from: O */
    private boolean f21202O;

    /* renamed from: P */
    private Timer f21203P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public String f21204Q = "";
    /* access modifiers changed from: private */

    /* renamed from: R */
    public String f21205R = "";

    /* renamed from: S */
    private C2294d f21206S;

    /* renamed from: T */
    private long f21207T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f21208U;

    /* renamed from: V */
    private int f21209V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f21210W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public int f21211X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f21212Y;

    /* renamed from: Z */
    private boolean f21213Z;

    /* renamed from: a */
    protected List<Integer> f21214a;

    /* renamed from: b */
    protected List<Integer> f21215b;

    /* renamed from: d */
    Map<String, Object> f21216d;

    /* renamed from: f */
    private C2290c f21217f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8738a f21218g;

    /* renamed from: h */
    private NativeListener.NativeTrackingListener f21219h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Context f21220i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f21221j;

    /* renamed from: k */
    private String f21222k;

    /* renamed from: l */
    private Queue<Integer> f21223l;

    /* renamed from: m */
    private Queue<Long> f21224m;

    /* renamed from: n */
    private String f21225n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C8754e f21226o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C8526d f21227p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f21228q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C2295a f21229r;

    /* renamed from: s */
    private int f21230s = 1;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f21231t = 1;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f21232u = -1;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f21233v = 0;

    /* renamed from: w */
    private String f21234w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f21235x = false;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f21236y = false;

    /* renamed from: z */
    private boolean f21237z = false;

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$b */
    public interface C8751b {
        /* renamed from: a */
        void mo58127a();
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$e */
    private static class C8754e extends Handler {

        /* renamed from: a */
        private WeakReference<NativeController> f21282a;

        public C8754e(NativeController nativeController) {
            this.f21282a = new WeakReference<>(nativeController);
        }

        public final void handleMessage(Message message) {
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (!(message.what != 0 || this.f21282a == null || (nativeController = (NativeController) this.f21282a.get()) == null)) {
                    nativeController.f21227p.mo57690a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    NativeController nativeController2 = null;
                    if (!(this.f21282a == null || this.f21282a.get() == null)) {
                        nativeController2 = (NativeController) this.f21282a.get();
                    }
                    if (nativeController2 != null) {
                        boolean unused = nativeController2.f21236y = true;
                        List<Campaign> b = nativeController2.mo58119b(nativeController2.f21221j, nativeController2.f21231t, nativeController2.f21204Q);
                        if (!nativeController2.f21235x) {
                            boolean unused2 = nativeController2.m25380a(b);
                        }
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
        }
    }

    public NativeController(C8738a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        List list;
        C8735b<String, List<Campaign>> a;
        this.f21220i = context;
        this.f21216d = map;
        this.f21217f = new C2290c();
        this.f21218g = aVar;
        this.f21219h = nativeTrackingListener;
        this.f21194G = new ArrayList();
        this.f21195H = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f21221j = str;
        if (!TextUtils.isEmpty(str)) {
            if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
                this.f21222k = "";
            } else {
                this.f21222k = (String) map.get(MBridgeConstans.PLACEMENT_ID);
            }
            if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                f21186A = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
            }
            this.f21223l = new LinkedList();
            this.f21224m = new LinkedList();
            this.f21193F = new C8437b(this.f21220i);
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            this.f21226o = new C8754e(this);
            if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                this.f21234w = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
            }
            try {
                if (!(C8762b.m25461b().containsKey(this.f21221j) ? C8762b.m25461b().get(this.f21221j).booleanValue() : false)) {
                    if (map.containsKey("ad_num")) {
                        int intValue = ((Integer) map.get("ad_num")).intValue();
                        intValue = intValue < 1 ? 1 : intValue;
                        intValue = intValue > 10 ? 10 : intValue;
                        this.f21231t = intValue;
                        this.f21230s = intValue;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                        this.f21191D = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                    }
                } else if (C8762b.m25465d().containsKey(this.f21221j)) {
                    this.f21231t = C8762b.m25465d().get(this.f21221j).intValue();
                    if (map.containsKey("ad_num")) {
                        int intValue2 = ((Integer) map.get("ad_num")).intValue();
                        this.f21189B = intValue2;
                        this.f21230s = intValue2;
                    }
                    if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                        int intValue3 = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                        this.f21190C = intValue3;
                        this.f21191D = intValue3;
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d(f21188e, C8737a.m25353a(e));
            }
            this.f21227p = new C8526d(this.f21220i);
            this.f21229r = new C2295a(this.f21220i, this.f21221j);
            try {
                Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                Class.forName("com.mbridge.msdk.videocommon.download.c");
                this.f21202O = true;
                if (this.f21216d != null && (this.f21216d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f21216d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                    this.f21201N = true;
                }
                C8769c.m25500a(this.f21220i, this.f21221j);
                C8602s.m24870b();
                if (!TextUtils.isEmpty(this.f21221j)) {
                    C2372e.m5679a((C2374f) C2376g.m5723a(this.f21220i)).mo15862a();
                    int a2 = m25359a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
                    String str2 = this.f21221j;
                    a2 = a2 <= 0 ? this.f21230s : a2;
                    C2294d e2 = C2283b.m5275a().mo15569e("", str2);
                    this.f21206S = e2;
                    if (e2 == null) {
                        this.f21206S = C2294d.m5325d(str2);
                    }
                    List<Integer> q = this.f21206S.mo15603q();
                    this.f21214a = q;
                    if (q == null || q.size() <= 0 || !this.f21214a.contains(1) || (a = C8736c.m25352a(1)) == null) {
                        list = null;
                    } else {
                        list = a.mo58107b(str2, a2);
                    }
                    if (list != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < list.size(); i++) {
                            CampaignEx campaignEx = (CampaignEx) list.get(i);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Class<?> cls = Class.forName("com.mbridge.msdk.videocommon.download.c");
                            Class<?> cls2 = Class.forName("com.mbridge.msdk.videocommon.listener.a");
                            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
                            cls.getMethod("createUnitCache", new Class[]{Context.class, String.class, List.class, Integer.TYPE, cls2}).invoke(invoke, new Object[]{context, this.f21221j, arrayList, 1, null});
                            cls.getMethod("load", new Class[]{String.class}).invoke(invoke, new Object[]{this.f21221j});
                        }
                    }
                }
            } catch (Throwable unused) {
                C8608u.m24884d(f21188e, "please import the nativex aar");
            }
        }
    }

    public NativeController() {
    }

    /* renamed from: a */
    private int m25359a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e) {
            C8608u.m24884d(f21188e, C8737a.m25353a(e));
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo58114a(int i, String str) {
        String str2;
        boolean z;
        this.f21235x = false;
        this.f21236y = false;
        this.f21237z = false;
        this.f21210W = false;
        this.f21204Q = str;
        this.f21218g.mo58110a(!TextUtils.isEmpty(str));
        String str3 = null;
        this.f21200M = null;
        Map<String, Long> map = f21187c;
        if (map != null && map.size() > 0) {
            f21187c.clear();
        }
        if (!((C8762b.m25461b() == null || !C8762b.m25461b().containsKey(this.f21221j)) ? false : C8762b.m25461b().get(this.f21221j).booleanValue()) || i != 1 || !m25377a(i)) {
            if (!this.f21216d.containsKey("app_id") || !this.f21216d.containsKey(MBridgeConstans.APP_KEY) || !this.f21216d.containsKey(MBridgeConstans.KEY_WORD)) {
                str2 = null;
            } else {
                str3 = (String) this.f21216d.get("app_id");
                str2 = (String) this.f21216d.get(MBridgeConstans.APP_KEY);
            }
            this.f21217f.mo15580a(this.f21220i, str3, str2, this.f21221j);
            C2294d e = C2283b.m5275a().mo15569e(str3, this.f21221j);
            this.f21206S = e;
            if (e == null) {
                this.f21206S = C2294d.m5325d(this.f21221j);
            }
            C8762b.m25466e().put(this.f21221j, Integer.valueOf(this.f21206S.mo15608u() * this.f21231t));
            this.f21214a = this.f21206S.mo15603q();
            this.f21215b = this.f21206S.mo15604r();
            this.f21209V = this.f21206S.mo15601o();
            this.f21208U = this.f21206S.mo15602p();
            this.f21231t = this.f21230s;
            List<Integer> list = this.f21214a;
            if (list == null || list.size() == 0) {
                C8738a aVar = this.f21218g;
                if (aVar != null) {
                    this.f21235x = true;
                    aVar.onAdLoadError("don't have sorceList");
                    return;
                }
                return;
            }
            try {
                z = C8815a.m25647a(C2350a.m5601e().mo15792g());
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                C8738a aVar2 = this.f21218g;
                if (aVar2 != null) {
                    aVar2.onAdLoadError("webview is not available");
                    return;
                }
                return;
            }
            if (this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f21225n == null) {
                String str4 = (String) this.f21216d.get(MBridgeConstans.NATIVE_INFO);
                this.f21225n = str4;
                if (str4 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(this.f21225n);
                        if (jSONArray.length() > 0) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.opt(i2);
                                int optInt = jSONObject.optInt("id", 0);
                                if (2 == optInt) {
                                    this.f21211X = jSONObject.optInt("ad_num");
                                    if (this.f21209V > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f21209V);
                                    }
                                } else if (3 == optInt) {
                                    this.f21212Y = jSONObject.optInt("ad_num");
                                    if (this.f21209V > 0) {
                                        jSONObject.remove("ad_num");
                                        jSONObject.put("ad_num", this.f21209V);
                                    }
                                }
                            }
                        }
                        this.f21198K = Math.max(this.f21211X, this.f21212Y);
                        this.f21225n = jSONArray.toString();
                    } catch (JSONException e2) {
                        C8608u.m24884d(f21188e, C8737a.m25353a(e2));
                    }
                }
            }
            if ((this.f21214a.contains(1) && this.f21214a.get(0).intValue() != 1) || i != 0 || !m25380a(mo58119b(this.f21221j, this.f21231t, this.f21204Q))) {
                this.f21213Z = true;
                if (this.f21214a.contains(1) && i == 0 && this.f21214a.get(0).intValue() != 1) {
                    int intValue = this.f21214a.get(0).intValue();
                    C8735b<String, List<Campaign>> a = C8736c.m25352a(intValue);
                    if (intValue != 2 || !this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        this.f21231t = this.f21230s;
                    } else {
                        this.f21231t = this.f21198K;
                    }
                    if (a == null || !m25380a(m25363a(intValue, m25397d(a.mo58107b(this.f21221j, this.f21231t))))) {
                        this.f21213Z = false;
                        try {
                            m25387b(1, (long) (this.f21215b.get(this.f21214a.indexOf(1)).intValue() * 1000), i, this.f21204Q);
                        } catch (Exception unused2) {
                        }
                    } else {
                        return;
                    }
                }
                this.f21226o.sendEmptyMessageDelayed(1, (long) (this.f21206S.mo15598l() * 1000));
                List<Integer> list2 = this.f21214a;
                if (list2 != null && list2.size() > 0) {
                    Queue<Integer> queue = this.f21223l;
                    if (queue != null && queue.size() > 0) {
                        this.f21223l.clear();
                    }
                    for (Integer next : this.f21214a) {
                        Queue<Integer> queue2 = this.f21223l;
                        if (queue2 != null) {
                            queue2.add(next);
                        }
                    }
                }
                List<Integer> list3 = this.f21215b;
                if (list3 != null && list3.size() > 0) {
                    Queue<Long> queue3 = this.f21224m;
                    if (queue3 != null && queue3.size() > 0) {
                        this.f21224m.clear();
                    }
                    for (Integer next2 : this.f21215b) {
                        Queue<Long> queue4 = this.f21224m;
                        if (queue4 != null) {
                            queue4.add(Long.valueOf((long) (next2.intValue() * 1000)));
                        }
                    }
                }
                m25388b(i, this.f21204Q);
            }
        }
    }

    /* renamed from: a */
    private boolean m25377a(int i) {
        int i2;
        int i3;
        int i4;
        C8738a aVar;
        int i5 = 0;
        if (C8762b.m25461b().containsKey(this.f21221j) && C8762b.m25461b().get(this.f21221j).booleanValue()) {
            Map<String, Map<Long, Object>> a = C8762b.m25454a();
            Map map = a.get(i + "_" + this.f21221j);
            Integer num = C8762b.m25465d().get(this.f21221j);
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (num != null) {
                this.f21231t = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long l = (Long) map.keySet().iterator().next();
                long currentTimeMillis = System.currentTimeMillis();
                if (b == null) {
                    b = C2283b.m5275a().mo15562b();
                }
                if (currentTimeMillis - l.longValue() >= b.mo15442P() * 1000) {
                    a.remove(i + "_" + this.f21221j);
                } else if (i == 1) {
                    List<Frame> list = (List) map.get(l);
                    if (list == null || list.size() <= 0 || (aVar = this.f21218g) == null) {
                        return false;
                    }
                    if (this.f21191D >= list.size()) {
                        a.remove(i + "_" + this.f21221j);
                        aVar.onAdFramesLoaded(list);
                        return true;
                    } else if (this.f21191D == 0) {
                        return false;
                    } else {
                        List subList = list.subList(0, this.f21190C);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(subList);
                        map.put(l, subList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i5 >= this.f21191D) {
                                arrayList.add(frame);
                            }
                            i5++;
                        }
                        map.put(l, arrayList);
                        a.put(i + "_" + this.f21221j, map);
                        aVar.onAdFramesLoaded(subList);
                        return true;
                    }
                } else {
                    List list2 = (List) map.get(l);
                    if (list2 != null && list2.size() > 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f21225n)) {
                                i2 = Math.min(this.f21189B, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f21225n);
                                    if (jSONArray.length() > 0) {
                                        i4 = 0;
                                        i3 = 0;
                                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i6);
                                            int optInt = jSONObject.optInt("id", 0);
                                            if (2 == optInt) {
                                                i4 = jSONObject.optInt("ad_num");
                                            } else if (3 == optInt) {
                                                i3 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        i4 = 0;
                                        i3 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        i2 = Math.min(i3, list2.size());
                                    } else {
                                        i2 = Math.min(i4, list2.size());
                                    }
                                } catch (Exception unused) {
                                    C8608u.m24884d(f21188e, "load from catch error in get nativeinfo adnum");
                                    i2 = 0;
                                }
                            }
                            if (i2 <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i5 != i2) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i5++;
                            }
                        } else {
                            int min = Math.min(this.f21189B, list2.size());
                            if (min > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i5 != min) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i5++;
                                }
                            }
                        }
                        m25380a((List<Campaign>) arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m25388b(int i, String str) {
        C8738a aVar;
        Queue<Integer> queue = this.f21223l;
        if (queue != null && queue.size() > 0) {
            int intValue = this.f21223l.poll().intValue();
            this.f21207T = (long) MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f21224m;
            if (queue2 != null && queue2.size() > 0) {
                this.f21207T = this.f21224m.poll().longValue();
            }
            m25366a(intValue, this.f21207T, i, str);
        } else if (!this.f21235x && (aVar = this.f21218g) != null) {
            this.f21235x = true;
            aVar.onAdLoadError("no ad source");
        }
    }

    /* renamed from: a */
    private void m25366a(int i, long j, int i2, String str) {
        C8735b<String, List<Campaign>> a;
        if (i2 == 0 && (a = C8736c.m25352a(i)) != null) {
            if ((i == 1 || i == 2) && this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f21231t = this.f21198K;
            } else {
                this.f21231t = this.f21230s;
            }
            if (m25380a(m25363a(i, m25397d(a.mo58107b(this.f21221j, this.f21231t))))) {
                return;
            }
        }
        if (i == 1) {
            m25387b(1, j, i2, this.f21204Q);
        } else if (i != 2) {
            m25387b(i, j, i2, str);
        } else {
            m25387b(2, j, i2, str);
        }
    }

    /* renamed from: a */
    public final void mo58117a(String str, int i, String str2) {
        Queue<Integer> queue = this.f21223l;
        if ((queue == null || queue.size() > 0) && this.f21223l != null) {
            m25388b(i, str2);
            return;
        }
        C8738a aVar = this.f21218g;
        if (aVar != null && !this.f21235x) {
            this.f21235x = true;
            aVar.onAdLoadError(str);
        }
    }

    /* renamed from: b */
    private synchronized void m25387b(int i, long j, int i2, String str) {
        C8409j jVar;
        if (this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO)) {
            this.f21231t = Math.max(this.f21211X, this.f21212Y);
        }
        if (i2 == 0) {
            C8735b<String, List<Campaign>> a = C8736c.m25352a(i);
            if (a == null || !m25380a(m25363a(1, m25397d(a.mo58107b(this.f21221j, this.f21231t))))) {
                try {
                    if (this.f21200M != null && !this.f21210W) {
                        this.f21200M.mo58133b(true);
                    }
                    if (this.f21210W && !this.f21235x) {
                        mo58117a("mb load failed", i2, str);
                    }
                    if (!this.f21213Z) {
                        return;
                    }
                } catch (Exception e) {
                    C8608u.m24884d(f21188e, C8737a.m25353a(e));
                    C8608u.m24884d(f21188e, e.getMessage());
                }
            } else {
                return;
            }
        }
        if (this.f21232u == -1) {
            this.f21232u = i;
        } else if (this.f21232u != i) {
            this.f21233v = 0;
        }
        C2372e.m5679a((C2374f) C2376g.m5723a(this.f21220i)).mo15862a();
        C8779a aVar = new C8779a(this.f21220i);
        C8494d dVar = new C8494d();
        String h = C2350a.m5601e().mo15793h();
        String i3 = C2350a.m5601e().mo15794i();
        if (this.f21216d != null && this.f21216d.containsKey("app_id") && this.f21216d.containsKey(MBridgeConstans.APP_KEY) && this.f21216d.containsKey(MBridgeConstans.KEY_WORD) && this.f21216d.get(MBridgeConstans.KEY_WORD) != null) {
            String str2 = null;
            if (this.f21216d.get("app_id") instanceof String) {
                h = (String) this.f21216d.get("app_id");
            }
            if (this.f21216d.get(MBridgeConstans.APP_KEY) instanceof String) {
                i3 = (String) this.f21216d.get(MBridgeConstans.APP_KEY);
            }
            if (this.f21216d.get(MBridgeConstans.KEY_WORD) instanceof String) {
                str2 = (String) this.f21216d.get(MBridgeConstans.KEY_WORD);
            }
            if (!TextUtils.isEmpty(str2)) {
                dVar.mo57606a("smart", C8595p.m24814a(str2));
            }
        }
        dVar.mo57606a("app_id", h);
        dVar.mo57606a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f21221j);
        if (!TextUtils.isEmpty(this.f21222k)) {
            dVar.mo57606a(MBridgeConstans.PLACEMENT_ID, this.f21222k);
        }
        dVar.mo57606a("req_type", "2");
        if (!TextUtils.isEmpty(this.f21234w)) {
            dVar.mo57606a("category", this.f21234w);
        }
        dVar.mo57606a("sign", SameMD5.getMD5(h + i3));
        if (this.f21209V <= 0 || i2 != 0) {
            dVar.mo57606a("ad_num", this.f21230s + "");
        } else {
            dVar.mo57606a("ad_num", this.f21209V + "");
        }
        String e2 = C8613y.m24945e(this.f21221j);
        if (!TextUtils.isEmpty(e2)) {
            dVar.mo57606a("j", e2);
        }
        dVar.mo57606a("only_impression", "1");
        dVar.mo57606a("ping_mode", "1");
        if (this.f21191D != 0) {
            dVar.mo57606a("frame_num", this.f21191D + "");
        }
        if (!TextUtils.isEmpty(this.f21225n)) {
            dVar.mo57606a(MBridgeConstans.NATIVE_INFO, this.f21225n);
            if (i == 1 && !C2295a.f4701a) {
                dVar.mo57606a("tnum", this.f21198K + "");
            }
        } else if (i == 1 && !C2295a.f4701a) {
            dVar.mo57606a("tnum", this.f21230s + "");
        }
        String a2 = C8417d.m24306a(this.f21221j, "native");
        if (!TextUtils.isEmpty(a2)) {
            dVar.mo57606a(C8494d.f20561b, a2);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            if (this.f21216d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                dVar.mo57606a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_WIDTH, ((Integer) this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
            }
            if (this.f21216d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                dVar.mo57606a(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_VIDEO_HEIGHT, ((Integer) this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
            }
            if (this.f21216d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                ((Boolean) this.f21216d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).booleanValue();
            }
            dVar.mo57606a("video_version", "2.0");
        }
        if (C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h()) == null) {
            C2283b.m5275a().mo15562b();
        }
        if (!m25381a(this.f21216d)) {
            JSONArray a3 = C8613y.m24920a(this.f21220i, this.f21221j);
            if (a3.length() > 0) {
                dVar.mo57606a(C8494d.f20562c, C8613y.m24918a(a3));
            }
        }
        if (C8762b.m25461b().containsKey(this.f21221j) && C8762b.m25461b().get(this.f21221j).booleanValue() && C8762b.m25464c().get(this.f21221j) != null && (jVar = C8762b.m25464c().get(this.f21221j)) != null) {
            if (i == 1) {
                this.f21233v = jVar.mo57414b();
            } else if (i == 2) {
                this.f21233v = jVar.mo57412a();
            }
        }
        dVar.mo57606a("offset", this.f21233v + "");
        dVar.mo57606a("ad_type", RoomMasterTable.DEFAULT_ID);
        dVar.mo57606a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
        if (!TextUtils.isEmpty(this.f21228q)) {
            dVar.mo57606a(C8494d.f20560a, this.f21228q);
        }
        C8750a aVar2 = new C8750a();
        aVar2.mo58130a(m25386b(this.f21216d));
        aVar2.f20497d = this.f21221j;
        aVar2.f20498e = this.f21222k;
        aVar2.f20499f = 42;
        aVar2.mo58133b(true);
        C8752c cVar = new C8752c(1, aVar2, i2, str);
        aVar2.mo58129a((Runnable) cVar);
        aVar2.mo58180g(i2);
        aVar2.mo58177a(str);
        if (i2 == 0) {
            if (!TextUtils.isEmpty(str)) {
                dVar.mo57606a("token", str);
            }
            aVar.mo57598a(1, dVar, (C8476e) aVar2, str);
        }
        if (i2 == 1) {
            aVar.mo57602b(1, C8487d.m24492a().f20543m, dVar, aVar2);
        }
        this.f21226o.postDelayed(cVar, j);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ Exception -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58116a(com.mbridge.msdk.out.Campaign r5, android.view.View r6, java.util.List<android.view.View> r7) {
        /*
            r4 = this;
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r0 = r4.f21219h     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x000b
            com.mbridge.msdk.click.a r0 = r4.f21229r     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.out.NativeListener$NativeTrackingListener r1 = r4.f21219h     // Catch:{ Exception -> 0x0089 }
            r0.mo15642a((com.mbridge.msdk.out.NativeListener.NativeTrackingListener) r1)     // Catch:{ Exception -> 0x0089 }
        L_0x000b:
            int r0 = r5.getType()     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.mbnative.a.b r0 = com.mbridge.msdk.mbnative.p331a.C8736c.m25352a(r0)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r1 = r4.f21221j     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = r4.f21204Q     // Catch:{ Exception -> 0x0089 }
            r0.mo58106a((java.lang.String) r1, (com.mbridge.msdk.out.Campaign) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0089 }
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = (com.mbridge.msdk.foundation.entity.CampaignEx) r5     // Catch:{ Exception -> 0x0089 }
            r0 = 0
            java.lang.String r1 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0023 }
        L_0x0023:
            java.lang.String r1 = r4.f21221j     // Catch:{ Exception -> 0x0089 }
            java.lang.String r2 = "native"
            com.mbridge.msdk.foundation.same.p299a.C8417d.m24308a((java.lang.String) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x0089 }
            if (r5 == 0) goto L_0x0090
            if (r6 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0037
            boolean r1 = r0.isInstance(r6)     // Catch:{ Exception -> 0x0089 }
            if (r1 == 0) goto L_0x0037
            return
        L_0x0037:
            com.mbridge.msdk.mbnative.controller.NativeController$1 r1 = new com.mbridge.msdk.mbnative.controller.NativeController$1     // Catch:{ Exception -> 0x0089 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0089 }
            r6.setOnClickListener(r1)     // Catch:{ Exception -> 0x0089 }
        L_0x003f:
            if (r7 == 0) goto L_0x0069
            int r1 = r7.size()     // Catch:{ Exception -> 0x0089 }
            if (r1 <= 0) goto L_0x0069
            java.util.Iterator r1 = r7.iterator()     // Catch:{ Exception -> 0x0089 }
        L_0x004b:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0089 }
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0089 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ Exception -> 0x0089 }
            if (r0 == 0) goto L_0x0060
            boolean r3 = r0.isInstance(r2)     // Catch:{ Exception -> 0x0089 }
            if (r3 == 0) goto L_0x0060
            goto L_0x0069
        L_0x0060:
            com.mbridge.msdk.mbnative.controller.NativeController$4 r3 = new com.mbridge.msdk.mbnative.controller.NativeController$4     // Catch:{ Exception -> 0x0089 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0089 }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x0089 }
            goto L_0x004b
        L_0x0069:
            boolean r0 = r5.isReport()     // Catch:{ Exception -> 0x0089 }
            if (r0 != 0) goto L_0x0090
            r4.m25369a((com.mbridge.msdk.foundation.entity.CampaignEx) r5, (android.view.View) r6, (java.util.List<android.view.View>) r7)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = f21188e     // Catch:{ Exception -> 0x0089 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r7.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r0 = "sendImpression"
            r7.append(r0)     // Catch:{ Exception -> 0x0089 }
            r7.append(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0089 }
            android.util.Log.e(r6, r5)     // Catch:{ Exception -> 0x0089 }
            goto L_0x0090
        L_0x0089:
            java.lang.String r5 = f21188e
            java.lang.String r6 = "registerview exception!"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r5, r6)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.mo58116a(com.mbridge.msdk.out.Campaign, android.view.View, java.util.List):void");
    }

    /* renamed from: a */
    public final void mo58115a(Campaign campaign, View view) {
        try {
            if (this.f21219h != null) {
                this.f21229r.mo15642a(this.f21219h);
            }
            C8736c.m25352a(campaign.getType()).mo58106a(this.f21221j, campaign, this.f21204Q);
            final CampaignEx campaignEx = (CampaignEx) campaign;
            C8417d.m24308a(this.f21221j, campaignEx, "native");
            if (campaignEx != null) {
                C87455 r0 = new C9587a() {
                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public final void mo58122a(View view) {
                        C2295a unused = NativeController.this.f21229r;
                        C2295a.f4701a = false;
                        NativeController.this.f21229r.mo15640a(campaignEx, (NativeListener.NativeAdListener) NativeController.this.f21218g);
                        NativeController.m25370a(NativeController.this, campaignEx);
                    }
                };
                try {
                    m25367a(view, (View.OnClickListener) r0, (Class) Class.forName("com.mbridge.msdk.nativex.view.MBMediaView"));
                } catch (Throwable unused) {
                    m25367a(view, (View.OnClickListener) r0, (Class) null);
                }
                if (!campaignEx.isReport()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    m25369a(campaignEx, view, (List<View>) arrayList);
                    String str = f21188e;
                    C8608u.m24882b(str, "sendImpression" + campaignEx);
                }
            }
        } catch (Exception unused2) {
            C8608u.m24884d(f21188e, "registerview exception!");
        }
    }

    /* renamed from: a */
    private AdSession m25360a(CampaignEx campaignEx) {
        if (this.f21197J == null) {
            this.f21197J = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        AdSession adSession = this.f21197J.get(requestIdNotice);
        if (adSession == null && campaignEx.isActiveOm()) {
            adSession = C2265b.m5114a(this.f21220i, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f21221j, "", campaignEx.getRequestIdNotice());
        }
        if (adSession != null) {
            this.f21197J.put(requestIdNotice, adSession);
        }
        return adSession;
    }

    /* renamed from: a */
    private void m25369a(CampaignEx campaignEx, View view, List<View> list) {
        AdSession adSession = null;
        try {
            if (!(this.f21220i == null || campaignEx == null || (adSession = m25360a(campaignEx)) == null)) {
                adSession.registerAdView(view);
                adSession.start();
            }
            AdSession adSession2 = adSession;
            int i = 0;
            if (this.f21206S != null) {
                i = this.f21206S.mo15590d();
            }
            int i2 = i;
            final C8755f fVar = new C8755f(campaignEx, view, list, this, adSession2);
            if (this.f21196I == null) {
                this.f21196I = new CopyOnWriteArrayList<>();
            }
            this.f21196I.add(fVar);
            fVar.f20405d = new C8434a.C8436b() {
                /* renamed from: a */
                public final void mo15705a(C8434a.C8435a aVar) {
                    if (aVar == C8434a.C8435a.FINISH && NativeController.this.f21196I != null && NativeController.this.f21196I.size() > 0 && NativeController.this.f21196I.contains(fVar)) {
                        NativeController.this.f21196I.remove(fVar);
                    }
                }
            };
            if (this.f21226o != null) {
                this.f21226o.postDelayed(fVar, (long) (i2 * 1000));
            }
        } catch (Exception e) {
            C8608u.m24884d(f21188e, C8737a.m25353a(e));
        }
    }

    /* renamed from: a */
    private void m25367a(View view, View.OnClickListener onClickListener, Class cls) {
        if (view != null && onClickListener != null) {
            if (cls != null) {
                try {
                    if (cls.isInstance(view)) {
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            view.setOnClickListener(onClickListener);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25367a(viewGroup.getChildAt(i), onClickListener, cls);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$f */
    private static class C8755f extends C8434a {

        /* renamed from: a */
        private CampaignEx f21283a;

        /* renamed from: e */
        private WeakReference<View> f21284e;

        /* renamed from: f */
        private WeakReference<List<View>> f21285f;

        /* renamed from: g */
        private WeakReference<NativeController> f21286g;

        /* renamed from: h */
        private WeakReference<AdSession> f21287h;

        /* renamed from: b */
        public final void mo15709b() {
        }

        public C8755f(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, AdSession adSession) {
            this.f21283a = campaignEx;
            this.f21284e = new WeakReference<>(view);
            this.f21285f = new WeakReference<>(list);
            this.f21286g = new WeakReference<>(nativeController);
            this.f21287h = new WeakReference<>(adSession);
        }

        /* renamed from: a */
        public final void mo15708a() {
            try {
                if (this.f21286g != null && this.f21284e != null && this.f21285f != null) {
                    View view = (View) this.f21284e.get();
                    List list = (List) this.f21285f.get();
                    NativeController nativeController = (NativeController) this.f21286g.get();
                    AdSession adSession = null;
                    if (this.f21287h != null) {
                        adSession = (AdSession) this.f21287h.get();
                    }
                    if (view != null && nativeController != null) {
                        NativeController.m25371a(nativeController, this.f21283a, view, list, adSession);
                    }
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
        }
    }

    /* renamed from: b */
    public final void mo58120b(Campaign campaign, View view) {
        mo58121b(campaign, view, (List<View>) null);
    }

    /* renamed from: b */
    public final void mo58121b(Campaign campaign, View view, List<View> list) {
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                Class<?> cls = null;
                try {
                    cls = Class.forName("com.mbridge.msdk.nativex.view.MBMediaView");
                } catch (Throwable unused) {
                }
                if (list != null && list.size() > 0) {
                    for (View a : list) {
                        m25368a(a, (Class) cls);
                    }
                } else if (view != null) {
                    m25368a(view, (Class) cls);
                }
            }
        }
    }

    /* renamed from: a */
    private void m25368a(View view, Class cls) {
        if (view != null) {
            if (cls != null) {
                try {
                    if (cls.isInstance(view)) {
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            view.setOnClickListener((View.OnClickListener) null);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m25368a(viewGroup.getChildAt(i), cls);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo58113a() {
        C8434a next;
        C8437b bVar = this.f21193F;
        if (bVar != null) {
            bVar.mo57527a();
            this.f21193F = null;
        }
        Hashtable<String, AdSession> hashtable = this.f21197J;
        if (hashtable != null) {
            for (AdSession next2 : hashtable.values()) {
                if (next2 != null) {
                    next2.finish();
                }
            }
            this.f21197J.clear();
        }
        C8754e eVar = this.f21226o;
        if (eVar != null) {
            eVar.removeCallbacksAndMessages((Object) null);
        }
        this.f21219h = null;
        this.f21229r.mo15638a();
        try {
            if (this.f21220i != null) {
                C8425b.m24339a(this.f21220i).mo57508c();
            }
            if (this.f21194G != null && this.f21194G.size() > 0) {
                for (C8757a a : this.f21194G) {
                    a.mo58136a();
                }
                this.f21194G.clear();
                this.f21194G = null;
            }
            if (this.f21195H != null && this.f21195H.size() > 0) {
                for (C8757a.C8761a next3 : this.f21195H) {
                }
                this.f21195H.clear();
                this.f21195H = null;
            }
            if (this.f21196I != null && this.f21196I.size() > 0) {
                Iterator<C8434a> it = this.f21196I.iterator();
                if (it.hasNext() && (next = it.next()) != null) {
                    next.mo57525d();
                    this.f21226o.removeCallbacks(next);
                }
                this.f21196I.clear();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$c */
    public class C8752c implements Runnable {

        /* renamed from: b */
        private int f21274b;

        /* renamed from: c */
        private C8439c f21275c;

        /* renamed from: d */
        private int f21276d;

        /* renamed from: e */
        private String f21277e;

        public C8752c(int i, C8439c cVar, int i2, String str) {
            this.f21274b = i;
            this.f21275c = cVar;
            this.f21276d = i2;
            this.f21277e = str;
        }

        public final void run() {
            this.f21275c.mo57530a(true);
            int i = this.f21274b;
            if (i == 1) {
                boolean unused = NativeController.this.f21210W = true;
                NativeController.this.mo58117a("REQUEST_TIMEOUT", this.f21276d, this.f21277e);
            } else if (i == 2) {
                if (!NativeController.this.f21235x || this.f21276d == 1) {
                    NativeController.this.mo58117a("REQUEST_TIMEOUT", this.f21276d, this.f21277e);
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$a */
    public class C8750a extends C8780b implements C8439c {

        /* renamed from: b */
        private boolean f21269b = false;

        /* renamed from: c */
        private Runnable f21270c;

        /* renamed from: g */
        private boolean f21271g = true;

        /* renamed from: h */
        private List<String> f21272h = null;

        public C8750a() {
        }

        /* renamed from: b */
        public final void mo58133b(boolean z) {
            this.f21271g = z;
        }

        /* renamed from: a */
        public final void mo57530a(boolean z) {
            this.f21269b = z;
        }

        /* renamed from: a */
        public final void mo58130a(List<String> list) {
            this.f21272h = list;
        }

        /* renamed from: a */
        public final void mo58131a(List<C8457b> list, CampaignUnit campaignUnit) {
            int i = 1;
            boolean unused = NativeController.this.f21210W = true;
            C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(NativeController.this.f21220i));
            a.mo15909b();
            if (this.f21270c != null) {
                NativeController.this.f21226o.removeCallbacks(this.f21270c);
            }
            int i2 = 0;
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.f20497d = "0_" + this.f20497d;
                C8762b.m25462b(NativeController.this.f21232u, this.f20497d);
                int unused2 = NativeController.this.f21233v = 0;
                return;
            }
            String unused3 = NativeController.this.f21228q = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (NativeController.this.f21208U <= 0) {
                if (NativeController.this.f21208U == -3) {
                    int unused4 = NativeController.this.f21208U = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    int unused5 = nativeController.f21208U = nativeController.f21231t;
                }
                if (NativeController.this.f21211X != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    int unused6 = nativeController2.f21208U = nativeController2.f21211X;
                }
                if (NativeController.this.f21212Y != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    int unused7 = nativeController3.f21208U = nativeController3.f21212Y;
                }
            }
            for (int i3 = 0; i3 < campaignUnit.getAds().size(); i3++) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i3);
                campaignEx.setCampaignUnitId(this.f20497d);
                if (!TextUtils.isEmpty(NativeController.this.f21204Q)) {
                    campaignEx.setBidToken(NativeController.this.f21204Q);
                    campaignEx.setIsBidCampaign(true);
                }
                if (NativeController.f21186A) {
                    campaignEx.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                    campaignEx.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                }
                if (campaignEx != null) {
                    boolean c = C8613y.m24940c(NativeController.this.f21220i, campaignEx.getPackageName());
                    if (i3 < NativeController.this.f21231t && campaignEx.getOfferType() != 99) {
                        if (C8613y.m24935b(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (campaignEx.getWtick() == 1 || !c) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else if (C8613y.m24935b(campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList3.add(campaignEx);
                            }
                        } else {
                            C8613y.m24923a(this.f20497d, campaignEx, C8413a.f20340v);
                        }
                    }
                    if (i3 < NativeController.this.f21208U && campaignEx.getOfferType() != 99) {
                        if (C8613y.m24935b(campaignEx)) {
                            campaignEx.setRtinsType(c ? 1 : 2);
                        }
                        if (!c) {
                            arrayList2.add(campaignEx);
                        } else if (C8613y.m24935b(campaignEx)) {
                            arrayList2.add(campaignEx);
                        }
                    }
                    if (!a.mo15907a(campaignEx.getId())) {
                        C8405f fVar = new C8405f();
                        fVar.mo57347a(campaignEx.getId());
                        fVar.mo57345a(campaignEx.getFca());
                        fVar.mo57349b(campaignEx.getFcb());
                        fVar.mo57353d(0);
                        fVar.mo57351c(0);
                        fVar.mo57346a(System.currentTimeMillis());
                        a.mo15906a(fVar);
                    }
                    C2309b.m5446a(NativeController.this.f21220i, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                }
            }
            NativeController.m25389b(NativeController.this, (List) arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            C8735b<String, List<Campaign>> a2 = C8736c.m25352a(type);
            if (a2 != null) {
                a2.mo58105a(this.f20497d, arrayList2, NativeController.this.f21204Q);
            }
            if (arrayList.size() == 0) {
                NativeController.this.mo58117a("APP ALREADY INSTALLED", mo58179g(), mo58178f());
                return;
            }
            NativeController nativeController4 = NativeController.this;
            boolean unused8 = nativeController4.m25380a((List<Campaign>) nativeController4.m25363a(type, (List<Campaign>) nativeController4.m25397d((List<Campaign>) arrayList)));
            if (!C8762b.m25461b().containsKey(this.f20497d) || !C8762b.m25461b().get(this.f20497d).booleanValue()) {
                if (C8762b.m25466e().containsKey(this.f20497d)) {
                    i = C8762b.m25466e().get(this.f20497d).intValue();
                }
                int c2 = NativeController.this.f21231t + NativeController.this.f21233v;
                if (c2 <= i) {
                    i2 = c2;
                }
                int unused9 = NativeController.this.f21233v = i2;
                return;
            }
            C8762b.m25458a(NativeController.this.f21232u, this.f20497d);
        }

        /* renamed from: a */
        public final void mo58128a(int i, String str) {
            boolean unused = NativeController.this.f21210W = true;
            if (!this.f21269b) {
                if (i == -1) {
                    C8762b.m25462b(NativeController.this.f21232u, this.f20497d);
                    int unused2 = NativeController.this.f21233v = 0;
                }
                if (this.f21270c != null) {
                    NativeController.this.f21226o.removeCallbacks(this.f21270c);
                }
                if (NativeController.this.f21235x) {
                    return;
                }
                if (mo58179g() == 1 || this.f21271g) {
                    NativeController.this.mo58117a(str, mo58179g(), mo58178f());
                }
            } else if (!NativeController.this.f21235x && this.f21271g) {
                NativeController.this.mo58117a(str, mo58179g(), mo58178f());
            }
        }

        /* renamed from: a */
        public final void mo58129a(Runnable runnable) {
            this.f21270c = runnable;
        }

        /* renamed from: b */
        public final void mo58132b(List<Frame> list) {
            if (!this.f21269b) {
                if (this.f21270c != null) {
                    NativeController.this.f21226o.removeCallbacks(this.f21270c);
                }
                if (list != null && list.size() != 0) {
                    for (Frame campaigns : list) {
                        List<CampaignEx> campaigns2 = campaigns.getCampaigns();
                        if (campaigns2 != null && campaigns2.size() != 0) {
                            for (Campaign next : campaigns2) {
                                if (NativeController.f21186A) {
                                    next.loadImageUrlAsyncWithBlock((OnImageLoadListener) null);
                                    next.loadIconUrlAsyncWithBlock((OnImageLoadListener) null);
                                }
                            }
                        } else if (NativeController.this.f21218g != null) {
                            boolean unused = NativeController.this.f21235x = true;
                            NativeController.this.f21218g.onAdLoadError("ads in frame is empty");
                            return;
                        } else {
                            return;
                        }
                    }
                    if (NativeController.this.f21218g != null) {
                        NativeController.this.f21218g.onAdFramesLoaded(list);
                    }
                } else if (NativeController.this.f21218g != null) {
                    boolean unused2 = NativeController.this.f21235x = true;
                    NativeController.this.f21218g.onAdLoadError("frame is empty");
                }
            }
        }
    }

    /* renamed from: b */
    public final List<Campaign> mo58119b(String str, int i, String str2) {
        int i2;
        int i3;
        List<Campaign> list = null;
        if (this.f21214a != null) {
            ArrayList arrayList = new ArrayList(this.f21214a);
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C8735b<String, List<Campaign>> a = C8736c.m25352a(((Integer) arrayList.get(i4)).intValue());
                if (a != null) {
                    if ((((Integer) arrayList.get(i4)).intValue() == 1 || ((Integer) arrayList.get(i4)).intValue() == 2) && this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i3 = this.f21198K;
                    } else {
                        i3 = this.f21230s;
                    }
                    list = m25363a(((Integer) arrayList.get(i4)).intValue(), a.mo58107b(str, i3));
                    if (list != null) {
                        break;
                    }
                }
            }
            if (list == null) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    C8735b<String, List<Campaign>> a2 = C8736c.m25352a(((Integer) arrayList.get(i5)).intValue());
                    if ((((Integer) arrayList.get(i5)).intValue() == 1 || ((Integer) arrayList.get(i5)).intValue() == 2) && this.f21216d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i2 = this.f21198K;
                    } else {
                        i2 = this.f21230s;
                    }
                    list = m25363a(((Integer) arrayList.get(i5)).intValue(), a2.mo58103a(str, i2));
                    if (list != null) {
                        break;
                    }
                }
            }
        }
        return m25397d(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m25380a(final List<Campaign> list) {
        if ((!TextUtils.isEmpty(this.f21204Q) && list != null && list.size() == 0) || list == null || list.size() <= 0) {
            return false;
        }
        final C8738a aVar = this.f21218g;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        final int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(this.f21220i));
        a.mo15909b();
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i);
            if (!a.mo15907a(campaignEx2.getId())) {
                C8405f fVar = new C8405f();
                fVar.mo57347a(campaignEx2.getId());
                fVar.mo57345a(campaignEx2.getFca());
                fVar.mo57349b(campaignEx2.getFcb());
                fVar.mo57353d(0);
                fVar.mo57351c(0);
                fVar.mo57346a(System.currentTimeMillis());
                a.mo15906a(fVar);
            }
        }
        campaignEx.getType();
        if (!this.f21202O || !this.f21201N) {
            if (list == null || list.size() <= 0) {
                m25374a((NativeListener.NativeAdListener) aVar, "has no ads");
                return true;
            }
            for (Campaign videoLength : list) {
                videoLength.setVideoLength(0);
            }
            m25375a(list, template, (NativeListener.NativeAdListener) aVar);
            return true;
        } else if (m25399e().mo15593g() == 3) {
            final List<Campaign> b = m25385b(list);
            if (list == null || list.size() <= 0) {
                m25374a((NativeListener.NativeAdListener) aVar, "has no ads");
                return true;
            }
            m25376a(list, (C8751b) new C8751b() {
                /* renamed from: a */
                public final void mo58127a() {
                    List a = NativeController.m25365a(NativeController.this, b, true);
                    if (a == null || a.size() <= 0) {
                        NativeController.this.m25374a(aVar, "has no ads");
                    } else {
                        NativeController.this.m25375a((List<Campaign>) a, template, aVar);
                    }
                }
            });
            return true;
        } else {
            List<Campaign> c = m25394c(list);
            if (c == null || c.size() <= 0) {
                m25375a(list, template, (NativeListener.NativeAdListener) aVar);
                return true;
            }
            m25376a(c, (C8751b) new C8751b() {
                /* renamed from: a */
                public final void mo58127a() {
                    List a = NativeController.m25365a(NativeController.this, list, false);
                    if (a == null || a.size() <= 0) {
                        NativeController.this.m25374a(aVar, "has no ads");
                    } else {
                        NativeController.this.m25375a((List<Campaign>) a, template, aVar);
                    }
                }
            });
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25375a(final List<Campaign> list, final int i, final NativeListener.NativeAdListener nativeAdListener) {
        this.f21226o.post(new Runnable() {
            public final void run() {
                List list = list;
                if (list != null && list.size() > 0) {
                    String unused = NativeController.this.f21205R = ((CampaignEx) list.get(0)).getRequestId();
                }
                boolean unused2 = NativeController.this.f21235x = true;
                nativeAdListener.onAdLoaded(list, i);
                C8772a.m25506a(NativeController.this.f21220i, list, NativeController.this.f21221j);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25374a(final NativeListener.NativeAdListener nativeAdListener, final String str) {
        this.f21226o.post(new Runnable() {
            public final void run() {
                nativeAdListener.onAdLoadError(str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r4.size();
        r1 = r2.f21212Y;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.mbridge.msdk.out.Campaign> m25363a(int r3, java.util.List<com.mbridge.msdk.out.Campaign> r4) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != r0) goto L_0x0045
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.f21216d
            java.lang.String r1 = "native_info"
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x0045
            r3 = 0
            java.lang.Object r1 = r4.get(r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r1 = (com.mbridge.msdk.foundation.entity.CampaignEx) r1
            if (r1 == 0) goto L_0x0022
            int r0 = r1.getTemplate()
        L_0x0022:
            r1 = 2
            if (r0 != r1) goto L_0x0034
            if (r4 == 0) goto L_0x0045
            int r0 = r4.size()
            int r1 = r2.f21211X
            if (r0 < r1) goto L_0x0045
            java.util.List r4 = r4.subList(r3, r1)
            goto L_0x0045
        L_0x0034:
            r1 = 3
            if (r0 != r1) goto L_0x0045
            if (r4 == 0) goto L_0x0045
            int r0 = r4.size()
            int r1 = r2.f21212Y
            if (r0 < r1) goto L_0x0045
            java.util.List r4 = r4.subList(r3, r1)
        L_0x0045:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.m25363a(int, java.util.List):java.util.List");
    }

    /* renamed from: a */
    public static boolean m25381a(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (!map.containsKey("app_id") || !map.containsKey(MBridgeConstans.APP_KEY) || !map.containsKey(MBridgeConstans.KEY_WORD) || map.get(MBridgeConstans.KEY_WORD) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C8608u.m24884d(f21188e, C8737a.m25353a(e));
            return false;
        }
    }

    /* renamed from: b */
    public static List<String> m25386b(Map<String, Object> map) {
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("p");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    i++;
                } catch (Exception e) {
                    e = e;
                    arrayList = arrayList2;
                    C8608u.m24884d(f21188e, C8737a.m25353a(e));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
            C8608u.m24884d(f21188e, C8737a.m25353a(e));
            return arrayList;
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$d */
    private static class C8753d implements C9563g.C9569b {

        /* renamed from: a */
        private String f21278a;

        /* renamed from: b */
        private CampaignEx f21279b;

        /* renamed from: c */
        private long f21280c = System.currentTimeMillis();

        /* renamed from: d */
        private boolean f21281d = true;

        public C8753d(String str, CampaignEx campaignEx, boolean z) {
            this.f21278a = str;
            this.f21279b = campaignEx;
            this.f21281d = z;
        }

        /* renamed from: a */
        public final void mo57995a(String str) {
            try {
                if (this.f21281d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21280c;
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    C8412m mVar = new C8412m("2000043", 20, currentTimeMillis + "", str, this.f21279b.getId(), this.f21278a, "", "2");
                    if (this.f21279b != null && !TextUtils.isEmpty(this.f21279b.getId())) {
                        mVar.mo57469n(this.f21279b.getId());
                    }
                    if (this.f21279b != null) {
                        mVar.mo57463k(this.f21279b.getRequestId());
                        mVar.mo57465l(this.f21279b.getRequestIdNotice());
                        mVar.mo57442b(this.f21279b.getAdSpaceT());
                    }
                    mVar.mo57457h("1");
                    C8524c.m24636a(mVar, this.f21278a);
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
        }

        /* renamed from: a */
        public final void mo57996a(String str, String str2) {
            try {
                if (this.f21281d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21280c;
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    C8412m mVar = new C8412m("2000043", 21, currentTimeMillis + "", str, this.f21279b.getId(), this.f21278a, str2, "2");
                    mVar.mo57463k(this.f21279b.getRequestId());
                    mVar.mo57465l(this.f21279b.getRequestIdNotice());
                    if (this.f21279b != null && !TextUtils.isEmpty(this.f21279b.getId())) {
                        mVar.mo57469n(this.f21279b.getId());
                    }
                    if (this.f21279b != null) {
                        mVar.mo57442b(this.f21279b.getAdSpaceT());
                    }
                    mVar.mo57457h("1");
                    C8524c.m24636a(mVar, this.f21278a);
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbnative.controller.NativeController$g */
    private static final class C8756g implements C9563g.C9571d {

        /* renamed from: a */
        String f21288a;

        /* renamed from: b */
        CampaignEx f21289b;

        /* renamed from: c */
        private long f21290c = System.currentTimeMillis();

        /* renamed from: d */
        private boolean f21291d = true;

        public C8756g(String str, CampaignEx campaignEx, boolean z) {
            this.f21288a = str;
            this.f21289b = campaignEx;
            this.f21291d = z;
        }

        /* renamed from: a */
        public final void mo57995a(String str) {
            try {
                if (this.f21291d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21290c;
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    C8412m mVar = new C8412m("2000043", 14, currentTimeMillis + "", str, this.f21289b.getId(), this.f21288a, "", "1");
                    if (this.f21289b != null && !TextUtils.isEmpty(this.f21289b.getId())) {
                        mVar.mo57469n(this.f21289b.getId());
                    }
                    if (this.f21289b != null) {
                        mVar.mo57463k(this.f21289b.getRequestId());
                        mVar.mo57465l(this.f21289b.getRequestIdNotice());
                        mVar.mo57442b(this.f21289b.getAdSpaceT());
                    }
                    mVar.mo57457h("2");
                    C8524c.m24636a(mVar, this.f21288a);
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
        }

        /* renamed from: a */
        public final void mo57996a(String str, String str2) {
            try {
                if (this.f21291d) {
                    long currentTimeMillis = System.currentTimeMillis() - this.f21290c;
                    C2385p.m5777a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                    C8412m mVar = new C8412m("2000043", 3, currentTimeMillis + "", str2, this.f21289b.getId(), this.f21288a, str, "1");
                    if (this.f21289b != null && !TextUtils.isEmpty(this.f21289b.getId())) {
                        mVar.mo57469n(this.f21289b.getId());
                    }
                    if (this.f21289b != null) {
                        mVar.mo57463k(this.f21289b.getRequestId());
                        mVar.mo57465l(this.f21289b.getRequestIdNotice());
                        mVar.mo57442b(this.f21289b.getAdSpaceT());
                    }
                    mVar.mo57457h("2");
                    C8524c.m24636a(mVar, this.f21288a);
                }
            } catch (Exception e) {
                C8608u.m24884d(NativeController.f21188e, C8737a.m25353a(e));
            }
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

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C2294d m25399e() {
        C2294d e = C2283b.m5275a().mo15569e("", this.f21221j);
        this.f21206S = e;
        if (e == null) {
            this.f21206S = C2294d.m5325d(this.f21221j);
        }
        return this.f21206S;
    }

    /* renamed from: b */
    private List<Campaign> m25385b(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign remove = list.remove(size);
                    C8736c.m25352a(campaignEx.getType()).mo58106a(this.f21221j, remove, this.f21204Q);
                    C8608u.m24880a(f21188e, "remove no videoURL ads:" + remove);
                }
            }
        }
        return list;
    }

    /* renamed from: c */
    private List<Campaign> m25394c(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign next : list) {
                if (next instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) next;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m25376a(List<Campaign> list, C8751b bVar) {
        m25402f();
        final long currentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.f21203P = timer;
        final C8751b bVar2 = bVar;
        final List<Campaign> list2 = list;
        timer.schedule(new TimerTask() {
            public final void run() {
                boolean z;
                if (System.currentTimeMillis() - currentTimeMillis >= 60000) {
                    bVar2.mo58127a();
                    NativeController.this.m25402f();
                    return;
                }
                int n = C8596q.m24849n(NativeController.this.f21220i);
                int j = NativeController.this.m25399e().mo15597j();
                if (n != 9 && j == 2) {
                    bVar2.mo58127a();
                    NativeController.this.m25402f();
                } else if (j == 3) {
                    bVar2.mo58127a();
                    NativeController.this.m25402f();
                } else {
                    loop0:
                    while (true) {
                        z = false;
                        for (Campaign campaign : list2) {
                            String id = campaign.getId();
                            if (campaign instanceof CampaignEx) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(id);
                                CampaignEx campaignEx = (CampaignEx) campaign;
                                sb.append(campaignEx.getVideoUrlEncode());
                                sb.append(campaignEx.getBidToken());
                                id = sb.toString();
                            }
                            C9552a a = C9556c.getInstance().mo63224a(NativeController.this.f21221j, id);
                            if (a != null && C9581k.m27504a(a, NativeController.this.m25399e().mo15591e())) {
                                z = true;
                            }
                        }
                        break loop0;
                    }
                    if (z) {
                        bVar2.mo58127a();
                        NativeController.this.m25402f();
                    }
                }
            }
        }, 0, 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25402f() {
        Timer timer = this.f21203P;
        if (timer != null) {
            timer.cancel();
            this.f21203P = null;
        }
    }

    /* renamed from: b */
    public final String mo58118b() {
        return this.f21205R;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public List<Campaign> m25397d(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign next : list) {
            if (next instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) next;
                if (TextUtils.isEmpty(this.f21204Q) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.f21204Q) && TextUtils.equals(campaignEx.getBidToken(), this.f21204Q)) {
                    arrayList.add(next);
                }
            } else {
                arrayList2.add(next);
            }
        }
        return TextUtils.isEmpty(this.f21204Q) ? arrayList2 : arrayList;
    }

    /* renamed from: a */
    static /* synthetic */ void m25370a(NativeController nativeController, CampaignEx campaignEx) {
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            if (campaignEx != null && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57384e() != null) {
                C2295a.m5362a(nativeController.f21220i, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57384e(), false, false);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m25371a(NativeController nativeController, final CampaignEx campaignEx, View view, List list, AdSession adSession) {
        try {
            C87477 r0 = new C8757a.C8761a() {
                /* renamed from: a */
                public final void mo58126a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
                    if (arrayList != null && arrayList.size() > 0) {
                        C8775b.m25513a(campaignEx, NativeController.this.f21220i, NativeController.this.f21221j, NativeController.this.f21218g);
                    }
                }
            };
            C8757a aVar = new C8757a(list, r0, new Handler(Looper.getMainLooper()));
            aVar.mo58137a(view);
            if (nativeController.f21194G != null) {
                nativeController.f21194G.add(aVar);
            }
            if (nativeController.f21195H != null) {
                nativeController.f21195H.add(r0);
            }
            if (adSession != null) {
                AdEvents.createAdEvents(adSession).impressionOccurred();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|44) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.mbridge.msdk.foundation.tools.C8608u.m24884d(f21188e, "please import the videocommon and nativex aar");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0103 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m25389b(com.mbridge.msdk.mbnative.controller.NativeController r12, java.util.List r13) {
        /*
            java.lang.String r0 = "com.mbridge.msdk.videocommon.download.c"
            if (r13 == 0) goto L_0x0113
            int r1 = r13.size()     // Catch:{ all -> 0x010b }
            if (r1 <= 0) goto L_0x0113
            java.lang.String r1 = "com.mbridge.msdk.nativex.view.MBMediaView"
            java.lang.Class.forName(r1)     // Catch:{ all -> 0x0103 }
            java.lang.Class.forName(r0)     // Catch:{ all -> 0x0103 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "com.mbridge.msdk.videocommon.listener.a"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r2 = "getInstance"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0103 }
            r5 = 0
            java.lang.Object r2 = r2.invoke(r5, r4)     // Catch:{ all -> 0x0103 }
            if (r2 == 0) goto L_0x0079
            java.lang.String r4 = "createUnitCache"
            r6 = 5
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ all -> 0x0103 }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r3] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r9 = 1
            r7[r9] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r10 = 2
            r7[r10] = r8     // Catch:{ all -> 0x0103 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0103 }
            r11 = 3
            r7[r11] = r8     // Catch:{ all -> 0x0103 }
            r8 = 4
            r7[r8] = r1     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r1 = r0.getMethod(r4, r7)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0103 }
            android.content.Context r6 = r12.f21220i     // Catch:{ all -> 0x0103 }
            r4[r3] = r6     // Catch:{ all -> 0x0103 }
            java.lang.String r6 = r12.f21221j     // Catch:{ all -> 0x0103 }
            r4[r9] = r6     // Catch:{ all -> 0x0103 }
            r4[r10] = r13     // Catch:{ all -> 0x0103 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0103 }
            r4[r11] = r6     // Catch:{ all -> 0x0103 }
            r4[r8] = r5     // Catch:{ all -> 0x0103 }
            r1.invoke(r2, r4)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "load"
            java.lang.Class[] r4 = new java.lang.Class[r9]     // Catch:{ all -> 0x0103 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch:{ all -> 0x0103 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch:{ all -> 0x0103 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x0103 }
            java.lang.String r4 = r12.f21221j     // Catch:{ all -> 0x0103 }
            r1[r3] = r4     // Catch:{ all -> 0x0103 }
            r0.invoke(r2, r1)     // Catch:{ all -> 0x0103 }
        L_0x0079:
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0103 }
        L_0x007d:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0     // Catch:{ all -> 0x0103 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r1 = r0.getImageUrl()     // Catch:{ all -> 0x0103 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0103 }
            if (r1 != 0) goto L_0x00ad
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C2350a.m5601e()     // Catch:{ all -> 0x0103 }
            android.content.Context r1 = r1.mo15792g()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.foundation.same.c.b r1 = com.mbridge.msdk.foundation.same.p301c.C8425b.m24339a((android.content.Context) r1)     // Catch:{ all -> 0x0103 }
            java.lang.String r2 = r0.getImageUrl()     // Catch:{ all -> 0x0103 }
            com.mbridge.msdk.mbnative.controller.NativeController$2 r3 = new com.mbridge.msdk.mbnative.controller.NativeController$2     // Catch:{ all -> 0x0103 }
            r3.<init>()     // Catch:{ all -> 0x0103 }
            r1.mo57506a((java.lang.String) r2, (com.mbridge.msdk.foundation.same.p301c.C8428c) r3)     // Catch:{ all -> 0x0103 }
        L_0x00ad:
            java.lang.String r1 = "com.mbridge.msdk.videocommon.download.g"
            java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x007d }
            java.lang.String r1 = r0.getendcard_url()     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x007d }
            if (r2 != 0) goto L_0x007d
            java.lang.String r2 = ".zip"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x007d }
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = "md5filename"
            boolean r2 = r1.contains(r2)     // Catch:{ Exception -> 0x007d }
            if (r2 == 0) goto L_0x00e7
            com.mbridge.msdk.videocommon.download.g r2 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo63242b((java.lang.String) r1)     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.mbnative.controller.NativeController$g r3 = new com.mbridge.msdk.mbnative.controller.NativeController$g     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r12.f21221j     // Catch:{ Exception -> 0x007d }
            r3.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x007d }
            r0.mo63243b(r1, r3)     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x00e7:
            com.mbridge.msdk.videocommon.download.h r2 = com.mbridge.msdk.videocommon.download.C9572h.m27477a()     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = r2.mo63246b(r1)     // Catch:{ Exception -> 0x007d }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.mbnative.controller.NativeController$d r3 = new com.mbridge.msdk.mbnative.controller.NativeController$d     // Catch:{ Exception -> 0x007d }
            java.lang.String r4 = r12.f21221j     // Catch:{ Exception -> 0x007d }
            r3.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x007d }
            com.mbridge.msdk.videocommon.download.g r0 = com.mbridge.msdk.videocommon.download.C9563g.m27460a()     // Catch:{ Exception -> 0x007d }
            r0.mo63243b(r1, r3)     // Catch:{ Exception -> 0x007d }
            goto L_0x007d
        L_0x0103:
            java.lang.String r12 = f21188e     // Catch:{ all -> 0x010b }
            java.lang.String r13 = "please import the videocommon and nativex aar"
            com.mbridge.msdk.foundation.tools.C8608u.m24884d(r12, r13)     // Catch:{ all -> 0x010b }
            goto L_0x0113
        L_0x010b:
            r12 = move-exception
            boolean r13 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r13 == 0) goto L_0x0113
            r12.printStackTrace()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbnative.controller.NativeController.m25389b(com.mbridge.msdk.mbnative.controller.NativeController, java.util.List):void");
    }

    /* renamed from: a */
    static /* synthetic */ List m25365a(NativeController nativeController, List list, boolean z) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = (Campaign) list.get(size);
                String id = campaign.getId();
                boolean z2 = campaign instanceof CampaignEx;
                if (z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb.append(campaignEx.getVideoUrlEncode());
                    sb.append(campaignEx.getBidToken());
                    id = sb.toString();
                }
                C9552a a = C9556c.getInstance().mo63224a(nativeController.f21221j, id);
                if (z) {
                    if (a == null || !C9581k.m27504a(a, nativeController.m25399e().mo15591e())) {
                        C8736c.m25352a(campaign.getType()).mo58106a(nativeController.f21221j, (Campaign) list.remove(size), nativeController.f21204Q);
                    }
                } else if (z2) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (a == null || !C9581k.m27504a(a, nativeController.m25399e().mo15591e()))) {
                        C8736c.m25352a(campaign.getType()).mo58106a(nativeController.f21221j, (Campaign) list.remove(size), nativeController.f21204Q);
                    }
                }
            }
        }
        return list;
    }
}
