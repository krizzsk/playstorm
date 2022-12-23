package com.ironsource.sdk.service.Connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.ironsource.p200d.C6392a;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.service.Connectivity.e */
public class C8383e implements C8381c {

    /* renamed from: a */
    private String f20101a = C8383e.class.getSimpleName();

    /* renamed from: b */
    private int f20102b = 23;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8382d f20103c;

    /* renamed from: d */
    private ConnectivityManager.NetworkCallback f20104d;

    public C8383e(C8382d dVar) {
        this.f20103c = dVar;
    }

    /* renamed from: a */
    public final void mo56887a() {
        this.f20104d = null;
    }

    /* renamed from: a */
    public final void mo56888a(final Context context) {
        if (Build.VERSION.SDK_INT >= this.f20102b) {
            mo56889b(context);
            if (C6392a.m19175a(context).equals("none")) {
                this.f20103c.mo56634a();
            }
            if (this.f20104d == null) {
                this.f20104d = new ConnectivityManager.NetworkCallback() {
                    public final void onAvailable(Network network) {
                        if (network != null) {
                            C8382d a = C8383e.this.f20103c;
                            String a2 = C6392a.m19176a(network, context);
                            C6392a.m19177a(context, network);
                            a.mo56635a(a2);
                            return;
                        }
                        C8382d a3 = C8383e.this.f20103c;
                        String a4 = C6392a.m19175a(context);
                        Context context = context;
                        C6392a.m19177a(context, C6392a.m19178b(context));
                        a3.mo56635a(a4);
                    }

                    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                        if (network != null) {
                            C8383e.this.f20103c.mo56636a(C6392a.m19176a(network, context), C6392a.m19177a(context, network));
                        }
                    }

                    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
                        if (network != null) {
                            C8383e.this.f20103c.mo56636a(C6392a.m19176a(network, context), C6392a.m19177a(context, network));
                        }
                    }

                    public final void onLost(Network network) {
                        if (C6392a.m19175a(context).equals("none")) {
                            C8383e.this.f20103c.mo56634a();
                        }
                    }
                };
            }
            NetworkRequest build = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(build, this.f20104d);
                }
            } catch (Exception unused) {
                Log.e(this.f20101a, "NetworkCallback was not able to register");
            }
        }
    }

    /* renamed from: b */
    public final void mo56889b(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= this.f20102b && this.f20104d != null && context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(this.f20104d);
            } catch (Exception unused) {
                Log.e(this.f20101a, "NetworkCallback for was not registered or already unregistered");
            }
        }
    }

    /* renamed from: c */
    public final JSONObject mo56890c(Context context) {
        return C6392a.m19177a(context, C6392a.m19178b(context));
    }
}
