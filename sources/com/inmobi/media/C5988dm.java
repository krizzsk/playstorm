package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dm */
/* compiled from: VastCompanionAd */
public class C5988dm {

    /* renamed from: f */
    static final ArrayList<String> f15211f = new ArrayList<>(Arrays.asList(new String[]{MimeTypes.IMAGE_JPEG, "image/png"}));
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f15212h = C5988dm.class.getSimpleName();

    /* renamed from: a */
    int f15213a;

    /* renamed from: b */
    int f15214b;

    /* renamed from: c */
    List<C5989a> f15215c = new ArrayList();

    /* renamed from: d */
    public List<C5922cf> f15216d = new ArrayList();

    /* renamed from: e */
    public String f15217e = null;

    /* renamed from: g */
    public boolean f15218g;

    /* renamed from: i */
    private String f15219i;

    /* renamed from: com.inmobi.media.dm$a */
    /* compiled from: VastCompanionAd */
    public static final class C5989a {

        /* renamed from: a */
        public byte f15220a;

        /* renamed from: b */
        public String f15221b;

        C5989a(byte b, String str) {
            this.f15220a = b;
            this.f15221b = str;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                byte b = this.f15220a;
                jSONObject.put("type", b != 1 ? b != 2 ? b != 3 ? "unknown" : "iframe" : TJAdUnitConstants.String.HTML : "static");
                jSONObject.put("content", this.f15221b);
                return jSONObject.toString();
            } catch (JSONException e) {
                String unused = C5988dm.f15212h;
                C6181gg.m18398a().mo35357a(new C6217hg(e));
                return "";
            }
        }
    }

    public C5988dm(int i, int i2, String str) {
        this.f15219i = str;
        this.f15213a = i;
        this.f15214b = i2;
    }

    /* renamed from: a */
    public final List<C5989a> mo35092a(int i) {
        ArrayList arrayList = new ArrayList();
        for (C5989a next : this.f15215c) {
            if (next.f15220a == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo35095a(C5989a aVar) {
        this.f15215c.add(aVar);
    }

    /* renamed from: a */
    public final List<C5922cf> mo35093a(String str) {
        ArrayList arrayList = new ArrayList();
        for (C5922cf next : this.f15216d) {
            if (next.f15004d.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo35094a(C5922cf cfVar) {
        this.f15216d.add(cfVar);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f15219i != null) {
                jSONObject.put("id", this.f15219i);
            }
            jSONObject.put("width", this.f15213a);
            jSONObject.put("height", this.f15214b);
            jSONObject.put("clickThroughUrl", this.f15217e);
            JSONArray jSONArray = new JSONArray();
            for (C5989a aVar : this.f15215c) {
                jSONArray.put(aVar.toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C5922cf cfVar : this.f15216d) {
                jSONArray2.put(cfVar.toString());
            }
            jSONObject.put(Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e) {
            C6181gg.m18398a().mo35357a(new C6217hg(e));
            return "";
        }
    }
}
