package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Jsons;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdResponse;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser */
public class RichMediaAdResponseParser {
    private final Logger logger;

    public RichMediaAdResponseParser(Logger logger2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    public RichMediaAdResponse parseResponse(String str, ImpressionCountingType impressionCountingType) throws ParsingException {
        RichMediaAdResponse.Builder builder = new RichMediaAdResponse.Builder();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("richmedia");
            List<String> stringList = Jsons.toStringList(jSONObject.getJSONArray("impressiontrackers"));
            List<String> stringList2 = Jsons.toStringList(jSONObject.getJSONArray("clicktrackers"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("mediadata");
            builder.setContent(jSONObject2.getString("content")).setWidth(Integer.parseInt(jSONObject2.getString("w"))).setHeight(Integer.parseInt(jSONObject2.getString("h"))).setImpressionTrackingUrls(stringList).setClickTrackingUrls(stringList2).setImpressionCountingType(impressionCountingType);
            return builder.build();
        } catch (NumberFormatException | JSONException e) {
            String format = String.format("Invalid JSON content: %s", new Object[]{str});
            this.logger.error(LogDomain.AD, e, format, new Object[0]);
            throw new ParsingException(format, e);
        } catch (Exception e2) {
            this.logger.error(LogDomain.AD, e2, "Cannot build RichMediaAdResponse due to validation error", new Object[0]);
            throw new ParsingException("Cannot build RichMediaAdResponse due to validation error", e2);
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser$ParsingException */
    static class ParsingException extends Exception {
        ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }
}
