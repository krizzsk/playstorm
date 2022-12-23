package com.ogury.p376ed.internal;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.tapjoy.TapjoyConstants;
import java.util.Map;

/* renamed from: com.ogury.ed.internal.dn */
public final class C10460dn extends C10464dr {

    /* renamed from: a */
    private final C10510ez f26435a;

    /* renamed from: b */
    private final C10463dq f26436b;

    public /* synthetic */ C10460dn(Context context, C10463dq dqVar) {
        this(context, new C10514fa(context), new C10542fx(context), new C10510ez(context), dqVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C10460dn(Context context, C10514fa faVar, C10542fx fxVar, C10510ez ezVar, C10463dq dqVar) {
        super(context, faVar, fxVar);
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(faVar, TapjoyConstants.TJC_APP_PLACEMENT);
        C10765mq.m32773b(fxVar, "coreWrapper");
        C10765mq.m32773b(ezVar, "androidDevice");
        C10765mq.m32773b(dqVar, "configurableRequestFieldPermission");
        this.f26435a = ezVar;
        this.f26436b = dqVar;
    }

    public final Map<String, String> loadHeaders() {
        Map<String, String> loadHeaders = super.loadHeaders();
        loadHeaders.put("WebView-User-Agent", mo67198b().mo67362g());
        loadHeaders.put(ExifInterface.TAG_ORIENTATION, this.f26435a.mo67345n());
        return loadHeaders;
    }

    /* renamed from: a */
    public final String mo67194a() {
        if (!this.f26436b.mo67196a()) {
            return "00000000-0000-0000-0000-000000000000";
        }
        String id = mo67199c().mo67450a().getId();
        C10765mq.m32770a((Object) id, "{\n            coreWrapper.getAaid().id\n        }");
        return id;
    }
}
