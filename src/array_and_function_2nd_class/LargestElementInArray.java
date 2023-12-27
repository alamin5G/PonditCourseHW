package array_and_function_2nd_class;

import java.util.Scanner;

public class LargestElementInArray {

    /*
    * 2. Largest Element in Array:
    * Find and print the largest element in an array.
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int arrSize = input.nextInt();
        int[] array = new int[arrSize];
        for (int i = 0; i < array.length; i++) {
            //now we are inserting the array element;
            System.out.print("Enter array element for ["+i+"]=");
            array[i] = input.nextInt();
        }

        //now we have to find which one is largest among the elements
        int largest=array[0];
        int pos=0;
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < array.length; j++) {
                if(array[i]<array[j]){
                    largest = array[j];
                    pos = j;
                    array[i] = largest;
                }
            }
        }

        System.out.println("largest number is " + largest);
        System.out.println("position is " + pos);

    }
}
