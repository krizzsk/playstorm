package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.unity3d.player.C11938p;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.unity3d.player.q */
final class C11941q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public UnityPlayer f29268a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f29269b = null;

    /* renamed from: c */
    private C11948a f29270c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Semaphore f29271d = new Semaphore(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Lock f29272e = new ReentrantLock();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C11938p f29273f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f29274g = 2;

    /* renamed from: h */
    private boolean f29275h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f29276i = false;

    /* renamed from: com.unity3d.player.q$a */
    public interface C11948a {
        /* renamed from: a */
        void mo72965a();
    }

    C11941q(UnityPlayer unityPlayer) {
        this.f29268a = unityPlayer;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m34587d() {
        C11938p pVar = this.f29273f;
        if (pVar != null) {
            this.f29268a.removeViewFromPlayer(pVar);
            this.f29276i = false;
            this.f29273f.destroyPlayer();
            this.f29273f = null;
            C11948a aVar = this.f29270c;
            if (aVar != null) {
                aVar.mo72965a();
            }
        }
    }

    /* renamed from: a */
    public final void mo73108a() {
        this.f29272e.lock();
        C11938p pVar = this.f29273f;
        if (pVar != null) {
            if (this.f29274g == 0) {
                pVar.CancelOnPrepare();
            } else if (this.f29276i) {
                boolean a = pVar.mo73081a();
                this.f29275h = a;
                if (!a) {
                    this.f29273f.pause();
                }
            }
        }
        this.f29272e.unlock();
    }

    /* renamed from: a */
    public final boolean mo73109a(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C11948a aVar) {
        this.f29272e.lock();
        this.f29270c = aVar;
        this.f29269b = context;
        this.f29271d.drainPermits();
        this.f29274g = 2;
        final String str2 = str;
        final int i4 = i;
        final int i5 = i2;
        final int i6 = i3;
        final boolean z2 = z;
        final long j3 = j;
        final long j4 = j2;
        runOnUiThread(new Runnable() {
            public final void run() {
                if (C11941q.this.f29273f != null) {
                    C11922g.Log(5, "Video already playing");
                    int unused = C11941q.this.f29274g = 2;
                    C11941q.this.f29271d.release();
                    return;
                }
                C11938p unused2 = C11941q.this.f29273f = new C11938p(C11941q.this.f29269b, str2, i4, i5, i6, z2, j3, j4, new C11938p.C11939a() {
                    /* renamed from: a */
                    public final void mo73105a(int i) {
                        C11941q.this.f29272e.lock();
                        int unused = C11941q.this.f29274g = i;
                        if (i == 3 && C11941q.this.f29276i) {
                            C11941q.this.runOnUiThread(new Runnable() {
                                public final void run() {
                                    C11941q.this.m34587d();
                                    C11941q.this.f29268a.resume();
                                }
                            });
                        }
                        if (i != 0) {
                            C11941q.this.f29271d.release();
                        }
                        C11941q.this.f29272e.unlock();
                    }
                });
                if (C11941q.this.f29273f != null) {
                    C11941q.this.f29268a.addView(C11941q.this.f29273f);
                }
            }
        });
        boolean z3 = false;
        try {
            this.f29272e.unlock();
            this.f29271d.acquire();
            this.f29272e.lock();
            if (this.f29274g != 2) {
                z3 = true;
            }
        } catch (InterruptedException unused) {
        }
        runOnUiThread(new Runnable() {
            public final void run() {
                C11941q.this.f29268a.pause();
            }
        });
        runOnUiThread((!z3 || this.f29274g == 3) ? new Runnable() {
            public final void run() {
                C11941q.this.m34587d();
                C11941q.this.f29268a.resume();
            }
        } : new Runnable() {
            public final void run() {
                if (C11941q.this.f29273f != null) {
                    C11941q.this.f29268a.addViewToPlayer(C11941q.this.f29273f, true);
                    boolean unused = C11941q.this.f29276i = true;
                    C11941q.this.f29273f.requestFocus();
                }
            }
        });
        this.f29272e.unlock();
        return z3;
    }

    /* renamed from: b */
    public final void mo73110b() {
        this.f29272e.lock();
        C11938p pVar = this.f29273f;
        if (pVar != null && this.f29276i && !this.f29275h) {
            pVar.start();
        }
        this.f29272e.unlock();
    }

    /* renamed from: c */
    public final void mo73111c() {
        this.f29272e.lock();
        C11938p pVar = this.f29273f;
        if (pVar != null) {
            pVar.updateVideoLayout();
        }
        this.f29272e.unlock();
    }

    /* access modifiers changed from: protected */
    public final void runOnUiThread(Runnable runnable) {
        Context context = this.f29269b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            C11922g.Log(5, "Not running from an Activity; Ignoring execution request...");
        }
    }
}
