package com.iab.omid.library.smaato.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.smaato.p276c.C8050a;
import com.iab.omid.library.smaato.p276c.C8052b;
import com.iab.omid.library.smaato.p277d.C8056b;
import com.iab.omid.library.smaato.p277d.C8059d;
import com.iab.omid.library.smaato.p277d.C8061f;
import com.iab.omid.library.smaato.walking.C8071a;
import com.iab.omid.library.smaato.walking.p279a.C8077c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C8050a.C8051a {

    /* renamed from: a */
    private static TreeWalker f19185a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19186b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19187c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19188j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m23127h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19189k = new Runnable() {
        public void run() {
            if (TreeWalker.f19187c != null) {
                TreeWalker.f19187c.post(TreeWalker.f19188j);
                TreeWalker.f19187c.postDelayed(TreeWalker.f19189k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19190d = new ArrayList();

    /* renamed from: e */
    private int f19191e;

    /* renamed from: f */
    private C8052b f19192f = new C8052b();

    /* renamed from: g */
    private C8071a f19193g = new C8071a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8081b f19194h = new C8081b(new C8077c());

    /* renamed from: i */
    private long f19195i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m23118a(long j) {
        if (this.f19190d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19190d) {
                next.onTreeProcessed(this.f19191e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19191e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m23119a(View view, C8050a aVar, JSONObject jSONObject, C8082c cVar) {
        aVar.mo56035a(view, jSONObject, this, cVar == C8082c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m23120a(String str, View view, JSONObject jSONObject) {
        C8050a b = this.f19192f.mo56038b();
        String a = this.f19193g.mo56078a(str);
        if (a != null) {
            JSONObject a2 = b.mo56034a(view);
            C8056b.m23057a(a2, str);
            C8056b.m23062b(a2, a);
            C8056b.m23059a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m23121a(View view, JSONObject jSONObject) {
        String a = this.f19193g.mo56077a(view);
        if (a == null) {
            return false;
        }
        C8056b.m23057a(jSONObject, a);
        this.f19193g.mo56086e();
        return true;
    }

    /* renamed from: b */
    private void m23122b(View view, JSONObject jSONObject) {
        C8071a.C8072a b = this.f19193g.mo56081b(view);
        if (b != null) {
            C8056b.m23056a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19185a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23127h() {
        m23128i();
        mo56070d();
        m23129j();
    }

    /* renamed from: i */
    private void m23128i() {
        this.f19191e = 0;
        this.f19195i = C8059d.m23070a();
    }

    /* renamed from: j */
    private void m23129j() {
        m23118a(C8059d.m23070a() - this.f19195i);
    }

    /* renamed from: k */
    private void m23130k() {
        if (f19187c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19187c = handler;
            handler.post(f19188j);
            f19187c.postDelayed(f19189k, 200);
        }
    }

    /* renamed from: l */
    private void m23131l() {
        Handler handler = f19187c;
        if (handler != null) {
            handler.removeCallbacks(f19189k);
            f19187c = null;
        }
    }

    /* renamed from: a */
    public void mo56066a() {
        m23130k();
    }

    /* renamed from: a */
    public void mo56036a(View view, C8050a aVar, JSONObject jSONObject) {
        C8082c c;
        if (C8061f.m23087d(view) && (c = this.f19193g.mo56083c(view)) != C8082c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo56034a(view);
            C8056b.m23059a(jSONObject, a);
            if (!m23121a(view, a)) {
                m23122b(view, a);
                m23119a(view, aVar, a, c);
            }
            this.f19191e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19190d.contains(treeWalkerTimeLogger)) {
            this.f19190d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo56068b() {
        mo56069c();
        this.f19190d.clear();
        f19186b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19194h.mo56104a();
            }
        });
    }

    /* renamed from: c */
    public void mo56069c() {
        m23131l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo56070d() {
        this.f19193g.mo56084c();
        long a = C8059d.m23070a();
        C8050a a2 = this.f19192f.mo56037a();
        if (this.f19193g.mo56082b().size() > 0) {
            Iterator<String> it = this.f19193g.mo56082b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo56034a((View) null);
                m23120a(next, this.f19193g.mo56080b(next), a3);
                C8056b.m23055a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19194h.mo56106b(a3, hashSet, a);
            }
        }
        if (this.f19193g.mo56079a().size() > 0) {
            JSONObject a4 = a2.mo56034a((View) null);
            m23119a((View) null, a2, a4, C8082c.PARENT_VIEW);
            C8056b.m23055a(a4);
            this.f19194h.mo56105a(a4, this.f19193g.mo56079a(), a);
        } else {
            this.f19194h.mo56104a();
        }
        this.f19193g.mo56085d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19190d.contains(treeWalkerTimeLogger)) {
            this.f19190d.remove(treeWalkerTimeLogger);
        }
    }
}
