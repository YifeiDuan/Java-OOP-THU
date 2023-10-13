package shape;

class Square extends Rectangle{
    private double side = 0;
    Square(){}
    Square(double inputSide){
        side = inputSide;
        width = side;
        height = side;
    }
    Square(double inputSide, String inputColor){
        side = inputSide;
        width = side;
        height = side;
        color = inputColor;
    }

    public double getSide(){
        return side;
    }
    public void setSide(double newSide){
        side = newSide;
        width = side;
        height = side;
    }

    public String toString(){
        return "Square " + "(" + color + ")";
    }
}
