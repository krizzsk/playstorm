package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.C11907a;

public class AudioVolumeHandler implements C11907a.C11909b {

    /* renamed from: a */
    private C11907a f28972a;

    AudioVolumeHandler(Context context) {
        C11907a aVar = new C11907a(context);
        this.f28972a = aVar;
        aVar.mo73018a(this);
    }

    /* renamed from: a */
    public final void mo72841a() {
        this.f28972a.mo73017a();
        this.f28972a = null;
    }

    public final native void onAudioVolumeChanged(int i);
}
