package org.succlz123.s1go.app.utils.stetho;

import android.content.Context;

import okhttp3.OkHttpClient;

/**
 * Created by succlz123 on 2017/1/18.
 */

public class ReleaseStethoHelper implements StethoHelper {

    @Override
    public void init(Context context) {
    }

    @Override
    public OkHttpClient configureInterceptor(OkHttpClient httpClient) {
        return httpClient;
    }

}
