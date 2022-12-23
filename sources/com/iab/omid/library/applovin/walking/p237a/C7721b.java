package com.iab.omid.library.applovin.walking.p237a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.walking.a.b */
public abstract class C7721b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7722a f18402a;

    /* renamed from: d */
    protected final C7723b f18403d;

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$a */
    public interface C7722a {
        /* renamed from: a */
        void mo54714a(C7721b bVar);
    }

    /* renamed from: com.iab.omid.library.applovin.walking.a.b$b */
    public interface C7723b {
        /* renamed from: a */
        void mo54715a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54716b();
    }

    public C7721b(C7723b bVar) {
        this.f18403d = bVar;
    }

    /* renamed from: a */
    public void mo54710a(C7722a aVar) {
        this.f18402a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7722a aVar = this.f18402a;
        if (aVar != null) {
            aVar.mo54714a(this);
        }
    }

    /* renamed from: a */
    public void mo54712a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
