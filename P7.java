public class P7{
  public static void main(String[] args){
    int count = 0;
    int curr = 2;
    while (true) {
     if (isPrime(curr))
       count++;
     if (count == 10001){
       System.out.println(curr);
       break;
     }
     curr++;
    }
  }

  public static boolean isPrime(int n){
    for (int i = 2; i <= n / 2; i++){
      if (n % i == 0)
        return false;
    }
    return true;
  }
}
