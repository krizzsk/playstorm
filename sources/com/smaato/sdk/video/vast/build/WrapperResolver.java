package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.video.p390fi.NonNullConsumer;
import com.smaato.sdk.video.vast.build.VastResult;
import com.smaato.sdk.video.vast.exceptions.wrapper.GeneralWrapperErrorException;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;
import com.smaato.sdk.video.vast.parser.ParseError;
import com.smaato.sdk.video.vast.parser.ParseResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WrapperResolver {
    private final InLineChecker inLineChecker;
    private final int maxDepth;
    private final WrapperAdContainerPicker wrapperAdContainerPicker;
    private final WrapperLoader wrapperLoader;

    public WrapperResolver(int i, WrapperLoader wrapperLoader2, InLineChecker inLineChecker2, WrapperAdContainerPicker wrapperAdContainerPicker2) {
        if (i >= 0) {
            this.inLineChecker = inLineChecker2;
            this.wrapperAdContainerPicker = wrapperAdContainerPicker2;
            this.maxDepth = i;
            this.wrapperLoader = wrapperLoader2;
            return;
        }
        throw new IllegalArgumentException("Cannot construct WrapperResolver: maxDepth can't be negative");
    }

    /* access modifiers changed from: package-private */
    public void resolveWrappers(Logger logger, SomaApiContext somaApiContext, VastTree vastTree, boolean z, int i, NonNullConsumer<VastResult<VastTree>> nonNullConsumer) {
        VastTree vastTree2 = vastTree;
        NonNullConsumer<VastResult<VastTree>> nonNullConsumer2 = nonNullConsumer;
        VastResult.Builder result = new VastResult.Builder().setResult(vastTree);
        boolean isEmpty = vastTree2.ads.isEmpty();
        Integer valueOf = Integer.valueOf(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR);
        if (isEmpty) {
            result.setErrors(Collections.singleton(valueOf));
            nonNullConsumer2.accept(result.build());
        } else if (this.inLineChecker.hasInLine(vastTree2.ads)) {
            nonNullConsumer2.accept(result.build());
        } else if (!z) {
            result.setErrors(Collections.singleton(valueOf));
            nonNullConsumer2.accept(result.build());
        } else {
            AdContainer<Wrapper> pickWrapperContainer = this.wrapperAdContainerPicker.pickWrapperContainer(vastTree2.ads);
            if (pickWrapperContainer == null) {
                result.setErrors(Collections.singleton(valueOf));
                nonNullConsumer2.accept(result.build());
            } else if (i > this.maxDepth) {
                result.setErrors(Collections.singleton(302));
                nonNullConsumer2.accept(result.build());
            } else {
                Logger logger2 = logger;
                this.wrapperLoader.loadWrapper(logger, ((Wrapper) pickWrapperContainer.model).vastAdTagUri, new NonNullConsumer(logger, somaApiContext, pickWrapperContainer, i, nonNullConsumer, vastTree) {
                    public final /* synthetic */ Logger f$1;
                    public final /* synthetic */ SomaApiContext f$2;
                    public final /* synthetic */ AdContainer f$3;
                    public final /* synthetic */ int f$4;
                    public final /* synthetic */ NonNullConsumer f$5;
                    public final /* synthetic */ VastTree f$6;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                        this.f$6 = r7;
                    }

                    public final void accept(Object obj) {
                        WrapperResolver.this.lambda$resolveWrappers$1$WrapperResolver(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (ParseResult) obj);
                    }
                });
            }
        }
    }

    public /* synthetic */ void lambda$resolveWrappers$1$WrapperResolver(Logger logger, SomaApiContext somaApiContext, AdContainer adContainer, int i, NonNullConsumer nonNullConsumer, VastTree vastTree, ParseResult parseResult) {
        checkLoadResultAndResolveIfNeeded(logger, somaApiContext, adContainer, parseResult, i, new NonNullConsumer(nonNullConsumer, vastTree, adContainer) {
            public final /* synthetic */ NonNullConsumer f$1;
            public final /* synthetic */ VastTree f$2;
            public final /* synthetic */ AdContainer f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                WrapperResolver.this.lambda$resolveWrappers$0$WrapperResolver(this.f$1, this.f$2, this.f$3, (VastResult) obj);
            }
        });
    }

    public /* synthetic */ void lambda$resolveWrappers$0$WrapperResolver(NonNullConsumer nonNullConsumer, VastTree vastTree, AdContainer adContainer, VastResult vastResult) {
        nonNullConsumer.accept(mergeWrapperResolvedResult(vastResult, vastTree, adContainer));
    }

    private VastResult<VastTree> mergeWrapperResolvedResult(VastResult<VastTree> vastResult, VastTree vastTree, AdContainer<Wrapper> adContainer) {
        VastResult.Builder builder = new VastResult.Builder();
        HashSet hashSet = new HashSet(vastResult.errors);
        builder.setErrors(hashSet);
        VastTree vastTree2 = (VastTree) vastResult.value;
        if (vastTree2 == null) {
            hashSet.add(Integer.valueOf(ErrorCode.NO_VAST_AFTER_WRAPPER_ERROR));
            builder.setResult(vastTree);
        } else {
            builder.setResult(ResolvedWrapperMergeUtils.mergeParsedResultWithParents(vastTree2, vastTree, adContainer));
        }
        return builder.build();
    }

    private void checkLoadResultAndResolveIfNeeded(Logger logger, SomaApiContext somaApiContext, AdContainer<Wrapper> adContainer, ParseResult<VastTree> parseResult, int i, NonNullConsumer<VastResult<VastTree>> nonNullConsumer) {
        VastResult.Builder builder = new VastResult.Builder();
        HashSet hashSet = new HashSet();
        builder.setErrors(hashSet);
        if (!parseResult.errors.isEmpty()) {
            hashSet.addAll(Lists.mapLazy(parseResult.errors, $$Lambda$WrapperResolver$Z70mF7pdyLELSyRVPmdx1tEdNZ0.INSTANCE));
            hashSet.remove((Object) null);
        }
        Result result = parseResult.value;
        if (result == null) {
            if (!parseResult.errors.isEmpty()) {
                hashSet.add(100);
            }
            nonNullConsumer.accept(builder.build());
            return;
        }
        $$Lambda$WrapperResolver$I0cXiY11VehlPqwjzC_XjjynkGU r6 = new NonNullConsumer(hashSet, builder, parseResult, nonNullConsumer) {
            public final /* synthetic */ Set f$0;
            public final /* synthetic */ VastResult.Builder f$1;
            public final /* synthetic */ ParseResult f$2;
            public final /* synthetic */ NonNullConsumer f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void accept(Object obj) {
                WrapperResolver.lambda$checkLoadResultAndResolveIfNeeded$3(this.f$0, this.f$1, this.f$2, this.f$3, (VastResult) obj);
            }
        };
        resolveWrappers(logger, somaApiContext, (VastTree) result, ((Wrapper) adContainer.model).followAdditionalWrappers, i + 1, r6);
    }

    static /* synthetic */ Integer lambda$checkLoadResultAndResolveIfNeeded$2(ParseError parseError) {
        if ((parseError == null ? null : parseError.exception) instanceof GeneralWrapperErrorException) {
            return 300;
        }
        return null;
    }

    static /* synthetic */ void lambda$checkLoadResultAndResolveIfNeeded$3(Set set, VastResult.Builder builder, ParseResult parseResult, NonNullConsumer nonNullConsumer, VastResult vastResult) {
        set.addAll(vastResult.errors);
        Result result = vastResult.value;
        if (result != null) {
            builder.setResult((VastTree) result);
        } else {
            builder.setResult((VastTree) parseResult.value);
        }
        nonNullConsumer.accept(builder.build());
    }
}
