package com.bytedance.sdk.component.adexpress.dynamic.p098a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C2618b;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2725c;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2686f;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2688h;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2705h;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2707i;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2712a;
import com.bytedance.sdk.component.adexpress.dynamic.p102d.C2713b;
import com.bytedance.sdk.component.adexpress.p091a.p093b.C2603a;
import com.bytedance.sdk.component.adexpress.p095b.C2623d;
import com.bytedance.sdk.component.adexpress.p095b.C2626f;
import com.bytedance.sdk.component.adexpress.p095b.C2627g;
import com.bytedance.sdk.component.adexpress.p095b.C2631j;
import com.bytedance.sdk.component.adexpress.p095b.C2633l;
import com.bytedance.sdk.component.adexpress.p095b.C2635m;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.utils.C2968h;
import com.bytedance.sdk.component.utils.C2975l;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a */
/* compiled from: DynamicRender */
public class C2652a implements C2623d<DynamicRootView>, C2631j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public DynamicRootView f5731a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2707i f5732b;

    /* renamed from: c */
    private Context f5733c;

    /* renamed from: d */
    private C2626f f5734d;

    /* renamed from: e */
    private C2627g f5735e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2633l f5736f;

    /* renamed from: g */
    private ScheduledFuture<?> f5737g;

    /* renamed from: h */
    private AtomicBoolean f5738h = new AtomicBoolean(false);

    public C2652a(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2707i iVar, C2633l lVar, C2712a aVar) {
        this.f5733c = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, lVar, aVar);
        this.f5731a = dynamicRootView;
        this.f5732b = iVar;
        this.f5736f = lVar;
        dynamicRootView.setRenderListener(this);
        this.f5736f = lVar;
    }

    /* renamed from: a */
    public void mo16719a(C2626f fVar) {
        this.f5734d = fVar;
        int d = this.f5736f.mo16752d();
        if (d < 0) {
            this.f5731a.mo17260a(this.f5732b instanceof C2705h ? 127 : 117);
            return;
        }
        this.f5737g = C2952e.m8318d().schedule(new C2657a(2), (long) d, TimeUnit.MILLISECONDS);
        C2968h.m8367b().postDelayed(new Runnable() {
            public void run() {
                C2652a.this.m6957f();
            }
        }, this.f5736f.mo16758j());
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m6957f() {
        this.f5736f.mo16751c().mo16730c(mo16710c());
        if (!C2603a.m6641a(this.f5736f.mo16749a())) {
            this.f5731a.mo17260a(this.f5732b instanceof C2705h ? 123 : 113);
            return;
        }
        this.f5732b.mo17198a((C2713b) new C2713b() {
            /* renamed from: a */
            public void mo16874a(final C2688h hVar) {
                C2652a.this.m6959h();
                C2652a.this.f5736f.mo16751c().mo16732d(C2652a.this.mo16710c());
                C2652a.this.m6948a(hVar);
                C2652a.this.m6951b(hVar);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        C2652a.this.m6954c(hVar);
                    }
                });
                C2652a.this.f5731a.setBgColor(hVar.mo17138a());
            }
        });
        this.f5732b.mo17197a(this.f5736f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m6948a(C2688h hVar) {
        List<C2688h> j;
        if (hVar != null && (j = hVar.mo17161j()) != null && j.size() > 0) {
            Collections.sort(j, new Comparator<C2688h>() {
                /* renamed from: a */
                public int compare(C2688h hVar, C2688h hVar2) {
                    C2686f e = hVar.mo17160i().mo16960e();
                    C2686f e2 = hVar2.mo17160i().mo16960e();
                    if (e == null || e2 == null) {
                        return 0;
                    }
                    return e.mo16988Z() >= e2.mo16988Z() ? 1 : -1;
                }
            });
            for (C2688h next : j) {
                if (next != null) {
                    m6948a(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m6951b(C2688h hVar) {
        if (hVar != null) {
            List<C2688h> j = hVar.mo17161j();
            if (j != null && j.size() > 0) {
                for (C2688h b : j) {
                    m6951b(b);
                }
            }
            C2688h k = hVar.mo17162k();
            if (k != null) {
                hVar.mo17150c(hVar.mo17153e() - k.mo17153e());
                hVar.mo17152d(hVar.mo17155f() - k.mo17155f());
            }
        }
    }

    /* renamed from: a */
    public DynamicRootView mo16720e() {
        return mo16872d();
    }

    /* renamed from: b */
    public void mo16871b() {
        m6945a((View) mo16720e());
    }

    /* renamed from: a */
    private void m6945a(View view) {
        if (view != null) {
            if (view instanceof ViewGroup) {
                int i = 0;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    m6945a(viewGroup.getChildAt(i));
                    i++;
                }
            }
            if (view instanceof C2725c) {
                ((C2725c) view).mo16881b();
            }
        }
    }

    /* renamed from: c */
    public int mo16710c() {
        return this.f5732b instanceof C2705h ? 3 : 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m6954c(C2688h hVar) {
        if (hVar == null) {
            this.f5731a.mo17260a(this.f5732b instanceof C2705h ? 123 : 113);
            return;
        }
        this.f5736f.mo16751c().mo16734e(mo16710c());
        try {
            this.f5731a.mo17261a(hVar, mo16710c());
        } catch (Exception unused) {
            this.f5731a.mo17260a(this.f5732b instanceof C2705h ? 128 : 118);
        }
    }

    /* renamed from: d */
    public DynamicRootView mo16872d() {
        return this.f5731a;
    }

    /* renamed from: a */
    public void mo16870a(C2627g gVar) {
        this.f5735e = gVar;
    }

    /* renamed from: g */
    private boolean m6958g() {
        DynamicRootView dynamicRootView = this.f5731a;
        if (dynamicRootView == null || dynamicRootView.getChildCount() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo16748a(C2635m mVar) {
        if (!this.f5738h.get()) {
            this.f5738h.set(true);
            if (!mVar.mo16786a() || !m6958g()) {
                this.f5734d.mo16716a(mVar.mo16803h());
                return;
            }
            this.f5731a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f5734d.mo16717a(mo16720e(), mVar);
        }
    }

    /* renamed from: a */
    public void mo16747a(View view, int i, C2618b bVar) {
        C2627g gVar = this.f5735e;
        if (gVar != null) {
            gVar.mo16722a(view, i, bVar);
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.a.a$a */
    /* compiled from: DynamicRender */
    private class C2657a implements Runnable {

        /* renamed from: b */
        private int f5745b;

        public C2657a(int i) {
            this.f5745b = i;
        }

        public void run() {
            if (this.f5745b == 2) {
                C2975l.m8384b("DynamicRender", "Dynamic parse time out");
                C2652a.this.f5731a.mo17260a(C2652a.this.f5732b instanceof C2705h ? 127 : 117);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m6959h() {
        try {
            if (this.f5737g != null && !this.f5737g.isCancelled()) {
                this.f5737g.cancel(false);
                this.f5737g = null;
            }
            C2975l.m8384b("DynamicRender", "WebView Render cancel timeout timer");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
