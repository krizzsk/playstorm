package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C7787a;
import com.iab.omid.library.fyber.p245b.C7789a;
import com.iab.omid.library.fyber.p246c.C7798a;
import com.iab.omid.library.fyber.p246c.C7800b;
import com.iab.omid.library.fyber.p247d.C7804b;
import com.iab.omid.library.fyber.p247d.C7807d;
import com.iab.omid.library.fyber.p247d.C7809f;
import com.iab.omid.library.fyber.p248e.C7810a;
import com.iab.omid.library.fyber.walking.C7819a;
import com.iab.omid.library.fyber.walking.p249a.C7825c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7798a.C7799a {

    /* renamed from: a */
    private static TreeWalker f18604a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18605b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18606c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18607l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21997h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18608m = new Runnable() {
        public void run() {
            if (TreeWalker.f18606c != null) {
                TreeWalker.f18606c.post(TreeWalker.f18607l);
                TreeWalker.f18606c.postDelayed(TreeWalker.f18608m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18609d = new ArrayList();

    /* renamed from: e */
    private int f18610e;

    /* renamed from: f */
    private boolean f18611f = false;

    /* renamed from: g */
    private final List<C7810a> f18612g = new ArrayList();

    /* renamed from: h */
    private C7800b f18613h = new C7800b();

    /* renamed from: i */
    private C7819a f18614i = new C7819a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7829b f18615j = new C7829b(new C7825c());

    /* renamed from: k */
    private long f18616k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21988a(long j) {
        if (this.f18609d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18609d) {
                next.onTreeProcessed(this.f18610e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18610e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21989a(View view, C7798a aVar, JSONObject jSONObject, C7830c cVar, boolean z) {
        aVar.mo55047a(view, jSONObject, this, cVar == C7830c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21990a(String str, View view, JSONObject jSONObject) {
        C7798a b = this.f18613h.mo55050b();
        String a = this.f18614i.mo55090a(str);
        if (a != null) {
            JSONObject a2 = b.mo55046a(view);
            C7804b.m21926a(a2, str);
            C7804b.m21931b(a2, a);
            C7804b.m21928a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21991a(View view, JSONObject jSONObject) {
        String a = this.f18614i.mo55089a(view);
        if (a == null) {
            return false;
        }
        C7804b.m21926a(jSONObject, a);
        C7804b.m21925a(jSONObject, Boolean.valueOf(this.f18614i.mo55098d(view)));
        this.f18614i.mo55099e();
        return true;
    }

    /* renamed from: b */
    private boolean m21993b(View view, JSONObject jSONObject) {
        C7819a.C7820a b = this.f18614i.mo55093b(view);
        if (b == null) {
            return false;
        }
        C7804b.m21924a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18604a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21997h() {
        m21998i();
        mo55082d();
        m21999j();
    }

    /* renamed from: i */
    private void m21998i() {
        this.f18610e = 0;
        this.f18612g.clear();
        this.f18611f = false;
        Iterator<C7787a> it = C7789a.m21850a().mo55003c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54966b()) {
                    this.f18611f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18616k = C7807d.m21940a();
    }

    /* renamed from: j */
    private void m21999j() {
        m21988a(C7807d.m21940a() - this.f18616k);
    }

    /* renamed from: k */
    private void m22000k() {
        if (f18606c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18606c = handler;
            handler.post(f18607l);
            f18606c.postDelayed(f18608m, 200);
        }
    }

    /* renamed from: l */
    private void m22001l() {
        Handler handler = f18606c;
        if (handler != null) {
            handler.removeCallbacks(f18608m);
            f18606c = null;
        }
    }

    /* renamed from: a */
    public void mo55078a() {
        m22000k();
    }

    /* renamed from: a */
    public void mo55048a(View view, C7798a aVar, JSONObject jSONObject, boolean z) {
        C7830c c;
        if (C7809f.m21957d(view) && (c = this.f18614i.mo55095c(view)) != C7830c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55046a(view);
            C7804b.m21928a(jSONObject, a);
            if (!m21991a(view, a)) {
                boolean z2 = z || m21993b(view, a);
                if (this.f18611f && c == C7830c.OBSTRUCTION_VIEW && !z2) {
                    this.f18612g.add(new C7810a(view));
                }
                m21989a(view, aVar, a, c, z2);
            }
            this.f18610e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18609d.contains(treeWalkerTimeLogger)) {
            this.f18609d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55080b() {
        mo55081c();
        this.f18609d.clear();
        f18605b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18615j.mo55117a();
            }
        });
    }

    /* renamed from: c */
    public void mo55081c() {
        m22001l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55082d() {
        this.f18614i.mo55096c();
        long a = C7807d.m21940a();
        C7798a a2 = this.f18613h.mo55049a();
        if (this.f18614i.mo55094b().size() > 0) {
            Iterator<String> it = this.f18614i.mo55094b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55046a((View) null);
                m21990a(next, this.f18614i.mo55092b(next), a3);
                C7804b.m21923a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18615j.mo55119b(a3, hashSet, a);
            }
        }
        if (this.f18614i.mo55091a().size() > 0) {
            JSONObject a4 = a2.mo55046a((View) null);
            m21989a((View) null, a2, a4, C7830c.PARENT_VIEW, false);
            C7804b.m21923a(a4);
            this.f18615j.mo55118a(a4, this.f18614i.mo55091a(), a);
            if (this.f18611f) {
                for (C7787a a5 : C7789a.m21850a().mo55003c()) {
                    a5.mo54964a(this.f18612g);
                }
            }
        } else {
            this.f18615j.mo55117a();
        }
        this.f18614i.mo55097d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18609d.contains(treeWalkerTimeLogger)) {
            this.f18609d.remove(treeWalkerTimeLogger);
        }
    }
}
