import java.util.ArrayList;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      return sqrtHelp(n,tolerance,n/2);
    }
    private static double sqrtHelp (double n, double tolerance, double guess){
      if(Math.abs(guess*guess-n)/n<=tolerance)return guess;
      return sqrt((n/guess+guess)/2,tolerance);

    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
        return fib(n,0,1);
    }
    private static int fib(int n, int zero, int first){
        if(n==0)return zero;
        return fib(n-1,first, zero+first);
        //Logic: From to get N to 0, there will be n runs.
        //That means the 0th number will be updated n times.
        //0+n>Nth number of fibonacci sequence. 
    }
    public static int fibH(int n)

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
    }
    public static void main(String[] args){
      System.out.println(Math.sqrt(2)+ " Fake Version: "+ sqrt(2,0.00001));
    }

}
