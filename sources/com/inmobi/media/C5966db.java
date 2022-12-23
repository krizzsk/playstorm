package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/* renamed from: com.inmobi.media.db */
/* compiled from: MraidMediaProcessor */
public final class C5966db {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f15162f = C5966db.class.getSimpleName();

    /* renamed from: a */
    public C6337q f15163a;

    /* renamed from: b */
    public C5958cy f15164b;

    /* renamed from: c */
    public C5971b f15165c;

    /* renamed from: d */
    public C5972c f15166d;

    /* renamed from: e */
    public C5970a f15167e;

    /* renamed from: com.inmobi.media.db$b */
    /* compiled from: MraidMediaProcessor */
    public final class C5971b extends BroadcastReceiver {

        /* renamed from: b */
        private String f15174b;

        public C5971b(String str) {
            this.f15174b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.EXTRA_RINGER_MODE", 2);
                String unused = C5966db.f15162f;
                C5966db.m17826a(C5966db.this, this.f15174b, 2 != intExtra);
            }
        }
    }

    /* renamed from: com.inmobi.media.db$a */
    /* compiled from: MraidMediaProcessor */
    public final class C5970a extends BroadcastReceiver {

        /* renamed from: b */
        private String f15172b;

        public C5970a(String str) {
            this.f15172b = str;
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                boolean z = false;
                int intExtra = intent.getIntExtra("state", 0);
                String unused = C5966db.f15162f;
                C5966db dbVar = C5966db.this;
                String str = this.f15172b;
                if (1 == intExtra) {
                    z = true;
                }
                C5966db.m17828b(dbVar, str, z);
            }
        }
    }

    /* renamed from: com.inmobi.media.db$c */
    /* compiled from: MraidMediaProcessor */
    public final class C5972c extends ContentObserver {

        /* renamed from: b */
        private Context f15176b;

        /* renamed from: c */
        private int f15177c = -1;

        /* renamed from: d */
        private String f15178d;

        public C5972c(String str, Context context, Handler handler) {
            super(handler);
            this.f15178d = str;
            this.f15176b = context;
        }

        public final void onChange(boolean z) {
            AudioManager audioManager;
            super.onChange(z);
            Context context = this.f15176b;
            if (context != null && (audioManager = (AudioManager) context.getSystemService("audio")) != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume != this.f15177c) {
                        this.f15177c = streamVolume;
                        C5966db.m17825a(C5966db.this, this.f15178d, streamVolume);
                    }
                } catch (Exception unused) {
                    String unused2 = C5966db.f15162f;
                }
            }
        }
    }

    public C5966db(C6337q qVar) {
        this.f15163a = qVar;
    }

    /* renamed from: a */
    public static boolean m17827a() {
        AudioManager audioManager;
        Context c = C6227ho.m18551c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || 2 == audioManager.getRingerMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo35069b() {
        C5971b bVar;
        Context c = C6227ho.m18551c();
        if (c != null && (bVar = this.f15165c) != null) {
            c.unregisterReceiver(bVar);
            this.f15165c = null;
        }
    }

    /* renamed from: c */
    public final void mo35070c() {
        Context c = C6227ho.m18551c();
        if (c != null && this.f15166d != null) {
            c.getContentResolver().unregisterContentObserver(this.f15166d);
            this.f15166d = null;
        }
    }

    /* renamed from: d */
    public static boolean m17829d() {
        AudioManager audioManager;
        Context c = C6227ho.m18551c();
        if (c == null || (audioManager = (AudioManager) c.getSystemService("audio")) == null || !audioManager.isWiredHeadsetOn()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo35071e() {
        C5970a aVar;
        Context c = C6227ho.m18551c();
        if (c != null && (aVar = this.f15167e) != null) {
            c.unregisterReceiver(aVar);
            this.f15167e = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17826a(C5966db dbVar, String str, boolean z) {
        C6337q qVar = dbVar.f15163a;
        if (qVar != null) {
            qVar.mo35611a(str, "fireDeviceMuteChangeEvent(" + z + ");");
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m17828b(C5966db dbVar, String str, boolean z) {
        C6337q qVar = dbVar.f15163a;
        if (qVar != null) {
            qVar.mo35611a(str, "fireHeadphonePluggedEvent(" + z + ");");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17825a(C5966db dbVar, String str, int i) {
        C6337q qVar = dbVar.f15163a;
        if (qVar != null) {
            qVar.mo35611a(str, "fireDeviceVolumeChangeEvent(" + i + ");");
        }
    }
}
