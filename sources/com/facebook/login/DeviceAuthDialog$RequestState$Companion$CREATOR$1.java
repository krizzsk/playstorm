package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.login.DeviceAuthDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo75041d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, mo75042d2 = {"com/facebook/login/DeviceAuthDialog$RequestState$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/login/DeviceAuthDialog$RequestState;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/login/DeviceAuthDialog$RequestState;", "facebook-common_release"}, mo75043k = 1, mo75044mv = {1, 5, 1}, mo75046xi = 48)
/* compiled from: DeviceAuthDialog.kt */
public final class DeviceAuthDialog$RequestState$Companion$CREATOR$1 implements Parcelable.Creator<DeviceAuthDialog.RequestState> {
    DeviceAuthDialog$RequestState$Companion$CREATOR$1() {
    }

    public DeviceAuthDialog.RequestState createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new DeviceAuthDialog.RequestState(parcel);
    }

    public DeviceAuthDialog.RequestState[] newArray(int i) {
        return new DeviceAuthDialog.RequestState[i];
    }
}
