package com.ogury.core.internal.aaid;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.provider.Settings;
import com.ogury.core.internal.C10219ai;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.ogury.core.internal.aaid.c */
/* compiled from: AdvertisingIdClient.kt */
public final class C10208c {

    /* renamed from: a */
    public static final C10208c f25988a = new C10208c();

    private C10208c() {
    }

    /* renamed from: b */
    private static C10206a m31016b(Context context) {
        C10207b bVar = new C10207b();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C10209d dVar = new C10209d(bVar.mo66769a(), "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            return new C10206a(dVar.mo66773a(), dVar.mo66774a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: c */
    private static C10206a m31017c(Context context) {
        C10207b bVar = new C10207b();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        ServiceConnection serviceConnection = bVar;
        if (!context.bindService(intent, serviceConnection, 1)) {
            return null;
        }
        try {
            C10209d dVar = new C10209d(bVar.mo66769a(), "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
            return new C10206a(dVar.mo66773a(), dVar.mo66774a(true));
        } catch (Exception unused) {
            return null;
        } finally {
            context.unbindService(serviceConnection);
        }
    }

    /* renamed from: d */
    private static C10206a m31018d(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            String string = Settings.Secure.getString(contentResolver, TapjoyConstants.TJC_ADVERTISING_ID);
            boolean z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 0;
            if (string != null) {
                return new C10206a(string, z);
            }
            throw new IllegalStateException("Amazon Fire TV Ad Id is null".toString());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C10206a mo66772a(Context context) throws Exception {
        C10219ai.m31036b(context, "context");
        if (!C10219ai.m31035a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            C10206a b = m31016b(context);
            if (b != null) {
                return b;
            }
            C10206a c = m31017c(context);
            if (c != null) {
                return c;
            }
            C10206a d = m31018d(context);
            if (d != null) {
                return d;
            }
            return null;
        }
        throw new IllegalStateException("Cannot be called from the main thread".toString());
    }
}
