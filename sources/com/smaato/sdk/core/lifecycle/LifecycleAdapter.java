package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.p382fi.Consumer;

public class LifecycleAdapter extends Lifecycle {
    private final Object owner;

    public LifecycleAdapter(Object obj) {
        this.owner = obj;
    }

    public /* synthetic */ void lambda$onCreate$0$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public void onCreate() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onCreate$0$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onStart$1$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public void onStart() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onStart$1$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onResume$2$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public void onResume() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onResume$2$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onPause$3$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public void onPause() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onPause$3$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onStop$4$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public void onStop() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onStop$4$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onDestroy$5$LifecycleAdapter(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }

    public void onDestroy() {
        notifyObservers(new Consumer() {
            public final void accept(Object obj) {
                LifecycleAdapter.this.lambda$onDestroy$5$LifecycleAdapter((Lifecycle.Observer) obj);
            }
        });
    }
}
