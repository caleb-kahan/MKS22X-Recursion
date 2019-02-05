import java.util.ArrayList;
public class Recursion{

    public static double sqrt(double n, double tolerance){
      return sqrtHelp(n,tolerance,n/2);
    }
    private static double sqrtHelp (double n, double tolerance, double guess){
      if(Math.abs(guess*guess-n)/n<=tolerance)return guess;
      return sqrtHelp(n,tolerance,(n/guess+guess)/2);

    }

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
    /*As Per classwork*/
    public static ArrayList<Integer> makeAllSums(int n){
      ArrayList<Integer> returner = new ArrayList<Integer>();
      makeAllSums(n,0,returner);
      return returner;
    }
    public static void makeAllSums(int n,int sum, ArrayList<Integer> adder){
      if(n==0){adder.add(sum);}
      makeAllSums(n-1,sum+n,adder);
      makeAllSums(n-1,sum,adder);
    }
    public static void main(String[] args){
      System.out.println(Math.sqrt(2)+ " Fake Version: "+ sqrt(2,0.0000000000001));

      for(int i=0;i<20;i++){
        System.out.println(fib(i));
      }

      System.out.println(makeAllSums(1));


    }

}
