package com.vungle.warren.model;

import com.facebook.internal.security.CertificateUtil;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Objects;

public class CacheBust {
    public static final int EVENT_TYPE_CAMPAIGN = 1;
    public static final int EVENT_TYPE_CREATIVE = 2;
    private static final String TAG = CacheBust.class.getSimpleName();
    String[] eventIds;
    @SerializedName("id")

    /* renamed from: id */
    String f29330id;
    int idType;
    @SerializedName("timestamp_bust_end")
    long timeWindowEnd;
    @SerializedName("timestamp_processed")
    long timestampProcessed;

    public @interface EventType {
    }

    public String calculateId() {
        return this.f29330id + CertificateUtil.DELIMITER + this.timeWindowEnd;
    }

    public String getId() {
        return this.f29330id;
    }

    public void setId(String str) {
        this.f29330id = str;
    }

    public long getTimeWindowEnd() {
        return this.timeWindowEnd;
    }

    public void setTimeWindowEnd(long j) {
        this.timeWindowEnd = j;
    }

    public int getIdType() {
        return this.idType;
    }

    public void setIdType(int i) {
        this.idType = i;
    }

    public String[] getEventIds() {
        return this.eventIds;
    }

    public void setEventIds(String[] strArr) {
        this.eventIds = strArr;
    }

    public long getTimestampProcessed() {
        return this.timestampProcessed;
    }

    public void setTimestampProcessed(long j) {
        this.timestampProcessed = j;
    }

    public static CacheBust fromJson(JsonObject jsonObject) {
        return (CacheBust) new GsonBuilder().create().fromJson((JsonElement) jsonObject, CacheBust.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CacheBust cacheBust = (CacheBust) obj;
        if (this.idType == cacheBust.idType && this.timestampProcessed == cacheBust.timestampProcessed && this.f29330id.equals(cacheBust.f29330id) && this.timeWindowEnd == cacheBust.timeWindowEnd && Arrays.equals(this.eventIds, cacheBust.eventIds)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Objects.hash(new Object[]{this.f29330id, Long.valueOf(this.timeWindowEnd), Integer.valueOf(this.idType), Long.valueOf(this.timestampProcessed)}) * 31) + Arrays.hashCode(this.eventIds);
    }

    public String toString() {
        return "CacheBust{id='" + this.f29330id + '\'' + ", timeWindowEnd=" + this.timeWindowEnd + ", idType=" + this.idType + ", eventIds=" + Arrays.toString(this.eventIds) + ", timestampProcessed=" + this.timestampProcessed + '}';
    }
}
