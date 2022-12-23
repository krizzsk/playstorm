package com.smaato.sdk.core.csm;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.csm.CsmAdResponse;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class CsmAdResponseParser {
    private final Logger logger;

    public CsmAdResponseParser(Logger logger2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    public CsmAdResponse parseResponse(String str, ImpressionCountingType impressionCountingType) throws ParsingException {
        CsmAdResponse.Builder builder = CsmAdResponse.builder();
        try {
            JSONObject jSONObject = new JSONObject(str);
            List<Network> parseNetworks = parseNetworks(jSONObject.getJSONArray("networks"));
            String string = jSONObject.getString("sessionid");
            builder.setNetworks(parseNetworks).setSessionId(string).setPassback(jSONObject.getString("passback")).setImpressionCountingType(impressionCountingType);
            return builder.build();
        } catch (NumberFormatException | JSONException e) {
            String format = String.format("Invalid JSON content: %s", new Object[]{str});
            this.logger.error(LogDomain.AD, e, format, new Object[0]);
            throw new ParsingException(format, e);
        } catch (Exception e2) {
            this.logger.error(LogDomain.AD, e2, "Cannot build CsmAdResponse due to validation error", new Object[0]);
            throw new ParsingException("Cannot build CsmAdResponse due to validation error", e2);
        }
    }

    private List<Network> parseNetworks(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("name");
            int i2 = jSONObject.getInt("priority");
            int i3 = jSONObject.getInt("width");
            int i4 = jSONObject.getInt("height");
            String string2 = jSONObject.getString("impression");
            String string3 = jSONObject.getString("clickurl");
            String optString = jSONObject.optString("adunitid");
            String optString2 = jSONObject.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            arrayList.add(Network.builder().setName(string).setPriority(i2).setWidth(i3).setHeight(i4).setImpression(string2).setClickUrl(string3).setAdUnitId(optString).setClassName(optString2).setCustomData(jSONObject.optString("customdata")).build());
        }
        return arrayList;
    }

    public static class ParsingException extends Exception {
        public ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }

    private static class ResponseFields {
        private ResponseFields() {
        }
    }
}
