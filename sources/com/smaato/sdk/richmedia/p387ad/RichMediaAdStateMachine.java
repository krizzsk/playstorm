package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdStateMachine */
final class RichMediaAdStateMachine {
    static StateMachine<AdStateMachine.Event, AdStateMachine.State> newInstance(AdStateMachine.State state) {
        return new StateMachine.Builder().setInitialState(state).addTransition(AdStateMachine.Event.INITIALISE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.CREATED})).addTransition(AdStateMachine.Event.ADDED_ON_SCREEN, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.ON_SCREEN})).addTransition(AdStateMachine.Event.IMPRESSION, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED, AdStateMachine.State.COMPLETE})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED, AdStateMachine.State.COMPLETE})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.CREATED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.DESTROY, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.COMPLETE, AdStateMachine.State.TO_BE_DELETED})).build();
    }

    /* access modifiers changed from: package-private */
    public static StateMachine<AdStateMachine.Event, AdStateMachine.State> newInstance() {
        return newInstance(AdStateMachine.State.INIT);
    }
}
