package com.smaato.sdk.video.vast.build;

import android.text.TextUtils;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.Call;
import com.smaato.sdk.core.network.Callback;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.exceptions.wrapper.GeneralWrapperErrorException;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseResult;
import com.smaato.sdk.video.vast.parser.VastResponseParser;

public class WrapperLoader {
    private final HttpClient httpClient;
    /* access modifiers changed from: private */
    public final VastResponseParser vastResponseParser;

    public WrapperLoader(VastResponseParser vastResponseParser2, HttpClient httpClient2) {
        this.vastResponseParser = (VastResponseParser) Objects.requireNonNull(vastResponseParser2);
        this.httpClient = (HttpClient) Objects.requireNonNull(httpClient2);
    }

    /* access modifiers changed from: package-private */
    public void loadWrapper(final Logger logger, final String str, final NonNullConsumer<ParseResult<VastTree>> nonNullConsumer) {
        if (str == null || TextUtils.isEmpty(str)) {
            nonNullConsumer.accept(ParseResult.error(Wrapper.VAST_AD_TAG_URI, new GeneralWrapperErrorException("Cannot resolve wrapper: vastAdTagUri is missing")));
            return;
        }
        this.httpClient.newCall(Request.get(str)).enqueue(new Callback() {
            public void onResponse(Call call, Response response) {
                if (response.responseCode() == 200) {
                    WrapperLoader.this.vastResponseParser.parseVastResponse(logger, response.body().source(), response.encoding(), nonNullConsumer);
                    return;
                }
                String format = String.format("Failed to load Vast url: %s response code: %d", new Object[]{str, Integer.valueOf(response.responseCode())});
                logger.error(LogDomain.VAST, format, new Object[0]);
                nonNullConsumer.accept(ParseResult.error("Wrapper", new GeneralWrapperErrorException(format)));
            }

            public void onFailure(Call call, Exception exc) {
                String format = String.format("Failed to load Vast url: %s due to error: %s", new Object[]{str, exc});
                logger.error(LogDomain.VAST, format, new Object[0]);
                nonNullConsumer.accept(ParseResult.error("Wrapper", new GeneralWrapperErrorException(format)));
            }
        });
    }
}
