public class P1{
  public static void main(String[] args){
    int acc = 0;
    for (int i = 3; i < 1000; i++){
      if (i % 3 == 0 || i % 5==0){
        acc += i;
      }
    }
    System.out.println("The sum of multiples of 3 or 5 below 1000 is: " + acc);
  }
}
