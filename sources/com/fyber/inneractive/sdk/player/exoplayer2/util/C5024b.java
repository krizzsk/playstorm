package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b */
public final class C5024b {

    /* renamed from: a */
    public final File f13409a;

    /* renamed from: b */
    public final File f13410b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b$a */
    public static final class C5025a extends OutputStream {

        /* renamed from: a */
        public final FileOutputStream f13411a;

        /* renamed from: b */
        public boolean f13412b = false;

        public C5025a(File file) throws FileNotFoundException {
            this.f13411a = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f13412b) {
                this.f13412b = true;
                this.f13411a.flush();
                try {
                    this.f13411a.getFD().sync();
                } catch (IOException e) {
                    Log.w("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f13411a.close();
            }
        }

        public void flush() throws IOException {
            this.f13411a.flush();
        }

        public void write(int i) throws IOException {
            this.f13411a.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f13411a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f13411a.write(bArr, i, i2);
        }
    }

    public C5024b(File file) {
        this.f13409a = file;
        this.f13410b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public InputStream mo25574a() throws FileNotFoundException {
        if (this.f13410b.exists()) {
            this.f13409a.delete();
            this.f13410b.renameTo(this.f13409a);
        }
        return new FileInputStream(this.f13409a);
    }

    /* renamed from: b */
    public OutputStream mo25575b() throws IOException {
        if (this.f13409a.exists()) {
            if (this.f13410b.exists()) {
                this.f13409a.delete();
            } else if (!this.f13409a.renameTo(this.f13410b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f13409a + " to backup file " + this.f13410b);
            }
        }
        try {
            return new C5025a(this.f13409a);
        } catch (FileNotFoundException unused) {
            if (this.f13409a.getParentFile().mkdirs()) {
                try {
                    return new C5025a(this.f13409a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f13409a);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.f13409a);
            }
        }
    }
}
