package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4710e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4913p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4940m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4942n;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4944o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4945p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4966f;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4967g;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4968h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5001k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5030g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5045q;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.mbridge.msdk.playercommon.exoplayer2.C8912C;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h */
public final class C4864h implements Handler.Callback, C4940m.C4941a, C4942n.C4943a {

    /* renamed from: A */
    public C4867c f12888A;

    /* renamed from: B */
    public long f12889B;

    /* renamed from: C */
    public C4865a f12890C;

    /* renamed from: D */
    public C4865a f12891D;

    /* renamed from: E */
    public C4865a f12892E;

    /* renamed from: F */
    public C4913p f12893F;

    /* renamed from: a */
    public final C4911n[] f12894a;

    /* renamed from: b */
    public final C4669a[] f12895b;

    /* renamed from: c */
    public final C4967g f12896c;

    /* renamed from: d */
    public final C4696c f12897d;

    /* renamed from: e */
    public final C5045q f12898e;

    /* renamed from: f */
    public final Handler f12899f;

    /* renamed from: g */
    public final HandlerThread f12900g;

    /* renamed from: h */
    public final Handler f12901h;

    /* renamed from: i */
    public final C4710e f12902i;

    /* renamed from: j */
    public final C4913p.C4916c f12903j;

    /* renamed from: k */
    public final C4913p.C4915b f12904k;

    /* renamed from: l */
    public C4866b f12905l;

    /* renamed from: m */
    public C4874m f12906m;

    /* renamed from: n */
    public C4911n f12907n;

    /* renamed from: o */
    public C5030g f12908o;

    /* renamed from: p */
    public C4942n f12909p;

    /* renamed from: q */
    public C4911n[] f12910q;

    /* renamed from: r */
    public boolean f12911r;

    /* renamed from: s */
    public boolean f12912s;

    /* renamed from: t */
    public boolean f12913t;

    /* renamed from: u */
    public boolean f12914u;

    /* renamed from: v */
    public int f12915v = 1;

    /* renamed from: w */
    public int f12916w;

    /* renamed from: x */
    public int f12917x;

    /* renamed from: y */
    public long f12918y;

    /* renamed from: z */
    public int f12919z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$a */
    public static final class C4865a {

        /* renamed from: a */
        public final C4940m f12920a;

        /* renamed from: b */
        public final Object f12921b;

        /* renamed from: c */
        public final C4944o[] f12922c;

        /* renamed from: d */
        public final boolean[] f12923d;

        /* renamed from: e */
        public final long f12924e;

        /* renamed from: f */
        public int f12925f;

        /* renamed from: g */
        public long f12926g;

        /* renamed from: h */
        public boolean f12927h;

        /* renamed from: i */
        public boolean f12928i;

        /* renamed from: j */
        public boolean f12929j;

        /* renamed from: k */
        public C4865a f12930k;

        /* renamed from: l */
        public boolean f12931l;

        /* renamed from: m */
        public C4968h f12932m;

        /* renamed from: n */
        public final C4911n[] f12933n;

        /* renamed from: o */
        public final C4669a[] f12934o;

        /* renamed from: p */
        public final C4967g f12935p;

        /* renamed from: q */
        public final C4696c f12936q;

        /* renamed from: r */
        public final C4942n f12937r;

        /* renamed from: s */
        public C4968h f12938s;

        public C4865a(C4911n[] nVarArr, C4669a[] aVarArr, long j, C4967g gVar, C4696c cVar, C4942n nVar, Object obj, int i, boolean z, long j2) {
            this.f12933n = nVarArr;
            this.f12934o = aVarArr;
            this.f12924e = j;
            this.f12935p = gVar;
            this.f12936q = cVar;
            this.f12937r = nVar;
            this.f12921b = C5023a.m15300a(obj);
            this.f12925f = i;
            this.f12927h = z;
            this.f12926g = j2;
            this.f12922c = new C4944o[nVarArr.length];
            this.f12923d = new boolean[nVarArr.length];
            this.f12920a = nVar.mo25204a(i, cVar.mo25101a(), j2);
        }

        /* renamed from: a */
        public long mo25368a() {
            return this.f12924e - this.f12926g;
        }

        /* renamed from: b */
        public boolean mo25370b() {
            return this.f12928i && (!this.f12929j || this.f12920a.mo25200d() == Long.MIN_VALUE);
        }

