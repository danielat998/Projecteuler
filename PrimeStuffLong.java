import java.util.Set;
import java.util.HashSet;

public class PrimeStuffLong{

  public static Set<Long> primes = new HashSet<Long>();

  public static Set<Long> factors = new HashSet<Long>();

  public static void main(String[] args){
    getPrimeFactors(13195);
    println(primes);
    println(isPrime(7));
    println(isPrime(9));
    println(isPrime(16));
    println(isPrime(13195));
  }

  //********MAKE SURE TO CLEAR primes BEFORE RE-USING THIS CLASS********
  public static void getPrimeFactors(long i){
//println("i_1:" + i);
    if (i <=1) return;
    boolean prime = true;//true until proven false
    for (long n = 2; n <= Math.sqrt(i); n++){
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

  public static boolean isPrime(long i){
    primes = new HashSet<Long>();
    factors = new HashSet<Long>();
    getPrimeFactors(i);
    factors.remove(new Long(i));
    primes.remove(new Long(i));
println(factors);
    if (factors.isEmpty())
      return true;
    return false;
  }

  static<T> void println(T arg) { System.out.println(arg); }
}
