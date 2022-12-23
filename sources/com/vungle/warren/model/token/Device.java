package com.vungle.warren.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {
    @SerializedName("battery_saver_enabled")
    @Expose
    private Boolean batterySaverEnabled;
    @SerializedName("extension")
    @Expose
    private Extension extension;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("time_zone")
    @Expose
    private String timezone;
    @SerializedName("volume_level")
    @Expose
    private Double volumeLevel;

    public Device(Boolean bool, String str, String str2, Double d, Extension extension2) {
        this.batterySaverEnabled = bool;
        this.language = str;
        this.timezone = str2;
        this.volumeLevel = d;
        this.extension = extension2;
    }
}
