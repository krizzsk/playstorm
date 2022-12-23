package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d */
/* compiled from: MraidVolumeChangeReceiver */
public final class C8812d {

    /* renamed from: a */
    public static double f21418a = -1.0d;

    /* renamed from: b */
    private Context f21419b;

    /* renamed from: c */
    private AudioManager f21420c;

    /* renamed from: d */
    private boolean f21421d = false;

    /* renamed from: e */
    private C8814b f21422e;

    /* renamed from: f */
    private C8813a f21423f;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$b */
    /* compiled from: MraidVolumeChangeReceiver */
    public interface C8814b {
        /* renamed from: a */
        void mo57882a(double d);
    }

    public C8812d(Context context) {
        this.f21419b = context;
        this.f21420c = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public final double mo58262a() {
        AudioManager audioManager = this.f21420c;
        int i = -1;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f21420c;
        if (audioManager2 != null) {
            i = audioManager2.getStreamVolume(3);
        }
        double d = (((double) i) * 100.0d) / ((double) streamMaxVolume);
        f21418a = d;
        return d;
    }

    /* renamed from: b */
    public final C8814b mo58264b() {
        return this.f21422e;
    }

    /* renamed from: a */
    public final void mo58263a(C8814b bVar) {
        this.f21422e = bVar;
    }

    /* renamed from: c */
    public final void mo58265c() {
        if (this.f21419b != null) {
            this.f21423f = new C8813a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f21419b.registerReceiver(this.f21423f, intentFilter);
            this.f21421d = true;
        }
    }

    /* renamed from: d */
    public final void mo58266d() {
        Context context;
        if (this.f21421d && (context = this.f21419b) != null) {
            try {
                context.unregisterReceiver(this.f21423f);
                this.f21422e = null;
                this.f21421d = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.d$a */
    /* compiled from: MraidVolumeChangeReceiver */
    private static class C8813a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C8812d> f21424a;

        public C8813a(C8812d dVar) {
            this.f21424a = new WeakReference<>(dVar);
        }

        public final void onReceive(Context context, Intent intent) {
            C8812d dVar;
            C8814b b;
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (dVar = (C8812d) this.f21424a.get()) != null && (b = dVar.mo58264b()) != null) {
                double a = dVar.mo58262a();
                if (a >= 0.0d) {
                    b.mo57882a(a);
                }
            }
        }
    }
}
