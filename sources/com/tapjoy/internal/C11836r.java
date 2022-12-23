package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.net.ContentHandler;
import java.net.URLConnection;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.r */
public final class C11836r extends ContentHandler {

    /* renamed from: a */
    public static final C11836r f28927a = new C11836r();

    @Nullable
    public final /* synthetic */ Object getContent(URLConnection uRLConnection) {
        return m34400a(uRLConnection);
    }

    private C11836r() {
    }

    @Nullable
    /* renamed from: a */
    private static Bitmap m34400a(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return C11837s.f28928a.mo72187b(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m34399a(InputStream inputStream) {
        try {
            return C11837s.f28928a.mo72187b(inputStream);
        } finally {
            inputStream.close();
        }
    }
}
