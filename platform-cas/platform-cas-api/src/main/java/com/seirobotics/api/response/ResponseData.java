package com.seirobotics.api.response;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {
    /**
     * 状态
     */
    private String status;
    /**
     * sessionId base64
     */
    private String session_id;
    /**
     *cas提供商名字
     */
    private String cas_provider;


    public ResponseData() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getCas_provider() {
        return cas_provider;
    }

    public void setCas_provider(String cas_provider) {
        this.cas_provider = cas_provider;
    }
}
