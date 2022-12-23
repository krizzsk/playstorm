package com.iab.omid.library.mmadbridge.p263b;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.p266e.C7961a;

/* renamed from: com.iab.omid.library.mmadbridge.b.c */
public class C7943c {

    /* renamed from: a */
    private final C7961a f18901a;

    /* renamed from: b */
    private final String f18902b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f18903c;

    /* renamed from: d */
    private final String f18904d;

    public C7943c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f18901a = new C7961a(view);
        this.f18902b = view.getClass().getCanonicalName();
        this.f18903c = friendlyObstructionPurpose;
        this.f18904d = str;
    }

    /* renamed from: a */
    public C7961a mo55598a() {
        return this.f18901a;
    }

    /* renamed from: b */
    public String mo55599b() {
        return this.f18902b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo55600c() {
        return this.f18903c;
    }

    /* renamed from: d */
    public String mo55601d() {
        return this.f18904d;
    }
}
