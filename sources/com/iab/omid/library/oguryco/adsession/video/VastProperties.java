package com.iab.omid.library.oguryco.adsession.video;

import com.iab.omid.library.oguryco.adsession.media.Position;
import com.iab.omid.library.oguryco.p271d.C8010e;

public final class VastProperties {

    /* renamed from: a */
    private final boolean f19009a;

    /* renamed from: b */
    private final Float f19010b;

    /* renamed from: c */
    private final boolean f19011c;

    /* renamed from: d */
    private final Position f19012d;

    /* renamed from: e */
    private com.iab.omid.library.oguryco.adsession.media.VastProperties f19013e;

    private VastProperties(boolean z, Float f, boolean z2, Position position, com.iab.omid.library.oguryco.adsession.media.VastProperties vastProperties) {
        this.f19009a = z;
        this.f19010b = f;
        this.f19011c = z2;
        this.f19012d = position;
        this.f19013e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z, Position position) {
        C8010e.m22850a((Object) position, "Position is null");
        return new VastProperties(false, (Float) null, z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z, Position position) {
        C8010e.m22850a((Object) position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position, com.iab.omid.library.oguryco.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, Position.valueOf(position.toString().toUpperCase())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final com.iab.omid.library.oguryco.adsession.media.VastProperties mo55776a() {
        return this.f19013e;
    }

    public final Position getPosition() {
        return this.f19012d;
    }

    public final Float getSkipOffset() {
        return this.f19010b;
    }

    public final boolean isAutoPlay() {
        return this.f19011c;
    }

    public final boolean isSkippable() {
        return this.f19009a;
    }
}
