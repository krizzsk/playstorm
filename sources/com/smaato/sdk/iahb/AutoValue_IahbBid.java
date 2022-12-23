package com.smaato.sdk.iahb;

import com.smaato.sdk.iahb.IahbBid;

final class AutoValue_IahbBid extends IahbBid {
    private final String adm;
    private final IahbExt ext;

    private AutoValue_IahbBid(String str, IahbExt iahbExt) {
        this.adm = str;
        this.ext = iahbExt;
    }

    /* access modifiers changed from: package-private */
    public String adm() {
        return this.adm;
    }

    /* access modifiers changed from: package-private */
    public IahbExt ext() {
        return this.ext;
    }

    public String toString() {
        return "IahbBid{adm=" + this.adm + ", ext=" + this.ext + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IahbBid)) {
            return false;
        }
        IahbBid iahbBid = (IahbBid) obj;
        if (!this.adm.equals(iahbBid.adm()) || !this.ext.equals(iahbBid.ext())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.adm.hashCode() ^ 1000003) * 1000003) ^ this.ext.hashCode();
    }

    static final class Builder extends IahbBid.Builder {
        private String adm;
        private IahbExt ext;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public IahbBid.Builder adm(String str) {
            if (str != null) {
                this.adm = str;
                return this;
            }
            throw new NullPointerException("Null adm");
        }

        /* access modifiers changed from: package-private */
        public IahbBid.Builder ext(IahbExt iahbExt) {
            if (iahbExt != null) {
                this.ext = iahbExt;
                return this;
            }
            throw new NullPointerException("Null ext");
        }

        /* access modifiers changed from: package-private */
        public IahbBid autoBuild() {
            String str = "";
            if (this.adm == null) {
                str = str + " adm";
            }
            if (this.ext == null) {
                str = str + " ext";
            }
            if (str.isEmpty()) {
                return new AutoValue_IahbBid(this.adm, this.ext);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }
}
