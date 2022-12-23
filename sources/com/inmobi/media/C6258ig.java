package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.inmobi.media.ig */
/* compiled from: PublisherProvidedUserInfoDao */
public final class C6258ig {

    /* renamed from: a */
    private static int f15847a = Integer.MIN_VALUE;

    /* renamed from: b */
    private static boolean f15848b = false;

    /* renamed from: c */
    private static String f15849c = null;

    /* renamed from: d */
    private static String f15850d = null;

    /* renamed from: e */
    private static String f15851e = null;

    /* renamed from: f */
    private static String f15852f = null;

    /* renamed from: g */
    private static String f15853g = null;

    /* renamed from: h */
    private static String f15854h = null;

    /* renamed from: i */
    private static int f15855i = Integer.MIN_VALUE;

    /* renamed from: j */
    private static String f15856j;

    /* renamed from: k */
    private static String f15857k;

    /* renamed from: l */
    private static String f15858l;

    /* renamed from: m */
    private static String f15859m;

    /* renamed from: n */
    private static Location f15860n;

    /* renamed from: a */
    public static void m18681a() {
        m18682a(f15847a);
        m18684a(f15849c);
        m18688b(f15850d);
        m18691c(f15851e);
        m18693d(f15852f);
        m18695e(f15853g);
        m18697f(f15854h);
        m18687b(f15855i);
        m18699g(f15856j);
        m18701h(f15857k);
        m18703i(f15858l);
        m18705j(f15859m);
        m18683a(f15860n);
        m18694e();
        m18689b();
        m18696f();
        m18698g();
        m18700h();
        m18702i();
        m18704j();
        m18706k();
        m18707l();
        m18708m();
        m18709n();
        m18710o();
        m18711p();
        m18690c();
    }

