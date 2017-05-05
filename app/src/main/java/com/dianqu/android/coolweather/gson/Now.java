package com.dianqu.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hch on 2017/5/4 0004.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More mMore;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
