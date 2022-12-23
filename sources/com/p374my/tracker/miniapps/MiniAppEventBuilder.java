package com.p374my.tracker.miniapps;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder */
public abstract class MiniAppEventBuilder {

    /* renamed from: a */
    final int f25088a;

    /* renamed from: b */
    final String f25089b;

    /* renamed from: c */
    final String f25090c;

    /* renamed from: d */
    String f25091d;

    /* renamed from: e */
    String f25092e;

    /* renamed from: f */
    String f25093f;

    /* renamed from: g */
    Map<String, String> f25094g;

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CloseEventBuilder */
    public static final class CloseEventBuilder extends MiniAppEventBuilder {
        CloseEventBuilder(String str, String str2) {
            super(21, str, str2);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$CustomEventBuilder */
    public static final class CustomEventBuilder extends MiniAppEventBuilder {
        CustomEventBuilder(String str, String str2, String str3) {
            super(24, str, str2);
            this.f25093f = str3;
        }

        public CustomEventBuilder withCustomUserId(String str) {
            this.f25092e = str;
            return this;
        }

        public CustomEventBuilder withEventParams(Map<String, String> map) {
            this.f25094g = map;
            return this;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$EventBuilder */
    public static final class EventBuilder {

        /* renamed from: a */
        final String f25095a;

        /* renamed from: b */
        final String f25096b;

        EventBuilder(String str, String str2) {
            this.f25095a = str;
            this.f25096b = str2;
        }

        public CloseEventBuilder closeEvent() {
            return new CloseEventBuilder(this.f25095a, this.f25096b);
        }

        public CustomEventBuilder customEvent(String str) {
            return new CustomEventBuilder(this.f25095a, this.f25096b, str);
        }

        public UserEventBuilder loginEvent() {
            return new UserEventBuilder(22, this.f25095a, this.f25096b);
        }

        public OpenEventBuilder openEvent(String str) {
            return new OpenEventBuilder(this.f25095a, this.f25096b, str);
        }

        public UserEventBuilder registrationEvent() {
            return new UserEventBuilder(23, this.f25095a, this.f25096b);
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$OpenEventBuilder */
    public static final class OpenEventBuilder extends MiniAppEventBuilder {
        OpenEventBuilder(String str, String str2, String str3) {
            super(20, str, str2);
            this.f25091d = str3;
        }
    }

    /* renamed from: com.my.tracker.miniapps.MiniAppEventBuilder$UserEventBuilder */
    public static final class UserEventBuilder extends MiniAppEventBuilder {
        UserEventBuilder(int i, String str, String str2) {
            super(i, str, str2);
        }

        public UserEventBuilder withCustomUserId(String str) {
            this.f25092e = str;
            return this;
        }
    }

    MiniAppEventBuilder(int i, String str, String str2) {
        this.f25088a = i;
        this.f25089b = str;
        this.f25090c = str2;
    }

    public static EventBuilder newEventBuilder(String str, String str2) {
        return new EventBuilder(str, str2);
    }

    public final MiniAppEvent build() {
        return new MiniAppEvent(this.f25088a, this.f25089b, this.f25090c, this.f25091d, this.f25092e, this.f25093f, this.f25094g == null ? null : new TreeMap(this.f25094g));
    }
}
