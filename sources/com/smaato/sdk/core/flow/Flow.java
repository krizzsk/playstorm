package com.smaato.sdk.core.flow;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Flow<T> implements Publisher<T> {
    static /* synthetic */ Throwable lambda$error$0(Throwable th) throws Exception {
        return th;
    }

    /* access modifiers changed from: package-private */
    public abstract void subscribeActual(Subscriber<? super T> subscriber);

    public static <T> Flow<T> create(Action1<Emitter<? super T>> action1) {
        return new FlowCreate(action1);
    }

    public static <T> Flow<T> fromIterable(Iterable<T> iterable) {
        return new FlowFromIterable(iterable);
    }

    public static <T> Flow<T> fromArray(T[] tArr) {
        return new FlowFromArray(tArr);
    }

    public static <T> Flow<T> fromCallable(Callable<T> callable) {
        return new FlowFromCallable(callable);
    }

    public static <T> Flow<T> fromRunnable(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new FlowFromAction(new Action0(runnable) {
            public final /* synthetic */ Runnable f$0;

            {
                this.f$0 = r1;
            }

            public final void invoke() {
                this.f$0.run();
            }
        });
    }

    public static <T> Flow<T> fromAction(Action0 action0) {
        return new FlowFromAction(action0);
    }

    @SafeVarargs
    public static <T> Flow<T> just(T... tArr) {
        if (tArr.length == 0) {
            return empty();
        }
        return fromArray(tArr);
    }

    @SafeVarargs
    public static <T> Flow<T> concatArray(Publisher<? extends T>... publisherArr) {
        return new FlowConcatArray(publisherArr);
    }

    public static <T> Flow<T> empty() {
        return new FlowEmpty();
    }

    public static <T> Flow<T> maybe(Callable<? extends T> callable) {
        return new FlowMaybe(callable);
    }

    public static <T> Flow<T> error(Callable<? extends Throwable> callable) {
        return new FlowError(callable);
    }

    public static <T> Flow<T> error(Throwable th) {
        return error((Callable<? extends Throwable>) new Callable(th) {
            public final /* synthetic */ Throwable f$0;

            {
                this.f$0 = r1;
            }

            public final Object call() {
                return Flow.lambda$error$0(this.f$0);
            }
        });
    }

    public final Flow<T> concatWith(Publisher<? extends T> publisher) {
        return concatArray(this, publisher);
    }

    public final Flow<T> switchIfError(Function1<? super Throwable, ? extends Publisher<? extends T>> function1) {
        return new FlowSwitchIfError(this, function1);
    }

    public final Flow<T> switchIfEmpty(Callable<? extends Publisher<? extends T>> callable) {
        return new FlowSwitchIfEmpty(this, callable);
    }

    public final Flow<T> distinct() {
        return distinct(Functions.identity());
    }

    public final <K> Flow<T> distinct(Function1<? super T, K> function1) {
        return new FlowDistinct(this, function1);
    }

    public final Flow<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    public final <K> Flow<T> distinctUntilChanged(Function1<? super T, K> function1) {
        return new FlowDistinctUntilChanged(this, function1);
    }

    public Flow<T> startWith(T t) {
        return new FlowStartWith(this, t);
    }

    public final Flow<T> filter(Predicate1<? super T> predicate1) {
        return new FlowFilter(this, predicate1);
    }

    public final Flow<T> replay(long j) {
        return new FlowReplay(this, j);
    }

    public final Flow<T> singleOrEmpty() {
        return new FlowSingle(this);
    }

    public final Flow<T> subscribeOn(Executor executor) {
        return new FlowSubscribeOn(this, executor);
    }

    public final Flow<T> observeOn(Executor executor) {
        return new FlowObserveOn(this, executor);
    }

    public final Flow<T> doOnSubscribe(Action1<? super Subscription> action1) {
        return new FlowDoOnLifecycle(this, action1, Functions.emptyAction());
    }

    public final Flow<T> doOnNext(Action1<? super T> action1) {
        return new FlowDoOnEach(this, action1, Functions.emptyConsumer(), Functions.emptyAction());
    }

    public final Flow<T> doOnError(Action1<? super Throwable> action1) {
        return new FlowDoOnEach(this, Functions.emptyConsumer(), action1, Functions.emptyAction());
    }

    public final Flow<T> doOnComplete(Action0 action0) {
        return new FlowDoOnEach(this, Functions.emptyConsumer(), Functions.emptyConsumer(), action0);
    }

    public final Flow<T> doOnTerminate(Action0 action0) {
        return new FlowDoOnLifecycle(this, Functions.emptyConsumer(), action0);
    }

    public final <U> Flow<U> map(Function1<? super T, ? extends U> function1) {
        return new FlowMap(this, function1);
    }

    public final <U> Flow<U> flatMap(Function1<? super T, ? extends Publisher<? extends U>> function1) {
        return new FlowFlatMap(this, function1);
    }

    public final T blockingGet() throws Exception {
        Disposable subscribe;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            subscribe = subscribe(new Action1(new AtomicReference()) {
                public final /* synthetic */ AtomicReference f$0;

                {
                    this.f$0 = r1;
                }

                public final void invoke(Object obj) {
                    this.f$0.set(obj);
                }
            });
            countDownLatch.await();
            subscribe.dispose();
            throw new NoSuchElementException("Flow did not produce any values");
        } catch (InterruptedException e) {
            throw new Exception(e);
        } catch (Throwable th) {
            subscribe.dispose();
            throw th;
        }
    }

    public final void subscribe(Subscriber<? super T> subscriber) {
        try {
            subscribeActual(subscriber);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            subscriber.onError(th);
        }
    }

    public final Disposable subscribe(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        return subscribeWith(new LambdaSubscriber(action1, action12, action0));
    }

    public final Disposable subscribe(Action1<? super T> action1, Action1<? super Throwable> action12) {
        return subscribe(action1, action12, Functions.emptyAction());
    }

    public final Disposable subscribe(Action1<? super T> action1, Action0 action0) {
        return subscribe(action1, Functions.emptyConsumer(), action0);
    }

    public final Disposable subscribe(Action1<? super T> action1) {
        return subscribe(action1, Functions.emptyConsumer(), Functions.emptyAction());
    }

    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.emptyAction());
    }

    public final Disposable subscribeWith(Subscriber<? super T> subscriber) {
        DisposableSubscriber disposableSubscriber = new DisposableSubscriber(subscriber);
        subscribe(disposableSubscriber);
        return disposableSubscriber;
    }

    public final FlowTest<T> test() {
        FlowTest<T> flowTest = new FlowTest<>();
        subscribe(flowTest.subscriber);
        return flowTest;
    }
}
