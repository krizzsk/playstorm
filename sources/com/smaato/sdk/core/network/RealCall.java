package com.smaato.sdk.core.network;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

class RealCall implements Call, Callable<Response> {
    private Future<?> future;
    private final HttpClient httpClient;
    private final Request request;

    RealCall(HttpClient httpClient2, Request request2) {
        this.httpClient = httpClient2;
        this.request = request2;
    }

    public Request request() {
        return this.request;
    }

    public Response execute() throws IOException {
        Future<?> submit;
        synchronized (this) {
            if (this.future == null) {
                submit = this.httpClient.executor().submit(this);
                this.future = submit;
            } else {
                throw new IllegalStateException("Already executed");
            }
        }
        try {
            return (Response) submit.get();
        } catch (Exception e) {
            throw findExceptionRoot(e);
        }
    }

    public void enqueue(Callback callback) {
        synchronized (this) {
            if (this.future == null) {
                this.future = this.httpClient.executor().submit(new Runnable(callback) {
                    public final /* synthetic */ Callback f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        RealCall.this.lambda$enqueue$0$RealCall(this.f$1);
                    }
                });
            } else {
                throw new IllegalStateException("Already enqueued");
            }
        }
    }

    public /* synthetic */ void lambda$enqueue$0$RealCall(Callback callback) {
        Response call;
        try {
            call = call();
            callback.onResponse(this, call);
            if (call != null) {
                call.close();
                return;
            }
            return;
        } catch (Exception e) {
            callback.onFailure(this, findExceptionRoot(e));
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void cancel() {
        synchronized (this) {
            Future<?> future2 = this.future;
            if (future2 != null && !future2.isCancelled()) {
                this.future.cancel(true);
            }
        }
    }

    public Response call() throws Exception {
        ArrayList arrayList = new ArrayList(this.httpClient.interceptors());
        arrayList.add(HttpCaller.INSTANCE);
        return RealChain.builder().readTimeoutMillis(this.httpClient.readTimeoutMillis()).connectTimeoutMillis(this.httpClient.connectTimeoutMillis()).interceptors(arrayList).request(this.request).call(this).build().proceed(this.request);
    }

    private IOException findExceptionRoot(Throwable th) {
        while (th != null) {
            if (th instanceof IOException) {
                return (IOException) th;
            }
            th = th.getCause();
        }
        return new IOException(new Throwable("Unknown Error"));
    }
}