        /* renamed from: c */
        public void mo25371c() {
            try {
                this.f12937r.mo25207a(this.f12920a);
            } catch (RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Period release failed.", e);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo25372d() throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
            /*
                r6 = this;
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r0 = r6.f12935p
                com.fyber.inneractive.sdk.player.exoplayer2.a[] r1 = r6.f12934o
                com.fyber.inneractive.sdk.player.exoplayer2.source.m r2 = r6.f12920a
                com.fyber.inneractive.sdk.player.exoplayer2.source.s r2 = r2.mo25197b()
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.mo25505a(r1, r2)
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r1 = r6.f12938s
                r0.getClass()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0018
                goto L_0x0025
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f13236b
                int r5 = r5.f13232a
                if (r4 >= r5) goto L_0x002a
                boolean r5 = r0.mo25510a(r1, r4)
                if (r5 != 0) goto L_0x0027
            L_0x0025:
                r1 = r3
                goto L_0x002b
            L_0x0027:
                int r4 = r4 + 1
                goto L_0x0019
            L_0x002a:
                r1 = r2
            L_0x002b:
                if (r1 == 0) goto L_0x002e
                return r3
            L_0x002e:
                r6.f12932m = r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4864h.C4865a.mo25372d():boolean");
        }

        /* renamed from: a */
        public long mo25369a(long j, boolean z, boolean[] zArr) {
            int i;
            C4966f fVar = this.f12932m.f13236b;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                boolean z3 = true;
                if (i2 >= fVar.f13232a) {
                    break;
                }
                boolean[] zArr2 = this.f12923d;
                if (z || !this.f12932m.mo25510a(this.f12938s, i2)) {
                    z3 = false;
                }
                zArr2[i2] = z3;
                i2++;
            }
            long a = this.f12920a.mo25190a((C4964e[]) fVar.f13233b.clone(), this.f12923d, this.f12922c, zArr, j);
            this.f12938s = this.f12932m;
            this.f12929j = false;
            int i3 = 0;
            while (true) {
                C4944o[] oVarArr = this.f12922c;
                if (i3 >= oVarArr.length) {
                    break;
                }
                if (oVarArr[i3] != null) {
                    C5023a.m15304b(fVar.f13233b[i3] != null);
                    this.f12929j = true;
                } else {
                    C5023a.m15304b(fVar.f13233b[i3] == null);
                }
                i3++;
            }
            C4696c cVar = this.f12936q;
            C4911n[] nVarArr = this.f12933n;
            C4948s sVar = this.f12932m.f13235a;
            cVar.f11837f = 0;
            for (int i4 = 0; i4 < nVarArr.length; i4++) {
                if (fVar.f13233b[i4] != null) {
                    int i5 = cVar.f11837f;
                    int k = nVarArr[i4].mo25022k();
                    int i6 = C5049u.f13471a;
                    if (k == 0) {
                        i = 16777216;
                    } else if (k == 1) {
                        i = C8912C.DEFAULT_AUDIO_BUFFER_SIZE;
                    } else if (k == 2) {
                        i = 13107200;
                    } else if (k == 3 || k == 4) {
                        i = 131072;
                    } else {
                        throw new IllegalStateException();
                    }
                    cVar.f11837f = i5 + i;
                }
            }
            C5001k kVar = cVar.f11832a;
            int i7 = cVar.f11837f;
            synchronized (kVar) {
                if (i7 < kVar.f13338e) {
                    z2 = true;
                }
                kVar.f13338e = i7;
                if (z2) {
                    kVar.mo25557b();
                }
            }
            return a;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$b */
    public static final class C4866b {

        /* renamed from: a */
        public final int f12939a;

        /* renamed from: b */
        public final long f12940b;

        /* renamed from: c */
        public volatile long f12941c;

        /* renamed from: d */
        public volatile long f12942d;

        public C4866b(int i, long j) {
            this.f12939a = i;
            this.f12940b = j;
            this.f12941c = j;
            this.f12942d = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$c */
    public static final class C4867c {

        /* renamed from: a */
        public final C4913p f12943a;

        /* renamed from: b */
        public final int f12944b;

        /* renamed from: c */
        public final long f12945c;

        public C4867c(C4913p pVar, int i, long j) {
            this.f12943a = pVar;
            this.f12944b = i;
            this.f12945c = j;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.h$d */
    public static final class C4868d {

        /* renamed from: a */
        public final C4913p f12946a;

        /* renamed from: b */
        public final Object f12947b;

        /* renamed from: c */
        public final C4866b f12948c;

        /* renamed from: d */
        public final int f12949d;

        public C4868d(C4913p pVar, Object obj, C4866b bVar, int i) {
            this.f12946a = pVar;
            this.f12947b = obj;
            this.f12948c = bVar;
            this.f12949d = i;
        }
    }

    public C4864h(C4911n[] nVarArr, C4967g gVar, C4696c cVar, boolean z, Handler handler, C4866b bVar, C4710e eVar) {
        this.f12894a = nVarArr;
        this.f12896c = gVar;
        this.f12897d = cVar;
        this.f12912s = z;
        this.f12901h = handler;
        this.f12905l = bVar;
        this.f12902i = eVar;
        this.f12895b = new C4669a[nVarArr.length];
        for (int i = 0; i < nVarArr.length; i++) {
            nVarArr[i].mo25008a(i);
            this.f12895b[i] = nVarArr[i].mo25024m();
        }
        this.f12898e = new C5045q();
        this.f12910q = new C4911n[0];
        this.f12903j = new C4913p.C4916c();
        this.f12904k = new C4913p.C4915b();
        this.f12906m = C4874m.f12978d;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f12900g = handlerThread;
        handlerThread.start();
        this.f12899f = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public void mo25345a(C4945p pVar) {
        this.f12899f.obtainMessage(9, (C4940m) pVar).sendToTarget();
    }

    /* renamed from: b */
    public final void mo25355b(C4867c cVar) throws C4697d {
        int i = 1;
        if (this.f12893F == null) {
            this.f12919z++;
            this.f12888A = cVar;
            return;
        }
        Pair<Integer, Long> a = mo25333a(cVar);
        if (a == null) {
            C4866b bVar = new C4866b(0, 0);
            this.f12905l = bVar;
            this.f12901h.obtainMessage(4, 1, 0, bVar).sendToTarget();
            this.f12905l = new C4866b(0, -9223372036854775807L);
            mo25336a(4);
            mo25357b(false);
            return;
        }
        int i2 = cVar.f12945c == -9223372036854775807L ? 1 : 0;
        int intValue = ((Integer) a.first).intValue();
        long longValue = ((Long) a.second).longValue();
        try {
            C4866b bVar2 = this.f12905l;
            if (intValue != bVar2.f12939a || longValue / 1000 != bVar2.f12941c / 1000) {
                long b = mo25351b(intValue, longValue);
                if (longValue == b) {
                    i = 0;
                }
                C4866b bVar3 = new C4866b(intValue, b);
                this.f12905l = bVar3;
                this.f12901h.obtainMessage(4, i2 | i, 0, bVar3).sendToTarget();
            }
        } finally {
            C4866b bVar4 = new C4866b(intValue, longValue);
            this.f12905l = bVar4;
            this.f12901h.obtainMessage(4, i2, 0, bVar4).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo25359c(boolean z) {
        if (this.f12914u != z) {
            this.f12914u = z;
            this.f12901h.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    /* renamed from: d */
    public final void mo25361d(boolean z) throws C4697d {
        this.f12913t = false;
        this.f12912s = z;
        if (!z) {
            mo25365h();
            mo25367i();
            mo25357b(false);
            return;
        }
        int i = this.f12915v;
        if (i == 3) {
            mo25363f();
            this.f12899f.sendEmptyMessage(2);
        } else if (i == 2) {
            this.f12899f.sendEmptyMessage(2);
        }
    }

    /* renamed from: e */
    public final void mo25362e() throws C4697d {
        C4865a aVar = this.f12892E;
        if (aVar != null) {
            boolean z = true;
            while (aVar != null && aVar.f12928i) {
                if (aVar.mo25372d()) {
                    if (z) {
                        C4865a aVar2 = this.f12891D;
                        C4865a aVar3 = this.f12892E;
                        boolean z2 = aVar2 != aVar3;
                        mo25339a(aVar3.f12930k);
                        C4865a aVar4 = this.f12892E;
                        aVar4.f12930k = null;
                        this.f12890C = aVar4;
                        this.f12891D = aVar4;
                        boolean[] zArr = new boolean[this.f12894a.length];
                        long a = aVar4.mo25369a(this.f12905l.f12941c, z2, zArr);
                        if (a != this.f12905l.f12941c) {
                            this.f12905l.f12941c = a;
                            mo25353b(a);
                        }
                        boolean[] zArr2 = new boolean[this.f12894a.length];
                        int i = 0;
                        int i2 = 0;
                        while (true) {
                            C4911n[] nVarArr = this.f12894a;
                            if (i >= nVarArr.length) {
                                break;
                            }
                            C4911n nVar = nVarArr[i];
                            zArr2[i] = nVar.mo25006a() != 0;
                            C4944o oVar = this.f12892E.f12922c[i];
                            if (oVar != null) {
                                i2++;
                            }
                            if (zArr2[i]) {
                                if (oVar != nVar.mo25025n()) {
                                    if (nVar == this.f12907n) {
                                        if (oVar == null) {
                                            this.f12898e.mo25632a(this.f12908o);
                                        }
                                        this.f12908o = null;
                                        this.f12907n = null;
                                    }
                                    mo25341a(nVar);
                                    nVar.mo25023l();
                                } else if (zArr[i]) {
                                    nVar.mo25009a(this.f12889B);
                                }
                            }
                            i++;
                        }
                        this.f12901h.obtainMessage(3, aVar.f12932m).sendToTarget();
                        mo25348a(zArr2, i2);
                    } else {
                        this.f12890C = aVar;
                        for (C4865a aVar5 = aVar.f12930k; aVar5 != null; aVar5 = aVar5.f12930k) {
                            aVar5.mo25371c();
                        }
                        C4865a aVar6 = this.f12890C;
                        aVar6.f12930k = null;
                        if (aVar6.f12928i) {
                            long max = Math.max(aVar6.f12926g, this.f12889B - aVar6.mo25368a());
                            C4865a aVar7 = this.f12890C;
                            aVar7.mo25369a(max, false, new boolean[aVar7.f12933n.length]);
                        }
                    }
                    mo25352b();
                    mo25367i();
                    this.f12899f.sendEmptyMessage(2);
                    return;
                }
                if (aVar == this.f12891D) {
                    z = false;
                }
                aVar = aVar.f12930k;
            }
        }
    }

    /* renamed from: f */
    public final void mo25363f() throws C4697d {
        this.f12913t = false;
        C5045q qVar = this.f12898e;
        if (!qVar.f13464a) {
            qVar.f13466c = SystemClock.elapsedRealtime();
            qVar.f13464a = true;
        }
        for (C4911n f : this.f12910q) {
            f.mo25018f();
        }
    }

    /* renamed from: g */
    public final void mo25364g() {
        mo25357b(true);
        this.f12897d.mo25102a(true);
        mo25336a(1);
    }

    /* renamed from: h */
    public final void mo25365h() throws C4697d {
        C5045q qVar = this.f12898e;
        if (qVar.f13464a) {
            qVar.mo25631a(qVar.mo25059o());
            qVar.f13464a = false;
        }
        for (C4911n a : this.f12910q) {
            mo25341a(a);
        }
    }

    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    mo25344a((C4942n) message.obj, message.arg1 != 0);
                    return true;
                case 1:
                    mo25361d(message.arg1 != 0);
                    return true;
                case 2:
                    mo25335a();
                    return true;
                case 3:
                    mo25355b((C4867c) message.obj);
                    return true;
                case 4:
                    mo25340a((C4874m) message.obj);
                    return true;
                case 5:
                    mo25364g();
                    return true;
                case 6:
                    mo25360d();
                    return true;
                case 7:
                    mo25338a((Pair<C4913p, Object>) (Pair) message.obj);
                    return true;
                case 8:
                    mo25343a((C4940m) message.obj);
                    return true;
                case 9:
                    C4940m mVar = (C4940m) message.obj;
                    C4865a aVar = this.f12890C;
                    if (aVar != null) {
                        if (aVar.f12920a == mVar) {
                            mo25352b();
                        }
                    }
                    return true;
                case 10:
                    mo25362e();
                    return true;
                case 11:
                    mo25347a((C4710e.C4713c[]) message.obj);
                    return true;
                default:
                    return false;
            }
        } catch (C4697d e) {
            Log.e("ExoPlayerImplInternal", "Renderer error.", e);
            this.f12901h.obtainMessage(8, e).sendToTarget();
            mo25364g();
            return true;
        } catch (IOException e2) {
            Log.e("ExoPlayerImplInternal", "Source error.", e2);
            this.f12901h.obtainMessage(8, new C4697d(0, (String) null, e2, -1)).sendToTarget();
            mo25364g();
            return true;
        } catch (RuntimeException e3) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e3);
            this.f12901h.obtainMessage(8, new C4697d(2, (String) null, e3, -1)).sendToTarget();
            mo25364g();
            return true;
        }
    }

    /* renamed from: i */
    public final void mo25367i() throws C4697d {
        long j;
        C4865a aVar = this.f12892E;
        if (aVar != null) {
            long f = aVar.f12920a.mo25202f();
            if (f != -9223372036854775807L) {
                mo25353b(f);
            } else {
                C4911n nVar = this.f12907n;
                if (nVar == null || nVar.mo25056b()) {
                    this.f12889B = this.f12898e.mo25059o();
                } else {
                    long o = this.f12908o.mo25059o();
                    this.f12889B = o;
                    this.f12898e.mo25631a(o);
                }
                f = this.f12889B - this.f12892E.mo25368a();
            }
            this.f12905l.f12941c = f;
            this.f12918y = SystemClock.elapsedRealtime() * 1000;
            if (this.f12910q.length == 0) {
                j = Long.MIN_VALUE;
            } else {
                j = this.f12892E.f12920a.mo25200d();
            }
            C4866b bVar = this.f12905l;
            if (j == Long.MIN_VALUE) {
                j = this.f12893F.mo25459a(this.f12892E.f12925f, this.f12904k, false).f13080d;
            }
            bVar.f12942d = j;
        }
    }

    /* renamed from: a */
    public void mo25342a(C4913p pVar, Object obj) {
        this.f12899f.obtainMessage(7, Pair.create(pVar, obj)).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25336a(int i) {
        if (this.f12915v != i) {
            this.f12915v = i;
            this.f12901h.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    /* renamed from: c */
    public final void mo25358c() throws IOException {
        C4865a aVar = this.f12890C;
        if (aVar != null && !aVar.f12928i) {
            C4865a aVar2 = this.f12891D;
            if (aVar2 == null || aVar2.f12930k == aVar) {
                C4911n[] nVarArr = this.f12910q;
                int length = nVarArr.length;
                int i = 0;
                while (i < length) {
                    if (nVarArr[i].mo25019g()) {
                        i++;
                    } else {
                        return;
                    }
                }
                this.f12890C.f12920a.mo25201e();
            }
        }
    }

    /* renamed from: a */
    public final void mo25344a(C4942n nVar, boolean z) {
        this.f12901h.sendEmptyMessage(0);
        mo25357b(true);
        this.f12897d.mo25102a(false);
        if (z) {
            this.f12905l = new C4866b(0, -9223372036854775807L);
        }
        this.f12909p = nVar;
        nVar.mo25206a(this.f12902i, true, (C4942n.C4943a) this);
        mo25336a(2);
        this.f12899f.sendEmptyMessage(2);
    }

    /* renamed from: d */
    public final void mo25360d() {
        mo25357b(true);
        this.f12897d.mo25102a(true);
        mo25336a(1);
        synchronized (this) {
            this.f12911r = true;
            notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015a A[LOOP:0: B:55:0x015a->B:59:0x016a, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25335a() throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d, java.io.IOException {
        /*
            r27 = this;
            r7 = r27
            long r8 = android.os.SystemClock.elapsedRealtime()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12893F
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 0
            r13 = 1
            if (r0 != 0) goto L_0x0018
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f12909p
            r0.mo25205a()
            goto L_0x0253
        L_0x0018:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            if (r0 != 0) goto L_0x0021
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r7.f12905l
            int r0 = r0.f12939a
            goto L_0x004f
        L_0x0021:
            int r1 = r0.f12925f
            boolean r2 = r0.f12927h
            if (r2 != 0) goto L_0x013a
            boolean r0 = r0.mo25370b()
            if (r0 == 0) goto L_0x013a
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo25459a(r1, r2, r12)
            long r2 = r0.f13080d
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            goto L_0x013a
        L_0x003d:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            if (r0 == 0) goto L_0x004a
            int r0 = r0.f12925f
            int r1 = r1 - r0
            r0 = 100
            if (r1 != r0) goto L_0x004a
            goto L_0x013a
        L_0x004a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            int r0 = r0.f12925f
            int r0 = r0 + r13
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            int r1 = r1.mo25457a()
            if (r0 < r1) goto L_0x005e
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r0 = r7.f12909p
            r0.mo25205a()
            goto L_0x013a
        L_0x005e:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12890C
            r2 = 0
            if (r1 != 0) goto L_0x006b
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f12905l
            long r2 = r1.f12941c
        L_0x0068:
            r25 = r2
            goto L_0x00c6
        L_0x006b:
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r4 = r7.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r1 = r1.mo25459a(r0, r4, r12)
            int r4 = r1.f13079c
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r5 = r7.f12903j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo25460a(r4, r5)
            int r1 = r1.f13084c
            if (r0 == r1) goto L_0x0082
            goto L_0x0068
        L_0x0082:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            long r0 = r0.mo25368a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r6 = r7.f12890C
            int r6 = r6.f12925f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r14 = r7.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r5.mo25459a(r6, r14, r12)
            long r5 = r5.f13080d
            long r0 = r0 + r5
            long r5 = r7.f12889B
            long r0 = r0 - r5
            com.fyber.inneractive.sdk.player.exoplayer2.p r5 = r7.f12893F
            long r14 = java.lang.Math.max(r2, r0)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r27
            r1 = r5
            r2 = r4
            r3 = r16
            r5 = r14
            android.util.Pair r0 = r0.mo25334a(r1, r2, r3, r5)
            if (r0 != 0) goto L_0x00b4
            goto L_0x013a
        L_0x00b4:
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            r0 = r1
            goto L_0x0068
        L_0x00c6:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12890C
            if (r1 != 0) goto L_0x00d0
            r1 = 60000000(0x3938700, double:2.96439388E-316)
            long r1 = r25 + r1
            goto L_0x00e3
        L_0x00d0:
            long r1 = r1.mo25368a()
            com.fyber.inneractive.sdk.player.exoplayer2.p r3 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f12890C
            int r4 = r4.f12925f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r7.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r3.mo25459a(r4, r5, r12)
            long r3 = r3.f13080d
            long r1 = r1 + r3
        L_0x00e3:
            r17 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12904k
            r1.mo25459a(r0, r2, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            int r1 = r1.mo25457a()
            int r1 = r1 - r13
            if (r0 != r1) goto L_0x0108
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12904k
            int r2 = r2.f13079c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r3 = r7.f12903j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r1 = r1.mo25460a(r2, r3)
            boolean r1 = r1.f13083b
            if (r1 != 0) goto L_0x0108
            r24 = r13
            goto L_0x010a
        L_0x0108:
            r24 = r12
        L_0x010a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.h$a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r15 = r7.f12894a
            com.fyber.inneractive.sdk.player.exoplayer2.a[] r2 = r7.f12895b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g r3 = r7.f12896c
            com.fyber.inneractive.sdk.player.exoplayer2.c r4 = r7.f12897d
            com.fyber.inneractive.sdk.player.exoplayer2.source.n r5 = r7.f12909p
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r6 = r7.f12904k
            java.lang.Object r6 = r6.f13078b
            r14 = r1
            r16 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r0
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24, r25)
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            if (r0 == 0) goto L_0x0130
            r0.f12930k = r1
        L_0x0130:
            r7.f12890C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r1.f12920a
            r0.mo25193a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4940m.C4941a) r7)
            r7.mo25359c(r13)
        L_0x013a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            if (r0 == 0) goto L_0x0151
            boolean r0 = r0.mo25370b()
            if (r0 == 0) goto L_0x0145
            goto L_0x0151
        L_0x0145:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12890C
            if (r0 == 0) goto L_0x0154
            boolean r0 = r0.f12931l
            if (r0 == 0) goto L_0x0154
            r27.mo25352b()
            goto L_0x0154
        L_0x0151:
            r7.mo25359c(r12)
        L_0x0154:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            if (r0 != 0) goto L_0x015a
            goto L_0x0253
        L_0x015a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12891D
            if (r0 == r1) goto L_0x0191
            long r2 = r7.f12889B
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r0.f12930k
            long r4 = r4.f12924e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0191
            r0.mo25371c()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r0.f12930k
            r7.mo25354b((com.fyber.inneractive.sdk.player.exoplayer2.C4864h.C4865a) r0)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12892E
            int r2 = r1.f12925f
            long r3 = r1.f12926g
            r0.<init>(r2, r3)
            r7.f12905l = r0
            r27.mo25367i()
            android.os.Handler r0 = r7.f12901h
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r7.f12905l
            r2 = 5
            android.os.Message r0 = r0.obtainMessage(r2, r1)
            r0.sendToTarget()
            goto L_0x015a
        L_0x0191:
            boolean r0 = r1.f12927h
            if (r0 == 0) goto L_0x01b7
            r0 = r12
        L_0x0196:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f12894a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x0253
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f12891D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f12922c
            r2 = r2[r0]
            if (r2 == 0) goto L_0x01b4
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo25025n()
            if (r3 != r2) goto L_0x01b4
            boolean r2 = r1.mo25019g()
            if (r2 == 0) goto L_0x01b4
            r1.mo25015c()
        L_0x01b4:
            int r0 = r0 + 1
            goto L_0x0196
        L_0x01b7:
            r0 = r12
        L_0x01b8:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r1 = r7.f12894a
            int r2 = r1.length
            if (r0 >= r2) goto L_0x01d8
            r1 = r1[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r2 = r7.f12891D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r2 = r2.f12922c
            r2 = r2[r0]
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r3 = r1.mo25025n()
            if (r3 != r2) goto L_0x0253
            if (r2 == 0) goto L_0x01d5
            boolean r1 = r1.mo25019g()
            if (r1 != 0) goto L_0x01d5
            goto L_0x0253
        L_0x01d5:
            int r0 = r0 + 1
            goto L_0x01b8
        L_0x01d8:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12891D
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r0.f12930k
            if (r1 == 0) goto L_0x0253
            boolean r2 = r1.f12928i
            if (r2 == 0) goto L_0x0253
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r0 = r0.f12932m
            r7.f12891D = r1
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r2 = r1.f12932m
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r1 = r1.f12920a
            long r3 = r1.mo25202f()
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x01f4
            r1 = r13
            goto L_0x01f5
        L_0x01f4:
            r1 = r12
        L_0x01f5:
            r3 = r12
        L_0x01f6:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12894a
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0253
            r4 = r4[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r0.f13236b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f13233b
            r5 = r5[r3]
            if (r5 != 0) goto L_0x0206
            goto L_0x024b
        L_0x0206:
            if (r1 == 0) goto L_0x020c
            r4.mo25015c()
            goto L_0x024b
        L_0x020c:
            boolean r5 = r4.mo25020h()
            if (r5 != 0) goto L_0x024b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r5 = r2.f13236b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = r5.f13233b
            r5 = r5[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r6 = r0.f13238d
            r6 = r6[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r14 = r2.f13238d
            r14 = r14[r3]
            if (r5 == 0) goto L_0x0248
            boolean r6 = r14.equals(r6)
            if (r6 == 0) goto L_0x0248
            int r6 = r5.mo25498f()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.C4869i[r6]
            r15 = r12
        L_0x022f:
            if (r15 >= r6) goto L_0x023a
            com.fyber.inneractive.sdk.player.exoplayer2.i r16 = r5.mo25490a((int) r15)
            r14[r15] = r16
            int r15 = r15 + 1
            goto L_0x022f
        L_0x023a:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r5 = r7.f12891D
            com.fyber.inneractive.sdk.player.exoplayer2.source.o[] r6 = r5.f12922c
            r6 = r6[r3]
            long r10 = r5.mo25368a()
            r4.mo25014a(r14, r6, r10)
            goto L_0x024b
        L_0x0248:
            r4.mo25015c()
        L_0x024b:
            int r3 = r3 + 1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x01f6
        L_0x0253:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            r1 = 10
            if (r0 != 0) goto L_0x0260
            r27.mo25358c()
            r7.mo25337a((long) r8, (long) r1)
            return
        L_0x0260:
            java.lang.String r0 = "doSomeWork"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15380a(r0)
            r27.mo25367i()
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r7.f12892E
            com.fyber.inneractive.sdk.player.exoplayer2.source.m r0 = r0.f12920a
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r7.f12905l
            long r3 = r3.f12941c
            r0.mo25199c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12910q
            int r3 = r0.length
            r4 = r12
            r5 = r13
            r6 = r5
        L_0x0279:
            if (r4 >= r3) goto L_0x02b1
            r10 = r0[r4]
            long r13 = r7.f12889B
            long r1 = r7.f12918y
            r10.mo25387a(r13, r1)
            if (r6 == 0) goto L_0x028e
            boolean r1 = r10.mo25056b()
            if (r1 == 0) goto L_0x028e
            r6 = 1
            goto L_0x028f
        L_0x028e:
            r6 = r12
        L_0x028f:
            boolean r1 = r10.isReady()
            if (r1 != 0) goto L_0x029e
            boolean r1 = r10.mo25056b()
            if (r1 == 0) goto L_0x029c
            goto L_0x029e
        L_0x029c:
            r1 = r12
            goto L_0x029f
        L_0x029e:
            r1 = 1
        L_0x029f:
            if (r1 != 0) goto L_0x02a4
            r10.mo25017e()
        L_0x02a4:
            if (r5 == 0) goto L_0x02aa
            if (r1 == 0) goto L_0x02aa
            r5 = 1
            goto L_0x02ab
        L_0x02aa:
            r5 = r12
        L_0x02ab:
            int r4 = r4 + 1
            r1 = 10
            r13 = 1
            goto L_0x0279
        L_0x02b1:
            if (r5 != 0) goto L_0x02b6
            r27.mo25358c()
        L_0x02b6:
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r0 = r7.f12908o
            if (r0 == 0) goto L_0x02d9
            com.fyber.inneractive.sdk.player.exoplayer2.m r0 = r0.mo25057i()
            com.fyber.inneractive.sdk.player.exoplayer2.m r1 = r7.f12906m
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x02d9
            r7.f12906m = r0
            com.fyber.inneractive.sdk.player.exoplayer2.util.q r1 = r7.f12898e
            com.fyber.inneractive.sdk.player.exoplayer2.util.g r2 = r7.f12908o
            r1.mo25632a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5030g) r2)
            android.os.Handler r1 = r7.f12901h
            r2 = 7
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r0.sendToTarget()
        L_0x02d9:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r7.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r7.f12892E
            int r1 = r1.f12925f
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r2 = r7.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r0.mo25459a(r1, r2, r12)
            long r0 = r0.f13080d
            r2 = 3
            r3 = 2
            if (r6 == 0) goto L_0x030a
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x02fc
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = r7.f12905l
            long r13 = r4.f12941c
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x030a
        L_0x02fc:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r4 = r7.f12892E
            boolean r4 = r4.f12927h
            if (r4 == 0) goto L_0x030a
            r0 = 4
            r7.mo25336a((int) r0)
            r27.mo25365h()
            goto L_0x034a
        L_0x030a:
            int r4 = r7.f12915v
            if (r4 != r3) goto L_0x0332
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12910q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x0321
            if (r5 == 0) goto L_0x031f
            boolean r0 = r7.f12913t
            boolean r0 = r7.mo25350a((boolean) r0)
            if (r0 == 0) goto L_0x031f
            r13 = 1
            goto L_0x0325
        L_0x031f:
            r13 = r12
            goto L_0x0325
        L_0x0321:
            boolean r13 = r7.mo25349a((long) r0)
        L_0x0325:
            if (r13 == 0) goto L_0x034a
            r7.mo25336a((int) r2)
            boolean r0 = r7.f12912s
            if (r0 == 0) goto L_0x034a
            r27.mo25363f()
            goto L_0x034a
        L_0x0332:
            if (r4 != r2) goto L_0x034a
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r4 = r7.f12910q
            int r4 = r4.length
            if (r4 <= 0) goto L_0x033a
            goto L_0x033e
        L_0x033a:
            boolean r5 = r7.mo25349a((long) r0)
        L_0x033e:
            if (r5 != 0) goto L_0x034a
            boolean r0 = r7.f12912s
            r7.f12913t = r0
            r7.mo25336a((int) r3)
            r27.mo25365h()
        L_0x034a:
            int r0 = r7.f12915v
            if (r0 != r3) goto L_0x035b
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12910q
            int r1 = r0.length
        L_0x0351:
            if (r12 >= r1) goto L_0x035b
            r4 = r0[r12]
            r4.mo25017e()
            int r12 = r12 + 1
            goto L_0x0351
        L_0x035b:
            boolean r0 = r7.f12912s
            if (r0 == 0) goto L_0x0363
            int r0 = r7.f12915v
            if (r0 == r2) goto L_0x0367
        L_0x0363:
            int r0 = r7.f12915v
            if (r0 != r3) goto L_0x036d
        L_0x0367:
            r0 = 10
            r7.mo25337a((long) r8, (long) r0)
            goto L_0x037d
        L_0x036d:
            com.fyber.inneractive.sdk.player.exoplayer2.n[] r0 = r7.f12910q
            int r0 = r0.length
            if (r0 == 0) goto L_0x0378
            r0 = 1000(0x3e8, double:4.94E-321)
            r7.mo25337a((long) r8, (long) r0)
            goto L_0x037d
        L_0x0378:
            android.os.Handler r0 = r7.f12899f
            r0.removeMessages(r3)
        L_0x037d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s.m15379a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4864h.mo25335a():void");
    }

    /* renamed from: b */
    public final long mo25351b(int i, long j) throws C4697d {
        C4865a aVar;
        mo25365h();
        this.f12913t = false;
        mo25336a(2);
        C4865a aVar2 = this.f12892E;
        if (aVar2 == null) {
            C4865a aVar3 = this.f12890C;
            if (aVar3 != null) {
                aVar3.mo25371c();
            }
            aVar = null;
        } else {
            aVar = null;
            while (aVar2 != null) {
                if (aVar2.f12925f != i || !aVar2.f12928i) {
                    aVar2.mo25371c();
                } else {
                    aVar = aVar2;
                }
                aVar2 = aVar2.f12930k;
            }
        }
        C4865a aVar4 = this.f12892E;
        if (!(aVar4 == aVar && aVar4 == this.f12891D)) {
            for (C4911n l : this.f12910q) {
                l.mo25023l();
            }
            this.f12910q = new C4911n[0];
            this.f12908o = null;
            this.f12907n = null;
            this.f12892E = null;
        }
        if (aVar != null) {
            aVar.f12930k = null;
            this.f12890C = aVar;
            this.f12891D = aVar;
            mo25354b(aVar);
            C4865a aVar5 = this.f12892E;
            if (aVar5.f12929j) {
                j = aVar5.f12920a.mo25196b(j);
            }
            mo25353b(j);
            mo25352b();
        } else {
            this.f12890C = null;
            this.f12891D = null;
            this.f12892E = null;
            mo25353b(j);
        }
        this.f12899f.sendEmptyMessage(2);
        return j;
    }

    /* renamed from: b */
    public final void mo25353b(long j) throws C4697d {
        long j2;
        C4865a aVar = this.f12892E;
        if (aVar == null) {
            j2 = 60000000;
        } else {
            j2 = aVar.mo25368a();
        }
        long j3 = j + j2;
        this.f12889B = j3;
        this.f12898e.mo25631a(j3);
        for (C4911n a : this.f12910q) {
            a.mo25009a(this.f12889B);
        }
    }

    /* renamed from: b */
    public final void mo25357b(boolean z) {
        this.f12899f.removeMessages(2);
        this.f12913t = false;
        C5045q qVar = this.f12898e;
        if (qVar.f13464a) {
            qVar.mo25631a(qVar.mo25059o());
            qVar.f13464a = false;
        }
        this.f12908o = null;
        this.f12907n = null;
        this.f12889B = 60000000;
        for (C4911n nVar : this.f12910q) {
            try {
                mo25341a(nVar);
                nVar.mo25023l();
            } catch (C4697d | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.f12910q = new C4911n[0];
        C4865a aVar = this.f12892E;
        if (aVar == null) {
            aVar = this.f12890C;
        }
        mo25339a(aVar);
        this.f12890C = null;
        this.f12891D = null;
        this.f12892E = null;
        mo25359c(false);
        if (z) {
            C4942n nVar2 = this.f12909p;
            if (nVar2 != null) {
                nVar2.mo25208b();
                this.f12909p = null;
            }
            this.f12893F = null;
        }
    }

    /* renamed from: b */
    public final void mo25356b(Object obj, int i) {
        this.f12901h.obtainMessage(6, new C4868d(this.f12893F, obj, this.f12905l, i)).sendToTarget();
    }

    /* renamed from: b */
    public final void mo25352b() {
        long j;
        C4865a aVar = this.f12890C;
        if (!aVar.f12928i) {
            j = 0;
        } else {
            j = aVar.f12920a.mo25189a();
        }
        if (j == Long.MIN_VALUE) {
            mo25359c(false);
            return;
        }
        long a = this.f12889B - this.f12890C.mo25368a();
        boolean a2 = this.f12897d.mo25103a(j - a);
        mo25359c(a2);
        if (a2) {
            C4865a aVar2 = this.f12890C;
            aVar2.f12931l = false;
            aVar2.f12920a.mo25195a(a);
            return;
        }
        this.f12890C.f12931l = true;
    }

    /* renamed from: b */
    public final void mo25354b(C4865a aVar) throws C4697d {
        if (this.f12892E != aVar) {
            boolean[] zArr = new boolean[this.f12894a.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                C4911n[] nVarArr = this.f12894a;
                if (i < nVarArr.length) {
                    C4911n nVar = nVarArr[i];
                    zArr[i] = nVar.mo25006a() != 0;
                    C4964e eVar = aVar.f12932m.f13236b.f13233b[i];
                    if (eVar != null) {
                        i2++;
                    }
                    if (zArr[i] && (eVar == null || (nVar.mo25020h() && nVar.mo25025n() == this.f12892E.f12922c[i]))) {
                        if (nVar == this.f12907n) {
                            this.f12898e.mo25632a(this.f12908o);
                            this.f12908o = null;
                            this.f12907n = null;
                        }
                        mo25341a(nVar);
                        nVar.mo25023l();
                    }
                    i++;
                } else {
                    this.f12892E = aVar;
                    this.f12901h.obtainMessage(3, aVar.f12932m).sendToTarget();
                    mo25348a(zArr, i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25337a(long j, long j2) {
        this.f12899f.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f12899f.sendEmptyMessage(2);
        } else {
            this.f12899f.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    /* renamed from: a */
    public final void mo25340a(C4874m mVar) {
        C5030g gVar = this.f12908o;
        if (gVar != null) {
            mVar = gVar.mo25048a(mVar);
        } else {
            C5045q qVar = this.f12898e;
            if (qVar.f13464a) {
                qVar.mo25631a(qVar.mo25059o());
            }
            qVar.f13467d = mVar;
        }
        this.f12906m = mVar;
        this.f12901h.obtainMessage(7, mVar).sendToTarget();
    }

    /* renamed from: a */
    public final void mo25347a(C4710e.C4713c[] cVarArr) throws C4697d {
        try {
            for (C4710e.C4713c cVar : cVarArr) {
                cVar.f11862a.mo25050a(cVar.f11863b, cVar.f11864c);
            }
            if (this.f12909p != null) {
                this.f12899f.sendEmptyMessage(2);
            }
            synchronized (this) {
                this.f12917x++;
                notifyAll();
            }
        } catch (Throwable th) {
            synchronized (this) {
                this.f12917x++;
                notifyAll();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final void mo25341a(C4911n nVar) throws C4697d {
        if (nVar.mo25006a() == 2) {
            nVar.mo25016d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = r2.f12892E.f12930k;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25349a(long r3) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r0 = r2.f12905l
            long r0 = r0.f12941c
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x001e
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r2.f12892E
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r3.f12930k
            if (r3 == 0) goto L_0x001c
            boolean r3 = r3.f12928i
            if (r3 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r3 = 0
            goto L_0x001f
        L_0x001e:
            r3 = 1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4864h.mo25349a(long):boolean");
    }

    /* renamed from: a */
    public final boolean mo25350a(boolean z) {
        long j;
        C4865a aVar = this.f12890C;
        if (!aVar.f12928i) {
            j = aVar.f12926g;
        } else {
            j = aVar.f12920a.mo25200d();
        }
        if (j == Long.MIN_VALUE) {
            C4865a aVar2 = this.f12890C;
            if (aVar2.f12927h) {
                return true;
            }
            j = this.f12893F.mo25459a(aVar2.f12925f, this.f12904k, false).f13080d;
        }
        C4696c cVar = this.f12897d;
        long a = j - (this.f12889B - this.f12890C.mo25368a());
        long j2 = z ? cVar.f11836e : cVar.f11835d;
        if (j2 <= 0 || a >= j2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25338a(android.util.Pair<com.fyber.inneractive.sdk.player.exoplayer2.C4913p, java.lang.Object> r13) throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r12 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12893F
            java.lang.Object r1 = r13.first
            com.fyber.inneractive.sdk.player.exoplayer2.p r1 = (com.fyber.inneractive.sdk.player.exoplayer2.C4913p) r1
            r12.f12893F = r1
            java.lang.Object r13 = r13.second
            r2 = 0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            if (r0 != 0) goto L_0x006e
            int r6 = r12.f12919z
            if (r6 <= 0) goto L_0x0041
            com.fyber.inneractive.sdk.player.exoplayer2.h$c r1 = r12.f12888A
            android.util.Pair r1 = r12.mo25333a((com.fyber.inneractive.sdk.player.exoplayer2.C4864h.C4867c) r1)
            int r6 = r12.f12919z
            r12.f12919z = r5
            r12.f12888A = r2
            if (r1 != 0) goto L_0x0029
            r12.mo25346a((java.lang.Object) r13, (int) r6)
            return
        L_0x0029:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r8 = r1.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r9 = r1.longValue()
            r7.<init>(r8, r9)
            r12.f12905l = r7
            goto L_0x006f
        L_0x0041:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = r12.f12905l
            long r6 = r6.f12940b
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x006e
            boolean r1 = r1.mo25463c()
            if (r1 == 0) goto L_0x0053
            r12.mo25346a((java.lang.Object) r13, (int) r5)
            return
        L_0x0053:
            android.util.Pair r1 = r12.mo25332a((int) r5, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r6 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            java.lang.Object r7 = r1.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r8 = r1.longValue()
            r6.<init>(r7, r8)
            r12.f12905l = r6
        L_0x006e:
            r6 = r5
        L_0x006f:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12892E
            if (r1 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12890C
        L_0x0076:
            if (r1 != 0) goto L_0x007c
            r12.mo25356b((java.lang.Object) r13, (int) r6)
            return
        L_0x007c:
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f12893F
            java.lang.Object r8 = r1.f12921b
            int r7 = r7.mo25458a(r8)
            r8 = -1
            r9 = 1
            if (r7 != r8) goto L_0x00e2
            int r2 = r1.f12925f
            com.fyber.inneractive.sdk.player.exoplayer2.p r7 = r12.f12893F
            int r0 = r12.mo25331a(r2, r0, r7)
            if (r0 != r8) goto L_0x0096
            r12.mo25346a((java.lang.Object) r13, (int) r6)
            return
        L_0x0096:
            com.fyber.inneractive.sdk.player.exoplayer2.p r2 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r7 = r12.f12904k
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r2.mo25459a(r0, r7, r5)
            int r0 = r0.f13079c
            android.util.Pair r0 = r12.mo25332a((int) r0, (long) r3)
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r5 = r12.f12904k
            r0.mo25459a(r2, r5, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r0 = r12.f12904k
            java.lang.Object r0 = r0.f13078b
            r1.f12925f = r8
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r1.f12930k
            if (r1 == 0) goto L_0x00d3
            java.lang.Object r5 = r1.f12921b
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x00cf
            r5 = r2
            goto L_0x00d0
        L_0x00cf:
            r5 = r8
        L_0x00d0:
            r1.f12925f = r5
            goto L_0x00c1
        L_0x00d3:
            long r0 = r12.mo25351b((int) r2, (long) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r2, r0)
            r12.f12905l = r3
            r12.mo25356b((java.lang.Object) r13, (int) r6)
            return
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f12904k
            r0.mo25459a(r7, r3, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12893F
            int r0 = r0.mo25457a()
            int r0 = r0 - r9
            if (r7 != r0) goto L_0x0104
            com.fyber.inneractive.sdk.player.exoplayer2.p r0 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r3 = r12.f12904k
            int r3 = r3.f13079c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r12.f12903j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r0 = r0.mo25460a(r3, r4)
            boolean r0 = r0.f13083b
            if (r0 != 0) goto L_0x0104
            r0 = r9
            goto L_0x0105
        L_0x0104:
            r0 = r5
        L_0x0105:
            r1.f12925f = r7
            r1.f12927h = r0
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f12891D
            if (r1 != r0) goto L_0x010f
            r0 = r9
            goto L_0x0110
        L_0x010f:
            r0 = r5
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = r12.f12905l
            int r4 = r3.f12939a
            if (r7 == r4) goto L_0x0127
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            long r10 = r3.f12940b
            r4.<init>(r7, r10)
            long r10 = r3.f12941c
            r4.f12941c = r10
            long r10 = r3.f12942d
            r4.f12942d = r10
            r12.f12905l = r4
        L_0x0127:
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r3 = r1.f12930k
            if (r3 == 0) goto L_0x0186
            int r7 = r7 + r9
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f12904k
            r4.mo25459a(r7, r8, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12893F
            int r4 = r4.mo25457a()
            int r4 = r4 - r9
            if (r7 != r4) goto L_0x014e
            com.fyber.inneractive.sdk.player.exoplayer2.p r4 = r12.f12893F
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r8 = r12.f12904k
            int r8 = r8.f13079c
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r10 = r12.f12903j
            com.fyber.inneractive.sdk.player.exoplayer2.p$c r4 = r4.mo25460a(r8, r10)
            boolean r4 = r4.f13083b
            if (r4 != 0) goto L_0x014e
            r4 = r9
            goto L_0x014f
        L_0x014e:
            r4 = r5
        L_0x014f:
            java.lang.Object r8 = r3.f12921b
            com.fyber.inneractive.sdk.player.exoplayer2.p$b r10 = r12.f12904k
            java.lang.Object r10 = r10.f13078b
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0169
            r3.f12925f = r7
            r3.f12927h = r4
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r1 = r12.f12891D
            if (r3 != r1) goto L_0x0165
            r1 = r9
            goto L_0x0166
        L_0x0165:
            r1 = r5
        L_0x0166:
            r0 = r0 | r1
            r1 = r3
            goto L_0x0127
        L_0x0169:
            if (r0 != 0) goto L_0x017f
            com.fyber.inneractive.sdk.player.exoplayer2.h$a r0 = r12.f12892E
            int r0 = r0.f12925f
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r1 = r12.f12905l
            long r1 = r1.f12941c
            long r1 = r12.mo25351b((int) r0, (long) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.h$b r3 = new com.fyber.inneractive.sdk.player.exoplayer2.h$b
            r3.<init>(r0, r1)
            r12.f12905l = r3
            goto L_0x0186
        L_0x017f:
            r12.f12890C = r1
            r1.f12930k = r2
            r12.mo25339a((com.fyber.inneractive.sdk.player.exoplayer2.C4864h.C4865a) r3)
        L_0x0186:
            r12.mo25356b((java.lang.Object) r13, (int) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.C4864h.mo25338a(android.util.Pair):void");
    }

    /* renamed from: a */
    public final void mo25346a(Object obj, int i) {
        this.f12905l = new C4866b(0, 0);
        mo25356b(obj, i);
        this.f12905l = new C4866b(0, -9223372036854775807L);
        mo25336a(4);
        mo25357b(false);
    }

    /* renamed from: a */
    public final int mo25331a(int i, C4913p pVar, C4913p pVar2) {
        int i2 = -1;
        while (i2 == -1 && i < pVar.mo25457a() - 1) {
            i++;
            i2 = pVar2.mo25458a(pVar.mo25459a(i, this.f12904k, true).f13078b);
        }
        return i2;
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25333a(C4867c cVar) {
        C4913p pVar = cVar.f12943a;
        if (pVar.mo25463c()) {
            pVar = this.f12893F;
        }
        try {
            Pair<Integer, Long> a = mo25334a(pVar, cVar.f12944b, cVar.f12945c, 0);
            C4913p pVar2 = this.f12893F;
            if (pVar2 == pVar) {
                return a;
            }
            int a2 = pVar2.mo25458a(pVar.mo25459a(((Integer) a.first).intValue(), this.f12904k, true).f13078b);
            if (a2 != -1) {
                return Pair.create(Integer.valueOf(a2), a.second);
            }
            int a3 = mo25331a(((Integer) a.first).intValue(), pVar, this.f12893F);
            if (a3 != -1) {
                return mo25332a(this.f12893F.mo25459a(a3, this.f12904k, false).f13079c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
            throw new C4872k(this.f12893F, cVar.f12944b, cVar.f12945c);
        }
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25332a(int i, long j) {
        return mo25334a(this.f12893F, i, j, 0);
    }

    /* renamed from: a */
    public final Pair<Integer, Long> mo25334a(C4913p pVar, int i, long j, long j2) {
        C5023a.m15299a(i, 0, pVar.mo25462b());
        pVar.mo25461a(i, this.f12903j, false, j2);
        if (j == -9223372036854775807L) {
            j = this.f12903j.f13086e;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        C4913p.C4916c cVar = this.f12903j;
        int i2 = cVar.f13084c;
        long j3 = cVar.f13088g + j;
        long j4 = pVar.mo25459a(i2, this.f12904k, false).f13080d;
        while (j4 != -9223372036854775807L && j3 >= j4 && i2 < this.f12903j.f13085d) {
            j3 -= j4;
            i2++;
            j4 = pVar.mo25459a(i2, this.f12904k, false).f13080d;
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(j3));
    }

    /* renamed from: a */
    public final void mo25343a(C4940m mVar) throws C4697d {
        C4865a aVar = this.f12890C;
        if (aVar != null && aVar.f12920a == mVar) {
            aVar.f12928i = true;
            aVar.mo25372d();
            aVar.f12926g = aVar.mo25369a(aVar.f12926g, false, new boolean[aVar.f12933n.length]);
            if (this.f12892E == null) {
                C4865a aVar2 = this.f12890C;
                this.f12891D = aVar2;
                mo25353b(aVar2.f12926g);
                mo25354b(this.f12891D);
            }
            mo25352b();
        }
    }

    /* renamed from: a */
    public final void mo25339a(C4865a aVar) {
        while (aVar != null) {
            aVar.mo25371c();
            aVar = aVar.f12930k;
        }
    }

    /* renamed from: a */
    public final void mo25348a(boolean[] zArr, int i) throws C4697d {
        this.f12910q = new C4911n[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C4911n[] nVarArr = this.f12894a;
            if (i2 < nVarArr.length) {
                C4911n nVar = nVarArr[i2];
                C4964e eVar = this.f12892E.f12932m.f13236b.f13233b[i2];
                if (eVar != null) {
                    int i4 = i3 + 1;
                    this.f12910q[i3] = nVar;
                    if (nVar.mo25006a() == 0) {
                        C4912o oVar = this.f12892E.f12932m.f13238d[i2];
                        boolean z = this.f12912s && this.f12915v == 3;
                        boolean z2 = !zArr[i2] && z;
                        int f = eVar.mo25498f();
                        C4869i[] iVarArr = new C4869i[f];
                        for (int i5 = 0; i5 < f; i5++) {
                            iVarArr[i5] = eVar.mo25490a(i5);
                        }
                        C4865a aVar = this.f12892E;
                        nVar.mo25011a(oVar, iVarArr, aVar.f12922c[i2], this.f12889B, z2, aVar.mo25368a());
                        C5030g j = nVar.mo25021j();
                        if (j != null) {
                            if (this.f12908o == null) {
                                this.f12908o = j;
                                this.f12907n = nVar;
                                j.mo25048a(this.f12906m);
                            } else {
                                throw new C4697d(2, (String) null, new IllegalStateException("Multiple renderer media clocks enabled."), -1);
                            }
                        }
                        if (z) {
                            nVar.mo25018f();
                        }
                    }
                    i3 = i4;
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
