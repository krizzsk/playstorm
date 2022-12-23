package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;

public abstract class CoreAdTypeStrategy extends AdTypeStrategy {
    protected final String adSpaceId;
    protected final String publisherId;

    /* access modifiers changed from: protected */
    public abstract Iterable getParams();

    protected CoreAdTypeStrategy(String str, String str2) {
        this.publisherId = (String) Objects.requireNonNull(str);
        this.adSpaceId = (String) Objects.requireNonNull(str2);
    }

    public String getUniqueKey() {
        return Joiner.join((CharSequence) "_", getParams());
    }
}
