package com.iab.omid.library.fyber.walking.p249a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.fyber.walking.a.b */
public abstract class C7822b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7823a f18632a;

    /* renamed from: d */
    protected final C7824b f18633d;

    /* renamed from: com.iab.omid.library.fyber.walking.a.b$a */
    public interface C7823a {
        /* renamed from: a */
        void mo55107a(C7822b bVar);
    }

    /* renamed from: com.iab.omid.library.fyber.walking.a.b$b */
    public interface C7824b {
        /* renamed from: a */
        void mo55108a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55109b();
    }

    public C7822b(C7824b bVar) {
        this.f18633d = bVar;
    }

    /* renamed from: a */
    public void mo55103a(C7823a aVar) {
        this.f18632a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7823a aVar = this.f18632a;
        if (aVar != null) {
            aVar.mo55107a(this);
        }
    }

    /* renamed from: a */
    public void mo55105a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
