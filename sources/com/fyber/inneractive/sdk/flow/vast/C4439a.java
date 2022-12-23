package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.vast.C4442c;
import com.fyber.inneractive.sdk.measurement.C4467h;
import com.fyber.inneractive.sdk.measurement.C4468i;
import com.fyber.inneractive.sdk.measurement.C4469j;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4480d;
import com.fyber.inneractive.sdk.model.vast.C4481e;
import com.fyber.inneractive.sdk.model.vast.C4482f;
import com.fyber.inneractive.sdk.model.vast.C4483g;
import com.fyber.inneractive.sdk.model.vast.C4484h;
import com.fyber.inneractive.sdk.model.vast.C4485i;
import com.fyber.inneractive.sdk.model.vast.C4486j;
import com.fyber.inneractive.sdk.model.vast.C4488l;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4490n;
import com.fyber.inneractive.sdk.model.vast.C4492p;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.model.vast.C4496s;
import com.fyber.inneractive.sdk.player.C5066f;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.C5320d0;
import com.fyber.inneractive.sdk.util.C5350l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.a */
public class C4439a {

    /* renamed from: a */
    public int f10972a = -1;

    /* renamed from: b */
    public int f10973b = -1;

    /* renamed from: c */
    public int f10974c = -1;

    /* renamed from: d */
    public boolean f10975d = false;

    /* renamed from: e */
    public boolean f10976e = false;

    /* renamed from: f */
    public Map<C4489m, C4442c> f10977f = new LinkedHashMap();

    /* renamed from: g */
    public List<C4482f> f10978g = new ArrayList();

    /* renamed from: h */
    public final List<C4482f> f10979h = new ArrayList();

    /* renamed from: i */
    public final List<C4468i> f10980i = new ArrayList();

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a */
    public class C4440a extends Exception {

        /* renamed from: a */
        public int f10981a;

        public C4440a(C4439a aVar, String str, int i) {
            super(str);
            this.f10981a = i;
        }
    }

    /* renamed from: a */
    public void mo24635a(C4478b bVar, C4482f fVar, boolean z) throws C4440a {
        Integer num;
        String str;
        List<C4492p> list;
        String str2;
        Integer num2;
        C4482f fVar2 = fVar;
        List<String> list2 = fVar2.f11091h;
        if (list2 != null) {
            if (z) {
                this.f10979h.add(fVar2);
            }
            for (String f : list2) {
                if (!C5320d0.m16722f(f)) {
                    throw new C4440a(this, "Found non secure click tracking url for companion: " + fVar2, 0);
                }
            }
        }
        String str3 = fVar2.f11090g;
        if (C5320d0.m16722f(str3)) {
            Integer num3 = fVar2.f11084a;
            Integer num4 = fVar2.f11085b;
            boolean z2 = true;
            if (num3 != null && num4 != null && num3.intValue() >= 100 && num4.intValue() >= 100) {
                String str4 = fVar2.f11086c;
                List<C4492p> list3 = fVar2.f11093j;
                if (list3 != null) {
                    for (C4492p next : list3) {
                        if (!C5320d0.m16722f(next.f11128b)) {
                            throw new C4440a(this, "Found non secure tracking event: " + next, 0);
                        }
                    }
                }
                if (TextUtils.isEmpty(fVar2.f11088e) && TextUtils.isEmpty(fVar2.f11089f) && fVar2.f11087d == null) {
                    z2 = false;
                }
                if (z2) {
                    String str5 = fVar2.f11088e;
                    if (C5320d0.m16722f(str5)) {
                        C4485i iVar = fVar2.f11087d;
                        if (iVar != null) {
                            String str6 = iVar.f11102a;
                            C4484h hVar = C4484h.Gif;
                            C4484h hVar2 = !TextUtils.isEmpty(str6) ? (C4484h) ((HashMap) C4484h.f11099c).get(str6.toLowerCase()) : null;
                            if (hVar2 != null) {
                                str2 = str5;
                                list = list3;
                                str = str4;
                                num = num4;
                                num2 = num3;
                                mo24636a(bVar, C4483g.Static, z, num3.intValue(), num4.intValue(), str4, str3, list2, list, iVar.f11103b, hVar2);
                            } else {
                                throw new C4440a(this, "Found invalid creative type:" + iVar.f11102a, 0);
                            }
                        } else {
                            str2 = str5;
                            list = list3;
                            str = str4;
                            num = num4;
                            num2 = num3;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            mo24636a(bVar, C4483g.Iframe, z, num2.intValue(), num.intValue(), str, str3, list2, list, str2, (C4484h) null);
                        }
                        String str7 = fVar2.f11089f;
                        if (!TextUtils.isEmpty(str7)) {
                            mo24636a(bVar, C4483g.Html, z, num2.intValue(), num.intValue(), str, str3, list2, list, str7, (C4484h) null);
                            return;
                        }
                        return;
                    }
                    throw new C4440a(this, "Found non secure iframe url:" + str5, 0);
                }
                throw new C4440a(this, "None sources of companion avaliable", 0);
            }
            throw new C4440a(this, "Incompatible size: " + num3 + "," + num4, 16);
        }
        throw new C4440a(this, "Found non secure click through url: " + str3, 0);
    }

