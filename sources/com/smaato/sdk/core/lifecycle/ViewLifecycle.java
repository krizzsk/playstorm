package com.smaato.sdk.core.lifecycle;

import android.view.View;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p382fi.Consumer;

public class ViewLifecycle extends Lifecycle implements View.OnAttachStateChangeListener {
    public ViewLifecycle(View view) {
        view.addOnAttachStateChangeListener(this);
    }

    public /* synthetic */ void lambda$onViewAttachedToWindow$0$ViewLifecycle(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public void onViewAttachedToWindow(View view) {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                ViewLifecycle.this.lambda$onViewAttachedToWindow$0$ViewLifecycle((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onViewDetachedFromWindow$1$ViewLifecycle(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    public void onViewDetachedFromWindow(View view) {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                ViewLifecycle.this.lambda$onViewDetachedFromWindow$1$ViewLifecycle((Lifecycle.Observer) obj);
            }
        });
    }
}
