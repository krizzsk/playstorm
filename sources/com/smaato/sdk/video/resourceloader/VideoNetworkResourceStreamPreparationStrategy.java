package com.smaato.sdk.video.resourceloader;

import com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.core.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class VideoNetworkResourceStreamPreparationStrategy implements NetworkResourceStreamPreparationStrategy {
    public InputStream prepare(URLConnection uRLConnection) throws IOException {
        return ((URLConnection) Objects.requireNonNull(uRLConnection)).getInputStream();
    }
}
