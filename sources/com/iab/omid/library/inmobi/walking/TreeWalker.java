package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.p252c.C7849a;
import com.iab.omid.library.inmobi.p252c.C7851b;
import com.iab.omid.library.inmobi.p253d.C7855b;
import com.iab.omid.library.inmobi.p253d.C7858d;
import com.iab.omid.library.inmobi.p253d.C7860f;
import com.iab.omid.library.inmobi.walking.C7870a;
import com.iab.omid.library.inmobi.walking.p255a.C7876c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7849a.C7850a {

    /* renamed from: a */
    private static TreeWalker f18720a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18721b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18722c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f18723j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m22223h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f18724k = new Runnable() {
        public void run() {
            if (TreeWalker.f18722c != null) {
                TreeWalker.f18722c.post(TreeWalker.f18723j);
                TreeWalker.f18722c.postDelayed(TreeWalker.f18724k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18725d = new ArrayList();

    /* renamed from: e */
    private int f18726e;

    /* renamed from: f */
    private C7851b f18727f = new C7851b();

    /* renamed from: g */
    private C7870a f18728g = new C7870a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7880b f18729h = new C7880b(new C7876c());

    /* renamed from: i */
    private long f18730i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22214a(long j) {
        if (this.f18725d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18725d) {
                next.onTreeProcessed(this.f18726e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18726e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22215a(View view, C7849a aVar, JSONObject jSONObject, C7881c cVar) {
        aVar.mo55242a(view, jSONObject, this, cVar == C7881c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22216a(String str, View view, JSONObject jSONObject) {
        C7849a b = this.f18727f.mo55245b();
        String a = this.f18728g.mo55285a(str);
        if (a != null) {
            JSONObject a2 = b.mo55241a(view);
            C7855b.m22153a(a2, str);
            C7855b.m22158b(a2, a);
            C7855b.m22155a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22217a(View view, JSONObject jSONObject) {
        String a = this.f18728g.mo55284a(view);
        if (a == null) {
            return false;
        }
        C7855b.m22153a(jSONObject, a);
        this.f18728g.mo55293e();
        return true;
    }

    /* renamed from: b */
    private void m22218b(View view, JSONObject jSONObject) {
        C7870a.C7871a b = this.f18728g.mo55288b(view);
        if (b != null) {
            C7855b.m22152a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f18720a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22223h() {
        m22224i();
        mo55277d();
        m22225j();
    }

    /* renamed from: i */
    private void m22224i() {
        this.f18726e = 0;
        this.f18730i = C7858d.m22166a();
    }

    /* renamed from: j */
    private void m22225j() {
        m22214a(C7858d.m22166a() - this.f18730i);
    }

    /* renamed from: k */
    private void m22226k() {
        if (f18722c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18722c = handler;
            handler.post(f18723j);
            f18722c.postDelayed(f18724k, 200);
        }
    }

    /* renamed from: l */
    private void m22227l() {
        Handler handler = f18722c;
        if (handler != null) {
            handler.removeCallbacks(f18724k);
            f18722c = null;
        }
    }

    /* renamed from: a */
    public void mo55273a() {
        m22226k();
    }

    /* renamed from: a */
    public void mo55243a(View view, C7849a aVar, JSONObject jSONObject) {
        C7881c c;
        if (C7860f.m22183d(view) && (c = this.f18728g.mo55290c(view)) != C7881c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55241a(view);
            C7855b.m22155a(jSONObject, a);
            if (!m22217a(view, a)) {
                m22218b(view, a);
                m22215a(view, aVar, a, c);
            }
            this.f18726e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18725d.contains(treeWalkerTimeLogger)) {
            this.f18725d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55275b() {
        mo55276c();
        this.f18725d.clear();
        f18721b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18729h.mo55311a();
            }
        });
    }

    /* renamed from: c */
    public void mo55276c() {
        m22227l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55277d() {
        this.f18728g.mo55291c();
        long a = C7858d.m22166a();
        C7849a a2 = this.f18727f.mo55244a();
        if (this.f18728g.mo55289b().size() > 0) {
            Iterator<String> it = this.f18728g.mo55289b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55241a((View) null);
                m22216a(next, this.f18728g.mo55287b(next), a3);
                C7855b.m22151a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18729h.mo55313b(a3, hashSet, a);
            }
        }
        if (this.f18728g.mo55286a().size() > 0) {
            JSONObject a4 = a2.mo55241a((View) null);
            m22215a((View) null, a2, a4, C7881c.PARENT_VIEW);
            C7855b.m22151a(a4);
            this.f18729h.mo55312a(a4, this.f18728g.mo55286a(), a);
        } else {
            this.f18729h.mo55311a();
        }
        this.f18728g.mo55292d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18725d.contains(treeWalkerTimeLogger)) {
            this.f18725d.remove(treeWalkerTimeLogger);
        }
    }
}
