package array_and_function_2nd_class;

import java.util.Scanner;

public class EvenOrOdd {

    /*
    * 3. Even or Odd Numbers:
    * Check if a given number is even or odd using if-else. (also count in an array)
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 1;
        int[] evenCount = new int[1000];
        int[] oddCount = new int[1000];
        int even=0;
        int odd=0;
        int c = 0;
        System.out.println("-------You can check upto 1000 number at a time....");
        while(number!=0){
            System.out.println("Enter your number to check even or odd (0 for stop)");
             number = input.nextInt();
            if (number%2==0){
                evenCount[even] = number;
                even++;
                System.out.println("even");
            }else {
                oddCount[odd] = number;
                odd++;
                System.out.println("odd");
            }
            c++;
        }
        System.out.println("You have inputted "+c +" numbers");
        System.out.println("total even number is " + even);
        System.out.print("and even numbers are:");
        for (int i = 0; i < even; i++) {
            System.out.print(" "+evenCount[i]);
        }
        System.out.println("\ntotal odd number is " + odd);
        System.out.print("and odd numbers are:");
        for (int i = 0; i < odd; i++) {
            System.out.print(" " + oddCount[i]);
        }
    }
}
