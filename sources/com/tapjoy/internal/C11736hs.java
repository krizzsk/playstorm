package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tapjoy.internal.hs */
public final class C11736hs {

    /* renamed from: a */
    final C11832n f28559a = new C11832n(this.f28561c, "noMoreToday.date");

    /* renamed from: b */
    public final C11832n f28560b = new C11832n(this.f28561c, "noMoreToday.actionIds");

    /* renamed from: c */
    private final SharedPreferences f28561c;

    public C11736hs(Context context) {
        this.f28561c = context.getApplicationContext().getSharedPreferences("fiverocks", 0);
        mo72666b();
    }

    /* renamed from: a */
    static String m34103a() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    /* renamed from: b */
    public final void mo72666b() {
        String a = this.f28559a.mo72813a();
        if (a != null && !m34103a().equals(a)) {
            this.f28559a.mo72814a((String) null);
            this.f28560b.mo72814a((String) null);
        }
    }
}
