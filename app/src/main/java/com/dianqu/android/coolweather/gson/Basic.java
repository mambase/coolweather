package com.dianqu.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hch on 2017/5/4 0004.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
