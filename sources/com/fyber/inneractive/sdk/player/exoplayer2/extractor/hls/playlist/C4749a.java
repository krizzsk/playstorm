package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a */
public final class C4749a extends C4753c {

    /* renamed from: b */
    public final List<C4750a> f12046b;

    /* renamed from: c */
    public final List<C4750a> f12047c;

    /* renamed from: d */
    public final List<C4750a> f12048d;

    /* renamed from: e */
    public final C4869i f12049e;

    /* renamed from: f */
    public final List<C4869i> f12050f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a */
    public static final class C4750a {

        /* renamed from: a */
        public final String f12051a;

        /* renamed from: b */
        public final C4869i f12052b;

        public C4750a(String str, C4869i iVar) {
            this.f12051a = str;
            this.f12052b = iVar;
        }
    }

    public C4749a(String str, List<C4750a> list, List<C4750a> list2, List<C4750a> list3, C4869i iVar, List<C4869i> list4) {
        super(str);
        this.f12046b = Collections.unmodifiableList(list);
        this.f12047c = Collections.unmodifiableList(list2);
        this.f12048d = Collections.unmodifiableList(list3);
        this.f12049e = iVar;
        this.f12050f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
