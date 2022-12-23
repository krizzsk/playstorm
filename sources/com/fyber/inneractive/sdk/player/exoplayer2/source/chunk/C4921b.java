package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5013v;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b */
public final class C4921b {
    /* renamed from: a */
    public static boolean m15080a(C4964e eVar, int i, Exception exc, long j) {
        if (!m15081a(exc)) {
            return false;
        }
        boolean a = eVar.mo25491a(i, j);
        int i2 = ((C5013v) exc).f13386a;
        if (a) {
            Log.w("ChunkedTrackBlacklist", "Blacklisted: duration=" + j + ", responseCode=" + i2 + ", format=" + eVar.mo25490a(i));
        } else {
            Log.w("ChunkedTrackBlacklist", "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i2 + ", format=" + eVar.mo25490a(i));
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m15081a(Exception exc) {
        if (!(exc instanceof C5013v)) {
            return false;
        }
        int i = ((C5013v) exc).f13386a;
        if (i == 404 || i == 410) {
            return true;
        }
        return false;
    }
}
