package com.ra.whiskyproyect;

import com.google.gson.annotations.SerializedName;

public class PostDestiller {

    @SerializedName("name")
    private String nameDistilleries;

    public String getNameDistilleries() {
        return nameDistilleries;
    }

    public void setNameDistilleries(String nameDistilleries) {
        this.nameDistilleries = nameDistilleries;
    }
}
