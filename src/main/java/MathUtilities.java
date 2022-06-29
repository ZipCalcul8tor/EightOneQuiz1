import java.util.Scanner;

public class MathUtilities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
        System.out.println("Enter the third number ");
        double num3 = input.nextDouble();
        System.out.println("Enter the fourth number ");
        double num4 = input.nextDouble();
        double sum1 = num3 + num4;
        System.out.println("Double(sum) is" + sum1);
        double half = num1 / 2;
        System.out.println("Half of a no." + half);
        if (num1 % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
        double square = Math.pow(num1,2);
        System.out.println("The square is " + square);
    }
}








//        /**
//         * Add two number together
//         * @param baseValue first number
//         * @param valueToAdd number
//         * @return the sum of the two numbers
//         */
//
//        }
//
//        }
//
//        /**
//         * Add two number together
//         * @param baseValue first number
//         * @param valueToAdd second number
//         * @return the sum of the two numbers
//         */
//        public Double add (Double , Double valueToAdd){
//            return null;
//        }
//
//        /**
//         * Get half the value of the number
//         * @param number the number given
//         * @return the half of the number in double
//         */
//        public Double half (Integer number){
//            return null;
//        }
//
//        /**
//         * Determine if the number is odd
//         * @param number the number given
//         * @return true if the number is odd, false if it is even
//         */
//        public Boolean isOdd (Integer number){
//            return null;
//        }
//
//
//        /**
//         * Multiply the number by itself
//         * @param number the number given
//         * @return the result of the number multiply by itself
//         */
//        public Integer square (Integer number){
//            return null;
//        }
//
//    }
//}
