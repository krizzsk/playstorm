package com.smaato.sdk.video.vast.build;

import java.util.ArrayList;
import java.util.List;

public final class VastScenarioMergeUtils {
    private VastScenarioMergeUtils() {
    }

    public static <T> List<T> merge(List<T> list, List<T> list2) {
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
