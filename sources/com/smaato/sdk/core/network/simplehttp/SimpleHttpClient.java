package com.smaato.sdk.core.network.simplehttp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.util.Threads;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class SimpleHttpClient {
    private final HttpClient httpClient;
    private final Logger logger;

    public SimpleHttpClient(HttpClient httpClient2, Logger logger2) {
        this.logger = logger2;
        this.httpClient = httpClient2;
    }

    public String readString(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(doNetworkRequest(str)));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    String sb2 = sb.toString();
                    bufferedReader.close();
                    return sb2;
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public Bitmap readBitmap(String str) throws IOException {
        InputStream doNetworkRequest = doNetworkRequest(str);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(doNetworkRequest);
            if (doNetworkRequest != null) {
                doNetworkRequest.close();
            }
            return decodeStream;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void sendDataAndForget(String str, String str2) {
        try {
            Response execute = this.httpClient.newCall(Request.post(str, str2.getBytes())).execute();
            if (execute.responseCode() == 200) {
                Logger logger2 = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger2.debug(logDomain, "Sent data, URL = " + str, new Object[0]);
                return;
            }
            this.logger.error(LogDomain.CORE, "Sending data to %s failed, response code %d", str, Integer.valueOf(execute.responseCode()));
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, e, "Sending data to %s failed", str);
        }
    }

    private InputStream doNetworkRequest(String str) throws IOException {
        return this.httpClient.newCall(Request.get(str)).execute().body().source();
    }

    public void fireAndForget(List<String> list) {
        fireAndForget((String[]) list.toArray(new String[0]));
    }

    public void fireAndForget(String... strArr) {
        Threads.runOnBackgroundThread(new Runnable(strArr) {
            public final /* synthetic */ String[] f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                SimpleHttpClient.this.lambda$fireAndForget$0$SimpleHttpClient(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$fireAndForget$0$SimpleHttpClient(String[] strArr) {
        for (String str : strArr) {
            try {
                readString(str);
            } catch (Exception unused) {
                this.logger.error(LogDomain.CORE, "Could not fire url: " + str, new Object[0]);
            }
        }
    }
}
