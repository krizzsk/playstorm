package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.foundation.controller.C2358b;
import com.mbridge.msdk.foundation.p066db.BatchReportDao;
import com.mbridge.msdk.foundation.same.net.p310f.C8487d;
import com.mbridge.msdk.foundation.same.net.p311g.C8494d;
import com.mbridge.msdk.foundation.same.report.p315d.C8540a;
import com.mbridge.msdk.foundation.same.report.p315d.C8541b;
import com.mbridge.msdk.foundation.tools.C8608u;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.mbridge.msdk.foundation.same.report.b */
/* compiled from: MBBatchReportManager */
public final class C8518b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f20639a = C8518b.class.getSimpleName();

    /* renamed from: b */
    private static volatile C8518b f20640b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f20641c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20642d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f20643e = 30;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f20644f = 5000;

    /* renamed from: g */
    private String f20645g = C8487d.m24492a().f20531a;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public BatchReportDao f20646h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AtomicInteger f20647i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Stack<Long> f20648j;

    /* renamed from: k */
    private Executor f20649k = Executors.newSingleThreadExecutor();

    private C8518b() {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        if (b != null) {
            this.f20643e = b.mo15468ag();
            this.f20644f = (long) (b.mo15469ah() * 1000);
            this.f20642d = b.mo15470ai() != 1 ? false : true;
        }
        if (this.f20642d) {
            this.f20647i = new AtomicInteger(0);
            this.f20648j = new Stack<>();
            this.f20646h = BatchReportDao.getInstance(C2350a.m5601e().mo15792g());
            HandlerThread handlerThread = new HandlerThread("mb_batch_report_thread");
            handlerThread.start();
            this.f20641c = new Handler(handlerThread.getLooper()) {
                public final void handleMessage(Message message) {
                    Bundle data;
                    int i = message.what;
                    if (i == 1) {
                        Bundle data2 = message.getData();
                        if (C8518b.this.f20641c != null && C8518b.this.f20646h != null && data2 != null) {
                            C8518b.this.f20641c.removeMessages(2);
                            long currentTimeMillis = System.currentTimeMillis();
                            C8518b.m24608a(C8518b.this, C8518b.this.f20646h.getBatchReportMessages(currentTimeMillis), currentTimeMillis);
                            C8518b.this.f20647i.set(0);
                        }
                    } else if (i == 2) {
                        Bundle data3 = message.getData();
                        if (C8518b.this.f20641c != null && C8518b.this.f20646h != null && data3 != null) {
                            C8518b.this.f20641c.removeMessages(1);
                            long j = data3.getLong("last_report_time");
                            C8518b.m24608a(C8518b.this, C8518b.this.f20646h.getBatchReportMessages(j), j);
                        }
                    } else if (i == 3 && (data = message.getData()) != null) {
                        C8518b.m24610b(C8518b.this, data.getParcelableArrayList("report_message"), data.getLong("last_report_time"));
                    }
                }
            };
        }
    }

    /* renamed from: a */
    public static C8518b m24607a() {
        if (f20640b == null) {
            synchronized (C8518b.class) {
                if (f20640b == null) {
                    f20640b = new C8518b();
                }
            }
        }
        return f20640b;
    }

    /* renamed from: b */
    public final void mo57680b() {
        Handler handler;
        if (this.f20642d && (handler = this.f20641c) != null && !handler.hasMessages(1)) {
            Message obtain = Message.obtain();
            obtain.what = 1;
            this.f20641c.sendMessageDelayed(obtain, 5000);
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo57681c() {
        return this.f20642d;
    }

    /* renamed from: a */
    public final synchronized void mo57679a(final String str) {
        C85213 r0 = new Runnable() {
            public final void run() {
                if (C8518b.this.f20646h != null && C8518b.this.f20642d) {
                    String d = C8518b.f20639a;
                    C8608u.m24880a(d, "接收到上报数据： " + str);
                    C8518b.this.f20646h.addReportMessage(str);
                    if (C8518b.this.f20641c != null && C8518b.this.f20644f > 0 && !C8518b.this.f20641c.hasMessages(1)) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        C8518b.this.f20641c.sendMessageDelayed(obtain, C8518b.this.f20644f);
                    }
                    if (C8518b.this.f20647i.incrementAndGet() >= C8518b.this.f20643e && C8518b.this.f20641c != null) {
                        Message obtain2 = Message.obtain();
                        Bundle bundle = new Bundle();
                        bundle.putLong("last_report_time", System.currentTimeMillis());
                        obtain2.setData(bundle);
                        obtain2.what = 2;
                        C8518b.this.f20641c.sendMessage(obtain2);
                        C8518b.this.f20647i.set(0);
                    }
                }
            }
        };
        if (!C2358b.m5644a().mo15829d()) {
            r0.run();
        } else if (this.f20649k != null) {
            this.f20649k.execute(r0);
        } else {
            r0.run();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m24608a(C8518b bVar, ArrayList arrayList, long j) {
        if (arrayList != null && arrayList.size() > 0) {
            Message obtain = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("report_message", arrayList);
            bundle.putLong("last_report_time", j);
            obtain.setData(bundle);
            obtain.what = 3;
            bVar.f20641c.sendMessage(obtain);
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m24610b(C8518b bVar, final ArrayList arrayList, final long j) {
        Context g;
        if (arrayList != null && arrayList.size() > 0 && (g = C2350a.m5601e().mo15792g()) != null) {
            C8494d a = C8542e.m24688a(g);
            a.mo57606a("app_id", C2350a.m5601e().mo15793h());
            a.mo57606a("m_sdk", "msdk");
            a.mo57606a("lqswt", String.valueOf(1));
            StringBuilder sb = new StringBuilder();
            C2278a f = C2283b.m5275a().mo15571f(C2350a.m5601e().mo15793h());
            for (int i = 0; i < arrayList.size(); i++) {
                BatchReportMessage batchReportMessage = (BatchReportMessage) arrayList.get(i);
                if (batchReportMessage != null) {
                    String str = batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp();
                    if (C8542e.m24599a(f, str)) {
                        sb.append(str);
                        if (i >= 0 && i < arrayList.size() - 1) {
                            sb.append("\n");
                        }
                    }
                }
            }
            try {
                a.mo57606a("data", URLEncoder.encode(sb.toString(), "utf-8"));
                new C8540a(C2350a.m5601e().mo15792g()).mo57603c(0, bVar.f20645g, a, new C8541b() {
                    /* renamed from: a */
                    public final void mo15651a(String str) {
                        try {
                            if (C8518b.this.f20646h != null) {
                                C8518b.this.f20646h.deleteBatchReportMessagesByTimestamp(j);
                            }
                        } catch (Exception e) {
                            C8608u.m24884d(C8518b.f20639a, e.getMessage());
                        }
                        synchronized (C8518b.this.f20648j) {
                            C8518b.this.f20648j.clear();
                        }
                    }

                    /* renamed from: b */
                    public final void mo15652b(String str) {
                        Stack d;
                        synchronized (C8518b.this.f20648j) {
                            C8518b.this.f20648j.add(Long.valueOf(j));
                            if (C8518b.this.f20646h != null) {
                                C8518b.this.f20646h.updateMessagesReportState(arrayList);
                            }
                            if (C8518b.this.f20648j.size() >= 5) {
                                try {
                                    C8518b.this.f20648j.pop();
                                    long longValue = ((Long) C8518b.this.f20648j.pop()).longValue();
                                    C8518b.this.f20648j.clear();
                                    if (C8518b.this.f20646h != null) {
                                        C8518b.this.f20646h.deleteBatchReportMessagesByTimestamp(longValue);
                                    }
                                    d = C8518b.this.f20648j;
                                } catch (Exception e) {
                                    try {
                                        C8608u.m24884d(C8518b.f20639a, e.getMessage());
                                        d = C8518b.this.f20648j;
                                    } catch (Throwable th) {
                                        C8518b.this.f20648j.clear();
                                        throw th;
                                    }
                                }
                                d.clear();
                            }
                        }
                    }
                });
            } catch (Exception e) {
                C8608u.m24884d(f20639a, e.getMessage());
            }
        }
    }
}
