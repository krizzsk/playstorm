package com.smaato.sdk.core.log;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;
import com.smaato.sdk.core.util.p382fi.Consumer;

public final class DiLogLayer {
    private static final Logger EMPTY = new EmptyLogger();

    private DiLogLayer() {
    }

    public static DiRegistry createRegistry(boolean z, LogLevel logLevel) {
        return DiRegistry.m32956of(new Consumer(z, logLevel) {
            public final /* synthetic */ boolean f$0;
            public final /* synthetic */ LogLevel f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((DiRegistry) obj).registerSingletonFactory(Logger.class, new ClassFactory(this.f$0, this.f$1) {
                    public final /* synthetic */ boolean f$0;
                    public final /* synthetic */ LogLevel f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    public final Object get(DiConstructor diConstructor) {
                        return DiLogLayer.lambda$createRegistry$0(this.f$0, this.f$1, diConstructor);
                    }
                });
            }
        });
    }

    static /* synthetic */ Logger lambda$createRegistry$0(boolean z, LogLevel logLevel, DiConstructor diConstructor) {
        if (!z) {
            return EMPTY;
        }
        LoggerFactory.initializeLogger(logLevel);
        return LoggerFactory.getLogger();
    }

    public static Logger getLoggerFrom(DiConstructor diConstructor) {
        return (Logger) diConstructor.get(Logger.class);
    }
}
