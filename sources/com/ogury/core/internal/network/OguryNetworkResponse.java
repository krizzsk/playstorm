package com.ogury.core.internal.network;

import com.ogury.core.internal.C10218ah;
import com.ogury.core.internal.C10219ai;

/* compiled from: OguryNetworkResponse.kt */
public abstract class OguryNetworkResponse {

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Success extends OguryNetworkResponse {

        /* renamed from: a */
        private final String f26083a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Success(String str) {
            super((C10218ah) null);
            C10219ai.m31036b(str, "responseBody");
            this.f26083a = str;
        }

        public final String getResponseBody() {
            return this.f26083a;
        }
    }

    private OguryNetworkResponse() {
    }

    public /* synthetic */ OguryNetworkResponse(C10218ah ahVar) {
        this();
    }

    /* compiled from: OguryNetworkResponse.kt */
    public static final class Failure extends OguryNetworkResponse {

        /* renamed from: a */
        private final Throwable f26082a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Failure(Throwable th) {
            super((C10218ah) null);
            C10219ai.m31036b(th, "exception");
            this.f26082a = th;
        }

        public final Throwable getException() {
            return this.f26082a;
        }
    }
}
