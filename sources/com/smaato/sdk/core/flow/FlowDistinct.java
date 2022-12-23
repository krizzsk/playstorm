package com.smaato.sdk.core.flow;

import java.util.HashSet;
import java.util.Set;

class FlowDistinct<T, K> extends Flow<T> {
    private final Function1<? super T, K> keySelector;
    private final Publisher<T> source;

    FlowDistinct(Publisher<T> publisher, Function1<? super T, K> function1) {
        this.source = publisher;
        this.keySelector = function1;
    }

    /* access modifiers changed from: package-private */
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe(new FlowDistinctSubscriber(subscriber, this.keySelector));
    }

    private static class FlowDistinctSubscriber<T, K> implements Subscriber<T> {
        private final Set<K> distinct = new HashSet();
        private final Subscriber<? super T> downstream;
        private final Function1<? super T, K> keySelector;

        FlowDistinctSubscriber(Subscriber<? super T> subscriber, Function1<? super T, K> function1) {
            this.downstream = subscriber;
            this.keySelector = function1;
        }

        public void onSubscribe(Subscription subscription) {
            this.downstream.onSubscribe(subscription);
        }

        public void onNext(T t) {
            try {
                if (this.distinct.add(this.keySelector.apply(t))) {
                    this.downstream.onNext(t);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
            }
        }

        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        public void onComplete() {
            this.downstream.onComplete();
        }
    }
}
