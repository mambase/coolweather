package com.dianqu.android.coolweather.gson;

/**
 * Created by hch on 2017/5/4 0004.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
