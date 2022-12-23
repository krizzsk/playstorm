package p398ms.p399bd.p400o.Pgl;

import p398ms.p399bd.p400o.Pgl.pblu;

/* renamed from: ms.bd.o.Pgl.pblx */
final class pblx implements pblu.pblb {
    pblx() {
    }

    /* renamed from: a */
    public String mo76477a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
