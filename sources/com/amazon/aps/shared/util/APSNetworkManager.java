package com.amazon.aps.shared.util;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEvent;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.HttpsURLConnection;

public class APSNetworkManager {
    private static final String API_HEADER = "x-api-key";
    private static final int BUFFER_SIZE = 1024;
    private static final String CONTENT_TYPE_HEADER = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HTTP_POST_METHOD = "POST";
    private static long SCHEDULE_INTERVAL = 10;
    private static final int SOCK_TIMEOUT = 10000;
    /* access modifiers changed from: private */
    public static final String TAG = APSNetworkManager.class.getSimpleName();
    private static APSNetworkManager apsNetworkManager;
    private Context context;
    /* access modifiers changed from: private */
    public final ExecutorService executor = Executors.newFixedThreadPool(1);
    /* access modifiers changed from: private */
    public boolean shutdownInProgress;

    private APSNetworkManager(Context context2) {
        this.context = context2;
        this.shutdownInProgress = false;
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    boolean unused = APSNetworkManager.this.shutdownInProgress = true;
                    Log.d(APSNetworkManager.TAG, "App is shutting down, terminating the thread executor");
                    APSNetworkManager.this.executor.shutdown();
                } catch (RuntimeException e) {
                    Log.e(APSNetworkManager.TAG, "Error in stopping the executor", e);
                }
            }
        });
    }

    public static APSNetworkManager getInstance(Context context2) {
        if (apsNetworkManager == null) {
            apsNetworkManager = new APSNetworkManager(context2);
        }
        return apsNetworkManager;
    }

    public void uploadEvent(APSEvent aPSEvent) {
        if (aPSEvent.getEventSeverity() == APSEventSeverity.FATAL) {
            uploadFatalEvent(aPSEvent);
        }
    }

    private void uploadFatalEvent(APSEvent aPSEvent) {
        execute(new Runnable(aPSEvent) {
            public final /* synthetic */ APSEvent f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                APSNetworkManager.this.lambda$uploadFatalEvent$0$APSNetworkManager(this.f$1);
            }
        });
    }

    private synchronized void execute(Runnable runnable) {
        try {
            if (!this.shutdownInProgress) {
                this.executor.execute(runnable);
            }
        } catch (InternalError e) {
            Log.e(TAG, "Internal error in executing the thread", e);
            handleError(e);
        } catch (RuntimeException e2) {
            Log.e(TAG, "Error running the thread", e2);
        }
    }

    private void handleError(InternalError internalError) {
        if (internalError.getLocalizedMessage().contains("shutdown")) {
            Log.e(TAG, "Got the shutdown signal", internalError);
        }
    }

    private boolean setConfigsInConnection(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setReadTimeout(10000);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setChunkedStreamingMode(0);
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setRequestProperty("Content-Type", CONTENT_TYPE_VALUE);
            httpsURLConnection.setRequestProperty(API_HEADER, APSAnalytics.getApiKey());
            httpsURLConnection.connect();
            return true;
        } catch (IOException e) {
            Log.e(TAG, "Error in setting the connection parameter:", e);
            return false;
        }
    }

    private void closeStreamsAndConnection(InputStream inputStream, OutputStream outputStream, HttpsURLConnection httpsURLConnection) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException | RuntimeException e) {
                Log.e(TAG, "Unable to close the out stream", e);
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException | RuntimeException e2) {
                Log.e(TAG, "Unable to close the in stream", e2);
            }
        }
        try {
            httpsURLConnection.disconnect();
        } catch (RuntimeException e3) {
            Log.e(TAG, "Unable to close the url connection", e3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sendData */
    public boolean lambda$uploadFatalEvent$0$APSNetworkManager(APSEvent aPSEvent) {
        BufferedOutputStream bufferedOutputStream;
        HttpsURLConnection httpsURLConnection;
        BufferedInputStream bufferedInputStream = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(APSAnalytics.getHttpUrl()).openConnection();
            try {
                if (setConfigsInConnection(httpsURLConnection)) {
                    bufferedOutputStream = new BufferedOutputStream(httpsURLConnection.getOutputStream());
                    try {
                        String jsonPayload = aPSEvent.toJsonPayload();
                        bufferedOutputStream.write(jsonPayload.getBytes());
                        bufferedOutputStream.flush();
                        Log.d(TAG, "Sending the event data: " + jsonPayload);
                        int responseCode = httpsURLConnection.getResponseCode();
                        Log.d(TAG, "Response code received : " + responseCode);
                        if (responseCode == 200) {
                            byte[] bArr = new byte[1024];
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpsURLConnection.getInputStream());
                            try {
                                bufferedInputStream2.read(bArr);
                                Log.d(TAG, "Response received: " + new String(bArr));
                                closeStreamsAndConnection(bufferedInputStream2, bufferedOutputStream, httpsURLConnection);
                                return true;
                            } catch (IOException | RuntimeException e) {
                                e = e;
                                bufferedInputStream = bufferedInputStream2;
                                try {
                                    Log.e(TAG, "Error in sendData: ", e);
                                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                                    return false;
                                } catch (Throwable th) {
                                    th = th;
                                    closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedInputStream = bufferedInputStream2;
                                closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                                throw th;
                            }
                        }
                    } catch (IOException | RuntimeException e2) {
                        e = e2;
                        Log.e(TAG, "Error in sendData: ", e);
                        closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                        return false;
                    }
                } else {
                    bufferedOutputStream = null;
                }
                closeStreamsAndConnection((InputStream) null, bufferedOutputStream, httpsURLConnection);
                return false;
            } catch (IOException | RuntimeException e3) {
                e = e3;
                bufferedOutputStream = null;
                Log.e(TAG, "Error in sendData: ", e);
                closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                return false;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
                throw th;
            }
        } catch (IOException | RuntimeException e4) {
            e = e4;
            httpsURLConnection = null;
            bufferedOutputStream = null;
            Log.e(TAG, "Error in sendData: ", e);
            closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
            return false;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
            bufferedOutputStream = null;
            closeStreamsAndConnection(bufferedInputStream, bufferedOutputStream, httpsURLConnection);
            throw th;
        }
    }
}
