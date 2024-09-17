package com.aklabs.sativikfeed.model;

public class Shapes {
    private int shapesimg;
    private String shapenames;

    public Shapes(int shapeImages, String shapenames) {
        this.shapesimg = shapeImages;
        this.shapenames = shapenames;
    }

    public int getHsapeImages() {
        return shapesimg;
    }

    public void setHsapeImages(int shapeImages) {
        this.shapesimg = shapeImages;
    }

    public String getShapenames() {
        return shapenames;
    }

    public void setShapenames(String shapenames) {
        this.shapenames = shapenames;
    }
}
