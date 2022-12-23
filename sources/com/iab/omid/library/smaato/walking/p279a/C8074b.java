package com.iab.omid.library.smaato.walking.p279a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.smaato.walking.a.b */
public abstract class C8074b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C8075a f19210a;

    /* renamed from: d */
    protected final C8076b f19211d;

    /* renamed from: com.iab.omid.library.smaato.walking.a.b$a */
    public interface C8075a {
        /* renamed from: a */
        void mo56094a(C8074b bVar);
    }

    /* renamed from: com.iab.omid.library.smaato.walking.a.b$b */
    public interface C8076b {
        /* renamed from: a */
        void mo56095a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo56096b();
    }

    public C8074b(C8076b bVar) {
        this.f19211d = bVar;
    }

    /* renamed from: a */
    public void mo56090a(C8075a aVar) {
        this.f19210a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C8075a aVar = this.f19210a;
        if (aVar != null) {
            aVar.mo56094a(this);
        }
    }

    /* renamed from: a */
    public void mo56092a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
