package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a0 */
public class C5119a0 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a0$a */
    public static class C5120a extends C5119a0 {
        private static final long serialVersionUID = 3283890091615336259L;

        public C5120a(String str) {
            super(str);
        }
    }

    public C5119a0(String str) {
        super(str);
    }

    /* renamed from: a */
    public static C5119a0 m15524a() {
        return new C5119a0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static C5119a0 m15525b() {
        return new C5119a0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static C5119a0 m15526c() {
        return new C5119a0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static C5120a m15527d() {
        return new C5120a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static C5119a0 m15528e() {
        return new C5119a0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static C5119a0 m15529f() {
        return new C5119a0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static C5119a0 m15530g() {
        return new C5119a0("Failed to parse the message.");
    }

    /* renamed from: h */
    public static C5119a0 m15531h() {
        return new C5119a0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    public static C5119a0 m15532i() {
        return new C5119a0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
