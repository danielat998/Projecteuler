public class P10{
  public static void main(String[] args){
    boolean[] A = new boolean[2000000];
    for (int i = 1; i < Math.sqrt(2000000); i++){
      if (A[i])
        for (int j = i * i; j < 2000000; j += i){
          A[j] = false;
        }//for
    }//for

    int acc = 0;
    for (int i = 0; i < 2000000; i++){
      if (!A[i])
        acc += i;
    }
    System.out.println(acc);
  }//main
  public static void mainOld(String[] args){
    long acc = 0;
    for (long i = 2; i < 2000000; i++){
      if (isPrime(i)){
        acc += i;
//  System.out.println(i + "is prime");
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
