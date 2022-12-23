package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.response.C5295i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.measurement.i */
public class C4468i implements C5295i {

    /* renamed from: a */
    public URL f11021a;

    /* renamed from: b */
    public String f11022b;

    /* renamed from: c */
    public Map<C4493q, List<String>> f11023c = new HashMap();

    /* renamed from: d */
    public String f11024d;

    /* renamed from: e */
    public String f11025e;

    /* renamed from: f */
    public String f11026f;

    /* renamed from: g */
    public boolean f11027g = false;

    /* renamed from: a */
    public void mo24666a(C4493q qVar, String str) {
        List list = this.f11023c.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f11023c.put(qVar, list);
        }
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r2.f11022b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24667b() {
        /*
            r2 = this;
            boolean r0 = r2.f11027g
            if (r0 == 0) goto L_0x001e
            java.net.URL r0 = r2.f11021a
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = r2.f11022b
            if (r0 == 0) goto L_0x001c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = r2.f11022b
            java.lang.String r1 = "omid"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.measurement.C4468i.mo24667b():boolean");
    }

    public String toString() {
        return "Verification{mJavaScriptResource=" + this.f11021a + ", mTrackingEvents=" + this.f11023c + ", mVerificationParameters='" + this.f11024d + '\'' + ", mVendor='" + this.f11025e + '\'' + '}';
    }

    /* renamed from: a */
    public List<String> mo24664a(C4493q qVar) {
        Map<C4493q, List<String>> map;
        if (qVar == null || (map = this.f11023c) == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public String mo24665a() {
        String str;
        if (!this.f11027g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f11022b)) {
            return "apiFramework = ";
        }
        if (!this.f11022b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return String.format("apiFramework = %s", new Object[]{this.f11022b});
        }
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(this.f11026f)) {
            str = "";
        } else {
            str = this.f11026f;
        }
        objArr[0] = str;
        return String.format("JavaScriptResource_url = %s", objArr);
    }
}
