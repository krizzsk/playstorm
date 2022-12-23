package com.smaato.sdk.core.api;

import com.smaato.sdk.core.gdpr.tcfv2.encoder.field.DateEncoder;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.ApiUtils;
import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.util.ContentTypeUtil;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class ApiResponseMapper {
    private final ExpirationTimestampFactory expirationTimestampFactory;
    private final Logger logger;

    public ApiResponseMapper(Logger logger2, ExpirationTimestampFactory expirationTimestampFactory2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.expirationTimestampFactory = (ExpirationTimestampFactory) Objects.requireNonNull(expirationTimestampFactory2);
    }

    public ApiAdResponse map(Response response) throws MappingException {
        this.logger.debug(LogDomain.API, "map: entered with %s", response);
        Objects.requireNonNull(response);
        int responseCode = response.responseCode();
        this.logger.debug(LogDomain.API, "httpResponseCode = %s", Integer.valueOf(responseCode));
        if (responseCode == 200) {
            try {
                return mapToApiAdResponse(response);
            } catch (Exception e) {
                this.logger.debug(LogDomain.API, "error mapping networkResponse: %s", e);
                if (e instanceof MappingException) {
                    throw e;
                }
                this.logger.error(LogDomain.API, e, "error mapping networkResponse", new Object[0]);
                throw new MappingException(MappingException.Type.GENERIC, e.toString());
            }
        } else if (responseCode == 204) {
            this.logger.debug(LogDomain.API, "No Ad", new Object[0]);
            throw new MappingException(MappingException.Type.NO_AD);
        } else if (responseCode < 400 || responseCode >= 500) {
            throw new MappingException(MappingException.Type.UNEXPECTED_HTTP_RESPONSE_CODE, String.valueOf(responseCode));
        } else {
            List<String> values = response.headers().values("X-SMT-MESSAGE");
            String str = null;
            if (!values.isEmpty()) {
                str = values.get(0);
                this.logger.debug(LogDomain.API, "errorMessage = %s", str);
            } else {
                this.logger.debug(LogDomain.API, "errorMessage not supplied in response headers", new Object[0]);
            }
            throw new MappingException(MappingException.Type.UNEXPECTED_HTTP_RESPONSE_CODE, str);
        }
    }

    private ApiAdResponse mapToApiAdResponse(Response response) throws MappingException {
        String charSet = getCharSet(response);
        byte[] body = getBody(response);
        checkVASTTag(charSet, body);
        String csmHeader = getCsmHeader(response);
        AdFormat adFormat = getAdFormat(getFirstHeaderValue(response, "X-SMT-ADTYPE"), csmHeader);
        this.logger.debug(LogDomain.API, "got adFormat = %s", adFormat);
        return ApiAdResponse.builder().adFormat(adFormat).body(body).responseHeaders(response.headers().headers()).charset(charSet).requestUrl(response.request().uri().toString()).expiration(retrieveAdExpirationTimestamp(response)).sessionId(retrieveSessionId(response)).creativeId(ApiUtils.retrieveSci(response.headers())).csm(csmHeader).impressionCountingType(retrieveImpressionCountingType(response)).build();
    }

    private String getCsmHeader(Response response) {
        String join = Joiner.join((CharSequence) "", (Iterable) response.headers().values("X-SMT-CSM"));
        if (!join.isEmpty()) {
            return join;
        }
        this.logger.debug(LogDomain.API, "No X-SMT-CSM header in ad response. null is returned.", new Object[0]);
        return null;
    }

    private byte[] getBody(Response response) throws MappingException {
        try {
            byte[] byteArray = TextUtils.getByteArray(response.body().source());
            if (byteArray.length != 0) {
                return byteArray;
            }
            throw new MappingException(MappingException.Type.EMPTY_BODY);
        } catch (Exception unused) {
            throw new MappingException(MappingException.Type.ERROR_READING_BODY);
        }
    }

    private String getCharSet(Response response) throws MappingException {
        List<String> values = response.headers().values("Content-Type");
        if (!values.isEmpty()) {
            String parseCharset = parseCharset(values);
            if (parseCharset != null) {
                return parseCharset;
            }
            throw new MappingException(MappingException.Type.MISSING_CHARSET);
        }
        this.logger.debug(LogDomain.API, "%s header is absent in response", "Content-Type");
        throw new MappingException(MappingException.Type.MISSING_CONTENT_TYPE);
    }

    private void checkVASTTag(String str, byte[] bArr) throws MappingException {
        try {
            String str2 = new String(bArr, str);
            if (!str2.contains(VastTree.VAST)) {
                return;
            }
            if (!str2.contains("Ad")) {
                throw new MappingException(MappingException.Type.NO_AD);
            }
        } catch (UnsupportedEncodingException unused) {
            throw new MappingException(MappingException.Type.ERROR_READING_BODY);
        }
    }

    private String retrieveSessionId(Response response) throws MappingException {
        String retrieveSessionId = ApiUtils.retrieveSessionId(response.headers());
        if (retrieveSessionId != null) {
            return retrieveSessionId;
        }
        throw new MappingException(MappingException.Type.MISSING_SESSION_ID, "No X-SMT-SessionId header in ad response. Empty string is returned.");
    }

    private AdFormat getAdFormat(String str, String str2) throws MappingException {
        if (str == null && str2 == null) {
            this.logger.debug(LogDomain.API, "missing %s response header", "X-SMT-ADTYPE");
            throw new MappingException(MappingException.Type.MISSING_AD_TYPE);
        } else if (str == null) {
            return AdFormat.CSM;
        } else {
            this.logger.debug(LogDomain.API, "%s header value: %s", "X-SMT-ADTYPE", str);
            if (!str.isEmpty()) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1968751561:
                        if (str.equals("Native")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 73635:
                        if (str.equals("Img")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 82650203:
                        if (str.equals("Video")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1173835880:
                        if (str.equals("Richmedia")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    return AdFormat.NATIVE;
                }
                if (c == 1) {
                    return AdFormat.STATIC_IMAGE;
                }
                if (c == 2) {
                    return AdFormat.VIDEO;
                }
                if (c == 3) {
                    return AdFormat.RICH_MEDIA;
                }
                this.logger.debug(LogDomain.API, "unexpected X-SMT-ADTYPE response header value: %s", str);
                throw new MappingException(MappingException.Type.UNEXPECTED_AD_TYPE, str);
            }
            this.logger.debug(LogDomain.API, "invalid %s response header value", "X-SMT-ADTYPE");
            throw new MappingException(MappingException.Type.MISSING_AD_TYPE);
        }
    }

    private Expiration retrieveAdExpirationTimestamp(Response response) {
        String firstHeaderValue = getFirstHeaderValue(response, "X-SMT-Expires");
        if (firstHeaderValue != null) {
            try {
                return this.expirationTimestampFactory.createExpirationTimestampFor(Long.parseLong(firstHeaderValue.trim()), DateEncoder.getInstance().decodeHeaderDate(getFirstHeaderValue(response, "Date")));
            } catch (NumberFormatException unused) {
                this.logger.debug(LogDomain.API, "invalid %s response header value", "X-SMT-Expires", firstHeaderValue);
            }
        } else {
            this.logger.debug(LogDomain.API, "No X-SMT-Expires header in ad response. Using default expiration timestamp.", new Object[0]);
            return this.expirationTimestampFactory.createDefaultExpirationTimestamp();
        }
    }

    private ImpressionCountingType retrieveImpressionCountingType(Response response) {
        String retrieveImpressionCountingType = ApiUtils.retrieveImpressionCountingType(response.headers());
        if (retrieveImpressionCountingType != null && retrieveImpressionCountingType.equalsIgnoreCase("viewable")) {
            return ImpressionCountingType.VIEWABLE;
        }
        this.logger.debug(LogDomain.API, "No X-SMT-Impression-Measurement header in ad response. Using standard impression.", new Object[0]);
        return ImpressionCountingType.STANDARD;
    }

    private String parseCharset(List<String> list) {
        String parseCharset;
        int size = list.size();
        int i = 0;
        while (i < size) {
            String str = list.get(i);
            if (str == null || (parseCharset = ContentTypeUtil.parseCharset(str)) == null) {
                i++;
            } else {
                this.logger.debug(LogDomain.API, "charset found in response = %s", parseCharset);
                return parseCharset;
            }
        }
        this.logger.debug(LogDomain.API, "charset not found in response", new Object[0]);
        return null;
    }

    private String getFirstHeaderValue(Response response, String str) {
        List<String> values = response.headers().values(str);
        if (values.isEmpty()) {
            return null;
        }
        return values.get(0);
    }

    public static class MappingException extends Exception {
        public final String errorMessage;
        public final Type type;

        public enum Type {
            NO_AD,
            MISSING_AD_TYPE,
            UNEXPECTED_AD_TYPE,
            MISSING_CONTENT_TYPE,
            MISSING_SESSION_ID,
            MISSING_MIME_TYPE,
            MISSING_CHARSET,
            MISSING_BODY,
            ERROR_READING_BODY,
            EMPTY_BODY,
            UNEXPECTED_HTTP_RESPONSE_CODE,
            GENERIC
        }

        public MappingException(Type type2) {
            super(type2.toString());
            this.type = (Type) Objects.requireNonNull(type2);
            this.errorMessage = null;
        }

        public MappingException(Type type2, String str) {
            super(type2 + ": " + str);
            this.type = (Type) Objects.requireNonNull(type2);
            this.errorMessage = str;
        }
    }
}
