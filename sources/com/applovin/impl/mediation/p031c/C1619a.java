package com.applovin.impl.mediation.p031c;

import android.app.Activity;
import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.p028a.C1578f;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1856a;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.c.a */
public class C1619a extends C1877a {

    /* renamed from: a */
    private final List<C1578f> f2211a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f2212c;

    /* renamed from: com.applovin.impl.mediation.c.a$a */
    public static class C1621a extends C1877a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1578f f2215a;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final List<C1578f> f2216c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Activity f2217d;

        private C1621a(C1578f fVar, List<C1578f> list, C1959m mVar, Activity activity) {
            super("TaskSequentialInitAdapter:" + fVar.mo13207K(), mVar, true);
            this.f2217d = activity;
            this.f2215a = fVar;
            this.f2216c = list;
        }

        public void run() {
            if (C2092v.m5047a()) {
                mo14142a("Auto-initing " + this.f2215a + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f3467b.mo14289D().mo13591a(this.f2215a, this.f2217d, new Runnable() {
                public void run() {
                    if (C2092v.m5047a()) {
                        C1621a aVar = C1621a.this;
                        aVar.mo14142a("Initialization task for adapter '" + C1621a.this.f2215a.mo13208L() + "' finished");
                    }
                    int indexOf = C1621a.this.f2216c.indexOf(C1621a.this.f2215a);
                    if (indexOf < C1621a.this.f2216c.size() - 1) {
                        C1578f fVar = (C1578f) C1621a.this.f2216c.get(indexOf + 1);
                        C1621a.this.f3467b.mo14303S().mo14207a((C1877a) new C1621a(fVar, C1621a.this.f2216c, C1621a.this.f3467b, C1621a.this.f2217d), C1908o.C1910a.MAIN, fVar.mo13221Y());
                    } else if (C2092v.m5047a()) {
                        C1621a.this.mo14142a("Finished initializing adapters");
                    }
                }
            });
        }
    }

    public C1619a(List<C1578f> list, Activity activity, C1959m mVar) {
        super("TaskAutoInitAdapters", mVar, true);
        this.f2211a = list;
        this.f2212c = activity;
    }

    public void run() {
        try {
            if (this.f2211a.size() > 0) {
                if (C2092v.m5047a()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Auto-initing ");
                    sb.append(this.f2211a.size());
                    sb.append(" adapters");
                    sb.append(this.f3467b.mo14295J().mo13583a() ? " in test mode" : "");
                    sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
                    mo14142a(sb.toString());
                }
                if (TextUtils.isEmpty(this.f3467b.mo14367t())) {
                    this.f3467b.mo14349c("max");
                } else if (!this.f3467b.mo14353f() && C2092v.m5047a()) {
                    C2092v.m5053i("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f3467b.mo14367t());
                }
                if (C2092v.m5047a() && this.f2212c == null) {
                    C2092v.m5053i("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
                }
                if (((Boolean) this.f3467b.mo14311a(C1856a.f3034Q)).booleanValue()) {
                    C1578f fVar = this.f2211a.get(0);
                    this.f3467b.mo14303S().mo14207a((C1877a) new C1621a(fVar, this.f2211a, this.f3467b, this.f2212c), C1908o.C1910a.MAIN, fVar.mo13221Y());
                    return;
                }
                for (final C1578f next : this.f2211a) {
                    this.f3467b.mo14303S().mo14209a((Runnable) new Runnable() {
                        public void run() {
                            if (C2092v.m5047a()) {
                                C1619a aVar = C1619a.this;
                                aVar.mo14142a("Auto-initing adapter: " + next);
                            }
                            C1619a.this.f3467b.mo14289D().mo13590a(next, C1619a.this.f2212c);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                mo14143a("Failed to auto-init adapters", th);
            }
        }
    }
}
