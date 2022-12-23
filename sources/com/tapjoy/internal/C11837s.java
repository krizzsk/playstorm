package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tapjoy.internal.s */
public final class C11837s implements C11438ax<Bitmap> {

    /* renamed from: a */
    public static final C11837s f28928a = new C11837s();

    /* renamed from: a */
    public final /* synthetic */ void mo72188a(OutputStream outputStream, Object obj) {
        if (!((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new RuntimeException();
        }
    }

    private C11837s() {
    }

    /* renamed from: a */
    public final Bitmap mo72187b(final InputStream inputStream) {
        try {
            return (Bitmap) C11846x.m34417a(new C11436av<Bitmap>() {
                public final /* synthetic */ Object call() {
                    InputStream inputStream = inputStream;
                    if (inputStream instanceof C11437aw) {
                        return BitmapFactory.decodeStream(inputStream);
                    }
                    return BitmapFactory.decodeStream(new C11437aw(inputStream));
                }
            });
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
