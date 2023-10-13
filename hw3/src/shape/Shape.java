package shape;

abstract class Shape {
    public String color = "#";

    Shape(){}
    Shape(String inputColor){
        color = inputColor;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public boolean isFilled(){
        if(color == "#") return false;
        else return true;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape" + "(" + color + ")";
    }
}