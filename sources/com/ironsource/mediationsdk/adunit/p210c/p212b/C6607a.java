package com.ironsource.mediationsdk.adunit.p210c.p212b;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b.a */
public final class C6607a {

    /* renamed from: a */
    public C6608a f17128a;

    /* renamed from: b */
    public long f17129b;

    /* renamed from: c */
    public long f17130c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a */
    public enum C6608a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C6607a(C6608a aVar, long j, long j2) {
        this.f17128a = aVar;
        this.f17129b = j;
        this.f17130c = j2;
    }

    /* renamed from: a */
    public final boolean mo36565a() {
        return this.f17128a == C6608a.MANUAL || this.f17128a == C6608a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    /* renamed from: b */
    public final boolean mo36566b() {
        return this.f17128a == C6608a.AUTOMATIC_LOAD_AFTER_CLOSE || this.f17128a == C6608a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
