package com.p374my.tracker.config;

import android.os.Build;

/* renamed from: com.my.tracker.config.AntiFraudConfig */
public final class AntiFraudConfig {
    public final boolean useGyroscope;
    public final boolean useLightSensor;
    public final boolean useMagneticFieldSensor;
    public final boolean usePressureSensor;
    public final boolean useProximitySensor;

    /* renamed from: com.my.tracker.config.AntiFraudConfig$Builder */
    public static final class Builder {
        boolean useGyroscope;
        boolean useLightSensor;
        boolean useMagneticFieldSensor;
        boolean usePressureSensor;
        boolean useProximitySensor;

        Builder() {
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            this.useLightSensor = i <= 30;
            this.useMagneticFieldSensor = true;
            this.useGyroscope = true;
            this.usePressureSensor = true;
            if (i <= 30 && !Build.MODEL.equals("Pixel 5")) {
                z = true;
            }
            this.useProximitySensor = z;
        }

        public AntiFraudConfig build() {
            return new AntiFraudConfig(this.useLightSensor, this.useMagneticFieldSensor, this.useGyroscope, this.usePressureSensor, this.useProximitySensor);
        }

        public Builder useGyroscopeSensor(boolean z) {
            this.useGyroscope = z;
            return this;
        }

        public Builder useLightSensor(boolean z) {
            this.useLightSensor = z;
            return this;
        }

        public Builder useMagneticFieldSensor(boolean z) {
            this.useMagneticFieldSensor = z;
            return this;
        }

        public Builder usePressureSensor(boolean z) {
            this.usePressureSensor = z;
            return this;
        }

        public Builder useProximitySensor(boolean z) {
            this.useProximitySensor = z;
            return this;
        }
    }

    AntiFraudConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.useLightSensor = z;
        this.useMagneticFieldSensor = z2;
        this.useGyroscope = z3;
        this.usePressureSensor = z4;
        this.useProximitySensor = z5;
    }

    public static Builder newBuilder() {
        return new Builder();
    }
}
