package com.applovin.impl.communicator;

import android.content.Context;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorMessagingService;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

public class MessagingServiceImpl implements AppLovinCommunicatorMessagingService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f1979a;

    /* renamed from: b */
    private final ScheduledThreadPoolExecutor f1980b;

    /* renamed from: c */
    private final Map<String, Queue<CommunicatorMessageImpl>> f1981c = new HashMap();

    /* renamed from: d */
    private final Object f1982d = new Object();

    public MessagingServiceImpl(Context context) {
        this.f1979a = context;
        this.f1980b = m2898a();
    }

    /* renamed from: a */
    private Queue<CommunicatorMessageImpl> m2897a(String str) {
        LinkedList linkedList;
        synchronized (this.f1982d) {
            Queue queue = this.f1981c.get(str);
            linkedList = queue != null ? new LinkedList(queue) : new LinkedList();
        }
        return linkedList;
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m2898a() {
        return new ScheduledThreadPoolExecutor(4, new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "AppLovinSdk:com.applovin.communicator");
                thread.setPriority(10);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    /* renamed from: a */
    private void m2899a(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (appLovinCommunicatorMessage.sticky) {
            synchronized (this.f1982d) {
                Queue queue = this.f1981c.get(appLovinCommunicatorMessage.getTopic());
                if (queue != null) {
                    queue.add(appLovinCommunicatorMessage);
                    if (queue.size() > 100) {
                        queue.remove();
                    }
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(appLovinCommunicatorMessage);
                    this.f1981c.put(appLovinCommunicatorMessage.getTopic(), linkedList);
                }
            }
        }
    }

    /* renamed from: a */
    private void m2900a(final CommunicatorMessageImpl communicatorMessageImpl) {
        this.f1980b.execute(new Runnable() {
            public void run() {
                AppLovinBroadcastManager.getInstance(MessagingServiceImpl.this.f1979a).sendBroadcastSync(communicatorMessageImpl, (Map<String, Object>) null);
            }
        });
    }

    public void maybeFlushStickyMessages(String str) {
        for (CommunicatorMessageImpl a : m2897a(str)) {
            m2900a(a);
        }
    }

    public void publish(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        m2900a((CommunicatorMessageImpl) appLovinCommunicatorMessage);
        m2899a(appLovinCommunicatorMessage);
    }

    public String toString() {
        return "MessagingServiceImpl{}";
    }
}
