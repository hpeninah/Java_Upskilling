package com.company.day3.Polygon;

public class Rectangle extends Polygon {
    private int dim1;
    private int dim2;

    public Rectangle(int dim1, int dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public int getDim1(){
        return dim1;
    }

    public int getDim2(){
        return dim2;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public void setDim2(int dim2){
        this.dim2 = dim2;
    }

    @Override
    public double getArea(){
        double area;
        area = dim1*dim2;
        return area;
    }
}
