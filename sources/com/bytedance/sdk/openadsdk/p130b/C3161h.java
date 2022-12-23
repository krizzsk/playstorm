package com.bytedance.sdk.openadsdk.p130b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.C3581n;
import com.bytedance.sdk.openadsdk.p130b.C3168k;
import com.bytedance.sdk.openadsdk.utils.C3972a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.h */
/* compiled from: AdEventThread */
public class C3161h<T extends C3168k> extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public static String f7467a = "AdEventThread";

    /* renamed from: b */
    public static String f7468b = "ttad_bk";

    /* renamed from: c */
    public final C3159f<T> f7469c;

    /* renamed from: d */
    public C3581n<T> f7470d;

    /* renamed from: e */
    public final List<T> f7471e;

    /* renamed from: f */
    public long f7472f;

    /* renamed from: g */
    public boolean f7473g;

    /* renamed from: h */
    public int f7474h;

    /* renamed from: i */
    public Handler f7475i;

    /* renamed from: j */
    public final C3163a f7476j;

    /* renamed from: k */
    public final C3164b f7477k;

    /* renamed from: l */
    private final C3161h<T>.c f7478l;

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$a */
    /* compiled from: AdEventThread */
    public interface C3163a {
        /* renamed from: a */
        boolean mo18766a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18763a() {
        return true;
    }

    public C3161h(C3159f<T> fVar, C3581n<T> nVar, C3164b bVar, C3163a aVar) {
        this(f7468b, f7467a, fVar, nVar, bVar, aVar);
    }

    public C3161h(String str, String str2, C3159f<T> fVar, C3581n<T> nVar, C3164b bVar, C3163a aVar) {
        super(str);
        this.f7478l = new C3165c();
        f7467a = str2;
        this.f7477k = bVar;
        this.f7476j = aVar;
        this.f7469c = fVar;
        this.f7470d = nVar;
        this.f7471e = Collections.synchronizedList(new LinkedList());
        if (C3578m.m11231a() != null) {
            try {
                C3578m.m11231a().registerReceiver(this.f7478l, new IntentFilter(C3972a.f10194a));
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.f7472f = System.currentTimeMillis();
        this.f7475i = new Handler(getLooper(), this);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m9231a((C3168k) message.obj);
                return true;
            case 2:
                m9248f();
                return true;
            case 3:
                m9245e();
                return true;
            case 4:
                m9243d();
                return true;
            case 5:
                m9237b();
                return true;
            case 6:
                m9241c();
                return true;
            default:
                return true;
        }
    }

    /* renamed from: b */
    private void m9237b() {
        this.f7469c.mo18752a(this.f7477k.f7482d, this.f7477k.f7483e);
        this.f7473g = this.f7469c.mo18757a();
        this.f7474h = this.f7469c.mo18758b();
        if (this.f7473g) {
            m9232a("onHandleInitEvent serverBusy, retryCount = " + this.f7474h);
            m9250h();
            return;
        }
        m9238b(this.f7469c.mo18750a(30, "_id"));
        m9232a("onHandleInitEvent cacheData count = " + this.f7471e.size());
        m9249g();
    }

    /* renamed from: c */
    private void m9241c() {
        this.f7469c.mo18752a(this.f7477k.f7482d, this.f7477k.f7483e);
        this.f7473g = this.f7469c.mo18757a();
        this.f7474h = this.f7469c.mo18758b();
        if (this.f7473g) {
            m9232a("onHandleInitEvent serverBusy, retryCount = " + this.f7474h);
            m9250h();
            return;
        }
        m9238b(this.f7469c.mo18750a(30, "_id"));
        m9244d(this.f7471e);
        m9232a("onHandleInitEvent cacheData count = " + this.f7471e.size());
        m9249g();
    }

    /* renamed from: b */
    private void m9238b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T d : this.f7471e) {
                        hashSet.add(d.mo18657d());
                    }
                    for (T t : list) {
                        if (!hashSet.contains(t.mo18657d())) {
                            this.f7471e.add(t);
                        }
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        m9232a("reloadCacheList adEventList is empty======");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045 A[LOOP:0: B:11:0x0045->B:14:0x0060, LOOP_START] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9243d() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.b.h$a r0 = r4.f7476j
            boolean r0 = r0.mo18766a()
            if (r0 != 0) goto L_0x0016
            r0 = 4
            com.bytedance.sdk.openadsdk.b.h$b r1 = r4.f7477k
            long r1 = r1.f7481c
            r4.m9230a((int) r0, (long) r1)
            java.lang.String r0 = "onHandleServerBusyRetryEvent, no net"
            r4.m9232a((java.lang.String) r0)
            return
        L_0x0016:
            com.bytedance.sdk.openadsdk.b.f<T> r0 = r4.f7469c
            r1 = 30
            java.lang.String r2 = "_id"
            java.util.List r0 = r0.mo18750a((int) r1, (java.lang.String) r2)
            boolean r1 = com.bytedance.sdk.component.utils.C2970j.m8370a(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "onHandleServerBusyRetryEvent, empty list start routine"
            r4.m9232a((java.lang.String) r0)
            r4.m9256n()
            r4.m9252j()
            return
        L_0x0032:
            boolean r1 = r4.mo18763a()
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.HashMap r0 = r4.m9247f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r2
            boolean r1 = r4.m9236a(r1, (boolean) r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0066
        L_0x0063:
            r4.m9236a(r0, (boolean) r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3161h.m9243d():void");
    }

    /* renamed from: a */
    private boolean m9236a(List<T> list, boolean z) {
        C3166i a = mo18762a(list);
        if (a == null) {
            return false;
        }
        if (a.f7486a) {
            m9232a("onHandleServerBusyRetryEvent, success");
            m9246e(list);
            m9233a(z);
            return true;
        } else if (m9234a(a)) {
            int i = this.f7474h + 1;
            this.f7474h = i;
            this.f7469c.mo18751a(i);
            this.f7469c.mo18755a(list, this.f7477k.f7482d, this.f7477k.f7483e);
            m9250h();
            m9232a("onHandleServerBusyRetryEvent, serverbusy, count = " + this.f7474h);
            return false;
        } else if (m9239b(a) || m9235a(list, a)) {
            m9246e(list);
            m9233a(true);
            return false;
        } else {
            m9251i();
            return false;
        }
    }

    /* renamed from: c */
    private boolean m9242c(List<T> list) {
        JSONObject b;
        if (list == null || list.size() == 0 || !(list.get(0) instanceof C3126a) || (b = ((C3126a) list.get(0)).mo18655b()) == null) {
            return true;
        }
        return TextUtils.isEmpty(b.optString("app_log_url"));
    }

    /* renamed from: a */
    public C3166i mo18762a(List<T> list) {
        if (this.f7470d == null) {
            C3578m.m11239f();
        }
        C3581n<T> nVar = this.f7470d;
        if (nVar == null) {
            return null;
        }
        return nVar.mo20071a(list);
    }

    /* renamed from: e */
    private void m9245e() {
        if (!this.f7473g) {
            m9232a("onHandleRoutineRetryEvent");
            m9249g();
        }
    }

    /* renamed from: f */
    private void m9248f() {
        if (!this.f7473g) {
            m9232a("onHandleRoutineUploadEvent");
            m9249g();
        }
    }

    /* renamed from: a */
    private void m9231a(T t) {
        C2975l.m8384b("ReportEvent", "execute onHandleReceivedAdEvent()  start...");
        this.f7469c.mo18753a(t);
        if (!this.f7473g) {
            m9232a("onHandleReceivedAdEvent");
            this.f7471e.add(t);
            m9244d(this.f7471e);
            C2975l.m8384b("ReportEvent", "execute onHandleReceivedAdEvent() ... mIsServerBusy =" + this.f7473g);
            if (m9255m()) {
                C2975l.m8384b("ReportEvent", "execute onHandleReceivedAdEvent()  needUploadRoutine ... upload ");
                m9249g();
            }
        }
    }

    /* renamed from: d */
    private void m9244d(List<T> list) {
        if (list != null) {
            if (list.size() <= 45) {
                m9232a("start and return, checkAndDeleteEvent local size:" + list.size() + "less than:" + 45);
                return;
            }
            int size = list.size() - 30;
            m9232a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add((C3168k) list.get(i));
            }
            list.removeAll(arrayList);
            m9232a("end checkAndDeleteEvent local size:" + list.size());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b A[LOOP:0: B:11:0x006b->B:14:0x0086, LOOP_START] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9249g() {
        /*
            r4 = this;
            java.lang.String r0 = "ReportEvent"
            java.lang.String r1 = "execute doRoutineUpload ... start "
            com.bytedance.sdk.component.utils.C2975l.m8387c(r0, r1)
            android.os.Handler r1 = r4.f7475i
            r2 = 3
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f7475i
            r2 = 2
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f7475i
            r2 = 6
            r1.removeMessages(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "execute doRoutineUpload ... ListUtils.isEmpty(mCacheList) :"
            r1.append(r2)
            java.util.List<T> r2 = r4.f7471e
            boolean r2 = com.bytedance.sdk.component.utils.C2970j.m8370a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2975l.m8387c(r0, r1)
            java.util.List<T> r1 = r4.f7471e
            boolean r1 = com.bytedance.sdk.component.utils.C2970j.m8370a(r1)
            if (r1 == 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()
            r4.f7472f = r0
            r4.m9252j()
            return
        L_0x0045:
            com.bytedance.sdk.openadsdk.b.h$a r1 = r4.f7476j
            boolean r1 = r1.mo18766a()
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "execute doRoutineUpload ...no network, wait retry "
            com.bytedance.sdk.component.utils.C2975l.m8387c(r0, r1)
            r4.m9251i()
            return
        L_0x0056:
            boolean r0 = r4.mo18763a()
            r1 = 1
            if (r0 == 0) goto L_0x0089
            java.util.List<T> r0 = r4.f7471e
            java.util.HashMap r0 = r4.m9247f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r1
            boolean r2 = r4.m9240b(r2, r3)
            if (r2 != 0) goto L_0x006b
            goto L_0x008e
        L_0x0089:
            java.util.List<T> r0 = r4.f7471e
            r4.m9240b(r0, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3161h.m9249g():void");
    }

    /* renamed from: b */
    private boolean m9240b(List<T> list, boolean z) {
        C3166i a = mo18762a(list);
        if (a == null) {
            return false;
        }
        if (a.f7486a) {
            C2975l.m8387c("ReportEvent", "doRoutineUpload success");
            m9246e(list);
            m9233a(z);
            return true;
        } else if (m9234a(a)) {
            m9253k();
            return false;
        } else if (m9239b(a) || m9235a(list, a)) {
            m9246e(list);
            m9233a(true);
            return false;
        } else if (this.f7473g) {
            return false;
        } else {
            m9251i();
            return false;
        }
    }

    /* renamed from: a */
    private void m9233a(boolean z) {
        this.f7472f = System.currentTimeMillis();
        m9256n();
        if (z) {
            m9252j();
        }
    }

    /* renamed from: e */
    private void m9246e(List<T> list) {
        this.f7469c.mo18754a(list);
        this.f7471e.removeAll(list);
    }

    /* renamed from: h */
    private void m9250h() {
        m9230a(4, m9254l());
    }

    /* renamed from: i */
    private void m9251i() {
        m9230a(3, this.f7477k.f7481c);
    }

    /* renamed from: j */
    private void m9252j() {
        m9230a(2, this.f7477k.f7480b);
    }

    /* renamed from: a */
    private void m9230a(int i, long j) {
        Message obtainMessage = this.f7475i.obtainMessage();
        obtainMessage.what = i;
        this.f7475i.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: k */
    private void m9253k() {
        this.f7473g = true;
        this.f7469c.mo18756a(true);
        this.f7471e.clear();
        this.f7475i.removeMessages(3);
        this.f7475i.removeMessages(2);
        m9250h();
    }

    /* renamed from: l */
    private long m9254l() {
        return ((long) ((this.f7474h % 3) + 1)) * this.f7477k.f7484f;
    }

    /* renamed from: a */
    private static boolean m9234a(C3166i iVar) {
        return iVar.f7487b == 509;
    }

    /* renamed from: a */
    private boolean m9235a(List<T> list, C3166i iVar) {
        if (!m9242c(list) && iVar.f7487b >= 400 && iVar.f7487b < 500) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m9239b(C3166i iVar) {
        return iVar.f7489d;
    }

    /* renamed from: m */
    private boolean m9255m() {
        return !this.f7473g && (this.f7471e.size() >= this.f7477k.f7479a || System.currentTimeMillis() - this.f7472f >= this.f7477k.f7480b);
    }

    /* renamed from: n */
    private void m9256n() {
        this.f7473g = false;
        this.f7469c.mo18756a(false);
        this.f7474h = 0;
        this.f7469c.mo18751a(0);
        this.f7475i.removeMessages(4);
    }

    /* renamed from: a */
    private void m9232a(String str) {
        C2975l.m8387c(f7467a, str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$b */
    /* compiled from: AdEventThread */
    public static class C3164b {

        /* renamed from: a */
        final int f7479a;

        /* renamed from: b */
        final long f7480b;

        /* renamed from: c */
        final long f7481c;

        /* renamed from: d */
        final int f7482d;

        /* renamed from: e */
        final long f7483e;

        /* renamed from: f */
        final long f7484f;

        C3164b(int i, long j, long j2, int i2, long j3, long j4) {
            this.f7479a = i;
            this.f7480b = j;
            this.f7481c = j2;
            this.f7482d = i2;
            this.f7483e = j3;
            this.f7484f = j4;
        }

        /* renamed from: a */
        public static C3164b m9260a() {
            return new C3164b(1, 120000, 15000, 5, 172800000, 300000);
        }

        /* renamed from: b */
        public static C3164b m9261b() {
            return new C3164b(3, 120000, 15000, 5, 172800000, 300000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r6.get(r1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap<java.lang.String, java.util.List<T>> m9247f(java.util.List<T> r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x003c
            java.lang.Object r2 = r6.get(r1)
            boolean r2 = r2 instanceof com.bytedance.sdk.openadsdk.p130b.C3126a
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r6.get(r1)
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p130b.C3126a) r2
            org.json.JSONObject r3 = r2.mo18655b()
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "app_log_url"
            java.lang.String r3 = r3.optString(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0036
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L_0x0036:
            r4.add(r2)
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p130b.C3161h.m9247f(java.util.List):java.util.HashMap");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$c */
    /* compiled from: AdEventThread */
    private class C3165c extends BroadcastReceiver {
        private C3165c() {
        }

        public void onReceive(Context context, Intent intent) {
            C2975l.m8387c(C3161h.f7467a, "onReceive: timer event");
            if (C3161h.this.f7475i != null) {
                C3161h.this.f7475i.removeMessages(6);
                Message obtainMessage = C3161h.this.f7475i.obtainMessage();
                obtainMessage.what = 6;
                C3161h.this.f7475i.sendMessage(obtainMessage);
            }
        }
    }
}
