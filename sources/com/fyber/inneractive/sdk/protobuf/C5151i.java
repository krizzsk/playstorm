package com.fyber.inneractive.sdk.protobuf;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i */
public abstract class C5151i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C5151i f13766b = new C5159h(C5252z.f13964b);

    /* renamed from: c */
    public static final C5156e f13767c;

    /* renamed from: a */
    public int f13768a = 0;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$a */
    public class C5152a extends C5153b {

        /* renamed from: a */
        public int f13769a = 0;

        /* renamed from: b */
        public final int f13770b;

        public C5152a() {
            this.f13770b = C5151i.this.size();
        }

        /* renamed from: a */
        public byte mo25997a() {
            int i = this.f13769a;
            if (i < this.f13770b) {
                this.f13769a = i + 1;
                return C5151i.this.mo25986d(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f13769a < this.f13770b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$b */
    public static abstract class C5153b implements C5157f {
        public Object next() {
            return Byte.valueOf(mo25997a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$c */
    public static final class C5154c implements C5156e {
        /* renamed from: a */
        public byte[] mo26001a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$d */
    public static final class C5155d extends C5159h {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        public final int f13772e;

        /* renamed from: f */
        public final int f13773f;

        public C5155d(byte[] bArr, int i, int i2) {
            super(bArr);
            C5151i.m15766a(i, i + i2, bArr.length);
            this.f13772e = i;
            this.f13773f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: a */
        public void mo25982a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f13774d, this.f13772e + i, bArr, i2, i3);
        }

        /* renamed from: c */
        public byte mo25985c(int i) {
            C5151i.m15769a(i, this.f13773f);
            return this.f13774d[this.f13772e + i];
        }

        /* renamed from: d */
        public byte mo25986d(int i) {
            return this.f13774d[this.f13772e + i];
        }

        /* renamed from: j */
        public int mo26002j() {
            return this.f13772e;
        }

        public int size() {
            return this.f13773f;
        }

        public Object writeReplace() {
            return new C5159h(mo25991h());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$e */
    public interface C5156e {
        /* renamed from: a */
        byte[] mo26001a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$f */
    public interface C5157f extends Iterator<Byte> {
        /* renamed from: a */
        byte mo25997a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$g */
    public static abstract class C5158g extends C5151i {
        public Iterator iterator() {
            return new C5152a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$h */
    public static class C5159h extends C5158g {
        private static final long serialVersionUID = 1;

        /* renamed from: d */
        public final byte[] f13774d;

        public C5159h(byte[] bArr) {
            bArr.getClass();
            this.f13774d = bArr;
        }

        /* renamed from: a */
        public void mo25982a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f13774d, i, bArr, i2, i3);
        }

        /* renamed from: b */
        public final C5151i mo25984b(int i, int i2) {
            int a = C5151i.m15766a(i, i2, size());
            if (a == 0) {
                return C5151i.f13766b;
            }
            return new C5155d(this.f13774d, mo26002j() + i, a);
        }

        /* renamed from: c */
        public byte mo25985c(int i) {
            return this.f13774d[i];
        }

        /* renamed from: d */
        public byte mo25986d(int i) {
            return this.f13774d[i];
        }

        /* renamed from: e */
        public final boolean mo25987e() {
            int j = mo26002j();
            return C5219s1.m16302b(this.f13774d, j, size() + j);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5151i) || size() != ((C5151i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C5159h)) {
                return obj.equals(this);
            }
            C5159h hVar = (C5159h) obj;
            int i = this.f13768a;
            int i2 = hVar.f13768a;
            if (i == 0 || i2 == 0 || i == i2) {
                return mo26004a(hVar, 0, size());
            }
            return false;
        }

        /* renamed from: g */
        public final C5172j mo25990g() {
            return C5172j.m15821a(this.f13774d, mo26002j(), size(), true);
        }

        /* renamed from: j */
        public int mo26002j() {
            return 0;
        }

        public int size() {
            return this.f13774d.length;
        }

        /* renamed from: a */
        public final void mo25981a(C5148h hVar) throws IOException {
            hVar.mo25967a(this.f13774d, mo26002j(), size());
        }

        /* renamed from: a */
        public final String mo25980a(Charset charset) {
            return new String(this.f13774d, mo26002j(), size(), charset);
        }

        /* renamed from: a */
        public final boolean mo26004a(C5151i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + iVar.size());
                } else if (!(iVar instanceof C5159h)) {
                    return iVar.mo25984b(i, i3).equals(mo25984b(0, i2));
                } else {
                    C5159h hVar = (C5159h) iVar;
                    byte[] bArr = this.f13774d;
                    byte[] bArr2 = hVar.f13774d;
                    int j = mo26002j() + i2;
                    int j2 = mo26002j();
                    int j3 = hVar.mo26002j() + i;
                    while (j2 < j) {
                        if (bArr[j2] != bArr2[j3]) {
                            return false;
                        }
                        j2++;
                        j3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: b */
        public final int mo25983b(int i, int i2, int i3) {
            byte[] bArr = this.f13774d;
            int j = mo26002j() + i2;
            Charset charset = C5252z.f13963a;
            for (int i4 = j; i4 < j + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$i */
    public static final class C5160i implements C5156e {
        /* renamed from: a */
        public byte[] mo26001a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C5156e eVar;
        if (C5130d.m15540a()) {
            eVar = new C5160i();
        } else {
            eVar = new C5154c();
        }
        f13767c = eVar;
    }

    /* renamed from: a */
    public static C5151i m15768a(byte[] bArr, int i, int i2) {
        m15766a(i, i + i2, bArr.length);
        return new C5159h(f13767c.mo26001a(bArr, i, i2));
    }

    /* renamed from: a */
    public abstract String mo25980a(Charset charset);

    /* renamed from: a */
    public abstract void mo25981a(C5148h hVar) throws IOException;

    /* renamed from: a */
    public abstract void mo25982a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public abstract int mo25983b(int i, int i2, int i3);

    /* renamed from: b */
    public abstract C5151i mo25984b(int i, int i2);

    /* renamed from: c */
    public abstract byte mo25985c(int i);

    /* renamed from: d */
    public abstract byte mo25986d(int i);

    /* renamed from: e */
    public abstract boolean mo25987e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public C5157f iterator() {
        return new C5152a();
    }

    /* renamed from: g */
    public abstract C5172j mo25990g();

    /* renamed from: h */
    public final byte[] mo25991h() {
        int size = size();
        if (size == 0) {
            return C5252z.f13964b;
        }
        byte[] bArr = new byte[size];
        mo25982a(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f13768a;
        if (i == 0) {
            int size = size();
            i = mo25983b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f13768a = i;
        }
        return i;
    }

    /* renamed from: i */
    public final String mo25993i() {
        return size() == 0 ? "" : mo25980a(C5252z.f13963a);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C5182k1.m16019a(this);
        } else {
            str = C5182k1.m16019a(mo25984b(0, 47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: a */
    public static C5151i m15767a(String str) {
        return new C5159h(str.getBytes(C5252z.f13963a));
    }

    /* renamed from: a */
    public static void m15769a(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: a */
    public static int m15766a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }
}
