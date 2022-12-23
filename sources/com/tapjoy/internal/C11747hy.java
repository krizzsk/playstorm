package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hy */
abstract class C11747hy implements C11693gv {

    /* renamed from: a */
    private static final String[] f28614a;

    C11747hy() {
    }

    static {
        String[] strArr = {"reward", FirebaseAnalytics.Event.PURCHASE, "custom_action"};
        f28614a = strArr;
        Arrays.sort(strArr);
    }

    /* renamed from: a */
    public final void mo72583a(C11694gw gwVar) {
        if (this instanceof C11697gz) {
            C11697gz gzVar = (C11697gz) this;
            gwVar.mo71662a(gzVar.mo72584a(), gzVar.mo72585b());
        } else if (this instanceof C11699ha) {
            C11699ha haVar = (C11699ha) this;
            gwVar.mo71663a(haVar.mo72586a(), haVar.mo72587b(), haVar.mo72588c(), haVar.mo72589d());
        }
    }

    /* renamed from: a */
    public static boolean m34129a(String str) {
        return Arrays.binarySearch(f28614a, str) >= 0;
    }

    @Nullable
    /* renamed from: a */
    public static C11747hy m34128a(String str, C11452bh bhVar) {
        if ("reward".equals(str)) {
            return (C11747hy) bhVar.mo72208a(C11768ii.f28668a);
        }
        if (FirebaseAnalytics.Event.PURCHASE.equals(str)) {
            return (C11747hy) bhVar.mo72208a(C11764ig.f28659a);
        }
        return null;
    }
}
