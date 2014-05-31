package com.facebook.api;

import com.facebook.api.Hsid;
import com.facebook.api.Year;

class HsInfo  {


    private String hs1_name;
    private String hs2_name;
    private Year grad_year;
    private Hsid hs1_id;
    private Hsid hs2_id;


    public void setHs1Name(String hs1_name) {
        this.hs1_name = hs1_name;
    }

    public String getHs1Name() {
        return this.hs1_name;
    }
    public void setHs2Name(String hs2_name) {
        this.hs2_name = hs2_name;
    }

    public String getHs2Name() {
        return this.hs2_name;
    }
    public void setGradYear(Year grad_year) {
        this.grad_year = grad_year;
    }

    public Year getGradYear() {
        return this.grad_year;
    }
    public void setHs1Id(Hsid hs1_id) {
        this.hs1_id = hs1_id;
    }

    public Hsid getHs1Id() {
        return this.hs1_id;
    }
    public void setHs2Id(Hsid hs2_id) {
        this.hs2_id = hs2_id;
    }

    public Hsid getHs2Id() {
        return this.hs2_id;
    }

    public String toXML() {
        return "<hs1_name>" + this.hs1_name + "</hs1_name>" + "<hs2_name>" + this.hs2_name + "</hs2_name>" + this.grad_year.toXML() + this.hs1_id.toXML() + this.hs2_id.toXML();
    }
}