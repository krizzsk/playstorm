package com.smaato.sdk.nativead.model.utils;

import android.util.JsonReader;
import android.util.JsonToken;
import com.smaato.sdk.nativead.NativeAdAssets;
import com.smaato.sdk.nativead.NativeAdLink;
import com.smaato.sdk.nativead.NativeAdResponse;
import com.smaato.sdk.nativead.NativeAdTracker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NativeMultiFormatJsonAdapter {
    private static final NativeAdLink EMPTY_LINK = NativeAdLink.create("", Collections.emptyList());
    private static final NativeAdTracker.Type[] E_TYPES = {null, NativeAdTracker.Type.IMPRESSION, NativeAdTracker.Type.VIEWABLE_MRC_50, NativeAdTracker.Type.VIEWABLE_MRC_100, NativeAdTracker.Type.VIEWABLE_VIDEO_50};
    private String mRaidContent = "";

    public NativeAdResponse fromJson(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("native".equals(jsonReader.nextName())) {
                NativeAdResponse.Builder link = NativeAdResponse.builder().trackers(Collections.emptyList()).link(EMPTY_LINK);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.peek() == JsonToken.NAME) {
                        String nextName = jsonReader.nextName();
                        nextName.hashCode();
                        char c = 65535;
                        switch (nextName.hashCode()) {
                            case -1408207997:
                                if (nextName.equals("assets")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case -702986027:
                                if (nextName.equals("eventtrackers")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case -314498168:
                                if (nextName.equals("privacy")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 3321850:
                                if (nextName.equals("link")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1052580871:
                                if (nextName.equals("imptrackers")) {
                                    c = 4;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            link.assets(readAssets(jsonReader));
                        } else if (c == 1) {
                            link.trackers(readEventTrackers(jsonReader));
                        } else if (c == 2) {
                            link.privacyUrl(jsonReader.nextString());
                        } else if (c == 3) {
                            link.link(readLink(jsonReader));
                        } else if (c != 4) {
                            jsonReader.skipValue();
                        } else {
                            link.trackers(readImpTrackers(jsonReader));
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                return link.build();
            }
            jsonReader.skipValue();
        }
        if (jsonReader.peek() != JsonToken.END_OBJECT) {
            return null;
        }
        jsonReader.endObject();
        return null;
    }

    private NativeAdLink readLink(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("url".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("clicktrackers".equals(nextName)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(jsonReader.nextString());
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return NativeAdLink.create(str, arrayList);
    }

    private NativeAdAssets readAssets(JsonReader jsonReader) throws IOException {
        NativeAdAssets.Builder builder = NativeAdAssets.builder();
        ArrayList arrayList = new ArrayList(3);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL || jsonReader.peek() != JsonToken.NAME) {
                    jsonReader.skipValue();
                } else {
                    String nextName = jsonReader.nextName();
                    nextName.hashCode();
                    char c = 65535;
                    switch (nextName.hashCode()) {
                        case 100897:
                            if (nextName.equals("ext")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 104387:
                            if (nextName.equals("img")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3076010:
                            if (nextName.equals("data")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 110371416:
                            if (nextName.equals("title")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 112202875:
                            if (nextName.equals("video")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        readMRAID(builder, jsonReader);
                    } else if (c != 1) {
                        if (c == 2) {
                            readData(builder, jsonReader);
                        } else if (c == 3) {
                            readTitle(builder, jsonReader);
                        } else if (c != 4) {
                            jsonReader.skipValue();
                        } else {
                            readVastTag(builder, jsonReader);
                        }
                    } else if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                        readImage(builder, jsonReader, arrayList);
                    } else {
                        jsonReader.skipValue();
                    }
                }
            }
            jsonReader.endObject();
        }
        builder.images(Collections.unmodifiableList(arrayList));
        if (jsonReader.peek() == JsonToken.END_OBJECT) {
            jsonReader.endObject();
        }
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        return builder.build();
    }

    private void readTitle(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if ("text".equals(jsonReader.nextName())) {
                builder.title(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private void readMRAID(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        if ("adm".equals(jsonReader.nextName())) {
            this.mRaidContent = jsonReader.nextString();
        }
        builder.mraidJs(this.mRaidContent);
    }

    private void readVastTag(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        builder.vastTag("vasttag".equals(jsonReader.nextName()) ? jsonReader.nextString() : "");
    }

    private List<NativeAdTracker> readImpTrackers(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String str = null;
            if (jsonReader.peek() != JsonToken.NULL) {
                str = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
            NativeAdTracker.Type[] typeArr = E_TYPES;
            if (1 < typeArr.length) {
                arrayList.add(str);
                arrayList2.add(NativeAdTracker.create(typeArr[1], str));
            }
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readImage(com.smaato.sdk.nativead.NativeAdAssets.Builder r13, android.util.JsonReader r14, java.util.List<com.smaato.sdk.nativead.NativeAdAssets.Image> r15) throws java.io.IOException {
        /*
            r12 = this;
            r14.beginObject()
            r0 = 0
            r1 = -1
            r2 = 0
            r3 = r0
            r4 = r1
            r5 = r4
        L_0x0009:
            boolean r6 = r14.hasNext()
            r7 = 3
            r8 = 1
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = r14.nextName()
            r6.hashCode()
            int r9 = r6.hashCode()
            r10 = 104(0x68, float:1.46E-43)
            r11 = 2
            if (r9 == r10) goto L_0x0051
            r10 = 119(0x77, float:1.67E-43)
            if (r9 == r10) goto L_0x0046
            r10 = 116079(0x1c56f, float:1.62661E-40)
            if (r9 == r10) goto L_0x003b
            r10 = 3575610(0x368f3a, float:5.010497E-39)
            if (r9 == r10) goto L_0x0030
            goto L_0x0059
        L_0x0030:
            java.lang.String r9 = "type"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0039
            goto L_0x0059
        L_0x0039:
            r6 = r7
            goto L_0x005c
        L_0x003b:
            java.lang.String r9 = "url"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x0044
            goto L_0x0059
        L_0x0044:
            r6 = r11
            goto L_0x005c
        L_0x0046:
            java.lang.String r9 = "w"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x004f
            goto L_0x0059
        L_0x004f:
            r6 = r8
            goto L_0x005c
        L_0x0051:
            java.lang.String r9 = "h"
            boolean r6 = r6.equals(r9)
            if (r6 != 0) goto L_0x005b
        L_0x0059:
            r6 = r1
            goto L_0x005c
        L_0x005b:
            r6 = r0
        L_0x005c:
            if (r6 == 0) goto L_0x007b
            if (r6 == r8) goto L_0x0076
            if (r6 == r11) goto L_0x006d
            if (r6 == r7) goto L_0x0068
            r14.skipValue()
            goto L_0x0009
        L_0x0068:
            int r3 = r14.nextInt()
            goto L_0x0009
        L_0x006d:
            java.lang.String r2 = r14.nextString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L_0x0009
        L_0x0076:
            int r4 = r14.nextInt()
            goto L_0x0009
        L_0x007b:
            int r5 = r14.nextInt()
            goto L_0x0009
        L_0x0080:
            r14.endObject()
            if (r8 != r3) goto L_0x008d
            com.smaato.sdk.nativead.NativeAdAssets$Image r14 = com.smaato.sdk.nativead.NativeAdAssets.Image.create(r2, r4, r5)
            r13.icon(r14)
            goto L_0x0096
        L_0x008d:
            if (r7 != r3) goto L_0x0096
            com.smaato.sdk.nativead.NativeAdAssets$Image r13 = com.smaato.sdk.nativead.NativeAdAssets.Image.create(r2, r4, r5)
            r15.add(r13)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.nativead.model.utils.NativeMultiFormatJsonAdapter.readImage(com.smaato.sdk.nativead.NativeAdAssets$Builder, android.util.JsonReader, java.util.List):void");
    }

    private void readData(NativeAdAssets.Builder builder, JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int i = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("type")) {
                i = jsonReader.nextInt();
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        if (str != null) {
            if (i == 1) {
                builder.sponsored(str);
            } else if (i == 2) {
                builder.text(str);
            } else if (i == 3) {
                builder.rating(Double.valueOf(Double.parseDouble(str)));
            } else if (i == 12) {
                builder.cta(str);
            }
        }
    }

    private List<NativeAdTracker> readEventTrackers(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            int i = 1;
            String str = null;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (nextName.equals("url")) {
                    str = jsonReader.nextString();
                } else if (!nextName.equals("event")) {
                    jsonReader.skipValue();
                } else {
                    i = jsonReader.nextInt();
                }
            }
            jsonReader.endObject();
            if (i > 0) {
                NativeAdTracker.Type[] typeArr = E_TYPES;
                if (i < typeArr.length) {
                    arrayList.add(NativeAdTracker.create(typeArr[i], str));
                }
            }
            if (i == 555) {
                arrayList.add(NativeAdTracker.create(NativeAdTracker.Type.OPEN_MEASUREMENT, str));
            }
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }
}
