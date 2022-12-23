package com.amazon.device.ads;

/* compiled from: MraidProperty */
class StateProperty extends MraidStringProperty {
    MraidStateType stateType;

    StateProperty(MraidStateType mraidStateType) {
        super("state");
        this.stateType = mraidStateType;
    }

    /* access modifiers changed from: package-private */
    public String getValue() {
        return this.stateType.toString();
    }
}