    /* renamed from: a */
    public static void m18682a(int i) {
        Context c = C6227ho.m18551c();
        if (i != Integer.MIN_VALUE) {
            f15847a = i;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35414a("user_age", i);
            }
        }
    }

    /* renamed from: a */
    public static void m18685a(boolean z) {
        Context c = C6227ho.m18551c();
        f15848b = z;
        if (c != null) {
            C6216hf.m18493a(c, "user_info_store").mo35417a("user_age_restricted", z);
        }
    }

    /* renamed from: b */
    public static boolean m18689b() {
        Context c = C6227ho.m18551c();
        if (c != null) {
            f15848b = C6216hf.m18493a(c, "user_info_store").mo35420b("user_age_restricted", false);
        }
        return f15848b;
    }

    /* renamed from: e */
    private static int m18694e() {
        int i = f15847a;
        int i2 = Integer.MIN_VALUE;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        Context c = C6227ho.m18551c();
        if (c != null) {
            i2 = C6216hf.m18493a(c, "user_info_store").mo35421c("user_age");
        }
        f15847a = i2;
        return i2;
    }

    /* renamed from: a */
    public static void m18684a(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15849c = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_age_group", str);
            }
        }
    }

    /* renamed from: f */
    private static String m18696f() {
        String str;
        String str2 = f15849c;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_age_group");
        }
        f15849c = str;
        return str;
    }

    /* renamed from: b */
    public static void m18688b(String str) {
        Context c = C6227ho.m18551c();
        f15850d = str;
        if (c != null && str != null) {
            C6216hf.m18493a(c, "user_info_store").mo35416a("user_area_code", str);
        }
    }

    /* renamed from: g */
    private static String m18698g() {
        String str;
        String str2 = f15850d;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_area_code");
        }
        f15850d = str;
        return str;
    }

    /* renamed from: c */
    public static void m18691c(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15851e = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_post_code", str);
            }
        }
    }

    /* renamed from: h */
    private static String m18700h() {
        String str;
        String str2 = f15851e;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_post_code");
        }
        f15851e = str;
        return str;
    }

    /* renamed from: d */
    public static void m18693d(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15852f = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_city_code", str);
            }
        }
    }

    /* renamed from: i */
    private static String m18702i() {
        String str;
        String str2 = f15852f;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_city_code");
        }
        f15852f = str;
        return str;
    }

    /* renamed from: j */
    private static String m18704j() {
        String str;
        String str2 = f15853g;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_state_code");
        }
        f15853g = str;
        return str;
    }

    /* renamed from: e */
    public static void m18695e(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15853g = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_state_code", str);
            }
        }
    }

    /* renamed from: f */
    public static void m18697f(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15854h = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_country_code", str);
            }
        }
    }

    /* renamed from: k */
    private static String m18706k() {
        String str;
        String str2 = f15854h;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_country_code");
        }
        f15854h = str;
        return str;
    }

    /* renamed from: b */
    public static void m18687b(int i) {
        Context c = C6227ho.m18551c();
        if (i != Integer.MIN_VALUE) {
            f15855i = i;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35414a("user_yob", i);
            }
        }
    }

    /* renamed from: l */
    private static int m18707l() {
        int i = f15855i;
        int i2 = Integer.MIN_VALUE;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        Context c = C6227ho.m18551c();
        if (c != null) {
            i2 = C6216hf.m18493a(c, "user_info_store").mo35421c("user_yob");
        }
        f15855i = i2;
        return i2;
    }

    /* renamed from: g */
    public static void m18699g(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15856j = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, str);
            }
        }
    }

    /* renamed from: m */
    private static String m18708m() {
        String str;
        String str2 = f15856j;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b(AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
        }
        f15856j = str;
        return str;
    }

    /* renamed from: h */
    public static void m18701h(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15857k = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_education", str);
            }
        }
    }

    /* renamed from: n */
    private static String m18709n() {
        String str;
        String str2 = f15857k;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_education");
        }
        f15857k = str;
        return str;
    }

    /* renamed from: o */
    private static String m18710o() {
        String str;
        String str2 = f15858l;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_language");
        }
        f15858l = str;
        return str;
    }

    /* renamed from: i */
    public static void m18703i(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15858l = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_language", str);
            }
        }
    }

    /* renamed from: j */
    public static void m18705j(String str) {
        Context c = C6227ho.m18551c();
        if (str != null) {
            f15859m = str;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a("user_interest", str);
            }
        }
    }

    /* renamed from: p */
    private static String m18711p() {
        String str;
        String str2 = f15859m;
        if (str2 != null) {
            return str2;
        }
        Context c = C6227ho.m18551c();
        if (c == null) {
            str = null;
        } else {
            str = C6216hf.m18493a(c, "user_info_store").mo35419b("user_interest");
        }
        f15859m = str;
        return str;
    }

    /* renamed from: c */
    public static Location m18690c() {
        String b;
        Location location = f15860n;
        if (location != null) {
            return location;
        }
        Context c = C6227ho.m18551c();
        Location location2 = null;
        if (c == null || (b = C6216hf.m18493a(c, "user_info_store").mo35419b(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION)) == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] split = b.split(",");
            location3.setLatitude(Double.parseDouble(split[0]));
            location3.setLongitude(Double.parseDouble(split[1]));
            location3.setAccuracy(Float.parseFloat(split[2]));
            location3.setTime(Long.parseLong(split[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f15860n = location2;
        return location2;
    }

    /* renamed from: a */
    public static void m18683a(Location location) {
        Context c = C6227ho.m18551c();
        if (location != null) {
            f15860n = location;
            if (c != null) {
                C6216hf.m18493a(c, "user_info_store").mo35416a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, m18686b(location));
            }
        }
    }

    /* renamed from: d */
    public static HashMap<String, String> m18692d() {
        HashMap<String, String> hashMap = new HashMap<>();
        int e = m18694e();
        if (e > 0) {
            hashMap.put("u-age", String.valueOf(e));
        }
        int l = m18707l();
        if (l > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(l));
        }
        String i = m18702i();
        String j = m18704j();
        String k = m18706k();
        String trim = (i == null || i.trim().length() == 0) ? "" : i.trim();
        if (!(j == null || j.trim().length() == 0)) {
            trim = trim + "-" + j.trim();
        }
        if (!(k == null || k.trim().length() == 0)) {
            trim = trim + "-" + k.trim();
        }
        if (!(trim == null || trim.trim().length() == 0)) {
            hashMap.put("u-location", trim);
        }
        String f = m18696f();
        if (f != null) {
            hashMap.put("u-agegroup", f.toLowerCase(Locale.ENGLISH));
        }
        String g = m18698g();
        if (g != null) {
            hashMap.put("u-areacode", g);
        }
        String h = m18700h();
        if (h != null) {
            hashMap.put("u-postalcode", h);
        }
        String m = m18708m();
        if (m != null) {
            hashMap.put("u-gender", m);
        }
        String n = m18709n();
        if (n != null) {
            hashMap.put("u-education", n);
        }
        String o = m18710o();
        if (o != null) {
            hashMap.put("u-language", o);
        }
        String p = m18711p();
        if (p != null) {
            hashMap.put("u-interests", p);
        }
        hashMap.put("u-age-restricted", String.valueOf(m18689b() ? 1 : 0));
        return hashMap;
    }

    /* renamed from: b */
    private static String m18686b(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
