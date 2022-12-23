package com.smaato.sdk.core.lifecycle;

import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.ArrayList;
import java.util.List;

public abstract class Lifecycle {
    protected final List<Observer> observerList = new ArrayList();

    public interface Observer {
        void onCreate(Lifecycle lifecycle) {
        }

        void onDestroy(Lifecycle lifecycle) {
        }

        void onPause(Lifecycle lifecycle) {
        }

        void onResume(Lifecycle lifecycle) {
        }

        void onStart(Lifecycle lifecycle) {
        }

        void onStop(Lifecycle lifecycle) {
        }
    }

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    /* access modifiers changed from: protected */
    public void notifyObservers(Consumer<Observer> consumer) {
        for (Observer accept : this.observerList) {
            consumer.accept(accept);
        }
    }
}
