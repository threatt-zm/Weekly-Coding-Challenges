//Zabian Threatt
//This program finds the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1

import java.util.*;

public class Pandigital {
    public static void main(String[] args){
        System.out.println(largestPandigital(5)); //returns 'The largest pandigital for n = 5 is 918273645'
        System.out.println(largestPandigital(3)); //returns 'The largest pandigital for n = 3 is 327654981'
        System.out.println(largestPandigital(2)); //returns 'The largest pandigital for n = 2 is 932718654'
        System.out.println(largestPandigital(6)); //returns 'The largest pandigital for n = 6 could not be found!'
    }
   
    public static String largestPandigital(int n){
        String pan = "";
        int max = 0;
        int factor = 1;
        String[] digits = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Integer product;

        while(pan.length() < 10 && n < 10){
            product = 0;
            pan = "";
            for(int i = 1; i <= n; i++){
                product = factor * i;
                pan += product.toString();
            }
            if(doesContain(pan, digits) && Integer.parseInt(pan) > max)
                max = Integer.parseInt(pan);
            factor++;            
        }

        if(max == 0)
            return "The largest pandigital for n = " + n + " could not be found!";
        else
            return "The largest pandigital for n = " + n + " is " + ((Integer)max).toString();
    }

    public static boolean doesContain(String pan, String[] digits){
        boolean containsAll = true; 
        for (String digit : digits){
            if (!pan.contains(digit)){
                containsAll = false;
                break;
            }
        }
        return containsAll;
    }
}
