package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonStorageAggregator implements IJsonStorageReader {
    private final List<IJsonStorageReader> _jsonStorageReaders;

    public JsonStorageAggregator(List<IJsonStorageReader> list) {
        this._jsonStorageReaders = list;
    }

    public JSONObject getData() {
        JSONObject jSONObject = new JSONObject();
        for (IJsonStorageReader next : this._jsonStorageReaders) {
            if (next != null) {
                try {
                    jSONObject = Utilities.mergeJsonObjects(jSONObject, next.getData());
                } catch (JSONException unused) {
                    DeviceLog.error("Failed to merge storage: " + next);
                }
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0017, LOOP_START, PHI: r1 
      PHI: (r1v1 java.lang.Object) = (r1v0 java.lang.Object), (r1v5 java.lang.Object) binds: [B:0:0x0000, B:4:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(java.lang.String r4) {
        /*
            r3 = this;
            java.util.List<com.unity3d.services.core.misc.IJsonStorageReader> r0 = r3._jsonStorageReaders
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x0007:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0019
            java.lang.Object r1 = r0.next()
            com.unity3d.services.core.misc.IJsonStorageReader r1 = (com.unity3d.services.core.misc.IJsonStorageReader) r1
            java.lang.Object r1 = r1.get(r4)
            if (r1 == 0) goto L_0x0007
        L_0x0019:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.misc.JsonStorageAggregator.get(java.lang.String):java.lang.Object");
    }
}
