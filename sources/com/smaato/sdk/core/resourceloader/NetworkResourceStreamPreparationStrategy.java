package com.smaato.sdk.core.resourceloader;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public interface NetworkResourceStreamPreparationStrategy {
    InputStream prepare(URLConnection uRLConnection) throws IOException;
}
