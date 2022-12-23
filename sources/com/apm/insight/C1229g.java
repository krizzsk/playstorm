package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.amazon.aps.shared.APSAnalytics;
import com.apm.insight.entity.C1218b;
import com.apm.insight.p021j.C1252b;
import com.apm.insight.p022k.C1281k;
import com.apm.insight.p023l.C1301l;
import com.apm.insight.p023l.C1316v;
import com.apm.insight.runtime.C1363d;
import com.tapjoy.TapjoyConstants;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.g */
public class C1229g {

    /* renamed from: b */
    protected static MonitorCrash f1118b;

    /* renamed from: a */
    protected MonitorCrash f1119a;

    private C1229g(MonitorCrash monitorCrash) {
        this.f1119a = monitorCrash;
        C1218b.m1450a(this);
        C1252b.m1604d();
        C1281k.m1709e();
    }

    /* renamed from: a */
    public static Object m1492a() {
        return f1118b;
    }

    /* renamed from: a */
    static void m1494a(Context context, final MonitorCrash monitorCrash) {
        f1118b = monitorCrash;
        C1229g gVar = new C1229g(monitorCrash);
        final C1363d a = C1240h.m1542a();
        Npth.init(context, new ICommonParams(gVar) {

            /* renamed from: a */
            final /* synthetic */ C1229g f1120a;

            {
                this.f1120a = r1;
            }

            public Map<String, Object> getCommonParams() {
                return C1301l.m1807b(this.f1120a.m1498e());
            }

            public String getDeviceId() {
                return TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId) ? a.mo12492d() : monitorCrash.mConfig.mDeviceId;
            }

            public List<String> getPatchInfo() {
                return null;
            }

            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            public String getSessionId() {
                return null;
            }

            public long getUserId() {
                return 0;
            }
        });
    }

    /* renamed from: a */
    static void m1495a(MonitorCrash monitorCrash) {
        new C1229g(monitorCrash);
    }

    /* renamed from: b */
    private JSONObject m1496b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        if (this.f1119a.mCustomData == null || (userData = this.f1119a.mCustomData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    /* renamed from: c */
    private JSONObject m1497c(CrashType crashType) {
        return new JSONObject(this.f1119a.mTagMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public JSONObject m1498e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f1119a.mConfig.mPackageName == null) {
                Context g = C1240h.m1558g();
                PackageInfo packageInfo = g.getPackageManager().getPackageInfo(g.getPackageName(), 128);
                if (packageInfo != null) {
                    if (this.f1119a.mConfig.mVersionInt == -1) {
                        this.f1119a.mConfig.mVersionInt = (long) packageInfo.versionCode;
                    }
                    if (this.f1119a.mConfig.mVersionStr == null) {
                        this.f1119a.mConfig.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f1119a.mConfig.mDeviceId) || "0".equals(this.f1119a.mConfig.mDeviceId)) {
            this.f1119a.mConfig.mDeviceId = C1240h.m1554c().mo12521a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f1119a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f1119a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f1119a.mConfig.mVersionInt);
            jSONObject.put(TapjoyConstants.TJC_APP_VERSION_NAME, this.f1119a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f1119a.mConfig.mChannel);
            jSONObject.put("package", C1301l.m1801a(this.f1119a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f1119a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f1119a.mConfig.mUID);
            jSONObject.put("ssid", this.f1119a.mConfig.mSSID);
            jSONObject.put("os", APSAnalytics.OS_NAME);
            jSONObject.put("so_list", C1301l.m1801a(this.f1119a.mConfig.mSoList));
            jSONObject.put("single_upload", mo12293d() ? 1 : 0);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public JSONArray mo12286a(StackTraceElement[] stackTraceElementArr, Throwable th) {
        if (this.f1119a.mConfig.mPackageName == null) {
            return new JSONArray().put(new C1316v.C1317a(0, stackTraceElementArr.length).mo12374a());
        }
        if (th == null || stackTraceElementArr == null) {
            return null;
        }
        return C1316v.m1908a(stackTraceElementArr, this.f1119a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONArray mo12287a(String[] strArr) {
        return this.f1119a.config().mPackageName == null ? new JSONArray().put(new C1316v.C1317a(0, strArr.length).mo12374a()) : C1316v.m1909a(strArr, this.f1119a.mConfig.mPackageName);
    }

    /* renamed from: a */
    public JSONObject mo12288a(CrashType crashType) {
        return mo12289a(crashType, (JSONArray) null);
    }

    /* renamed from: a */
    public JSONObject mo12289a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", m1498e());
            if (crashType != null) {
                jSONObject.put("custom", m1496b(crashType));
                jSONObject.put("filters", m1497c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public boolean mo12290a(Object obj) {
        return this.f1119a == obj;
    }

    /* renamed from: b */
    public String mo12291b() {
        return this.f1119a.mConfig.mAid;
    }

    /* renamed from: c */
    public JSONObject mo12292c() {
        return m1498e();
    }

    /* renamed from: d */
    public boolean mo12293d() {
        return false;
    }
}
