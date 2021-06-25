package com.ra.whiskyproyect;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("name")
    private String nameWhisky;

    @SerializedName("base_currency")
    private String BaseCurrency;


    public String getNameWhisky() {
        return nameWhisky;
    }

    public void setNameWhisky(String nameWhisky) {
        this.nameWhisky = nameWhisky;
    }

    public String getBaseCurrency() {
        return BaseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        BaseCurrency = baseCurrency;
    }
}
