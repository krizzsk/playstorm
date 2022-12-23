package com.tapjoy.internal;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.tapjoy.internal.iv */
public final class C11790iv extends C11786is<Void> {

    /* renamed from: c */
    private final C11606fc f28771c;

    /* renamed from: d */
    private final C11588ew f28772d;

    /* renamed from: e */
    private final C11627fj f28773e;

    /* renamed from: f */
    private final String f28774f;

    /* renamed from: c */
    public final String mo72258c() {
        return "api/v1/tokens";
    }

    private C11790iv(C11606fc fcVar, C11588ew ewVar, C11627fj fjVar, String str) {
        this.f28771c = fcVar;
        this.f28772d = ewVar;
        this.f28773e = fjVar;
        this.f28774f = str;
    }

    public C11790iv(C11609fd fdVar, String str) {
        this(fdVar.f28157d, fdVar.f28158e, fdVar.f28159f, str);
    }

    /* renamed from: e */
    public final Map<String, Object> mo72260e() {
        Map<String, Object> e = super.mo72260e();
        e.put(TJAdUnitConstants.String.VIDEO_INFO, new C11451bg(C11748hz.m34135a(this.f28771c)));
        e.put(TapjoyConstants.TJC_APP_PLACEMENT, new C11451bg(C11748hz.m34131a(this.f28772d)));
        e.put("user", new C11451bg(C11748hz.m34136a(this.f28773e)));
        if (!TextUtils.isEmpty(this.f28774f)) {
            e.put("push_token", this.f28774f);
        }
        return e;
    }
}
