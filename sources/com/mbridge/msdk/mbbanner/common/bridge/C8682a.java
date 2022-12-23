package com.mbridge.msdk.mbbanner.common.bridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.C8411l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p066db.C2374f;
import com.mbridge.msdk.foundation.p066db.C2376g;
import com.mbridge.msdk.foundation.p066db.C2379j;
import com.mbridge.msdk.foundation.p066db.C2384o;
import com.mbridge.msdk.foundation.same.p299a.C8417d;
import com.mbridge.msdk.foundation.tools.C8573c;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.foundation.tools.C8611x;
import com.mbridge.msdk.mbbanner.common.p323b.C8670a;
import com.mbridge.msdk.mbbanner.common.p325d.C8704a;
import com.mbridge.msdk.mbsignalcommon.communication.C8804a;
import com.mbridge.msdk.mbsignalcommon.communication.C8805b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8824g;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import com.mbridge.msdk.videocommon.download.C9563g;
import com.p374my.tracker.ads.AdFormat;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.bridge.a */
/* compiled from: BannerSignalCommunicationImpl */
public final class C8682a extends C8804a {

    /* renamed from: b */
    private WeakReference<Context> f21025b;

    /* renamed from: c */
    private List<CampaignEx> f21026c;

    /* renamed from: d */
    private String f21027d;

    /* renamed from: e */
    private String f21028e;

    /* renamed from: f */
    private int f21029f;

    /* renamed from: g */
    private C8670a f21030g;

    /* renamed from: h */
    private BannerExpandDialog f21031h;

    /* renamed from: i */
    private boolean f21032i = false;

