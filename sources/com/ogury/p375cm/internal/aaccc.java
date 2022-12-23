package com.ogury.p375cm.internal;

import java.util.List;

/* renamed from: com.ogury.cm.internal.aaccc */
public final class aaccc implements Comparable<aaccc> {

    /* renamed from: a */
    public static final aaaaa f25680a = new aaaaa((bbabb) null);

    /* renamed from: b */
    private final int f25681b;

    /* renamed from: c */
    private final int f25682c;

    /* renamed from: d */
    private final int f25683d;

    /* renamed from: e */
    private final String f25684e;

    /* renamed from: f */
    private final String f25685f;

    /* renamed from: com.ogury.cm.internal.aaccc$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    public aaccc() {
        this(0, 0, 0, (String) null, (String) null, 31, (bbabb) null);
    }

    public aaccc(int i, int i2, int i3, String str, String str2) {
        this.f25681b = i;
        this.f25682c = i2;
        this.f25683d = i3;
        this.f25684e = str;
        this.f25685f = str2;
        boolean z = true;
        if (i >= 0) {
            if (this.f25682c >= 0) {
                if (this.f25683d < 0 ? false : z) {
                    String str3 = this.f25684e;
                    if (str3 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo66745a(str3)) {
                            throw new IllegalArgumentException("Pre-release version is not valid".toString());
                        }
                    }
                    String str4 = this.f25685f;
                    if (str4 != null) {
                        if (!new bbcbb("[\\dA-z\\-]+(?:\\.[\\dA-z\\-]+)*").mo66745a(str4)) {
                            throw new IllegalArgumentException("Build metadata is not valid".toString());
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Patch version must be a positive number".toString());
            }
            throw new IllegalArgumentException("Minor version must be a positive number".toString());
        }
        throw new IllegalArgumentException("Major version must be a positive number".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aaccc(int i, int i2, int i3, String str, String str2, int i4, bbabb bbabb) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (String) null, (String) null);
    }

    /* renamed from: a */
    private static boolean m30680a(String str) {
        return new bbcbb("\\d+").mo66745a(str);
    }

    /* renamed from: a */
    public final int mo66538a() {
        return this.f25681b;
    }

    /* renamed from: a */
    public final int compareTo(aaccc aaccc) {
        bbabc.m30943b(aaccc, "other");
        int i = this.f25681b;
        int i2 = aaccc.f25681b;
        if (i > i2) {
            return 1;
        }
        if (i < i2) {
            return -1;
        }
        int i3 = this.f25682c;
        int i4 = aaccc.f25682c;
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        int i5 = this.f25683d;
        int i6 = aaccc.f25683d;
        if (i5 > i6) {
            return 1;
        }
        if (i5 < i6) {
            return -1;
        }
        if (this.f25684e == null && aaccc.f25684e == null) {
            return 0;
        }
        if (this.f25684e != null && aaccc.f25684e == null) {
            return -1;
        }
        if (this.f25684e == null && aaccc.f25684e != null) {
            return 1;
        }
        String str = this.f25684e;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        List a = bbcbc.m30988a((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
        String str3 = aaccc.f25684e;
        if (str3 != null) {
            str2 = str3;
        }
        List a2 = bbcbc.m30988a((CharSequence) str2, new String[]{"."}, false, 0, 6, (Object) null);
        int min = Math.min(a.size(), a2.size()) - 1;
        if (min >= 0) {
            int i7 = 0;
            while (true) {
                String str4 = (String) a.get(i7);
                String str5 = (String) a2.get(i7);
                if (!bbabc.m30942a((Object) str4, (Object) str5)) {
                    boolean a3 = m30680a(str4);
                    boolean a4 = m30680a(str5);
                    if (a3 && !a4) {
                        return -1;
                    }
                    if (!a3 && a4) {
                        return 1;
                    }
                    if (a3 || a4) {
                        try {
                            int parseInt = Integer.parseInt(str4);
                            int parseInt2 = Integer.parseInt(str5);
                            if (parseInt > parseInt2) {
                                return 1;
                            }
                            if (parseInt < parseInt2) {
                                return -1;
                            }
                        } catch (NumberFormatException unused) {
                            return str4.compareTo(str5);
                        }
                    } else if (str4.compareTo(str5) > 0) {
                        return 1;
                    } else {
                        if (str4.compareTo(str5) < 0) {
                            return -1;
                        }
                    }
                }
                if (i7 == min) {
                    break;
                }
                i7++;
            }
        }
        int i8 = min + 1;
        if (a.size() != i8 || a2.size() <= i8) {
            return (a.size() <= i8 || a2.size() != i8) ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo66540b() {
        return this.f25682c;
    }

    /* renamed from: c */
    public final int mo66541c() {
        return this.f25683d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aaccc) {
                aaccc aaccc = (aaccc) obj;
                if (this.f25681b == aaccc.f25681b) {
                    if (this.f25682c == aaccc.f25682c) {
                        if (!(this.f25683d == aaccc.f25683d) || !bbabc.m30942a((Object) this.f25684e, (Object) aaccc.f25684e) || !bbabc.m30942a((Object) this.f25685f, (Object) aaccc.f25685f)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f25681b * 31) + this.f25682c) * 31) + this.f25683d) * 31;
        String str = this.f25684e;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f25685f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25681b);
        sb2.append('.');
        sb2.append(this.f25682c);
        sb2.append('.');
        sb2.append(this.f25683d);
        sb.append(sb2.toString());
        if (this.f25684e != null) {
            sb.append('-');
            sb.append(this.f25684e);
        }
        if (this.f25685f != null) {
            sb.append('+');
            sb.append(this.f25685f);
        }
        String sb3 = sb.toString();
        bbabc.m30940a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
