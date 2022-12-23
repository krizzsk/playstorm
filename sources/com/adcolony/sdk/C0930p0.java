package com.adcolony.sdk;

import android.util.Log;
import android.webkit.WebView;
import com.adcolony.sdk.C0817e0;
import com.iab.omid.library.adcolony.adsession.AdEvents;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.AdSessionConfiguration;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.CreativeType;
import com.iab.omid.library.adcolony.adsession.ErrorType;
import com.iab.omid.library.adcolony.adsession.ImpressionType;
import com.iab.omid.library.adcolony.adsession.Owner;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.media.InteractionType;
import com.iab.omid.library.adcolony.adsession.media.MediaEvents;
import com.iab.omid.library.adcolony.adsession.media.Position;
import com.iab.omid.library.adcolony.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.adcolony.sdk.p0 */
class C0930p0 {

    /* renamed from: a */
    private AdSession f666a;

    /* renamed from: b */
    private AdEvents f667b;

    /* renamed from: c */
    private MediaEvents f668c;

    /* renamed from: d */
    private List<VerificationScriptResource> f669d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f670e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f671f = "";

    /* renamed from: g */
    private boolean f672g;

    /* renamed from: h */
    private boolean f673h;

    /* renamed from: i */
    private boolean f674i;

    /* renamed from: j */
    private boolean f675j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f676k;

    /* renamed from: l */
    private int f677l;

    /* renamed from: m */
    private int f678m;

    /* renamed from: n */
    private String f679n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f680o = "";

    /* renamed from: com.adcolony.sdk.p0$a */
    class C0931a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f681a;

        C0931a(String str) {
            this.f681a = str;
        }

