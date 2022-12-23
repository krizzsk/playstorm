package com.smaato.sdk.core.resourceloader;

public interface ResourceTransformer<PersistedResourceType, OutputResourceType> {
    OutputResourceType transform(PersistedResourceType persistedresourcetype);
}
