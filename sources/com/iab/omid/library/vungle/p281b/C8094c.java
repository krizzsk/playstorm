package com.iab.omid.library.vungle.p281b;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.vungle.p284e.C8112a;

/* renamed from: com.iab.omid.library.vungle.b.c */
public class C8094c {

    /* renamed from: a */
    private final C8112a f19251a;

    /* renamed from: b */
    private final String f19252b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f19253c;

    /* renamed from: d */
    private final String f19254d;

    public C8094c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f19251a = new C8112a(view);
        this.f19252b = view.getClass().getCanonicalName();
        this.f19253c = friendlyObstructionPurpose;
        this.f19254d = str;
    }

    /* renamed from: a */
    public C8112a mo56201a() {
        return this.f19251a;
    }

    /* renamed from: b */
    public String mo56202b() {
        return this.f19252b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo56203c() {
        return this.f19253c;
    }

    /* renamed from: d */
    public String mo56204d() {
        return this.f19254d;
    }
}
