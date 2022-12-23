package com.smaato.sdk.core.resourceloader;

import java.io.InputStream;

public interface PersistingStrategy<PersistedResourceType> {

    public enum Error {
        GENERIC,
        IO_ERROR,
        RESOURCE_EXPIRED
    }

    PersistedResourceType get(String str) throws PersistingStrategyException;

    PersistedResourceType put(InputStream inputStream, String str, long j) throws PersistingStrategyException;
}
