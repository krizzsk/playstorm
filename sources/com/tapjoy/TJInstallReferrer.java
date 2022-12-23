package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.tapjoy.internal.C11714hj;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TJInstallReferrer implements InvocationHandler {

    /* renamed from: a */
    private String f27406a = "Tapjoy";

    /* renamed from: b */
    private Object f27407b;

    /* renamed from: c */
    private Context f27408c;

    /* renamed from: d */
    private SharedPreferences f27409d;

    public void init(Context context) {
        this.f27408c = context.getApplicationContext();
        Object a = m33102a();
        this.f27407b = a;
        if (a == null) {
            Log.e(this.f27406a, "Failed to activate InstallReferrerClient. No available InstallReferrrerClient.");
            return;
        }
        Class b = m33107b();
        if (b == null) {
            Log.e(this.f27406a, "InstallReferrerClient setup failed. No available InstallReferrrerStateListener.");
            return;
        }
        Object a2 = m33103a(b);
        if (a2 == null) {
            Log.e(this.f27406a, "InstallReferrerClient setup failed. No available InstallReferrrerStateListener object.");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.tapjoy.referrer", 0);
        this.f27409d = sharedPreferences;
        if (!sharedPreferences.getBoolean("TJInstallReferrerDidSetUp", false)) {
            try {
                if (this.f27407b != null) {
                    Log.e(this.f27406a, "startConnection");
                    try {
                        m33105a(this.f27407b, "startConnection", new Class[]{b}, a2);
                    } catch (NoClassDefFoundError e) {
                        Log.e(this.f27406a, e.getMessage());
                    } catch (Exception e2) {
                        Log.e(this.f27406a, e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                Log.e(this.f27406a, e3.getMessage());
            }
        }
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        Context context;
        if (method == null) {
            Log.e(this.f27406a, "Failed to invoke null method");
            return null;
        }
        String name = method.getName();
        if (name == null) {
            Log.e(this.f27406a, "Failed to invoke null method name");
            return null;
        }
        if (objArr == null) {
            Log.e(this.f27406a, "Invoking method with null args");
            objArr = new Object[0];
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                Log.e(this.f27406a, "Invalid args");
                return null;
            }
            Object obj2 = objArr[0];
            if (!(obj2 instanceof Integer)) {
                Log.e(this.f27406a, "Invalid args type.");
                return null;
            }
            Integer num = (Integer) obj2;
            if (num == null) {
                Log.e(this.f27406a, "onInstallReferrerSetupFinished response code can't be null");
                return null;
            }
            int intValue = num.intValue();
            if (intValue == 0) {
                try {
                    SharedPreferences.Editor edit = this.f27409d.edit();
                    edit.putBoolean("TJInstallReferrerDidSetUp", true);
                    edit.apply();
                    Object c = m33108c();
                    if (c == null) {
                        edit.putBoolean("TJInstallReferrerDidSetUp", false);
                        Log.e(this.f27406a, "Failed to get ReferrerDetails instance.");
                    } else {
                        String a = m33106a(c);
                        C11714hj.m33999a();
                        C11714hj.m34001a(this.f27408c, a);
                    }
                    if (this.f27407b != null) {
                        try {
                            m33105a(this.f27407b, "endConnection", (Class[]) null, new Object[0]);
                        } catch (Exception e) {
                            Log.e(this.f27406a, e.getMessage());
                        }
                    }
                } catch (Exception e2) {
                    Log.e(this.f27406a, e2.getMessage());
                }
            } else if (intValue == 1) {
                Log.e(this.f27406a, "Install referrer service isn't available");
            } else if (intValue != 2) {
                Log.e(this.f27406a, "Install referrer service isn't available");
            } else {
                Log.e(this.f27406a, "Install referrer isn't supported on the current Play Store app.");
            }
        } else if (name.equals("onInstallReferrerServiceDisconnected") && (context = this.f27408c) != null) {
            init(context);
        }
        return null;
    }

    /* renamed from: a */
    private Object m33102a() {
        Object a;
        try {
            if (this.f27408c == null || (a = m33104a(Class.forName("com.android.installreferrer.api.InstallReferrerClient"), "newBuilder", (Object) null, new Class[]{Context.class}, this.f27408c)) == null) {
                return null;
            }
            return m33105a(a, "build", (Class[]) null, new Object[0]);
        } catch (NoClassDefFoundError e) {
            Log.e(this.f27406a, e.getMessage());
            return null;
        } catch (Exception e2) {
            Log.e(this.f27406a, e2.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    private Class m33107b() {
        try {
            return Class.forName("com.android.installreferrer.api.InstallReferrerStateListener");
        } catch (NoClassDefFoundError e) {
            Log.e(this.f27406a, e.getMessage());
            return null;
        } catch (Exception e2) {
            Log.e(this.f27406a, e2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private Object m33103a(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (Exception e) {
            Log.e(this.f27406a, e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    private Object m33108c() {
        Object obj = this.f27407b;
        if (obj != null) {
            try {
                return m33105a(obj, "getInstallReferrer", (Class[]) null, new Object[0]);
            } catch (Exception e) {
                Log.e(this.f27406a, e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m33106a(Object obj) {
        try {
            return String.valueOf(m33105a(obj, "getInstallReferrer", (Class[]) null, new Object[0]));
        } catch (Exception e) {
            Log.e(this.f27406a, e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Object m33105a(Object obj, String str, Class[] clsArr, Object... objArr) {
        try {
            return m33104a(obj.getClass(), str, obj, clsArr, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static Object m33104a(Class cls, String str, Object obj, Class[] clsArr, Object... objArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            if (method == null) {
                return null;
            }
            return method.invoke(obj, objArr);
        } catch (Exception e) {
            Log.e("Tapjoy", e.getMessage());
            return null;
        }
    }
}
