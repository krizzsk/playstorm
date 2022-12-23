package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: id */
    public final String f21675id;

    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.f21675id = (String) Assertions.checkNotNull(str);
    }

    public String toString() {
        return this.f21675id;
    }
}
