import java.util.Scanner;

public class AllOperationParameter {
    public static void main(String[] args) {
        System.out.println(" Welcome to Division with Parameter : ");
        System.out.print("Please enter your number :");
        Scanner input = new Scanner(System.in) ;
        int a= input.nextInt();
        System.out.print("Enter your second number :");
        int b= input.nextInt();
        System.out.println(division (a,b));
        System.out.println(multiply(a,b));
        System.out.println(sutraction(a,b));
        System.out.println(Addition(a,b));
    }
        public static double division( double a, double b){
        double division = a /b ;
        System.out.print("result of Division ");
        return division;
    }

//    multiplication with parametert

    public static double multiply(double a , double b){
        double multiply = a * b ;
        System.out.print("Result of Multiply :");
        return multiply;
    }
//                    Subtraction with parameter :::

    public static double sutraction(double a , double b){
        double subtraction = a-b ;
        System.out.print("Result of Subtraction : ");
        return subtraction ;
    }
    public static int Addition( int a, int b){
        int addition = a+b ;
        System.out.print(" Result of Addition : ");
        return  addition ;
    }
}
