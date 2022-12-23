package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a */
public final class C4805a implements C4812f {

    /* renamed from: a */
    public final C4811e f12535a = new C4811e();

    /* renamed from: b */
    public final long f12536b;

    /* renamed from: c */
    public final long f12537c;

    /* renamed from: d */
    public final C4814h f12538d;

    /* renamed from: e */
    public int f12539e;

    /* renamed from: f */
    public long f12540f;

    /* renamed from: g */
    public long f12541g;

    /* renamed from: h */
    public long f12542h;

    /* renamed from: i */
    public long f12543i;

    /* renamed from: j */
    public long f12544j;

    /* renamed from: k */
    public long f12545k;

    /* renamed from: l */
    public long f12546l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a$a */
    public class C4806a implements C4767m {
        public C4806a() {
        }

        /* renamed from: a */
        public long mo25129a(long j) {
            if (j == 0) {
                return C4805a.this.f12536b;
            }
            C4805a aVar = C4805a.this;
            long j2 = aVar.f12536b;
            long j3 = aVar.f12537c;
            long j4 = (((((((long) aVar.f12538d.f12580i) * j) / 1000000) * (j3 - j2)) / aVar.f12540f) - 30000) + j2;
            if (j4 >= j2) {
                j2 = j4;
            }
            return j2 >= j3 ? j3 - 1 : j2;
        }

        /* renamed from: a */
        public boolean mo25130a() {
            return true;
        }

        /* renamed from: c */
        public long mo25131c() {
            C4805a aVar = C4805a.this;
            return (aVar.f12540f * 1000000) / ((long) aVar.f12538d.f12580i);
        }
    }

    public C4805a(long j, long j2, C4814h hVar, int i, long j3) {
        C5023a.m15302a(j >= 0 && j2 > j);
        this.f12538d = hVar;
        this.f12536b = j;
        this.f12537c = j2;
        if (((long) i) == j2 - j) {
            this.f12540f = j3;
            this.f12539e = 3;
            return;
        }
        this.f12539e = 0;
    }

    /* renamed from: a */
    public long mo25276a(C4730g gVar) throws IOException, InterruptedException {
        C4811e eVar;
        int i;
        long j;
        long j2;
        C4730g gVar2 = gVar;
        int i2 = this.f12539e;
        if (i2 == 0) {
            long j3 = ((C4715b) gVar2).f11871c;
            this.f12541g = j3;
            this.f12539e = 1;
            long j4 = this.f12537c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j5 = this.f12542h;
                long j6 = 0;
                if (j5 == 0) {
                    i = 3;
                } else {
                    long j7 = this.f12543i;
                    long j8 = this.f12544j;
                    if (j7 == j8) {
                        j = -(this.f12545k + 2);
                    } else {
                        C4715b bVar = (C4715b) gVar2;
                        long j9 = bVar.f11871c;
                        if (!mo25277a(gVar2, j8)) {
                            j = this.f12543i;
                            if (j == j9) {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            this.f12535a.mo25286a(gVar2, false);
                            bVar.f11873e = 0;
                            C4811e eVar2 = this.f12535a;
                            long j10 = eVar2.f12563b;
                            long j11 = j5 - j10;
                            int i3 = eVar2.f12565d + eVar2.f12566e;
                            int i4 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                            if (i4 < 0 || j11 > 72000) {
                                if (i4 < 0) {
                                    this.f12544j = j9;
                                    this.f12546l = j10;
                                } else {
                                    long j12 = (long) i3;
                                    long j13 = bVar.f11871c + j12;
                                    this.f12543i = j13;
                                    this.f12545k = j10;
                                    if ((this.f12544j - j13) + j12 < 100000) {
                                        bVar.mo25139c(i3);
                                        j2 = this.f12545k;
                                    }
                                }
                                long j14 = this.f12544j;
                                long j15 = this.f12543i;
                                long j16 = j14 - j15;
                                if (j16 < 100000) {
                                    this.f12544j = j15;
                                    j = j15;
                                } else {
                                    j = Math.min(Math.max((bVar.f11871c - ((long) (i3 * (i4 <= 0 ? 2 : 1)))) + ((j11 * j16) / (this.f12546l - this.f12545k)), j15), this.f12544j - 1);
                                }
                            } else {
                                bVar.mo25139c(i3);
                                j2 = this.f12535a.f12563b;
                            }
                            j = -(j2 + 2);
                        }
                    }
                    if (j >= 0) {
                        return j;
                    }
                    long j17 = this.f12542h;
                    this.f12535a.mo25286a(gVar2, false);
                    j6 = -(j + 2);
                    while (true) {
                        C4811e eVar3 = this.f12535a;
                        if (eVar3.f12563b >= j17) {
                            break;
                        }
                        ((C4715b) gVar2).mo25139c(eVar3.f12565d + eVar3.f12566e);
                        C4811e eVar4 = this.f12535a;
                        j6 = eVar4.f12563b;
                        eVar4.mo25286a(gVar2, false);
                    }
                    ((C4715b) gVar2).f11873e = 0;
                    i = 3;
                }
                this.f12539e = i;
                return -(j6 + 2);
            } else if (i2 == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        if (mo25277a(gVar2, this.f12537c)) {
            this.f12535a.mo25285a();
            while (true) {
                eVar = this.f12535a;
                if ((eVar.f12562a & 4) == 4) {
                    break;
                }
                C4715b bVar2 = (C4715b) gVar2;
                if (bVar2.f11871c >= this.f12537c) {
                    break;
                }
                eVar.mo25286a(gVar2, false);
                C4811e eVar5 = this.f12535a;
                bVar2.mo25139c(eVar5.f12565d + eVar5.f12566e);
            }
            this.f12540f = eVar.f12563b;
            this.f12539e = 3;
            return this.f12541g;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public C4767m mo25278b() {
        if (this.f12540f != 0) {
            return new C4806a();
        }
        return null;
    }

    /* renamed from: c */
    public long mo25279c(long j) {
        long j2;
        int i = this.f12539e;
        C5023a.m15302a(i == 3 || i == 2);
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = (((long) this.f12538d.f12580i) * j) / 1000000;
        }
        this.f12542h = j2;
        this.f12539e = 2;
        this.f12543i = this.f12536b;
        this.f12544j = this.f12537c;
        this.f12545k = 0;
        this.f12546l = this.f12540f;
        return j2;
    }

    /* renamed from: a */
    public boolean mo25277a(C4730g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f12537c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            C4715b bVar = (C4715b) gVar;
            int i3 = 0;
            if (bVar.f11871c + ((long) i2) <= min || (i2 = (int) (min - bVar.f11871c)) >= 4) {
                bVar.mo25136a(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.mo25139c(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            bVar.mo25139c(i);
        }
    }
}
