package com.smaato.sdk.core.api;

import android.net.Uri;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.Map;

class ApiRequestMapper {
    private final String apiBaseUrl;

    ApiRequestMapper(String str) {
        this.apiBaseUrl = (String) Objects.requireNonNull(str);
    }

    public Request map(ApiAdRequest apiAdRequest) {
        Objects.requireNonNull(apiAdRequest);
        Request request = Request.get(this.apiBaseUrl);
        return request.buildUpon().uri(addApiParams(apiAdRequest, request.uri())).build();
    }

    public Request map(String str) {
        Objects.requireNonNull(str);
        return Request.get(str);
    }

    private Uri addApiParams(ApiAdRequest apiAdRequest, Uri uri) {
        Uri.Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("adspace", apiAdRequest.getAdSpaceId());
        if (apiAdRequest.getIsSplash()) {
            appendQueryParameter.appendQueryParameter("format", "splash");
        } else {
            appendQueryParameter.appendQueryParameter("format", apiAdRequest.getAdFormat());
        }
        Objects.onNotNull(apiAdRequest.getAdDimension(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter(ViewHierarchyConstants.DIMENSION_KEY, (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getWidth(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter("width", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getHeight(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter("height", String.valueOf((Integer) obj));
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationNetworkName(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter("mnn", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationNetworkSDKVersion(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter("mnsv", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getMediationAdapterVersion(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                this.f$0.appendQueryParameter("mav", (String) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getExtraParameters(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ApiRequestMapper.lambda$addApiParams$6(this.f$0, (Map) obj);
            }
        });
        Objects.onNotNull(apiAdRequest.getKeyValuePairs(), new Consumer(appendQueryParameter) {
            public final /* synthetic */ Uri.Builder f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ApiRequestMapper.lambda$addApiParams$7(this.f$0, (Map) obj);
            }
        });
        return appendQueryParameter.build();
    }

    static /* synthetic */ void lambda$addApiParams$6(Uri.Builder builder, Map map) {
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, String.valueOf(map.get(str)));
        }
    }

    static /* synthetic */ void lambda$addApiParams$7(Uri.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter("cs_" + ((String) entry.getKey()), Joiner.join((CharSequence) ",", (Iterable) entry.getValue()));
        }
    }

    static class ApiParams {
        ApiParams() {
        }
    }
}
