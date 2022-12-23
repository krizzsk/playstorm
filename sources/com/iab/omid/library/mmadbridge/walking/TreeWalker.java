package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7938a;
import com.iab.omid.library.mmadbridge.p263b.C7940a;
import com.iab.omid.library.mmadbridge.p264c.C7949a;
import com.iab.omid.library.mmadbridge.p264c.C7951b;
import com.iab.omid.library.mmadbridge.p265d.C7955b;
import com.iab.omid.library.mmadbridge.p265d.C7958d;
import com.iab.omid.library.mmadbridge.p265d.C7960f;
import com.iab.omid.library.mmadbridge.p266e.C7961a;
import com.iab.omid.library.mmadbridge.walking.C7970a;
import com.iab.omid.library.mmadbridge.walking.p267a.C7976c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7949a.C7950a {

    /* renamed from: a */
    private static TreeWalker f18948a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18949b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18950c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18951l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m22672h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18952m = new Runnable() {
        public void run() {
            if (TreeWalker.f18950c != null) {
                TreeWalker.f18950c.post(TreeWalker.f18951l);
                TreeWalker.f18950c.postDelayed(TreeWalker.f18952m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18953d = new ArrayList();

    /* renamed from: e */
    private int f18954e;

    /* renamed from: f */
    private boolean f18955f = false;

    /* renamed from: g */
    private final List<C7961a> f18956g = new ArrayList();

    /* renamed from: h */
    private C7951b f18957h = new C7951b();

    /* renamed from: i */
    private C7970a f18958i = new C7970a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7980b f18959j = new C7980b(new C7976c());

    /* renamed from: k */
    private long f18960k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22663a(long j) {
        if (this.f18953d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18953d) {
                next.onTreeProcessed(this.f18954e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18954e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22664a(View view, C7949a aVar, JSONObject jSONObject, C7981c cVar, boolean z) {
        aVar.mo55626a(view, jSONObject, this, cVar == C7981c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m22665a(String str, View view, JSONObject jSONObject) {
        C7949a b = this.f18957h.mo55629b();
        String a = this.f18958i.mo55669a(str);
        if (a != null) {
            JSONObject a2 = b.mo55625a(view);
            C7955b.m22601a(a2, str);
            C7955b.m22606b(a2, a);
            C7955b.m22603a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22666a(View view, JSONObject jSONObject) {
        String a = this.f18958i.mo55668a(view);
        if (a == null) {
            return false;
        }
        C7955b.m22601a(jSONObject, a);
        C7955b.m22600a(jSONObject, Boolean.valueOf(this.f18958i.mo55677d(view)));
        this.f18958i.mo55678e();
        return true;
    }

    /* renamed from: b */
    private boolean m22668b(View view, JSONObject jSONObject) {
        C7970a.C7971a b = this.f18958i.mo55672b(view);
        if (b == null) {
            return false;
        }
        C7955b.m22599a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18948a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22672h() {
        m22673i();
        mo55661d();
        m22674j();
    }

    /* renamed from: i */
    private void m22673i() {
        this.f18954e = 0;
        this.f18956g.clear();
        this.f18955f = false;
        Iterator<C7938a> it = C7940a.m22525a().mo55582c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo55545b()) {
                    this.f18955f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18960k = C7958d.m22615a();
    }

    /* renamed from: j */
    private void m22674j() {
        m22663a(C7958d.m22615a() - this.f18960k);
    }

    /* renamed from: k */
    private void m22675k() {
        if (f18950c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18950c = handler;
            handler.post(f18951l);
            f18950c.postDelayed(f18952m, 200);
        }
    }

    /* renamed from: l */
    private void m22676l() {
        Handler handler = f18950c;
        if (handler != null) {
            handler.removeCallbacks(f18952m);
            f18950c = null;
        }
    }

    /* renamed from: a */
    public void mo55657a() {
        m22675k();
    }

    /* renamed from: a */
    public void mo55627a(View view, C7949a aVar, JSONObject jSONObject, boolean z) {
        C7981c c;
        if (C7960f.m22632d(view) && (c = this.f18958i.mo55674c(view)) != C7981c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55625a(view);
            C7955b.m22603a(jSONObject, a);
            if (!m22666a(view, a)) {
                boolean z2 = z || m22668b(view, a);
                if (this.f18955f && c == C7981c.OBSTRUCTION_VIEW && !z2) {
                    this.f18956g.add(new C7961a(view));
                }
                m22664a(view, aVar, a, c, z2);
            }
            this.f18954e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18953d.contains(treeWalkerTimeLogger)) {
            this.f18953d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55659b() {
        mo55660c();
        this.f18953d.clear();
        f18949b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18959j.mo55696a();
            }
        });
    }

    /* renamed from: c */
    public void mo55660c() {
        m22676l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55661d() {
        this.f18958i.mo55675c();
        long a = C7958d.m22615a();
        C7949a a2 = this.f18957h.mo55628a();
        if (this.f18958i.mo55673b().size() > 0) {
            Iterator<String> it = this.f18958i.mo55673b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55625a((View) null);
                m22665a(next, this.f18958i.mo55671b(next), a3);
                C7955b.m22598a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18959j.mo55698b(a3, hashSet, a);
            }
        }
        if (this.f18958i.mo55670a().size() > 0) {
            JSONObject a4 = a2.mo55625a((View) null);
            m22664a((View) null, a2, a4, C7981c.PARENT_VIEW, false);
            C7955b.m22598a(a4);
            this.f18959j.mo55697a(a4, this.f18958i.mo55670a(), a);
            if (this.f18955f) {
                for (C7938a a5 : C7940a.m22525a().mo55582c()) {
                    a5.mo55543a(this.f18956g);
                }
            }
        } else {
            this.f18959j.mo55696a();
        }
        this.f18958i.mo55676d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18953d.contains(treeWalkerTimeLogger)) {
            this.f18953d.remove(treeWalkerTimeLogger);
        }
    }
}
