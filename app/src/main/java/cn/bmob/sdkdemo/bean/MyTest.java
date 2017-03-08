package cn.bmob.sdkdemo.bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

public class MyTest extends BmobObject {
    private String name;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
