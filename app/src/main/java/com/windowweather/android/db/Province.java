package com.windowweather.android.db;

import org.litepal.crud.LitePalSupport;

public class Province extends LitePalSupport {     //省
    private int id;     //省ID
    private String provinceName;    //省名
    private int provinceCode;       //省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
