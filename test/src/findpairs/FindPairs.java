/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findpairs;

import java.util.Arrays;

//Prints all pair of integer values from given Array whose GivenSum is is equal to given number.
public class FindPairs {

    public static void main(String args[]) {
        int[] MyArray = {-2,1, 2,3,8,20,16,4,5,6,7,8,9,10};

        printPairs(MyArray, 5);
        printPairsUsingTwoPointers(MyArray, 5);

    }

     //Prints all pair of integer values from given Array whose GivenSum is is equal to given number. 
    public static void printPairs(int[] GivenArray, int GivenSum) {

        System.out.println("Given array : " + Arrays.toString(GivenArray));
        System.out.println("Given sum : " + GivenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + GivenSum);

        
        if (GivenArray.length < 2) {
            System.out.println("N/A");
            return;
        }

        boolean Found = false;
        for (int i = 0; i < GivenArray.length; i++) {
            int first = GivenArray[i];
            for (int j = i + 1; j < GivenArray.length; j++) {
                int second = GivenArray[j];
                if ((first + second) == GivenSum) {
                    System.out.printf("(%d, %d) %n", first, second);
                    Found = true;
                }
            }
        }
        if (!Found) {
            System.out.println("N/A");
        }
    }

    //Prints all pair of integer values from given Array whose GivenSum is is equal to given number.
    public static void printPairsUsingTwoPointers(int[] GivenArray, int GivenSum) {

        System.out.println("Given array : " + Arrays.toString(GivenArray));
        System.out.println("Given sum : " + GivenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + GivenSum);

        if (GivenArray.length < 2) {
            System.out.println("N/A");
            return;
        }
        
        Arrays.sort(GivenArray);
     
        
        int left = 0;
        int right = GivenArray.length - 1;
        boolean Found = false;
        
        while (left < right) {
            int sum = GivenArray[left] + GivenArray[right];
            if (sum == GivenSum) {
                System.out.printf("(%d, %d) %n", GivenArray[left], GivenArray[right]);
                left = left + 1;
                right = right - 1;
                Found = true;
            } else if (sum < GivenSum) {
                left = left + 1;
            } else if (sum > GivenSum) {
                right = right - 1;
            }
        }

        if (!Found) {
            System.out.println("N/A");
        }
    }
}
