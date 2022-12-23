package com.tapjoy.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.is */
public abstract class C11786is<Result> extends C11469bt<Result> {
    /* renamed from: b */
    public final String mo72257b() {
        return ShareTarget.METHOD_POST;
    }

    /* renamed from: d */
    public final String mo72259d() {
        return "application/json";
    }

    /* renamed from: e */
    public Map<String, Object> mo72260e() {
        Map<String, Object> e = super.mo72260e();
        C11714hj a = C11714hj.m33999a();
        e.put("sdk_ver", a.f28491l + "/Android");
        e.put(TapjoyConstants.TJC_API_KEY, a.f28490k);
        if (C11710hg.f28464a) {
            e.put(TapjoyConstants.TJC_DEBUG, Boolean.TRUE);
        }
        return e;
    }

    /* renamed from: f */
    public Result mo72261f() {
        try {
            return super.mo72261f();
        } catch (Exception e) {
            Object[] objArr = new Object[1];
            throw e;
        }
    }

    @Nullable
    /* renamed from: a */
    public Result mo72253a(C11452bh bhVar) {
        bhVar.mo72234s();
        return null;
    }
}
