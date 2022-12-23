package com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e;

import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.smaato.sdk.video.vast.model.ErrorCode;
import java.io.InputStream;
import java.util.List;
import p398ms.p399bd.p400o.Pgl.C12379c;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e.a */
/* compiled from: AbsResponseWrapper */
public abstract class C2448a {

    /* renamed from: a */
    List<C2473i.C2475b> f5196a;

    /* renamed from: b */
    C2453e f5197b;

    /* renamed from: a */
    public abstract int mo16166a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo16168a(int i) {
        switch (i) {
            case 200:
                return "OK";
            case ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR /*201*/:
                return "Created";
            case ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR /*202*/:
                return "Accepted";
            case ErrorCode.DIFFERENT_SIZE_EXPECTED_ERROR /*203*/:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case ErrorCode.INLINE_CATEGORY_VIOLATES_BLOCKED_CATEGORIES_ERROR /*205*/:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i) {
                    case 300:
                        return "Multiple Choices";
                    case ErrorCode.WRAPPER_REQUEST_TIMEOUT_ERROR /*301*/:
                        return "Moved Permanently";
                    case 302:
                        return "Temporary Redirect";
                    case ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR /*303*/:
                        return "See Other";
                    case ErrorCode.INLINE_AD_DISPLAY_TIMEOUT_ERROR /*304*/:
                        return "Not Modified";
                    case IronSourceConstants.OFFERWALL_OPENED /*305*/:
                        return "Use Proxy";
                    default:
                        switch (i) {
                            case 400:
                                return "Bad Request";
                            case 401:
                                return "Unauthorized";
                            case 402:
                                return "Payment Required";
                            case 403:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /*404*/:
                                return "Not Found";
                            case 405:
                                return "Method Not Allowed";
                            case TTAdConstant.LANDING_PAGE_TYPE_CODE /*406*/:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /*407*/:
                                return "Proxy Authentication Required";
                            case 408:
                                return "Request Time-Out";
                            case 409:
                                return "Conflict";
                            case 410:
                                return "Gone";
                            case TTAdConstant.IMAGE_CODE /*411*/:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /*413*/:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /*414*/:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /*415*/:
                                return "Unsupported Media Type";
                            default:
                                switch (i) {
                                    case 500:
                                        return "Internal Server Error";
                                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /*501*/:
                                        return "Not Implemented";
                                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /*502*/:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case C12379c.COLLECT_MODE_TIKTOK_GUEST /*504*/:
                                        return "Gateway Timeout";
                                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /*505*/:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    /* renamed from: a */
    public abstract String mo16169a(String str, String str2);

    /* renamed from: b */
    public abstract boolean mo16170b();

    /* renamed from: c */
    public abstract List<C2473i.C2475b> mo16171c();

    /* renamed from: d */
    public abstract InputStream mo16172d();

    /* renamed from: e */
    public abstract String mo16173e();

    /* renamed from: f */
    public abstract String mo16174f();

    /* renamed from: g */
    public C2453e mo16175g() {
        return this.f5197b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2473i.C2475b mo16167a(String str) {
        List<C2473i.C2475b> list;
        if (!(str == null || (list = this.f5196a) == null || list.size() <= 0)) {
            for (C2473i.C2475b next : this.f5196a) {
                if (str.equals(next.f5267a)) {
                    return next;
                }
            }
        }
        return null;
    }
}
