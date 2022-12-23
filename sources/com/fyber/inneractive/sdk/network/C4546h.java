package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.fyber.inneractive.sdk.network.h */
public class C4546h {
    /* renamed from: a */
    public InputStream mo24751a(InputStream inputStream, boolean z) {
        if (z) {
            try {
                IAlog.m16699a("HttpExecutorImpl: getInputStream found gzip encoding", new Object[0]);
                return new GZIPInputStream(inputStream);
            } catch (Exception unused) {
                return null;
            }
        } else {
            IAlog.m16699a("HttpExecutorImpl: getInputStream no gzip encoding", new Object[0]);
            return new BufferedInputStream(inputStream);
        }
    }

    /* renamed from: a */
    public C4551j mo24750a(InputStream inputStream, int i, String str, Map<String, List<String>> map, String str2) throws C4573q0, C4531b {
        try {
            C4551j jVar = new C4551j(inputStream, i, str, map, str2);
            if (jVar.f11243a / 100 != 5) {
                return jVar;
            }
            throw new C4531b(String.format("server returned error %d", new Object[]{Integer.valueOf(jVar.f11243a)}));
        } catch (C4531b e) {
            IAlog.m16698a("failed executing network request", e, new Object[0]);
            throw new C4531b((Throwable) e);
        } catch (Exception e2) {
            IAlog.m16698a("failed reading network response", e2, new Object[0]);
            throw new C4573q0(e2);
        }
    }
}
