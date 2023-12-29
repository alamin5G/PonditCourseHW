package array_and_function_2nd_class;

import java.util.Scanner;

public class BinarySearchSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Size of your array: ");
        int size = input.nextInt();
        System.out.print("Insert your list value: (sorted) ");
        int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }

        System.out.print("Your inserted values are:");
        for(int i : array){
            System.out.print(" " + i);
        }

        //set the binary searching condition
        System.out.print("\nEnter your target value:");
        int target = input.nextInt();
        int beg=0;
        int end= array.length-1;
        int mid = (beg+end)/2;

       // there is an exception while data is not found from the array
        // arrayOutOfBoundException
            while ((beg<=end) && (array[mid] != target)){
                if(target<array[mid]){
                    end = mid-1;
                }else{
                    beg = mid+1;
                }
                mid = (beg+end)/2;
            }

        if (array[mid] == target){
            System.out.println("found at location " + (mid+1));
        }else {
            System.out.println("not found!");
        }

    }
}
