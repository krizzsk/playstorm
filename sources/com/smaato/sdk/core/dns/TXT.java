package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Record;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class TXT extends Data {
    private final byte[] blob;
    private List<String> characterStringsCache;
    private String textCache;

    private TXT(byte[] bArr) {
        this.blob = bArr;
    }

    public static TXT parse(DataInputStream dataInputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        dataInputStream.readFully(bArr);
        return new TXT(bArr);
    }

    public String getText() {
        if (this.textCache == null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = getCharacterStrings().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(" / ");
                }
            }
            this.textCache = sb.toString();
        }
        return this.textCache;
    }

    private List<String> getCharacterStrings() {
        if (this.characterStringsCache == null) {
            List<byte[]> extents = getExtents();
            ArrayList arrayList = new ArrayList(extents.size());
            for (byte[] str : extents) {
                try {
                    arrayList.add(new String(str, "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    throw new AssertionError(e);
                }
            }
            this.characterStringsCache = Collections.unmodifiableList(arrayList);
        }
        return this.characterStringsCache;
    }

    private List<byte[]> getExtents() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] bArr = this.blob;
            if (i >= bArr.length) {
                return arrayList;
            }
            int i2 = i + 1;
            int i3 = (bArr[i] & 255) + i2;
            arrayList.add(Arrays.copyOfRange(bArr, i2, i3));
            i = i3;
        }
    }

    public void serialize(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.write(this.blob);
    }

    public Record.Type getType() {
        return Record.Type.TXT;
    }

    public String toString() {
        return "\"" + getText() + "\"";
    }
}
