package com.iab.omid.library.corpmailru.walking.p243a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.corpmailru.walking.a.b */
public abstract class C7771b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7772a f18515a;

    /* renamed from: d */
    public final C7773b f18516d;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$a */
    public interface C7772a {
        /* renamed from: a */
        void mo54908a(C7771b bVar);
    }

    /* renamed from: com.iab.omid.library.corpmailru.walking.a.b$b */
    public interface C7773b {
        /* renamed from: a */
        void mo54909a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54910b();
    }

    public C7771b(C7773b bVar) {
        this.f18516d = bVar;
    }

    /* renamed from: a */
    public void mo54904a(C7772a aVar) {
        this.f18515a = aVar;
    }

    /* renamed from: a */
    public void onPostExecute(String str) {
        C7772a aVar = this.f18515a;
        if (aVar != null) {
            aVar.mo54908a(this);
        }
    }

    /* renamed from: a */
    public void mo54906a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
