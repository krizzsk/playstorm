package com.smaato.sdk.image.resourceloader;

import com.smaato.sdk.core.resourceloader.NetworkResourceStreamPreparationStrategy;
import com.smaato.sdk.core.util.HeaderUtils;
import com.smaato.sdk.core.util.IOUtils;
import com.smaato.sdk.core.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;

public class ImageNetworkResourceStreamPreparationStrategy implements NetworkResourceStreamPreparationStrategy {
    private final HeaderUtils headerUtils;

    public ImageNetworkResourceStreamPreparationStrategy(HeaderUtils headerUtils2) {
        this.headerUtils = (HeaderUtils) Objects.requireNonNull(headerUtils2);
    }

    public InputStream prepare(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        Objects.requireNonNull(uRLConnection);
        if (!this.headerUtils.isChunkedTransferEncoding(uRLConnection.getHeaderFields())) {
            return uRLConnection.getInputStream();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream = uRLConnection.getInputStream();
            IOUtils.copy(inputStream, byteArrayOutputStream);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            if (inputStream != null) {
                inputStream.close();
            }
            byteArrayOutputStream.close();
            return byteArrayInputStream;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
        throw th;
    }
}
