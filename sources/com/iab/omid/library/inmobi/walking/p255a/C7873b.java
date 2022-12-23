package com.iab.omid.library.inmobi.walking.p255a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.inmobi.walking.a.b */
public abstract class C7873b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7874a f18745a;

    /* renamed from: d */
    protected final C7875b f18746d;

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$a */
    public interface C7874a {
        /* renamed from: a */
        void mo55301a(C7873b bVar);
    }

    /* renamed from: com.iab.omid.library.inmobi.walking.a.b$b */
    public interface C7875b {
        /* renamed from: a */
        void mo55302a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55303b();
    }

    public C7873b(C7875b bVar) {
        this.f18746d = bVar;
    }

    /* renamed from: a */
    public void mo55297a(C7874a aVar) {
        this.f18745a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7874a aVar = this.f18745a;
        if (aVar != null) {
            aVar.mo55301a(this);
        }
    }

    /* renamed from: a */
    public void mo55299a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
