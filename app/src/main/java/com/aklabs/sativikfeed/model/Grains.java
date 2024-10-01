package com.aklabs.sativikfeed.model;

public class Grains {
    private int grianimages;
    private String graintitle;
    private String grainsubtitle;

    public Grains(int grianimages, String graintitle, String grainsubtitle) {
        this.grianimages = grianimages;
        this.graintitle = graintitle;
        this.grainsubtitle = grainsubtitle;
    }

    public int getGrianimages() {
        return grianimages;
    }

    public void setGrianimages(int grianimages) {
        this.grianimages = grianimages;
    }

    public String getGraintitle() {
        return graintitle;
    }

    public void setGraintitle(String graintitle) {
        this.graintitle = graintitle;
    }

    public String getGrainsubtitle() {
        return grainsubtitle;
    }

    public void setGrainsubtitle(String grainsubtitle) {
        this.grainsubtitle = grainsubtitle;
    }
}
