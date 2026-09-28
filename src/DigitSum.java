import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println("Welcome to digits sum calculator ");
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        int sum = digitSum(num) ;
        System.out.println("result is : "+sum);
        }
public static int digitSum(int num){
int sum = 0 ;
while( num > 0 ){
    sum += num % 10 ;
    num/= 10  ;
}
    return sum ;
}
}

/* while(num > 0){
          sum += num % 10 ;          // short form ;   sum = sum + ( num % 10 ) ;
          num /= */