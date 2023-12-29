package array_and_function_2nd_class;

import java.util.Scanner;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter your elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("Search for duplicate (Enter value): ");
        int duplicate = input.nextInt();
        boolean result = checkDuplicateValue(array, duplicate);
        System.out.println(result);
    }

    public static boolean checkDuplicateValue(int[] array, int duplicate){

        int c=0;
        for (int j : array) {
            if (j == duplicate) {
                c++;
            }
            if (c == 2) {
                return true; // if twice the item founds, then return the true;
            }
        }
        return false;
    }
}
