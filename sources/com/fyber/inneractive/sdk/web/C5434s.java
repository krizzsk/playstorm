package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.fyber.inneractive.sdk.util.C5370s;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.web.s */
public class C5434s {

    /* renamed from: g */
    public static final Pattern f14388g = Pattern.compile("max-age=(\\d+)");

    /* renamed from: h */
    public static final SimpleDateFormat f14389h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* renamed from: a */
    public final byte[] f14390a;

    /* renamed from: b */
    public final Map<String, String> f14391b;

    /* renamed from: c */
    public final String f14392c;

    /* renamed from: d */
    public final String f14393d;

    /* renamed from: e */
    public final int f14394e;

    /* renamed from: f */
    public final String f14395f;

    public C5434s(byte[] bArr, Map<String, String> map, String str, String str2, int i, String str3) {
        this.f14390a = bArr;
        this.f14391b = map;
        this.f14392c = str;
        this.f14393d = str2;
        this.f14394e = i;
        this.f14395f = str3;
    }

    /* renamed from: a */
    public boolean mo26592a() {
        boolean z;
        String str;
        if (TextUtils.isEmpty(this.f14395f)) {
            return false;
        }
        loop0:
        while (true) {
            z = true;
            for (String next : this.f14391b.keySet()) {
                if (!z) {
                    break loop0;
                }
                if (next != null && next.equalsIgnoreCase("Cache-Control")) {
                    String str2 = this.f14391b.get(next);
                    if (str2 != null) {
                        Pattern pattern = f14388g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str2.toLowerCase(locale));
                        int a = (!matcher.find() || matcher.groupCount() != 1) ? 0 : C5370s.m16783a(matcher.group(1), 0);
                        if ((str2.toLowerCase(locale).contains("public") || str2.toLowerCase(locale).contains("private") || ((long) a) > TimeUnit.SECONDS.convert(1, TimeUnit.HOURS)) && !str2.toLowerCase(locale).contains("no-") && !str2.toLowerCase(locale).contains("must-")) {
                        }
                    } else {
                        continue;
                    }
                } else if (next == null || !next.equalsIgnoreCase(HttpHeaders.VARY)) {
                    if (next != null && next.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                        String str3 = this.f14391b.get(next);
                        if (str3 != null) {
                            z = !str3.equalsIgnoreCase("no-cache");
                        }
                    } else if (!(next == null || !next.equalsIgnoreCase("Expires") || (str = this.f14391b.get(next)) == null)) {
                        try {
                            Date parse = f14389h.parse(str);
                            if (parse != null && parse.getTime() + TimeUnit.MILLISECONDS.convert(1, TimeUnit.HOURS) > System.currentTimeMillis()) {
                            }
                        } catch (ParseException unused) {
                            continue;
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        return z;
    }

    /* renamed from: b */
    public WebResourceResponse mo26593b() {
        return new WebResourceResponse(this.f14392c, this.f14393d, this.f14394e, this.f14395f, this.f14391b, new ByteArrayInputStream(this.f14390a));
    }
}
