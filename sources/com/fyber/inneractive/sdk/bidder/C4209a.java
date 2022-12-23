package com.fyber.inneractive.sdk.bidder;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.shared.APSAnalytics;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.config.C4270d;
import com.fyber.inneractive.sdk.config.C4271d0;
import com.fyber.inneractive.sdk.config.C4273e;
import com.fyber.inneractive.sdk.config.C4315k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.serverapi.C5298a;
import com.fyber.inneractive.sdk.serverapi.C5300b;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.C5357n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.bidder.a */
public class C4209a implements C4231d, C4271d0.C4272a {

    /* renamed from: h */
    public static final C4209a f10389h = new C4209a();

    /* renamed from: a */
    public final TokenParametersOuterClass$TokenParameters.C4196b f10390a;

    /* renamed from: b */
    public final C5300b f10391b;

    /* renamed from: c */
    public final C4229c f10392c;

    /* renamed from: d */
    public C4232e f10393d;

    /* renamed from: e */
    public final Map<String, String> f10394e = new C4210a(this);

    /* renamed from: f */
    public final AtomicReference<String> f10395f = new AtomicReference<>((Object) null);

    /* renamed from: g */
    public final AtomicBoolean f10396g = new AtomicBoolean(false);

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$a */
    public class C4210a extends HashMap<String, String> {
        public C4210a(C4209a aVar) {
            put("max", "token_size_limit_max");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.bidder.a$b */
    public class C4211b implements Runnable {
        public C4211b() {
        }

        public void run() {
            C4209a.this.mo24089a();
        }
    }

    public C4209a() {
        C5300b bVar = new C5300b(C4309s.m13531b());
        this.f10391b = bVar;
        C4229c cVar = new C4229c(bVar);
        this.f10392c = cVar;
        this.f10390a = TokenParametersOuterClass$TokenParameters.newBuilder();
        IAConfigManager.m13430c().mo24286a((C4271d0.C4272a) this);
        mo24092c();
        if (IAConfigManager.m13429b().mo24350a().mo24347a("bidding_token_wait_for_ua", true)) {
            IAConfigManager.m13431d().mo26473d();
            cVar.mo24235a(IAConfigManager.m13431d().mo26469a());
        }
    }

    /* renamed from: a */
    public final void mo24089a() {
        String str;
        String str2;
        Boolean bool;
        TokenParametersOuterClass$TokenParameters.C4206l lVar;
        TokenParametersOuterClass$TokenParameters.C4208n nVar;
        if (this.f10396g.compareAndSet(false, true)) {
            TokenParametersOuterClass$TokenParameters.C4196b bVar = this.f10390a;
            bVar.f13688b = (GeneratedMessageLite) bVar.f13688b.dynamicMethod(GeneratedMessageLite.C5112e.NEW_MUTABLE_INSTANCE);
            TokenParametersOuterClass$TokenParameters.C4196b bVar2 = this.f10390a;
            this.f10392c.getClass();
            TokenParametersOuterClass$TokenParameters.NullableString c = C4233f.m13395c("1.2");
            bVar2.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar2.f13688b).setVersion(c);
            if (this.f10395f.get() != null) {
                this.f10392c.mo24234a();
            }
            TokenParametersOuterClass$TokenParameters.C4196b bVar3 = this.f10390a;
            TokenParametersOuterClass$TokenParameters.NullableString c2 = C4233f.m13395c(this.f10392c.f10451b);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setUserAgent(c2);
            TokenParametersOuterClass$TokenParameters.NullableString c3 = C4233f.m13395c(this.f10392c.f10452c);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setSdkVersion(c3);
            TokenParametersOuterClass$TokenParameters.NullableString c4 = C4233f.m13395c(this.f10392c.f10453d);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setBundleID(c4);
            TokenParametersOuterClass$TokenParameters.NullableString c5 = C4233f.m13395c(this.f10392c.f10454e);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceModel(c5);
            TokenParametersOuterClass$TokenParameters.NullableString c6 = C4233f.m13395c(this.f10392c.f10455f);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setAppVersion(c6);
            TokenParametersOuterClass$TokenParameters.NullableString c7 = C4233f.m13395c(APSAnalytics.OS_NAME);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceOS(c7);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a = C4233f.m13392a(Build.VERSION.SDK_INT);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceApi(a);
            TokenParametersOuterClass$TokenParameters.NullableString c8 = C4233f.m13395c(Build.VERSION.RELEASE);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setOsVersion(c8);
            TokenParametersOuterClass$TokenParameters.NullableString c9 = C4233f.m13395c(this.f10392c.f10456g);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceLanguage(c9);
            TokenParametersOuterClass$TokenParameters.NullableString c10 = C4233f.m13395c(this.f10392c.f10457h);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setCountryCode(c10);
            TokenParametersOuterClass$TokenParameters.NullableString c11 = C4233f.m13395c(this.f10392c.f10458i);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setCarrierName(c11);
            TokenParametersOuterClass$TokenParameters.NullableString c12 = C4233f.m13395c(this.f10392c.f10459j);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setMobileCountryCode(c12);
            TokenParametersOuterClass$TokenParameters.NullableString c13 = C4233f.m13395c(this.f10392c.f10460k);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setMobileNetworkCode(c13);
            boolean c14 = C4315k.m13548c();
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDnt(c14);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a2 = C4233f.m13392a(this.f10392c.f10461l);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setTotalSpace(a2);
            Long l = this.f10392c.f10462m;
            TokenParametersOuterClass$TokenParameters.NullableSInt32.C4189a newBuilder = TokenParametersOuterClass$TokenParameters.NullableSInt32.newBuilder();
            if (l != null) {
                int intValue = l.intValue();
                newBuilder.mo25812c();
                ((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.f13688b).setData(intValue);
            }
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setOffsetFromGMT((TokenParametersOuterClass$TokenParameters.NullableSInt32) newBuilder.mo25809a());
            TokenParametersOuterClass$TokenParameters.NullableString c15 = C4233f.m13395c(IAConfigManager.m13432e());
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setUserID(c15);
            IAConfigManager iAConfigManager = IAConfigManager.f10525J;
            C4270d dVar = iAConfigManager.f10530D;
            dVar.getClass();
            JSONArray jSONArray = null;
            if (C5350l.f14216a == null) {
                str = null;
            } else {
                str = dVar.f10595b;
            }
            TokenParametersOuterClass$TokenParameters.NullableString c16 = C4233f.m13395c(str);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setGdprString(c16);
            TokenParametersOuterClass$TokenParameters.NullableBool a3 = C4233f.m13390a(iAConfigManager.f10530D.mo24279a());
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setGdprConsent(a3);
            C4270d dVar2 = iAConfigManager.f10530D;
            dVar2.getClass();
            if (C5350l.f14216a == null) {
                str2 = null;
            } else {
                str2 = dVar2.f10598e;
            }
            TokenParametersOuterClass$TokenParameters.NullableString c17 = C4233f.m13395c(str2);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setCcpaString(c17);
            C4270d dVar3 = iAConfigManager.f10530D;
            dVar3.getClass();
            if (C5350l.f14216a == null) {
                bool = null;
            } else {
                bool = dVar3.f10599f;
            }
            TokenParametersOuterClass$TokenParameters.NullableBool a4 = C4233f.m13390a(bool);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setLgpdConsent(a4);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a5 = C4233f.m13392a(this.f10392c.f10463n);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceWidth(a5);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a6 = C4233f.m13392a(this.f10392c.f10464o);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setDeviceHeight(a6);
            TokenParametersOuterClass$TokenParameters.C4198d dVar4 = this.f10392c.f10465p;
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setFrameworkName(dVar4);
            TokenParametersOuterClass$TokenParameters.NullableString c18 = C4233f.m13395c(this.f10392c.f10466q);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setInputLanguages(c18);
            TokenParametersOuterClass$TokenParameters.NullableString c19 = C4233f.m13395c(this.f10392c.f10449L);
            bVar3.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar3.f13688b).setMediationType(c19);
            TokenParametersOuterClass$TokenParameters.C4196b bVar4 = this.f10390a;
            TokenParametersOuterClass$TokenParameters.NullableString c20 = C4233f.m13395c(this.f10392c.f10467r);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setNetwork(c20);
            TokenParametersOuterClass$TokenParameters.C4202h hVar = this.f10392c.f10468s;
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setSecureContent(hVar);
            TokenParametersOuterClass$TokenParameters.NullableBool a7 = C4233f.m13390a(this.f10392c.f10442E);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setBatteryCharging(a7);
            TokenParametersOuterClass$TokenParameters.NullableBool a8 = C4233f.m13390a(this.f10392c.f10469t);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setHeadsetPlugged(a8);
            TokenParametersOuterClass$TokenParameters.NullableBool a9 = C4233f.m13390a(this.f10392c.f10470u);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setBluetoothPlugged(a9);
            TokenParametersOuterClass$TokenParameters.NullableBool a10 = C4233f.m13390a(this.f10392c.f10471v);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setLowPowerMode(a10);
            boolean z = this.f10392c.f10472w;
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setDarkMode(z);
            TokenParametersOuterClass$TokenParameters.NullableBool a11 = C4233f.m13390a(this.f10392c.f10473x);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setAirplaneMode(a11);
            TokenParametersOuterClass$TokenParameters.NullableBool a12 = C4233f.m13390a(this.f10392c.f10474y);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setDndMode(a12);
            TokenParametersOuterClass$TokenParameters.NullableBool a13 = C4233f.m13390a(this.f10392c.f10475z);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setIsRingMuted(a13);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a14 = C4233f.m13392a(this.f10392c.f10438A);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setSessionDuration(a14);
            TokenParametersOuterClass$TokenParameters.NullableFloat a15 = C4233f.m13391a(this.f10391b.mo26402d());
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setLatitude(a15);
            TokenParametersOuterClass$TokenParameters.NullableFloat a16 = C4233f.m13391a(this.f10391b.mo26403e());
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setLongitude(a16);
            TokenParametersOuterClass$TokenParameters.NullableFloat a17 = C4233f.m13391a(this.f10391b.mo26401c());
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setHorAccuracy(a17);
            TokenParametersOuterClass$TokenParameters.NullableFloat a18 = C4233f.m13391a(this.f10391b.mo26405g());
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setVerAccuracy(a18);
            TokenParametersOuterClass$TokenParameters.NullableFloat a19 = C4233f.m13391a(this.f10392c.f10439B);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setTimeAccuracy(a19);
            String str3 = this.f10392c.f10443F;
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4191a newBuilder2 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (!TextUtils.isEmpty(str3)) {
                newBuilder2.mo24064a(Integer.parseInt(str3));
            }
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setBatteryLevel((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder2.mo25809a());
            Long l2 = this.f10392c.f10440C;
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4191a newBuilder3 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (l2 != null) {
                newBuilder3.mo24064a(l2.intValue());
            }
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setFreeSpace((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder3.mo25809a());
            TokenParametersOuterClass$TokenParameters.NullableBool a20 = C4233f.m13390a(Boolean.valueOf(TextUtils.equals(iAConfigManager.f10559x.mo24283a(UnitDisplayType.INTERSTITIAL, "LAST_VAST_SKIPED"), "1")));
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setPriorSkip(a20);
            TokenParametersOuterClass$TokenParameters.NullableString c21 = C4233f.m13395c(this.f10392c.f10444G);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setKeywords(c21);
            TokenParametersOuterClass$TokenParameters.NullableUInt32 a21 = C4233f.m13392a(this.f10392c.f10445H);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setUserAge(a21);
            InneractiveUserConfig.Gender gender = this.f10392c.f10446I;
            if (gender == InneractiveUserConfig.Gender.FEMALE) {
                lVar = TokenParametersOuterClass$TokenParameters.C4206l.FEMALE;
            } else if (gender == InneractiveUserConfig.Gender.MALE) {
                lVar = TokenParametersOuterClass$TokenParameters.C4206l.MALE;
            } else {
                lVar = TokenParametersOuterClass$TokenParameters.C4206l.UNKNOWN;
            }
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setUserGender(lVar);
            TokenParametersOuterClass$TokenParameters.NullableString c22 = C4233f.m13395c(this.f10392c.f10448K);
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setZipCode(c22);
            boolean z2 = this.f10392c.f10447J;
            bVar4.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar4.f13688b).setMuteAudio(z2);
            if (C4315k.m13547b()) {
                TokenParametersOuterClass$TokenParameters.C4196b bVar5 = this.f10390a;
                TokenParametersOuterClass$TokenParameters.NullableString c23 = C4233f.m13395c(this.f10392c.f10441D);
                bVar5.mo25812c();
                ((TokenParametersOuterClass$TokenParameters) bVar5.f13688b).setAmazonId(c23);
            } else {
                TokenParametersOuterClass$TokenParameters.C4196b bVar6 = this.f10390a;
                TokenParametersOuterClass$TokenParameters.NullableString c24 = C4233f.m13395c(this.f10392c.f10441D);
                bVar6.mo25812c();
                ((TokenParametersOuterClass$TokenParameters) bVar6.f13688b).setAaid(c24);
            }
            for (UnitDisplayType unitDisplayType : UnitDisplayType.values()) {
                if (!unitDisplayType.isDeprecated()) {
                    TokenParametersOuterClass$TokenParameters.C4205k a22 = C4233f.m13393a(unitDisplayType);
                    HashMap<String, Integer> hashMap = C5298a.f14102a;
                    IAConfigManager iAConfigManager2 = IAConfigManager.f10525J;
                    String a23 = iAConfigManager2.f10559x.mo24283a(unitDisplayType, "LAST_DOMAIN_SHOWED");
                    if (!TextUtils.isEmpty(a23) && a23.contains(",")) {
                        a23 = a23.split(",")[0];
                    }
                    if (!TextUtils.isEmpty(a23)) {
                        TokenParametersOuterClass$TokenParameters.C4196b bVar7 = this.f10390a;
                        TokenParametersOuterClass$TokenParameters.LastAdomain.C4185a newBuilder4 = TokenParametersOuterClass$TokenParameters.LastAdomain.newBuilder();
                        newBuilder4.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.f13688b).setAdomain(a23);
                        newBuilder4.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.f13688b).setType(a22);
                        bVar7.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters) bVar7.f13688b).addLastAdomains((TokenParametersOuterClass$TokenParameters.LastAdomain) newBuilder4.mo25809a());
                    }
                    String a24 = iAConfigManager2.f10559x.mo24283a(unitDisplayType, "LAST_APP_BUNDLE_ID");
                    if (!TextUtils.isEmpty(a24)) {
                        TokenParametersOuterClass$TokenParameters.C4196b bVar8 = this.f10390a;
                        TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.C4186a newBuilder5 = TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle.newBuilder();
                        newBuilder5.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.f13688b).setLastBundle(a24);
                        newBuilder5.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.f13688b).setType(a22);
                        bVar8.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters) bVar8.f13688b).addLastAdvertisedBundles((TokenParametersOuterClass$TokenParameters.LastAdvertisedBundle) newBuilder5.mo25809a());
                    }
                    if (TextUtils.equals(iAConfigManager2.f10559x.mo24283a(unitDisplayType, "LAST_CLICKED"), "1")) {
                        TokenParametersOuterClass$TokenParameters.C4196b bVar9 = this.f10390a;
                        TokenParametersOuterClass$TokenParameters.C4205k a25 = C4233f.m13393a(unitDisplayType);
                        bVar9.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters) bVar9.f13688b).addPriorClicks(a25);
                    }
                    mo24090a("display", unitDisplayType, a22);
                    if (unitDisplayType.isFullscreenUnit()) {
                        mo24090a("video", unitDisplayType, a22);
                        String a26 = iAConfigManager2.f10559x.mo24283a(unitDisplayType, "LAST_VAST_CLICKED_TYPE");
                        if (!TextUtils.isEmpty(a26)) {
                            TokenParametersOuterClass$TokenParameters.C4196b bVar10 = this.f10390a;
                            TokenParametersOuterClass$TokenParameters.PriorVideoClickType.C4192a newBuilder6 = TokenParametersOuterClass$TokenParameters.PriorVideoClickType.newBuilder();
                            a26.getClass();
                            char c25 = 65535;
                            switch (a26.hashCode()) {
                                case 49:
                                    if (a26.equals("1")) {
                                        c25 = 0;
                                        break;
                                    }
                                    break;
                                case 50:
                                    if (a26.equals("2")) {
                                        c25 = 1;
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (a26.equals("3")) {
                                        c25 = 2;
                                        break;
                                    }
                                    break;
                            }
                            if (c25 == 0) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4208n.CTABUTTON;
                            } else if (c25 == 1) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4208n.COMPANION;
                            } else if (c25 != 2) {
                                nVar = TokenParametersOuterClass$TokenParameters.C4208n.NOCLICK;
                            } else {
                                nVar = TokenParametersOuterClass$TokenParameters.C4208n.VIDEOVIEW;
                            }
                            newBuilder6.mo25812c();
                            ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.f13688b).setClickType(nVar);
                            newBuilder6.mo25812c();
                            ((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.f13688b).setType(a22);
                            bVar10.mo25812c();
                            ((TokenParametersOuterClass$TokenParameters) bVar10.f13688b).addPriorClickTypes((TokenParametersOuterClass$TokenParameters.PriorVideoClickType) newBuilder6.mo25809a());
                        }
                    }
                }
            }
            C5300b bVar11 = this.f10391b;
            bVar11.getClass();
            C4309s sVar = new C4309s();
            bVar11.f14107a = sVar;
            sVar.mo24341a("");
            C4309s sVar2 = this.f10391b.f14107a;
            if (sVar2 != null) {
                jSONArray = sVar2.mo24343d();
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        TokenParametersOuterClass$TokenParameters.Experiment.C4184a newBuilder7 = TokenParametersOuterClass$TokenParameters.Experiment.newBuilder();
                        String optString = optJSONObject.optString("id");
                        newBuilder7.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.f13688b).setIdentifier(optString);
                        String optString2 = optJSONObject.optString("v");
                        newBuilder7.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.f13688b).setVariant(optString2);
                        TokenParametersOuterClass$TokenParameters.C4196b bVar12 = this.f10390a;
                        bVar12.mo25812c();
                        ((TokenParametersOuterClass$TokenParameters) bVar12.f13688b).addAbExperiments((TokenParametersOuterClass$TokenParameters.Experiment) newBuilder7.mo25809a());
                    }
                }
            }
            TokenParametersOuterClass$TokenParameters.C4196b bVar13 = this.f10390a;
            int i2 = C4273e.f10606a;
            String property = System.getProperty("ia.testEnvironmentConfiguration.number");
            TokenParametersOuterClass$TokenParameters.NullableUInt32.C4191a newBuilder8 = TokenParametersOuterClass$TokenParameters.NullableUInt32.newBuilder();
            if (!TextUtils.isEmpty(property)) {
                newBuilder8.mo24064a(Integer.parseInt(property));
            }
            bVar13.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar13.f13688b).setPortal((TokenParametersOuterClass$TokenParameters.NullableUInt32) newBuilder8.mo25809a());
            TokenParametersOuterClass$TokenParameters.C4196b bVar14 = this.f10390a;
            TokenParametersOuterClass$TokenParameters.NullableString c26 = C4233f.m13395c(System.getProperty("ia.testEnvironmentConfiguration.response"));
            bVar14.mo25812c();
            ((TokenParametersOuterClass$TokenParameters) bVar14.f13688b).setMockResponseId(c26);
            this.f10395f.set(Base64.encodeToString(((TokenParametersOuterClass$TokenParameters) this.f10390a.mo25809a()).toByteArray(), 2));
            this.f10396g.set(false);
        }
    }

    /* renamed from: b */
    public void mo24091b() {
        C5357n.m16773a(new C4211b());
    }

    /* renamed from: c */
    public final void mo24092c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) C5350l.f14216a.getSystemService("connectivity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            connectivityManager.registerDefaultNetworkCallback(new C4228b(this));
        }
        C4232e eVar = new C4232e(this);
        this.f10393d = eVar;
        C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (i >= 23) {
            C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.app.action.INTERRUPTION_FILTER_CHANGED"));
        }
        if (i >= 21) {
            C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
        }
        if (i >= 17) {
            C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.intent.action.AIRPLANE_MODE"));
        }
        if (C5350l.m16763b("android.permission.BLUETOOTH")) {
            C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED"));
            C5350l.f14216a.registerReceiver(eVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        }
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24090a(java.lang.String r9, com.fyber.inneractive.sdk.config.enums.UnitDisplayType r10, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4205k r11) {
        /*
            r8 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10525J
            com.fyber.inneractive.sdk.config.d0 r0 = r0.f10559x
            com.fyber.inneractive.sdk.cache.session.d r0 = r0.f10601a
            if (r0 == 0) goto L_0x00e7
            java.lang.String r10 = r10.value()
            java.util.HashMap<com.fyber.inneractive.sdk.cache.session.enums.b, com.fyber.inneractive.sdk.cache.session.h> r1 = r0.f10499b
            com.fyber.inneractive.sdk.cache.session.enums.b r10 = com.fyber.inneractive.sdk.cache.session.enums.C4251b.m13425a(r10, r9)
            java.lang.Object r10 = r1.get(r10)
            com.fyber.inneractive.sdk.cache.session.h r10 = (com.fyber.inneractive.sdk.cache.session.C4256h) r10
            r1 = 0
            if (r10 == 0) goto L_0x002e
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r10)
            com.fyber.inneractive.sdk.cache.session.g r4 = new com.fyber.inneractive.sdk.cache.session.g
            r4.<init>(r10)
            java.util.Collections.sort(r3, r4)
            r2.<init>(r3)
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r10 = r0.mo24250a()
            if (r10 <= 0) goto L_0x00cf
            if (r2 == 0) goto L_0x00cf
            int r0 = r2.size()
            if (r0 < r10) goto L_0x00cf
            java.lang.String r0 = "video"
            boolean r1 = r9.equals(r0)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "display"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0050
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4204j.UNITCONTENTTYPEUNKNOWN
            goto L_0x0055
        L_0x0050:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4204j.DISPLAY
            goto L_0x0055
        L_0x0053:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$j r1 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4204j.f10363d
        L_0x0055:
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession$a r3 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession.newBuilder()
            r3.mo25812c()
            MessageType r4 = r3.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r4
            r4.setSubType(r1)
            r1 = 0
            java.util.Iterator r2 = r2.iterator()
        L_0x0068:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00be
            java.lang.Object r4 = r2.next()
            com.fyber.inneractive.sdk.cache.session.e r4 = (com.fyber.inneractive.sdk.cache.session.C4249e) r4
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData$a r5 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData.newBuilder()
            int r6 = r4.f10504b
            r5.mo25812c()
            MessageType r7 = r5.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setClicks(r6)
            int r6 = r4.f10503a
            r5.mo25812c()
            MessageType r7 = r5.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r7 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r7
            r7.setImpressions(r6)
            boolean r6 = r9.equals(r0)
            if (r6 != 0) goto L_0x009e
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k r6 = com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.C4205k.REWARDED
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L_0x00aa
        L_0x009e:
            int r4 = r4.f10505c
            r5.mo25812c()
            MessageType r6 = r5.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r6 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r6
            r6.setCompletions(r4)
        L_0x00aa:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r4 = r5.mo25809a()
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$SessionData r4 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.SessionData) r4
            r3.mo25812c()
            MessageType r5 = r3.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r5 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r5
            r5.addSessionDataItems(r4)
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0068
        L_0x00be:
            r3.mo25812c()
            MessageType r9 = r3.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r9
            r9.setType(r11)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r9 = r3.mo25809a()
            r1 = r9
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$UserSession r1 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters.UserSession) r1
        L_0x00cf:
            if (r1 == 0) goto L_0x00e7
            java.util.List r9 = r1.getSessionDataItemsList()
            int r9 = r9.size()
            if (r9 <= 0) goto L_0x00e7
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$b r9 = r8.f10390a
            r9.mo25812c()
            MessageType r9 = r9.f13688b
            com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters r9 = (com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters) r9
            r9.addUserSessions(r1)
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.bidder.C4209a.mo24090a(java.lang.String, com.fyber.inneractive.sdk.config.enums.UnitDisplayType, com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters$k):void");
    }
}
