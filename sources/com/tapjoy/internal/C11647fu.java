package com.tapjoy.internal;

import java.util.Observable;

/* renamed from: com.tapjoy.internal.fu */
public final class C11647fu {

    /* renamed from: a */
    public static final C11648a f28324a = new C11648a();

    /* renamed from: b */
    public static final C11648a f28325b = new C11648a();

    /* renamed from: c */
    public static final C11648a f28326c = new C11648a();

    /* renamed from: d */
    public static final C11648a f28327d = new C11648a();

    /* renamed from: e */
    public static final C11648a f28328e = new C11648a();

    /* renamed from: com.tapjoy.internal.fu$a */
    public static class C11648a extends Observable {
        public final void notifyObservers() {
            setChanged();
            super.notifyObservers();
        }

        public final void notifyObservers(Object obj) {
            setChanged();
            super.notifyObservers(obj);
        }
    }
}
