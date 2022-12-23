package com.p374my.tracker.obfuscated;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.p374my.tracker.MyTracker;
import com.p374my.tracker.MyTrackerConfig;
import com.p374my.tracker.MyTrackerParams;
import com.p374my.tracker.config.AntiFraudConfig;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.net.URI;

/* renamed from: com.my.tracker.obfuscated.v0 */
public final class C10178v0 {

    /* renamed from: a */
    private final MyTrackerParams f25486a = new MyTrackerParams();

    /* renamed from: b */
    private String f25487b = "";

    /* renamed from: c */
    private AntiFraudConfig f25488c = AntiFraudConfig.newBuilder().build();

    /* renamed from: d */
    private volatile boolean f25489d = true;

    /* renamed from: e */
    private volatile boolean f25490e = true;

    /* renamed from: f */
    private volatile boolean f25491f = true;

    /* renamed from: g */
    private volatile boolean f25492g = true;

    /* renamed from: h */
    private volatile boolean f25493h = true;

    /* renamed from: i */
    private volatile boolean f25494i = true;

    /* renamed from: j */
    private volatile int f25495j = 30;

    /* renamed from: k */
    private volatile int f25496k = 0;

    /* renamed from: l */
    private volatile int f25497l = ErrorCode.UNDEFINED_ERROR;

    /* renamed from: m */
    private volatile String f25498m = null;

    /* renamed from: n */
    private volatile MyTrackerConfig.InstalledPackagesProvider f25499n = null;

    /* renamed from: o */
    private volatile MyTrackerConfig.OkHttpClientProvider f25500o = null;

    /* renamed from: p */
    private volatile String f25501p = m30452a("https", "tracker-api.my.com", (String) null);

    /* renamed from: q */
    private volatile MyTracker.AttributionListener f25502q = null;

    /* renamed from: r */
    private volatile Handler f25503r = null;

    private C10178v0() {
    }

    /* renamed from: a */
    private static String m30452a(String str, String str2, String str3) {
        Uri.Builder builder = new Uri.Builder();
        if (TextUtils.isEmpty(str)) {
            str = "https";
        }
        Uri.Builder encodedAuthority = builder.scheme(str).encodedAuthority(str2);
        if (!TextUtils.isEmpty(str3)) {
            encodedAuthority = encodedAuthority.encodedPath(str3);
        }
        return encodedAuthority.appendEncodedPath("v3/").toString();
    }

    /* renamed from: s */
    public static C10178v0 m30453s() {
        return new C10178v0();
    }

    /* renamed from: a */
    public AntiFraudConfig mo66396a() {
        return this.f25488c;
    }

    /* renamed from: a */
    public void mo66397a(int i) {
        if (i > 86400) {
            C10175u0.m30440a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to max " + 86400);
            i = 86400;
        } else if (i < 1) {
            C10175u0.m30440a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to min " + 1);
            i = 1;
        }
        this.f25497l = i;
    }

