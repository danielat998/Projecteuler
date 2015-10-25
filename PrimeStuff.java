import java.util.Set;
import java.util.HashSet;

public class PrimeStuff{

  public static Set<Integer> primes = new HashSet<Integer>();

  public static Set<Integer> factors = new HashSet<Integer>();

  public static void main(String[] args){
    getPrimeFactors(13195);
    println(primes);
    println(isPrime(7));
    println(isPrime(9));
    println(isPrime(16));
    println(isPrime(13195));
  }

  //********MAKE SURE TO CLEAR primes BEFORE RE-USING THIS CLASS********
  public static void getPrimeFactors(int i){
//println("i_1:" + i);
    if (i <=1) return;
    boolean prime = true;//true until proven false
    for (int n = 2; n <= Math.sqrt(i); n++){
//println("n:" + n);
//println("sqrt of 9:" + Math.sqrt(9));
      if (i % n == 0){
//println("i%n: " + i % n);
        getPrimeFactors(n);
        prime = false;
      }
    }
//println("i:" + i);
    factors.add(i);
    if (prime){
      primes.add(i);
    }
  }

  public static boolean isPrime(int i){
    primes = new HashSet<Integer>();
    factors = new HashSet<Integer>();
    getPrimeFactors(i);
    factors.remove(new Integer(i));
    primes.remove(new Integer(i));
//println(factors);
    if (factors.isEmpty())
      return true;
    return false;
  }

  static<T> void println(T arg) { System.out.println(arg); }
}
