package com.ironsource.sdk.p286a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.ironsource.p197a.C6379c;
import com.ironsource.p200d.C6392a;
import com.ironsource.sdk.utils.C8391a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.b */
public final class C8151b implements C6379c {

    /* renamed from: a */
    private static Map<String, Object> f19411a = new HashMap();

    /* renamed from: com.ironsource.sdk.a.b$a */
    public static class C8152a {

        /* renamed from: a */
        public String f19412a;

        /* renamed from: b */
        public String f19413b;

        /* renamed from: c */
        public Context f19414c;

        /* renamed from: d */
        public String f19415d;
    }

    private C8151b(C8152a aVar) {
        Context context = aVar.f19414c;
        C8391a a = C8391a.m24034a(context);
        f19411a.put("deviceos", SDKUtils.encodeString(a.f20131c));
        f19411a.put("deviceosversion", SDKUtils.encodeString(a.f20132d));
        f19411a.put("deviceapilevel", Integer.valueOf(a.f20133e));
        f19411a.put("deviceoem", SDKUtils.encodeString(a.f20129a));
        f19411a.put("devicemodel", SDKUtils.encodeString(a.f20130b));
        f19411a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f19411a.put("applicationkey", SDKUtils.encodeString(aVar.f19413b));
        f19411a.put("sessionid", SDKUtils.encodeString(aVar.f19412a));
        f19411a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f19411a.put("applicationuserid", SDKUtils.encodeString(aVar.f19415d));
        f19411a.put("env", BuildConfig.FLAVOR);
        f19411a.put("origin", "n");
        f19411a.put("connectiontype", C6392a.m19175a(aVar.f19414c));
    }

    public /* synthetic */ C8151b(C8152a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m23436a(String str) {
        f19411a.put("connectiontype", SDKUtils.encodeString(str));
    }

    /* renamed from: a */
    public final Map<String, Object> mo35772a() {
        return f19411a;
    }
}
