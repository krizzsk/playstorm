package com.ironsource.sdk.p296j;

import com.ironsource.sdk.p293g.C8339a;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.j.f */
public interface C8369f extends C8360a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(C8339a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
