package com.mbridge.msdk.video.module.p365a.p366a;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p304f.C8442b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p365a.C9384a;
import com.mbridge.msdk.video.module.p365a.p366a.C9396k;
import com.mbridge.msdk.video.module.p367b.C9410b;
import com.mbridge.msdk.videocommon.download.C9552a;
import com.mbridge.msdk.videocommon.download.C9556c;
import com.mbridge.msdk.videocommon.p371b.C9541c;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.module.a.a.o */
/* compiled from: VideoViewStatisticsListener */
public class C9406o extends C9396k {

    /* renamed from: j */
    protected int f23005j = 0;

    /* renamed from: k */
    private boolean f23006k;

    /* renamed from: l */
    private boolean f23007l;

    /* renamed from: m */
    private boolean f23008m;

    /* renamed from: n */
    private boolean f23009n;

    /* renamed from: o */
    private boolean f23010o = false;

    /* renamed from: p */
    private Map<Integer, String> f23011p;

    /* renamed from: q */
    private int f23012q = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9406o(CampaignEx campaignEx, C9541c cVar, C9552a aVar, String str, String str2, C9384a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        if (this.f22973a) {
            this.f23011p = campaignEx.getAdvImpList();
        }
        this.f23005j = campaignEx.getVideoCompleteTime();
    }

    /* renamed from: a */
    public void mo62252a(int i, final Object obj) {
        int i2;
        if (!(i == 2 || i == 6)) {
            if (i != 7) {
                int i3 = 0;
                if (i == 15) {
                    mo62791g();
                    mo62790f();
                    mo62789e();
                    if (obj == null || !(obj instanceof MBridgeVideoView.C9382a)) {
                        i2 = 0;
                    } else {
                        int i4 = ((MBridgeVideoView.C9382a) obj).f22942a;
                        i3 = ((MBridgeVideoView.C9382a) obj).f22943b;
                        i2 = i4;
                    }
                    if (i3 == 0 && this.f22974b != null) {
                        i3 = this.f22974b.getVideoLength();
                    }
                    C9410b.m26945a(C2350a.m5601e().mo15792g(), this.f22974b, i2, i3, this.f22981i);
                    C9410b.m26948a(this.f22974b, this.f23011p, this.f22978f, i2);
                    if (!this.f23009n) {
                        this.f23009n = true;
                        C9410b.m26947a(this.f22974b, this.f22978f);
                    }
                    if (!this.f23010o) {
                        if (this.f23005j != 0) {
                            i3 = this.f23005j;
                        }
                        if (i2 >= i3) {
                            this.f23010o = true;
                            i = 17;
                        }
                    }
                    C8608u.m24884d("NotifyListener", "onPlayProgress:" + i2);
                    this.f23012q = i2;
                } else if (i != 16) {
                    switch (i) {
                        case 11:
                            C9556c.getInstance().mo63233b(false);
                            mo62788d();
                            break;
                        case 12:
                            C94071 r1 = new Runnable() {
                                public final void run() {
                                    Object obj = obj;
                                    if (obj != null && (obj instanceof String)) {
                                        C9406o.this.mo62784a((String) obj);
                                    }
                                }
                            };
                            if (C2358b.m5644a().mo15829d()) {
                                C8442b.m24388a().execute(r1);
                            } else {
                                r1.run();
                            }
                            mo62788d();
                            mo62785b();
                            mo62787c();
                            C9396k.C94004 r12 = new Runnable() {
                                public final void run(
/*
Method generation error in method: com.mbridge.msdk.video.module.a.a.k.4.run():void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.mbridge.msdk.video.module.a.a.k.4.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
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
                            if (C2358b.m5644a().mo15829d()) {
                                C8442b.m24388a().execute(r12);
                            } else {
                                r12.run();
                            }
                            C9556c.getInstance().mo63233b(false);
                            break;
                        case 13:
                            try {
                                mo62785b();
                                mo62787c();
                                break;
                            } catch (Throwable th) {
                                C8608u.m24881a("NotifyListener", th.getMessage(), th);
                                return;
                            }
                    }
                }
            } else if (this.f22973a && obj != null && (obj instanceof Integer)) {
                int intValue = ((Integer) obj).intValue();
                if (intValue == 2) {
                    if (!this.f23007l) {
                        this.f23007l = true;
                        C9410b.m26951b(C2350a.m5601e().mo15792g(), this.f22974b);
                    }
                } else if (intValue == 1 && !this.f23006k) {
                    this.f23006k = true;
                    C9410b.m26952c(C2350a.m5601e().mo15792g(), this.f22974b);
                }
            }
            this.f22980h.mo62252a(i, obj);
        }
        if (this.f22973a && !this.f23008m) {
            this.f23008m = true;
            mo62788d();
            C9410b.m26954e(C2350a.m5601e().mo15792g(), this.f22974b);
        }
        this.f22980h.mo62252a(i, obj);
    }
}
