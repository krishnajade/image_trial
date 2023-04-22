package com.example.imagetrial;

import com.google.gson.annotations.SerializedName;

public class UploadResponse {
    @SerializedName("error")
    private boolean error;
    @SerializedName("url")
    private String url;
    @SerializedName("name")
    private String name;
    public boolean isError() {
        return error;
    }
    public String getUrl() {
        return url;
    }
    public String getName() {
        return name;
    }
}
