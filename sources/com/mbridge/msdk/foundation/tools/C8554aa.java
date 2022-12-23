package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.same.p300b.C8420c;
import com.mbridge.msdk.foundation.same.p300b.C8422e;
import com.mbridge.msdk.foundation.tools.FastKV;

/* renamed from: com.mbridge.msdk.foundation.tools.aa */
/* compiled from: SharedPreferencesUtils */
public final class C8554aa {

    /* renamed from: a */
    static FastKV f20699a;

    /* renamed from: a */
    public static void m24732a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context != null) {
            if (C2358b.m5644a().mo15829d() && f20699a == null) {
                try {
                    f20699a = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "share_date").build();
                } catch (Exception unused) {
                    f20699a = null;
                }
            }
            if (f20699a != null) {
                try {
                    if ("String".equals(simpleName)) {
                        f20699a.putString(str, (String) obj);
                    } else if ("Integer".equals(simpleName)) {
                        f20699a.putInt(str, ((Integer) obj).intValue());
                    } else if ("Boolean".equals(simpleName)) {
                        f20699a.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if ("Float".equals(simpleName)) {
                        f20699a.putFloat(str, ((Float) obj).floatValue());
                    } else if ("Long".equals(simpleName)) {
                        f20699a.putLong(str, ((Long) obj).longValue());
                    }
                } catch (Exception unused2) {
                }
            } else {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
                if ("String".equals(simpleName)) {
                    edit.putString(str, (String) obj);
                } else if ("Integer".equals(simpleName)) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if ("Boolean".equals(simpleName)) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if ("Float".equals(simpleName)) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if ("Long".equals(simpleName)) {
                    edit.putLong(str, ((Long) obj).longValue());
                }
                edit.apply();
            }
        }
    }

    /* renamed from: b */
    public static Object m24733b(Context context, String str, Object obj) {
        if (context == null) {
            return obj;
        }
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
        if (C2358b.m5644a().mo15829d() && f20699a == null) {
            try {
                f20699a = new FastKV.Builder(C8422e.m24335b(C8420c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                f20699a = null;
            }
        }
        if (f20699a != null) {
            try {
                if ("String".equals(simpleName)) {
                    return f20699a.getString(str, (String) obj);
                }
                if ("Integer".equals(simpleName)) {
                    return Integer.valueOf(f20699a.getInt(str, ((Integer) obj).intValue()));
                }
                if ("Boolean".equals(simpleName)) {
                    return Boolean.valueOf(f20699a.getBoolean(str, ((Boolean) obj).booleanValue()));
                }
                if ("Float".equals(simpleName)) {
                    return Float.valueOf(f20699a.getFloat(str, ((Float) obj).floatValue()));
                }
                if ("Long".equals(simpleName)) {
                    return Long.valueOf(f20699a.getLong(str, ((Long) obj).longValue()));
                }
            } catch (Exception unused2) {
                return obj;
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
            if ("String".equals(simpleName)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(simpleName)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(simpleName)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(simpleName)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(simpleName)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }
}
