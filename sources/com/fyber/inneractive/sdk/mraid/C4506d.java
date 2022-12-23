package com.fyber.inneractive.sdk.mraid;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C5348k;
import com.fyber.inneractive.sdk.util.C5364p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5407d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.d */
public class C4506d extends C4501a {
    public C4506d(Map<String, String> map, C5407d dVar, C5364p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo24710a() {
        L l;
        C5407d dVar = this.f11164c;
        Map<String, String> map = this.f11163b;
        Context g = dVar.mo26554g();
        boolean z = true;
        if (C5348k.m16741a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"))) {
            try {
                Map<String, Object> a = dVar.mo26543a(map);
                Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
                HashMap hashMap = (HashMap) a;
                for (String str : hashMap.keySet()) {
                    Object obj = hashMap.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                g.startActivity(type);
            } catch (ActivityNotFoundException unused) {
                IAlog.m16699a("There is no calendar app installed!", new Object[0]);
                dVar.mo26545a(C4508f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                IAlog.m16699a("invalid parameters for create calendar ", e.getMessage());
                dVar.mo26545a(C4508f.CREATE_CALENDAR_EVENT, e.getMessage());
            } catch (Exception unused2) {
                IAlog.m16699a("Failed to create calendar event.", new Object[0]);
                dVar.mo26545a(C4508f.CREATE_CALENDAR_EVENT, "could not create calendar event");
            }
        } else {
            IAlog.m16699a("createCalendarEvent supported for devices post-ICS", new Object[0]);
            dVar.mo26545a(C4508f.CREATE_CALENDAR_EVENT, "Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
            z = false;
        }
        if (z && (l = dVar.f14285g) != null) {
            ((C5407d.C5413f) l).mo24970b();
        }
    }

    /* renamed from: c */
    public String mo24707c() {
        return null;
    }
}
