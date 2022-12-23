package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6504O;
import com.ironsource.mediationsdk.C6515R;
import com.ironsource.mediationsdk.C6711o;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.C6700j;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p207a.C6553d;
import com.ironsource.mediationsdk.p207a.C6556g;
import com.ironsource.mediationsdk.p207a.C6557h;
import com.ironsource.mediationsdk.p217c.C6651a;
import com.ironsource.mediationsdk.sdk.C6727i;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.C6774k;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p200d.C6392a;
import com.p374my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER(AdFormat.BANNER);
        

        /* renamed from: a */
        private String f16468a;

        private AD_UNIT(String str) {
            this.f16468a = str;
        }

        public final String toString() {
            return this.f16468a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6490J a = C6490J.m19474a();
        if (C6651a.m20268a(impressionDataListener, "addImpressionDataListener - listener is null")) {
            C6774k.m20599a().mo36973a(impressionDataListener);
            if (a.f16560z != null) {
                a.f16560z.mo35975a(impressionDataListener);
            }
            if (a.f16494A != null) {
                a.f16494A.mo36841a(impressionDataListener);
            }
            if (a.f16496C != null) {
                a.f16496C.mo36579a(impressionDataListener);
            }
            if (a.f16497D != null) {
                a.f16497D.mo36579a(impressionDataListener);
            }
            if (a.f16495B != null) {
                a.f16495B.mo36841a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        C6490J.m19474a().f16548n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f16504K && a.f16495B != null) {
                C6515R r = a.f16495B;
                IronLog.INTERNAL.verbose("");
                C6515R.C65172 r2 = new C6711o.C6713b(ironSourceBannerLayout) {

                    /* renamed from: a */
                    private /* synthetic */ IronSourceBannerLayout f16720a;

                    /* renamed from: a */
                    public final void mo36278a(
/*
Method generation error in method: com.ironsource.mediationsdk.R.2.a():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.R.2.a():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                    
*/

                    /* renamed from: a */
                    public final void mo36279a(
/*
Method generation error in method: com.ironsource.mediationsdk.R.2.a(java.lang.String):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.R.2.a(java.lang.String):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
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
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                    
*/
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.mo36278a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.mo36279a(String.format("can't destroy banner - %s", objArr));
            } else if (a.f16539e != null) {
                a.f16539e.mo36746a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f16507N != null) {
                a.f16507N.mo36855a(iSDemandOnlyBannerLayout);
            }
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        C6490J.m19474a();
        return C6490J.m19476a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String n;
        synchronized (IronSource.class) {
            n = C6490J.m19474a().mo36170n();
        }
        return n;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b;
        synchronized (IronSource.class) {
            b = C6490J.m19474a().mo36144b(context);
        }
        return b;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C6490J.m19474a().mo36164k(str);
    }

    public static void getOfferwallCredits() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            C6514Q q = a.f16538d;
            if (q.f16686a != null) {
                q.f16686a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C6490J.m19474a().mo36166l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        C6490J.m19474a().mo36136a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C6490J.m19474a().mo36136a(activity, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C6490J.m19474a().mo36135a((Context) activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C6490J.m19474a().mo36135a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return C6490J.m19474a().mo36171n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C6490J.m19474a().mo36161i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C6490J.m19474a().mo36157g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C6490J.m19474a().mo36169m(str);
    }

    public static boolean isInterstitialReady() {
        return C6490J.m19474a().mo36159h();
    }

    public static boolean isOfferwallAvailable() {
        return C6490J.m19474a().mo36167l();
    }

    public static boolean isRewardedVideoAvailable() {
        return C6490J.m19474a().mo36148c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.C6490J.C64911.f16562b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.J r0 = com.ironsource.mediationsdk.C6490J.m19474a()
            int r1 = r0.mo36172o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.C6490J.C64911.f16562b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = r4
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.f16555u
            boolean r6 = r0.f16498E
            int r0 = r0.f16505L
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.C6490J.m19486a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.C6490J.m19478a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C6490J.m19474a().mo36138a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C6490J.m19474a().mo36138a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C6490J.m19474a().mo36133a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C6490J.m19474a().mo36150d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        C6490J.m19474a().mo36150d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C6490J.m19474a().mo36147c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        C6490J.m19474a().mo36147c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C6490J.m19474a().mo36145b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        C6490J.m19474a().mo36145b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C6490J.m19474a().mo36134a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        C6490J.m19474a().mo36134a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.f16556v) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.f16558x) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                C6504O.C6509a b = C6504O.m19641a().mo36232b();
                if (b == C6504O.C6509a.INIT_FAILED) {
                    a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b == C6504O.C6509a.INIT_IN_PROGRESS) {
                    if (C6504O.m19641a().mo36234c()) {
                        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    a.f16503J = true;
                } else if (!a.mo36163j()) {
                    a.f16540f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.f16501H) {
                    a.f16537c.mo36050c();
                } else {
                    if (a.f16502I) {
                        if (a.f16496C != null) {
                            a.f16496C.mo36584d();
                            return;
                        }
                    } else if (a.f16494A != null) {
                        a.f16494A.mo36310e();
                        return;
                    }
                    a.f16503J = true;
                }
            }
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C6716r.m20447a().mo36851a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", 1);
        try {
            if (a.f16555u) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a.f16499F) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a.f16557w) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadRewardedVideo()", 3);
                C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                C6504O.C6509a b = C6504O.m19641a().mo36232b();
                if (b == C6504O.C6509a.INIT_FAILED) {
                    a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b == C6504O.C6509a.INIT_IN_PROGRESS) {
                    if (C6504O.m19641a().mo36234c()) {
                        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a.f16500G = true;
                } else if (!a.mo36154e()) {
                    a.f16540f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                    C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a.f16497D == null) {
                    a.f16500G = true;
                } else {
                    a.f16497D.mo36584d();
                }
            }
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C6716r.m20447a().mo36851a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        C6490J a = C6490J.m19474a();
        try {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        C6490J a = C6490J.m19474a();
        try {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6490J a = C6490J.m19474a();
        if (C6651a.m20268a(impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C6774k.m20599a().mo36976b(impressionDataListener);
            if (a.f16560z != null) {
                a.f16560z.mo35977b(impressionDataListener);
            }
            if (a.f16494A != null) {
                a.f16494A.mo36846b(impressionDataListener);
            }
            if (a.f16496C != null) {
                a.f16496C.mo36582b(impressionDataListener);
            }
            if (a.f16497D != null) {
                a.f16497D.mo36582b(impressionDataListener);
            }
            if (a.f16495B != null) {
                a.f16495B.mo36846b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.f16541g.f17598b = null;
        C6463D.m19392a().mo36015a((InterstitialListener) null);
        C6463D.m19392a().mo36016a((C6727i) null);
    }

    public static void removeOfferwallListener() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.f16541g.f17599c = null;
    }

    public static void removeRewardedVideoListener() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.f16541g.f17597a = null;
        C6569ac.m19976a().f16996a = null;
        C6569ac.m19976a().f16997b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C6490J a = C6490J.m19474a();
        if (C6651a.m20268a(jSONObject, "setAdRevenueData - impressionData is null") && C6651a.m20268a(str, "setAdRevenueData - dataSource is null")) {
            a.f16508O.mo36699a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        C6490J.m19474a();
        C6490J.m19487a(z);
    }

    public static void setConsent(boolean z) {
        C6490J.m19474a().mo36146b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C6490J.m19474a().mo36149c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C6490J.m19474a();
        C6490J.m19481a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C6490J.m19474a();
        C6490J.m19482a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6490J a = C6490J.m19474a();
        IronLog.API.info("removing all impression data listeners");
        C6774k.m20599a().mo36977c();
        if (a.f16560z != null) {
            a.f16560z.mo35976b();
        }
        if (a.f16494A != null) {
            a.f16494A.mo36845b();
        }
        if (a.f16496C != null) {
            a.f16496C.mo36586g();
        }
        if (a.f16497D != null) {
            a.f16497D.mo36586g();
        }
        if (a.f16495B != null) {
            a.f16495B.mo36845b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.f16541g.f17598b = interstitialListener;
        C6463D.m19392a().mo36015a(interstitialListener);
    }

    public static void setLogListener(LogListener logListener) {
        C6490J a = C6490J.m19474a();
        if (logListener == null) {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.f16542h.f17421c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f16540f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        C6490J.m19474a().mo36139a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        C6490J a = C6490J.m19474a();
        try {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, a.f16520a + ":setMediationSegment(segment:" + str + ")", 1);
            C6392a aVar = new C6392a();
            C6490J.m19483a(str, aVar);
            if (aVar.mo35875a()) {
                a.f16546l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, aVar.mo35876b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f16540f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.f16520a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        C6490J.m19474a().mo36151d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C6490J.m19474a().mo36140a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        C6490J.m19474a().mo36140a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        C6490J.m19474a();
        C6490J.m19484a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.f16541g.f17599c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.f16541g.f17597a = rewardedVideoListener;
        C6569ac.m19976a().f16996a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C6490J a = C6490J.m19474a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f16540f.log(IronSourceLogger.IronSourceTag.API, a.f16520a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.f16548n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f16540f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.f16520a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C6490J a = C6490J.m19474a();
        a.f16553s = ironSourceSegment;
        if (a.f16497D != null) {
            a.f16497D.mo36577a(ironSourceSegment);
        }
        if (a.f16560z != null) {
            a.f16560z.mo35974a(ironSourceSegment);
        }
        if (a.f16496C != null) {
            a.f16496C.mo36577a(ironSourceSegment);
        }
        if (a.f16494A != null) {
            a.f16494A.mo36839a(ironSourceSegment);
        }
        if (a.f16495B != null) {
            a.f16495B.mo36839a(ironSourceSegment);
        }
        C6553d.m19930d().f16931v = a.f16553s;
        C6557h.m19950d().f16931v = a.f16553s;
        C6556g.f16963w.f16931v = a.f16553s;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C6490J a = C6490J.m19474a();
        if (a.f16541g != null) {
            a.f16541g.f17600d = segmentListener;
            C6504O.m19641a().f16652p = a.f16541g;
        }
    }

    public static void setUserId(String str) {
        C6490J.m19474a().mo36141a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C6490J a = C6490J.m19474a();
        a.f16551q = context;
        a.f16552r = Boolean.valueOf(z);
        if (a.f16501H) {
            if (a.f16502I) {
                if (a.f16496C != null) {
                    a.f16496C.mo36583b(z);
                }
            } else if (a.f16494A != null) {
                a.f16494A.mo36305a(z);
            }
        } else if (a.f16537c != null) {
            a.f16537c.mo36039a(context, z);
        }
        if (a.f16498E) {
            if (a.f16560z != null) {
                a.f16560z.mo36001a(context, z);
            }
        } else if (a.f16536b != null) {
            a.f16536b.mo36039a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C6490J a = C6490J.m19474a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f16540f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.f16556v) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.f16506M == null) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                C6456C.m19387a().mo36005b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else {
                C6762u uVar = a.f16506M;
                if (!uVar.f17661a.containsKey(str)) {
                    C6762u.m20546a(2500, str);
                    C6456C.m19387a().mo36005b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                C6785v vVar = uVar.f17661a.get(str);
                uVar.mo36952a((int) IronSourceConstants.IS_INSTANCE_SHOW, vVar);
                vVar.mo36992a();
            }
        } catch (Exception e) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C6456C.m19387a().mo36005b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C6490J.m19474a().mo36155f(str);
    }

    public static void showInterstitial() {
        C6490J a = C6490J.m19474a();
        a.f16540f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.f16556v) {
                a.f16540f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C6463D.m19392a().mo36014a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!a.mo36160i()) {
                C6463D.m19392a().mo36014a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                InterstitialPlacement g = a.mo36156g();
                if (g != null) {
                    a.mo36158h(g.getPlacementName());
                } else {
                    C6463D.m19392a().mo36014a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            C6463D.m19392a().mo36014a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()), (AdInfo) null);
        }
    }

    public static void showInterstitial(String str) {
        C6490J.m19474a().mo36158h(str);
    }

    public static void showOfferwall() {
        C6490J a = C6490J.m19474a();
        try {
            a.f16540f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.mo36165k()) {
                a.f16541g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C6700j a2 = a.f16543i.f17849c.f17498c.mo36818a();
            if (a2 != null) {
                a.mo36162j(a2.f17516b);
            }
        } catch (Exception e) {
            a.f16540f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.f16541g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        C6490J.m19474a().mo36162j(str);
    }

    public static void showRewardedVideo() {
        C6490J a = C6490J.m19474a();
        if (!a.mo36152d()) {
            C6569ac.m19976a().mo36418a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            a.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b = a.mo36143b();
        if (b == null) {
            a.f16540f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            C6569ac.m19976a().mo36418a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        a.mo36153e(b.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        C6490J.m19474a().mo36153e(str);
    }
}
