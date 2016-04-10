import java.util.Arrays;
import java.math.BigInteger;
public class P10{
  public static void main(String[] args){
    boolean[] A = new boolean[2000000];
    Arrays.fill(A, Boolean.TRUE);
    for (long i = 2; i < Math.sqrt(2000000); i++){
      if (A[(int)i])
        for (long j = i * i; j < 2000000; j += i){
          A[(int)j] = false;
        }
    }

    BigInteger acc = new BigInteger("0");
    for (long i = 2; i < 2000000; i++){
      if (A[(int)i]){
        System.out.println("i:"+i+" is true");
        acc=acc.add(new BigInteger(""+ i));
      }
    }
    System.out.println(acc);
  }

  public static boolean isPrime(long n){
    for (long i = 2; i < (n / 2); i++){
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
