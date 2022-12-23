package com.smaato.sdk.core.tracker;

import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;

public final class ImpressionDetector {
    private Callback callback;
    private final AdStateMachine.State impressionState;
    public final StateMachine.Listener<AdStateMachine.State> stateListener = new StateMachine.Listener() {
        public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
            ImpressionDetector.this.lambda$new$0$ImpressionDetector((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
        }
    };

    public interface Callback {
        void onImpressionStateDetected();
    }

    public /* synthetic */ void lambda$new$0$ImpressionDetector(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        onStateChanged(state2);
    }

    public ImpressionDetector(AdStateMachine.State state) {
        this.impressionState = (AdStateMachine.State) Objects.requireNonNull(state);
    }

    public void setOnImpressionStateDetectedCallback(Callback callback2) {
        this.callback = callback2;
    }

    private void onStateChanged(AdStateMachine.State state) {
        if (state == this.impressionState) {
            Objects.onNotNull(this.callback, $$Lambda$f9tAlkmanVF94Zd_vmyqUR8_pw.INSTANCE);
        }
    }
}
