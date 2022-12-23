package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b */
public interface C4679b {

    /* renamed from: a */
    public static final ByteBuffer f11704a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.b$a */
    public static final class C4680a extends Exception {
        public C4680a(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: a */
    ByteBuffer mo25061a();

    /* renamed from: a */
    void mo25062a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo25063a(int i, int i2, int i3) throws C4680a;

    /* renamed from: b */
    boolean mo25064b();

    /* renamed from: c */
    void mo25065c();

    /* renamed from: d */
    boolean mo25066d();

    /* renamed from: e */
    int mo25067e();

    /* renamed from: f */
    int mo25068f();

    void flush();

    /* renamed from: g */
    void mo25070g();
}
