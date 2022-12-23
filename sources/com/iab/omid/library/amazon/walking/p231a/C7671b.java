package com.iab.omid.library.amazon.walking.p231a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.amazon.walking.a.b */
public abstract class C7671b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7672a f18285a;

    /* renamed from: d */
    protected final C7673b f18286d;

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$a */
    public interface C7672a {
        /* renamed from: a */
        void mo54515a(C7671b bVar);
    }

    /* renamed from: com.iab.omid.library.amazon.walking.a.b$b */
    public interface C7673b {
        /* renamed from: a */
        void mo54516a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54517b();
    }

    public C7671b(C7673b bVar) {
        this.f18286d = bVar;
    }

    /* renamed from: a */
    public void mo54511a(C7672a aVar) {
        this.f18285a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7672a aVar = this.f18285a;
        if (aVar != null) {
            aVar.mo54515a(this);
        }
    }

    /* renamed from: a */
    public void mo54513a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
