package com.amazon.device.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import org.json.JSONException;
import org.json.JSONObject;

class DtbPackageNativeData {
    private static DtbPackageNativeData packageNativeDataInstance;
    private String applicationLabel;
    private JSONObject json = new JSONObject();
    private String packageName;
    private String versionCode;
    private String versionName;

    protected static synchronized DtbPackageNativeData getPackageNativeDataInstance(Context context) {
        DtbPackageNativeData dtbPackageNativeData;
        synchronized (DtbPackageNativeData.class) {
            if (packageNativeDataInstance == null) {
                packageNativeDataInstance = new DtbPackageNativeData(context);
            }
            dtbPackageNativeData = packageNativeDataInstance;
        }
        return dtbPackageNativeData;
    }

    private DtbPackageNativeData(Context context) {
        PackageInfo packageInfo;
        String str;
        String str2;
        this.packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        this.applicationLabel = (String) packageManager.getApplicationLabel(context.getApplicationInfo());
        try {
            packageInfo = packageManager.getPackageInfo(this.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            DtbLog.error("Package " + this.packageName + " not found");
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = packageInfo.versionName;
        } else {
            str = "";
        }
        this.versionName = str;
        if (packageInfo != null) {
            str2 = Integer.toString(packageInfo.versionCode);
        } else {
            str2 = "";
        }
        this.versionCode = str2;
        try {
            this.json.put("lbl", this.applicationLabel);
            this.json.put("pn", this.packageName);
            if (!this.versionCode.equals("")) {
                this.json.put("v", this.versionCode);
            }
            if (!this.versionName.equals("")) {
                this.json.put("vn", this.versionName);
            }
        } catch (JSONException unused2) {
            DtbLog.error("JSON exception while buildinf package native data");
        }
    }

    /* access modifiers changed from: protected */
    public JSONObject getParamsJson() {
        return this.json;
    }
}
