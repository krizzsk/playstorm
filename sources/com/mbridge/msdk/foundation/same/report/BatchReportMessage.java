package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BatchReportMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }
    };

    /* renamed from: a */
    private String f20632a;

    /* renamed from: b */
    private String f20633b;

    /* renamed from: c */
    private long f20634c;

    public int describeContents() {
        return 0;
    }

    public BatchReportMessage(String str, String str2, long j) {
        this.f20632a = str;
        this.f20633b = str2;
        this.f20634c = j;
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f20632a = parcel.readString();
        this.f20633b = parcel.readString();
        this.f20634c = parcel.readLong();
    }

    public String getUuid() {
        return this.f20632a;
    }

    public void setUuid(String str) {
        this.f20632a = str;
    }

    public String getReportMessage() {
        return this.f20633b;
    }

    public void setReportMessage(String str) {
        this.f20633b = str;
    }

    public long getTimestamp() {
        return this.f20634c;
    }

    public void setTimestamp(long j) {
        this.f20634c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20632a);
        parcel.writeString(this.f20633b);
        parcel.writeLong(this.f20634c);
    }
}
