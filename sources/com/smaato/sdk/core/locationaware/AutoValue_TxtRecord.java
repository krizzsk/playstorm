package com.smaato.sdk.core.locationaware;

final class AutoValue_TxtRecord extends TxtRecord {
    private final String data;
    private final int ttl;

    AutoValue_TxtRecord(String str, int i) {
        if (str != null) {
            this.data = str;
            this.ttl = i;
            return;
        }
        throw new NullPointerException("Null data");
    }

    public String data() {
        return this.data;
    }

    public int ttl() {
        return this.ttl;
    }

    public String toString() {
        return "TxtRecord{data=" + this.data + ", ttl=" + this.ttl + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TxtRecord)) {
            return false;
        }
        TxtRecord txtRecord = (TxtRecord) obj;
        if (!this.data.equals(txtRecord.data()) || this.ttl != txtRecord.ttl()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.data.hashCode() ^ 1000003) * 1000003) ^ this.ttl;
    }
}
