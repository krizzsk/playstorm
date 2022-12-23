package com.smaato.sdk.core.network;

public interface Callback {
    void onFailure(Call call, Exception exc);

    void onResponse(Call call, Response response);
}
