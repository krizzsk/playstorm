package com.smaato.sdk.iahb;

import com.smaato.sdk.iahb.IahbResponse;

final class AutoValue_IahbResponse extends IahbResponse {
    private final IahbBid bid;
    private final String bidId;

    private AutoValue_IahbResponse(String str, IahbBid iahbBid) {
        this.bidId = str;
        this.bid = iahbBid;
    }

    /* access modifiers changed from: package-private */
    public String bidId() {
        return this.bidId;
    }

    /* access modifiers changed from: package-private */
    public IahbBid bid() {
        return this.bid;
    }

    public String toString() {
        return "IahbResponse{bidId=" + this.bidId + ", bid=" + this.bid + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbResponse)) {
            return false;
        }
        IahbResponse iahbResponse = (IahbResponse) obj;
        if (!this.bidId.equals(iahbResponse.bidId()) || !this.bid.equals(iahbResponse.bid())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.bidId.hashCode() ^ 1000003) * 1000003) ^ this.bid.hashCode();
    }

    static final class Builder extends IahbResponse.Builder {
        private IahbBid bid;
        private String bidId;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public IahbResponse.Builder bidId(String str) {
            if (str != null) {
                this.bidId = str;
                return this;
            }
            throw new NullPointerException("Null bidId");
        }

        /* access modifiers changed from: package-private */
        public IahbResponse.Builder bid(IahbBid iahbBid) {
            if (iahbBid != null) {
                this.bid = iahbBid;
                return this;
            }
            throw new NullPointerException("Null bid");
        }

        /* access modifiers changed from: package-private */
        public IahbResponse build() {
            String str = "";
            if (this.bidId == null) {
                str = str + " bidId";
            }
            if (this.bid == null) {
                str = str + " bid";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbResponse(this.bidId, this.bid);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
