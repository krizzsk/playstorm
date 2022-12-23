package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class AudioVolumeObserver {
    private final AudioVolumeContentObserver audioVolumeContentObserver;
    private final ChangeNotifier.Listener<Integer> listener;
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    private final int maxVolume;

    public interface Listener {
        void onVolumeChange(int i, int i2);
    }

    public AudioVolumeObserver(AudioVolumeContentObserver audioVolumeContentObserver2, int i) {
        $$Lambda$AudioVolumeObserver$JJAoqNzhKUjbT2jX9pPrYP6VV6Y r0 = new ChangeNotifier.Listener() {
            public final void onNextValue(Object obj) {
                AudioVolumeObserver.this.notifyListeners(((Integer) obj).intValue());
            }
        };
        this.listener = r0;
        this.audioVolumeContentObserver = (AudioVolumeContentObserver) Objects.requireNonNull(audioVolumeContentObserver2);
        audioVolumeContentObserver2.getChangeSender().addListener(r0);
        this.maxVolume = i;
    }

    public synchronized void register(Listener listener2) {
        Objects.requireNonNull(listener2);
        this.listeners.add(listener2);
        if (!this.listeners.isEmpty() && !this.audioVolumeContentObserver.isRegistered()) {
            this.audioVolumeContentObserver.register();
        }
    }

    public synchronized void unregister(Listener listener2) {
        this.listeners.remove(listener2);
        if (this.listeners.isEmpty() && this.audioVolumeContentObserver.isRegistered()) {
            this.audioVolumeContentObserver.unregister();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void notifyListeners(int i) {
        Iterables.forEach(new HashSet(this.listeners), new Consumer(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                AudioVolumeObserver.this.lambda$notifyListeners$0$AudioVolumeObserver(this.f$1, (AudioVolumeObserver.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$notifyListeners$0$AudioVolumeObserver(int i, Listener listener2) {
        listener2.onVolumeChange(i, this.maxVolume);
    }
}
