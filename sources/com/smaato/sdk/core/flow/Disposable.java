package com.smaato.sdk.core.flow;

import java.util.Collection;

public interface Disposable {
    void dispose();

    void addTo(Collection<Disposable> collection) {
        collection.add(this);
    }
}
