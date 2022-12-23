package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

public abstract class AsyncTaskExecutor<Params, Result> {
    /* access modifiers changed from: protected */
    public abstract Result doInBackground(Params[] paramsArr);

    /* access modifiers changed from: protected */
    public void onPostExecute(Result result) {
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
    }

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(final Params... paramsArr) {
        onPreExecute();
        final Handler handler = new Handler(Looper.getMainLooper());
        Executors.newSingleThreadExecutor().execute(new Runnable() {
            public void run() {
                final Object doInBackground = AsyncTaskExecutor.this.doInBackground(paramsArr);
                handler.post(new Runnable() {
                    public void run() {
                        AsyncTaskExecutor.this.onPostExecute(doInBackground);
                    }
                });
            }
        });
        return this;
    }
}
