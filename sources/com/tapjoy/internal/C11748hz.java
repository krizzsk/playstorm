package com.tapjoy.internal;

import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.hz */
public final class C11748hz {
    /* renamed from: a */
    public static String m34135a(C11606fc fcVar) {
        C11443bb b = new C11443bb().mo72199c().mo72193a("sdk").mo72198b(fcVar.f28133t).mo72193a("os_name").mo72198b(fcVar.f28124k).mo72193a("os_ver").mo72198b(fcVar.f28125l).mo72193a("device_id").mo72198b(fcVar.f28121h).mo72193a("device_maker").mo72198b(fcVar.f28122i).mo72193a("device_model").mo72198b(fcVar.f28123j).mo72193a(TapjoyConstants.TJC_PACKAGE_ID).mo72198b(fcVar.f28131r).mo72193a(TapjoyConstants.TJC_PACKAGE_SIGN).mo72198b(fcVar.f28132s).mo72193a("locale").mo72198b(fcVar.f28129p).mo72193a(TapjoyConstants.TJC_DEVICE_TIMEZONE).mo72198b(fcVar.f28130q);
        if (fcVar.f28126m != null) {
            b.mo72193a(TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY).mo72192a((Number) fcVar.f28126m);
        }
        if (fcVar.f28127n != null) {
            b.mo72193a(TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH).mo72192a((Number) fcVar.f28127n);
        }
        if (fcVar.f28128o != null) {
            b.mo72193a(TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT).mo72192a((Number) fcVar.f28128o);
        }
        if (fcVar.f28120g != null) {
            b.mo72193a("mac").mo72198b(fcVar.f28120g);
        }
        if (fcVar.f28134u != null) {
            b.mo72193a(TapjoyConstants.TJC_DEVICE_COUNTRY_SIM).mo72198b(fcVar.f28134u);
        }
        if (fcVar.f28135v != null) {
            b.mo72193a("country_net").mo72198b(fcVar.f28135v);
        }
        if (fcVar.f28136w != null) {
            b.mo72193a("imei").mo72198b(fcVar.f28136w);
        }
        if (fcVar.f28137x != null) {
            b.mo72193a("android_id").mo72198b(fcVar.f28137x);
        }
        return b.mo72200d().toString();
    }

    /* renamed from: a */
    public static String m34131a(C11588ew ewVar) {
        C11443bb c = new C11443bb().mo72199c();
        if (ewVar.f28018e != null) {
            c.mo72193a(TapjoyConstants.TJC_PACKAGE_VERSION).mo72198b(ewVar.f28018e);
        }
        if (ewVar.f28019f != null) {
            c.mo72193a(TapjoyConstants.TJC_PACKAGE_REVISION).mo72192a((Number) ewVar.f28019f);
        }
        if (ewVar.f28020g != null) {
            c.mo72193a("data_ver").mo72198b(ewVar.f28020g);
        }
        if (ewVar.f28021h != null) {
            c.mo72193a(TapjoyConstants.TJC_INSTALLER).mo72198b(ewVar.f28021h);
        }
        if (ewVar.f28022i != null) {
            c.mo72193a("store").mo72198b(ewVar.f28022i);
        }
        return c.mo72200d().toString();
    }

    /* renamed from: a */
    public static String m34136a(C11627fj fjVar) {
        return m34137a(fjVar, (C11591ex) null);
    }

