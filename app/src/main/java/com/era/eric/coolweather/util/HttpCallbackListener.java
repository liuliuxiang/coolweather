package com.era.eric.coolweather.util;

/**
 * Created by eric on 16/4/6.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
