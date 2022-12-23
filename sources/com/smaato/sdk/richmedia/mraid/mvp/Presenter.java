package com.smaato.sdk.richmedia.mraid.mvp;

public interface Presenter<T> {
    void attachView(T t);

    void destroy();

    void detachView();
}
