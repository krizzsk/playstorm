package com.smaato.sdk.image.resourceloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.smaato.sdk.core.resourceloader.ResourceTransformer;
import java.io.IOException;
import java.io.InputStream;

public class ImageResourceTransformer implements ResourceTransformer<InputStream, Bitmap> {
    public Bitmap transform(InputStream inputStream) {
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        try {
            inputStream.close();
        } catch (IOException unused) {
        }
        return decodeStream;
    }
}
