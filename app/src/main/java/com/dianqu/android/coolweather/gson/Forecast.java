package com.dianqu.android.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hch on 2017/5/4 0004.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }


}
