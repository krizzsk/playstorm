package com.bytedance.sdk.openadsdk.p178j;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.j.e */
/* compiled from: PlayableJsBridge */
public class C3861e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f9987a;

    /* renamed from: b */
    private WeakReference<C3890g> f9988b;

    /* renamed from: c */
    private Map<String, C3887a> f9989c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public SensorEventListener f9990d = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C3890g a;
            if (sensorEvent.sensor.getType() == 1 && (a = C3861e.this.m12690d()) != null) {
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) f);
                    jSONObject.put("y", (double) f2);
                    jSONObject.put("z", (double) f3);
                    a.mo20734a("accelerometer_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SensorEventListener f9991e = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C3890g a;
            if (sensorEvent.sensor.getType() == 4 && (a = C3861e.this.m12690d()) != null) {
                float degrees = (float) Math.toDegrees((double) sensorEvent.values[0]);
                float degrees2 = (float) Math.toDegrees((double) sensorEvent.values[1]);
                float degrees3 = (float) Math.toDegrees((double) sensorEvent.values[2]);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", (double) degrees);
                    jSONObject.put("y", (double) degrees2);
                    jSONObject.put("z", (double) degrees3);
                    a.mo20734a("gyro_callback", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.j.e$a */
    /* compiled from: PlayableJsBridge */
    interface C3887a {
        /* renamed from: a */
        JSONObject mo20723a(JSONObject jSONObject) throws Throwable;
    }

    public C3861e(C3890g gVar) {
        this.f9987a = gVar.mo20726a();
        this.f9988b = new WeakReference<>(gVar);
        m12688c();
    }

    /* renamed from: a */
    public Set<String> mo20718a() {
        return this.f9989c.keySet();
    }

    /* renamed from: c */
    private void m12688c() {
        this.f9989c.put("adInfo", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) {
                C3890g a = C3861e.this.m12690d();
                if (a != null) {
                    return a.mo20764n();
                }
                return null;
            }
        });
        this.f9989c.put("appInfo", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                JSONArray jSONArray = new JSONArray();
                for (String put : C3861e.this.mo20718a()) {
                    jSONArray.put(put);
                }
                jSONObject2.put("supportList", jSONArray);
                C3890g a = C3861e.this.m12690d();
                if (a != null) {
                    jSONObject2.put("deviceId", a.mo20754g());
                    jSONObject2.put("netType", a.mo20761k());
                    jSONObject2.put("innerAppName", a.mo20747d());
                    jSONObject2.put("appName", a.mo20750e());
                    jSONObject2.put("appVersion", a.mo20753f());
                    Map<String, String> b = a.mo20738b();
                    for (String next : b.keySet()) {
                        jSONObject2.put(next, b.get(next));
                    }
                }
                return jSONObject2;
            }
        });
        this.f9989c.put("playableSDKInfo", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "5.2.2");
                jSONObject2.put("os", "android");
                return jSONObject2;
            }
        });
        this.f9989c.put("subscribe_app_ad", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) {
                C3855a b = C3861e.this.m12692e();
                if (b == null) {
                    return null;
                }
                b.mo18569a(jSONObject);
                return null;
            }
        });
        this.f9989c.put("download_app_ad", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) {
                C3855a b = C3861e.this.m12692e();
                if (b == null) {
                    return null;
                }
                b.mo18571b(jSONObject);
                return null;
            }
        });
        this.f9989c.put("isViewable", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("viewStatus", a.mo20759i());
                return jSONObject2;
            }
        });
        this.f9989c.put("getVolume", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("endcard_mute", a.mo20757h());
                return jSONObject2;
            }
        });
        this.f9989c.put("getScreenSize", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return new JSONObject();
                }
                return a.mo20763m();
            }
        });
        this.f9989c.put("start_accelerometer_observer", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C3888f.m12722a("PlayableJsBridge", "invoke start_accelerometer_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3901i.m12800a(C3861e.this.f9987a, C3861e.this.f9990d, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f9989c.put("close_accelerometer_observer", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3901i.m12799a(C3861e.this.f9987a, C3861e.this.f9990d);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3888f.m12722a("PlayableJsBridge", "invoke close_accelerometer_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9989c.put("start_gyro_observer", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int i = 2;
                if (jSONObject != null) {
                    try {
                        i = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th) {
                        C3888f.m12722a("PlayableJsBridge", "invoke start_gyro_observer error", th);
                        jSONObject2.put("code", -2);
                        jSONObject2.put("codeMsg", th.toString());
                        return jSONObject2;
                    }
                }
                C3901i.m12802b(C3861e.this.f9987a, C3861e.this.f9991e, i);
                jSONObject2.put("code", 0);
                return jSONObject2;
            }
        });
        this.f9989c.put("close_gyro_observer", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3901i.m12799a(C3861e.this.f9987a, C3861e.this.f9991e);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3888f.m12722a("PlayableJsBridge", "invoke close_gyro_observer error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9989c.put("device_shake", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C3901i.m12798a(C3861e.this.f9987a);
                    jSONObject2.put("code", 0);
                    return jSONObject2;
                } catch (Throwable th) {
                    C3888f.m12722a("PlayableJsBridge", "invoke device_shake error", th);
                    jSONObject2.put("code", -2);
                    jSONObject2.put("codeMsg", th.toString());
                    return jSONObject2;
                }
            }
        });
        this.f9989c.put("playable_style", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a != null) {
                    return a.mo20743c();
                }
                return null;
            }
        });
        this.f9989c.put("sendReward", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20766p();
                return null;
            }
        });
        this.f9989c.put("webview_time_track", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                return null;
            }
        });
        this.f9989c.put("playable_event", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null || jSONObject == null) {
                    return null;
                }
                a.mo20739b(jSONObject.optString("event", (String) null), jSONObject.optJSONObject("params"));
                return null;
            }
        });
        this.f9989c.put("reportAd", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20745c(jSONObject);
                return null;
            }
        });
        this.f9989c.put("close", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20748d(jSONObject);
                return null;
            }
        });
        this.f9989c.put("openAdLandPageLinks", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20751e(jSONObject);
                return null;
            }
        });
        this.f9989c.put("get_viewport", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                return a.mo20765o();
            }
        });
        this.f9989c.put("jssdk_load_finish", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20769s();
                return null;
            }
        });
        this.f9989c.put("material_render_result", new C3887a() {
            /* renamed from: a */
            public JSONObject mo20723a(JSONObject jSONObject) throws Throwable {
                C3890g a = C3861e.this.m12690d();
                if (a == null) {
                    return null;
                }
                a.mo20740b(jSONObject);
                return null;
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C3890g m12690d() {
        WeakReference<C3890g> weakReference = this.f9988b;
        if (weakReference == null) {
            return null;
        }
        return (C3890g) weakReference.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C3855a m12692e() {
        C3890g d = m12690d();
        if (d == null) {
            return null;
        }
        return d.mo20762l();
    }

    /* renamed from: a */
    public JSONObject mo20719a(String str, JSONObject jSONObject) {
        try {
            C3887a aVar = this.f9989c.get(str);
            if (aVar == null) {
                return null;
            }
            return aVar.mo20723a(jSONObject);
        } catch (Throwable th) {
            C3888f.m12722a("PlayableJsBridge", "invoke error", th);
            return null;
        }
    }

    /* renamed from: b */
    public void mo20720b() {
        C3901i.m12799a(this.f9987a, this.f9990d);
        C3901i.m12799a(this.f9987a, this.f9991e);
    }
}
