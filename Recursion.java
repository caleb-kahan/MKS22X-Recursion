import java.util.ArrayList;
public class Recursion{
    /*You may write additional private methods */

    /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
    public static double sqrt(double n, double tolerance){
      if(n>=0){int hold = n;return sqrt(-1*n/2,tolerance);}
      n*=-1;
      if(Math.abs(n*n-hold)/hold<=tolerance)return n;
      return sqrt((hold/n+n)/2,tolerance);


      //I don't want to make a helper function
      //Since it's given that n is negative, I can make it negative after the first try.
      //That means I can differentiate the initial call.

    }

    /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 0
     *fib(1) = 1
     *fib(5) = 5
     *precondition: n is non-negative
     */
    public static int fib(int n){
      if(n<=1)return n;

    }

    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
    }
    public static void main(String[] args){
      System.out.println(Math.sqrt(2)+ " Fake Version: "+ sqrt(2,0.00001));
    }

}
