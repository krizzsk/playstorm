package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C7636a;
import com.iab.omid.library.amazon.p227b.C7638a;
import com.iab.omid.library.amazon.p228c.C7647a;
import com.iab.omid.library.amazon.p228c.C7649b;
import com.iab.omid.library.amazon.p229d.C7653b;
import com.iab.omid.library.amazon.p229d.C7656d;
import com.iab.omid.library.amazon.p229d.C7658f;
import com.iab.omid.library.amazon.p230e.C7659a;
import com.iab.omid.library.amazon.walking.C7668a;
import com.iab.omid.library.amazon.walking.p231a.C7674c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7647a.C7648a {

    /* renamed from: a */
    private static TreeWalker f18257a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18258b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18259c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18260l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21313h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18261m = new Runnable() {
        public void run() {
            if (TreeWalker.f18259c != null) {
                TreeWalker.f18259c.post(TreeWalker.f18260l);
                TreeWalker.f18259c.postDelayed(TreeWalker.f18261m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18262d = new ArrayList();

    /* renamed from: e */
    private int f18263e;

    /* renamed from: f */
    private boolean f18264f = false;

    /* renamed from: g */
    private final List<C7659a> f18265g = new ArrayList();

    /* renamed from: h */
    private C7649b f18266h = new C7649b();

    /* renamed from: i */
    private C7668a f18267i = new C7668a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7678b f18268j = new C7678b(new C7674c());

    /* renamed from: k */
    private long f18269k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21304a(long j) {
        if (this.f18262d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18262d) {
                next.onTreeProcessed(this.f18263e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18263e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21305a(View view, C7647a aVar, JSONObject jSONObject, C7679c cVar, boolean z) {
        aVar.mo54455a(view, jSONObject, this, cVar == C7679c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21306a(String str, View view, JSONObject jSONObject) {
        C7647a b = this.f18266h.mo54458b();
        String a = this.f18267i.mo54498a(str);
        if (a != null) {
            JSONObject a2 = b.mo54454a(view);
            C7653b.m21242a(a2, str);
            C7653b.m21247b(a2, a);
            C7653b.m21244a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21307a(View view, JSONObject jSONObject) {
        String a = this.f18267i.mo54497a(view);
        if (a == null) {
            return false;
        }
        C7653b.m21242a(jSONObject, a);
        C7653b.m21241a(jSONObject, Boolean.valueOf(this.f18267i.mo54506d(view)));
        this.f18267i.mo54507e();
        return true;
    }

    /* renamed from: b */
    private boolean m21309b(View view, JSONObject jSONObject) {
        C7668a.C7669a b = this.f18267i.mo54501b(view);
        if (b == null) {
            return false;
        }
        C7653b.m21240a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18257a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21313h() {
        m21314i();
        mo54490d();
        m21315j();
    }

    /* renamed from: i */
    private void m21314i() {
        this.f18263e = 0;
        this.f18265g.clear();
        this.f18264f = false;
        Iterator<C7636a> it = C7638a.m21166a().mo54411c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54374b()) {
                    this.f18264f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18269k = C7656d.m21256a();
    }

    /* renamed from: j */
    private void m21315j() {
        m21304a(C7656d.m21256a() - this.f18269k);
    }

    /* renamed from: k */
    private void m21316k() {
        if (f18259c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18259c = handler;
            handler.post(f18260l);
            f18259c.postDelayed(f18261m, 200);
        }
    }

    /* renamed from: l */
    private void m21317l() {
        Handler handler = f18259c;
        if (handler != null) {
            handler.removeCallbacks(f18261m);
            f18259c = null;
        }
    }

    /* renamed from: a */
    public void mo54486a() {
        m21316k();
    }

    /* renamed from: a */
    public void mo54456a(View view, C7647a aVar, JSONObject jSONObject, boolean z) {
        C7679c c;
        if (C7658f.m21273d(view) && (c = this.f18267i.mo54503c(view)) != C7679c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54454a(view);
            C7653b.m21244a(jSONObject, a);
            if (!m21307a(view, a)) {
                boolean z2 = z || m21309b(view, a);
                if (this.f18264f && c == C7679c.OBSTRUCTION_VIEW && !z2) {
                    this.f18265g.add(new C7659a(view));
                }
                m21305a(view, aVar, a, c, z2);
            }
            this.f18263e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18262d.contains(treeWalkerTimeLogger)) {
            this.f18262d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54488b() {
        mo54489c();
        this.f18262d.clear();
        f18258b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18268j.mo54525a();
            }
        });
    }

    /* renamed from: c */
    public void mo54489c() {
        m21317l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54490d() {
        this.f18267i.mo54504c();
        long a = C7656d.m21256a();
        C7647a a2 = this.f18266h.mo54457a();
        if (this.f18267i.mo54502b().size() > 0) {
            Iterator<String> it = this.f18267i.mo54502b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54454a((View) null);
                m21306a(next, this.f18267i.mo54500b(next), a3);
                C7653b.m21239a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18268j.mo54527b(a3, hashSet, a);
            }
        }
        if (this.f18267i.mo54499a().size() > 0) {
            JSONObject a4 = a2.mo54454a((View) null);
            m21305a((View) null, a2, a4, C7679c.PARENT_VIEW, false);
            C7653b.m21239a(a4);
            this.f18268j.mo54526a(a4, this.f18267i.mo54499a(), a);
            if (this.f18264f) {
                for (C7636a a5 : C7638a.m21166a().mo54411c()) {
                    a5.mo54372a(this.f18265g);
                }
            }
        } else {
            this.f18268j.mo54525a();
        }
        this.f18267i.mo54505d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18262d.contains(treeWalkerTimeLogger)) {
            this.f18262d.remove(treeWalkerTimeLogger);
        }
    }
}
