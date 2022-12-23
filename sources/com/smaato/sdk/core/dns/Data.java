package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Record;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class Data {
    private byte[] bytes;
    private Integer hashCodeCache;

    public abstract Record.Type getType();

    /* access modifiers changed from: protected */
    public abstract void serialize(DataOutputStream dataOutputStream) throws IOException;

    private void setBytes() {
        if (this.bytes == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                serialize(new DataOutputStream(byteArrayOutputStream));
                this.bytes = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public final int length() {
        setBytes();
        return this.bytes.length;
    }

    /* access modifiers changed from: package-private */
    public final void toOutputStream(DataOutputStream dataOutputStream) throws IOException {
        setBytes();
        dataOutputStream.write(this.bytes);
    }

    public final int hashCode() {
        if (this.hashCodeCache == null) {
            setBytes();
            this.hashCodeCache = Integer.valueOf(Arrays.hashCode(this.bytes));
        }
        return this.hashCodeCache.intValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Data)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Data data = (Data) obj;
        data.setBytes();
        setBytes();
        return Arrays.equals(this.bytes, data.bytes);
    }
}
