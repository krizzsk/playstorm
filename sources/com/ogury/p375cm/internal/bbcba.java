package com.ogury.p375cm.internal;

import com.ogury.p375cm.internal.bbbaa;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* renamed from: com.ogury.cm.internal.bbcba */
final class bbcba implements bbcac {

    /* renamed from: a */
    private final bbcab f25961a = new aaaab(this);

    /* renamed from: b */
    private List<String> f25962b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Matcher f25963c;

    /* renamed from: d */
    private final CharSequence f25964d;

    /* renamed from: com.ogury.cm.internal.bbcba$aaaaa */
    public static final class aaaaa extends bacab<String> {

        /* renamed from: b */
        final /* synthetic */ bbcba f25965b;

        aaaaa(bbcba bbcba) {
            this.f25965b = bbcba;
        }

        /* renamed from: a */
        public final int mo66675a() {
            return this.f25965b.f25963c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.contains((String) obj);
        }

        public final /* synthetic */ Object get(int i) {
            String group = this.f25965b.f25963c.group(i);
            return group == null ? "" : group;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.indexOf((String) obj);
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof String)) {
                return -1;
            }
            return super.lastIndexOf((String) obj);
        }
    }

    /* renamed from: com.ogury.cm.internal.bbcba$aaaab */
    public static final class aaaab extends bacaa<bbcaa> implements bbcab {

        /* renamed from: a */
        final /* synthetic */ bbcba f25966a;

        /* renamed from: com.ogury.cm.internal.bbcba$aaaab$aaaaa */
        static final class aaaaa extends bbaca implements bbaab<Integer, bbcaa> {

            /* renamed from: a */
            final /* synthetic */ aaaab f25967a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            aaaaa(aaaab aaaab) {
                super(1);
                this.f25967a = aaaab;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo66506a(Object obj) {
                int intValue = ((Number) obj).intValue();
                aaaab aaaab = this.f25967a;
                MatchResult a = aaaab.f25966a.f25963c;
                bbbac a2 = bbbaa.aaaaa.m30950a(a.start(intValue), a.end(intValue));
                if (a2.mo66724a() < 0) {
                    return null;
                }
                String group = aaaab.f25966a.f25963c.group(intValue);
                bbabc.m30940a((Object) group, "matchResult.group(index)");
                return new bbcaa(group, a2);
            }
        }

        aaaab(bbcba bbcba) {
            this.f25966a = bbcba;
        }

        /* renamed from: a */
        public final int mo66675a() {
            return this.f25966a.f25963c.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj != null ? obj instanceof bbcaa : true)) {
                return false;
            }
            return super.contains((bbcaa) obj);
        }

        public final boolean isEmpty() {
            return false;
        }

        public final Iterator<bbcaa> iterator() {
            bbabc.m30943b(this, "receiver$0");
            Iterable bbbac = new bbbac(0, size() - 1);
            bbabc.m30943b(bbbac, "receiver$0");
            return bbbbb.m30955a(new bacac(bbbac), new aaaaa(this)).mo66713a();
        }
    }

    public bbcba(Matcher matcher, CharSequence charSequence) {
        bbabc.m30943b(matcher, "matcher");
        bbabc.m30943b(charSequence, "input");
        this.f25963c = matcher;
        this.f25964d = charSequence;
    }

    /* renamed from: a */
    public final List<String> mo66743a() {
        if (this.f25962b == null) {
            this.f25962b = new aaaaa(this);
        }
        List<String> list = this.f25962b;
        if (list == null) {
            bbabc.m30939a();
        }
        return list;
    }
}
