package com.susin.iweather.db;

import org.litepal.crud.DataSupport;

/**
 * 说明：
 *
 * @作者 Susin
 * @创建时间 2016/11/23 21:46
 */
public class City extends DataSupport {

    private int id;

    private int cityCode;

    private String cityName;

    private int provinveId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getProvinveId() {
        return provinveId;
    }

    public void setProvinveId(int provinveId) {
        this.provinveId = provinveId;
    }
}