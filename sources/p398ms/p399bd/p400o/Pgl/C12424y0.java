package p398ms.p399bd.p400o.Pgl;

/* renamed from: ms.bd.o.Pgl.y0 */
public class C12424y0 {

    /* renamed from: c */
    private static volatile C12424y0 f29447c;

    /* renamed from: a */
    private int f29448a = 0;

    /* renamed from: b */
    private Throwable f29449b = null;

    private C12424y0() {
    }

    /* renamed from: a */
    public static C12424y0 m34803a() {
        if (f29447c == null) {
            synchronized (C12424y0.class) {
                if (f29447c == null) {
                    f29447c = new C12424y0();
                }
            }
        }
        return f29447c;
    }

    /* renamed from: b */
    public synchronized Throwable mo76491b() {
        return this.f29449b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo76492c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Throwable r0 = r2.f29449b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            int r0 = r2.f29448a     // Catch:{ all -> 0x001e }
            int r1 = r0 + 1
            r2.f29448a = r1     // Catch:{ all -> 0x001e }
            r1 = 30
            if (r0 >= r1) goto L_0x0010
            goto L_0x001c
        L_0x0010:
            r0 = 0
            r2.f29448a = r0     // Catch:{ all -> 0x001e }
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r2.f29449b = r0     // Catch:{ all -> 0x001e }
            monitor-exit(r2)
            return
        L_0x001c:
            monitor-exit(r2)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.C12424y0.mo76492c():void");
    }
}
