package shape;

public class Shapes {
    Shape[] shapelist = null;
    Shapes(Shape[] inputList){
        shapelist = inputList;
    }

    public double getArea(){
        double Area = 0;
        for(int i = 0; i < shapelist.length; i ++){
            Area = Area + shapelist[i].getArea();
        }
        return Area;
    }
    public double getFilledArea(){
        double Area = 0;
        for(int i = 0; i < shapelist.length; i ++){
            if(shapelist[i].isFilled() == true){
                Area = Area + shapelist[i].getArea();
            }
        }
        return Area;
    }

    public String toString(){
        String result = "[" + shapelist[0].toString();
        for(int i = 1; i < shapelist.length; i ++){
            result = result + ", " + shapelist[i].toString();
        }
        return result + "]";
    }
}
