package com.iab.omid.library.adcolony.walking.p225a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.walking.a.b */
public abstract class C7621b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7622a f18168a;

    /* renamed from: d */
    protected final C7623b f18169d;

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$a */
    public interface C7622a {
        /* renamed from: a */
        void mo54316a(C7621b bVar);
    }

    /* renamed from: com.iab.omid.library.adcolony.walking.a.b$b */
    public interface C7623b {
        /* renamed from: a */
        void mo54317a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo54318b();
    }

    public C7621b(C7623b bVar) {
        this.f18169d = bVar;
    }

    /* renamed from: a */
    public void mo54312a(C7622a aVar) {
        this.f18168a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7622a aVar = this.f18168a;
        if (aVar != null) {
            aVar.mo54316a(this);
        }
    }

    /* renamed from: a */
    public void mo54314a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
