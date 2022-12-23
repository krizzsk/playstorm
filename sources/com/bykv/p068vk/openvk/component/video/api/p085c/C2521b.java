package com.bykv.p068vk.openvk.component.video.api.p085c;

import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2535b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.b */
/* compiled from: VideoInfo */
public class C2521b {

    /* renamed from: a */
    private int f5376a;

    /* renamed from: b */
    private int f5377b;

    /* renamed from: c */
    private long f5378c;

    /* renamed from: d */
    private double f5379d;

    /* renamed from: e */
    private String f5380e;

    /* renamed from: f */
    private String f5381f;

    /* renamed from: g */
    private String f5382g;

    /* renamed from: h */
    private String f5383h;

    /* renamed from: i */
    private String f5384i;

    /* renamed from: j */
    private String f5385j;

    /* renamed from: k */
    private int f5386k;

    /* renamed from: l */
    private int f5387l;

    /* renamed from: m */
    private int f5388m = 0;

    /* renamed from: n */
    private int f5389n = 0;

    /* renamed from: o */
    private int f5390o = 0;

    /* renamed from: p */
    private int f5391p = 0;

    /* renamed from: q */
    private int f5392q = 307200;

    /* renamed from: a */
    public int mo16336a() {
        return this.f5386k;
    }

    /* renamed from: a */
    public void mo16338a(int i) {
        this.f5386k = i;
    }

    /* renamed from: b */
    public int mo16341b() {
        return this.f5376a;
    }

    /* renamed from: b */
    public void mo16342b(int i) {
        this.f5376a = i;
    }

    /* renamed from: c */
    public int mo16344c() {
        return this.f5377b;
    }

    /* renamed from: c */
    public void mo16345c(int i) {
        this.f5377b = i;
    }

    /* renamed from: d */
    public int mo16347d() {
        return this.f5387l;
    }

    /* renamed from: d */
    public void mo16348d(int i) {
        this.f5387l = i;
    }

    /* renamed from: e */
    public long mo16350e() {
        return this.f5378c;
    }

    /* renamed from: a */
    public void mo16339a(long j) {
        this.f5378c = j;
    }

    /* renamed from: f */
    public double mo16353f() {
        return this.f5379d;
    }

    /* renamed from: a */
    public void mo16337a(double d) {
        this.f5379d = d;
    }

    /* renamed from: g */
    public String mo16356g() {
        return this.f5380e;
    }

    /* renamed from: a */
    public void mo16340a(String str) {
        this.f5380e = str;
    }

    /* renamed from: h */
    public String mo16358h() {
        return this.f5381f;
    }

    /* renamed from: b */
    public void mo16343b(String str) {
        this.f5381f = str;
    }

    /* renamed from: i */
    public String mo16360i() {
        return this.f5382g;
    }

    /* renamed from: c */
    public void mo16346c(String str) {
        this.f5382g = str;
    }

    /* renamed from: j */
    public String mo16362j() {
        return this.f5383h;
    }

    /* renamed from: d */
    public void mo16349d(String str) {
        this.f5383h = str;
    }

    /* renamed from: k */
    public String mo16363k() {
        return this.f5384i;
    }

    /* renamed from: e */
    public void mo16352e(String str) {
        this.f5384i = str;
    }

    /* renamed from: l */
    public String mo16364l() {
        if (TextUtils.isEmpty(this.f5385j)) {
            this.f5385j = C2535b.m6426a(this.f5382g);
        }
        return this.f5385j;
    }

    /* renamed from: f */
    public void mo16355f(String str) {
        this.f5385j = str;
    }

    /* renamed from: m */
    public int mo16365m() {
        if (this.f5392q < 0) {
            this.f5392q = 307200;
        }
        long j = this.f5378c;
        if (((long) this.f5392q) > j) {
            this.f5392q = (int) j;
        }
        return this.f5392q;
    }

    /* renamed from: e */
    public void mo16351e(int i) {
        this.f5392q = i;
    }

    /* renamed from: n */
    public int mo16366n() {
        return this.f5390o;
    }

    /* renamed from: f */
    public void mo16354f(int i) {
        this.f5390o = i;
    }

    /* renamed from: o */
    public int mo16367o() {
        return this.f5391p;
    }

    /* renamed from: g */
    public void mo16357g(int i) {
        this.f5391p = i;
    }

    /* renamed from: p */
    public JSONObject mo16368p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", mo16341b());
            jSONObject.put("cover_url", mo16358h());
            jSONObject.put("cover_width", mo16344c());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, mo16362j());
            jSONObject.put("file_hash", mo16364l());
            jSONObject.put("resolution", mo16356g());
            jSONObject.put("size", mo16350e());
            jSONObject.put("video_duration", mo16353f());
            jSONObject.put("video_url", mo16360i());
            jSONObject.put("playable_download_url", mo16363k());
            jSONObject.put("if_playable_loading_show", mo16369q());
            jSONObject.put("remove_loading_page_type", mo16370r());
            jSONObject.put("fallback_endcard_judge", mo16336a());
            jSONObject.put("video_preload_size", mo16365m());
            jSONObject.put("reward_video_cached_type", mo16366n());
            jSONObject.put("execute_cached_type", mo16367o());
            jSONObject.put("endcard_render", mo16347d());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: q */
    public int mo16369q() {
        return this.f5388m;
    }

    /* renamed from: h */
    public void mo16359h(int i) {
        this.f5388m = i;
    }

    /* renamed from: r */
    public int mo16370r() {
        return this.f5389n;
    }

    /* renamed from: i */
    public void mo16361i(int i) {
        this.f5389n = i;
    }

    /* renamed from: s */
    public boolean mo16371s() {
        return this.f5391p == 1;
    }

    /* renamed from: t */
    public boolean mo16372t() {
        return this.f5390o == 0;
    }
}
