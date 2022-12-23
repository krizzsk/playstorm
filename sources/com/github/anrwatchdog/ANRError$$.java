package com.github.anrwatchdog;

import java.io.Serializable;

/* compiled from: ANRError */
class ANRError$$ implements Serializable {
    /* access modifiers changed from: private */
    public final String _name;
    /* access modifiers changed from: private */
    public final StackTraceElement[] _stackTrace;

    /* compiled from: ANRError */
    private class _Thread extends Throwable {
        private _Thread(_Thread _thread) {
            super(ANRError$$.this._name, _thread);
        }

        public Throwable fillInStackTrace() {
            setStackTrace(ANRError$$.this._stackTrace);
            return this;
        }
    }

    private ANRError$$(String str, StackTraceElement[] stackTraceElementArr) {
        this._name = str;
        this._stackTrace = stackTraceElementArr;
    }
}
