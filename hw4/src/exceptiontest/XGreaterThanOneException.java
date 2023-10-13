package exceptiontest;

public class XGreaterThanOneException extends Exception{
    double yValue = -1;
    XGreaterThanOneException(double y){
        yValue = y;
    }
    public String getInfo(){
        return "Too large";
    }
}
