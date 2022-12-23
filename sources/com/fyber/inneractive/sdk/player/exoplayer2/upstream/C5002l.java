package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5041p;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.l */
public final class C5002l implements C4970a0<Object> {

    /* renamed from: a */
    public final C5041p f13342a;

    /* renamed from: b */
    public int f13343b;

    /* renamed from: c */
    public long f13344c;

    /* renamed from: d */
    public long f13345d;

    /* renamed from: e */
    public long f13346e;

    /* renamed from: f */
    public long f13347f;

    /* renamed from: g */
    public long f13348g;

    public C5002l(Handler handler, C4991d dVar) {
        this((Handler) null, (C4991d) null, 2000);
    }

    /* renamed from: a */
    public synchronized void mo25559a(Object obj, C5000j jVar) {
        if (this.f13343b == 0) {
            this.f13344c = SystemClock.elapsedRealtime();
        }
        this.f13343b++;
    }

    public C5002l(Handler handler, C4991d dVar, int i) {
        this.f13342a = new C5041p(i);
        this.f13348g = -1;
    }

    /* renamed from: a */
    public synchronized void mo25558a(Object obj) {
        C5041p.C5044c cVar;
        float f;
        int i = 0;
        C5023a.m15304b(this.f13343b > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.f13344c);
        long j = (long) i2;
        this.f13346e += j;
        long j2 = this.f13347f;
        long j3 = this.f13345d;
        this.f13347f = j2 + j3;
        if (i2 > 0) {
            float f2 = (float) ((RtspMediaSource.DEFAULT_TIMEOUT_MS * j3) / j);
            C5041p pVar = this.f13342a;
            int sqrt = (int) Math.sqrt((double) j3);
            if (pVar.f13457d != 1) {
                Collections.sort(pVar.f13455b, C5041p.f13452h);
                pVar.f13457d = 1;
            }
            int i3 = pVar.f13460g;
            if (i3 > 0) {
                C5041p.C5044c[] cVarArr = pVar.f13456c;
                int i4 = i3 - 1;
                pVar.f13460g = i4;
                cVar = cVarArr[i4];
            } else {
                cVar = new C5041p.C5044c();
            }
            int i5 = pVar.f13458e;
            pVar.f13458e = i5 + 1;
            cVar.f13461a = i5;
            cVar.f13462b = sqrt;
            cVar.f13463c = f2;
            pVar.f13455b.add(cVar);
            pVar.f13459f += sqrt;
            while (true) {
                int i6 = pVar.f13459f;
                int i7 = pVar.f13454a;
                if (i6 <= i7) {
                    break;
                }
                int i8 = i6 - i7;
                C5041p.C5044c cVar2 = pVar.f13455b.get(0);
                int i9 = cVar2.f13462b;
                if (i9 <= i8) {
                    pVar.f13459f -= i9;
                    pVar.f13455b.remove(0);
                    int i10 = pVar.f13460g;
                    if (i10 < 5) {
                        C5041p.C5044c[] cVarArr2 = pVar.f13456c;
                        pVar.f13460g = i10 + 1;
                        cVarArr2[i10] = cVar2;
                    }
                } else {
                    cVar2.f13462b = i9 - i8;
                    pVar.f13459f -= i8;
                }
            }
            if (this.f13346e >= 2000 || this.f13347f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                C5041p pVar2 = this.f13342a;
                if (pVar2.f13457d != 0) {
                    Collections.sort(pVar2.f13455b, C5041p.f13453i);
                    pVar2.f13457d = 0;
                }
                float f3 = 0.5f * ((float) pVar2.f13459f);
                int i11 = 0;
                while (true) {
                    if (i < pVar2.f13455b.size()) {
                        C5041p.C5044c cVar3 = pVar2.f13455b.get(i);
                        i11 += cVar3.f13462b;
                        if (((float) i11) >= f3) {
                            f = cVar3.f13463c;
                            break;
                        }
                        i++;
                    } else if (pVar2.f13455b.isEmpty()) {
                        f = Float.NaN;
                    } else {
                        ArrayList<C5041p.C5044c> arrayList = pVar2.f13455b;
                        f = arrayList.get(arrayList.size() - 1).f13463c;
                    }
                }
                this.f13348g = Float.isNaN(f) ? -1 : (long) f;
            }
        }
        int i12 = this.f13343b - 1;
        this.f13343b = i12;
        if (i12 > 0) {
            this.f13344c = elapsedRealtime;
        }
        this.f13345d = 0;
    }
}
