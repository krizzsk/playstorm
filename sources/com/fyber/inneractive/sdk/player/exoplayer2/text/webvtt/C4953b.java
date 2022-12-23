package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import com.facebook.internal.security.CertificateUtil;
import com.smaato.sdk.core.dns.DnsName;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b */
public final class C4953b {

    /* renamed from: a */
    public static final Pattern f13202a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    public static final Pattern f13203b = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static long m15154a(String str) throws NumberFormatException {
        String[] split = str.split(DnsName.ESCAPED_DOT, 2);
        long j = 0;
        for (String parseLong : split[0].split(CertificateUtil.DELIMITER)) {
            j = (j * 60) + Long.parseLong(parseLong);
        }
        return ((j * 1000) + Long.parseLong(split[1])) * 1000;
    }
}
