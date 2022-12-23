package com.vungle.warren.p393ui;

/* renamed from: com.vungle.warren.ui.PresenterAdOpenCallback */
public interface PresenterAdOpenCallback {

    /* renamed from: com.vungle.warren.ui.PresenterAdOpenCallback$AdOpenType */
    public enum AdOpenType {
        DEFAULT,
        DEEP_LINK
    }

    void onAdOpenType(AdOpenType adOpenType);
}
