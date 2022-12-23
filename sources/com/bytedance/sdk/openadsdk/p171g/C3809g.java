package com.bytedance.sdk.openadsdk.p171g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.bytedance.sdk.component.utils.C2975l;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.g.g */
/* compiled from: VolumeChangeObserver */
public class C3809g {

    /* renamed from: a */
    private int f9876a = -1;

    /* renamed from: b */
    private C3808f f9877b;

    /* renamed from: c */
    private C3810a f9878c;

    /* renamed from: d */
    private Context f9879d;

    /* renamed from: e */
    private AudioManager f9880e;

    /* renamed from: f */
    private boolean f9881f = false;

    /* renamed from: g */
    private boolean f9882g = false;

    /* renamed from: h */
    private int f9883h = -1;

    public C3809g(Context context) {
        this.f9879d = context;
        this.f9880e = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    /* renamed from: a */
    public int mo20617a() {
        return this.f9883h;
    }

    /* renamed from: a */
    public void mo20618a(int i) {
        this.f9883h = i;
    }

    /* renamed from: b */
    public int mo20622b() {
        return this.f9876a;
    }

    /* renamed from: b */
    public void mo20623b(int i) {
        this.f9876a = i;
    }

    /* renamed from: c */
    public boolean mo20624c() {
        if (!this.f9882g) {
            return false;
        }
        this.f9882g = false;
        return true;
    }

    /* renamed from: d */
    public int mo20625d() {
        try {
            if (this.f9880e != null) {
                return this.f9880e.getStreamMaxVolume(3);
            }
            return 15;
        } catch (Throwable th) {
            C2975l.m8379a("VolumeChangeObserver", "getMaxMusicVolumeError: ", th);
            return 15;
        }
    }

    /* renamed from: a */
    public void mo20620a(boolean z) {
        mo20621a(z, false);
    }

    /* renamed from: a */
    public void mo20621a(boolean z, boolean z2) {
        if (this.f9880e != null) {
            int i = 0;
            if (z) {
                int g = mo20628g();
                if (g != 0) {
                    this.f9876a = g;
                }
                C2975l.m8384b("VolumeChangeObserver", "mute set volume to 0");
                this.f9880e.setStreamVolume(3, 0, 0);
                this.f9882g = true;
                return;
            }
            int i2 = this.f9876a;
            if (i2 == 0) {
                i2 = mo20625d() / 15;
            } else {
                if (i2 == -1) {
                    if (z2) {
                        i2 = mo20625d() / 15;
                    } else {
                        return;
                    }
                }
                C2975l.m8384b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f9876a);
                this.f9876a = -1;
                this.f9880e.setStreamVolume(3, i2, i);
                this.f9882g = true;
            }
            i = 1;
            C2975l.m8384b("VolumeChangeObserver", "not mute set volume to " + i2 + " mLastVolume=" + this.f9876a);
            this.f9876a = -1;
            this.f9880e.setStreamVolume(3, i2, i);
            this.f9882g = true;
        }
    }

    /* renamed from: a */
    public void mo20619a(C3808f fVar) {
        this.f9877b = fVar;
    }

    /* renamed from: e */
    public void mo20626e() {
        try {
            this.f9878c = new C3810a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f9879d.registerReceiver(this.f9878c, intentFilter);
            this.f9881f = true;
        } catch (Throwable th) {
            C2975l.m8379a("VolumeChangeObserver", "registerReceiverError: ", th);
        }
    }

    /* renamed from: f */
    public void mo20627f() {
        if (this.f9881f) {
            try {
                this.f9879d.unregisterReceiver(this.f9878c);
                this.f9877b = null;
                this.f9881f = false;
            } catch (Throwable th) {
                C2975l.m8379a("VolumeChangeObserver", "unregisterReceiverError: ", th);
            }
        }
    }

    /* renamed from: g */
    public int mo20628g() {
        try {
            if (this.f9880e != null) {
                return this.f9880e.getStreamVolume(3);
            }
            return -1;
        } catch (Throwable th) {
            C2975l.m8379a("VolumeChangeObserver", "getCurrentMusicVolumeError: ", th);
            return -1;
        }
    }

    /* renamed from: h */
    public C3808f mo20629h() {
        return this.f9877b;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.g.g$a */
    /* compiled from: VolumeChangeObserver */
    private static class C3810a extends BroadcastReceiver {

        /* renamed from: a */
        private WeakReference<C3809g> f9884a;

        public C3810a(C3809g gVar) {
            this.f9884a = new WeakReference<>(gVar);
        }

        public void onReceive(Context context, Intent intent) {
            C3808f h;
            int g;
            try {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                    C2975l.m8384b("VolumeChangeObserver", "Media volume change notification.......");
                    C3809g gVar = (C3809g) this.f9884a.get();
                    if (gVar != null && (h = gVar.mo20629h()) != null && (g = gVar.mo20628g()) != gVar.mo20617a()) {
                        gVar.mo20618a(g);
                        if (g >= 0) {
                            h.mo18428b(g);
                        }
                    }
                }
            } catch (Throwable th) {
                C2975l.m8379a("VolumeChangeObserver", "onVolumeChangedError: ", th);
            }
        }
    }
}
