package com.smaato.sdk.core.dns;

import com.google.common.base.Ascii;
import com.smaato.sdk.core.util.collections.Lists;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class DnsMessage {
    /* access modifiers changed from: private */
    public final List<Record<? extends Data>> answerSection;
    /* access modifiers changed from: private */
    public final boolean authenticData;
    /* access modifiers changed from: private */
    public final boolean authoritativeAnswer;
    private byte[] byteCache;
    /* access modifiers changed from: private */
    public final boolean checkingDisabled;
    private transient Integer hashCodeCache;

    /* renamed from: id */
    public final int f27127id;
    /* access modifiers changed from: private */
    public final Opcode opcode;
    /* access modifiers changed from: private */

    /* renamed from: qr */
    public final boolean f27128qr;
    /* access modifiers changed from: private */
    public final long receiveTimestamp;
    /* access modifiers changed from: private */
    public final boolean recursionAvailable;
    /* access modifiers changed from: private */
    public final boolean recursionDesired;
    /* access modifiers changed from: private */
    public final List<Request> requests;
    final ResponseCode responseCode;
    private String toStringCache;
    final boolean truncated;

    DnsMessage(byte[] bArr) throws IOException, IllegalArgumentException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.f27127id = dataInputStream.readUnsignedShort();
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        boolean z = true;
        this.f27128qr = ((readUnsignedShort >> 15) & 1) == 1;
        this.opcode = Opcode.getOpcode((readUnsignedShort >> 11) & 15);
        this.authoritativeAnswer = ((readUnsignedShort >> 10) & 1) == 1;
        this.truncated = ((readUnsignedShort >> 9) & 1) == 1;
        this.recursionDesired = ((readUnsignedShort >> 8) & 1) == 1;
        this.recursionAvailable = ((readUnsignedShort >> 7) & 1) == 1;
        this.authenticData = ((readUnsignedShort >> 5) & 1) == 1;
        this.checkingDisabled = ((readUnsignedShort >> 4) & 1) != 1 ? false : z;
        this.responseCode = ResponseCode.getResponseCode(readUnsignedShort & 15);
        this.receiveTimestamp = System.currentTimeMillis();
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        this.requests = new ArrayList(readUnsignedShort2);
        for (int i = 0; i < readUnsignedShort2; i++) {
            this.requests.add(new Request(dataInputStream, bArr));
        }
        this.answerSection = new ArrayList(readUnsignedShort3);
        for (int i2 = 0; i2 < readUnsignedShort3; i2++) {
            this.answerSection.add(Record.parse(dataInputStream, bArr));
        }
    }

    private DnsMessage(Builder builder) {
        this.f27127id = builder.f27129id;
        this.opcode = builder.opcode;
        this.responseCode = builder.responseCode;
        this.receiveTimestamp = builder.receiveTimestamp;
        this.f27128qr = builder.query;
        this.authoritativeAnswer = builder.authoritativeAnswer;
        this.truncated = builder.truncated;
        this.recursionDesired = builder.recursionDesired;
        this.recursionAvailable = builder.recursionAvailable;
        this.authenticData = builder.authenticData;
        this.checkingDisabled = builder.checkingDisabled;
        this.requests = Lists.toImmutableList(builder.requests);
        this.answerSection = Lists.toImmutableList(builder.answerSection);
    }

    /* access modifiers changed from: package-private */
    public DatagramPacket asDatagram(InetAddress inetAddress, int i) {
        byte[] serialize = serialize();
        return new DatagramPacket(serialize, serialize.length, inetAddress, i);
    }

    /* access modifiers changed from: package-private */
    public void writeTo(OutputStream outputStream) throws IOException {
        byte[] serialize = serialize();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeShort(serialize.length);
        dataOutputStream.write(serialize);
    }

    private byte[] serialize() {
        byte[] bArr = this.byteCache;
        if (bArr != null) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        int calculateHeaderBitmap = calculateHeaderBitmap();
        try {
            dataOutputStream.writeShort((short) this.f27127id);
            dataOutputStream.writeShort((short) calculateHeaderBitmap);
            List<Request> list = this.requests;
            if (list == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list.size());
            }
            List<Record<? extends Data>> list2 = this.answerSection;
            if (list2 == null) {
                dataOutputStream.writeShort(0);
            } else {
                dataOutputStream.writeShort((short) list2.size());
            }
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            List<Request> list3 = this.requests;
            if (list3 != null) {
                for (Request byteArray : list3) {
                    dataOutputStream.write(byteArray.toByteArray());
                }
            }
            List<Record<? extends Data>> list4 = this.answerSection;
            if (list4 != null) {
                for (Record<? extends Data> byteArray2 : list4) {
                    dataOutputStream.write(byteArray2.toByteArray());
                }
            }
            dataOutputStream.flush();
            byte[] byteArray3 = byteArrayOutputStream.toByteArray();
            this.byteCache = byteArray3;
            return byteArray3;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private int calculateHeaderBitmap() {
        int i = this.f27128qr ? 32768 : 0;
        Opcode opcode2 = this.opcode;
        if (opcode2 != null) {
            i += opcode2.getValue() << Ascii.f17948VT;
        }
        if (this.authoritativeAnswer) {
            i += 1024;
        }
        if (this.truncated) {
            i += 512;
        }
        if (this.recursionDesired) {
            i += 256;
        }
        if (this.recursionAvailable) {
            i += 128;
        }
        if (this.authenticData) {
            i += 32;
        }
        if (this.checkingDisabled) {
            i += 16;
        }
        return i + this.responseCode.getValue();
    }

    public String toString() {
        String str = this.toStringCache;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("DnsMessage");
        asBuilder().writeToStringBuilder(sb);
        String sb2 = sb.toString();
        this.toStringCache = sb2;
        return sb2;
    }

    /* access modifiers changed from: package-private */
    public <D extends Data> Set<D> getAnswersFor(Request request) {
        if (this.responseCode != ResponseCode.NO_ERROR || this.answerSection == null) {
            return null;
        }
        HashSet hashSet = new HashSet(this.answerSection.size());
        for (Record next : this.answerSection) {
            if (next.isAnswer(request)) {
                hashSet.add(next.getPayload());
            }
        }
        return hashSet;
    }

    private Builder asBuilder() {
        return new Builder();
    }

    public int hashCode() {
        if (this.hashCodeCache == null) {
            this.hashCodeCache = Integer.valueOf(Arrays.hashCode(serialize()));
        }
        return this.hashCodeCache.intValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DnsMessage)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return Arrays.equals(serialize(), ((DnsMessage) obj).serialize());
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        /* access modifiers changed from: private */
        public List<Record<? extends Data>> answerSection;
        /* access modifiers changed from: private */
        public boolean authenticData;
        /* access modifiers changed from: private */
        public boolean authoritativeAnswer;
        /* access modifiers changed from: private */
        public boolean checkingDisabled;
        /* access modifiers changed from: private */

        /* renamed from: id */
        public int f27129id;
        /* access modifiers changed from: private */
        public Opcode opcode;
        /* access modifiers changed from: private */
        public boolean query;
        /* access modifiers changed from: private */
        public long receiveTimestamp;
        /* access modifiers changed from: private */
        public boolean recursionAvailable;
        /* access modifiers changed from: private */
        public boolean recursionDesired;
        /* access modifiers changed from: private */
        public List<Request> requests;
        /* access modifiers changed from: private */
        public ResponseCode responseCode;
        /* access modifiers changed from: private */
        public boolean truncated;

        private Builder() {
            this.opcode = Opcode.QUERY;
            this.responseCode = ResponseCode.NO_ERROR;
            this.receiveTimestamp = -1;
        }

        private Builder(DnsMessage dnsMessage) {
            this.opcode = Opcode.QUERY;
            this.responseCode = ResponseCode.NO_ERROR;
            this.receiveTimestamp = -1;
            this.f27129id = dnsMessage.f27127id;
            this.opcode = dnsMessage.opcode;
            this.responseCode = dnsMessage.responseCode;
            this.query = dnsMessage.f27128qr;
            this.authoritativeAnswer = dnsMessage.authoritativeAnswer;
            this.truncated = dnsMessage.truncated;
            this.recursionDesired = dnsMessage.recursionDesired;
            this.recursionAvailable = dnsMessage.recursionAvailable;
            this.authenticData = dnsMessage.authenticData;
            this.checkingDisabled = dnsMessage.checkingDisabled;
            this.receiveTimestamp = dnsMessage.receiveTimestamp;
            List access$2400 = dnsMessage.requests;
            ArrayList arrayList = new ArrayList();
            this.requests = arrayList;
            if (access$2400 != null) {
                arrayList.addAll(access$2400);
            }
            List access$2500 = dnsMessage.answerSection;
            ArrayList arrayList2 = new ArrayList();
            this.answerSection = arrayList2;
            if (access$2500 != null) {
                arrayList2.addAll(access$2500);
            }
        }

        public Builder setId(int i) {
            this.f27129id = i & 65535;
            return this;
        }

        public Builder setRecursionDesired(boolean z) {
            this.recursionDesired = z;
            return this;
        }

        public Builder setQuestion(Request request) {
            ArrayList arrayList = new ArrayList(1);
            this.requests = arrayList;
            arrayList.add(request);
            return this;
        }

        public DnsMessage build() {
            return new DnsMessage(this);
        }

        /* access modifiers changed from: private */
        public void writeToStringBuilder(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f27129id);
            sb.append(' ');
            sb.append(this.opcode);
            sb.append(' ');
            sb.append(this.responseCode);
            sb.append(' ');
            if (this.query) {
                sb.append("resp[qr=1]");
            } else {
                sb.append("query[qr=0]");
            }
            if (this.authoritativeAnswer) {
                sb.append(" aa");
            }
            if (this.truncated) {
                sb.append(" tr");
            }
            if (this.recursionDesired) {
                sb.append(" rd");
            }
            if (this.recursionAvailable) {
                sb.append(" ra");
            }
            if (this.authenticData) {
                sb.append(" ad");
            }
            if (this.checkingDisabled) {
                sb.append(" cd");
            }
            sb.append(")\n");
            List<Request> list = this.requests;
            if (list != null) {
                for (Request append : list) {
                    sb.append("[Q: ");
                    sb.append(append);
                    sb.append("]\n");
                }
            }
            List<Record<? extends Data>> list2 = this.answerSection;
            if (list2 != null) {
                for (Record<? extends Data> append2 : list2) {
                    sb.append("[A: ");
                    sb.append(append2);
                    sb.append("]\n");
                }
            }
            if (sb.charAt(sb.length() - 1) == 10) {
                sb.setLength(sb.length() - 1);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder of DnsMessage");
            writeToStringBuilder(sb);
            return sb.toString();
        }
    }

    public enum ResponseCode {
        NO_ERROR(0),
        FORMAT_ERR(1),
        SERVER_FAIL(2),
        NX_DOMAIN(3),
        NO_IMP(4),
        REFUSED(5),
        YXDOMAIN(6),
        YXRRSET(7),
        NXRRSET(8),
        NOT_AUTH(9),
        NOT_ZONE(10),
        BADVERS_BADSIG(16),
        BADKEY(17),
        BADTIME(18),
        BADMODE(19),
        BADNAME(20),
        BADALG(21),
        BADTRUNC(22),
        BADCOOKIE(23);
        
        private static final Map<Integer, ResponseCode> INVERSE_LUT = null;
        private final byte value;

        static {
            INVERSE_LUT = new HashMap(values().length);
            for (ResponseCode responseCode : values()) {
                INVERSE_LUT.put(Integer.valueOf(responseCode.value), responseCode);
            }
        }

        private ResponseCode(int i) {
            this.value = (byte) i;
        }

        public byte getValue() {
            return this.value;
        }

        public static ResponseCode getResponseCode(int i) throws IllegalArgumentException {
            if (i < 0 || i > 65535) {
                throw new IllegalArgumentException();
            }
            ResponseCode responseCode = INVERSE_LUT.get(Integer.valueOf(i));
            if (responseCode != null) {
                return responseCode;
            }
            throw new IllegalArgumentException();
        }
    }

    public enum Opcode {
        QUERY,
        INVERSE_QUERY,
        STATUS,
        UNASSIGNED3,
        NOTIFY,
        UPDATE;
        
        private static final Opcode[] INVERSE_LUT = null;
        private final byte value;

        static {
            int i;
            INVERSE_LUT = new Opcode[values().length];
            Opcode[] values = values();
            int length = values.length;
            while (i < length) {
                Opcode opcode = values[i];
                Opcode[] opcodeArr = INVERSE_LUT;
                if (opcodeArr[opcode.getValue()] == null) {
                    opcodeArr[opcode.getValue()] = opcode;
                    i++;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public byte getValue() {
            return this.value;
        }

        public static Opcode getOpcode(int i) throws IllegalArgumentException {
            if (i < 0 || i > 15) {
                throw new IllegalArgumentException();
            }
            Opcode[] opcodeArr = INVERSE_LUT;
            if (i >= opcodeArr.length) {
                return null;
            }
            return opcodeArr[i];
        }
    }
}
