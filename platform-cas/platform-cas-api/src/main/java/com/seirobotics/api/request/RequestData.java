package com.seirobotics.api.request;

import java.io.Serializable;

public class RequestData<T> implements Serializable {
    private T request;

    private String signature;

    private String signer;

    public RequestData() {
    }

    public T getRequest() {
        return request;
    }

    public void setRequest(T request) {
        this.request = request;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }
}
