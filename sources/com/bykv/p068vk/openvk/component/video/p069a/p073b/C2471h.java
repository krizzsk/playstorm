package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.h */
/* compiled from: RandomAccessFileWrapper */
class C2471h {

    /* renamed from: a */
    private final RandomAccessFile f5256a;

    C2471h(File file, String str) throws C2472a {
        try {
            this.f5256a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C2472a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16208a(long j) throws C2472a {
        try {
            this.f5256a.seek(j);
        } catch (IOException e) {
            throw new C2472a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16209a(byte[] bArr, int i, int i2) throws C2472a {
        try {
            this.f5256a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C2472a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo16206a(byte[] bArr) throws C2472a {
        try {
            return this.f5256a.read(bArr);
        } catch (IOException e) {
            throw new C2472a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16207a() {
        C2482a.m6057a(this.f5256a);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.h$a */
    /* compiled from: RandomAccessFileWrapper */
    static class C2472a extends Exception {
        C2472a(Throwable th) {
            super(th);
        }
    }
}
