package com.koolearnio.sdk;

import android.app.Activity;
import android.app.Application;
import android.util.Log;

import com.koolearnio.sdk.view.ViewFetcher;


/**
 * Created by leixun on 17/5/2.
 */
public class KooDataSDK {
    private static final String TAG = "KooDataSDK";
    private static KooDataSDK sInstance = null;
    static String sPackageName;
    static String sProjectId;
    private static final Object sInstanceLock = new Object();
    private KDConfig kdConfig;
    private ViewFetcher viewFetcher;
    private Application application;

    public static String getVersion() {
        return "1.0.0";
    }

    private KooDataSDK() {
    }


    public KooDataSDK(KDConfig kdConfig) {

    }

    public KooDataSDK(Application application, String token, double sampling) {

    }

    public void startWithConfiguration(Application application, KDConfig kdConfig){
        this.application = application;
        this.kdConfig = kdConfig;
    }

    public static KooDataSDK getInstance() {
        if(sInstance == null){
            synchronized(KooDataSDK.class) {
                if (null == sInstance) {
                    Log.i("KooDataSDK", "KooDataSDK 还未初始化");
                    return new KooDataSDK();
                }
            }
        }
        return sInstance;
    }

    public ViewFetcher getViewFecther(){
        if(viewFetcher == null){
            viewFetcher = new ViewFetcher(application);
        }
        return viewFetcher;
    }


    public KooDataSDK setPageName(Activity activity, String name) {
        return this;
    }

}
