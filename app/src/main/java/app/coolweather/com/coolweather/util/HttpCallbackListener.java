package app.coolweather.com.coolweather.util;

/**
 * Created by Ghost on 2016/5/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
