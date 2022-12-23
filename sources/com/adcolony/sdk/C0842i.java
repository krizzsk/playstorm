package com.adcolony.sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.adcolony.sdk.i */
class C0842i extends ContentObserver {

    /* renamed from: a */
    private AudioManager f481a;

    /* renamed from: b */
    private AdColonyInterstitial f482b;

    C0842i(Handler handler, AdColonyInterstitial adColonyInterstitial) {
        super(handler);
        Context a = C0714a.m129a();
        if (a != null) {
            this.f481a = (AudioManager) a.getSystemService("audio");
            this.f482b = adColonyInterstitial;
            a.getApplicationContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10777a() {
        Context a = C0714a.m129a();
        if (a != null) {
            a.getApplicationContext().getContentResolver().unregisterContentObserver(this);
        }
        this.f482b = null;
        this.f481a = null;
    }

    public boolean deliverSelfNotifications() {
        return false;
    }

    public void onChange(boolean z) {
        AdColonyInterstitial adColonyInterstitial;
        if (this.f481a != null && (adColonyInterstitial = this.f482b) != null && adColonyInterstitial.mo10381d() != null) {
            double streamVolume = (double) ((((float) this.f481a.getStreamVolume(3)) / 15.0f) * 100.0f);
            C0823f1 b = C0764c0.m322b();
            C0764c0.m316a(b, "audio_percentage", streamVolume);
            C0764c0.m319a(b, "ad_session_id", this.f482b.mo10381d().mo10563a());
            C0764c0.m326b(b, "id", this.f482b.mo10381d().mo10572c());
            new C0841h0("AdContainer.on_audio_change", this.f482b.mo10381d().mo10591k(), b).mo10776c();
        }
    }
}
