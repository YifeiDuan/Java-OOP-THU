package shape;

class Rectangle extends Shape{
    public double width = 0;
    public double height = 0;

    Rectangle(){}
    Rectangle(double inputWidth, double inputHeight){
        width = inputWidth;
        height = inputHeight;
    }
    Rectangle(double inputWidth, double inputHeight, String inputColor) {
        width = inputWidth;
        height = inputHeight;
        color = inputColor;
    }

    public double getWidth(){
        return width;
    }
    public void setWidth(double newWidth){
        width = newWidth;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double newHeight){
        height = newHeight;
    }

    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

    public String toString(){
        return "Rectangle " + "(" + color + ")";
    }
}
