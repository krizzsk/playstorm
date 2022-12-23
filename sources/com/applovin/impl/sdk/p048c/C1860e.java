package com.applovin.impl.sdk.p048c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.Utils;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.c.e */
public final class C1860e {

    /* renamed from: a */
    private static C1959m f3368a;

    /* renamed from: b */
    private static SharedPreferences f3369b;

    /* renamed from: c */
    private final SharedPreferences f3370c;

    public C1860e(C1959m mVar) {
        this.f3370c = mVar.mo14297L().getSharedPreferences("com.applovin.sdk.preferences." + mVar.mo14374z(), 0);
        if (!mVar.mo14352e()) {
            f3368a = mVar;
        }
    }

    /* renamed from: a */
    private static SharedPreferences m4041a(Context context) {
        if (f3369b == null) {
            f3369b = context.getSharedPreferences("com.applovin.sdk.shared", 0);
        }
        return f3369b;
    }

    /* renamed from: a */
    public static <T> T m4042a(String str, T t, Class cls, SharedPreferences sharedPreferences) {
        T t2;
        long j;
        int i;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (sharedPreferences.contains(str)) {
                if (Boolean.class.equals(cls)) {
                    t2 = Boolean.valueOf(t != null ? sharedPreferences.getBoolean(str, ((Boolean) t).booleanValue()) : sharedPreferences.getBoolean(str, false));
                } else if (Float.class.equals(cls)) {
                    t2 = Float.valueOf(t != null ? sharedPreferences.getFloat(str, ((Float) t).floatValue()) : sharedPreferences.getFloat(str, 0.0f));
                } else if (Integer.class.equals(cls)) {
                    if (t != null) {
                        i = sharedPreferences.getInt(str, t.getClass().equals(Long.class) ? ((Long) t).intValue() : ((Integer) t).intValue());
                    } else {
                        i = sharedPreferences.getInt(str, 0);
                    }
                    t2 = Integer.valueOf(i);
                } else if (Long.class.equals(cls)) {
                    if (t != null) {
                        j = sharedPreferences.getLong(str, t.getClass().equals(Integer.class) ? ((Integer) t).longValue() : ((Long) t).longValue());
                    } else {
                        j = sharedPreferences.getLong(str, 0);
                    }
                    t2 = Long.valueOf(j);
                } else if (Double.class.equals(cls)) {
                    t2 = Double.valueOf(t != null ? Double.longBitsToDouble(sharedPreferences.getLong(str, Double.doubleToRawLongBits(((Double) t).doubleValue()))) : Double.longBitsToDouble(sharedPreferences.getLong(str, 0)));
                } else {
                    t2 = String.class.equals(cls) ? sharedPreferences.getString(str, (String) t) : Set.class.isAssignableFrom(cls) ? sharedPreferences.getStringSet(str, (Set) t) : t;
                }
                if (t2 != null) {
                    return cls.cast(t2);
                }
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return t;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t;
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("SharedPreferencesManager", "Error getting value for key: " + str, th);
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: a */
    private static void m4043a(final SharedPreferences.Editor editor) {
        try {
            if (f3368a != null && ((Boolean) f3368a.mo14311a(C1857b.f3289eJ)).booleanValue()) {
                if (!Utils.isMainThread()) {
                    editor.commit();
                    return;
                } else if (f3368a.mo14303S() != null) {
                    f3368a.mo14303S().mo14206a((C1877a) new C1934z(f3368a, new Runnable() {
                        public void run() {
                            editor.commit();
                        }
                    }), C1908o.C1910a.BACKGROUND);
                    return;
                }
            }
            editor.apply();
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                C2092v.m5049c("SharedPreferencesManager", "Unable to apply changes", th);
            }
        }
    }

    /* renamed from: a */
    public static <T> void m4044a(C1859d<T> dVar, T t, Context context) {
        m4045a(dVar.mo14070a(), t, m4041a(context), (SharedPreferences.Editor) null);
    }

    /* renamed from: a */
    public static <T> void m4045a(String str, T t, SharedPreferences sharedPreferences, SharedPreferences.Editor editor) {
        long doubleToRawLongBits;
        boolean z = true;
        boolean z2 = editor != null;
        if (!z2) {
            editor = sharedPreferences.edit();
        }
        if (t == null) {
            editor.remove(str);
        } else if (t instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t).booleanValue());
        } else if (t instanceof Float) {
            editor.putFloat(str, ((Float) t).floatValue());
        } else if (t instanceof Integer) {
            editor.putInt(str, ((Integer) t).intValue());
        } else {
            if (t instanceof Long) {
                doubleToRawLongBits = ((Long) t).longValue();
            } else if (t instanceof Double) {
                doubleToRawLongBits = Double.doubleToRawLongBits(((Double) t).doubleValue());
            } else if (t instanceof String) {
                editor.putString(str, (String) t);
            } else if (t instanceof Set) {
                editor.putStringSet(str, (Set) t);
            } else {
                if (C2092v.m5047a()) {
                    C2092v.m5053i("SharedPreferencesManager", "Unable to put default value of invalid type: " + t);
                }
                z = false;
            }
            editor.putLong(str, doubleToRawLongBits);
        }
        if (z && !z2) {
            m4043a(editor);
        }
    }

    /* renamed from: b */
    public static <T> T m4046b(C1859d<T> dVar, T t, Context context) {
        return m4042a(dVar.mo14070a(), t, (Class) dVar.mo14071b(), m4041a(context));
    }

    /* renamed from: a */
    public void mo14073a(SharedPreferences sharedPreferences) {
        m4043a(sharedPreferences.edit().clear());
    }

    /* renamed from: a */
    public <T> void mo14074a(C1859d<T> dVar) {
        m4043a(this.f3370c.edit().remove(dVar.mo14070a()));
    }

    /* renamed from: a */
    public <T> void mo14075a(C1859d<T> dVar, T t) {
        mo14076a(dVar, t, this.f3370c);
    }

    /* renamed from: a */
    public <T> void mo14076a(C1859d<T> dVar, T t, SharedPreferences sharedPreferences) {
        mo14078a(dVar.mo14070a(), t, sharedPreferences);
    }

    /* renamed from: a */
    public <T> void mo14077a(String str, T t, SharedPreferences.Editor editor) {
        m4045a(str, t, (SharedPreferences) null, editor);
    }

    /* renamed from: a */
    public <T> void mo14078a(String str, T t, SharedPreferences sharedPreferences) {
        m4045a(str, t, sharedPreferences, (SharedPreferences.Editor) null);
    }

    /* renamed from: b */
    public <T> T mo14079b(C1859d<T> dVar, T t) {
        return mo14080b(dVar, t, this.f3370c);
    }

    /* renamed from: b */
    public <T> T mo14080b(C1859d<T> dVar, T t, SharedPreferences sharedPreferences) {
        return m4042a(dVar.mo14070a(), t, (Class) dVar.mo14071b(), sharedPreferences);
    }
}
