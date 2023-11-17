import java.util.Scanner;

/**
 * @author Saahi Venkatraghavan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO FRACTION CALCULATOR");

        boolean cont = true;

        while (cont) {

            System.out.println("please selection your operation");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multiplication");
            System.out.println("4. division");
            System.out.println("5. just simplify a fraction");

            int operation = scanner.nextInt();
            scanner.nextLine();


            if (operation == 1) {
                System.out.println("enter the first numerator: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the first denominator: ");
                int den1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second numerator: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second denominator: ");
                int den2 = scanner.nextInt();
                scanner.nextLine();

                Fraction addFrac1 = new Fraction(num1, den1);
                Fraction addFrac2 = new Fraction(num2, den2);

                Fraction resultAdd = addFrac1.addition(addFrac2);
                System.out.println(resultAdd);
            } else if (operation == 2) {
                System.out.println("enter the first numerator: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the first denominator: ");
                int den1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second numerator: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second denominator: ");
                int den2 = scanner.nextInt();
                scanner.nextLine();

                Fraction subFrac1 = new Fraction(num1, den1);
                Fraction subFrac2 = new Fraction(num2, den2);

                Fraction resultSub = subFrac2.subtraction(subFrac1);
                System.out.println(resultSub);
            } else if (operation == 3) {
                System.out.println("enter the first numerator: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the first denominator: ");
                int den1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second numerator: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second denominator: ");
                int den2 = scanner.nextInt();
                scanner.nextLine();

                Fraction multFrac1 = new Fraction(num1, den1);
                Fraction multFrac2 = new Fraction(num2, den2);

                Fraction resultMult = multFrac1.multiplication(multFrac2);
                System.out.println(resultMult);
            } else if (operation == 4) {
                System.out.println("enter the first numerator: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the first denominator: ");
                int den1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second numerator: ");
                int num2 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the second denominator: ");
                int den2 = scanner.nextInt();
                scanner.nextLine();

                Fraction divFrac1 = new Fraction(num1, den1);
                Fraction divFrac2 = new Fraction(num2, den2);

                Fraction resultDiv = divFrac2.division(divFrac1);
                System.out.println(resultDiv);
            } else {
                System.out.println("enter the first numerator: ");
                int num1 = scanner.nextInt();
                scanner.nextLine();

                System.out.println("enter the first denominator: ");
                int den1 = scanner.nextInt();
                scanner.nextLine();

                Fraction simplifyFrac1 = new Fraction(num1, den1);

                Fraction resultSimplify = simplifyFrac1.simplify();
                System.out.println(resultSimplify);
            }

            System.out.println("do you want to continue running the fraction calculator? (y/n)");
            String response = scanner.nextLine();

            if (response.equals("y")) {
                cont = true;
            } else {
                cont = false;
            }
        }


//        // add test
//        Fraction f1 = new Fraction(1, 2);
//        Fraction f2 = new Fraction(1, 2);
//
//        Fraction resultAdd = f1.addition(f2);
//        System.out.println(resultAdd);
//
//        // sub test
//        Fraction f3 = new Fraction(10, 25);
//        Fraction f4 = new Fraction(4, 25);
//
//        Fraction resultSub = f4.subtraction(f3);
//        System.out.println(resultSub);
//
//        // multiply test
//        Fraction f5 = new Fraction(10, 2);
//        Fraction f6 = new Fraction(6, 70);
//
//        Fraction resultMult = f6.multiplication(f5);
//        System.out.println(resultMult);
//
//        // division test
//        Fraction f7 = new Fraction(24, 32);
//        Fraction f8 = new Fraction(40, 16);
//
//        Fraction resultDiv = f8.division(f7);
//        System.out.println(resultDiv);
    }
}