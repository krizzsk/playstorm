package com.p374my.target.common.models;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;
import com.p374my.target.C9672e0;
import com.p374my.target.C9983u1;

/* renamed from: com.my.target.common.models.ImageData */
public final class ImageData extends C9983u1<Bitmap> {
    private static final int DEFAULT_CACHE_SIZE = 31457280;
    private static final int MIN_CACHE_SIZE = 5242880;
    private static volatile LruCache<ImageData, Bitmap> memcache = new BitmapCache(DEFAULT_CACHE_SIZE);
    private volatile boolean useCache;

    /* renamed from: com.my.target.common.models.ImageData$BitmapCache */
    public static class BitmapCache extends LruCache<ImageData, Bitmap> {
        public BitmapCache(int i) {
            super(i);
        }

        public int sizeOf(ImageData imageData, Bitmap bitmap) {
            return Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
        }
    }

    private ImageData(String str) {
        super(str);
    }

    private ImageData(String str, int i, int i2) {
        super(str);
        this.width = i;
        this.height = i2;
    }

    public static void clearCache() {
        memcache.evictAll();
    }

    public static ImageData newImageData(String str) {
        return new ImageData(str);
    }

    public static ImageData newImageData(String str, int i, int i2) {
        return new ImageData(str, i, i2);
    }

    public static void setCacheSize(int i) {
        if (i < MIN_CACHE_SIZE) {
            C9672e0.m27882a("setting cache size ignored: size should be >=5242880");
        } else if (Build.VERSION.SDK_INT >= 21) {
            memcache.resize(i);
        } else {
            memcache = new BitmapCache(i);
        }
    }

    public Bitmap getBitmap() {
        return getData();
    }

    public Bitmap getData() {
        return (Bitmap) (this.useCache ? memcache.get(this) : super.getData());
    }

    public boolean isUseCache() {
        return this.useCache;
    }

    public void setBitmap(Bitmap bitmap) {
        setData(bitmap);
    }

    public void setData(Bitmap bitmap) {
        if (!this.useCache) {
            super.setData(bitmap);
        } else if (bitmap == null) {
            memcache.remove(this);
        } else {
            memcache.put(this, bitmap);
        }
    }

    public String toString() {
        return "ImageData{url='" + this.url + '\'' + ", width=" + this.width + ", height=" + this.height + ", bitmap=" + getData() + '}';
    }

    public void useCache(boolean z) {
        if (z != this.useCache) {
            this.useCache = z;
            if (z) {
                Bitmap bitmap = (Bitmap) super.getData();
                if (bitmap != null) {
                    super.setData(null);
                    memcache.put(this, bitmap);
                    return;
                }
                return;
            }
            super.setData(memcache.remove(this));
        }
    }
}
