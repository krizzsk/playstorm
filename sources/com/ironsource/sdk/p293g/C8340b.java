package com.ironsource.sdk.p293g;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.g.b */
public final class C8340b implements Parcelable {
    public static final Parcelable.Creator<C8340b> CREATOR = new Parcelable.Creator<C8340b>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C8340b(parcel, (byte) 0);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C8340b[i];
        }
    };

    /* renamed from: a */
    public String f20004a;

    /* renamed from: b */
    public String f20005b;

    /* renamed from: c */
    public String f20006c;

    /* renamed from: d */
    public boolean f20007d;

    /* renamed from: e */
    public int f20008e;

    /* renamed from: f */
    public String f20009f;

    /* renamed from: g */
    public String f20010g;

    /* renamed from: h */
    public boolean f20011h;

    /* renamed from: i */
    public boolean f20012i;

    /* renamed from: j */
    public Map<String, String> f20013j;

    /* renamed from: k */
    private ArrayList<String> f20014k;

    /* renamed from: l */
    private ArrayList<String> f20015l;

    /* renamed from: m */
    private ArrayList<String> f20016m;

    /* renamed from: n */
    private ArrayList<String> f20017n;

    /* renamed from: o */
    private Map<String, String> f20018o;

    public C8340b() {
        m23907a();
    }

    private C8340b(Parcel parcel) {
        m23907a();
        try {
            boolean z = true;
            this.f20007d = parcel.readByte() != 0;
            this.f20008e = parcel.readInt();
            this.f20004a = parcel.readString();
            this.f20005b = parcel.readString();
            this.f20006c = parcel.readString();
            this.f20009f = parcel.readString();
            this.f20010g = parcel.readString();
            this.f20018o = m23906a(parcel.readString());
            this.f20012i = parcel.readByte() != 0;
            if (parcel.readByte() == 0) {
                z = false;
            }
            this.f20011h = z;
            this.f20013j = m23906a(parcel.readString());
        } catch (Throwable unused) {
            m23907a();
        }
    }

    /* synthetic */ C8340b(Parcel parcel, byte b) {
        this(parcel);
    }

    /* renamed from: a */
    private static Map<String, String> m23906a(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m23907a() {
        this.f20007d = false;
        this.f20008e = -1;
        this.f20014k = new ArrayList<>();
        this.f20015l = new ArrayList<>();
        this.f20016m = new ArrayList<>();
        this.f20017n = new ArrayList<>();
        this.f20011h = true;
        this.f20012i = false;
        this.f20010g = "";
        this.f20009f = "";
        this.f20018o = new HashMap();
        this.f20013j = new HashMap();
    }

    /* renamed from: a */
    public final void mo56839a(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && this.f20016m.indexOf(str) == -1) {
            this.f20016m.add(str);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("shouldRestore:");
            sb.append(this.f20007d);
            sb.append(", ");
            sb.append("displayedProduct:");
            sb.append(this.f20008e);
            sb.append(", ");
            sb.append("ISReportInit:");
            sb.append(this.f20014k);
            sb.append(", ");
            sb.append("ISInitSuccess:");
            sb.append(this.f20015l);
            sb.append(", ");
            sb.append("ISAppKey");
            sb.append(this.f20009f);
            sb.append(", ");
            sb.append("ISUserId");
            sb.append(this.f20010g);
            sb.append(", ");
            sb.append("ISExtraParams");
            sb.append(this.f20018o);
            sb.append(", ");
            sb.append("OWReportInit");
            sb.append(this.f20011h);
            sb.append(", ");
            sb.append("OWInitSuccess");
            sb.append(this.f20012i);
            sb.append(", ");
            sb.append("OWExtraParams");
            sb.append(this.f20013j);
            sb.append(", ");
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 1;
            parcel.writeByte((byte) (this.f20007d ? 1 : 0));
            parcel.writeInt(this.f20008e);
            parcel.writeString(this.f20004a);
            parcel.writeString(this.f20005b);
            parcel.writeString(this.f20006c);
            parcel.writeString(this.f20009f);
            parcel.writeString(this.f20010g);
            parcel.writeString(new JSONObject(this.f20018o).toString());
            parcel.writeByte((byte) (this.f20012i ? 1 : 0));
            if (!this.f20011h) {
                i2 = 0;
            }
            parcel.writeByte((byte) i2);
            parcel.writeString(new JSONObject(this.f20013j).toString());
        } catch (Throwable unused) {
        }
    }
}
