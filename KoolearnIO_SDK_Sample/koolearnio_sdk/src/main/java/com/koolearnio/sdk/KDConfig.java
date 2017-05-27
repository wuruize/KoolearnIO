package com.koolearnio.sdk;

/**
 * Created by leixun on 17/5/2.
 */

public class KDConfig {
    private String appId = "";
    private String securtKey = "";

    public KDConfig(String appid, String securtKey){
        this.appId = appid;
        this.securtKey = securtKey;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getSecurtKey() {
        return securtKey;
    }

    public void setSecurtKey(String securtKey) {
        this.securtKey = securtKey;
    }
}
