package com.smaato.sdk.core.p379di;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.smaato.sdk.core.di.DiRegistry */
public final class DiRegistry {
    private Map<DiKey, ClassFactory> holder = new HashMap();

    private DiRegistry() {
    }

    /* renamed from: of */
    public static DiRegistry m32956of(Consumer<DiRegistry> consumer) {
        DiRegistry diRegistry = new DiRegistry();
        consumer.accept(diRegistry);
        return diRegistry;
    }

    public <T> void registerFactory(Class<T> cls, ClassFactory<T> classFactory) {
        registerFactory((String) null, cls, classFactory);
    }

    public <T> void registerFactory(String str, Class<T> cls, ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, classFactory);
    }

    public <T> void registerSingletonFactory(Class<T> cls, ClassFactory<T> classFactory) {
        registerSingletonFactory((String) null, cls, classFactory);
    }

    public <T> void registerSingletonFactory(String str, Class<T> cls, ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        Objects.requireNonNull(cls);
        DiKey diKey = new DiKey(str, cls);
        ensureUniqueKey(diKey);
        this.holder.put(diKey, SingletonFactory.wrap(classFactory));
    }

    private void ensureUniqueKey(DiKey diKey) {
        if (this.holder.containsKey(diKey)) {
            throw new IllegalStateException("There is already registered factory for " + diKey);
        }
    }

    /* access modifiers changed from: package-private */
    public Map<DiKey, ClassFactory> holder() {
        return this.holder;
    }

    public DiRegistry addFrom(DiRegistry diRegistry) {
        if (diRegistry != null) {
            for (Map.Entry next : diRegistry.holder.entrySet()) {
                DiKey diKey = (DiKey) next.getKey();
                ensureUniqueKey(diKey);
                this.holder.put(diKey, (ClassFactory) next.getValue());
            }
        }
        return this;
    }
}
