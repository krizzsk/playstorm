package com.tapjoy.internal;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.ea */
public abstract class C11541ea extends AsyncTask<Object, Void, String> {

    /* renamed from: d */
    C11542a f27929d;

    /* renamed from: e */
    protected final C11543b f27930e;

    /* renamed from: com.tapjoy.internal.ea$a */
    public interface C11542a {
        /* renamed from: a */
        void mo72334a();
    }

    /* renamed from: com.tapjoy.internal.ea$b */
    public interface C11543b {
        /* renamed from: a */
        JSONObject mo72335a();

        /* renamed from: a */
        void mo72336a(JSONObject jSONObject);
    }

    public C11541ea(C11543b bVar) {
        this.f27930e = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        C11542a aVar = this.f27929d;
        if (aVar != null) {
            aVar.mo72334a();
        }
    }

    /* renamed from: a */
    public final void mo72332a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
