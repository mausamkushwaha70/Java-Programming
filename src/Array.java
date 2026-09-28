public class Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Aray length is : "+ arr.length );
        System.out.println("The array is : ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.print("The array at index at 2 is change : ");
        System.out.println(arr[2]=10);
        System.out.print("The new array is : ");
        for( int i=0; i<6; i++){
            System.out.print("  "+arr[i]);
        }
        System.out.println();
        System.out.print("Array is : ");
        printArr();
        greetUser();

    }
    public static void greetUser(){
        System.out.println("hiii  mausam Good morning");
        System.out.println();
    }
public static void printArr(){
    int arr[] = {1, 2, 3, 4, 5, 6};
        for( int i=0; i<arr.length-1; i++){
            System.out.print("  "+arr[i]);
        }
    System.out.println();
}
}
