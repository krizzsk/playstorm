package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.GravityCompat;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.media.C5919ce;
import com.inmobi.media.C6047eu;
import com.inmobi.media.C6082ff;
import com.inmobi.media.C6089fj;
import com.inmobi.media.C6318n;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.inmobi.media.fc */
/* compiled from: NativeLayoutInflater */
public final class C6067fc implements C6082ff.C6083a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15432d = C6067fc.class.getSimpleName();

    /* renamed from: m */
    private static Handler f15433m = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    int f15434a = 0;

    /* renamed from: b */
    public final C6047eu f15435b;

    /* renamed from: c */
    C6103fl f15436c;

    /* renamed from: e */
    private final WeakReference<Context> f15437e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5907bx f15438f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C6318n f15439g;

    /* renamed from: h */
    private final C6125fq f15440h;

    /* renamed from: i */
    private C6079c f15441i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6077a f15442j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C6078b f15443k;

    /* renamed from: l */
    private C6084fg f15444l;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f15445n = false;

    /* renamed from: o */
    private C6337q f15446o;

    /* renamed from: com.inmobi.media.fc$a */
    /* compiled from: NativeLayoutInflater */
    interface C6077a {
        /* renamed from: a */
        void mo35218a(View view, C5901bt btVar);
    }

    /* renamed from: com.inmobi.media.fc$b */
    /* compiled from: NativeLayoutInflater */
    interface C6078b {
        /* renamed from: a */
        void mo35216a(C5918cd cdVar);
    }

    /* renamed from: com.inmobi.media.fc$c */
    /* compiled from: NativeLayoutInflater */
    interface C6079c {
        /* renamed from: a */
        void mo35217a(int i, C5901bt btVar);
    }

    public C6067fc(Context context, C6125fq fqVar, C6318n nVar, C5907bx bxVar, C6079c cVar, C6077a aVar, C6078b bVar) {
        this.f15437e = new WeakReference<>(context);
        this.f15439g = nVar;
        this.f15438f = bxVar;
        this.f15441i = cVar;
        this.f15442j = aVar;
        this.f15443k = bVar;
        this.f15435b = new C6047eu();
        this.f15440h = fqVar;
        this.f15436c = C6103fl.m18233a(context);
    }

    /* renamed from: c */
    private Context m18158c() {
        return (Context) this.f15437e.get();
    }

    /* renamed from: a */
    public final C6081fe mo35221a(C6081fe feVar, ViewGroup viewGroup, C6337q qVar) {
        this.f15446o = qVar;
        C6081fe a = m18149a(feVar, viewGroup);
        if (!this.f15445n) {
            mo35223b(a, this.f15438f.f14938d);
        }
        return a;
    }

    /* renamed from: b */
    public final C6081fe mo35224b(C6081fe feVar, final ViewGroup viewGroup, C6337q qVar) {
        this.f15446o = qVar;
        final C6081fe a = m18149a(feVar, viewGroup);
        f15433m.post(new Runnable() {
            public final void run() {
                if (!C6067fc.this.f15445n) {
                    C6067fc fcVar = C6067fc.this;
                    fcVar.mo35223b(a, fcVar.f15438f.f14938d);
                }
            }
        });
        return a;
    }

    /* renamed from: a */
    private C6081fe m18149a(C6081fe feVar, ViewGroup viewGroup) {
        C6081fe feVar2 = feVar == null ? (C6081fe) this.f15436c.mo35306a(m18158c(), (C5901bt) this.f15438f.f14938d, this.f15440h) : feVar;
        if (!(feVar2 == null || feVar == null)) {
            m18154a(feVar2);
            this.f15436c.mo35308a((ViewGroup) feVar2);
            C6103fl.m18239a((View) feVar2, this.f15438f.f14938d.f14894c);
        }
        C6103fl.m18251b(this.f15438f.f14938d.f14894c.f14917a.x);
        feVar2.setLayoutParams(C6103fl.m18232a((C5901bt) this.f15438f.f14938d, viewGroup));
        return feVar2;
    }

    /* renamed from: a */
    private static void m18154a(C6081fe feVar) {
        ViewParent parent = feVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(feVar);
        }
    }

    /* renamed from: a */
    public final ViewGroup mo35220a(ViewGroup viewGroup, C5903bv bvVar) {
        ViewGroup viewGroup2 = (ViewGroup) this.f15436c.mo35306a(m18158c(), (C5901bt) bvVar, this.f15440h);
        if (viewGroup2 != null) {
            viewGroup2.setLayoutParams(C6103fl.m18232a((C5901bt) bvVar, viewGroup));
        }
        return viewGroup2;
    }

    /* renamed from: a */
    public final int mo35219a(int i) {
        this.f15434a = i;
        this.f15441i.mo35217a(i, this.f15438f.mo34894a(i));
        return m18160d();
    }

    /* renamed from: a */
    private void m18152a(final C5918cd cdVar, C5919ce ceVar) {
        ceVar.setTimerEventsListener(new C5919ce.C5921b() {
            /* renamed from: a */
            public final void mo34916a() {
                if (C6067fc.this.f15443k != null) {
                    C6067fc.this.f15443k.mo35216a(cdVar);
                }
            }
        });
    }

    /* renamed from: a */
    private void m18150a(View view, final C5901bt btVar) {
        boolean z;
        final List<C6047eu.C6050a> a = this.f15435b.mo35181a(view, btVar);
        if (a == null) {
            Iterator<C5922cf> it = btVar.f14912u.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("creativeView".equals(it.next().f15004d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public final void onViewAttachedToWindow(View view) {
                C6067fc.this.f15435b.mo35183a(a);
                C6318n unused = C6067fc.this.f15439g;
                C5901bt a = C6318n.m18915a(C6067fc.this.f15439g.mo35568h(), btVar);
                C5901bt btVar = btVar;
                C6318n e = C6067fc.this.f15439g;
                if (a == null) {
                    a = btVar;
                }
                btVar.mo34877a("creativeView", e.mo35552a(a));
            }

            public final void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                C6047eu d = C6067fc.this.f15435b;
                List<C6047eu.C6050a> list = a;
                if (list != null) {
                    for (C6047eu.C6050a aVar : list) {
                        aVar.f15390a.cancel();
                    }
                    d.f15382a.removeAll(list);
                }
            }
        });
    }

    /* renamed from: b */
    public final ViewGroup mo35223b(ViewGroup viewGroup, C5903bv bvVar) {
        C6337q qVar;
        m18151a((C5901bt) bvVar, (View) viewGroup);
        Iterator<C5901bt> it = bvVar.iterator();
        while (it.hasNext()) {
            C5901bt next = it.next();
            if (!"CONTAINER".equals(next.f14893b)) {
                View view = null;
                if ("WEBVIEW".equals(next.f14893b)) {
                    C5925ch chVar = (C5925ch) next;
                    if (chVar.f15016A && (qVar = this.f15446o) != null) {
                        if (qVar.getParent() != null) {
                            ((ViewGroup) qVar.getParent()).removeView(qVar);
                        }
                        this.f15446o = null;
                        view = qVar;
                    } else if ("UNKNOWN".equals(chVar.f15018z)) {
                    }
                } else if (ShareConstants.IMAGE_URL.equals(next.f14893b) && next.f14896e == null) {
                }
                if (view == null) {
                    view = this.f15436c.mo35306a(m18158c(), next, this.f15440h);
                }
                if (view != null) {
                    final WeakReference weakReference = new WeakReference(view);
                    if (next.f14906o != -1) {
                        view.setVisibility(4);
                        f15433m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(0);
                                }
                            }
                        }, (long) (next.f14906o * 1000));
                    } else if (next.f14907p != -1) {
                        f15433m.postDelayed(new Runnable() {
                            public final void run() {
                                View view = (View) weakReference.get();
                                if (view != null) {
                                    view.setVisibility(4);
                                }
                            }
                        }, (long) (next.f14907p * 1000));
                    }
                    view.setLayoutParams(C6103fl.m18232a(next, viewGroup));
                    m18150a(view, next);
                    viewGroup.addView(view);
                    if (ShareConstants.VIDEO_URL.equals(next.f14893b)) {
                        m18153a((C5923cg) next, ((C6102fk) view).getVideoView());
                    }
                    m18151a(next, view);
                    if ("TIMER".equals(next.f14893b)) {
                        view.setTag("timerView");
                        m18152a((C5918cd) next, (C5919ce) view);
                    }
                    if (ShareConstants.VIDEO_URL.equals(next.f14893b)) {
                        ((C6102fk) view).mo35301a();
                    }
                    if ("WEBVIEW".equals(next.f14893b) && (view instanceof C6337q)) {
                        C6337q qVar2 = (C6337q) view;
                        C5925ch chVar2 = (C5925ch) next;
                        qVar2.setScrollable(chVar2.f15017B);
                        qVar2.setReferenceContainer(this.f15439g.f16011l);
                        qVar2.setRenderViewEventListener(this.f15439g.mo35587t());
                        qVar2.setPlacementId(this.f15439g.f16003d);
                        qVar2.setAllowAutoRedirection(this.f15439g.f16005f);
                        qVar2.setCreativeId(this.f15439g.f16004e);
                        qVar2.setImpressionId(this.f15439g.f16002c);
                        if (!chVar2.f15016A) {
                            this.f15439g.mo35560a(qVar2);
                        }
                    }
                }
            } else if (next.f14895d.equalsIgnoreCase("card_scrollable")) {
                C6082ff ffVar = (C6082ff) this.f15436c.mo35306a(m18158c(), next, this.f15440h);
                if (ffVar != null) {
                    C6084fg a = C6085fh.m18181a(ffVar.getType(), this.f15438f, this);
                    this.f15444l = a;
                    if (a != null) {
                        ffVar.mo35237a((C5903bv) next, a, this.f15434a, m18160d(), this);
                        ffVar.setLayoutParams(C6103fl.m18232a(next, viewGroup));
                        m18150a((View) ffVar, next);
                        viewGroup.addView(ffVar);
                    }
                }
            } else {
                ViewGroup viewGroup2 = (ViewGroup) this.f15436c.mo35306a(m18158c(), next, this.f15440h);
                if (viewGroup2 != null) {
                    ViewGroup b = mo35223b(viewGroup2, (C5903bv) next);
                    b.setLayoutParams(C6103fl.m18232a(next, viewGroup));
                    m18150a((View) b, next);
                    viewGroup.addView(b);
                }
            }
        }
        return viewGroup;
    }

    /* renamed from: d */
    private int m18160d() {
        if (this.f15434a == 0) {
            return GravityCompat.START;
        }
        if (this.f15438f.mo34898c() - 1 == this.f15434a) {
            return GravityCompat.END;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo35222a() {
        this.f15445n = true;
        this.f15437e.clear();
        this.f15443k = null;
        C6084fg fgVar = this.f15444l;
        if (fgVar != null) {
            fgVar.destroy();
            this.f15444l = null;
        }
    }

    /* renamed from: a */
    private void m18151a(final C5901bt btVar, View view) {
        if (btVar.f14899h) {
            view.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C6067fc.this.f15442j.mo35218a(view, btVar);
                }
            });
        }
    }

    /* renamed from: a */
    private void m18153a(final C5923cg cgVar, C6089fj fjVar) {
        C5903bv bvVar = (C5903bv) cgVar.f14911t;
        long currentTimeMillis = System.currentTimeMillis();
        if (!(bvVar == null || 0 == bvVar.f14931z)) {
            currentTimeMillis = bvVar.f14931z;
        }
        if (bvVar != null) {
            bvVar.f14931z = currentTimeMillis;
        }
        fjVar.setClickable(false);
        fjVar.setId(Integer.MAX_VALUE);
        fjVar.mo35254a(cgVar);
        if (cgVar.f14916y != null) {
            cgVar.mo34918a((C5923cg) cgVar.f14916y);
        }
        fjVar.setQuartileCompletedListener(new C6089fj.C6100c() {
            /* renamed from: a */
            public final void mo35231a(byte b) {
                if (!C6067fc.this.f15439g.f16009j && (C6067fc.this.f15439g instanceof C6332o)) {
                    ((C6332o) C6067fc.this.f15439g).mo35595a(cgVar, b);
                    if (3 == b) {
                        try {
                            C6332o oVar = (C6332o) C6067fc.this.f15439g;
                            C5923cg cgVar = cgVar;
                            if (!((Boolean) cgVar.f14913v.get("didSignalVideoCompleted")).booleanValue()) {
                                oVar.mo35575o();
                                C6318n.C6331c e = oVar.mo35565e();
                                if (e != null) {
                                    e.mo34573h();
                                }
                            }
                            if (1 == oVar.getPlacementType()) {
                                oVar.mo35563c((C5901bt) cgVar);
                            }
                        } catch (Exception unused) {
                            String unused2 = C6067fc.f15432d;
                        }
                    }
                }
            }
        });
        fjVar.setPlaybackEventListener(new C6089fj.C6099b() {
            /* renamed from: a */
            public final void mo35232a(byte b) {
                if (!C6067fc.this.f15439g.f16009j && (C6067fc.this.f15439g instanceof C6332o)) {
                    if (b == 0) {
                        ((C6332o) C6067fc.this.f15439g).mo35603v();
                    } else if (b == 1) {
                        ((C6332o) C6067fc.this.f15439g).mo35597b(cgVar);
                    } else if (b == 2) {
                        ((C6332o) C6067fc.this.f15439g).mo35598c(cgVar);
                    } else if (b == 3) {
                        ((C6332o) C6067fc.this.f15439g).mo35599d(cgVar);
                    } else if (b == 5) {
                        try {
                            ((C6332o) C6067fc.this.f15439g).mo35602g(cgVar);
                        } catch (Exception e) {
                            String unused = C6067fc.f15432d;
                            C6181gg.m18398a().mo35357a(new C6217hg(e));
                        }
                    }
                }
            }
        });
        fjVar.setMediaErrorListener(new C6089fj.C6098a() {
            /* renamed from: a */
            public final void mo35233a() {
                if (!C6067fc.this.f15439g.f16009j && (C6067fc.this.f15439g instanceof C6332o)) {
                    try {
                        ((C6332o) C6067fc.this.f15439g).mo35594a(cgVar);
                    } catch (Exception unused) {
                        String unused2 = C6067fc.f15432d;
                    }
                }
            }
        });
        if (!this.f15439g.f16009j) {
            C6318n nVar = this.f15439g;
            if (nVar instanceof C6332o) {
                try {
                    ((C6332o) nVar).mo35596a(fjVar);
                } catch (Exception unused) {
                }
            }
        }
    }
}
