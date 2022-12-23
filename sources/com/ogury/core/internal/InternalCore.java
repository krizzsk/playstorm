package com.ogury.core.internal;

import android.content.Context;
import com.ogury.core.internal.C10272d;
import com.ogury.core.internal.aaid.C10210e;
import com.ogury.core.internal.aaid.OguryAaid;

/* compiled from: InternalCore.kt */
public final class InternalCore {
    public static final InternalCore INSTANCE = new InternalCore();

    public static final String getVersion() {
        return "1.1.0";
    }

    private InternalCore() {
    }

    public static final void setSdkType(Context context, int i) {
        C10219ai.m31036b(context, "context");
        C10272d.C10273a aVar = C10272d.f26071a;
        C10272d.C10273a.m31123a(context).mo66846a(i);
    }

    public static final int getSdkType(Context context) {
        C10219ai.m31036b(context, "context");
        C10272d.C10273a aVar = C10272d.f26071a;
        return C10272d.C10273a.m31123a(context).mo66845a();
    }

    public static final OguryAaid getAaid(Context context) {
        C10219ai.m31036b(context, "context");
        return C10210e.f25991a.mo66776a(context);
    }

    public static final int getFrameworkValue() {
        return new C10241c((C10276f) null, 1).mo66793a();
    }

    public static final String getFrameworkName() {
        return new C10241c((C10276f) null, 1).mo66794b();
    }

    public static final String getToken(Context context, String str) {
        C10219ai.m31036b(context, "context");
        C10219ai.m31036b(str, "keyName");
        return new C10274e(context).mo66847a(str);
    }
}
