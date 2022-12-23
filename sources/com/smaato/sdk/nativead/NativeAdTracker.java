package com.smaato.sdk.nativead;

public abstract class NativeAdTracker {
    public abstract Type type();

    public abstract String url();

    public static NativeAdTracker create(Type type, String str) {
        return new AutoValue_NativeAdTracker(type, str);
    }

    public enum Type {
        IMPRESSION("Impression"),
        VIEWABLE_MRC_50("Visible impression using MRC definition at 50% in view for 1 second"),
        VIEWABLE_MRC_100("100% in view for 1 second (ie GroupM standard)"),
        VIEWABLE_VIDEO_50("Visible impression for video using MRC definition at 50% in view for 2 seconds"),
        OPEN_MEASUREMENT("Tracker Url to report for open measurement native display");
        
        private final String spec;

        private Type(String str) {
            this.spec = str;
        }

        public String toString() {
            return name() + "(" + this.spec + ")";
        }
    }
}
