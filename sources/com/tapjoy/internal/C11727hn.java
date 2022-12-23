package com.tapjoy.internal;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.hn */
public final class C11727hn {

    /* renamed from: a */
    private final File f28528a;

    public C11727hn(File file) {
        this.f28528a = file;
    }

    /* renamed from: a */
    public final synchronized boolean mo72658a() {
        FileOutputStream fileOutputStream;
        if (mo72659b() != null) {
            return false;
        }
        try {
            File file = this.f28528a;
            String uuid = UUID.randomUUID().toString();
            fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, C11418af.f27664c);
            outputStreamWriter.write(uuid);
            outputStreamWriter.flush();
            C11687gp.m33922a(fileOutputStream);
            if (mo72659b() != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            try {
                this.f28528a.delete();
                throw e;
            } catch (IOException unused) {
                return false;
            }
        } catch (Throwable th) {
            C11687gp.m33922a(fileOutputStream);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: b */
    public final String mo72659b() {
        if (!this.f28528a.exists()) {
            return null;
        }
        try {
            String a = C11442ba.m33242a(this.f28528a, C11418af.f27664c);
            if (a.length() > 0) {
                return a;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }
}
