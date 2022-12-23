package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.C6152fw;
import com.inmobi.media.C6155fy;
import com.smaato.sdk.core.dns.DnsName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.fs */
/* compiled from: ConfigComponent */
public class C6145fs {

    /* renamed from: a */
    public static boolean f15576a = false;

    /* renamed from: b */
    public static AtomicBoolean f15577b = new AtomicBoolean(false);

    /* renamed from: c */
    public static CopyOnWriteArrayList<C6144fr> f15578c = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15579d = C6145fs.class.getSimpleName();

    /* renamed from: e */
    private static Map<C6144fr, ArrayList<WeakReference<C6148c>>> f15580e = new HashMap();

    /* renamed from: f */
    private static C6146a f15581f;

    /* renamed from: com.inmobi.media.fs$c */
    /* compiled from: ConfigComponent */
    public interface C6148c {
        /* renamed from: a */
        void mo34481a(C6144fr frVar);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ConfigBootstrapHandler");
        handlerThread.start();
        f15581f = new C6146a(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static void m18323a() {
        if (!f15577b.getAndSet(true)) {
            new C6149ft();
            f15578c.addAll(C6149ft.m18338a());
            m18321a("root", C6227ho.m18559f(), (C6148c) null);
        }
    }

    /* renamed from: b */
    public static void m18329b() {
        if (f15577b.getAndSet(false)) {
            f15578c.clear();
            f15581f.sendEmptyMessage(5);
        }
    }

    /* renamed from: a */
    public static C6144fr m18321a(String str, String str2, C6148c cVar) {
        C6144fr a = C6144fr.m18314a(str, str2);
        if (str2 == null) {
            return a;
        }
        Message obtainMessage = f15581f.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = new C6151fv(a, cVar);
        f15581f.sendMessage(obtainMessage);
        if (!f15578c.isEmpty()) {
            Iterator<C6144fr> it = f15578c.iterator();
            while (it.hasNext()) {
                C6144fr next = it.next();
                if (next.equals(a)) {
                    return next;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m18326a(String str) {
        new C6149ft();
        C6166gd gdVar = (C6166gd) C6149ft.m18337a("root", str);
        String str2 = gdVar.latestSdkInfo.version;
        String str3 = gdVar.latestSdkInfo.url;
        if (str2.trim().length() != 0 && m18331b(C6228hp.m18574b(), str2.trim())) {
            String str4 = f15579d;
            C6238hu.m18605a((byte) 2, str4, "A newer version (version " + str2 + ") of the InMobi SDK is available! You are currently on an older version (Version " + C6228hp.m18574b() + "). Please download the latest InMobi SDK from " + str3);
        }
    }

    /* renamed from: a */
    private static boolean m18328a(long j, long j2) {
        return System.currentTimeMillis() - j > j2 * 1000;
    }

    /* renamed from: b */
    private static void m18330b(C6144fr frVar) {
        Message obtainMessage = f15581f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = frVar;
        f15581f.sendMessage(obtainMessage);
    }

    /* renamed from: com.inmobi.media.fs$b */
    /* compiled from: ConfigComponent */
    static class C6147b {

        /* renamed from: a */
        final String f15586a;

        /* renamed from: b */
        final String f15587b;

        C6147b(String str, String str2) {
            this.f15586a = str;
            this.f15587b = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6147b)) {
                return false;
            }
            C6147b bVar = (C6147b) obj;
            if (!this.f15586a.equals(bVar.f15586a) || !this.f15587b.equals(bVar.f15587b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f15586a.hashCode() + this.f15587b.hashCode();
        }
    }

    /* renamed from: com.inmobi.media.fs$a */
    /* compiled from: ConfigComponent */
    static final class C6146a extends Handler implements C6152fw.C6153a {

        /* renamed from: a */
        private List<C6144fr> f15582a = new ArrayList();

        /* renamed from: b */
        private Map<C6147b, Map<String, C6144fr>> f15583b = new HashMap();

        /* renamed from: c */
        private Map<String, C6144fr> f15584c = new HashMap();

        /* renamed from: d */
        private ExecutorService f15585d;

        C6146a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                int r2 = r1.what
                r3 = 0
                r4 = 0
                r5 = 3
                r6 = 1
                java.lang.String r7 = "root"
                switch(r2) {
                    case 0: goto L_0x025a;
                    case 1: goto L_0x01df;
                    case 2: goto L_0x01c7;
                    case 3: goto L_0x0152;
                    case 4: goto L_0x00a3;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0016;
                    default: goto L_0x000f;
                }
            L_0x000f:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                int r1 = r1.what
                goto L_0x028c
            L_0x0016:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fy$a r1 = (com.inmobi.media.C6155fy.C6156a) r1
                com.inmobi.media.ft r2 = new com.inmobi.media.ft
                r2.<init>()
                boolean r2 = r1.mo35341a()
                if (r2 != 0) goto L_0x0080
                int r2 = r1.f15610a
                r3 = 304(0x130, float:4.26E-43)
                if (r2 != r3) goto L_0x004f
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                com.inmobi.media.fr r2 = r1.f15611b
                r2.mo35325b()
                com.inmobi.media.fr r2 = r1.f15611b
                java.lang.String r2 = r2.mo35331g()
                if (r2 == 0) goto L_0x004e
                com.inmobi.media.fr r2 = r1.f15611b
                java.lang.String r2 = r2.mo35325b()
                com.inmobi.media.fr r1 = r1.f15611b
                java.lang.String r1 = r1.mo35331g()
                long r3 = java.lang.System.currentTimeMillis()
                com.inmobi.media.C6149ft.m18340a(r2, r1, r3)
            L_0x004e:
                return
            L_0x004f:
                com.inmobi.media.fr r2 = r1.f15611b
                com.inmobi.media.C6149ft.m18339a((com.inmobi.media.C6144fr) r2)
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                com.inmobi.media.fr r2 = r1.f15611b
                r2.mo35325b()
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                com.inmobi.media.fr r2 = r1.f15611b
                r2.mo35326c()
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                com.inmobi.media.fr r2 = r1.f15611b
                r2.mo35331g()
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.fr> r2 = com.inmobi.media.C6145fs.f15578c
                com.inmobi.media.fr r3 = r1.f15611b
                r2.remove(r3)
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.fr> r2 = com.inmobi.media.C6145fs.f15578c
                com.inmobi.media.fr r3 = r1.f15611b
                r2.add(r3)
                com.inmobi.media.fr r1 = r1.f15611b
                com.inmobi.media.C6145fs.m18324a((com.inmobi.media.C6144fr) r1)
                return
            L_0x0080:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                com.inmobi.media.fr r1 = r1.f15611b
                r1.mo35325b()
                return
            L_0x0089:
                java.util.concurrent.ExecutorService r1 = r0.f15585d
                if (r1 == 0) goto L_0x00a2
                boolean r1 = r1.isShutdown()
                if (r1 != 0) goto L_0x00a2
                r0.f15584c = r3
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r1 = r0.f15583b
                r1.clear()
                r0.removeMessages(r5)
                java.util.concurrent.ExecutorService r1 = r0.f15585d
                r1.shutdownNow()
            L_0x00a2:
                return
            L_0x00a3:
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r1 = r0.f15583b
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x014a
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r1 = r0.f15583b
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                java.lang.Object r1 = r1.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.util.Map r2 = (java.util.Map) r2
                r0.f15584c = r2
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r2 = r0.f15583b
                java.lang.Object r4 = r1.getKey()
                r2.remove(r4)
                java.lang.Object r2 = r1.getKey()
                com.inmobi.media.fs$b r2 = (com.inmobi.media.C6145fs.C6147b) r2
                java.util.Map<java.lang.String, com.inmobi.media.fr> r4 = r0.f15584c
                java.lang.Object r1 = r1.getKey()
                com.inmobi.media.fs$b r1 = (com.inmobi.media.C6145fs.C6147b) r1
                java.lang.String r1 = r1.f15587b
                com.inmobi.media.ft r5 = new com.inmobi.media.ft
                r5.<init>()
                com.inmobi.media.fr r5 = com.inmobi.media.C6149ft.m18337a(r7, r1)
                com.inmobi.media.gd r5 = (com.inmobi.media.C6166gd) r5
                int r16 = r5.mo35351h()
                int r17 = r5.mo35350e()
                com.inmobi.media.ir r15 = new com.inmobi.media.ir
                com.inmobi.media.gb r8 = r5.mo35330f()
                r15.<init>(r8)
                boolean r8 = com.inmobi.media.C6256ie.m18676f()
                if (r8 != 0) goto L_0x0109
                boolean r9 = r4.containsKey(r7)
                if (r9 == 0) goto L_0x0109
                java.util.Map r4 = com.inmobi.media.C6145fs.m18322a((java.util.Map) r4)
                goto L_0x010a
            L_0x0109:
                r6 = r8
            L_0x010a:
                com.inmobi.media.fx r14 = new com.inmobi.media.fx
                java.lang.String r11 = r2.f15586a
                r8 = r14
                r9 = r4
                r10 = r15
                r12 = r17
                r13 = r16
                r2 = r14
                r14 = r6
                r18 = r15
                r15 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                boolean r7 = r4.containsKey(r7)
                if (r7 == 0) goto L_0x013b
                java.lang.String r11 = r5.mo35354k()
                com.inmobi.media.fx r3 = new com.inmobi.media.fx
                java.util.Map r9 = com.inmobi.media.C6145fs.m18322a((java.util.Map) r4)
                r14 = 1
                r8 = r3
                r10 = r18
                r12 = r17
                r13 = r16
                r15 = r6
                r16 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            L_0x013b:
                com.inmobi.media.fw r1 = new com.inmobi.media.fw
                r1.<init>(r0, r2, r3)
                java.util.concurrent.ExecutorService r2 = r0.f15585d     // Catch:{ OutOfMemoryError -> 0x0146 }
                r2.execute(r1)     // Catch:{ OutOfMemoryError -> 0x0146 }
                return
            L_0x0146:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                return
            L_0x014a:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r1 = 5
                r0.sendEmptyMessage(r1)
                return
            L_0x0152:
                java.util.List<com.inmobi.media.fr> r1 = r0.f15582a
            L_0x0154:
                int r2 = r1.size()
                if (r4 >= r2) goto L_0x01a4
                java.lang.Object r2 = r1.get(r4)
                com.inmobi.media.fr r2 = (com.inmobi.media.C6144fr) r2
                java.lang.String r3 = r2.mo35331g()
                if (r3 == 0) goto L_0x01a1
                com.inmobi.media.ft r3 = new com.inmobi.media.ft
                r3.<init>()
                java.lang.String r3 = r2.mo35331g()
                com.inmobi.media.fr r3 = com.inmobi.media.C6149ft.m18337a(r7, r3)
                com.inmobi.media.gd r3 = (com.inmobi.media.C6166gd) r3
                com.inmobi.media.fs$b r5 = new com.inmobi.media.fs$b
                java.lang.String r8 = r2.mo35325b()
                java.lang.String r3 = r3.mo35349b(r8)
                java.lang.String r8 = r2.mo35331g()
                r5.<init>(r3, r8)
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r3 = r0.f15583b
                java.lang.Object r3 = r3.get(r5)
                java.util.HashMap r3 = (java.util.HashMap) r3
                if (r3 != 0) goto L_0x019a
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r8 = r0.f15583b
                r8.put(r5, r3)
            L_0x019a:
                java.lang.String r5 = r2.mo35325b()
                r3.put(r5, r2)
            L_0x01a1:
                int r4 = r4 + 1
                goto L_0x0154
            L_0x01a4:
                java.util.List<com.inmobi.media.fr> r1 = r0.f15582a
                r1.clear()
                java.util.concurrent.ExecutorService r1 = r0.f15585d
                if (r1 == 0) goto L_0x01b3
                boolean r1 = r1.isShutdown()
                if (r1 == 0) goto L_0x028c
            L_0x01b3:
                com.inmobi.media.ht r1 = new com.inmobi.media.ht
                java.lang.String r2 = com.inmobi.media.C6145fs.f15579d
                r1.<init>(r2)
                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r6, r1)
                r0.f15585d = r1
                r1 = 4
                r0.sendEmptyMessage(r1)
                return
            L_0x01c7:
                com.inmobi.media.ft r2 = new com.inmobi.media.ft
                r2.<init>()
                java.lang.Object r1 = r1.obj
                java.lang.String r1 = (java.lang.String) r1
                com.inmobi.media.fr r1 = com.inmobi.media.C6149ft.m18337a(r7, r1)
                com.inmobi.media.gd r1 = (com.inmobi.media.C6166gd) r1
                int r1 = r1.waitTime
                int r1 = r1 * 1000
                long r1 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r1)
                return
            L_0x01df:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fr r1 = (com.inmobi.media.C6144fr) r1
                java.lang.String r2 = r1.mo35331g()
                if (r2 != 0) goto L_0x01f0
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r1.mo35325b()
                return
            L_0x01f0:
                java.lang.String r2 = r1.mo35325b()
                java.lang.String r3 = r1.mo35331g()
                com.inmobi.media.ft r5 = new com.inmobi.media.ft
                r5.<init>()
                com.inmobi.media.fr r5 = com.inmobi.media.C6149ft.m18337a(r7, r3)
                com.inmobi.media.gd r5 = (com.inmobi.media.C6166gd) r5
                com.inmobi.media.fs$b r7 = new com.inmobi.media.fs$b
                java.lang.String r5 = r5.mo35349b(r2)
                r7.<init>(r5, r3)
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r3 = r0.f15583b
                java.lang.Object r3 = r3.get(r7)
                if (r3 == 0) goto L_0x0223
                java.util.Map<com.inmobi.media.fs$b, java.util.Map<java.lang.String, com.inmobi.media.fr>> r3 = r0.f15583b
                java.lang.Object r3 = r3.get(r7)
                java.util.Map r3 = (java.util.Map) r3
                boolean r3 = r3.containsKey(r2)
                if (r3 == 0) goto L_0x0223
                r4 = r6
            L_0x0223:
                java.util.Map<java.lang.String, com.inmobi.media.fr> r3 = r0.f15584c
                if (r3 == 0) goto L_0x022e
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L_0x022e
                goto L_0x022f
            L_0x022e:
                r6 = r4
            L_0x022f:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r1.mo35325b()
                if (r6 != 0) goto L_0x0253
                java.util.List<com.inmobi.media.fr> r2 = r0.f15582a
                r2.add(r1)
                r2 = 2
                boolean r3 = r0.hasMessages(r2)
                if (r3 != 0) goto L_0x028c
                android.os.Message r3 = android.os.Message.obtain()
                r3.what = r2
                java.lang.String r1 = r1.mo35331g()
                r3.obj = r1
                r0.sendMessage(r3)
                return
            L_0x0253:
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r1.mo35325b()
                return
            L_0x025a:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fv r1 = (com.inmobi.media.C6151fv) r1
                com.inmobi.media.fr r2 = r1.f15592a
                java.util.concurrent.atomic.AtomicBoolean r3 = com.inmobi.media.C6145fs.f15577b
                boolean r3 = r3.get()
                if (r3 != 0) goto L_0x026f
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r2.mo35325b()
                return
            L_0x026f:
                com.inmobi.media.fs$c r1 = r1.f15593b
                com.inmobi.media.C6145fs.m18325a((com.inmobi.media.C6144fr) r2, (com.inmobi.media.C6145fs.C6148c) r1)
                java.lang.String r1 = r2.mo35331g()
                if (r1 != 0) goto L_0x0281
                java.lang.String unused = com.inmobi.media.C6145fs.f15579d
                r2.mo35325b()
                return
            L_0x0281:
                java.lang.String r1 = r2.mo35325b()
                java.lang.String r2 = r2.mo35331g()
                com.inmobi.media.C6145fs.m18327a((java.lang.String) r1, (java.lang.String) r2)
            L_0x028c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6145fs.C6146a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        public final void mo35333a(C6155fy.C6156a aVar) {
            Message obtain = Message.obtain();
            obtain.what = 6;
            obtain.obj = aVar;
            sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo35334a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private static boolean m18331b(String str, String str2) {
        String[] split = str.split(DnsName.ESCAPED_DOT);
        String[] split2 = str2.split(DnsName.ESCAPED_DOT);
        try {
            for (String valueOf : split) {
                if (Integer.valueOf(valueOf).intValue() < 0) {
                    return false;
                }
            }
            for (String valueOf2 : split2) {
                if (Integer.valueOf(valueOf2).intValue() < 0) {
                    return false;
                }
            }
            int length = split.length < split2.length ? split.length : split2.length;
            int i = 0;
            while (i < length) {
                if (split[i].equals(split2[i])) {
                    i++;
                } else if (Integer.valueOf(split[i]).intValue() < Integer.valueOf(split2[i]).intValue()) {
                    return true;
                } else {
                    return false;
                }
            }
            if (split.length < split2.length) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18325a(C6144fr frVar, C6148c cVar) {
        WeakReference weakReference;
        ArrayList arrayList = f15580e.get(frVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (cVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(cVar);
        }
        arrayList.add(weakReference);
        f15580e.put(frVar, arrayList);
    }

    /* renamed from: a */
    static /* synthetic */ void m18327a(String str, String str2) {
        new C6149ft();
        C6144fr a = C6144fr.m18314a(str, str2);
        if (C6149ft.m18341b("root", str2)) {
            m18330b(C6144fr.m18314a("root", str2));
            return;
        }
        C6166gd gdVar = (C6166gd) C6149ft.m18337a("root", str2);
        if (m18328a(C6149ft.m18342c(gdVar.mo35325b(), str2), gdVar.mo35347a(gdVar.mo35325b()))) {
            m18330b(C6144fr.m18314a("root", str2));
        }
        if ("root".equals(str)) {
            return;
        }
        if (C6149ft.m18341b(str, str2)) {
            m18330b(a);
        } else if (m18328a(C6149ft.m18342c(str, str2), gdVar.mo35347a(str))) {
            m18330b(a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18324a(C6144fr frVar) {
        C6148c cVar;
        ArrayList arrayList = f15580e.get(frVar);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!(arrayList.get(i) == null || (cVar = (C6148c) ((WeakReference) arrayList.get(i)).get()) == null)) {
                    cVar.mo34481a(frVar);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Map m18322a(Map map) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("root", (C6144fr) map.get("root"));
        return hashMap;
    }
}
