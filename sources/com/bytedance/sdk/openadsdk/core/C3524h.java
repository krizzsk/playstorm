package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2534a;
import com.bytedance.sdk.component.utils.C2962d;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2985u;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3445a;
import com.bytedance.sdk.openadsdk.core.video.p163b.C3669c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.multipro.p185d.C3966a;
import com.bytedance.sdk.openadsdk.utils.C3972a;
import com.bytedance.sdk.openadsdk.utils.C3994f;
import com.bytedance.sdk.openadsdk.utils.C4014u;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.h */
/* compiled from: GlobalInfo */
public class C3524h {

    /* renamed from: a */
    public static TTAdSdk.InitCallback f8730a;

    /* renamed from: b */
    public static final Set<String> f8731b = new HashSet<String>() {
        {
            add("8025677");
            add("5001121");
        }
    };

    /* renamed from: u */
    private static final C3524h f8732u = new C3524h();

    /* renamed from: c */
    private String f8733c;

    /* renamed from: d */
    private String f8734d;

    /* renamed from: e */
    private int f8735e;

    /* renamed from: f */
    private boolean f8736f;

    /* renamed from: g */
    private String f8737g;

    /* renamed from: h */
    private String f8738h;

    /* renamed from: i */
    private AtomicBoolean f8739i = new AtomicBoolean(false);

    /* renamed from: j */
    private int f8740j = 0;

    /* renamed from: k */
    private boolean f8741k = true;

    /* renamed from: l */
    private final Set<Integer> f8742l = Collections.synchronizedSet(new HashSet());

    /* renamed from: m */
    private boolean f8743m = false;

    /* renamed from: n */
    private Bitmap f8744n = null;

    /* renamed from: o */
    private C3972a f8745o = new C3972a();

    /* renamed from: p */
    private String[] f8746p;

    /* renamed from: q */
    private int f8747q = 0;

    /* renamed from: r */
    private int f8748r = 0;

    /* renamed from: s */
    private boolean f8749s = false;

    /* renamed from: t */
    private String f8750t;

    /* renamed from: v */
    private C3669c f8751v;

    /* renamed from: w */
    private volatile ConcurrentHashMap<String, C3445a.C3452a> f8752w = null;

    /* renamed from: a */
    public static void m10850a(TTAdSdk.InitCallback initCallback) {
        f8730a = initCallback;
    }

    /* renamed from: a */
    public boolean mo19838a() {
        return this.f8745o.mo20887a();
    }

    /* renamed from: b */
    public boolean mo19842b() {
        return this.f8749s;
    }

    /* renamed from: c */
    public C3972a mo19843c() {
        return this.f8745o;
    }

    private C3524h() {
        try {
            C2534a.m6425a(C3578m.m11231a());
            this.f8742l.add(4);
            Context a = C3578m.m11231a();
            if (a instanceof Application) {
                ((Application) a).registerActivityLifecycleCallbacks(this.f8745o);
            } else if (a != null && a.getApplicationContext() != null) {
                ((Application) a.getApplicationContext()).registerActivityLifecycleCallbacks(this.f8745o);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static C3524h m10852d() {
        return f8732u;
    }

    /* renamed from: e */
    public boolean mo19853e() {
        if (C3953b.m12901c()) {
            return C3966a.m12974a("sp_global_info", "sdk_activate_init", true);
        }
        return C2985u.m8442a((String) null, C3578m.m11231a()).mo17912b("sdk_activate_init", true);
    }

    /* renamed from: a */
    public void mo19836a(boolean z) {
        this.f8749s = z;
    }

    /* renamed from: b */
    public void mo19841b(boolean z) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("sp_global_info", "sdk_activate_init", Boolean.valueOf(z));
        }
        C2985u.m8442a((String) null, C3578m.m11231a()).mo17905a("sdk_activate_init", z);
    }

    /* renamed from: f */
    public String mo19854f() {
        if (C3953b.m12901c()) {
            return C3966a.m12977b("sp_global_info", "app_id", (String) null);
        }
        return this.f8733c;
    }

    /* renamed from: a */
    public void mo19834a(String str) {
        m10853g(str);
        if (C3953b.m12901c()) {
            C3966a.m12971a("sp_global_info", "app_id", str);
        }
        this.f8733c = str;
    }

    /* renamed from: g */
    public String mo19857g() {
        if (C3953b.m12901c()) {
            return C3966a.m12977b("sp_global_info", "name", (String) null);
        }
        return this.f8734d;
    }

    /* renamed from: b */
    public void mo19840b(String str) {
        m10854h(str);
        if (C3953b.m12901c()) {
            C3966a.m12971a("sp_global_info", "name", str);
        }
        this.f8734d = str;
    }

    /* renamed from: a */
    public void mo19833a(int i) {
        if (C3953b.m12901c()) {
            C3966a.m12969a("sp_global_info", "icon_id", Integer.valueOf(i));
        }
        this.f8735e = i;
    }

    /* renamed from: h */
    public int mo19858h() {
        if (C3953b.m12901c()) {
            return C3966a.m12962a("sp_global_info", "icon_id", 0);
        }
        return this.f8735e;
    }

    /* renamed from: b */
    public void mo19839b(int i) {
        if (i == 0 || i == 1 || i == -1) {
            if (C3953b.m12901c()) {
                C3966a.m12969a("sp_global_info", "sdk_coppa", Integer.valueOf(i));
            } else {
                C2985u.m8442a((String) null, C3578m.m11231a()).mo17901a("sdk_coppa", i);
            }
            this.f8747q = i;
        }
    }

    /* renamed from: i */
    public int mo19859i() {
        if (C3953b.m12901c()) {
            return C3966a.m12962a("sp_global_info", "sdk_coppa", -1);
        }
        int b = C2985u.m8442a((String) null, C3578m.m11231a()).mo17908b("sdk_coppa", -1);
        this.f8747q = b;
        return b;
    }

    /* renamed from: j */
    public int mo19860j() {
        if (C3953b.m12901c()) {
            return C3966a.m12962a("sp_global_info", "tt_gdpr", -1);
        }
        return C2985u.m8442a((String) null, C3578m.m11231a()).mo17908b("tt_gdpr", -1);
    }

    /* renamed from: c */
    public void mo19844c(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C3953b.m12901c()) {
            C3966a.m12969a("sp_global_info", "tt_gdpr", Integer.valueOf(i));
        } else {
            C2985u.m8442a((String) null, C3578m.m11231a()).mo17901a("tt_gdpr", i);
        }
    }

