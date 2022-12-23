package com.smaato.sdk.core.p379di;

import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.di.SingletonFactory */
final class SingletonFactory<T> implements ClassFactory<T> {
    private static final Object UNINITIALIZED = new Object();
    private volatile ClassFactory<T> factory;
    private volatile Object instance = UNINITIALIZED;

    private SingletonFactory(ClassFactory<T> classFactory) {
        this.factory = (ClassFactory) Objects.requireNonNull(classFactory);
    }

    public T get(DiConstructor diConstructor) {
        T t = this.instance;
        T t2 = UNINITIALIZED;
        if (t == t2) {
            synchronized (this) {
                t = this.instance;
                if (t == t2) {
                    T t3 = this.factory.get(diConstructor);
                    T t4 = this.instance;
                    if (t4 != t2) {
                        if (t4 != t3) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + t4 + " & " + t3 + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.instance = t3;
                    this.factory = null;
                    t = t3;
                }
            }
        }
        return t;
    }

    public static <T> ClassFactory<T> wrap(ClassFactory<T> classFactory) {
        Objects.requireNonNull(classFactory);
        if (classFactory instanceof SingletonFactory) {
            return classFactory;
        }
        return new SingletonFactory(classFactory);
    }
}
