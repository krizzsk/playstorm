package com.smaato.sdk.core.util.notifier;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

class StandardChangeSender<T> implements ChangeSender<T> {
    private final Set<ChangeNotifier.Listener<T>> listeners = Collections.newSetFromMap(new WeakHashMap());
    final Object lock = new Object();
    private volatile T value;

    StandardChangeSender(T t) {
        this.value = t;
    }

    public void newValue(T t) {
        Objects.requireNonNull(t);
        synchronized (this.lock) {
            this.value = t;
            notifyListeners();
        }
    }

    public void addListener(ChangeNotifier.Listener<T> listener) {
        Objects.requireNonNull(listener, "Parameter listener cannot be null for StandardChangeSender::addListener");
        synchronized (this.lock) {
            if (!this.listeners.contains(listener)) {
                this.listeners.add(listener);
                listener.onNextValue(this.value);
            }
        }
    }

    public void removeListener(ChangeNotifier.Listener<T> listener) {
        synchronized (this.lock) {
            this.listeners.remove(listener);
        }
    }

    public T getValue() {
        T t;
        synchronized (this.lock) {
            t = this.value;
        }
        return t;
    }

    private void notifyListeners() {
        Iterator it = new HashSet(this.listeners).iterator();
        while (it.hasNext()) {
            ((ChangeNotifier.Listener) it.next()).onNextValue(this.value);
        }
    }
}
