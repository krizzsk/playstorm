package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Record;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

final class Request {
    private byte[] byteArray;
    final Record.Class clazz;
    public final DnsName name;
    public final Record.Type type;
    private final boolean unicastQuery;

    private Request(DnsName dnsName, Record.Type type2, Record.Class classR, boolean z) {
        this.name = (DnsName) Objects.requireNonNull(dnsName);
        this.type = (Record.Type) Objects.requireNonNull(type2);
        this.clazz = (Record.Class) Objects.requireNonNull(classR);
        this.unicastQuery = z;
    }

    private Request(DnsName dnsName, Record.Type type2, Record.Class classR) {
        this(dnsName, type2, classR, false);
    }

    Request(DnsName dnsName, Record.Type type2) {
        this(dnsName, type2, Record.Class.IN);
    }

    Request(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        this.name = DnsName.parse(dataInputStream, bArr);
        this.type = Record.Type.getType(dataInputStream.readUnsignedShort());
        this.clazz = Record.Class.getClass(dataInputStream.readUnsignedShort());
        this.unicastQuery = false;
    }

    /* access modifiers changed from: package-private */
    public byte[] toByteArray() {
        if (this.byteArray == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                this.name.writeToStream(dataOutputStream);
                dataOutputStream.writeShort(this.type.getValue());
                dataOutputStream.writeShort(this.clazz.getValue() | (this.unicastQuery ? 32768 : 0));
                dataOutputStream.flush();
                this.byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return this.byteArray;
    }

    public int hashCode() {
        return Arrays.hashCode(toByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        return Arrays.equals(toByteArray(), ((Request) obj).toByteArray());
    }

    public String toString() {
        return this.name.getRawAce() + ".\t" + this.clazz + 9 + this.type;
    }
}
