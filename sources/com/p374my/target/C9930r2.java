package com.p374my.target;

import com.p374my.target.common.models.VideoData;
import com.vungle.warren.model.Advertisement;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.my.target.r2 */
public class C9930r2 extends C9916q2 {

    /* renamed from: b */
    public final HashMap<String, C9984u2<VideoData>> f24597b;

    public C9930r2() {
        HashMap<String, C9984u2<VideoData>> hashMap = new HashMap<>();
        this.f24597b = hashMap;
        hashMap.put("preroll", C9984u2.m29444c("preroll"));
        hashMap.put("pauseroll", C9984u2.m29444c("pauseroll"));
        hashMap.put("midroll", C9984u2.m29444c("midroll"));
        hashMap.put(Advertisement.KEY_POSTROLL, C9984u2.m29444c(Advertisement.KEY_POSTROLL));
    }

    /* renamed from: e */
    public static C9930r2 m29123e() {
        return new C9930r2();
    }

    /* renamed from: a */
    public int mo65292a() {
        int i = 0;
        for (C9984u2<VideoData> a : this.f24597b.values()) {
            i += a.mo65292a();
        }
        return i;
    }

    /* renamed from: a */
    public C9984u2<VideoData> mo65321a(String str) {
        return this.f24597b.get(str);
    }

    /* renamed from: c */
    public ArrayList<C9984u2<VideoData>> mo65322c() {
        return new ArrayList<>(this.f24597b.values());
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo65323d() {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, com.my.target.u2<com.my.target.common.models.VideoData>> r0 = r3.f24597b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0024
            java.lang.Object r1 = r0.next()
            com.my.target.u2 r1 = (com.p374my.target.C9984u2) r1
            int r2 = r1.mo65292a()
            if (r2 > 0) goto L_0x0022
            boolean r1 = r1.mo65539i()
            if (r1 == 0) goto L_0x000a
        L_0x0022:
            r0 = 1
            return r0
        L_0x0024:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9930r2.mo65323d():boolean");
    }
}
