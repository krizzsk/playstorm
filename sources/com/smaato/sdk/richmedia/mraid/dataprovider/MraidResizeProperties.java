package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.graphics.Rect;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import com.smaato.sdk.richmedia.mraid.exception.MraidException;
import com.smaato.sdk.richmedia.util.RectUtils;
import java.util.ArrayList;
import java.util.Map;

public final class MraidResizeProperties {
    final boolean allowOffscreen;
    final int heightDp;
    final int offsetXDp;
    final int offsetYDp;
    final int widthDp;

    private MraidResizeProperties(int i, int i2, int i3, int i4, boolean z) {
        this.widthDp = i;
        this.heightDp = i2;
        this.offsetXDp = i3;
        this.offsetYDp = i4;
        this.allowOffscreen = z;
    }

    public Rect getRectRelativeToMaxSize(Rect rect, Rect rect2) {
        int i = this.offsetXDp;
        int i2 = this.offsetYDp;
        if (!rect.isEmpty()) {
            i += rect.left;
            i2 += rect.top;
        }
        Rect rect3 = new Rect(i, i2, this.widthDp + i, this.heightDp + i2);
        if (this.allowOffscreen) {
            return rect3;
        }
        return RectUtils.adjust(rect3, rect2);
    }

    public static class Builder {
        private Boolean allowOffscreen = Boolean.FALSE;
        private Integer heightDp;
        private Integer offsetXDp;
        private Integer offsetYDp;
        private Integer widthDp;

        public Builder(Map<String, String> map) {
            Integer num;
            Integer num2;
            Integer num3;
            String str = map.get("width");
            Integer num4 = null;
            if (!TextUtils.isEmpty(str)) {
                Float parseOptFloat = MraidUtils.parseOptFloat(str);
                if (parseOptFloat == null) {
                    num3 = null;
                } else {
                    num3 = Integer.valueOf(parseOptFloat.intValue());
                }
                this.widthDp = num3;
            }
            String str2 = map.get("height");
            if (!TextUtils.isEmpty(str2)) {
                Float parseOptFloat2 = MraidUtils.parseOptFloat(str2);
                if (parseOptFloat2 == null) {
                    num2 = null;
                } else {
                    num2 = Integer.valueOf(parseOptFloat2.intValue());
                }
                this.heightDp = num2;
            }
            String str3 = map.get("offsetX");
            if (!TextUtils.isEmpty(str3)) {
                Float parseOptFloat3 = MraidUtils.parseOptFloat(str3);
                if (parseOptFloat3 == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(parseOptFloat3.intValue());
                }
                this.offsetXDp = num;
            }
            String str4 = map.get("offsetY");
            if (!TextUtils.isEmpty(str4)) {
                Float parseOptFloat4 = MraidUtils.parseOptFloat(str4);
                this.offsetYDp = parseOptFloat4 != null ? Integer.valueOf(parseOptFloat4.intValue()) : num4;
            }
            String str5 = map.get("allowOffscreen");
            if (!TextUtils.isEmpty(str5)) {
                this.allowOffscreen = Boolean.valueOf(Boolean.parseBoolean(str5));
            }
        }

        public MraidResizeProperties build() throws MraidException {
            ArrayList arrayList = new ArrayList();
            if (this.widthDp == null) {
                arrayList.add("width");
            }
            if (this.heightDp == null) {
                arrayList.add("height");
            }
            if (this.offsetXDp == null) {
                arrayList.add("offsetX");
            }
            if (this.offsetYDp == null) {
                arrayList.add("offsetY");
            }
            if (!arrayList.isEmpty()) {
                throw new MraidException("Missing required parameter(s): " + Joiner.join((CharSequence) ", ", (Iterable) arrayList));
            } else if (this.widthDp.intValue() >= 50 && this.heightDp.intValue() >= 50) {
                return new MraidResizeProperties(this.widthDp.intValue(), this.heightDp.intValue(), this.offsetXDp.intValue(), this.offsetYDp.intValue(), this.allowOffscreen.booleanValue());
            } else {
                throw new MraidException("Expected resize dimension should be >= 50 dp");
            }
        }
    }
}
