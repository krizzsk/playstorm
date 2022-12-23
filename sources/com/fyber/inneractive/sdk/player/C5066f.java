package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4412g;
import com.fyber.inneractive.sdk.flow.C4418i;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.measurement.C4467h;
import com.fyber.inneractive.sdk.model.vast.C4478b;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.player.C4588a;
import com.fyber.inneractive.sdk.player.C5073i;
import com.fyber.inneractive.sdk.player.controller.C4633c;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4667a;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5365q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.media.Position;
import com.iab.omid.library.fyber.adsession.media.VastProperties;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.f */
public class C5066f extends C4591c implements C4588a.C4589a {

    /* renamed from: D */
    public static final HashMap<String, C5070b> f13559D = new C5067a();

    /* renamed from: A */
    public C4346z f13560A;

    /* renamed from: B */
    public C4412g f13561B;

    /* renamed from: C */
    public boolean f13562C;

    /* renamed from: x */
    public C4478b f13563x;

    /* renamed from: y */
    public C4667a f13564y;

    /* renamed from: z */
    public boolean f13565z;

    /* renamed from: com.fyber.inneractive.sdk.player.f$a */
    public class C5067a extends HashMap<String, C5070b> {

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$a */
        public class C5068a implements C5070b {
            public C5068a(C5067a aVar) {
            }

