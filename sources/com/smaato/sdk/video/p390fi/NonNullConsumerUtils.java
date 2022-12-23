package com.smaato.sdk.video.p390fi;

import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.video.fi.NonNullConsumerUtils */
public final class NonNullConsumerUtils {
    private NonNullConsumerUtils() {
    }

    public static <T> NonNullConsumer<T> andThen(NonNullConsumer<? super T> nonNullConsumer, NonNullConsumer<? super T> nonNullConsumer2) {
        Objects.requireNonNull(nonNullConsumer2);
        return new NonNullConsumer(nonNullConsumer2) {
            public final /* synthetic */ NonNullConsumer f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                NonNullConsumerUtils.lambda$andThen$0(NonNullConsumer.this, this.f$1, obj);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(NonNullConsumer nonNullConsumer, NonNullConsumer nonNullConsumer2, Object obj) {
        nonNullConsumer.accept(obj);
        nonNullConsumer2.accept(obj);
    }
}
