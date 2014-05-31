package com.facebook.api;

import com.facebook.api.Uid;
import com.facebook.api.Time;

class StreamVideo  {


    private String display_url;
    private String source_url;
    private Uid owner;
    private String permalink;
    private String preview_img;
    private String source_type;
    private Time created_time;


    public void setDisplayUrl(String display_url) {
        this.display_url = display_url;
    }

    public String getDisplayUrl() {
        return this.display_url;
    }
    public void setSourceUrl(String source_url) {
        this.source_url = source_url;
    }

    public String getSourceUrl() {
        return this.source_url;
    }
    public void setOwner(Uid owner) {
        this.owner = owner;
    }

    public Uid getOwner() {
        return this.owner;
    }
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getPermalink() {
        return this.permalink;
    }
    public void setPreviewImg(String preview_img) {
        this.preview_img = preview_img;
    }

    public String getPreviewImg() {
        return this.preview_img;
    }
    public void setSourceType(String source_type) {
        this.source_type = source_type;
    }

    public String getSourceType() {
        return this.source_type;
    }
    public void setCreatedTime(Time created_time) {
        this.created_time = created_time;
    }

    public Time getCreatedTime() {
        return this.created_time;
    }

    public String toXML() {
        return "<display_url>" + this.display_url + "</display_url>" + "<source_url>" + this.source_url + "</source_url>" + this.owner.toXML() + "<permalink>" + this.permalink + "</permalink>" + "<preview_img>" + this.preview_img + "</preview_img>" + "<source_type>" + this.source_type + "</source_type>" + this.created_time.toXML();
    }
}