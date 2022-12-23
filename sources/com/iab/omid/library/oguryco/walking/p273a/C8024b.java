package com.iab.omid.library.oguryco.walking.p273a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.oguryco.walking.a.b */
public abstract class C8024b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C8025a f19097a;

    /* renamed from: d */
    protected final C8026b f19098d;

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$a */
    public interface C8025a {
        /* renamed from: a */
        void mo55900a(C8024b bVar);
    }

    /* renamed from: com.iab.omid.library.oguryco.walking.a.b$b */
    public interface C8026b {
        /* renamed from: a */
        void mo55901a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55902b();
    }

    public C8024b(C8026b bVar) {
        this.f19098d = bVar;
    }

    /* renamed from: a */
    public void mo55896a(C8025a aVar) {
        this.f19097a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C8025a aVar = this.f19097a;
        if (aVar != null) {
            aVar.mo55900a(this);
        }
    }

    /* renamed from: a */
    public void mo55898a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
