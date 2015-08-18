package com.liveperson.aalter.androidtesting;

        import android.annotation.TargetApi;
        import android.app.Application;
        import android.os.Build;

        import com.liveperson.mobile.android.service.ApplicationLifecycleHandler;

/**
 * Created by dudu on 9/12/13.
 */
public class MyApplication  extends Application {
    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    @Override
    public void onCreate() {
        super.onCreate();
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            // Register to the ActivityLifecycleCallbacks in order to support notifications
            registerActivityLifecycleCallbacks(new ApplicationLifecycleHandler());
        }

    }
}
