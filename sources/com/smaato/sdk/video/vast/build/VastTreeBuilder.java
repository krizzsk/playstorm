package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.build.VastResult;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.parser.ParseResult;
import com.smaato.sdk.video.vast.parser.VastResponseParser;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class VastTreeBuilder {
    private final VastResponseParser vastResponseParser;
    private final WrapperResolver wrapperResolver;

    public VastTreeBuilder(VastResponseParser vastResponseParser2, WrapperResolver wrapperResolver2) {
        this.vastResponseParser = (VastResponseParser) Objects.requireNonNull(vastResponseParser2);
        this.wrapperResolver = (WrapperResolver) Objects.requireNonNull(wrapperResolver2);
    }

    public void buildVastTree(Logger logger, SomaApiContext somaApiContext, InputStream inputStream, String str, NonNullConsumer<VastResult<VastTree>> nonNullConsumer) {
        Objects.requireNonNull(logger);
        Objects.requireNonNull(somaApiContext);
        Objects.requireNonNull(inputStream);
        this.vastResponseParser.parseVastResponse(logger, inputStream, str, getParseResultConsumer(logger, somaApiContext, nonNullConsumer));
    }

    private NonNullConsumer<ParseResult<VastTree>> getParseResultConsumer(Logger logger, SomaApiContext somaApiContext, NonNullConsumer<VastResult<VastTree>> nonNullConsumer) {
        return new NonNullConsumer(nonNullConsumer, logger, somaApiContext) {
            public final /* synthetic */ NonNullConsumer f$1;
            public final /* synthetic */ Logger f$2;
            public final /* synthetic */ SomaApiContext f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                VastTreeBuilder.this.lambda$getParseResultConsumer$1$VastTreeBuilder(this.f$1, this.f$2, this.f$3, (ParseResult) obj);
            }
        };
    }

    public /* synthetic */ void lambda$getParseResultConsumer$1$VastTreeBuilder(NonNullConsumer nonNullConsumer, Logger logger, SomaApiContext somaApiContext, ParseResult parseResult) {
        HashSet hashSet = new HashSet();
        VastTree vastTree = (VastTree) parseResult.value;
        if (vastTree != null) {
            if (vastTree.ads.isEmpty() && !parseResult.errors.isEmpty()) {
                nonNullConsumer.accept(VastResult.error((Set<Integer>) Collections.singleton(100)));
            }
            this.wrapperResolver.resolveWrappers(logger, somaApiContext, vastTree, true, 0, new NonNullConsumer(hashSet, nonNullConsumer) {
                public final /* synthetic */ Set f$0;
                public final /* synthetic */ NonNullConsumer f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    VastTreeBuilder.lambda$getParseResultConsumer$0(this.f$0, this.f$1, (VastResult) obj);
                }
            });
            return;
        }
        nonNullConsumer.accept(VastResult.error((Set<Integer>) Collections.singleton(100)));
    }

    static /* synthetic */ void lambda$getParseResultConsumer$0(Set set, NonNullConsumer nonNullConsumer, VastResult vastResult) {
        VastResult.Builder builder = new VastResult.Builder();
        set.addAll(vastResult.errors);
        builder.setErrors(set).setResult((VastTree) vastResult.value);
        nonNullConsumer.accept(builder.build());
    }
}