            /* renamed from: a */
            public String mo25675a(C4640g gVar, VideoClickOrigin videoClickOrigin) {
                return videoClickOrigin.name().toLowerCase();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.f$a$b */
        public class C5069b implements C5070b {
            public C5069b(C5067a aVar) {
            }

            /* renamed from: a */
            public String mo25675a(C4640g gVar, VideoClickOrigin videoClickOrigin) {
                int c;
                if (gVar == null || (c = gVar.mo24864c()) <= 0) {
                    return "00:00:00.000";
                }
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j = (long) c;
                long hours = timeUnit.toHours(j);
                TimeUnit timeUnit2 = TimeUnit.HOURS;
                long minutes = timeUnit.toMinutes(j - timeUnit2.toMillis(hours));
                TimeUnit timeUnit3 = TimeUnit.MINUTES;
                long seconds = timeUnit.toSeconds((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
                return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(timeUnit.toMillis(((j - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)))});
            }
        }

        public C5067a() {
            put("[CLICKAREA]", new C5068a(this));
            put("[ADPLAYHEAD]", new C5069b(this));
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.f$b */
    public interface C5070b {
        /* renamed from: a */
        String mo25675a(C4640g gVar, VideoClickOrigin videoClickOrigin);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5066f(Context context, C5293g gVar, C4346z zVar, InneractiveAdRequest inneractiveAdRequest, C4450y yVar, C4459a aVar) {
        super(context, zVar == null ? null : ((C4345y) zVar).mo24362b().mo24278c(), yVar != null ? yVar.mo24593b() : null);
        this.f13564y = C4667a.Uninitialized;
        this.f13562C = false;
        if (gVar == null || gVar.mo26393f() == null) {
            throw new IllegalArgumentException("IAVastMediaPlayerFlowManager ctor - vastData can't be null");
        }
        this.f11412h = aVar;
        this.f11410f = yVar;
        this.f13563x = gVar.mo26393f();
        this.f13561B = new C4412g(context, gVar, inneractiveAdRequest, this.f11410f.mo24593b());
        this.f11411g = inneractiveAdRequest;
        if (IAlog.f14137a <= 3) {
            IAlog.m16702d("IAVastMediaPlayerFlowManager:ctor - got media files: ", new Object[0]);
            for (int i = 0; i < this.f13563x.mo24683a(); i++) {
                C4489m mVar = (C4489m) ((ArrayList) this.f13563x.mo24685b()).get(i);
                if (mVar != null) {
                    IAlog.m16699a("IAVastMediaPlayerFlowManager(%d): %s", Integer.valueOf(i), mVar.mo24694a());
                }
            }
        }
        if (zVar != null) {
            mo25673a(zVar);
            C4345y yVar2 = (C4345y) zVar;
            if (yVar2.mo24361a() != null) {
                mo24795b(((C4262a0) yVar2.mo24361a()).mo24264b().booleanValue());
            }
        }
        mo25672a(gVar.mo26389b(), inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.mo26390c(), gVar.mo26388a(), zVar);
        if (yVar.mo24593b() != null) {
            this.f11425u = ((C4292j) yVar.mo24593b().mo24338a(C4292j.class)).mo24319a(gVar.mo26389b());
        } else {
            this.f11425u = IAConfigManager.m13429b().mo24350a().mo24345a(gVar.mo26389b() == UnitDisplayType.INTERSTITIAL ? "prebuffer_interstitial" : "prebuffer_rewarded", 10, 0);
        }
    }

    /* renamed from: a */
    public void mo24915a(C4668b bVar) {
        boolean z;
        JSONArray jSONArray;
        String str;
        int i;
        String str2;
        T t;
        VastProperties vastProperties;
        C4668b bVar2 = bVar;
        int i2 = 0;
        IAlog.m16699a("IAMediaPlayerFlowManager: onPlayerStateChanged with - %s", bVar2);
        C5071g gVar = this.f11414j;
        if (gVar != null && bVar2 != C4668b.Prepared) {
            gVar.mo24915a(bVar2);
        } else if (bVar2 == C4668b.Prepared && gVar != null) {
            gVar.f13569d = true;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            IAlog.m16699a("IAMediaPlayerFlowManager: onPlayerPrepared called", new Object[0]);
            if (this.f11420p) {
                IAlog.m16699a("IMediaPlayerFlowManager: onPlayerPrepared is called, but object is already destroyed?? ignore", new Object[0]);
            } else {
                if (this.f11406b.mo24861a() && this.f11406b.mo24867e() != null) {
                    mo24789a(this.f11406b.mo24867e());
                }
                this.f11419o = true;
                mo24787a();
                if (!(this.f11413i == null || this.f11410f == null)) {
                    int intValue = ((C4345y) this.f13560A).f10750f.f10577h.value().intValue();
                    boolean a = C4591c.m14070a(this.f11406b.mo24865d(), this.f13560A, ((C5293g) this.f11410f.f10914b).f14088w);
                    boolean booleanValue = ((C4345y) this.f13560A).f10750f.f10570a.booleanValue();
                    C4466g gVar2 = this.f11413i;
                    if (!a) {
                        intValue = 0;
                    }
                    if (gVar2.f11014b != null) {
                        if (a) {
                            try {
                                vastProperties = VastProperties.createVastPropertiesForSkippableMedia((float) intValue, booleanValue, Position.STANDALONE);
                            } catch (Throwable th) {
                                gVar2.mo24663a(th);
                            }
                        } else {
                            vastProperties = VastProperties.createVastPropertiesForNonSkippableMedia(booleanValue, Position.STANDALONE);
                        }
                        gVar2.f11014b.loaded(vastProperties);
                    }
                }
                if (this.f11424t != null) {
                    C4450y yVar = this.f11410f;
                    if (yVar == null || yVar.f10914b == null || this.f11411g == null) {
                        z = false;
                    } else {
                        z = C4591c.m14070a(this.f11406b.mo24865d(), this.f13560A, ((C5293g) this.f11410f.f10914b).f14088w) && this.f11411g.getAllowFullscreen();
                        ((C5293g) this.f11410f.f10914b).f14083r.setVideo(new ImpressionData.Video(z, (long) ((int) TimeUnit.MILLISECONDS.toSeconds((long) this.f11406b.mo24865d()))));
                    }
                    try {
                        C4450y yVar2 = this.f11410f;
                        C5293g gVar3 = yVar2 != null ? (C5293g) yVar2.f10914b : null;
                        C4567p pVar = C4567p.EVENT_READY_ON_CLIENT;
                        InneractiveAdRequest inneractiveAdRequest = this.f11411g;
                        C4450y yVar3 = this.f11410f;
                        if (yVar3 == null) {
                            jSONArray = null;
                        } else {
                            jSONArray = yVar3.f10915c.mo24342c();
                        }
                        C4569q.C4570a aVar = new C4569q.C4570a(gVar3);
                        aVar.f11365c = pVar;
                        aVar.f11363a = inneractiveAdRequest;
                        aVar.f11366d = jSONArray;
                        if (!(this.f11426v == null || gVar3 == null)) {
                            IAlog.m16699a("Video content loader: Vast load took: " + (System.currentTimeMillis() - gVar3.f14093B) + " msec", new Object[0]);
                            C4450y yVar4 = this.f11410f;
                            if (yVar4 == null || (t = yVar4.f10914b) == null || ((C5293g) t).f14094C == null) {
                                str = "";
                                i = 0;
                            } else {
                                i2 = ((C5293g) t).f14094C.f11067h;
                                i = ((C5293g) t).f14094C.f11068i;
                                str = ((C5293g) t).f14094C.f11060a;
                            }
                            C4569q.C4572b a2 = new C4569q.C4572b().mo24770a("duration", Integer.valueOf(this.f11406b.mo24865d() / 1000)).mo24770a("url", this.f11426v.f11117g).mo24770a(MediaFile.BITRATE, this.f11426v.f11115e);
                            if (TextUtils.isEmpty(this.f11426v.f11114d)) {
                                str2 = "na";
                            } else {
                                str2 = this.f11426v.f11114d;
                            }
                            aVar.f11368f.put(a2.mo24770a("mime", str2).mo24770a(MediaFile.DELIVERY, this.f11426v.f11111a).mo24770a("load_time", Long.valueOf(System.currentTimeMillis() - gVar3.f14093B)).mo24770a("media_file_index", Integer.valueOf(this.f11423s)).mo24770a("player", this.f11406b.mo24868f()).mo24770a("is_video_skippable", Boolean.valueOf(z)).mo24770a("supported_media_files", Integer.valueOf(i2)).mo24770a("total_media_files", Integer.valueOf(i)).mo24770a("vast_version", str).f11378a);
                        }
                        aVar.mo24768a((String) null);
                    } catch (Exception unused) {
                    }
                    C5073i iVar = (C5073i) this.f11424t;
                    if (!iVar.f13576g) {
                        iVar.f13576g = true;
                        C5073i.C5075b bVar3 = iVar.f13573d;
                        if (bVar3 != null) {
                            ((C4418i) bVar3).mo24571d();
                        }
                    }
                }
            }
            mo24787a();
        } else if (ordinal != 3) {
            if (ordinal == 6) {
                this.f11406b.mo24864c();
                mo24787a();
            } else if (ordinal == 7) {
                mo24787a();
            } else if (ordinal == 8) {
                mo24787a();
            }
        } else if (this.f11409e == null) {
            C5348k.m16748m();
            mo24788a((long) (IAConfigManager.f10525J.f10544i.f10681a * 1000));
        }
        int ordinal2 = bVar.ordinal();
        if (ordinal2 != 6) {
            if (ordinal2 == 8) {
                mo25674a(C4667a.f11653g);
            }
        } else if (this.f13564y.equals(C4667a.f11653g)) {
            mo25674a(C4667a.Restarted);
        }
    }

    /* renamed from: c */
    public View mo24796c() {
        C4412g gVar = this.f13561B;
        if (gVar == null || !gVar.f10892f) {
            return null;
        }
        return gVar.f10893g;
    }

    /* renamed from: d */
    public C4633c mo24797d() {
        C4412g gVar = this.f13561B;
        if (gVar != null) {
            return gVar.f10895i;
        }
        return null;
    }

    /* renamed from: e */
    public void mo24916e() {
    }

    /* renamed from: f */
    public C4479c mo24799f() {
        C4478b bVar = this.f13563x;
        if (bVar != null) {
            return bVar.f11066g;
        }
        return null;
    }

    /* renamed from: a */
    public void mo24793a(boolean z) {
        C4309s sVar;
        if (z) {
            if (!this.f13562C) {
                C4567p pVar = C4567p.VAST_DEFAULT_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest = this.f11411g;
                C4450y yVar = this.f11410f;
                C5293g gVar = yVar != null ? (C5293g) yVar.f10914b : null;
                JSONArray c = (yVar == null || (sVar = yVar.f10915c) == null) ? null : sVar.mo24342c();
                C4569q.C4570a aVar = new C4569q.C4570a(gVar);
                aVar.f11365c = pVar;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c;
                aVar.mo24768a((String) null);
                this.f13562C = true;
            }
        } else if (mo24796c() != null && !this.f13561B.f10896j) {
            mo24791a(this.f13563x.f11066g, VideoClickOrigin.COMPANION, C4493q.EVENT_CREATIVE_VIEW);
            C4412g gVar2 = this.f13561B;
            if (!gVar2.f10896j) {
                C4567p pVar2 = C4567p.VAST_COMPANION_DISPLAYED;
                InneractiveAdRequest inneractiveAdRequest2 = gVar2.f10888b;
                C5293g gVar3 = gVar2.f10889c;
                C4309s sVar2 = gVar2.f10890d;
                JSONArray c2 = sVar2 == null ? null : sVar2.mo24342c();
                C4569q.C4570a aVar2 = new C4569q.C4570a(gVar3);
                aVar2.f11365c = pVar2;
                aVar2.f11363a = inneractiveAdRequest2;
                aVar2.f11366d = c2;
                aVar2.mo24767a("companion_data", gVar2.f10891e.f11066g.mo24687a());
                aVar2.mo24768a((String) null);
            }
            gVar2.f10896j = true;
        }
    }

    /* renamed from: a */
    public final void mo25672a(UnitDisplayType unitDisplayType, boolean z, int i, int i2, C4346z zVar) {
        C4412g gVar = this.f13561B;
        gVar.f10898l = unitDisplayType;
        gVar.f10899m = z;
        gVar.f10900n = i;
        gVar.f10901o = i2;
        gVar.f10902p = zVar;
    }

    /* renamed from: a */
    public void mo24914a(int i) {
        int d = this.f11406b.mo24865d();
        int ordinal = this.f13564y.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 4 && i > (d / 4) * 3) {
                        mo25674a(C4667a.ThirdPQuarter);
                        C4466g gVar = this.f11413i;
                        if (gVar != null && gVar.f11015c != null) {
                            IAlog.m16699a("%s thirdQuartile", "OMVideo");
                            try {
                                gVar.f11015c.thirdQuartile();
                            } catch (Throwable th) {
                                gVar.mo24663a(th);
                            }
                        }
                    }
                } else if (i > d / 2) {
                    mo25674a(C4667a.MidPoint);
                    C4466g gVar2 = this.f11413i;
                    if (gVar2 != null && gVar2.f11015c != null) {
                        IAlog.m16699a("%s midpoint", "OMVideo");
                        try {
                            gVar2.f11015c.midpoint();
                        } catch (Throwable th2) {
                            gVar2.mo24663a(th2);
                        }
                    }
                }
            } else if (i > d / 4) {
                mo25674a(C4667a.FirstQuarter);
                C4466g gVar3 = this.f11413i;
                if (gVar3 != null && gVar3.f11015c != null) {
                    IAlog.m16699a("%s firstQuartile", "OMVideo");
                    try {
                        gVar3.f11015c.firstQuartile();
                    } catch (Throwable th3) {
                        gVar3.mo24663a(th3);
                    }
                }
            }
        } else if (this.f11406b.f11583e != C4668b.Buffering) {
            mo25674a(C4667a.Started);
            C4466g gVar4 = this.f11413i;
            if (gVar4 != null) {
                if (gVar4.f11014b != null && !gVar4.f11017e) {
                    IAlog.m16699a("%s impression", "OMVideo");
                    gVar4.f11017e = true;
                    try {
                        gVar4.f11014b.impressionOccurred();
                    } catch (Throwable th4) {
                        gVar4.mo24663a(th4);
                    }
                }
                C4466g gVar5 = this.f11413i;
                long d2 = (long) this.f11406b.mo24865d();
                float f = this.f11406b.mo24871i() ? 0.0f : 1.0f;
                if (gVar5.f11015c != null && !gVar5.f11016d) {
                    gVar5.f11016d = true;
                    IAlog.m16699a("%s start", "OMVideo");
                    try {
                        gVar5.f11015c.start((float) d2, f);
                    } catch (Throwable th5) {
                        gVar5.mo24663a(th5);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24790a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject) {
        mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_ERROR);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!(this.f11426v == null || inneractiveVideoError.getPlayerError() == InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES)) {
                jSONObject.put("url", this.f11426v.f11117g);
                jSONObject.put(MediaFile.BITRATE, this.f11426v.f11115e);
                jSONObject.put("mime", this.f11426v.f11114d);
                jSONObject.put(MediaFile.DELIVERY, this.f11426v.f11111a);
            }
            C4640g gVar = this.f11406b;
            jSONObject.put("player", gVar != null ? gVar.mo24868f() : "");
            if (inneractiveVideoError.getCause() != null) {
                jSONObject.put("exception", inneractiveVideoError.getCause().getClass().getName());
                jSONObject.put("message", inneractiveVideoError.getCause().getMessage() == null ? "empty" : inneractiveVideoError.getCause().getMessage());
            }
        } catch (Exception unused) {
            IAlog.m16699a("onReportError: Failed creating Json object from media file!", new Object[0]);
        }
        IAlog.m16703e("IAMediaPlayerFlowManager: reporting error to listeners: %s", inneractiveVideoError.getPlayerError().toString());
        C5072h hVar = this.f11424t;
        if (hVar != null) {
            try {
                ((C5073i) hVar).mo25678a(inneractiveVideoError, (InneractiveErrorCode) null, jSONObject, this.f11422r);
            } catch (Exception e) {
                if (IAlog.f14137a <= 3) {
                    e.printStackTrace();
                }
            }
        }
        C5365q qVar = this.f11417m;
        if (qVar != null) {
            qVar.cancel(true);
            qVar.f14234b = null;
            this.f11418n = null;
        }
        mo24787a();
    }

    /* renamed from: a */
    public void mo24791a(C5295i iVar, VideoClickOrigin videoClickOrigin, C4493q... qVarArr) {
        if (qVarArr.length == 0) {
            IAlog.m16703e("IAVastMediaPlayerFlowManager: eventTypes array is empty", new Object[0]);
        } else if (iVar == null) {
            IAlog.m16703e("IAVastMediaPlayerFlowManager: parser is null", new Object[0]);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C4493q qVar : qVarArr) {
                String str = qVar.f11150a;
                IAlog.m16699a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
                List<String> a = iVar.mo24664a(qVar);
                if (a == null || a.size() == 0) {
                    IAlog.m16699a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
                } else {
                    arrayList.addAll(a);
                    IAlog.m16699a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                    m15434a(a, qVar);
                }
                if (qVar == C4493q.EVENT_CLICK) {
                    for (Map.Entry next : f13559D.entrySet()) {
                        String str2 = (String) next.getKey();
                        String a2 = ((C5070b) next.getValue()).mo25675a(this.f11406b, videoClickOrigin);
                        for (int i = 0; i < arrayList.size(); i++) {
                            String str3 = (String) arrayList.get(i);
                            if (str3.contains(str2)) {
                                arrayList.set(i, str3.replace(str2, a2));
                            }
                        }
                    }
                }
            }
            C4591c.m14069a((List<String>) arrayList);
        }
    }

