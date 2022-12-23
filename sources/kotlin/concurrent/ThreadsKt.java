package kotlin.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75041d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a3\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, mo75042d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, mo75043k = 2, mo75044mv = {1, 5, 1})
/* compiled from: Thread.kt */
public final class ThreadsKt {
    public static /* synthetic */ Thread thread$default(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        if ((i2 & 4) != 0) {
            classLoader = null;
        }
        ClassLoader classLoader2 = classLoader;
        if ((i2 & 8) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return thread(z3, z4, classLoader2, str2, i, function0);
    }

    public static final Thread thread(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        ThreadsKt$thread$thread$1 threadsKt$thread$thread$1 = new ThreadsKt$thread$thread$1(function0);
        if (z2) {
            threadsKt$thread$thread$1.setDaemon(true);
        }
        if (i > 0) {
            threadsKt$thread$thread$1.setPriority(i);
        }
        if (str != null) {
            threadsKt$thread$thread$1.setName(str);
        }
        if (classLoader != null) {
            threadsKt$thread$thread$1.setContextClassLoader(classLoader);
        }
        if (z) {
            threadsKt$thread$thread$1.start();
        }
        return threadsKt$thread$thread$1;
    }

    private static final <T> T getOrSet(ThreadLocal<T> threadLocal, Function0<? extends T> function0) {
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T invoke = function0.invoke();
        threadLocal.set(invoke);
        return invoke;
    }
}
