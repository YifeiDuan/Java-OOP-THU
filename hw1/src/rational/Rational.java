package rational;

public class Rational {
    int numerator;
    int denominator;

    Rational(int a, int b){
        numerator = a/reduction(a, b);
        denominator = b/reduction(a, b);
    }

    public void add(Rational B){
        int tempN = numerator * B.denominator + denominator * B.numerator;
        int tempD = denominator * B.denominator;

        numerator = tempN/reduction(tempN, tempD);
        denominator = tempD/reduction(tempN, tempD);
    }

    public void sub(Rational B){
        int tempN = numerator * B.denominator - denominator * B.numerator;
        int tempD = denominator * B.denominator;

        numerator = tempN/reduction(tempN, tempD);
        denominator = tempD/reduction(tempN, tempD);
    }

    public void mul(Rational B){
        int tempN = numerator * B.numerator;
        int tempD = denominator * B.denominator;

        numerator = tempN/reduction(tempN, tempD);
        denominator = tempD/reduction(tempN, tempD);
    }

    public void div(Rational B){
        int tempN = numerator * B.denominator;
        int tempD = denominator * B.numerator;

        numerator = tempN/reduction(tempN, tempD);
        denominator = tempD/reduction(tempN, tempD);
    }

    public void printRational(){
        if(denominator == 1){
            System.out.println(numerator);
        }
        else{
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void printReal(){
        float result = (float)numerator / (float)denominator;
        System.out.println(result);
    }

    public int reduction(int m, int n){
        int commonDiv = 1;
        for(int x = m; x > 1; x --){
            if((m % x == 0)&&(n % x == 0)){
                commonDiv = x;
                break;
            }
        }
        return commonDiv;
    }


}



