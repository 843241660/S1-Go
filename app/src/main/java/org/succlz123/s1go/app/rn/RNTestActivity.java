package org.succlz123.s1go.app.rn;

import com.facebook.react.ReactActivity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by succlz123 on 2017/2/26.
 */

public class RNTestActivity extends ReactActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, RNTestActivity.class);
        context.startActivity(starter);
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "HelloWorld";
    }
}
