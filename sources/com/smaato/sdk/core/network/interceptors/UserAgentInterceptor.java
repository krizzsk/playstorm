package com.smaato.sdk.core.network.interceptors;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class UserAgentInterceptor implements Interceptor {
    private final String userAgent;

    public UserAgentInterceptor(Application application) {
        this.userAgent = getUserAgent(application);
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return chain.proceed(request.buildUpon().headers(request.headers().buildUpon().put("User-Agent", this.userAgent).build()).build());
    }

    private String getUserAgent(Application application) {
        Constructor<WebSettings> declaredConstructor;
        boolean isAccessible;
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return WebSettings.getDefaultUserAgent(application);
            }
            declaredConstructor = WebSettings.class.getDeclaredConstructor(new Class[]{Context.class, WebView.class});
            isAccessible = declaredConstructor.isAccessible();
            declaredConstructor.setAccessible(true);
            String userAgentString = declaredConstructor.newInstance(new Object[]{application, null}).getUserAgentString();
            declaredConstructor.setAccessible(isAccessible);
            return userAgentString;
        } catch (Exception unused) {
            return new WebView(application).getSettings().getUserAgentString();
        } catch (Throwable th) {
            declaredConstructor.setAccessible(isAccessible);
            throw th;
        }
    }
}
