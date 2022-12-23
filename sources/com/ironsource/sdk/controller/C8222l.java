package com.ironsource.sdk.controller;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.p294h.C8352b;
import com.ironsource.sdk.p294h.C8355c;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.l */
final class C8222l {

    /* renamed from: a */
    String f19657a;

    /* renamed from: b */
    C8352b f19658b;

    C8222l(String str, C8352b bVar) {
        this.f19657a = str;
        this.f19658b = bVar;
    }

    /* renamed from: a */
    static C8355c m23591a(JSONObject jSONObject, String str) {
        if (!jSONObject.has("filePath") || !jSONObject.has("fileName")) {
            throw new Exception("Missing params for file");
        }
        String string = jSONObject.getString("filePath");
        return new C8355c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, string), jSONObject.getString("fileName"));
    }

    /* renamed from: a */
    static JSONObject m23592a(C8225n nVar, long j) {
        try {
            return nVar.mo56578a().put(IronSourceConstants.EVENTS_RESULT, j);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m23593a(C8225n nVar, String str) {
        try {
            return nVar.mo56578a().put("errMsg", str);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: a */
    static JSONObject m23594a(C8225n nVar, JSONObject jSONObject) {
        try {
            return nVar.mo56578a().put(IronSourceConstants.EVENTS_RESULT, jSONObject);
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    /* renamed from: b */
    static C8355c m23595b(JSONObject jSONObject, String str) {
        if (jSONObject.has("folderPath")) {
            return new C8355c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str, jSONObject.getString("folderPath")));
        }
        throw new Exception("Missing params for folder");
    }
}
