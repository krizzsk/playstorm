package com.smaato.sdk.core.p378ad;

/* renamed from: com.smaato.sdk.core.ad.AdStateMachine */
public final class AdStateMachine {

    /* renamed from: com.smaato.sdk.core.ad.AdStateMachine$Event */
    public enum Event {
        INITIALISE,
        ADDED_ON_SCREEN,
        IMPRESSION,
        CLICK,
        CLOSE,
        EXPIRE_TTL,
        AD_ERROR,
        DESTROY
    }

    /* renamed from: com.smaato.sdk.core.ad.AdStateMachine$State */
    public enum State {
        INIT,
        CREATED,
        ON_SCREEN,
        IMPRESSED,
        CLICKED,
        COMPLETE,
        TO_BE_DELETED
    }

    private AdStateMachine() {
    }
}
