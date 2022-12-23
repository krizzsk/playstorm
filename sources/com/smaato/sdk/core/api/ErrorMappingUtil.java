package com.smaato.sdk.core.api;

import com.smaato.sdk.core.api.ApiConnector;
import com.smaato.sdk.core.api.ApiResponseMapper;
import com.smaato.sdk.core.network.SomaException;
import java.io.IOException;

final class ErrorMappingUtil {
    private ErrorMappingUtil() {
    }

    static ApiConnectorException mapSomaExceptionToApiConnectorLayerException(Exception exc) {
        ApiConnector.Error error;
        if (exc instanceof SomaException) {
            int i = C109511.$SwitchMap$com$smaato$sdk$core$network$SomaException$Type[((SomaException) exc).getType().ordinal()];
            if (i == 1) {
                error = ApiConnector.Error.NO_AD;
            } else if (i == 2) {
                error = ApiConnector.Error.BAD_REQUEST;
            } else if (i == 3) {
                error = ApiConnector.Error.BAD_RESPONSE;
            } else if (i != 4) {
                error = ApiConnector.Error.TRANSPORT_GENERIC;
            } else {
                error = ApiConnector.Error.TRANSPORT_TIMEOUT;
            }
        } else if (exc instanceof IOException) {
            error = ApiConnector.Error.TRANSPORT_IO_ERROR;
        } else {
            error = ApiConnector.Error.TRANSPORT_GENERIC;
        }
        return new ApiConnectorException(error, exc);
    }

    /* renamed from: com.smaato.sdk.core.api.ErrorMappingUtil$1 */
    static /* synthetic */ class C109511 {

        /* renamed from: $SwitchMap$com$smaato$sdk$core$api$ApiResponseMapper$MappingException$Type */
        static final /* synthetic */ int[] f27126x137c019c;
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$network$SomaException$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(2:27|28)|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00a9 */
        static {
            /*
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type[] r0 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27126x137c019c = r0
                r1 = 1
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r2 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.NO_AD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r3 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_AD_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r4 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.UNEXPECTED_AD_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_CONTENT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_MIME_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_CHARSET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.MISSING_BODY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.EMPTY_BODY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.ERROR_READING_BODY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r6 = 9
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.UNEXPECTED_HTTP_RESPONSE_CODE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r6 = 10
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r4 = f27126x137c019c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.core.api.ApiResponseMapper$MappingException$Type r5 = com.smaato.sdk.core.api.ApiResponseMapper.MappingException.Type.GENERIC     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r6 = 11
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                com.smaato.sdk.core.network.SomaException$Type[] r4 = com.smaato.sdk.core.network.SomaException.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$com$smaato$sdk$core$network$SomaException$Type = r4
                com.smaato.sdk.core.network.SomaException$Type r5 = com.smaato.sdk.core.network.SomaException.Type.NO_CONTENT     // Catch:{ NoSuchFieldError -> 0x0095 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0095 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0095 }
            L_0x0095:
                int[] r1 = $SwitchMap$com$smaato$sdk$core$network$SomaException$Type     // Catch:{ NoSuchFieldError -> 0x009f }
                com.smaato.sdk.core.network.SomaException$Type r4 = com.smaato.sdk.core.network.SomaException.Type.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x009f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$SomaException$Type     // Catch:{ NoSuchFieldError -> 0x00a9 }
                com.smaato.sdk.core.network.SomaException$Type r1 = com.smaato.sdk.core.network.SomaException.Type.BAD_RESPONSE     // Catch:{ NoSuchFieldError -> 0x00a9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a9 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a9 }
            L_0x00a9:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$network$SomaException$Type     // Catch:{ NoSuchFieldError -> 0x00b3 }
                com.smaato.sdk.core.network.SomaException$Type r1 = com.smaato.sdk.core.network.SomaException.Type.TIMEOUT_ERROR     // Catch:{ NoSuchFieldError -> 0x00b3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b3 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00b3 }
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.api.ErrorMappingUtil.C109511.<clinit>():void");
        }
    }

    static ApiConnectorException mapApiResponseMapperErrorToApiConnectorException(ApiResponseMapper.MappingException mappingException) {
        ApiConnector.Error error;
        if (C109511.f27126x137c019c[mappingException.type.ordinal()] != 1) {
            error = ApiConnector.Error.RESPONSE_MAPPING;
        } else {
            error = ApiConnector.Error.NO_AD;
        }
        return new ApiConnectorException(error, mappingException);
    }
}
