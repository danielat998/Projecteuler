public class P12_1{

  public static final int THRESHOLD = 500;
  public static void main(String[] args){
    for (int i = 0; i < 9999999999L; i++){
      if (getNoDivisors(i) > THRESHOLD){
        System.out.println("The first number with over " + THRESHOLD 
                           + " divisors is " + i + ".");
        return;
      }
    }

  }

  public static long getNoDivisors(long x) {
    long limit = x;
    long numberOfDivisors = 0;

    if (x == 1) return 1;

    for (long i = 1; i < limit; ++i) {
        if (x % i == 0) {
            limit = x / i;
            if (limit != i) {
                numberOfDivisors++;
            }
            numberOfDivisors++;
        }
    }

    return numberOfDivisors;
  }


}
