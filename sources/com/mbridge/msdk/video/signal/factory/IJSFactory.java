package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C9413a;
import com.mbridge.msdk.video.signal.C9431b;
import com.mbridge.msdk.video.signal.C9432c;
import com.mbridge.msdk.video.signal.C9526e;
import com.mbridge.msdk.video.signal.C9527f;
import com.mbridge.msdk.video.signal.C9531h;
import com.mbridge.msdk.video.signal.C9532i;

public interface IJSFactory {
    C9413a getActivityProxy();

    C9531h getIJSRewardVideoV1();

    C9431b getJSBTModule();

    C9432c getJSCommon();

    C9526e getJSContainerModule();

    C9527f getJSNotifyProxy();

    C9532i getJSVideoModule();
}
