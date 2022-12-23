package com.inmobi.unification.sdk.model;

import java.util.Map;

public final class ASRequestParams {

    /* renamed from: a */
    public String f16192a;

    /* renamed from: b */
    public String f16193b;

    /* renamed from: c */
    public Map<String, String> f16194c;

    /* renamed from: d */
    public String f16195d;

    /* renamed from: e */
    public boolean f16196e;

    public static class Builder {
        private String a9Params;
        private Map<String, String> bidToken;
        private boolean hasDynamicMediation;
        private String pubKeys;
        private String vcUserId;

        public Builder setPubKeys(String str) {
            this.pubKeys = str;
            return this;
        }

        public Builder setA9Params(String str) {
            this.a9Params = str;
            return this;
        }

        public Builder setBidToken(Map<String, String> map) {
            this.bidToken = map;
            return this;
        }

        public Builder setVcUserId(String str) {
            this.vcUserId = str;
            return this;
        }

        public Builder setHasDynamicMediation(boolean z) {
            this.hasDynamicMediation = z;
            return this;
        }

        public ASRequestParams build() {
            ASRequestParams aSRequestParams = new ASRequestParams();
            aSRequestParams.f16192a = this.pubKeys;
            aSRequestParams.f16193b = this.a9Params;
            aSRequestParams.f16194c = this.bidToken;
            aSRequestParams.f16195d = this.vcUserId;
            aSRequestParams.f16196e = this.hasDynamicMediation;
            return aSRequestParams;
        }
    }
}
