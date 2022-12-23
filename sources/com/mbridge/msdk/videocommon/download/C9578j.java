package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8601r;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.videocommon.download.C9560f;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.List;

/* renamed from: com.mbridge.msdk.videocommon.download.j */
/* compiled from: ResourceManager */
public final class C9578j {

    /* renamed from: a */
    private static String f23545a = "ResourceManager";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f23546b;

    /* renamed from: com.mbridge.msdk.videocommon.download.j$a */
    /* compiled from: ResourceManager */
    private static class C9580a {

        /* renamed from: a */
        public static C9578j f23548a = new C9578j();
    }

    private C9578j() {
        this.f23546b = C8422e.m24335b(C8420c.MBRIDGE_700_RES);
    }

    /* renamed from: a */
    public static C9578j m27494a() {
        return C9580a.f23548a;
    }

    /* renamed from: b */
    public final void mo63258b() {
        try {
            if (!TextUtils.isEmpty(this.f23546b)) {
                C9560f.C9562a.f23519a.mo63239a(new C8434a() {
                    /* renamed from: b */
                    public final void mo15709b() {
                    }

                    /* renamed from: a */
                    public final void mo15708a() {
                        C8602s.m24873c(C9578j.this.f23546b);
                    }
                });
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final synchronized String mo63257a(String str, byte[] bArr) {
        String str2;
        String str3 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str4 = this.f23546b + "/" + SameMD5.getMD5(C8557ad.m24739a(str)) + ".zip";
                    File file = new File(str4);
                    if (C8602s.m24868a(bArr, file)) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters("nc");
                        if (queryParameters != null) {
                            if (queryParameters.size() != 0) {
                                str3 = m27496a(str, str4, file);
                            }
                        }
                        List<String> queryParameters2 = parse.getQueryParameters("md5filename");
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str5 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str5) && str5.equals(C8601r.m24860a(file))) {
                                str3 = m27496a(str, str4, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        C8602s.m24869b(file);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                str2 = e.getMessage();
            }
        }
        str2 = str3;
        return str2;
    }

    /* renamed from: a */
    private String m27496a(String str, String str2, File file) {
        String a = C8602s.m24863a(str2, this.f23546b + "/" + SameMD5.getMD5(C8557ad.m24739a(str)));
        return TextUtils.isEmpty(a) ? C8602s.m24869b(file) : a;
    }

    /* renamed from: a */
    public final String mo63256a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.f23546b + "/" + SameMD5.getMD5(C8557ad.m24739a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters("foldername");
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!C8602s.m24867a(str6)) {
                return null;
            }
            try {
                C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
                if (b != null && !TextUtils.isEmpty(b.mo15477ap())) {
                    File file = new File(str6);
                    C8602s.m24868a(C2265b.m5116a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, C8602s.m24862a(file))).getBytes(), file);
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return Advertisement.FILE_SCHEME + str6 + str3;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
