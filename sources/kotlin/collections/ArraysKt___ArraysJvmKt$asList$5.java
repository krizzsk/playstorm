package kotlin.collections;

import java.util.RandomAccess;
import kotlin.Metadata;

@Metadata(mo75041d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo75042d2 = {"kotlin/collections/ArraysKt___ArraysJvmKt$asList$5", "Lkotlin/collections/AbstractList;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", "", "getSize", "()I", "contains", "", "element", "get", "index", "(I)Ljava/lang/Float;", "indexOf", "isEmpty", "lastIndexOf", "kotlin-stdlib"}, mo75043k = 1, mo75044mv = {1, 5, 1})
/* compiled from: _ArraysJvm.kt */
public final class ArraysKt___ArraysJvmKt$asList$5 extends AbstractList<Float> implements RandomAccess {
    final /* synthetic */ float[] $this_asList;

    ArraysKt___ArraysJvmKt$asList$5(float[] fArr) {
        this.$this_asList = fArr;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Float) {
            return contains(((Number) obj).floatValue());
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Float) {
            return indexOf(((Number) obj).floatValue());
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            return lastIndexOf(((Number) obj).floatValue());
        }
        return -1;
    }

    public int getSize() {
        return this.$this_asList.length;
    }

    public boolean isEmpty() {
        return this.$this_asList.length == 0;
    }

    public boolean contains(float f) {
        float[] fArr = this.$this_asList;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                return true;
            }
        }
        return false;
    }

    public Float get(int i) {
        return Float.valueOf(this.$this_asList[i]);
    }

    public int indexOf(float f) {
        float[] fArr = this.$this_asList;
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.floatToIntBits(fArr[i]) == Float.floatToIntBits(f)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(float f) {
        float[] fArr = this.$this_asList;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f)) {
                return length;
            }
        }
        return -1;
    }
}
