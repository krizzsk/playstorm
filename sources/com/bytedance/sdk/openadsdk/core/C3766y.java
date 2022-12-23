package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2959b;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity;
import com.bytedance.sdk.openadsdk.core.p151e.C3479h;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.core.p151e.C3501p;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3177p;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import com.com.bytedance.overseas.sdk.p186a.C4026c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.core.y */
/* compiled from: WebHelper */
public class C3766y {

    /* renamed from: a */
    private static boolean f9804a = false;

    /* renamed from: a */
    public static void m12377a(boolean z) {
        f9804a = z;
    }

    /* renamed from: a */
    public static boolean m12378a(Context context, C3498n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, C4026c cVar, boolean z) {
        String str2;
        String str3;
        Context context2 = context;
        C3498n nVar2 = nVar;
        String str4 = str;
        if (context2 == null || nVar2 == null || i == -1) {
            return false;
        }
        C3479h ab = nVar.mo19658ab();
        if (ab != null) {
            String a = ab.mo19534a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(ab.mo19534a());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!C4014u.m13250l(context)) {
                    try {
                        if (C3578m.m11241h().mo19932c()) {
                            C4014u.m13201b(nVar, str4);
                        }
                        if (!(context2 instanceof Activity)) {
                            intent.addFlags(268435456);
                        }
                        C3156e.m9200d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                        context.startActivity(intent);
                        C3177p.m9301a().mo18797a(nVar, str4);
                        return true;
                    } catch (Throwable unused) {
                        a = nVar.mo19612O();
                    }
                } else if (C4014u.m13194a(context, intent)) {
                    if (C3578m.m11241h().mo19932c()) {
                        C4014u.m13201b(nVar, str4);
                    }
                    if (!(context2 instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    final Context context3 = context;
                    final C3498n nVar3 = nVar;
                    final int i2 = i;
                    final String str5 = str;
                    final boolean z2 = z;
                    C2959b.m8339a(context, intent, new C2959b.C2960a() {
                        /* renamed from: a */
                        public void mo17887a() {
                        }

                        /* renamed from: a */
                        public void mo17888a(Throwable th) {
                            if (!C3578m.m11241h().mo19932c()) {
                                C3766y.m12380a(context3, nVar3.mo19612O(), nVar3, i2, str5, z2);
                                C2975l.m8388c("WebHelper", "openDetailPage() -> context.startActivity(intent) fail :", th);
                            }
                        }
                    });
                    C3156e.m9200d(context, nVar, str4, "open_url_app", (Map<String, Object>) null);
                    C3177p.m9301a().mo18797a(nVar, str4);
                    return true;
                }
            }
            if (ab.mo19539c() != 2 || nVar.mo19660ad() == 5 || nVar.mo19660ad() == 15) {
                if (ab.mo19539c() == 1) {
                    a = ab.mo19537b();
                } else {
                    a = nVar.mo19612O();
                }
            } else if (cVar != null) {
                if (cVar.mo20929a()) {
                    C3156e.m9200d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else if (cVar.mo20935e()) {
                    C3156e.m9200d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return true;
                } else {
                    C3156e.m9200d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
                    return false;
                }
            }
            C3156e.m9200d(context, nVar, str4, "open_fallback_url", (Map<String, Object>) null);
            str2 = a;
        } else {
            if (!nVar.mo19679aw() || nVar.mo19680ax() == null) {
                str3 = nVar.mo19612O();
            } else {
                str3 = nVar.mo19680ax().mo19995i();
            }
            str2 = str3;
        }
        return m12379a(context, nVar, i, tTNativeAd, tTNativeExpressAd, str, z, str2);
    }

    /* renamed from: a */
    public static boolean m12379a(Context context, C3498n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str, boolean z, String str2) {
        Context context2 = context;
        if (TextUtils.isEmpty(str2) && !C3501p.m10761a(nVar)) {
            return false;
        }
        if (nVar.mo19609L() != 2) {
            C2959b.m8339a(context, m12376a(context, str2, nVar, i, tTNativeAd, tTNativeExpressAd, str, z), (C2959b.C2960a) null);
            f9804a = false;
            return true;
        } else if (!C2979o.m8407a(str2)) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            try {
                intent.setData(Uri.parse(str2));
                if (!(context2 instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C2959b.m8339a(context, intent, (C2959b.C2960a) null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static boolean m12380a(Context context, String str, C3498n nVar, int i, String str2, boolean z) {
        try {
            context.startActivity(m12376a(context, str, nVar, i, (TTNativeAd) null, (TTNativeExpressAd) null, str2, z));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static Intent m12376a(Context context, String str, C3498n nVar, int i, TTNativeAd tTNativeAd, TTNativeExpressAd tTNativeExpressAd, String str2, boolean z) {
        Intent intent;
        if (!C3501p.m10761a(nVar) || (tTNativeAd == null && tTNativeExpressAd == null)) {
            intent = (nVar.mo19609L() != 3 || (nVar.mo19705f() != 2 && (nVar.mo19705f() != 1 || !f9804a)) || nVar.f8596a) ? new Intent(context, TTLandingPageActivity.class) : new Intent(context, TTVideoLandingPageLink2Activity.class);
        } else {
            intent = new Intent(context, TTPlayableLandingPageActivity.class);
            intent.putExtra("ad_pending_download", m12381a(nVar, z));
            String c = C3501p.m10763c(nVar);
            if (!TextUtils.isEmpty(c)) {
                if (c.contains("?")) {
                    str = c + "&orientation=portrait";
                } else {
                    str = c + "?orientation=portrait";
                }
            }
        }
        intent.putExtra("url", str);
        intent.putExtra("gecko_id", nVar.mo19662af());
        intent.putExtra("web_title", nVar.mo19618U());
        intent.putExtra("sdk_version", BuildConfig.VERSION_CODE);
        intent.putExtra("adid", nVar.mo19622Y());
        intent.putExtra("log_extra", nVar.mo19659ac());
        C3954a aVar = null;
        intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, nVar.mo19610M() == null ? null : nVar.mo19610M().mo19559a());
        intent.putExtra("event_tag", str2);
        intent.putExtra("source", i);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (C3953b.m12901c()) {
            intent.putExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA, nVar.mo19674ar().toString());
        } else {
            C3645t.m11590a().mo20230h();
            C3645t.m11590a().mo20220a(nVar);
        }
        if (nVar.mo19660ad() == 5 || nVar.mo19660ad() == 15 || nVar.mo19660ad() == 50) {
            if (tTNativeAd != null) {
                if (tTNativeAd instanceof C3954a.C3955a) {
                    aVar = ((C3954a.C3955a) tTNativeAd).mo18945f();
                }
                if (aVar != null) {
                    intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo20878a().toString());
                }
            }
            if (!(tTNativeExpressAd == null || (aVar = tTNativeExpressAd.getVideoModel()) == null)) {
                intent.putExtra(TTAdConstant.MULTI_PROCESS_DATA, aVar.mo20878a().toString());
            }
            if (aVar != null) {
                intent.putExtra("video_is_auto_play", aVar.f10171d);
                if (C2975l.m8389c()) {
                    C2975l.m8387c("videoDataModel", "videoDataModel=" + aVar.mo20878a().toString());
                }
            }
        }
        return intent;
    }

    /* renamed from: a */
    private static boolean m12381a(C3498n nVar, boolean z) {
        if (z && nVar != null && nVar.mo19609L() == 4 && C3501p.m10761a(nVar)) {
            return true;
        }
        return false;
    }
}
