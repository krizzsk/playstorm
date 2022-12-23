package com.bytedance.sdk.openadsdk.p129a;

import com.bytedance.sdk.component.utils.C2964f;
import com.bytedance.sdk.component.utils.C2975l;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.a.a */
/* compiled from: LruDiskFile */
public abstract class C3016a {

    /* renamed from: a */
    private final ExecutorService f6923a = Executors.newSingleThreadExecutor();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18366a(List<File> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18367a(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18368a(File file, long j, int i);

    /* renamed from: a */
    public void mo18365a(File file) throws IOException {
        this.f6923a.submit(new C3018a(file));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8561b(File file) throws IOException {
        try {
            C2964f.m8358b(file);
        } catch (Throwable th) {
            C2975l.m8379a("LruDiskFile", "setLastModifiedNowError", th);
        }
        mo18366a(C2964f.m8356a(file.getParentFile()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo18369b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.a.a$a */
    /* compiled from: LruDiskFile */
    private class C3018a implements Callable<Void> {

        /* renamed from: b */
        private final File f6925b;

        private C3018a(File file) {
            this.f6925b = file;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            C3016a.this.m8561b(this.f6925b);
            return null;
        }
    }
}
