import java.util.List;
import java.util.ArrayList;
import java.lang.Math;

public class P3{
  //public static boolean isPrime = new boolean[775146];//(sqrt 600851475143)
  //public static long largestPrime = 1;
  public static void main(String[] args){
    for (long i = 600851475143L; ; i--){
      if (!hasFactors(i)){
        System.out.println("The largest prime factor of 600851475143 is " + i);
      }
    }
  }

  public static boolean hasFactors(long givenInt){
    boolean factors=false;
    for (long i = 1 ; i < Math.sqrt(600851475143L) ; i++){
      if (givenInt % i == 0)
        factors=true;
    }
    return factors;
  }
}