    /* renamed from: d */
    public void mo19847d(int i) {
        if (!(i == 0 || i == 1)) {
            i = -99;
        }
        if (C3953b.m12901c()) {
            C3966a.m12969a("sp_global_info", "global_coppa", Integer.valueOf(i));
        } else {
            C2985u.m8442a((String) null, C3578m.m11231a()).mo17901a("global_coppa", i);
        }
        this.f8748r = i;
    }

    /* renamed from: k */
    public int mo19861k() {
        if (C3953b.m12901c()) {
            this.f8748r = C3966a.m12962a("sp_global_info", "global_coppa", -99);
        } else {
            this.f8748r = C2985u.m8442a((String) null, C3578m.m11231a()).mo17908b("global_coppa", -99);
        }
        if (this.f8748r == -99) {
            this.f8748r = mo19859i();
        }
        return this.f8748r;
    }

    /* renamed from: l */
    public boolean mo19862l() {
        if (C3953b.m12901c()) {
            return C3966a.m12974a("sp_global_info", "is_paid", false);
        }
        return this.f8736f;
    }

    /* renamed from: c */
    public void mo19846c(boolean z) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("sp_global_info", "is_paid", Boolean.valueOf(z));
        }
        this.f8736f = z;
    }

    /* renamed from: m */
    public String mo19863m() {
        if (C3953b.m12901c()) {
            return C3966a.m12977b("sp_global_info", "keywords", (String) null);
        }
        return this.f8737g;
    }

    /* renamed from: c */
    public void mo19845c(String str) {
        m10855i(str);
        if (C3953b.m12901c()) {
            C3966a.m12971a("sp_global_info", "keywords", str);
        }
        this.f8737g = str;
    }

    /* renamed from: n */
    public String mo19864n() {
        if (C3953b.m12901c()) {
            return C3966a.m12977b("sp_global_info", "extra_data", (String) null);
        }
        return this.f8738h;
    }

    /* renamed from: d */
    public void mo19848d(String str) {
        m10856j(str);
        if (C3953b.m12901c()) {
            C3966a.m12971a("sp_global_info", "extra_data", str);
        }
        this.f8738h = str;
    }

    /* renamed from: e */
    public void mo19851e(int i) {
        if (C3953b.m12901c()) {
            C3966a.m12969a("sp_global_info", "title_bar_theme", Integer.valueOf(i));
        }
        this.f8740j = i;
    }

    /* renamed from: o */
    public int mo19865o() {
        if (C3953b.m12901c()) {
            return C3966a.m12962a("sp_global_info", "title_bar_theme", 0);
        }
        return this.f8740j;
    }

    /* renamed from: d */
    public void mo19849d(boolean z) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("sp_global_info", "allow_show_notify", Boolean.valueOf(z));
        }
        this.f8741k = z;
    }

    /* renamed from: g */
    private static void m10853g(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f8730a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "appid cannot be empty");
        }
        C2975l.m8391e("GlobalInfo", "appid cannot be empty");
    }

    /* renamed from: h */
    private static void m10854h(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f8730a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "name cannot be empty");
        }
        C2975l.m8391e("GlobalInfo", "name cannot be empty");
    }

    /* renamed from: i */
    private static void m10855i(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f8730a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "keyword is super long, the longest is 1000");
            }
            C2975l.m8391e("GlobalInfo", "keyword is super long, the longest is 1000");
        }
    }

    /* renamed from: j */
    private static void m10856j(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f8730a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "Data is very long, the longest is 1000");
            }
            C2975l.m8391e("GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    /* renamed from: p */
    public C3669c mo19866p() {
        if (this.f8751v == null) {
            this.f8751v = new C3669c(10, 8);
        }
        return this.f8751v;
    }

    /* renamed from: q */
    public boolean mo19867q() {
        if (C3953b.m12901c()) {
            return C3966a.m12974a("sp_global_info", "is_use_texture", false);
        }
        return this.f8743m;
    }

    /* renamed from: e */
    public void mo19852e(boolean z) {
        if (C3953b.m12901c()) {
            C3966a.m12967a("sp_global_info", "is_use_texture", Boolean.valueOf(z));
        }
        this.f8743m = z;
    }

    /* renamed from: r */
    public Bitmap mo19868r() {
        if (C3953b.m12901c()) {
            return C2962d.m8347a(C3966a.m12977b("sp_global_info", "pause_icon", (String) null));
        }
        return this.f8744n;
    }

    /* renamed from: a */
    public void mo19837a(String[] strArr) {
        if (C3953b.m12901c() && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i = i2;
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                C3966a.m12971a("sp_global_info", "need_clear_task_reset", sb2);
            }
        }
        this.f8746p = strArr;
    }

    /* renamed from: s */
    public boolean mo19869s() {
        return f8731b.contains(this.f8733c);
    }

    /* renamed from: t */
    public boolean mo19870t() {
        return "com.union_test.internationad".equals(C4014u.m13214d());
    }

    /* renamed from: u */
    public String mo19871u() {
        if (!TextUtils.isEmpty(this.f8750t)) {
            return this.f8750t;
        }
        String a = C3994f.m13098a();
        this.f8750t = a;
        if (!TextUtils.isEmpty(a)) {
            return this.f8750t;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        C3994f.m13099a(valueOf);
        this.f8750t = valueOf;
        return valueOf;
    }

    /* renamed from: k */
    private static JSONObject m10857k(String str) {
        String str2;
        if (C3953b.m12901c()) {
            str2 = C3966a.m12977b("sp_global_info", str, (String) null);
        } else {
            str2 = C2985u.m8442a((String) null, C3578m.m11231a()).mo17910b(str, (String) null);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m10851a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", str2);
                jSONObject.put("time", System.currentTimeMillis());
                if (C3953b.m12901c()) {
                    C3966a.m12971a("sp_global_info", str, jSONObject.toString());
                } else {
                    C2985u.m8442a((String) null, C3578m.m11231a()).mo17903a(str, jSONObject.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m10849a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject k = m10857k(str);
            if (k == null) {
                return null;
            }
            if (System.currentTimeMillis() - k.getLong("time") <= j) {
                return k.getString("value");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v */
    public int mo19872v() {
        if (C3953b.m12901c()) {
            return C3966a.m12962a("sp_global_info", "global_ccpa", -1);
        }
        return C2985u.m8442a((String) null, C3578m.m11231a()).mo17908b("global_ccpa", -1);
    }

    /* renamed from: f */
    public void mo19855f(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C3953b.m12901c()) {
            C3966a.m12969a("sp_global_info", "global_ccpa", Integer.valueOf(i));
        } else {
            C2985u.m8442a((String) null, C3578m.m11231a()).mo17901a("global_ccpa", i);
        }
    }

    /* renamed from: e */
    public C3445a.C3452a mo19850e(String str) {
        if (this.f8752w == null || str == null) {
            return null;
        }
        return this.f8752w.get(str);
    }

    /* renamed from: a */
    public void mo19835a(String str, C3445a.C3452a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (C3953b.m12901c()) {
                TTDislikeListView.m12413a(6, str, aVar);
                return;
            }
            if (this.f8752w == null) {
                synchronized (C3524h.class) {
                    if (this.f8752w == null) {
                        this.f8752w = new ConcurrentHashMap<>();
                    }
                }
            }
            this.f8752w.put(str, aVar);
        }
    }

    /* renamed from: f */
    public void mo19856f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C3953b.m12901c()) {
            TTDislikeListView.m12412a(6, str);
        } else if (this.f8752w != null) {
            this.f8752w.remove(str);
        }
    }

    /* renamed from: w */
    public void mo19873w() {
        if (this.f8752w != null && this.f8752w.size() == 0) {
            this.f8752w = null;
        }
    }
}
