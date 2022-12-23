package com.tapjoy.internal;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: com.tapjoy.internal.jv */
public final class C11828jv {

    /* renamed from: a */
    final String f28915a;

    /* renamed from: b */
    final CharSequence f28916b;

    /* renamed from: c */
    final CharSequence[] f28917c;

    /* renamed from: d */
    final boolean f28918d;

    /* renamed from: e */
    final Bundle f28919e;

    /* renamed from: f */
    final Set<String> f28920f;

    /* renamed from: a */
    static RemoteInput[] m34386a(C11828jv[] jvVarArr) {
        if (jvVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jvVarArr.length];
        for (int i = 0; i < jvVarArr.length; i++) {
            C11828jv jvVar = jvVarArr[i];
            remoteInputArr[i] = new RemoteInput.Builder(jvVar.f28915a).setLabel(jvVar.f28916b).setChoices(jvVar.f28917c).setAllowFreeFormInput(jvVar.f28918d).addExtras(jvVar.f28919e).build();
        }
        return remoteInputArr;
    }
}
