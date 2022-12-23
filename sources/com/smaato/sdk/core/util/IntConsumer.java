package com.smaato.sdk.core.util;

public interface IntConsumer {
    void accept(int i);

    IntConsumer andThen(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new IntConsumer(intConsumer) {
            public final /* synthetic */ IntConsumer f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(int i) {
                IntConsumer.lambda$andThen$0(IntConsumer.this, this.f$1, i);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(IntConsumer _this, IntConsumer intConsumer, int i) {
        _this.accept(i);
        intConsumer.accept(i);
    }
}
