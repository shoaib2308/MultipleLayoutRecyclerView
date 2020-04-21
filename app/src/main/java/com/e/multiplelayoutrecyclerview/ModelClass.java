package com.e.multiplelayoutrecyclerview;

public class ModelClass {


    public static final int USER_INFO_LAYOUT =0;
    public static final int AD_LAYOUT =1;
    public static final int IMAGE_LAYOUT =2;


    private int viewtype;

    ///// User info Layout
    private int image_resource;
    private String title;
    private String body;

    public ModelClass(int viewtype,int image_resource, String title, String body) {
        this.image_resource = image_resource;
        this.title = title;
        this.body = body;
        this.viewtype=viewtype;
    }

    public int getImage_resource() {
        return image_resource;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
    ////// user info layout


    // Ad layout
    private String adText;

    public ModelClass(int viewtype,String adText) {
        this.adText = adText;
        this.viewtype=viewtype;
    }

    public String getAdText() {
        return adText;
    }

    public void setAdText(String adText) {
        this.adText = adText;
    }


    /// Image Layout

    private int resource;

    public int getViewtype() {
        return viewtype;
    }

    public void setViewtype(int viewtype) {
        this.viewtype = viewtype;
    }

    public ModelClass(int viewtype, int resource) {
        this.resource = resource;
        this.viewtype=viewtype;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
