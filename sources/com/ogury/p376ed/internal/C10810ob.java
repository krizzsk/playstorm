package com.ogury.p376ed.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.ogury.ed.internal.ob */
public final class C10810ob implements Serializable {

    /* renamed from: a */
    public static final C10811a f27041a = new C10811a((byte) 0);

    /* renamed from: b */
    private final Pattern f27042b;

    public C10810ob(Pattern pattern) {
        C10765mq.m32773b(pattern, "nativePattern");
        this.f27042b = pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10810ob(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.ogury.p376ed.internal.C10765mq.m32773b(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            com.ogury.p376ed.internal.C10765mq.m32770a((java.lang.Object) r2, (java.lang.String) r0)
            r1.<init>((java.util.regex.Pattern) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p376ed.internal.C10810ob.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public final boolean mo67883a(CharSequence charSequence) {
        C10765mq.m32773b(charSequence, "input");
        return this.f27042b.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final List<String> mo67884b(CharSequence charSequence) {
        C10765mq.m32773b(charSequence, "input");
        int i = 0;
        C10814oc.m32854a(0);
        Matcher matcher = this.f27042b.matcher(charSequence);
        if (!matcher.find()) {
            return C10692km.m32644a(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(charSequence.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String pattern = this.f27042b.toString();
        C10765mq.m32770a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f27042b.pattern();
        C10765mq.m32770a((Object) pattern, "nativePattern.pattern()");
        return new C10812b(pattern, this.f27042b.flags());
    }

    /* renamed from: com.ogury.ed.internal.ob$b */
    static final class C10812b implements Serializable {

        /* renamed from: a */
        public static final C10813a f27043a = new C10813a((byte) 0);
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final String f27044b;

        /* renamed from: c */
        private final int f27045c;

        /* renamed from: com.ogury.ed.internal.ob$b$a */
        public static final class C10813a {
            private C10813a() {
            }

            public /* synthetic */ C10813a(byte b) {
                this();
            }
        }

        public C10812b(String str, int i) {
            C10765mq.m32773b(str, "pattern");
            this.f27044b = str;
            this.f27045c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f27044b, this.f27045c);
            C10765mq.m32770a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C10810ob(compile);
        }
    }

    /* renamed from: com.ogury.ed.internal.ob$a */
    public static final class C10811a {
        private C10811a() {
        }

        public /* synthetic */ C10811a(byte b) {
            this();
        }
    }
}
