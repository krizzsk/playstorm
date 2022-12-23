package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.same.p303e.C8434a;
import com.mbridge.msdk.foundation.tools.C8557ad;
import com.mbridge.msdk.foundation.tools.C8602s;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p051a.C2265b;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.videocommon.download.C9560f;
import java.io.File;

/* renamed from: com.mbridge.msdk.videocommon.download.h */
/* compiled from: HTMLResourceManager */
public final class C9572h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f23536a;

    /* renamed from: com.mbridge.msdk.videocommon.download.h$a */
    /* compiled from: HTMLResourceManager */
    private static class C9574a {

        /* renamed from: a */
        public static C9572h f23538a = new C9572h();
    }

    private C9572h() {
        this.f23536a = C8422e.m24335b(C8420c.MBRIDGE_700_HTML);
    }

    /* renamed from: a */
    public static C9572h m27477a() {
        return C9574a.f23538a;
    }

    /* renamed from: b */
    public final void mo63247b() {
        try {
            if (!TextUtils.isEmpty(this.f23536a)) {
                C9560f.C9562a.f23519a.mo63239a(new C8434a() {
                    /* renamed from: b */
                    public final void mo15709b() {
                    }

                    /* renamed from: a */
                    public final void mo15708a() {
                        C8602s.m24873c(C9572h.this.f23536a);
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
    public final boolean mo63245a(String str, byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            if (bArr.length <= 0) {
                return false;
            }
            if (C8602s.m24868a(bArr, new File(this.f23536a + "/" + SameMD5.getMD5(C8557ad.m24739a(str)) + ".html"))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final String mo63244a(String str) {
        try {
            String str2 = this.f23536a + "/" + SameMD5.getMD5(C8557ad.m24739a(str)) + ".html";
            File file = new File(str2);
            if (!file.exists()) {
                return null;
            }
            C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
            if (b != null && !TextUtils.isEmpty(b.mo15477ap())) {
                C8602s.m24868a(C2265b.m5116a(ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, C8602s.m24862a(file))).getBytes(), file);
            }
            return "file:////" + str2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo63246b(String str) {
        try {
            String md5 = SameMD5.getMD5(C8557ad.m24739a(str));
            File file = new File(this.f23536a + "/" + md5 + ".html");
            if (file.exists()) {
                return C8602s.m24862a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
