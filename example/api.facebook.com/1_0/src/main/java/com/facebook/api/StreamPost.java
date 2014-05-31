package com.facebook.api;

import com.facebook.api.StreamComments;
import com.facebook.api.StreamLikes;
import com.facebook.api.Privacy;
import com.facebook.api.Time;
import com.facebook.api.StreamAttachment;
import com.facebook.api.Uid;
import com.facebook.api.PostId;
import com.facebook.api.StreamAppData;

class StreamPost  {


    private PostId post_id;
    private Uid viewer_id;
    private String view;
    private Uid source_id;
    private String type;
    private Long app_id;
    private String attribution;
    private Uid actor_id;
    private Uid target_id;
    private String message;
    private StreamAttachment attachment;
    private StreamAppData app_data;
    private StreamComments comments;
    private StreamLikes likes;
    private Privacy privacy;
    private Time updated_time;
    private Time created_time;
    private Boolean is_hidden;


    public void setPostId(PostId post_id) {
        this.post_id = post_id;
    }

    public PostId getPostId() {
        return this.post_id;
    }
    public void setViewerId(Uid viewer_id) {
        this.viewer_id = viewer_id;
    }

    public Uid getViewerId() {
        return this.viewer_id;
    }
    public void setView(String view) {
        this.view = view;
    }

    public String getView() {
        return this.view;
    }
    public void setSourceId(Uid source_id) {
        this.source_id = source_id;
    }

    public Uid getSourceId() {
        return this.source_id;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
    public void setAppId(Long app_id) {
        this.app_id = app_id;
    }

    public Long getAppId() {
        return this.app_id;
    }
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }

    public String getAttribution() {
        return this.attribution;
    }
    public void setActorId(Uid actor_id) {
        this.actor_id = actor_id;
    }

    public Uid getActorId() {
        return this.actor_id;
    }
    public void setTargetId(Uid target_id) {
        this.target_id = target_id;
    }

    public Uid getTargetId() {
        return this.target_id;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
    public void setAttachment(StreamAttachment attachment) {
        this.attachment = attachment;
    }

    public StreamAttachment getAttachment() {
        return this.attachment;
    }
    public void setAppData(StreamAppData app_data) {
        this.app_data = app_data;
    }

    public StreamAppData getAppData() {
        return this.app_data;
    }
    public void setComments(StreamComments comments) {
        this.comments = comments;
    }

    public StreamComments getComments() {
        return this.comments;
    }
    public void setLikes(StreamLikes likes) {
        this.likes = likes;
    }

    public StreamLikes getLikes() {
        return this.likes;
    }
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    public Privacy getPrivacy() {
        return this.privacy;
    }
    public void setUpdatedTime(Time updated_time) {
        this.updated_time = updated_time;
    }

    public Time getUpdatedTime() {
        return this.updated_time;
    }
    public void setCreatedTime(Time created_time) {
        this.created_time = created_time;
    }

    public Time getCreatedTime() {
        return this.created_time;
    }
    public void setIsHidden(Boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Boolean getIsHidden() {
        return this.is_hidden;
    }

    public String toXML() {
        return this.post_id.toXML() + this.viewer_id.toXML() + "<view>" + this.view + "</view>" + this.source_id.toXML() + "<type>" + this.type + "</type>" + "<app_id>" + this.app_id + "</app_id>" + "<attribution>" + this.attribution + "</attribution>" + this.actor_id.toXML() + this.target_id.toXML() + "<message>" + this.message + "</message>" + this.attachment.toXML() + this.app_data.toXML() + this.comments.toXML() + this.likes.toXML() + this.privacy.toXML() + this.updated_time.toXML() + this.created_time.toXML() + "<is_hidden>" + this.is_hidden + "</is_hidden>";
    }
}