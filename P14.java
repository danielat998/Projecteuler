//If this fails, we may want to consider integer overflows

public class P14{
  public static void main(String[] args){
System.out.println("*****" + 3 * 827370449 + 1);
    long longestChain = 0;
    long longestLength = 0;
    for (long i = 1; i < 1000000; i++){
      long n = i;
      long len = 0;
//i = 113382;
      while (n != 1){
        if (n % 2 == 0){
          n = n / 2;
        } else {
          n = 3 * n + 1;
        }
//System.out.println(n);

        if (len++ > longestLength){
          longestLength = len;
          longestChain = i;
        }// if < longest
      }//while != 1

if (i % 1000 == 0){
  System.out.println(i);
}
    }//for i to 1000000
    System.out.println("The starting number with the largest chain is " 
                       + longestChain + " with a length of " + longestLength);
  }//main
}
