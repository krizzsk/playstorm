package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;

/* renamed from: com.smaato.sdk.richmedia.ad.WebViewRenderer */
interface WebViewRenderer {
    Flow<RichMediaWebView> render(String str, ApiAdRequest apiAdRequest);
}