        public void run() {
            C0823f1 b = C0764c0.m322b();
            C0823f1 b2 = C0764c0.m322b();
            C0764c0.m326b(b2, "session_type", C0930p0.this.f670e);
            C0764c0.m319a(b2, "session_id", C0930p0.this.f671f);
            C0764c0.m319a(b2, "event", this.f681a);
            C0764c0.m319a(b, "type", "iab_hook");
            C0764c0.m319a(b, "message", b2.toString());
            new C0841h0("CustomMessage.controller_send", 0, b).mo10776c();
        }
    }

    /* renamed from: com.adcolony.sdk.p0$b */
    class C0932b implements AdColonyCustomMessageListener {

        /* renamed from: com.adcolony.sdk.p0$b$a */
        class C0933a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f684a;

            /* renamed from: b */
            final /* synthetic */ String f685b;

            /* renamed from: c */
            final /* synthetic */ float f686c;

            C0933a(String str, String str2, float f) {
                this.f684a = str;
                this.f685b = str2;
                this.f686c = f;
            }

            public void run() {
                if (this.f684a.equals(C0930p0.this.f680o)) {
                    C0930p0.this.mo10941a(this.f685b, this.f686c);
                    return;
                }
                AdColonyAdView adColonyAdView = C0714a.m136b().mo10827c().mo10658d().get(this.f684a);
                C0930p0 omidManager = adColonyAdView != null ? adColonyAdView.getOmidManager() : null;
                if (omidManager != null) {
                    omidManager.mo10941a(this.f685b, this.f686c);
                }
            }
        }

        C0932b() {
        }

        public void onAdColonyCustomMessage(AdColonyCustomMessage adColonyCustomMessage) {
            C0823f1 b = C0764c0.m323b(adColonyCustomMessage.getMessage());
            String h = C0764c0.m336h(b, "event_type");
            float floatValue = BigDecimal.valueOf(C0764c0.m330c(b, "duration")).floatValue();
            boolean b2 = C0764c0.m325b(b, "replay");
            boolean equals = C0764c0.m336h(b, "skip_type").equals("dec");
            String h2 = C0764c0.m336h(b, "asi");
            if (h.equals("skip") && equals) {
                boolean unused = C0930p0.this.f676k = true;
            } else if (!b2 || (!h.equals("start") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE) && !h.equals("midpoint") && !h.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE) && !h.equals("complete"))) {
                C1038z0.m1202b((Runnable) new C0933a(h2, h, floatValue));
            }
        }
    }

    C0930p0(C0823f1 f1Var, String str) {
        VerificationScriptResource verificationScriptResource;
        this.f670e = m854a(f1Var);
        this.f675j = C0764c0.m325b(f1Var, "skippable");
        this.f677l = C0764c0.m332d(f1Var, "skip_offset");
        this.f678m = C0764c0.m332d(f1Var, "video_duration");
        C0819e1 a = C0764c0.m309a(f1Var, "js_resources");
        C0819e1 a2 = C0764c0.m309a(f1Var, "verification_params");
        C0819e1 a3 = C0764c0.m309a(f1Var, "vendor_keys");
        this.f680o = str;
        for (int i = 0; i < a.mo10690b(); i++) {
            try {
                String b = C0764c0.m324b(a2, i);
                String b2 = C0764c0.m324b(a3, i);
                URL url = new URL(C0764c0.m324b(a, i));
                if (b.equals("") || b2.equals("")) {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                } else {
                    verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(b2, url, b);
                }
                this.f669d.add(verificationScriptResource);
            } catch (MalformedURLException unused) {
                new C0817e0.C0818a().mo10684a("Invalid js resource url passed to Omid").mo10685a(C0817e0.f434i);
            }
        }
        try {
            this.f679n = C0714a.m136b().mo10845p().mo11100a(C0764c0.m336h(f1Var, "filepath"), true).toString();
        } catch (IOException unused2) {
            new C0817e0.C0818a().mo10684a("Error loading IAB JS Client").mo10685a(C0817e0.f434i);
        }
    }

    /* renamed from: e */
    private void m861e() {
        AdColony.addCustomMessageListener(new C0932b(), "viewability_ad_event");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo10944d() {
        return this.f670e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10945f() {
        this.f673h = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10942b() {
        AdColony.removeCustomMessageListener("viewability_ad_event");
        this.f666a.finish();
        m859b("end_session");
        this.f666a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public AdSession mo10943c() {
        return this.f666a;
    }

    /* renamed from: a */
    private int m854a(C0823f1 f1Var) {
        if (this.f670e == -1) {
            int d = C0764c0.m332d(f1Var, "ad_unit_type");
            String h = C0764c0.m336h(f1Var, "ad_type");
            if (d == 0) {
                return 0;
            }
            if (d == 1) {
                if (h.equals("video")) {
                    return 0;
                }
                if (h.equals("display")) {
                    return 1;
                }
                if (h.equals("banner_display") || h.equals("interstitial_display")) {
                    return 2;
                }
            }
        }
        return this.f670e;
    }

    /* renamed from: b */
    private void m859b(String str) {
        if (!C1038z0.m1186a((Runnable) new C0931a(str))) {
            new C0817e0.C0818a().mo10684a("Executing ADCOmidManager.sendIabCustomMessage failed").mo10685a(C0817e0.f434i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10939a(C0752c cVar) {
        MediaEvents mediaEvents;
        VastProperties vastProperties;
        if (!this.f674i && this.f670e >= 0 && this.f666a != null) {
            m858b(cVar);
            m861e();
            if (this.f670e != 0) {
                mediaEvents = null;
            } else {
                mediaEvents = MediaEvents.createMediaEvents(this.f666a);
            }
            this.f668c = mediaEvents;
            try {
                this.f666a.start();
                this.f667b = AdEvents.createAdEvents(this.f666a);
                m859b("start_session");
                if (this.f668c != null) {
                    Position position = Position.PREROLL;
                    if (this.f675j) {
                        vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) this.f677l, true, position);
                    } else {
                        vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(true, position);
                    }
                    this.f667b.loaded(vastProperties);
                } else {
                    this.f667b.loaded();
                }
                this.f674i = true;
            } catch (NullPointerException e) {
                AdSession adSession = this.f666a;
                ErrorType errorType = ErrorType.GENERIC;
                adSession.error(errorType, "Exception occurred on AdSession.start: " + Log.getStackTraceString(e));
                mo10942b();
                C0817e0.C0818a a = new C0817e0.C0818a().mo10684a("Exception in ADCOmidManager on AdSession.start: ").mo10684a(Log.getStackTraceString(e));
                a.mo10684a(" Ad with adSessionId: " + this.f680o + ".").mo10685a(C0817e0.f434i);
            }
        }
    }

    /* renamed from: b */
    private void m858b(C0752c cVar) {
        m859b("register_ad_view");
        C0733b1 b1Var = C0714a.m136b().mo10802B().get(Integer.valueOf(cVar.mo10591k()));
        if (b1Var == null && !cVar.mo10594n().isEmpty()) {
            b1Var = (C0733b1) cVar.mo10594n().entrySet().iterator().next().getValue();
        }
        AdSession adSession = this.f666a;
        if (adSession != null && b1Var != null) {
            adSession.registerAdView(b1Var);
            if (b1Var instanceof C0898l0) {
                ((C0898l0) b1Var).mo10879p();
            }
        } else if (adSession != null) {
            adSession.registerAdView(cVar);
            cVar.mo10567a(this.f666a);
            m859b("register_obstructions");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10937a() throws IllegalArgumentException {
        mo10938a((WebView) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10938a(WebView webView) throws IllegalArgumentException {
        String str;
        List<VerificationScriptResource> list;
        if (this.f670e >= 0 && (str = this.f679n) != null && !str.equals("") && (list = this.f669d) != null) {
            if (!list.isEmpty() || mo10944d() == 2) {
                C0857k b = C0714a.m136b();
                Owner owner = Owner.NATIVE;
                ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                int d = mo10944d();
                if (d == 0) {
                    CreativeType creativeType = CreativeType.VIDEO;
                    AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false), AdSessionContext.createNativeAdSessionContext(b.mo10849t(), this.f679n, this.f669d, (String) null, (String) null));
                    this.f666a = createAdSession;
                    this.f671f = createAdSession.getAdSessionId();
                    m859b("inject_javascript");
                } else if (d == 1) {
                    CreativeType creativeType2 = CreativeType.NATIVE_DISPLAY;
                    AdSession createAdSession2 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType2, impressionType, owner, (Owner) null, false), AdSessionContext.createNativeAdSessionContext(b.mo10849t(), this.f679n, this.f669d, (String) null, (String) null));
                    this.f666a = createAdSession2;
                    this.f671f = createAdSession2.getAdSessionId();
                    m859b("inject_javascript");
                } else if (d == 2) {
                    CreativeType creativeType3 = CreativeType.HTML_DISPLAY;
                    AdSession createAdSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType3, impressionType, owner, (Owner) null, false), AdSessionContext.createHtmlAdSessionContext(b.mo10849t(), webView, "", (String) null));
                    this.f666a = createAdSession3;
                    this.f671f = createAdSession3.getAdSessionId();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10940a(String str) {
        mo10941a(str, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10941a(String str, float f) {
        if (C0714a.m138c() && this.f666a != null) {
            if (this.f668c != null || str.equals("start") || str.equals("skip") || str.equals("continue") || str.equals("cancel")) {
                char c = 65535;
                try {
                    switch (str.hashCode()) {
                        case -1941887438:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_FIRST_QUARTILE)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1710060637:
                            if (str.equals("buffer_start")) {
                                c = 12;
                                break;
                            }
                            break;
                        case -1638835128:
                            if (str.equals("midpoint")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1367724422:
                            if (str.equals("cancel")) {
                                c = 7;
                                break;
                            }
                            break;
                        case -934426579:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                c = 11;
                                break;
                            }
                            break;
                        case -651914917:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_THIRD_QUARTILE)) {
                                c = 3;
                                break;
                            }
                            break;
                        case -599445191:
                            if (str.equals("complete")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -567202649:
                            if (str.equals("continue")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -342650039:
                            if (str.equals("sound_mute")) {
                                c = 8;
                                break;
                            }
                            break;
                        case 3532159:
                            if (str.equals("skip")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                c = 10;
                                break;
                            }
                            break;
                        case 109757538:
                            if (str.equals("start")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 583742045:
                            if (str.equals("in_video_engagement")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 823102269:
                            if (str.equals("html5_interaction")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1648173410:
                            if (str.equals("sound_unmute")) {
                                c = 9;
                                break;
                            }
                            break;
                        case 1906584668:
                            if (str.equals("buffer_end")) {
                                c = 13;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f667b.impressionOccurred();
                            MediaEvents mediaEvents = this.f668c;
                            if (mediaEvents != null) {
                                if (f <= 0.0f) {
                                    f = (float) this.f678m;
                                }
                                mediaEvents.start(f, 1.0f);
                            }
                            m859b(str);
                            return;
                        case 1:
                            this.f668c.firstQuartile();
                            m859b(str);
                            return;
                        case 2:
                            this.f668c.midpoint();
                            m859b(str);
                            return;
                        case 3:
                            this.f668c.thirdQuartile();
                            m859b(str);
                            return;
                        case 4:
                            this.f676k = true;
                            this.f668c.complete();
                            m859b(str);
                            return;
                        case 5:
                            m859b(str);
                            mo10942b();
                            return;
                        case 6:
                        case 7:
                            MediaEvents mediaEvents2 = this.f668c;
                            if (mediaEvents2 != null) {
                                mediaEvents2.skipped();
                            }
                            m859b(str);
                            mo10942b();
                            return;
                        case 8:
                            this.f668c.volumeChange(0.0f);
                            m859b(str);
                            return;
                        case 9:
                            this.f668c.volumeChange(1.0f);
                            m859b(str);
                            return;
                        case 10:
                            if (!this.f672g && !this.f673h && !this.f676k) {
                                this.f668c.pause();
                                m859b(str);
                                this.f672g = true;
                                this.f673h = false;
                                return;
                            }
                            return;
                        case 11:
                            if (this.f672g && !this.f676k) {
                                this.f668c.resume();
                                m859b(str);
                                this.f672g = false;
                                return;
                            }
                            return;
                        case 12:
                            this.f668c.bufferStart();
                            m859b(str);
                            return;
                        case 13:
                            this.f668c.bufferFinish();
                            m859b(str);
                            return;
                        case 14:
                        case 15:
                            this.f668c.adUserInteraction(InteractionType.CLICK);
                            m859b(str);
                            if (this.f673h && !this.f672g && !this.f676k) {
                                this.f668c.pause();
                                m859b(CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
                                this.f672g = true;
                                this.f673h = false;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (IllegalArgumentException | IllegalStateException e) {
                    new C0817e0.C0818a().mo10684a("Recording IAB event for ").mo10684a(str).mo10684a(" caused " + e.getClass()).mo10685a(C0817e0.f432g);
                }
            }
        }
    }
}
