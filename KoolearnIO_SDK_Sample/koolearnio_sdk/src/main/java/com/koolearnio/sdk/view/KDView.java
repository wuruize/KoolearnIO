package com.koolearnio.sdk.view;

import android.view.View;

/**
 * Created by leixun on 17/5/2.
 * 需验查看对性能的影响
 */

public class KDView {

    /**
     * 具体的View
     */
    private View mView;

    /** 优先使用 viewPath 即viewId */
    private String viewPath;

    /** viewId */
    private String viewId;

    public KDView(String viewPath, int viewId, View view){
        this.mView = view;
        this.viewId = viewId+"";
        this.viewPath = viewPath;
    }

    public View getmView() {
        return mView;
    }

    public void setmView(View mView) {
        this.mView = mView;
    }

    public String getViewPath() {
        return viewPath;
    }

    public void setViewPath(String viewPath) {
        this.viewPath = viewPath;
    }

    public String getViewId() {
        return viewId;
    }

    public void setViewId(String viewId) {
        this.viewId = viewId;
    }
}
