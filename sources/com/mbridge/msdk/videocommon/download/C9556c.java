package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2283b;
import com.mbridge.msdk.p054c.C2294d;
import com.mbridge.msdk.videocommon.listener.C9584a;
import com.mbridge.msdk.videocommon.p373d.C9549b;
import com.mbridge.msdk.videocommon.p373d.C9551c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.videocommon.download.c */
/* compiled from: DownLoadManager */
public class C9556c {

    /* renamed from: a */
    private static C9556c f23508a;

    /* renamed from: b */
    private ThreadPoolExecutor f23509b;

    /* renamed from: c */
    private boolean f23510c = false;

    /* renamed from: d */
    private ConcurrentHashMap<String, C9581k> f23511d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private Map<String, List<Map<String, C9552a>>> f23512e;

    /* renamed from: f */
    private Map<String, List<CampaignEx>> f23513f;

    /* renamed from: g */
    private Map<String, List<C9552a>> f23514g;

    private C9556c() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 15, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
        this.f23509b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public static C9556c getInstance() {
        if (f23508a == null) {
            synchronized (C9556c.class) {
                if (f23508a == null) {
                    f23508a = new C9556c();
                }
            }
        }
        return f23508a;
    }

    /* renamed from: a */
    public final C9552a mo63224a(String str, String str2) {
        C9581k c = mo63234c(str);
        if (c != null) {
            return c.mo63260a(str2);
        }
        return null;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63225a(String str) {
        Map<String, List<CampaignEx>> map = this.f23513f;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f23513f.get(str);
    }

    /* renamed from: b */
    public final List<C9552a> mo63232b(String str) {
        Map<String, List<C9552a>> map = this.f23514g;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f23514g.get(str);
    }

    /* renamed from: c */
    public final C9581k mo63234c(String str) {
        ConcurrentHashMap<String, C9581k> concurrentHashMap = this.f23511d;
        if (concurrentHashMap == null || !concurrentHashMap.containsKey(str)) {
            return null;
        }
        return this.f23511d.get(str);
    }

    /* renamed from: a */
    public final boolean mo63228a(int i, String str, boolean z) {
        try {
            C9581k c = mo63234c(str);
            if (c == null || c.mo63259a(i, z) == null) {
                return false;
            }
            return true;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo63229a(int i, String str, boolean z, int i2, boolean z2, int i3, List<CampaignEx> list) {
        return mo63230a(i, str, z, i2, z2, i3, list, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        if (r5.size() >= r18) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0189, code lost:
        if (r4.size() > 0) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0249  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo63230a(int r15, java.lang.String r16, boolean r17, int r18, boolean r19, int r20, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r21, boolean r22) {
        /*
            r14 = this;
            r1 = r14
            r0 = r16
            r8 = r21
            r9 = 0
            if (r8 == 0) goto L_0x024c
            int r2 = r21.size()     // Catch:{ Exception -> 0x0244 }
            if (r2 != 0) goto L_0x0010
            goto L_0x024c
        L_0x0010:
            com.mbridge.msdk.videocommon.download.k r2 = r14.mo63234c(r0)     // Catch:{ Exception -> 0x0244 }
            if (r2 == 0) goto L_0x024c
            r3 = r16
            r4 = r15
            r5 = r17
            r6 = r21
            r7 = r22
            java.util.List r2 = r2.mo63261a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0244 }
            r3 = 1
            if (r2 == 0) goto L_0x018c
            int r4 = r2.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 != 0) goto L_0x002e
            goto L_0x018c
        L_0x002e:
            if (r19 == 0) goto L_0x012e
            int r4 = r21.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 <= 0) goto L_0x0065
            java.lang.Object r4 = r8.get(r9)     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = (com.mbridge.msdk.foundation.entity.CampaignEx) r4     // Catch:{ Exception -> 0x0244 }
            if (r4 == 0) goto L_0x0065
            java.util.ArrayList r5 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            if (r5 == 0) goto L_0x0065
            java.util.ArrayList r5 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0244 }
            if (r5 <= 0) goto L_0x0065
            java.util.ArrayList r4 = r4.getRsIgnoreCheckRule()     // Catch:{ Exception -> 0x0244 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0244 }
            boolean r4 = r4.contains(r5)     // Catch:{ Exception -> 0x0244 }
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = "DownLoadManager"
            java.lang.String r5 = "Is not check video download status with TPL"
            com.mbridge.msdk.foundation.tools.C8608u.m24882b(r4, r5)     // Catch:{ Exception -> 0x0244 }
            r4 = r3
            goto L_0x0066
        L_0x0065:
            r4 = r9
        L_0x0066:
            if (r20 != 0) goto L_0x00ca
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012a }
            r5.<init>()     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x0071:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x00bf
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.videocommon.download.a r7 = (com.mbridge.msdk.videocommon.download.C9552a) r7     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r9 = r21.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x0081:
            boolean r10 = r9.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r10 == 0) goto L_0x0071
            java.lang.Object r10 = r9.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x0081
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x0081
            if (r10 == 0) goto L_0x0081
            java.lang.String r11 = r10.getId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r12 = r12.getId()     // Catch:{ Exception -> 0x012a }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x0081
            java.lang.String r10 = r10.getRequestId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x012a }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x012a }
            if (r10 == 0) goto L_0x0081
            r5.add(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x0081
        L_0x00bf:
            int r5 = r5.size()     // Catch:{ Exception -> 0x012a }
            if (r5 <= 0) goto L_0x00c7
            goto L_0x018b
        L_0x00c7:
            r9 = r4
            goto L_0x018c
        L_0x00ca:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x012a }
            r5.<init>()     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x00d3:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x0121
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.videocommon.download.a r7 = (com.mbridge.msdk.videocommon.download.C9552a) r7     // Catch:{ Exception -> 0x012a }
            java.util.Iterator r10 = r21.iterator()     // Catch:{ Exception -> 0x012a }
        L_0x00e3:
            boolean r11 = r10.hasNext()     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x00d3
            java.lang.Object r11 = r10.next()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11     // Catch:{ Exception -> 0x012a }
            if (r7 == 0) goto L_0x00e3
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            if (r12 == 0) goto L_0x00e3
            if (r11 == 0) goto L_0x00e3
            java.lang.String r12 = r11.getId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r13 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r13 = r13.getId()     // Catch:{ Exception -> 0x012a }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x012a }
            if (r12 == 0) goto L_0x00e3
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x012a }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r7.mo63212g()     // Catch:{ Exception -> 0x012a }
            java.lang.String r12 = r12.getRequestId()     // Catch:{ Exception -> 0x012a }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x012a }
            if (r11 == 0) goto L_0x00e3
            r5.add(r7)     // Catch:{ Exception -> 0x012a }
            goto L_0x00e3
        L_0x0121:
            int r4 = r5.size()     // Catch:{ Exception -> 0x012a }
            r5 = r18
            if (r4 < r5) goto L_0x018c
            goto L_0x018b
        L_0x012a:
            r0 = move-exception
            r9 = r4
            goto L_0x0245
        L_0x012e:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r4.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x0137:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0185
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.videocommon.download.a r6 = (com.mbridge.msdk.videocommon.download.C9552a) r6     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r7 = r21.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x0147:
            boolean r10 = r7.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r10 == 0) goto L_0x0137
            java.lang.Object r10 = r7.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r10 = (com.mbridge.msdk.foundation.entity.CampaignEx) r10     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0147
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r6.mo63212g()     // Catch:{ Exception -> 0x0244 }
            if (r11 == 0) goto L_0x0147
            if (r10 == 0) goto L_0x0147
            java.lang.String r11 = r10.getId()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r12 = r6.mo63212g()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r12 = r12.getId()     // Catch:{ Exception -> 0x0244 }
            boolean r11 = r11.equals(r12)     // Catch:{ Exception -> 0x0244 }
            if (r11 == 0) goto L_0x0147
            java.lang.String r10 = r10.getRequestId()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r6.mo63212g()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r11.getRequestId()     // Catch:{ Exception -> 0x0244 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x0244 }
            if (r10 == 0) goto L_0x0147
            r4.add(r6)     // Catch:{ Exception -> 0x0244 }
            goto L_0x0147
        L_0x0185:
            int r4 = r4.size()     // Catch:{ Exception -> 0x0244 }
            if (r4 <= 0) goto L_0x018c
        L_0x018b:
            r9 = r3
        L_0x018c:
            if (r9 == 0) goto L_0x024c
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f23512e     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x019a
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f23512e = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01a7
        L_0x019a:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f23512e     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01a7
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r3 = r1.f23512e     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01a7:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f23514g     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x01b3
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f23514g = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01c0
        L_0x01b3:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f23514g     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01c0
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r3 = r1.f23514g     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01c0:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f23513f     // Catch:{ Exception -> 0x0244 }
            if (r3 != 0) goto L_0x01cc
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            r1.f23513f = r3     // Catch:{ Exception -> 0x0244 }
            goto L_0x01d9
        L_0x01cc:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f23513f     // Catch:{ Exception -> 0x0244 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0244 }
            if (r3 == 0) goto L_0x01d9
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r3 = r1.f23513f     // Catch:{ Exception -> 0x0244 }
            r3.remove(r0)     // Catch:{ Exception -> 0x0244 }
        L_0x01d9:
            if (r2 == 0) goto L_0x024c
            int r3 = r2.size()     // Catch:{ Exception -> 0x0244 }
            if (r3 <= 0) goto L_0x024c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r3.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r4.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0244 }
            r5.<init>()     // Catch:{ Exception -> 0x0244 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0244 }
        L_0x01f4:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x0244 }
            if (r6 == 0) goto L_0x0234
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.videocommon.download.a r6 = (com.mbridge.msdk.videocommon.download.C9552a) r6     // Catch:{ Exception -> 0x0244 }
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x0244 }
            r7.<init>()     // Catch:{ Exception -> 0x0244 }
            com.mbridge.msdk.foundation.entity.CampaignEx r8 = r6.mo63212g()     // Catch:{ Exception -> 0x0244 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0244 }
            r10.<init>()     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getId()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getVideoUrlEncode()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r11 = r8.getBidToken()     // Catch:{ Exception -> 0x0244 }
            r10.append(r11)     // Catch:{ Exception -> 0x0244 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0244 }
            r7.put(r10, r6)     // Catch:{ Exception -> 0x0244 }
            r3.add(r7)     // Catch:{ Exception -> 0x0244 }
            r4.add(r8)     // Catch:{ Exception -> 0x0244 }
            r5.add(r6)     // Catch:{ Exception -> 0x0244 }
            goto L_0x01f4
        L_0x0234:
            java.util.Map<java.lang.String, java.util.List<java.util.Map<java.lang.String, com.mbridge.msdk.videocommon.download.a>>> r2 = r1.f23512e     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r3)     // Catch:{ Exception -> 0x0244 }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>> r2 = r1.f23513f     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r4)     // Catch:{ Exception -> 0x0244 }
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.videocommon.download.a>> r2 = r1.f23514g     // Catch:{ Exception -> 0x0244 }
            r2.put(r0, r5)     // Catch:{ Exception -> 0x0244 }
            goto L_0x024c
        L_0x0244:
            r0 = move-exception
        L_0x0245:
            boolean r2 = com.mbridge.msdk.MBridgeConstans.DEBUG
            if (r2 == 0) goto L_0x024c
            r0.printStackTrace()
        L_0x024c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9556c.mo63230a(int, java.lang.String, boolean, int, boolean, int, java.util.List, boolean):boolean");
    }

    public void load(String str) {
        C9581k c = mo63234c(str);
        if (c != null) {
            c.mo63262a();
        }
    }

    public C9581k createUnitCache(Context context, String str, List<CampaignEx> list, int i, C9584a aVar) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0) {
            return null;
        }
        if (this.f23511d.containsKey(str)) {
            C9581k kVar = this.f23511d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo63265a(list.get(0).getRequestId(), aVar);
            } else {
                kVar.mo63264a(aVar);
            }
            kVar.mo63266a(list);
            return kVar;
        }
        C9581k kVar2 = new C9581k(context, list, (ExecutorService) this.f23509b, str, i);
        if (aVar != null) {
            kVar2.mo63264a(aVar);
        }
        this.f23511d.put(str, kVar2);
        return kVar2;
    }

    public C9581k createUnitCache(Context context, String str, CampaignEx campaignEx, int i, C9584a aVar) {
        if (TextUtils.isEmpty(str) || campaignEx == null) {
            return null;
        }
        if (this.f23511d.containsKey(str)) {
            C9581k kVar = this.f23511d.get(str);
            if (i == 94 || i == 287) {
                kVar.mo63265a(campaignEx.getRequestId(), aVar);
            } else {
                kVar.mo63264a(aVar);
            }
            kVar.mo63263a(campaignEx);
            return kVar;
        }
        C9581k kVar2 = new C9581k(context, campaignEx, (ExecutorService) this.f23509b, str, i);
        if (aVar != null) {
            kVar2.mo63264a(aVar);
        }
        this.f23511d.put(str, kVar2);
        return kVar2;
    }

    /* renamed from: a */
    public final void mo63227a(boolean z) {
        this.f23510c = z;
        ConcurrentHashMap<String, C9581k> concurrentHashMap = this.f23511d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9581k> value : concurrentHashMap.entrySet()) {
                C9581k kVar = (C9581k) value.getValue();
                if (kVar != null) {
                    kVar.mo63268b();
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo63231b(String str, String str2) {
        CopyOnWriteArrayList<Map<String, C9552a>> c;
        C9552a aVar;
        CampaignEx g;
        ConcurrentHashMap<String, C9581k> concurrentHashMap = this.f23511d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9581k> value : concurrentHashMap.entrySet()) {
                C9581k kVar = (C9581k) value.getValue();
                if (!(kVar == null || (c = kVar.mo63270c()) == null)) {
                    int size = c.size();
                    for (int i = 0; i < size; i++) {
                        Map map = c.get(i);
                        if (map != null) {
                            Iterator it = map.entrySet().iterator();
                            if (!(!it.hasNext() || (aVar = (C9552a) ((Map.Entry) it.next()).getValue()) == null || (g = aVar.mo63212g()) == null)) {
                                String videoUrlEncode = g.getVideoUrlEncode();
                                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(videoUrlEncode) && str2.equals(videoUrlEncode)) {
                                    return aVar.mo63211f();
                                }
                            }
                        }
                    }
                    continue;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo63233b(boolean z) {
        if (!z) {
            this.f23510c = false;
        } else if (this.f23510c) {
            return;
        }
        ConcurrentHashMap<String, C9581k> concurrentHashMap = this.f23511d;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, C9581k> value : concurrentHashMap.entrySet()) {
                ((C9581k) value.getValue()).mo63262a();
            }
        }
    }

    /* renamed from: a */
    public final void mo63226a() {
        ConcurrentHashMap<String, C9581k> concurrentHashMap = this.f23511d;
        if (concurrentHashMap != null) {
            for (Map.Entry next : concurrentHashMap.entrySet()) {
                C9581k kVar = (C9581k) next.getValue();
                String str = (String) next.getKey();
                try {
                    Class.forName("com.mbridge.msdk.videocommon.d.a");
                    C9551c a = C9549b.m27299a().mo63123a(C2350a.m5601e().mo15793h(), str);
                    if (a != null) {
                        if (a.mo63180u() == 2) {
                            kVar.mo63268b();
                        } else {
                            kVar.mo63262a();
                        }
                    }
                } catch (Exception e) {
                    C8608u.m24884d("DownLoadManager", e.getMessage());
                    try {
                        if (!TextUtils.isEmpty(str)) {
                            C2294d e2 = C2283b.m5275a().mo15569e(C2350a.m5601e().mo15793h(), str);
                            if (e2 == null) {
                                e2 = C2294d.m5326e(str);
                            }
                            if (e2.mo15597j() == 2) {
                                kVar.mo63268b();
                            } else {
                                kVar.mo63262a();
                            }
                        }
                    } catch (Exception e3) {
                        C8608u.m24884d("DownLoadManager", e3.getMessage());
                    }
                }
            }
        }
    }
}
