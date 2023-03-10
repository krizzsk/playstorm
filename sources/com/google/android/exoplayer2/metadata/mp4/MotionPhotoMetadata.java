package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.primitives.Longs;
import com.ironsource.mediationsdk.logger.IronSourceError;

public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() {
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    public int describeContents() {
        return 0;
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.photoStartPosition = j;
        this.photoSize = j2;
        this.photoPresentationTimestampUs = j3;
        this.videoStartPosition = j4;
        this.videoSize = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Longs.hashCode(this.photoStartPosition)) * 31) + Longs.hashCode(this.photoSize)) * 31) + Longs.hashCode(this.photoPresentationTimestampUs)) * 31) + Longs.hashCode(this.videoStartPosition)) * 31) + Longs.hashCode(this.videoSize);
    }

    public String toString() {
        long j = this.photoStartPosition;
        long j2 = this.photoSize;
        long j3 = this.photoPresentationTimestampUs;
        long j4 = this.videoStartPosition;
        long j5 = this.videoSize;
        StringBuilder sb = new StringBuilder(218);
        sb.append("Motion photo metadata: photoStartPosition=");
        sb.append(j);
        sb.append(", photoSize=");
        sb.append(j2);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(j3);
        sb.append(", videoStartPosition=");
        sb.append(j4);
        sb.append(", videoSize=");
        sb.append(j5);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }
}
