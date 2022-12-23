package com.smaato.sdk.image.p383ad;

import android.util.Log;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Jsons;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.image.p383ad.ImageAdResponse;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.smaato.sdk.image.ad.ImageAdResponseParser */
public class ImageAdResponseParser {
    private final Logger logger;

    public ImageAdResponseParser(Logger logger2) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for ImageAdResponseParser::new");
    }

    public ImageAdResponse parseResponse(String str, ImpressionCountingType impressionCountingType) throws ParsingException {
        ImageAdResponse.Builder builder = new ImageAdResponse.Builder();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("image");
            builder.setImpressionTrackingUrls(Jsons.toStringList(jSONObject.getJSONArray("impressiontrackers")));
            builder.setClickTrackingUrls(Jsons.toStringList(jSONObject.getJSONArray("clicktrackers")));
            if (!jSONObject.isNull("ext")) {
                builder.setExtensions(getExtensionList(jSONObject.getJSONObject("ext").getJSONArray("smaatoexts")));
            } else {
                Log.i("Error", "Missing ext key in Json response");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("img");
            String string = jSONObject2.getString("url");
            String string2 = jSONObject2.getString("w");
            String string3 = jSONObject2.getString("h");
            builder.setImageUrl(string).setWidth(Integer.parseInt(string2)).setHeight(Integer.parseInt(string3)).setClickUrl(jSONObject2.getString("ctaurl")).setImpressionCountingType(impressionCountingType);
            return builder.build();
        } catch (NumberFormatException | JSONException e) {
            String format = String.format("Invalid JSON content: %s", new Object[]{str});
            this.logger.error(LogDomain.AD, e, format, new Object[0]);
            throw new ParsingException(format, e);
        } catch (Exception e2) {
            this.logger.error(LogDomain.AD, e2, "Cannot build ImageAdResponse due to validation error", new Object[0]);
            throw new ParsingException("Cannot build ImageAdResponse due to validation error", e2);
        }
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdResponseParser$ParsingException */
    static class ParsingException extends Exception {
        ParsingException(String str, Throwable th) {
            super(str, th);
        }
    }

    private List<Extension> getExtensionList(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Extension extension = new Extension();
            extension.setName(jSONArray.getJSONObject(i).optString("name", ""));
            extension.setScript(jSONArray.getJSONObject(i).optString("script", ""));
            extension.setName(jSONArray.getJSONObject(i).optString("name", ""));
            extension.setExtConfig((JSONObject) java.util.Objects.requireNonNull(jSONArray.getJSONObject(i).optJSONObject("conf")));
            arrayList.add(extension);
        }
        return arrayList;
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdResponseParser$ResponseFields */
    protected static class ResponseFields {
        protected ResponseFields() {
        }
    }
}
