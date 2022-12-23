package com.fyber.inneractive.sdk.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import com.fyber.inneractive.sdk.config.C4262a0;
import com.fyber.inneractive.sdk.config.C4345y;
import com.fyber.inneractive.sdk.config.C4346z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.config.global.C4309s;
import com.fyber.inneractive.sdk.config.global.features.C4292j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4450y;
import com.fyber.inneractive.sdk.measurement.C4459a;
import com.fyber.inneractive.sdk.measurement.C4466g;
import com.fyber.inneractive.sdk.model.vast.C4479c;
import com.fyber.inneractive.sdk.model.vast.C4489m;
import com.fyber.inneractive.sdk.model.vast.C4493q;
import com.fyber.inneractive.sdk.network.C4547h0;
import com.fyber.inneractive.sdk.network.C4559m0;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.player.controller.C4631a;
import com.fyber.inneractive.sdk.player.controller.C4633c;
import com.fyber.inneractive.sdk.player.controller.C4635d;
import com.fyber.inneractive.sdk.player.controller.C4640g;
import com.fyber.inneractive.sdk.player.enums.C4668b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5293g;
import com.fyber.inneractive.sdk.response.C5295i;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5365q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.MediaFile;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.c */
public abstract class C4591c implements C4640g.C4646f, C4640g.C4645e {

    /* renamed from: a */
    public Context f11405a;

    /* renamed from: b */
    public C4640g f11406b;

    /* renamed from: c */
    public String f11407c;

    /* renamed from: d */
    public final C4309s f11408d;

    /* renamed from: e */
    public Runnable f11409e;

    /* renamed from: f */
    public C4450y f11410f;

    /* renamed from: g */
    public InneractiveAdRequest f11411g;

    /* renamed from: h */
    public C4459a f11412h;

    /* renamed from: i */
    public C4466g f11413i;

    /* renamed from: j */
    public C5071g f11414j = null;

    /* renamed from: k */
    public boolean f11415k = true;

    /* renamed from: l */
    public Bitmap f11416l;

    /* renamed from: m */
    public C5365q f11417m;

    /* renamed from: n */
    public C5365q.C5366a f11418n;

    /* renamed from: o */
    public boolean f11419o = false;

    /* renamed from: p */
    public volatile boolean f11420p = false;

    /* renamed from: q */
    public boolean f11421q = false;

    /* renamed from: r */
    public boolean f11422r = false;

    /* renamed from: s */
    public int f11423s = 0;

    /* renamed from: t */
    public C5072h f11424t;

    /* renamed from: u */
    public int f11425u;

    /* renamed from: v */
    public C4489m f11426v;

    /* renamed from: w */
    public C4640g.C4644d f11427w = new C4593b();

    /* renamed from: com.fyber.inneractive.sdk.player.c$a */
    public class C4592a implements Runnable {
        public C4592a() {
        }

