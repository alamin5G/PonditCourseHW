package array_and_function_2nd_class;

import java.util.Scanner;

public class ReverseArrayElement {
    /*
    * 4. Reverse an Array:
    * Reverse the elements of an array.
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter your array elements: ");
        for (int i = 0; i <array.length ; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("inserted array sequence is:");
        for (int j : array) {
            System.out.print(" " + j);
        }

        int[] reverseArray = new int[size];
        int c=0;
        System.out.print("\nReversed array element:");
        for (int i = array.length-1; i >= 0; i--) {

            reverseArray[c] = array[i];
            c++;
            //or we can print this in reverse way
            // instead of storing array elements in reverse order
            //System.out.println(" "+array[i]);
        }

        for (int j : reverseArray) {
            System.out.print(" " + j);
        }
    }
}
