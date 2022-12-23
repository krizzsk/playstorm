package com.fyber.inneractive.sdk.flow.vast;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.c */
public class C4442c {

    /* renamed from: a */
    public C4443a f10984a;

    /* renamed from: b */
    public Object f10985b;

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.c$a */
    public enum C4443a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        

        /* renamed from: a */
        public int f10994a;

        /* access modifiers changed from: public */
        C4443a(int i) {
            this.f10994a = i;
        }
    }

    public C4442c(C4443a aVar, Object obj) {
        this.f10984a = aVar;
        this.f10985b = obj;
    }

    public String toString() {
        return "Media File inc error::  type = " + this.f10984a + " expected value = " + this.f10985b;
    }
}
