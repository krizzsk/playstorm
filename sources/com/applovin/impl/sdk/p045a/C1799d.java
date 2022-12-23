package com.applovin.impl.sdk.p045a;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* renamed from: com.applovin.impl.sdk.a.d */
public class C1799d {

    /* renamed from: a */
    private final View f2861a;

    /* renamed from: b */
    private final FriendlyObstructionPurpose f2862b;

    /* renamed from: c */
    private final String f2863c;

    public C1799d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f2861a = view;
        this.f2862b = friendlyObstructionPurpose;
        this.f2863c = str;
    }

    /* renamed from: a */
    public View mo13855a() {
        return this.f2861a;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose mo13856b() {
        return this.f2862b;
    }

    /* renamed from: c */
    public String mo13857c() {
        return this.f2863c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1799d dVar = (C1799d) obj;
        View view = this.f2861a;
        if (view == null ? dVar.f2861a != null : !view.equals(dVar.f2861a)) {
            return false;
        }
        if (this.f2862b != dVar.f2862b) {
            return false;
        }
        String str = this.f2863c;
        String str2 = dVar.f2863c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        View view = this.f2861a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f2862b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f2863c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }
}
