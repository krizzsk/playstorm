package com.tapjoy.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ba */
public final class C11442ba {
    /* renamed from: a */
    public static String m33242a(File file, Charset charset) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return C11686go.m33921a(new InputStreamReader(fileInputStream, charset)).toString();
        } finally {
            C11687gp.m33922a(fileInputStream);
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m33241a(File file) {
        try {
            return m33242a(file, C11418af.f27664c);
        } catch (IOException unused) {
            return null;
        }
    }
}
