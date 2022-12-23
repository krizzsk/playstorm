package com.mbridge.msdk.p059d;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8407h;
import com.mbridge.msdk.foundation.p066db.C2372e;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2383n;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.reward.adapter.C9069b;
import com.mbridge.msdk.reward.adapter.C9090d;
import com.mbridge.msdk.videocommon.p373d.C9548a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.mbridge.msdk.d.a */
/* compiled from: LoopTimer */
public final class C2328a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f4838a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f4839b;

    /* renamed from: c */
    private LinkedList<C8407h> f4840c;

    /* renamed from: d */
    private LinkedList<C8407h> f4841d;

    /* renamed from: e */
    private int f4842e;

    /* renamed from: f */
    private int f4843f;

    /* renamed from: g */
    private C2372e f4844g;

    /* renamed from: h */
    private C9548a f4845h;

    /* renamed from: i */
    private C2383n f4846i;

    /* renamed from: j */
    private C2376g f4847j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f4848k;

    /* renamed from: com.mbridge.msdk.d.a$a */
    /* compiled from: LoopTimer */
    static class C2331a {

        /* renamed from: a */
        static C2328a f4852a = new C2328a();
    }

    private C2328a() {
        this.f4839b = false;
        this.f4840c = new LinkedList<>();
        this.f4841d = new LinkedList<>();
        this.f4842e = 0;
        this.f4843f = 0;
        this.f4848k = new Handler() {
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void handleMessage(android.os.Message r5) {
                /*
                    r4 = this;
                    com.mbridge.msdk.d.a r0 = com.mbridge.msdk.p059d.C2328a.this
                    monitor-enter(r0)
                    int r5 = r5.what     // Catch:{ all -> 0x0036 }
                    r1 = 1
                    if (r5 == r1) goto L_0x0012
                    r1 = 2
                    if (r5 == r1) goto L_0x000c
                    goto L_0x0034
                L_0x000c:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p059d.C2328a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p059d.C2328a.m5521c(r5)     // Catch:{ all -> 0x0036 }
                    goto L_0x0034
                L_0x0012:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p059d.C2328a.this     // Catch:{ all -> 0x0036 }
                    boolean r5 = r5.f4839b     // Catch:{ all -> 0x0036 }
                    if (r5 == 0) goto L_0x001c
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x001c:
                    com.mbridge.msdk.d.a r5 = com.mbridge.msdk.p059d.C2328a.this     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.d.a r2 = com.mbridge.msdk.p059d.C2328a.this     // Catch:{ all -> 0x0036 }
                    long r2 = r2.f4838a     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.p059d.C2328a.m5516a((com.mbridge.msdk.p059d.C2328a) r5, (long) r2)     // Catch:{ all -> 0x0036 }
                    android.os.Message r5 = r4.obtainMessage(r1)     // Catch:{ all -> 0x0036 }
                    com.mbridge.msdk.d.a r1 = com.mbridge.msdk.p059d.C2328a.this     // Catch:{ all -> 0x0036 }
                    long r1 = r1.f4838a     // Catch:{ all -> 0x0036 }
                    r4.sendMessageDelayed(r5, r1)     // Catch:{ all -> 0x0036 }
                L_0x0034:
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    return
                L_0x0036:
                    r5 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0036 }
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p059d.C2328a.C23291.handleMessage(android.os.Message):void");
            }
        };
    }

    /* renamed from: a */
    private boolean m5519a(C8407h hVar) {
        boolean z = false;
        if (hVar == null || TextUtils.isEmpty(hVar.mo57372a())) {
            return false;
        }
        String a = hVar.mo57372a();
        try {
            if (this.f4844g != null) {
                long j = 0;
                if (this.f4845h != null) {
                    j = this.f4845h.mo63114d();
                }
                int a2 = this.f4844g.mo15857a(a, j);
                if (a2 != -1) {
                    if (a2 != 1) {
                    }
                } else if (!TextUtils.isEmpty(a)) {
                    if (this.f4840c != null && this.f4840c.contains(a)) {
                        this.f4840c.remove(a);
                    } else if (this.f4841d != null && this.f4841d.contains(a)) {
                        this.f4841d.remove(a);
                    }
                    if (this.f4846i != null) {
                        this.f4846i.mo15924a(a);
                    }
                }
                try {
                    this.f4848k.sendMessage(this.f4848k.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                }
            }
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = true;
            C8608u.m24881a("LoopTimer", th.getMessage(), th);
            return z;
        }
    }

    /* renamed from: a */
    private void m5517a(String str, String str2, boolean z) {
        try {
            Context g = C2350a.m5601e().mo15792g();
            if (g != null) {
                final C9090d dVar = new C9090d(g, str, str2);
                dVar.mo60970b(z);
                dVar.mo60941a((C9069b) new C9069b() {
                    /* renamed from: a */
                    public final void mo15714a() {
                    }

                    /* renamed from: a */
                    public final void mo15715a(String str) {
                        C2328a.this.f4848k.sendMessage(C2328a.this.f4848k.obtainMessage(2));
                        dVar.mo60941a((C9069b) null);
                    }

                    /* renamed from: b */
                    public final void mo15716b(String str) {
                        C2328a.this.f4848k.sendMessage(C2328a.this.f4848k.obtainMessage(2));
                        dVar.mo60941a((C9069b) null);
                    }
                });
                dVar.mo60961a(1, 8000, false);
            }
        } catch (Exception e) {
            C8608u.m24881a("LoopTimer", e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public final void mo15711a(String str, String str2) {
        if (!this.f4840c.contains(str2)) {
            this.f4840c.add(new C8407h(str, str2, 94));
            C2383n nVar = this.f4846i;
            if (nVar != null) {
                nVar.mo15925a(str, str2, 94);
            }
        }
    }

    /* renamed from: b */
    public final void mo15712b(String str, String str2) {
        if (!this.f4841d.contains(str2)) {
            this.f4841d.add(new C8407h(str, str2, 287));
            C2383n nVar = this.f4846i;
            if (nVar != null) {
                nVar.mo15925a(str, str2, 287);
            }
        }
    }

    /* renamed from: a */
    public final void mo15710a(long j) {
        if (this.f4847j == null) {
            this.f4847j = C2376g.m5723a(C2350a.m5601e().mo15792g());
        }
        if (this.f4846i == null) {
            this.f4846i = C2383n.m5764a((C2374f) this.f4847j);
        }
        List<C8407h> a = this.f4846i.mo15923a(287);
        if (a != null) {
            this.f4841d.addAll(a);
            for (C8407h next : a) {
                mo15712b(next.mo57373b(), next.mo57372a());
            }
        }
        List<C8407h> a2 = this.f4846i.mo15923a(94);
        if (a2 != null) {
            this.f4840c.addAll(a2);
            for (C8407h next2 : a2) {
                mo15711a(next2.mo57373b(), next2.mo57372a());
            }
        }
        if (this.f4844g == null) {
            this.f4844g = C2372e.m5679a((C2374f) this.f4847j);
        }
        if (this.f4845h == null) {
            this.f4845h = C9549b.m27299a().mo63129b();
        }
        this.f4838a = j;
        this.f4839b = false;
        Handler handler = this.f4848k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f4838a);
    }

    /* renamed from: a */
    static /* synthetic */ void m5516a(C2328a aVar, long j) {
        LinkedList<C8407h> linkedList = aVar.f4840c;
        if (linkedList == null || linkedList.size() <= 0 || aVar.f4842e == 0 || aVar.f4840c.size() <= aVar.f4842e) {
            LinkedList<C8407h> linkedList2 = aVar.f4841d;
            if (linkedList2 == null || linkedList2.size() <= 0 || aVar.f4843f == 0 || aVar.f4841d.size() == aVar.f4843f) {
                aVar.f4843f = 0;
                aVar.f4842e = 0;
                Handler handler = aVar.f4848k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m5521c(C2328a aVar) {
        try {
            if (aVar.f4840c != null && aVar.f4840c.size() > 0 && aVar.f4842e < aVar.f4840c.size()) {
                C8407h hVar = aVar.f4840c.get(aVar.f4842e);
                aVar.f4842e++;
                if (aVar.m5519a(hVar)) {
                    aVar.m5517a(hVar.mo57373b(), hVar.mo57372a(), false);
                }
            } else if (aVar.f4841d != null && aVar.f4841d.size() > 0 && aVar.f4843f < aVar.f4841d.size()) {
                C8407h hVar2 = aVar.f4841d.get(aVar.f4843f);
                aVar.f4843f++;
                if (aVar.m5519a(hVar2)) {
                    aVar.m5517a(hVar2.mo57373b(), hVar2.mo57372a(), true);
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("LoopTimer", th.getMessage(), th);
        }
    }
}
