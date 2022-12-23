package com.inmobi.media;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.inmobi.media.C6125fq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.ds */
/* compiled from: VastResponse */
public final class C6000ds implements C6001dt {

    /* renamed from: a */
    List<C5990dn> f15259a;

    /* renamed from: b */
    public String f15260b;

    /* renamed from: c */
    public String f15261c;

    /* renamed from: d */
    public List<C5922cf> f15262d;

    /* renamed from: e */
    public List<C5988dm> f15263e;

    /* renamed from: f */
    public int f15264f;

    /* renamed from: g */
    private String f15265g;

    /* renamed from: h */
    private C5988dm f15266h;

    /* renamed from: i */
    private C6125fq.C6140k f15267i;

    /* renamed from: j */
    private C5990dn f15268j;

    /* renamed from: a */
    private static boolean m17904a(double d, double d2, double d3) {
        return d3 > d && d3 <= d2;
    }

    C6000ds(C6125fq.C6140k kVar) {
        this.f15268j = null;
        this.f15259a = new ArrayList();
        this.f15262d = new ArrayList();
        this.f15263e = new ArrayList();
        this.f15267i = kVar;
        this.f15264f = 0;
    }

    private C6000ds(List<C5922cf> list, C6125fq.C6140k kVar) {
        this(kVar);
        if (list.size() != 0) {
            this.f15262d = new ArrayList(list);
        }
    }

    public C6000ds(String str, String str2, String str3, List<C5922cf> list, List<C5988dm> list2, C6125fq.C6140k kVar) {
        this(list, kVar);
        if (list2.size() != 0) {
            this.f15263e = new ArrayList(list2);
        }
        this.f15265g = str;
        this.f15259a.add(new C5990dn(str));
        this.f15260b = str2;
        this.f15261c = str3;
    }

    /* renamed from: a */
    public final String mo35105a() {
        return this.f15261c;
    }

    /* renamed from: b */
    public final String mo35108b() {
        C5990dn dnVar;
        int i;
        String str = this.f15265g;
        if (str != null) {
            return str;
        }
        C5858be.m17531a();
        List<String> f = C5858be.m17540f();
        C5990dn dnVar2 = null;
        if (!f.isEmpty()) {
            Iterator<C5990dn> it = this.f15259a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dnVar = it.next();
                if (f.contains(dnVar.f15222a)) {
                    break;
                }
            }
        }
        dnVar = null;
        if (dnVar != null) {
            this.f15268j = dnVar;
            String str2 = dnVar.f15222a;
            this.f15265g = str2;
            return str2;
        }
        double d = (((double) this.f15267i.optimalVastVideoSize) * 2.0d) / 1048576.0d;
        double d2 = 1.0d;
        double d3 = (((double) this.f15267i.vastMaxAssetSize) * 1.0d) / 1048576.0d;
        for (C5990dn next : this.f15259a) {
            String[] split = this.f15260b.split(CertificateUtil.DELIMITER);
            try {
                i = (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                i = 0;
                C6181gg.m18398a().mo35357a(new C6217hg(e));
            }
            double d4 = ((((double) next.f15223b) * d2) * ((double) i)) / 8192.0d;
            next.f15224c = d4;
            double d5 = d4;
            C5990dn dnVar3 = next;
            if (m17904a(0.0d, d, d5)) {
                dnVar = m17901a(dnVar, dnVar3, d5);
            } else {
                if (m17904a(d, d3, d5)) {
                    dnVar2 = m17905b(dnVar2, dnVar3, d5);
                }
            }
            d2 = 1.0d;
        }
        m17902a(dnVar, dnVar2);
        if (TextUtils.isEmpty(this.f15265g)) {
            C6125fq.C6132c cVar = this.f15267i.bitRate;
            if (cVar.bitrate_mandatory || this.f15259a.size() == 0) {
                return this.f15265g;
            }
            CountDownLatch countDownLatch = new CountDownLatch(this.f15259a.size());
            try {
                m17903a(cVar, countDownLatch);
                countDownLatch.await((long) cVar.headerTimeout, TimeUnit.MILLISECONDS);
                for (C5990dn next2 : this.f15259a) {
                    double d6 = next2.f15224c;
                    double d7 = d6;
                    if (m17904a(0.0d, d, d6)) {
                        dnVar = m17901a(dnVar, next2, d7);
                    } else {
                        if (m17904a(d, d3, d7)) {
                            dnVar2 = m17905b(dnVar2, next2, d7);
                        }
                    }
                }
            } catch (Exception e2) {
                C6181gg.m18398a().mo35357a(new C6217hg(e2));
                for (C5990dn next3 : this.f15259a) {
                    double d8 = next3.f15224c;
                    double d9 = d8;
                    if (m17904a(0.0d, d, d8)) {
                        dnVar = m17901a(dnVar, next3, d9);
                    } else {
                        if (m17904a(d, d3, d9)) {
                            dnVar2 = m17905b(dnVar2, next3, d9);
                        }
                    }
                }
            } catch (Throwable th) {
                for (C5990dn next4 : this.f15259a) {
                    double d10 = next4.f15224c;
                    double d11 = d10;
                    if (m17904a(0.0d, d, d10)) {
                        dnVar = m17901a(dnVar, next4, d11);
                    } else {
                        if (m17904a(d, d3, d11)) {
                            dnVar2 = m17905b(dnVar2, next4, d11);
                        }
                    }
                }
                m17902a(dnVar, dnVar2);
                throw th;
            }
            m17902a(dnVar, dnVar2);
        }
        return this.f15265g;
    }

    /* renamed from: a */
    private void m17903a(C6125fq.C6132c cVar, CountDownLatch countDownLatch) {
        for (C5990dn doVar : this.f15259a) {
            C5991do doVar2 = new C5991do(doVar, cVar.headerTimeout, countDownLatch);
            doVar2.f15236c = SystemClock.elapsedRealtime();
            C5991do.f15227d.execute(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.do.2.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.do.2.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
            });
        }
    }

    /* renamed from: a */
    private void m17902a(C5990dn dnVar, C5990dn dnVar2) {
        if (dnVar != null) {
            this.f15268j = dnVar;
            this.f15265g = dnVar.f15222a;
        } else if (dnVar2 != null) {
            this.f15268j = dnVar2;
            this.f15265g = dnVar2.f15222a;
        }
    }

    /* renamed from: c */
    public final List<C5990dn> mo35109c() {
        return this.f15259a;
    }

    /* renamed from: d */
    public final List<C5922cf> mo35110d() {
        return this.f15262d;
    }

    /* renamed from: e */
    public final List<C5988dm> mo35111e() {
        return this.f15263e;
    }

    /* renamed from: a */
    public final void mo35107a(C5988dm dmVar) {
        this.f15266h = dmVar;
    }

    /* renamed from: f */
    public final C5988dm mo35112f() {
        return this.f15266h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35106a(C5922cf cfVar) {
        this.f15262d.add(cfVar);
    }

    /* renamed from: a */
    private static C5990dn m17901a(C5990dn dnVar, C5990dn dnVar2, double d) {
        return (dnVar != null && d <= dnVar.f15224c) ? dnVar : dnVar2;
    }

    /* renamed from: b */
    private static C5990dn m17905b(C5990dn dnVar, C5990dn dnVar2, double d) {
        return (dnVar != null && d >= dnVar.f15224c) ? dnVar : dnVar2;
    }
}
