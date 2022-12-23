package com.iab.omid.library.mmadbridge.walking.p267a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.mmadbridge.walking.a.b */
public abstract class C7973b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7974a f18976a;

    /* renamed from: d */
    protected final C7975b f18977d;

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a.b$a */
    public interface C7974a {
        /* renamed from: a */
        void mo55686a(C7973b bVar);
    }

    /* renamed from: com.iab.omid.library.mmadbridge.walking.a.b$b */
    public interface C7975b {
        /* renamed from: a */
        void mo55687a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55688b();
    }

    public C7973b(C7975b bVar) {
        this.f18977d = bVar;
    }

    /* renamed from: a */
    public void mo55682a(C7974a aVar) {
        this.f18976a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7974a aVar = this.f18976a;
        if (aVar != null) {
            aVar.mo55686a(this);
        }
    }

    /* renamed from: a */
    public void mo55684a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