    /* renamed from: a */
    private static String m34137a(C11627fj fjVar, C11591ex exVar) {
        String b;
        C11443bb c = new C11443bb().mo72199c();
        if (fjVar.f28252s != null) {
            c.mo72193a(TapjoyConstants.TJC_INSTALLED).mo72192a((Number) fjVar.f28252s);
        }
        if (fjVar.f28253t != null) {
            c.mo72193a("referrer").mo72198b(fjVar.f28253t);
        }
        if (fjVar.f28240G != null) {
            c.mo72193a("idfa").mo72198b(fjVar.f28240G);
            if (fjVar.f28241H != null && fjVar.f28241H.booleanValue()) {
                c.mo72193a("idfa_optout").mo72190a(1);
            }
        } else if (!(exVar == null || exVar.f28055r == null || !C11726hm.f28521a.equals(exVar.f28055r) || (b = C11745hx.m34126b()) == null)) {
            c.mo72193a("idfa").mo72198b(b);
            if (C11745hx.m34127c()) {
                c.mo72193a("idfa_optout").mo72190a(1);
            }
        }
        if (fjVar.f28254u != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY).mo72190a((long) Math.max(fjVar.f28254u.intValue(), 1));
        }
        if (fjVar.f28255v != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY).mo72190a((long) Math.max(fjVar.f28255v.intValue(), 1));
        }
        if (fjVar.f28256w.size() > 0) {
            ArrayList arrayList = new ArrayList(fjVar.f28256w.size());
            for (C11618fg next : fjVar.f28256w) {
                if (next.f28208h != null) {
                    arrayList.add(next.f28206f);
                }
            }
            if (!arrayList.isEmpty()) {
                c.mo72193a(Constants.PUSH).mo72189a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c.mo72198b((String) it.next());
                }
                c.mo72197b();
            }
        }
        c.mo72193a("session").mo72199c();
        if (fjVar.f28257x != null) {
            c.mo72193a("total_count").mo72192a((Number) fjVar.f28257x);
        }
        if (fjVar.f28258y != null) {
            c.mo72193a("total_length").mo72192a((Number) fjVar.f28258y);
        }
        if (fjVar.f28259z != null) {
            c.mo72193a("last_at").mo72192a((Number) fjVar.f28259z);
        }
        if (fjVar.f28234A != null) {
            c.mo72193a("last_length").mo72192a((Number) fjVar.f28234A);
        }
        c.mo72200d();
        c.mo72193a(FirebaseAnalytics.Event.PURCHASE).mo72199c();
        if (fjVar.f28235B != null) {
            c.mo72193a("currency").mo72198b(fjVar.f28235B);
        }
        if (fjVar.f28236C != null) {
            c.mo72193a("total_count").mo72192a((Number) fjVar.f28236C);
        }
        if (fjVar.f28237D != null) {
            c.mo72193a("total_price").mo72192a((Number) fjVar.f28237D);
        }
        if (fjVar.f28238E != null) {
            c.mo72193a("last_at").mo72192a((Number) fjVar.f28238E);
        }
        if (fjVar.f28239F != null) {
            c.mo72193a("last_price").mo72192a((Number) fjVar.f28239F);
        }
        c.mo72200d();
        if (fjVar.f28242I != null) {
            c.mo72193a("user_id").mo72198b(fjVar.f28242I);
        }
        if (fjVar.f28243J != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_LEVEL).mo72192a((Number) fjVar.f28243J);
        }
        if (fjVar.f28244K != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_FRIEND_COUNT).mo72192a((Number) fjVar.f28244K);
        }
        if (fjVar.f28245L != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_VARIABLE_1).mo72198b(fjVar.f28245L);
        }
        if (fjVar.f28246M != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_VARIABLE_2).mo72198b(fjVar.f28246M);
        }
        if (fjVar.f28247N != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_VARIABLE_3).mo72198b(fjVar.f28247N);
        }
        if (fjVar.f28248O != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_VARIABLE_4).mo72198b(fjVar.f28248O);
        }
        if (fjVar.f28249P != null) {
            c.mo72193a(TapjoyConstants.TJC_USER_VARIABLE_5).mo72198b(fjVar.f28249P);
        }
        if (fjVar.f28250Q.size() > 0) {
            c.mo72193a("tags").mo72194a((Collection) fjVar.f28250Q);
        }
        if (Boolean.TRUE.equals(fjVar.f28251R)) {
            c.mo72193a("push_optout").mo72190a(1);
        }
        return c.mo72200d().toString();
    }

    /* renamed from: a */
    private static String m34132a(C11591ex exVar, boolean z, boolean z2, boolean z3) {
        C11443bb b = new C11443bb().mo72199c().mo72193a("type").mo72198b(m34134a(exVar.f28051n)).mo72193a("name").mo72198b(exVar.f28052o);
        b.mo72193a("time");
        if (exVar.f28054q != null) {
            b.mo72192a((Number) exVar.f28053p);
            b.mo72193a("systime").mo72192a((Number) exVar.f28054q);
        } else if (!C11841u.m34411c() || exVar.f28055r == null || exVar.f28056s == null || !C11726hm.f28521a.equals(exVar.f28055r)) {
            b.mo72192a((Number) exVar.f28053p);
        } else {
            b.mo72190a(C11841u.m34407a(exVar.f28056s.longValue()));
            b.mo72193a("systime").mo72192a((Number) exVar.f28053p);
        }
        if (exVar.f28057t != null) {
            b.mo72193a("duration").mo72192a((Number) exVar.f28057t);
        }
        if (!z && exVar.f28058u != null) {
            b.mo72193a(TJAdUnitConstants.String.VIDEO_INFO).mo72191a((C11450bf) new C11451bg(m34135a(exVar.f28058u)));
        }
        if (!z2 && exVar.f28059v != null) {
            b.mo72193a(TapjoyConstants.TJC_APP_PLACEMENT).mo72191a((C11450bf) new C11451bg(m34131a(exVar.f28059v)));
        }
        if (!z3 && exVar.f28060w != null) {
            b.mo72193a("user").mo72191a((C11450bf) new C11451bg(m34137a(exVar.f28060w, exVar)));
        }
        if (exVar.f28062y != null) {
            b.mo72193a("event_seq").mo72192a((Number) exVar.f28062y);
        }
        if (exVar.f28063z != null) {
            C11443bb a = b.mo72193a("event_prev");
            C11597ez ezVar = exVar.f28063z;
            C11443bb b2 = new C11443bb().mo72199c().mo72193a("type").mo72198b(m34134a(ezVar.f28094e)).mo72193a("name").mo72198b(ezVar.f28095f);
            if (ezVar.f28096g != null) {
                b2.mo72193a("category").mo72198b(ezVar.f28096g);
            }
            a.mo72191a((C11450bf) new C11451bg(b2.mo72200d().toString()));
        }
        if (exVar.f28039A != null) {
            C11443bb a2 = b.mo72193a(FirebaseAnalytics.Event.PURCHASE);
            C11615ff ffVar = exVar.f28039A;
            C11443bb b3 = new C11443bb().mo72199c().mo72193a("product_id").mo72198b(ffVar.f28175h);
            if (ffVar.f28176i != null) {
                b3.mo72193a("product_quantity").mo72192a((Number) ffVar.f28176i);
            }
            if (ffVar.f28177j != null) {
                b3.mo72193a("product_price").mo72192a((Number) ffVar.f28177j);
            }
            if (ffVar.f28178k != null) {
                b3.mo72193a("product_price_currency").mo72198b(ffVar.f28178k);
            }
            if (ffVar.f28186s != null) {
                b3.mo72193a("currency_price").mo72198b(ffVar.f28186s);
            }
            if (ffVar.f28179l != null) {
                b3.mo72193a("product_type").mo72198b(ffVar.f28179l);
            }
            if (ffVar.f28180m != null) {
                b3.mo72193a("product_title").mo72198b(ffVar.f28180m);
            }
            if (ffVar.f28181n != null) {
                b3.mo72193a("product_description").mo72198b(ffVar.f28181n);
            }
            if (ffVar.f28182o != null) {
                b3.mo72193a("transaction_id").mo72198b(ffVar.f28182o);
            }
            if (ffVar.f28183p != null) {
                b3.mo72193a("transaction_state").mo72192a((Number) ffVar.f28183p);
            }
            if (ffVar.f28184q != null) {
                b3.mo72193a("transaction_date").mo72192a((Number) ffVar.f28184q);
            }
            if (ffVar.f28185r != null) {
                b3.mo72193a("campaign_id").mo72198b(ffVar.f28185r);
            }
            if (ffVar.f28187t != null) {
                b3.mo72193a("receipt").mo72198b(ffVar.f28187t);
            }
            if (ffVar.f28188u != null) {
                b3.mo72193a(InAppPurchaseMetaData.KEY_SIGNATURE).mo72198b(ffVar.f28188u);
            }
            a2.mo72191a((C11450bf) new C11451bg(b3.mo72200d().toString()));
        }
        if (exVar.f28040B != null) {
            b.mo72193a("exception").mo72198b(exVar.f28040B);
        }
        try {
            if (exVar.f28042D != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (exVar.f28041C != null) {
                    C11452bh.m33266b(exVar.f28041C).mo72210a((Map) linkedHashMap);
                }
                C11612fe feVar = exVar.f28042D;
                if (feVar.f28164d != null) {
                    linkedHashMap.put("fq7_change", feVar.f28164d);
                }
                if (feVar.f28165e != null) {
                    linkedHashMap.put("fq30_change", feVar.f28165e);
                }
                if (feVar.f28166f != null) {
                    linkedHashMap.put(TJAdUnitConstants.PARAM_PUSH_ID, feVar.f28166f);
                }
                b.mo72193a("meta").mo72195a((Map) linkedHashMap);
            } else if (exVar.f28041C != null) {
                b.mo72193a("meta").mo72191a((C11450bf) new C11451bg(exVar.f28041C));
            }
        } catch (IOException unused) {
        }
        if (exVar.f28047I != null) {
            b.mo72193a(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS).mo72191a((C11450bf) new C11451bg(exVar.f28047I));
        }
        if (exVar.f28048J != null) {
            b.mo72193a("count").mo72192a((Number) exVar.f28048J);
        }
        if (exVar.f28049K != null) {
            b.mo72193a("first_time").mo72192a((Number) exVar.f28049K);
        }
        if (exVar.f28050L != null) {
            b.mo72193a("last_time").mo72192a((Number) exVar.f28050L);
        }
        if (exVar.f28043E != null) {
            b.mo72193a("category").mo72198b(exVar.f28043E);
        }
        if (exVar.f28044F != null) {
            b.mo72193a("p1").mo72198b(exVar.f28044F);
        }
        if (exVar.f28045G != null) {
            b.mo72193a("p2").mo72198b(exVar.f28045G);
        }
        if (exVar.f28046H.size() > 0) {
            b.mo72193a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES).mo72199c();
            for (C11603fb next : exVar.f28046H) {
                b.mo72193a(next.f28112e).mo72192a((Number) next.f28113f);
            }
            b.mo72200d();
        }
        return b.mo72200d().toString();
    }

    /* renamed from: a */
    public static String m34133a(C11594ey eyVar) {
        boolean z;
        boolean z2;
        C11443bb a = new C11443bb().mo72189a();
        C11606fc fcVar = null;
        C11588ew ewVar = null;
        C11627fj fjVar = null;
        for (C11591ex next : eyVar.f28090d) {
            boolean z3 = true;
            if (fcVar == null || !fcVar.equals(next.f28058u)) {
                fcVar = next.f28058u;
                z = false;
            } else {
                z = true;
            }
            if (ewVar == null || !ewVar.equals(next.f28059v)) {
                ewVar = next.f28059v;
                z2 = false;
            } else {
                z2 = true;
            }
            if (fjVar == null || !fjVar.equals(next.f28060w)) {
                fjVar = next.f28060w;
                z3 = false;
            }
            a.mo72191a((C11450bf) new C11451bg(m34132a(next, z, z2, z3)));
        }
        return a.mo72197b().toString();
    }

    /* renamed from: com.tapjoy.internal.hz$1 */
    static /* synthetic */ class C117491 {

        /* renamed from: a */
        static final /* synthetic */ int[] f28615a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tapjoy.internal.fa[] r0 = com.tapjoy.internal.C11601fa.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28615a = r0
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11601fa.APP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28615a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11601fa.CAMPAIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28615a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11601fa.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28615a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11601fa.USAGES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11748hz.C117491.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m34134a(C11601fa faVar) {
        int i = C117491.f28615a[faVar.ordinal()];
        if (i == 1) {
            return TapjoyConstants.TJC_APP_PLACEMENT;
        }
        if (i == 2) {
            return "campaign";
        }
        if (i == 3) {
            return "custom";
        }
        if (i == 4) {
            return "usages";
        }
        throw new RuntimeException();
    }
}
