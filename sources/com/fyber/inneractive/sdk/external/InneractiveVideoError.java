package com.fyber.inneractive.sdk.external;

public class InneractiveVideoError extends InneractiveError {

    /* renamed from: a */
    public final Error f10846a;

    /* renamed from: b */
    public Throwable f10847b;

    public enum Error {
        ERROR_NO_MEDIA_FILES("ErrorNoMediaFiles", true),
        ERROR_FAILED_PLAYING_MEDIA_FILE("ErrorPlayingMediaFile", false),
        ERROR_FAILED_PLAYING_ALL_MEDIA_FILES("ErrorPlayingAllMediaFile", true),
        ERROR_PRE_BUFFER_TIMEOUT("ErrorPreBufferTimeout", false),
        ERROR_BUFFER_TIMEOUT("ErrorBufferTimeout", false);
        

        /* renamed from: a */
        public String f10849a;

        /* renamed from: b */
        public boolean f10850b;

        /* access modifiers changed from: public */
        Error(String str, boolean z) {
            this.f10849a = str;
            this.f10850b = z;
        }

        public String getErrorString() {
            return this.f10849a;
        }

        public boolean isFatal() {
            return this.f10850b;
        }
    }

    public InneractiveVideoError(Error error) {
        this.f10846a = error;
    }

    public String description() {
        if (this.f10847b == null) {
            return this.f10846a.getErrorString();
        }
        return this.f10846a.getErrorString() + ": " + this.f10847b;
    }

    public Throwable getCause() {
        return this.f10847b;
    }

    public Error getPlayerError() {
        return this.f10846a;
    }

    public InneractiveVideoError(Error error, Throwable th) {
        this(error);
        this.f10847b = th;
    }
}
