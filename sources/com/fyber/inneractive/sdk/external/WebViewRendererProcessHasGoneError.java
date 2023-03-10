package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;

public class WebViewRendererProcessHasGoneError extends InneractiveUnitController.AdDisplayError {
    public WebViewRendererProcessHasGoneError() {
        super("Web view renderer process has gone. Web view destroyed");
    }
}
