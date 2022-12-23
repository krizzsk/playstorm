package com.bytedance.mobsec.metasec.p089ov;

import java.util.Map;
import p398ms.p399bd.p400o.Pgl.C12398l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManager */
public final class PglMSManager implements C12398l0.pgla {

    /* renamed from: a */
    private final C12398l0.pgla f5445a;

    PglMSManager(C12398l0.pgla pgla) {
        this.f5445a = pgla;
    }

    public Map<String, String> frameSign(String str, int i) {
        return this.f5445a.frameSign(str, i);
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        return this.f5445a.getFeatureHash(str, bArr);
    }

    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        return this.f5445a.getReportRaw(str, i, map);
    }

    public String getToken() {
        return this.f5445a.getToken();
    }

    public void report(String str) {
        this.f5445a.report(str);
    }

    public void setBDDeviceID(String str) {
        this.f5445a.setBDDeviceID(str);
    }

    public void setCollectMode(int i) {
        this.f5445a.setCollectMode(i);
    }

    public void setDeviceID(String str) {
        this.f5445a.setDeviceID(str);
    }

    public void setInstallID(String str) {
        this.f5445a.setInstallID(str);
    }

    public void setSessionID(String str) {
        this.f5445a.setSessionID(str);
    }
}
