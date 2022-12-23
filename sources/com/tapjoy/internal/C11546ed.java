package com.tapjoy.internal;

import com.tapjoy.internal.C11528du;
import com.tapjoy.internal.C11541ea;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ed */
public final class C11546ed extends C11539dz {
    public C11546ed(C11541ea.C11543b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void onPostExecute(String str) {
        C11507dd a = C11507dd.m33405a();
        if (a != null) {
            for (T t : Collections.unmodifiableCollection(a.f27851a)) {
                if (this.f27919a.contains(t.f27822f)) {
                    C11528du duVar = t.f27819c;
                    if (this.f27921c >= duVar.f27885d && duVar.f27884c != C11528du.C11529a.f27889c) {
                        duVar.f27884c = C11528du.C11529a.f27889c;
                        C11512dh.m33412a().mo72308b(duVar.mo72323c(), str);
                    }
                }
            }
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f27920b.toString();
    }
}
