package com.tapjoy;

public class TapjoyErrorMessage {

    /* renamed from: a */
    private ErrorType f27628a;

    /* renamed from: b */
    private String f27629b;

    public enum ErrorType {
        INTERNAL_ERROR,
        SDK_ERROR,
        SERVER_ERROR,
        INTEGRATION_ERROR,
        NETWORK_ERROR
    }

    public TapjoyErrorMessage(ErrorType errorType, String str) {
        this.f27628a = errorType;
        this.f27629b = str;
    }

    public ErrorType getType() {
        return this.f27628a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Type=" + this.f27628a.toString());
        sb.append(";Message=" + this.f27629b);
        return sb.toString();
    }
}
