package com.smaato.sdk.core.dns;

import com.smaato.sdk.core.dns.Data;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public final class Record<D extends Data> {
    private byte[] bytes;
    private final Class clazz;
    private final int clazzValue;
    private Integer hashCodeCache;
    public final DnsName name;
    private final D payloadData;
    private final long ttl;
    public final Type type;
    private final boolean unicastQuery;

    public enum Type {
        UNKNOWN(-1),
        TXT(16, TXT.class);
        
        private static final Map<Class<?>, Type> DATA_LUT = null;
        private static final Map<Integer, Type> INVERSE_LUT = null;
        /* access modifiers changed from: private */
        public final Class<?> dataClass;
        private final int value;

        static {
            int i;
            INVERSE_LUT = new HashMap();
            DATA_LUT = new HashMap();
            for (Type type : values()) {
                INVERSE_LUT.put(Integer.valueOf(type.getValue()), type);
                Class<?> cls = type.dataClass;
                if (cls != null) {
                    DATA_LUT.put(cls, type);
                }
            }
        }

        private Type(int i) {
            this(r2, r3, i, (Class) null);
        }

        private <D extends Data> Type(int i, Class<D> cls) {
            this.value = i;
            this.dataClass = cls;
        }

        public int getValue() {
            return this.value;
        }

        public static Type getType(int i) {
            Type type = INVERSE_LUT.get(Integer.valueOf(i));
            return type == null ? UNKNOWN : type;
        }

        public static <D extends Data> Type getType(Class<D> cls) {
            Type type = DATA_LUT.get(cls);
            return type == null ? UNKNOWN : type;
        }
    }

    public enum Class {
        IN(1),
        CH(3),
        HS(4),
        NONE(254),
        ANY(255);
        
        private static final HashMap<Integer, Class> INVERSE_LUT = null;
        private final int value;

        static {
            int i;
            INVERSE_LUT = new HashMap<>();
            for (Class classR : values()) {
                INVERSE_LUT.put(Integer.valueOf(classR.getValue()), classR);
            }
        }

        private Class(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static Class getClass(int i) {
            return INVERSE_LUT.get(Integer.valueOf(i));
        }
    }

    private Record(DnsName dnsName, Type type2, Class classR, int i, long j, D d, boolean z) {
        this.name = dnsName;
        this.type = type2;
        this.clazz = classR;
        this.clazzValue = i;
        this.ttl = j;
        this.payloadData = d;
        this.unicastQuery = z;
    }

    public static Record<Data> parse(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        Data data;
        DnsName parse = DnsName.parse(dataInputStream, bArr);
        Type type2 = Type.getType(dataInputStream.readUnsignedShort());
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        Class classR = Class.getClass(readUnsignedShort & 32767);
        boolean z = (32768 & readUnsignedShort) > 0;
        long readUnsignedShort2 = (((long) dataInputStream.readUnsignedShort()) << 16) + ((long) dataInputStream.readUnsignedShort());
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        if (C109721.$SwitchMap$com$smaato$sdk$core$dns$Record$Type[type2.ordinal()] != 1) {
            data = UNKNOWN.parse(dataInputStream, readUnsignedShort3, type2);
        } else {
            data = TXT.parse(dataInputStream, readUnsignedShort3);
        }
        return new Record(parse, type2, classR, readUnsignedShort, readUnsignedShort2, data, z);
    }

    /* renamed from: com.smaato.sdk.core.dns.Record$1 */
    static /* synthetic */ class C109721 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$dns$Record$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.smaato.sdk.core.dns.Record$Type[] r0 = com.smaato.sdk.core.dns.Record.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$dns$Record$Type = r0
                com.smaato.sdk.core.dns.Record$Type r1 = com.smaato.sdk.core.dns.Record.Type.TXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$dns$Record$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.dns.Record$Type r1 = com.smaato.sdk.core.dns.Record.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.dns.Record.C109721.<clinit>():void");
        }
    }

    private void toOutputStream(OutputStream outputStream) throws IOException {
        if (this.payloadData != null) {
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            this.name.writeToStream(dataOutputStream);
            dataOutputStream.writeShort(this.type.getValue());
            dataOutputStream.writeShort(this.clazzValue);
            dataOutputStream.writeInt((int) this.ttl);
            dataOutputStream.writeShort(this.payloadData.length());
            this.payloadData.toOutputStream(dataOutputStream);
            return;
        }
        throw new IllegalStateException("Empty Record has no byte representation");
    }

    /* access modifiers changed from: package-private */
    public byte[] toByteArray() {
        if (this.bytes == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.name.size() + 10 + this.payloadData.length());
            try {
                toOutputStream(new DataOutputStream(byteArrayOutputStream));
                this.bytes = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
        return (byte[]) this.bytes.clone();
    }

    public String toString() {
        return this.name.getRawAce() + ".\t" + this.ttl + 9 + this.clazz + 9 + this.type + 9 + this.payloadData;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r3.clazz;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isAnswer(com.smaato.sdk.core.dns.Request r3) {
        /*
            r2 = this;
            com.smaato.sdk.core.dns.Record$Type r0 = r3.type
            com.smaato.sdk.core.dns.Record$Type r1 = r2.type
            if (r0 != r1) goto L_0x001c
            com.smaato.sdk.core.dns.Record$Class r0 = r3.clazz
            com.smaato.sdk.core.dns.Record$Class r1 = r2.clazz
            if (r0 == r1) goto L_0x0010
            com.smaato.sdk.core.dns.Record$Class r1 = com.smaato.sdk.core.dns.Record.Class.ANY
            if (r0 != r1) goto L_0x001c
        L_0x0010:
            com.smaato.sdk.core.dns.DnsName r3 = r3.name
            com.smaato.sdk.core.dns.DnsName r0 = r2.name
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x001c
            r3 = 1
            goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.dns.Record.isAnswer(com.smaato.sdk.core.dns.Request):boolean");
    }

    /* access modifiers changed from: package-private */
    public D getPayload() {
        return this.payloadData;
    }

    public int hashCode() {
        if (this.hashCodeCache == null) {
            this.hashCodeCache = Integer.valueOf(((((((this.name.hashCode() + 37) * 37) + this.type.hashCode()) * 37) + this.clazz.hashCode()) * 37) + this.payloadData.hashCode());
        }
        return this.hashCodeCache.intValue();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Record)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Record record = (Record) obj;
        return this.name.equals(record.name) && this.type == record.type && this.clazz == record.clazz && this.payloadData.equals(record.payloadData);
    }

    private <E extends Data> Record<E> ifPossibleAs(Class<E> cls) {
        if (this.type.dataClass == cls) {
            return this;
        }
        return null;
    }

    /* renamed from: as */
    public <E extends Data> Record<E> mo68838as(Class<E> cls) {
        Record<E> ifPossibleAs = ifPossibleAs(cls);
        if (ifPossibleAs != null) {
            return ifPossibleAs;
        }
        throw new IllegalArgumentException("The instance " + this + " can not be cast to a Record with" + cls);
    }
}
