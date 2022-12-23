package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.misc.IJsonStorageReader;
import com.unity3d.services.core.misc.Utilities;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class PiiDataSelector {
    private final Experiments _experiments;
    private final IJsonStorageReader _jsonStorageReader;
    /* access modifiers changed from: private */
    public final PiiTrackingStatusReader _piiTrackingStatusReader;

    public PiiDataSelector(PiiTrackingStatusReader piiTrackingStatusReader, IJsonStorageReader iJsonStorageReader, Experiments experiments) {
        this._piiTrackingStatusReader = piiTrackingStatusReader;
        this._jsonStorageReader = iJsonStorageReader;
        this._experiments = experiments;
    }

    /* renamed from: com.unity3d.services.core.device.reader.pii.PiiDataSelector$2 */
    static /* synthetic */ class C120842 {

        /* renamed from: $SwitchMap$com$unity3d$services$core$device$reader$pii$PiiPrivacyMode */
        static final /* synthetic */ int[] f29320x6ad1d1a2;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.core.device.reader.pii.PiiPrivacyMode[] r0 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29320x6ad1d1a2 = r0
                com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29320x6ad1d1a2     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.NULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29320x6ad1d1a2     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.device.reader.pii.PiiPrivacyMode r1 = com.unity3d.services.core.device.reader.pii.PiiPrivacyMode.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.pii.PiiDataSelector.C120842.<clinit>():void");
        }
    }

    public PiiDecisionData whatToDoWithPII() {
        int i = C120842.f29320x6ad1d1a2[this._piiTrackingStatusReader.getPrivacyMode().ordinal()];
        if (i == 1 || i == 2) {
            return allowTrackingDecision();
        }
        if (i != 3) {
            return notAllowedDecision();
        }
        return mixedModeDecision();
    }

    private PiiDecisionData allowTrackingDecision() {
        return new PiiDecisionData(this._experiments.isUpdatePiiFields() ? DataSelectorResult.UPDATE : DataSelectorResult.INCLUDE, getPiiContentFromStorage());
    }

    private PiiDecisionData notAllowedDecision() {
        return new PiiDecisionData(DataSelectorResult.EXCLUDE);
    }

    private PiiDecisionData mixedModeDecision() {
        if (this._piiTrackingStatusReader.getUserNonBehavioralFlag()) {
            return new PiiDecisionData(DataSelectorResult.INCLUDE, getUserBehavioralAttribute());
        }
        PiiDecisionData allowTrackingDecision = allowTrackingDecision();
        allowTrackingDecision.appendData(getUserBehavioralAttribute());
        return allowTrackingDecision;
    }

    private HashMap<String, Object> getUserBehavioralAttribute() {
        return new HashMap<String, Object>() {
            {
                put(JsonStorageKeyNames.USER_NON_BEHAVIORAL_KEY, Boolean.valueOf(PiiDataSelector.this._piiTrackingStatusReader.getUserNonBehavioralFlag()));
            }
        };
    }

    private Map<String, Object> getPiiContentFromStorage() {
        Object obj = this._jsonStorageReader.get(JsonStorageKeyNames.UNIFIED_CONFIG_PII_KEY);
        HashMap hashMap = new HashMap();
        return obj instanceof JSONObject ? Utilities.combineJsonIntoMap(hashMap, (JSONObject) obj, "unifiedconfig.pii.") : hashMap;
    }
}
