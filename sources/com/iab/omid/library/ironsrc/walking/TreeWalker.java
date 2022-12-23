package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.p258c.C7899a;
import com.iab.omid.library.ironsrc.p258c.C7901b;
import com.iab.omid.library.ironsrc.p259d.C7905b;
import com.iab.omid.library.ironsrc.p259d.C7908d;
import com.iab.omid.library.ironsrc.p259d.C7910f;
import com.iab.omid.library.ironsrc.walking.C7920a;
import com.iab.omid.library.ironsrc.walking.p261a.C7926c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7899a.C7900a {

    /* renamed from: a */
    private static TreeWalker f18834a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18835b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18836c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f18837j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m22444h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f18838k = new Runnable() {
        public final void run() {
            if (TreeWalker.f18836c != null) {
                TreeWalker.f18836c.post(TreeWalker.f18837j);
                TreeWalker.f18836c.postDelayed(TreeWalker.f18838k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18839d = new ArrayList();

    /* renamed from: e */
    private int f18840e;

    /* renamed from: f */
    private C7901b f18841f = new C7901b();

    /* renamed from: g */
    private C7920a f18842g = new C7920a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7930b f18843h = new C7930b(new C7926c());

    /* renamed from: i */
    private long f18844i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22435a(long j) {
        if (this.f18839d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18839d) {
                next.onTreeProcessed(this.f18840e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18840e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22436a(View view, C7899a aVar, JSONObject jSONObject, C7931c cVar) {
        aVar.mo55428a(view, jSONObject, this, cVar == C7931c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22437a(String str, View view, JSONObject jSONObject) {
        C7899a b = this.f18841f.mo55431b();
        String a = this.f18842g.mo55471a(str);
        if (a != null) {
            JSONObject a2 = b.mo55427a(view);
            C7905b.m22374a(a2, str);
            C7905b.m22379b(a2, a);
            C7905b.m22376a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22438a(View view, JSONObject jSONObject) {
        String a = this.f18842g.mo55470a(view);
        if (a == null) {
            return false;
        }
        C7905b.m22374a(jSONObject, a);
        this.f18842g.mo55479e();
        return true;
    }

    /* renamed from: b */
    private void m22439b(View view, JSONObject jSONObject) {
        C7920a.C7921a b = this.f18842g.mo55474b(view);
        if (b != null) {
            C7905b.m22373a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f18834a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22444h() {
        m22445i();
        mo55463d();
        m22446j();
    }

    /* renamed from: i */
    private void m22445i() {
        this.f18840e = 0;
        this.f18844i = C7908d.m22387a();
    }

    /* renamed from: j */
    private void m22446j() {
        m22435a(C7908d.m22387a() - this.f18844i);
    }

    /* renamed from: k */
    private void m22447k() {
        if (f18836c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18836c = handler;
            handler.post(f18837j);
            f18836c.postDelayed(f18838k, 200);
        }
    }

    /* renamed from: l */
    private void m22448l() {
        Handler handler = f18836c;
        if (handler != null) {
            handler.removeCallbacks(f18838k);
            f18836c = null;
        }
    }

    /* renamed from: a */
    public void mo55459a() {
        m22447k();
    }

    /* renamed from: a */
    public void mo55429a(View view, C7899a aVar, JSONObject jSONObject) {
        C7931c c;
        if (C7910f.m22404d(view) && (c = this.f18842g.mo55476c(view)) != C7931c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55427a(view);
            C7905b.m22376a(jSONObject, a);
            if (!m22438a(view, a)) {
                m22439b(view, a);
                m22436a(view, aVar, a, c);
            }
            this.f18840e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18839d.contains(treeWalkerTimeLogger)) {
            this.f18839d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55461b() {
        mo55462c();
        this.f18839d.clear();
        f18835b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18843h.mo55497a();
            }
        });
    }

    /* renamed from: c */
    public void mo55462c() {
        m22448l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55463d() {
        this.f18842g.mo55477c();
        long a = C7908d.m22387a();
        C7899a a2 = this.f18841f.mo55430a();
        if (this.f18842g.mo55475b().size() > 0) {
            Iterator<String> it = this.f18842g.mo55475b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55427a((View) null);
                m22437a(next, this.f18842g.mo55473b(next), a3);
                C7905b.m22372a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18843h.mo55499b(a3, hashSet, a);
            }
        }
        if (this.f18842g.mo55472a().size() > 0) {
            JSONObject a4 = a2.mo55427a((View) null);
            m22436a((View) null, a2, a4, C7931c.PARENT_VIEW);
            C7905b.m22372a(a4);
            this.f18843h.mo55498a(a4, this.f18842g.mo55472a(), a);
        } else {
            this.f18843h.mo55497a();
        }
        this.f18842g.mo55478d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18839d.contains(treeWalkerTimeLogger)) {
            this.f18839d.remove(treeWalkerTimeLogger);
        }
    }
}
