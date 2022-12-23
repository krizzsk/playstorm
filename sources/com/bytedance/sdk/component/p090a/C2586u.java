package com.bytedance.sdk.component.p090a;

import android.net.Uri;
import com.bytedance.sdk.component.p090a.C2570k;
import com.bytedance.sdk.component.p090a.C2587v;
import com.bytedance.sdk.component.p090a.C2592w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.a.u */
/* compiled from: PermissionChecker */
class C2586u {

    /* renamed from: a */
    private final Set<String> f5528a;

    /* renamed from: b */
    private final Set<String> f5529b;

    /* renamed from: c */
    private final C2592w f5530c = C2582r.f5516a;

    /* renamed from: d */
    private final C2587v f5531d;

    /* renamed from: e */
    private C2570k.C2573b f5532e;

    C2586u(C2587v vVar, Set<String> set, Set<String> set2) {
        this.f5531d = vVar;
        if (set == null || set.isEmpty()) {
            this.f5528a = new LinkedHashSet();
        } else {
            this.f5528a = new LinkedHashSet(set);
        }
        if (set2 == null || set2.isEmpty()) {
            this.f5529b = new LinkedHashSet();
        } else {
            this.f5529b = new LinkedHashSet(set2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C2594x mo16608a(boolean z, String str, C2556b bVar) throws C2587v.C2589a {
        C2594x xVar;
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (host == null) {
            return null;
        }
        C2594x xVar2 = this.f5529b.contains(bVar.mo16549a()) ? C2594x.PUBLIC : null;
        Iterator<String> it = this.f5528a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (parse.getHost().equals(next)) {
                break;
            }
            if (host.endsWith("." + next)) {
                break;
            }
        }
        xVar2 = C2594x.PRIVATE;
        if (xVar2 == null && this.f5532e != null && this.f5532e.mo16583a(str)) {
            if (this.f5532e.mo16584a(str, bVar.mo16549a())) {
                return null;
            }
            xVar2 = C2594x.PRIVATE;
        }
        if (z) {
            xVar = mo16607a(str, bVar);
        } else {
            xVar = mo16611b(str, bVar);
        }
        if (xVar != null) {
            return xVar;
        }
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C2594x mo16607a(String str, C2556b bVar) throws C2587v.C2589a {
        return m6577a(str, bVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C2594x mo16611b(String str, C2556b bVar) {
        return m6577a(str, bVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16609a(C2570k.C2573b bVar) {
        this.f5532e = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16610a(C2592w.C2593a aVar) {
        C2592w wVar = this.f5530c;
        if (wVar != null) {
            wVar.mo16616a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16612b(C2592w.C2593a aVar) {
        C2592w wVar = this.f5530c;
        if (wVar != null) {
            wVar.mo16617b(aVar);
        }
    }

    /* renamed from: a */
    private C2594x m6577a(String str, C2556b bVar, boolean z) {
        C2587v vVar;
        if (!z || (vVar = this.f5531d) == null) {
            return null;
        }
        C2587v.C2591c a = vVar.mo16613a(str, this.f5528a);
        if (a.f5546c.contains(bVar.mo16549a())) {
            return null;
        }
        if (a.f5545b.contains(bVar.mo16549a())) {
            return C2594x.PRIVATE;
        }
        if (a.f5544a.compareTo(bVar.mo16551b()) < 0) {
            return null;
        }
        return a.f5544a;
    }
}
