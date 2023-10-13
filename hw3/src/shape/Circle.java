package shape;

class Circle extends Shape{
    private double radius = 0;

    Circle(){}
    Circle(double inputRadius){
        radius = inputRadius;
    }
    Circle(double inputRadius, String inputColor) {
        radius = inputRadius;
        color = inputColor;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle " + "(" + color + ")";
    }
}
