package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bytedance.sdk.openadsdk.core.C3578m;

public final class TTAdConfig {

    /* renamed from: a */
    private String f6858a;

    /* renamed from: b */
    private String f6859b;

    /* renamed from: c */
    private boolean f6860c;

    /* renamed from: d */
    private String f6861d;

    /* renamed from: e */
    private String f6862e;

    /* renamed from: f */
    private int f6863f;

    /* renamed from: g */
    private boolean f6864g;

    /* renamed from: h */
    private boolean f6865h;

    /* renamed from: i */
    private boolean f6866i;

    /* renamed from: j */
    private boolean f6867j;

    /* renamed from: k */
    private String[] f6868k;

    /* renamed from: l */
    private boolean f6869l;

    /* renamed from: m */
    private int f6870m;

    /* renamed from: n */
    private int f6871n;

    /* renamed from: o */
    private int f6872o;

    /* renamed from: p */
    private String f6873p;

    /* renamed from: q */
    private int f6874q;

    /* renamed from: r */
    private int f6875r;

    private TTAdConfig() {
        this.f6860c = false;
        this.f6863f = 0;
        boolean z = true;
        this.f6864g = true;
        this.f6865h = false;
        this.f6866i = Build.VERSION.SDK_INT < 14 ? false : z;
        this.f6867j = false;
        this.f6869l = false;
        this.f6870m = -1;
        this.f6871n = -1;
        this.f6872o = -1;
    }

    public void setPackageName(String str) {
        this.f6873p = str;
    }

    public String getPackageName() {
        return this.f6873p;
    }

    public void setCoppa(int i) {
        this.f6870m = i;
    }

    public int getCoppa() {
        return this.f6870m;
    }

    public void setGDPR(int i) {
        this.f6871n = i;
    }

    public int getGDPR() {
        return this.f6871n;
    }

    public void setCcpa(int i) {
        this.f6872o = i;
    }

    public int getCcpa() {
        return this.f6872o;
    }

    public String getAppId() {
        return this.f6858a;
    }

    public void setAppId(String str) {
        this.f6858a = str;
    }

    public String getAppName() {
        String str = this.f6859b;
        if (str == null || str.isEmpty()) {
            this.f6859b = m8541a(C3578m.m11231a());
        }
        return this.f6859b;
    }

    public void setAppName(String str) {
        this.f6859b = str;
    }

    public int getAppIconId() {
        return this.f6875r;
    }

    public void setAppIcon(int i) {
        this.f6875r = i;
    }

    public boolean isPaid() {
        return this.f6860c;
    }

    public void setPaid(boolean z) {
        this.f6860c = z;
    }

    public String getKeywords() {
        return this.f6861d;
    }

    public void setKeywords(String str) {
        this.f6861d = str;
    }

    public String getData() {
        return this.f6862e;
    }

    public void setData(String str) {
        this.f6862e = str;
    }

    public int getTitleBarTheme() {
        return this.f6863f;
    }

    public void setTitleBarTheme(int i) {
        this.f6863f = i;
    }

    public boolean isAllowShowNotify() {
        return this.f6864g;
    }

    public void setAllowShowNotify(boolean z) {
        this.f6864g = z;
    }

    public boolean isDebug() {
        return this.f6865h;
    }

    public void setDebug(boolean z) {
        this.f6865h = z;
    }

    public boolean isUseTextureView() {
        return this.f6866i;
    }

    public void setUseTextureView(boolean z) {
        this.f6866i = z;
    }

    public boolean isSupportMultiProcess() {
        return this.f6867j;
    }

    public void setSupportMultiProcess(boolean z) {
        this.f6867j = z;
        C2518b.m6273a(z);
    }

    public String[] getNeedClearTaskReset() {
        return this.f6868k;
    }

    public void setNeedClearTaskReset(String... strArr) {
        this.f6868k = strArr;
    }

    public boolean isAsyncInit() {
        return this.f6869l;
    }

    public void setAsyncInit(boolean z) {
        this.f6869l = z;
    }

