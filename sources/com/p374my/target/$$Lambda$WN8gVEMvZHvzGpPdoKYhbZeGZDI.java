package com.p374my.target;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.my.target.-$$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI implements FilenameFilter {
    public static final /* synthetic */ $$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI INSTANCE = new $$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI();

    private /* synthetic */ $$Lambda$WN8gVEMvZHvzGpPdoKYhbZeGZDI() {
    }

    public final boolean accept(File file, String str) {
        return str.startsWith("mytrg_");
    }
}
