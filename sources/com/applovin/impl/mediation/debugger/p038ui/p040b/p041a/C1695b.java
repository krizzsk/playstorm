package com.applovin.impl.mediation.debugger.p038ui.p040b.p041a;

import android.content.Context;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.p038ui.p043d.C1707c;
import com.applovin.impl.sdk.C1944j;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a.b */
public class C1695b extends C1707c {

    /* renamed from: a */
    private final C1944j.C1945a f2475a;

    /* renamed from: o */
    private final Context f2476o;

    /* renamed from: p */
    private final boolean f2477p;

    public C1695b(C1944j.C1945a aVar, boolean z, Context context) {
        super(C1707c.C1710b.RIGHT_DETAIL);
        this.f2475a = aVar;
        this.f2476o = context;
        this.f2541d = new SpannedString(aVar.mo14267a());
        this.f2477p = z;
    }

    /* renamed from: b */
    public boolean mo13486b() {
        return true;
    }

    /* renamed from: c_ */
    public SpannedString mo13508c_() {
        return new SpannedString(this.f2475a.mo14268b(this.f2476o));
    }

    /* renamed from: d_ */
    public boolean mo13509d_() {
        Boolean a = this.f2475a.mo14266a(this.f2476o);
        if (a != null) {
            return a.equals(Boolean.valueOf(this.f2477p));
        }
        return false;
    }
}
