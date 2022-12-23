package com.iab.omid.library.fyber.adsession;

import android.view.View;
import com.iab.omid.library.fyber.p247d.C7808e;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;

public abstract class AdSession {
    public static AdSession createAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        C7808e.m21941a();
        C7808e.m21944a((Object) adSessionConfiguration, "AdSessionConfiguration is null");
        C7808e.m21944a((Object) adSessionContext, "AdSessionContext is null");
        return new C7787a(adSessionConfiguration, adSessionContext);
    }

    public abstract void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

    public abstract void error(ErrorType errorType, String str);

    public abstract void finish();

    public abstract String getAdSessionId();

    public abstract AdSessionStatePublisher getAdSessionStatePublisher();

    public abstract void registerAdView(View view);

    public abstract void removeAllFriendlyObstructions();

    public abstract void removeFriendlyObstruction(View view);

    public abstract void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener);

    public abstract void start();
}
