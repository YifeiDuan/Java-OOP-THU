package complex;

import java.text.DecimalFormat;

public class Complex {
    public double realPart;
    public double imaginaryPart;

    Complex(double a, double b){
        realPart = a;
        imaginaryPart = b;
    }

    public String print(){
        return String.format("%.3f",realPart) + "+" + String.format("%.3f",imaginaryPart) + "i";
    }

    public void add(Complex B){
        realPart = realPart + B.realPart;
        imaginaryPart = imaginaryPart + B.imaginaryPart;
    }

    public void sub(Complex B){
        realPart = realPart - B.realPart;
        imaginaryPart = imaginaryPart - B.imaginaryPart;
    }

    public void multi(Complex B){
        double A_real = realPart;
        double A_imaginary = imaginaryPart;
        realPart = A_real * B.realPart - A_imaginary * B.imaginaryPart;
        imaginaryPart = A_real * B.imaginaryPart + A_imaginary * B.realPart;
    }

    public void div(Complex B){
        double A_real = realPart;
        double A_imaginary = imaginaryPart;
        realPart = (A_real * B.realPart + A_imaginary * B.imaginaryPart)/(B.realPart * B.realPart + B.imaginaryPart * B.imaginaryPart);
        imaginaryPart = (A_imaginary * B.realPart - A_real * B.imaginaryPart)/(B.realPart * B.realPart + B.imaginaryPart * B.imaginaryPart);
    }
}
