
import java.util.Scanner ;
public class LCMofNumber {
    public static void main (String []args){
        System.out.println("LCM of mumbers: ");
        Scanner input = new Scanner (System.in) ;
        System.out.println("Enter your first Number:");
        int num1 = input.nextInt();
        System.out.println("Enter your second Number:");
        int num2 = input.nextInt();
        int Lcm = Lcm( num1,num2);
        System.out.println("LCM of Number is : " + Lcm);
    }

    public static int Lcm(int num1,int num2){
       int i = 1 ;
        while(true){
            int factor = num1 * 1 ;
            if ( factor % num2 == 0){
                return factor ;

            }
            i++;
        }
    }

}
