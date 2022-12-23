package com.iab.omid.library.oguryco.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.oguryco.p270c.C8000a;
import com.iab.omid.library.oguryco.p270c.C8002b;
import com.iab.omid.library.oguryco.p271d.C8006b;
import com.iab.omid.library.oguryco.p271d.C8009d;
import com.iab.omid.library.oguryco.p271d.C8011f;
import com.iab.omid.library.oguryco.walking.C8021a;
import com.iab.omid.library.oguryco.walking.p273a.C8027c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C8000a.C8001a {

    /* renamed from: a */
    private static TreeWalker f19072a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19073b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19074c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19075j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m22903h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19076k = new Runnable() {
        public final void run() {
            if (TreeWalker.f19074c != null) {
                TreeWalker.f19074c.post(TreeWalker.f19075j);
                TreeWalker.f19074c.postDelayed(TreeWalker.f19076k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19077d = new ArrayList();

    /* renamed from: e */
    private int f19078e;

    /* renamed from: f */
    private C8002b f19079f = new C8002b();

    /* renamed from: g */
    private C8021a f19080g = new C8021a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8031b f19081h = new C8031b(new C8027c());

    /* renamed from: i */
    private long f19082i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22894a(long j) {
        if (this.f19077d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19077d) {
                next.onTreeProcessed(this.f19078e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19078e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22895a(View view, C8000a aVar, JSONObject jSONObject, C8032c cVar) {
        aVar.mo55841a(view, jSONObject, this, cVar == C8032c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22896a(String str, View view, JSONObject jSONObject) {
        C8000a b = this.f19079f.mo55844b();
        String a = this.f19080g.mo55884a(str);
        if (a != null) {
            JSONObject a2 = b.mo55840a(view);
            C8006b.m22833a(a2, str);
            C8006b.m22838b(a2, a);
            C8006b.m22835a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22897a(View view, JSONObject jSONObject) {
        String a = this.f19080g.mo55883a(view);
        if (a == null) {
            return false;
        }
        C8006b.m22833a(jSONObject, a);
        this.f19080g.mo55892e();
        return true;
    }

    /* renamed from: b */
    private void m22898b(View view, JSONObject jSONObject) {
        C8021a.C8022a b = this.f19080g.mo55887b(view);
        if (b != null) {
            C8006b.m22832a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19072a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22903h() {
        m22904i();
        mo55876d();
        m22905j();
    }

    /* renamed from: i */
    private void m22904i() {
        this.f19078e = 0;
        this.f19082i = C8009d.m22846a();
    }

    /* renamed from: j */
    private void m22905j() {
        m22894a(C8009d.m22846a() - this.f19082i);
    }

    /* renamed from: k */
    private void m22906k() {
        if (f19074c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19074c = handler;
            handler.post(f19075j);
            f19074c.postDelayed(f19076k, 200);
        }
    }

    /* renamed from: l */
    private void m22907l() {
        Handler handler = f19074c;
        if (handler != null) {
            handler.removeCallbacks(f19076k);
            f19074c = null;
        }
    }

    /* renamed from: a */
    public void mo55872a() {
        m22906k();
    }

    /* renamed from: a */
    public void mo55842a(View view, C8000a aVar, JSONObject jSONObject) {
        C8032c c;
        if (C8011f.m22863d(view) && (c = this.f19080g.mo55889c(view)) != C8032c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55840a(view);
            C8006b.m22835a(jSONObject, a);
            if (!m22897a(view, a)) {
                m22898b(view, a);
                m22895a(view, aVar, a, c);
            }
            this.f19078e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19077d.contains(treeWalkerTimeLogger)) {
            this.f19077d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55874b() {
        mo55875c();
        this.f19077d.clear();
        f19073b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19081h.mo55910a();
            }
        });
    }

    /* renamed from: c */
    public void mo55875c() {
        m22907l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55876d() {
        this.f19080g.mo55890c();
        long a = C8009d.m22846a();
        C8000a a2 = this.f19079f.mo55843a();
        if (this.f19080g.mo55888b().size() > 0) {
            Iterator<String> it = this.f19080g.mo55888b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55840a((View) null);
                m22896a(next, this.f19080g.mo55886b(next), a3);
                C8006b.m22831a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19081h.mo55912b(a3, hashSet, a);
            }
        }
        if (this.f19080g.mo55885a().size() > 0) {
            JSONObject a4 = a2.mo55840a((View) null);
            m22895a((View) null, a2, a4, C8032c.PARENT_VIEW);
            C8006b.m22831a(a4);
            this.f19081h.mo55911a(a4, this.f19080g.mo55885a(), a);
        } else {
            this.f19081h.mo55910a();
        }
        this.f19080g.mo55891d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19077d.contains(treeWalkerTimeLogger)) {
            this.f19077d.remove(treeWalkerTimeLogger);
        }
    }
}
