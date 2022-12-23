package com.ogury.core.internal.crash;

import com.ogury.core.internal.C10219ai;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.d */
/* compiled from: CrashFileWriter.kt */
public final class C10248d {
    static {
        new C10249a((byte) 0);
    }

    /* renamed from: com.ogury.core.internal.crash.d$a */
    /* compiled from: CrashFileWriter.kt */
    public static final class C10249a {
        private C10249a() {
        }

        public /* synthetic */ C10249a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private static void m31076b(JSONArray jSONArray, File file) {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(jSONArray);
        printWriter.close();
    }

    /* renamed from: a */
    public final void mo66816a(JSONArray jSONArray, File file) {
        C10219ai.m31036b(jSONArray, "crashes");
        C10219ai.m31036b(file, "crashFile");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.put("number_of_crashes_on_last_upload", jSONObject.getInt("number_of_crashes"));
        }
        m31076b(jSONArray, file);
    }

    /* renamed from: a */
    public final void mo66815a(File file, JSONObject jSONObject, JSONArray jSONArray) {
        C10219ai.m31036b(file, "crashFile");
        C10219ai.m31036b(jSONObject, "newCrash");
        C10219ai.m31036b(jSONArray, "previousCrashes");
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C10219ai.m31035a((Object) jSONArray.getJSONObject(i).getString("stacktrace"), (Object) jSONObject.getString("stacktrace"))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("number_of_crashes_on_last_upload");
            jSONObject.put("number_of_crashes", jSONObject2.getInt("number_of_crashes") + 1);
            jSONObject.put("number_of_crashes_on_last_upload", i2);
            jSONArray.put(i, jSONObject);
        } else {
            jSONArray.put(jSONObject);
        }
        m31076b(jSONArray, file);
    }
}
