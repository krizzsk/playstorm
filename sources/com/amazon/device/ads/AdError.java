package com.amazon.device.ads;

public class AdError {
    private final ErrorCode code;
    private final String message;
    private DTBAdRequest refreshLoader;

    public enum ErrorCode {
        NO_ERROR,
        NETWORK_ERROR,
        NETWORK_TIMEOUT,
        NO_FILL,
        INTERNAL_ERROR,
        REQUEST_ERROR
    }

    AdError(ErrorCode errorCode, String str) {
        this.code = errorCode;
        this.message = str;
    }

    public ErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public DTBAdRequest getAdLoader() {
        return this.refreshLoader;
    }

    /* access modifiers changed from: package-private */
    public void setAdLoader(DTBAdRequest dTBAdRequest) {
        this.refreshLoader = dTBAdRequest;
    }
}
