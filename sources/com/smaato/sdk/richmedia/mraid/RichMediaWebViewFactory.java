package com.smaato.sdk.richmedia.mraid;

import android.content.Context;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.richmedia.util.RichMediaHtmlUtils;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;

public class RichMediaWebViewFactory {
    private final RichMediaHtmlUtils htmlUtils;
    private final Logger logger;

    public RichMediaWebViewFactory(Logger logger2, RichMediaHtmlUtils richMediaHtmlUtils) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.htmlUtils = (RichMediaHtmlUtils) Objects.requireNonNull(richMediaHtmlUtils);
    }

    public RichMediaWebView create(Context context) {
        return new RichMediaWebView(context, this.logger, this.htmlUtils);
    }
}
