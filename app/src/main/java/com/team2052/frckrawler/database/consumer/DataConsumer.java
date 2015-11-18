package com.team2052.frckrawler.database.consumer;

import android.app.Activity;

/**
 * Created by Adam on 11/17/2015.
 */
public abstract class DataConsumer<V> {
    protected Activity mActivity;

    public abstract void updateData(V data);

    public abstract void onError(Throwable e);

    public void setActivity(Activity activity) {
        mActivity = activity;
    }
}