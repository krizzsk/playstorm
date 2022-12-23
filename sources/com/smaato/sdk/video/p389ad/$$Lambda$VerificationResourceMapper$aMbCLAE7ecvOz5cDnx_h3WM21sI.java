package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p382fi.BiFunction;
import com.smaato.sdk.video.vast.model.Verification;

/* renamed from: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI implements BiFunction {
    public static final /* synthetic */ $$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI INSTANCE = new $$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI();

    private /* synthetic */ $$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI() {
    }

    public final Object apply(Object obj, Object obj2) {
        return Iterables.forEach(((Verification) obj).javaScriptResources, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: RETURN  
              (wrap: java.util.HashMap : 0x0004: INVOKE  (r1v2 java.util.HashMap) = 
              (wrap: com.smaato.sdk.video.vast.model.Verification : 0x0000: CHECK_CAST  (r1v1 com.smaato.sdk.video.vast.model.Verification) = (com.smaato.sdk.video.vast.model.Verification) (r1v0 'obj' java.lang.Object))
              (wrap: java.util.HashMap : 0x0002: CHECK_CAST  (r2v1 java.util.HashMap) = (java.util.HashMap) (r2v0 'obj2' java.lang.Object))
             com.smaato.sdk.video.ad.VerificationResourceMapper.lambda$apply$1(com.smaato.sdk.video.vast.model.Verification, java.util.HashMap):java.util.HashMap type: STATIC)
             in method: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.apply(java.lang.Object, java.lang.Object):java.lang.Object, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: INVOKE  (r1v2 java.util.HashMap) = 
              (wrap: com.smaato.sdk.video.vast.model.Verification : 0x0000: CHECK_CAST  (r1v1 com.smaato.sdk.video.vast.model.Verification) = (com.smaato.sdk.video.vast.model.Verification) (r1v0 'obj' java.lang.Object))
              (wrap: java.util.HashMap : 0x0002: CHECK_CAST  (r2v1 java.util.HashMap) = (java.util.HashMap) (r2v0 'obj2' java.lang.Object))
             com.smaato.sdk.video.ad.VerificationResourceMapper.lambda$apply$1(com.smaato.sdk.video.vast.model.Verification, java.util.HashMap):java.util.HashMap type: STATIC in method: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.apply(java.lang.Object, java.lang.Object):java.lang.Object, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
              (wrap: java.util.List<com.smaato.sdk.video.vast.model.JavaScriptResource> : 0x0000: IGET  (r0v0 java.util.List<com.smaato.sdk.video.vast.model.JavaScriptResource>) = 
              (wrap: com.smaato.sdk.video.vast.model.Verification : 0x0000: CHECK_CAST  (r1v1 com.smaato.sdk.video.vast.model.Verification) = (com.smaato.sdk.video.vast.model.Verification) (r1v0 'obj' java.lang.Object))
             com.smaato.sdk.video.vast.model.Verification.javaScriptResources java.util.List)
              (wrap: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw : 0x0004: CONSTRUCTOR  (r1v0 com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw) = 
              (wrap: java.util.HashMap : 0x0002: CHECK_CAST  (r2v1 java.util.HashMap) = (java.util.HashMap) (r2v0 'obj2' java.lang.Object))
              (wrap: com.smaato.sdk.video.vast.model.Verification : 0x0000: CHECK_CAST  (r1v1 com.smaato.sdk.video.vast.model.Verification) = (com.smaato.sdk.video.vast.model.Verification) (r1v0 'obj' java.lang.Object))
             call: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw.<init>(java.util.HashMap, com.smaato.sdk.video.vast.model.Verification):void type: CONSTRUCTOR)
             com.smaato.sdk.core.util.collections.Iterables.forEach(java.lang.Iterable, com.smaato.sdk.core.util.fi.Consumer):void type: STATIC in method: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.apply(java.lang.Object, java.lang.Object):java.lang.Object, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:924)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:684)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 33 more
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0004: CONSTRUCTOR  (r1v0 com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw) = 
              (wrap: java.util.HashMap : 0x0002: CHECK_CAST  (r2v1 java.util.HashMap) = (java.util.HashMap) (r2v0 'obj2' java.lang.Object))
              (wrap: com.smaato.sdk.video.vast.model.Verification : 0x0000: CHECK_CAST  (r1v1 com.smaato.sdk.video.vast.model.Verification) = (com.smaato.sdk.video.vast.model.Verification) (r1v0 'obj' java.lang.Object))
             call: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw.<init>(java.util.HashMap, com.smaato.sdk.video.vast.model.Verification):void type: CONSTRUCTOR in method: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.apply(java.lang.Object, java.lang.Object):java.lang.Object, dex: classes4.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 37 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.smaato.sdk.video.ad.-$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:260)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:606)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	... 43 more
            */
        /*
            this = this;
            com.smaato.sdk.video.vast.model.Verification r1 = (com.smaato.sdk.video.vast.model.Verification) r1
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.HashMap r1 = com.smaato.sdk.core.util.collections.Iterables.forEach(r1.javaScriptResources, new com.smaato.sdk.video.p389ad.$$Lambda$VerificationResourceMapper$pv_RwGlomjEL4KBO2OA1hU3OtYw(r2, r1))
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.p389ad.$$Lambda$VerificationResourceMapper$aMbCLAE7ecvOz5cDnx_h3WM21sI.apply(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
