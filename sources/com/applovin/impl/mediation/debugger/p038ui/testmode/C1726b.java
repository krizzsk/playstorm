package com.applovin.impl.mediation.debugger.p038ui.testmode;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p048c.C1859d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.b */
public class C1726b implements AppLovinCommunicatorSubscriber {

    /* renamed from: a */
    private final C1959m f2628a;

    /* renamed from: b */
    private boolean f2629b;

    /* renamed from: c */
    private boolean f2630c;

    /* renamed from: d */
    private String f2631d;

    public C1726b(C1959m mVar) {
        this.f2628a = mVar;
        this.f2631d = (String) mVar.mo14342b(C1859d.f3338B, null);
        mVar.mo14346b(C1859d.f3338B);
        if (StringUtils.isValidString(this.f2631d)) {
            this.f2630c = true;
        }
        this.f2629b = ((Boolean) mVar.mo14342b(C1859d.f3339C, false)).booleanValue();
        mVar.mo14346b(C1859d.f3339C);
        AppLovinCommunicator.getInstance(mVar.mo14297L()).subscribe((AppLovinCommunicatorSubscriber) this, "test_mode_settings");
    }

    /* renamed from: a */
    public void mo13580a(String str) {
        this.f2631d = str;
    }

    /* renamed from: a */
    public void mo13581a(JSONObject jSONObject) {
        if (!this.f2629b) {
            this.f2629b = JsonUtils.containsCaseInsensitiveString(this.f2628a.mo14306V().mo14609k().f3912b, JsonUtils.getJSONArray(jSONObject, "test_mode_idfas", new JSONArray())) || this.f2628a.mo14306V().mo14605g() || AppLovinSdkUtils.isEmulator();
        }
    }

    /* renamed from: a */
    public void mo13582a(boolean z) {
        this.f2630c = z;
    }

    /* renamed from: a */
    public boolean mo13583a() {
        return this.f2629b;
    }

    /* renamed from: b */
    public void mo13584b(String str) {
        this.f2628a.mo14318a(C1859d.f3338B, str);
    }

    /* renamed from: b */
    public boolean mo13585b() {
        return this.f2630c;
    }

    /* renamed from: c */
    public String mo13586c() {
        return this.f2631d;
    }

    /* renamed from: d */
    public void mo13587d() {
        this.f2628a.mo14318a(C1859d.f3339C, true);
    }

    public String getCommunicatorId() {
        return C1726b.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("test_mode_settings".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            String string = BundleUtils.getString("force_ad_network", messageData);
            if (StringUtils.isValidString(string)) {
                this.f2630c = true;
                this.f2631d = string;
            }
            String string2 = BundleUtils.getString("test_mode_network_next_session", messageData);
            if (StringUtils.isValidString(string2)) {
                mo13587d();
                mo13584b(string2);
            }
        }
    }
}
