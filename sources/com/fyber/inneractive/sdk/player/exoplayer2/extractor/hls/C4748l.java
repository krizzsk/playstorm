package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.text.C4950a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C4952a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C4953b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l */
public final class C4748l implements C4723f {

    /* renamed from: g */
    public static final Pattern f12038g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f12039h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f12040a;

    /* renamed from: b */
    public final C5046r f12041b;

    /* renamed from: c */
    public final C5036k f12042c = new C5036k();

    /* renamed from: d */
    public C4731h f12043d;

    /* renamed from: e */
    public byte[] f12044e = new byte[1024];

    /* renamed from: f */
    public int f12045f;

    public C4748l(String str, C5046r rVar) {
        this.f12040a = str;
        this.f12041b = rVar;
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12043d = hVar;
        hVar.mo25174a(new C4767m.C4768a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public int mo25163a(C4730g gVar, C4766l lVar) throws IOException, InterruptedException {
        Matcher matcher;
        String d;
        int i;
        C4715b bVar = (C4715b) gVar;
        int i2 = (int) bVar.f11870b;
        int i3 = this.f12045f;
        byte[] bArr = this.f12044e;
        if (i3 == bArr.length) {
            if (i2 != -1) {
                i = i2;
            } else {
                i = bArr.length;
            }
            this.f12044e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f12044e;
        int i4 = this.f12045f;
        int a = bVar.mo25132a(bArr2, i4, bArr2.length - i4);
        if (a != -1) {
            int i5 = this.f12045f + a;
            this.f12045f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        C5036k kVar = new C5036k(this.f12044e);
        try {
            Pattern pattern = C4953b.f13202a;
            String d2 = kVar.mo25597d();
            if (d2 == null || !C4953b.f13203b.matcher(d2).matches()) {
                throw new C4950a("Expected WEBVTT. Got " + d2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                String d3 = kVar.mo25597d();
                if (TextUtils.isEmpty(d3)) {
                    while (true) {
                        String d4 = kVar.mo25597d();
                        if (d4 == null) {
                            matcher = null;
                            break;
                        } else if (C4953b.f13202a.matcher(d4).matches()) {
                            do {
                                d = kVar.mo25597d();
                                if (d == null) {
                                    break;
                                }
                            } while (d.isEmpty());
                        } else {
                            matcher = C4952a.f13201a.matcher(d4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        mo25225a(0);
                    } else {
                        long a2 = C4953b.m15154a(matcher.group(1));
                        long a3 = this.f12041b.mo25634a((j2 + a2) - j);
                        C4804n a4 = mo25225a(a3 - a2);
                        this.f12042c.mo25591a(this.f12044e, this.f12045f);
                        a4.mo25150a(this.f12042c, this.f12045f);
                        a4.mo25147a(a3, 1, this.f12045f, 0, (byte[]) null);
                    }
                    return -1;
                } else if (d3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f12038g.matcher(d3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f12039h.matcher(d3);
                        if (matcher3.find()) {
                            j = C4953b.m15154a(matcher2.group(1));
                            j2 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new C4873l("X-TIMESTAMP-MAP doesn't contain media timestamp: " + d3);
                        }
                    } else {
                        throw new C4873l("X-TIMESTAMP-MAP doesn't contain local timestamp: " + d3);
                    }
                }
            }
        } catch (C4950a e) {
            throw new C4873l((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C4804n mo25225a(long j) {
        C4804n a = this.f12043d.mo25173a(0, 3);
        a.mo25149a(C4869i.m14976a((String) null, "text/vtt", (String) null, -1, 0, this.f12040a, -1, (C4702a) null, j, Collections.emptyList()));
        this.f12043d.mo25175c();
        return a;
    }
}
