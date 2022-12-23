package com.mbridge.msdk.click.p057a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* renamed from: com.mbridge.msdk.click.a.b */
/* compiled from: RetryUrlRecordData */
public final class C2307b {

    /* renamed from: a */
    public static int f4749a = 0;

    /* renamed from: b */
    public static int f4750b = 1;

    /* renamed from: c */
    private String f4751c;

    /* renamed from: d */
    private int f4752d;

    /* renamed from: e */
    private HashSet<String> f4753e = new HashSet<>();

    /* renamed from: f */
    private long f4754f = System.currentTimeMillis();

    /* renamed from: g */
    private CampaignEx f4755g;

    /* renamed from: h */
    private String f4756h;

    /* renamed from: i */
    private int f4757i;

    /* renamed from: j */
    private boolean f4758j;

    /* renamed from: k */
    private boolean f4759k;

    /* renamed from: l */
    private int f4760l;

    /* renamed from: a */
    public final boolean mo15659a() {
        return this.f4758j;
    }

    /* renamed from: a */
    public final void mo15658a(boolean z) {
        this.f4758j = z;
    }

    /* renamed from: b */
    public final boolean mo15663b() {
        return this.f4759k;
    }

    /* renamed from: b */
    public final void mo15662b(boolean z) {
        this.f4759k = z;
    }

    /* renamed from: c */
    public final int mo15664c() {
        return this.f4760l;
    }

    /* renamed from: a */
    public final void mo15655a(int i) {
        this.f4760l = i;
    }

    /* renamed from: d */
    public final int mo15665d() {
        return this.f4757i;
    }

    /* renamed from: b */
    public final void mo15660b(int i) {
        this.f4757i = i;
    }

    public C2307b(String str, String str2) {
        this.f4751c = str;
        mo15661b(str2);
    }

    /* renamed from: e */
    public final String mo15666e() {
        return this.f4756h;
    }

    /* renamed from: a */
    public final void mo15657a(String str) {
        this.f4756h = str;
    }

    /* renamed from: f */
    public final CampaignEx mo15667f() {
        return this.f4755g;
    }

    /* renamed from: a */
    public final void mo15656a(CampaignEx campaignEx) {
        this.f4755g = campaignEx;
    }

    /* renamed from: g */
    public final String mo15668g() {
        return this.f4751c;
    }

    /* renamed from: h */
    public final int mo15669h() {
        return this.f4752d;
    }

    /* renamed from: i */
    public final HashSet<String> mo15670i() {
        return this.f4753e;
    }

    /* renamed from: b */
    public final void mo15661b(String str) {
        this.f4752d++;
        this.f4753e.add(str);
    }

    /* renamed from: j */
    public final long mo15671j() {
        return this.f4754f;
    }
}
