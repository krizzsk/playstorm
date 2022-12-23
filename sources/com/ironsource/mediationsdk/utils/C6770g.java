package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.environment.C6399a;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* renamed from: com.ironsource.mediationsdk.utils.g */
public final class C6770g {

    /* renamed from: d */
    private static final C6770g f17697d = new C6770g();

    /* renamed from: a */
    private String f17698a = "";

    /* renamed from: b */
    private String f17699b = "";

    /* renamed from: c */
    private String f17700c = "";

    /* renamed from: a */
    public static C6770g m20577a() {
        return f17697d;
    }

    /* renamed from: b */
    public final String mo36966b() {
        if (TextUtils.isEmpty(this.f17698a)) {
            this.f17698a = "C38FB23A402222A0C17D34A92F971D1F";
        }
        return this.f17698a;
    }

    /* renamed from: c */
    public final synchronized String mo36967c() {
        if (TextUtils.isEmpty(this.f17699b)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 32; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~".charAt(random.nextInt(93)));
            }
            this.f17699b = sb.toString();
        }
        return this.f17699b;
    }

    /* renamed from: d */
    public final String mo36968d() {
        if (TextUtils.isEmpty(this.f17700c)) {
            try {
                this.f17700c = C6399a.C64001.m19214a(mo36967c(), "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB");
            } catch (Exception e) {
                String str = "Session key encryption exception: " + e.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f17700c;
    }
}
