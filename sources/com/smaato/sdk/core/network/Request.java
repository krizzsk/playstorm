package com.smaato.sdk.core.network;

import android.net.Uri;
import androidx.browser.trusted.sharing.ShareTarget;
import com.smaato.sdk.core.network.AutoValue_Request;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

public abstract class Request {

    public interface Body {
        void writeTo(OutputStream outputStream) throws IOException;
    }

    public static abstract class Builder {
        public abstract Builder body(Body body);

        public abstract Request build();

        public abstract Builder followRedirects(boolean z);

        public abstract Builder headers(Headers headers);

        public abstract Builder method(String str);

        public abstract Builder uri(Uri uri);
    }

    public abstract Body body();

    /* access modifiers changed from: package-private */
    public abstract boolean followRedirects();

    public abstract Headers headers();

    public abstract String method();

    public abstract Uri uri();

    public static Request get(String str) {
        return new AutoValue_Request.Builder().method(ShareTarget.METHOD_GET).uri(Uri.parse(str)).headers(Headers.empty()).followRedirects(true).build();
    }

    public static Request post(String str, byte[] bArr) {
        return new AutoValue_Request.Builder().method(ShareTarget.METHOD_POST).uri(Uri.parse(str)).headers(Headers.empty()).followRedirects(true).body(new Body(bArr) {
            public final /* synthetic */ byte[] f$0;

            {
                this.f$0 = r1;
            }

            public final void writeTo(OutputStream outputStream) {
                Request.lambda$post$0(this.f$0, outputStream);
            }
        }).build();
    }

    static /* synthetic */ void lambda$post$0(byte[] bArr, OutputStream outputStream) throws IOException {
        outputStream.write(bArr);
        outputStream.close();
    }

    public static Builder builder() {
        return new AutoValue_Request.Builder().headers(Headers.m32962of(Collections.emptyMap())).followRedirects(true);
    }

    public Builder buildUpon() {
        return new AutoValue_Request.Builder().uri(uri()).method(method()).headers(headers()).body(body()).followRedirects(followRedirects());
    }
}
