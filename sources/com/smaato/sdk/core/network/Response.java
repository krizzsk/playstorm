package com.smaato.sdk.core.network;

import androidx.browser.trusted.sharing.ShareTarget;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.smaato.sdk.core.network.AutoValue_Response;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Collections;

public abstract class Response implements Closeable {

    public interface Body {
        long contentLength();

        InputStream source();
    }

    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Response build();

        public abstract Builder connection(HttpURLConnection httpURLConnection);

        public abstract Builder encoding(String str);

        public abstract Builder headers(Headers headers);

        public abstract Builder mimeType(MimeType mimeType);

        public abstract Builder request(Request request);

        public abstract Builder responseCode(int i);
    }

    public abstract Body body();

    /* access modifiers changed from: package-private */
    public abstract HttpURLConnection connection();

    public abstract String encoding();

    public abstract Headers headers();

    public abstract MimeType mimeType();

    public abstract Request request();

    public abstract int responseCode();

    public static Builder builder() {
        return new AutoValue_Response.Builder().headers(Headers.m32962of(Collections.emptyMap()));
    }

    public void close() throws IOException {
        connection().disconnect();
    }

    public boolean isRedirect() {
        int responseCode = responseCode();
        if (responseCode == 307 || responseCode == 308) {
            String method = request().method();
            if (ShareTarget.METHOD_GET.equalsIgnoreCase(method) || VersionInfo.GIT_BRANCH.equalsIgnoreCase(method)) {
                return true;
            }
            return false;
        }
        switch (responseCode) {
            case 300:
            case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
            case 302:
            case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                return true;
            default:
                return false;
        }
    }

    public Builder buildUpon() {
        return builder().request(request()).responseCode(responseCode()).headers(headers()).mimeType(mimeType()).body(body()).encoding(encoding()).connection(connection());
    }
}
