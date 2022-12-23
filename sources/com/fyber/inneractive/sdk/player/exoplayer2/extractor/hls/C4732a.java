package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4999i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a */
public final class C4732a implements C4996g {

    /* renamed from: a */
    public final C4996g f11937a;

    /* renamed from: b */
    public final byte[] f11938b;

    /* renamed from: c */
    public final byte[] f11939c;

    /* renamed from: d */
    public CipherInputStream f11940d;

    public C4732a(C4996g gVar, byte[] bArr, byte[] bArr2) {
        this.f11937a = gVar;
        this.f11938b = bArr;
        this.f11939c = bArr2;
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f11938b, "AES"), new IvParameterSpec(this.f11939c));
                this.f11940d = new CipherInputStream(new C4999i(this.f11937a, jVar), instance);
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void close() throws IOException {
        this.f11940d = null;
        this.f11937a.close();
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws IOException {
        C5023a.m15304b(this.f11940d != null);
        int read = this.f11940d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f11937a.mo24832a();
    }
}
