package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.j */
public final class C5000j {

    /* renamed from: a */
    public final Uri f13327a;

    /* renamed from: b */
    public final byte[] f13328b;

    /* renamed from: c */
    public final long f13329c;

    /* renamed from: d */
    public final long f13330d;

    /* renamed from: e */
    public final long f13331e;

    /* renamed from: f */
    public final String f13332f;

    /* renamed from: g */
    public final int f13333g;

    public C5000j(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: a */
    public boolean mo25553a(int i) {
        return (this.f13333g & i) == i;
    }

    public String toString() {
        return "DataSpec[" + this.f13327a + ", " + Arrays.toString(this.f13328b) + ", " + this.f13329c + ", " + this.f13330d + ", " + this.f13331e + ", " + this.f13332f + ", " + this.f13333g + "]";
    }

    public C5000j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, (String) null, i);
    }

    public C5000j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C5000j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C5023a.m15302a(j >= 0);
        C5023a.m15302a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C5023a.m15302a(z);
        this.f13327a = uri;
        this.f13328b = null;
        this.f13329c = j;
        this.f13330d = j2;
        this.f13331e = j3;
        this.f13332f = str;
        this.f13333g = i;
    }
}