    public C8682a(Context context, String str, String str2) {
        this.f21027d = str;
        this.f21028e = str2;
        this.f21025b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo58004a(C8670a aVar) {
        if (aVar != null) {
            this.f21030g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo58006a(List<CampaignEx> list) {
        this.f21026c = list;
    }

    /* renamed from: a */
    public final void mo58003a(int i) {
        this.f21029f = i;
    }

    /* renamed from: a */
    public final void mo58002a() {
        if (this.f21030g != null) {
            this.f21030g = null;
        }
        if (this.f21031h != null) {
            this.f21031h = null;
        }
    }

    /* renamed from: c */
    public final void mo58008c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                C8824g.m25670a().mo58311a(obj, C8805b.m25603a(0));
                if (this.f21030g != null) {
                    this.f21030g.mo57993b(optInt);
                }
            } catch (Throwable th) {
                C8608u.m24881a("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    /* renamed from: a */
    public final void mo58005a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C8573c cVar = new C8573c(C2350a.m5601e().mo15792g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f21029f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo57749a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f21026c));
            C2294d e = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), this.f21028e);
            if (e == null) {
                e = C2294d.m5325d(this.f21028e);
            }
            if (!TextUtils.isEmpty(this.f21027d)) {
                e.mo15594g(this.f21027d);
            }
            jSONObject.put("unitSetting", e.mo15605s());
            String c = C2283b.m5275a().mo15566c(C2350a.m5601e().mo15793h());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
            C8824g.m25670a().mo58311a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "init", th);
        }
    }

    /* renamed from: b */
    public final void mo58007b(Object obj, String str) {
        C8608u.m24884d("BannerSignalCommunicationImpl", "click");
        try {
            if (this.f21026c != null && !TextUtils.isEmpty(str)) {
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(new JSONObject(str).getJSONObject("pt"));
                if (this.f21030g != null) {
                    this.f21030g.mo57989a(parseCampaignWithBackData);
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "click", th);
        }
    }

    /* renamed from: d */
    public final void mo58009d(Object obj, String str) {
        C8608u.m24884d("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                if (this.f21030g != null) {
                    this.f21030g.mo57988a(optInt);
                }
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    /* renamed from: e */
    public final void mo58010e(Object obj, String str) {
        C8608u.m24884d("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                if (this.f21030g != null) {
                    this.f21030g.mo57990a(optString);
                }
                C8824g.m25670a().mo58311a(obj, C8805b.m25603a(0));
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            C8824g.m25670a().mo58311a(obj, C8805b.m25603a(-1));
        }
    }

    /* renamed from: i */
    public final void mo58011i(Object obj, String str) {
        C8608u.m24880a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    for (CampaignEx next : this.f21026c) {
                        if (next.getId().equals(string)) {
                            C8417d.m24308a(this.f21028e, next, AdFormat.BANNER);
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C2379j a = C2379j.m5740a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a.mo15910b((String) it.next());
                            }
                        } catch (Exception e) {
                            C8608u.m24884d("BannerSignalCommunicationImpl", e.getMessage());
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    public final void open(String str) {
        C8608u.m24884d("BannerSignalCommunicationImpl", "open");
        try {
            C8608u.m24884d("BannerSignalCommunicationImpl", str);
            if (this.f21026c.size() > 1) {
                C2350a.m5601e().mo15792g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f21030g != null) {
                this.f21030g.mo57992a(true, str);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "open", th);
        }
    }

    public final void close() {
        C8608u.m24884d("BannerSignalCommunicationImpl", "close");
        try {
            if (this.f21030g != null) {
                this.f21030g.mo57987a();
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "close", th);
        }
    }

    public final void unload() {
        close();
    }

    public final CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f21026c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f21026c.get(0);
    }

    public final void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            if (this.f21030g != null) {
                this.f21030g.mo57988a(i);
            }
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    public final void expand(String str, boolean z) {
        Context context;
        String str2 = "";
        try {
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    str2 = getMraidCampaign().getBannerUrl();
                } else {
                    str2 = "file:////" + getMraidCampaign().getBannerHtml();
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z);
            if (!(this.f21025b == null || (context = (Context) this.f21025b.get()) == null)) {
                if (this.f21031h == null || !this.f21031h.isShowing()) {
                    BannerExpandDialog bannerExpandDialog = new BannerExpandDialog(context, bundle, this.f21030g);
                    this.f21031h = bannerExpandDialog;
                    bannerExpandDialog.setCampaignList(this.f21028e, this.f21026c);
                    this.f21031h.show();
                } else {
                    return;
                }
            }
            if (this.f21030g != null) {
                this.f21030g.mo57991a(true);
            }
            C8704a.m25294a(this.f21028e, getMraidCampaign(), str);
        } catch (Throwable th) {
            C8608u.m24881a("BannerSignalCommunicationImpl", MraidJsMethods.EXPAND, th);
        }
    }

    /* renamed from: j */
    public final void mo58012j(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C8805b.m25604a(obj, "params is empty");
            return;
        }
        try {
            m25197a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8608u.m24880a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    /* renamed from: a */
    private static void m25197a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        String str5;
        String str6;
        String str7;
        Object obj2 = obj;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        String str8 = "message";
        String str9 = "code";
        int i2 = 1;
        if (jSONObject2 == null) {
            try {
                jSONObject3.put(str9, 1);
                jSONObject3.put(str8, "params is null");
                C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (JSONException e) {
                C8608u.m24880a("BannerSignalCommunicationImpl", e.getMessage());
            }
        } else {
            try {
                jSONObject3.put(str9, 0);
                jSONObject3.put(str8, "");
                JSONArray jSONArray = jSONObject2.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    str3 = str8;
                    str2 = str9;
                    try {
                        jSONObject3.put(str2, 1);
                        str = str3;
                        try {
                            jSONObject3.put(str, "resource is null");
                            C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = str3;
                        try {
                            C8608u.m24880a("BannerSignalCommunicationImpl", e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        try {
                            jSONObject3.put(str2, 1);
                            jSONObject3.put(str, th.getLocalizedMessage());
                            C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e4) {
                            C8608u.m24880a("BannerSignalCommunicationImpl", e4.getMessage());
                        }
                    }
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        String optString = jSONObject4.optString("ref", "");
                        int i4 = jSONObject4.getInt("type");
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i4 == i2) {
                            if (!TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                C8411l a = C2384o.m5768a((C2374f) C2376g.m5723a(C2350a.m5601e().mo15792g())).mo15928a(optString);
                                if (a != null) {
                                    i = length;
                                    C8608u.m24880a("BannerSignalCommunicationImpl", "VideoBean not null");
                                    jSONObject6.put("type", 1);
                                    str3 = str8;
                                    try {
                                        jSONObject6.put("videoDataLength", a.mo57435c());
                                        String e5 = a.mo57437e();
                                        str4 = str9;
                                        if (TextUtils.isEmpty(e5)) {
                                            C8608u.m24880a("BannerSignalCommunicationImpl", "VideoPath null");
                                            jSONObject6.put("path", "");
                                            jSONObject6.put("path4Web", "");
                                        } else {
                                            C8608u.m24880a("BannerSignalCommunicationImpl", "VideoPath not null");
                                            jSONObject6.put("path", e5);
                                            jSONObject6.put("path4Web", e5);
                                        }
                                        if (a.mo57436d() == 5) {
                                            jSONObject6.put("downloaded", 1);
                                            z = false;
                                        } else {
                                            z = false;
                                            jSONObject6.put("downloaded", 0);
                                        }
                                        jSONObject5.put(optString, jSONObject6);
                                        jSONArray2.put(jSONObject5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject3.put(str2, 1);
                                        jSONObject3.put(str, th.getLocalizedMessage());
                                        C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                    }
                                } else {
                                    str3 = str8;
                                    str4 = str9;
                                    i = length;
                                    z = false;
                                    C8608u.m24880a("BannerSignalCommunicationImpl", "VideoBean null");
                                }
                                i3++;
                                jSONArray = jSONArray3;
                                boolean z2 = z;
                                length = i;
                                str8 = str3;
                                str9 = str4;
                                i2 = 1;
                            }
                        }
                        str3 = str8;
                        str4 = str9;
                        i = length;
                        z = false;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 2);
                            if (C9563g.m27460a().mo63240a(optString) == null) {
                                str7 = "";
                            } else {
                                str7 = C9563g.m27460a().mo63242b(optString);
                            }
                            jSONObject7.put("path", str7);
                            jSONObject5.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z22 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else if (i4 != 3 || TextUtils.isEmpty(optString)) {
                            if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                if (C8611x.m24899a(optString) == null) {
                                    str5 = "";
                                } else {
                                    str5 = C8611x.m24899a(optString);
                                }
                                jSONObject8.put("path", str5);
                                jSONObject5.put(optString, jSONObject8);
                                jSONArray2.put(jSONObject5);
                            }
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z222 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else {
                            try {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C8608u.m24880a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + optString);
                                    str6 = "file:////" + optString;
                                    JSONObject jSONObject9 = new JSONObject();
                                    jSONObject9.put("type", 3);
                                    jSONObject9.put("path", str6);
                                    jSONObject5.put(optString, jSONObject9);
                                    jSONArray2.put(jSONObject5);
                                    i3++;
                                    jSONArray = jSONArray3;
                                    boolean z2222 = z;
                                    length = i;
                                    str8 = str3;
                                    str9 = str4;
                                    i2 = 1;
                                }
                            } catch (Throwable th4) {
                                if (MBridgeConstans.DEBUG) {
                                    th4.printStackTrace();
                                }
                            }
                            str6 = "";
                            JSONObject jSONObject92 = new JSONObject();
                            jSONObject92.put("type", 3);
                            jSONObject92.put("path", str6);
                            jSONObject5.put(optString, jSONObject92);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z22222 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        }
                    }
                    String str10 = str8;
                    String str11 = str9;
                    jSONObject3.put("resource", jSONArray2);
                    C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                }
            } catch (Throwable th5) {
                th = th5;
                str = str8;
                str2 = str9;
                jSONObject3.put(str2, 1);
                jSONObject3.put(str, th.getLocalizedMessage());
                C8824g.m25670a().mo58311a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            }
        }
    }
}
