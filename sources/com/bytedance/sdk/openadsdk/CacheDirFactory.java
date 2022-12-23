package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p083a.C2517a;
import com.bykv.p068vk.openvk.component.video.p069a.p070a.p071a.C2399a;
import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import java.io.File;

public class CacheDirFactory {
    public static volatile C2517a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    public static volatile C2517a TTVIDEO_CACHE_DIR = null;

    /* renamed from: a */
    private static String f6836a = null;

    /* renamed from: b */
    private static int f6837b = 1;

    /* renamed from: a */
    private static C2517a m8540a() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    MEDIA_CACHE_DIR = new C2399a();
                    MEDIA_CACHE_DIR.mo16069a(getRootDir());
                    MEDIA_CACHE_DIR.mo16073c();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File a = C2964f.m8353a(C3578m.m11231a(), C3953b.m12901c(), "tt_ad");
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        String absolutePath = a.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static C2517a getICacheDir(int i) {
        return m8540a();
    }

    public static String getBrandCacheDir() {
        return getRootDir() + File.separator + "video_brand";
    }

    public static int getCacheType() {
        return f6837b;
    }

    public static String getImageCacheDir() {
        if (f6836a == null) {
            f6836a = getDiskCacheDirPath("image");
        }
        return f6836a;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
