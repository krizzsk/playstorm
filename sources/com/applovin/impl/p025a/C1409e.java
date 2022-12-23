package com.applovin.impl.p025a;

import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1825b;
import com.applovin.impl.sdk.utils.C2088r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.e */
public class C1409e {

    /* renamed from: c */
    private static final List<String> f1559c = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", MimeTypes.VIDEO_MATROSKA});

    /* renamed from: a */
    protected List<C2088r> f1560a = new ArrayList();

    /* renamed from: b */
    private final C1959m f1561b;

    /* renamed from: d */
    private final JSONObject f1562d;

    /* renamed from: e */
    private final JSONObject f1563e;

    /* renamed from: f */
    private final C1825b f1564f;

    /* renamed from: g */
    private final long f1565g = System.currentTimeMillis();

    public C1409e(JSONObject jSONObject, JSONObject jSONObject2, C1825b bVar, C1959m mVar) {
        this.f1561b = mVar;
        this.f1562d = jSONObject;
        this.f1563e = jSONObject2;
        this.f1564f = bVar;
    }

    /* renamed from: a */
    public int mo12674a() {
        return this.f1560a.size();
    }

    /* renamed from: b */
    public List<C2088r> mo12675b() {
        return this.f1560a;
    }

    /* renamed from: c */
    public JSONObject mo12676c() {
        return this.f1562d;
    }

    /* renamed from: d */
    public JSONObject mo12677d() {
        return this.f1563e;
    }

    /* renamed from: e */
    public C1825b mo12678e() {
        return this.f1564f;
    }

    /* renamed from: f */
    public long mo12679f() {
        return this.f1565g;
    }

    /* renamed from: g */
    public List<String> mo12680g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f1562d, "vast_preferred_video_types", (String) null));
        return !explode.isEmpty() ? explode : f1559c;
    }

    /* renamed from: h */
    public int mo12681h() {
        return Utils.getVideoCompletionPercent(this.f1562d);
    }
}
