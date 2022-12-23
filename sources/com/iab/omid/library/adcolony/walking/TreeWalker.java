package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7586a;
import com.iab.omid.library.adcolony.p221b.C7588a;
import com.iab.omid.library.adcolony.p222c.C7597a;
import com.iab.omid.library.adcolony.p222c.C7599b;
import com.iab.omid.library.adcolony.p223d.C7603b;
import com.iab.omid.library.adcolony.p223d.C7606d;
import com.iab.omid.library.adcolony.p223d.C7608f;
import com.iab.omid.library.adcolony.p224e.C7609a;
import com.iab.omid.library.adcolony.walking.C7618a;
import com.iab.omid.library.adcolony.walking.p225a.C7624c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7597a.C7598a {

    /* renamed from: a */
    private static TreeWalker f18140a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18141b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18142c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18143l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21083h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18144m = new Runnable() {
        public void run() {
            if (TreeWalker.f18142c != null) {
                TreeWalker.f18142c.post(TreeWalker.f18143l);
                TreeWalker.f18142c.postDelayed(TreeWalker.f18144m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18145d = new ArrayList();

    /* renamed from: e */
    private int f18146e;

    /* renamed from: f */
    private boolean f18147f = false;

    /* renamed from: g */
    private final List<C7609a> f18148g = new ArrayList();

    /* renamed from: h */
    private C7599b f18149h = new C7599b();

    /* renamed from: i */
    private C7618a f18150i = new C7618a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7628b f18151j = new C7628b(new C7624c());

    /* renamed from: k */
    private long f18152k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21074a(long j) {
        if (this.f18145d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18145d) {
                next.onTreeProcessed(this.f18146e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18146e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21075a(View view, C7597a aVar, JSONObject jSONObject, C7629c cVar, boolean z) {
        aVar.mo54256a(view, jSONObject, this, cVar == C7629c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21076a(String str, View view, JSONObject jSONObject) {
        C7597a b = this.f18149h.mo54259b();
        String a = this.f18150i.mo54299a(str);
        if (a != null) {
            JSONObject a2 = b.mo54255a(view);
            C7603b.m21012a(a2, str);
            C7603b.m21017b(a2, a);
            C7603b.m21014a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21077a(View view, JSONObject jSONObject) {
        String a = this.f18150i.mo54298a(view);
        if (a == null) {
            return false;
        }
        C7603b.m21012a(jSONObject, a);
        C7603b.m21011a(jSONObject, Boolean.valueOf(this.f18150i.mo54307d(view)));
        this.f18150i.mo54308e();
        return true;
    }

    /* renamed from: b */
    private boolean m21079b(View view, JSONObject jSONObject) {
        C7618a.C7619a b = this.f18150i.mo54302b(view);
        if (b == null) {
            return false;
        }
        C7603b.m21010a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18140a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21083h() {
        m21084i();
        mo54291d();
        m21085j();
    }

    /* renamed from: i */
    private void m21084i() {
        this.f18146e = 0;
        this.f18148g.clear();
        this.f18147f = false;
        Iterator<C7586a> it = C7588a.m20936a().mo54212c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54175b()) {
                    this.f18147f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18152k = C7606d.m21026a();
    }

    /* renamed from: j */
    private void m21085j() {
        m21074a(C7606d.m21026a() - this.f18152k);
    }

    /* renamed from: k */
    private void m21086k() {
        if (f18142c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18142c = handler;
            handler.post(f18143l);
            f18142c.postDelayed(f18144m, 200);
        }
    }

    /* renamed from: l */
    private void m21087l() {
        Handler handler = f18142c;
        if (handler != null) {
            handler.removeCallbacks(f18144m);
            f18142c = null;
        }
    }

    /* renamed from: a */
    public void mo54287a() {
        m21086k();
    }

    /* renamed from: a */
    public void mo54257a(View view, C7597a aVar, JSONObject jSONObject, boolean z) {
        C7629c c;
        if (C7608f.m21043d(view) && (c = this.f18150i.mo54304c(view)) != C7629c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54255a(view);
            C7603b.m21014a(jSONObject, a);
            if (!m21077a(view, a)) {
                boolean z2 = z || m21079b(view, a);
                if (this.f18147f && c == C7629c.OBSTRUCTION_VIEW && !z2) {
                    this.f18148g.add(new C7609a(view));
                }
                m21075a(view, aVar, a, c, z2);
            }
            this.f18146e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18145d.contains(treeWalkerTimeLogger)) {
            this.f18145d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54289b() {
        mo54290c();
        this.f18145d.clear();
        f18141b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18151j.mo54326a();
            }
        });
    }

    /* renamed from: c */
    public void mo54290c() {
        m21087l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54291d() {
        this.f18150i.mo54305c();
        long a = C7606d.m21026a();
        C7597a a2 = this.f18149h.mo54258a();
        if (this.f18150i.mo54303b().size() > 0) {
            Iterator<String> it = this.f18150i.mo54303b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54255a((View) null);
                m21076a(next, this.f18150i.mo54301b(next), a3);
                C7603b.m21009a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18151j.mo54328b(a3, hashSet, a);
            }
        }
        if (this.f18150i.mo54300a().size() > 0) {
            JSONObject a4 = a2.mo54255a((View) null);
            m21075a((View) null, a2, a4, C7629c.PARENT_VIEW, false);
            C7603b.m21009a(a4);
            this.f18151j.mo54327a(a4, this.f18150i.mo54300a(), a);
            if (this.f18147f) {
                for (C7586a a5 : C7588a.m20936a().mo54212c()) {
                    a5.mo54173a(this.f18148g);
                }
            }
        } else {
            this.f18151j.mo54326a();
        }
        this.f18150i.mo54306d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18145d.contains(treeWalkerTimeLogger)) {
            this.f18145d.remove(treeWalkerTimeLogger);
        }
    }
}
