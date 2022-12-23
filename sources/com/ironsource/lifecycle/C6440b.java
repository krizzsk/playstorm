package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.b */
public final class C6440b extends Fragment {

    /* renamed from: a */
    C6441a f16353a;

    /* renamed from: com.ironsource.lifecycle.b$a */
    interface C6441a {
        /* renamed from: a */
        void mo35955a(Activity activity);

        /* renamed from: b */
        void mo35956b(Activity activity);
    }

    /* renamed from: a */
    static C6440b m19360a(Activity activity) {
        return (C6440b) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    /* renamed from: b */
    static void m19361b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager != null && fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") == null) {
            fragmentManager.beginTransaction().add(new C6440b(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f16353a != null) {
            getActivity();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f16353a = null;
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        C6441a aVar = this.f16353a;
        if (aVar != null) {
            aVar.mo35956b(getActivity());
        }
    }

    public final void onStart() {
        super.onStart();
        C6441a aVar = this.f16353a;
        if (aVar != null) {
            aVar.mo35955a(getActivity());
        }
    }

    public final void onStop() {
        super.onStop();
    }
}
