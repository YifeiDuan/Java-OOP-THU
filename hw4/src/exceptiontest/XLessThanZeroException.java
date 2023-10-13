package exceptiontest;

public class XLessThanZeroException extends Exception{
    double yValue = -1;
    XLessThanZeroException(double y){
        yValue = y;
    }
    public String getInfo(){
        return String.valueOf(yValue) + "is too small";
    }
}
