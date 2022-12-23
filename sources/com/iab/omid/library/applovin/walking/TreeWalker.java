package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C7686a;
import com.iab.omid.library.applovin.p233b.C7688a;
import com.iab.omid.library.applovin.p234c.C7697a;
import com.iab.omid.library.applovin.p234c.C7699b;
import com.iab.omid.library.applovin.p235d.C7703b;
import com.iab.omid.library.applovin.p235d.C7706d;
import com.iab.omid.library.applovin.p235d.C7708f;
import com.iab.omid.library.applovin.p236e.C7709a;
import com.iab.omid.library.applovin.walking.C7718a;
import com.iab.omid.library.applovin.walking.p237a.C7724c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7697a.C7698a {

    /* renamed from: a */
    private static TreeWalker f18374a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18375b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18376c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18377l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21543h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18378m = new Runnable() {
        public void run() {
            if (TreeWalker.f18376c != null) {
                TreeWalker.f18376c.post(TreeWalker.f18377l);
                TreeWalker.f18376c.postDelayed(TreeWalker.f18378m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18379d = new ArrayList();

    /* renamed from: e */
    private int f18380e;

    /* renamed from: f */
    private boolean f18381f = false;

    /* renamed from: g */
    private final List<C7709a> f18382g = new ArrayList();

    /* renamed from: h */
    private C7699b f18383h = new C7699b();

    /* renamed from: i */
    private C7718a f18384i = new C7718a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7728b f18385j = new C7728b(new C7724c());

    /* renamed from: k */
    private long f18386k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21534a(long j) {
        if (this.f18379d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18379d) {
                next.onTreeProcessed(this.f18380e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18380e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21535a(View view, C7697a aVar, JSONObject jSONObject, C7729c cVar, boolean z) {
        aVar.mo54654a(view, jSONObject, this, cVar == C7729c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21536a(String str, View view, JSONObject jSONObject) {
        C7697a b = this.f18383h.mo54657b();
        String a = this.f18384i.mo54697a(str);
        if (a != null) {
            JSONObject a2 = b.mo54653a(view);
            C7703b.m21472a(a2, str);
            C7703b.m21477b(a2, a);
            C7703b.m21474a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21537a(View view, JSONObject jSONObject) {
        String a = this.f18384i.mo54696a(view);
        if (a == null) {
            return false;
        }
        C7703b.m21472a(jSONObject, a);
        C7703b.m21471a(jSONObject, Boolean.valueOf(this.f18384i.mo54705d(view)));
        this.f18384i.mo54706e();
        return true;
    }

    /* renamed from: b */
    private boolean m21539b(View view, JSONObject jSONObject) {
        C7718a.C7719a b = this.f18384i.mo54700b(view);
        if (b == null) {
            return false;
        }
        C7703b.m21470a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18374a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21543h() {
        m21544i();
        mo54689d();
        m21545j();
    }

    /* renamed from: i */
    private void m21544i() {
        this.f18380e = 0;
        this.f18382g.clear();
        this.f18381f = false;
        Iterator<C7686a> it = C7688a.m21396a().mo54610c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54573b()) {
                    this.f18381f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18386k = C7706d.m21486a();
    }

    /* renamed from: j */
    private void m21545j() {
        m21534a(C7706d.m21486a() - this.f18386k);
    }

    /* renamed from: k */
    private void m21546k() {
        if (f18376c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18376c = handler;
            handler.post(f18377l);
            f18376c.postDelayed(f18378m, 200);
        }
    }

    /* renamed from: l */
    private void m21547l() {
        Handler handler = f18376c;
        if (handler != null) {
            handler.removeCallbacks(f18378m);
            f18376c = null;
        }
    }

    /* renamed from: a */
    public void mo54685a() {
        m21546k();
    }

    /* renamed from: a */
    public void mo54655a(View view, C7697a aVar, JSONObject jSONObject, boolean z) {
        C7729c c;
        if (C7708f.m21503d(view) && (c = this.f18384i.mo54702c(view)) != C7729c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54653a(view);
            C7703b.m21474a(jSONObject, a);
            if (!m21537a(view, a)) {
                boolean z2 = z || m21539b(view, a);
                if (this.f18381f && c == C7729c.OBSTRUCTION_VIEW && !z2) {
                    this.f18382g.add(new C7709a(view));
                }
                m21535a(view, aVar, a, c, z2);
            }
            this.f18380e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18379d.contains(treeWalkerTimeLogger)) {
            this.f18379d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54687b() {
        mo54688c();
        this.f18379d.clear();
        f18375b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18385j.mo54724a();
            }
        });
    }

    /* renamed from: c */
    public void mo54688c() {
        m21547l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54689d() {
        this.f18384i.mo54703c();
        long a = C7706d.m21486a();
        C7697a a2 = this.f18383h.mo54656a();
        if (this.f18384i.mo54701b().size() > 0) {
            Iterator<String> it = this.f18384i.mo54701b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54653a((View) null);
                m21536a(next, this.f18384i.mo54699b(next), a3);
                C7703b.m21469a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18385j.mo54726b(a3, hashSet, a);
            }
        }
        if (this.f18384i.mo54698a().size() > 0) {
            JSONObject a4 = a2.mo54653a((View) null);
            m21535a((View) null, a2, a4, C7729c.PARENT_VIEW, false);
            C7703b.m21469a(a4);
            this.f18385j.mo54725a(a4, this.f18384i.mo54698a(), a);
            if (this.f18381f) {
                for (C7686a a5 : C7688a.m21396a().mo54610c()) {
                    a5.mo54571a(this.f18382g);
                }
            }
        } else {
            this.f18385j.mo54724a();
        }
        this.f18384i.mo54704d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18379d.contains(treeWalkerTimeLogger)) {
            this.f18379d.remove(treeWalkerTimeLogger);
        }
    }
}
