package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.p378ad.AdObject;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeAction;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.smaato.sdk.core.ad.AdInteractor */
public abstract class AdInteractor<TAdObject extends AdObject> {
    private final TAdObject adObject;
    private final OneTimeAction expirationAction;
    private final OneTimeAction.Listener listener;
    protected final StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine;
    private final Set<TtlListener> ttlListeners = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: com.smaato.sdk.core.ad.AdInteractor$TtlListener */
    public interface TtlListener {
        void onTTLExpired(AdInteractor<?> adInteractor);
    }

    public AdInteractor(TAdObject tadobject, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine2, OneTimeActionFactory oneTimeActionFactory) {
        $$Lambda$AdInteractor$PnGNNGMNzq_ND4VpAiFGdc6BD4 r0 = new OneTimeAction.Listener() {
            public final void doAction() {
                AdInteractor.this.onTTLExpired();
            }
        };
        this.listener = r0;
        this.adObject = (AdObject) Objects.requireNonNull(tadobject, "Parameter TAdObject cannot be null for AdInteractor::new");
        this.stateMachine = (StateMachine) Objects.requireNonNull(stateMachine2, "Parameter stateMachine cannot be null for AdInteractor::new");
        this.expirationAction = (OneTimeAction) Objects.requireNonNull(oneTimeActionFactory.createOneTimeAction(r0));
        stateMachine2.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                AdInteractor.this.stateChanged((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
    }

    public String getPublisherId() {
        return this.adObject.getSomaApiContext().getApiAdRequest().getPublisherId();
    }

    public String getAdSpaceId() {
        return this.adObject.getSomaApiContext().getApiAdRequest().getAdSpaceId();
    }

    public String getSessionId() {
        return this.adObject.getSomaApiContext().getApiAdResponse().getSessionId();
    }

    public String getCreativeId() {
        return this.adObject.getSomaApiContext().getApiAdResponse().getCreativeId();
    }

    /* renamed from: com.smaato.sdk.core.ad.AdInteractor$1 */
    static /* synthetic */ class C109371 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.core.ad.AdStateMachine$State[] r0 = com.smaato.sdk.core.p378ad.AdStateMachine.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State = r0
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.AdInteractor.C109371.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void stateChanged(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        int i = C109371.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()];
        if (i == 1) {
            startExpirationTimer();
        } else if (i == 2 || i == 3 || i == 4) {
            stopExpirationTimer();
        }
    }

    private void stopExpirationTimer() {
        OneTimeAction oneTimeAction = this.expirationAction;
        java.util.Objects.requireNonNull(oneTimeAction);
        Threads.runOnUi(new Runnable() {
            public final void run() {
                OneTimeAction.this.stop();
            }
        });
    }

    private void startExpirationTimer() {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                AdInteractor.this.lambda$startExpirationTimer$0$AdInteractor();
            }
        });
    }

    public /* synthetic */ void lambda$startExpirationTimer$0$AdInteractor() {
        this.expirationAction.start(getAdObject().getSomaApiContext().getApiAdResponse().getExpiration().getRemainingTime());
    }

    public void addTtlListener(TtlListener ttlListener) {
        this.ttlListeners.add(ttlListener);
    }

    public void removeTtlListener(TtlListener ttlListener) {
        this.ttlListeners.remove(ttlListener);
    }

    /* access modifiers changed from: private */
    public void onTTLExpired() {
        Iterator it = new ArrayList(this.ttlListeners).iterator();
        while (it.hasNext()) {
            ((TtlListener) it.next()).onTTLExpired(this);
        }
        this.stateMachine.onEvent(AdStateMachine.Event.EXPIRE_TTL);
    }

    public TAdObject getAdObject() {
        return this.adObject;
    }

    public void addStateListener(StateMachine.Listener<AdStateMachine.State> listener2) {
        this.stateMachine.addListener(listener2);
    }

    public void removeStateListener(StateMachine.Listener<AdStateMachine.State> listener2) {
        this.stateMachine.deleteListener(listener2);
    }

    public void onEvent(AdStateMachine.Event event) {
        this.stateMachine.onEvent(event);
    }

    public final boolean isValid() {
        AdStateMachine.State currentState = this.stateMachine.getCurrentState();
        return (currentState == AdStateMachine.State.IMPRESSED || currentState == AdStateMachine.State.TO_BE_DELETED || currentState == AdStateMachine.State.COMPLETE) ? false : true;
    }
}
