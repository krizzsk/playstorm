package com.bytedance.sdk.openadsdk.core.p156j;

import com.bytedance.sdk.openadsdk.core.p156j.p157a.C3540a;
import com.bytedance.sdk.openadsdk.core.p156j.p159b.C3553c;
import com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c */
/* compiled from: VastResource */
public class C3557c {

    /* renamed from: a */
    protected int f8933a;

    /* renamed from: b */
    protected int f8934b;

    /* renamed from: c */
    protected C3559a.C3562a f8935c;

    /* renamed from: d */
    protected C3559a.C3563b f8936d;

    /* renamed from: e */
    protected String f8937e;

    /* renamed from: f */
    protected List<C3553c> f8938f = new ArrayList();

    /* renamed from: g */
    protected List<C3553c> f8939g = new ArrayList();

    /* renamed from: h */
    protected String f8940h;

    /* renamed from: i */
    private String f8941i;

    public C3557c(int i, int i2, C3559a.C3562a aVar, C3559a.C3563b bVar, String str, List<C3553c> list, List<C3553c> list2, String str2) {
        this.f8933a = i;
        this.f8934b = i2;
        this.f8935c = aVar;
        this.f8936d = bVar;
        this.f8937e = str;
        this.f8938f = list;
        this.f8939g = list2;
        this.f8940h = str2;
    }

    /* renamed from: b */
    public int mo20025b() {
        return this.f8933a;
    }

    /* renamed from: c */
    public int mo20027c() {
        return this.f8934b;
    }

    /* renamed from: a */
    public void mo20023a(long j) {
        C3553c.m11120b(this.f8938f, (C3540a) null, j, this.f8941i);
    }

    /* renamed from: b */
    public void mo20026b(long j) {
        C3553c.m11120b(this.f8939g, (C3540a) null, j, this.f8941i);
    }

    /* renamed from: a */
    public static float m11130a(int i, int i2, int i3, int i4, C3559a.C3563b bVar, C3559a.C3562a aVar) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = (float) i;
        float f2 = (float) i3;
        return m11131a(bVar, aVar) / ((Math.abs((f / ((float) i2)) - (f2 / ((float) i4))) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c$1 */
    /* compiled from: VastResource */
    static /* synthetic */ class C35581 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8942a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.j.c.a$b[] r0 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8942a = r0
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.STATIC_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8942a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.HTML_RESOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8942a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p156j.p160c.C3559a.C3563b.IFRAME_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p156j.C3557c.C35581.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static float m11131a(C3559a.C3563b bVar, C3559a.C3562a aVar) {
        int i = C35581.f8942a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (C3559a.C3562a.JAVASCRIPT.equals(aVar)) {
            return 1.0f;
        } else {
            if (C3559a.C3562a.IMAGE.equals(aVar)) {
                return 0.8f;
            }
            return 0.0f;
        }
    }

    /* renamed from: d */
    public String mo20028d() {
        int i = C35581.f8942a[this.f8936d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f8937e;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f8933a + "\" height=\"" + this.f8934b + "\" src=\"" + this.f8937e + "\"></iframe>";
        } else if (this.f8935c == C3559a.C3562a.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f8937e + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (this.f8935c != C3559a.C3562a.JAVASCRIPT) {
            return null;
        } else {
            return "<script src=\"" + this.f8937e + "\"></script>";
        }
    }

    /* renamed from: e */
    public String mo20029e() {
        if (this.f8936d == C3559a.C3563b.STATIC_RESOURCE && this.f8935c == C3559a.C3562a.IMAGE) {
            return this.f8937e;
        }
        return null;
    }

    /* renamed from: a */
    public void mo20024a(String str) {
        this.f8941i = str;
    }

    /* renamed from: b */
    public static C3557c m11132b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString(StaticResource.CREATIVE_TYPE, C3559a.C3562a.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", C3559a.C3563b.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new C3553c.C3555a(optJSONArray.optString(i)).mo20022a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new C3553c.C3555a(optJSONArray2.optString(i2)).mo20022a());
        }
        return new C3557c(optInt, optInt2, C3559a.C3562a.valueOf(optString), C3559a.C3563b.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    /* renamed from: a */
    public JSONObject mo20006a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f8933a);
        jSONObject.put("height", this.f8934b);
        jSONObject.put(StaticResource.CREATIVE_TYPE, this.f8935c.toString());
        jSONObject.put("resourceType", this.f8936d.toString());
        jSONObject.put("contentUrl", this.f8937e);
        jSONObject.put("clickThroughUri", this.f8940h);
        jSONObject.put("clickTrackers", C3553c.m11119b(this.f8938f));
        jSONObject.put("creativeViewTrackers", C3553c.m11119b(this.f8939g));
        return jSONObject;
    }
}
