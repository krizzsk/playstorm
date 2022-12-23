package com.smaato.sdk.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.smaato.sdk.nativead.NativeAdAssets;

final class AutoValue_NativeAdAssets_Image extends NativeAdAssets.Image {
    private final Drawable drawable;
    private final int height;
    private final Uri uri;
    private final int width;

    AutoValue_NativeAdAssets_Image(Drawable drawable2, Uri uri2, int i, int i2) {
        this.drawable = drawable2;
        if (uri2 != null) {
            this.uri = uri2;
            this.width = i;
            this.height = i2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public Drawable drawable() {
        return this.drawable;
    }

    public Uri uri() {
        return this.uri;
    }

    public int width() {
        return this.width;
    }

    public int height() {
        return this.height;
    }

    public String toString() {
        return "Image{drawable=" + this.drawable + ", uri=" + this.uri + ", width=" + this.width + ", height=" + this.height + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdAssets.Image)) {
            return false;
        }
        NativeAdAssets.Image image = (NativeAdAssets.Image) obj;
        Drawable drawable2 = this.drawable;
        if (drawable2 != null ? drawable2.equals(image.drawable()) : image.drawable() == null) {
            if (this.uri.equals(image.uri()) && this.width == image.width() && this.height == image.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable2 = this.drawable;
        return (((((((drawable2 == null ? 0 : drawable2.hashCode()) ^ 1000003) * 1000003) ^ this.uri.hashCode()) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }
}
