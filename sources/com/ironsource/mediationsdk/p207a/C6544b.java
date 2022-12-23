package com.ironsource.mediationsdk.p207a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.environment.C6399a;
import com.ironsource.environment.p202b.C6407b;
import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.C6490J;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6707p;
import com.ironsource.mediationsdk.sdk.C6723e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.p198b.C6386a;
import com.ironsource.p198b.C6387b;
import com.ironsource.p198b.C6388c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.b */
public abstract class C6544b {

    /* renamed from: A */
    private int f16897A = 1024;

    /* renamed from: B */
    private int f16898B = 5;

    /* renamed from: C */
    private String f16899C = "supersonic_sdk.db";

    /* renamed from: D */
    private String f16900D = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: E */
    private String f16901E = "placement";

    /* renamed from: F */
    private final String f16902F = "abt";

    /* renamed from: G */
    private final String f16903G = "mt";

    /* renamed from: H */
    private C6543a f16904H;

    /* renamed from: I */
    private int f16905I = 5000;

    /* renamed from: J */
    private int[] f16906J;

    /* renamed from: K */
    private Map<String, String> f16907K = new HashMap();

    /* renamed from: L */
    private C6707p f16908L;

    /* renamed from: M */
    private final Object f16909M = new Object();

    /* renamed from: a */
    public boolean f16910a;

    /* renamed from: b */
    boolean f16911b = false;

    /* renamed from: c */
    public boolean f16912c = false;

    /* renamed from: d */
    C6386a f16913d;

    /* renamed from: e */
    ArrayList<C6552c> f16914e;

    /* renamed from: f */
    public boolean f16915f = true;

    /* renamed from: g */
    int f16916g;

    /* renamed from: h */
    String f16917h;

    /* renamed from: i */
    Context f16918i;

    /* renamed from: j */
    int f16919j = 100;

    /* renamed from: k */
    int f16920k = 1;

    /* renamed from: l */
    int[] f16921l;

    /* renamed from: m */
    int[] f16922m;

    /* renamed from: n */
    int[] f16923n;

    /* renamed from: o */
    Map<String, String> f16924o = new HashMap();

    /* renamed from: p */
    public String f16925p = "";

    /* renamed from: q */
    int f16926q;

    /* renamed from: r */
    String f16927r;

    /* renamed from: s */
    String f16928s;

    /* renamed from: t */
    Set<Integer> f16929t;

    /* renamed from: u */
    C6551b f16930u;

    /* renamed from: v */
    public IronSourceSegment f16931v;

    /* renamed from: w */
    private int f16932w = 1;

    /* renamed from: x */
    private int f16933x = 100;

    /* renamed from: y */
    private int f16934y = 5000;

    /* renamed from: z */
    private int f16935z = 90000;

    /* renamed from: com.ironsource.mediationsdk.a.b$a */
    public enum C6550a {
        NOT_SUPPORTED(-1),
        OFFERWALL(1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        BANNER(8);
        

        /* renamed from: f */
        int f16950f;

        private C6550a(int i) {
            this.f16950f = i;
        }
    }

    /* renamed from: com.ironsource.mediationsdk.a.b$b */
    class C6551b extends HandlerThread {

        /* renamed from: a */
        Handler f16951a;

