package array_and_function_2nd_class;

import java.util.Scanner;


public class SumOfArrays {

    /*
     * 1. Sum of Array Elements:
     * Write a program to find the sum of all elements in an array.
     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What will be the array size? : ");

        int sizeOfArray = input.nextInt();

        int[] array = new int[sizeOfArray];

        int sum = 0;
        for(int i=0; i<array.length; i++){
            System.out.print("Enter the value for elements [" + (i+1) + "] : ");
            array[i] = input.nextInt();
            //you can do it in other loop (sum)
            sum += array[i];
        }

        System.out.println("Total summation of the array elements is = " + sum);

    }
}
