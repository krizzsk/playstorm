package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.config.d */
public class C4270d {

    /* renamed from: a */
    public Boolean f10594a = null;

    /* renamed from: b */
    public String f10595b = null;

    /* renamed from: c */
    public InneractiveAdManager.GdprConsentSource f10596c = null;

    /* renamed from: d */
    public String f10597d = null;

    /* renamed from: e */
    public String f10598e = null;

    /* renamed from: f */
    public Boolean f10599f = null;

    /* renamed from: g */
    public SharedPreferences f10600g;

    /* renamed from: a */
    public Boolean mo24279a() {
        if (C5350l.f14216a == null) {
            return null;
        }
        return this.f10594a;
    }

    /* renamed from: b */
    public void mo24282b() {
        Application application = C5350l.f14216a;
        if (this.f10600g == null && application != null) {
            SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
            this.f10600g = sharedPreferences;
            if (sharedPreferences != null) {
                if (sharedPreferences.contains("IAGDPRBool")) {
                    this.f10594a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                }
                if (sharedPreferences.contains("IAGdprConsentData")) {
                    this.f10595b = sharedPreferences.getString("IAGdprConsentData", (String) null);
                }
                if (sharedPreferences.contains("IACCPAConsentData")) {
                    this.f10598e = sharedPreferences.getString("IACCPAConsentData", (String) null);
                }
                if (sharedPreferences.contains("IAGdprSource")) {
                    try {
                        this.f10596c = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                    } catch (Exception unused) {
                        this.f10596c = InneractiveAdManager.GdprConsentSource.Internal;
                    }
                }
                if (sharedPreferences.contains("IALgpdConsentStatus")) {
                    this.f10599f = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                }
                if (sharedPreferences.contains("keyUserID")) {
                    this.f10597d = sharedPreferences.getString("keyUserID", (String) null);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo24281a(String str, boolean z) {
        if (C5350l.f14216a == null) {
            return false;
        }
        mo24282b();
        SharedPreferences sharedPreferences = this.f10600g;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    /* renamed from: a */
    public final boolean mo24280a(String str, String str2) {
        if (C5350l.f14216a == null) {
            return false;
        }
        mo24282b();
        if (this.f10600g == null) {
            return false;
        }
        IAlog.m16699a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f10600g.edit().putString(str, str2).apply();
        return true;
    }
}
