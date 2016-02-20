package com.example.android.clothespredicting.util;

/**
 * Created by Loches on 2015/12/18.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
