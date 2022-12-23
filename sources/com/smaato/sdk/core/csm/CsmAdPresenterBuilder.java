package com.smaato.sdk.core.csm;

import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import java.util.Map;

public interface CsmAdPresenterBuilder extends AdPresenterBuilder {

    public interface PassbackUrlRequestListener {
        void onCallPassbackUrl(String str);
    }

    void setObjectExtras(Map<String, Object> map);

    void setPassbackUrlRequestListener(PassbackUrlRequestListener passbackUrlRequestListener);
}
