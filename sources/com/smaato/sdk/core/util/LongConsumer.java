package com.smaato.sdk.core.util;

public interface LongConsumer {
    void accept(long j);

    LongConsumer andThen(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new LongConsumer(longConsumer) {
            public final /* synthetic */ LongConsumer f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(long j) {
                LongConsumer.lambda$andThen$0(LongConsumer.this, this.f$1, j);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(LongConsumer _this, LongConsumer longConsumer, long j) {
        _this.accept(j);
        longConsumer.accept(j);
    }
}
