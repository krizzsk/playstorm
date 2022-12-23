package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5047s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x */
public final class C5015x {

    /* renamed from: a */
    public final ExecutorService f13389a;

    /* renamed from: b */
    public C5017b<? extends C5018c> f13390b;

    /* renamed from: c */
    public IOException f13391c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$a */
    public interface C5016a<T extends C5018c> {
        /* renamed from: a */
        int mo25213a(T t, long j, long j2, IOException iOException);

        /* renamed from: a */
        void mo25216a(T t, long j, long j2);

        /* renamed from: a */
        void mo25217a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c */
    public interface C5018c {
        /* renamed from: a */
        boolean mo25185a();

        /* renamed from: b */
        void mo25186b();

        void load() throws IOException, InterruptedException;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$d */
    public static final class C5019d extends IOException {
        public C5019d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C5015x(String str) {
        this.f13389a = C5049u.m15398c(str);
    }

    /* renamed from: a */
    public <T extends C5018c> long mo25565a(T t, C5016a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C5023a.m15304b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C5017b(myLooper, t, aVar, i, elapsedRealtime).mo25570a(0);
        return elapsedRealtime;
    }

    /* renamed from: b */
    public boolean mo25567b() {
        return this.f13390b != null;
    }

    /* renamed from: c */
    public void mo25568c() throws IOException {
        IOException iOException = this.f13391c;
        if (iOException == null) {
            C5017b<? extends C5018c> bVar = this.f13390b;
            if (bVar != null) {
                int i = bVar.f13394c;
                IOException iOException2 = bVar.f13396e;
                if (iOException2 != null && bVar.f13397f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: d */
    public void mo25569d() {
        C5017b<? extends C5018c> bVar = this.f13390b;
        if (bVar != null) {
            bVar.mo25571a(true);
        }
        this.f13389a.shutdown();
    }

    /* renamed from: a */
    public void mo25566a() {
        this.f13390b.mo25571a(false);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$b */
    public final class C5017b<T extends C5018c> extends Handler implements Runnable {

        /* renamed from: a */
        public final T f13392a;

        /* renamed from: b */
        public final C5016a<T> f13393b;

        /* renamed from: c */
        public final int f13394c;

        /* renamed from: d */
        public final long f13395d;

        /* renamed from: e */
        public IOException f13396e;

        /* renamed from: f */
        public int f13397f;

        /* renamed from: g */
        public volatile Thread f13398g;

        /* renamed from: h */
        public volatile boolean f13399h;

        public C5017b(Looper looper, T t, C5016a<T> aVar, int i, long j) {
            super(looper);
            this.f13392a = t;
            this.f13393b = aVar;
            this.f13394c = i;
            this.f13395d = j;
        }

        /* renamed from: a */
        public void mo25570a(long j) {
            C5023a.m15304b(C5015x.this.f13390b == null);
            C5015x xVar = C5015x.this;
            xVar.f13390b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f13396e = null;
            xVar.f13389a.execute(this);
        }

        public void handleMessage(Message message) {
            int i;
            if (!this.f13399h) {
                int i2 = message.what;
                if (i2 == 0) {
                    this.f13396e = null;
                    C5015x xVar = C5015x.this;
                    xVar.f13389a.execute(xVar.f13390b);
                } else if (i2 != 4) {
                    C5015x.this.f13390b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f13395d;
                    if (this.f13392a.mo25185a()) {
                        this.f13393b.mo25217a(this.f13392a, elapsedRealtime, j, false);
                        return;
                    }
                    int i3 = message.what;
                    if (i3 == 1) {
                        this.f13393b.mo25217a(this.f13392a, elapsedRealtime, j, false);
                    } else if (i3 == 2) {
                        this.f13393b.mo25216a(this.f13392a, elapsedRealtime, j);
                    } else if (i3 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f13396e = iOException;
                        int a = this.f13393b.mo25213a(this.f13392a, elapsedRealtime, j, iOException);
                        if (a == 3) {
                            C5015x.this.f13391c = this.f13396e;
                        } else if (a != 2) {
                            if (a == 1) {
                                i = 1;
                            } else {
                                i = this.f13397f + 1;
                            }
                            this.f13397f = i;
                            mo25570a((long) Math.min((i - 1) * 1000, 5000));
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f13398g = Thread.currentThread();
                if (!this.f13392a.mo25185a()) {
                    C5047s.m15380a("load:" + this.f13392a.getClass().getSimpleName());
                    this.f13392a.load();
                    C5047s.m15379a();
                }
                if (!this.f13399h) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f13399h) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C5023a.m15304b(this.f13392a.mo25185a());
                if (!this.f13399h) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f13399h) {
                    obtainMessage(3, new C5019d(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f13399h) {
                    obtainMessage(3, new C5019d(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f13399h) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C5047s.m15379a();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo25571a(boolean z) {
            this.f13399h = z;
            this.f13396e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f13392a.mo25186b();
                if (this.f13398g != null) {
                    this.f13398g.interrupt();
                }
            }
            if (z) {
                C5015x.this.f13390b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f13393b.mo25217a(this.f13392a, elapsedRealtime, elapsedRealtime - this.f13395d, true);
            }
        }
    }
}
