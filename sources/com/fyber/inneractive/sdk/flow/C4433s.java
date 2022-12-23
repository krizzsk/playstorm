package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.C4419j;
import com.fyber.inneractive.sdk.interfaces.C4455c;
import com.fyber.inneractive.sdk.network.C4567p;
import com.fyber.inneractive.sdk.network.C4569q;
import com.fyber.inneractive.sdk.response.C5291e;
import com.fyber.inneractive.sdk.util.C5311a;
import com.fyber.inneractive.sdk.util.C5357n;
import com.fyber.inneractive.sdk.util.C5384w0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.s */
public abstract class C4433s<AdContent extends C4419j, EventsListener extends InneractiveUnitController.EventsListener> extends C4421l<AdContent, EventsListener> implements C4455c {

    /* renamed from: k */
    public C4455c.C4456a f10956k;

    /* renamed from: l */
    public Runnable f10957l;

    /* renamed from: m */
    public C5384w0 f10958m;

    /* renamed from: n */
    public Runnable f10959n;

    /* renamed from: o */
    public C5384w0 f10960o;

    /* renamed from: p */
    public boolean f10961p = false;

    /* renamed from: q */
    public boolean f10962q = false;

    /* renamed from: r */
    public long f10963r;

    /* renamed from: s */
    public boolean f10964s = false;

    /* renamed from: t */
    public boolean f10965t = false;

    /* renamed from: u */
    public final C5311a f10966u = new C5311a();

    /* renamed from: v */
    public CountDownTimer f10967v;

    /* renamed from: com.fyber.inneractive.sdk.flow.s$a */
    public class C4434a extends CountDownTimer {
        public C4434a(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            CountDownTimer countDownTimer = C4433s.this.f10967v;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C4433s.this.mo24628e(false);
        }

