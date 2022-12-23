package com.smaato.sdk.core.network;

import android.webkit.URLUtil;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class HttpCaller implements Interceptor {
    static final HttpCaller INSTANCE = new HttpCaller();

    HttpCaller() {
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        String uri = chain.request().uri().toString();
        if (URLUtil.isHttpUrl(uri) || URLUtil.isHttpsUrl(uri)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
            httpURLConnection.setConnectTimeout((int) chain.connectTimeoutMillis());
            httpURLConnection.setReadTimeout((int) chain.readTimeoutMillis());
            httpURLConnection.setInstanceFollowRedirects(chain.request().followRedirects());
            httpURLConnection.setRequestMethod(chain.request().method());
            Iterator<Map.Entry<String, List<String>>> it = chain.request().headers().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                for (String addRequestProperty : (List) next.getValue()) {
                    httpURLConnection.addRequestProperty((String) next.getKey(), addRequestProperty);
                }
            }
            Request.Body body = chain.request().body();
            if (body != null) {
                httpURLConnection.setDoOutput(true);
                body.writeTo(httpURLConnection.getOutputStream());
            }
            int responseCode = httpURLConnection.getResponseCode();
            String contentEncoding = httpURLConnection.getContentEncoding();
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                Headers of = Headers.m32962of(httpURLConnection.getHeaderFields());
                List<String> values = of.values("Content-Type");
                MimeType mimeType = null;
                if (!values.isEmpty()) {
                    mimeType = MimeType.parse(values.get(0));
                }
                return Response.builder().request(chain.request()).responseCode(responseCode).headers(of).mimeType(mimeType).connection(httpURLConnection).body(HttpBody.builder().source(new BufferedInputStream(inputStream)).contentLength((long) contentLength).build()).encoding(contentEncoding).build();
            } catch (Exception e) {
                throw new HttpException(e, responseCode);
            }
        } else {
            throw new MalformedURLException("expected http(s) scheme, got " + chain.request().uri().getScheme());
        }
    }
}
