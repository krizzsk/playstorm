package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.serverapi.C5301c;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.d0 */
public class C4538d0 {

    /* renamed from: a */
    public final InneractiveAdRequest f11217a;

    /* renamed from: b */
    public final C5301c f11218b;

    /* renamed from: c */
    public Map<String, String> f11219c;

    public C4538d0(InneractiveAdRequest inneractiveAdRequest, C5301c cVar) {
        this.f11217a = inneractiveAdRequest;
        this.f11218b = cVar;
    }

    /* renamed from: a */
    public final void mo24745a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f11219c.put(str, str2);
        }
    }
}
