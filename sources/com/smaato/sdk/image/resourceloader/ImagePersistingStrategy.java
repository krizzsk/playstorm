package com.smaato.sdk.image.resourceloader;

import com.smaato.sdk.core.resourceloader.PersistingStrategy;
import com.smaato.sdk.core.util.Objects;
import java.io.InputStream;

public class ImagePersistingStrategy implements PersistingStrategy<InputStream> {
    public InputStream get(String str) {
        return null;
    }

    public InputStream put(InputStream inputStream, String str, long j) {
        return (InputStream) Objects.requireNonNull(inputStream);
    }
}
