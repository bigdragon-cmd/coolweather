package com.coolweather.android.gson;

/**
 * Created by Administrator on 2019/8/30 0030.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;

        public String pm25;
    }
}
