package com.smaato.sdk.iahb;

import android.util.JsonReader;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.iahb.IahbBid;
import com.smaato.sdk.iahb.IahbExt;
import com.smaato.sdk.iahb.IahbResponse;
import java.io.IOException;

final class IahbJsonAdapter {
    private final Logger logger;

    public IahbJsonAdapter(Logger logger2) {
        this.logger = logger2;
    }

    public IahbResponse fromJson(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            try {
                return readResponse(jsonReader);
            } catch (IllegalStateException e) {
                throw new IOException(e);
            }
        } else {
            throw new NullPointerException("'reader' specified as non-null is null");
        }
    }

    private IahbResponse readResponse(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            IahbResponse.Builder builder = IahbResponse.builder();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (nextName.equals("bidid")) {
                    builder.bidId(jsonReader.nextString());
                } else if (!nextName.equals("seatbid")) {
                    jsonReader.skipValue();
                } else {
                    IahbBid readSeatBid = readSeatBid(jsonReader);
                    if (readSeatBid != null) {
                        builder.bid(readSeatBid);
                    }
                }
            }
            jsonReader.endObject();
            return builder.build();
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    private IahbBid readSeatBid(JsonReader jsonReader) throws IOException {
        IahbBid iahbBid;
        if (jsonReader != null) {
            jsonReader.beginArray();
            do {
                try {
                    iahbBid = null;
                    if (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            if (BidResponsed.KEY_BID_ID.equals(jsonReader.nextName())) {
                                iahbBid = readBid(jsonReader);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.endArray();
                        return null;
                    }
                } finally {
                    jsonReader.endArray();
                }
            } while (iahbBid == null);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return iahbBid;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    private IahbBid readBid(JsonReader jsonReader) throws IOException {
        IahbBid build;
        if (jsonReader != null) {
            jsonReader.beginArray();
            do {
                try {
                    if (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        IahbBid.Builder builder = IahbBid.builder();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            char c = 65535;
                            int hashCode = nextName.hashCode();
                            if (hashCode != 96426) {
                                if (hashCode == 100897) {
                                    if (nextName.equals("ext")) {
                                        c = 1;
                                    }
                                }
                            } else if (nextName.equals("adm")) {
                                c = 0;
                            }
                            if (c == 0) {
                                builder.adm(jsonReader.nextString());
                            } else if (c != 1) {
                                jsonReader.skipValue();
                            } else {
                                IahbExt readExt = readExt(jsonReader);
                                if (readExt != null) {
                                    builder.ext(readExt);
                                }
                            }
                        }
                        jsonReader.endObject();
                        build = builder.build(this.logger);
                    } else {
                        jsonReader.endArray();
                        return null;
                    }
                } finally {
                    jsonReader.endArray();
                }
            } while (build == null);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return build;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }

    /* JADX INFO: finally extract failed */
    private IahbExt readExt(JsonReader jsonReader) throws IOException {
        if (jsonReader != null) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                try {
                    if ("smt".equals(jsonReader.nextName())) {
                        IahbExt.Builder builder = IahbExt.builder();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            char c = 65535;
                            int hashCode = nextName.hashCode();
                            if (hashCode != -1422011939) {
                                if (hashCode != -1309235404) {
                                    if (hashCode != -1001268717) {
                                        if (hashCode == 1240754974) {
                                            if (nextName.equals("adspaceid")) {
                                                c = 0;
                                            }
                                        }
                                    } else if (nextName.equals("impressionmeasurement")) {
                                        c = 3;
                                    }
                                } else if (nextName.equals("expires")) {
                                    c = 2;
                                }
                            } else if (nextName.equals("adtype")) {
                                c = 1;
                            }
                            if (c == 0) {
                                builder.adspaceid(jsonReader.nextString());
                            } else if (c == 1) {
                                builder.adtype(jsonReader.nextString());
                            } else if (c == 2) {
                                builder.expiresAt(jsonReader.nextLong());
                            } else if (c != 3) {
                                jsonReader.skipValue();
                            } else {
                                builder.impressionMeasurement(jsonReader.nextString().equalsIgnoreCase("viewable") ? ImpressionCountingType.VIEWABLE : ImpressionCountingType.STANDARD);
                            }
                        }
                        jsonReader.endObject();
                        IahbExt build = builder.build();
                        jsonReader.endObject();
                        return build;
                    }
                    jsonReader.skipValue();
                } catch (Throwable th) {
                    jsonReader.endObject();
                    throw th;
                }
            }
            jsonReader.endObject();
            return null;
        }
        throw new NullPointerException("'reader' specified as non-null is null");
    }
}
