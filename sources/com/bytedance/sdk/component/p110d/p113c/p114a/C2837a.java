package com.bytedance.sdk.component.p110d.p113c.p114a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.p110d.C2829b;
import java.io.File;

/* renamed from: com.bytedance.sdk.component.d.c.a.a */
/* compiled from: CacheConfig */
public class C2837a implements C2829b, Cloneable {

    /* renamed from: f */
    private static volatile C2829b f6381f;

    /* renamed from: a */
    private long f6382a;

    /* renamed from: b */
    private int f6383b;

    /* renamed from: c */
    private boolean f6384c;

    /* renamed from: d */
    private boolean f6385d;

    /* renamed from: e */
    private File f6386e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2837a(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public C2837a(int i, long j, boolean z, boolean z2, File file) {
        this.f6382a = j;
        this.f6383b = i;
        this.f6384c = z;
        this.f6385d = z2;
        this.f6386e = file;
    }

    /* renamed from: a */
    public long mo17605a() {
        return this.f6382a;
    }

    /* renamed from: b */
    public int mo17606b() {
        return this.f6383b;
    }

    /* renamed from: c */
    public boolean mo17607c() {
        return this.f6384c;
    }

    /* renamed from: d */
    public boolean mo17608d() {
        return this.f6385d;
    }

    /* renamed from: e */
    public File mo17609e() {
        return this.f6386e;
    }

    /* renamed from: a */
    public static void m7816a(Context context, C2829b bVar) {
        if (bVar != null) {
            f6381f = bVar;
        } else {
            f6381f = m7815a(new File(context.getCacheDir(), "image"));
        }
    }

    /* renamed from: a */
    public static C2829b m7815a(File file) {
        long j;
        int i;
        file.mkdirs();
        if (f6381f == null) {
            i = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            j = Math.min(m7818g() / 16, 41943040);
        } else {
            i = Math.min(f6381f.mo17606b() / 2, 31457280);
            j = Math.min(f6381f.mo17605a() / 2, 41943040);
        }
        return new C2837a(Math.max(i, 26214400), Math.max(j, 20971520), file);
    }

    /* renamed from: f */
    public static C2829b m7817f() {
        return f6381f;
    }

    /* renamed from: g */
    private static long m7818g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
