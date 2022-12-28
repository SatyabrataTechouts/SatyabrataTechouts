package com.techoutsBox;

public class Box {
    private double length;
    private  double breath;
    private double height;

    public Box(double length,double breath,double height) {
        this.length = length;
        this.breath=breath;
        this.height=height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreath() {
        return breath;
    }

    public void setBreath(double breath) {
        this.breath = breath;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