    /* renamed from: a */
    public C4478b mo24633a(C4480d dVar, List<C4480d> list, String str) throws C4445e {
        IAlog.m16699a("%sprocess started", "VastProcessor: ");
        if (dVar == null || dVar.f11079c == null) {
            IAlog.m16699a("%sno inline found", "VastProcessor: ");
            throw new C4445e("ErrorNoMediaFiles", "Empty inline ad found");
        }
        int e = C5350l.m16769e();
        int d = C5350l.m16767d();
        C4478b bVar = new C4478b(new C4444d(this.f10974c, e, d), new C4441b(e, d));
        bVar.f11060a = str;
        List<C4486j> list2 = dVar.f11079c.f11082c;
        if (list2 == null || list2.isEmpty()) {
            throw new C4445e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list != null) {
            for (C4480d dVar2 : list) {
                C4496s sVar = dVar2.f11078b;
                if (sVar != null) {
                    mo24634a(bVar, (C4481e) sVar, true);
                }
            }
        }
        mo24634a(bVar, (C4481e) dVar.f11079c, false);
        if (bVar.f11063d.size() != 0) {
            if (IAlog.f14137a == 2) {
                IAlog.m16702d("%sLogging merged model media files: ", "VastProcessor: ");
                Iterator it = new ArrayList(bVar.f11063d).iterator();
                int i = 0;
                while (it.hasNext()) {
                    IAlog.m16702d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), (C4489m) it.next());
                    i++;
                }
            }
            if (IAlog.f14137a == 2) {
                IAlog.m16702d("%sLogging merged model companion ads: ", "VastProcessor: ");
                ArrayList arrayList = new ArrayList(bVar.f11065f);
                if (arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        IAlog.m16702d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((C4479c) it2.next()).mo24687a());
                        i2++;
                    }
                } else {
                    IAlog.m16702d("%sNo companion ads found!", "VastProcessor: ");
                }
            }
            return bVar;
        } else if (this.f10977f.size() == 0) {
            throw new C4445e("ErrorNoMediaFiles", "No media files exist after merge");
        } else {
            throw new C4445e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
    }

    /* renamed from: a */
    public final void mo24634a(C4478b bVar, C4481e eVar, boolean z) {
        String[] split;
        C4442c cVar;
        Integer num;
        int i;
        List list;
        IAlog.m16699a("%sprocessing ad element: %s", "VastProcessor: ", eVar);
        List<String> list2 = eVar.f11081b;
        if (list2 != null) {
            for (String next : list2) {
                IAlog.m16699a("%sadding impression url: %s", "VastProcessor: ", next);
                mo24637a((C5295i) bVar, C4493q.EVENT_IMPRESSION, next);
            }
        }
        String str = eVar.f11080a;
        if (!TextUtils.isEmpty(str)) {
            IAlog.m16699a("%sadding error url: %s", "VastProcessor: ", str);
            bVar.mo24684a(C4493q.EVENT_ERROR, str);
        }
        if (IAConfigManager.f10525J.f10535I != null) {
            for (C4468i next2 : eVar.f11083d) {
                if (next2.mo24667b()) {
                    bVar.f11064e.add(next2);
                } else {
                    C4493q qVar = C4493q.EVENT_VERIFICATION_NOT_EXECUTED;
                    Map<C4493q, List<String>> map = next2.f11023c;
                    if (map == null || (list = map.get(qVar)) == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    if (i > 0) {
                        C5066f.m15433a((C5295i) new C4467h(next2, next2.mo24664a(qVar), C4469j.VERIFICATION_NOT_SUPPORTED), qVar);
                    }
                    this.f10980i.add(next2);
                }
            }
        }
        for (C4486j next3 : eVar.f11082c) {
            C4488l lVar = next3.f11104a;
            if (lVar != null) {
                List<C4489m> list3 = lVar.f11106a;
                if (list3 != null) {
                    bVar.f11068i = list3.size();
                    for (C4489m next4 : list3) {
                        C4442c cVar2 = null;
                        if (!next4.f11111a.equals("progressive")) {
                            cVar2 = new C4442c(C4442c.C4443a.UNSUPPORTED_DELIVERY, "progressive");
                        } else {
                            if (!(!(this.f10973b > -1) || (num = next4.f11115e) == null || num.intValue() == 0)) {
                                int intValue = next4.f11115e.intValue();
                                int i2 = this.f10972a;
                                if (intValue < i2) {
                                    cVar2 = new C4442c(C4442c.C4443a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                                } else {
                                    int intValue2 = next4.f11115e.intValue();
                                    int i3 = this.f10973b;
                                    if (intValue2 > i3) {
                                        cVar2 = new C4442c(C4442c.C4443a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i3));
                                    }
                                }
                            }
                            String str2 = next4.f11114d;
                            HashMap hashMap = (HashMap) C4490n.f11122f;
                            if (!((hashMap.containsKey(str2) ? (C4490n) hashMap.get(str2) : C4490n.UNKNOWN) != C4490n.UNKNOWN)) {
                                cVar = new C4442c(C4442c.C4443a.UNSUPPORTED_MIME_TYPE, (Object) null);
                            } else if (!this.f10975d || next4.f11112b.intValue() < next4.f11113c.intValue()) {
                                String str3 = next4.f11116f;
                                if (str3 != null && this.f10976e && str3.equalsIgnoreCase("VPAID")) {
                                    cVar = new C4442c(C4442c.C4443a.FILTERED_BY_APP_OR_UNIT, (Object) null);
                                } else if (TextUtils.isEmpty(next4.f11117g)) {
                                    cVar = new C4442c(C4442c.C4443a.NO_CONTENT, (Object) null);
                                } else if (!C5320d0.m16722f(next4.f11117g)) {
                                    cVar = new C4442c(C4442c.C4443a.UNSECURED_VIDEO_URL, (Object) null);
                                }
                            } else {
                                cVar = new C4442c(C4442c.C4443a.VERTICAL_VIDEO_EXPECTED, (Object) null);
                            }
                            cVar2 = cVar;
                        }
                        if (cVar2 != null) {
                            IAlog.m16699a("%smedia file filtered!: %s", "VastProcessor: ", next4);
                            IAlog.m16699a("%s-- %s", "VastProcessor: ", next4);
                            IAlog.m16699a("%s-- %s", "VastProcessor: ", cVar2);
                            this.f10977f.put(next4, cVar2);
                        } else {
                            IAlog.m16699a("%sadding media file: %s", "VastProcessor: ", next4);
                            bVar.f11063d.add(next4);
                            bVar.f11067h++;
                        }
                    }
                }
                List<String> list4 = lVar.f11109d;
                if (list4 != null) {
                    for (String a : list4) {
                        mo24637a((C5295i) bVar, C4493q.EVENT_CLICK, a);
                    }
                }
                List<C4492p> list5 = lVar.f11107b;
                if (list5 != null) {
                    for (C4492p next5 : list5) {
                        C4493q a2 = C4493q.m13870a(next5.f11127a);
                        if (a2 != C4493q.UNKNOWN) {
                            bVar.mo24684a(a2, next5.f11128b);
                        }
                    }
                }
                bVar.f11061b = lVar.f11108c;
                String str4 = lVar.f11110e;
                if (!TextUtils.isEmpty(str4) && (split = str4.split(CertificateUtil.DELIMITER)) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str4);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            List<C4482f> list6 = next3.f11105b;
            if (list6 != null) {
                for (C4482f next6 : list6) {
                    try {
                        mo24635a(bVar, next6, z);
                    } catch (C4440a e) {
                        IAlog.m16699a("Failed processing companion ad: %s error = %s", next6, e.getMessage());
                        next6.f11092i = e;
                        this.f10978g.add(next6);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24637a(C5295i iVar, C4493q qVar, String str) throws C4445e {
        if (C5320d0.m16722f(str)) {
            ((C4478b) iVar).mo24684a(qVar, str);
            return;
        }
        throw new C4445e("VastErrorUnsecure", "found unsecure tracking event: " + qVar.f11150a);
    }

    /* renamed from: a */
    public void mo24636a(C4478b bVar, C4483g gVar, boolean z, int i, int i2, String str, String str2, List<String> list, List<C4492p> list2, String str3, C4484h hVar) {
        C4479c cVar = new C4479c(gVar, i, i2, str);
        cVar.f11075g = str2;
        if (list2 != null) {
            for (C4492p next : list2) {
                cVar.mo24688a(C4493q.m13870a(next.f11127a), next.f11128b);
            }
        }
        if (list != null) {
            for (String a : list) {
                cVar.mo24688a(C4493q.EVENT_CLICK, a);
            }
        }
        mo24638a(cVar, z);
        cVar.f11074f = str3;
        cVar.f11070b = hVar;
        bVar.f11065f.add(cVar);
    }

    /* renamed from: a */
    public boolean mo24638a(C4479c cVar, boolean z) {
        boolean z2 = false;
        if (!this.f10979h.isEmpty()) {
            C4482f fVar = null;
            if (z) {
                List<C4482f> list = this.f10979h;
                fVar = list.remove(list.size() - 1);
            }
            String str = cVar.f11073e;
            for (C4482f next : this.f10979h) {
                String str2 = next.f11086c;
                if ((str != null && str.equals(str2)) || (str2 == null && cVar.f11071c == next.f11084a.intValue() && cVar.f11072d == next.f11085b.intValue())) {
                    List<String> list2 = next.f11091h;
                    if (list2 != null) {
                        for (String next2 : list2) {
                            if (C5320d0.m16722f(next2)) {
                                cVar.mo24688a(C4493q.EVENT_CLICK, next2);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (fVar != null) {
                this.f10979h.add(fVar);
            }
        }
        return z2;
    }
}
