package exceptiontest;

public class ExceptionTest {
    public int getFirstValidInt(){
        Test t = new Test();
        while(true){
            try{
                int x = t.readInt();
                return x;
            }catch(NumberFormatException e){
                continue;
            }
        }
    }

    public double getX(double y) throws XLessThanZeroException, XGreaterThanOneException
    {
        if(Math.log(y) < 0){
            throw new XLessThanZeroException(y);
        }
        if(Math.log(y) > 1){
            throw new XGreaterThanOneException(y);
        }

        return Math.log(y);
    }

    public double solve(double y){
        double x = Math.log(y);
        Test t = new Test();
        try{
            t.solve2(y);
        }catch(XLessThanZeroException e){
            x = -1;
        }catch(XGreaterThanOneException e){
            x = -2;
        }

        return x;
    }
}
