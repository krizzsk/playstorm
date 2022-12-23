package p394io.presage.common;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10423cy;
import com.ogury.p376ed.internal.C10432de;
import com.ogury.p376ed.internal.C10765mq;

/* renamed from: io.presage.common.PresageSdk */
public final class PresageSdk {

    /* renamed from: a */
    public static final PresageSdk f29336a = new PresageSdk();

    /* renamed from: b */
    private static C10432de f29337b = new C10432de();

    private PresageSdk() {
    }

    public static final void init(Context context, String str) {
        C10765mq.m32773b(context, "context");
        m34605a(new C10423cy(context, str));
    }

    /* renamed from: a */
    public static void m34605a(C10423cy cyVar) {
        C10765mq.m32773b(cyVar, "adsConfig");
        OguryIntegrationLogger.m30996d("[Ads] Setting up...");
        f29337b.mo67178a(cyVar);
    }

    public static final String getAdsSdkVersion() {
        return C10432de.m31571d();
    }

    /* renamed from: a */
    public static boolean m34606a() {
        return f29337b.mo67180a();
    }

    /* renamed from: b */
    public static boolean m34607b() {
        return f29337b.mo67181b();
    }

    /* renamed from: c */
    public static boolean m34608c() {
        return f29337b.mo67182c();
    }

    public final void addSdkInitCallback(PresageSdkInitCallback presageSdkInitCallback) {
        C10765mq.m32773b(presageSdkInitCallback, "presageSdkInitCallback");
        f29337b.mo67179a(presageSdkInitCallback);
    }
}