        C6551b(String str) {
            super(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo36389a(Runnable runnable) {
            this.f16951a.post(runnable);
        }
    }

    /* renamed from: a */
    private ArrayList<C6552c> m19884a(ArrayList<C6552c> arrayList, ArrayList<C6552c> arrayList2, int i) {
        ArrayList<C6552c> arrayList3 = new ArrayList<>();
        try {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            arrayList4.addAll(arrayList2);
            Collections.sort(arrayList4, new Comparator<C6552c>() {
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return ((C6552c) obj).mo36393b() >= ((C6552c) obj2).mo36393b() ? 1 : -1;
                }
            });
            if (arrayList4.size() <= i) {
                arrayList3.addAll(arrayList4);
            } else {
                arrayList3.addAll(arrayList4.subList(0, i));
                this.f16913d.mo35868a(arrayList4.subList(i, arrayList4.size()), this.f16928s);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("CombinedEventList exception: " + e.getMessage());
        }
        return arrayList3;
    }

    /* renamed from: a */
    static /* synthetic */ void m19885a(C6544b bVar) {
        synchronized (bVar.f16909M) {
            bVar.f16913d.mo35868a(bVar.f16914e, bVar.f16928s);
            bVar.f16914e.clear();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m19886a(C6544b bVar, C6552c cVar, String str) {
        JSONObject d = cVar.mo36395d();
        if (d != null && d.has(str)) {
            try {
                String optString = d.optString(str, (String) null);
                if (optString != null) {
                    cVar.mo36392a(str, (Object) optString.substring(0, Math.min(optString.length(), 1024)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private void m19887a(String str) {
        C6543a aVar = this.f16904H;
        if (aVar == null || !aVar.mo36357c().equals(str)) {
            this.f16904H = C6552c.m19923a(str, this.f16926q);
        }
    }

    /* renamed from: a */
    public static void m19888a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put(IronSourceConstants.AUCTION_FALLBACK, str);
        }
    }

    /* renamed from: a */
    static boolean m19890a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19892d() {
        ArrayList<C6552c> a;
        this.f16911b = false;
        synchronized (this.f16909M) {
            a = m19884a(this.f16914e, this.f16913d.mo35867a(this.f16928s), this.f16905I);
            if (a.size() > 0) {
                this.f16914e.clear();
                this.f16913d.mo35869b(this.f16928s);
            }
        }
        if (a.size() > 0) {
            this.f16916g = 0;
            JSONObject b = C6723e.m20496a().mo36912b();
            try {
                if (this.f16931v != null) {
                    if (this.f16931v.getAge() > 0) {
                        b.put("age", this.f16931v.getAge());
                    }
                    if (!TextUtils.isEmpty(this.f16931v.getGender())) {
                        b.put(IronSourceSegment.GENDER, this.f16931v.getGender());
                    }
                    if (this.f16931v.getLevel() > 0) {
                        b.put(IronSourceSegment.LEVEL, this.f16931v.getLevel());
                    }
                    if (this.f16931v.getIsPaying() != null) {
                        b.put(IronSourceSegment.PAYING, this.f16931v.getIsPaying().get());
                    }
                    if (this.f16931v.getIapt() > 0.0d) {
                        b.put(IronSourceSegment.IAPT, this.f16931v.getIapt());
                    }
                    if (this.f16931v.getUcd() > 0) {
                        b.put(IronSourceSegment.USER_CREATION_DATE, this.f16931v.getUcd());
                    }
                }
                if (this.f16908L != null) {
                    String str = this.f16908L.f17556b;
                    if (!TextUtils.isEmpty(str)) {
                        b.put("segmentId", str);
                    }
                    JSONObject jSONObject = this.f16908L.f17557c;
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b.put(next, jSONObject.get(next));
                    }
                }
            } catch (JSONException e) {
                try {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f16925p;
            if (!TextUtils.isEmpty(str2)) {
                b.put("abt", str2);
            }
            String str3 = C6490J.m19474a().f16549o;
            if (!TextUtils.isEmpty(str3)) {
                b.put("mt", str3);
            }
            Map<String, String> map = this.f16907K;
            if (!map.isEmpty()) {
                for (Map.Entry next2 : map.entrySet()) {
                    if (!b.has((String) next2.getKey())) {
                        b.put((String) next2.getKey(), next2.getValue());
                    }
                }
            }
            C6407b bVar = new C6407b();
            JSONObject a2 = bVar.f16295b.mo36837a(bVar.f16294a);
            Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
            Iterator<String> keys2 = a2.keys();
            while (keys2.hasNext()) {
                String next3 = keys2.next();
                b.put(next3, a2.get(next3));
            }
            String a3 = this.f16904H.mo36354a(a, b);
            if (TextUtils.isEmpty(a3)) {
                IronLog.INTERNAL.error("Failed to parse events. Saving them back to storage.");
                mo36364a(a);
                return;
            }
            if (this.f16912c) {
                try {
                    a3 = Base64.encodeToString(C6399a.C64001.m19222b(a3), 0);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            C6423c.f16330a.mo35934c(new C6387b(new C6388c() {
                /* renamed from: a */
                public final synchronized void mo35873a(final ArrayList<C6552c> arrayList, final boolean z) {
                    C6544b.this.f16930u.mo36389a(new Runnable() {
                        public final void run() {
                            if (z) {
                                ArrayList<C6552c> a = C6544b.this.f16913d.mo35867a(C6544b.this.f16928s);
                                C6544b.this.f16916g = a.size() + C6544b.this.f16914e.size();
                                return;
                            }
                            IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                            C6544b.this.mo36364a((ArrayList<C6552c>) arrayList);
                        }
                    });
                }
            }, a3, this.f16904H.mo36353a(), a));
        }
    }

    /* renamed from: e */
    protected static int m19893e(int i) {
        C6550a aVar;
        int i2 = C6550a.NOT_SUPPORTED.f16950f;
        if (i == 15 || (i >= 300 && i < 400)) {
            aVar = C6550a.OFFERWALL;
        } else if ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000)) {
            aVar = C6550a.REWARDED_VIDEO;
        } else if ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000)) {
            aVar = C6550a.INTERSTITIAL;
        } else if ((i < 3000 || i >= 4000) && (i < 93000 || i >= 94000)) {
            return i2;
        } else {
            aVar = C6550a.BANNER;
        }
        return aVar.f16950f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int mo36358a(C6552c cVar) {
        return cVar.mo36390a() + 90000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36359a() {
        this.f16914e = new ArrayList<>();
        this.f16916g = 0;
        this.f16904H = C6552c.m19923a(this.f16927r, this.f16926q);
        C6551b bVar = new C6551b(this.f16928s + "EventThread");
        this.f16930u = bVar;
        bVar.start();
        C6551b bVar2 = this.f16930u;
        bVar2.f16951a = new Handler(bVar2.getLooper());
        this.f16917h = IronSourceUtils.getSessionId();
        this.f16929t = new HashSet();
        mo36369b();
    }

    /* renamed from: a */
    public final void mo36360a(int i) {
        if (i > 0) {
            this.f16920k = i;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36361a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f16928s, this.f16927r);
        this.f16927r = defaultEventsFormatterType;
        m19887a(defaultEventsFormatterType);
        this.f16904H.f16891c = IronSourceUtils.getDefaultEventsURL(context, this.f16928s, (String) null);
        this.f16913d = C6386a.m19169a(context, "supersonic_sdk.db", 5);
        this.f16930u.mo36389a(new Runnable() {
            public final void run() {
                C6544b.m19885a(C6544b.this);
            }
        });
        this.f16921l = IronSourceUtils.getDefaultOptOutEvents(context, this.f16928s);
        this.f16922m = IronSourceUtils.getDefaultOptInEvents(context, this.f16928s);
        this.f16923n = IronSourceUtils.getDefaultTriggerEvents(context, this.f16928s);
        this.f16906J = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f16928s);
        this.f16931v = ironSourceSegment;
        this.f16918i = context;
    }

    /* renamed from: a */
    public final synchronized void mo36362a(C6707p pVar) {
        this.f16908L = pVar;
    }

    /* renamed from: a */
    public final void mo36363a(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            C6543a aVar = this.f16904H;
            if (aVar != null) {
                aVar.f16891c = str;
            }
            IronSourceUtils.saveDefaultEventsURL(context, this.f16928s, str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36364a(ArrayList<C6552c> arrayList) {
        if (arrayList != null) {
            synchronized (this.f16909M) {
                this.f16913d.mo35868a(arrayList, this.f16928s);
                this.f16916g = this.f16913d.mo35867a(this.f16928s).size() + this.f16914e.size();
            }
        }
    }

    /* renamed from: a */
    public final void mo36365a(Map<String, String> map) {
        this.f16907K.putAll(map);
    }

    /* renamed from: a */
    public final void mo36366a(int[] iArr, Context context) {
        this.f16921l = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f16928s, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo36367a(int i, int[] iArr) {
        if (!m19890a(iArr)) {
            return false;
        }
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return m19890a(r1.f16906J) ? mo36367a(r3.mo36390a(), r1.f16906J) : r1.f16929t.contains(java.lang.Integer.valueOf(r3.mo36390a()));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo36368a(java.lang.String r2, com.ironsource.mediationsdk.p207a.C6552c r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "none"
            boolean r2 = r2.equalsIgnoreCase(r0)     // Catch:{ all -> 0x002f }
            if (r2 != 0) goto L_0x000c
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000c:
            int[] r2 = r1.f16906J     // Catch:{ all -> 0x002f }
            boolean r2 = m19890a((int[]) r2)     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x001f
            int r2 = r3.mo36390a()     // Catch:{ all -> 0x002f }
            int[] r3 = r1.f16906J     // Catch:{ all -> 0x002f }
            boolean r2 = r1.mo36367a((int) r2, (int[]) r3)     // Catch:{ all -> 0x002f }
            goto L_0x002d
        L_0x001f:
            java.util.Set<java.lang.Integer> r2 = r1.f16929t     // Catch:{ all -> 0x002f }
            int r3 = r3.mo36390a()     // Catch:{ all -> 0x002f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x002f }
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r1)
            return r2
        L_0x002f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.p207a.C6544b.mo36368a(java.lang.String, com.ironsource.mediationsdk.a.c):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo36369b() {
    }

    /* renamed from: b */
    public final void mo36370b(int i) {
        if (i > 0) {
            this.f16919j = i;
        }
    }

    /* renamed from: b */
    public final synchronized void mo36371b(final C6552c cVar) {
        this.f16930u.mo36389a(new Runnable() {
            public final void run() {
                if (cVar != null && C6544b.this.f16915f) {
                    cVar.mo36392a("eventSessionId", (Object) C6544b.this.f16917h);
                    String connectionType = IronSourceUtils.getConnectionType(C6544b.this.f16918i);
                    if (C6544b.this.mo36384g(cVar)) {
                        cVar.mo36392a("connectionType", (Object) connectionType);
                    }
                    if (C6544b.this.mo36368a(connectionType, cVar)) {
                        C6552c cVar = cVar;
                        cVar.mo36391a(C6544b.this.mo36358a(cVar));
                    }
                    int e = C6544b.m19893e(cVar.mo36390a());
                    if (e != C6550a.NOT_SUPPORTED.f16950f) {
                        cVar.mo36392a(IronSourceConstants.EVENTS_AD_UNIT, (Object) Integer.valueOf(e));
                    }
                    C6544b.m19886a(C6544b.this, cVar, IronSourceConstants.EVENTS_ERROR_REASON);
                    C6544b.m19886a(C6544b.this, cVar, IronSourceConstants.EVENTS_EXT1);
                    if (!C6544b.this.f16924o.isEmpty()) {
                        for (Map.Entry next : C6544b.this.f16924o.entrySet()) {
                            if (!(cVar.mo36395d().has((String) next.getKey()) || next.getKey() == "eventId" || next.getKey() == "timestamp")) {
                                cVar.mo36392a((String) next.getKey(), next.getValue());
                            }
                        }
                    }
                    C6544b bVar = C6544b.this;
                    C6552c cVar2 = cVar;
                    boolean z = false;
                    if (cVar2 != null ? C6544b.m19890a(bVar.f16921l) ? !bVar.mo36367a(cVar2.mo36390a(), bVar.f16921l) : C6544b.m19890a(bVar.f16922m) ? bVar.mo36367a(cVar2.mo36390a(), bVar.f16922m) : true : false) {
                        if (C6544b.this.mo36383f(cVar)) {
                            JSONObject d = cVar.mo36395d();
                            if (!(d == null ? false : d.has(IronSourceConstants.KEY_SESSION_DEPTH))) {
                                cVar.mo36392a(IronSourceConstants.KEY_SESSION_DEPTH, (Object) Integer.valueOf(C6544b.this.mo36382e(cVar)));
                            }
                        }
                        if (!TextUtils.isEmpty(C6544b.this.mo36379d(cVar.mo36390a())) && C6544b.this.mo36378c(cVar)) {
                            C6552c cVar3 = cVar;
                            cVar3.mo36392a("placement", (Object) C6544b.this.mo36379d(cVar3.mo36390a()));
                        }
                        long firstSessionTimestamp = IronSourceUtils.getFirstSessionTimestamp(C6544b.this.f16918i);
                        if (firstSessionTimestamp != -1) {
                            cVar.mo36392a(IronSourceConstants.FIRST_SESSION_TIMESTAMP, (Object) Long.valueOf(firstSessionTimestamp));
                        }
                        try {
                            IronLog.EVENT.verbose(("{\"eventId\":" + cVar.mo36390a() + ",\"timestamp\":" + cVar.mo36393b() + "," + cVar.mo36394c().substring(1)).replace(",", "\n"));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        C6544b.this.f16914e.add(cVar);
                        C6544b.this.f16916g++;
                    }
                    boolean a = C6544b.m19890a(C6544b.this.f16923n) ? C6544b.this.mo36367a(cVar.mo36390a(), C6544b.this.f16923n) : C6544b.this.mo36381d(cVar);
                    if (!C6544b.this.f16911b && a) {
                        C6544b.this.f16911b = true;
                    }
                    if (C6544b.this.f16913d != null) {
                        C6544b bVar2 = C6544b.this;
                        if ((bVar2.f16916g >= bVar2.f16919j || bVar2.f16911b) && bVar2.f16910a) {
                            C6544b.this.m19892d();
                            return;
                        }
                        C6544b bVar3 = C6544b.this;
                        ArrayList<C6552c> arrayList = bVar3.f16914e;
                        if (arrayList != null && arrayList.size() >= bVar3.f16920k) {
                            z = true;
                        }
                        if (z || a) {
                            C6544b.m19885a(C6544b.this);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo36372b(String str, Context context) {
        if (!TextUtils.isEmpty(str)) {
            this.f16927r = str;
            IronSourceUtils.saveDefaultEventsFormatterType(context, this.f16928s, str);
            m19887a(str);
        }
    }

    /* renamed from: b */
    public final void mo36373b(Map<String, String> map) {
        this.f16924o.putAll(map);
    }

    /* renamed from: b */
    public final void mo36374b(int[] iArr, Context context) {
        this.f16922m = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f16928s, iArr);
    }

    /* renamed from: c */
    public final void mo36375c() {
        m19892d();
    }

    /* renamed from: c */
    public final void mo36376c(int i) {
        if (i > 0) {
            this.f16905I = i;
        }
    }

    /* renamed from: c */
    public final void mo36377c(int[] iArr, Context context) {
        this.f16923n = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f16928s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo36378c(C6552c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract String mo36379d(int i);

    /* renamed from: d */
    public final void mo36380d(int[] iArr, Context context) {
        this.f16906J = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f16928s, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract boolean mo36381d(C6552c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo36382e(C6552c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo36383f(C6552c cVar) {
        return (cVar.mo36390a() == 14 || cVar.mo36390a() == 114 || cVar.mo36390a() == 514 || cVar.mo36390a() == 140 || cVar.mo36390a() == 40 || cVar.mo36390a() == 41 || cVar.mo36390a() == 50 || cVar.mo36390a() == 51 || cVar.mo36390a() == 52) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo36384g(C6552c cVar) {
        return (cVar.mo36390a() == 40 || cVar.mo36390a() == 41 || cVar.mo36390a() == 50 || cVar.mo36390a() == 51 || cVar.mo36390a() == 52) ? false : true;
    }
}
