package com.smaato.sdk.richmedia.mraid.mvp;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.mvp.BaseView;
import java.lang.ref.WeakReference;

public abstract class BasePresenter<T extends BaseView> implements Presenter<T> {
    private WeakReference<T> weakView = new WeakReference<>((Object) null);

    public void attachView(T t) {
        Threads.ensureMainThread();
        this.weakView = new WeakReference<>(t);
    }

    public void detachView() {
        Threads.ensureMainThread();
        this.weakView.clear();
    }

    /* access modifiers changed from: protected */
    public final void ifViewAttached(Consumer<T> consumer) {
        Objects.requireNonNull(consumer);
        Threads.ensureMainThread();
        BaseView baseView = (BaseView) this.weakView.get();
        if (baseView != null) {
            consumer.accept(baseView);
        }
    }
}
