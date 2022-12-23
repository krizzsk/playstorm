package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.unity3d.player.a */
final class C11907a {

    /* renamed from: a */
    private final Context f29148a;

    /* renamed from: b */
    private final AudioManager f29149b;

    /* renamed from: c */
    private C11908a f29150c;

    /* renamed from: com.unity3d.player.a$a */
    private class C11908a extends ContentObserver {

        /* renamed from: b */
        private final C11909b f29152b;

        /* renamed from: c */
        private final AudioManager f29153c;

        /* renamed from: d */
        private final int f29154d = 3;

        /* renamed from: e */
        private int f29155e;

        public C11908a(Handler handler, AudioManager audioManager, int i, C11909b bVar) {
            super(handler);
            this.f29153c = audioManager;
            this.f29152b = bVar;
            this.f29155e = audioManager.getStreamVolume(3);
        }

        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        public final void onChange(boolean z, Uri uri) {
            int streamVolume;
            AudioManager audioManager = this.f29153c;
            if (audioManager != null && this.f29152b != null && (streamVolume = audioManager.getStreamVolume(this.f29154d)) != this.f29155e) {
                this.f29155e = streamVolume;
                this.f29152b.onAudioVolumeChanged(streamVolume);
            }
        }
    }

    /* renamed from: com.unity3d.player.a$b */
    public interface C11909b {
        void onAudioVolumeChanged(int i);
    }

    public C11907a(Context context) {
        this.f29148a = context;
        this.f29149b = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: a */
    public final void mo73017a() {
        if (this.f29150c != null) {
            this.f29148a.getContentResolver().unregisterContentObserver(this.f29150c);
            this.f29150c = null;
        }
    }

    /* renamed from: a */
    public final void mo73018a(C11909b bVar) {
        this.f29150c = new C11908a(new Handler(), this.f29149b, 3, bVar);
        this.f29148a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.f29150c);
    }
}
