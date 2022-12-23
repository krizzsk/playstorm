package com.fyber.inneractive.sdk.player;

import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.fyber.inneractive.sdk.player.e */
public class C4665e {

    /* renamed from: a */
    public C4640g f11642a;

    /* renamed from: b */
    public ScheduledThreadPoolExecutor f11643b;

    /* renamed from: c */
    public Runnable f11644c;

    /* renamed from: d */
    public boolean f11645d = false;

    /* renamed from: com.fyber.inneractive.sdk.player.e$a */
    public class C4666a implements Runnable {
        public C4666a() {
        }

        public void run() {
            C4665e eVar = C4665e.this;
            eVar.getClass();
            IAlog.m16699a("player progress monitor: run started", new Object[0]);
            int c = eVar.f11642a.mo24864c();
            if (!eVar.f11645d) {
                int i = c + 0;
                IAlog.m16699a("run: 2 seconds passed? played for %d since last play started", Integer.valueOf(i));
                if (i >= 2000) {
                    IAlog.m16699a("run: setting played 2 seconds flag", new Object[0]);
                    eVar.f11645d = true;
                }
            }
            eVar.f11642a.mo24856a(c);
        }
    }

    public C4665e(C4640g gVar) {
        this.f11642a = gVar;
        this.f11644c = new C4666a();
    }
}
