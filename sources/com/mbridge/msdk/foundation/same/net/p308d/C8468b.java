package com.mbridge.msdk.foundation.same.net.p308d;

import com.mbridge.msdk.foundation.same.net.C8476e;
import com.mbridge.msdk.foundation.same.net.C8480f;
import com.mbridge.msdk.foundation.same.net.C8498i;
import com.mbridge.msdk.foundation.same.net.C8499j;
import com.mbridge.msdk.foundation.same.net.C8501k;
import com.mbridge.msdk.foundation.same.net.p305a.C8452a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.b */
/* compiled from: FileDownloader */
public final class C8468b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8499j f20468a;

    /* renamed from: b */
    private int f20469b;

    /* renamed from: c */
    private LinkedList<C8470a> f20470c = new LinkedList<>();

    public C8468b(C8499j jVar, int i) {
        this.f20468a = jVar;
        this.f20469b = i;
    }

    /* renamed from: a */
    public final C8470a mo57574a(File file, String str, C8476e<Void> eVar) {
        C8470a aVar = new C8470a(file, str, eVar);
        synchronized (this) {
            this.f20470c.add(aVar);
        }
        m24437a();
        return aVar;
    }

    /* renamed from: a */
    private void m24437a() {
        synchronized (this) {
            int i = 0;
            Iterator it = this.f20470c.iterator();
            while (it.hasNext()) {
                if (((C8470a) it.next()).mo57575a()) {
                    i++;
                }
            }
            if (i < this.f20469b) {
                Iterator it2 = this.f20470c.iterator();
                while (it2.hasNext()) {
                    if (C8470a.m24441a((C8470a) it2.next()) && (i = i + 1) == this.f20469b) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d.b$a */
    /* compiled from: FileDownloader */
    public class C8470a {

        /* renamed from: b */
        private String f20472b;

        /* renamed from: c */
        private File f20473c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C8476e<Void> f20474d;

        /* renamed from: e */
        private C8467a f20475e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f20476f;

        private C8470a(File file, String str, C8476e<Void> eVar) {
            this.f20473c = file;
            this.f20474d = eVar;
            this.f20472b = str;
        }

        /* renamed from: a */
        public final boolean mo57575a() {
            return this.f20476f == 1;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m24441a(C8470a aVar) {
            if (aVar.f20476f != 0) {
                return false;
            }
            C8468b bVar = C8468b.this;
            C8467a aVar2 = new C8467a(aVar.f20473c, aVar.f20472b);
            aVar.f20475e = aVar2;
            aVar2.mo57616a(new C8480f<Void>() {

                /* renamed from: a */
                boolean f20477a;

                /* renamed from: a */
                public final void mo57576a() {
                    C8470a.this.f20474d.mo57576a();
                }

                /* renamed from: b */
                public final void mo57521b() {
                    if (!this.f20477a) {
                        int unused = C8470a.this.f20476f = 3;
                        C8470a.this.f20474d.mo57521b();
                        C8468b.m24438a(C8468b.this, C8470a.this);
                    }
                }

                /* renamed from: a */
                public final void mo57520a(C8501k kVar) {
                    if (!this.f20477a) {
                        C8470a.this.f20474d.mo57520a(kVar);
                    }
                }

                /* renamed from: a */
                public final void mo57519a(C8452a aVar) {
                    if (!this.f20477a) {
                        C8470a.this.f20474d.mo57519a(aVar);
                    }
                }

                /* renamed from: c */
                public final void mo57577c() {
                    C8470a.this.f20474d.mo57577c();
                    this.f20477a = true;
                }

                /* renamed from: a */
                public final void mo57518a(long j, long j2) {
                    C8470a.this.f20474d.mo57518a(j, j2);
                }
            });
            aVar.f20476f = 1;
            C8468b.this.f20468a.mo57638a((C8498i) aVar.f20475e);
            return true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m24438a(C8468b bVar, C8470a aVar) {
        synchronized (bVar) {
            bVar.f20470c.remove(aVar);
        }
        bVar.m24437a();
    }
}
