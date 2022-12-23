package com.smaato.sdk.video.vast.player;

import android.os.Handler;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.utils.RepeatableAction;

public class RepeatableActionFactory {
    private final Handler handler;

    public RepeatableActionFactory(Handler handler2) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
    }

    public RepeatableAction createRepeatableAction(RepeatableAction.Listener listener) {
        return new RepeatableAction(this.handler, listener);
    }
}
