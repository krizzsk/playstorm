package com.p374my.target.nativeads.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.p374my.target.C10059y8;
import com.p374my.target.nativeads.NativeAppwallAd;
import com.p374my.target.nativeads.banners.NativeAppwallBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.nativeads.views.AppwallAdView */
public class AppwallAdView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private static final int BACKGROUND_COLOR = -1118482;
    private AppwallAdViewListener appwallAdViewListener;
    private final ListView listView;
    private final C10059y8 uiUtils;
    private final HashMap<NativeAppwallBanner, Boolean> viewMap = new HashMap<>();

    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallAdViewListener */
    public interface AppwallAdViewListener {
        void onBannerClick(NativeAppwallBanner nativeAppwallBanner);

        void onBannersShow(List<NativeAppwallBanner> list);
    }

    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallAdapter */
    public static class AppwallAdapter extends ArrayAdapter<NativeAppwallBanner> {
        public AppwallAdapter(Context context, List<NativeAppwallBanner> list) {
            super(context, 0, list);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) getItem(i);
            if (view == null) {
                view = new AppwallCardPlaceholder(new AppwallAdTeaserView(getContext()), getContext());
            }
            if (nativeAppwallBanner != null) {
                ((AppwallCardPlaceholder) view).getView().setNativeAppwallBanner(nativeAppwallBanner);
            }
            return view;
        }
    }

    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallCardPlaceholder */
    public static class AppwallCardPlaceholder extends FrameLayout {
        private final LinearLayout rootLayout;
        private final AppwallAdTeaserView view;

        public AppwallCardPlaceholder(AppwallAdTeaserView appwallAdTeaserView, Context context) {
            super(context);
            C10059y8 c = C10059y8.m29843c(context);
            this.view = appwallAdTeaserView;
            int b = c.mo65778b(9);
            int b2 = c.mo65778b(4);
            int b3 = c.mo65778b(2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.rootLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1118482);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(b, b2, b, b2);
            appwallAdTeaserView.setLayoutParams(layoutParams);
            linearLayout.addView(appwallAdTeaserView);
            if (Build.VERSION.SDK_INT >= 21) {
                appwallAdTeaserView.setElevation((float) b3);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1118482, -1118482});
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
                stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
                appwallAdTeaserView.setBackground(stateListDrawable);
            } else {
                View view2 = new View(context);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, b2);
                view2.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-3355444, -1118482}));
                view2.setLayoutParams(layoutParams2);
                linearLayout.addView(view2);
                GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1, -1});
                gradientDrawable3.setStroke(1, -3355444);
                GradientDrawable gradientDrawable4 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1118482, -1118482});
                gradientDrawable4.setStroke(1, -3355444);
                StateListDrawable stateListDrawable2 = new StateListDrawable();
                stateListDrawable2.addState(new int[]{16842919}, gradientDrawable4);
                stateListDrawable2.addState(StateSet.WILD_CARD, gradientDrawable3);
                appwallAdTeaserView.setBackgroundDrawable(stateListDrawable2);
                layoutParams.setMargins(0, b2, 0, 0);
                linearLayout.setPadding(b, 0, b, 0);
            }
            addView(linearLayout, -2, -2);
        }

        public AppwallAdTeaserView getView() {
            return this.view;
        }
    }

    public AppwallAdView(Context context) {
        super(context);
        setVerticalFadingEdgeEnabled(false);
        setBackgroundColor(-1);
        this.uiUtils = C10059y8.m29843c(context);
        this.listView = new ListView(context);
        initLayout();
    }

    private void countVisibleBanners() {
        AppwallAdViewListener appwallAdViewListener2;
        if (this.listView.getAdapter() != null) {
            int lastVisiblePosition = this.listView.getLastVisiblePosition();
            ArrayList arrayList = new ArrayList();
            for (int firstVisiblePosition = this.listView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(firstVisiblePosition);
                if (this.viewMap.get(nativeAppwallBanner) == null) {
                    arrayList.add(nativeAppwallBanner);
                    this.viewMap.put(nativeAppwallBanner, Boolean.TRUE);
                }
            }
            if (arrayList.size() > 0 && (appwallAdViewListener2 = this.appwallAdViewListener) != null) {
                appwallAdViewListener2.onBannersShow(arrayList);
            }
        }
    }

    private void initLayout() {
        int b = this.uiUtils.mo65778b(4);
        int b2 = this.uiUtils.mo65778b(4);
        this.listView.setDividerHeight(0);
        this.listView.setVerticalFadingEdgeEnabled(false);
        this.listView.setOnItemClickListener(this);
        this.listView.setOnScrollListener(this);
        this.listView.setPadding(0, b, 0, b2);
        this.listView.setClipToPadding(false);
        addView(this.listView, -1, -1);
        this.listView.setBackgroundColor(-1118482);
    }

    public void notifyDataSetChanged() {
        ((AppwallAdapter) this.listView.getAdapter()).notifyDataSetChanged();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        countVisibleBanners();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    public void onGlobalLayout() {
        countVisibleBanners();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(i);
        AppwallAdViewListener appwallAdViewListener2 = this.appwallAdViewListener;
        if (appwallAdViewListener2 != null) {
            appwallAdViewListener2.onBannerClick(nativeAppwallBanner);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        countVisibleBanners();
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public void setAppwallAdViewListener(AppwallAdViewListener appwallAdViewListener2) {
        this.appwallAdViewListener = appwallAdViewListener2;
    }

    public void setupView(NativeAppwallAd nativeAppwallAd) {
        this.listView.setAdapter(new AppwallAdapter(getContext(), nativeAppwallAd.getBanners()));
    }
}
