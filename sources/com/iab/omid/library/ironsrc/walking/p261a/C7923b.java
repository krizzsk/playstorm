package com.iab.omid.library.ironsrc.walking.p261a;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.ironsrc.walking.a.b */
public abstract class C7923b extends AsyncTask<Object, Void, String> {

    /* renamed from: a */
    private C7924a f18859a;

    /* renamed from: d */
    protected final C7925b f18860d;

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$a */
    public interface C7924a {
        /* renamed from: a */
        void mo55487a(C7923b bVar);
    }

    /* renamed from: com.iab.omid.library.ironsrc.walking.a.b$b */
    public interface C7925b {
        /* renamed from: a */
        void mo55488a(JSONObject jSONObject);

        /* renamed from: b */
        JSONObject mo55489b();
    }

    public C7923b(C7925b bVar) {
        this.f18860d = bVar;
    }

    /* renamed from: a */
    public void mo55483a(C7924a aVar) {
        this.f18859a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C7924a aVar = this.f18859a;
        if (aVar != null) {
            aVar.mo55487a(this);
        }
    }

    /* renamed from: a */
    public void mo55485a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