    /* renamed from: a */
    public static void m15433a(C5295i iVar, C4493q... qVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C4493q qVar : qVarArr) {
            String str = qVar.f11150a;
            IAlog.m16699a("IAVastMediaPlayerFlowManager: Firing events for type: %s", str);
            List<String> a = ((C4467h) iVar).mo24664a(qVar);
            if (a == null || a.size() == 0) {
                IAlog.m16699a("IAVastMediaPlayerFlowManager: no events for type: %s", str);
            } else {
                arrayList.addAll(a);
                IAlog.m16699a("found %d events for type: %s", Integer.valueOf(a.size()), str);
                m15434a(a, qVar);
            }
        }
        C4591c.m14069a((List<String>) arrayList);
    }

    /* renamed from: a */
    public static void m15434a(List<String> list, C4493q qVar) {
        for (String next : list) {
            IAlog.m16699a("   event url: %s", next);
            if (!TextUtils.isEmpty(next)) {
                int i = IAlog.f14137a;
                IAlog.m16697a(1, (Exception) null, "%s %s %s", "VAST_EVENT", qVar.f11150a, next);
                IAlog.m16697a(1, (Exception) null, "Tracking URLs array: %s", "VPAID", next);
            }
        }
    }

    /* renamed from: a */
    public final void mo25674a(C4667a aVar) {
        if (this.f13564y != aVar) {
            if (aVar == C4667a.Started) {
                this.f13565z = false;
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_IMPRESSION, C4493q.EVENT_START);
            } else if (aVar == C4667a.FirstQuarter) {
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_FIRSTQ);
            } else if (aVar == C4667a.MidPoint) {
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_MID);
            } else if (aVar == C4667a.ThirdPQuarter) {
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_THIRDQ);
            } else if (aVar == C4667a.f11653g && !this.f13565z) {
                this.f13565z = true;
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_COMPLETE);
            } else if (aVar == C4667a.Restarted) {
                mo24791a(this.f13563x, VideoClickOrigin.InvalidOrigin, C4493q.EVENT_REWIND);
            }
            this.f13564y = aVar;
        }
    }

    /* renamed from: a */
    public void mo25673a(C4346z zVar) {
        this.f13560A = zVar;
    }
}
