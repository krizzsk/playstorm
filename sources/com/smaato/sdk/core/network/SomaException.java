package com.smaato.sdk.core.network;

import java.io.IOException;

public class SomaException extends IOException {
    private final Type type;

    public SomaException(Type type2) {
        this(type2, type2.description);
    }

    public SomaException(Type type2, String str) {
        super(str);
        this.type = type2;
    }

    public SomaException(Type type2, Throwable th) {
        super(th);
        this.type = type2;
    }

    public Type getType() {
        return this.type;
    }

    public enum Type {
        NO_CONTENT("Server returns empty response."),
        BAD_REQUEST("Client sent invalid request."),
        BAD_RESPONSE("Internal server error."),
        TIMEOUT_ERROR("Connectivity issue or timeout.");
        
        /* access modifiers changed from: private */
        public final String description;

        private Type(String str) {
            this.description = str;
        }

        public String toString() {
            return "[" + name() + "]: " + this.description;
        }
    }
}
