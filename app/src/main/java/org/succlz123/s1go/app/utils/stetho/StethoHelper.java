package org.succlz123.s1go.app.utils.stetho;

import android.content.Context;

import okhttp3.OkHttpClient;

/**
 * Created by succlz123 on 2017/1/18.
 */

public interface StethoHelper {

    void init(Context context);

    OkHttpClient configureInterceptor(OkHttpClient httpClient);

}
