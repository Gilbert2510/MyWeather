package com.windowweather.android.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {   //县（区）
    private int id;     //县（区）ID
    private String countyName;      //县（区）名
    private String weatherId;          //天气ID
    private int cityId;             //所属市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
