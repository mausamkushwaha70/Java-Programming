//NOTE:-
    //If else using grade calculator
import java.util.Scanner;

public class GradeCalculatorOp {
    public static void main(String[] args) {
        System.out.println("Grade Calculator");
        Scanner input = new Scanner( System.in);
        System.out.print( "Please enter your percentage : ");
        float percentage = input.nextFloat();
        if ( percentage >= 90 && percentage <= 100 ){
            System.out.println("Grade is : A+ ");}
            else if ( percentage >= 80 && percentage <90){
                System.out.print("Grade is : A");
            }
            else if ( percentage >= 75 && percentage <80){
                System.out.println("Grade is : B+");
            }
        else if ( percentage >= 65 && percentage < 75 ){
            System.out.println("Grade is : B");
        }
        else if ( percentage >= 55 && percentage < 65 ){
            System.out.println(" Grade is : C ");
        }
        else if (percentage >= 40 && percentage < 55) {
            System.out.println(" Grade is : D ");
        }
        else if (percentage <= 33) {
            System.out.println(" Grade is : FAIL");
        }
        else {
            System.out.println("Somthing wrong and it does not matching to your Grade");
            System.out.println("Thank\'s and Regard\'s");
        }
 }
}

// There are Greatfull today
//Finally I complete this topic.
//if else complete ;