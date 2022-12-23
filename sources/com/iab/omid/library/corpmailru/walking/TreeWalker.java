package com.iab.omid.library.corpmailru.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.corpmailru.p240c.C7747a;
import com.iab.omid.library.corpmailru.p240c.C7749b;
import com.iab.omid.library.corpmailru.p241d.C7753b;
import com.iab.omid.library.corpmailru.p241d.C7756d;
import com.iab.omid.library.corpmailru.p241d.C7758f;
import com.iab.omid.library.corpmailru.walking.C7768a;
import com.iab.omid.library.corpmailru.walking.p243a.C7774c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7747a.C7748a {

    /* renamed from: a */
    private static TreeWalker f18490a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18491b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18492c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f18493j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21769h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f18494k = new Runnable() {
        public void run() {
            if (TreeWalker.f18492c != null) {
                TreeWalker.f18492c.post(TreeWalker.f18493j);
                TreeWalker.f18492c.postDelayed(TreeWalker.f18494k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18495d = new ArrayList();

    /* renamed from: e */
    private int f18496e;

    /* renamed from: f */
    private C7749b f18497f = new C7749b();

    /* renamed from: g */
    private C7768a f18498g = new C7768a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7778b f18499h = new C7778b(new C7774c());

    /* renamed from: i */
    private long f18500i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: a */
    private void m21760a(long j) {
        if (this.f18495d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18495d) {
                next.onTreeProcessed(this.f18496e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18496e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21761a(View view, C7747a aVar, JSONObject jSONObject, C7779c cVar) {
        aVar.mo54849a(view, jSONObject, this, cVar == C7779c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m21762a(String str, View view, JSONObject jSONObject) {
        C7747a b = this.f18497f.mo54852b();
        String a = this.f18498g.mo54892a(str);
        if (a != null) {
            JSONObject a2 = b.mo54848a(view);
            C7753b.m21699a(a2, str);
            C7753b.m21704b(a2, a);
            C7753b.m21701a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21763a(View view, JSONObject jSONObject) {
        String a = this.f18498g.mo54891a(view);
        if (a == null) {
            return false;
        }
        C7753b.m21699a(jSONObject, a);
        this.f18498g.mo54900e();
        return true;
    }

    /* renamed from: b */
    private void m21764b(View view, JSONObject jSONObject) {
        C7768a.C7769a b = this.f18498g.mo54895b(view);
        if (b != null) {
            C7753b.m21698a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f18490a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21769h() {
        m21770i();
        mo54884d();
        m21771j();
    }

    /* renamed from: i */
    private void m21770i() {
        this.f18496e = 0;
        this.f18500i = C7756d.m21712a();
    }

    /* renamed from: j */
    private void m21771j() {
        m21760a(C7756d.m21712a() - this.f18500i);
    }

    /* renamed from: k */
    private void m21772k() {
        if (f18492c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18492c = handler;
            handler.post(f18493j);
            f18492c.postDelayed(f18494k, 200);
        }
    }

    /* renamed from: l */
    private void m21773l() {
        Handler handler = f18492c;
        if (handler != null) {
            handler.removeCallbacks(f18494k);
            f18492c = null;
        }
    }

    /* renamed from: a */
    public void mo54880a() {
        m21772k();
    }

    /* renamed from: a */
    public void mo54850a(View view, C7747a aVar, JSONObject jSONObject) {
        C7779c c;
        if (C7758f.m21729d(view) && (c = this.f18498g.mo54897c(view)) != C7779c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54848a(view);
            C7753b.m21701a(jSONObject, a);
            if (!m21763a(view, a)) {
                m21764b(view, a);
                m21761a(view, aVar, a, c);
            }
            this.f18496e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18495d.contains(treeWalkerTimeLogger)) {
            this.f18495d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54882b() {
        mo54883c();
        this.f18495d.clear();
        f18491b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18499h.mo54918a();
            }
        });
    }

    /* renamed from: c */
    public void mo54883c() {
        m21773l();
    }

    /* renamed from: d */
    public void mo54884d() {
        this.f18498g.mo54898c();
        long a = C7756d.m21712a();
        C7747a a2 = this.f18497f.mo54851a();
        if (this.f18498g.mo54896b().size() > 0) {
            Iterator<String> it = this.f18498g.mo54896b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54848a((View) null);
                m21762a(next, this.f18498g.mo54894b(next), a3);
                C7753b.m21697a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18499h.mo54920b(a3, hashSet, a);
            }
        }
        if (this.f18498g.mo54893a().size() > 0) {
            JSONObject a4 = a2.mo54848a((View) null);
            m21761a((View) null, a2, a4, C7779c.PARENT_VIEW);
            C7753b.m21697a(a4);
            this.f18499h.mo54919a(a4, this.f18498g.mo54893a(), a);
        } else {
            this.f18499h.mo54918a();
        }
        this.f18498g.mo54899d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18495d.contains(treeWalkerTimeLogger)) {
            this.f18495d.remove(treeWalkerTimeLogger);
        }
    }
}
