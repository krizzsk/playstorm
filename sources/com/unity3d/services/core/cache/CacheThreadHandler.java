package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.browser.trusted.sharing.ShareTarget;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CacheThreadHandler extends Handler {
    private boolean _active = false;
    private boolean _canceled = false;
    private WebRequest _currentRequest = null;

    CacheThreadHandler() {
    }

    public void handleMessage(Message message) {
        HashMap hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap hashMap2 = new HashMap();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            downloadFile(string, string2, i, i2, i3, hashMap, z);
        }
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (z && (webRequest = this._currentRequest) != null) {
            this._active = false;
            webRequest.cancel();
        }
    }

    public boolean isActive() {
        return this._active;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r6v12, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v13 */
    /* JADX WARNING: type inference failed for: r6v55 */
    /* JADX WARNING: type inference failed for: r6v56 */
    /* JADX WARNING: type inference failed for: r6v57 */
    /* JADX WARNING: type inference failed for: r6v58 */
    /* JADX WARNING: type inference failed for: r6v59 */
    /* JADX WARNING: type inference failed for: r6v60 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02bb A[SYNTHETIC, Splitter:B:104:0x02bb] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x030c A[SYNTHETIC, Splitter:B:115:0x030c] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x035c A[SYNTHETIC, Splitter:B:126:0x035c] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0386 A[SYNTHETIC, Splitter:B:133:0x0386] */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c8 A[SYNTHETIC, Splitter:B:71:0x01c8] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219 A[SYNTHETIC, Splitter:B:82:0x0219] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x026a A[SYNTHETIC, Splitter:B:93:0x026a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void downloadFile(java.lang.String r24, java.lang.String r25, int r26, int r27, int r28, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r29, boolean r30) {
        /*
            r23 = this;
            r13 = r23
            r14 = r24
            r0 = r25
            r1 = r30
            java.lang.String r15 = "Error closing stream"
            boolean r2 = r13._canceled
            if (r2 != 0) goto L_0x03a9
            if (r14 == 0) goto L_0x03a9
            if (r0 != 0) goto L_0x0014
            goto L_0x03a9
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r2 = " to "
            if (r1 == 0) goto L_0x0049
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: resuming download "
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " at "
            r3.append(r0)
            long r6 = r5.length()
            r3.append(r6)
            java.lang.String r0 = " bytes"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            goto L_0x0063
        L_0x0049:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: start downloading "
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
        L_0x0063:
            boolean r0 = com.unity3d.services.core.device.Device.isActiveNetworkConnected()
            r12 = 2
            r11 = 1
            r10 = 0
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = "Unity Ads cache: download cancelled, no internet connection available"
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r1 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r2 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r3 = new java.lang.Object[r12]
            com.unity3d.services.core.cache.CacheError r4 = com.unity3d.services.core.cache.CacheError.NO_INTERNET
            r3[r10] = r4
            r3[r11] = r14
            r0.sendEvent(r1, r2, r3)
            return
        L_0x0085:
            r13._active = r11
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8 = 0
            r9 = 3
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0330, MalformedURLException -> 0x02e0, IOException -> 0x028f, IllegalStateException -> 0x023e, NetworkIOException -> 0x01ed, Exception -> 0x019c, all -> 0x0191 }
            r6.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x0330, MalformedURLException -> 0x02e0, IOException -> 0x028f, IllegalStateException -> 0x023e, NetworkIOException -> 0x01ed, Exception -> 0x019c, all -> 0x0191 }
            r0 = r26
            r1 = r27
            r4 = r29
            com.unity3d.services.core.request.WebRequest r0 = r13.getWebRequest(r14, r0, r1, r4)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r13._currentRequest = r0     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.cache.CacheThreadHandler$1 r1 = new com.unity3d.services.core.cache.CacheThreadHandler$1     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r4 = r28
            r1.<init>(r5, r4)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r0.setProgressListener(r1)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            long r16 = r0.makeStreamRequest(r6)     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r13._active = r10     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            long r18 = r0.getContentLength()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            boolean r0 = r0.isCanceled()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.WebRequest r1 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            int r20 = r1.getResponseCode()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            com.unity3d.services.core.request.WebRequest r1 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            java.util.Map r21 = r1.getResponseHeaders()     // Catch:{ FileNotFoundException -> 0x0183, MalformedURLException -> 0x0175, IOException -> 0x0167, IllegalStateException -> 0x0159, NetworkIOException -> 0x014b, Exception -> 0x013d, all -> 0x012e }
            r1 = r23
            r4 = r24
            r22 = r6
            r6 = r16
            r14 = r8
            r8 = r18
            r10 = r0
            r16 = r11
            r11 = r20
            r17 = r12
            r12 = r21
            r1.postProcessDownload(r2, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ FileNotFoundException -> 0x0128, MalformedURLException -> 0x0122, IOException -> 0x011c, IllegalStateException -> 0x0117, NetworkIOException -> 0x0112, Exception -> 0x010d, all -> 0x0108 }
            r13._currentRequest = r14
            r22.close()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x037e
        L_0x00e6:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r6 = 0
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x0108:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0138
        L_0x010d:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0147
        L_0x0112:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0155
        L_0x0117:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0163
        L_0x011c:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x0171
        L_0x0122:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x017f
        L_0x0128:
            r0 = move-exception
            r1 = r14
            r4 = 3
            r6 = 0
            goto L_0x018d
        L_0x012e:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0138:
            r2 = r0
            r8 = r22
            goto L_0x0382
        L_0x013d:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0147:
            r8 = r22
            goto L_0x01a4
        L_0x014b:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0155:
            r8 = r22
            goto L_0x01f5
        L_0x0159:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0163:
            r8 = r22
            goto L_0x0246
        L_0x0167:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0171:
            r8 = r22
            goto L_0x0297
        L_0x0175:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x017f:
            r8 = r22
            goto L_0x02e8
        L_0x0183:
            r0 = move-exception
            r22 = r6
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x018d:
            r8 = r22
            goto L_0x0338
        L_0x0191:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0199:
            r2 = r0
            goto L_0x0382
        L_0x019c:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x01a4:
            java.lang.String r2 = "Unknown error"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.UNKNOWN_ERROR     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x01cd }
            goto L_0x037e
        L_0x01cd:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x01ed:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x01f5:
            java.lang.String r2 = "Network error"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.NETWORK_ERROR     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x021e }
            goto L_0x037e
        L_0x021e:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x023e:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0246:
            java.lang.String r2 = "Illegal state"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.ILLEGAL_STATE     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x026f }
            goto L_0x037e
        L_0x026f:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x028f:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0297:
            java.lang.String r2 = "Couldn't request stream"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x02c0 }
            goto L_0x037e
        L_0x02c0:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x02e0:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x02e8:
            java.lang.String r2 = "Malformed URL"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.MALFORMED_URL     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x0311 }
            goto L_0x037e
        L_0x0311:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x037e
        L_0x0330:
            r0 = move-exception
            r1 = r8
            r4 = r9
            r6 = r10
            r16 = r11
            r17 = r12
        L_0x0338:
            java.lang.String r2 = "Couldn't create target file"
            com.unity3d.services.core.log.DeviceLog.exception(r2, r0)     // Catch:{ all -> 0x037f }
            r13._active = r6     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewApp r2 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x037f }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x037f }
            com.unity3d.services.core.cache.CacheError r9 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x037f }
            r7[r6] = r9     // Catch:{ all -> 0x037f }
            r7[r16] = r24     // Catch:{ all -> 0x037f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x037f }
            r7[r17] = r0     // Catch:{ all -> 0x037f }
            r2.sendEvent(r3, r5, r7)     // Catch:{ all -> 0x037f }
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x037e
            r8.close()     // Catch:{ Exception -> 0x0360 }
            goto L_0x037e
        L_0x0360:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r5
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r2, r3, r4)
        L_0x037e:
            return
        L_0x037f:
            r0 = move-exception
            goto L_0x0199
        L_0x0382:
            r13._currentRequest = r1
            if (r8 == 0) goto L_0x03a8
            r8.close()     // Catch:{ Exception -> 0x038a }
            goto L_0x03a8
        L_0x038a:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r3 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r4[r6] = r7
            r4[r16] = r24
            java.lang.String r1 = r1.getMessage()
            r4[r17] = r1
            r0.sendEvent(r3, r5, r4)
        L_0x03a8:
            throw r2
        L_0x03a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean):void");
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        String str2 = str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_END, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        long j4 = j2;
        DeviceLog.debug("Unity Ads cache: downloading of " + str2 + " stopped");
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STOPPED, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, ShareTarget.METHOD_GET, hashMap2, i, i2);
    }
}
