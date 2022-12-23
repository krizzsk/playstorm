package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v */
public interface C4853v {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a */
    public static final class C4854a {

        /* renamed from: a */
        public final String f12840a;

        /* renamed from: b */
        public final byte[] f12841b;

        public C4854a(String str, int i, byte[] bArr) {
            this.f12840a = str;
            this.f12841b = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b */
    public static final class C4855b {

        /* renamed from: a */
        public final String f12842a;

        /* renamed from: b */
        public final List<C4854a> f12843b;

        /* renamed from: c */
        public final byte[] f12844c;

        public C4855b(int i, String str, List<C4854a> list, byte[] bArr) {
            List<C4854a> list2;
            this.f12842a = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f12843b = list2;
            this.f12844c = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c */
    public interface C4856c {
        /* renamed from: a */
        SparseArray<C4853v> mo25300a();

        /* renamed from: a */
        C4853v mo25302a(int i, C4855b bVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d */
    public static final class C4857d {

        /* renamed from: a */
        public final String f12845a;

        /* renamed from: b */
        public final int f12846b;

        /* renamed from: c */
        public final int f12847c;

        /* renamed from: d */
        public int f12848d;

        /* renamed from: e */
        public String f12849e;

        public C4857d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f12845a = str;
            this.f12846b = i2;
            this.f12847c = i3;
            this.f12848d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void mo25322a() {
            int i = this.f12848d;
            this.f12848d = i == Integer.MIN_VALUE ? this.f12846b : i + this.f12847c;
            this.f12849e = this.f12845a + this.f12848d;
        }

        /* renamed from: b */
        public String mo25323b() {
            if (this.f12848d != Integer.MIN_VALUE) {
                return this.f12849e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public int mo25324c() {
            int i = this.f12848d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo25313a();

    /* renamed from: a */
    void mo25315a(C5036k kVar, boolean z);

    /* renamed from: a */
    void mo25316a(C5046r rVar, C4731h hVar, C4857d dVar);
}
