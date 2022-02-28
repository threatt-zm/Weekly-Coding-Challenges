//Zabian Threatt
//This program finds the value of the first triangle number to have over five hundred divisors

public class TriangleNumbers {
    public static void main(String[] args){
        findTriangleNumber(); //returns 76576500
    }

    public static void findTriangleNumber(){
        long n = 2;
        long tNum = 0;
        int numOfDivisors = 0;

        while(numOfDivisors <= 500){
            tNum = n*(n+1)/2;
            numOfDivisors = findNumOfDivisors(tNum);
            n++;
        }

        System.out.println("The first triangle number with over 500 divisors is " + tNum);

    }

    public static int findNumOfDivisors(long triangleNum){
        int numOfFactors = 2;

            
        for(long i = 2; i < (int)Math.sqrt(triangleNum); i++){
            if(triangleNum % i == 0)
                numOfFactors += 2;
        }

        return numOfFactors;
    }
}
