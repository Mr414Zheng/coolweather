package com.zhenghuaizhi.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ${} on ${2018/1/23}.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;
    }
}
