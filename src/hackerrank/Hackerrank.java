
package hackerrank;

import static java.lang.Math.round;
import java.util.Arrays;
import java.util.Scanner;

public class Hackerrank {
    
    /**
     * 30 Days of Code Challenge Solutions
     */
    
    public static void day2(){
        Scanner inp = new Scanner(System.in);
        double mealCost;
        int tipPercent;
        int taxPercent;
        
        System.out.println("Input: ");
        mealCost = inp.nextInt();
        tipPercent = inp.nextInt();
        taxPercent = inp.nextInt();
        
        double tip_percent = mealCost * tipPercent/100;
        double tax_percent = mealCost * taxPercent/100;
        
        double totalCost = mealCost + tip_percent + tax_percent;
        
        System.out.println("Output: ");
        System.out.println(round(totalCost));
    }
    
    //day4 Soution is in the Person Class
    
    public static void day5(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Input: ");
        int n = inp.nextInt();
        
        for(int counter = 1; counter <= 10; counter++){
            int result = n * counter;
            System.out.println(n + " x " + counter + " = " + result);
        }
        
    }
    
    public static void day7(){
        //reversing an array
        Scanner inp = new Scanner(System.in);
        int temp = 0;
        
        int[] arr = {1,2,3,4};
        
        for(int counter = 0; counter < arr.length/2; counter++){
            temp = arr[counter];
            arr[counter] = arr[arr.length-1-counter];
            arr[arr.length-1-counter] = temp;
        }
        for(int element: arr){
            System.out.println(element);
        }
        System.out.println(Arrays.toString(arr));
    }
    
    /**
     * Problem Solving Challenge Solution
     */
    
    public static void simpleArray(){
        Scanner inp = new Scanner(System.in);

        int sum = 0;
        
        //declaring array
        int[] arr = new int [5];
        
        //inputting elements
        System.out.println("Input numbers: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = inp.nextInt();
        }
        
        //formula
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum is: " + sum);
        
        
    }
    
    public static void main(String[] args) {
        simpleArray();
        
        
    }
    
}
