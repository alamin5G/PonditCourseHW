package array_and_function_2nd_class;

import java.util.Scanner;

public class LinearSearch {

    /*
    * 9. Linear Search:
    * Implement a linear search algorithm to find an element in an array.
    * (true or false return type)
    * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter your elements ["+i+"]=");
            array[i] = input.nextInt();
        }

        System.out.print("target value?: ");
        int target = input.nextInt();
        boolean result = getLinearSearchResult(array, target);
        System.out.println(result);
    }
    public static boolean getLinearSearchResult(int[] array, int target){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target){
                return true;
            }
        }
        return false;
    }
}
