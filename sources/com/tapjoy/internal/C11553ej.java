package com.tapjoy.internal;

import com.tapjoy.internal.C11553ej;
import com.tapjoy.internal.C11553ej.C11554a;
import java.io.IOException;
import java.io.Serializable;

/* renamed from: com.tapjoy.internal.ej */
public abstract class C11553ej<M extends C11553ej<M, B>, B extends C11554a<M, B>> implements Serializable {

    /* renamed from: a */
    transient int f27948a = 0;

    /* renamed from: b */
    protected transient int f27949b = 0;

    /* renamed from: c */
    private final transient C11556el<M> f27950c;

    /* renamed from: d */
    private final transient C11804je f27951d;

    protected C11553ej(C11556el<M> elVar, C11804je jeVar) {
        if (elVar == null) {
            throw new NullPointerException("adapter == null");
        } else if (jeVar != null) {
            this.f27950c = elVar;
            this.f27951d = jeVar;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }

    /* renamed from: a */
    public final C11804je mo72347a() {
        C11804je jeVar = this.f27951d;
        if (jeVar != null) {
            return jeVar;
        }
        return C11804je.f28817b;
    }

    public String toString() {
        return C11556el.m33504c(this);
    }

    /* renamed from: com.tapjoy.internal.ej$a */
    public static abstract class C11554a<T extends C11553ej<T, B>, B extends C11554a<T, B>> {

        /* renamed from: a */
        C11801jb f27952a;

        /* renamed from: b */
        C11573en f27953b;

        protected C11554a() {
        }

        /* renamed from: a */
        public final C11554a<T, B> mo72350a(C11804je jeVar) {
            if (jeVar.mo72783c() > 0) {
                if (this.f27953b == null) {
                    this.f27952a = new C11801jb();
                    this.f27953b = new C11573en(this.f27952a);
                }
                try {
                    this.f27953b.mo72367a(jeVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C11554a<T, B> mo72349a(int i, C11551ei eiVar, Object obj) {
            if (this.f27953b == null) {
                this.f27952a = new C11801jb();
                this.f27953b = new C11573en(this.f27952a);
            }
            try {
                eiVar.mo72346a().mo72356a(this.f27953b, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final C11804je mo72351a() {
            C11801jb jbVar = this.f27952a;
            return jbVar != null ? new C11804je(jbVar.clone().mo72773h()) : C11804je.f28817b;
        }
    }
}
