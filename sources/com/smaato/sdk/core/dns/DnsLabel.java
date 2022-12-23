package com.smaato.sdk.core.dns;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Locale;

final class DnsLabel implements CharSequence {
    static final int MAX_LABEL_LENGTH_IN_OCTETS = 63;
    private byte[] byteCache;
    private final String label;
    private DnsLabel lowercasedVariant;

    private DnsLabel(String str) {
        this.label = str;
        setBytesIfRequired();
        if (this.byteCache.length > 63) {
            throw new LabelToLongException(str);
        }
    }

    public final int length() {
        return this.label.length();
    }

    public final char charAt(int i) {
        return this.label.charAt(i);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.label.subSequence(i, i2);
    }

    public final String toString() {
        return this.label;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DnsLabel)) {
            return false;
        }
        return this.label.equals(((DnsLabel) obj).label);
    }

    public final int hashCode() {
        return this.label.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final DnsLabel asLowercaseVariant() {
        if (this.lowercasedVariant == null) {
            this.lowercasedVariant = from(this.label.toLowerCase(Locale.US));
        }
        return this.lowercasedVariant;
    }

    private void setBytesIfRequired() {
        if (this.byteCache == null) {
            this.byteCache = this.label.getBytes(Charset.forName("US-ASCII"));
        }
    }

    /* access modifiers changed from: package-private */
    public final void writeToBoas(ByteArrayOutputStream byteArrayOutputStream) {
        setBytesIfRequired();
        byteArrayOutputStream.write(this.byteCache.length);
        byte[] bArr = this.byteCache;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static DnsLabel from(String str) {
        if (str != null && !str.isEmpty()) {
            return new DnsLabel(str);
        }
        throw new IllegalArgumentException("Label is null or empty");
    }

    public static DnsLabel[] from(String[] strArr) {
        DnsLabel[] dnsLabelArr = new DnsLabel[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            dnsLabelArr[i] = from(strArr[i]);
        }
        return dnsLabelArr;
    }

    static class LabelToLongException extends IllegalArgumentException {
        final String label;

        LabelToLongException(String str) {
            this.label = str;
        }
    }
}