    /* renamed from: a */
    public void mo66398a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.f25502q = attributionListener;
        this.f25503r = handler;
    }

    /* renamed from: a */
    public void mo66399a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.f25499n = installedPackagesProvider;
    }

    /* renamed from: a */
    public void mo66400a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.f25500o = okHttpClientProvider;
    }

    /* renamed from: a */
    public void mo66401a(AntiFraudConfig antiFraudConfig) {
        this.f25488c = antiFraudConfig;
    }

    /* renamed from: a */
    public void mo66402a(C10129m0 m0Var) {
        m0Var.mo66290c(this.f25487b);
        this.f25486a.putDataToBuilder(m0Var);
        int i = this.f25495j;
        if (i != 30) {
            m0Var.mo66288c(i);
        }
        int i2 = this.f25497l;
        if (i2 != 900) {
            m0Var.mo66259a(i2);
        }
        int i3 = this.f25496k;
        if (i3 != 0) {
            m0Var.mo66278b(i3);
        }
        if (!this.f25490e) {
            m0Var.mo66323l();
        }
        if (!this.f25489d) {
            m0Var.mo66320k();
        }
        if (!this.f25491f) {
            m0Var.mo66317j();
        }
        if (!this.f25492g) {
            m0Var.mo66276b();
        }
        if (!this.f25493h) {
            m0Var.mo66302f();
        }
        if (!this.f25494i) {
            m0Var.mo66307g();
        }
        if (!this.f25488c.useLightSensor) {
            m0Var.mo66292d();
        }
        if (!this.f25488c.useMagneticFieldSensor) {
            m0Var.mo66297e();
        }
        if (!this.f25488c.useGyroscope) {
            m0Var.mo66286c();
        }
        if (!this.f25488c.usePressureSensor) {
            m0Var.mo66311h();
        }
        if (!this.f25488c.useProximitySensor) {
            m0Var.mo66314i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo66403a(String str) {
        this.f25487b = str;
    }

    /* renamed from: a */
    public void mo66404a(boolean z) {
        this.f25492g = z;
    }

    /* renamed from: b */
    public Handler mo66405b() {
        return this.f25503r;
    }

    /* renamed from: b */
    public void mo66406b(int i) {
        if (i > 432000) {
            C10175u0.m30440a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max " + 432000);
            this.f25496k = 432000;
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid forcingPeriod value ");
            sb.append(i);
            sb.append(", forcingPeriod set to min ");
            i = 0;
            sb.append(0);
            C10175u0.m30440a(sb.toString());
        }
        this.f25496k = i;
    }

    /* renamed from: b */
    public void mo66407b(String str) {
        URI uri;
        try {
            if (TextUtils.isEmpty(str)) {
                this.f25501p = m30452a("https", "tracker-api.my.com", (String) null);
                return;
            }
            if (str.contains("://")) {
                uri = new URI(str);
            } else {
                uri = new URI("https://" + str);
            }
            this.f25501p = m30452a(uri.getScheme(), uri.getAuthority(), uri.getPath());
            C10175u0.m30440a("set tracker url to " + this.f25501p);
        } catch (Throwable unused) {
            this.f25501p = m30452a("https", "tracker-api.my.com", (String) null);
            C10175u0.m30444b("unable to set invalid url " + this.f25501p + ", using default");
        }
    }

    /* renamed from: b */
    public void mo66408b(boolean z) {
        this.f25491f = z;
    }

    /* renamed from: c */
    public MyTracker.AttributionListener mo66409c() {
        return this.f25502q;
    }

    /* renamed from: c */
    public void mo66410c(int i) {
        if (i > 7200) {
            C10175u0.m30440a("Invalid launchTimeout value " + i + ", timeout set to max " + 7200);
            i = 7200;
        } else if (i < 30) {
            C10175u0.m30440a("Invalid launchTimeout value " + i + ", timeout set to min " + 30);
            i = 30;
        }
        this.f25495j = i;
    }

    /* renamed from: c */
    public void mo66411c(String str) {
        this.f25498m = str;
    }

    /* renamed from: c */
    public void mo66412c(boolean z) {
        this.f25489d = z;
    }

    /* renamed from: d */
    public int mo66413d() {
        return this.f25497l;
    }

    /* renamed from: d */
    public void mo66414d(int i) {
        mo66407b(i != 0 ? i != 1 ? null : "eu.tracker-api.my.com" : "ru.tracker-api.my.com");
    }

    /* renamed from: d */
    public void mo66415d(boolean z) {
        this.f25490e = z;
    }

    /* renamed from: e */
    public int mo66416e() {
        return this.f25496k;
    }

    /* renamed from: e */
    public void mo66417e(boolean z) {
        this.f25493h = z;
    }

    /* renamed from: f */
    public String mo66418f() {
        return this.f25487b;
    }

    /* renamed from: f */
    public void mo66419f(boolean z) {
        this.f25494i = z;
    }

    /* renamed from: g */
    public MyTrackerConfig.InstalledPackagesProvider mo66420g() {
        return this.f25499n;
    }

    /* renamed from: h */
    public int mo66421h() {
        return this.f25495j;
    }

    /* renamed from: i */
    public MyTrackerParams mo66422i() {
        return this.f25486a;
    }

    /* renamed from: j */
    public MyTrackerConfig.OkHttpClientProvider mo66423j() {
        return this.f25500o;
    }

    /* renamed from: k */
    public String mo66424k() {
        return this.f25501p;
    }

    /* renamed from: l */
    public String mo66425l() {
        return this.f25498m;
    }

    /* renamed from: m */
    public boolean mo66426m() {
        return this.f25492g;
    }

    /* renamed from: n */
    public boolean mo66427n() {
        return this.f25491f;
    }

    /* renamed from: o */
    public boolean mo66428o() {
        return this.f25489d;
    }

    /* renamed from: p */
    public boolean mo66429p() {
        return this.f25490e;
    }

    /* renamed from: q */
    public boolean mo66430q() {
        return this.f25493h;
    }

    /* renamed from: r */
    public boolean mo66431r() {
        return this.f25494i;
    }

    /* renamed from: t */
    public void mo66432t() {
        this.f25498m = "com.my.games.vendorapp";
    }
}
