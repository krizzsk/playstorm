package com.smaato.sdk.nativead.model.soma;

import com.smaato.sdk.core.network.Interceptor;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import java.io.IOException;

class NativeAdInterceptor implements Interceptor {
    NativeAdInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        return chain.proceed(request.buildUpon().uri(request.uri().buildUpon().appendQueryParameter("format", "native").appendQueryParameter("nver", "1.2").appendQueryParameter("nsupport", "title,txt,icon,image,ctatext,starrating").build()).build());
    }
}
