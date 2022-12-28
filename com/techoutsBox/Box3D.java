package com.techoutsBox;

public class Box3D extends Box{


    public Box3D(double length, double breath, double height) {
        super(length, breath, height);
    }

    public double area(){
        return  2*getLength()*getBreath()+2*getLength()*getHeight()+2*getHeight();
    }
    public double volume(){
        return getHeight()*getBreath()*getLength();
    }
}
