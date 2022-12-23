package com.ogury.p376ed.internal;

/* renamed from: com.ogury.ed.internal.iu */
public final class C10641iu implements C10589hj {

    /* renamed from: a */
    public static final C10642a f26855a = new C10642a((byte) 0);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C10641iu f26856c = new C10641iu((C10589hj[]) ((Object[]) new C10589hj[0]));

    /* renamed from: b */
    private final C10589hj[] f26857b;

    /* renamed from: com.ogury.ed.internal.iu$a */
    public static final class C10642a {
        public /* synthetic */ C10642a(byte b) {
            this();
        }

        private C10642a() {
        }

        /* renamed from: a */
        public static C10641iu m32500a() {
            return C10641iu.f26856c;
        }
    }

    public C10641iu(C10589hj[] hjVarArr) {
        C10765mq.m32773b(hjVarArr, "mraidUrlHandlers");
        this.f26857b = hjVarArr;
    }

    /* renamed from: a */
    public final boolean mo67541a(String str, C10660jh jhVar, C10483eb ebVar) {
        C10765mq.m32773b(str, "url");
        C10765mq.m32773b(jhVar, "webView");
        C10765mq.m32773b(ebVar, "ad");
        C10589hj[] hjVarArr = this.f26857b;
        int length = hjVarArr.length;
        int i = 0;
        while (i < length) {
            C10589hj hjVar = hjVarArr[i];
            i++;
            if (hjVar.mo67541a(str, jhVar, ebVar)) {
                return true;
            }
        }
        return false;
    }
}
