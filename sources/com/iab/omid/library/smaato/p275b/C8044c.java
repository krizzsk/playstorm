package com.iab.omid.library.smaato.p275b;

import android.view.View;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.smaato.p278e.C8062a;

/* renamed from: com.iab.omid.library.smaato.b.c */
public class C8044c {

    /* renamed from: a */
    private final C8062a f19138a;

    /* renamed from: b */
    private final String f19139b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f19140c;

    /* renamed from: d */
    private final String f19141d;

    public C8044c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f19138a = new C8062a(view);
        this.f19139b = view.getClass().getCanonicalName();
        this.f19140c = friendlyObstructionPurpose;
        this.f19141d = str;
    }

    /* renamed from: a */
    public C8062a mo56007a() {
        return this.f19138a;
    }

    /* renamed from: b */
    public String mo56008b() {
        return this.f19139b;
    }

    /* renamed from: c */
    public FriendlyObstructionPurpose mo56009c() {
        return this.f19140c;
    }

    /* renamed from: d */
    public String mo56010d() {
        return this.f19141d;
    }
}
