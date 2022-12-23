package com.p374my.tracker.recsys;

import android.os.Handler;
import com.p374my.tracker.obfuscated.C10104d;
import com.p374my.tracker.recsys.OfferRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.my.tracker.recsys.OfferRequestBuilder */
public final class OfferRequestBuilder {

    /* renamed from: a */
    private final String f25521a;

    /* renamed from: b */
    private final List<String> f25522b = new ArrayList();

    /* renamed from: c */
    private String f25523c = null;

    /* renamed from: d */
    private Boolean f25524d = null;

    /* renamed from: e */
    private OfferRequest.OnCompleteListener f25525e;

    /* renamed from: f */
    private Handler f25526f = C10104d.f25156a;

    private OfferRequestBuilder(String str) {
        this.f25521a = str;
    }

    public static OfferRequestBuilder newBuilder(String str) {
        return new OfferRequestBuilder(str);
    }

    public OfferRequest build() {
        return new OfferRequest(this.f25521a, this.f25522b, this.f25523c, this.f25524d, this.f25525e, this.f25526f);
    }

    public OfferRequestBuilder withData(String str) {
        this.f25523c = str;
        return this;
    }

    public OfferRequestBuilder withHandler(Handler handler) {
        this.f25526f = handler;
        return this;
    }

    public OfferRequestBuilder withPlacementIds(String... strArr) {
        if (!this.f25522b.isEmpty()) {
            this.f25522b.clear();
        }
        if (strArr == null) {
            return this;
        }
        for (String str : strArr) {
            if (str != null && !this.f25522b.contains(str)) {
                this.f25522b.add(str);
            }
        }
        return this;
    }

    public OfferRequestBuilder withRequestListener(OfferRequest.OnCompleteListener onCompleteListener) {
        this.f25525e = onCompleteListener;
        return this;
    }

    public OfferRequestBuilder withReset(boolean z) {
        this.f25524d = Boolean.valueOf(z);
        return this;
    }
}
