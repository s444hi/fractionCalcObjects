/**
 * @author Saahi Venkatraghavan
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction addition(Fraction f1) {
//        System.out.println("called addition");
        int addNum = (f1.getNumerator() * denominator) + (numerator * f1.getDenominator());
        int addDen = (f1.getDenominator() * denominator);
        Fraction result = new Fraction(addNum, addDen);
        return result.simplify();
    }

    public Fraction subtraction(Fraction f1) {
//        System.out.println("called sub");
        int subNum = (f1.getNumerator() * denominator) - (numerator * f1.getDenominator());
        int subDen = (f1.getDenominator() * denominator);
        Fraction result = new Fraction(subNum, subDen);
        return result.simplify();
    }

    public Fraction multiplication(Fraction f1) {
//        System.out.println("called multiply");
        int multNum = (f1.numerator * numerator);
        int multDen = (f1.denominator * denominator);
        Fraction result = new Fraction(multNum, multDen);
        return result.simplify();
    }

    public Fraction division(Fraction f1) {
//        System.out.println("called division");
        int divNum = (f1.numerator * denominator);
        int divDen = (f1.denominator * numerator);
        Fraction result = new Fraction(divNum, divDen);
        return result.simplify();
    }

    public String toString() {
//        System.out.println("toString called");
        return getNumerator() + "/" + getDenominator();
    }

    public Fraction simplify() {
        int simpleGreaterNum;
        int simpleGCF = 0;
        int simpleNum;
        int simpleDen;
        if (numerator > denominator) {
            simpleGreaterNum = numerator;
        } else {
            simpleGreaterNum = denominator;
        }

        for (int i = 1; i <= simpleGreaterNum; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                simpleGCF = i;
            }
        }

        simpleNum = numerator / simpleGCF;
        simpleDen = denominator / simpleGCF;
        return new Fraction(simpleNum, simpleDen);
    }
}
