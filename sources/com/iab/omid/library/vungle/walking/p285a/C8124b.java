package com.iab.omid.library.vungle.walking.p285a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.walking.a.b */
public abstract class C8124b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C8125a f19323a;

    /* renamed from: d */
    protected final C8126b f19324d;

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$a */
    public interface C8125a {
        /* renamed from: a */
        void mo56288a(C8124b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.a.b$b */
    public interface C8126b {
        /* renamed from: a */
        void mo56289a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo56290b();
    }

    public C8124b(C8126b bVar) {
        this.f19324d = bVar;
    }

    /* renamed from: a */
    public void mo56284a(C8125a aVar) {
        this.f19323a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C8125a aVar = this.f19323a;
        if (aVar != null) {
            aVar.mo56288a(this);
        }
    }

    /* renamed from: a */
    public void mo56286a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