        public void onTick(long j) {
            int i = ((int) j) / 1000;
            C4455c.C4456a aVar = C4433s.this.f10956k;
            if (aVar != null) {
                aVar.updateCloseCountdown(i);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.s$b */
    public class C4435b implements C5384w0.C5386b {
        public C4435b() {
        }

        /* renamed from: a */
        public void mo24274a(C5384w0 w0Var) {
            C5357n.f14225b.post(C4433s.this.f10957l);
            C4433s sVar = C4433s.this;
            C5384w0 w0Var2 = sVar.f10958m;
            if (w0Var2 != null) {
                w0Var2.f14266e = null;
                sVar.f10958m = null;
            }
            boolean unused = sVar.f10962q = false;
        }
    }

    /* renamed from: E */
    public abstract boolean mo24407E();

    /* renamed from: F */
    public void mo24624F() {
        if (this.f10957l == null) {
            this.f10963r = mo24410I();
            AdContent adcontent = this.f10921b;
            boolean b = adcontent != null ? mo24416b(adcontent) : false;
            this.f10957l = new C4431r(this, this.f10963r);
            IAlog.m16699a("%senabling close with delay %d", IAlog.m16696a((Object) this), Long.valueOf(this.f10963r));
            if (!b || mo24407E()) {
                mo24625K();
            } else if (b) {
                C4455c.C4456a aVar = this.f10956k;
                if (aVar != null) {
                    aVar.showCloseCountdown();
                }
                C4434a aVar2 = new C4434a(100 + this.f10963r, 1000);
                this.f10967v = aVar2;
                aVar2.start();
            }
        }
    }

    /* renamed from: G */
    public abstract int mo24408G();

    /* renamed from: H */
    public abstract int mo24409H();

    /* renamed from: I */
    public abstract long mo24410I();

    /* renamed from: J */
    public abstract boolean mo24411J();

    /* renamed from: K */
    public void mo24625K() {
        if (!this.f10962q) {
            this.f10962q = true;
            C5384w0 w0Var = new C5384w0(TimeUnit.MILLISECONDS, this.f10963r);
            this.f10958m = w0Var;
            w0Var.f14266e = new C4435b();
            w0Var.mo26486c();
        }
    }

    /* renamed from: a */
    public abstract long mo24412a(long j);

    /* renamed from: b */
    public abstract boolean mo24416b(AdContent adcontent);

    /* renamed from: c */
    public void mo24626c(boolean z) {
    }

    /* renamed from: d */
    public void mo24627d(boolean z) {
        C4569q.C4570a aVar;
        if (this.f10921b == null) {
            C4567p pVar = C4567p.MRAID_CUSTOM_CLOSE_DETECTED;
            aVar = new C4569q.C4570a((C5291e) null);
            aVar.f11365c = pVar;
            aVar.f11363a = null;
            aVar.f11366d = null;
        } else {
            C4567p pVar2 = C4567p.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.f10921b;
            InneractiveAdRequest inneractiveAdRequest = adcontent.f10913a;
            C5291e c = adcontent.mo24367c();
            JSONArray c2 = this.f10921b.f10915c.mo24342c();
            aVar = new C4569q.C4570a(c);
            aVar.f11365c = pVar2;
            aVar.f11363a = inneractiveAdRequest;
            aVar.f11366d = c2;
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.m16703e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f11368f.put(jSONObject);
        aVar.mo24768a((String) null);
    }

    public void destroy() {
        Runnable runnable = this.f10957l;
        if (runnable != null) {
            C5357n.f14225b.removeCallbacks(runnable);
            this.f10957l = null;
        }
        Runnable runnable2 = this.f10959n;
        if (runnable2 != null) {
            C5357n.f14225b.removeCallbacks(runnable2);
            this.f10959n = null;
        }
        C4455c.C4456a aVar = this.f10956k;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f10956k = null;
        CountDownTimer countDownTimer = this.f10967v;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f10967v = null;
        }
        C5384w0 w0Var = this.f10960o;
        if (w0Var != null) {
            w0Var.f14266e = null;
            this.f10960o = null;
        }
        C5384w0 w0Var2 = this.f10958m;
        if (w0Var2 != null) {
            w0Var2.f14266e = null;
            this.f10958m = null;
        }
        super.destroy();
    }

    /* renamed from: e */
    public void mo24628e(boolean z) {
        C4569q.C4570a aVar;
        this.f10961p = true;
        if (z) {
            if (this.f10921b == null) {
                C4567p pVar = C4567p.FAIL_SAFE_ACTIVATED;
                aVar = new C4569q.C4570a((C5291e) null);
                aVar.f11365c = pVar;
                aVar.f11363a = null;
                aVar.f11366d = null;
            } else {
                C4567p pVar2 = C4567p.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.f10921b;
                InneractiveAdRequest inneractiveAdRequest = adcontent.f10913a;
                C5291e c = adcontent.mo24367c();
                JSONArray c2 = this.f10921b.f10915c.mo24342c();
                aVar = new C4569q.C4570a(c);
                aVar.f11365c = pVar2;
                aVar.f11363a = inneractiveAdRequest;
                aVar.f11366d = c2;
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(mo24411J());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.m16703e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f11368f.put(jSONObject);
            aVar.mo24768a((String) null);
        }
        C4455c.C4456a aVar2 = this.f10956k;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, mo24409H(), mo24408G());
            if (!z) {
                this.f10966u.mo26437a(false);
            }
        }
    }

    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f10920a = inneractiveAdSpot;
        this.f10921b = inneractiveAdSpot.getAdContent();
        this.f10922c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.f10966u.f14140a = inneractiveAdSpot;
    }

    /* renamed from: o */
    public void mo24629o() {
        C5384w0 w0Var = this.f10958m;
        if (w0Var != null) {
            w0Var.mo26485b();
        }
        C5384w0 w0Var2 = this.f10960o;
        if (w0Var2 != null) {
            w0Var2.mo26485b();
        }
    }

    /* renamed from: s */
    public void mo24630s() {
        C5384w0 w0Var = this.f10958m;
        if (w0Var != null) {
            w0Var.mo26483a();
        }
        C5384w0 w0Var2 = this.f10960o;
        if (w0Var2 != null) {
            w0Var2.mo26483a();
        }
    }

    /* renamed from: w */
    public int mo24606w() {
        C4455c.C4456a aVar = this.f10956k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f10956k.getLayout().getHeight();
    }

    /* renamed from: x */
    public int mo24607x() {
        C4455c.C4456a aVar = this.f10956k;
        if (aVar == null || aVar.getLayout() == null) {
            return 1;
        }
        return this.f10956k.getLayout().getWidth();
    }

    /* renamed from: z */
    public void mo24609z() {
        super.mo24609z();
    }

    /* renamed from: a */
    public void mo24413a(C4455c.C4456a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.f10920a == null) {
            IAlog.m16703e("%sYou must set the spot to render before calling renderAd", IAlog.m16696a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.f10956k = aVar;
        } else {
            IAlog.m16703e("%srenderAd called with a null activity!", IAlog.m16696a((Object) this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}
