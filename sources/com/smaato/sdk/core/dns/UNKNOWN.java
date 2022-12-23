package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Record;
import com.smaato.sdk.core.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class UNKNOWN extends Data {
    private final byte[] data;
    private final Record.Type type;

    private UNKNOWN(DataInputStream dataInputStream, int i, Record.Type type2) throws IOException {
        Objects.requireNonNull(type2);
        this.type = (Record.Type) Objects.requireNonNull(type2);
        byte[] bArr = new byte[i];
        this.data = bArr;
        dataInputStream.readFully(bArr);
    }

    public Record.Type getType() {
        return this.type;
    }

    public void serialize(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.data);
    }

    public static UNKNOWN parse(DataInputStream dataInputStream, int i, Record.Type type2) throws IOException {
        return new UNKNOWN(dataInputStream, i, type2);
    }
}
