package com.smaato.sdk.core.network.interceptors;

import com.smaato.sdk.core.network.HttpException;
import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.SomaException;
import java.io.IOException;
import java.net.SocketTimeoutException;

public class HttpStatusToExceptionInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        try {
            Response proceed = chain.proceed(chain.request());
            if (204 != proceed.responseCode()) {
                return proceed;
            }
            SomaException.Type type = SomaException.Type.NO_CONTENT;
            throw new SomaException(type, "Server returned HTTP response code: 204 for URL: " + proceed.request().uri());
        } catch (SocketTimeoutException e) {
            throw new SomaException(SomaException.Type.TIMEOUT_ERROR, (Throwable) e);
        } catch (HttpException e2) {
            int responseCode = e2.getResponseCode();
            if (400 <= responseCode && responseCode < 420) {
                throw new SomaException(SomaException.Type.BAD_REQUEST, e2.getCause());
            } else if (500 > responseCode || responseCode >= 510) {
                throw e2;
            } else {
                throw new SomaException(SomaException.Type.BAD_RESPONSE, e2.getCause());
            }
        }
    }
}
