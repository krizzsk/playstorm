package com.smaato.sdk.richmedia.mraid.exception;

public class MraidException extends Exception {
    public MraidException(String str) {
        super(str);
    }

    public MraidException(String str, Throwable th) {
        super(str, th);
    }
}
