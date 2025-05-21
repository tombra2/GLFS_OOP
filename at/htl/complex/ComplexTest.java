package at.htl.complex;

public class ComplexTest {
    public static void main(String[] args) {

        Complex calcOne = new Complex(4,2);
        System.out.println(calcOne.toString());

        Complex calcToo = new Complex(4,2);

        Complex add = Complex.add(calcOne,calcToo);
        System.out.println(add.toString());
        Complex multi = Complex.multiply(calcOne,calcToo);
        System.out.println(multi.toString());

        System.out.println(calcOne.multiply(calcToo));

        System.out.println(calcToo.getAngle());





    }
}
