package com.smaato.sdk.core.util;

import android.os.Handler;
import com.smaato.sdk.core.util.OneTimeAction;

public class OneTimeActionFactory {
    private final Handler handler;

    public OneTimeActionFactory(Handler handler2) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
    }

    public OneTimeAction createOneTimeAction(OneTimeAction.Listener listener) {
        return new OneTimeAction(this.handler, listener);
    }
}
