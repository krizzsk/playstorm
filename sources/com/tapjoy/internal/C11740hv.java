package com.tapjoy.internal;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hv */
public final class C11740hv implements Flushable {

    /* renamed from: a */
    private final File f28597a;

    /* renamed from: b */
    private final Object f28598b = this;

    /* renamed from: c */
    private C11432ar<C11591ex> f28599c;

    public C11740hv(File file) {
        this.f28597a = file;
        try {
            this.f28599c = C11429ao.m33220a(new C11600f(file, new C11438ax<C11591ex>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo72188a(OutputStream outputStream, Object obj) {
                    C11591ex exVar = (C11591ex) obj;
                    C11556el<C11591ex> elVar = C11591ex.f28028c;
                    C11555ek.m33503a(exVar, "value == null");
                    C11555ek.m33503a(outputStream, "stream == null");
                    C11802jc a = C11805jf.m34303a(C11805jf.m34305a(outputStream));
                    elVar.mo72357a(a, exVar);
                    a.mo72748a();
                }

                /* renamed from: b */
                public final /* synthetic */ Object mo72187b(InputStream inputStream) {
                    C11556el<C11591ex> elVar = C11591ex.f28028c;
                    C11555ek.m33503a(inputStream, "stream == null");
                    return elVar.mo72354a(C11805jf.m34304a(C11805jf.m34306a(inputStream)));
                }
            }));
        } catch (Exception unused) {
            m34113c();
        }
    }

    /* renamed from: c */
    private void m34113c() {
        this.f28597a.delete();
        C11432ar<C11591ex> arVar = this.f28599c;
        if (arVar instanceof Closeable) {
            try {
                ((Closeable) arVar).close();
            } catch (Exception unused) {
            }
        }
        this.f28599c = new C11430ap(new LinkedList());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void flush() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f28598b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f28599c     // Catch:{ all -> 0x0016 }
            boolean r1 = r1 instanceof java.io.Flushable     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0014
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f28599c     // Catch:{ Exception -> 0x0011 }
            java.io.Flushable r1 = (java.io.Flushable) r1     // Catch:{ Exception -> 0x0011 }
            r1.flush()     // Catch:{ Exception -> 0x0011 }
            goto L_0x0014
        L_0x0011:
            r2.m34113c()     // Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return
        L_0x0016:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11740hv.flush():void");
    }

    /* renamed from: a */
    public final int mo72670a() {
        int size;
        synchronized (this.f28598b) {
            try {
                size = this.f28599c.size();
            } catch (Exception unused) {
                m34113c();
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return size;
    }

    /* renamed from: b */
    public final boolean mo72674b() {
        boolean isEmpty;
        synchronized (this.f28598b) {
            try {
                isEmpty = this.f28599c.isEmpty();
            } catch (Exception unused) {
                m34113c();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return isEmpty;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72671a(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f28598b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f28599c     // Catch:{ Exception -> 0x000b }
            r1.mo72133b(r3)     // Catch:{ Exception -> 0x000b }
            goto L_0x000e
        L_0x0009:
            r3 = move-exception
            goto L_0x0010
        L_0x000b:
            r2.m34113c()     // Catch:{ all -> 0x0009 }
        L_0x000e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11740hv.mo72671a(int):void");
    }

    @Nullable
    /* renamed from: b */
    public final C11591ex mo72673b(int i) {
        C11591ex a;
        synchronized (this.f28598b) {
            try {
                a = this.f28599c.mo72132a(i);
            } catch (Exception unused) {
                m34113c();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72672a(com.tapjoy.internal.C11591ex r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f28598b
            monitor-enter(r0)
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f28599c     // Catch:{ Exception -> 0x000b }
            r1.add(r3)     // Catch:{ Exception -> 0x000b }
            goto L_0x0013
        L_0x0009:
            r3 = move-exception
            goto L_0x0015
        L_0x000b:
            r2.m34113c()     // Catch:{ all -> 0x0009 }
            com.tapjoy.internal.ar<com.tapjoy.internal.ex> r1 = r2.f28599c     // Catch:{ Exception -> 0x0013 }
            r1.add(r3)     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11740hv.mo72672a(com.tapjoy.internal.ex):void");
    }
}
