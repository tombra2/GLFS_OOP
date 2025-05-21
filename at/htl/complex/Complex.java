package at.htl.complex;

import javax.crypto.Cipher;

public class Complex {
    private double real;
    private double ima;

    public Complex(double real, double ima) {
        this.real = real;
        this.ima = ima;
    }
    public Complex multiply(Complex a){
        return Complex.multiply(this,a);
    }
    public void magnitude(int a){
        this.real*=a;
        this.ima*=a;
    }
    public double getAngle(){
        return Math.toDegrees(Math.tan(this.ima/this.real));
    }

    public static Complex multiply(Complex a, Complex b) {
        double real = a.real * b.real - a.ima * b.ima;
        double ima = a.real * b.ima + a.ima * b.real;
        return new Complex(real, ima);
    }

    public static Complex add(Complex a, Complex b) {
        double sumReal = a.real + b.real;
        double sumImg = a.ima + b.ima;
        return new Complex(sumReal, sumImg);

    }

    public void add(Complex c) {
        this.real += c.real;
        this.real += c.ima;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIma() {
        return ima;
    }

    public void setIma(double ima) {
        this.ima = ima;
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2f j", real, ima);
    }
}
