package com.ogury.p375cm.internal;

import com.ogury.p375cm.OguryChoiceManager;

/* renamed from: com.ogury.cm.internal.abbcb */
public final class abbcb {

    /* renamed from: a */
    private OguryChoiceManager.Answer f25738a;

    /* renamed from: b */
    private boolean f25739b;

    /* renamed from: c */
    private abcab f25740c;

    /* renamed from: d */
    private abcaa f25741d;

    public abbcb() {
        this((abcab) null, (abcaa) null, 3, (bbabb) null);
    }

    public abbcb(abcab abcab, abcaa abcaa) {
        bbabc.m30943b(abcab, "consentResultTcf");
        bbabc.m30943b(abcaa, "consentResultCcpaf");
        this.f25740c = abcab;
        this.f25741d = abcaa;
        this.f25738a = OguryChoiceManager.Answer.NO_ANSWER;
    }

    public /* synthetic */ abbcb(abcab abcab, abcaa abcaa, int i, bbabb bbabb) {
        this(new abcac(), new abcaa());
    }

    /* renamed from: a */
    public final OguryChoiceManager.Answer mo66556a() {
        return this.f25738a;
    }

    /* renamed from: a */
    public final void mo66557a(OguryChoiceManager.Answer answer) {
        bbabc.m30943b(answer, "<set-?>");
        this.f25738a = answer;
    }

    /* renamed from: a */
    public final void mo66558a(boolean z) {
        this.f25739b = z;
    }

    /* renamed from: b */
    public final boolean mo66559b() {
        return this.f25739b;
    }

    /* renamed from: c */
    public final abcab mo66560c() {
        return this.f25740c;
    }

    /* renamed from: d */
    public final abcaa mo66561d() {
        return this.f25741d;
    }
}
