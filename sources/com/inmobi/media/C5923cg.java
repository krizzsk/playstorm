package com.inmobi.media;

import android.text.TextUtils;
import com.facebook.share.internal.ShareConstants;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cg */
/* compiled from: NativeVideoAsset */
public final class C5923cg extends C5901bt {

    /* renamed from: A */
    public boolean f15007A;

    /* renamed from: B */
    public boolean f15008B;

    /* renamed from: C */
    public boolean f15009C;

    /* renamed from: D */
    public boolean f15010D;

    /* renamed from: E */
    public int f15011E;

    /* renamed from: F */
    public int f15012F;

    /* renamed from: G */
    public Map<String, Object> f15013G;

    /* renamed from: H */
    private boolean f15014H;

    /* renamed from: z */
    List<C5901bt> f15015z = new ArrayList();

    /* renamed from: com.inmobi.media.cg$a */
    /* compiled from: NativeVideoAsset */
    static class C5924a extends C5902bu {
        public C5924a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C5916cc ccVar) {
            super(i, i2, i3, i4, i5, i6, i7, i8, "none", "straight", "#ff000000", "#00000000", ccVar);
        }
    }

    public C5923cg(String str, String str2, C5902bu buVar, C6001dt dtVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, List<C5922cf> list, JSONObject jSONObject, boolean z6) {
        super(str, str2, ShareConstants.VIDEO_URL, buVar);
        this.f14896e = dtVar;
        this.f14900i = 2;
        this.f15007A = z;
        this.f15008B = z2;
        this.f15009C = z3;
        this.f15010D = z4;
        this.f15014H = z6;
        if (dtVar != null) {
            this.f14909r = dtVar.mo35105a();
            List<C5922cf> d = dtVar.mo35110d();
            Map<String, String> map = null;
            if (list != null) {
                for (C5922cf next : list) {
                    if ("OMID_VIEWABILITY".equals(next.f15004d)) {
                        map = next.f15005e;
                        if (!TextUtils.isEmpty(next.f15002b)) {
                            d.add(next);
                        }
                    } else {
                        d.add(next);
                    }
                }
            }
            for (C5922cf next2 : d) {
                if ("OMID_VIEWABILITY".equals(next2.f15004d)) {
                    next2.f15005e = map;
                }
            }
            if (!d.isEmpty()) {
                mo34878a(d);
            }
        }
        if (jSONObject != null) {
            this.f14897f = jSONObject;
        }
        this.f14913v.put("placementType", (byte) 0);
        this.f14913v.put("lastVisibleTimestamp", Integer.MIN_VALUE);
        this.f14913v.put(TJAdUnitConstants.String.VISIBLE, Boolean.FALSE);
        this.f14913v.put("seekPosition", 0);
        this.f14913v.put("didStartPlaying", Boolean.FALSE);
        this.f14913v.put("didPause", Boolean.FALSE);
        this.f14913v.put("didCompleteQ1", Boolean.FALSE);
        this.f14913v.put("didCompleteQ2", Boolean.FALSE);
        this.f14913v.put("didCompleteQ3", Boolean.FALSE);
        this.f14913v.put("didCompleteQ4", Boolean.FALSE);
        this.f14913v.put("didRequestFullScreen", Boolean.FALSE);
        this.f14913v.put("isFullScreen", Boolean.FALSE);
        this.f14913v.put("didImpressionFire", Boolean.FALSE);
        this.f14913v.put("mapViewabilityParams", new HashMap());
        this.f14913v.put("didSignalVideoCompleted", Boolean.FALSE);
        this.f14913v.put("shouldAutoPlay", Boolean.valueOf(z5));
        this.f14913v.put("lastMediaVolume", 0);
        this.f14913v.put("currentMediaVolume", 0);
        this.f14913v.put("didQ4Fire", Boolean.FALSE);
    }

    /* renamed from: a */
    public final boolean mo34919a() {
        if (this.f15014H) {
            return this.f15007A && !C6227ho.m18558e();
        }
        return this.f15007A;
    }

    /* renamed from: a */
    public final void mo34918a(C5923cg cgVar) {
        this.f14913v.putAll(cgVar.f14913v);
        this.f15013G.putAll(cgVar.f15013G);
        this.f14912u = cgVar.f14912u;
    }

    /* renamed from: b */
    public final C6001dt mo34920b() {
        if (this.f14896e == null) {
            return null;
        }
        return (C6001dt) this.f14896e;
    }
}
