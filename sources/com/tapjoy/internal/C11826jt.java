package com.tapjoy.internal;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatExtras;
import androidx.core.app.NotificationManagerCompat;
import com.tapjoy.internal.C11821js;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tapjoy.internal.jt */
public final class C11826jt implements C11820jr {

    /* renamed from: a */
    private final Notification.Builder f28903a;

    /* renamed from: b */
    private final C11821js.C11824c f28904b;

    /* renamed from: c */
    private RemoteViews f28905c;

    /* renamed from: d */
    private RemoteViews f28906d;

    /* renamed from: e */
    private final List<Bundle> f28907e = new ArrayList();

    /* renamed from: f */
    private final Bundle f28908f = new Bundle();

    /* renamed from: g */
    private int f28909g;

    /* renamed from: h */
    private RemoteViews f28910h;

    public C11826jt(C11821js.C11824c cVar) {
        this.f28904b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28903a = new Notification.Builder(cVar.f28873a, cVar.f28866H);
        } else {
            this.f28903a = new Notification.Builder(cVar.f28873a);
        }
        Notification notification = cVar.f28871M;
        this.f28903a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.f28879g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f28875c).setContentText(cVar.f28876d).setContentInfo(cVar.f28881i).setContentIntent(cVar.f28877e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f28878f, (notification.flags & 128) != 0).setLargeIcon(cVar.f28880h).setNumber(cVar.f28882j).setProgress(cVar.f28889q, cVar.f28890r, cVar.f28891s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f28903a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f28903a.setSubText(cVar.f28887o).setUsesChronometer(cVar.f28885m).setPriority(cVar.f28883k);
            Iterator<C11821js.C11822a> it = cVar.f28874b.iterator();
            while (it.hasNext()) {
                m34379a(it.next());
            }
            if (cVar.f28859A != null) {
                this.f28908f.putAll(cVar.f28859A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.f28895w) {
                    this.f28908f.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (cVar.f28892t != null) {
                    this.f28908f.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, cVar.f28892t);
                    if (cVar.f28893u) {
                        this.f28908f.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.f28908f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (cVar.f28894v != null) {
                    this.f28908f.putString(NotificationCompatExtras.EXTRA_SORT_KEY, cVar.f28894v);
                }
            }
            this.f28905c = cVar.f28863E;
            this.f28906d = cVar.f28864F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f28903a.setShowWhen(cVar.f28884l);
            if (Build.VERSION.SDK_INT < 21 && cVar.f28872N != null && !cVar.f28872N.isEmpty()) {
                this.f28908f.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) cVar.f28872N.toArray(new String[cVar.f28872N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f28903a.setLocalOnly(cVar.f28895w).setGroup(cVar.f28892t).setGroupSummary(cVar.f28893u).setSortKey(cVar.f28894v);
            this.f28909g = cVar.f28870L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f28903a.setCategory(cVar.f28898z).setColor(cVar.f28860B).setVisibility(cVar.f28861C).setPublicVersion(cVar.f28862D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = cVar.f28872N.iterator();
            while (it2.hasNext()) {
                this.f28903a.addPerson(it2.next());
            }
            this.f28910h = cVar.f28865G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f28903a.setExtras(cVar.f28859A).setRemoteInputHistory(cVar.f28888p);
            if (cVar.f28863E != null) {
                this.f28903a.setCustomContentView(cVar.f28863E);
            }
            if (cVar.f28864F != null) {
                this.f28903a.setCustomBigContentView(cVar.f28864F);
            }
            if (cVar.f28865G != null) {
                this.f28903a.setCustomHeadsUpContentView(cVar.f28865G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f28903a.setBadgeIconType(cVar.f28867I).setShortcutId(cVar.f28868J).setTimeoutAfter(cVar.f28869K).setGroupAlertBehavior(cVar.f28870L);
            if (cVar.f28897y) {
                this.f28903a.setColorized(cVar.f28896x);
            }
            if (!TextUtils.isEmpty(cVar.f28866H)) {
                this.f28903a.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    /* renamed from: a */
    public final Notification.Builder mo72797a() {
        return this.f28903a;
    }

    /* renamed from: b */
    public final Notification mo72806b() {
        Notification notification;
        C11821js.C11825d dVar = this.f28904b.f28886n;
        if (dVar != null) {
            dVar.mo72799a((C11820jr) this);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            notification = this.f28903a.build();
        } else if (Build.VERSION.SDK_INT >= 24) {
            notification = this.f28903a.build();
            if (this.f28909g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28909g != 2)) {
                    m34378a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28909g == 1) {
                    m34378a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f28903a.setExtras(this.f28908f);
            notification = this.f28903a.build();
            RemoteViews remoteViews = this.f28905c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f28906d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f28910h;
            if (remoteViews3 != null) {
                notification.headsUpContentView = remoteViews3;
            }
            if (this.f28909g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28909g != 2)) {
                    m34378a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28909g == 1) {
                    m34378a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f28903a.setExtras(this.f28908f);
            notification = this.f28903a.build();
            RemoteViews remoteViews4 = this.f28905c;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f28906d;
            if (remoteViews5 != null) {
                notification.bigContentView = remoteViews5;
            }
            if (this.f28909g != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.f28909g != 2)) {
                    m34378a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.f28909g == 1) {
                    m34378a(notification);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> a = C11827ju.m34384a(this.f28907e);
            if (a != null) {
                this.f28908f.putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a);
            }
            this.f28903a.setExtras(this.f28908f);
            notification = this.f28903a.build();
            RemoteViews remoteViews6 = this.f28905c;
            if (remoteViews6 != null) {
                notification.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f28906d;
            if (remoteViews7 != null) {
                notification.bigContentView = remoteViews7;
            }
        } else if (Build.VERSION.SDK_INT >= 16) {
            notification = this.f28903a.build();
            Bundle a2 = C11821js.m34367a(notification);
            Bundle bundle = new Bundle(this.f28908f);
            for (String str : this.f28908f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C11827ju.m34384a(this.f28907e);
            if (a3 != null) {
                C11821js.m34367a(notification).putSparseParcelableArray(NotificationCompatExtras.EXTRA_ACTION_EXTRAS, a3);
            }
            RemoteViews remoteViews8 = this.f28905c;
            if (remoteViews8 != null) {
                notification.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f28906d;
            if (remoteViews9 != null) {
                notification.bigContentView = remoteViews9;
            }
        } else {
            notification = this.f28903a.getNotification();
        }
        if (this.f28904b.f28863E != null) {
            notification.contentView = this.f28904b.f28863E;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT >= 16 && dVar != null) {
            C11821js.m34367a(notification);
        }
        return notification;
    }

    /* renamed from: a */
    private void m34379a(C11821js.C11822a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.f28855e, aVar.f28856f, aVar.f28857g);
            if (aVar.f28852b != null) {
                for (RemoteInput addRemoteInput : C11828jv.m34386a(aVar.f28852b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (aVar.f28851a != null) {
                bundle = new Bundle(aVar.f28851a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f28854d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f28854d);
            }
            builder.addExtras(bundle);
            this.f28903a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f28907e.add(C11827ju.m34382a(this.f28903a, aVar));
        }
    }

    /* renamed from: a */
    private static void m34378a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
