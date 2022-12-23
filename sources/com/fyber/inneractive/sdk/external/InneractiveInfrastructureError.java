package com.fyber.inneractive.sdk.external;

public class InneractiveInfrastructureError extends InneractiveError {

    /* renamed from: a */
    public final InneractiveErrorCode f10837a;

    /* renamed from: b */
    public Throwable f10838b;

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode) {
        this.f10837a = inneractiveErrorCode;
    }

    public String description() {
        StringBuilder sb = new StringBuilder();
        InneractiveErrorCode inneractiveErrorCode = this.f10837a;
        if (inneractiveErrorCode != null) {
            sb.append(inneractiveErrorCode);
        }
        if (this.f10838b != null) {
            sb.append(": ");
            sb.append(this.f10838b);
        }
        return sb.toString();
    }

    public Throwable getCause() {
        return this.f10838b;
    }

    public InneractiveErrorCode getErrorCode() {
        return this.f10837a;
    }

    public void setCause(Throwable th) {
        this.f10838b = th;
    }

    public InneractiveInfrastructureError(InneractiveErrorCode inneractiveErrorCode, Throwable th) {
        this(inneractiveErrorCode);
        this.f10838b = th;
    }
}
