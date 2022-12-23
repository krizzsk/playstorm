package com.unity3d.player;

import android.os.Build;

/* renamed from: com.unity3d.player.j */
public final class C11925j {

    /* renamed from: a */
    static final boolean f29204a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b */
    static final boolean f29205b = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: c */
    static final boolean f29206c;

    /* renamed from: d */
    static final C11920e f29207d = (f29205b ? new C11923h() : null);

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            z = false;
        }
        f29206c = z;
    }
}
