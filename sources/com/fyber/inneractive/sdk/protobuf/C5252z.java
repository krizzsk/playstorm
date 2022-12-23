package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.protobuf.C5116a;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.google.android.exoplayer2.C5487C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z */
public final class C5252z {

    /* renamed from: a */
    public static final Charset f13963a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f13964b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$a */
    public interface C5253a extends C5263j<Boolean> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$b */
    public interface C5254b extends C5263j<Double> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$c */
    public interface C5255c {
        /* renamed from: a */
        int mo24088a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$d */
    public interface C5256d<T extends C5255c> {
        /* renamed from: a */
        T mo26316a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$e */
    public interface C5257e {
        /* renamed from: a */
        boolean mo26317a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$f */
    public interface C5258f extends C5263j<Float> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$g */
    public interface C5259g extends C5263j<Integer> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h */
    public static class C5260h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<F> f13965a;

        /* renamed from: b */
        public final C5261a<F, T> f13966b;

        /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h$a */
        public interface C5261a<F, T> {
        }

        public C5260h(List<F> list, C5261a<F, T> aVar) {
            this.f13965a = list;
            this.f13966b = aVar;
        }

        public T get(int i) {
            C5261a<F, T> aVar = this.f13966b;
            F f = this.f13965a.get(i);
            ((TokenParametersOuterClass$TokenParameters.C4195a) aVar).getClass();
            T a = TokenParametersOuterClass$TokenParameters.C4205k.m13364a(((Integer) f).intValue());
            return a == null ? TokenParametersOuterClass$TokenParameters.C4205k.UNRECOGNIZED : a;
        }

        public int size() {
            return this.f13965a.size();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$i */
    public interface C5262i extends C5263j<Long> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$j */
    public interface C5263j<E> extends List<E>, RandomAccess {
        /* renamed from: b */
        C5263j<E> mo25861b(int i);

        /* renamed from: b */
        void mo25841b();

        /* renamed from: d */
        boolean mo25843d();
    }

    static {
        Charset.forName(C5487C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f13964b = bArr;
        ByteBuffer.wrap(bArr);
        C5172j.m15821a(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m16432a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m16433a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static <T> T m16435a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static Object m16434a(Object obj, Object obj2) {
        C5207q0 q0Var = (C5207q0) obj2;
        C5116a.C5117a aVar = (C5116a.C5117a) ((C5207q0) obj).toBuilder();
        aVar.getClass();
        GeneratedMessageLite.C5108a aVar2 = (GeneratedMessageLite.C5108a) aVar;
        if (aVar2.f13687a.getClass().isInstance(q0Var)) {
            aVar2.mo25812c();
            aVar2.mo25810a(aVar2.f13688b, (GeneratedMessageLite) ((C5116a) q0Var));
            return aVar2.mo25811b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
