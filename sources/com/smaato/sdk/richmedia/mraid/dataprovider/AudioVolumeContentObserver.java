package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import java.util.concurrent.atomic.AtomicBoolean;

public class AudioVolumeContentObserver extends ContentObserver {
    private final ChangeSender<Integer> changeSender;
    private final Context context;
    private final AtomicBoolean isRegistered = new AtomicBoolean();
    private final MusicPlaybackVolume musicPlaybackVolume;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.smaato.sdk.core.util.notifier.ChangeSender<java.lang.Integer>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioVolumeContentObserver(android.content.Context r2, com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume r3, com.smaato.sdk.core.util.notifier.ChangeSender<java.lang.Integer> r4) {
        /*
            r1 = this;
            android.os.Handler r0 = com.smaato.sdk.core.util.Threads.newUiHandler()
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.isRegistered = r0
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.context = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume r2 = (com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume) r2
            r1.musicPlaybackVolume = r2
            java.lang.Object r2 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.notifier.ChangeSender r2 = (com.smaato.sdk.core.util.notifier.ChangeSender) r2
            r1.changeSender = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeContentObserver.<init>(android.content.Context, com.smaato.sdk.richmedia.mraid.dataprovider.MusicPlaybackVolume, com.smaato.sdk.core.util.notifier.ChangeSender):void");
    }

    /* access modifiers changed from: package-private */
    public void register() {
        if (this.isRegistered.compareAndSet(false, true)) {
            this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    public void unregister() {
        if (this.isRegistered.compareAndSet(true, false)) {
            this.context.getContentResolver().unregisterContentObserver(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isRegistered() {
        return this.isRegistered.get();
    }

    public void onChange(boolean z, Uri uri) {
        if (uri != null && uri.equals(this.musicPlaybackVolume.getUri())) {
            this.changeSender.newValue(Integer.valueOf(this.musicPlaybackVolume.getCurrentVolume()));
        }
    }

    public ChangeSender<Integer> getChangeSender() {
        return this.changeSender;
    }
}
