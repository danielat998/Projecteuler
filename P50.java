public class P50{
  public static void main(String[] args){
    int acc = 5;
    for (int i = 6; i < 999999 + 2; i +=6){
       if (PrimeStuff.isPrime(i-1)){
         if (acc +i -1 < 1000000){
           acc += i;
         } else {
           System.out.println(acc);
         }
       }

       if (PrimeStuff.isPrime(i+1)){
         if (acc+i+1 < 1000000){
           acc += i;
         } else {
           System.out.println(acc);
         }
       }

    }
  }
}