        public void run() {
            C4591c cVar = C4591c.this;
            IAlog.m16699a("IAMediaPlayerFlowManager: onBufferTimeout reached: mBufferTimeoutRunnable = %s isDestroyed = %s", cVar.f11409e, Boolean.valueOf(cVar.f11420p));
            if (cVar.f11409e != null && !cVar.f11420p) {
                cVar.f11422r = true;
                int c = cVar.f11406b.mo24864c();
                int d = cVar.f11406b.mo24865d();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", d);
                    jSONObject.put("position", c);
                } catch (JSONException unused) {
                }
                cVar.f11409e = null;
                if (!cVar.f11419o) {
                    C4640g gVar = cVar.f11406b;
                    if (gVar != null) {
                        gVar.mo24862b();
                        cVar.f11406b = null;
                        cVar.mo24794b();
                    }
                    cVar.mo24790a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT), (JSONObject) null);
                    return;
                }
                cVar.mo24790a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT), jSONObject);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$b */
    public class C4593b implements C4640g.C4644d {
        public C4593b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$c */
    public interface C4594c {
        /* renamed from: a */
        void mo24802a(C4591c cVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c$d */
    public class C4595d extends Exception {
    }

    public C4591c(Context context, Set<Vendor> set, C4309s sVar) {
        this.f11405a = context;
        this.f11408d = sVar;
        mo24794b();
    }

    /* renamed from: a */
    public void mo24789a(Bitmap bitmap) {
        IAlog.m16699a("IAMediaPlayerFlowManager: saving snapshot %s", bitmap);
        this.f11416l = null;
        this.f11416l = bitmap;
    }

    /* renamed from: a */
    public abstract void mo24790a(InneractiveVideoError inneractiveVideoError, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo24791a(C5295i iVar, VideoClickOrigin videoClickOrigin, C4493q... qVarArr);

    /* renamed from: a */
    public abstract void mo24793a(boolean z);

    /* renamed from: b */
    public final void mo24794b() {
        C4640g gVar;
        boolean z;
        Context context = this.f11405a;
        C4309s sVar = this.f11408d;
        if (sVar != null) {
            try {
                z = ((C4292j) sVar.mo24338a(C4292j.class)).mo24313a("use_fmp_cache_mechanism", false);
            } catch (Throwable th) {
                if (IAlog.f14137a <= 3) {
                    IAlog.m16699a("Failed creating exo player", new Object[0]);
                    th.printStackTrace();
                }
                gVar = null;
            }
        } else {
            z = false;
        }
        gVar = new C4635d(context, z, sVar);
        if (gVar == null) {
            gVar = new C4631a(context);
        }
        this.f11406b = gVar;
        List<C4640g.C4646f> list = gVar.f11580b;
        if (list != null && !list.contains(this)) {
            gVar.f11580b.add(this);
        }
        C4640g gVar2 = this.f11406b;
        List<C4640g.C4645e> list2 = gVar2.f11581c;
        if (list2 != null && !list2.contains(this)) {
            gVar2.f11581c.add(this);
        }
        this.f11406b.f11584f = this.f11427w;
    }

    /* renamed from: c */
    public abstract View mo24796c();

    /* renamed from: d */
    public abstract C4633c mo24797d();

    /* renamed from: e */
    public void mo24798e(boolean z) {
        JSONArray jSONArray;
        String str;
        try {
            C4450y yVar = this.f11410f;
            C5293g gVar = yVar != null ? (C5293g) yVar.f10914b : null;
            C4567p pVar = C4567p.VAST_MEDIA_LOAD_RETRY_ATTEMPTED;
            InneractiveAdRequest inneractiveAdRequest = this.f11411g;
            C4450y yVar2 = this.f11410f;
            if (yVar2 == null) {
                jSONArray = null;
            } else {
                jSONArray = yVar2.f10915c.mo24342c();
            }
            C4569q.C4570a aVar = new C4569q.C4570a(gVar);
            aVar.f11365c = pVar;
            aVar.f11363a = inneractiveAdRequest;
            aVar.f11366d = jSONArray;
            if (!(this.f11426v == null || gVar == null)) {
                C4569q.C4572b a = new C4569q.C4572b().mo24770a("waudio", String.valueOf(z)).mo24770a("url", this.f11426v.f11117g).mo24770a(MediaFile.BITRATE, this.f11426v.f11115e);
                if (TextUtils.isEmpty(this.f11426v.f11114d)) {
                    str = "na";
                } else {
                    str = this.f11426v.f11114d;
                }
                aVar.f11368f.put(a.mo24770a("mime", str).mo24770a(MediaFile.DELIVERY, this.f11426v.f11111a).mo24770a("media_file_index", Integer.valueOf(this.f11423s)).mo24770a("player", this.f11406b.mo24868f()).f11378a);
            }
            aVar.mo24768a((String) null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public abstract C4479c mo24799f();

    /* renamed from: g */
    public void mo24800g() {
        C4640g gVar = this.f11406b;
        if (gVar != null) {
            C4668b bVar = gVar.f11583e;
            if (bVar == C4668b.f11663i || bVar == C4668b.Prepared) {
                gVar.mo24857a(1, true);
            } else {
                gVar.mo24873l();
            }
        }
    }

    /* renamed from: a */
    public void mo24792a(Exception exc) {
        Object[] objArr = new Object[1];
        objArr[0] = exc != null ? exc.getMessage() : "no exception";
        IAlog.m16699a("IMediaPlayerFlowManager: onPlayerError called with: %s", objArr);
        InneractiveVideoError inneractiveVideoError = new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE, exc);
        if (exc instanceof C4595d) {
            ((C4595d) exc).getClass();
        }
        mo24790a(inneractiveVideoError, (JSONObject) null);
        if (this.f11419o) {
            IAlog.m16699a("IMediaPlayerFlowManager: onPlayerError video was prepared. This is a critical error. Aborting!", new Object[0]);
            mo24790a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES, exc), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m14069a(List<String> list) {
        for (String next : list) {
            C4547h0 h0Var = new C4547h0(new C4590b(next, System.currentTimeMillis()), next);
            IAConfigManager.f10525J.f10555t.f11387a.offer(h0Var);
            h0Var.f11228f = C4559m0.QUEUED;
        }
    }

    /* renamed from: a */
    public void mo24787a() {
        Runnable runnable = this.f11409e;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
            this.f11409e = null;
            IAlog.m16699a("IMediaPlayerFlowManager:: cancelBufferTimeout - running timeout runnable cancelled", new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo24795b(boolean z) {
        this.f11415k = z;
    }

    /* renamed from: a */
    public void mo24788a(long j) {
        mo24787a();
        C4592a aVar = new C4592a();
        this.f11409e = aVar;
        C5357n.f14225b.postDelayed(aVar, j);
        IAlog.m16699a("IMediaPlayerFlowManager:: startBufferTimeout called with %d m/sec", Long.valueOf(j));
    }

    /* renamed from: a */
    public static int m14068a(C4591c cVar) {
        T t;
        C4450y yVar = cVar.f11410f;
        if (yVar == null || (t = yVar.f10914b) == null) {
            return -1;
        }
        return ((C5293g) t).f14088w;
    }

    /* renamed from: a */
    public static boolean m14070a(int i, C4346z zVar, int i2) {
        if (i2 == 1) {
            return true;
        }
        if (i <= 15999) {
            return false;
        }
        C4262a0 a0Var = ((C4345y) zVar).f10750f;
        if (a0Var == null || a0Var.f10577h == Skip.DEFAULT || a0Var.f10579j == UnitDisplayType.REWARDED) {
            return false;
        }
        return true;
    }
}
