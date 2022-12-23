package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.click.p057a.C2302a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p303e.C8437b;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;

public final class CommonJumpLoader extends C2313c {

    /* renamed from: a */
    JumpLoaderResult f4692a = null;

    /* renamed from: b */
    private int f4693b = 0;

    /* renamed from: c */
    private String f4694c = null;

    /* renamed from: d */
    private int f4695d;

    /* renamed from: e */
    private C2314d f4696e = null;

    /* renamed from: f */
    private boolean f4697f = true;

    /* renamed from: g */
    private C8437b f4698g;

    /* renamed from: h */
    private C2324g f4699h;

    /* renamed from: i */
    private Handler f4700i = new Handler(Looper.getMainLooper());

    public CommonJumpLoader(Context context) {
        this.f4698g = new C8437b(context);
        this.f4699h = new C2324g(context);
    }

    /* renamed from: a */
    public final void mo15613a(String str, CampaignEx campaignEx, C2314d dVar, String str2, boolean z, boolean z2, int i) {
        String str3;
        this.f4694c = str2;
        this.f4696e = dVar;
        this.f4692a = null;
        this.f4695d = i;
        boolean z3 = false;
        if (campaignEx != null) {
            if ("5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode())) {
                z3 = true;
            }
            str3 = campaignEx.getId();
        } else {
            str3 = "";
        }
        String str4 = str3;
        this.f4699h.mo15706a(str2, dVar, z3, str4, str, campaignEx, z, z2, i);
    }

    /* renamed from: a */
    public final void mo15612a(String str, CampaignEx campaignEx, C2314d dVar) {
        this.f4694c = new String(campaignEx.getClickURL());
        this.f4696e = dVar;
        this.f4692a = null;
        this.f4699h.mo15706a(campaignEx.getClickURL(), dVar, "5".equals(campaignEx.getClick_mode()) || "6".equals(campaignEx.getClick_mode()), campaignEx.getId(), str, campaignEx, true, false, C2302a.f4736j);
    }

    /* renamed from: a */
    public final void mo15611a() {
        this.f4697f = false;
    }

    public static class JumpLoaderResult implements NoProGuard, Serializable {
        public static final int CODE_DOWNLOAD = 3;
        public static final int CODE_LINK = 2;
        public static final int CODE_MARKET = 1;
        public static final int CODE_NULL = 4;
        private static final long serialVersionUID = 1;
        private int code;
        private String content;
        private String exceptionMsg;
        private String header;
        private boolean is302Jump;
        private boolean jumpDone;
        private String msg;
        private String noticeurl;
        private int statusCode;
        private boolean success;
        private int type;
        private String url;

        public int getStatusCode() {
            return this.statusCode;
        }

        public void setStatusCode(int i) {
            this.statusCode = i;
        }

        public boolean isIs302Jump() {
            return this.is302Jump;
        }

        public void setIs302Jump(boolean z) {
            this.is302Jump = z;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String getHeader() {
            return this.header;
        }

        public void setHeader(String str) {
            this.header = str;
        }

        public String getExceptionMsg() {
            return this.exceptionMsg;
        }

        public void setExceptionMsg(String str) {
            this.exceptionMsg = str;
        }

        public String getContent() {
            return this.content;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public String getNoticeurl() {
            return this.noticeurl;
        }

        public void setNoticeurl(String str) {
            this.noticeurl = str;
        }

        public boolean isSuccess() {
            return this.success;
        }

        public void setSuccess(boolean z) {
            this.success = z;
        }

        public String getMsg() {
            return this.msg;
        }

        public void setMsg(String str) {
            this.msg = str;
        }

        public int getCode() {
            return this.code;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public boolean isjumpDone() {
            return this.jumpDone;
        }

        public void setjumpDone(boolean z) {
            this.jumpDone = z;
        }
    }
}
