package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.p205e.C6423c;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
public final class C6685b extends IronSourceLogger {

    /* renamed from: c */
    public LogListener f17421c;

    private C6685b() {
        super("publisher");
    }

    public C6685b(LogListener logListener, int i) {
        super("publisher", 1);
        this.f17421c = null;
    }

    public final synchronized void log(final IronSourceLogger.IronSourceTag ironSourceTag, final String str, final int i) {
        C6423c.f16330a.mo35933a(new Runnable() {
            public final void run() {
                if (C6685b.this.f17421c != null && str != null) {
                    C6685b.this.f17421c.onLog(ironSourceTag, str, i);
                }
            }
        });
    }

    public final void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
