package com.susin.iweather.db;

import org.litepal.crud.DataSupport;

/**
 * 说明：
 *
 * @作者 Susin
 * @创建时间 2016/11/23 21:46
 */
public class Province extends DataSupport {

    private int id;

    private int provinceCode;

    private String provinceName;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}