package cn.bmob.sdkdemo.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/3/7 0007.
 */

public class OutPerson extends BmobObject {
    private String name;
    private Double longitude;
    private Double latitude;
    private long date;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
