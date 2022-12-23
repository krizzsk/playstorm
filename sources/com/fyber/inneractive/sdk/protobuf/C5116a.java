package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5116a;
import com.fyber.inneractive.sdk.protobuf.C5116a.C5117a;
import com.fyber.inneractive.sdk.protobuf.C5151i;
import com.fyber.inneractive.sdk.protobuf.C5183l;
import com.fyber.inneractive.sdk.protobuf.C5207q0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a */
public abstract class C5116a<MessageType extends C5116a<MessageType, BuilderType>, BuilderType extends C5117a<MessageType, BuilderType>> implements C5207q0 {
    public int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C5117a.m15523a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(C5151i iVar) throws IllegalArgumentException {
        if (!iVar.mo25987e()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C5141f1 f1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int b = f1Var.mo25949b(this);
        setMemoizedSerializedSize(b);
        return b;
    }

    public C5190l1 newUninitializedMessageException() {
        return new C5190l1();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = C5183l.f13830b;
            C5183l.C5186c cVar = new C5183l.C5186c(bArr, 0, serializedSize);
            writeTo(cVar);
            if (cVar.mo26116a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C5151i toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C5151i iVar = C5151i.f13766b;
            byte[] bArr = new byte[serializedSize];
            C5183l a = C5183l.m16033a(bArr);
            writeTo(a);
            if (a.mo26116a() == 0) {
                return new C5151i.C5159h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int c = C5183l.m16038c(serializedSize) + serializedSize;
        if (c > 4096) {
            c = 4096;
        }
        C5183l.C5188e eVar = new C5183l.C5188e(outputStream, c);
        eVar.mo26130g(serializedSize);
        writeTo(eVar);
        if (eVar.f13835f > 0) {
            eVar.mo26144b();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = C5183l.f13830b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C5183l.C5188e eVar = new C5183l.C5188e(outputStream, serializedSize);
        writeTo(eVar);
        if (eVar.f13835f > 0) {
            eVar.mo26144b();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C5117a.m15523a(iterable, list);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a */
    public static abstract class C5117a<MessageType extends C5116a<MessageType, BuilderType>, BuilderType extends C5117a<MessageType, BuilderType>> implements C5207q0.C5208a {
        /* renamed from: a */
        public static <T> void m15523a(Iterable<T> iterable, List<? super T> list) {
            Charset charset = C5252z.f13963a;
            iterable.getClass();
            if (iterable instanceof C5140f0) {
                List<?> c = ((C5140f0) iterable).mo25876c();
                C5140f0 f0Var = (C5140f0) list;
                int size = list.size();
                for (Object next : c) {
                    if (next == null) {
                        String str = "Element at index " + (f0Var.size() - size) + " is null.";
                        for (int size2 = f0Var.size() - 1; size2 >= size; size2--) {
                            f0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C5151i) {
                        f0Var.mo25874a((C5151i) next);
                    } else {
                        f0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C5264z0) {
                list.addAll((Collection) iterable);
            } else {
                if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
                }
                int size3 = list.size();
                for (T next2 : iterable) {
                    if (next2 == null) {
                        String str2 = "Element at index " + (list.size() - size3) + " is null.";
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(str2);
                    }
                    list.add(next2);
                }
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a$a */
        public static final class C5118a extends FilterInputStream {

            /* renamed from: a */
            public int f13708a;

            public C5118a(InputStream inputStream, int i) {
                super(inputStream);
                this.f13708a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f13708a);
            }

            public int read() throws IOException {
                if (this.f13708a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f13708a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f13708a));
                if (skip >= 0) {
                    this.f13708a = (int) (((long) this.f13708a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f13708a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f13708a -= read;
                }
                return read;
            }
        }
    }
}
