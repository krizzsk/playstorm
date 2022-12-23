package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

class OkHTTPFileDownloadTask implements IDownloadTask {
    private final IDatabaseHelper databaseHelper;
    private volatile DownloadMessage downloadMessage;
    private DownloadModel downloadModel;
    private final DownloadRequest downloadRequest;
    private DownloadResponse downloadResponse;
    private String etag = "";
    private InputStream inputStream;
    private DownloadFileOutputStream outputStream;
    private ResponseBody responseBody;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest2, DownloadModel downloadModel2, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage2) {
        this.downloadRequest = downloadRequest2;
        this.downloadModel = downloadModel2;
        this.databaseHelper = iDatabaseHelper;
        this.downloadMessage = downloadMessage2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0262, code lost:
        if (r10.isCanceled() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02a7, code lost:
        if (r10.isCanceled() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02eb, code lost:
        if (r10.isCanceled() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02ed, code lost:
        r10.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f2, code lost:
        return r12.downloadResponse;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x017f, code lost:
        if (r10.isCanceled() != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01d8, code lost:
        if (r10.isCanceled() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021d, code lost:
        if (r10.isCanceled() == false) goto L_0x02ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x022f A[SYNTHETIC, Splitter:B:100:0x022f] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x023c A[SYNTHETIC, Splitter:B:105:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0247 A[SYNTHETIC, Splitter:B:110:0x0247] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0274 A[SYNTHETIC, Splitter:B:124:0x0274] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0281 A[SYNTHETIC, Splitter:B:129:0x0281] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x028c A[SYNTHETIC, Splitter:B:134:0x028c] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x029e  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02b8 A[SYNTHETIC, Splitter:B:148:0x02b8] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c5 A[SYNTHETIC, Splitter:B:153:0x02c5] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d0 A[SYNTHETIC, Splitter:B:158:0x02d0] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x02fb A[SYNTHETIC, Splitter:B:171:0x02fb] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0308 A[SYNTHETIC, Splitter:B:176:0x0308] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0313 A[SYNTHETIC, Splitter:B:181:0x0313] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x014c A[SYNTHETIC, Splitter:B:20:0x014c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0159 A[SYNTHETIC, Splitter:B:25:0x0159] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0164 A[SYNTHETIC, Splitter:B:30:0x0164] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a5 A[SYNTHETIC, Splitter:B:52:0x01a5] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b2 A[SYNTHETIC, Splitter:B:57:0x01b2] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01bd A[SYNTHETIC, Splitter:B:62:0x01bd] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ea A[SYNTHETIC, Splitter:B:76:0x01ea] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01f7 A[SYNTHETIC, Splitter:B:81:0x01f7] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0202 A[SYNTHETIC, Splitter:B:86:0x0202] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0214  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x0224=Splitter:B:96:0x0224, B:120:0x0269=Splitter:B:120:0x0269, B:48:0x019a=Splitter:B:48:0x019a, B:144:0x02ad=Splitter:B:144:0x02ad, B:72:0x01df=Splitter:B:72:0x01df} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.mbridge.msdk.foundation.download.DownloadResponse run() {
        /*
            r12 = this;
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = new com.mbridge.msdk.foundation.download.DownloadResponse
            r0.<init>()
            r12.downloadResponse = r0
            com.mbridge.msdk.foundation.download.DownloadMessage r0 = r12.downloadMessage
            java.lang.String r0 = r0.getSaveFileName()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r1 = r12.downloadRequest
            java.lang.String r7 = r1.getCacheDirectoryPath()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r1 = r12.downloadRequest
            java.lang.String r8 = r1.getDownloadId()
            com.mbridge.msdk.foundation.download.core.GlobalComponent r1 = com.mbridge.msdk.foundation.download.core.GlobalComponent.getInstance()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r1 = r1.getOkHttpClient()
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.newBuilder()
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r12.downloadRequest
            long r2 = r2.getConnectTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.connectTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r12.downloadRequest
            long r2 = r2.getReadTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.readTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r12.downloadRequest
            long r2 = r2.getWriteTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.writeTimeout(r2, r4)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r2 = r12.downloadRequest
            long r2 = r2.getTimeout()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.callTimeout(r2, r4)
            r2 = 1
            com.mbridge.msdk.thrid.okhttp.OkHttpClient$Builder r1 = r1.retryOnConnectionFailure(r2)
            com.mbridge.msdk.thrid.okhttp.OkHttpClient r1 = r1.build()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r3 = new com.mbridge.msdk.thrid.okhttp.CacheControl$Builder
            r3.<init>()
            com.mbridge.msdk.thrid.okhttp.CacheControl$Builder r3 = r3.noCache()
            com.mbridge.msdk.thrid.okhttp.CacheControl r3 = r3.build()
            java.util.Locale r4 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.mbridge.msdk.foundation.download.core.DownloadRequest r6 = r12.downloadRequest
            long r9 = r6.getDownloadedBytes()
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r9 = 0
            r5[r9] = r6
            java.lang.String r6 = "bytes=%d-"
            java.lang.String r4 = java.lang.String.format(r4, r6, r5)
            com.mbridge.msdk.foundation.download.core.DownloadRequest r5 = r12.downloadRequest
            com.mbridge.msdk.foundation.download.DownloadStatus r5 = r5.getStatus()
            com.mbridge.msdk.foundation.download.DownloadStatus r6 = com.mbridge.msdk.foundation.download.DownloadStatus.CANCELLED
            if (r5 != r6) goto L_0x0094
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12.downloadResponse
            r0.setCancelled(r2)
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12.downloadResponse
            return r0
        L_0x0094:
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = new com.mbridge.msdk.thrid.okhttp.Request$Builder
            r2.<init>()
            com.mbridge.msdk.foundation.download.DownloadMessage r5 = r12.downloadMessage
            java.lang.String r5 = r5.getDownloadUrl()
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.url((java.lang.String) r5)
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.cacheControl(r3)
            java.lang.String r3 = "Connection"
            java.lang.String r5 = "close"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.addHeader(r3, r5)
            java.lang.String r3 = "Range"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.addHeader(r3, r4)
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "gzip"
            com.mbridge.msdk.thrid.okhttp.Request$Builder r2 = r2.addHeader(r3, r4)
            com.mbridge.msdk.thrid.okhttp.Request r2 = r2.build()
            com.mbridge.msdk.thrid.okhttp.Call r10 = r1.newCall(r2)
            r1 = 0
            com.mbridge.msdk.thrid.okhttp.Response r11 = r10.execute()     // Catch:{ SocketTimeoutException -> 0x02aa, UnknownHostException -> 0x0266, IOException -> 0x0221, IllegalAccessException -> 0x01dc, Exception -> 0x0197, all -> 0x0194 }
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r11)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            if (r1 != 0) goto L_0x012e
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r11.body()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNull(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            if (r1 == 0) goto L_0x00db
            goto L_0x012e
        L_0x00db:
            int r6 = r11.code()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            boolean r1 = r11.isSuccessful()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            if (r1 != 0) goto L_0x011b
            com.mbridge.msdk.foundation.download.DownloadError r1 = new com.mbridge.msdk.foundation.download.DownloadError     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r3.<init>()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.String r4 = "responseCode "
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r3.append(r6)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.String r4 = "\n"
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            com.mbridge.msdk.thrid.okhttp.ResponseBody r4 = r11.body()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.String r4 = r4.string()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r3.append(r4)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.String r3 = r3.toString()     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r2.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            com.mbridge.msdk.foundation.download.DownloadResponse r2 = r12.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r2.setError(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            com.mbridge.msdk.foundation.download.DownloadResponse r1 = r12.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r1.setSuccessful(r9)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            goto L_0x0144
        L_0x011b:
            java.lang.String r1 = "ETag"
            java.lang.String r2 = ""
            java.lang.String r1 = r11.header(r1, r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r12.etag = r1     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r1 = r12
            r2 = r0
            r3 = r7
            r4 = r8
            r5 = r11
            r1.handlerRequestSuccessful(r2, r3, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            goto L_0x0144
        L_0x012e:
            com.mbridge.msdk.foundation.download.DownloadError r1 = new com.mbridge.msdk.foundation.download.DownloadError     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            java.lang.String r3 = "response is null"
            r2.<init>(r3)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r1.<init>(r2)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            com.mbridge.msdk.foundation.download.DownloadResponse r2 = r12.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r2.setError(r1)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            com.mbridge.msdk.foundation.download.DownloadResponse r1 = r12.downloadResponse     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
            r1.setSuccessful(r9)     // Catch:{ SocketTimeoutException -> 0x0191, UnknownHostException -> 0x018e, IOException -> 0x018b, IllegalAccessException -> 0x0189, Exception -> 0x0187 }
        L_0x0144:
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0151
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x0151 }
            r0.close()     // Catch:{ IOException -> 0x0151 }
        L_0x0151:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x015e
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x015e }
            r0.close()     // Catch:{ IOException -> 0x015e }
        L_0x015e:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x016e
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x016e }
            r0.close()     // Catch:{ Exception -> 0x016e }
            r11.close()     // Catch:{ Exception -> 0x016e }
        L_0x016e:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x017b
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x017b:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
            goto L_0x02ed
        L_0x0183:
            r0 = move-exception
            r1 = r11
            goto L_0x02f3
        L_0x0187:
            r1 = move-exception
            goto L_0x019a
        L_0x0189:
            r1 = move-exception
            goto L_0x01df
        L_0x018b:
            r1 = move-exception
            goto L_0x0224
        L_0x018e:
            r1 = move-exception
            goto L_0x0269
        L_0x0191:
            r1 = move-exception
            goto L_0x02ad
        L_0x0194:
            r0 = move-exception
            goto L_0x02f3
        L_0x0197:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x019a:
            r12.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0183 }
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01aa
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x01aa }
            r0.close()     // Catch:{ IOException -> 0x01aa }
        L_0x01aa:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01b7
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x01b7 }
            r0.close()     // Catch:{ IOException -> 0x01b7 }
        L_0x01b7:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x01c7
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x01c7 }
            r0.close()     // Catch:{ Exception -> 0x01c7 }
            r11.close()     // Catch:{ Exception -> 0x01c7 }
        L_0x01c7:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01d4
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x01d4:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
            goto L_0x02ed
        L_0x01dc:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x01df:
            r12.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0183 }
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01ef
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x01ef }
            r0.close()     // Catch:{ IOException -> 0x01ef }
        L_0x01ef:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x01fc
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x01fc }
            r0.close()     // Catch:{ IOException -> 0x01fc }
        L_0x01fc:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x020c
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x020c }
            r0.close()     // Catch:{ Exception -> 0x020c }
            r11.close()     // Catch:{ Exception -> 0x020c }
        L_0x020c:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0219
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x0219:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
            goto L_0x02ed
        L_0x0221:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x0224:
            r12.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0183 }
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0234
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x0234 }
            r0.close()     // Catch:{ IOException -> 0x0234 }
        L_0x0234:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0241
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x0241 }
            r0.close()     // Catch:{ IOException -> 0x0241 }
        L_0x0241:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x0251
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x0251 }
            r0.close()     // Catch:{ Exception -> 0x0251 }
            r11.close()     // Catch:{ Exception -> 0x0251 }
        L_0x0251:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x025e
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x025e:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
            goto L_0x02ed
        L_0x0266:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x0269:
            r12.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0183 }
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0279
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x0279 }
            r0.close()     // Catch:{ IOException -> 0x0279 }
        L_0x0279:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x0286
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x0286 }
            r0.close()     // Catch:{ IOException -> 0x0286 }
        L_0x0286:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x0296
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x0296 }
            r0.close()     // Catch:{ Exception -> 0x0296 }
            r11.close()     // Catch:{ Exception -> 0x0296 }
        L_0x0296:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02a3
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x02a3:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
            goto L_0x02ed
        L_0x02aa:
            r2 = move-exception
            r11 = r1
            r1 = r2
        L_0x02ad:
            r12.handlerException(r0, r7, r8, r1)     // Catch:{ all -> 0x0183 }
            java.io.InputStream r0 = r12.inputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02bd
            java.io.InputStream r0 = r12.inputStream     // Catch:{ IOException -> 0x02bd }
            r0.close()     // Catch:{ IOException -> 0x02bd }
        L_0x02bd:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02ca
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r0 = r12.outputStream     // Catch:{ IOException -> 0x02ca }
            r0.close()     // Catch:{ IOException -> 0x02ca }
        L_0x02ca:
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r11)
            if (r0 == 0) goto L_0x02da
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r11.body()     // Catch:{ Exception -> 0x02da }
            r0.close()     // Catch:{ Exception -> 0x02da }
            r11.close()     // Catch:{ Exception -> 0x02da }
        L_0x02da:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            boolean r0 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r0)
            if (r0 == 0) goto L_0x02e7
            com.mbridge.msdk.thrid.okhttp.ResponseBody r0 = r12.responseBody
            r0.close()
        L_0x02e7:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L_0x02f0
        L_0x02ed:
            r10.cancel()
        L_0x02f0:
            com.mbridge.msdk.foundation.download.DownloadResponse r0 = r12.downloadResponse
            return r0
        L_0x02f3:
            java.io.InputStream r2 = r12.inputStream
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r2)
            if (r2 == 0) goto L_0x0300
            java.io.InputStream r2 = r12.inputStream     // Catch:{ IOException -> 0x0300 }
            r2.close()     // Catch:{ IOException -> 0x0300 }
        L_0x0300:
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r2 = r12.outputStream
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r2)
            if (r2 == 0) goto L_0x030d
            com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream r2 = r12.outputStream     // Catch:{ IOException -> 0x030d }
            r2.close()     // Catch:{ IOException -> 0x030d }
        L_0x030d:
            boolean r2 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r1)
            if (r2 == 0) goto L_0x031d
            com.mbridge.msdk.thrid.okhttp.ResponseBody r2 = r1.body()     // Catch:{ Exception -> 0x031d }
            r2.close()     // Catch:{ Exception -> 0x031d }
            r1.close()     // Catch:{ Exception -> 0x031d }
        L_0x031d:
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r12.responseBody
            boolean r1 = com.mbridge.msdk.foundation.download.utils.Objects.isNotNull(r1)
            if (r1 == 0) goto L_0x032a
            com.mbridge.msdk.thrid.okhttp.ResponseBody r1 = r12.responseBody
            r1.close()
        L_0x032a:
            boolean r1 = r10.isCanceled()
            if (r1 != 0) goto L_0x0333
            r10.cancel()
        L_0x0333:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.run():com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void handlerRequestSuccessful(String str, String str2, String str3, Response response, int i) throws IOException, IllegalAccessException {
        boolean z = !isSupportResume(i, this.downloadModel);
        if (!(!z || response == null || this.downloadRequest == null || i != 206 || response.body() == null || response.body().contentLength() == this.downloadRequest.getTotalBytes() - this.downloadRequest.getDownloadedBytes())) {
            ILogger logger = GlobalComponent.getInstance().getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("移除： handlerRequestSuccessful： isSupportResume ");
            sb.append(z);
            sb.append(" etag: ");
            sb.append(this.etag);
            sb.append(" etag: ");
            DownloadModel downloadModel2 = this.downloadModel;
            sb.append(downloadModel2 == null ? "null" : downloadModel2.getEtag());
            sb.append(" responseCode: ");
            sb.append(i);
            logger.log(IDownloadTask.TAG, sb.toString());
            this.downloadRequest.setDownloadedBytes(0);
            this.downloadRequest.setTotalBytes(0);
            if (Objects.isNotNull(this.databaseHelper)) {
                this.databaseHelper.remove(str3, str2);
            }
            this.downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this.downloadRequest.getCacheDirectoryPath() + this.downloadMessage.getSaveFileName()));
        }
        ResponseBody body = response.body();
        this.responseBody = body;
        if (Objects.isNull(body)) {
            this.downloadResponse.setError(new DownloadError(new IOException("response body is null")));
            this.downloadRequest.setTotalBytes(0);
            this.downloadRequest.setDownloadedBytes(0);
            this.downloadResponse.setSuccessful(false);
            return;
        }
        long contentLength = this.responseBody.contentLength();
        if (this.downloadRequest.getTotalBytes() == 0) {
            this.downloadRequest.setTotalBytes(contentLength);
        }
        InputStream byteStream = this.responseBody.byteStream();
        this.inputStream = byteStream;
        if (Objects.isNotNull(byteStream)) {
            handleInputStream(str, str2, str3, this.etag);
            return;
        }
        this.downloadResponse.setError(new DownloadError(new IOException("response inputStream is null")));
        this.downloadResponse.setSuccessful(false);
    }

    private void handleInputStream(String str, String str2, String str3, String str4) throws IOException, IllegalAccessException {
        boolean z;
        String str5;
        String str6 = str2;
        boolean z2 = true;
        if (Objects.isNull(this.downloadModel)) {
            DownloadModel create = DownloadModel.create(this.downloadRequest.getDownloadId(), this.downloadMessage.getDownloadUrl(), this.downloadMessage.getResourceUrl(), str4, str2, this.downloadMessage.getSaveFileName(), this.downloadRequest.getTotalBytes(), 0, this.downloadMessage.getDownloadRate(), 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = create;
            this.databaseHelper.insert(create);
        } else {
            DownloadModel create2 = DownloadModel.create(this.downloadModel.getDownloadId(), this.downloadModel.getDownloadUrl(), this.downloadMessage.getResourceUrl(), this.downloadModel.getEtag(), this.downloadModel.getSaveDirectorPath(), this.downloadModel.getSaveFileName(), this.downloadRequest.getTotalBytes(), this.downloadModel.getDownloadedBytes(), this.downloadMessage.getDownloadRate(), this.downloadModel.getUsageCounter() + 1, this.downloadMessage.getDownloadResourceType());
            this.downloadModel = create2;
            this.databaseHelper.update(create2, str6);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str6, str));
        this.outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this.downloadRequest.getDownloadedBytes());
        byte[] bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        while (true) {
            int read = this.inputStream.read(bArr);
            if (read == -1) {
                z = z2;
                str5 = str6;
                break;
            }
            this.outputStream.write(bArr, 0, read);
            DownloadRequest downloadRequest2 = this.downloadRequest;
            downloadRequest2.setDownloadedBytes(downloadRequest2.getDownloadedBytes() + ((long) read));
            this.outputStream.flushAndSync();
            int downloadRate = Utils.getDownloadRate(this.downloadRequest.getTotalBytes(), this.downloadRequest.getDownloadedBytes());
            z = z2;
            str5 = str6;
            sendProgress(this.downloadRequest, this.downloadMessage, this.downloadRequest.getDownloadedBytes(), this.downloadRequest.getTotalBytes(), downloadRate);
            if (this.downloadMessage.getDownloadRate() != 100 && downloadRate >= this.downloadMessage.getDownloadRate()) {
                break;
            } else if (this.downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                this.downloadResponse.setCancelled(z);
                break;
            } else {
                str6 = str5;
                z2 = z;
            }
        }
        IDatabaseHelper databaseHelper2 = GlobalComponent.getInstance().getDatabaseHelper();
        String downloadUrl = this.downloadMessage.getDownloadUrl();
        String resourceUrl = this.downloadMessage.getResourceUrl();
        String saveFileName = this.downloadMessage.getSaveFileName();
        String str7 = str5;
        String str8 = saveFileName;
        boolean z3 = z;
        String str9 = str3;
        databaseHelper2.updateProgress(str9, str7, DownloadModel.create(str3, downloadUrl, resourceUrl, str4, str2, str8, this.downloadRequest.getTotalBytes(), this.downloadRequest.getDownloadedBytes(), this.downloadMessage.getDownloadRate(), this.downloadModel.getUsageCounter(), this.downloadMessage.getDownloadResourceType()));
        if (!this.downloadResponse.isCancelled()) {
            this.downloadResponse.setSuccessful(z3);
        }
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this.databaseHelper) && Objects.isNotNull(this.downloadRequest)) {
                GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, "移除：handlerException");
                this.databaseHelper.remove(str3, str2);
                MBResourceManager instance = MBResourceManager.getInstance();
                instance.deleteFile(new File(this.downloadRequest.getCacheDirectoryPath() + this.downloadMessage.getSaveFileName()));
                this.downloadRequest.setDownloadedBytes(0);
                this.downloadRequest.setTotalBytes(0);
            }
        } catch (Exception unused) {
        }
        this.downloadResponse.setError(new DownloadError(exc));
        this.downloadResponse.setSuccessful(false);
    }

    public static IDownloadTask create(DownloadRequest downloadRequest2, DownloadModel downloadModel2, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage2) {
        return new OkHTTPFileDownloadTask(downloadRequest2, downloadModel2, iDatabaseHelper, downloadMessage2);
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel2) {
        return i == 206 && !TextUtils.isEmpty(this.etag) && (downloadModel2 == null || TextUtils.equals(this.etag, downloadModel2.getEtag()));
    }

    private void sendProgress(DownloadRequest downloadRequest2, DownloadMessage downloadMessage2, long j, long j2, int i) {
        if (downloadRequest2.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest2.handlerProcessEvent(downloadMessage2, new DownloadProgress(j, j2, i));
        }
    }
}
