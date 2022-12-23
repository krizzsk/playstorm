package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;

public class TapjoyGpsHelper {

    /* renamed from: a */
    private Context f27631a;

    /* renamed from: b */
    private String f27632b;

    /* renamed from: c */
    private boolean f27633c;

    /* renamed from: d */
    private int f27634d = 0;

    /* renamed from: e */
    private int f27635e = 0;

    /* renamed from: f */
    private boolean f27636f;

    /* renamed from: g */
    private Boolean f27637g;

    /* renamed from: h */
    private Boolean f27638h;

    /* renamed from: i */
    private Boolean f27639i;

    public TapjoyGpsHelper(Context context) {
        this.f27631a = context;
    }

    public void loadAdvertisingId(boolean z) {
        TapjoyLog.m33197i("TapjoyGpsHelper", "Looking for Google Play Services...");
        if (!isGooglePlayServicesAvailable() || !isGooglePlayManifestConfigured()) {
            TapjoyLog.m33197i("TapjoyGpsHelper", "Google Play Services not found");
            return;
        }
        TapjoyLog.m33197i("TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
        TapjoyLog.m33197i("TapjoyGpsHelper", "Packaged Google Play Services version: " + this.f27635e);
        TapjoyAdIdClient tapjoyAdIdClient = new TapjoyAdIdClient(this.f27631a);
        if (isAdvertisingIdAllowed()) {
            this.f27636f = tapjoyAdIdClient.setupAdIdInfo();
        } else {
            this.f27636f = false;
        }
        try {
            this.f27634d = this.f27631a.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            TapjoyLog.m33197i("TapjoyGpsHelper", "Device's Google Play Services version: " + this.f27634d);
        } catch (Exception unused) {
            TapjoyLog.m33197i("TapjoyGpsHelper", "Error getting device's Google Play Services version");
        }
        if (this.f27636f) {
            this.f27633c = tapjoyAdIdClient.isAdTrackingEnabled();
            this.f27632b = tapjoyAdIdClient.getAdvertisingId();
            TapjoyLog.m33197i("TapjoyGpsHelper", "Found advertising ID: " + this.f27632b);
            TapjoyLog.m33197i("TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.f27633c));
            return;
        }
        TapjoyLog.m33197i("TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
        if (z) {
            this.f27633c = false;
            if (isAdvertisingIdAllowed()) {
                this.f27632b = "00000000-0000-0000-0000-000000000000";
                this.f27636f = true;
                return;
            }
            resetAdvertisingID();
            this.f27636f = false;
        }
    }

    public void checkGooglePlayIntegration() {
        if (!isGooglePlayServicesAvailable()) {
            throw new TapjoyIntegrationException("Tapjoy SDK is disabled because Google Play Services was not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        } else if (!isGooglePlayManifestConfigured()) {
            throw new TapjoyIntegrationException("Failed to load manifest.xml meta-data, 'com.google.android.gms.version' not found. For more information about including the Google Play services client library visit http://developer.android.com/google/play-services/setup.html or http://tech.tapjoy.com/product-overview/sdk-change-log/tapjoy-and-identifiers");
        }
    }

    public boolean isGooglePlayServicesAvailable() {
        if (this.f27637g == null) {
            try {
                this.f27631a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.f27637g = Boolean.TRUE;
            } catch (Exception unused) {
                this.f27637g = Boolean.FALSE;
            } catch (Error unused2) {
                this.f27637g = Boolean.FALSE;
            }
        }
        return this.f27637g.booleanValue();
    }

    public boolean isGooglePlayManifestConfigured() {
        if (this.f27638h == null) {
            try {
                this.f27635e = this.f27631a.getPackageManager().getApplicationInfo(this.f27631a.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
                this.f27638h = Boolean.TRUE;
            } catch (Exception unused) {
                this.f27638h = Boolean.FALSE;
            }
        }
        return this.f27638h.booleanValue();
    }

    public String getAdvertisingId() {
        return this.f27632b;
    }

    public boolean isAdTrackingEnabled() {
        return this.f27633c;
    }

    public boolean isAdIdAvailable() {
        return this.f27636f;
    }

    public int getDeviceGooglePlayServicesVersion() {
        return this.f27634d;
    }

    public int getPackagedGooglePlayServicesVersion() {
        return this.f27635e;
    }

    public void resetAdvertisingID() {
        this.f27632b = "";
    }

    public boolean isAdvertisingIdAllowed() {
        SharedPreferences sharedPreferences = this.f27631a.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        if (!sharedPreferences.contains(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID)) {
            return true;
        }
        Boolean valueOf = Boolean.valueOf(sharedPreferences.getBoolean(TapjoyConstants.PREF_OPTOUT_ADVERTISING_ID, false));
        this.f27639i = valueOf;
        if (!valueOf.booleanValue()) {
            return true;
        }
        return false;
    }
}
