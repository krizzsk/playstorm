package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f5013a;

    /* renamed from: b */
    private boolean f5014b;

    /* renamed from: c */
    private boolean f5015c;

    /* renamed from: d */
    private boolean f5016d;

    /* renamed from: e */
    private boolean f5017e;

    /* renamed from: f */
    private boolean f5018f = true;

    /* renamed from: g */
    private String f5019g;

    /* renamed from: h */
    private List<String> f5020h = Collections.emptyList();

    /* renamed from: i */
    private List<String> f5021i = Collections.emptyList();

    /* renamed from: j */
    private final Map<String, String> f5022j = new HashMap();

    /* renamed from: k */
    private final Object f5023k = new Object();

    /* renamed from: l */
    private C1959m f5024l;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    public AppLovinSdkSettings(Context context) {
        this.f5013a = Utils.isVerboseLoggingEnabled(context);
        this.f5015c = true;
        this.f5016d = true;
        this.f5017e = true;
    }

    /* access modifiers changed from: protected */
    public void attachAppLovinSdk(C1959m mVar) {
        this.f5024l = mVar;
        if (StringUtils.isValidString(this.f5019g)) {
            mVar.mo14295J().mo13582a(true);
            mVar.mo14295J().mo13580a(this.f5019g);
            this.f5019g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        HashMap hashMap;
        synchronized (this.f5023k) {
            hashMap = new HashMap(this.f5022j);
        }
        return hashMap;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f5021i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f5020h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f5015c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f5016d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f5017e;
    }

    public boolean isMuted() {
        return this.f5014b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f5013a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.f5015c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        this.f5016d = z;
    }

    public void setExtraParameter(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            String trim = str2 != null ? str2.trim() : null;
            synchronized (this.f5023k) {
                this.f5022j.put(str, trim);
            }
            if (!"test_mode_network".equalsIgnoreCase(str)) {
                return;
            }
            if (this.f5024l == null) {
                this.f5019g = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f5024l.mo14295J().mo13582a(true);
                this.f5024l.mo14295J().mo13580a(trim);
            } else {
                this.f5024l.mo14295J().mo13582a(false);
                this.f5024l.mo14295J().mo13580a((String) null);
            }
        } else if (C2092v.m5047a()) {
            C2092v.m5053i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (StringUtils.isValidString(next) && next.length() > 0) {
                    if (next.length() == 16) {
                        arrayList.add(next);
                    } else if (C2092v.m5047a()) {
                        C2092v.m5053i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + next + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f5021i = arrayList;
            return;
        }
        this.f5021i = Collections.emptyList();
    }

    public void setLocationCollectionEnabled(boolean z) {
        this.f5017e = z;
    }

    public void setMuted(boolean z) {
        this.f5014b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        this.f5018f = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String next : list) {
                if (next != null && next.length() == 36) {
                    arrayList.add(next);
                } else if (C2092v.m5047a()) {
                    C2092v.m5053i("AppLovinSdkSettings", "Unable to set test device advertising id (" + next + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f5020h = arrayList;
            return;
        }
        this.f5020h = Collections.emptyList();
    }

    public void setVerboseLogging(boolean z) {
        if (Utils.isVerboseLoggingConfigured()) {
            if (C2092v.m5047a()) {
                C2092v.m5053i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
            }
            if (Utils.isVerboseLoggingEnabled((Context) null) != z) {
                C2092v.m5053i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
                return;
            }
            return;
        }
        this.f5013a = z;
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f5018f;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f5013a + ", muted=" + this.f5014b + ", testDeviceAdvertisingIds=" + this.f5020h.toString() + ", initializationAdUnitIds=" + this.f5021i.toString() + ", creativeDebuggerEnabled=" + this.f5015c + ", exceptionHandlerEnabled=" + this.f5016d + ", locationCollectionEnabled=" + this.f5017e + '}';
    }
}
