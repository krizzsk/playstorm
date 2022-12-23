package com.bytedance.sdk.openadsdk.p179k;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.component.utils.C2970j;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.utils.C4002l;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.k.b */
/* compiled from: TrackAdUrlImpl */
public class C3903b implements C3902a {

    /* renamed from: a */
    private final Context f10090a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3911g f10091b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ExecutorService f10092c = Executors.newSingleThreadExecutor();

    public C3903b(Context context, C3911g gVar) {
        this.f10090a = context;
        this.f10091b = gVar;
    }

    /* renamed from: c */
    public Context mo20787c() {
        Context context = this.f10090a;
        return context == null ? C3578m.m11231a() : context;
    }

    /* renamed from: a */
    public void mo20785a(final List<String> list) {
        if (C3536e.m10968a()) {
            C2952e.m8314b(new C2955g("trackUrls") {
                public void run() {
                    if (C2970j.m8371b(list)) {
                        for (String fVar : list) {
                            new C3906a(new C3910f(C4002l.m13120a() + "_" + System.currentTimeMillis(), fVar, 5)).executeOnExecutor(C3903b.this.f10092c, new Void[0]);
                        }
                    }
                }
            }, 5);
        }
    }

    /* renamed from: a */
    public void mo20784a() {
        C2952e.m8313b((C2955g) new C2955g("trackFailedUrls") {
            public void run() {
                C3903b.this.m12809b(C3903b.this.f10091b.mo20797a());
            }
        });
    }

    /* renamed from: b */
    public void mo20786b() {
        try {
            this.f10092c.shutdownNow();
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12809b(List<C3910f> list) {
        if (C2970j.m8371b(list)) {
            for (C3910f aVar : list) {
                new C3906a(aVar).executeOnExecutor(this.f10092c, new Void[0]);
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.k.b$a */
    /* compiled from: TrackAdUrlImpl */
    private class C3906a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private final C3910f f10097b;

        private C3906a(C3910f fVar) {
            this.f10097b = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo20791a(String str) {
            return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:22|23|24|25|26|27|30|(3:32|33|(3:49|35|(1:37)(0)))|38|(1:40)|41|(3:51|43|(1:45)(0))(3:46|54|48)) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
            r4 = null;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x007b */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0085 A[SYNTHETIC, Splitter:B:32:0x0085] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd A[Catch:{ all -> 0x0029 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0118 A[Catch:{ all -> 0x0029 }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00ec A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Void... r4) {
            /*
                r3 = this;
                boolean r4 = com.bytedance.sdk.openadsdk.core.p155i.C3536e.m10968a()
                r0 = 0
                if (r4 != 0) goto L_0x0008
                return r0
            L_0x0008:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b
                java.lang.String r4 = r4.mo20795b()
                boolean r4 = r3.mo20791a((java.lang.String) r4)
                if (r4 != 0) goto L_0x0015
                return r0
            L_0x0015:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b
                int r4 = r4.mo20796c()
                if (r4 != 0) goto L_0x0029
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f10091b
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f10097b
                r4.mo20800c(r1)
                return r0
            L_0x0029:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b
                int r4 = r4.mo20796c()
                if (r4 <= 0) goto L_0x0125
                boolean r4 = r3.isCancelled()
                if (r4 != 0) goto L_0x0125
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b     // Catch:{ all -> 0x0029 }
                int r4 = r4.mo20796c()     // Catch:{ all -> 0x0029 }
                r1 = 5
                if (r4 != r1) goto L_0x004b
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f10091b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f10097b     // Catch:{ all -> 0x0029 }
                r4.mo20798a(r1)     // Catch:{ all -> 0x0029 }
            L_0x004b:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this     // Catch:{ all -> 0x0029 }
                android.content.Context r4 = r4.mo20787c()     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2979o.m8406a((android.content.Context) r4)     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0059
                goto L_0x0125
            L_0x0059:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.mo20795b()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.i.d r1 = com.bytedance.sdk.openadsdk.p176i.C3854d.m12660a()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.e.a r1 = r1.mo20705b()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.e.b.b r1 = r1.mo17762c()     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = com.bytedance.sdk.openadsdk.utils.C4012s.m13172b(r4)     // Catch:{ all -> 0x0029 }
                r1.mo17789a((java.lang.String) r4)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = "User-Agent"
                java.lang.String r2 = com.bytedance.sdk.openadsdk.utils.C4014u.m13197b()     // Catch:{ Exception -> 0x007b }
                r1.mo17792b(r4, r2)     // Catch:{ Exception -> 0x007b }
            L_0x007b:
                com.bytedance.sdk.component.e.b r4 = r1.mo17785a()     // Catch:{ all -> 0x0080 }
                goto L_0x0081
            L_0x0080:
                r4 = r0
            L_0x0081:
                java.lang.String r1 = "trackurl"
                if (r4 == 0) goto L_0x00b7
                boolean r4 = r4.mo17779f()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x00b7
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f10091b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                r4.mo20800c(r2)     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2975l.m8389c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0125
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track success : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20795b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2975l.m8387c(r1, r4)     // Catch:{ all -> 0x0029 }
                goto L_0x0125
            L_0x00b7:
                boolean r4 = com.bytedance.sdk.component.utils.C2975l.m8389c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x00d7
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track fail : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20795b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2975l.m8387c(r1, r4)     // Catch:{ all -> 0x0029 }
            L_0x00d7:
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                int r2 = r2.mo20796c()     // Catch:{ all -> 0x0029 }
                int r2 = r2 + -1
                r4.mo20794a(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r4 = r3.f10097b     // Catch:{ all -> 0x0029 }
                int r4 = r4.mo20796c()     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0118
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f10091b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                r4.mo20800c(r2)     // Catch:{ all -> 0x0029 }
                boolean r4 = com.bytedance.sdk.component.utils.C2975l.m8389c()     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0125
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
                r4.<init>()     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = "track fail and delete : "
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r2 = r3.f10097b     // Catch:{ all -> 0x0029 }
                java.lang.String r2 = r2.mo20795b()     // Catch:{ all -> 0x0029 }
                r4.append(r2)     // Catch:{ all -> 0x0029 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.component.utils.C2975l.m8387c(r1, r4)     // Catch:{ all -> 0x0029 }
                goto L_0x0125
            L_0x0118:
                com.bytedance.sdk.openadsdk.k.b r4 = com.bytedance.sdk.openadsdk.p179k.C3903b.this     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.g r4 = r4.f10091b     // Catch:{ all -> 0x0029 }
                com.bytedance.sdk.openadsdk.k.f r1 = r3.f10097b     // Catch:{ all -> 0x0029 }
                r4.mo20799b(r1)     // Catch:{ all -> 0x0029 }
                goto L_0x0029
            L_0x0125:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p179k.C3903b.C3906a.doInBackground(java.lang.Void[]):java.lang.Void");
        }
    }

    /* renamed from: d */
    public static C3902a m12810d() {
        return C3908d.m12820c();
    }
}
