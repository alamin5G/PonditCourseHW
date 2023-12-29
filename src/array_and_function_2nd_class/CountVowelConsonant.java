package array_and_function_2nd_class;

import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your line: ");
        String statement = input.nextLine();
        char[] vowels = new char[statement.length()];
        char[] consonant = new char[statement.length()];
        int vCount = 0;
        int cCount = 0;
        for (int i = 0; i < statement.length(); i++) {
            if (statement.charAt(i) == 'a' ||statement.charAt(i) == 'e' || statement.charAt(i) == 'i' || statement.charAt(i) == 'o' ||  statement.charAt(i)=='u'){
                vowels[vCount] = statement.charAt(i);
                vCount++;
            }else if(statement.charAt(i) == 'A' ||statement.charAt(i) == 'E' || statement.charAt(i) == 'I' || statement.charAt(i) == 'O' || statement.charAt(i) == 'U'){
                vowels[vCount] = statement.charAt(i);
                vCount++;
            }else if(statement.charAt(i) >= 48 && statement.charAt(i) <= 57){
                continue;
            }else if((statement.charAt(i) >= 65 && statement.charAt(i) <= 90 ) || (statement.charAt(i) >= 97 && statement.charAt(i) <= 122 )){
                consonant[cCount] = statement.charAt(i);
                cCount++;
            }
        }


        System.out.println("Total Vowels in your statement: " + vCount);
        System.out.println("Total Consonant in your statement: " + cCount);

        //we can also print the total vowels and consonant array here..

    }
}
