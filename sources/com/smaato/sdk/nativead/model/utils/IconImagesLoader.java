package com.smaato.sdk.nativead.model.utils;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdResponse;
import java.io.IOException;
import java.util.ArrayList;

public class IconImagesLoader {
    private final Application application;
    private final Logger logger;
    private final SimpleHttpClient simpleHttpClient;

    public IconImagesLoader(SimpleHttpClient simpleHttpClient2, Logger logger2, Application application2) {
        this.application = application2;
        this.logger = logger2;
        this.simpleHttpClient = simpleHttpClient2;
    }

    public NativeAdResponse loadIconAndImages(NativeAdResponse nativeAdResponse) {
        NativeAdAssets assets = nativeAdResponse.assets();
        NativeAdAssets.Builder buildUpon = assets.buildUpon();
        if (assets.icon() != null) {
            try {
                buildUpon.icon(assets.icon().withDrawable(createDrawable(this.simpleHttpClient.readBitmap(assets.icon().uri().toString()))));
            } catch (IOException e) {
                Logger logger2 = this.logger;
                LogDomain logDomain = LogDomain.NETWORK;
                logger2.error(logDomain, "Error loading icon: " + assets.icon().uri(), e);
            }
        }
        if (!assets.images().isEmpty()) {
            ArrayList arrayList = new ArrayList(assets.images().size());
            for (NativeAdAssets.Image next : assets.images()) {
                try {
                    arrayList.add(next.withDrawable(createDrawable(this.simpleHttpClient.readBitmap(next.uri().toString()))));
                } catch (IOException e2) {
                    Logger logger3 = this.logger;
                    LogDomain logDomain2 = LogDomain.NETWORK;
                    logger3.error(logDomain2, "Error loading image: " + next.uri(), e2);
                }
            }
            buildUpon.images(arrayList);
        }
        return nativeAdResponse.buildUpon().assets(buildUpon.build()).build();
    }

    private Drawable createDrawable(Bitmap bitmap) {
        return new BitmapDrawable(this.application.getResources(), bitmap);
    }
}
