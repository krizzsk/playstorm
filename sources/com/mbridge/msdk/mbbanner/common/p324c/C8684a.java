package com.mbridge.msdk.mbbanner.common.p324c;

import android.content.Context;
import android.os.Handler;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.mbbanner.common.p322a.C8667b;
import com.mbridge.msdk.mbbanner.common.p322a.C8668c;
import com.mbridge.msdk.mbbanner.common.p323b.C8671b;
import com.mbridge.msdk.mbbanner.common.p323b.C8673d;
import com.mbridge.msdk.mbbanner.common.util.C8710a;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.a */
/* compiled from: BannerLoadManager */
public class C8684a {

    /* renamed from: a */
    private static final String f21035a = C8684a.class.getSimpleName();

    /* renamed from: h */
    private static volatile C8684a f21036h;

    /* renamed from: b */
    private Context f21037b = C2350a.m5601e().mo15792g();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8710a f21038c = new C8710a();

    /* renamed from: d */
    private Map<String, C8668c> f21039d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Map<String, Boolean> f21040e = new ConcurrentHashMap();

    /* renamed from: f */
    private Map<String, Handler> f21041f = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Map<String, Integer> f21042g = new ConcurrentHashMap();

    /* renamed from: a */
    public static C8684a m25209a() {
        if (f21036h == null) {
            synchronized (C8684a.class) {
                if (f21036h == null) {
                    f21036h = new C8684a();
                }
            }
        }
        return f21036h;
    }

    private C8684a() {
    }

    /* renamed from: a */
    public final void mo58016a(String str, String str2, final C8667b bVar, C8671b bVar2) {
        C8668c cVar;
        if (this.f21037b == null) {
            this.f21038c.mo58046a(bVar2, "Banner Context == null!", str2);
        } else if (bVar == null || bVar2 == null) {
            this.f21038c.mo58046a(bVar2, "Banner request parameters or callback empty!", str2);
        } else {
            synchronized (m25209a()) {
                if (this.f21040e == null || !this.f21040e.containsKey(str2) || !this.f21040e.get(str2).booleanValue()) {
                    this.f21040e.put(str2, true);
                    if (this.f21039d.containsKey(str2)) {
                        cVar = this.f21039d.get(str2);
                    } else {
                        C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), str2);
                        if (e == null) {
                            e = C2294d.m5325d(str2);
                        }
                        C8668c cVar2 = new C8668c(str2, "", 0, e.mo15608u() * 1);
                        this.f21039d.put(str2, cVar2);
                        cVar = cVar2;
                    }
                    new C8687b(this.f21037b, cVar, bVar2, this.f21038c).mo58021a(str, str2, bVar, (C8673d) new C8673d() {
                        /* renamed from: a */
                        public final void mo57994a(String str) {
                            synchronized (C8684a.m25209a()) {
                                bVar.mo57977a("");
                                C8684a.this.f21040e.put(str, false);
                            }
                        }
                    });
                    return;
                }
                this.f21038c.mo58046a(bVar2, "Current unit is loading!", str2);
            }
        }
    }

    /* renamed from: b */
    public final void mo58018b(String str, String str2, C8667b bVar, C8671b bVar2) {
        Handler handler;
        if (bVar != null && bVar.mo57978b() > 0) {
            if (this.f21041f.containsKey(str2)) {
                handler = this.f21041f.get(str2);
            } else {
                handler = new Handler();
                this.f21041f.put(str2, handler);
            }
            final String str3 = str2;
            final C8671b bVar3 = bVar2;
            final String str4 = str;
            final C8667b bVar4 = bVar;
            C86862 r1 = new Runnable() {
                public final void run() {
                    int intValue;
                    if (C8684a.this.f21040e != null && C8684a.this.f21040e.containsKey(str3) && ((Boolean) C8684a.this.f21040e.get(str3)).booleanValue()) {
                        return;
                    }
                    if (!C8684a.this.f21042g.containsKey(str3) || !((intValue = ((Integer) C8684a.this.f21042g.get(str3)).intValue()) == 2 || intValue == 4)) {
                        C8684a.this.mo58016a(str4, str3, bVar4, bVar3);
                    } else if (C8684a.this.f21038c != null) {
                        C8684a.this.f21038c.mo58046a(bVar3, "banner load failed because env is exception", str3);
                    }
                }
            };
            handler.removeCallbacksAndMessages((Object) null);
            handler.postDelayed(r1, (long) bVar.mo57978b());
        }
    }

    /* renamed from: a */
    public final void mo58015a(String str) {
        if (this.f21041f.containsKey(str)) {
            this.f21041f.get(str).removeCallbacksAndMessages((Object) null);
            this.f21041f.remove(str);
        }
    }

    /* renamed from: a */
    public final void mo58014a(int i, String str, String str2, C8667b bVar, C8671b bVar2) {
        int intValue = this.f21042g.containsKey(str2) ? this.f21042g.get(str2).intValue() : 0;
        if (i == 1) {
            if (this.f21041f.containsKey(str2)) {
                this.f21041f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f21042g.put(str2, Integer.valueOf(i));
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    if (intValue == 0) {
                        this.f21042g.put(str2, 0);
                        return;
                    }
                    if (this.f21041f.containsKey(str2)) {
                        this.f21041f.get(str2).removeCallbacksAndMessages((Object) null);
                    }
                    this.f21042g.put(str2, Integer.valueOf(i));
                }
            } else if (intValue == 2 || intValue == 4) {
                this.f21042g.put(str2, 1);
                mo58018b(str, str2, bVar, bVar2);
            }
        } else if (intValue == 1) {
            if (this.f21041f.containsKey(str2)) {
                this.f21041f.get(str2).removeCallbacksAndMessages((Object) null);
            }
            this.f21042g.put(str2, Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo58017b() {
        Map<String, C8668c> map = this.f21039d;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f21040e;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f21041f;
        if (map3 != null) {
            for (Map.Entry next : map3.entrySet()) {
                if (next.getValue() != null) {
                    ((Handler) next.getValue()).removeCallbacksAndMessages((Object) null);
                }
            }
            this.f21041f.clear();
        }
        Map<String, Integer> map4 = this.f21042g;
        if (map4 != null) {
            map4.clear();
        }
    }
}
