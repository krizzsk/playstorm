package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.AdContentRating;
import com.smaato.sdk.core.LatLng;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.datacollector.DataCollector;
import com.smaato.sdk.core.datacollector.LocationProvider;
import com.smaato.sdk.core.datacollector.SystemInfo;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprData;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdData;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Lists;
import java.util.List;
import java.util.Locale;

/* renamed from: com.smaato.sdk.core.ad.RequestInfoProvider */
public final class RequestInfoProvider {
    private final DataCollector dataCollector;
    private final SdkConfiguration sdkConfiguration;
    private final SomaGdprDataSource somaGdprDataSource;
    private final SomaLgpdDataSource somaLgpdDataSource;
    private final SystemInfo systemInfo;

    public RequestInfoProvider(DataCollector dataCollector2, SomaGdprDataSource somaGdprDataSource2, SomaLgpdDataSource somaLgpdDataSource2, SdkConfiguration sdkConfiguration2, SystemInfo systemInfo2) {
        this.dataCollector = (DataCollector) Objects.requireNonNull(dataCollector2);
        this.somaGdprDataSource = (SomaGdprDataSource) Objects.requireNonNull(somaGdprDataSource2);
        this.somaLgpdDataSource = (SomaLgpdDataSource) Objects.requireNonNull(somaLgpdDataSource2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.systemInfo = (SystemInfo) Objects.requireNonNull(systemInfo2);
    }

    public GeoInfo getGeoInfo(UserInfo userInfo) {
        LatLng latLng;
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (somaGdprData.isUsageAllowedFor(PiiParam.GPS) && ((!somaLgpdData.isLgpdEnabled() || somaLgpdData.isUsageAllowedFor()) && this.sdkConfiguration.isGpsEnabled() && !this.sdkConfiguration.isCoppaEnabled())) {
            LocationProvider.DetectedLocation locationData = this.dataCollector.getLocationData();
            if (locationData != null) {
                return new GeoInfo(new LatLng(locationData.getLatitude(), locationData.getLongitude(), locationData.getAccuracy(), locationData.getLastUpdatedMillis()), locationData.getType() == LocationProvider.DetectedLocation.TYPE.GPS ? GeoType.GPS : GeoType.IP_ADDRESS);
            } else if (!(userInfo == null || (latLng = userInfo.getLatLng()) == null)) {
                return new GeoInfo(latLng, GeoType.USER_PROVIDED);
            }
        }
        return null;
    }

    public AdContentRating getAdContentRating() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        AdContentRating adContentRating = this.sdkConfiguration.getAdContentRating();
        if (adContentRating == null || !somaGdprData.isUsageAllowedFor(PiiParam.AGE)) {
            return AdContentRating.MAX_AD_CONTENT_RATING_UNDEFINED;
        }
        return adContentRating;
    }

    public String getGoogleAdId() {
        SomaGdprData somaGdprData = this.somaGdprDataSource.getSomaGdprData();
        SomaLgpdData somaLgpdData = this.somaLgpdDataSource.getSomaLgpdData();
        if (!somaGdprData.isUsageAllowedFor(PiiParam.GOOGLE_AD_ID)) {
            return null;
        }
        if ((!somaLgpdData.isLgpdEnabled() || somaLgpdData.isUsageAllowedFor()) && !this.sdkConfiguration.isCoppaEnabled()) {
            return this.systemInfo.getGoogleAdvertisingId();
        }
        return null;
    }

