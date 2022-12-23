package com.com.bytedance.overseas.sdk.p186a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.p130b.C3156e;
import com.bytedance.sdk.openadsdk.p130b.C3177p;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.Map;

/* renamed from: com.com.bytedance.overseas.sdk.a.a */
/* compiled from: AndroidRGPDownLoader */
class C4024a extends C4025b {
    public C4024a(Context context, C3498n nVar, String str) {
        super(context, nVar, str);
    }

    /* renamed from: a */
    public boolean mo20929a() {
        Intent a;
        if ((this.f10281b != null && this.f10281b.mo19675as() == 0) || this.f10280a == null) {
            return false;
        }
        try {
            String c = this.f10280a.mo19498c();
            if (TextUtils.isEmpty(c) || (a = C4014u.m13179a(mo20933c(), c)) == null) {
                return false;
            }
            a.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(mo20933c() instanceof Activity)) {
                a.addFlags(268435456);
            }
            mo20933c().startActivity(a);
            C3156e.m9200d(mo20933c(), this.f10281b, this.f10282c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo20930b() {
        if (this.f10281b.mo19658ab() == null) {
            return false;
        }
        try {
            String a = this.f10281b.mo19658ab().mo19534a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(a);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!(mo20933c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C3156e.m9200d(C3578m.m11231a(), this.f10281b, this.f10282c, "open_url_app", (Map<String, Object>) null);
                mo20933c().startActivity(intent);
                C3177p.m9301a().mo18797a(this.f10281b, this.f10282c);
                return true;
            }
        } catch (Throwable unused) {
        }
        if (this.f10283d && !this.f10284e.get()) {
            return false;
        }
        this.f10283d = true;
        C3156e.m9200d(mo20933c(), this.f10281b, this.f10282c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }
}
