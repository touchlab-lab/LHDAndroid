package co.touchlab.androidbasics.network;
import android.content.Context;

import retrofit.RestAdapter;
import retrofit.android.AndroidLog;

/**
 * Created by kgalligan on 12/6/14.
 */
public class DataHelper
{
    public static RestAdapter makeAdapter(Context context)
    {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                                                               .setLogLevel(
                                                                       RestAdapter.LogLevel.FULL)
                                                               .setLog(new AndroidLog("Test"))
                                                               .setEndpoint();

    }
}
