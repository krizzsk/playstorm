package com.smaato.sdk.core.util;

import com.smaato.sdk.core.util.p382fi.CheckedRunnable;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class IOUtils {
    private IOUtils() {
    }

    public static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        copy(inputStream, outputStream, 16384);
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        Objects.requireNonNull(inputStream);
        Objects.requireNonNull(outputStream);
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void closeSilently(Closeable closeable) {
        if (closeable != null) {
            Objects.doSilently(new CheckedRunnable(closeable) {
                public final /* synthetic */ Closeable f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    this.f$0.close();
                }
            });
        }
    }
}
