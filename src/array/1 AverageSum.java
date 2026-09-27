package array;

class AverageSum {
    public static void main (String [] args){
        System.out.println("Welcome to array sum and Average");
        int[] numArr = ArrayUtility.inputArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Sum of the number is : "+ sum);
        System.out.println("Average of the number is : "+ avg);


        }
        public static long sum(int[] numArr){
            long sum = 0;
            int i =0;
            while (i<numArr.length){
                sum = numArr[i]+sum;
                i++;
            }
            return sum;
        }

        public static double average(int[] numarr){
            double sum = sum(numarr);
            return  (sum /= numarr.length);
        }


}
