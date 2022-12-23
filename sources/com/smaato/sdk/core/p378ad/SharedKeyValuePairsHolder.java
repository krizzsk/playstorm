package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.KeyValuePairs;

/* renamed from: com.smaato.sdk.core.ad.SharedKeyValuePairsHolder */
public class SharedKeyValuePairsHolder {
    private KeyValuePairs keyValuePairs;

    public KeyValuePairs getKeyValuePairs() {
        KeyValuePairs keyValuePairs2 = this.keyValuePairs;
        if (keyValuePairs2 == null) {
            return null;
        }
        return keyValuePairs2.clone();
    }

    public void setKeyValuePairs(KeyValuePairs keyValuePairs2) {
        this.keyValuePairs = keyValuePairs2 == null ? null : keyValuePairs2.clone();
    }
}
