package com.amazon.device.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class MraidCommand {
    static HashMap<String, Class> commandRepository = new HashMap<>();

    /* access modifiers changed from: package-private */
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
    }

    public abstract String getName();

    MraidCommand() {
    }

    public static Class<MraidCommand> findMraidCommandByName(String str) {
        return commandRepository.get(str);
    }

    static void registerCommand(String str, Class cls) {
        commandRepository.put(str, cls);
    }

    public static Map<String, String> parseQueryString(String str) {
        String[] split = str.split("&");
        HashMap hashMap = new HashMap();
        for (String str2 : split) {
            int indexOf = str2.indexOf(61);
            if (indexOf > 0 && indexOf < str2.length() - 1) {
                hashMap.put(str2.substring(0, indexOf), str2.substring(indexOf + 1));
            }
        }
        return hashMap;
    }
}
