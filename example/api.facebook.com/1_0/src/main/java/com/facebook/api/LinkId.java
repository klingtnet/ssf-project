package com.facebook.api;


class LinkId  {

    private Long value;


    public void setValue(Long value) {
        this.value = value;
    }

    public Long getValue() {
        return this.value;
    }


    public String toXML() {
        return value.toString();
    }
}