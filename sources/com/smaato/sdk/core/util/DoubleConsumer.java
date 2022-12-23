package com.smaato.sdk.core.util;

public interface DoubleConsumer {
    void accept(double d);

    DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new DoubleConsumer(doubleConsumer) {
            public final /* synthetic */ DoubleConsumer f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(double d) {
                DoubleConsumer.lambda$andThen$0(DoubleConsumer.this, this.f$1, d);
            }
        };
    }

    static /* synthetic */ void lambda$andThen$0(DoubleConsumer _this, DoubleConsumer doubleConsumer, double d) {
        _this.accept(d);
        doubleConsumer.accept(d);
    }
}
