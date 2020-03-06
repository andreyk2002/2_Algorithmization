package by.epam_tc.step1.t2.type3;

public class Fraction {

    public Fraction(int nom, int denom) {
        int gcd = gcd(nom, denom);
        this.numerator = nom / gcd;
        this.denominator = denom / gcd;
    }

    public int getDenominator() {

        return denominator;
    }

    public int getNumerator() {

        return numerator;
    }

    public double toDouble() {
        double n = numerator;
        double d = denominator;
        return n / d;
    }

    @Override
    public String toString() {

        return numerator + "/" + denominator;
    }


    private int numerator;
    private int denominator;

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }
}
