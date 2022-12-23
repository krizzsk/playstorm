package com.smaato.sdk.richmedia.framework;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Whatever;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public final class OrientationChangeWatcher {
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    private final OrientationBroadcastReceiver orientationBroadcastReceiver;
    private final ChangeNotifier.Listener<Whatever> screenOrientationListener;

    public interface Listener {
        void onOrientationChange();
    }

    public /* synthetic */ void lambda$new$0$OrientationChangeWatcher(Whatever whatever) {
        notifyListeners();
    }

    OrientationChangeWatcher(OrientationBroadcastReceiver orientationBroadcastReceiver2) {
        $$Lambda$OrientationChangeWatcher$IXTwxe5uDLeIMoGan98mHe0MdZU r0 = new ChangeNotifier.Listener() {
            public final void onNextValue(Object obj) {
                OrientationChangeWatcher.this.lambda$new$0$OrientationChangeWatcher((Whatever) obj);
            }
        };
        this.screenOrientationListener = r0;
        this.orientationBroadcastReceiver = (OrientationBroadcastReceiver) Objects.requireNonNull(orientationBroadcastReceiver2);
        orientationBroadcastReceiver2.getOrientationChangeSender().addListener(r0);
    }

    public synchronized void addListener(Listener listener) {
        Objects.requireNonNull(listener);
        this.listeners.add(listener);
        if (!this.listeners.isEmpty() && !this.orientationBroadcastReceiver.isRegistered()) {
            this.orientationBroadcastReceiver.register();
        }
    }

    public synchronized void removeListener(Listener listener) {
        this.listeners.remove(listener);
        if (this.listeners.isEmpty() && this.orientationBroadcastReceiver.isRegistered()) {
            this.orientationBroadcastReceiver.unregister();
        }
    }

    private synchronized void notifyListeners() {
        Iterables.forEach(new HashSet(this.listeners), $$Lambda$cM8mMQ3iS_zaOq6W1YhFElCWJR4.INSTANCE);
    }
}
