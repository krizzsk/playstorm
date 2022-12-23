package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id */
    public final String f14472id;

    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.f14472id = str;
    }

    public String toString() {
        return this.f14472id;
    }
}