    public String getLanguage(UserInfo userInfo) {
        String language = userInfo.getLanguage();
        if (TextUtils.isEmpty(language)) {
            return this.systemInfo.getLanguage();
        }
        List of = Lists.m32965of((T[]) Locale.getISOLanguages());
        java.util.Objects.requireNonNull(language);
        return Lists.any(of, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: RETURN  
              (wrap: java.lang.String : ?: TERNARYnull = ((wrap: boolean : 0x0021: INVOKE  (r0v3 boolean) = 
              (r0v2 'of' java.util.List)
              (wrap: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4 : 0x001e: CONSTRUCTOR  (r1v0 com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4) = (r3v1 'language' java.lang.String) call: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4.<init>(java.lang.String):void type: CONSTRUCTOR)
             com.smaato.sdk.core.util.collections.Lists.any(java.lang.Iterable, com.smaato.sdk.core.util.fi.Predicate):boolean type: STATIC) != false) ? (r3v1 'language' java.lang.String) : (wrap: java.lang.String : 0x002a: INVOKE  (r3v3 java.lang.String) = 
              (wrap: com.smaato.sdk.core.datacollector.SystemInfo : 0x0028: IGET  (r3v2 com.smaato.sdk.core.datacollector.SystemInfo) = 
              (r2v0 'this' com.smaato.sdk.core.ad.RequestInfoProvider A[THIS])
             com.smaato.sdk.core.ad.RequestInfoProvider.systemInfo com.smaato.sdk.core.datacollector.SystemInfo)
             com.smaato.sdk.core.datacollector.SystemInfo.getLanguage():java.lang.String type: VIRTUAL))
             in method: com.smaato.sdk.core.ad.RequestInfoProvider.getLanguage(com.smaato.sdk.core.ad.UserInfo):java.lang.String, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: TERNARYnull = ((wrap: boolean : 0x0021: INVOKE  (r0v3 boolean) = 
              (r0v2 'of' java.util.List)
              (wrap: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4 : 0x001e: CONSTRUCTOR  (r1v0 com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4) = (r3v1 'language' java.lang.String) call: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4.<init>(java.lang.String):void type: CONSTRUCTOR)
             com.smaato.sdk.core.util.collections.Lists.any(java.lang.Iterable, com.smaato.sdk.core.util.fi.Predicate):boolean type: STATIC) != false) ? (r3v1 'language' java.lang.String) : (wrap: java.lang.String : 0x002a: INVOKE  (r3v3 java.lang.String) = 
              (wrap: com.smaato.sdk.core.datacollector.SystemInfo : 0x0028: IGET  (r3v2 com.smaato.sdk.core.datacollector.SystemInfo) = 
              (r2v0 'this' com.smaato.sdk.core.ad.RequestInfoProvider A[THIS])
             com.smaato.sdk.core.ad.RequestInfoProvider.systemInfo com.smaato.sdk.core.datacollector.SystemInfo)
             com.smaato.sdk.core.datacollector.SystemInfo.getLanguage():java.lang.String type: VIRTUAL) in method: com.smaato.sdk.core.ad.RequestInfoProvider.getLanguage(com.smaato.sdk.core.ad.UserInfo):java.lang.String, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 33 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: INVOKE  (r0v3 boolean) = 
              (r0v2 'of' java.util.List)
              (wrap: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4 : 0x001e: CONSTRUCTOR  (r1v0 com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4) = (r3v1 'language' java.lang.String) call: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4.<init>(java.lang.String):void type: CONSTRUCTOR)
             com.smaato.sdk.core.util.collections.Lists.any(java.lang.Iterable, com.smaato.sdk.core.util.fi.Predicate):boolean type: STATIC in method: com.smaato.sdk.core.ad.RequestInfoProvider.getLanguage(com.smaato.sdk.core.ad.UserInfo):java.lang.String, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:115)
            	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
            	at jadx.core.codegen.ConditionGen.wrap(ConditionGen.java:84)
            	at jadx.core.codegen.ConditionGen.wrap(ConditionGen.java:50)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:950)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:476)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 37 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001e: CONSTRUCTOR  (r1v0 com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4) = (r3v1 'language' java.lang.String) call: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4.<init>(java.lang.String):void type: CONSTRUCTOR in method: com.smaato.sdk.core.ad.RequestInfoProvider.getLanguage(com.smaato.sdk.core.ad.UserInfo):java.lang.String, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 46 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 52 more
            */
        /*
            this = this;
            java.lang.String r3 = r3.getLanguage()
            boolean r0 = com.smaato.sdk.core.util.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x0011
            com.smaato.sdk.core.datacollector.SystemInfo r3 = r2.systemInfo
            java.lang.String r3 = r3.getLanguage()
            return r3
        L_0x0011:
            java.lang.String[] r0 = java.util.Locale.getISOLanguages()
            java.util.List r0 = com.smaato.sdk.core.util.collections.Lists.m32965of((T[]) r0)
            java.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4 r1 = new com.smaato.sdk.core.ad.-$$Lambda$RequestInfoProvider$6pINHm8fr-CXyDAGSxXo0M88RU4
            r1.<init>(r3)
            boolean r0 = com.smaato.sdk.core.util.collections.Lists.any(r0, r1)
            if (r0 == 0) goto L_0x0028
            goto L_0x002e
        L_0x0028:
            com.smaato.sdk.core.datacollector.SystemInfo r3 = r2.systemInfo
            java.lang.String r3 = r3.getLanguage()
        L_0x002e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.p378ad.RequestInfoProvider.getLanguage(com.smaato.sdk.core.ad.UserInfo):java.lang.String");
    }
}
