package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5116a;
import com.fyber.inneractive.sdk.protobuf.C5133e;
import com.fyber.inneractive.sdk.protobuf.C5205q;
import com.fyber.inneractive.sdk.protobuf.C5207q0;
import com.fyber.inneractive.sdk.protobuf.C5227t1;
import com.fyber.inneractive.sdk.protobuf.C5239u;
import com.fyber.inneractive.sdk.protobuf.C5252z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5108a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5108a<MessageType, BuilderType>> extends C5116a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C5196n1 unknownFields = C5196n1.f13847f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$b */
    public static class C5109b<T extends GeneratedMessageLite<T, ?>> extends C5122b<T> {

        /* renamed from: a */
        public final T f13690a;

        public C5109b(T t) {
            this.f13690a = t;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c */
    public static final class C5110c implements C5239u.C5240a<C5110c> {

        /* renamed from: a */
        public final C5252z.C5256d<?> f13691a;

        /* renamed from: b */
        public final int f13692b;

        /* renamed from: c */
        public final C5227t1.C5229b f13693c;

        /* renamed from: d */
        public final boolean f13694d;

        /* renamed from: e */
        public final boolean f13695e;

        public C5110c(C5252z.C5256d<?> dVar, int i, C5227t1.C5229b bVar, boolean z, boolean z2) {
            this.f13691a = dVar;
            this.f13692b = i;
            this.f13693c = bVar;
            this.f13694d = z;
            this.f13695e = z2;
        }

        /* renamed from: a */
        public int mo25814a() {
            return this.f13692b;
        }

        /* renamed from: b */
        public boolean mo25816b() {
            return this.f13694d;
        }

        /* renamed from: c */
        public C5227t1.C5229b mo25817c() {
            return this.f13693c;
        }

        public int compareTo(Object obj) {
            return this.f13692b - ((C5110c) obj).f13692b;
        }

        /* renamed from: d */
        public C5227t1.C5234c mo25819d() {
            return this.f13693c.f13918a;
        }

        /* renamed from: e */
        public boolean mo25820e() {
            return this.f13695e;
        }

        /* renamed from: a */
        public C5207q0.C5208a mo25815a(C5207q0.C5208a aVar, C5207q0 q0Var) {
            return ((C5108a) aVar).mo25807a((GeneratedMessageLite) q0Var);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d */
    public static class C5111d<ContainingType extends C5207q0, Type> extends C5197o<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f13696a;

        /* renamed from: b */
        public final Type f13697b;

        /* renamed from: c */
        public final C5207q0 f13698c;

        /* renamed from: d */
        public final C5110c f13699d;

        public C5111d(C5207q0 q0Var, Object obj, C5207q0 q0Var2, C5110c cVar) {
            if (q0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (cVar.mo25817c() == C5227t1.C5229b.MESSAGE && q0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f13696a = q0Var;
                this.f13697b = obj;
                this.f13698c = q0Var2;
                this.f13699d = cVar;
            }
        }

        /* renamed from: a */
        public Object mo25821a(Object obj) {
            C5110c cVar = this.f13699d;
            return cVar.f13693c.f13918a == C5227t1.C5234c.ENUM ? cVar.f13691a.mo26316a(((Integer) obj).intValue()) : obj;
        }

        /* renamed from: b */
        public Object mo25822b(Object obj) {
            return this.f13699d.f13693c.f13918a == C5227t1.C5234c.ENUM ? Integer.valueOf(((C5252z.C5255c) obj).mo24088a()) : obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e */
    public enum C5112e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType, T> C5111d<MessageType, T> checkIsLite(C5197o<MessageType, T> oVar) {
        oVar.getClass();
        return (C5111d) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws C5119a0 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        C5190l1 newUninitializedMessageException = t.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new C5119a0(newUninitializedMessageException.getMessage());
    }

    public static C5252z.C5253a emptyBooleanList() {
        return C5142g.f13753d;
    }

    public static C5252z.C5254b emptyDoubleList() {
        return C5194n.f13842d;
    }

    public static C5252z.C5258f emptyFloatList() {
        return C5246w.f13954d;
    }

    public static C5252z.C5259g emptyIntList() {
        return C5250y.f13960d;
    }

    public static C5252z.C5262i emptyLongList() {
        return C5149h0.f13759d;
    }

    public static <E> C5252z.C5263j<E> emptyProtobufList() {
        return C5129c1.f13731d;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C5196n1.f13847f) {
            this.unknownFields = C5196n1.m16169c();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            Unsafe unsafe = C5212r1.f13862a;
            try {
                t = ((GeneratedMessageLite) C5212r1.f13862a.allocateInstance(cls)).getDefaultInstanceForType();
                if (t != null) {
                    defaultInstanceMap.put(cls, t);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return t;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static C5252z.C5259g mutableCopy(C5252z.C5259g gVar) {
        C5250y yVar = (C5250y) gVar;
        int i = yVar.f13962c;
        return yVar.mo25861b(i == 0 ? 10 : i * 2);
    }

    public static Object newMessageInfo(C5207q0 q0Var, String str, Object[] objArr) {
        return new C5132d1(q0Var, str, objArr);
    }

    public static <ContainingType extends C5207q0, Type> C5111d<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C5207q0 q0Var, C5252z.C5256d<?> dVar, int i, C5227t1.C5229b bVar, boolean z, Class cls) {
        return new C5111d<>(containingtype, Collections.emptyList(), q0Var, new C5110c(dVar, i, bVar, true, z));
    }

    public static <ContainingType extends C5207q0, Type> C5111d<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C5207q0 q0Var, C5252z.C5256d<?> dVar, int i, C5227t1.C5229b bVar, Class cls) {
        return new C5111d<>(containingtype, type, q0Var, new C5110c(dVar, i, bVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws C5119a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C5205q.m16203a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parseFrom(t, C5172j.m15820a(byteBuffer, false), qVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C5119a0.m15528e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T r5, java.io.InputStream r6, com.fyber.inneractive.sdk.protobuf.C5205q r7) throws com.fyber.inneractive.sdk.protobuf.C5119a0 {
        /*
            int r0 = r6.read()     // Catch:{ IOException -> 0x005b }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r5 = 0
            return r5
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x0056
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0051
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x004e
        L_0x003a:
            com.fyber.inneractive.sdk.protobuf.a$a$a r1 = new com.fyber.inneractive.sdk.protobuf.a$a$a
            r1.<init>(r6, r0)
            com.fyber.inneractive.sdk.protobuf.j r6 = com.fyber.inneractive.sdk.protobuf.C5172j.m15819a((java.io.InputStream) r1)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r5 = parsePartialFrom(r5, (com.fyber.inneractive.sdk.protobuf.C5172j) r6, (com.fyber.inneractive.sdk.protobuf.C5205q) r7)
            r7 = 0
            r6.mo26046a((int) r7)     // Catch:{ a0 -> 0x004c }
            return r5
        L_0x004c:
            r5 = move-exception
            throw r5
        L_0x004e:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x0051:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15532i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x0056:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5119a0.m15528e()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r5 = move-exception
            com.fyber.inneractive.sdk.protobuf.a0 r6 = new com.fyber.inneractive.sdk.protobuf.a0
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.parsePartialDelimitedFrom(com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, java.io.InputStream, com.fyber.inneractive.sdk.protobuf.q):com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite");
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5172j jVar, C5205q qVar) throws C5119a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C5112e.NEW_MUTABLE_INSTANCE);
        try {
            C5124b1 b1Var = C5124b1.f13725c;
            b1Var.getClass();
            C5141f1<?> a = b1Var.mo25837a(t2.getClass());
            C5180k kVar = jVar.f13798d;
            if (kVar == null) {
                kVar = new C5180k(jVar);
            }
            a.mo25944a(t2, kVar, qVar);
            a.mo25951c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C5119a0) {
                throw ((C5119a0) e.getCause());
            }
            throw new C5119a0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C5119a0) {
                throw ((C5119a0) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(C5112e.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5108a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C5108a) dynamicMethod(C5112e.NEW_BUILDER);
    }

    public Object dynamicMethod(C5112e eVar, Object obj) {
        return dynamicMethod(eVar, obj, (Object) null);
    }

    public abstract Object dynamicMethod(C5112e eVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5124b1 b1Var = C5124b1.f13725c;
        b1Var.getClass();
        return b1Var.mo25837a(getClass()).mo25950b(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C5251y0<MessageType> getParserForType() {
        return (C5251y0) dynamicMethod(C5112e.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C5124b1 b1Var = C5124b1.f13725c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.mo25837a(getClass()).mo25949b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C5124b1 b1Var = C5124b1.f13725c;
        b1Var.getClass();
        int d = b1Var.mo25837a(getClass()).mo25952d(this);
        this.memoizedHashCode = d;
        return d;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C5124b1 b1Var = C5124b1.f13725c;
        b1Var.getClass();
        b1Var.mo25837a(getClass()).mo25951c(this);
    }

    public void mergeLengthDelimitedField(int i, C5151i iVar) {
        ensureUnknownFieldsInitialized();
        C5196n1 n1Var = this.unknownFields;
        n1Var.mo26194a();
        if (i != 0) {
            n1Var.mo26195a(C5227t1.m16370a(i, 2), (Object) iVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(C5196n1 n1Var) {
        this.unknownFields = C5196n1.m16167a(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C5196n1 n1Var = this.unknownFields;
        n1Var.mo26194a();
        if (i != 0) {
            n1Var.mo26195a(C5227t1.m16370a(i, 0), (Object) Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i, C5172j jVar) throws IOException {
        int i2 = C5227t1.f13895a;
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo26197a(i, jVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C5218s0.m16294a(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C5183l lVar) throws IOException {
        C5124b1 b1Var = C5124b1.f13725c;
        b1Var.getClass();
        C5141f1<?> a = b1Var.mo25837a(getClass());
        C5191m mVar = lVar.f13832a;
        if (mVar == null) {
            mVar = new C5191m(lVar);
        }
        a.mo25945a(this, (C5242u1) mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(C5112e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C5124b1 b1Var = C5124b1.f13725c;
        b1Var.getClass();
        boolean a = b1Var.mo25837a(t.getClass()).mo25948a(t);
        if (z) {
            t.dynamicMethod(C5112e.SET_MEMOIZED_IS_INITIALIZED, a ? t : null);
        }
        return a;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5108a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.mo25812c();
        createBuilder.mo25810a(createBuilder.f13688b, messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(C5112e eVar) {
        return dynamicMethod(eVar, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(C5112e.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C5108a) dynamicMethod(C5112e.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C5108a) dynamicMethod(C5112e.NEW_BUILDER);
        buildertype.mo25812c();
        buildertype.mo25810a(buildertype.f13688b, this);
        return buildertype;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a */
    public static abstract class C5108a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5108a<MessageType, BuilderType>> extends C5116a.C5117a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f13687a;

        /* renamed from: b */
        public MessageType f13688b;

        /* renamed from: c */
        public boolean f13689c = false;

        public C5108a(MessageType messagetype) {
            this.f13687a = messagetype;
            this.f13688b = (GeneratedMessageLite) messagetype.dynamicMethod(C5112e.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: a */
        public final void mo25810a(MessageType messagetype, MessageType messagetype2) {
            C5124b1 b1Var = C5124b1.f13725c;
            b1Var.getClass();
            b1Var.mo25837a(messagetype.getClass()).mo25946a(messagetype, messagetype2);
        }

        /* renamed from: b */
        public MessageType mo25811b() {
            if (this.f13689c) {
                return this.f13688b;
            }
            this.f13688b.makeImmutable();
            this.f13689c = true;
            return this.f13688b;
        }

        /* renamed from: c */
        public final void mo25812c() {
            if (this.f13689c) {
                MessageType messagetype = (GeneratedMessageLite) this.f13688b.dynamicMethod(C5112e.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f13688b;
                C5124b1 b1Var = C5124b1.f13725c;
                b1Var.getClass();
                b1Var.mo25837a(messagetype.getClass()).mo25946a(messagetype, messagetype2);
                this.f13688b = messagetype;
                this.f13689c = false;
            }
        }

        public Object clone() throws CloneNotSupportedException {
            C5108a newBuilderForType = this.f13687a.newBuilderForType();
            newBuilderForType.mo25807a(mo25811b());
            return newBuilderForType;
        }

        public C5207q0 getDefaultInstanceForType() {
            return this.f13687a;
        }

        /* renamed from: a */
        public final MessageType mo25809a() {
            MessageType b = mo25811b();
            if (b.isInitialized()) {
                return b;
            }
            throw new C5190l1();
        }

        /* renamed from: a */
        public BuilderType mo25807a(MessageType messagetype) {
            mo25812c();
            mo25810a(this.f13688b, messagetype);
            return this;
        }

        /* renamed from: a */
        public BuilderType mo25808a(C5172j jVar, C5205q qVar) throws IOException {
            mo25812c();
            try {
                C5124b1 b1Var = C5124b1.f13725c;
                MessageType messagetype = this.f13688b;
                b1Var.getClass();
                C5141f1<?> a = b1Var.mo25837a(messagetype.getClass());
                MessageType messagetype2 = this.f13688b;
                C5180k kVar = jVar.f13798d;
                if (kVar == null) {
                    kVar = new C5180k(jVar);
                }
                a.mo25944a(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static C5252z.C5262i mutableCopy(C5252z.C5262i iVar) {
        C5149h0 h0Var = (C5149h0) iVar;
        int i = h0Var.f13761c;
        return h0Var.mo25861b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws C5119a0 {
        return parseFrom(t, byteBuffer, C5205q.m16203a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5151i iVar) throws C5119a0 {
        return checkMessageInitialized(parseFrom(t, iVar, C5205q.m16203a()));
    }

    public static C5252z.C5258f mutableCopy(C5252z.C5258f fVar) {
        C5246w wVar = (C5246w) fVar;
        int i = wVar.f13956c;
        return wVar.mo25861b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5151i iVar, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, iVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C5205q.m16203a()));
    }

    public static C5252z.C5254b mutableCopy(C5252z.C5254b bVar) {
        C5194n nVar = (C5194n) bVar;
        int i = nVar.f13844c;
        return nVar.mo25861b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }

    public static C5252z.C5253a mutableCopy(C5252z.C5253a aVar) {
        C5142g gVar = (C5142g) aVar;
        int i = gVar.f13755c;
        return gVar.mo25861b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, C5172j.m15819a(inputStream), C5205q.m16203a()));
    }

    public static <E> C5252z.C5263j<E> mutableCopy(C5252z.C5263j<E> jVar) {
        int size = jVar.size();
        return jVar.mo25861b(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, C5172j.m15819a(inputStream), qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5172j jVar) throws C5119a0 {
        return parseFrom(t, jVar, C5205q.m16203a());
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C5211r0 {
        public C5239u<C5110c> extensions = C5239u.m16385b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C5107a {
            public C5107a(ExtendableMessage extendableMessage, boolean z) {
                Iterator<Map.Entry<C5110c, Object>> f = extendableMessage.extensions.mo26288f();
                if (f.hasNext()) {
                    Map.Entry next = f.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(C5172j jVar, C5111d<?, ?> dVar, C5205q qVar, int i) throws IOException {
            parseExtension(jVar, qVar, dVar, C5227t1.m16370a(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(C5151i iVar, C5205q qVar, C5111d<?, ?> dVar) throws IOException {
            C5207q0 q0Var = (C5207q0) this.extensions.mo26277a(dVar.f13699d);
            C5207q0.C5208a builder = q0Var != null ? q0Var.toBuilder() : null;
            if (builder == null) {
                builder = dVar.f13698c.newBuilderForType();
            }
            C5116a.C5117a aVar = (C5116a.C5117a) builder;
            aVar.getClass();
            try {
                C5172j g = iVar.mo25990g();
                ((C5108a) aVar).mo25808a(g, qVar);
                g.mo26046a(0);
                ensureExtensionsAreMutable().mo26281c(dVar.f13699d, dVar.mo25822b(((C5108a) builder).mo25809a()));
            } catch (C5119a0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + aVar.getClass().getName() + " from a " + "ByteString" + " threw an IOException (should never happen).", e2);
            }
        }

        private <MessageType extends C5207q0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, C5172j jVar, C5205q qVar) throws IOException {
            int i = 0;
            C5151i iVar = null;
            C5111d dVar = null;
            while (true) {
                int t = jVar.mo26070t();
                if (t == 0) {
                    break;
                } else if (t == C5227t1.f13897c) {
                    i = jVar.mo26071u();
                    if (i != 0) {
                        dVar = qVar.f13859a.get(new C5205q.C5206a(messagetype, i));
                    }
                } else if (t == C5227t1.f13898d) {
                    if (i == 0 || dVar == null) {
                        iVar = jVar.mo26054e();
                    } else {
                        eagerlyMergeMessageSetExtension(jVar, dVar, qVar, i);
                        iVar = null;
                    }
                } else if (!jVar.mo26055e(t)) {
                    break;
                }
            }
            jVar.mo26046a(C5227t1.f13896b);
            if (iVar != null && i != 0) {
                if (dVar != null) {
                    mergeMessageSetExtensionFromBytes(iVar, qVar, dVar);
                } else {
                    mergeLengthDelimitedField(i, iVar);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.C5172j r6, com.fyber.inneractive.sdk.protobuf.C5205q r7, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5111d<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = com.fyber.inneractive.sdk.protobuf.C5227t1.f13895a
                r0 = r9 & 7
                r1 = 0
                r2 = 1
                if (r8 != 0) goto L_0x0009
                goto L_0x002f
            L_0x0009:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13693c
                int r3 = com.fyber.inneractive.sdk.protobuf.C5239u.m16382a((com.fyber.inneractive.sdk.protobuf.C5227t1.C5229b) r3, (boolean) r1)
                if (r0 != r3) goto L_0x0015
                r0 = r1
                goto L_0x0031
            L_0x0015:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13699d
                boolean r4 = r3.f13694d
                if (r4 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13693c
                boolean r3 = r3.mo26273f()
                if (r3 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13693c
                int r3 = com.fyber.inneractive.sdk.protobuf.C5239u.m16382a((com.fyber.inneractive.sdk.protobuf.C5227t1.C5229b) r3, (boolean) r2)
                if (r0 != r3) goto L_0x002f
                r0 = r2
                goto L_0x0031
            L_0x002f:
                r0 = r1
                r1 = r2
            L_0x0031:
                if (r1 == 0) goto L_0x0038
                boolean r6 = r5.parseUnknownField(r9, r6)
                return r6
            L_0x0038:
                r5.ensureExtensionsAreMutable()
                if (r0 == 0) goto L_0x008d
                int r7 = r6.mo26063m()
                int r7 = r6.mo26052d(r7)
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13693c
                com.fyber.inneractive.sdk.protobuf.t1$b r10 = com.fyber.inneractive.sdk.protobuf.C5227t1.C5229b.ENUM
                if (r9 != r10) goto L_0x006e
            L_0x004d:
                int r9 = r6.mo26045a()
                if (r9 <= 0) goto L_0x0088
                int r9 = r6.mo26057g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r10 = r10.f13691a
                com.fyber.inneractive.sdk.protobuf.z$c r9 = r10.mo26316a(r9)
                if (r9 != 0) goto L_0x0062
                return r2
            L_0x0062:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f13699d
                java.lang.Object r9 = r8.mo25822b(r9)
                r10.mo26278a(r0, (java.lang.Object) r9)
                goto L_0x004d
            L_0x006e:
                int r9 = r6.mo26045a()
                if (r9 <= 0) goto L_0x0088
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13693c
                com.fyber.inneractive.sdk.protobuf.u r10 = com.fyber.inneractive.sdk.protobuf.C5239u.f13934d
                com.fyber.inneractive.sdk.protobuf.t1$d r10 = com.fyber.inneractive.sdk.protobuf.C5227t1.C5235d.LOOSE
                java.lang.Object r9 = com.fyber.inneractive.sdk.protobuf.C5227t1.m16371a(r6, r9, r10)
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f13699d
                r10.mo26278a(r0, (java.lang.Object) r9)
                goto L_0x006e
            L_0x0088:
                r6.mo26050c(r7)
                goto L_0x010c
            L_0x008d:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13693c
                com.fyber.inneractive.sdk.protobuf.t1$c r9 = r9.f13918a
                int r9 = r9.ordinal()
                r0 = 7
                if (r9 == r0) goto L_0x00e0
                r10 = 8
                if (r9 == r10) goto L_0x00ab
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r7 = r7.f13693c
                com.fyber.inneractive.sdk.protobuf.u r9 = com.fyber.inneractive.sdk.protobuf.C5239u.f13934d
                com.fyber.inneractive.sdk.protobuf.t1$d r9 = com.fyber.inneractive.sdk.protobuf.C5227t1.C5235d.LOOSE
                java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5227t1.m16371a(r6, r7, r9)
                goto L_0x00f3
            L_0x00ab:
                r9 = 0
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13699d
                boolean r0 = r10.f13694d
                if (r0 != 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r0 = r5.extensions
                java.lang.Object r10 = r0.mo26277a(r10)
                com.fyber.inneractive.sdk.protobuf.q0 r10 = (com.fyber.inneractive.sdk.protobuf.C5207q0) r10
                if (r10 == 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r10.toBuilder()
            L_0x00c0:
                if (r9 != 0) goto L_0x00c8
                com.fyber.inneractive.sdk.protobuf.q0 r9 = r8.f13698c
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r9.newBuilderForType()
            L_0x00c8:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.t1$b r0 = r10.f13693c
                com.fyber.inneractive.sdk.protobuf.t1$b r1 = com.fyber.inneractive.sdk.protobuf.C5227t1.C5229b.GROUP
                if (r0 != r1) goto L_0x00d6
                int r10 = r10.f13692b
                r6.mo26047a(r10, r9, r7)
                goto L_0x00d9
            L_0x00d6:
                r6.mo26048a((com.fyber.inneractive.sdk.protobuf.C5207q0.C5208a) r9, (com.fyber.inneractive.sdk.protobuf.C5205q) r7)
            L_0x00d9:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a r9 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5108a) r9
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r6 = r9.mo25809a()
                goto L_0x00f3
            L_0x00e0:
                int r6 = r6.mo26057g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13699d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r7 = r7.f13691a
                com.fyber.inneractive.sdk.protobuf.z$c r7 = r7.mo26316a(r6)
                if (r7 != 0) goto L_0x00f2
                r5.mergeVarintField(r10, r6)
                return r2
            L_0x00f2:
                r6 = r7
            L_0x00f3:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13699d
                boolean r9 = r7.f13694d
                if (r9 == 0) goto L_0x0103
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo25822b(r6)
                r9.mo26278a(r7, (java.lang.Object) r6)
                goto L_0x010c
            L_0x0103:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo25822b(r6)
                r9.mo26281c(r7, r6)
            L_0x010c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.j, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, int, int):boolean");
        }

        private void verifyExtensionContainingType(C5111d<MessageType, ?> dVar) {
            if (dVar.f13696a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C5239u<C5110c> ensureExtensionsAreMutable() {
            C5239u<C5110c> uVar = this.extensions;
            if (uVar.f13936b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.mo26286e();
        }

        public int extensionsSerializedSize() {
            return this.extensions.mo26284d();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.mo26280c();
        }

        public /* bridge */ /* synthetic */ C5207q0 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(C5197o<MessageType, Type> oVar) {
            C5111d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            Type a = this.extensions.mo26277a(access$000.f13699d);
            if (a == null) {
                return access$000.f13697b;
            }
            C5110c cVar = access$000.f13699d;
            if (!cVar.f13694d) {
                return access$000.mo25821a(a);
            }
            if (cVar.f13693c.f13918a != C5227t1.C5234c.ENUM) {
                return a;
            }
            Type arrayList = new ArrayList();
            for (Object a2 : (List) a) {
                arrayList.add(access$000.mo25821a(a2));
            }
            return arrayList;
        }

        public final <Type> int getExtensionCount(C5197o<MessageType, List<Type>> oVar) {
            C5111d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5239u<C5110c> uVar = this.extensions;
            C5110c cVar = access$000.f13699d;
            uVar.getClass();
            if (cVar.mo25816b()) {
                Object a = uVar.mo26277a(cVar);
                if (a == null) {
                    return 0;
                }
                return ((List) a).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> boolean hasExtension(C5197o<MessageType, Type> oVar) {
            C5111d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5239u<C5110c> uVar = this.extensions;
            C5110c cVar = access$000.f13699d;
            uVar.getClass();
            if (!cVar.mo25816b()) {
                return uVar.f13935a.get(cVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            C5239u<C5110c> uVar = this.extensions;
            if (uVar.f13936b) {
                this.extensions = uVar.clone();
            }
            this.extensions.mo26279a(messagetype.extensions);
        }

        public /* bridge */ /* synthetic */ C5207q0.C5208a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new C5107a(this, false);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new C5107a(this, true);
        }

        public <MessageType extends C5207q0> boolean parseUnknownField(MessageType messagetype, C5172j jVar, C5205q qVar, int i) throws IOException {
            int i2 = C5227t1.f13895a;
            int i3 = i >>> 3;
            return parseExtension(jVar, qVar, qVar.f13859a.get(new C5205q.C5206a(messagetype, i3)), i, i3);
        }

        public <MessageType extends C5207q0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, C5172j jVar, C5205q qVar, int i) throws IOException {
            if (i == C5227t1.f13895a) {
                mergeMessageSetExtensionFromCodedStream(messagetype, jVar, qVar);
                return true;
            } else if ((i & 7) == 2) {
                return parseUnknownField(messagetype, jVar, qVar, i);
            } else {
                return jVar.mo26055e(i);
            }
        }

        public /* bridge */ /* synthetic */ C5207q0.C5208a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        public final <Type> Type getExtension(C5197o<MessageType, List<Type>> oVar, int i) {
            C5111d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5239u<C5110c> uVar = this.extensions;
            C5110c cVar = access$000.f13699d;
            uVar.getClass();
            if (cVar.mo25816b()) {
                Object a = uVar.mo26277a(cVar);
                if (a != null) {
                    return access$000.mo25821a(((List) a).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5172j jVar, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C5205q qVar) throws C5119a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C5112e.NEW_MUTABLE_INSTANCE);
        try {
            C5124b1 b1Var = C5124b1.f13725c;
            b1Var.getClass();
            C5141f1<?> a = b1Var.mo25837a(t2.getClass());
            a.mo25947a(t2, bArr, i, i + i2, new C5133e.C5134a(qVar));
            a.mo25951c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C5119a0) {
                throw ((C5119a0) e.getCause());
            }
            throw new C5119a0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C5119a0.m15532i();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5172j jVar) throws C5119a0 {
        return parsePartialFrom(t, jVar, C5205q.m16203a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5151i iVar, C5205q qVar) throws C5119a0 {
        try {
            C5172j g = iVar.mo25990g();
            T parsePartialFrom = parsePartialFrom(t, g, qVar);
            g.mo26046a(0);
            return parsePartialFrom;
        } catch (C5119a0 e) {
            throw e;
        } catch (C5119a0 e2) {
            throw e2;
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, C5205q qVar) throws C5119a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }
}
