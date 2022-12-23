package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.p282c.C8100a;
import com.iab.omid.library.vungle.p282c.C8102b;
import com.iab.omid.library.vungle.p283d.C8106b;
import com.iab.omid.library.vungle.p283d.C8109d;
import com.iab.omid.library.vungle.p283d.C8111f;
import com.iab.omid.library.vungle.walking.C8121a;
import com.iab.omid.library.vungle.walking.p285a.C8127c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C8100a.C8101a {

    /* renamed from: a */
    private static TreeWalker f19298a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19299b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19300c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19301j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m23351h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19302k = new Runnable() {
        public void run() {
            if (TreeWalker.f19300c != null) {
                TreeWalker.f19300c.post(TreeWalker.f19301j);
                TreeWalker.f19300c.postDelayed(TreeWalker.f19302k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19303d = new ArrayList();

    /* renamed from: e */
    private int f19304e;

    /* renamed from: f */
    private C8102b f19305f = new C8102b();

    /* renamed from: g */
    private C8121a f19306g = new C8121a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8131b f19307h = new C8131b(new C8127c());

    /* renamed from: i */
    private long f19308i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m23342a(long j) {
        if (this.f19303d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19303d) {
                next.onTreeProcessed(this.f19304e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19304e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m23343a(View view, C8100a aVar, JSONObject jSONObject, C8132c cVar) {
        aVar.mo56229a(view, jSONObject, this, cVar == C8132c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m23344a(String str, View view, JSONObject jSONObject) {
        C8100a b = this.f19305f.mo56232b();
        String a = this.f19306g.mo56272a(str);
        if (a != null) {
            JSONObject a2 = b.mo56228a(view);
            C8106b.m23281a(a2, str);
            C8106b.m23286b(a2, a);
            C8106b.m23283a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m23345a(View view, JSONObject jSONObject) {
        String a = this.f19306g.mo56271a(view);
        if (a == null) {
            return false;
        }
        C8106b.m23281a(jSONObject, a);
        this.f19306g.mo56280e();
        return true;
    }

    /* renamed from: b */
    private void m23346b(View view, JSONObject jSONObject) {
        C8121a.C8122a b = this.f19306g.mo56275b(view);
        if (b != null) {
            C8106b.m23280a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19298a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23351h() {
        m23352i();
        mo56264d();
        m23353j();
    }

    /* renamed from: i */
    private void m23352i() {
        this.f19304e = 0;
        this.f19308i = C8109d.m23294a();
    }

    /* renamed from: j */
    private void m23353j() {
        m23342a(C8109d.m23294a() - this.f19308i);
    }

    /* renamed from: k */
    private void m23354k() {
        if (f19300c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19300c = handler;
            handler.post(f19301j);
            f19300c.postDelayed(f19302k, 200);
        }
    }

    /* renamed from: l */
    private void m23355l() {
        Handler handler = f19300c;
        if (handler != null) {
            handler.removeCallbacks(f19302k);
            f19300c = null;
        }
    }

    /* renamed from: a */
    public void mo56260a() {
        m23354k();
    }

    /* renamed from: a */
    public void mo56230a(View view, C8100a aVar, JSONObject jSONObject) {
        C8132c c;
        if (C8111f.m23311d(view) && (c = this.f19306g.mo56277c(view)) != C8132c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo56228a(view);
            C8106b.m23283a(jSONObject, a);
            if (!m23345a(view, a)) {
                m23346b(view, a);
                m23343a(view, aVar, a, c);
            }
            this.f19304e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19303d.contains(treeWalkerTimeLogger)) {
            this.f19303d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo56262b() {
        mo56263c();
        this.f19303d.clear();
        f19299b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19307h.mo56298a();
            }
        });
    }

    /* renamed from: c */
    public void mo56263c() {
        m23355l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo56264d() {
        this.f19306g.mo56278c();
        long a = C8109d.m23294a();
        C8100a a2 = this.f19305f.mo56231a();
        if (this.f19306g.mo56276b().size() > 0) {
            Iterator<String> it = this.f19306g.mo56276b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo56228a((View) null);
                m23344a(next, this.f19306g.mo56274b(next), a3);
                C8106b.m23279a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19307h.mo56300b(a3, hashSet, a);
            }
        }
        if (this.f19306g.mo56273a().size() > 0) {
            JSONObject a4 = a2.mo56228a((View) null);
            m23343a((View) null, a2, a4, C8132c.PARENT_VIEW);
            C8106b.m23279a(a4);
            this.f19307h.mo56299a(a4, this.f19306g.mo56273a(), a);
        } else {
            this.f19307h.mo56298a();
        }
        this.f19306g.mo56279d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19303d.contains(treeWalkerTimeLogger)) {
            this.f19303d.remove(treeWalkerTimeLogger);
        }
    }
}
