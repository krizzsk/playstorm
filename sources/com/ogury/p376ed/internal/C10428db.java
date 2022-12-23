package com.ogury.p376ed.internal;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.crash.CrashConfig;
import com.ogury.core.internal.crash.OguryCrashReport;
import com.ogury.core.internal.crash.SdkInfo;
import com.ogury.p376ed.internal.C10527fk;
import p394io.presage.common.PresageSdk;

/* renamed from: com.ogury.ed.internal.db */
public final class C10428db {

    /* renamed from: a */
    public static final C10429a f26372a = new C10429a((byte) 0);

    /* renamed from: b */
    private final C10527fk.C10528a f26373b;

    /* renamed from: c */
    private final C10531fn f26374c;

    private C10428db(C10527fk.C10528a aVar, C10531fn fnVar) {
        C10765mq.m32773b(aVar, "profigDaoFactory");
        C10765mq.m32773b(fnVar, "profigGateway");
        this.f26373b = aVar;
        this.f26374c = fnVar;
    }

    public /* synthetic */ C10428db() {
        this(C10527fk.f26610a, C10531fn.f26635a);
    }

    /* renamed from: com.ogury.ed.internal.db$a */
    public static final class C10429a {
        public /* synthetic */ C10429a(byte b) {
            this();
        }

        private C10429a() {
        }
    }

    /* renamed from: a */
    public static void m31545a(Context context, String str) {
        C10765mq.m32773b(context, "appContext");
        C10765mq.m32773b(str, "apiKey");
        C10530fm a = C10531fn.m32005a(context);
        if (a != null) {
            try {
                OguryCrashReport.start(CampaignUnit.JSON_KEY_ADS, context, new SdkInfo(PresageSdk.getAdsSdkVersion(), str, C10527fk.C10528a.m31966a(context).mo67396c()), new CrashConfig(a.mo67438m(), context.getPackageName(), 5, 100));
            } catch (Throwable unused) {
            }
        }
    }
}
