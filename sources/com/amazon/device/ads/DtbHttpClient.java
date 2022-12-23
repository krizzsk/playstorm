package com.amazon.device.ads;

import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import org.json.JSONException;

class DtbHttpClient {
    private HashMap<String, Object> headers;
    private boolean isQueryParamsEnabled = false;
    private String message;
    private HashMap<String, Object> params;
    private String response = null;
    private int responseCode;
    private boolean secure = true;
    private String url;

    private enum HTTPMethod {
        POST,
        GET
    }

    /* access modifiers changed from: protected */
    public String getResponse() {
        return this.response;
    }

    /* access modifiers changed from: protected */
    public String getErrorMessage() {
        return this.message;
    }

    /* access modifiers changed from: protected */
    public int getResponseCode() {
        return this.responseCode;
    }

    protected DtbHttpClient(String str) {
        this.url = str;
        this.params = new HashMap<>();
        this.headers = new HashMap<>();
    }

    /* access modifiers changed from: protected */
    public void addParam(String str, String str2) {
        this.params.put(str, str2);
    }

    /* access modifiers changed from: protected */
    public void addHeader(String str, String str2) {
        this.headers.put(str, str2);
    }

    /* access modifiers changed from: protected */
    public HashMap<String, Object> getParams() {
        return this.params;
    }

    /* access modifiers changed from: protected */
    public void setParams(HashMap<String, Object> hashMap) {
        this.params = hashMap;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, Object> getHeaders() {
        return this.headers;
    }

    /* access modifiers changed from: protected */
    public void setHeaders(HashMap<String, Object> hashMap) {
        this.headers = hashMap;
    }

    /* access modifiers changed from: protected */
    public String getUrl() {
        return this.url;
    }

    /* access modifiers changed from: protected */
    public void setUrl(String str) {
        this.url = str;
    }

    public void setUseSecure(boolean z) {
        this.secure = z;
    }

    public void enableQueryParams() {
        this.isQueryParamsEnabled = true;
    }

    /* access modifiers changed from: protected */
    public void executePOST(int i) throws JSONException, IOException {
        URL url2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.secure ? "https://" : "http://");
        sb.append(this.url);
        String sb2 = sb.toString();
        DtbLog.debug("POST URL:" + sb2);
        if (this.isQueryParamsEnabled) {
            String queryParams = getQueryParams();
            DtbLog.debug("with query params:[" + queryParams + "]");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(queryParams);
            url2 = new URL(sb3.toString());
        } else {
            url2 = new URL(sb2);
        }
        executeRequest(HTTPMethod.POST, url2, i);
    }

    public boolean isHttpStatusCodeOK() {
        return this.responseCode == 200;
    }

    private String getQueryParams() {
        if (this.params.isEmpty()) {
            return "";
        }
        String str = "" + "?";
        for (String next : this.params.keySet()) {
            if (this.params.get(next) != null) {
                String str2 = next + "=" + DtbCommonUtils.getURLEncodedString(this.params.get(next).toString());
                if (str.length() > 1) {
                    str = str + "&" + str2;
                } else {
                    str = str + str2;
                }
            }
        }
        return str;
    }

    private String getParamsAsJsonString() throws JSONException {
        return DtbCommonUtils.getParamsAsJsonString(this.params);
    }

    /* access modifiers changed from: protected */
    public void executeGET(int i) throws JSONException, IOException {
        String queryParams = getQueryParams();
        String str = this.url;
        String str2 = "https://";
        if (!str.startsWith(str2) && !this.url.startsWith("http://")) {
            StringBuilder sb = new StringBuilder();
            if (!this.secure) {
                str2 = "http://";
            }
            sb.append(str2);
            sb.append(this.url);
            str = sb.toString();
        }
        DtbLog.debug("GET URL:" + str);
        DtbLog.debug("with params: " + queryParams);
        executeRequest(HTTPMethod.GET, new URL(str + queryParams), i);
    }

    private void executeRequest(HTTPMethod hTTPMethod, URL url2, int i) throws JSONException, IOException {
        HttpURLConnection createDefaultConnection = createDefaultConnection(url2, i);
        StringBuilder sb = new StringBuilder();
        for (String next : this.headers.keySet()) {
            String obj = this.headers.get(next) != null ? this.headers.get(next).toString() : "";
            createDefaultConnection.setRequestProperty(next, obj);
            sb.append(next + CertificateUtil.DELIMITER + obj + " ");
        }
        DtbLog.debug("with headers:[" + sb.toString() + "]");
        if (hTTPMethod == HTTPMethod.POST) {
            createDefaultConnection.setDoOutput(true);
            if (!this.isQueryParamsEnabled && !this.params.isEmpty()) {
                createDefaultConnection.setRequestProperty("content-type", "application/json; charset=utf-8");
                String paramsAsJsonString = getParamsAsJsonString();
                DtbLog.debug("with json params:[" + paramsAsJsonString + "]");
                OutputStream outputStream = createDefaultConnection.getOutputStream();
                outputStream.write(paramsAsJsonString.getBytes());
                outputStream.flush();
                outputStream.close();
            }
        }
        try {
            InputStream inputStream = createDefaultConnection.getInputStream();
            if (inputStream == null) {
                createDefaultConnection.disconnect();
                return;
            }
            this.responseCode = createDefaultConnection.getResponseCode();
            this.message = createDefaultConnection.getResponseMessage();
            this.response = convertStreamToString(inputStream);
            inputStream.close();
            DtbLog.debug("Response :" + this.response);
            createDefaultConnection.disconnect();
        } catch (Exception e) {
            this.response = null;
            DtbLog.debug("Error while connecting to remote server: " + createDefaultConnection.getURL().toString() + " with error:" + e.getMessage());
        } catch (Throwable th) {
            createDefaultConnection.disconnect();
            throw th;
        }
    }

    private HttpURLConnection createDefaultConnection(URL url2, int i) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setReadTimeout(i);
        return httpURLConnection;
    }

    private static String convertStreamToString(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine + "\n");
                }
            } catch (IOException e) {
                DtbLog.debug("Error converting stream to string. Ex=" + e);
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
            try {
                break;
            } catch (IOException unused2) {
            }
        }
        inputStream.close();
        return sb.toString();
    }
}