    /* renamed from: a */
    private String m8541a(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public int getDebugLog() {
        return this.f6874q;
    }

    public void setDebugLog(int i) {
        this.f6874q = i;
    }

    public static class Builder {

        /* renamed from: a */
        private String f6876a;

        /* renamed from: b */
        private String f6877b;

        /* renamed from: c */
        private boolean f6878c = false;

        /* renamed from: d */
        private String f6879d;

        /* renamed from: e */
        private String f6880e;

        /* renamed from: f */
        private int f6881f = 0;

        /* renamed from: g */
        private boolean f6882g;

        /* renamed from: h */
        private boolean f6883h;

        /* renamed from: i */
        private boolean f6884i;

        /* renamed from: j */
        private boolean f6885j;

        /* renamed from: k */
        private String[] f6886k;

        /* renamed from: l */
        private boolean f6887l;

        /* renamed from: m */
        private int f6888m;

        /* renamed from: n */
        private int f6889n;

        /* renamed from: o */
        private int f6890o;

        /* renamed from: p */
        private int f6891p;

        /* renamed from: q */
        private String f6892q;

        /* renamed from: r */
        private int f6893r;

        @Deprecated
        public Builder allowShowPageWhenScreenLock(boolean z) {
            return this;
        }

        public Builder() {
            boolean z = true;
            this.f6882g = true;
            this.f6883h = false;
            this.f6884i = Build.VERSION.SDK_INT < 14 ? false : z;
            this.f6885j = false;
            this.f6887l = false;
            this.f6888m = -1;
            this.f6889n = -1;
            this.f6890o = -1;
        }

        public Builder coppa(int i) {
            this.f6888m = i;
            return this;
        }

        public Builder setGDPR(int i) {
            this.f6889n = i;
            return this;
        }

        public Builder setCCPA(int i) {
            this.f6890o = i;
            return this;
        }

        public Builder appId(String str) {
            this.f6876a = str;
            return this;
        }

        public Builder appIcon(int i) {
            this.f6893r = i;
            return this;
        }

        @Deprecated
        public Builder appName(String str) {
            this.f6877b = str;
            return this;
        }

        @Deprecated
        public Builder paid(boolean z) {
            this.f6878c = z;
            return this;
        }

        @Deprecated
        public Builder keywords(String str) {
            this.f6879d = str;
            return this;
        }

        public Builder data(String str) {
            this.f6880e = str;
            return this;
        }

        @Deprecated
        public Builder titleBarTheme(int i) {
            this.f6881f = i;
            return this;
        }

        @Deprecated
        public Builder allowShowNotify(boolean z) {
            this.f6882g = z;
            return this;
        }

        public Builder debug(boolean z) {
            this.f6883h = z;
            return this;
        }

        public Builder useTextureView(boolean z) {
            this.f6884i = z;
            return this;
        }

        public Builder supportMultiProcess(boolean z) {
            this.f6885j = z;
            return this;
        }

        @Deprecated
        public Builder needClearTaskReset(String... strArr) {
            this.f6886k = strArr;
            return this;
        }

        public Builder asyncInit(boolean z) {
            this.f6887l = z;
            return this;
        }

        public Builder debugLog(int i) {
            this.f6891p = i;
            return this;
        }

        public Builder setPackageName(String str) {
            this.f6892q = str;
            return this;
        }

        public TTAdConfig build() {
            TTAdConfig tTAdConfig = new TTAdConfig();
            tTAdConfig.setAppId(this.f6876a);
            tTAdConfig.setCoppa(this.f6888m);
            tTAdConfig.setAppName(this.f6877b);
            tTAdConfig.setAppIcon(this.f6893r);
            tTAdConfig.setPaid(this.f6878c);
            tTAdConfig.setKeywords(this.f6879d);
            tTAdConfig.setData(this.f6880e);
            tTAdConfig.setTitleBarTheme(this.f6881f);
            tTAdConfig.setAllowShowNotify(this.f6882g);
            tTAdConfig.setDebug(this.f6883h);
            tTAdConfig.setUseTextureView(this.f6884i);
            tTAdConfig.setSupportMultiProcess(this.f6885j);
            tTAdConfig.setNeedClearTaskReset(this.f6886k);
            tTAdConfig.setAsyncInit(this.f6887l);
            tTAdConfig.setGDPR(this.f6889n);
            tTAdConfig.setCcpa(this.f6890o);
            tTAdConfig.setDebugLog(this.f6891p);
            tTAdConfig.setPackageName(this.f6892q);
            return tTAdConfig;
        }
    }
}
