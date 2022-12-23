package com.applovin.impl.sdk.p045a;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2392R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.applovin.impl.sdk.a.f */
public class C1801f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f2864a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f2865b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f2866c;

    public C1801f(C1959m mVar) {
        this.f2864a = mVar;
        this.f2865b = mVar.mo14297L();
    }

    /* renamed from: a */
    public String mo13860a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f2866c, str);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f2864a.mo14286A().mo14790b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    /* renamed from: a */
    public void mo13861a() {
        if (((Boolean) this.f2864a.mo14311a(C1857b.f3113aq)).booleanValue()) {
            if (C2092v.m5047a()) {
                C2092v A = this.f2864a.mo14286A();
                A.mo14789b("OpenMeasurementService", "Initializing Open Measurement SDK v" + mo13863c() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(C1801f.this.f2865b);
                    if (C2092v.m5047a()) {
                        C2092v A = C1801f.this.f2864a.mo14286A();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Init ");
                        sb.append(C1801f.this.mo13862b() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                        sb.append(" and took ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        sb.append("ms");
                        A.mo14789b("OpenMeasurementService", sb.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C1801f.this.f2865b.getResources().openRawResource(C2392R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb2.append(readLine);
                                } else {
                                    String unused = C1801f.this.f2866c = sb2.toString();
                                    try {
                                        bufferedReader.close();
                                        return;
                                    } catch (IOException e) {
                                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (C2092v.m5047a()) {
                            C1801f.this.f2864a.mo14286A().mo14790b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th2);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo13862b() {
        return Omid.isActive();
    }

    /* renamed from: c */
    public String mo13863c() {
        return Omid.getVersion();
    }

    /* renamed from: d */
    public Partner mo13864d() {
        return Partner.createPartner((String) this.f2864a.mo14311a(C1857b.f3114ar), AppLovinSdk.VERSION);
    }

    /* renamed from: e */
    public String mo13865e() {
        return this.f2866c;
    }
}
