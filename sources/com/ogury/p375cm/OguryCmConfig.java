package com.ogury.p375cm;

import com.ogury.p375cm.internal.bbabb;

/* renamed from: com.ogury.cm.OguryCmConfig */
public final class OguryCmConfig {
    private final int ccpafVersion;
    private final int tcfVersion;

    public OguryCmConfig() {
        this(2, 1);
    }

    public OguryCmConfig(int i, int i2) {
        this.tcfVersion = i;
        this.ccpafVersion = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OguryCmConfig(int i, int i2, int i3, bbabb bbabb) {
        this((i3 & 1) != 0 ? 2 : i, (i3 & 2) != 0 ? 1 : i2);
    }

    public static /* synthetic */ OguryCmConfig copy$default(OguryCmConfig oguryCmConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = oguryCmConfig.tcfVersion;
        }
        if ((i3 & 2) != 0) {
            i2 = oguryCmConfig.ccpafVersion;
        }
        return oguryCmConfig.copy(i, i2);
    }

    public final int component1() {
        return this.tcfVersion;
    }

    public final int component2() {
        return this.ccpafVersion;
    }

    public final OguryCmConfig copy(int i, int i2) {
        return new OguryCmConfig(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OguryCmConfig) {
                OguryCmConfig oguryCmConfig = (OguryCmConfig) obj;
                if (this.tcfVersion == oguryCmConfig.tcfVersion) {
                    if (this.ccpafVersion == oguryCmConfig.ccpafVersion) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getCcpafVersion() {
        return this.ccpafVersion;
    }

    public final int getTcfVersion() {
        return this.tcfVersion;
    }

    public final int hashCode() {
        return (this.tcfVersion * 31) + this.ccpafVersion;
    }

    public final String toString() {
        return "OguryCmConfig(tcfVersion=" + this.tcfVersion + ", ccpafVersion=" + this.ccpafVersion + ")";
    }
}
