package com.smaato.sdk.video.vast.model;

import com.smaato.sdk.video.vast.utils.VastModels;
import java.util.List;

public class ViewableImpression {

    /* renamed from: ID */
    public static final String f27182ID = "id";
    public static final String NAME = "ViewableImpression";
    public static final String NOT_VIEWABLE = "NotViewable";
    public static final String VIEWABLE = "Viewable";
    public static final String VIEW_UNDETERMINED = "ViewUndetermined";

    /* renamed from: id */
    public final String f27183id;
    public final List<String> notViewable;
    public final List<String> viewUndetermined;
    public final List<String> viewable;

    ViewableImpression(List<String> list, List<String> list2, List<String> list3, String str) {
        this.f27183id = str;
        this.viewable = list;
        this.notViewable = list2;
        this.viewUndetermined = list3;
    }

    public static class Builder {

        /* renamed from: id */
        private String f27184id;
        private List<String> notViewable;
        private List<String> viewUndetermined;
        private List<String> viewable;

        public Builder setId(String str) {
            this.f27184id = str;
            return this;
        }

        public Builder setViewable(List<String> list) {
            this.viewable = list;
            return this;
        }

        public Builder setNotViewable(List<String> list) {
            this.notViewable = list;
            return this;
        }

        public Builder setViewUndetermined(List<String> list) {
            this.viewUndetermined = list;
            return this;
        }

        public ViewableImpression build() {
            this.viewable = VastModels.toImmutableList(this.viewable);
            this.notViewable = VastModels.toImmutableList(this.notViewable);
            List<String> immutableList = VastModels.toImmutableList(this.viewUndetermined);
            this.viewUndetermined = immutableList;
            return new ViewableImpression(this.viewable, this.notViewable, immutableList, this.f27184id);
        }
    }
}
