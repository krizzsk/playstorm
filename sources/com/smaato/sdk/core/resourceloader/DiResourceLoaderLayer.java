package com.smaato.sdk.core.resourceloader;

import android.app.Application;
import android.content.Context;
import com.smaato.sdk.core.log.DiLogLayer;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.Objects;
import java.nio.charset.Charset;

public final class DiResourceLoaderLayer {
    private DiResourceLoaderLayer() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiResourceLoaderLayer$n4h__KcKthAW7s2G4gR6r2hRJ74.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(Md5Digester.class, $$Lambda$DiResourceLoaderLayer$qRNz9duSWusJiVEByH04WBO9Qgo.INSTANCE);
        diRegistry.registerFactory("resource_loader_di_layer", Charset.class, $$Lambda$DiResourceLoaderLayer$SIpRIbJ7Ytf5nEuHXYnNcwrjwm4.INSTANCE);
        diRegistry.registerFactory(HexEncoder.class, $$Lambda$DiResourceLoaderLayer$xMARBr_aeWeZlKpJ1PgSuTFZQBE.INSTANCE);
        diRegistry.registerFactory(BaseStoragePersistingStrategyFileUtils.class, $$Lambda$DiResourceLoaderLayer$bnOz1gSziT6mvexD6XaN1ej5OrQ.INSTANCE);
    }

    static /* synthetic */ Md5Digester lambda$createRegistry$0(DiConstructor diConstructor) {
        return new Md5Digester(Charset.forName("UTF-8"), (HexEncoder) diConstructor.get(HexEncoder.class));
    }

    static /* synthetic */ HexEncoder lambda$createRegistry$2(DiConstructor diConstructor) {
        return new HexEncoder();
    }

    static /* synthetic */ BaseStoragePersistingStrategyFileUtils lambda$createRegistry$3(DiConstructor diConstructor) {
        return new BaseStoragePersistingStrategyFileUtils(DiLogLayer.getLoggerFrom(diConstructor), (Context) diConstructor.get(Application.class));
    }

    public static BaseStoragePersistingStrategyFileUtils getBaseStoragePersistingStrategyFileUtils(DiConstructor diConstructor) {
        return (BaseStoragePersistingStrategyFileUtils) diConstructor.get(BaseStoragePersistingStrategyFileUtils.class);
    }

    public static Md5Digester getMd5Digester(DiConstructor diConstructor) {
        Objects.requireNonNull(diConstructor);
        return (Md5Digester) diConstructor.get(Md5Digester.class);
    }
}
