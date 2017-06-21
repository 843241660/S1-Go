package org.succlz123.s1go;

import com.facebook.stetho.Stetho;
import com.facebook.stetho.okhttp3.StethoInterceptor;

import org.succlz123.s1go.app.utils.stetho.StethoHelper;

import android.content.Context;

import okhttp3.OkHttpClient;

/**
 * Created by succlz123 on 2017/1/18.
 */

public class DebugStethoHelper implements StethoHelper {

    @Override
    public void init(Context context) {
        Stetho.initializeWithDefaults(context);
    }

    @Override
    public OkHttpClient configureInterceptor(OkHttpClient httpClient) {
        return httpClient.newBuilder().addNetworkInterceptor(new StethoInterceptor()).build();
    }

}
