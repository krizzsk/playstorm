package com.bytedance.sdk.component.p120e.p123c;

import com.smaato.sdk.video.vast.model.ErrorCode;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.e.c.c */
/* compiled from: TNCConfig */
public class C2926c {

    /* renamed from: a */
    public boolean f6624a = false;

    /* renamed from: b */
    public boolean f6625b = true;

    /* renamed from: c */
    public Map<String, Integer> f6626c = null;

    /* renamed from: d */
    public Map<String, String> f6627d = null;

    /* renamed from: e */
    public int f6628e = 10;

    /* renamed from: f */
    public int f6629f = 1;

    /* renamed from: g */
    public int f6630g = 1;

    /* renamed from: h */
    public int f6631h = 10;

    /* renamed from: i */
    public int f6632i = 1;

    /* renamed from: j */
    public int f6633j = 1;

    /* renamed from: k */
    public int f6634k = ErrorCode.UNDEFINED_ERROR;

    /* renamed from: l */
    public int f6635l = 120;

    /* renamed from: m */
    public String f6636m = null;

    /* renamed from: n */
    public int f6637n = 0;

    /* renamed from: o */
    public long f6638o = 0;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.f6624a);
        sb.append(" probeEnable: ");
        sb.append(this.f6625b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.f6626c;
        int i = 0;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.f6627d;
        if (map2 != null) {
            i = map2.size();
        }
        sb.append(i);
        sb.append(" reqTo: ");
        sb.append(this.f6628e);
        sb.append("#");
        sb.append(this.f6629f);
        sb.append("#");
        sb.append(this.f6630g);
        sb.append(" reqErr: ");
        sb.append(this.f6631h);
        sb.append("#");
        sb.append(this.f6632i);
        sb.append("#");
        sb.append(this.f6633j);
        sb.append(" updateInterval: ");
        sb.append(this.f6634k);
        sb.append(" updateRandom: ");
        sb.append(this.f6635l);
        sb.append(" httpBlack: ");
        sb.append(this.f6636m);
        return sb.toString();
    }
}
