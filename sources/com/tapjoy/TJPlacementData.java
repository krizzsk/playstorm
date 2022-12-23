package com.tapjoy;

import android.text.TextUtils;
import java.io.Serializable;

public class TJPlacementData implements Serializable {

    /* renamed from: a */
    private String f27415a;

    /* renamed from: b */
    private String f27416b;

    /* renamed from: c */
    private String f27417c;

    /* renamed from: d */
    private String f27418d;

    /* renamed from: e */
    private String f27419e;

    /* renamed from: f */
    private String f27420f;

    /* renamed from: g */
    private int f27421g;

    /* renamed from: h */
    private String f27422h;

    /* renamed from: i */
    private String f27423i;

    /* renamed from: j */
    private int f27424j;

    /* renamed from: k */
    private boolean f27425k;

    /* renamed from: l */
    private String f27426l;

    /* renamed from: m */
    private boolean f27427m;

    /* renamed from: n */
    private String f27428n;

    /* renamed from: o */
    private String f27429o;

    /* renamed from: p */
    private boolean f27430p = false;

    /* renamed from: q */
    private boolean f27431q;

    public TJPlacementData(String str, String str2) {
        setKey(str);
        updateUrl(str2);
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public TJPlacementData(String str, String str2, String str3) {
        setBaseURL(str);
        setHttpResponse(str2);
        this.f27428n = str3;
        setPlacementType(TapjoyConstants.TJC_APP_PLACEMENT);
    }

    public void resetPlacementRequestData() {
        setHttpResponse((String) null);
        setHttpStatusCode(0);
        setRedirectURL((String) null);
        setHasProgressSpinner(false);
        setPrerenderingRequested(false);
        setPreloadDisabled(false);
        setContentViewId((String) null);
        setHandleDismissOnPause(false);
    }

    public String getCallbackID() {
        return this.f27428n;
    }

    public void setKey(String str) {
        this.f27415a = str;
    }

    public void setBaseURL(String str) {
        this.f27417c = str;
    }

    public void setMediationURL(String str) {
        this.f27418d = str;
    }

    public void setAuctionMediationURL(String str) {
        this.f27419e = str;
    }

    public void setHttpResponse(String str) {
        this.f27420f = str;
    }

    public void setHttpStatusCode(int i) {
        this.f27421g = i;
    }

    public void setPlacementName(String str) {
        this.f27422h = str;
    }

    public void setPlacementType(String str) {
        this.f27423i = str;
    }

    public void setViewType(int i) {
        this.f27424j = i;
    }

    public void setRedirectURL(String str) {
        this.f27426l = str;
    }

    public void setHasProgressSpinner(boolean z) {
        this.f27425k = z;
    }

    public void setContentViewId(String str) {
        this.f27429o = str;
    }

    public String getUrl() {
        return this.f27416b;
    }

    public String getKey() {
        return this.f27415a;
    }

    public String getBaseURL() {
        return this.f27417c;
    }

    public String getMediationURL() {
        return this.f27418d;
    }

    public String getAuctionMediationURL() {
        return this.f27419e;
    }

    public String getHttpResponse() {
        return this.f27420f;
    }

    public int getHttpStatusCode() {
        return this.f27421g;
    }

    public String getPlacementName() {
        return this.f27422h;
    }

    public String getPlacementType() {
        return this.f27423i;
    }

    public int getViewType() {
        return this.f27424j;
    }

    public String getRedirectURL() {
        return this.f27426l;
    }

    public String getContentViewId() {
        return this.f27429o;
    }

    public boolean hasProgressSpinner() {
        return this.f27425k;
    }

    public void setPreloadDisabled(boolean z) {
        this.f27430p = z;
    }

    public boolean isPreloadDisabled() {
        return this.f27430p;
    }

    public boolean isPrerenderingRequested() {
        return this.f27427m;
    }

    public void setPrerenderingRequested(boolean z) {
        this.f27427m = z;
    }

    public void setHandleDismissOnPause(boolean z) {
        this.f27431q = z;
    }

    public boolean shouldHandleDismissOnPause() {
        return this.f27431q;
    }

    public void updateUrl(String str) {
        this.f27416b = str;
        if (!TextUtils.isEmpty(str)) {
            setBaseURL(str.substring(0, str.indexOf(47, str.indexOf("//") + 3)));
        }
    }
}
