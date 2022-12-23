package com.smaato.sdk.core.gdpr.tcfv2.encoder.segment;

public final class SegmentEncoderMap {
    private static final SegmentEncoderMap instance = new SegmentEncoderMap();

    private SegmentEncoderMap() {
    }

    public static SegmentEncoderMap getInstance() {
        return instance;
    }

    public CoreTCEncoder getCore() {
        return CoreTCEncoder.getInstance();
    }

    public OOBVendorsEncoder getVendorsDisclosed() {
        return OOBVendorsEncoder.getInstance();
    }

    public OOBVendorsEncoder getVendorsAllowed() {
        return OOBVendorsEncoder.getInstance();
    }

    public PublisherTCEncoder getPublisherTC() {
        return PublisherTCEncoder.getInstance();
    }
}
